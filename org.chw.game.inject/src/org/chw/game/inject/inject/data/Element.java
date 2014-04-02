package org.chw.game.inject.inject.data;

public class Element
{
	private String name;
	private String packName;
	private String typeName;
	private String path;
	private String namespace;

	/**
	 * 构造函数
	 * @param name
	 * @param packName
	 * @param typeName
	 * @param path
	 */
	public Element(String name, String packName, String typeName, String path)
	{
		if(name==null)
		{
			name="";
		}
		if (packName == null)
		{
			packName = "";
		}
		
		this.name=name;
		this.packName = packName;
		this.typeName = typeName;
		this.path=path;
		this.namespace="";
	}
	
	/**
	 * 构造函数
	 * @param name
	 * @param packName
	 * @param typeName
	 * @param path
	 */
	public Element(String name, String packName, String typeName, String path,String namespace)
	{
		this(name,packName,typeName,path);
		this.namespace=namespace;
	}

	/**
	 * 名称
	 * @return
	 */
	public String getName()
	{
		if(name==null || name.isEmpty())
		{
			return "?";
		}
		return name;
	}
	

	/**
	 * 包名
	 * 
	 * @return
	 */
	public String getPackName()
	{
		return packName;
	}

	/**
	 * 类名
	 * 
	 * @return
	 */
	public String getTypeName()
	{
		return typeName;
	}

	/**
	 * 完全限定类名
	 * @return
	 */
	public String getTypeQName()
	{
		if (packName != null && packName.isEmpty() == false)
		{
			return packName + "." + typeName;
		}
		return typeName;
	}
	
	/**
	 * 获取路径
	 * @return
	 */
	public String getPath()
	{
		return path;
	}
	
	/**
	 * 名称空间
	 * @return
	 */
	public String getNamespace()
	{
		return namespace;
	}
	
	/**
	 * 是否相等
	 * @param node
	 * @return
	 */
	public boolean isEquals(Element node)
	{
		if(!getName().equals(node.getName()))
		{
			return false;
		}
		if(!getPackName().equals(node.getPackName()))
		{
			return false;
		}
		if(!getTypeName().equals(node.getTypeName()))
		{
			return false;
		}
		if(!getPath().equals(node.getPath()))
		{
			return false;
		}
		if(!getNamespace().equals(node.getNamespace()))
		{
			return false;
		}
		return true;
	}
}
