package org.chw.game.inject.inject.data;

import java.util.ArrayList;


public class Package
{
	private String packName;
	private ArrayList<ModuleType> modules;
	private ArrayList<Element> elements;
	
	/**
	 * ���캯��
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
	 * ����
	 * @return
	 */
	public String getPackName()
	{
		return packName;
	}
	
	/**
	 * ģ���б�
	 * @return
	 */
	public ArrayList<ModuleType> getModules()
	{
		return modules;
	}
	
	/**
	 * Ԫ���б�
	 * @return
	 */
	public ArrayList<Element> getElements()
	{
		return elements;
	}
}
