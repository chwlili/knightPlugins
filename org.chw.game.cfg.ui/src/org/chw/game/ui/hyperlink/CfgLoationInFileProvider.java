package org.chw.game.ui.hyperlink;

import org.chw.game.cfg.CfgPackage;
import org.chw.game.cfg.Field;
import org.chw.game.cfg.HashType;
import org.chw.game.cfg.ListType;
import org.chw.game.cfg.NativeType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.resource.DefaultLocationInFileProvider;

public class CfgLoationInFileProvider extends DefaultLocationInFileProvider
{
	protected EStructuralFeature getIdentifierFeature(EObject obj) 
	{
		EStructuralFeature result=super.getIdentifierFeature(obj);
		if(obj instanceof Field)
		{
			result=CfgPackage.Literals.FIELD__FIELD_NAME;
		}
		if(obj instanceof NativeType)
		{
			result=CfgPackage.Literals.NATIVE_TYPE__TYPE;
		}
		if(obj instanceof ListType)
		{
			result=CfgPackage.Literals.LIST_TYPE__TYPE;
		}
		if(obj instanceof HashType)
		{
			result=CfgPackage.Literals.HASH_TYPE__TYPE;
		}
		
		return result;
	}
}
