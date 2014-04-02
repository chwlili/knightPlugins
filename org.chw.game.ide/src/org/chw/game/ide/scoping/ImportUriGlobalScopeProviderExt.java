package org.chw.game.ide.scoping;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;

import com.google.common.base.Predicate;

public class ImportUriGlobalScopeProviderExt extends ImportUriGlobalScopeProvider
{
	@Override
	protected IScope createLazyResourceScope(IScope parent, URI uri, IResourceDescriptions descriptions, EClass type, Predicate<IEObjectDescription> filter, boolean ignoreCase)
	{
		IResourceDescription description = descriptions.getResourceDescription(uri);

		if (description == null || description.isEmpty())
		{
			return parent;
		}

		return new SelectableBasedScopeExt(parent, description, filter, type, ignoreCase);
	}
}
