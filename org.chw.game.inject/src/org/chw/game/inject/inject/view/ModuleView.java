package org.chw.game.inject.inject.view;

import org.chw.game.inject.Activator;
import org.chw.game.inject.inject.data.Element;
import org.chw.game.inject.inject.data.EnumType;
import org.chw.game.inject.inject.data.InterfaceType;
import org.chw.game.inject.inject.data.ModuleType;
import org.chw.game.inject.inject.data.NoticeType;
import org.chw.game.inject.inject.data.Package;
import org.chw.game.inject.inject.project.Project;
import org.chw.game.inject.inject.project.ProjectListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ViewPart;

public class ModuleView extends ViewPart implements ISelectionListener,ProjectListener
{
	private Tree tree;
	private TreeViewer treeViewer;

	private IProject project;

	public ModuleView()
	{
	}

	@Override
	public void createPartControl(Composite parent)
	{
		treeViewer = new TreeViewer(parent, SWT.BORDER);
		tree = treeViewer.getTree();
		tree.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetDefaultSelected(SelectionEvent e)
			{
				openEditor(e.item != null ? e.item.getData() : null);
			}
		});
		tree.setLinesVisible(true);
		tree.setHeaderVisible(true);

		TreeViewerColumn treeViewerColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnNewColumn = treeViewerColumn.getColumn();
		trclmnNewColumn.setText("\u540D\u79F0");
		trclmnNewColumn.setWidth(227);
		treeViewerColumn.setLabelProvider(new ColumnLabelProvider()
		{
			public Image getImage(Object element)
			{
				if (element instanceof Package)
				{
					Package data = (Package) element;
					if(data.getModules().size()==0)
					{
						return Activator.getDefault().getImage("warning.gif");
					}
					else if (data.getModules().size() == 1)
					{
						return Activator.getDefault().getImage("package.gif");
					}
					else
					{
						return Activator.getDefault().getImage("package.gif");
					}
				}
				if (element instanceof ModuleType)
				{
					return Activator.getDefault().getImage("moduleIcon2.gif");
				}
				else if (element instanceof NoticeType)
				{
					return Activator.getDefault().getImage("noticeIcon2.gif");
				}
				else if (element instanceof InterfaceType)
				{
					return Activator.getDefault().getImage("interfaceIcon2.gif");
				}
				else if(element instanceof EnumType)
				{
					return Activator.getDefault().getImage("enumIcon2.gif");
				}
				return null;
			}

			public String getText(Object element)
			{
				if (element instanceof Package)
				{
					Package data = (Package) element;
					if(data.getPackName().isEmpty())
					{
						return "其它";
					}
					else if (data.getModules().size() == 1)
					{
						return data.getModules().get(0).getName();
					}
					else
					{
						StringBuilder sb=new StringBuilder();
						for(ModuleType module:data.getModules())
						{
							if(sb.length()>0)
							{
								sb.append(",");
							}
							if(!module.getName().isEmpty())
							{
								sb.append(module.getName());
							}
						}
						return sb.toString();
					}
				}
				if (element instanceof Element)
				{
					return ((Element) element).getName();
				}
				return null;
			}
		});

		TreeViewerColumn treeViewerColumn_1 = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnNewColumn_1 = treeViewerColumn_1.getColumn();
		trclmnNewColumn_1.setWidth(100);
		trclmnNewColumn_1.setText("\u7C7B\u540D");
		treeViewerColumn_1.setLabelProvider(new ColumnLabelProvider()
		{
			public Image getImage(Object element)
			{
				return null;
			}

			public String getText(Object element)
			{
				if (element instanceof ModuleType)
				{
					return ((ModuleType) element).getTypeName();
				}
				else if (element instanceof NoticeType)
				{
					return ((NoticeType) element).getTypeName();
				}
				else if (element instanceof InterfaceType)
				{
					return ((InterfaceType) element).getTypeName();
				}
				return null;
			}
		});

		TreeViewerColumn treeViewerColumn_2 = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnNewColumn_2 = treeViewerColumn_2.getColumn();
		trclmnNewColumn_2.setWidth(100);
		trclmnNewColumn_2.setText("\u5305\u540D");
		treeViewerColumn_2.setLabelProvider(new ColumnLabelProvider()
		{
			public Image getImage(Object element)
			{
				return null;
			}

			public String getText(Object element)
			{
				if (element instanceof ModuleType)
				{
					return ((ModuleType) element).getPackName();
				}
				else if (element instanceof NoticeType)
				{
					return ((NoticeType) element).getPackName();
				}
				else if (element instanceof InterfaceType)
				{
					return ((InterfaceType) element).getPackName();
				}
				return null;
			}
		});

		TreeViewerColumn treeViewerColumn_3 = new TreeViewerColumn(treeViewer, SWT.NONE);
		treeViewerColumn_3.setLabelProvider(new ColumnLabelProvider()
		{
			public Image getImage(Object element)
			{
				return null;
			}

			public String getText(Object element)
			{
				if (element instanceof ModuleType)
				{
					return ((ModuleType) element).getPath();
				}
				else if (element instanceof NoticeType)
				{
					return ((NoticeType) element).getPath();
				}
				else if (element instanceof InterfaceType)
				{
					return ((InterfaceType) element).getPath();
				}
				return null;
			}
		});
		TreeColumn treeColumn = treeViewerColumn_3.getColumn();
		treeColumn.setWidth(100);
		treeColumn.setText("\u8DEF\u5F84");

		treeViewer.setContentProvider(new ContentProvider());
		
		initTools();
	}

	@Override
	public void setFocus()
	{
		tree.setFocus();
	}
	
	private void initTools()
	{
		getViewSite().getActionBars().getMenuManager().add(new GroupMarker("node"));
		getViewSite().getActionBars().getMenuManager().add(new GroupMarker("addtions"));
	}
	
	public void openAllNode()
	{
		treeViewer.expandAll();
	}
	
	public void closeAllNode()
	{
		treeViewer.collapseAll();
	}
	
	public void rebuildAll()
	{
		if(project!=null)
		{
			Project model=Activator.getObserver().getProject(project);
			if(model!=null)
			{
				model.fullBuild();
			}
		}
	}
	
	
	private void openEditor(Object data)
	{
		if (data == null)
		{
			return;
		}
		if (project == null)
		{
			return;
		}

		IFile file = null;
		if (data instanceof ModuleType)
		{
			file = project.getFile(new Path(((ModuleType) data).getPath()));
		}
		else if (data instanceof NoticeType)
		{
			file = project.getFile(new Path(((NoticeType) data).getPath()));
		}
		else if (data instanceof InterfaceType)
		{
			file = project.getFile(new Path(((InterfaceType) data).getPath()));
		}
		else if (data instanceof EnumType)
		{
			file = project.getFile(new Path(((EnumType) data).getPath()));
		}
		else if (data instanceof Package)
		{
			Package modules = (Package) data;
			if (modules.getModules().size() > 0)
			{
				file = project.getFile(new Path(modules.getModules().get(0).getPath()));
			}
		}

		if (file != null && file.exists())
		{
			try
			{
				getSite().getPage().openEditor(new FileEditorInput(file), "com.adobe.flexbuilder.editors.actionscript.ActionScriptEditor");
			}
			catch (PartInitException e)
			{
				Activator.writeError(e);
			}
		}
	}

	/**
	 * 初始化
	 */
	@Override
	public void init(IViewSite site) throws PartInitException
	{
		super.init(site);

		site.getPage().addSelectionListener(this);

		onSelectionChanged(site.getPage().getSelection());
	}

	@Override
	public void dispose()
	{
		getSite().getPage().removeSelectionListener(this);

		super.dispose();
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection)
	{
		onSelectionChanged(selection);
	}

	/**
	 * 当前选择改变
	 * 
	 * @param selection
	 */
	private void onSelectionChanged(ISelection selection)
	{
		if (treeViewer == null)
		{
			return;
		}

		if (selection instanceof IStructuredSelection)
		{
			IStructuredSelection ss = (IStructuredSelection) selection;
			Object item = ss.getFirstElement();
			if (item != null)
			{
				IResource resource = null;
				if (item instanceof IResource)
				{
					resource = (IResource) item;
				}
				else
				{
					resource = (IResource) Platform.getAdapterManager().getAdapter(item, IResource.class);
				}

				if (resource != null)
				{
					IProject root=resource.getProject();
					if(!root.equals(project))
					{
						Project model=null;
						if(project!=null)
						{
							model=Activator.getObserver().getProject(project);
							if(model!=null)
							{
								model.removeListener(this);
							}
						}
						
						project = root;

						model=Activator.getObserver().getProject(project);
						if(model!=null)
						{
							model.addListener(this);
						}
						
						treeViewer.setInput(model);
					}
				}
			}
		}
	}

	@Override
	public void onProjectChanged()
	{
		getSite().getWorkbenchWindow().getShell().getDisplay().asyncExec(new Runnable()
		{
			@Override
			public void run()
			{
				treeViewer.refresh();
			}
		});
	}
}
