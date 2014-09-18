package org.chw.game.ui.hyperlink;

import org.chw.game.cfg.CfgPackage;
import org.chw.game.cfg.Field;
import org.chw.game.cfg.FieldType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.resource.DefaultLocationInFileProvider;

public class CfgLoationInFileProvider extends DefaultLocationInFileProvider
{
	protected EStructuralFeature getIdentifierFeature(EObject obj)
	{
		EStructuralFeature result = super.getIdentifierFeature(obj);
		if (obj instanceof Field)
		{
			result = CfgPackage.Literals.FIELD__FIELD_NAME;
		}
		else if (obj instanceof FieldType)
		{
			result = CfgPackage.Literals.FIELD_TYPE__TYPE;
		}

		return result;
	}
}
