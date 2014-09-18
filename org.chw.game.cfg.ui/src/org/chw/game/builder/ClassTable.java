package org.chw.game.builder;

import java.util.ArrayList;
import java.util.HashMap;

import org.chw.game.cfg.Enter;
import org.chw.game.cfg.Field;
import org.chw.game.cfg.FieldMeta;
import org.chw.game.cfg.FieldMetaKey;
import org.chw.game.cfg.Type;
import org.chw.game.cfg.XML2;
import org.eclipse.emf.common.util.EList;

public class ClassTable
{
	private String packName = "";
	private String inputFile = null;
	private ArrayList<Class> mainClass = new ArrayList<Class>();
	private HashMap<String, Class> name2Class = new HashMap<String, Class>();

	/**
	 * ���캯��
	 * 
	 * @param root
	 */
	public ClassTable(XML2 root)
	{
		open(root);
	}

	/**
	 * ��ȡ����URL
	 * 
	 * @return
	 */
	public String getInputURL()
	{
		return inputFile;
	}

	/**
	 * ��ȡ����
	 * 
	 * @return
	 */
	public String getPackName()
	{
		return packName;
	}

	/**
	 * ��ȡ������
	 * 
	 * @return
	 */
	public Class[] getAllClass()
	{
		return name2Class.values().toArray(new Class[] {});
	}

	/**
	 * ��ȡ��������
	 * 
	 * @return
	 */
	public Class[] getAllMainClass()
	{
		return mainClass.toArray(new Class[] {});
	}

	/**
	 * ��ȡ��
	 * 
	 * @param name
	 * @return
	 */
	public Class getClass(String name)
	{
		return name2Class.get(name);
	}

	/**
	 * ��ȡ����ID
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
	 * ��ʼ����������
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

				FieldMeta meta = field.getMeta();
				if (meta != null)
				{
					fieldList = true;

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

				if (fieldType != "")
				{
					fieldDefs.add(new ClassField(fieldXPath, fieldName, fieldComm, fieldType, fieldList, indexList));
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
