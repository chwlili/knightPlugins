package org.chw.game.builder;

import java.util.ArrayList;

class Instance
{
	private TypeDef type;
	private ArrayList<InstanceField> fields = new ArrayList<InstanceField>();
	
	/**
	 * 构造函数
	 * @param type
	 */
	public Instance(TypeDef type)
	{
		this.type=type;
	}
	
	/**
	 * 获取类型
	 * @return
	 */
	public TypeDef getType()
	{
		return type;
	}
	
	/**
	 * 字段列表
	 * @return
	 */
	public ArrayList<InstanceField> getFields()
	{
		return fields;
	}
}