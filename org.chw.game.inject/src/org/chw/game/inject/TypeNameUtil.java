package org.chw.game.inject;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;

public class TypeNameUtil
{
	public static void printDelta(IResourceDelta delta)
	{
		try
		{
			if(delta!=null)
			{
				delta.accept(new IResourceDeltaVisitor()
				{
					@Override
					public boolean visit(IResourceDelta delta) throws CoreException
					{
						if(delta.getResource().getType()==IResource.FILE)
						{
							System.out.println(String.format("file %s ! %s",getDeltaChangeTypeName(delta.getKind()),delta.getFullPath()));
							return false;
						}
						return true;
					}
				});
			}
		}
		catch (CoreException e1)
		{
			e1.printStackTrace();
		}
	}
	
	public static String getDeltaChangeTypeName(int kind)
	{
		String type="";
		switch(kind)
		{
		case IResourceDelta.ADDED:type="added";break;
		case IResourceDelta.CHANGED:type="changed";break;
		case IResourceDelta.REMOVED:type="removed";break;
		}
		
		return type;
	}
	
	public static String getDeltaChangeFlagName(int flag)
	{
		String type="";
		
		return type;
	}
	
	public static String getResourceChangeTypeName(int kind)
	{
		String type="";
		switch(kind)
		{
		case IResourceChangeEvent.PRE_BUILD:
			type = "pre_build";
			break;
		case IResourceChangeEvent.PRE_CLOSE:
			type = "pre_close";
			break;
		case IResourceChangeEvent.PRE_DELETE:
			type = "pre_delete";
			break;
		case IResourceChangeEvent.PRE_REFRESH:
			type = "pre_refresh";
			break;
		case IResourceChangeEvent.POST_BUILD:
			type="post_build";
			break;
		case IResourceChangeEvent.POST_CHANGE:
			type="post_changed";
			break;
		}
		
		return type;
	}
	
	public static String getBuildTypeName(int kind)
	{
		String type="";
		switch(kind)
		{
		case IncrementalProjectBuilder.AUTO_BUILD:type="auto_build";break;
		case IncrementalProjectBuilder.CLEAN_BUILD:type="clean_build";break;
		case IncrementalProjectBuilder.FULL_BUILD:type="full_build";break;
		case IncrementalProjectBuilder.INCREMENTAL_BUILD:type="incremental_build";break;
		}
		
		return type;
	}
}
