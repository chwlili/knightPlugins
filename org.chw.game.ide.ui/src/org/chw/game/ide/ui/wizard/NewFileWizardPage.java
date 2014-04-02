package org.chw.game.ide.ui.wizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class NewFileWizardPage extends WizardPage
{
	private Text nameInput;

	/**
	 * Create the wizard.
	 */
	public NewFileWizardPage()
	{
		super("wizardPage"); //$NON-NLS-1$
		setTitle(Messages.NewFileWizardPage_0);
		setDescription(Messages.NewFileWizardPage_1);
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
		container.setLayout(new FormLayout());

		Label nameLabel = new Label(container, SWT.NONE);
		FormData fd_nameLabel = new FormData();
		fd_nameLabel.top = new FormAttachment(0, 13);
		fd_nameLabel.left = new FormAttachment(0, 10);
		nameLabel.setLayoutData(fd_nameLabel);
		nameLabel.setText(Messages.NewFileWizardPage_2);

		nameInput = new Text(container, SWT.BORDER);
		nameInput.addModifyListener(new ModifyListener()
		{
			public void modifyText(ModifyEvent e)
			{
				checkFileName();
			}
		});
		fd_nameLabel.right = new FormAttachment(nameInput, -6);
		FormData fd_nameInput = new FormData();
		fd_nameInput.right = new FormAttachment(100, -10);
		fd_nameInput.top = new FormAttachment(0, 10);
		fd_nameInput.left = new FormAttachment(0, 75);
		nameInput.setLayoutData(fd_nameInput);

		setPageComplete(false);
	}
	
	/**
	 * 获取文件名称
	 * @return
	 */
	public String getFileName()
	{
		return nameInput.getText();
	}
	
	/**
	 * 检查文件名称合法性
	 * 
	 * @return
	 */
	private void checkFileName()
	{
		String fileName = nameInput.getText();

		if (fileName == null || fileName.isEmpty())
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
				if (fileName.indexOf(errorChars.charAt(i)) != -1)
				{
					setErrorMessage(Messages.NewFileWizardPage_3 + errorChars.charAt(i));
					setPageComplete(false);
					return;
				}
			}
			

			if(!fileName.endsWith(".proto")) //$NON-NLS-1$
			{
				fileName=fileName+".proto"; //$NON-NLS-1$
			}
			
			NewFileWizard newFile=(NewFileWizard)getWizard();
			if(newFile.getFolder()!=null)
			{
				IFile file=newFile.getFolder().getFile(new Path(fileName));
				if(file.exists())
				{
					setErrorMessage(Messages.NewFileWizardPage_4);
					setPageComplete(false);
					return;
				}
			}
		}
		
		setErrorMessage(null);
		setPageComplete(true);
	}
}
