/*
* generated by Xtext
*/
grammar InternalCfg;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.chw.game.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.chw.game.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.chw.game.services.CfgGrammarAccess;

}

@parser::members {

 	private CfgGrammarAccess grammarAccess;
 	
    public InternalCfgParser(TokenStream input, CfgGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "XML2";	
   	}
   	
   	@Override
   	protected CfgGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleXML2
entryRuleXML2 returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getXML2Rule()); }
	 iv_ruleXML2=ruleXML2 
	 { $current=$iv_ruleXML2.current; } 
	 EOF 
;

// Rule XML2
ruleXML2 returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getXML2Access().getTypesTypeParserRuleCall_0_0()); 
	    }
		lv_types_0_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getXML2Rule());
	        }
       		add(
       			$current, 
       			"types",
        		lv_types_0_0, 
        		"Type");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		lv_otherComm_1_0=RULE_COMMENT
		{
			newLeafNode(lv_otherComm_1_0, grammarAccess.getXML2Access().getOtherCommCOMMENTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getXML2Rule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"otherComm",
        		lv_otherComm_1_0, 
        		"COMMENT");
	    }

)
))*
;





// Entry rule entryRuleType
entryRuleType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	 iv_ruleType=ruleType 
	 { $current=$iv_ruleType.current; } 
	 EOF 
;

// Rule Type
ruleType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_comm_0_0=RULE_COMMENT
		{
			newLeafNode(lv_comm_0_0, grammarAccess.getTypeAccess().getCommCOMMENTTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"comm",
        		lv_comm_0_0, 
        		"COMMENT");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getTypeAccess().getInputInputParserRuleCall_1_0()); 
	    }
		lv_input_1_0=ruleInput		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTypeRule());
	        }
       		set(
       			$current, 
       			"input",
        		lv_input_1_0, 
        		"Input");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		lv_prefix_2_0=RULE_C_TYPE
		{
			newLeafNode(lv_prefix_2_0, grammarAccess.getTypeAccess().getPrefixC_TYPETerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"prefix",
        		lv_prefix_2_0, 
        		"C_TYPE");
	    }

)
)(
(
		lv_name_3_0=RULE_NAME
		{
			newLeafNode(lv_name_3_0, grammarAccess.getTypeAccess().getNameNAMETerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"NAME");
	    }

)
)this_C_BRACE_L_4=RULE_C_BRACE_L
    { 
    newLeafNode(this_C_BRACE_L_4, grammarAccess.getTypeAccess().getC_BRACE_LTerminalRuleCall_4()); 
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getTypeAccess().getFieldsFieldParserRuleCall_5_0_0()); 
	    }
		lv_fields_5_0=ruleField		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTypeRule());
	        }
       		add(
       			$current, 
       			"fields",
        		lv_fields_5_0, 
        		"Field");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		lv_otherComm_6_0=RULE_COMMENT
		{
			newLeafNode(lv_otherComm_6_0, grammarAccess.getTypeAccess().getOtherCommCOMMENTTerminalRuleCall_5_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"otherComm",
        		lv_otherComm_6_0, 
        		"COMMENT");
	    }

)
))*this_C_BRACE_R_7=RULE_C_BRACE_R
    { 
    newLeafNode(this_C_BRACE_R_7, grammarAccess.getTypeAccess().getC_BRACE_RTerminalRuleCall_6()); 
    }
)
;





// Entry rule entryRuleInput
entryRuleInput returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInputRule()); }
	 iv_ruleInput=ruleInput 
	 { $current=$iv_ruleInput.current; } 
	 EOF 
;

