package org.chw.game.ui.wizard;

import java.io.File;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class NewProjectWizardPage extends WizardPage
{
	private Text projectNameInput;
	private Text pathInput;
	private Button useDefaultCheck;
	private Label pathLabel;
	private Button pathSelector;

	private String curstomPath = ""; //$NON-NLS-1$
	private Label codeLabel;
	private Text codeInput;
	private Text destInput;
	private Composite composite;
	private Composite composite_1;
	private Text sourceInput;
	private Button sourceSelector;
	private Label sourceLabel;
	private Label destLabel;

	private Label outputLabel;
	private Text outputInput;
	private Button outputSelector;
	
	private Label cfgLabel;
	private Text cfgInput;
	private Button cfgSelector;

	/**
	 * Create the wizard.
	 */
	public NewProjectWizardPage()
	{
		super("wizardPage"); //$NON-NLS-1$
		setTitle("Config库项目");
		setDescription("建立一个config 库项目");
	}

	/**
	 * Create contents of the wizard.
	 * 
	 * @param parent
	 */
	public void createControl(Composite parent)
	{
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new GridLayout(1, false));

		composite_1 = new Composite(container, SWT.NONE);
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		composite_1.setLayout(new GridLayout(2, false));

		Label projectNameLabel = new Label(composite_1, SWT.NONE);
		projectNameLabel.setText("项目名：");

		projectNameInput = new Text(composite_1, SWT.BORDER);
		projectNameInput.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		projectNameInput.addModifyListener(new ModifyListener()
		{
			public void modifyText(ModifyEvent e)
			{
				checkProjectName();
			}
		});

		composite = new Composite(container, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		composite.setLayout(new GridLayout(3, false));

		useDefaultCheck = new Button(composite, SWT.CHECK);
		useDefaultCheck.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 3, 1));
		useDefaultCheck.setSelection(true);
		useDefaultCheck.setText("使用缺省位置");
		useDefaultCheck.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				boolean pathEnabled = !useDefaultCheck.getSelection();

				if (pathEnabled)
				{
					pathInput.setText(curstomPath);
				}

				pathLabel.setEnabled(pathEnabled);
				pathInput.setEnabled(pathEnabled);
				pathSelector.setEnabled(pathEnabled);

				if (!pathEnabled)
				{
					pathInput.setText(getWorkspacePath() + File.separatorChar + projectNameInput.getText());
				}

				checkProjectName();
				checkProjectPath();
			}
		});

		pathLabel = new Label(composite, SWT.NONE);
		pathLabel.setEnabled(false);
		pathLabel.setText("位置");

		pathInput = new Text(composite, SWT.BORDER);
		pathInput.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		pathInput.setEnabled(false);
		pathInput.setText(getWorkspacePath());
		pathInput.addModifyListener(new ModifyListener()
		{
			public void modifyText(ModifyEvent e)
			{
				if (pathInput.isEnabled())
				{
					curstomPath = pathInput.getText();
					checkProjectPath();
				}
			}
		});

		pathSelector = new Button(composite, SWT.NONE);
		pathSelector.setEnabled(false);
		pathSelector.setText("    浏览...    ");
		pathSelector.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				DirectoryDialog selectDialog = new DirectoryDialog(getShell());
				String path = selectDialog.open();
				if (path != null && !path.isEmpty())
				{
					pathInput.setText(path);
				}
			}
		});

		Group group = new Group(container, SWT.NONE);
		group.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		group.setText("Config");
		GridLayout gl_group = new GridLayout(3, false);
		gl_group.marginBottom = 10;
		gl_group.marginWidth = 10;
		group.setLayout(gl_group);

		cfgLabel = new Label(group, SWT.NONE);
		cfgLabel.setText("配置文件夹：");

		cfgInput = new Text(group, SWT.BORDER);
		cfgInput.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		cfgInput.setText("cfg-xml");

		cfgSelector = new Button(group, SWT.NONE);
		cfgSelector.setText("    浏览...    ");
		cfgSelector.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				DirectoryDialog selectDialog = new DirectoryDialog(getShell());
				String path = selectDialog.open();
				if (path != null && !path.isEmpty())
				{
					cfgInput.setText(path);
				}
			}
		});
		
		
		sourceLabel = new Label(group, SWT.NONE);
		sourceLabel.setText("协议文件夹：");

		sourceInput = new Text(group, SWT.BORDER);
		sourceInput.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		sourceInput.setText("cfg-proto");

		sourceSelector = new Button(group, SWT.NONE);
		sourceSelector.setText("    浏览...    ");
		sourceSelector.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				DirectoryDialog selectDialog = new DirectoryDialog(getShell());
				String path = selectDialog.open();
				if (path != null && !path.isEmpty())
				{
					sourceInput.setText(path);
				}
			}
		});
		
		Group group2 = new Group(container, SWT.NONE);
		group2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		group2.setText("ActionScript");
		GridLayout gl_group2 = new GridLayout(3, false);
		gl_group2.marginBottom = 10;
		gl_group2.marginWidth = 10;
		group2.setLayout(gl_group2);
		
		codeLabel = new Label(group2, SWT.NONE);
		codeLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		codeLabel.setText("主源文件夹：");

		codeInput = new Text(group2, SWT.BORDER);
		codeInput.setText("src");
		codeInput.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button codeSelector = new Button(group2, SWT.NONE);
		codeSelector.setText("    浏览...    ");
		codeSelector.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				DirectoryDialog selectDialog = new DirectoryDialog(getShell());
				String path = selectDialog.open();
				if (path != null && !path.isEmpty())
				{
					codeInput.setText(path);
				}
			}
		});

		destLabel = new Label(group2, SWT.NONE);
		destLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		destLabel.setText("输出文件夹：");

		destInput = new Text(group2, SWT.BORDER);
		destInput.setText("bin");
		destInput.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button destSelector = new Button(group2, SWT.NONE);
		destSelector.setText("    浏览...    ");
		destSelector.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				DirectoryDialog selectDialog = new DirectoryDialog(getShell());
				String path = selectDialog.open();
				if (path != null && !path.isEmpty())
				{
					destInput.setText(path);
				}
			}
		});
		
		setPageComplete(false);
	}

	/**
	 * 获取项目名称
	 * 
	 * @return
	 */
	public String getProjectName()
	{
		return projectNameInput.getText();
	}

	/**
	 * 获取项目路径
	 * 
	 * @return
	 */
	public String getProjectPath()
	{
		if (useDefaultCheck.getSelection())
		{
			return null;
		}
		return pathInput.getText();
	}

	/**
	 * 获取配置主源路径
	 * @return
	 */
	public String getCfgXmlPath()
	{
		return cfgInput.getText();
	}
	
	/**
	 * 获取配置协议路径
	 * @return
	 */
	public String getCfgProtoPath()
	{
		return sourceInput.getText();
	}
	
	/**
	 * 获取ActionScript主源路径
	 * @return
	 */
	public String getAsSrcPth()
	{
		return codeInput.getText();
	}
	
	/**
	 * 获取ActionScript输出路径
	 * @return
	 */
	public String getAsBinPath()
	{
		return destInput.getText();
	}

	/**
	 * 获取工作空间路径
	 * 
	 * @return
	 */
	private String getWorkspacePath()
	{
		return ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
	}

	/**
	 * 检查项目名称合法性
	 * 
	 * @return
	 */
	private void checkProjectName()
	{
		String projectName = projectNameInput.getText();

		if (projectName == null || projectName.isEmpty())
		{
			setErrorMessage(null);
			setPageComplete(false);
			return;
		}
		else
		{
			String errorChars = "\\/:*?\"<>|"; //$NON-NLS-1$
			for (int i = 0; i < errorChars.length(); i++)
			{
				if (projectName.indexOf(errorChars.charAt(i)) != -1)
				{
					setErrorMessage("项目名称不能包含字符 " + errorChars.charAt(i));
					setPageComplete(false);
					return;
				}
			}

			if (ResourcesPlugin.getWorkspace().getRoot().getProject(projectName).exists())
			{
				setErrorMessage(" 工作空间中已存在具有该名称的项目。");
				setPageComplete(false);
				return;
			}
		}

		if (useDefaultCheck.getSelection())
		{
			pathInput.setText(getWorkspacePath() + File.separatorChar + projectName);
		}

		setErrorMessage(null);
		setPageComplete(true);
	}

	/**
	 * 检查项目路径合法性
	 */
	private void checkProjectPath()
	{
		String projectPath = pathInput.getText();

		if (projectPath == null || projectPath.isEmpty())
		{
			setErrorMessage("必须指定项目位置目录");
			setPageComplete(false);
			return;
		}
		else
		{
			File dir = new File(projectPath);
			if (dir.exists() && !dir.isDirectory())
			{
				setErrorMessage("\"" + projectPath + "\" " + "不是有效的目录。"); //$NON-NLS-1$ //$NON-NLS-2$
				setPageComplete(false);
				return;
			}

			File file = dir;
			while (file != null && !file.exists())
			{
				file = file.getParentFile();
			}

			if (file == null)
			{
				setErrorMessage("\"" + projectPath + "\" " + "不是有效的位置。"); //$NON-NLS-1$ //$NON-NLS-2$
				setPageComplete(false);
				return;
			}
		}

		setErrorMessage(null);
		setPageComplete(true);
	}
}
