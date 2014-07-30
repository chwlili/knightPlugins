package org.chw.game.editor;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.xml.sax.SAXException;

public class ServerEditor extends EditorPart implements BaseEditor
{
	private Table server_table;
	private Composite server_group;

	private ServerReader server_reader;
	private CheckboxTableViewer server_viewer;

	public ServerEditor()
	{
	}

	@Override
	public void createPartControl(Composite parent)
	{
		GridLayout gl_parent = new GridLayout(1, false);
		gl_parent.marginHeight = 10;
		gl_parent.marginWidth = 10;
		parent.setLayout(gl_parent);

		server_group = new Composite(parent, SWT.NONE);
		server_group.setLayout(new GridLayout(1, false));
		server_group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		server_viewer = CheckboxTableViewer.newCheckList(server_group, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		server_table = server_viewer.getTable();
		server_table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		server_table.setLinesVisible(true);
		server_table.setHeaderVisible(true);

		TableViewerColumn serverCheckCol = new TableViewerColumn(server_viewer, SWT.NONE);
		serverCheckCol.getColumn().setWidth(30);
		serverCheckCol.getColumn().setResizable(false);

		TableViewerColumn serverIdCol = new TableViewerColumn(server_viewer, SWT.NONE);
		serverIdCol.getColumn().setWidth(100);
		serverIdCol.getColumn().setText("ID");

		TableViewerColumn serverNameCol = new TableViewerColumn(server_viewer, SWT.NONE);
		serverNameCol.getColumn().setWidth(100);
		serverNameCol.getColumn().setText("\u540D\u79F0");

		TableViewerColumn serverHostCol = new TableViewerColumn(server_viewer, SWT.NONE);
		serverHostCol.getColumn().setWidth(219);
		serverHostCol.getColumn().setText("\u57DF\u540D");

		TableViewerColumn serverPortCol = new TableViewerColumn(server_viewer, SWT.NONE);
		serverPortCol.getColumn().setWidth(69);
		serverPortCol.getColumn().setText("\u7AEF\u53E3");

		TableViewerColumn serverWorldCol = new TableViewerColumn(server_viewer, SWT.NONE);
		serverWorldCol.getColumn().setWidth(100);
		serverWorldCol.getColumn().setText("\u4E16\u754CID");

		DragStrategy.initDragStrategy(this, server_viewer, new ServerNode(true, "0", "???", "???", "???", "???"));
		EditProvider.initServerViewer(this, server_viewer, serverCheckCol, serverIdCol, serverNameCol, serverHostCol, serverPortCol, serverWorldCol);

		refresh_server();

		server_viewer.addCheckStateListener(new ICheckStateListener()
		{
			public void checkStateChanged(CheckStateChangedEvent event)
			{
				ServerNode node = (ServerNode) event.getElement();
				node.select = event.getChecked();
				server_viewer.refresh();
				server_viewer.setChecked(node, node.select);
				setDirty(true);
			}
		});
	}

	@Override
	public void setFocus()
	{
		server_table.setFocus();
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException
	{
		setSite(site);
		setInput(input);
		setPartName(input.getName());
	}

	private void refresh_server()
	{
		server_reader = new ServerReader();
		try
		{
			server_reader.open(((FileEditorInput) getEditorInput()).getFile());
		}
		catch (ParserConfigurationException e)
		{
			e.printStackTrace();
		}
		catch (SAXException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (CoreException e)
		{
			e.printStackTrace();
		}
		server_viewer.setInput(server_reader.serverList);

		for (ServerNode node : server_reader.serverList)
		{
			server_viewer.setChecked(node, node.select);
		}

		server_viewer.refresh();

		packColumns(server_viewer.getTable());
	}

	private boolean dirty = false;

	public void setDirty(boolean value)
	{
		dirty = server_reader.isChanged();
		firePropertyChange(PROP_DIRTY);
	}

	@Override
	public boolean isDirty()
	{
		return dirty;
	}

	@Override
	public void doSave(IProgressMonitor monitor)
	{
		try
		{
			server_reader.save();
			setDirty(false);
		}
		catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
		catch (CoreException e)
		{
			e.printStackTrace();
		}
	}

	private void packColumns(Table table)
	{
		for (int i = 1; i < table.getColumnCount(); i++)
		{
			table.getColumn(i).pack();
		}
	}

	@Override
	public void doSaveAs()
	{
		// System.out.println("xx");
	}

	@Override
	public boolean isSaveAsAllowed()
	{
		return false;
	}
}
