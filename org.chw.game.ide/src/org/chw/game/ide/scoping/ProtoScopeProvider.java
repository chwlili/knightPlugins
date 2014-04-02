package org.chw.game.ide.scoping;

import java.util.ArrayList;

import org.chw.game.ide.proto.Map;
import org.chw.game.ide.proto.MapField;
import org.chw.game.ide.proto.MapRef;
import org.chw.game.ide.proto.MessageComplexField;
import org.chw.game.ide.proto.MessageType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;

public class ProtoScopeProvider extends AbstractDeclarativeScopeProvider
{
	@Override
	public IScope getScope(EObject context, EReference reference)
	{
		if (context instanceof MapRef)
		{
			MessageType root = null;

			if (context.eContainer() instanceof MapField)
			{
				MapField field = (MapField) context.eContainer();
				Map map = (Map) field.eContainer();
				root = map.getBind();
			}
			else if (context.eContainer() instanceof MapRef)
			{
				MapRef ref = (MapRef) context.eContainer();
				if (ref.getLink() instanceof MessageComplexField)
				{
					MessageComplexField field = (MessageComplexField) ref.getLink();
					if (field.getType() instanceof MessageType)
					{
						root = (MessageType) field.getType();
					}
				}
			}

			if (root != null)
			{
				ArrayList<IEObjectDescription> list = new ArrayList<IEObjectDescription>();
				for (int i = 0; i < root.getFields().size(); i++)
				{
					list.add(EObjectDescription.create(root.getFields().get(i).getName(), root.getFields().get(i)));
				}
				return new SimpleScope(list, true);
			}
			return IScope.NULLSCOPE;
		}
		return super.getScope(context, reference);
	}
}
