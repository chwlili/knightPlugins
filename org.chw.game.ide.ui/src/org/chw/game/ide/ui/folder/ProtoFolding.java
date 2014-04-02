package org.chw.game.ide.ui.folder;

import org.chw.game.ide.proto.EnumType;
import org.chw.game.ide.proto.MessageType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider;

public class ProtoFolding extends DefaultFoldingRegionProvider
{
	@Override
	protected boolean isHandled(EObject eObject) 
	{
		if(eObject instanceof MessageType)
		{
			return super.isHandled(eObject);
		}
		else if(eObject instanceof EnumType)
		{
			return super.isHandled(eObject);
		}
		
		return false;
	}
}
