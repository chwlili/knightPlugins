package org.chw.game.builder;


class InstanceField
{
	private String xpath;
	private TypeFieldDef def;
	
	private Object value;

	public InstanceField(String xpath, TypeFieldDef def)
	{
		this.xpath = xpath;
		this.def = def;
	}
	
	public String getXPath()
	{
		return xpath;
	}
	
	public TypeFieldDef getDef()
	{
		return def;
	}
	
	public Object getValue()
	{
		return value;
	}
	public void setValue(Object value)
	{
		this.value=value;
	}
}