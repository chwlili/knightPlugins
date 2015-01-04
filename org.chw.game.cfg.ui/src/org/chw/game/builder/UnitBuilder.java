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
	private boolean filePackCheck;
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

		ArrayList<IFile> files = new ArrayList<IFile>();

		files.addAll(Arrays.asList(writeCodeFiles(folder, changed)));

		if (filePackCheck)
		{
			files.addAll(Arrays.asList(writeConfigFiles(folder, changed)));
		}

		return files.toArray(new IFile[] {});
	}

	/**
	 * 初始化包名
	 * 
	 * @throws CoreException
	 */
	private void initPackNames() throws CoreException
	{
		String corePackName = Xml2Nature.getCorePackName(project);
		String codePackName = Xml2Nature.getCodePackName(project);

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

		String filePath = classTable.getInputURL();
		if (filePath != null && classTable.getMainClass() != null)
		{
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
		}

		return writedFiles.toArray(new IFile[] {});
	}
}