// Rule Input
ruleInput returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(this_C_BRACKET_L_0=RULE_C_BRACKET_L
    { 
    newLeafNode(this_C_BRACKET_L_0, grammarAccess.getInputAccess().getC_BRACKET_LTerminalRuleCall_0()); 
    }
(
(
		lv_prefix_1_0=RULE_C_INPUT
		{
			newLeafNode(lv_prefix_1_0, grammarAccess.getInputAccess().getPrefixC_INPUTTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInputRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"prefix",
        		lv_prefix_1_0, 
        		"C_INPUT");
	    }

)
)this_C_PAREN_L_2=RULE_C_PAREN_L
    { 
    newLeafNode(this_C_PAREN_L_2, grammarAccess.getInputAccess().getC_PAREN_LTerminalRuleCall_2()); 
    }
this_C_FILE_3=RULE_C_FILE
    { 
    newLeafNode(this_C_FILE_3, grammarAccess.getInputAccess().getC_FILETerminalRuleCall_3()); 
    }
this_C_EQUALS_4=RULE_C_EQUALS
    { 
    newLeafNode(this_C_EQUALS_4, grammarAccess.getInputAccess().getC_EQUALSTerminalRuleCall_4()); 
    }
(
(
		lv_filePath_5_0=RULE_STRING
		{
			newLeafNode(lv_filePath_5_0, grammarAccess.getInputAccess().getFilePathSTRINGTerminalRuleCall_5_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInputRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"filePath",
        		lv_filePath_5_0, 
        		"STRING");
	    }

)
)(this_C_COMMA_6=RULE_C_COMMA
    { 
    newLeafNode(this_C_COMMA_6, grammarAccess.getInputAccess().getC_COMMATerminalRuleCall_6_0()); 
    }
this_C_NODE_7=RULE_C_NODE
    { 
    newLeafNode(this_C_NODE_7, grammarAccess.getInputAccess().getC_NODETerminalRuleCall_6_1()); 
    }
this_C_EQUALS_8=RULE_C_EQUALS
    { 
    newLeafNode(this_C_EQUALS_8, grammarAccess.getInputAccess().getC_EQUALSTerminalRuleCall_6_2()); 
    }
(
(
		lv_nodePath_9_0=RULE_STRING
		{
			newLeafNode(lv_nodePath_9_0, grammarAccess.getInputAccess().getNodePathSTRINGTerminalRuleCall_6_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInputRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"nodePath",
        		lv_nodePath_9_0, 
        		"STRING");
	    }

)
))?this_C_PAREN_R_10=RULE_C_PAREN_R
    { 
    newLeafNode(this_C_PAREN_R_10, grammarAccess.getInputAccess().getC_PAREN_RTerminalRuleCall_7()); 
    }
this_C_BRACKET_R_11=RULE_C_BRACKET_R
    { 
    newLeafNode(this_C_BRACKET_R_11, grammarAccess.getInputAccess().getC_BRACKET_RTerminalRuleCall_8()); 
    }
)
;





// Entry rule entryRuleField
entryRuleField returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFieldRule()); }
	 iv_ruleField=ruleField 
	 { $current=$iv_ruleField.current; } 
	 EOF 
;

// Rule Field
ruleField returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_comm_0_0=RULE_COMMENT
		{
			newLeafNode(lv_comm_0_0, grammarAccess.getFieldAccess().getCommCOMMENTTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"comm",
        		lv_comm_0_0, 
        		"COMMENT");
	    }

)
)(
(
(
		{ 
	        newCompositeNode(grammarAccess.getFieldAccess().getTypeNativeTypeParserRuleCall_1_0_0()); 
	    }
		lv_type_1_1=ruleNativeType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFieldRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_1_1, 
        		"NativeType");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getFieldAccess().getTypeListTypeParserRuleCall_1_0_1()); 
	    }
		lv_type_1_2=ruleListType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFieldRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_1_2, 
        		"ListType");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getFieldAccess().getTypeHashTypeParserRuleCall_1_0_2()); 
	    }
		lv_type_1_3=ruleHashType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFieldRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_1_3, 
        		"HashType");
	        afterParserOrEnumRuleCall();
	    }

)

)
)(
(
		lv_fieldName_2_0=RULE_NAME
		{
			newLeafNode(lv_fieldName_2_0, grammarAccess.getFieldAccess().getFieldNameNAMETerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"fieldName",
        		lv_fieldName_2_0, 
        		"NAME");
	    }

)
)this_C_EQUALS_3=RULE_C_EQUALS
    { 
    newLeafNode(this_C_EQUALS_3, grammarAccess.getFieldAccess().getC_EQUALSTerminalRuleCall_3()); 
    }
(
(
		lv_nodePath_4_0=RULE_STRING
		{
			newLeafNode(lv_nodePath_4_0, grammarAccess.getFieldAccess().getNodePathSTRINGTerminalRuleCall_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFieldRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"nodePath",
        		lv_nodePath_4_0, 
        		"STRING");
	    }

)
)(this_C_SEMICOLON_5=RULE_C_SEMICOLON
    { 
    newLeafNode(this_C_SEMICOLON_5, grammarAccess.getFieldAccess().getC_SEMICOLONTerminalRuleCall_5()); 
    }
)?)
;





