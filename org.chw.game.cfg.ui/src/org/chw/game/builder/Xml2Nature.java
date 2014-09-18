package org.chw.game.builder;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;

public class Xml2Nature implements IProjectNature
{
	public static final String NATURE_ID = "org.chw.game.cfg.ui.Xml2Nature";

	public static final String BUILD_ID = "org.chw.game.cfg.ui.Xml2Builder";

	public static final QualifiedName CFG_DIR = new QualifiedName("org.chw.game.cfg.ui", "cfg");

	public static final QualifiedName XML_DIR = new QualifiedName("org.chw.game.cfg.ui", "xml");

	public static final QualifiedName TOP_PACKAGE_NAME = new QualifiedName("org.chw.game.cfg.ui", "topPackName");

	public static final QualifiedName CORE_PACKAGE_NAME = new QualifiedName("org.chw.game.cfg.ui", "corePackName");

	public static final QualifiedName CODE_PACKAGE_NAME = new QualifiedName("org.chw.game.cfg.ui", "codePackName");

	public static final QualifiedName FILE_PACKAGE_CHECK = new QualifiedName("org.chw.game.cfg.ui", "filePackCheck");

	public static final QualifiedName FILE_PACKAGE_NAME = new QualifiedName("org.chw.game.cfg.ui", "filePackName");

	public static final String DEFAULT_TOP_PACK = "org.cfg.game";

	public static final String DEFAULT_CORE_PACK = "base";

	public static final String DEFAULT_CODE_PACK = "code";

	public static final Boolean DEFAULT_FILE_CHECK = false;

	public static final String DEFAULT_FILE_PACK = "files";

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
