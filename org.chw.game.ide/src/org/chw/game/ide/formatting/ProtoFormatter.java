package org.chw.game.ide.formatting;

import org.chw.game.ide.services.ProtoGrammarAccess;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;

public class ProtoFormatter extends AbstractDeclarativeFormatter
{
	@Override
	protected void configureFormatting(FormattingConfig c)
	{
		ProtoGrammarAccess grammar = (ProtoGrammarAccess) getGrammarAccess();

		c.setLinewrap(1).before(grammar.getModelAccess().getGroup_0());
		c.setLinewrap(2).after(grammar.getModelAccess().getGroup_0());

		c.setLinewrap().before(grammar.getOptionInfoRule());
		c.setLinewrap(2).after(grammar.getOptionInfoRule());

		c.setLinewrap().before(grammar.getImportInfoRule());
		c.setLinewrap(2).after(grammar.getImportInfoRule());

		c.setLinewrap().before(grammar.getMessageTypeRule());
		c.setLinewrap(2).before(grammar.getMessageFieldRule());
		c.setLinewrap().after(grammar.getMessageFieldRule());
		c.setLinewrap(2).after(grammar.getMessageTypeRule());

		c.setLinewrap().before(grammar.getEnumTypeRule());
		c.setLinewrap(2).before(grammar.getEnumFieldRule());
		c.setLinewrap().after(grammar.getEnumFieldRule());
		c.setLinewrap(2).after(grammar.getEnumTypeRule());
		
		//Map前后换行
		c.setLinewrap().before(grammar.getMapRule());
		c.setLinewrap(2).after(grammar.getMapRule());
		
		//MapField前换行
		c.setLinewrap().before(grammar.getMapFieldRule());
		
		//;前不换行
		c.setNoLinewrap().before(grammar.getENDRule());
		
		//.前后无空格
		c.setNoSpace().before(grammar.getDOTRule());
		c.setNoSpace().after(grammar.getDOTRule());
		
		//<=前后加空格
		c.setSpace(" ").before(grammar.getFILETER_ARule());
		c.setSpace(" ").after(grammar.getFILETER_ARule());
		
		//<-前后加空格
		c.setSpace(" ").before(grammar.getFILETER_BRule());
		c.setSpace(" ").after(grammar.getFILETER_BRule());

		c.setLinewrap().before(grammar.getBRACE_LRule());
		// c.setLinewrap().after(grammar.getBRACE_LRule());
		c.setIndentationIncrement().after(grammar.getBRACE_LRule());
		c.setIndentationDecrement().before(grammar.getBRACE_RRule());
		c.setLinewrap().before(grammar.getBRACE_RRule());
		c.setLinewrap().after(grammar.getBRACE_RRule());

		c.setLinewrap().before(grammar.getCOMMENT_MLRule());
		c.setLinewrap().after(grammar.getCOMMENT_MLRule());

		c.setLinewrap().before(grammar.getCOMMENT_SLRule());
		c.setLinewrap().after(grammar.getCOMMENT_SLRule());
	}

}
