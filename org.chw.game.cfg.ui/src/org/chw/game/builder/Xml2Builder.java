package org.chw.game.builder;

import java.io.IOException;
import java.util.Map;

import org.chw.game.ui.internal.CfgActivator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
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
		System.out.println("����");
	}
	
	@Override
	protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor) throws CoreException
	{
		if(kind==IncrementalProjectBuilder.FULL_BUILD)
		{
			System.out.println("��������");
			fullBuild();
		}
		else
		{
			if(getDelta(getProject())==null)
			{
				System.out.println("��������(��������)");
				fullBuild();
			}
			else
			{
				if(kind==IncrementalProjectBuilder.INCREMENTAL_BUILD)
				{
					System.out.println("��������");
				}
				else if(kind==IncrementalProjectBuilder.AUTO_BUILD)
				{
					System.out.println("�Զ�����");
				}
				incrementalBuild();
			}
		}
		return null;
	}

	private void fullBuild()
	{
		URI uri=URI.createPlatformResourceURI(getProject().findMember("cfg-proto/at.xml2").getFullPath().toString());
		
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
		Object obj=res.getAllContents();
		
	}
	
	private void incrementalBuild()
	{
		
	}
}
