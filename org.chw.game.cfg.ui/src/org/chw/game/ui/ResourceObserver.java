package org.chw.game.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import org.chw.game.builder.ClassTable;
import org.chw.game.builder.UnitBuilder;
import org.chw.game.builder.Xml2Nature;
import org.chw.game.cfg.XML2;
import org.chw.game.ui.internal.CfgActivator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceFactory;

import com.google.inject.Inject;

public class ResourceObserver implements IResourceChangeListener
{
	private static String PROPERTITY_FILE_NAME = ".xml2Properties";

	public static final ResourceObserver instance = new ResourceObserver();

	/**
	 * ����
	 * 
	 * @param project
	 */
	public void build(final IProject project)
	{
		WorkspaceJob incrementalJob = new WorkspaceJob("����AS���ļ�")
		{
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException
			{
				try
				{
					monitor.beginTask("����AS���ļ�", 1000);
					fullBuild(project, monitor);
					monitor.done();
				}
				catch (Exception e)
				{
					return new Status(IStatus.ERROR, CfgActivator.ORG_CHW_GAME_CFG + ".ui", e.getMessage(), e);
				}

				if (monitor.isCanceled())
				{
					return new Status(IStatus.CANCEL, CfgActivator.ORG_CHW_GAME_CFG + ".ui", "�û���ȡ��!");
				}
				return new Status(IStatus.OK, CfgActivator.ORG_CHW_GAME_CFG + ".ui", "");
			}
		};
		incrementalJob.setName("����AS���ļ�");
		incrementalJob.setUser(true);
		incrementalJob.setRule(ResourcesPlugin.getWorkspace().getRoot());
		incrementalJob.schedule();
	}

	/**
	 * ��֤��Ŀ����
	 * 
	 * @param project
	 * @return
	 */
	private boolean validateNature(IProject project)
	{
		try
		{
			return project.hasNature(Xml2Nature.NATURE_ID);
		}
		catch (CoreException e)
		{
		}
		return false;
	}

	/**
	 * ������Դ�ı�
	 */
	@Override
	public void resourceChanged(IResourceChangeEvent event)
	{
		if (event.getDelta() == null)
		{
			return;
		}

		final ArrayList<IProject> projects = new ArrayList<IProject>();
		final HashMap<IProject, IResourceDelta> project2Delta = new HashMap<IProject, IResourceDelta>();

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

			// ����������Ȥ����Ŀ
			IProject project = (IProject) resource;
			if (!validateNature(project))
			{
				continue;
			}

			// ȷ����Ŀ���Ƿ���xml2�ļ��ı䶯
			ArrayList<IResourceDelta> folders = new ArrayList<IResourceDelta>();
			folders.add(delta);
			while (folders.size() > 0)
			{
				IResourceDelta item = folders.remove(0);
				IResourceDelta[] children = item.getAffectedChildren();
				for (IResourceDelta child : children)
				{
					IResource file = child.getResource();
					if (file.getType() == IResource.FOLDER || file.getType() == IResource.PROJECT)
					{
						folders.add(child);
					}
					else if (file.getType() == IResource.FILE && file.getName().endsWith(".xml2"))
					{
						projects.add(project);
						project2Delta.put(project, delta);

						folders.clear();
						break;
					}
				}
			}
		}

