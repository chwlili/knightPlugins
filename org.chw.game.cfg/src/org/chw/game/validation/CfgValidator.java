package org.chw.game.validation;

import java.util.HashSet;

import org.chw.game.cfg.CfgPackage;
import org.chw.game.cfg.Field;
import org.chw.game.cfg.FieldMeta;
import org.chw.game.cfg.FieldMetaKey;
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
		}

		for (int i = 0; i < types.size(); i++)
		{
			Type type = types.get(i);
			String name = type.getName();
			if (name != null)
			{
				if (errorNames.contains(name))
				{
					error("类型名称冲突!", type, CfgPackage.Literals.TYPE__NAME);
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
		boolean isNative = isNativeType(typeName);

		FieldMeta meta = field.getMeta();
		if (meta != null)
		{
			if (meta.getParams().size() > 0)
			{
				HashSet<String> keySet = new HashSet<String>();

				for (FieldMetaKey key : meta.getParams())
				{
					if (isNative)
					{
						error("\"" + typeName + "\" 是原生类型,不支持索引键！", key, CfgPackage.Literals.FIELD_META_KEY__FIELD_NAME);
					}
					else
					{
						String indexKey = key.getFieldName();

						Type type = getType(field.eResource(), typeName);
						if (type != null)
						{
							boolean finded = false;
							for (Field row : type.getFields())
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

		if (!isNative)
		{
			if (getType(field.eResource(), typeName) == null)
			{
				error("未找到 \"" + typeName + "\" 的定义", field, CfgPackage.Literals.FIELD__TYPE);
			}
		}
	}

	private boolean isNativeType(String text)
	{
		return text.equals("Boolean") || text.equals("int") || text.equals("uint") || text.equals("Number") || text.equals("String");
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
