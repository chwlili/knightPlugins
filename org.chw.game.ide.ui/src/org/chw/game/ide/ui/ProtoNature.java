package org.chw.game.ide.ui;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;

public class ProtoNature implements IProjectNature
{
	public static final String NATURE_ID = "org.chw.game.ide.ui.ProtoNature";


	public static final QualifiedName OUTPUT_AS_FLAG = new QualifiedName("org.chw.game.ide.ui", "output_as_flag");
	
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
