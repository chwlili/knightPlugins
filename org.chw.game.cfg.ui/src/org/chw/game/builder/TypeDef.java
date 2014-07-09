package org.chw.game.builder;

import java.util.ArrayList;


public class TypeDef
{
	private String filePath;
	private String				xpath;

	private String				name;
	private String comment;
	ArrayList<TypeFieldDef>	fields	= new ArrayList<>();
	
	public TypeDef(String filePath,String xpath, String name,String comment)
	{
		this.filePath=filePath;
		this.xpath = xpath;
		this.name = name;
		this.comment=comment;
	}
	
	public String getFilePath()
	{
		return filePath;
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

	public void addField(TypeFieldDef field)
	{
		fields.add(field);
	}

	public int getFieldLength()
	{
		return fields.size();
	}

	public TypeFieldDef getFieldAt(int index)
	{
		return fields.get(index);
	}
}