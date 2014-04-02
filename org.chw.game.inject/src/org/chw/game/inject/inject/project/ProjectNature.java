package org.chw.game.inject.inject.project;

import org.chw.game.inject.Activator;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;

public class ProjectNature implements IProjectNature
{
	public static String NATURE_ID = Activator.PLUGIN_ID + ".InjectMetaDataNature";

	public static String MARKER_ID = Activator.PLUGIN_ID + ".InjectMetaDataMarker";

	public static QualifiedName OUTPUT_FOLDER_NAME = new QualifiedName("chw_inject", "module_output_folder_name");
	public static QualifiedName OUTPUT_FOLDER_PATH = new QualifiedName("chw_inject", "module_output_folder_path");

	public static QualifiedName MODULE_FILE = new QualifiedName("chw_inject", "module_file");
	public static QualifiedName NOTICE_FILE = new QualifiedName("chw_inject", "notice_file");
	public static QualifiedName INTERFACE_FILE = new QualifiedName("chw_inject", "interface_file");
	public static QualifiedName ENUM_FILE = new QualifiedName("chw_inject", "enum_file");
	
	private IProject project;

	@Override
	public void configure() throws CoreException
	{
	}

	@Override
	public void deconfigure() throws CoreException
	{
	}

	@Override
	public IProject getProject()
	{
		return project;
	}

	@Override
	public void setProject(IProject project)
	{
		this.project = project;
	}

}
