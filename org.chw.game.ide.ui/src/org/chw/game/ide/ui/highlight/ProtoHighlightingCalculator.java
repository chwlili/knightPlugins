package org.chw.game.ide.ui.highlight;

import org.chw.game.ide.proto.Element;
import org.chw.game.ide.proto.EnumField;
import org.chw.game.ide.proto.EnumType;
import org.chw.game.ide.proto.Map;
import org.chw.game.ide.proto.MapField;
import org.chw.game.ide.proto.MessageField;
import org.chw.game.ide.proto.MessageSimpleField;
import org.chw.game.ide.proto.MessageType;
import org.chw.game.ide.proto.Model;
import org.chw.game.ide.proto.ProtoPackage;
import org.chw.game.ide.proto.Type;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class ProtoHighlightingCalculator implements ISemanticHighlightingCalculator
{

	// private void printNode(INode node,int indent,StringBuilder out)
	// {
	// StringBuilder sb=new StringBuilder();
	// for(int i=0;i<indent;i++)
	// {
	// sb.append("    ");
	// }
	// String prefix=sb.toString();
	//
	// out.append(prefix+"\n");
	// out.append(prefix+"<\n");
	// out.append(prefix+"this("+(node instanceof
	// ICompositeNode)+"):"+node+"\n");
	// out.append(prefix+"grammar:"+node.getGrammarElement()+"\n");
	// out.append(prefix+"semalll("+node.hasDirectSemanticElement()+"):"+node.getSemanticElement()+"\n");
	// out.append(prefix+"text :"+node.getText().replaceAll("\\n",
	// "\n"+prefix)+"\n");//.replaceAll("\\n", "\n"+prefix));
	// out.append(prefix+">\n");
	//
	// if(node instanceof ICompositeNode)
	// {
	// ICompositeNode nodeBox=(ICompositeNode)node;
	//
	// BidiIterator<INode> nodes=nodeBox.getChildren().iterator();
	// while(nodes.hasNext())
	// {
	// INode child=nodes.next();
	//
	// printNode(child,indent+1,out);
	// }
	// }
	// }

	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor)
	{
		if (resource == null || resource.getParseResult() == null)
		{
			return;
		}

		// StringBuilder sbs=new StringBuilder();
		// printNode(resource.getParseResult().getRootNode(),0,sbs);
		// System.out.println(sbs.toString());

		Model model = (Model) resource.getParseResult().getRootNode().getSemanticElement();
		if (model != null)
		{
			for (INode node : NodeModelUtils.findNodesForFeature(model, ProtoPackage.Literals.MODEL__NAME))
			{
				node = node.getPreviousSibling();
				acceptor.addPosition(node.getOffset(), node.getLength(), ProtoHighlight.KEYWORD_ID);
			}
			for (INode node : NodeModelUtils.findNodesForFeature(model, ProtoPackage.Literals.MODEL__IMPORTS))
			{
				for (INode value : NodeModelUtils.findNodesForFeature(node.getSemanticElement(), ProtoPackage.Literals.IMPORT_INFO__IMPORT_URI))
				{
					acceptor.addPosition(value.getOffset(), value.getLength(), ProtoHighlight.STRING_ID);

					value = value.getPreviousSibling();
					while ((value instanceof ILeafNode) && ((ILeafNode) value).isHidden())
					{
						value = value.getPreviousSibling();
					}
					acceptor.addPosition(value.getOffset(), value.getLength(), ProtoHighlight.KEYWORD_ID);
				}
			}
			for (INode node : NodeModelUtils.findNodesForFeature(model, ProtoPackage.Literals.MODEL__OPTIONS))
			{
				for (INode name : NodeModelUtils.findNodesForFeature(node.getSemanticElement(), ProtoPackage.Literals.OPTION_INFO__NAME))
				{
					acceptor.addPosition(name.getOffset(), name.getLength(), ProtoHighlight.DEFAULT_ID);

					name = name.getPreviousSibling();
					while ((name instanceof ILeafNode) && ((ILeafNode) name).isHidden())
					{
						name = name.getPreviousSibling();
					}
					acceptor.addPosition(name.getOffset(), name.getLength(), ProtoHighlight.KEYWORD_ID);
				}
				for (INode value : NodeModelUtils.findNodesForFeature(node.getSemanticElement(), ProtoPackage.Literals.OPTION_INFO__VALUE))
				{
					acceptor.addPosition(value.getOffset(), value.getLength(), ProtoHighlight.STRING_ID);
				}
			}

			for (Element type : model.getElements())
			{
				measureTypes(type, acceptor);
			}
		}
	}

	private void measureTypes(Element type, IHighlightedPositionAcceptor acceptor)
	{
		for (INode node : NodeModelUtils.findNodesForFeature(type, ProtoPackage.Literals.ELEMENT__NAME))
		{
			acceptor.addPosition(node.getOffset(), node.getLength(), ProtoHighlight.Message_Name);

			node = node.getPreviousSibling();
			while ((node instanceof ILeafNode) && ((ILeafNode) node).isHidden())
			{
				node = node.getPreviousSibling();
			}
			acceptor.addPosition(node.getOffset(), node.getLength(), ProtoHighlight.KEYWORD_ID);
		}

		if (type instanceof MessageType)
		{
			for (MessageField field : ((MessageType) type).getFields())
			{
				for (INode node : NodeModelUtils.findNodesForFeature(field, ProtoPackage.Literals.MESSAGE_FIELD__ATTR))
				{
					acceptor.addPosition(node.getOffset(), node.getLength(), ProtoHighlight.Message_Field_Attribute);
				}
				if (field instanceof MessageSimpleField)
				{
					for (INode node : NodeModelUtils.findNodesForFeature(field, ProtoPackage.Literals.MESSAGE_SIMPLE_FIELD__TYPE))
					{
						acceptor.addPosition(node.getOffset(), node.getLength(), ProtoHighlight.Message_Field_Type);
					}
				}
				else
				{
					for (INode node : NodeModelUtils.findNodesForFeature(field, ProtoPackage.Literals.MESSAGE_COMPLEX_FIELD__TYPE))
					{
						acceptor.addPosition(node.getOffset(), node.getLength(), ProtoHighlight.Message_Field_Type_Ext);
					}
				}
				for (INode node : NodeModelUtils.findNodesForFeature(field, ProtoPackage.Literals.MESSAGE_FIELD__NAME))
				{
					acceptor.addPosition(node.getOffset(), node.getLength(), ProtoHighlight.Message_Field_Name);
				}
				for (INode node : NodeModelUtils.findNodesForFeature(field, ProtoPackage.Literals.MESSAGE_FIELD__INDEX))
				{
					acceptor.addPosition(node.getOffset(), node.getLength(), ProtoHighlight.Message_Field_Index);
				}
			}

			for (Type innerType : ((MessageType) type).getTypes())
			{
				measureTypes(innerType, acceptor);
			}
		}
		else if (type instanceof EnumType)
		{
			for (EnumField field : ((EnumType) type).getFields())
			{
				for (INode node : NodeModelUtils.findNodesForFeature(field, ProtoPackage.Literals.ENUM_FIELD__NAME))
				{
					acceptor.addPosition(node.getOffset(), node.getLength(), ProtoHighlight.Enum_Field_Name);
				}
				for (INode node : NodeModelUtils.findNodesForFeature(field, ProtoPackage.Literals.ENUM_FIELD__INDEX))
				{
					acceptor.addPosition(node.getOffset(), node.getLength(), ProtoHighlight.Enum_field_Index);
				}
			}
		}
		else if (type instanceof Map)
		{
			for (INode node : NodeModelUtils.findNodesForFeature(type, ProtoPackage.Literals.MAP__BIND))
			{
				acceptor.addPosition(node.getOffset(), node.getLength(), ProtoHighlight.Message_Field_Type_Ext);
			}

			for (MapField field : ((Map) type).getFields())
			{
				for (INode node : NodeModelUtils.findNodesForFeature(field, ProtoPackage.Literals.MAP_FIELD__ATTR))
				{
					acceptor.addPosition(node.getOffset(), node.getLength(), ProtoHighlight.Message_Field_Attribute);
				}
				for (INode node : NodeModelUtils.findNodesForFeature(field, ProtoPackage.Literals.MAP_FIELD__NAME))
				{
					acceptor.addPosition(node.getOffset(), node.getLength(), ProtoHighlight.Message_Field_Name);
				}
			}
		}
	}
}
