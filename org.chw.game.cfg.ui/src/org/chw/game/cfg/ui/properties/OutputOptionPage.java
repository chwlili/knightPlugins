package org.chw.game.cfg.ui.properties;

import org.chw.game.builder.Xml2Nature;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.PropertyPage;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class OutputOptionPage extends PropertyPage
{
	private Composite composite_2;
	private Text topPackField;
	private Text corePackField;
	private Text codePackField;
	private Text filePackField;
	private Button filePackChecker;

	/**
	 * Constructor for SamplePropertyPage.
	 */
	public OutputOptionPage()
	{
		super();
	}

	/**
	 * @see PreferencePage#createContents(Composite)
	 */
	protected Control createContents(Composite parent)
	{
		composite_2 = new Composite(parent, SWT.NONE);
		GridLayout gl_composite_2 = new GridLayout();
		composite_2.setLayout(gl_composite_2);
		GridData data = new GridData(GridData.FILL);
		data.grabExcessHorizontalSpace = true;
		composite_2.setLayoutData(data);

		createDefaultComposite(composite_2);
		initValues();
		return composite_2;
	}

	private void createDefaultComposite(Composite parent)
	{
		Group group = new Group(composite_2, SWT.NONE);
		GridLayout gl_group = new GridLayout(2, false);
		gl_group.horizontalSpacing = 0;
		gl_group.marginBottom = 10;
		gl_group.marginWidth = 10;
		group.setLayout(gl_group);
		group.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		group.setText(" \u4EE3\u7801\u751F\u6210 ");

		Label topPackLabel = new Label(group, SWT.NONE);
		topPackLabel.setText("\u5BB9\u5668\u5305\uFF1A");

		topPackField = new Text(group, SWT.BORDER);
		topPackField.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label corePackLabel = new Label(group, SWT.NONE);
		GridData gd_corePackLabel = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
		gd_corePackLabel.verticalIndent = 10;
		corePackLabel.setLayoutData(gd_corePackLabel);
		corePackLabel.setText("\u57FA\u7C7B\u5305\uFF1A");

		corePackField = new Text(group, SWT.BORDER);
		GridData gd_corePackField = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_corePackField.verticalIndent = 10;
		corePackField.setLayoutData(gd_corePackField);

		Label codePackLabel = new Label(group, SWT.NONE);
		codePackLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		codePackLabel.setText("\u4EE3\u7801\u5305\uFF1A");

		codePackField = new Text(group, SWT.BORDER);
		codePackField.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Group group_1 = new Group(composite_2, SWT.NONE);
		GridLayout gl_group_1 = new GridLayout(2, false);
		gl_group_1.horizontalSpacing = 0;
		gl_group_1.marginBottom = 10;
		gl_group_1.marginWidth = 10;
		group_1.setLayout(gl_group_1);
		GridData gd_group_1 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_group_1.verticalIndent = 10;
		group_1.setLayoutData(gd_group_1);
		group_1.setText(" \u914D\u7F6E\u8F93\u51FA ");

		filePackChecker = new Button(group_1, SWT.CHECK);
		filePackChecker.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				filePackField.setEnabled(filePackChecker.getSelection());
			}
		});
		filePackChecker.setText(" \u8F93\u51FA\u5230\uFF1A");

		filePackField = new Text(group_1, SWT.BORDER);
		filePackField.setEnabled(false);
		filePackField.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	}

	private void initValues()
	{
		topPackField.setText(Xml2Nature.DEFAULT_TOP_PACK);
		corePackField.setText(Xml2Nature.DEFAULT_CORE_PACK);
		codePackField.setText(Xml2Nature.DEFAULT_CODE_PACK);
		filePackChecker.setSelection(Xml2Nature.DEFAULT_FILE_CHECK);
		filePackField.setText(Xml2Nature.DEFAULT_FILE_PACK);

		try
		{
			String topPackName = ((IResource) getElement()).getPersistentProperty(Xml2Nature.TOP_PACKAGE_NAME);
			String corePackName = ((IResource) getElement()).getPersistentProperty(Xml2Nature.CORE_PACKAGE_NAME);
			String codePackName = ((IResource) getElement()).getPersistentProperty(Xml2Nature.CODE_PACKAGE_NAME);
			String filePackCheck = ((IResource) getElement()).getPersistentProperty(Xml2Nature.FILE_PACKAGE_CHECK);
			String filePackName = ((IResource) getElement()).getPersistentProperty(Xml2Nature.FILE_PACKAGE_NAME);

			if (topPackName != null)
			{
				topPackField.setText(topPackName);
			}

			if (corePackName != null)
			{
				corePackField.setText(corePackName);
			}

			if (codePackName != null)
			{
				codePackField.setText(codePackName);
			}

			if (filePackCheck != null && filePackCheck.equals("true"))
			{
				filePackChecker.setSelection(true);
			}

			if (filePackName != null)
			{
				filePackField.setText(filePackName);
			}
		}
		catch (CoreException e)
		{
		}

		filePackField.setEnabled(filePackChecker.getSelection());
	}

	protected void performDefaults()
	{
		super.performDefaults();
		topPackField.setText(Xml2Nature.DEFAULT_TOP_PACK);
		corePackField.setText(Xml2Nature.DEFAULT_CORE_PACK);
		codePackField.setText(Xml2Nature.DEFAULT_CODE_PACK);
		filePackChecker.setSelection(Xml2Nature.DEFAULT_FILE_CHECK);
		filePackField.setText(Xml2Nature.DEFAULT_FILE_PACK);
	}

	public boolean performOk()
	{
		try
		{
			final Shell shell = getShell();
			final IProject resource = (IProject) getElement();

			String topPack = resource.getPersistentProperty(Xml2Nature.TOP_PACKAGE_NAME);
			if (topPack == null)
			{
				topPack = Xml2Nature.DEFAULT_TOP_PACK;
			}

			String corePack = resource.getPersistentProperty(Xml2Nature.CORE_PACKAGE_NAME);
			if (corePack == null)
			{
				corePack = Xml2Nature.DEFAULT_CORE_PACK;
			}

			String codePack = resource.getPersistentProperty(Xml2Nature.CODE_PACKAGE_NAME);
			if (codePack == null)
			{
				codePack = Xml2Nature.DEFAULT_CODE_PACK;
			}

			boolean filePackCheck = "true".equals(resource.getPersistentProperty(Xml2Nature.FILE_PACKAGE_CHECK));

			String filePack = resource.getPersistentProperty(Xml2Nature.FILE_PACKAGE_NAME);
			if (filePack == null)
			{
				filePack = Xml2Nature.DEFAULT_FILE_PACK;
			}

			if (!topPack.equals(topPackField.getText()) || !corePack.equals(corePackField.getText()) || !codePack.equals(codePackField.getText()) || !filePack.equals(filePackField.getText()) || filePackCheck != filePackChecker.getSelection())
			{
				resource.setPersistentProperty(Xml2Nature.TOP_PACKAGE_NAME, topPackField.getText());
				resource.setPersistentProperty(Xml2Nature.CORE_PACKAGE_NAME, corePackField.getText());
				resource.setPersistentProperty(Xml2Nature.CODE_PACKAGE_NAME, codePackField.getText());
				resource.setPersistentProperty(Xml2Nature.FILE_PACKAGE_NAME, filePackField.getText());
				resource.setPersistentProperty(Xml2Nature.FILE_PACKAGE_CHECK, filePackChecker.getSelection() ? "true" : "false");

				shell.getDisplay().timerExec(50, new Runnable()
				{
					public void run()
					{
						MessageDialog win = new MessageDialog(shell, "输出选项已改变", null, "输出选项已改变，是否重新生成？", WARNING, new String[] { "是", "否" }, 0);
						if (win.open() == 0)
						{
							Job job = new Job("重新生成项目")
							{
								protected IStatus run(IProgressMonitor monitor)
								{
									try
									{
										monitor.beginTask("重新生成项目", 100);
										resource.build(IncrementalProjectBuilder.CLEAN_BUILD, new SubProgressMonitor(monitor, 50));
										resource.build(IncrementalProjectBuilder.FULL_BUILD, new SubProgressMonitor(monitor, 50));
									}
									catch (CoreException e)
									{
									}
									monitor.done();
									return Status.OK_STATUS;
								}
							};
							job.schedule(100);
						}
					}
				});
			}
		}
		catch (CoreException e)
		{
		}

		return true;
	}
}