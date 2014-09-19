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
					error("��Ԫ���ݽ������ԣ���Ϊͬһ���ļ���ֻ��һ������!", type.getEnter(), CfgPackage.Literals.ENTER__PREFIX);
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
					error("���Ƴ�ͻ!", type, CfgPackage.Literals.TYPE__NAME);
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
					error("���Ƴ�ͻ!", type, CfgPackage.Literals.ENUM__NAME);
				}
			}
		}

		if (mainType == null)
		{
			if (dom.getInput() != null)
			{
				error("���ļ���û���κ����ã���Ϊ�Ҳ�������!", dom.getInput(), CfgPackage.Literals.INPUT_DEF__INPUT_CHAR);
			}
			else if (dom.getPack() != null)
			{
				error("���ļ���û���κ����ã���Ϊ�Ҳ�������!", dom.getPack(), CfgPackage.Literals.PACK_DEF__PACK_CHAR);
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
					error("�ֶ����Ƴ�ͻ!", field, CfgPackage.Literals.ENUM_FIELD__FIELD_NAME);
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
					error("�ֶ����Ƴ�ͻ!", field, CfgPackage.Literals.FIELD__FIELD_NAME);
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

		// ����ֶ������Ƿ��ж���
		if (!isNative && !isExtend && !isEnum)
		{
			error("δ�ҵ� \"" + typeName + "\" �Ķ���", field, CfgPackage.Literals.FIELD__TYPE);
		}

		EObject fieldMeta = null;

		// �����һ��Ԫ���������ж����Ϊ��Ч
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
						error("��Ԫ���ݽ������ԣ�", fieldMetas.get(i), CfgPackage.Literals.LIST_META__PREFIX);
					}
					else if (currMeta instanceof SliceMeta)
					{
						error("��Ԫ���ݽ������ԣ�", fieldMetas.get(i), CfgPackage.Literals.SLICE_META__PREFIX);
					}
				}
			}

			fieldMeta = fieldMetas.get(fieldMetas.size() - 1);
		}

		// ��������һ��Ԫ������Slice��ǣ�������������Ƿ�Ϊԭ����ö��
		if (fieldMeta instanceof SliceMeta)
		{
			if (!isNative && !isEnum)
			{
				error("\"" + typeName + "\" ����ԭ������Ҳ����ö��,��Ԫ����ֻ������ԭ�����ͺ�ö�٣�", fieldMeta, CfgPackage.Literals.SLICE_META__PREFIX);
			}
		}

		// ������һ��Ԫ������List���
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
						error("\"" + typeName + "\" ��ԭ������,��֧����������", key, CfgPackage.Literals.FIELD_META_KEY__FIELD_NAME);
					}
					else if (isEnum)
					{
						error("\"" + typeName + "\" ��ö������,��֧����������", key, CfgPackage.Literals.FIELD_META_KEY__FIELD_NAME);
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
								error(typeName + "û�ж�����Ϊ\"" + indexKey + "\"���ֶΣ�", key, CfgPackage.Literals.FIELD_META_KEY__FIELD_NAME);
							}
						}
						else
						{
							error(typeName + "δ�ҵ���������\"" + indexKey + "\"��Ч��", key, CfgPackage.Literals.FIELD_META_KEY__FIELD_NAME);
						}

						if (keySet.contains(indexKey))
						{
							error("�ظ�����������", key, CfgPackage.Literals.FIELD_META_KEY__FIELD_NAME);
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
