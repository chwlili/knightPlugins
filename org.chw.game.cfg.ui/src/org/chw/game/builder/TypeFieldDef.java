package org.chw.game.builder;

public class TypeFieldDef
{
	private String	xpath;

	private String	name;
	private String comment;
	private String	type;

	private Boolean	repeted;

	public TypeFieldDef(String xpath, String name, String comment, String type, boolean repeted)
	{
		this.xpath = xpath;
		this.name = name;
		this.comment=comment;
		this.type = type;
		this.repeted = repeted;
	}

	public String getXPath()
	{
		return xpath;
	}

	public String getName()
	{
		return name;
	}
	
	public String getComment()
	{
		return comment;
	}

	public String getType()
	{
		return type;
	}

	public boolean isRepeted()
	{
		return repeted;
	}

	public boolean isNativeType()
	{
		return isBoolean() || isInt() || isUint() || isNumber() || isString();
	}

	public boolean isExtendType()
	{
		return !isNativeType();
	}

	public boolean isBoolean()
	{
		return type.equals("boolean");
	}

	public boolean isInt()
	{
		return type.equals("int");
	}

	public boolean isUint()
	{
		return type.equals("uint");
	}

	public boolean isNumber()
	{
		return type.equals("Number");
	}

	public boolean isString()
	{
		return type.equals("String");
	}
}