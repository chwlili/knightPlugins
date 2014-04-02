package org.chw.game.inject.inject.data;

import java.util.ArrayList;


public class Package
{
	private String packName;
	private ArrayList<ModuleType> modules;
	private ArrayList<Element> elements;
	
	/**
	 * 构造函数
	 * @param packNae
	 * @param modules
	 * @param notice
	 */
	public Package(String packName)
	{
		this.packName=packName;
		this.modules=new ArrayList<ModuleType>();
		this.elements=new ArrayList<Element>();
	}
	
	/**
	 * 包名
	 * @return
	 */
	public String getPackName()
	{
		return packName;
	}
	
	/**
	 * 模块列表
	 * @return
	 */
	public ArrayList<ModuleType> getModules()
	{
		return modules;
	}
	
	/**
	 * 元素列表
	 * @return
	 */
	public ArrayList<Element> getElements()
	{
		return elements;
	}
}
