package org.chw.game.packer.world;

import java.util.Arrays;
import java.util.Comparator;

public class TextureSetKey
{
	private String type;
	private GridImgKey[] clips;
	private String key;
	
	public TextureSetKey(String type,GridImgKey[] clips)
	{
		this.type=type;
		this.clips=clips;
		
		Arrays.sort(clips, new Comparator<GridImgKey>()
		{
			@Override
			public int compare(GridImgKey o1, GridImgKey o2)
			{
				return o1.toString().compareTo(o2.toString());
			}
		});
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<clips.length;i++)
		{
			GridImgKey clip=clips[i];
			sb.append(clip.toString());
			
			if(i<clips.length-1)
			{
				sb.append("+");
			}
		}
		this.key=type+">"+sb.toString();
	}
	
	public String getType()
	{
		return type;
	}
	
	public GridImgKey[] getClips()
	{
		return clips;
	}
	
	@Override
	public int hashCode()
	{
		return key.hashCode();
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(super.equals(obj))
		{
			return true;
		}
		else
		{
			if(obj instanceof TextureSetKey)
			{
				TextureSetKey other=(TextureSetKey)obj;
				
				return other.type.equals(type) && other.key.equals(key);
			}
		}
		return false;
	}
	
	@Override
	public String toString()
	{
		return key;
	}
	
}
