package org.chw.game.builder;

import java.util.ArrayList;

public class TypeDef
{
	private String filePath;
	private String xpath;

	private String packName;
	private String name;
	private String comment;
	ArrayList<TypeFieldDef> fields = new ArrayList<>();

	public TypeDef(String filePath, String xpath, String packName, String name, String comment)
	{
		this.filePath = filePath;
		this.xpath = xpath;

		this.packName = packName;
		this.name = name;
		this.comment = comment;
	}

	public String getFilePath()
	{
		return filePath;
	}

	public String getXPath()
	{
		return xpath;
	}

	public String getPackName()
	{
		return packName;
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

	public TypeFieldDef getFieldBy(String id)
	{
		for (int i = 0; i < fields.size(); i++)
		{
			if (fields.get(i).name.equals(id))
			{
				return fields.get(i);
			}
		}
		return null;
	}
}