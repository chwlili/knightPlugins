package org.chw.game.ide.ui;

import org.chw.game.ide.ui.internal.ProtoActivator;
import org.osgi.framework.BundleContext;

public class Activator extends ProtoActivator
{
	// The shared instance
	private static Activator plugin;
	
	@Override
	public void start(BundleContext context) throws Exception
	{
		super.start(context);

		plugin = this;
		
		OutputConfigListener.start();
	}

	@Override
	public void stop(BundleContext context) throws Exception
	{
		super.stop(context);

		plugin = null;
		
		OutputConfigListener.stop();
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
}
