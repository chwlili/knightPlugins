package org.chw.game.packer.world.scene;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import org.chw.game.packer.world.ImgFile;

public class SceneHot
{
	private int x;
	private int y;
	private int width;
	private int height;
	private int doorIndex;
	private ImgFile desc;
	private ArrayList<SceneLink> links;
	
	private SceneHotLink[] lines;
	
	public SceneHot(int x,int y,int width,int height,int doorIndex,ImgFile desc,ArrayList<SceneLink> links)
	{
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.doorIndex=doorIndex;
		this.desc=desc;
		this.links=links;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public int getDoorIndex()
	{
		return doorIndex;
	}
	
	public ImgFile getImgFile()
	{
		return desc;
	}
	
	public SceneHotLink[] getLinks()
	{
		if(lines==null)
		{
			ArrayList<SceneHotLink> tmpList=new ArrayList<SceneHotLink>();
			
			if(links!=null)
			{
				for(SceneLink tmp:links)
				{
					if(tmp.getDest()!=null && tmp.getDest().getScene()!=null)
					{
						Scene scene=tmp.getDest().getScene();
						SceneLinkTarget target=tmp.getDest();
						
						tmpList.add(new SceneHotLink(scene.getSceneID(), scene.getSceneName(), target.getX(), target.getY()));
					}
				}
			}
			
			lines=new SceneHotLink[tmpList.size()];
			lines=tmpList.toArray(lines);
		}
		return lines;
	}
}
