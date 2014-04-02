package org.chw.game.editor;

public class NameNode extends Node
{
	public String name;
	
	public NameNode(boolean select,String name)
	{
		super(select);
		
		this.name=name;
	}
	
	@Override
	public Node createClone()
	{
		return new NameNode(select,name);
	}
}
