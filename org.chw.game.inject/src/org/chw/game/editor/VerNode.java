package org.chw.game.editor;

public class VerNode extends Node
{
	public String name;
	public String path;
	public String policy;
	
	public VerNode(boolean select,String name,String path,String policy)
	{
		super(select);
		
		this.name=name;
		this.path=path;
		this.policy=policy;
	}
	
	@Override
	public Node createClone()
	{
		return new VerNode(select,name,path,policy);
	}
}