		if (projects.size() > 0)
		{
			WorkspaceJob incrementalJob = new WorkspaceJob("����AS���ļ�")
			{
				@Override
				public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException
				{
					try
					{
						monitor.beginTask("����AS���ļ�", 1000 * projects.size());
						for (IProject project : projects)
						{
							incrementBuild(project, project2Delta.get(project), monitor);
						}
						monitor.done();
					}
					catch (Exception e)
					{
						return new Status(IStatus.ERROR, CfgActivator.ORG_CHW_GAME_CFG + ".ui", e.getMessage(), e);
					}

					if (monitor.isCanceled())
					{
						return new Status(IStatus.CANCEL, CfgActivator.ORG_CHW_GAME_CFG + ".ui", "�û���ȡ��!");
					}
					return new Status(IStatus.OK, CfgActivator.ORG_CHW_GAME_CFG + ".ui", "");
				}
			};
			incrementalJob.setName("����AS���ļ�");
			incrementalJob.setUser(true);
			incrementalJob.setRule(ResourcesPlugin.getWorkspace().getRoot());
			incrementalJob.schedule();
		}
	}

	/**
	 * ��������
	 * 
	 * @param project
	 * @param delta
	 * @param monitor
	 * @throws Exception
	 * @throws
	 */
	private void incrementBuild(IProject project, IResourceDelta delta, IProgressMonitor monitor) throws Exception
	{
		final ResourcePropertity projectProp = new ResourcePropertity();

		projectProp.open(project.getFile(PROPERTITY_FILE_NAME));
		if (projectProp.getAllURLs().length == 0)
		{
			fullBuild(project, monitor);
		}
		else
		{
			final IFolder srcFolder = getSrcFolder(project);

			final ArrayList<IFile> changedAndAddedFiles = new ArrayList<IFile>();

			// ȷ�������޸�
			ArrayList<IResourceDelta> list = new ArrayList<IResourceDelta>();
			list.add(delta);
			while (list.size() > 0)
			{
				IResourceDelta item = list.remove(0);

				IResourceDelta[] children = item.getAffectedChildren();
				for (IResourceDelta child : children)
				{
					IResource file = child.getResource();
					if (file.getType() == IResource.FOLDER || file.getType() == IResource.PROJECT)
					{
						list.add(child);
					}
					else if (file.getType() == IResource.FILE)
					{
						if (file.getName().endsWith(".xml2"))
						{
							projectProp.remove(file.getProjectRelativePath().toString());
							if (child.getKind() == IResourceDelta.ADDED)
							{
								changedAndAddedFiles.add((IFile) file);
							}
							else if (child.getKind() == IResourceDelta.REMOVED)
							{
								// ..
							}
							else if (child.getKind() == IResourceDelta.CHANGED)
							{
								changedAndAddedFiles.add((IFile) file);
							}
						}
					}
				}
			}
			monitor.worked(100);

			// �ϲ�����������ļ�
			for (int i = 0; i < changedAndAddedFiles.size(); i++)
			{
				IFile file = changedAndAddedFiles.get(i);
				monitor.setTaskName("ת���ļ���" + file.getProjectRelativePath().toString());
				ClassTable types = getTypeDefs(file);
				UnitBuilder unit = new UnitBuilder(project, types);
				IFile[] writedFiles = unit.buildTo(srcFolder, true);

				for (IFile writedFile : writedFiles)
				{
					projectProp.add(file.getProjectRelativePath().toString(), writedFile.getProjectRelativePath().toString());
					writedFile.setPersistentProperty(Xml2Nature.OUTPUT_AS_FLAG, "true");
				}

				monitor.worked(i / changedAndAddedFiles.size() * 700);
			}

			// ������ļ�
			monitor.setTaskName("ɾ����Ч������ļ�");
			for (String url : projectProp.getBlankURLS())
			{
				IResource res = project.findMember(url);
				if (res instanceof IFile)
				{
					IFile file = (IFile) res;
					if (file.exists() && file.getPersistentProperty(Xml2Nature.OUTPUT_AS_FLAG) != null)
					{
						file.delete(true, monitor);
					}

					IFolder folder = (IFolder) file.getParent();
					while (folder != null && folder.exists() && folder.getParent() != project && folder.members().length == 0)
					{
						IFolder parent = (IFolder) folder.getParent();
						folder.delete(true, monitor);
						folder = parent;
					}
				}
			}
			monitor.worked(100);

			// ������Ŀ��Ϣ
			projectProp.save(project.getFile(PROPERTITY_FILE_NAME));
			monitor.worked(100);
		}
	}

	/**
	 * ��������
	 * 
	 * @param project
	 * @param monitor
	 * @throws Exception
	 */
	private void fullBuild(IProject project, IProgressMonitor monitor) throws Exception
	{
		final IFolder cfgFolder = (IFolder) project.findMember(project.getPersistentProperty(Xml2Nature.CFG_DIR));
		final IFolder srcFolder = getSrcFolder(project);

		final ArrayList<IFile> oldFiles = new ArrayList<IFile>();
		final ArrayList<IFile> cfgFiles = new ArrayList<IFile>();

		ResourcePropertity projectProp = new ResourcePropertity();

		// ɾ�������������as�ļ�
		monitor.setTaskName("ɾ�����ļ�");
		srcFolder.accept(new IResourceVisitor()
		{
			public boolean visit(IResource resource) throws CoreException
			{
				if (resource instanceof IFile)
				{
					IFile file = (IFile) resource;
					if (file.getName().endsWith(".as") && file.getPersistentProperty(Xml2Nature.OUTPUT_AS_FLAG) != null)
					{
						oldFiles.add(file);
					}
					return false;
				}
				return true;
			}
		});
		for (IFile file : oldFiles)
		{
			file.delete(true, monitor);
		}
		for (IFile file : oldFiles)
		{
			IFolder folder = (IFolder) file.getParent();
			while (folder != null && folder.exists() && folder.getParent() != project && folder.members().length == 0)
			{
				IFolder parent = (IFolder) folder.getParent();
				folder.delete(true, monitor);
				folder = parent;
			}
		}
		monitor.worked(100);

		// �ҳ����е�.xml2�ļ�
		monitor.setTaskName("����xml2�ļ�");
		cfgFolder.accept(new IResourceVisitor()
		{
			public boolean visit(IResource resource) throws CoreException
			{
				if (resource instanceof IFile)
				{
					IFile file = (IFile) resource;
					if (file.getName().endsWith(".xml2"))
					{
						cfgFiles.add(file);
					}
					return false;
				}
				return true;
			}
		});
		monitor.worked(100);

		// ������ļ�
		for (int i = 0; i < cfgFiles.size(); i++)
		{
			IFile file = cfgFiles.get(i);
			monitor.setTaskName("ת���ļ���" + file.getProjectRelativePath().toString());
			ClassTable types = getTypeDefs(file);
			UnitBuilder unit = new UnitBuilder(project, types);
			IFile[] writedFiles = unit.buildTo(srcFolder, true);

			for (IFile writedFile : writedFiles)
			{
				projectProp.add(file.getProjectRelativePath().toString(), writedFile.getProjectRelativePath().toString());
				writedFile.setPersistentProperty(Xml2Nature.OUTPUT_AS_FLAG, "true");
			}

			monitor.worked(i / cfgFiles.size() * 700);
		}

		// ������Ŀ��Ϣ
		projectProp.save(project.getFile(PROPERTITY_FILE_NAME));
		monitor.worked(100);
	}

	@Inject
	private XtextResourceFactory factory;

	/**
	 * ��ʼ����������
	 */
	private ClassTable getTypeDefs(IFile file) throws IOException, CoreException
	{
		if (factory == null)
		{
			CfgActivator.getInstance().getInjector(CfgActivator.ORG_CHW_GAME_CFG).injectMembers(this);
		}
		Resource emfFile = factory.createResource(URI.createPlatformResourceURI(file.getFullPath().toString(), true));
		emfFile.load(file.getContents(), null);

		return new ClassTable((XML2) emfFile.getContents().get(0));
	}

	/**
	 * ��ȡSrcĿ¼
	 * 
	 * @return
	 * @throws CoreException
	 * @throws IOException
	 */
	private IFolder getSrcFolder(IProject project) throws CoreException, IOException
	{
		IFile file = project.getFile(".actionScriptProperties");
		if (file.exists())
		{
			StringBuilder sb = new StringBuilder();
			BufferedReader reader = new BufferedReader(new InputStreamReader(file.getContents()));
			while (true)
			{
				String line = reader.readLine();
				if (line == null)
				{
					break;
				}
				else
				{
					sb.append(line + "\n");
				}
			}

			String content = sb.toString();
			int propIndex = content.indexOf("sourceFolderPath");
			if (propIndex != -1)
			{
				int beginIndex = content.indexOf("\"", propIndex);
				if (beginIndex != -1)
				{
					int endIndex = content.indexOf("\"", beginIndex + 1);
					if (endIndex != -1)
					{
						return project.getFolder(content.substring(beginIndex + 1, endIndex));
					}
				}
			}
		}
		return project.getFolder("src");
	}
}
