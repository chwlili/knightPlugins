/*
 * generated by Xtext
 */
package org.chw.game.formatting;

import com.google.inject.Inject;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.chw.game.services.CfgGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting on how and
 * when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an
 * example
 */
public class CfgFormatter extends AbstractDeclarativeFormatter
{

	@Inject
	private CfgGrammarAccess grammarAccess;

	@Override
	protected void configureFormatting(FormattingConfig c)
	{
		c.setLinewrap(2).after(grammarAccess.getPackDefRule());

		c.setLinewrap(2).after(grammarAccess.getInputDefRule());

		c.setLinewrap().before(grammarAccess.getTypeCommentRule());
		c.setLinewrap().after(grammarAccess.getTypeCommentRule());

		c.setLinewrap().before(grammarAccess.getFieldCommentRule());
		c.setLinewrap().after(grammarAccess.getFieldCommentRule());

		c.setLinewrap().before(grammarAccess.getMetaRule());
		c.setLinewrap().after(grammarAccess.getMetaRule());

		c.setLinewrap().before(grammarAccess.getOtherComentRule());
		c.setLinewrap(2).after(grammarAccess.getOtherComentRule());

		// type
		c.setLinewrap(2).after(grammarAccess.getTypeRule());

		// typeField
		c.setLinewrap().before(grammarAccess.getFieldRule());
		c.setLinewrap(2).after(grammarAccess.getFieldRule());

		// enum
		c.setLinewrap(2).after(grammarAccess.getEnumRule());

		// enumField
		c.setLinewrap().before(grammarAccess.getEnumFieldRule());
		c.setLinewrap(2).after(grammarAccess.getEnumFieldRule());

		c.setLinewrap().before(grammarAccess.getC_BRACE_LRule());
		c.setLinewrap().before(grammarAccess.getC_BRACE_RRule());

		c.setIndentationIncrement().after(grammarAccess.getC_BRACE_LRule());
		c.setIndentationDecrement().before(grammarAccess.getC_BRACE_RRule());

		c.setNoSpace().before(grammarAccess.getC_ANGLE_LRule());
		c.setNoSpace().after(grammarAccess.getC_ANGLE_LRule());
		c.setNoSpace().before(grammarAccess.getC_ANGLE_RRule());

		c.setNoSpace().after(grammarAccess.getC_BRACKET_LRule());
		c.setNoSpace().before(grammarAccess.getC_BRACKET_RRule());
		c.setNoSpace().before(grammarAccess.getC_PAREN_LRule());
		c.setNoSpace().after(grammarAccess.getC_PAREN_LRule());
		c.setNoSpace().before(grammarAccess.getC_PAREN_RRule());
	}
}
