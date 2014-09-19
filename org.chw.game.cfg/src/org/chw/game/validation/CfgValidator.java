package org.chw.game.validation;

import java.util.HashSet;

import org.chw.game.cfg.CfgPackage;
import org.chw.game.cfg.Enum;
import org.chw.game.cfg.EnumField;
import org.chw.game.cfg.Field;
import org.chw.game.cfg.FieldMetaKey;
import org.chw.game.cfg.ListMeta;
import org.chw.game.cfg.SliceMeta;
import org.chw.game.cfg.Type;
import org.chw.game.cfg.XML2;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Check;

public class CfgValidator extends AbstractCfgValidator
{
	@Check
	public void checkXMl2(XML2 dom)
	{
		String mainType = null;
		HashSet<String> names = new HashSet<String>();
		HashSet<String> errorNames = new HashSet<String>();

		EList<Type> types = dom.getTypes();
		for (int i = 0; i < types.size(); i++)
		{
			Type type = types.get(i);
			String name = type.getName();
			if (name != null)
			{
				if (names.contains(name))
				{
					errorNames.add(name);
				}
				else
				{
					names.add(name);
				}
			}

			if (type.getEnter() != null)
			{
				if (mainType == null)
				{
					mainType = type.getName();
				}
				else
				{
					error("此元数据将被忽略，因为同一个文件中只能一个主类!", type.getEnter(), CfgPackage.Literals.ENTER__PREFIX);
				}
			}
		}

		EList<Enum> enums = dom.getEnums();
		for (int i = 0; i < enums.size(); i++)
		{
			Enum type = enums.get(i);
			String name = type.getName();
			if (name != null)
			{
				if (names.contains(name))
				{
					errorNames.add(name);
				}
				else
				{
					names.add(name);
				}
			}
		}

		for (int i = 0; i < types.size(); i++)
		{
			Type type = types.get(i);
			String name = type.getName();
			if (name != null)
			{
				if (errorNames.contains(name))
				{
					error("名称冲突!", type, CfgPackage.Literals.TYPE__NAME);
				}
			}
		}

		for (int i = 0; i < enums.size(); i++)
		{
			Enum type = enums.get(i);
			String name = type.getName();
			if (name != null)
			{
				if (errorNames.contains(name))
				{
					error("名称冲突!", type, CfgPackage.Literals.ENUM__NAME);
				}
			}
		}

		if (mainType == null)
		{
			if (dom.getInput() != null)
			{
				error("此文件将没有任何作用，因为找不到主类!", dom.getInput(), CfgPackage.Literals.INPUT_DEF__INPUT_CHAR);
			}
			else if (dom.getPack() != null)
			{
				error("此文件将没有任何作用，因为找不到主类!", dom.getPack(), CfgPackage.Literals.PACK_DEF__PACK_CHAR);
			}
		}
	}

	@Check
	public void checkType(Enum type)
	{
		HashSet<String> names = new HashSet<String>();

		HashSet<String> errorNames = new HashSet<String>();

		EList<EnumField> fields = type.getFields();
		for (int i = 0; i < fields.size(); i++)
		{
			EnumField field = fields.get(i);
			String name = field.getFieldName();
			if (name != null)
			{
				if (names.contains(name))
				{
					errorNames.add(name);
				}
				else
				{
					names.add(name);
				}
			}
		}

		for (int i = 0; i < fields.size(); i++)
		{
			EnumField field = fields.get(i);
			String name = field.getFieldName();
			if (name != null)
			{
				if (errorNames.contains(name))
				{
					error("字段名称冲突!", field, CfgPackage.Literals.ENUM_FIELD__FIELD_NAME);
				}
			}
		}
	}

	@Check
	public void checkType(Type type)
	{
		HashSet<String> names = new HashSet<String>();

		HashSet<String> errorNames = new HashSet<String>();

		EList<Field> fields = type.getFields();
		for (int i = 0; i < fields.size(); i++)
		{
			Field field = fields.get(i);
			String name = field.getFieldName();
			if (name != null)
			{
				if (names.contains(name))
				{
					errorNames.add(name);
				}
				else
				{
					names.add(name);
				}
			}
		}

		for (int i = 0; i < fields.size(); i++)
		{
			Field field = fields.get(i);
			String name = field.getFieldName();
			if (name != null)
			{
				if (errorNames.contains(name))
				{
					error("字段名称冲突!", field, CfgPackage.Literals.FIELD__FIELD_NAME);
				}
			}
		}
	}

