package org.chw.game.builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.chw.game.cfg.Field;
import org.chw.game.cfg.Meta;
import org.chw.game.cfg.MetaParam;
import org.chw.game.cfg.Type;
import org.chw.game.cfg.XML2;
import org.eclipse.emf.common.util.EList;

public class ClassTable
{
	private String packName = "";
	private String inputFile = null;

	private Class mainClass;
	private HashMap<String, Class> name2Class = new HashMap<String, Class>();
	private HashMap<String, Enum> name2Enum = new HashMap<String, Enum>();

	/**
	 * 构造函数
	 * 
	 * @param root
	 */
	public ClassTable(XML2 root)
	{
		open(root);
	}

	/**
	 * 获取输入URL
	 * 
	 * @return
	 */
	public String getInputURL()
	{
		return inputFile;
	}

	/**
	 * 获取包名
	 * 
	 * @return
	 */
	public String getPackName()
	{
		return packName;
	}

	/**
	 * 获取主类
	 * 
	 * @return
	 */
	public Class getMainClass()
	{
		return mainClass;
	}

	/**
	 * 获取所有类
	 * 
	 * @return
	 */
	public Class[] getAllClass()
	{
		return name2Class.values().toArray(new Class[] {});
	}

	/**
	 * 获取所有枚举
	 * 
	 * @return
	 */
	public Enum[] getAllEnum()
	{
		return name2Enum.values().toArray(new Enum[] {});
	}

	/**
	 * 获取类
	 * 
	 * @param name
	 * @return
	 */
	public Class getClass(String name)
	{
		return name2Class.get(name);
	}

	/**
	 * 获取枚举
	 * 
	 * @param name
	 * @return
	 */
	public Enum getEnum(String name)
	{
		return name2Enum.get(name);
	}

	/**
	 * 获取类型ID
	 * 
	 * @param name
	 * @return
	 */
	public int getClassID(String name)
	{
		if ("int".equals(name))
		{
			return 1;
		}
		if ("uint".equals(name))
		{
			return 2;
		}
		if ("Boolean".equals(name))
		{
			return 3;
		}
		if ("Number".equals(name))
		{
			return 4;
		}
		if ("String".equals(name))
		{
			return 5;
		}

		return getClass(name).order + 10;
	}

	/**
	 * 是否为基础类型
	 * 
	 * @param name
	 * @return
	 */
	private boolean isBaseType(String name)
	{
		return "int".equals(name) || "uint".equals(name) || "Boolean".equals(name) || "Number".equals(name) || "String".equals(name);
	}

	/**
	 * 是否为扩展类型
	 * 
	 * @param name
	 * @return
	 */
	@SuppressWarnings("unused")
	private boolean isExtendType(String name)
	{
		return name2Class.containsKey(name);
	}

	/**
	 * 是否为枚举类型
	 * 
	 * @param name
	 * @return
	 */
	private boolean isEnumType(String name)
	{
		return name2Enum.containsKey(name);
	}

