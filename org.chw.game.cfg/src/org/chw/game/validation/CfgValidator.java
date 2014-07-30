package org.chw.game.validation;

import java.util.HashSet;

import org.chw.game.cfg.CfgPackage;
import org.chw.game.cfg.Field;
import org.chw.game.cfg.HashType;
import org.chw.game.cfg.ListType;
import org.chw.game.cfg.NativeType;
import org.chw.game.cfg.Param;
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
		HashSet<String> names = new HashSet<>();

		HashSet<String> errorNames = new HashSet<>();

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
					error("�������Ƴ�ͻ!", type, CfgPackage.Literals.TYPE__NAME);
				}
			}
		}
	}

	@Check
	public void checkType(Type type)
	{
		HashSet<String> names = new HashSet<>();

		HashSet<String> errorNames = new HashSet<>();

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
		if (field.getType() instanceof NativeType)
		{
			NativeType type = (NativeType) field.getType();
			if (!isNativeType(type.getType()))
			{
				if (getType(type.eResource(), type.getType())==null)
				{
					error("δ���������", type, CfgPackage.Literals.NATIVE_TYPE__TYPE);
				}
			}
		}
		else if(field.getType() instanceof ListType)
		{
			ListType type=(ListType)field.getType();
			if (!isNativeType(type.getType()))
			{
				if (getType(type.eResource(), type.getType())==null)
				{
					error("δ���������", type, CfgPackage.Literals.LIST_TYPE__TYPE);
				}
			}
		}
		else if(field.getType() instanceof HashType)
		{
			HashType type=(HashType)field.getType();
			if (!isNativeType(type.getType()))
			{
				Type fieldType=getType(type.eResource(), type.getType());
				if (fieldType==null)
				{
					error("δ���������", type, CfgPackage.Literals.HASH_TYPE__TYPE);
				}
				else
				{
					HashSet<String> fieldNameTable=new HashSet<String>();
					for(Field typeField:fieldType.getFields())
					{
						fieldNameTable.add(typeField.getFieldName());
					}
					
					EList<Param> params=type.getParams();
					if(params!=null && params.size()>0)
					{
						for(int i=0;i<params.size();i++)
						{
							if(!fieldNameTable.contains(params.get(i).getParamName()))
							{
								error(fieldType.getName()+" û�ж�����Ϊ "+params.get(i).getParamName()+" ���ֶ�",type,CfgPackage.Literals.HASH_TYPE__PARAMS,i);
							}
						}
					}
				}
				
				if(type.getParams()!=null)
				{
					HashSet<String> names=new HashSet<String>();
					HashSet<String> errorNames=new HashSet<String>();
					for(int i=0;i<type.getParams().size();i++)
					{
						String name=type.getParams().get(i).getParamName();
						if(names.contains(name))
						{
							errorNames.add(name);
						}
						else
						{
							names.add(name);
						}
					}
					
					for(int i=0;i<type.getParams().size();i++)
					{
						if(errorNames.contains(type.getParams().get(i)))
						{
							error("�ظ����ֶ�������",type,CfgPackage.Literals.HASH_TYPE__PARAMS,i);
						}
					}
				}
			}
		}
	}

	private boolean isNativeType(String text)
	{
		return text.equals("boolean") || text.equals("int") || text.equals("uint") || text.equals("Number") || text.equals("String");
	}

	private Type getType(Resource resource, String typeName)
	{
		if(resource!=null)
		{
			EList<EObject> list = resource.getContents();
			
			if(list.size()>0)
			{
				XML2 xml2 = (XML2) list.get(0);
				if (xml2 != null)
				{
					for(Type type:xml2.getTypes())
					{
						if(typeName.equals(type.getName()))
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