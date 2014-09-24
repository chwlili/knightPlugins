package org.chw.game.inject.inject.project;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Hashtable;

import org.chw.game.inject.Activator;
import org.chw.game.inject.inject.data.Element;
import org.chw.game.inject.inject.data.EnumType;
import org.chw.game.inject.inject.data.InterfaceType;
import org.chw.game.inject.inject.data.ModuleType;
import org.chw.game.inject.inject.data.NoticeType;
import org.chw.game.inject.inject.data.Package;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;

import com.adobe.flash.compiler.tree.as.IFileNode;
import com.adobe.flexbuilder.codemodel.common.CMFactory;
import com.adobe.flexbuilder.project.FlexProjectManager;
import com.adobe.flexide.editorcore.loadservice.CMLoadServiceProvider;

public class Project
{
	private static final String ModuleProviderFileName = "ModuleProvider";

	private boolean opened;
	private IProject project;

	private HashSet<String> addedFiles = new HashSet<String>();
	private HashSet<String> changedFiles = new HashSet<String>();
	private HashSet<String> deledFiles = new HashSet<String>();

	private WorkspaceJob fullBuildJob;
	private WorkspaceJob incrementalJob;

	private Hashtable<String, ModuleType> modules = new Hashtable<String, ModuleType>();
	private Hashtable<String, NoticeType> notices = new Hashtable<String, NoticeType>();
	private Hashtable<String, InterfaceType> interfaces = new Hashtable<String, InterfaceType>();
	private Hashtable<String, EnumType> enums = new Hashtable<String, EnumType>();

	private ArrayList<Package> packages = new ArrayList<Package>();
	private boolean packageChanged = true;

	private ArrayList<ProjectListener> listeners = new ArrayList<ProjectListener>();

	/**
	 * 构造函数
	 * 
	 * @param project
	 */
	public Project(IProject project)
	{
		this.project = project;
	}

	/**
	 * 获取包列表
	 * 
	 * @return
	 */
	public ArrayList<Package> getPackages()
	{
		rebuildTree();
		return packages;
	}

	public void addListener(ProjectListener listener)
	{
		if (!listeners.contains(listener))
		{
			listeners.add(listener);
		}
	}

	public void removeListener(ProjectListener listener)
	{
		if (listeners.contains(listener))
		{
			listeners.remove(listener);
		}
	}

	private void fireProjectChanged()
	{
		packageChanged = true;
		for (ProjectListener listener : listeners)
		{
			listener.onProjectChanged();
		}
	}

	/**
	 * 是否是一个注入项目
	 * 
	 * @return
	 */
	private boolean isInjectProject()
	{
		try
		{
			if (project.hasNature(ProjectNature.NATURE_ID))
			{
				return true;
			}
		}
		catch (CoreException e)
		{
			Activator.writeError(e);
		}

		return false;
	}

