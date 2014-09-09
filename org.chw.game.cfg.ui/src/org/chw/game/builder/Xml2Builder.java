package org.chw.game.builder;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.chw.game.cfg.Field;
import org.chw.game.cfg.HashType;
import org.chw.game.cfg.Input;
import org.chw.game.cfg.ListType;
import org.chw.game.cfg.NativeType;
import org.chw.game.cfg.Param;
import org.chw.game.cfg.Type;
import org.chw.game.cfg.XML2;
import org.chw.game.ui.internal.CfgActivator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
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

	@Override
	protected void clean(IProgressMonitor monitor) throws CoreException
	{
		System.out.println("清理");
	}

	@Override
	protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor) throws CoreException
	{
		if (kind == IncrementalProjectBuilder.FULL_BUILD)
		{
			System.out.println("完整构建");
			fullBuild();
		}
		else
		{
			if (getDelta(getProject()) == null)
			{
				System.out.println("增量构建(完整构建)");
				fullBuild();
			}
			else
			{
				if (kind == IncrementalProjectBuilder.INCREMENTAL_BUILD)
				{
					System.out.println("增量构建");
				}
				else if (kind == IncrementalProjectBuilder.AUTO_BUILD)
				{
					System.out.println("自动构建");
				}
				incrementalBuild();
			}
		}
		return null;
	}

	private void fullBuild() throws CoreException
	{
		final String cfgDir = getProject().getPersistentProperty(Xml2Nature.CFG_DIR);
		final String xmlDir = getProject().getPersistentProperty(Xml2Nature.XML_DIR);

		final ArrayList<IFile> cfgFiles = new ArrayList<IFile>();
		final Hashtable<String, IFile> xmlFiles = new Hashtable<String, IFile>();

		// 找出所有的.xml2文件
		IFolder cfgFolder = (IFolder) getProject().findMember(cfgDir);
		cfgFolder.accept(new IResourceVisitor()
		{
			@Override
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

		// 找出所有的.xml文件
		IFolder xmlFolder = (IFolder) getProject().findMember(xmlDir);
		xmlFolder.accept(new IResourceVisitor()
		{
			@Override
			public boolean visit(IResource resource) throws CoreException
			{
				if (resource instanceof IFile)
				{
					IFile file = (IFile) resource;
					if (file.getName().endsWith(".xml"))
					{
						String path = file.getProjectRelativePath().toString();
						while (path.charAt(0) == '/')
						{
							path = path.substring(1);
						}
						path = path.substring(xmlDir.length());

						xmlFiles.put(path, file);
					}
					return false;
				}
				return true;
			}
		});

		// 列举所有xml2文件，并尝试寻找对应的xml文件，如果找到则进行转换。
		for (IFile cfgFile : cfgFiles)
		{
			URI emfURI = URI.createPlatformResourceURI(cfgFile.getFullPath().toString(), true);
			Resource emfFile = factory.createResource(emfURI);
			try
			{
				emfFile.load(cfgFile.getContents(), null);

				ArrayList<TypeDef> allTypes = new ArrayList<TypeDef>();
				ArrayList<TypeDef> mainTypes = new ArrayList<TypeDef>();

				XML2 xml2 = (XML2) emfFile.getContents().get(0);
				if (xml2 != null)
				{
					for (Type type : xml2.getTypes())
					{
						String typeComm = type.getComm();
						String typeName = type.getName();
						String inputPath = "";
						String xpath = "";

						Input input = type.getInput();
						if (input != null)
						{
							inputPath = input.getFilePath();
							xpath = input.getNodePath();
						}

						TypeDef typeDef = new TypeDef(inputPath, xpath, typeName, typeComm);
						allTypes.add(typeDef);
						if (inputPath != null && inputPath.isEmpty() == false)
						{
							mainTypes.add(typeDef);
						}

						for (Field field : type.getFields())
						{
							String fieldName = field.getFieldName();
							String fieldComm = field.getComm();
							String fieldXPath = field.getNodePath();
							String fieldType = "";
							boolean fieldList = false;
							String[] indexList = null;

							if (field.getType() instanceof ListType)
							{
								ListType listType = (ListType) field.getType();
								fieldType = listType.getType();
								fieldList = true;
							}
							else if (field.getType() instanceof HashType)
							{
								HashType hashType = (HashType) field.getType();
								fieldType = hashType.getType();
								fieldList = true;

								ArrayList<String> indexKeys = new ArrayList<String>();
								for (Param param : hashType.getParams())
								{
									indexKeys.add(param.getParamName());
								}
								indexList = indexKeys.toArray(new String[indexKeys.size()]);
							}
							else if (field.getType() instanceof NativeType)
							{
								NativeType nativeType = (NativeType) field.getType();
								fieldType = nativeType.getType();
								fieldList = false;
							}

							if (fieldType != "")
							{
								typeDef.fields.add(new TypeFieldDef(fieldXPath, fieldName, fieldComm, fieldType, fieldList, indexList));
							}
						}
					}
				}

				for (TypeDef type : allTypes)
				{
					AsFileWriter.writeTypeClass(getProject(), xmlFolder, cfgFolder, type);
				}

				for (TypeDef type : mainTypes)
				{
					String filePath = type.getFilePath();
					String nodePath = type.getXPath();

					if (nodePath.isEmpty())
					{
						nodePath = "/";
					}
					else if (nodePath.charAt(0) != '/')
					{
						nodePath = "/" + nodePath;
					}

					if (filePath.isEmpty() == false && filePath.charAt(0) != '/')
					{
						filePath = "/" + filePath;
					}

					IFile file = xmlFiles.get(filePath);
					if (file != null)
					{
						Instance instance = FileDef.build(file.getContents(), allTypes.toArray(new TypeDef[allTypes.size()]), type);
						if (instance != null)
						{
							toCfgFile(instance);
						}
					}
					else
					{
						//
					}
				}
			}
			catch (IOException | CoreException e)
			{
				e.printStackTrace();
			}
			catch (SAXException e)
			{
				e.printStackTrace();
			}
			catch (ParserConfigurationException e)
			{
				e.printStackTrace();
			}
		}
	}

	private void incrementalBuild()
	{

	}

	private void toCfgFile(Instance instance) throws CoreException
	{
		System.out.println(">>" + instance);

		CfgFileWriter test = new CfgFileWriter(instance);
		// test.open(instance);
		try
		{
			byte[] bytes = test.toByteArray();
			IFolder folder = getProject().getFolder("src");
			IFile file = folder.getFile("test.cfg");

			if (!file.exists())
			{
				file.create(new ByteArrayInputStream(bytes), true, null);
			}
			else
			{
				file.setContents(new ByteArrayInputStream(bytes), IFile.FORCE, null);
			}

			AsFileWriter asWriter = new AsFileWriter(instance);
			// asWriter.go();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
