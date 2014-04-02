package org.chw.game.ide;

import org.chw.game.ide.generator.MyGenerator;
import org.chw.game.ide.scoping.ImportUriGlobalScopeProviderExt;
import org.chw.game.ide.scoping.ImportUriResolverExt;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class ProtoRuntimeModule extends org.chw.game.ide.AbstractProtoRuntimeModule
{
	public Class<? extends org.eclipse.xtext.scoping.IGlobalScopeProvider> bindIGlobalScopeProvider()
	{
		return ImportUriGlobalScopeProviderExt.class;
	}

	public Class<? extends ImportUriResolver> bindImportUriResolverExt()
	{
		return ImportUriResolverExt.class;
	}

	// contributed by org.eclipse.xtext.generator.generator.GeneratorFragment
	public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator()
	{
		return MyGenerator.class;
	}
}
