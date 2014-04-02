package org.chw.game.editor;

public class ServerNode extends Node
{
	public String name;
	public String path;
	public String port;
	public String world;
	
	public ServerNode(boolean select,String name,String path,String port,String world)
	{
		super(select);
		
		this.name=name;
		this.path=path;
		this.port=port;
		this.world=world;
	}
	
	@Override
	public Node createClone()
	{
		return new ServerNode(select,name,path,port,world);
	}
}