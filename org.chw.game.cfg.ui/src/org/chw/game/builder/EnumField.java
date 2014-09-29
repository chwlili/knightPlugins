package org.chw.game.builder;

public class EnumField
{
	/**
	 * 注释
	 */
	public final String comment;

	/**
	 * 名称
	 */
	public final String name;

	/**
	 * 值
	 */
	public final String value;

	/**
	 * 序号
	 */
	public final int order;

	/**
	 * 默认字段
	 */
	public final boolean normal;

	/**
	 * 构造函数
	 * 
	 * @param name
	 * @param value
	 */
	public EnumField(String comment, String name, String value, boolean normal, int order)
	{
		this.comment = comment;
		this.name = name;
		this.value = value;
		this.normal = normal;
		this.order = order;
	}
}
