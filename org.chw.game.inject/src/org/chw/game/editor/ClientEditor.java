package org.chw.game.editor;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.xml.sax.SAXException;

public class ClientEditor extends MultiPageEditorPart implements BaseEditor
{
	private Text auth_input;
	private Composite radioBox;
	private Text version_input;
	private Text lang_input;
	private Table version_table;
	private Table log_table;
	private Button debugRadio;
	private Button releaseRadio;
	private Composite verGroup;
	private Composite debugGroup;
	private Composite logGroup;

	private ClientReader clientXmlReader;
	private Text test_input;
	private CheckboxTableViewer version_viewer;
	private CheckboxTableViewer log_viewer;
	private Table auth_table;
	private CheckboxTableViewer auth_viewer;

	protected void createPages()
	{
		createAuthPage();
		createVerPage();
		createLogPage();

		refreshClientXML();

		initListener();
	}

	/**
	 * 创建验证页
	 */
	private void createAuthPage()
	{
		GridLayout boxLayout = new GridLayout(2, false);
		boxLayout.marginWidth = 20;
		boxLayout.marginHeight = 20;

		debugGroup = new Composite(getContainer(), SWT.NONE);
		debugGroup.setLayout(boxLayout);

		Label lblNewLabel = new Label(debugGroup, SWT.NONE);
		lblNewLabel.setText("\u542F\u52A8\u65B9\u5F0F\uFF1A");

		radioBox = new Composite(debugGroup, SWT.NONE);
		radioBox.setLayout(new GridLayout(2, false));

		debugRadio = new Button(radioBox, SWT.RADIO);
		debugRadio.setSelection(true);
		debugRadio.setText("调试模式");
		debugRadio.setToolTipText("\u4ECEIndex.swf\u542F\u52A8\u76EE\u5F55\u4E0B\u52A0\u8F7DGame.swf\u3001GameHead.swf\u3001GameBody.swf");

		releaseRadio = new Button(radioBox, SWT.RADIO);
		releaseRadio.setText("正常模式");
		releaseRadio.setToolTipText("\u4ECE\u7248\u672C\u4ED3\u5E93\u4E2D\u52A0\u8F7DGame.swf\u3001GameHead.swf\u3001GameBody.swf");

		Label lblNewLabel_2 = new Label(debugGroup, SWT.NONE);
		lblNewLabel_2.setText("\u9A8C\u8BC1\u670D\u52A1\uFF1A");

		auth_input = new Text(debugGroup, SWT.BORDER);
		auth_input.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblNewLabel_1 = new Label(debugGroup, SWT.NONE);
		lblNewLabel_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_1.setText("\u6388\u6743\u5E10\u53F7\uFF1A");

		test_input = new Text(debugGroup, SWT.BORDER);
		test_input.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label label = new Label(debugGroup, SWT.NONE);
		label.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		label.setText("\u767B\u5F55\u5E10\u53F7\uFF1A");

		auth_viewer = CheckboxTableViewer.newCheckList(debugGroup, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		auth_table = auth_viewer.getTable();
		auth_table.setLinesVisible(true);
		auth_table.setHeaderVisible(true);
		auth_table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		TableViewerColumn loginCheckCol = new TableViewerColumn(auth_viewer, SWT.NONE);
		loginCheckCol.getColumn().setWidth(30);
		loginCheckCol.getColumn().setResizable(false);

		TableViewerColumn loginNameCol = new TableViewerColumn(auth_viewer, SWT.NONE);
		loginNameCol.getColumn().setWidth(456);
		loginNameCol.getColumn().setText("用户名");

		DragStrategy.initDragStrategy(this, auth_viewer, new NameNode(true, "???"));
		EditProvider.initAuthViewer(this, auth_viewer, loginCheckCol, loginNameCol);

		addPage(debugGroup);
		setPageText(getPageCount() - 1, "  启动信息  ");
	}

	/**
	 * 创建版本页
	 */
	private void createVerPage()
	{
		GridLayout boxLayout = new GridLayout(2, false);
		boxLayout.marginWidth = 20;
		boxLayout.marginHeight = 20;

		verGroup = new Composite(getContainer(), SWT.NONE);
		verGroup.setLayout(boxLayout);

		Label version_label = new Label(verGroup, SWT.NONE);
		version_label.setText("\u6E38\u620F\u7248\u672C\uFF1A");

		version_input = new Text(verGroup, SWT.BORDER);
		version_input.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lang_label = new Label(verGroup, SWT.NONE);
		lang_label.setText("语言环境：");

		lang_input = new Text(verGroup, SWT.BORDER);
		lang_input.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblNewLabel_3 = new Label(verGroup, SWT.NONE);
		lblNewLabel_3.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		lblNewLabel_3.setText("\u4ED3\u5E93\u4FE1\u606F\uFF1A");

		version_viewer = CheckboxTableViewer.newCheckList(verGroup, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		version_table = version_viewer.getTable();
		version_table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		version_table.setLinesVisible(true);
		version_table.setHeaderVisible(true);

		TableViewerColumn verCheckCol = new TableViewerColumn(version_viewer, SWT.NONE);
		verCheckCol.getColumn().setWidth(30);
		verCheckCol.getColumn().setResizable(false);

		TableViewerColumn verNameCol = new TableViewerColumn(version_viewer, SWT.NONE);
		verNameCol.getColumn().setWidth(100);
		verNameCol.getColumn().setText("仓库名称");

		TableViewerColumn verPathCol = new TableViewerColumn(version_viewer, SWT.NONE);
		verPathCol.getColumn().setWidth(255);
		verPathCol.getColumn().setText("仓库地址");

		TableViewerColumn verPolicyCol = new TableViewerColumn(version_viewer, SWT.NONE);
		verPolicyCol.getColumn().setWidth(100);
		verPolicyCol.getColumn().setText("授权文件");

		DragStrategy.initDragStrategy(this, version_viewer, new VerNode(true, "???", "???", "???"));
		EditProvider.initVerViewer(this, version_viewer, verCheckCol, verNameCol, verPathCol, verPolicyCol);

		addPage(verGroup);
		setPageText(getPageCount() - 1, "  版本仓库  ");
	}

	/**
	 * 创建日志页
	 */
	private void createLogPage()
	{
		GridLayout boxLayout = new GridLayout(2, false);
		boxLayout.marginWidth = 20;
		boxLayout.marginHeight = 20;

		logGroup = new Composite(getContainer(), SWT.NONE);
		logGroup.setLayout(boxLayout);

		// Label lblNewLabel_4 = new Label(logGroup, SWT.NONE);
		// lblNewLabel_4.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false,
		// false, 1, 1));
		// lblNewLabel_4.setText("\u65E5\u5FD7\u5730\u5740\uFF1A");

		log_viewer = CheckboxTableViewer.newCheckList(logGroup, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		log_table = log_viewer.getTable();
		log_table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		log_table.setHeaderVisible(true);
		log_table.setLinesVisible(true);

		TableViewerColumn logCheckCol = new TableViewerColumn(log_viewer, SWT.NONE);
		logCheckCol.getColumn().setWidth(30);
		logCheckCol.getColumn().setResizable(false);

		TableViewerColumn logNameCol = new TableViewerColumn(log_viewer, SWT.NONE);
		logNameCol.getColumn().setWidth(100);
		logNameCol.getColumn().setText("ID");

		TableViewerColumn logPathCol = new TableViewerColumn(log_viewer, SWT.NONE);
		logPathCol.getColumn().setWidth(353);
		logPathCol.getColumn().setText("\u5730\u5740");

		DragStrategy.initDragStrategy(this, log_viewer, new LogNode(true, "???", "???"));
		EditProvider.initLogViewer(this, log_viewer, logCheckCol, logNameCol, logPathCol);

		addPage(logGroup);
		setPageText(getPageCount() - 1, "  日志服务  ");
	}

	/**
	 * 初始化监视器
	 */
	private void initListener()
	{
		debugRadio.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				clientXmlReader.debugMode = debugRadio.getSelection();
				setDirty(true);
			}
		});
		releaseRadio.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				clientXmlReader.debugMode = debugRadio.getSelection();
				setDirty(true);
			}
		});
		version_input.addModifyListener(new ModifyListener()
		{
			public void modifyText(ModifyEvent e)
			{
				clientXmlReader.version = version_input.getText();
				setDirty(true);
			}
		});
		lang_input.addModifyListener(new ModifyListener()
		{
			@Override
			public void modifyText(ModifyEvent e)
			{
				String text = lang_input.getText();
				if (text == null || text.isEmpty())
				{
					text = "zh";
				}
				clientXmlReader.lang = text;
				setDirty(true);
			}
		});
		version_viewer.addCheckStateListener(new ICheckStateListener()
		{
			public void checkStateChanged(CheckStateChangedEvent event)
			{
				VerNode node = (VerNode) event.getElement();
				node.select = event.getChecked();
				version_viewer.refresh();
				version_viewer.setChecked(node, node.select);
				setDirty(true);
			}
		});

		// ------------------------------------------------------------------------------

		log_viewer.addCheckStateListener(new ICheckStateListener()
		{
			public void checkStateChanged(CheckStateChangedEvent event)
			{
				LogNode node = (LogNode) event.getElement();
				node.select = event.getChecked();
				log_viewer.refresh();
				log_viewer.setChecked(node, node.select);
				setDirty(true);
			}
		});

		// ------------------------------------------------------------------------------

		auth_input.addModifyListener(new ModifyListener()
		{
			public void modifyText(ModifyEvent e)
			{
				clientXmlReader.debugAuthURL = auth_input.getText();
				setDirty(true);
			}
		});
		test_input.addModifyListener(new ModifyListener()
		{
			public void modifyText(ModifyEvent e)
			{
				clientXmlReader.testName = test_input.getText();
				setDirty(true);
			}
		});
		auth_viewer.addCheckStateListener(new ICheckStateListener()
		{
			public void checkStateChanged(CheckStateChangedEvent event)
			{
				NameNode node = (NameNode) event.getElement();
				node.select = event.getChecked();
				auth_viewer.refresh();
				auth_viewer.setChecked(node, node.select);
				setDirty(true);
			}
		});
	}

	@Override
	public void setFocus()
	{
		version_input.setFocus();
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException
	{
		setSite(site);
		setInput(input);
		setPartName(input.getName());
	}

	/**
	 * 刷新client.xml
	 */
	private void refreshClientXML()
	{
		clientXmlReader = new ClientReader();
		try
		{
			IFile file = ((FileEditorInput) getEditorInput()).getFile();
			IFolder folder = (IFolder) file.getParent();

			clientXmlReader.open(folder.getFile("client.xml"));
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

		debugRadio.setSelection(clientXmlReader.debugMode);
		releaseRadio.setSelection(!clientXmlReader.debugMode);

		version_input.setText(clientXmlReader.version);
		version_viewer.setInput(clientXmlReader.verList);

		log_viewer.setInput(clientXmlReader.logList);

		auth_input.setText(clientXmlReader.debugAuthURL);
		test_input.setText(clientXmlReader.testName);
		auth_viewer.setInput(clientXmlReader.nameList);

		lang_input.setText(clientXmlReader.lang);

		for (VerNode node : clientXmlReader.verList)
		{
			version_viewer.setChecked(node, node.select);
		}
		for (LogNode node : clientXmlReader.logList)
		{
			log_viewer.setChecked(node, node.select);
		}
		for (NameNode node : clientXmlReader.nameList)
		{
			auth_viewer.setChecked(node, node.select);
		}

		version_viewer.refresh();
		packColumns(version_viewer.getTable());

		log_viewer.refresh();
		packColumns(log_viewer.getTable());

		auth_viewer.refresh();
		packColumns(auth_viewer.getTable());
	}

	private void packColumns(Table table)
	{
		for (int i = 1; i < table.getColumnCount(); i++)
		{
			table.getColumn(i).pack();
		}
	}

	private boolean dirty = false;

	public void setDirty(boolean value)
	{
		dirty = clientXmlReader.isChanged();
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
			clientXmlReader.save();
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
