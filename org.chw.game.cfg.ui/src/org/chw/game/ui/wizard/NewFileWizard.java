package org.chw.game.ui.wizard;

import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.ide.IDE;

public class NewFileWizard extends Wizard implements INewWizard
{
	private IWorkbench workbench;
	private IContainer container;
	private NewFileWizardPage page1;
	
	public NewFileWizard()
	{
		setWindowTitle("xml2 нд╪Ч");
	}

	public void init(IWorkbench workbench, IStructuredSelection selection)
	{
		this.workbench=workbench;
		if(selection.getFirstElement() instanceof IResource)
		{
			IResource curr=(IResource)selection.getFirstElement();
			while(!(curr instanceof IFolder) && !(curr instanceof IProject))
			{
				curr=curr.getParent();
			}
			
			if(curr instanceof IFolder || curr instanceof IProject)
			{
				container=(IContainer)curr;
			}
		}
	}

	public IContainer getFolder()
	{
		return container;
	}
	
	@Override
	public void addPages()
	{
		page1=new NewFileWizardPage();
		
		addPage(page1);
	}

	@Override
	public boolean performFinish()
	{
		final String fileName=page1.getFileName()+(page1.getFileName().endsWith(".xml2") ? "":".xml2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		final IWorkbenchPage page=workbench.getActiveWorkbenchWindow().getActivePage();
		
		try
		{
			getContainer().run(false, false, new IRunnableWithProgress()
			{
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException
				{
					IFile file=container.getFile(new Path(fileName));
					if(!file.exists())
					{
						try
						{
							file.create(new ByteArrayInputStream(new byte[]{}), true, monitor);
							
							IDE.openEditor(page,file);
						}
						catch (CoreException e)
						{
							e.printStackTrace();
						}
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

}
