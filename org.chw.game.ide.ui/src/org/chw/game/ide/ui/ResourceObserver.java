package org.chw.game.ide.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import org.chw.game.ide.ui.internal.ProtoActivator;
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
	private static String PROPERTITY_FILE_NAME = ".protoProperties";

	public static final ResourceObserver instance = new ResourceObserver();

	/**
	 * 构建
	 * 
	 * @param project
	 */
	public void build(final IProject project)
	{
		WorkspaceJob incrementalJob = new WorkspaceJob("生成AS类文件")
		{
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException
			{
				try
				{
					monitor.beginTask("生成AS类文件", 1000);
					fullBuild(project, monitor);
					monitor.done();
				}
				catch (Exception e)
				{
					return new Status(IStatus.ERROR, ProtoActivator.ORG_CHW_GAME_IDE_PROTO + ".ui", e.getMessage(), e);
				}

				if (monitor.isCanceled())
				{
					return new Status(IStatus.CANCEL, ProtoActivator.ORG_CHW_GAME_IDE_PROTO + ".ui", "用户已取消!");
				}
				return new Status(IStatus.OK, ProtoActivator.ORG_CHW_GAME_IDE_PROTO + ".ui", "");
			}
		};
		incrementalJob.setName("生成AS类文件");
		incrementalJob.setUser(true);
		incrementalJob.setRule(ResourcesPlugin.getWorkspace().getRoot());
		incrementalJob.schedule();
	}

	/**
	 * 验证项目特性
	 * 
	 * @param project
	 * @return
	 */
	private boolean validateNature(IProject project)
	{
		try
		{
			return project.hasNature(ProtoNature.NATURE_ID);
		}
		catch (CoreException e)
		{
		}
		return false;
	}

	/**
	 * 处理资源改变
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

			// 跳过非项目资源
			IResource resource = delta.getResource();
			if (!(resource instanceof IProject))
			{
				continue;
			}

			// 跳过不感兴趣的项目
			IProject project = (IProject) resource;
			if (!validateNature(project))
			{
				continue;
			}

			// 确定项目中是否有xml2文件的变动
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
			WorkspaceJob incrementalJob = new WorkspaceJob("生成AS类文件")
			{
				@Override
				public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException
				{
					try
					{
						monitor.beginTask("生成AS类文件", 1000 * projects.size());
						for (IProject project : projects)
						{
							incrementBuild(project, project2Delta.get(project), monitor);
						}
						monitor.done();
					}
					catch (Exception e)
					{
						return new Status(IStatus.ERROR, ProtoActivator.ORG_CHW_GAME_IDE_PROTO + ".ui", e.getMessage(), e);
					}

					if (monitor.isCanceled())
					{
						return new Status(IStatus.CANCEL, ProtoActivator.ORG_CHW_GAME_IDE_PROTO + ".ui", "用户已取消!");
					}
					return new Status(IStatus.OK, ProtoActivator.ORG_CHW_GAME_IDE_PROTO + ".ui", "");
				}
			};
			incrementalJob.setName("生成AS类文件");
			incrementalJob.setUser(true);
			incrementalJob.setRule(ResourcesPlugin.getWorkspace().getRoot());
			incrementalJob.schedule();
		}
	}

	/**
	 * 增量构建
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

			// 确定增量修改
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

			// 合并所有输出的文件
			for (int i = 0; i < changedAndAddedFiles.size(); i++)
			{
				IFile file = changedAndAddedFiles.get(i);
				monitor.setTaskName("转换文件：" + file.getProjectRelativePath().toString());
				ClassTable types = getTypeDefs(file);
				UnitBuilder unit = new UnitBuilder(project, types);
				IFile[] writedFiles = unit.buildTo(srcFolder, true);

				for (IFile writedFile : writedFiles)
				{
					projectProp.add(file.getProjectRelativePath().toString(), writedFile.getProjectRelativePath().toString());
					writedFile.setPersistentProperty(ProtoNature.OUTPUT_AS_FLAG, "true");
				}

				monitor.worked(i / changedAndAddedFiles.size() * 700);
			}

			// 清除旧文件
			monitor.setTaskName("删除无效的输出文件");
			for (String url : projectProp.getBlankURLS())
			{
				IResource res = project.findMember(url);
				if (res instanceof IFile)
				{
					IFile file = (IFile) res;
					if (file.exists() && file.getPersistentProperty(ProtoNature.OUTPUT_AS_FLAG) != null)
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

			// 保存项目信息
			projectProp.save(project.getFile(PROPERTITY_FILE_NAME));
			monitor.worked(100);
		}
	}

	/**
	 * 完整构建
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

		// 删除所有已输出的as文件
		monitor.setTaskName("删除旧文件");
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

		// 找出所有的.xml2文件
		monitor.setTaskName("查找xml2文件");
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

		// 输出新文件
		for (int i = 0; i < cfgFiles.size(); i++)
		{
			IFile file = cfgFiles.get(i);
			monitor.setTaskName("转换文件：" + file.getProjectRelativePath().toString());
			ClassTable types = getTypeDefs(file);
			UnitBuilder unit = new UnitBuilder(project, types);
			IFile[] writedFiles = unit.buildTo(srcFolder, true);

			for (IFile writedFile : writedFiles)
			{
				projectProp.add(file.getProjectRelativePath().toString(), writedFile.getProjectRelativePath().toString());
				writedFile.setPersistentProperty(ProtoNature.OUTPUT_AS_FLAG, "true");
			}

			monitor.worked(i / cfgFiles.size() * 700);
		}

		// 保存项目信息
		projectProp.save(project.getFile(PROPERTITY_FILE_NAME));
		monitor.worked(100);
	}

	@Inject
	private XtextResourceFactory factory;

	/**
	 * 初始化所有类型
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
	 * 获取Src目录
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