// Entry rule entryRuleNativeType
entryRuleNativeType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNativeTypeRule()); }
	 iv_ruleNativeType=ruleNativeType 
	 { $current=$iv_ruleNativeType.current; } 
	 EOF 
;

// Rule NativeType
ruleNativeType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getNativeTypeAccess().getTypeTypeNameParserRuleCall_0()); 
	    }
		lv_type_0_0=ruleTypeName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNativeTypeRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_0_0, 
        		"TypeName");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleListType
entryRuleListType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getListTypeRule()); }
	 iv_ruleListType=ruleListType 
	 { $current=$iv_ruleListType.current; } 
	 EOF 
;

// Rule ListType
ruleListType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(this_C_LIST_0=RULE_C_LIST
    { 
    newLeafNode(this_C_LIST_0, grammarAccess.getListTypeAccess().getC_LISTTerminalRuleCall_0()); 
    }
this_C_ANGLE_L_1=RULE_C_ANGLE_L
    { 
    newLeafNode(this_C_ANGLE_L_1, grammarAccess.getListTypeAccess().getC_ANGLE_LTerminalRuleCall_1()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getListTypeAccess().getTypeTypeNameParserRuleCall_2_0()); 
	    }
		lv_type_2_0=ruleTypeName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getListTypeRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_2_0, 
        		"TypeName");
	        afterParserOrEnumRuleCall();
	    }

)
)this_C_ANGLE_R_3=RULE_C_ANGLE_R
    { 
    newLeafNode(this_C_ANGLE_R_3, grammarAccess.getListTypeAccess().getC_ANGLE_RTerminalRuleCall_3()); 
    }
)
;





// Entry rule entryRuleHashType
entryRuleHashType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getHashTypeRule()); }
	 iv_ruleHashType=ruleHashType 
	 { $current=$iv_ruleHashType.current; } 
	 EOF 
;

// Rule HashType
ruleHashType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(this_C_HASH_0=RULE_C_HASH
    { 
    newLeafNode(this_C_HASH_0, grammarAccess.getHashTypeAccess().getC_HASHTerminalRuleCall_0()); 
    }
this_C_ANGLE_L_1=RULE_C_ANGLE_L
    { 
    newLeafNode(this_C_ANGLE_L_1, grammarAccess.getHashTypeAccess().getC_ANGLE_LTerminalRuleCall_1()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getHashTypeAccess().getTypeTypeNameParserRuleCall_2_0()); 
	    }
		lv_type_2_0=ruleTypeName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getHashTypeRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_2_0, 
        		"TypeName");
	        afterParserOrEnumRuleCall();
	    }

)
)this_C_ANGLE_R_3=RULE_C_ANGLE_R
    { 
    newLeafNode(this_C_ANGLE_R_3, grammarAccess.getHashTypeAccess().getC_ANGLE_RTerminalRuleCall_3()); 
    }
(this_C_PAREN_L_4=RULE_C_PAREN_L
    { 
    newLeafNode(this_C_PAREN_L_4, grammarAccess.getHashTypeAccess().getC_PAREN_LTerminalRuleCall_4_0()); 
    }
(
(
		lv_params_5_0=RULE_NAME
		{
			newLeafNode(lv_params_5_0, grammarAccess.getHashTypeAccess().getParamsNAMETerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getHashTypeRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"params",
        		lv_params_5_0, 
        		"NAME");
	    }

)
)(this_C_COMMA_6=RULE_C_COMMA
    { 
    newLeafNode(this_C_COMMA_6, grammarAccess.getHashTypeAccess().getC_COMMATerminalRuleCall_4_2_0()); 
    }
(
(
		lv_params_7_0=RULE_NAME
		{
			newLeafNode(lv_params_7_0, grammarAccess.getHashTypeAccess().getParamsNAMETerminalRuleCall_4_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getHashTypeRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"params",
        		lv_params_7_0, 
        		"NAME");
	    }

)
))*this_C_PAREN_R_8=RULE_C_PAREN_R
    { 
    newLeafNode(this_C_PAREN_R_8, grammarAccess.getHashTypeAccess().getC_PAREN_RTerminalRuleCall_4_3()); 
    }
)?)
;





// Entry rule entryRuleTypeName
entryRuleTypeName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeNameRule()); } 
	 iv_ruleTypeName=ruleTypeName 
	 { $current=$iv_ruleTypeName.current.getText(); }  
	 EOF 
;