	/**
	 * 生成树
	 */
	private void rebuildTree()
	{
		/*
		if (isInjectProject() == false || packageChanged == false)
		{
			return;
		}

		if (!opened)
		{
			if (fullBuildJob != null)
			{
				return;
			}

			if (readCache())
			{
				opened = true;
			}
			else
			{
				fullBuild();
				return;
			}
		}
		 */
		
		if (!opened)
		{
			if (readCache())
			{
				opened = true;
			}
		}
		
		Hashtable<String, Package> oldPacks = new Hashtable<String, Package>();
		Hashtable<String, Package> newPacks = new Hashtable<String, Package>();

		ArrayList<Element> freeElements = new ArrayList<Element>();

		for (Package pack : packages)
		{
			oldPacks.put(pack.getPackName(), pack);
		}
		packages.clear();

		for (ModuleType module : modules.values())
		{
			String packName = module.getPackName();

			Package pack = null;
			if (newPacks.containsKey(packName))
			{
				pack = newPacks.get(packName);
			}
			else if (oldPacks.containsKey(packName))
			{
				pack = oldPacks.get(packName);
				oldPacks.remove(packName);
				newPacks.put(packName, pack);
			}
			else
			{
				pack = new Package(packName);
				newPacks.put(packName, pack);
			}

			pack.getModules().clear();
			pack.getElements().clear();
		}

		for (ModuleType element : modules.values())
		{
			newPacks.get(element.getPackName()).getModules().add(element);
		}

		for (NoticeType element : notices.values())
		{
			if (!appendToPack(element, newPacks))
			{
				freeElements.add(element);
			}
		}
		for (InterfaceType element : interfaces.values())
		{
			if (!appendToPack(element, newPacks))
			{
				freeElements.add(element);
			}
		}
		for (EnumType element : enums.values())
		{
			if (!appendToPack(element, newPacks))
			{
				freeElements.add(element);
			}
		}

		if (freeElements.size() > 0)
		{
			String packName = "";

			Package pack = null;
			if (newPacks.containsKey(packName))
			{
				pack = newPacks.get(packName);
			}
			else if (oldPacks.containsKey(packName))
			{
				pack = oldPacks.get(packName);
				oldPacks.remove(packName);
				newPacks.put(packName, pack);
			}
			else
			{
				pack = new Package(packName);
				newPacks.put(packName, pack);
			}

			pack.getModules().clear();
			pack.getElements().clear();

			for (Element element : freeElements)
			{
				if (element instanceof ModuleType)
				{
					pack.getModules().add((ModuleType) element);
				}
				else
				{
					pack.getElements().add(element);
				}
			}
		}

		for (Package pack : newPacks.values())
		{
			packages.add(pack);
		}

		Collections.sort(packages, new Comparator<Package>()
		{
			@Override
			public int compare(Package a, Package b)
			{
				return a.getPackName().compareTo(b.getPackName());
			}
		});

		packageChanged = false;
	}

	private Boolean appendToPack(Element notice, Hashtable<String, Package> packs)
	{
		String packName = notice.getPackName();

		int depths = 0;
		boolean finded = false;
		while (true)
		{
			if (packs.containsKey(packName))
			{
				packs.get(packName).getElements().add(notice);
				finded = true;
				break;
			}

			depths++;
			if (depths > 1)
			{
				break;
			}

			int index = packName.lastIndexOf(".");
			if (index != -1)
			{
				packName = packName.substring(0, index);
			}
			else
			{
				break;
			}
		}

		if (!finded)
		{
			return false;
		}

		return true;
	}

	/**
	 * 关闭
	 */
	public void close()
	{
		opened = false;
	}

	/**
	 * 完整构建
	 */
	public void fullBuild()
	{
		if (!isInjectProject())
		{
			return;
		}

		if (fullBuildJob == null)
		{
			// 加载项目
			if (CMFactory.getManager().getProjectFor(project) == null)
			{
				CMLoadServiceProvider.getLoadService().loadProject(project);
			}

			// 处理构建
			fullBuildJob = new WorkspaceJob("重建模块信息")
			{
				@Override
				public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException
				{
					try
					{
						fullBuild(monitor);

						packageChanged = true;
					}
					finally
					{
						fullBuildJob = null;
					}

					if (packageChanged)
					{
						fireProjectChanged();
					}

					if (monitor.isCanceled())
					{
						return new Status(IStatus.CANCEL, Activator.PLUGIN_ID, "用户已取消!");
					}
					return new Status(IStatus.OK, Activator.PLUGIN_ID, "");
				}
			};
			fullBuildJob.setName("重建模块信息");
			fullBuildJob.setUser(true);
			fullBuildJob.setRule(project);
			fullBuildJob.schedule();
		}
	}

