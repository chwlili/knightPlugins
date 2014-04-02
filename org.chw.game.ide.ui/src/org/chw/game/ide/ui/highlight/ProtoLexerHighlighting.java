package org.chw.game.ide.ui.highlight;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

public class ProtoLexerHighlighting extends DefaultAntlrTokenToAttributeIdMapper
{
	@Override
	protected String calculateId(String tokenName, int tokenType) 
	{
		if(tokenName.equals("RULE_COMMENT_SL") || tokenName.equals("RULE_COMMENT_ML"))
		{
			return ProtoHighlight.COMMENT_ID;
		}
//		if(tokenName.equals(""))
//		{
//			return ProtoHighlight.STRING_ID;
//		}
		return super.calculateId(tokenName, tokenType);
	}
}
