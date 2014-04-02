package org.chw.game.inject.inject.act;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.chw.game.inject.Activator;
import org.chw.game.inject.inject.project.ProjectNature;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.adobe.flexbuilder.project.FlexProjectManager;
import com.adobe.flexbuilder.project.internal.FlexProjectCore;

public class ToggleNatureAction implements IObjectActionDelegate, IExecutableExtension
{
	private Shell shell;

	private int type;
	private ISelection selection;

	@Override
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException
	{
		type = 0;

		if (data instanceof String)
		{
			String flag = (String) data;

			if (flag.equals("1"))
			{
				type = 1;
			}
			else if (flag.equals("2"))
			{
				type = 2;
			}
		}
	}

	public void run(IAction action)
	{
		if (selection instanceof IStructuredSelection)
		{
			IStructuredSelection select = (IStructuredSelection) selection;
			if (select.getFirstElement() instanceof IProject)
			{
				IProject project = (IProject) select.getFirstElement();

				try
				{
					if (type == 1)
					{
						addNature(project);
					}
					else if (type == 2)
					{
						removeNature(project);
					}
					else
					{
						toggleNature(project);
					}
				}
				catch (CoreException e)
				{
					Activator.writeError(e);
				}
			}
		}
	}

	public void selectionChanged(IAction action, ISelection selection)
	{
		this.selection = selection;
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart)
	{
		shell = targetPart.getSite().getWorkbenchWindow().getShell();
	}

	/**
	 * 切换特性
	 * 
	 * @param project
	 * @throws CoreException
	 */
	private void toggleNature(IProject project) throws CoreException
	{
		if (project.hasNature(ProjectNature.NATURE_ID))
		{
			removeNature(project);
		}
		else
		{
			addNature(project);
		}
	}

	/**
	 * 添加特性
	 * 
	 * @param project
	 * @throws CoreException
	 */
	private void addNature(IProject project) throws CoreException
	{
		// 忽略有此特性的项目
		if (project.hasNature(ProjectNature.NATURE_ID))
		{
			return;
		}

		// 确定输出目录
		String outputFolderName = "src-output";
		String outputFolderPath = "src-output";

		ToggleNatureDialog dlg = new ToggleNatureDialog(shell);
		if (dlg.open() != 0)
		{
			return;
		}

		outputFolderName = dlg.getPath();
		outputFolderPath = dlg.getPath();

		File outputFile = new File(outputFolderName);
		if (outputFile.exists() && outputFile.isDirectory())
		{
			IFolder folder = project.getFolder("[source path] " + outputFile.getName());
			folder.createLink(new Path(outputFile.getPath()), IResource.REPLACE | IResource.BACKGROUND_REFRESH, null);

			outputFolderName = folder.getName();
		}
		else
		{
			IFolder folder = project.getFolder(outputFolderName);
			folder.refreshLocal(IResource.DEPTH_ZERO, null);
			if (!folder.exists())
			{
				folder.create(true, true, null);
			}
		}

		project.setPersistentProperty(ProjectNature.OUTPUT_FOLDER_NAME, outputFolderName);
		project.setPersistentProperty(ProjectNature.OUTPUT_FOLDER_PATH, outputFolderPath);

		// 添加特性
		IProjectDescription description = project.getDescription();

		String[] oldNatures = description.getNatureIds();
		String[] newNatures = new String[oldNatures.length + 1];

		for (int i = 0; i < oldNatures.length; i++)
		{
			newNatures[i] = oldNatures[i];
		}
		newNatures[newNatures.length - 1] = ProjectNature.NATURE_ID;

		description.setNatureIds(newNatures);
		project.setDescription(description, null);

		// 更新项目源目录
		try
		{
			IFile file = project.getFile(".actionScriptProperties");

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();

			Document document = builder.parse(file.getContents());

			Element linkSetNode = null;

			NodeList list = document.getElementsByTagName("compilerSourcePath");
			if (list.getLength() < 0)
			{
				linkSetNode = document.createElement("compilerSourcePath");
				document.appendChild(linkSetNode);
			}
			else
			{
				linkSetNode = (Element) list.item(0);
			}

			NodeList linkNodes = linkSetNode.getElementsByTagName("compilerSourcePathEntry");
			for (int i = 0; i < linkNodes.getLength(); i++)
			{
				Node linkNode = linkNodes.item(i);
				String pathValue = linkNode.getAttributes().getNamedItem("path").getTextContent();
				if (outputFolderPath.equals(pathValue))
				{
					return;
				}
			}

			Element outputNode = document.createElement("compilerSourcePathEntry");
			outputNode.setAttribute("kind", "1");
			outputNode.setAttribute("linkType", "1");
			outputNode.setAttribute("path", outputFolderPath);

			linkSetNode.appendChild(outputNode);

			ByteArrayOutputStream output = new ByteArrayOutputStream();
			Transformer transform = TransformerFactory.newInstance().newTransformer();
			transform.setOutputProperty(OutputKeys.ENCODING, "utf8");
			transform.setOutputProperty(OutputKeys.INDENT, "no");
			transform.transform(new DOMSource(document), new StreamResult(output));

			file.setContents(new ByteArrayInputStream(output.toByteArray()), true, true, null);
		}
		catch (Throwable e)
		{
			Activator.writeError(e);
		}
		
		FlexProjectCore.getDefault().getSourcePathLinkUpdater().updateSourcePathLinks(FlexProjectManager.getActionScriptOrFlexProject(project), null);
		
		Activator.getObserver().initalizeProject(project);
	}

