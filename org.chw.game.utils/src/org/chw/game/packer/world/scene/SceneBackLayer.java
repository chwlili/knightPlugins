package org.chw.game.packer.world.scene;

import org.chw.game.packer.world.ImgFile;

public class SceneBackLayer
{
	private String name;
	private int x;
	private int y;
	private float speed;
	private ImgFile img;
	
	public SceneBackLayer(String name,int x,int y,float speed,ImgFile img)
	{
		this.name=name;
		this.x=x;
		this.y=y;
		this.speed=speed;
		this.img=img;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String value)
	{
		name=value;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public float getSpeed()
	{
		return speed;
	}
	
	public ImgFile getImage()
	{
		return img;
	}
}
