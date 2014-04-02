package org.chw.game.ide.ui.hyperlink;

import org.chw.game.ide.proto.ImportInfo;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.resource.DefaultLocationInFileProvider;

public class ProtoLoationInFileProvider extends DefaultLocationInFileProvider
{
	protected EStructuralFeature getIdentifierFeature(EObject obj) 
	{
		EStructuralFeature result=super.getIdentifierFeature(obj);
		if(result==null && obj instanceof ImportInfo)
		{
			result=obj.eClass().getEStructuralFeature("importURI");
		}
		return result;
	}
}
