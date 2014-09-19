package org.chw.game.ui.hyperlink;

import org.chw.game.cfg.CfgPackage;
import org.chw.game.cfg.EnumField;
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
		else if (obj instanceof org.chw.game.cfg.Enum)
		{
			result = CfgPackage.Literals.ENUM__NAME;
		}
		else if (obj instanceof EnumField)
		{
			result = CfgPackage.Literals.ENUM_FIELD__FIELD_NAME;
		}

		return result;
	}
}
