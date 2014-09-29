package org.chw.game.builder;

public class EnumField
{
	/**
	 * ע��
	 */
	public final String comment;

	/**
	 * ����
	 */
	public final String name;

	/**
	 * ֵ
	 */
	public final String value;

	/**
	 * ���
	 */
	public final int order;

	/**
	 * Ĭ���ֶ�
	 */
	public final boolean normal;

	/**
	 * ���캯��
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
