package org.chw.game.ide.scoping;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SelectableBasedScope;

import com.google.common.base.Predicate;

public class SelectableBasedScopeExt extends SelectableBasedScope
{
	private QualifiedName qname;

	public SelectableBasedScopeExt(IScope outer, ISelectable selectable, Predicate<IEObjectDescription> filter, EClass type, boolean ignoreCase)
	{
		super(outer, selectable, filter, type, ignoreCase);

		Iterable<IEObjectDescription> desc = selectable.getExportedObjects();
		if (desc != null)
		{
			Iterator<IEObjectDescription> iterator = desc.iterator();
			while (iterator.hasNext())
			{
				qname = iterator.next().getQualifiedName();
				break;
			}
		}
	}

	@Override
	protected IEObjectDescription getSingleLocalElementByName(QualifiedName name)
	{
		if (name != null && name.getSegmentCount() == 1)
		{
			name = qname.append(name.getFirstSegment());
		}
		return super.getSingleLocalElementByName(name);
	}
}