// Rule TypeName
ruleTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_C_INPUT_0=RULE_C_INPUT    {
		$current.merge(this_C_INPUT_0);
    }

    { 
    newLeafNode(this_C_INPUT_0, grammarAccess.getTypeNameAccess().getC_INPUTTerminalRuleCall_0()); 
    }

    |    this_C_FILE_1=RULE_C_FILE    {
		$current.merge(this_C_FILE_1);
    }

    { 
    newLeafNode(this_C_FILE_1, grammarAccess.getTypeNameAccess().getC_FILETerminalRuleCall_1()); 
    }

    |    this_C_NODE_2=RULE_C_NODE    {
		$current.merge(this_C_NODE_2);
    }

    { 
    newLeafNode(this_C_NODE_2, grammarAccess.getTypeNameAccess().getC_NODETerminalRuleCall_2()); 
    }

    |    this_C_TYPE_3=RULE_C_TYPE    {
		$current.merge(this_C_TYPE_3);
    }

    { 
    newLeafNode(this_C_TYPE_3, grammarAccess.getTypeNameAccess().getC_TYPETerminalRuleCall_3()); 
    }

    |    this_C_INT_4=RULE_C_INT    {
		$current.merge(this_C_INT_4);
    }

    { 
    newLeafNode(this_C_INT_4, grammarAccess.getTypeNameAccess().getC_INTTerminalRuleCall_4()); 
    }

    |    this_C_UINT_5=RULE_C_UINT    {
		$current.merge(this_C_UINT_5);
    }

    { 
    newLeafNode(this_C_UINT_5, grammarAccess.getTypeNameAccess().getC_UINTTerminalRuleCall_5()); 
    }

    |    this_C_BOOL_6=RULE_C_BOOL    {
		$current.merge(this_C_BOOL_6);
    }

    { 
    newLeafNode(this_C_BOOL_6, grammarAccess.getTypeNameAccess().getC_BOOLTerminalRuleCall_6()); 
    }

    |    this_C_NUMBER_7=RULE_C_NUMBER    {
		$current.merge(this_C_NUMBER_7);
    }

    { 
    newLeafNode(this_C_NUMBER_7, grammarAccess.getTypeNameAccess().getC_NUMBERTerminalRuleCall_7()); 
    }

    |    this_C_STRING_8=RULE_C_STRING    {
		$current.merge(this_C_STRING_8);
    }

    { 
    newLeafNode(this_C_STRING_8, grammarAccess.getTypeNameAccess().getC_STRINGTerminalRuleCall_8()); 
    }

    |    this_C_LIST_9=RULE_C_LIST    {
		$current.merge(this_C_LIST_9);
    }

    { 
    newLeafNode(this_C_LIST_9, grammarAccess.getTypeNameAccess().getC_LISTTerminalRuleCall_9()); 
    }

    |    this_C_HASH_10=RULE_C_HASH    {
		$current.merge(this_C_HASH_10);
    }

    { 
    newLeafNode(this_C_HASH_10, grammarAccess.getTypeNameAccess().getC_HASHTerminalRuleCall_10()); 
    }

    |    this_NAME_11=RULE_NAME    {
		$current.merge(this_NAME_11);
    }

    { 
    newLeafNode(this_NAME_11, grammarAccess.getTypeNameAccess().getNAMETerminalRuleCall_11()); 
    }
)
    ;





RULE_C_BRACKET_L : '[';

RULE_C_BRACKET_R : ']';

RULE_C_PAREN_L : '(';

RULE_C_PAREN_R : ')';

RULE_C_BRACE_L : '{';

RULE_C_BRACE_R : '}';

RULE_C_ANGLE_L : '<';

RULE_C_ANGLE_R : '>';

RULE_C_EQUALS : '=';

RULE_C_COMMA : ',';

RULE_C_SEMICOLON : ';';

RULE_C_INPUT : 'input';

RULE_C_FILE : 'file';

RULE_C_NODE : 'node';

RULE_C_TYPE : 'type';

RULE_C_INT : 'int';

RULE_C_UINT : 'uint';

RULE_C_BOOL : 'boolean';

RULE_C_NUMBER : 'Number';

RULE_C_STRING : 'String';

RULE_C_LIST : 'List';

RULE_C_HASH : 'Hash';

RULE_NAME : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

RULE_STRING : '"' ~(('\r'|'\n'|'"'))* '"';

fragment RULE_COMMENT_END : '*/';

RULE_COMMENT : ('/*' ( options {greedy=false;} : . )*RULE_COMMENT_END|'//' ~(('\r'|'\n'))*);

RULE_WS : (' '|'\t'|'\r'|'\n')+;


