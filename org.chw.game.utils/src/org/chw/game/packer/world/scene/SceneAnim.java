package org.chw.game.packer.world.scene;

import org.chw.game.packer.world.attire.Attire;

public class SceneAnim
{
	private String name;
	private int x;
	private int y;
	private int offsetX;
	private int offsetY;
	private Attire attire;
	
	public SceneAnim(String name,int x,int y,int offsetX,int offsetY,Attire attire)
	{
		this.name=name;
		this.x=x;
		this.y=y;
		this.offsetX=offsetX;
		this.offsetY=offsetY;
		this.attire=attire;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public int getOffsetX()
	{
		return offsetX;
	}
	
	public int getOffsetY()
	{
		return offsetY;
	}
	
	public Attire getAttire()
	{
		return attire;
	}
}
