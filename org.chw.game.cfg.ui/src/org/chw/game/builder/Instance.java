package org.chw.game.builder;

import java.util.ArrayList;
import java.util.HashMap;

class Instance
{
	private TypeDef type;
	private ArrayList<InstanceField> fields = new ArrayList<InstanceField>();
	private HashMap<String, InstanceField> fieldMap;

	/**
	 * ���캯��
	 * 
	 * @param type
	 */
	public Instance(TypeDef type)
	{
		this.type = type;
	}

	/**
	 * ��ȡ����
	 * 
	 * @return
	 */
	public TypeDef getType()
	{
		return type;
	}

	/**
	 * �ֶ��б�
	 * 
	 * @return
	 */
	public ArrayList<InstanceField> getFields()
	{
		return fields;
	}

	/**
	 * �����ֶ�
	 * @param name
	 * @return
	 */
	public InstanceField findField(String name)
	{
		if (fieldMap == null)
		{
			fieldMap = new HashMap<String, InstanceField>();
		}

		for (InstanceField field : fields)
		{
			fieldMap.put(field.getDef().name, field);
		}
		return fieldMap.get(name);
	}
}