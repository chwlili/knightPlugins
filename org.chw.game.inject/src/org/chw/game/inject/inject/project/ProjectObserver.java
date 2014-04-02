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
	 * ����
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
	 * ֹͣ
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
	 * ��ȡ��Ŀ
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
	 * ��ʼ����Ŀ
	 * 
	 * @param project
	 */
	public void initalizeProject(IProject project)
	{
		if (project == null)
		{
			return;
		}

		// ����û�д򿪵���Ŀ
		if (!project.isOpen())
		{
			return;
		}

		// ����û�б�ǵ���Ŀ
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

		// ��ʼ����Ŀ����
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

		// ����û�д򿪵���Ŀ
		if (!project.isOpen())
		{
			return;
		}

		// ����û�б�ǵ���Ŀ
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
		
		// ��ʼ����Ŀ����
		Project model = datas.getData(project);
		if (model == null)
		{
			datas.addData(project);
			model = datas.getData(project);
		}
		model.fullBuild();
	}

	/**
	 * ������Դ�ı�
	 */
	@Override
	public void resourceChanged(IResourceChangeEvent event)
	{
		//System.out.println("--------------------------------------------");
		//System.out.println(String.format("* %s ( %s )", TypeNameUtil.getResourceChangeTypeName(event.getType()), TypeNameUtil.getBuildTypeName(event.getBuildKind())));
		//TypeNameUtil.printDelta(event.getDelta());
		//System.out.println("");

		// ����ر�
		if (event.getType() == IResourceChangeEvent.PRE_CLOSE)
		{
			onProjectClose(event);
			return;
		}

		// ����ɾ��
		if (event.getType() == IResourceChangeEvent.PRE_DELETE)
		{
			onProjectDelete(event);
			return;
		}

		// ��������
		if (event.getBuildKind() == IncrementalProjectBuilder.CLEAN_BUILD)
		{
			onProjectClean(event);
			return;
		}

		// ��������
		if (event.getDelta() != null)
		{
			onIncremental(event);
			return;
		}
	}

	/**
	 * ��Ŀ�ر�ʱ
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
	 * ��Ŀɾ��ʱ
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
	 * ��Ŀ����ʱ
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
	 * ���������ı�
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

			// ��������Ŀ��Դ
			IResource resource = delta.getResource();
			if (!(resource instanceof IProject))
			{
				continue;
			}

			// ����δ�򿪵���Ŀ
			IProject project = (IProject) resource;
			if (!project.isOpen())
			{
				continue;
			}
			
			//�ı��Ƿ��Ǵ򿪲������µ�
			if((delta.getFlags() & IResourceDelta.OPEN)>0)
			{
				continue;
			}

			// ����δ��ǵ���Ŀ
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

			// ���������ı�
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
