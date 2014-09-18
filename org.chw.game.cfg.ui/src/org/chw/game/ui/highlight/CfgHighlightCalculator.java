package org.chw.game.ui.highlight;

import org.chw.game.cfg.CfgPackage;
import org.chw.game.cfg.Enter;
import org.chw.game.cfg.Field;
import org.chw.game.cfg.FieldMeta;
import org.chw.game.cfg.InputDef;
import org.chw.game.cfg.PackDef;
import org.chw.game.cfg.Type;
import org.chw.game.cfg.XML2;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class CfgHighlightCalculator implements ISemanticHighlightingCalculator
{

	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor)
	{
		XML2 model = (XML2) resource.getParseResult().getRootNode().getSemanticElement();
		if (model != null)
		{
			for (INode node : NodeModelUtils.findNodesForFeature(model, CfgPackage.Literals.XML2__COMM))
			{
				acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.COMMENT_ID);
			}

			InputDef input = model.getInput();
			if (input != null)
			{
				for (INode node : NodeModelUtils.findNodesForFeature(input, CfgPackage.Literals.INPUT_DEF__COMMENT))
				{
					acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.COMMENT_ID);
				}

				for (INode node : NodeModelUtils.findNodesForFeature(input, CfgPackage.Literals.INPUT_DEF__INPUT_CHAR))
				{
					acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.KEYWORD_ID);
				}

				for (INode node : NodeModelUtils.findNodesForFeature(input, CfgPackage.Literals.INPUT_DEF__URL))
				{
					acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.STRING_ID);
				}
			}

			PackDef pack = model.getPack();
			if (pack != null)
			{
				for (INode node : NodeModelUtils.findNodesForFeature(pack, CfgPackage.Literals.PACK_DEF__COMMENT))
				{
					acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.COMMENT_ID);
				}

				for (INode node : NodeModelUtils.findNodesForFeature(pack, CfgPackage.Literals.PACK_DEF__PACK_CHAR))
				{
					acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.KEYWORD_ID);
				}
			}

			for (Type type : model.getTypes())
			{
				for (INode node : NodeModelUtils.findNodesForFeature(type, CfgPackage.Literals.TYPE__COMMENT))
				{
					acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.COMMENT_ID);
				}
				for (INode node : NodeModelUtils.findNodesForFeature(type, CfgPackage.Literals.XML2__COMM))
				{
					acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.COMMENT_ID);
				}
				for (INode node : NodeModelUtils.findNodesForFeature(type, CfgPackage.Literals.TYPE__PREFIX))
				{
					acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.KEYWORD_ID);
				}
				for (INode node : NodeModelUtils.findNodesForFeature(type, CfgPackage.Literals.TYPE__NAME))
				{
					acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.Type_Name);
				}

				Enter enter = type.getEnter();
				if (enter != null)
				{
					for (INode node : NodeModelUtils.findNodesForFeature(enter, CfgPackage.Literals.ENTER__PREFIX))
					{
						acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.KEYWORD_ID);
					}
					for (INode node : NodeModelUtils.findNodesForFeature(enter, CfgPackage.Literals.ENTER__ROOT_PATH))
					{
						acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.STRING_ID);
					}
				}

				for (Field field : type.getFields())
				{
					for (INode node : NodeModelUtils.findNodesForFeature(field, CfgPackage.Literals.FIELD__COMMENT))
					{
						acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.COMMENT_ID);
					}

					for (INode node : NodeModelUtils.findNodesForFeature(field, CfgPackage.Literals.FIELD__TYPE))
					{
						acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.Field_Type);
					}
					for (INode node : NodeModelUtils.findNodesForFeature(field, CfgPackage.Literals.FIELD__FIELD_NAME))
					{
						acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.Field_Name);
					}
					for (INode node : NodeModelUtils.findNodesForFeature(field, CfgPackage.Literals.FIELD__NODE_PATH))
					{
						acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.Field_Path);
					}

					FieldMeta meta = field.getMeta();
					for (INode node : NodeModelUtils.findNodesForFeature(meta, CfgPackage.Literals.FIELD_META__PREFIX))
					{
						acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.KEYWORD_ID);
					}
					for (INode node : NodeModelUtils.findNodesForFeature(meta, CfgPackage.Literals.FIELD_META__PARAMS))
					{
						acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.Field_Param);
					}
				}

				for (INode node : NodeModelUtils.findNodesForFeature(type, CfgPackage.Literals.TYPE__COMM))
				{
					acceptor.addPosition(node.getOffset(), node.getLength(), CfgHighlight.COMMENT_ID);
				}
			}
		}
	}
}
