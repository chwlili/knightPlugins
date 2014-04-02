package org.chw.game.ide.ui.wizard;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class OpenExplorer implements IObjectActionDelegate
{
	private ISelection selection;

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
		
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection)
	{
		this.selection=selection;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action)
	{
		IResource file=null;
		
		if(selection instanceof StructuredSelection)
		{
			StructuredSelection tree=(StructuredSelection)selection;
			
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
					openDir(nativeFile.getPath());
				}
				else
				{
					openDirAndSelect(nativeFile.getPath());
				}
				return;
			}
		}
	}

	
	public static void openDir(String path)
	{
		if (path == null || path.isEmpty()) { return; }

		File file = new File(path);
		if (!file.exists() || !file.isDirectory()) { return; }

		try
		{
			Process p = Runtime.getRuntime().exec("cmd /c explorer " + file.getPath());
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream(), "GBK"));
			String msg = null;
			while ((msg = br.readLine()) != null)
			{
				System.out.println(msg);
			}

			BufferedReader errorOutput = new BufferedReader(new InputStreamReader(p.getErrorStream(), "GBK"));
			String error = null;
			while ((error = errorOutput.readLine()) != null)
			{
				System.out.println(error);
			}

			br.close();
			p.destroy();
		}
		catch (Exception err)
		{
			err.printStackTrace();
		}
	}

	public static void openDirAndSelect(String path)
	{
		if (path == null || path.isEmpty()) { return; }

		File file = new File(path);
		if (!file.exists()) { return; }

		try
		{
			Process p = Runtime.getRuntime().exec("cmd /c explorer /select," + file.getPath());
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream(), "GBK"));
			String msg = null;
			while ((msg = br.readLine()) != null)
			{
				System.out.println(msg);
			}

			BufferedReader errorOutput = new BufferedReader(new InputStreamReader(p.getErrorStream(), "GBK"));
			String error = null;
			while ((error = errorOutput.readLine()) != null)
			{
				System.out.println(error);
			}

			br.close();
			p.destroy();
		}
		catch (Exception err)
		{
			err.printStackTrace();
		}
	}
	
}
