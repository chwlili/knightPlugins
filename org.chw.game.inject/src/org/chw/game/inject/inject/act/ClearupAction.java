package org.chw.game.inject.inject.act;

import org.chw.game.inject.Activator;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class ClearupAction implements IObjectActionDelegate, IExecutableExtension
{
	private ISelection selection;
	
	@Override
	public void run(IAction action)
	{
		if(selection instanceof StructuredSelection)
		{
			StructuredSelection curr=(StructuredSelection)selection;
			Object item=curr.getFirstElement();
			if(item instanceof IResource)
			{
				IResource file=(IResource)item;
				IProject project=file.getProject();
				
				Activator.getObserver().clearupProject(project);
			}
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection)
	{
		this.selection=selection;
	}

	@Override
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException
	{
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart)
	{
	}

}
