package org.chw.game.builder;

public class TypeFieldDef
{
	public final String xpath;

	public final String name;
	public final String comment;
	public final String type;

	public final Boolean repeted;
	public final String[] indexKeys;

	public TypeFieldDef(String xpath, String name, String comment, String type)
	{
		this(xpath, name, comment, type, false, null);
	}

	public TypeFieldDef(String xpath, String name, String comment, String type, boolean repeted)
	{
		this(xpath, name, comment, type, repeted, null);
	}

	public TypeFieldDef(String xpath, String name, String comment, String type, boolean repeted, String[] indexKeys)
	{
		this.xpath = xpath;
		this.name = name;
		this.comment = comment;
		this.type = type;
		this.repeted = repeted;
		this.indexKeys = indexKeys;
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
		return type.equals("Boolean");
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