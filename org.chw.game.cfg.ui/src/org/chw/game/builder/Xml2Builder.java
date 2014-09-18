package org.chw.game.builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.chw.game.cfg.XML2;
import org.chw.game.ui.internal.CfgActivator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.xml.sax.SAXException;

import com.google.inject.Inject;

public class Xml2Builder extends IncrementalProjectBuilder
{
	@Inject
	private XtextResourceFactory factory;

	@Override
	protected void startupOnInitialize()
	{
		CfgActivator.getInstance().getInjector(CfgActivator.ORG_CHW_GAME_CFG).injectMembers(this);
	}

	/**
	 * ����
	 */
	@Override
	protected void clean(IProgressMonitor monitor) throws CoreException
	{
		System.out.println("����");
	}

	@Override
	protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor) throws CoreException
	{
		try
		{
			if (kind == IncrementalProjectBuilder.FULL_BUILD)
			{
				System.out.println("��������");
				fullBuild(monitor);
			}
			else
			{
				if (getDelta(getProject()) == null)
				{
					System.out.println("��������(��������)");
					fullBuild(monitor);
				}
				else
				{
					if (kind == IncrementalProjectBuilder.INCREMENTAL_BUILD)
					{
						System.out.println("��������");
					}
					else if (kind == IncrementalProjectBuilder.AUTO_BUILD)
					{
						System.out.println("�Զ�����");
					}

					incrementalBuild(monitor);
				}
			}
		}
		catch (IOException e)
		{
			throw new CoreException(new Status(IStatus.ERROR, CfgActivator.ORG_CHW_GAME_CFG + ".ui", 0, e.getMessage(), e));
		}
		catch (SAXException e)
		{
			throw new CoreException(new Status(IStatus.ERROR, CfgActivator.ORG_CHW_GAME_CFG + ".ui", 0, e.getMessage(), e));
		}
		catch (ParserConfigurationException e)
		{
			throw new CoreException(new Status(IStatus.ERROR, CfgActivator.ORG_CHW_GAME_CFG + ".ui", 0, e.getMessage(), e));
		}
		return null;
	}

	/**
	 * ��������
	 * 
	 * @throws CoreException
	 * @throws IOException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	private void incrementalBuild(IProgressMonitor monitor) throws CoreException, IOException, SAXException, ParserConfigurationException
	{
		monitor.beginTask("������Ŀ", 10);

		try
		{
			final IFolder srcFolder = getSrcFolder();
			final IFolder cfgFolder = getProject().getFolder(getProject().getPersistentProperty(Xml2Nature.CFG_DIR));
			final IFolder xmlFolder = getProject().getFolder(getProject().getPersistentProperty(Xml2Nature.XML_DIR));

			// �ҳ����иı��xml2��xml�ļ�
			monitor.setTaskName("ͳ�Ƹı���ļ�");
			final String cfgFolderURL = cfgFolder.getProjectRelativePath().toString();
			final String xmlFolderURL = xmlFolder.getProjectRelativePath().toString();
			final HashSet<IFile> changedCFG = new HashSet<IFile>();
			final HashSet<IFile> changedXML = new HashSet<IFile>();
			getDelta(getProject()).accept(new IResourceDeltaVisitor()
			{
				public boolean visit(IResourceDelta delta) throws CoreException
				{
					IResource resource = delta.getResource();
					if (resource instanceof IFile)
					{
						IFile file = (IFile) resource;
						String fileURL = file.getProjectRelativePath().toString();
						if (file.getName().endsWith(".xml2") && fileURL.indexOf(cfgFolderURL) == 0)
						{
							changedCFG.add(file);
						}
						else if (file.getName().endsWith(".xml") && fileURL.indexOf(xmlFolderURL) == 0)
						{
							changedXML.add(file);
						}
						return false;
					}
					return true;
				}
			});
			monitor.worked(1);

			// �ҳ����е�.xml2�ļ�
			monitor.setTaskName("��������xml2�ļ�");
			final ArrayList<IFile> cfgFiles = new ArrayList<IFile>();
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
			monitor.worked(1);

			// �����ļ�
			SubProgressMonitor buildMonitor = new SubProgressMonitor(monitor, 7);
			buildMonitor.beginTask("�����ļ�", cfgFiles.size());
			ArrayList<IFile> allWritedFiles = new ArrayList<IFile>();
			for (IFile file : cfgFiles)
			{
				boolean changed = changedCFG.contains(file);

				ClassTable types = getTypeDefs(file);
				if (!changed)
				{
					String inputURL = types.getInputURL();
					if (inputURL != null)
					{
						IResource resource = xmlFolder.findMember(inputURL);
						if (resource != null && (resource instanceof IFile) && changedXML.contains(resource))
						{
							changed = true;
						}
					}
				}

				UnitBuilder unit = new UnitBuilder(getProject(), types);
				IFile[] writedFiles = unit.buildTo(srcFolder, changed);
				allWritedFiles.addAll(Arrays.asList(writedFiles));

				buildMonitor.worked(1);
			}
			buildMonitor.done();

			// �����ļ�
			cleanProject(allWritedFiles.toArray(new IFile[] {}), new SubProgressMonitor(monitor, 1));
		}
		finally
		{
			monitor.done();
		}
	}

	/**
	 * ��������
	 * 
	 * @throws CoreException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	private void fullBuild(IProgressMonitor monitor) throws CoreException, IOException, SAXException, ParserConfigurationException
	{
		monitor.beginTask("<������Ŀ>", 10);

		try
		{
			final IFolder cfgFolder = (IFolder) getProject().findMember(getProject().getPersistentProperty(Xml2Nature.CFG_DIR));
			final IFolder srcFolder = getSrcFolder();

			final ArrayList<IFile> cfgFiles = new ArrayList<IFile>();
			final HashSet<IFile> allWritedFiles = new HashSet<IFile>();

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
			monitor.worked(1);

			// �ϲ�����������ļ�
			SubProgressMonitor buildMonitor = new SubProgressMonitor(monitor, 8);
			buildMonitor.beginTask("�����ļ�(" + cfgFiles.size() + ")", cfgFiles.size());
			for (IFile file : cfgFiles)
			{
				buildMonitor.setTaskName("�����ļ���" + file.getProjectRelativePath().toString());
				ClassTable types = getTypeDefs(file);
				UnitBuilder unit = new UnitBuilder(getProject(), types);
				IFile[] writedFiles = unit.buildTo(srcFolder, true);
				allWritedFiles.addAll(Arrays.asList(writedFiles));
				buildMonitor.worked(1);
			}
			buildMonitor.done();

			// �����Ч�ļ�
			cleanProject(allWritedFiles.toArray(new IFile[] {}), new SubProgressMonitor(monitor, 1));
		}
		finally
		{
			monitor.done();
		}
	}

	/**
	 * ������Ŀ
	 * 
	 * @param files
	 * @throws CoreException
	 * @throws IOException
	 */
	private void cleanProject(IFile[] writedFiles, IProgressMonitor monitor) throws CoreException, IOException
	{
		monitor.beginTask("������Ч�ļ�", 100);

		IFolder srcFolder = getSrcFolder();

		final HashSet<IFile> allWritedFiles = new HashSet<IFile>();
		final HashSet<IFile> deleteableFiles = new HashSet<IFile>();

		for (IFile file : writedFiles)
		{
			allWritedFiles.add(file);
		}

		// ������Ч���ļ�
		monitor.setTaskName("������Ч�ļ�");
		srcFolder.accept(new IResourceVisitor()
		{
			public boolean visit(IResource resource) throws CoreException
			{
				if (resource instanceof IFile)
				{
					IFile file = (IFile) resource;
					if (!allWritedFiles.contains(file) && file.isDerived())
					{
						deleteableFiles.add(file);
					}
					return false;
				}
				return true;
			}
		});
		monitor.worked(10);

		// ɾ����Ч�ļ�
		SubProgressMonitor removeMonitor = new SubProgressMonitor(monitor, 80);
		removeMonitor.beginTask("ɾ����Ч�ļ�(" + deleteableFiles.size() + ")", deleteableFiles.size());
		for (IFile deleteableFile : deleteableFiles)
		{
			removeMonitor.setTaskName("ɾ���ļ�:" + deleteableFile.getProjectRelativePath().toString());
			deleteableFile.delete(true, removeMonitor);
		}
		removeMonitor.done();

		// ɾ����Ŀ¼
		monitor.setTaskName("ɾ����Ŀ¼");
		ArrayList<IFolder> folders = new ArrayList<IFolder>();
		folders.add(srcFolder);
		for (int i = 0; i < folders.size(); i++)
		{
			IFolder folder = folders.get(i);
			for (IResource resource : folder.members())
			{
				if (resource instanceof IFolder)
				{
					folders.add((IFolder) resource);
				}
			}
		}
		while (folders.size() > 1)
		{
			IFolder folder = folders.remove(folders.size() - 1);
			if (folder.members().length == 0)
			{
				folder.delete(true, null);
			}
		}
		monitor.worked(10);

		monitor.done();
	}

	/**
	 * ��ʼ����������
	 */
	private ClassTable getTypeDefs(IFile file) throws IOException, CoreException
	{
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
	private IFolder getSrcFolder() throws CoreException, IOException
	{
		IFile file = getProject().getFile(".actionScriptProperties");
		if (file.exists())
		{
			StringBuilder sb = new StringBuilder();
			BufferedReader reader = new BufferedReader(new InputStreamReader(file.getContents()));
			while (true)
			{
				String line = reader.readLine();// +"\n";
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
						return getProject().getFolder(content.substring(beginIndex + 1, endIndex));
					}
				}
			}
		}
		return getProject().getFolder("src");
	}
}
