package org.chw.game.ide.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.chw.game.ide.services.ProtoGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class ProtoSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ProtoGrammarAccess grammarAccess;
	protected AbstractElementAlias match_EnumFieldOpt_ENDTerminalRuleCall_4_q;
	protected AbstractElementAlias match_EnumField_ENDTerminalRuleCall_3_q;
	protected AbstractElementAlias match_EnumType_ENDTerminalRuleCall_5_q;
	protected AbstractElementAlias match_ImportInfo_ENDTerminalRuleCall_2_q;
	protected AbstractElementAlias match_MapField_ENDTerminalRuleCall_5_q;
	protected AbstractElementAlias match_Map_ENDTerminalRuleCall_7_q;
	protected AbstractElementAlias match_MessageComplexField_ENDTerminalRuleCall_6_q;
	protected AbstractElementAlias match_MessageComplexField_MessageFieldDefaultParserRuleCall_5_q;
	protected AbstractElementAlias match_MessageSimpleField_ENDTerminalRuleCall_6_q;
	protected AbstractElementAlias match_MessageSimpleField_MessageFieldDefaultParserRuleCall_5_q;
	protected AbstractElementAlias match_MessageType_ENDTerminalRuleCall_5_q;
	protected AbstractElementAlias match_Model_ENDTerminalRuleCall_0_2_q;
	protected AbstractElementAlias match_OptionInfo_ENDTerminalRuleCall_4_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ProtoGrammarAccess) access;
		match_EnumFieldOpt_ENDTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getEnumFieldOptAccess().getENDTerminalRuleCall_4());
		match_EnumField_ENDTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getEnumFieldAccess().getENDTerminalRuleCall_3());
		match_EnumType_ENDTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getEnumTypeAccess().getENDTerminalRuleCall_5());
		match_ImportInfo_ENDTerminalRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getImportInfoAccess().getENDTerminalRuleCall_2());
		match_MapField_ENDTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getMapFieldAccess().getENDTerminalRuleCall_5());
		match_Map_ENDTerminalRuleCall_7_q = new TokenAlias(false, true, grammarAccess.getMapAccess().getENDTerminalRuleCall_7());
		match_MessageComplexField_ENDTerminalRuleCall_6_q = new TokenAlias(false, true, grammarAccess.getMessageComplexFieldAccess().getENDTerminalRuleCall_6());
		match_MessageComplexField_MessageFieldDefaultParserRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getMessageComplexFieldAccess().getMessageFieldDefaultParserRuleCall_5());
		match_MessageSimpleField_ENDTerminalRuleCall_6_q = new TokenAlias(false, true, grammarAccess.getMessageSimpleFieldAccess().getENDTerminalRuleCall_6());
		match_MessageSimpleField_MessageFieldDefaultParserRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getMessageSimpleFieldAccess().getMessageFieldDefaultParserRuleCall_5());
		match_MessageType_ENDTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getMessageTypeAccess().getENDTerminalRuleCall_5());
		match_Model_ENDTerminalRuleCall_0_2_q = new TokenAlias(false, true, grammarAccess.getModelAccess().getENDTerminalRuleCall_0_2());
		match_OptionInfo_ENDTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getOptionInfoAccess().getENDTerminalRuleCall_4());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getBRACE_LRule())
			return getBRACE_LToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getBRACE_RRule())
			return getBRACE_RToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDOTRule())
			return getDOTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getENDRule())
			return getENDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getENUMRule())
			return getENUMToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEQUALSRule())
			return getEQUALSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFILETER_ARule())
			return getFILETER_AToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFILETER_BRule())
			return getFILETER_BToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIMPORTRule())
			return getIMPORTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMAP_KINDRule())
			return getMAP_KINDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMESSAGERule())
			return getMESSAGEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMessageFieldDefaultRule())
			return getMessageFieldDefaultToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOPTIONRule())
			return getOPTIONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPACKAGERule())
			return getPACKAGEToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal BRACE_L:'{';
	 */
	protected String getBRACE_LToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	/**
	 * terminal BRACE_R:'}';
	 */
	protected String getBRACE_RToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * terminal DOT:'.';
	 */
	protected String getDOTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	/**
	 * terminal END:';';
	 */
	protected String getENDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	/**
	 * terminal ENUM	 	: 'enum';
	 */
	protected String getENUMToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "enum";
	}
	
	/**
	 * terminal EQUALS:'=';
	 */
	protected String getEQUALSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * terminal FILETER_A:'<=';
	 */
	protected String getFILETER_AToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<=";
	}
	
	/**
	 * terminal FILETER_B:'<-';
	 */
	protected String getFILETER_BToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<-";
	}
	
	/**
	 * terminal IMPORT	: 'import';
	 */
	protected String getIMPORTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "import";
	}
	
	/**
	 * terminal MAP_KIND  : 'map';
	 */
	protected String getMAP_KINDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "map";
	}
	
	/**
	 * terminal MESSAGE 	: 'message';
	 */
	protected String getMESSAGEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "message";
	}
	
	/**
	 * MessageFieldDefault : BRACKET_L DEFAULT_KIND EQUALS (NUMBER|IDENTITY) BRACKET_R ;
	 */
	protected String getMessageFieldDefaultToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[default=]";
	}
	
	/**
	 * terminal OPTION  	: 'option';
	 */
	protected String getOPTIONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "option";
	}
	
	/**
	 * terminal PACKAGE	: 'package';
	 */
	protected String getPACKAGEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "package";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_EnumFieldOpt_ENDTerminalRuleCall_4_q.equals(syntax))
				emit_EnumFieldOpt_ENDTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EnumField_ENDTerminalRuleCall_3_q.equals(syntax))
				emit_EnumField_ENDTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_EnumType_ENDTerminalRuleCall_5_q.equals(syntax))
				emit_EnumType_ENDTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ImportInfo_ENDTerminalRuleCall_2_q.equals(syntax))
				emit_ImportInfo_ENDTerminalRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MapField_ENDTerminalRuleCall_5_q.equals(syntax))
				emit_MapField_ENDTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Map_ENDTerminalRuleCall_7_q.equals(syntax))
				emit_Map_ENDTerminalRuleCall_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MessageComplexField_ENDTerminalRuleCall_6_q.equals(syntax))
				emit_MessageComplexField_ENDTerminalRuleCall_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MessageComplexField_MessageFieldDefaultParserRuleCall_5_q.equals(syntax))
				emit_MessageComplexField_MessageFieldDefaultParserRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MessageSimpleField_ENDTerminalRuleCall_6_q.equals(syntax))
				emit_MessageSimpleField_ENDTerminalRuleCall_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MessageSimpleField_MessageFieldDefaultParserRuleCall_5_q.equals(syntax))
				emit_MessageSimpleField_MessageFieldDefaultParserRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MessageType_ENDTerminalRuleCall_5_q.equals(syntax))
				emit_MessageType_ENDTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Model_ENDTerminalRuleCall_0_2_q.equals(syntax))
				emit_Model_ENDTerminalRuleCall_0_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OptionInfo_ENDTerminalRuleCall_4_q.equals(syntax))
				emit_OptionInfo_ENDTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     END?
	 */
	protected void emit_EnumFieldOpt_ENDTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     END?
	 */
	protected void emit_EnumField_ENDTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     END?
	 */
	protected void emit_EnumType_ENDTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     END?
	 */
	protected void emit_ImportInfo_ENDTerminalRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     END?
	 */
	protected void emit_MapField_ENDTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     END?
	 */
	protected void emit_Map_ENDTerminalRuleCall_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     END?
	 */
	protected void emit_MessageComplexField_ENDTerminalRuleCall_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     MessageFieldDefault?
	 */
	protected void emit_MessageComplexField_MessageFieldDefaultParserRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     END?
	 */
	protected void emit_MessageSimpleField_ENDTerminalRuleCall_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     MessageFieldDefault?
	 */
	protected void emit_MessageSimpleField_MessageFieldDefaultParserRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     END?
	 */
	protected void emit_MessageType_ENDTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     END?
	 */
	protected void emit_Model_ENDTerminalRuleCall_0_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     END?
	 */
	protected void emit_OptionInfo_ENDTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
