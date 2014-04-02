package org.chw.game.inject;

import java.io.File;

import org.chw.game.inject.inject.project.ProjectObserver;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin
{

	// The plug-in ID
	public static final String PLUGIN_ID = "org.chw.game.inject"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	private static ProjectObserver observer;

	/**
	 * The constructor
	 */
	public Activator()
	{
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception
	{
		super.start(context);

		plugin = this;

		observer = new ProjectObserver();
		observer.startup();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext context) throws Exception
	{
		observer.shutdown();
		observer = null;

		plugin = null;

		super.stop(context);
	}
	
	public Image getImage(String key)
	{
		Image img=getImageRegistry().get(key);
		if(img==null)
		{
			getImageRegistry().put(key, ImageDescriptor.createFromFile(this.getClass(), "/icons"+File.separator+key));
		}
		
		img=getImageRegistry().get(key);
		
		return img;
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault()
	{
		return plugin;
	}

	/**
	 * 获取观察者
	 * 
	 * @return
	 */
	public static ProjectObserver getObserver()
	{
		return observer;
	}

	/**
	 * 写入错误
	 * 
	 * @param message
	 */
	public static void writeError(String message)
	{
		getDefault().getLog().log(new Status(Status.ERROR, PLUGIN_ID, message));
	}

	/**
	 * 写入错误
	 * 
	 * @param message
	 */
	public static void writeError(Throwable exception)
	{
		getDefault().getLog().log(new Status(Status.ERROR, PLUGIN_ID, exception.getMessage(), exception));
	}
}
