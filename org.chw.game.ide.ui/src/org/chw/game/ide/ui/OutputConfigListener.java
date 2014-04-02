package org.chw.game.ide.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.chw.game.ide.ui.internal.ProtoActivator;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.xtext.builder.EclipseOutputConfigurationProvider;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.ui.editor.preferences.PreferenceConstants;

public class OutputConfigListener
{
	private static ProtoListener listener;
	
	/**
	 * 开始
	 */
	public static void start()
	{
		if(listener==null)
		{
			listener=new OutputConfigListener.ProtoListener();
		}
		ResourcesPlugin.getWorkspace().addResourceChangeListener(listener, IResourceChangeEvent.POST_CHANGE|IResourceChangeEvent.PRE_BUILD|IResourceChangeEvent.POST_BUILD);
	}
	
	/**
	 * 停止
	 */
	public static void stop()
	{
		if(listener!=null)
		{
			ResourcesPlugin.getWorkspace().removeResourceChangeListener(listener);
		}
	}
	
	/**
	 * 监视器
	 * @author chw
	 *
	 */
	static class ProtoListener implements IResourceChangeListener
	{
		/**
		 * 资源已改变
		 * @param event
		 */
		public void resourceChanged(IResourceChangeEvent event)
		{
			System.out.println("change:"+event.getBuildKind());
			
			IResourceDelta[] list = event.getDelta().getAffectedChildren();
			if (list != null)
			{
				for (int i = 0; i < list.length; i++)
				{
					IResource res = list[i].getResource();
					
					if (res instanceof IProject)
					{
						IProject project=(IProject)res;
						
						boolean finded=false;
						
						IResourceDelta[] topFiles=list[i].getAffectedChildren();
						for(int j=0;j<topFiles.length;j++)
						{
							if(topFiles[j].getResource().getName().equals(".actionScriptProperties"))
							{
								finded=true;
							}
						}
						
						if(!finded)
						{
							return;
						}
						
						try
						{
							if(finded && project.isOpen() && project.hasNature(ProtoNature.NATURE_ID))
							{
								String binPath=getProjectSrcPath(project);
								
								String nodeKey=ProtoActivator.ORG_CHW_GAME_IDE_PROTO;
								String valueKey=EclipseOutputConfigurationProvider.OUTPUT_PREFERENCE_TAG+PreferenceConstants.SEPARATOR+IFileSystemAccess.DEFAULT_OUTPUT+PreferenceConstants.SEPARATOR+EclipseOutputConfigurationProvider.OUTPUT_DIRECTORY;

								ProjectScope projectScope = new ProjectScope(project);
								projectScope.getNode(nodeKey).put(valueKey, binPath);
								//projectScope.getNode(nodeKey).sync()
								System.out.println("改变首选项:"+projectScope.getNode(nodeKey).get(valueKey, binPath));
							}
						}
						catch (CoreException e)
						{
							e.printStackTrace();
						}
					}
				}
			}
		}

		/**
		 * 获取项目的源路径
		 * @param project
		 * @return
		 */
		private String getProjectSrcPath(IProject project)
		{
			String outputDir="src";
			
			BufferedReader reader=null;
			File file=new File(project.getLocation().toFile().getPath()+File.separatorChar+".actionScriptProperties");
			try
			{
				StringBuilder lines=new StringBuilder();
				
				reader=new BufferedReader(new FileReader(file));
				while(true)
				{
					String line=reader.readLine();
					if(line==null)
					{
						break;
					}
					else
					{
						lines.append(line);
					}
				}
				
				String content=lines.toString();
				
				int index=content.indexOf("sourceFolderPath");
				if(index!=-1)
				{
					int begin=content.indexOf("\"", index+1);
					int end=content.indexOf("\"", begin+1);
					
					outputDir=content.substring(begin+1, end);
				}
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			finally
			{
				if(reader!=null)
				{
					try
					{
						reader.close();
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
			}
			
			return outputDir;
		}
	}
}
