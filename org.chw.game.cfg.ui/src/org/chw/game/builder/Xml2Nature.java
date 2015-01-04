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

	public static final QualifiedName OUTPUT_AS_FLAG = new QualifiedName("org.chw.game.cfg.ui", "output_as_flag");

	public static final String DEFAULT_TOP_PACK = "org.cfg.game";

	public static final String DEFAULT_CORE_PACK = "base";

	public static final String DEFAULT_CODE_PACK = "code";

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

	public static String getCodePackName(IProject project) throws CoreException
	{
		String topPackName = project.getPersistentProperty(Xml2Nature.TOP_PACKAGE_NAME);
		String codePackName = project.getPersistentProperty(Xml2Nature.CODE_PACKAGE_NAME);

		if (topPackName == null)
		{
			topPackName = Xml2Nature.DEFAULT_TOP_PACK;
		}
		if (codePackName == null)
		{
			codePackName = Xml2Nature.DEFAULT_CODE_PACK;
		}

		if (!topPackName.isEmpty() && !codePackName.isEmpty())
		{
			codePackName = topPackName + "." + codePackName;
		}
		else if (codePackName.isEmpty())
		{
			codePackName = topPackName;
		}

		return codePackName;
	}

	public static String getCorePackName(IProject project) throws CoreException
	{
		String topPackName = project.getPersistentProperty(Xml2Nature.TOP_PACKAGE_NAME);
		String corePackName = project.getPersistentProperty(Xml2Nature.CORE_PACKAGE_NAME);

		if (topPackName == null)
		{
			topPackName = Xml2Nature.DEFAULT_TOP_PACK;
		}
		if (corePackName == null)
		{
			corePackName = Xml2Nature.DEFAULT_CORE_PACK;
		}

		if (!topPackName.isEmpty() && !corePackName.isEmpty())
		{
			corePackName = topPackName + "." + corePackName;
		}
		else if (corePackName.isEmpty())
		{
			corePackName = topPackName;
		}

		return corePackName;
	}
}
