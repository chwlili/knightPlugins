package org.chw.game.builder;

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

		for (IFile cfgFile : cfgFiles)
		{
			URI emfURI = URI.createPlatformResourceURI(cfgFile.getFullPath().toString(), true);
			Resource emfFile = factory.createResource(emfURI);
			try
			{
				emfFile.load(cfgFile.getContents(), null);

				FileDef fileDef = new FileDef();
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
						fileDef.addTypeDef(typeDef);
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
							}
							else if (field.getType() instanceof NativeType)
							{
								NativeType nativeType = (NativeType) field.getType();
								fieldType = nativeType.getType();
								fieldList = false;
							}

							if (fieldType != "")
							{
								typeDef.fields.add(new TypeFieldDef(fieldXPath, fieldName, fieldComm, fieldType, fieldList));
							}
						}
					}
				}

				for (TypeDef type : mainTypes)
				{
					String filePath=type.getFilePath();
					String nodePath=type.getXPath();
					
					if(nodePath.isEmpty())
					{
						nodePath="/";
					}
					else if(nodePath.charAt(0)!='/')
					{
						nodePath="/"+nodePath;
					}
					
					if(filePath.isEmpty()==false && filePath.charAt(0)!='/')
					{
						filePath="/"+filePath;
					}
					
					IFile file=xmlFiles.get(filePath);
					if(file!=null)
					{
						Instance instance=fileDef.open(file.getContents(),type);
						if(instance!=null)
						{
							System.out.println(">>"+instance);
						}
					}
					else
					{
						
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
}
