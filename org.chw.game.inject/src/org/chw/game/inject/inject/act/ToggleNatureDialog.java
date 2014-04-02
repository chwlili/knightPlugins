package org.chw.game.inject.inject.act;

import java.io.File;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class ToggleNatureDialog extends Dialog
{
	private Text text;

	private String path = "src-output";

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public ToggleNatureDialog(Shell parentShell)
	{
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent)
	{
		Composite container = (Composite) super.createDialogArea(parent);
		GridLayout gridLayout = (GridLayout) container.getLayout();
		gridLayout.numColumns = 3;

		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("\u8F93\u51FA\u76EE\u5F55\uFF1A");

		text = new Text(container, SWT.BORDER);
		text.setText(path);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		text.addModifyListener(new ModifyListener()
		{
			public void modifyText(ModifyEvent e)
			{
				getButton(IDialogConstants.OK_ID).setEnabled(false);

				if (ResourcesPlugin.getWorkspace().validateName(text.getText(), IResource.FOLDER).isOK())
				{
					path = text.getText();
					getButton(IDialogConstants.OK_ID).setEnabled(true);
				}
				else
				{
					File file = new File(text.getText());
					if (file.exists() && file.isDirectory())
					{
						path = text.getText();
						getButton(IDialogConstants.OK_ID).setEnabled(true);
					}
				}
			}
		});

		Button btnNewButton = new Button(container, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				DirectoryDialog dlg = new DirectoryDialog(getShell());
				String path = dlg.open();
				if (path != null && !path.isEmpty())
				{
					text.setText(path);
				}
			}
		});
		btnNewButton.setText("  \u6D4F\u89C8...  ");

		getShell().setText("—°‘Ò ‰≥ˆŒª÷√");

		return container;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent)
	{
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize()
	{
		return new Point(450, 162);
	}

	public String getPath()
	{
		return path;
	}
}
