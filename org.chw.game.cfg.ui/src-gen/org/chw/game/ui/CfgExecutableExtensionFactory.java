/*
 * generated by Xtext
 */
package org.chw.game.ui;

import org.chw.game.ui.internal.CfgActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CfgExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return CfgActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return CfgActivator.getInstance().getInjector(CfgActivator.ORG_CHW_GAME_CFG);
	}
	
}
