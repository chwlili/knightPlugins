package org.chw.game.builder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.xml.sax.SAXException;

/**
 * 单元构建器
 * 
 * @author ds
 * 
 */
public class UnitBuilder
{
	private IProject project;
	private ClassTable classTable;

	private String corePack;
	private String currPack;
	private String filePack;

	private UnitCodeBuilder codeBuilder;
	private UnitConfigBuilder configBuilder;

	/**
	 * 构造函数
	 * 
	 * @param project
	 * @param folder
	 */
	public UnitBuilder(IProject project, ClassTable types)
	{
		this.project = project;
		this.classTable = types;
	}

	/**
	 * 构建
	 * 
	 * @param folder
	 * @throws CoreException
	 * @throws IOException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	public IFile[] buildTo(IFolder folder, boolean changed) throws IOException, CoreException, SAXException, ParserConfigurationException
	{
		initPackNames();

		IFile[] codeFiles = writeCodeFiles(folder, changed);
		IFile[] configFiles = writeConfigFiles(folder, changed);

		ArrayList<IFile> files = new ArrayList<IFile>();
		files.addAll(Arrays.asList(codeFiles));
		files.addAll(Arrays.asList(configFiles));

		return files.toArray(new IFile[] {});
	}

	/**
	 * 初始化包名
	 * 
	 * @throws CoreException
	 */
	private void initPackNames() throws CoreException
	{
		String topPackName = project.getPersistentProperty(Xml2Nature.TOP_PACKAGE_NAME);
		String corePackName = project.getPersistentProperty(Xml2Nature.CORE_PACKAGE_NAME);
		String codePackName = project.getPersistentProperty(Xml2Nature.CODE_PACKAGE_NAME);
		String filePackName = project.getPersistentProperty(Xml2Nature.FILE_PACKAGE_NAME);

		if (topPackName == null)
		{
			topPackName = Xml2Nature.DEFAULT_TOP_PACK;
		}
		if (corePackName == null)
		{
			corePackName = Xml2Nature.DEFAULT_CORE_PACK;
		}
		if (codePackName == null)
		{
			codePackName = Xml2Nature.DEFAULT_CODE_PACK;
		}
		if (filePackName == null)
		{
			filePackName = Xml2Nature.DEFAULT_FILE_PACK;
		}

		if (!topPackName.isEmpty() && !corePackName.isEmpty())
		{
			corePackName = topPackName + "." + corePackName;
		}
		else if (corePackName.isEmpty())
		{
			corePackName = topPackName;
		}

		if (!topPackName.isEmpty() && !codePackName.isEmpty())
		{
			codePackName = topPackName + "." + codePackName;
		}
		else if (codePackName.isEmpty())
		{
			codePackName = topPackName;
		}

		String typePackName = classTable.getPackName();
		if (typePackName == null)
		{
			typePackName = "";
		}
		if (!codePackName.isEmpty() && !typePackName.isEmpty())
		{
			codePackName = codePackName + "." + typePackName;
		}
		else if (codePackName.isEmpty())
		{
			codePackName = typePackName;
		}

		this.corePack = corePackName;
		this.currPack = codePackName;
		this.filePack = filePackName;
	}

	/**
	 * 输出代码文件
	 * 
	 * @param folder
	 * @throws CoreException
	 * @throws UnsupportedEncodingException
	 */
	private IFile[] writeCodeFiles(IFolder folder, boolean changed) throws CoreException, UnsupportedEncodingException
	{
		codeBuilder = new UnitCodeBuilder(classTable, corePack, currPack);
		codeBuilder.buildTo(folder);

		return codeBuilder.getWritedFiles();
	}

	/**
	 * 输出配置文件
	 * 
	 * @param folder
	 * @throws CoreException
	 * @throws SAXException
	 * @throws IOException
	 * @throws ParserConfigurationException
	 */
	private IFile[] writeConfigFiles(IFolder folder, boolean changed) throws CoreException, SAXException, IOException, ParserConfigurationException
	{
		ArrayList<IFile> writedFiles = new ArrayList<IFile>();

		IFolder xmlFolder = project.getFolder(project.getPersistentProperty(Xml2Nature.XML_DIR));

		for (Class type : classTable.getAllMainClass())
		{
			String filePath = type.filePath;
			String nodePath = type.xpath;

			if (nodePath.isEmpty())
			{
				nodePath = "/";
			}
			else if (nodePath.charAt(0) != '/')
			{
				nodePath = "/" + nodePath;
			}

			if (filePath.charAt(0) != '/')
			{
				filePath = "/" + filePath;
			}

			IResource resource = xmlFolder.findMember(filePath);
			if (resource != null && resource instanceof IFile)
			{
				IFile file = (IFile) resource;

				configBuilder = new UnitConfigBuilder(file, classTable);
				configBuilder.buildTo(folder, filePack, file.getName(), changed);

				for (IFile writedFile : configBuilder.getWritedFiles())
				{
					writedFiles.add(writedFile);
				}
			}
			else
			{
				//
			}

			break;
		}

		return writedFiles.toArray(new IFile[] {});
	}
}
