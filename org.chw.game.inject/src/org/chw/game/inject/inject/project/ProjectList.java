package org.chw.game.inject.inject.project;

import java.util.Hashtable;

import org.eclipse.core.resources.IProject;

public class ProjectList
{
	private Hashtable<IProject, Project> table = new Hashtable<IProject, Project>();

	/**
	 * �Ƿ�������Ŀ��Ӧ������
	 * 
	 * @param data
	 * @return
	 */
	public boolean hasData(IProject project)
	{
		return table.containsKey(project);
	}

	/**
	 * ��ȡ��Ŀ��Ӧ������
	 * 
	 * @param project
	 * @return
	 */
	public Project getData(IProject project)
	{
		return table.get(project);
	}

	/**
	 * �����Ŀ��Ӧ������
	 * 
	 * @param project
	 * @return
	 */
	public void addData(IProject project)
	{
		table.put(project, new Project(project));
	}

	/**
	 * ɾ����Ŀ��Ӧ������
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
	 * �滻��Ŀ����
	 * 
	 * @param project
	 */
	public void restData(IProject project, Project data)
	{
		removeData(project);
		table.put(project, data);
	}
}
