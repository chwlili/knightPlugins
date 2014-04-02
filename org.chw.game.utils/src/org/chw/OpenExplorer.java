package org.chw;

import java.io.File;

import org.chw.util.CmdUtil;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;

public class OpenExplorer implements IObjectActionDelegate
{

	private Shell shell;

	/**
	 * Constructor for Action1.
	 */
	public OpenExplorer()
	{
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart)
	{
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action)
	{
		IResource file=null;
		
		ISelectionService selectionService = Activator.getDefault().getWorkbench().getActiveWorkbenchWindow().getSelectionService();    
	    
		ISelection selection = selectionService.getSelection();
		if(selection instanceof TreeSelection)
		{
			TreeSelection tree=(TreeSelection)selection;
			
			Object item=tree.getFirstElement();
			if(item instanceof IResource)
			{
				file=(IResource)item;
			}
			else if(item instanceof IAdaptable)
			{
				file=(IResource) ((IAdaptable)item).getAdapter(IResource.class);
			}
		}

		if(file!=null)
		{
			File nativeFile=new File(file.getLocation().toOSString());
			if(nativeFile!=null && nativeFile.exists())
			{
				if(nativeFile.isDirectory())
				{
					CmdUtil.openDir(nativeFile.getPath());
				}
				else
				{
					CmdUtil.openDirAndSelect(nativeFile.getPath());
				}
				return;
			}
		}
		MessageDialog.openInformation(shell, "", "无法在资源管理器中打开此元素");
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection)
	{
		
	}

}
