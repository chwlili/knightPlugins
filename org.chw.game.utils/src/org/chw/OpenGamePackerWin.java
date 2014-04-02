package org.chw;

import java.io.File;

import org.chw.game.packer.GamePackerConst;
import org.chw.util.FileUtil;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class OpenGamePackerWin extends AbstractHandler
{
	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		boolean useInner = false;
		if (useInner)
		{
			new GamePackerWin().open();
		}
		else
		{
			File jar = new File(GamePackerConst.getJarDir().getPath() + File.separatorChar + "MyGamePacker_" + Activator.getDefault().getBundle().getVersion().toString() + ".exe");

			if (!jar.exists())
			{
				File jarDir = jar.getParentFile();
				if (jarDir.exists())
				{
					File[] jarFiles = jarDir.listFiles();
					for (File jarFile : jarFiles)
					{
						if (jarFile.getName().startsWith("MyGamePacker_") && jarFile.getName().endsWith(".exe"))
						{
							jarFile.delete();
						}
					}
				}

				FileUtil.writeFile(jar, getClass().getResourceAsStream("/jars/GamePacker.exe"));
			}

			try
			{
				Runtime.getRuntime().exec(jar.getPath());
			}
			catch (Exception e)
			{
				Activator.getDefault().log("³ö´í", e);
			}
		}

		return null;
	}
}