	/**
	 * 删除特性
	 * 
	 * @param project
	 * @throws CoreException
	 */
	private void removeNature(IProject project) throws CoreException
	{
		// 忽略无此特性的项目
		if (!project.hasNature(ProjectNature.NATURE_ID))
		{
			return;
		}

		// 添加特性
		IProjectDescription description = project.getDescription();

		String[] oldNatures = description.getNatureIds();
		ArrayList<String> newNatures = new ArrayList<String>();

		for (int i = 0; i < oldNatures.length; ++i)
		{
			if (!ProjectNature.NATURE_ID.equals(oldNatures[i]))
			{
				newNatures.add(oldNatures[i]);
			}
		}

		description.setNatureIds(newNatures.toArray(new String[newNatures.size()]));
		project.setDescription(description, null);

		// 获取项目源目录
		String outputFolderName = project.getPersistentProperty(ProjectNature.OUTPUT_FOLDER_NAME);
		String outputFolderPath = project.getPersistentProperty(ProjectNature.OUTPUT_FOLDER_PATH);
		if (outputFolderName == null || outputFolderName.isEmpty() || outputFolderPath == null || outputFolderPath.isEmpty())
		{
			return;
		}
		
		// 删除项目源目录
		try
		{
			IFile file = project.getFile(".actionScriptProperties");

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();

			Document document = builder.parse(file.getContents());

			Element linkSetNode = null;

			NodeList list = document.getElementsByTagName("compilerSourcePath");
			if (list.getLength() < 0)
			{
				linkSetNode = document.createElement("compilerSourcePath");
				document.appendChild(linkSetNode);
			}
			else
			{
				linkSetNode = (Element) list.item(0);
			}

			boolean finded = false;
			NodeList linkNodes = linkSetNode.getElementsByTagName("compilerSourcePathEntry");
			for (int i = 0; i < linkNodes.getLength(); i++)
			{
				Node linkNode = linkNodes.item(i);
				Node attributeNode = linkNode.getAttributes().getNamedItem("path");
				if (attributeNode != null && outputFolderPath.equals(attributeNode.getTextContent()))
				{
					linkSetNode.removeChild(linkNode);
					finded = true;
					break;
				}
			}

			if (finded)
			{
				ByteArrayOutputStream output = new ByteArrayOutputStream();
				Transformer transform = TransformerFactory.newInstance().newTransformer();
				transform.setOutputProperty(OutputKeys.ENCODING, "utf8");
				transform.setOutputProperty(OutputKeys.INDENT, "yes");
				transform.transform(new DOMSource(document), new StreamResult(output));

				file.setContents(new ByteArrayInputStream(output.toByteArray()), true, true, null);
			}
		}
		catch (Throwable e)
		{
			Activator.writeError(e);
		}
	}
}
