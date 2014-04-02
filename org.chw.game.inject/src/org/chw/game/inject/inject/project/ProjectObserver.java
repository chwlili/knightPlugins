package org.chw.game.inject.inject.project;

import java.util.ArrayList;

import org.chw.game.inject.Activator;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

public class ProjectObserver implements IResourceChangeListener
{
	private boolean starting = false;
	private ProjectList datas = new ProjectList();

	/**
	 * 启动
	 */
	public void startup()
	{
		if (!starting)
		{
			ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.PRE_BUILD | IResourceChangeEvent.PRE_CLOSE | IResourceChangeEvent.PRE_DELETE);
			starting = true;
		}
	}

	/**
	 * 停止
	 */
	public void shutdown()
	{
		if (starting)
		{
			starting = false;
			ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		}
	}

	/**
	 * 获取项目
	 */
	public Project getProject(IProject project)
	{
		Project model = datas.getData(project);
		if (model == null)
		{
			datas.addData(project);
			model = datas.getData(project);
		}
		
		return model;
	}
	
	/**
	 * 初始化项目
	 * 
	 * @param project
	 */
	public void initalizeProject(IProject project)
	{
		if (project == null)
		{
			return;
		}

		// 忽略没有打开的项目
		if (!project.isOpen())
		{
			return;
		}

		// 忽略没有标记的项目
		try
		{
			if (!project.hasNature(ProjectNature.NATURE_ID))
			{
				return;
			}
		}
		catch (CoreException e)
		{
			Activator.writeError(e);
		}

		// 初始化项目数据
		Project model = datas.getData(project);
		if (model == null)
		{
			datas.addData(project);
			model = datas.getData(project);
		}
		model.fullBuild();
	}
	
	/**
	 * 
	 * @param project
	 */
	public void clearupProject(IProject project)
	{
		if (project == null)
		{
			return;
		}

		// 忽略没有打开的项目
		if (!project.isOpen())
		{
			return;
		}

		// 忽略没有标记的项目
		try
		{
			if (!project.hasNature(ProjectNature.NATURE_ID))
			{
				return;
			}
		}
		catch (CoreException e)
		{
			Activator.writeError(e);
		}
		
		// 初始化项目数据
		Project model = datas.getData(project);
		if (model == null)
		{
			datas.addData(project);
			model = datas.getData(project);
		}
		model.fullBuild();
	}

	/**
	 * 处理资源改变
	 */
	@Override
	public void resourceChanged(IResourceChangeEvent event)
	{
		//System.out.println("--------------------------------------------");
		//System.out.println(String.format("* %s ( %s )", TypeNameUtil.getResourceChangeTypeName(event.getType()), TypeNameUtil.getBuildTypeName(event.getBuildKind())));
		//TypeNameUtil.printDelta(event.getDelta());
		//System.out.println("");

		// 处理关闭
		if (event.getType() == IResourceChangeEvent.PRE_CLOSE)
		{
			onProjectClose(event);
			return;
		}

		// 处理删除
		if (event.getType() == IResourceChangeEvent.PRE_DELETE)
		{
			onProjectDelete(event);
			return;
		}

		// 处理清理
		if (event.getBuildKind() == IncrementalProjectBuilder.CLEAN_BUILD)
		{
			onProjectClean(event);
			return;
		}

		// 处理增量
		if (event.getDelta() != null)
		{
			onIncremental(event);
			return;
		}
	}

	/**
	 * 项目关闭时
	 */
	private void onProjectClose(IResourceChangeEvent event)
	{
		if (event.getType() != IResourceChangeEvent.PRE_CLOSE)
		{
			return;
		}

		if (event.getResource() instanceof IProject)
		{
			IProject project = (IProject) event.getResource();
			if (datas.hasData(project))
			{
				datas.getData(project).close();
			}
		}
		else if (event.getResource() instanceof IWorkspace)
		{
		}
	}

	/**
	 * 项目删除时
	 * 
	 * @param event
	 */
	private void onProjectDelete(IResourceChangeEvent event)
	{
		if (event.getType() != IResourceChangeEvent.PRE_DELETE)
		{
			return;
		}

		if (event.getResource() instanceof IProject)
		{
			IProject project = (IProject) event.getResource();
			if (datas.hasData(project))
			{
				datas.removeData(project);
			}
		}
		else if (event.getResource() instanceof IWorkspace)
		{
		}
	}

	/**
	 * 项目清理时
	 * 
	 * @param event
	 */
	private void onProjectClean(IResourceChangeEvent event)
	{
		ArrayList<IProject> projects = new ArrayList<IProject>();

		if (event.getSource() instanceof IProject)
		{
			projects.add((IProject) event.getSource());
		}
		else if (event.getSource() instanceof IWorkspace)
		{
			IWorkspace workspace = (IWorkspace) event.getSource();
			for (IProject project : workspace.getRoot().getProjects())
			{
				projects.add(project);
			}
		}

		for (IProject project : projects)
		{
			try
			{
				if (project.hasNature(ProjectNature.NATURE_ID))
				{
					Project model = datas.getData(project);
					if (model != null)
					{
						//model.clearup();
					}
				}
			}
			catch (CoreException e)
			{
				Activator.writeError(e);
			}
		}
	}

	/**
	 * 处理增量改变
	 * 
	 * @param event
	 */
	private void onIncremental(IResourceChangeEvent event)
	{
		if (event.getDelta() == null)
		{
			return;
		}

		IResourceDelta[] deltas = event.getDelta().getAffectedChildren();
		for (int i = 0; i < deltas.length; i++)
		{
			IResourceDelta delta = deltas[i];

			// 跳过非项目资源
			IResource resource = delta.getResource();
			if (!(resource instanceof IProject))
			{
				continue;
			}

			// 跳过未打开的项目
			IProject project = (IProject) resource;
			if (!project.isOpen())
			{
				continue;
			}
			
			//改变是否是打开操作导致的
			if((delta.getFlags() & IResourceDelta.OPEN)>0)
			{
				continue;
			}

			// 跳过未标记的项目
			try
			{
				if (!project.hasNature(ProjectNature.NATURE_ID))
				{
					continue;
				}
			}
			catch (CoreException e)
			{
				Activator.writeError(e);
				continue;
			}

			// 处理增量改变
			Project model = datas.getData(project);
			if (model == null)
			{
				datas.addData(project);
				model = datas.getData(project);
			}
			model.incrementalBuild(delta);
		}
	}
}
