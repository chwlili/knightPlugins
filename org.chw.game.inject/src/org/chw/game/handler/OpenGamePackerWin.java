package org.chw.game.handler;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.chw.game.inject.Activator;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class OpenGamePackerWin extends AbstractHandler
{
	/**
	 * 获取JAR目录
	 * @return
	 */
	public static File getJarDir()
	{
		return new File(System.getProperty("user.home") + File.separatorChar + "GamePacker");
	}
	
	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		boolean useInner = false;
		if (useInner)
		{
			//new GamePackerWin().open();
		}
		else
		{
			File jar = new File(getJarDir().getPath() + File.separatorChar + "MyGamePacker_" + Activator.getDefault().getBundle().getVersion().toString() + ".jar");

			if (!jar.exists())
			{
				File jarDir = jar.getParentFile();
				if (jarDir.exists())
				{
					File[] jarFiles = jarDir.listFiles();
					for (File jarFile : jarFiles)
					{
						if (jarFile.getName().startsWith("MyGamePacker_") && jarFile.getName().endsWith(".jar"))
						{
							jarFile.delete();
						}
					}
				}

				writeFile(jar, getClass().getResourceAsStream("/jars/GamePacker.jar"));
			}
			
			try
			{
				Runtime.getRuntime().exec("cmd /c java -jar " + jar.getPath());
			}
			catch (Exception e)
			{
				MessageDialog.openError(Display.getCurrent().getActiveShell(), "无法启动jar", "启动jar文件失败("+jar.getPath()+")");
			}
		}

		return null;
	}
	
	/**
	 * 写入文件
	 * @param input
	 * @param dest
	 */
	public static void writeFile(File dest,InputStream input)
	{
		if (dest.exists())
		{
			dest.delete();
		}
		else
		{
			if (dest.getParent() == null)
			{
				return;
			}
			else if (!dest.getParentFile().exists())
			{
				dest.getParentFile().mkdirs();
			}
		}
		
		try
		{
			// 新建文件输入流并对它进行缓冲
			BufferedInputStream inBuff = new BufferedInputStream(input);

			// 新建文件输出流并对它进行缓冲
			FileOutputStream output = new FileOutputStream(dest);
			BufferedOutputStream outBuff = new BufferedOutputStream(output);

			// 缓冲数组
			byte[] b = new byte[1024 * 5];
			int len;
			while ((len = inBuff.read(b)) != -1)
			{
				outBuff.write(b, 0, len);
			}
			outBuff.flush();

			inBuff.close();
			outBuff.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
