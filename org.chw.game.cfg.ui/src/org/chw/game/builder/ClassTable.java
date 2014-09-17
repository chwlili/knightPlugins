package org.chw.game.builder;

import java.util.ArrayList;
import java.util.HashMap;

import org.chw.game.cfg.Field;
import org.chw.game.cfg.HashType;
import org.chw.game.cfg.Input;
import org.chw.game.cfg.ListType;
import org.chw.game.cfg.NativeType;
import org.chw.game.cfg.Param;
import org.chw.game.cfg.Type;
import org.chw.game.cfg.XML2;

public class ClassTable
{
	private String packName = "";
	private ArrayList<Class> mainClass = new ArrayList<Class>();
	private HashMap<String, Class> name2Class = new HashMap<String, Class>();

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
	 * 获取包名
	 * 
	 * @return
	 */
	public String getPackName()
	{
		return packName;
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
	 * 获取所有主类
	 * 
	 * @return
	 */
	public Class[] getAllMainClass()
	{
		return mainClass.toArray(new Class[] {});
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
	 * 初始化所有类型
	 */
	private void open(XML2 root)
	{
		XML2 xml2 = root;
		if (xml2 == null)
		{
			return;
		}

		mainClass = new ArrayList<Class>();
		name2Class = new HashMap<String, Class>();

		packName = "";
		if (xml2.getPack() != null)
		{
			packName = xml2.getPack().getPack();
		}

		int order = 1;
		for (Type type : xml2.getTypes())
		{
			String typeComm = type.getComment();
			String typeName = type.getName();
			String inputPath = null;
			String xpath = null;

			Input input = type.getInput();
			if (input != null)
			{
				inputPath = input.getFilePath();
				xpath = input.getNodePath();
			}

			ArrayList<ClassField> fieldDefs = new ArrayList<ClassField>();
			for (Field field : type.getFields())
			{
				String fieldName = field.getFieldName();
				String fieldComm = field.getComment();
				String fieldXPath = field.getNodePath();
				String fieldType = "";
				boolean fieldList = false;
				String[] indexList = null;

				if (field.getType() instanceof ListType)
				{
					ListType listType = (ListType) field.getType();
					fieldType = listType.getType();
					fieldList = true;
				}
				else if (field.getType() instanceof HashType)
				{
					HashType hashType = (HashType) field.getType();
					fieldType = hashType.getType();
					fieldList = true;

					ArrayList<String> indexKeys = new ArrayList<String>();
					for (Param param : hashType.getParams())
					{
						indexKeys.add(param.getParamName());
					}
					indexList = indexKeys.toArray(new String[indexKeys.size()]);
				}
				else if (field.getType() instanceof NativeType)
				{
					NativeType nativeType = (NativeType) field.getType();
					fieldType = nativeType.getType();
					fieldList = false;
				}

				if (fieldType != "")
				{
					fieldDefs.add(new ClassField(fieldXPath, fieldName, fieldComm, fieldType, fieldList, indexList));
				}
			}

			Class clazz = new Class(inputPath, xpath, packName, typeName, typeComm, order, fieldDefs.toArray(new ClassField[] {}));
			order++;

			name2Class.put(typeName, clazz);
			if (inputPath != null)
			{
				mainClass.add(clazz);
			}
		}
	}
}
