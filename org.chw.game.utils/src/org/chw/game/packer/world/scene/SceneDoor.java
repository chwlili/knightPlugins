package org.chw.game.packer.world.scene;

import org.chw.game.packer.world.attire.Attire;

public class SceneDoor
{
	private int id;
	private int x;
	private int y;
	private Attire attire;
	
	public SceneDoor(int id,int x,int y,Attire attire)
	{
		this.id=id;
		this.x=x;
		this.y=y;
		this.attire=attire;
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
