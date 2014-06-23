package org.chw.game.ui.highlight;

import org.chw.game.cfg.CfgPackage;
import org.chw.game.cfg.Field;
import org.chw.game.cfg.Input;
import org.chw.game.cfg.Type;
import org.chw.game.cfg.XML2;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class CfgHighlightCalculator implements ISemanticHighlightingCalculator
{

	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor)
	{
		XML2 model = (XML2) resource.getParseResult().getRootNode().getSemanticElement();
		if (model != null)
		{
			for(Type type:model.getTypes())
			{
				for(INode node : NodeModelUtils.findNodesForFeature(type,CfgPackage.Literals.TYPE__COMM))
				{
					acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.COMMENT_ID);
				}
				for(INode node : NodeModelUtils.findNodesForFeature(type,CfgPackage.Literals.TYPE__PREFIX))
				{
					acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.KEYWORD_ID);
				}
				for(INode node : NodeModelUtils.findNodesForFeature(type,CfgPackage.Literals.TYPE__NAME))
				{
					acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.Type_Name);
				}
				
				Input input=type.getInput();
				if(input!=null)
				{
					for(INode node : NodeModelUtils.findNodesForFeature(input,CfgPackage.Literals.INPUT__PREFIX))
					{
						acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.KEYWORD_ID);
					}
					for(INode node : NodeModelUtils.findNodesForFeature(input,CfgPackage.Literals.INPUT__FILE_PATH))
					{
						acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.STRING_ID);
					}
					for(INode node : NodeModelUtils.findNodesForFeature(input,CfgPackage.Literals.INPUT__NODE_PATH))
					{
						acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.STRING_ID);
					}
				}
				
				for(Field field:type.getFields())
				{
					for(INode node : NodeModelUtils.findNodesForFeature(field,CfgPackage.Literals.FIELD__COMM))
					{
						acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.COMMENT_ID);
					}
					
					for(INode node : NodeModelUtils.findNodesForFeature(field.getType(),CfgPackage.Literals.NATIVE_TYPE__TYPE))
					{
						acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.Field_Type);
					}
					for(INode node : NodeModelUtils.findNodesForFeature(field.getType(),CfgPackage.Literals.LIST_TYPE__TYPE))
					{
						acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.Field_Type);
					}
					for(INode node : NodeModelUtils.findNodesForFeature(field.getType(),CfgPackage.Literals.HASH_TYPE__TYPE))
					{
						acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.Field_Type);
					}
					for(INode node : NodeModelUtils.findNodesForFeature(field.getType(),CfgPackage.Literals.HASH_TYPE__PARAMS))
					{
						acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.Field_Param);
					}
					for(INode node : NodeModelUtils.findNodesForFeature(field,CfgPackage.Literals.FIELD__FIELD_NAME))
					{
						acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.Field_Name);
					}
					for(INode node : NodeModelUtils.findNodesForFeature(field,CfgPackage.Literals.FIELD__NODE_PATH))
					{
						acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.Field_Path);
					}
				}
			}
		}
	}
}
