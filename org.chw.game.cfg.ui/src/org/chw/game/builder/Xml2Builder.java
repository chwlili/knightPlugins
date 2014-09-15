package org.chw.game.builder;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.zip.Deflater;

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
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
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
	 * 获取Src目录
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

	/**
	 * 清理
	 */
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
			fullBuild(monitor);
		}
		else
		{
			if (getDelta(getProject()) == null)
			{
				System.out.println("增量构建(完整构建)");
				fullBuild(monitor);
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
				incrementalBuild(monitor);
			}
		}
		return null;
	}

	/**
	 * 增量构建
	 * 
	 * @throws CoreException
	 * @throws IOException
	 */
	private void incrementalBuild(IProgressMonitor monitor) throws CoreException, IOException
	{
		String cfgDir = getProject().getPersistentProperty(Xml2Nature.CFG_DIR);
		String xmlDir = getProject().getPersistentProperty(Xml2Nature.XML_DIR);

		IFolder cfgFolder = getProject().getFolder(cfgDir);
		IFolder xmlFolder = getProject().getFolder(xmlDir);

		final HashMap<String, IFile> cfgDeltaMap = new HashMap<String, IFile>();
		final HashMap<String, IFile> xmlDeltaMap = new HashMap<String, IFile>();

		final String cfgFolderURL = cfgFolder.getProjectRelativePath().toString();
		final String xmlFolderURL = xmlFolder.getProjectRelativePath().toString();

		getDelta(getProject()).accept(new IResourceDeltaVisitor()
		{
			@Override
			public boolean visit(IResourceDelta delta) throws CoreException
			{
				IResource resource = delta.getResource();
				if (resource instanceof IFolder)
				{
					return true;
				}

				if (resource instanceof IFile)
				{
					IFile file = (IFile) resource;
					String fileURL = file.getProjectRelativePath().toString();
					if (fileURL.indexOf(cfgFolderURL) == 0 && file.getName().endsWith(".xml2"))
					{
						cfgDeltaMap.put(fileURL.substring(cfgFolderURL.length()), file);
					}
					else if (fileURL.indexOf(xmlFolderURL) == 0 && file.getName().endsWith(".xml"))
					{
						xmlDeltaMap.put(fileURL.substring(xmlFolderURL.length()), file);
					}
				}
				return false;
			}
		});

		//
		HashMap<IFile, TypeDef[]> allTypes = getAllTypeDef();

		// 生成自定义类型
		String topPackName = getProject().getPersistentProperty(Xml2Nature.TOP_PACKAGE_NAME);
		String corePackName = getProject().getPersistentProperty(Xml2Nature.CORE_PACKAGE_NAME);
		String codePackName = getProject().getPersistentProperty(Xml2Nature.CODE_PACKAGE_NAME);
		String filePackName = getProject().getPersistentProperty(Xml2Nature.FILE_PACKAGE_NAME);
		for (TypeDef[] types : allTypes.values())
		{
			AsFileWriter writer = new AsFileWriter(getSrcFolder(), topPackName, corePackName, codePackName, types);
			writer.writeAllType();
		}
	}

	/**
	 * 完整构建
	 * 
	 * @throws CoreException
	 */
	private void fullBuild(IProgressMonitor monitor) throws CoreException
	{
		monitor.beginTask("<构建项目>", 100);

		try
		{
			removeALL(new SubProgressMonitor(monitor, 50));
			generateAll(new SubProgressMonitor(monitor, 50));
		}
		finally
		{
			monitor.done();
		}
	}

	/**
	 * 删除所有
	 * 
	 * @param monitor
	 * @throws CoreException
	 */
	private void removeALL(IProgressMonitor monitor) throws CoreException
	{
		try
		{
			ArrayList<IFile> deleteableList = new ArrayList<IFile>();
			ArrayList<IFolder> folderList = new ArrayList<IFolder>();

			IFolder folder = getSrcFolder();
			if (folder != null && folder.exists())
			{
				ArrayList<IFolder> folders = new ArrayList<IFolder>();
				folders.add(folder);
				while (folders.size() > 0)
				{
					IFolder currFolder = folders.remove(0);
					for (IResource resource : currFolder.members())
					{
						if (resource instanceof IFile)
						{
							IFile file = (IFile) resource;
							if (file.isDerived())
							{
								deleteableList.add(file);
							}
						}
						else if (resource instanceof IFolder)
						{
							folders.add((IFolder) resource);
							folderList.add((IFolder) resource);
						}
					}
				}
			}

			monitor = new SubProgressMonitor(monitor, deleteableList.size() + 1);
			for (IFile file : deleteableList)
			{
				file.delete(true, null);
				monitor.worked(1);
			}

			while (folderList.size() > 0)
			{
				IFolder currFolder = folderList.remove(folderList.size() - 1);
				if (currFolder.members().length == 0)
				{
					currFolder.delete(true, null);
				}
			}
			monitor.worked(1);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		monitor.done();
	}

	/**
	 * 生成所有
	 * 
	 * @param monitor
	 * @throws CoreException
	 */
	private void generateAll(IProgressMonitor monitor) throws CoreException
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
					String packName = "";
					if (xml2.getPack() != null)
					{
						packName = xml2.getPack().getPack();
					}

					for (Type type : xml2.getTypes())
					{
						String typeComm = type.getComment();
						String typeName = type.getName();
						String inputPath = "";
						String xpath = "";

						Input input = type.getInput();
						if (input != null)
						{
							inputPath = input.getFilePath();
							xpath = input.getNodePath();
						}

						TypeDef typeDef = new TypeDef(inputPath, xpath, packName, typeName, typeComm);
						allTypes.add(typeDef);
						if (inputPath != null && inputPath.isEmpty() == false)
						{
							mainTypes.add(typeDef);
						}

						for (Field field : type.getFields())
						{
							String fieldName = field.getFieldName();
							String fieldComm = field.getComment();
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

				// 排序所有类型列表
				TypeDef[] allTypeArray = allTypes.toArray(new TypeDef[] {});
				Arrays.sort(allTypeArray, new Comparator<TypeDef>()
				{
					@Override
					public int compare(TypeDef o1, TypeDef o2)
					{
						return o1.getName().compareTo(o2.getName());
					}
				});

				// 生成自定义类型
				String topPackName = getProject().getPersistentProperty(Xml2Nature.TOP_PACKAGE_NAME);
				String corePackName = getProject().getPersistentProperty(Xml2Nature.CORE_PACKAGE_NAME);
				String codePackName = getProject().getPersistentProperty(Xml2Nature.CODE_PACKAGE_NAME);
				String filePackName = getProject().getPersistentProperty(Xml2Nature.FILE_PACKAGE_NAME);
				AsFileWriter writer = new AsFileWriter(getSrcFolder(), topPackName, corePackName, codePackName, allTypeArray);
				writer.writeAllType();

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
						Instance instance = FileDef.build(file.getContents(), allTypeArray, type);
						if (instance != null)
						{
							toCfgFile(instance, writer, filePackName, file.getName());
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

	private void toCfgFile(Instance instance, AsFileWriter writer, String filePackName, String fileName) throws CoreException
	{
		try
		{
			CfgFileWriter cfgWriter = new CfgFileWriter(instance, writer);
			byte[] bytes = cfgWriter.toBytes();

			IFolder folder = getSrcFolder();

			if (filePackName == null)
			{
				filePackName = "";
			}

			String[] segments = filePackName.split("\\\\|/");
			for (String segment : segments)
			{
				if (!segment.isEmpty())
				{
					folder = folder.getFolder(segment);
					if (!folder.exists())
					{
						folder.create(true, true, null);
					}
				}
			}

			int index = fileName.indexOf(".");
			if (index != -1)
			{
				fileName = fileName.substring(0, index);
			}
			fileName = fileName + ".cfg";

			IFile file = folder.getFile(fileName);
			if (!file.exists())
			{
				file.create(new ByteArrayInputStream(bytes), true, null);
			}
			else
			{
				file.setContents(new ByteArrayInputStream(bytes), IFile.FORCE, null);
			}
			file.setDerived(true, null);

			bytes = compress(bytes);
			fileName = fileName + "2";
			file = folder.getFile(fileName);
			if (!file.exists())
			{
				file.create(new ByteArrayInputStream(bytes), true, null);
			}
			else
			{
				file.setContents(new ByteArrayInputStream(bytes), IFile.FORCE, null);
			}
			file.setDerived(true, null);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * 压缩
	 * 
	 * @param data
	 *            待压缩数据
	 * @return byte[] 压缩后的数据
	 */
	private static byte[] compress(byte[] data)
	{
		byte[] output = new byte[0];

		Deflater compresser = new Deflater();

		compresser.reset();
		compresser.setInput(data);
		compresser.finish();
		ByteArrayOutputStream bos = new ByteArrayOutputStream(data.length);

		try
		{
			byte[] buf = new byte[1024];
			while (!compresser.finished())
			{
				int i = compresser.deflate(buf);
				bos.write(buf, 0, i);
			}
			output = bos.toByteArray();
		}
		catch (Exception e)
		{
			output = data;
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bos.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		compresser.end();
		return output;
	}

	/**
	 * 解析有的类型定义
	 * 
	 * @return
	 * @throws CoreException
	 * @throws IOException
	 */
	private HashMap<IFile, TypeDef[]> getAllTypeDef() throws CoreException, IOException
	{
		HashMap<IFile, TypeDef[]> file2types = new HashMap<IFile, TypeDef[]>();

		final String cfgDir = getProject().getPersistentProperty(Xml2Nature.CFG_DIR);

		final ArrayList<IFile> cfgFiles = new ArrayList<IFile>();

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

		// 列举所有xml2文件，并尝试寻找对应的xml文件，如果找到则进行转换。
		for (IFile cfgFile : cfgFiles)
		{
			ArrayList<TypeDef> allTypes = new ArrayList<TypeDef>();

			URI emfURI = URI.createPlatformResourceURI(cfgFile.getFullPath().toString(), true);
			Resource emfFile = factory.createResource(emfURI);
			emfFile.load(cfgFile.getContents(), null);

			XML2 xml2 = (XML2) emfFile.getContents().get(0);
			if (xml2 != null)
			{
				String packName = "";
				if (xml2.getPack() != null && xml2.getPack().getPack() != null)
				{
					packName = xml2.getPack().getPack();
				}

				for (Type type : xml2.getTypes())
				{
					String typeComm = type.getComment();
					String typeName = type.getName();
					String inputPath = "";
					String xpath = "";

					Input input = type.getInput();
					if (input != null)
					{
						inputPath = input.getFilePath();
						xpath = input.getNodePath();
					}

					TypeDef typeDef = new TypeDef(inputPath, xpath, packName, typeName, typeComm);
					allTypes.add(typeDef);

					for (Field field : type.getFields())
					{
						String fieldName = field.getFieldName();
						String fieldComm = field.getComment();
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

			// 排序所有类型列表
			TypeDef[] allTypeArray = allTypes.toArray(new TypeDef[] {});
			Arrays.sort(allTypeArray, new Comparator<TypeDef>()
			{
				@Override
				public int compare(TypeDef o1, TypeDef o2)
				{
					return o1.getName().compareTo(o2.getName());
				}
			});

			file2types.put(cfgFile, allTypeArray);
		}

		return file2types;
	}

}
