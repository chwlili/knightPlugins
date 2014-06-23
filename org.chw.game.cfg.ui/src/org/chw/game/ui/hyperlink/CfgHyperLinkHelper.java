package org.chw.game.ui.hyperlink;

import org.chw.game.cfg.CfgPackage;
import org.chw.game.cfg.Field;
import org.chw.game.cfg.HashType;
import org.chw.game.cfg.ListType;
import org.chw.game.cfg.NativeType;
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

		if (emfNode instanceof NativeType)
		{
			NativeType field = (NativeType) emfNode;
			for (INode leaf : NodeModelUtils.findNodesForFeature(field, CfgPackage.Literals.NATIVE_TYPE__TYPE))
			{
				String type = field.getType();
				if (type.equals("boolean") || type.equals("int") || type.equals("uint") || type.equals("Number") || type.equals("String"))
				{
					createHyperlinksTo(resource, new Region(leaf.getOffset(), leaf.getLength()), emfNode, acceptor);
				}
				else
				{
					XML2 model = (XML2) parseResult.getRootNode().getSemanticElement();
					for (Type def : model.getTypes())
					{
						if (def.getName().equals(type))
						{
							emfNode = def;
							break;
						}
					}
					createHyperlinksTo(resource, new Region(leaf.getOffset(), leaf.getLength()), emfNode, acceptor);
				}
				break;
			}
		}
		else if (emfNode instanceof ListType)
		{
			ListType field = (ListType) emfNode;
			for (INode leaf : NodeModelUtils.findNodesForFeature(field, CfgPackage.Literals.LIST_TYPE__TYPE))
			{
				if(offset<leaf.getOffset() || leaf.getOffset()+leaf.getLength()<offset)
				{
					return;
				}
				
				emfNode = leaf.getSemanticElement();
				
				String type = field.getType();
				if (type.equals("boolean") || type.equals("int") || type.equals("uint") || type.equals("Number") || type.equals("String"))
				{
					createHyperlinksTo(resource, new Region(leaf.getOffset(), leaf.getLength()), emfNode, acceptor);
				}
				else
				{
					XML2 model = (XML2) parseResult.getRootNode().getSemanticElement();
					for (Type def : model.getTypes())
					{
						if (def.getName().equals(type))
						{
							emfNode = def;
							break;
						}
					}
					createHyperlinksTo(resource, new Region(leaf.getOffset(), leaf.getLength()), emfNode, acceptor);
				}
				break;
			}
		}
		else if(emfNode instanceof HashType)
		{
			HashType field = (HashType) emfNode;
			for (INode leaf : NodeModelUtils.findNodesForFeature(field, CfgPackage.Literals.HASH_TYPE__TYPE))
			{
				if(offset<leaf.getOffset() || leaf.getOffset()+leaf.getLength()<offset)
				{
					break;
				}
				
				emfNode = leaf.getSemanticElement();
				
				String type = field.getType();
				if (type.equals("boolean") || type.equals("int") || type.equals("uint") || type.equals("Number") || type.equals("String"))
				{
					createHyperlinksTo(resource, new Region(leaf.getOffset(), leaf.getLength()), emfNode, acceptor);
				}
				else
				{
					XML2 model = (XML2) parseResult.getRootNode().getSemanticElement();
					for (Type def : model.getTypes())
					{
						if (def.getName().equals(type))
						{
							emfNode = def;
							break;
						}
					}
					createHyperlinksTo(resource, new Region(leaf.getOffset(), leaf.getLength()), emfNode, acceptor);
				}
				break;
			}

			for (INode leaf : NodeModelUtils.findNodesForFeature(field, CfgPackage.Literals.HASH_TYPE__PARAMS))
			{
				if(offset<leaf.getOffset() || leaf.getOffset()+leaf.getLength()<offset)
				{
					continue;
				}

				String type = field.getType();
				
				emfNode = leaf.getSemanticElement();
				
				XML2 model = (XML2) parseResult.getRootNode().getSemanticElement();
				for (Type def : model.getTypes())
				{
					if (def.getName().equals(type))
					{
						for(Field linkField:def.getFields())
						{
							if(leaf.getText().equals(linkField.getFieldName()))
							{
								emfNode = linkField;
								break;
							}
						}
						break;
					}
				}
				createHyperlinksTo(resource, new Region(leaf.getOffset(), leaf.getLength()), emfNode, acceptor);
				break;
			}
		}

		// ImportInfo include=(ImportInfo)node;
		// for(INode uri:NodeModelUtils.findNodesForFeature(include,
		// ProtoPackage.Literals.IMPORT_INFO__IMPORT_URI))
		// {
		// if(offset>uri.getTotalOffset() && offset<uri.getTotalEndOffset())
		// {
		// EObject to=include;
		//
		// String path=include.getImportURI();
		// path=resource.getURI().trimSegments(3)+"/"+path.substring(1,path.length()-1);
		//
		// Resource
		// res=resource.getResourceSet().getResource(URI.createURI(path), true);
		// if(res!=null)
		// {
		// TreeIterator<EObject> a=res.getAllContents();
		// if(a.hasNext())
		// {
		// to=a.next();
		// }
		// }
		// createHyperlinksTo(resource, new
		// Region(uri.getOffset()+1,uri.getLength()-2), to, acceptor);
		// }
		// break;
		// }
	}
}
