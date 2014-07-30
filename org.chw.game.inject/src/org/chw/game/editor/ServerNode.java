package org.chw.game.editor;

public class ServerNode extends Node
{
	public String id;
	public String name;
	public String path;
	public String port;
	public String world;
	
	public ServerNode(boolean select,String id,String name,String path,String port,String world)
	{
		super(select);
		
		this.id=id;
		this.name=name;
		this.path=path;
		this.port=port;
		this.world=world;
	}
	
	@Override
	public Node createClone()
	{
		return new ServerNode(select,id,name,path,port,world);
	}
}