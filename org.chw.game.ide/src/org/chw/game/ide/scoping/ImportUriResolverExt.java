package org.chw.game.ide.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;

public class ImportUriResolverExt extends ImportUriResolver
{
	@Override
	public String resolve(EObject object)
	{
		String uri = super.resolve(object);
		if (uri != null && !uri.isEmpty())
		{
			if (uri.startsWith("\""))
			{
				uri = uri.substring(1, uri.length() - 1);
			}

			uri = object.eResource().getURI().trimSegments(3).toString() + "/" + uri;
		}
		return uri;
	}
}
