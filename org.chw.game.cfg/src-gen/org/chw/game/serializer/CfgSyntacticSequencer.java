package org.chw.game.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.chw.game.services.CfgGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class CfgSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CfgGrammarAccess grammarAccess;
	protected AbstractElementAlias match_EnumField_C_SEMICOLONTerminalRuleCall_4_q;
	protected AbstractElementAlias match_Field_C_SEMICOLONTerminalRuleCall_6_q;
	protected AbstractElementAlias match_InputDef_C_SEMICOLONTerminalRuleCall_3_q;
	protected AbstractElementAlias match_ListMeta___C_PAREN_LTerminalRuleCall_2_0_C_PAREN_RTerminalRuleCall_2_2__q;
	protected AbstractElementAlias match_PackDef_C_SEMICOLONTerminalRuleCall_3_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CfgGrammarAccess) access;
		match_EnumField_C_SEMICOLONTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getEnumFieldAccess().getC_SEMICOLONTerminalRuleCall_4());
		match_Field_C_SEMICOLONTerminalRuleCall_6_q = new TokenAlias(false, true, grammarAccess.getFieldAccess().getC_SEMICOLONTerminalRuleCall_6());
		match_InputDef_C_SEMICOLONTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getInputDefAccess().getC_SEMICOLONTerminalRuleCall_3());
		match_ListMeta___C_PAREN_LTerminalRuleCall_2_0_C_PAREN_RTerminalRuleCall_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getListMetaAccess().getC_PAREN_LTerminalRuleCall_2_0()), new TokenAlias(false, false, grammarAccess.getListMetaAccess().getC_PAREN_RTerminalRuleCall_2_2()));
		match_PackDef_C_SEMICOLONTerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getPackDefAccess().getC_SEMICOLONTerminalRuleCall_3());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getC_BRACE_LRule())
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
		else if(ruleCall.getRule() == grammarAccess.getC_PAREN_LRule())
			return getC_PAREN_LToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getC_PAREN_RRule())
			return getC_PAREN_RToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getC_SEMICOLONRule())
			return getC_SEMICOLONToken(semanticObject, ruleCall, node);
		return "";
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
			if(match_EnumField_C_SEMICOLONTerminalRuleCall_4_q.equals(syntax))
				emit_EnumField_C_SEMICOLONTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Field_C_SEMICOLONTerminalRuleCall_6_q.equals(syntax))
				emit_Field_C_SEMICOLONTerminalRuleCall_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_InputDef_C_SEMICOLONTerminalRuleCall_3_q.equals(syntax))
				emit_InputDef_C_SEMICOLONTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ListMeta___C_PAREN_LTerminalRuleCall_2_0_C_PAREN_RTerminalRuleCall_2_2__q.equals(syntax))
				emit_ListMeta___C_PAREN_LTerminalRuleCall_2_0_C_PAREN_RTerminalRuleCall_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PackDef_C_SEMICOLONTerminalRuleCall_3_q.equals(syntax))
				emit_PackDef_C_SEMICOLONTerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     C_SEMICOLON?
	 */
	protected void emit_EnumField_C_SEMICOLONTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     C_SEMICOLON?
	 */
	protected void emit_Field_C_SEMICOLONTerminalRuleCall_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     C_SEMICOLON?
	 */
	protected void emit_InputDef_C_SEMICOLONTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (C_PAREN_L C_PAREN_R)?
	 */
	protected void emit_ListMeta___C_PAREN_LTerminalRuleCall_2_0_C_PAREN_RTerminalRuleCall_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     C_SEMICOLON?
	 */
	protected void emit_PackDef_C_SEMICOLONTerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
