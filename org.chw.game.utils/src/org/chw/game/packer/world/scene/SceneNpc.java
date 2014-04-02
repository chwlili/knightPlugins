package org.chw.game.packer.world.scene;

import org.chw.game.packer.world.attire.Attire;

public class SceneNpc
{
	private String name;
	private int id;
	private int x;
	private int y;
	private Attire attire;
	
	public SceneNpc(String name,int id,int x,int y,Attire attire)
	{
		this.name=name;
		this.id=id;
		this.x=x;
		this.y=y;
		this.attire=attire;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getID()
	{
		return id;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public Attire getAttire()
	{
		return attire;
	}
}
