package org.chw.game.builder;

import java.util.ArrayList;
import java.util.HashMap;

import org.chw.game.cfg.Enter;
import org.chw.game.cfg.Field;
import org.chw.game.cfg.FieldMetaKey;
import org.chw.game.cfg.ListMeta;
import org.chw.game.cfg.SliceMeta;
import org.chw.game.cfg.Type;
import org.chw.game.cfg.XML2;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public class ClassTable
{
	private String packName = "";
	private String inputFile = null;
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

		inputFile = null;
		if (xml2.getInput() != null)
		{
			inputFile = xml2.getInput().getUrl();
		}

		int order = 1;
		for (Type type : xml2.getTypes())
		{
			String typeComm = type.getComment();
			String typeName = type.getName();
			String rootXPath = null;

			Enter enter = type.getEnter();
			if (enter != null)
			{
				rootXPath = enter.getRootPath();
				if (rootXPath.charAt(0) != '/')
				{
					rootXPath = "/" + rootXPath;
				}
			}

			ArrayList<ClassField> fieldDefs = new ArrayList<ClassField>();
			for (Field field : type.getFields())
			{
				String fieldName = field.getFieldName();
				String fieldComm = field.getComment();
				String fieldXPath = field.getNodePath();
				String fieldType = field.getType().getType();
				boolean fieldList = false;
				String[] indexList = null;
				boolean sliceList = false;
				String sliceChar = null;

				boolean isBase = isBaseType(fieldType);

				EList<EObject> fieldMetas = field.getMeta();
				EObject fieldMeta = fieldMetas != null && fieldMetas.size() > 0 ? fieldMetas.get(fieldMetas.size() - 1) : null;
				if (fieldMeta instanceof ListMeta)
				{
					ListMeta meta = (ListMeta) fieldMeta;

					fieldList = true;

					if (!isBase)
					{
						ArrayList<String> keys = null;
						EList<FieldMetaKey> params = meta.getParams();
						if (params != null)
						{
							keys = new ArrayList<String>();
							for (FieldMetaKey param : params)
							{
								String paramName = param.getFieldName();
								if (paramName != null && paramName.isEmpty() == false)
								{
									keys.add(paramName);
								}
							}
						}

						if (keys != null && keys.size() > 0)
						{
							indexList = keys.toArray(new String[] {});
						}
					}
				}
				else if (fieldMeta instanceof SliceMeta)
				{
					SliceMeta meta = (SliceMeta) fieldMeta;
					if (isBase)
					{
						sliceList = true;
						sliceChar = meta.getSliceChar();
					}
				}

				if (fieldType != "")
				{
					fieldDefs.add(new ClassField(fieldXPath, fieldName, fieldComm, fieldType, fieldList, indexList, sliceList, sliceChar));
				}
			}

			Class clazz = new Class(rootXPath, typeName, typeComm, order, fieldDefs.toArray(new ClassField[] {}));
			order++;

			name2Class.put(typeName, clazz);
			if (rootXPath != null)
			{
				mainClass.add(clazz);
			}
		}
	}
}