	/**
	 * 初始化所有类型
	 */
	private void open(XML2 root)
	{
		XML2 xml2 = root;
		if (xml2 == null)
		{
			return;
		}

		mainClass = null;
		name2Class = new HashMap<String, Class>();

		packName = "";
		if (xml2.getPack() != null)
		{
			packName = xml2.getPack().getPack();
		}

		inputFile = null;
		if (xml2.getInput() != null)
		{
			inputFile = xml2.getInput().getUrl();
		}

		HashSet<String> typeNames = new HashSet<String>();

		for (org.chw.game.cfg.Enum type : xml2.getEnums())
		{
			String enumComm = type.getComment();
			String enumName = type.getName();
			EnumField[] enumFields = null;

			if (typeNames.contains(enumName))
			{
				continue;
			}

			ArrayList<EnumField> fields = new ArrayList<EnumField>();
			for (org.chw.game.cfg.EnumField field : type.getFields())
			{
				fields.add(new EnumField(field.getComment(), field.getFieldName(), field.getFieldValue(), field.getMeta() != null, fields.size() + 1));
			}
			enumFields = fields.toArray(new EnumField[] {});

			Enum clazz = new Enum(enumComm, enumName, enumFields);

			name2Enum.put(enumName, clazz);

			typeNames.add(enumName);
		}

		int order = 1;
		for (Type type : xml2.getTypes())
		{
			String typeComm = type.getComment();
			String typeName = type.getName();
			String rootXPath = null;

			if (typeNames.contains(typeName))
			{
				continue;
			}

			for (Meta meta : type.getMeta())
			{
				EList<MetaParam> params = meta.getParams();
				if (params.size() > 0)
				{
					rootXPath = params.get(0).getFieldName();
					if (rootXPath.charAt(0) == '"')
					{
						rootXPath = rootXPath.substring(1);
					}
					if (rootXPath.charAt(rootXPath.length() - 1) == '"')
					{
						rootXPath = rootXPath.substring(0, rootXPath.length() - 1);
					}
					if (rootXPath.charAt(0) != '/')
					{
						rootXPath = "/" + rootXPath;
					}
				}
			}

			HashSet<String> fieldNames = new HashSet<String>();

			ArrayList<ClassField> fieldDefs = new ArrayList<ClassField>();
			for (Field field : type.getFields())
			{
				String fieldName = field.getFieldName();
				String fieldComm = field.getComment();
				String fieldXPath = field.getNodePath();
				String fieldType = field.getType().getType();
				int fieldTypeKind = 3;
				boolean fieldList = false;
				String[] indexList = null;
				boolean sliceList = false;
				String sliceChar = null;

				if (fieldNames.contains(fieldName))
				{
					continue;
				}

				boolean isBase = isBaseType(fieldType);
				boolean isEnum = isEnumType(fieldType);

				if (isBase)
				{
					fieldTypeKind = 1;
				}
				else if (isEnum)
				{
					fieldTypeKind = 2;
				}

				Meta listMeta = null;
				Meta langMeta = null;
				for (Meta meta : field.getMeta())
				{
					if (meta.getPrefix().equals("List") || meta.getPrefix().equals("Slice"))
					{
						listMeta = meta;
					}
					else if (meta.getPrefix().equals("Lang"))
					{
						langMeta = meta;
					}
				}

				if (listMeta != null && listMeta.getPrefix().equals("List"))
				{
					Meta meta = listMeta;

					fieldList = true;

					if (!isBase && !isEnum)
					{
						ArrayList<String> keys = null;
						EList<MetaParam> params = meta.getParams();
						if (params != null)
						{
							keys = new ArrayList<String>();
							for (MetaParam param : params)
							{
								String paramName = param.getFieldName();
								if (paramName != null)
								{
									if (paramName.charAt(0) == '"')
									{
										paramName = paramName.substring(1);
									}
									if (paramName.charAt(paramName.length() - 1) == '"')
									{
										paramName = paramName.substring(0, paramName.length() - 1);
									}
									if (!paramName.isEmpty())
									{
										keys.add(paramName);
									}
								}
							}
						}

						if (keys != null && keys.size() > 0)
						{
							indexList = keys.toArray(new String[] {});
						}
					}
				}
				else if (listMeta != null && listMeta.getPrefix().equals("Slice"))
				{
					Meta meta = listMeta;
					if (isBase || isEnum)
					{
						sliceList = true;
						sliceChar = meta.getParams().get(0).getFieldName();
					}
				}

				fieldDefs.add(new ClassField(fieldXPath, fieldName, fieldComm, fieldType, fieldTypeKind, fieldList, indexList, sliceList, sliceChar, langMeta != null));

				fieldNames.add(fieldType);
			}

			Class clazz = new Class(rootXPath, typeName, typeComm, order, fieldDefs.toArray(new ClassField[] {}));
			order++;

			name2Class.put(typeName, clazz);
			if (rootXPath != null && mainClass == null)
			{
				mainClass = clazz;
			}

			typeNames.add(typeName);
		}
	}
}
