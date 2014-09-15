package org.chw.game.ui.folder;

import org.chw.game.cfg.CfgPackage;
import org.chw.game.cfg.Type;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionAcceptor;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.TextRegion;

public class CfgFolder extends DefaultFoldingRegionProvider
{
	@Override
	protected boolean isHandled(EObject eObject)
	{
		if (eObject instanceof Type)
		{
			return super.isHandled(eObject);
		}

		return false;
	}

	protected void computeObjectFolding(EObject eObject, IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor)
	{
		if (eObject instanceof Type)
		{
			Type type = (Type) eObject;

			int from = -1;
			int to = -1;

			for (INode node : NodeModelUtils.findNodesForFeature(type, CfgPackage.Literals.TYPE__PREFIX))
			{
				from = node.getOffset();
				break;
			}

			INode last = NodeModelUtils.findActualNodeFor(eObject);
			if (last != null)
			{
				to = last.getOffset() + last.getLength();
			}

			if (from != -1 && to != -1)
			{
				foldingRegionAcceptor.accept(from, to - from, new TextRegion(from, to - from));
			}

			for (INode node : NodeModelUtils.findNodesForFeature(type, CfgPackage.Literals.TYPE__COMMENT))
			{
				foldingRegionAcceptor.accept(node.getOffset(), node.getLength(), new TextRegion(node.getOffset(), node.getLength()));
				break;
			}
		}
		else
		{
			super.computeObjectFolding(eObject, foldingRegionAcceptor);
		}
	}
}
