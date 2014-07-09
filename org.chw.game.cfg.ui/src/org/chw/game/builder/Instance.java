package org.chw.game.builder;

import java.util.ArrayList;

class Instance
{
	private TypeDef type;
	private ArrayList<InstanceField> fields = new ArrayList<InstanceField>();
	
	/**
	 * ���캯��
	 * @param type
	 */
	public Instance(TypeDef type)
	{
		this.type=type;
	}
	
	/**
	 * ��ȡ����
	 * @return
	 */
	public TypeDef getType()
	{
		return type;
	}
	
	/**
	 * �ֶ��б�
	 * @return
	 */
	public ArrayList<InstanceField> getFields()
	{
		return fields;
	}
}