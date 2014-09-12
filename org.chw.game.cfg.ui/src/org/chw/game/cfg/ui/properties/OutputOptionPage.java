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

public class OutputOptionPage extends PropertyPage
{
	private Composite composite_2;
	private Text topPackField;
	private Text corePackField;
	private Text codePakField;

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
		group.setLayout(new GridLayout(2, false));
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

		codePakField = new Text(group, SWT.BORDER);
		codePakField.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Group group_1 = new Group(composite_2, SWT.NONE);
		GridData gd_group_1 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_group_1.verticalIndent = 10;
		group_1.setLayoutData(gd_group_1);
		group_1.setText(" \u914D\u7F6E\u8F93\u51FA ");
	}

	private void initValues()
	{
		topPackField.setText("");
		corePackField.setText("core");
		codePakField.setText("code");

		try
		{
			String topPackName = ((IResource) getElement()).getPersistentProperty(Xml2Nature.TOP_PACKAGE_NAME);
			String corePackName = ((IResource) getElement()).getPersistentProperty(Xml2Nature.CORE_PACKAGE_NAME);
			String codePackName = ((IResource) getElement()).getPersistentProperty(Xml2Nature.CODE_PACKAGE_NAME);

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
				codePakField.setText(codePackName);
			}
		}
		catch (CoreException e)
		{
		}
	}

	protected void performDefaults()
	{
		super.performDefaults();
		topPackField.setText("");
		corePackField.setText("core");
		codePakField.setText("code");
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
				topPack = "";
			}

			String corePack = resource.getPersistentProperty(Xml2Nature.CORE_PACKAGE_NAME);
			if (corePack == null)
			{
				corePack = "";
			}

			String codePack = resource.getPersistentProperty(Xml2Nature.CODE_PACKAGE_NAME);
			if (codePack == null)
			{
				codePack = "";
			}

			if (!topPack.equals(topPackField.getText()) || !corePack.equals(corePackField.getText()) || !codePack.equals(codePakField.getText()))
			{
				resource.setPersistentProperty(Xml2Nature.TOP_PACKAGE_NAME, topPackField.getText());
				resource.setPersistentProperty(Xml2Nature.CORE_PACKAGE_NAME, corePackField.getText());
				resource.setPersistentProperty(Xml2Nature.CODE_PACKAGE_NAME, codePakField.getText());

				shell.getDisplay().timerExec(50, new Runnable()
				{
					@Override
					public void run()
					{
						MessageDialog win = new MessageDialog(shell, "���ѡ���Ѹı�", null, "���ѡ���Ѹı䣬�Ƿ��������ɣ�", WARNING, new String[] { "��", "��" }, 0);
						if (win.open() == 0)
						{
							Job job = new Job("����������Ŀ")
							{
								@Override
								protected IStatus run(IProgressMonitor monitor)
								{
									try
									{
										monitor.beginTask("����������Ŀ", 100);
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