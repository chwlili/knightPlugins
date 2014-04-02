package org.chw.game.inject.inject.data;

public class ModuleType extends Element
{
	private String typeNamespace;

	/**
	 * ���캯��
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
	 * ��ȡ�������ƿռ�
	 * 
	 * @return
	 */
	public String getTypeNamespace()
	{
		return typeNamespace;
	}
}
