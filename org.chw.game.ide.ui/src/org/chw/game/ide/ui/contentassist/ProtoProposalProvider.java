package org.chw.game.ide.ui.contentassist;

import org.chw.game.ide.proto.Map;
import org.chw.game.ide.proto.MapField;
import org.chw.game.ide.proto.MapRef;
import org.chw.game.ide.proto.MessageComplexField;
import org.chw.game.ide.proto.MessageField;
import org.chw.game.ide.proto.MessageType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import com.google.inject.Inject;

public class ProtoProposalProvider extends AbstractProtoProposalProvider
{
	static final String[] innerAtts=new String[]{"repeated","required","optional"};
	static final String[] innerTypes=new String[]{"int32","uint32","sing32","int64","sint64","uint64","float","double","string","bool","bytes"};

	@Inject
	private IImageHelper imageHelper;
	
//	@Override
//	public void complete_FIELD_ATTR(EObject model, RuleCall ruleCall,ContentAssistContext context, ICompletionProposalAcceptor acceptor) 
//	{
//		completeBy(innerAtts,context,acceptor);
//	}
	
	@Override
	public void complete_FIELD_TYPE(EObject model, RuleCall ruleCall,ContentAssistContext context, ICompletionProposalAcceptor acceptor) 
	{
		completeBy(innerTypes,context,acceptor);
	}
	
	private void completeBy(String[] list,ContentAssistContext context,ICompletionProposalAcceptor acceptor)
	{
		for(int i=0;i<list.length;i++) 
		{
			String item=list[i];
			if(item.startsWith(context.getPrefix()))
			{
				acceptor.accept(createCompletionProposal(item,item,imageHelper.getImage("innerIcon.gif"), context));
			}
		}
	}
	
	@Override
	public void completeMapRef_Link(EObject model, Assignment assignment,ContentAssistContext context, ICompletionProposalAcceptor acceptor) 
	{
//		if(model instanceof MapField)
//		{
//			MapField field=(MapField)model;
//			if(field.getLinks()==null)
//			{
//				Map map=(Map)field.eContainer();
//				MessageType type=map.getBind();
//				if(type!=null)
//				{
//					for(MessageField item:type.getFields())
//					{
//						acceptor.accept(createCompletionProposal(item.getName(),item.getName(),imageHelper.getImage("innerIcon.gif"), context));
//					}
//				}
//			}
//		}
	}
	
	@Override
	public void complete_MapRef(EObject model, RuleCall ruleCall,ContentAssistContext context, ICompletionProposalAcceptor acceptor)
	{
		if(model instanceof MapRef)
		{
			MapRef ref=(MapRef)model;
			if(ref!=null)
			{
				if(ref.getLink() instanceof MessageComplexField)
				{
					MessageComplexField field=(MessageComplexField)ref.getLink();
					if(field.getType() instanceof MessageType)
					{
						MessageType type=(MessageType) field.getType();
						for(MessageField item:type.getFields())
						{
							acceptor.accept(createCompletionProposal(item.getName(),item.getName(),imageHelper.getImage("innerIcon.gif"), context));
						}
					}
				}
			}
		}
		else if(model instanceof MapField)
		{
			MapField field=(MapField)model;
			Map map=(Map)field.eContainer();
			MessageType type=map.getBind();
			if(type!=null)
			{
				for(MessageField item:type.getFields())
				{
					acceptor.accept(createCompletionProposal(item.getName(),item.getName(),imageHelper.getImage("innerIcon.gif"), context));
				}
			}
		}
	}
}
