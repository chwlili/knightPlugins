package org.chw.game.inject.inject.project;

import java.util.Hashtable;

import org.eclipse.core.resources.IProject;

public class ProjectList
{
	private Hashtable<IProject, Project> table = new Hashtable<IProject, Project>();

	/**
	 * 是否有与项目对应的数据
	 * 
	 * @param data
	 * @return
	 */
	public boolean hasData(IProject project)
	{
		return table.containsKey(project);
	}

	/**
	 * 获取项目对应的数据
	 * 
	 * @param project
	 * @return
	 */
	public Project getData(IProject project)
	{
		return table.get(project);
	}

	/**
	 * 添加项目对应的数据
	 * 
	 * @param project
	 * @return
	 */
	public void addData(IProject project)
	{
		table.put(project, new Project(project));
	}

	/**
	 * 删除项目对应的数据
	 * 
	 * @param project
	 */
	public void removeData(IProject project)
	{
		if (hasData(project))
		{
			// getData(project).dispose();
			table.remove(project);
		}
	}

	/**
	 * 替换项目数据
	 * 
	 * @param project
	 */
	public void restData(IProject project, Project data)
	{
		removeData(project);
		table.put(project, data);
	}
}