	/**
	 * 增量构建
	 */
	public void incrementalBuild(IResourceDelta delta)
	{
		if (!isInjectProject())
		{
			return;
		}

		if (!opened)
		{
			if (fullBuildJob != null)
			{
				return;
			}

			if (readCache())
			{
				opened = true;
			}
			else
			{
				fullBuild();
				return;
			}
		}

		// 确定源路径列表
		HashSet<IContainer> sourcePathTable = new HashSet<IContainer>();
		IContainer[] sourcePathList = FlexProjectManager.getActionScriptOrFlexProject(project).getSourceContainers();
		for (IContainer sourcePath : sourcePathList)
		{
			sourcePathTable.add(sourcePath);
		}

		// 剔除输出路径
		try
		{
			sourcePathTable.remove(project.getFolder(project.getPersistentProperty(ProjectNature.OUTPUT_FOLDER_NAME)));
		}
		catch (CoreException e)
		{
			Activator.writeError(e);
		}

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
					if ((file.getParent() instanceof IProject) && !sourcePathTable.contains(file))
					{
						continue;
					}

					list.add(child);
				}
				else if (file.getType() == IResource.FILE)
				{
					if (file.getName().endsWith(".as"))
					{
						String path = file.getProjectRelativePath().toString();

						addedFiles.remove(path);
						changedFiles.remove(path);
						deledFiles.remove(path);

						if (child.getKind() == IResourceDelta.REMOVED)
						{
							deledFiles.add(path);
						}
						else if (child.getKind() == IResourceDelta.CHANGED)
						{
							changedFiles.add(path);
						}
						else if (child.getKind() == IResourceDelta.ADDED)
						{
							addedFiles.add(path);
						}
					}
				}
			}
		}

		if (incrementalJob == null)
		{
			// 加载项目
			if (CMFactory.getManager().getProjectFor(project) == null)
			{
				CMLoadServiceProvider.getLoadService().loadProject(project);
			}

			// 处理增量
			incrementalJob = new WorkspaceJob("检测新增模块信息")
			{

				@Override
				public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException
				{
					try
					{
						incrementalProject(monitor);
					}
					finally
					{
						incrementalJob = null;
					}

					if (monitor.isCanceled())
					{
						return new Status(IStatus.CANCEL, Activator.PLUGIN_ID, "用户已取消!");
					}
					return new Status(IStatus.OK, Activator.PLUGIN_ID, "");
				}
			};
			incrementalJob.setName("检测新增模块信息");
			incrementalJob.setUser(true);
			incrementalJob.setRule(project);
			incrementalJob.schedule();
		}
	}

	/**
	 * 读取缓存
	 */
	private Boolean readCache()
	{
		if (!isInjectProject())
		{
			return true;
		}

		// 剔除输出路径
		try
		{
			IFolder folder = project.getFolder(project.getPersistentProperty(ProjectNature.OUTPUT_FOLDER_NAME));
			folder.refreshLocal(IResource.DEPTH_ZERO, null);
			if (!folder.exists())
			{
				return false;
			}

			IFile file = folder.getFile(".cache");
			file.refreshLocal(IResource.DEPTH_ZERO, null);
			if (!file.exists())
			{
				return false;
			}

			String text = getFileContent(file);
			if (text == null || text.isEmpty())
			{
				return false;
			}

			modules = new Hashtable<String, ModuleType>();
			notices = new Hashtable<String, NoticeType>();
			interfaces=new Hashtable<String, InterfaceType>();
			enums=new Hashtable<String, EnumType>();

			String[] parts = text.split("\\n");
			for (String part : parts)
			{
				int index = part.indexOf(":");
				String kind = part.substring(0, index);
				String content = part.substring(index + 1);
				if (content.length() > 2)
				{
					content = content.substring(1, content.length() - 1);

					String theName = null;
					String packName = null;
					String typeName = null;
					String namespace = null;
					String path = null;

					String[] props = content.split("\\,");
					for (String prop : props)
					{
						int pos = prop.indexOf("=");
						if (pos != -1)
						{
							String name = prop.substring(0, pos).trim();
							String value = prop.substring(pos + 1).trim();

							if ("name".equals(name))
							{
								theName = value;
							}
							else if ("packName".equals(name))
							{
								packName = value;
							}
							else if ("typeName".equals(name))
							{
								typeName = value;
							}
							else if ("namespace".equals(name))
							{
								namespace = value;
							}
							else if ("path".equals(name))
							{
								path = value;
							}
						}
					}

					if ("Module".equals(kind))
					{
						modules.put(path, new ModuleType(theName, packName, typeName, namespace, path));
					}
					else if ("Notice".equals(kind))
					{
						notices.put(path, new NoticeType(theName, packName, typeName, path));
					}
					else if("Interface".equals(kind))
					{
						interfaces.put(path, new InterfaceType(theName, packName, typeName, path));
					}
					else if("Enum".equals(kind))
					{
						enums.put(path, new EnumType(theName, packName, typeName, path));
					}
				}
			}

			return true;
		}
		catch (CoreException e)
		{
			Activator.writeError(e);
		}
		catch (Exception e)
		{
			Activator.writeError(e);
		}

		return false;
	}

	/**
	 * 完整构建
	 * 
	 * @param monitor
	 * @throws CoreException
	 */
	private void fullBuild(IProgressMonitor monitor) throws CoreException
	{
		opened = false;

		monitor.beginTask("重建模块信息", 1011);

		addedFiles.clear();
		changedFiles.clear();
		deledFiles.clear();

		// 确定源路径列表
		HashSet<IContainer> sourcePathTable = new HashSet<IContainer>();
		IContainer[] sourcePathList = FlexProjectManager.getActionScriptOrFlexProject(project).getSourceContainers();
		for (IContainer sourcePath : sourcePathList)
		{
			sourcePathTable.add(sourcePath);
		}

		// 剔除输出路径
		try
		{
			sourcePathTable.remove(project.getFolder(project.getPersistentProperty(ProjectNature.OUTPUT_FOLDER_NAME)));
		}
		catch (CoreException e)
		{
			Activator.writeError(e);
		}

		ArrayList<IFile> files = new ArrayList<IFile>();

		// 查找文件
		SubProgressMonitor readMonitor = new SubProgressMonitor(monitor, 1);
		readMonitor.beginTask("查找文件", 1);
		ArrayList<IContainer> folders = new ArrayList<IContainer>();
		folders.add(project);
		while (folders.size() > 0)
		{
			IContainer container = folders.remove(0);
			IResource[] members = container.members();
			for (IResource member : members)
			{
				if (member.getType() == IResource.FOLDER || member.getType() == IResource.PROJECT)
				{
					if ((member.getParent() instanceof IProject) && !sourcePathTable.contains(member))
					{
						continue;
					}
					folders.add((IContainer) member);
				}
				else if (member.getType() == IResource.FILE)
				{
					if (member.getName().endsWith(".as"))
					{
						readMonitor.setTaskName("查找文件:" + member.getProjectRelativePath());
						files.add((IFile) member);
					}
				}

				if (readMonitor.isCanceled())
				{
					readMonitor.done();
					monitor.done();
					return;
				}
			}
		}
		readMonitor.worked(1);
		readMonitor.done();

		if (readMonitor.isCanceled())
		{
			return;
		}

		// 解析项目
		Hashtable<String, ModuleType> old_modules = modules;
		Hashtable<String, NoticeType> old_notices = notices;
		modules = new Hashtable<String, ModuleType>();
		notices = new Hashtable<String, NoticeType>();
		SubProgressMonitor parserMonitor = new SubProgressMonitor(monitor, 1000);
		parserMonitor.beginTask("解析项目", files.size());
		for (int i = 0; i < files.size(); i++)
		{
			IFile file = files.get(i);

			parserMonitor.setTaskName("解析文件:" + file.getProjectRelativePath());
			updateFile(file);
			parserMonitor.worked(1);

			if (parserMonitor.isCanceled())
			{
				modules = old_modules;
				notices = old_notices;

				parserMonitor.done();
				monitor.done();
				return;
			}
		}
		parserMonitor.done();

		// 生成输出文件
		SubProgressMonitor writeMonitor = new SubProgressMonitor(monitor, 10);
		writeMonitor.beginTask("生成文件", 1000);
		buildMetadataFiles(writeMonitor);
		writeMonitor.done();

		monitor.done();

		opened = true;
	}

	/**
	 * 增量构建
	 */
	private void incrementalProject(IProgressMonitor monitor) throws CoreException
	{
		monitor.beginTask("<增量构建>", 2000);

		// 处理文件变化
		SubProgressMonitor parserMonitor = new SubProgressMonitor(monitor, 1000);
		parserMonitor.beginTask("处理文件改变", addedFiles.size() + changedFiles.size() + deledFiles.size());
		for (String path : addedFiles)
		{
			parserMonitor.setTaskName("处理添加的文件:" + path);
			onFileAdded(path);
			parserMonitor.worked(1);
		}
		for (String path : changedFiles)
		{
			parserMonitor.setTaskName("处理改变的文件:" + path);
			onFileChanged(path);
			parserMonitor.worked(1);
		}
		for (String path : deledFiles)
		{
			parserMonitor.setTaskName("处理删除的文件:" + path);
			onFileRemoved(path);
			parserMonitor.worked(1);
		}
		parserMonitor.done();

		addedFiles.clear();
		changedFiles.clear();
		deledFiles.clear();

		// 生成输出文件
		SubProgressMonitor writeMonitor = new SubProgressMonitor(monitor, 1000);
		buildMetadataFiles(writeMonitor);
		writeMonitor.done();

		monitor.done();

		if (packageChanged)
		{
			fireProjectChanged();
		}
	}

	/**
	 * 处理文件添加
	 * 
	 * @param file
	 */
	private void onFileAdded(String path)
	{
		updateFile(project.getFile(new Path(path)));

		System.out.println(" add :" + path);
	}

	/**
	 * 处理文件删除
	 * 
	 * @param file
	 */
	private void onFileRemoved(String path)
	{
		modules.remove(path);
		notices.remove(path);
		packageChanged = true;

		System.out.println(" remove :" + path);
	}

	/**
	 * 处理文件改变
	 * 
	 * @param file
	 */
	private void onFileChanged(String path)
	{
		updateFile(project.getFile(new Path(path)));

		System.out.println(" change :" + path);
	}
	
	/**
	 * 更新文件
	 * 
	 * @param file
	 */
	private void updateFile(IResource file)
	{
		if (CMFactory.getManager().getProjectFor(file.getProject()) != null)
		{
			IFileNode node = CMFactory.getManager().getProjectFor(file.getProject()).findFileNodeInProject(file.getLocation());

			if (node != null)
			{
				FileParser parser = new FileParser();
				parser.parser(file, node);

				String filePath = file.getProjectRelativePath().toString();

				try
				{
					ModuleType module = parser.getModule();
					if (module != null)
					{
						if (modules.get(filePath) != null && modules.get(filePath).isEquals(module))
						{
							file.setPersistentProperty(ProjectNature.MODULE_FILE, "1");
						}
						else
						{
							modules.put(filePath, module);
							file.setPersistentProperty(ProjectNature.MODULE_FILE, "1");
							packageChanged = true;
						}
					}
					else
					{
						if (modules.containsKey(filePath))
						{
							modules.remove(filePath);
							file.setPersistentProperty(ProjectNature.MODULE_FILE, null);
							packageChanged = true;
						}
					}

					NoticeType notice = parser.getNotice();
					if (notice != null)
					{
						if (notices.get(filePath) != null && notices.get(filePath).isEquals(notice))
						{
							file.setPersistentProperty(ProjectNature.NOTICE_FILE, "1");
						}
						else
						{
							notices.put(filePath, notice);
							file.setPersistentProperty(ProjectNature.NOTICE_FILE, "1");
							packageChanged = true;
						}
					}
					else
					{
						if (notices.containsKey(filePath))
						{
							notices.remove(filePath);
							file.setPersistentProperty(ProjectNature.NOTICE_FILE, null);
							packageChanged = true;
						}
					}

					InterfaceType inter = parser.getInterface();
					if (inter != null)
					{
						if (interfaces.get(filePath) != null && interfaces.get(filePath).isEquals(inter))
						{
							file.setPersistentProperty(ProjectNature.INTERFACE_FILE, "1");
						}
						else
						{
							interfaces.put(filePath, inter);
							file.setPersistentProperty(ProjectNature.INTERFACE_FILE, "1");
							packageChanged = true;
						}
					}
					else
					{
						if (interfaces.containsKey(filePath))
						{
							interfaces.remove(filePath);
							file.setPersistentProperty(ProjectNature.INTERFACE_FILE, null);
							packageChanged = true;
						}
					}

					EnumType enumType = parser.getEnum();
					if (enumType != null)
					{
						if (enums.get(filePath) != null && enums.get(filePath).isEquals(enumType))
						{
							file.setPersistentProperty(ProjectNature.ENUM_FILE, "1");
						}
						else
						{
							enums.put(filePath, enumType);
							file.setPersistentProperty(ProjectNature.ENUM_FILE, "1");
							packageChanged = true;
						}
					}
					else
					{
						if (enums.containsKey(filePath))
						{
							enums.remove(filePath);
							file.setPersistentProperty(ProjectNature.ENUM_FILE, null);
							packageChanged = true;
						}
					}
				}
				catch (CoreException e)
				{
					Activator.writeError(e);
				}
			}
			else
			{
				Activator.writeError("无法获取AS文件节点：" + file.getLocation());
			}
		}
		else
		{
			Activator.writeError("无法获取AS文件项目：" + file.getLocation());
		}
	}

	/**
	 * 写入元数据文件
	 * 
	 * @throws CoreException
	 */
	private void buildMetadataFiles(IProgressMonitor monitor) throws CoreException
	{
		HashSet<String> outputedFiles = new HashSet<String>();

		String[] modulePaths = modules.keySet().toArray(new String[modules.size()]);
		String[] noticePaths = notices.keySet().toArray(new String[notices.size()]);
		String[] interfacePaths = interfaces.keySet().toArray(new String[interfaces.size()]);
		String[] enumPaths = enums.keySet().toArray(new String[enums.size()]);

		// 计算文件数量
		int count = 3;
		for (String modulePath : modulePaths)
		{
			ModuleType module = modules.get(modulePath);
			if (module.getTypeNamespace().equals("internal"))
			{
				count++;
			}
		}

		// 开始输出文件
		monitor.beginTask("生成文件", count);

		// 排序
		Arrays.sort(modulePaths);
		Arrays.sort(noticePaths);
		Arrays.sort(interfacePaths);
		Arrays.sort(enumPaths);

		// 输出内部模块
		Hashtable<ModuleType, ModuleType> moduleAdapters = new Hashtable<ModuleType, ModuleType>();
		for (String modulePath : modulePaths)
		{
			ModuleType module = modules.get(modulePath);
			if (module.getTypeNamespace().equals("internal"))
			{
				monitor.setTaskName("输出文件:" + module.getTypeQName());

				ModuleType adapter = new ModuleType("", module.getPackName(), "_" + module.getTypeName() + "Creator", "public", "");

				moduleAdapters.put(module, adapter);

				StringBuilder content = new StringBuilder();
				content.append(String.format("package %s\n", adapter.getPackName()));
				content.append(String.format("{\n"));
				content.append(String.format("\tpublic class %s extends %s\n", adapter.getTypeName(), module.getTypeName()));
				content.append(String.format("\t{\n"));
				content.append(String.format("\t}\n"));
				content.append(String.format("}"));

				String filePath = adapter.getTypeQName().replaceAll("\\.", "/") + ".as";
				writeFile(filePath, content.toString());
				outputedFiles.add(filePath);

				monitor.worked(1);
			}
		}

		// 输出模块工厂
		monitor.setTaskName("输出工厂文件");
		HashSet<String> funNames = new HashSet<String>();
		StringBuilder factoryContent = new StringBuilder();
		factoryContent.append(String.format("package\n"));
		factoryContent.append(String.format("{\n"));
		for (String modulePath : modulePaths)
		{
			ModuleType module = modules.get(modulePath);
			if (moduleAdapters.containsKey(module))
			{
				module = moduleAdapters.get(module);
			}
			factoryContent.append("\timport " + module.getTypeQName() + ";\n");
		}
		factoryContent.append("\t\n");
		factoryContent.append(String.format("\tpublic class %s\n", ModuleProviderFileName));
		factoryContent.append(String.format("\t{\n"));
		for (String modulePath : modulePaths)
		{
			ModuleType module = modules.get(modulePath);
			if (moduleAdapters.containsKey(module))
			{
				module = moduleAdapters.get(module);
			}

			int funNameIndex = 1;
			String funName = module.getTypeName();
			while (funNames.contains(funName))
			{
				funName = module.getTypeName() + "_" + funNameIndex;
				funNameIndex++;
			}
			funNames.add(funName);

			factoryContent.append("\t\tpublic function new" + funName + "():" + module.getTypeQName() + "\n");
			factoryContent.append("\t\t{\n");
			factoryContent.append("\t\t\t return new " + module.getTypeQName() + "();\n");
			factoryContent.append("\t\t}\n");
			factoryContent.append("\t\t\n");
		}
		factoryContent.append(String.format("\t}\n"));
		factoryContent.append(String.format("}"));

		String filePath = ModuleProviderFileName + ".as";
		writeFile(filePath, factoryContent.toString());
		outputedFiles.add(filePath);

		monitor.worked(1);

		// 输出缓存文件
		monitor.setTaskName("输出缓存文件");
		StringBuilder cacheContent = new StringBuilder();
		for (String modulePath : modulePaths)
		{
			ModuleType module = modules.get(modulePath);
			cacheContent.append(String.format("Module:{name=%s,packName=%s,typeName=%s,namespace=%s,path=%s}\n", module.getName(), module.getPackName(), module.getTypeName(), module.getTypeNamespace(), modulePath));
		}
		for (String noticePath : noticePaths)
		{
			NoticeType notice = notices.get(noticePath);
			cacheContent.append(String.format("Notice:{name=%s,packName=%s,typeName=%s,path=%s}\n", notice.getName(), notice.getPackName(), notice.getTypeName(), noticePath));
		}
		for (String path : interfacePaths)
		{
			InterfaceType type = interfaces.get(path);
			cacheContent.append(String.format("Interface:{name=%s,packName=%s,typeName=%s,path=%s}\n", type.getName(), type.getPackName(), type.getTypeName(), path));
		}
		for (String path : enumPaths)
		{
			EnumType type = enums.get(path);
			cacheContent.append(String.format("Enum:{name=%s,packName=%s,typeName=%s,path=%s}\n", type.getName(), type.getPackName(), type.getTypeName(), path));
		}

		String cachePath = ".cache";
		writeFile(cachePath, cacheContent.toString());
		outputedFiles.add(cachePath);

		monitor.worked(1);

		// 清理旧文件
		monitor.setTaskName("清理无效文件");
		String outputFolderName = project.getPersistentProperty(ProjectNature.OUTPUT_FOLDER_NAME);
		if (outputFolderName != null && !outputFolderName.isEmpty())
		{
			IFolder outputFolder = project.getFolder(outputFolderName);
			outputFolder.refreshLocal(IResource.DEPTH_ZERO, null);
			if (outputFolder.exists())
			{
				ArrayList<IResource> invalidateFiles = new ArrayList<IResource>();
				clear(outputFolder, outputFolderName, outputedFiles, invalidateFiles);
				for (IResource file : invalidateFiles)
				{
					System.out.println("删除:" + file.getProjectRelativePath());
					try
					{
						file.delete(false, monitor);
					}
					catch (Throwable err)
					{
						Activator.writeError(err);
					}
				}
			}
		}
		monitor.worked(1);

		monitor.done();
	}

	/**
	 * 清理目录
	 * 
	 * @param folder
	 * @param rootFolderName
	 * @param keepFiles
	 * @return
	 * @throws CoreException
	 */
	private int clear(IFolder folder, String rootFolderName, HashSet<String> keepFiles, ArrayList<IResource> invalidateFiles) throws CoreException
	{
		int count = 0;
		for (IResource member : folder.members())
		{
			if (member instanceof IFolder)
			{
				IFolder subFolder = (IFolder) member;
				int fileCount = clear(subFolder, rootFolderName, keepFiles, invalidateFiles);
				if (fileCount > 0)
				{
					count += fileCount;
				}
				else
				{
					invalidateFiles.add(subFolder);
				}
			}
			else if (member instanceof IFile)
			{
				IFile subFile = (IFile) member;
				String innerPath = subFile.getProjectRelativePath().toString().substring(rootFolderName.length() + 1);
				if (keepFiles.contains(innerPath))
				{
					count++;
				}
				else
				{
					invalidateFiles.add(subFile);
				}
			}
		}

		return count;
	}

	/**
	 * 写文件
	 * 
	 * @param classPath
	 * @param input
	 * @throws CoreException
	 */
	private void writeFile(String savePath, String content) throws CoreException
	{
		content = content.trim();

		// 获取输出目录
		String outputFolderName = project.getPersistentProperty(ProjectNature.OUTPUT_FOLDER_NAME);
		if (outputFolderName == null || outputFolderName.isEmpty())
		{
			return;
		}

		// 获取输出目录
		IFolder outputFolder = project.getFolder(outputFolderName);
		outputFolder.refreshLocal(IResource.DEPTH_ZERO, null);
		if (!outputFolder.exists())
		{
			return;
		}

		// 创建输出文件
		String[] parts = savePath.split("\\/");
		for (int i = 0; i < parts.length; i++)
		{
			if (i < parts.length - 1)
			{
				outputFolder = outputFolder.getFolder(parts[i]);
				outputFolder.refreshLocal(IResource.DEPTH_ZERO, null);

				if (!outputFolder.exists())
				{
					outputFolder.create(true, true, null);
				}
			}
			else
			{
				IFile outputFile = outputFolder.getFile(parts[i]);
				outputFile.refreshLocal(IResource.DEPTH_ZERO, null);

				if (outputFile.exists())
				{
					if (content.equals(getFileContent(outputFile)))
					{
						return;
					}
				}

				try
				{
					InputStream input = new ByteArrayInputStream(content.getBytes(outputFile.getCharset()));
					if (outputFile.exists())
					{
						outputFile.setContents(input, IResource.FORCE, null);
					}
					else
					{
						outputFile.create(input, true, null);
					}
					input.close();

					outputFile.setDerived(true, null);
				}
				catch (UnsupportedEncodingException e)
				{
					Activator.writeError(e);
				}
				catch (IOException e)
				{
					Activator.writeError(e);
				}
			}
		}
	}

	/**
	 * 获取文件内容
	 * 
	 * @param file
	 * @return
	 * @throws CoreException
	 * @throws IOException
	 */
	private String getFileContent(IFile file) throws CoreException
	{
		InputStream input = file.getContents();

		try
		{
			StringBuilder stream = new StringBuilder();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input, file.getCharset()));
			while (true)
			{
				String line = reader.readLine();
				if (line != null)
				{
					stream.append(line + "\n");
				}
				else
				{
					break;
				}
			}

			return stream.toString().trim();
		}
		catch (IOException e)
		{
			Activator.writeError(e);
		}

		return null;
	}
}
