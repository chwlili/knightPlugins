package org.chw.game.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.chw.game.services.CfgGrammarAccess;
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
public class CfgSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CfgGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Field_C_SEMICOLONTerminalRuleCall_5_q;
	protected AbstractElementAlias match_PackDef_C_SEMICOLONTerminalRuleCall_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CfgGrammarAccess) access;
		match_Field_C_SEMICOLONTerminalRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getFieldAccess().getC_SEMICOLONTerminalRuleCall_5());
		match_PackDef_C_SEMICOLONTerminalRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getPackDefAccess().getC_SEMICOLONTerminalRuleCall_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getC_ANGLE_LRule())
			return getC_ANGLE_LToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getC_ANGLE_RRule())
			return getC_ANGLE_RToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getC_BRACE_LRule())
			return getC_BRACE_LToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getC_BRACE_RRule())
			return getC_BRACE_RToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getC_BRACKET_LRule())
			return getC_BRACKET_LToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getC_BRACKET_RRule())
			return getC_BRACKET_RToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getC_COMMARule())
			return getC_COMMAToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getC_EQUALSRule())
			return getC_EQUALSToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getC_FILERule())
			return getC_FILEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getC_HASHRule())
			return getC_HASHToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getC_LISTRule())
			return getC_LISTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getC_NODERule())
			return getC_NODEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getC_PAREN_LRule())
			return getC_PAREN_LToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getC_PAREN_RRule())
			return getC_PAREN_RToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getC_SEMICOLONRule())
			return getC_SEMICOLONToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal C_ANGLE_L:
	 * 	'<';
	 */
	protected String getC_ANGLE_LToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<";
	}
	
	/**
	 * terminal C_ANGLE_R:
	 * 	'>';
	 */
	protected String getC_ANGLE_RToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ">";
	}
	
	/**
	 * terminal C_BRACE_L:
	 * 	'{';
	 */
	protected String getC_BRACE_LToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	/**
	 * terminal C_BRACE_R:
	 * 	'}';
	 */
	protected String getC_BRACE_RToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * terminal C_BRACKET_L:
	 * 	'[';
	 */
	protected String getC_BRACKET_LToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[";
	}
	
	/**
	 * terminal C_BRACKET_R:
	 * 	']';
	 */
	protected String getC_BRACKET_RToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "]";
	}
	
	/**
	 * terminal C_COMMA:
	 * 	',';
	 */
	protected String getC_COMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * terminal C_EQUALS:
	 * 	'=';
	 */
	protected String getC_EQUALSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * terminal C_FILE:
	 * 	'file';
	 */
	protected String getC_FILEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "file";
	}
	
	/**
	 * terminal C_HASH:
	 * 	'Hash';
	 */
	protected String getC_HASHToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "Hash";
	}
	
	/**
	 * terminal C_LIST:
	 * 	'List';
	 */
	protected String getC_LISTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "List";
	}
	
	/**
	 * terminal C_NODE:
	 * 	'node';
	 */
	protected String getC_NODEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "node";
	}
	
	/**
	 * terminal C_PAREN_L:
	 * 	'(';
	 */
	protected String getC_PAREN_LToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	/**
	 * terminal C_PAREN_R:
	 * 	')';
	 */
	protected String getC_PAREN_RToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	/**
	 * terminal C_SEMICOLON:
	 * 	';';
	 */
	protected String getC_SEMICOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Field_C_SEMICOLONTerminalRuleCall_5_q.equals(syntax))
				emit_Field_C_SEMICOLONTerminalRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PackDef_C_SEMICOLONTerminalRuleCall_2_q.equals(syntax))
				emit_PackDef_C_SEMICOLONTerminalRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     C_SEMICOLON?
	 */
	protected void emit_Field_C_SEMICOLONTerminalRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     C_SEMICOLON?
	 */
	protected void emit_PackDef_C_SEMICOLONTerminalRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
