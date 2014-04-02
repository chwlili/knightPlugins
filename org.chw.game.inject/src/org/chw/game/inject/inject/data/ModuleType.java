package org.chw.game.inject.inject.data;

public class ModuleType extends Element
{
	private String typeNamespace;

	/**
	 * 构造函数
	 * 
	 * @param packName
	 * @param typeName
	 * @param name
	 */
	public ModuleType(String name,String packName, String typeName, String typeNamespace,String path)
	{
		super(name,packName,typeName,path);
		
		this.typeNamespace = typeNamespace;
	}
	
	/**
	 * 获取类型名称空间
	 * 
	 * @return
	 */
	public String getTypeNamespace()
	{
		return typeNamespace;
	}
}
