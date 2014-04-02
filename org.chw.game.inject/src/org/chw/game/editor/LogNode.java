package org.chw.game.editor;

public class LogNode extends Node
{
	public String name;
	public String path;
	
	public LogNode(boolean select,String name,String path)
	{
		super(select);
		
		this.name=name;
		this.path=path;
	}
	
	@Override
	public Node createClone()
	{
		return new LogNode(select,name,path);
	}
}