	@Check
	public void checkField(Field field)
	{
		String typeName = field.getType().getType();

		boolean isNative = typeName.equals("Boolean") || typeName.equals("int") || typeName.equals("uint") || typeName.equals("Number") || typeName.equals("String");
		boolean isExtend = false;
		boolean isEnum = false;

		Type typeDef = null;
		Enum enumDef = null;
		if (!isNative)
		{
			typeDef = getType(field.eResource(), typeName);
			if (typeDef != null)
			{
				isNative = false;
				isExtend = true;
				isEnum = false;
			}
			else
			{
				enumDef = getEnum(field.eResource(), typeName);
				if (enumDef != null)
				{
					isNative = false;
					isExtend = false;
					isEnum = true;
				}
			}
		}

		// 检查字段类型是否有定义
		if (!isNative && !isExtend && !isEnum)
		{
			error("未找到 \"" + typeName + "\" 的定义", field, CfgPackage.Literals.FIELD__TYPE);
		}

		EObject fieldMeta = null;

		// 除最后一个元数据外所有都标记为无效
		EList<EObject> fieldMetas = field.getMeta();
		if (fieldMetas != null && fieldMetas.size() > 0)
		{
			if (fieldMetas.size() > 1)
			{
				for (int i = 0; i < fieldMetas.size() - 1; i++)
				{
					EObject currMeta = fieldMetas.get(i);
					if (currMeta instanceof ListMeta)
					{
						error("此元数据将被忽略！", fieldMetas.get(i), CfgPackage.Literals.LIST_META__PREFIX);
					}
					else if (currMeta instanceof SliceMeta)
					{
						error("此元数据将被忽略！", fieldMetas.get(i), CfgPackage.Literals.SLICE_META__PREFIX);
					}
				}
			}

			fieldMeta = fieldMetas.get(fieldMetas.size() - 1);
		}

		// 如果是最后一个元数据是Slice标记，检查数据类型是否为原生、枚举
		if (fieldMeta instanceof SliceMeta)
		{
			if (!isNative && !isEnum)
			{
				error("\"" + typeName + "\" 不是原生类型也不是枚举,此元数据只能用于原生类型和枚举！", fieldMeta, CfgPackage.Literals.SLICE_META__PREFIX);
			}
		}

		// 如果最后一个元数据是List标记
		if (fieldMeta instanceof ListMeta)
		{
			ListMeta meta = (ListMeta) fieldMeta;
			if (meta.getParams().size() > 0)
			{
				HashSet<String> keySet = new HashSet<String>();

				for (FieldMetaKey key : meta.getParams())
				{
					if (isNative)
					{
						error("\"" + typeName + "\" 是原生类型,不支持索引键！", key, CfgPackage.Literals.FIELD_META_KEY__FIELD_NAME);
					}
					else if (isEnum)
					{
						error("\"" + typeName + "\" 是枚举类型,不支持索引键！", key, CfgPackage.Literals.FIELD_META_KEY__FIELD_NAME);
					}
					else
					{
						String indexKey = key.getFieldName();

						if (typeDef != null)
						{
							boolean finded = false;
							for (Field row : typeDef.getFields())
							{
								if (row.getFieldName().equals(indexKey))
								{
									finded = true;
									break;
								}
							}

							if (!finded)
							{
								error(typeName + "没有定义名为\"" + indexKey + "\"的字段！", key, CfgPackage.Literals.FIELD_META_KEY__FIELD_NAME);
							}
						}
						else
						{
							error(typeName + "未找到，索引键\"" + indexKey + "\"无效！", key, CfgPackage.Literals.FIELD_META_KEY__FIELD_NAME);
						}

						if (keySet.contains(indexKey))
						{
							error("重复的索引键！", key, CfgPackage.Literals.FIELD_META_KEY__FIELD_NAME);
						}
						keySet.add(indexKey);
					}
				}
			}
		}
	}

	private Enum getEnum(Resource resource, String enumName)
	{
		if (resource != null)
		{
			EList<EObject> list = resource.getContents();

			if (list.size() > 0)
			{
				XML2 xml2 = (XML2) list.get(0);
				if (xml2 != null)
				{
					for (Enum type : xml2.getEnums())
					{
						if (enumName.equals(type.getName()))
						{
							return type;
						}
					}
				}
			}
		}
		return null;
	}

	private Type getType(Resource resource, String typeName)
	{
		if (resource != null)
		{
			EList<EObject> list = resource.getContents();

			if (list.size() > 0)
			{
				XML2 xml2 = (XML2) list.get(0);
				if (xml2 != null)
				{
					for (Type type : xml2.getTypes())
					{
						if (typeName.equals(type.getName()))
						{
							return type;
						}
					}
				}
			}
		}
		return null;
	}
}
