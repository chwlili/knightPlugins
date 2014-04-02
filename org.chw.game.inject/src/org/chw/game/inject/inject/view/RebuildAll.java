package org.chw.game.inject.inject.view;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

public class RebuildAll implements IViewActionDelegate
{
	private ModuleView view;
	
	@Override
	public void run(IAction action)
	{
		view.openAllNode();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection)
	{
		
	}

	@Override
	public void init(IViewPart view)
	{
		if(view instanceof ModuleView)
		{
			this.view=(ModuleView)view;
		}
		else
		{
			this.view=null;
		}
	}
}
