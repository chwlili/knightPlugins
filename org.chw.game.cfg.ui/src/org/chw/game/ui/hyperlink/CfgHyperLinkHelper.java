package org.chw.game.ui.hyperlink;

import org.chw.game.cfg.CfgPackage;
import org.chw.game.cfg.Field;
import org.chw.game.cfg.FieldMetaKey;
import org.chw.game.cfg.FieldType;
import org.chw.game.cfg.Type;
import org.chw.game.cfg.XML2;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Region;
import org.eclipse.xtext.common.types.xtext.ui.TypeAwareHyperlinkHelper;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;

public class CfgHyperLinkHelper extends TypeAwareHyperlinkHelper
{
	@Override
	public void createHyperlinksByOffset(XtextResource resource, int offset, IHyperlinkAcceptor acceptor)
	{
		super.createHyperlinksByOffset(resource, offset, acceptor);

		IParseResult parseResult = resource.getParseResult();
		if (parseResult == null)
		{
			return;
		}

		ILeafNode astNode = NodeModelUtils.findLeafNodeAtOffset(parseResult.getRootNode(), offset);
		if (astNode == null)
		{
			return;
		}

		EObject emfNode = NodeModelUtils.findActualSemanticObjectFor(astNode);
		if (emfNode == null)
		{
			return;
		}

		if (emfNode instanceof FieldMetaKey)
		{
			FieldMetaKey param = (FieldMetaKey) emfNode;
			for (INode leaf : NodeModelUtils.findNodesForFeature(param, CfgPackage.Literals.FIELD_META_KEY__FIELD_NAME))
			{
				Field currField = (Field) NodeModelUtils.findActualNodeFor(param).getParent().getParent().getSemanticElement();
				String typeName = currField.getType().getType();

				XML2 model = (XML2) parseResult.getRootNode().getSemanticElement();
				for (Type def : model.getTypes())
				{
					if (def.getName().equals(typeName))
					{
						for (Field field : def.getFields())
						{
							if (field.getFieldName().equals(param.getFieldName()))
							{
								createHyperlinksTo(resource, new Region(leaf.getOffset(), leaf.getLength()), field, acceptor);
								return;
							}
						}
					}
				}
			}
		}

		if (emfNode instanceof FieldType)
		{
			FieldType field = (FieldType) emfNode;
			for (INode leaf : NodeModelUtils.findNodesForFeature(field, CfgPackage.Literals.FIELD_TYPE__TYPE))
			{
				String type = field.getType();
				if (type.equals("Boolean") || type.equals("int") || type.equals("uint") || type.equals("Number") || type.equals("String"))
				{
					createHyperlinksTo(resource, new Region(leaf.getOffset(), leaf.getLength()), emfNode, acceptor);
					return;
				}
				else
				{
					XML2 model = (XML2) parseResult.getRootNode().getSemanticElement();
					for (Type def : model.getTypes())
					{
						if (def.getName().equals(type))
						{
							createHyperlinksTo(resource, new Region(leaf.getOffset(), leaf.getLength()), def, acceptor);
							return;
						}
					}
				}
			}
		}
	}
}
