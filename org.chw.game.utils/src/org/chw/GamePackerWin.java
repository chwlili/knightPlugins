package org.chw;

import org.chw.game.AppMain;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

public class GamePackerWin extends ApplicationWindow
{

	/**
	 * Create the application window.
	 */
	public GamePackerWin()
	{
		super(null);
		setShellStyle(SWT.SHELL_TRIM);
	}

	/**
	 * Create contents of the application window.
	 * @param parent
	 */
	@Override
	protected Control createContents(Composite parent)
	{
		AppMain main=new AppMain();
		return main.initControls(parent);
	}

	/**
	 * Configure the shell.
	 * @param newShell
	 */
	@Override
	protected void configureShell(Shell newShell)
	{
		super.configureShell(newShell);
		//newShell.setImage(SWTResourceManager.getImage(GamePackerWin.class, "/icons/appIcon.png"));
		newShell.setText("\u6E38\u620F\u6253\u5305");
	}

	/**
	 * Return the initial size of the window.
	 */
	@Override
	protected Point getInitialSize()
	{
		return new Point(545, 674);
	}

}
