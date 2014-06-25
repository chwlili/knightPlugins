package org.chw.game.builder;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

public class Xml2Nature implements IProjectNature
{
	public static final String NATURE_ID = "org.chw.game.cfg.ui.Xml2Nature";
	
	public static final String BUILD_ID="org.chw.game.cfg.ui.Xml2Builder";

	private IProject project;

	public void configure() throws CoreException
	{
	}

	public void deconfigure() throws CoreException
	{
	}

	public IProject getProject()
	{
		return project;
	}

	public void setProject(IProject project)
	{
		this.project = project;
	}

}
