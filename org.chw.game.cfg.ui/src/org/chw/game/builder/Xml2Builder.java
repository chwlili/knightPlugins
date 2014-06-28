package org.chw.game.builder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceFactory;

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
		if(kind==IncrementalProjectBuilder.FULL_BUILD)
		{
			System.out.println("完整构建");
			fullBuild();
		}
		else
		{
			if(getDelta(getProject())==null)
			{
				System.out.println("增量构建(完整构建)");
				fullBuild();
			}
			else
			{
				if(kind==IncrementalProjectBuilder.INCREMENTAL_BUILD)
				{
					System.out.println("增量构建");
				}
				else if(kind==IncrementalProjectBuilder.AUTO_BUILD)
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
		String cfgDir=getProject().getPersistentProperty(Xml2Nature.CFG_DIR);
		String xmlDir=getProject().getPersistentProperty(Xml2Nature.XML_DIR);
		
		final ArrayList<IFile> cfgFiles=new ArrayList<IFile>();
		final ArrayList<IFile> xmlFiles=new ArrayList<IFile>();
		
		IFolder cfgFolder=(IFolder) getProject().findMember(cfgDir);
		cfgFolder.accept(new IResourceVisitor()
		{
			@Override
			public boolean visit(IResource resource) throws CoreException
			{
				if(resource instanceof IFile)
				{
					IFile file=(IFile)resource;
					if(file.getName().endsWith(".xml2"))
					{
						cfgFiles.add(file);
					}
					return false;
				}
				return true;
			}
		});
		
		IFolder xmlFolder=(IFolder) getProject().findMember(xmlDir);
		xmlFolder.accept(new IResourceVisitor()
		{
			@Override
			public boolean visit(IResource resource) throws CoreException
			{
				if(resource instanceof IFile)
				{
					IFile file=(IFile)resource;
					if(file.getName().endsWith(".xml2"))
					{
						xmlFiles.add(file);
					}
					return false;
				}
				return true;
			}
		});
		
		URI uri=URI.createPlatformResourceURI(getProject().findMember("cfg-proto/at.xml2").getFullPath().toString(),true);
		IFile file=(IFile) getProject().findMember("cfg-proto/at.xml2");
		
		Resource res=factory.createResource(uri);
		try
		{
			res.load(file.getContents() , null);
		}
		catch (IOException | CoreException e)
		{
			e.printStackTrace();
		}
		
		EList<EObject> list=res.getContents();
		
		XML2 xml2=(XML2)list.get(0);
		if(xml2!=null)
		{
			System.out.println(xml2.getTypes());
		}
	}
	
	private void incrementalBuild()
	{
		
	}
}
