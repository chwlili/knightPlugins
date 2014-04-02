package org.chw.game.ide.ui.hyperlink;

import org.chw.game.ide.proto.ImportInfo;
import org.chw.game.ide.proto.ProtoPackage;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.text.Region;
import org.eclipse.xtext.common.types.xtext.ui.TypeAwareHyperlinkHelper;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;

public class ProtoHyperLinkHelper extends TypeAwareHyperlinkHelper
{
	@Override
	public void createHyperlinksByOffset(XtextResource resource, int offset,IHyperlinkAcceptor acceptor) 
	{
		super.createHyperlinksByOffset(resource, offset, acceptor);
		
		IParseResult parseResult = resource.getParseResult();
		if (parseResult != null) 
		{
			ILeafNode leaf = NodeModelUtils.findLeafNodeAtOffset(parseResult.getRootNode(), offset);
			if(leaf!=null)
			{
				EObject node=NodeModelUtils.findActualSemanticObjectFor(leaf);
				if(node!=null)
				{
					if(node instanceof ImportInfo)
					{
						ImportInfo include=(ImportInfo)node;
						for(INode uri:NodeModelUtils.findNodesForFeature(include, ProtoPackage.Literals.IMPORT_INFO__IMPORT_URI))
						{
							if(offset>uri.getTotalOffset() && offset<uri.getTotalEndOffset())
							{
								EObject to=include;
								
								String path=include.getImportURI();
								path=resource.getURI().trimSegments(3)+"/"+path.substring(1,path.length()-1);
								
								Resource res=resource.getResourceSet().getResource(URI.createURI(path), true);
								if(res!=null)
								{
									TreeIterator<EObject> a=res.getAllContents();
									if(a.hasNext())
									{
										to=a.next();
									}
								}
								createHyperlinksTo(resource, new Region(uri.getOffset()+1,uri.getLength()-2), to, acceptor);
							}
							break;
						}
					}
				}
			}
		}
	}
}
