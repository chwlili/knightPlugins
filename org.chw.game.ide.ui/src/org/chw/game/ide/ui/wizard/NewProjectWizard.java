package org.chw.game.ide.ui.wizard;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class NewProjectWizard extends Wizard implements INewWizard
{
	private NewProjectWizardPage page1;

	public NewProjectWizard()
	{
	}

	public void init(IWorkbench workbench, IStructuredSelection selection)
	{
	}

	@Override
	public void addPages()
	{
		setWindowTitle("Proto 项目");
		setNeedsProgressMonitor(true);
		page1 = new NewProjectWizardPage();

		addPage(page1);
	}

	@Override
	public boolean performFinish()
	{
		final String name = page1.getProjectName();
		final String path = page1.getProjectPath();
		final String source=page1.getSourcePath();
		final String code=page1.getCodePath();
		final String bin=page1.getBinPath();

		try
		{
			getContainer().run(true, false, new IRunnableWithProgress()
			{
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException
				{
					monitor.beginTask("", 6000); //$NON-NLS-1$
					
					IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
					try
					{
						IProjectDescription desc = ResourcesPlugin.getWorkspace().newProjectDescription(name);
						
						//desc.setNatureIds(new String[] { XtextProjectHelper.NATURE_ID });
						desc.setNatureIds(new String[]{"org.chw.game.ide.ui.ProtoNature","com.adobe.flexbuilder.project.aslibnature","com.adobe.flexbuilder.project.actionscriptnature"});
						
						ICommand cmd=desc.newCommand();
						//cmd.setBuilderName(XtextProjectHelper.BUILDER_ID);
						cmd.setBuilderName("org.chw.game.ide.ui.ProtoBuilder");
						ICommand cmd1=desc.newCommand();
						cmd1.setBuilderName("com.adobe.flexbuilder.project.flexbuilder");
						desc.setBuildSpec(new ICommand[]{cmd,cmd1});
						
						if (path != null)
						{
							desc.setLocation(new Path(path));
						}
						
						project.create(desc, new SubProgressMonitor(monitor, 1000));
						
						writeFile(project.getFile(".flexLibProperties").getLocation().toFile(),getFlexLibProperties(name,code,bin));
						writeFile(project.getFile(".actionScriptProperties").getLocation().toFile(),getActionScriptProperties(name, code, bin));
						//project.getFolder("src").getLocation().toFile().mkdir();
						//project.getFolder("bin").getLocation().toFile().mkdir();
						//project.getFolder("protocol").getLocation().toFile().mkdir();
						
						project.open(new SubProgressMonitor(monitor, 1000));
						
						IFolder srcDir=project.getFolder(code);
						srcDir.refreshLocal(IResource.DEPTH_ZERO, null);
						if(!srcDir.exists())
						{
							srcDir.create(false, true, new SubProgressMonitor(monitor, 1000));
						}
						
						IFolder binDir=project.getFolder(bin);
						binDir.refreshLocal(IResource.DEPTH_ZERO, null);
						if(!binDir.exists())
						{
							binDir.create(false, true, new SubProgressMonitor(monitor, 1000));
						}
						
						File outputFile = new File(source);
						if (outputFile.exists() && outputFile.isDirectory())
						{
							IFolder folder = project.getFolder(/*"[source path] " + */outputFile.getName());
							folder.createLink(new Path(outputFile.getPath()), IResource.REPLACE | IResource.BACKGROUND_REFRESH, null);
						}
						else
						{
							IFolder folder = project.getFolder(source);
							folder.refreshLocal(IResource.DEPTH_ZERO, null);
							if (!folder.exists())
							{
								folder.create(true, true, null);
							}
						}
						
						project.setDefaultCharset("UTF-8", new SubProgressMonitor(monitor, 1000)); //$NON-NLS-1$
					}
					catch (CoreException e)
					{
						e.printStackTrace();
					}
					finally
					{
						monitor.done();
					}
				}
			});
		}
		catch (InvocationTargetException e)
		{
			e.printStackTrace();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}

		return true;
	}
	
	private byte[] getFlexLibProperties(String projectName,String srcName,String binName)
	{
		StringBuilder content=new StringBuilder();
		content.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n");
		content.append("<flexLibProperties includeAllClasses=\"true\" useMultiPlatformConfig=\"false\" version=\"3\">\n");
		content.append("\t<includeClasses/>\n");
		content.append("\t<includeResources/>\n");
		content.append("\t<namespaceManifests/>\n");
		content.append("</flexLibProperties>\n");
		
		try
		{
			return content.toString().getBytes("UTF-8");
		}
		catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
		
		return new byte[]{};
	}
	
	private byte[] getActionScriptProperties(String projectName,String srcName,String binName)
	{
		StringBuilder content=new StringBuilder();
		content.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n");
		content.append("<actionScriptProperties analytics=\"false\" mainApplicationPath=\""+projectName+".as\" projectUUID=\""+UUID.randomUUID().toString()+"\" version=\"11\">\n");
		content.append("\t<compiler additionalCompilerArguments=\"-locale en_US\" autoRSLOrdering=\"true\" copyDependentFiles=\"false\" fteInMXComponents=\"false\" generateAccessible=\"false\" htmlExpressInstall=\"true\" htmlGenerate=\"false\" htmlHistoryManagement=\"false\" htmlPlayerVersionCheck=\"true\" includeNetmonSwc=\"false\" outputFolderPath=\""+binName+"\" removeUnusedRSL=\"true\" sourceFolderPath=\""+srcName+"\" strict=\"true\" targetPlayerVersion=\"0.0.0\" useApolloConfig=\"false\" useDebugRSLSwfs=\"true\" useFlashSDK=\"true\" verifyDigests=\"true\" warn=\"true\">\n");
		content.append("\t\t<compilerSourcePath/>\n");
		content.append("\t\t<libraryPath defaultLinkType=\"0\">\n");
		content.append("\t\t\t<libraryPathEntry kind=\"4\" path=\"\">\n");
		content.append("\t\t\t\t<excludedEntries>\n");
		content.append("\t\t\t\t</excludedEntries>\n");
		content.append("\t\t\t</libraryPathEntry>\n");
		content.append("\t\t</libraryPath>\n");
		content.append("\t\t<sourceAttachmentPath/>\n");
		content.append("\t</compiler>\n");
		content.append("\t<applications>\n");
		content.append("\t\t<application path=\""+projectName+".as\"/>\n");
		content.append("\t</applications>\n");
		content.append("\t<modules/>\n");
		content.append("\t<workers/>\n");
		content.append("\t<buildCSSFiles/>\n");
		content.append("\t<flashCatalyst validateFlashCatalystCompatibility=\"false\"/>\n");
		content.append("</actionScriptProperties>\n");

		try
		{
			return content.toString().getBytes("UTF-8");
		}
		catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
		
		return new byte[]{};
	}
	
	/**
	 * 写入文件
	 * @param input
	 * @param dest
	 */
	public void writeFile(File dest,byte[] bytes)
	{
		InputStream input=new ByteArrayInputStream(bytes);
		
		try
		{
			if (!dest.getParentFile().exists())
			{
				dest.getParentFile().mkdirs();
			}

			// 新建文件输入流并对它进行缓冲
			BufferedInputStream inBuff = new BufferedInputStream(input);

			// 新建文件输出流并对它进行缓冲
			FileOutputStream output = new FileOutputStream(dest);
			BufferedOutputStream outBuff = new BufferedOutputStream(output);

			// 缓冲数组
			byte[] b = new byte[1024 * 5];
			int len;
			while ((len = inBuff.read(b)) != -1)
			{
				outBuff.write(b, 0, len);
			}
			outBuff.flush();

			inBuff.close();
			outBuff.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
