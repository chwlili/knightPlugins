/*
* generated by Xtext
*/
grammar InternalCfg;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.chw.game.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.chw.game.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.chw.game.services.CfgGrammarAccess;

}

@parser::members {
 
 	private CfgGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(CfgGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleXML2
entryRuleXML2 
:
{ before(grammarAccess.getXML2Rule()); }
	 ruleXML2
{ after(grammarAccess.getXML2Rule()); } 
	 EOF 
;

// Rule XML2
ruleXML2
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getXML2Access().getAlternatives()); }
(rule__XML2__Alternatives)*
{ after(grammarAccess.getXML2Access().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleType
entryRuleType 
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTypeAccess().getGroup()); }
(rule__Type__Group__0)
{ after(grammarAccess.getTypeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleInput
entryRuleInput 
:
{ before(grammarAccess.getInputRule()); }
	 ruleInput
{ after(grammarAccess.getInputRule()); } 
	 EOF 
;

// Rule Input
ruleInput
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getInputAccess().getGroup()); }
(rule__Input__Group__0)
{ after(grammarAccess.getInputAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleField
entryRuleField 
:
{ before(grammarAccess.getFieldRule()); }
	 ruleField
{ after(grammarAccess.getFieldRule()); } 
	 EOF 
;

// Rule Field
ruleField
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFieldAccess().getGroup()); }
(rule__Field__Group__0)
{ after(grammarAccess.getFieldAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNativeType
entryRuleNativeType 
:
{ before(grammarAccess.getNativeTypeRule()); }
	 ruleNativeType
{ after(grammarAccess.getNativeTypeRule()); } 
	 EOF 
;

// Rule NativeType
ruleNativeType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNativeTypeAccess().getTypeAssignment()); }
(rule__NativeType__TypeAssignment)
{ after(grammarAccess.getNativeTypeAccess().getTypeAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleListType
entryRuleListType 
:
{ before(grammarAccess.getListTypeRule()); }
	 ruleListType
{ after(grammarAccess.getListTypeRule()); } 
	 EOF 
;

// Rule ListType
ruleListType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getListTypeAccess().getGroup()); }
(rule__ListType__Group__0)
{ after(grammarAccess.getListTypeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleHashType
entryRuleHashType 
:
{ before(grammarAccess.getHashTypeRule()); }
	 ruleHashType
{ after(grammarAccess.getHashTypeRule()); } 
	 EOF 
;

// Rule HashType
ruleHashType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getHashTypeAccess().getGroup()); }
(rule__HashType__Group__0)
{ after(grammarAccess.getHashTypeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleParam
entryRuleParam 
:
{ before(grammarAccess.getParamRule()); }
	 ruleParam
{ after(grammarAccess.getParamRule()); } 
	 EOF 
;

// Rule Param
ruleParam
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getParamAccess().getParamNameAssignment()); }
(rule__Param__ParamNameAssignment)
{ after(grammarAccess.getParamAccess().getParamNameAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTypeName
entryRuleTypeName 
:
{ before(grammarAccess.getTypeNameRule()); }
	 ruleTypeName
{ after(grammarAccess.getTypeNameRule()); } 
	 EOF 
;

// Rule TypeName
ruleTypeName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTypeNameAccess().getAlternatives()); }
(rule__TypeName__Alternatives)
{ after(grammarAccess.getTypeNameAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__XML2__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getXML2Access().getTypesAssignment_0()); }
(rule__XML2__TypesAssignment_0)
{ after(grammarAccess.getXML2Access().getTypesAssignment_0()); }
)

    |(
{ before(grammarAccess.getXML2Access().getOtherCommAssignment_1()); }
(rule__XML2__OtherCommAssignment_1)
{ after(grammarAccess.getXML2Access().getOtherCommAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Alternatives_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getFieldsAssignment_5_0()); }
(rule__Type__FieldsAssignment_5_0)
{ after(grammarAccess.getTypeAccess().getFieldsAssignment_5_0()); }
)

    |(
{ before(grammarAccess.getTypeAccess().getOtherCommAssignment_5_1()); }
(rule__Type__OtherCommAssignment_5_1)
{ after(grammarAccess.getTypeAccess().getOtherCommAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Field__TypeAlternatives_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getTypeNativeTypeParserRuleCall_1_0_0()); }
	ruleNativeType
{ after(grammarAccess.getFieldAccess().getTypeNativeTypeParserRuleCall_1_0_0()); }
)

    |(
{ before(grammarAccess.getFieldAccess().getTypeListTypeParserRuleCall_1_0_1()); }
	ruleListType
{ after(grammarAccess.getFieldAccess().getTypeListTypeParserRuleCall_1_0_1()); }
)

    |(
{ before(grammarAccess.getFieldAccess().getTypeHashTypeParserRuleCall_1_0_2()); }
	ruleHashType
{ after(grammarAccess.getFieldAccess().getTypeHashTypeParserRuleCall_1_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TypeName__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeNameAccess().getC_INPUTTerminalRuleCall_0()); }
	RULE_C_INPUT
{ after(grammarAccess.getTypeNameAccess().getC_INPUTTerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getTypeNameAccess().getC_FILETerminalRuleCall_1()); }
	RULE_C_FILE
{ after(grammarAccess.getTypeNameAccess().getC_FILETerminalRuleCall_1()); }
)

    |(
{ before(grammarAccess.getTypeNameAccess().getC_NODETerminalRuleCall_2()); }
	RULE_C_NODE
{ after(grammarAccess.getTypeNameAccess().getC_NODETerminalRuleCall_2()); }
)

    |(
{ before(grammarAccess.getTypeNameAccess().getC_TYPETerminalRuleCall_3()); }
	RULE_C_TYPE
{ after(grammarAccess.getTypeNameAccess().getC_TYPETerminalRuleCall_3()); }
)

    |(
{ before(grammarAccess.getTypeNameAccess().getC_INTTerminalRuleCall_4()); }
	RULE_C_INT
{ after(grammarAccess.getTypeNameAccess().getC_INTTerminalRuleCall_4()); }
)

    |(
{ before(grammarAccess.getTypeNameAccess().getC_UINTTerminalRuleCall_5()); }
	RULE_C_UINT
{ after(grammarAccess.getTypeNameAccess().getC_UINTTerminalRuleCall_5()); }
)

    |(
{ before(grammarAccess.getTypeNameAccess().getC_BOOLTerminalRuleCall_6()); }
	RULE_C_BOOL
{ after(grammarAccess.getTypeNameAccess().getC_BOOLTerminalRuleCall_6()); }
)

    |(
{ before(grammarAccess.getTypeNameAccess().getC_NUMBERTerminalRuleCall_7()); }
	RULE_C_NUMBER
{ after(grammarAccess.getTypeNameAccess().getC_NUMBERTerminalRuleCall_7()); }
)

    |(
{ before(grammarAccess.getTypeNameAccess().getC_STRINGTerminalRuleCall_8()); }
	RULE_C_STRING
{ after(grammarAccess.getTypeNameAccess().getC_STRINGTerminalRuleCall_8()); }
)

    |(
{ before(grammarAccess.getTypeNameAccess().getC_LISTTerminalRuleCall_9()); }
	RULE_C_LIST
{ after(grammarAccess.getTypeNameAccess().getC_LISTTerminalRuleCall_9()); }
)

    |(
{ before(grammarAccess.getTypeNameAccess().getC_HASHTerminalRuleCall_10()); }
	RULE_C_HASH
{ after(grammarAccess.getTypeNameAccess().getC_HASHTerminalRuleCall_10()); }
)

    |(
{ before(grammarAccess.getTypeNameAccess().getNAMETerminalRuleCall_11()); }
	RULE_NAME
{ after(grammarAccess.getTypeNameAccess().getNAMETerminalRuleCall_11()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Type__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Type__Group__0__Impl
	rule__Type__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getCommAssignment_0()); }
(rule__Type__CommAssignment_0)
{ after(grammarAccess.getTypeAccess().getCommAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Type__Group__1__Impl
	rule__Type__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getInputAssignment_1()); }
(rule__Type__InputAssignment_1)?
{ after(grammarAccess.getTypeAccess().getInputAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Type__Group__2__Impl
	rule__Type__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getPrefixAssignment_2()); }
(rule__Type__PrefixAssignment_2)
{ after(grammarAccess.getTypeAccess().getPrefixAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Type__Group__3__Impl
	rule__Type__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getNameAssignment_3()); }
(rule__Type__NameAssignment_3)
{ after(grammarAccess.getTypeAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Type__Group__4__Impl
	rule__Type__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getC_BRACE_LTerminalRuleCall_4()); }
	RULE_C_BRACE_L
{ after(grammarAccess.getTypeAccess().getC_BRACE_LTerminalRuleCall_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Type__Group__5__Impl
	rule__Type__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getAlternatives_5()); }
(rule__Type__Alternatives_5)*
{ after(grammarAccess.getTypeAccess().getAlternatives_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Type__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Type__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getC_BRACE_RTerminalRuleCall_6()); }
	RULE_C_BRACE_R
{ after(grammarAccess.getTypeAccess().getC_BRACE_RTerminalRuleCall_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__Input__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Input__Group__0__Impl
	rule__Input__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInputAccess().getC_BRACKET_LTerminalRuleCall_0()); }
	RULE_C_BRACKET_L
{ after(grammarAccess.getInputAccess().getC_BRACKET_LTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Input__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Input__Group__1__Impl
	rule__Input__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInputAccess().getPrefixAssignment_1()); }
(rule__Input__PrefixAssignment_1)
{ after(grammarAccess.getInputAccess().getPrefixAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Input__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Input__Group__2__Impl
	rule__Input__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInputAccess().getC_PAREN_LTerminalRuleCall_2()); }
	RULE_C_PAREN_L
{ after(grammarAccess.getInputAccess().getC_PAREN_LTerminalRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Input__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Input__Group__3__Impl
	rule__Input__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInputAccess().getC_FILETerminalRuleCall_3()); }
	RULE_C_FILE
{ after(grammarAccess.getInputAccess().getC_FILETerminalRuleCall_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Input__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Input__Group__4__Impl
	rule__Input__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInputAccess().getC_EQUALSTerminalRuleCall_4()); }
	RULE_C_EQUALS
{ after(grammarAccess.getInputAccess().getC_EQUALSTerminalRuleCall_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Input__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Input__Group__5__Impl
	rule__Input__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInputAccess().getFilePathAssignment_5()); }
(rule__Input__FilePathAssignment_5)
{ after(grammarAccess.getInputAccess().getFilePathAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Input__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Input__Group__6__Impl
	rule__Input__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInputAccess().getGroup_6()); }
(rule__Input__Group_6__0)?
{ after(grammarAccess.getInputAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Input__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Input__Group__7__Impl
	rule__Input__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInputAccess().getC_PAREN_RTerminalRuleCall_7()); }
	RULE_C_PAREN_R
{ after(grammarAccess.getInputAccess().getC_PAREN_RTerminalRuleCall_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Input__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Input__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInputAccess().getC_BRACKET_RTerminalRuleCall_8()); }
	RULE_C_BRACKET_R
{ after(grammarAccess.getInputAccess().getC_BRACKET_RTerminalRuleCall_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__Input__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Input__Group_6__0__Impl
	rule__Input__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInputAccess().getC_COMMATerminalRuleCall_6_0()); }
	RULE_C_COMMA
{ after(grammarAccess.getInputAccess().getC_COMMATerminalRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Input__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Input__Group_6__1__Impl
	rule__Input__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInputAccess().getC_NODETerminalRuleCall_6_1()); }
	RULE_C_NODE
{ after(grammarAccess.getInputAccess().getC_NODETerminalRuleCall_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Input__Group_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Input__Group_6__2__Impl
	rule__Input__Group_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInputAccess().getC_EQUALSTerminalRuleCall_6_2()); }
	RULE_C_EQUALS
{ after(grammarAccess.getInputAccess().getC_EQUALSTerminalRuleCall_6_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Input__Group_6__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Input__Group_6__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Input__Group_6__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInputAccess().getNodePathAssignment_6_3()); }
(rule__Input__NodePathAssignment_6_3)
{ after(grammarAccess.getInputAccess().getNodePathAssignment_6_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Field__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group__0__Impl
	rule__Field__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getCommAssignment_0()); }
(rule__Field__CommAssignment_0)
{ after(grammarAccess.getFieldAccess().getCommAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group__1__Impl
	rule__Field__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getTypeAssignment_1()); }
(rule__Field__TypeAssignment_1)
{ after(grammarAccess.getFieldAccess().getTypeAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group__2__Impl
	rule__Field__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getFieldNameAssignment_2()); }
(rule__Field__FieldNameAssignment_2)
{ after(grammarAccess.getFieldAccess().getFieldNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group__3__Impl
	rule__Field__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getC_EQUALSTerminalRuleCall_3()); }
	RULE_C_EQUALS
{ after(grammarAccess.getFieldAccess().getC_EQUALSTerminalRuleCall_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group__4__Impl
	rule__Field__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getNodePathAssignment_4()); }
(rule__Field__NodePathAssignment_4)
{ after(grammarAccess.getFieldAccess().getNodePathAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Field__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Field__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Field__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getC_SEMICOLONTerminalRuleCall_5()); }
(	RULE_C_SEMICOLON)?
{ after(grammarAccess.getFieldAccess().getC_SEMICOLONTerminalRuleCall_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__ListType__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ListType__Group__0__Impl
	rule__ListType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ListType__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getListTypeAccess().getC_LISTTerminalRuleCall_0()); }
	RULE_C_LIST
{ after(grammarAccess.getListTypeAccess().getC_LISTTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ListType__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ListType__Group__1__Impl
	rule__ListType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ListType__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getListTypeAccess().getC_ANGLE_LTerminalRuleCall_1()); }
	RULE_C_ANGLE_L
{ after(grammarAccess.getListTypeAccess().getC_ANGLE_LTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ListType__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ListType__Group__2__Impl
	rule__ListType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ListType__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getListTypeAccess().getTypeAssignment_2()); }
(rule__ListType__TypeAssignment_2)
{ after(grammarAccess.getListTypeAccess().getTypeAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ListType__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ListType__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ListType__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getListTypeAccess().getC_ANGLE_RTerminalRuleCall_3()); }
	RULE_C_ANGLE_R
{ after(grammarAccess.getListTypeAccess().getC_ANGLE_RTerminalRuleCall_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__HashType__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HashType__Group__0__Impl
	rule__HashType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HashType__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHashTypeAccess().getC_HASHTerminalRuleCall_0()); }
	RULE_C_HASH
{ after(grammarAccess.getHashTypeAccess().getC_HASHTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HashType__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HashType__Group__1__Impl
	rule__HashType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__HashType__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHashTypeAccess().getC_ANGLE_LTerminalRuleCall_1()); }
	RULE_C_ANGLE_L
{ after(grammarAccess.getHashTypeAccess().getC_ANGLE_LTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HashType__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HashType__Group__2__Impl
	rule__HashType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__HashType__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHashTypeAccess().getTypeAssignment_2()); }
(rule__HashType__TypeAssignment_2)
{ after(grammarAccess.getHashTypeAccess().getTypeAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HashType__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HashType__Group__3__Impl
	rule__HashType__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__HashType__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHashTypeAccess().getC_ANGLE_RTerminalRuleCall_3()); }
	RULE_C_ANGLE_R
{ after(grammarAccess.getHashTypeAccess().getC_ANGLE_RTerminalRuleCall_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HashType__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HashType__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HashType__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHashTypeAccess().getGroup_4()); }
(rule__HashType__Group_4__0)?
{ after(grammarAccess.getHashTypeAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__HashType__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HashType__Group_4__0__Impl
	rule__HashType__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HashType__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHashTypeAccess().getC_PAREN_LTerminalRuleCall_4_0()); }
	RULE_C_PAREN_L
{ after(grammarAccess.getHashTypeAccess().getC_PAREN_LTerminalRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HashType__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HashType__Group_4__1__Impl
	rule__HashType__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__HashType__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHashTypeAccess().getParamsAssignment_4_1()); }
(rule__HashType__ParamsAssignment_4_1)
{ after(grammarAccess.getHashTypeAccess().getParamsAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HashType__Group_4__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HashType__Group_4__2__Impl
	rule__HashType__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__HashType__Group_4__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHashTypeAccess().getGroup_4_2()); }
(rule__HashType__Group_4_2__0)*
{ after(grammarAccess.getHashTypeAccess().getGroup_4_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HashType__Group_4__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HashType__Group_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HashType__Group_4__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHashTypeAccess().getC_PAREN_RTerminalRuleCall_4_3()); }
	RULE_C_PAREN_R
{ after(grammarAccess.getHashTypeAccess().getC_PAREN_RTerminalRuleCall_4_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__HashType__Group_4_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HashType__Group_4_2__0__Impl
	rule__HashType__Group_4_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HashType__Group_4_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHashTypeAccess().getC_COMMATerminalRuleCall_4_2_0()); }
	RULE_C_COMMA
{ after(grammarAccess.getHashTypeAccess().getC_COMMATerminalRuleCall_4_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__HashType__Group_4_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__HashType__Group_4_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HashType__Group_4_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHashTypeAccess().getParamsAssignment_4_2_1()); }
(rule__HashType__ParamsAssignment_4_2_1)
{ after(grammarAccess.getHashTypeAccess().getParamsAssignment_4_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__XML2__TypesAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getXML2Access().getTypesTypeParserRuleCall_0_0()); }
	ruleType{ after(grammarAccess.getXML2Access().getTypesTypeParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__XML2__OtherCommAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getXML2Access().getOtherCommCOMMENTTerminalRuleCall_1_0()); }
	RULE_COMMENT{ after(grammarAccess.getXML2Access().getOtherCommCOMMENTTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Type__CommAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getCommCOMMENTTerminalRuleCall_0_0()); }
	RULE_COMMENT{ after(grammarAccess.getTypeAccess().getCommCOMMENTTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Type__InputAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getInputInputParserRuleCall_1_0()); }
	ruleInput{ after(grammarAccess.getTypeAccess().getInputInputParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Type__PrefixAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getPrefixC_TYPETerminalRuleCall_2_0()); }
	RULE_C_TYPE{ after(grammarAccess.getTypeAccess().getPrefixC_TYPETerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Type__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getNameNAMETerminalRuleCall_3_0()); }
	RULE_NAME{ after(grammarAccess.getTypeAccess().getNameNAMETerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Type__FieldsAssignment_5_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getFieldsFieldParserRuleCall_5_0_0()); }
	ruleField{ after(grammarAccess.getTypeAccess().getFieldsFieldParserRuleCall_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Type__OtherCommAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTypeAccess().getOtherCommCOMMENTTerminalRuleCall_5_1_0()); }
	RULE_COMMENT{ after(grammarAccess.getTypeAccess().getOtherCommCOMMENTTerminalRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Input__PrefixAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInputAccess().getPrefixC_INPUTTerminalRuleCall_1_0()); }
	RULE_C_INPUT{ after(grammarAccess.getInputAccess().getPrefixC_INPUTTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Input__FilePathAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInputAccess().getFilePathSTRINGTerminalRuleCall_5_0()); }
	RULE_STRING{ after(grammarAccess.getInputAccess().getFilePathSTRINGTerminalRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Input__NodePathAssignment_6_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInputAccess().getNodePathSTRINGTerminalRuleCall_6_3_0()); }
	RULE_STRING{ after(grammarAccess.getInputAccess().getNodePathSTRINGTerminalRuleCall_6_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Field__CommAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getCommCOMMENTTerminalRuleCall_0_0()); }
	RULE_COMMENT{ after(grammarAccess.getFieldAccess().getCommCOMMENTTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Field__TypeAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getTypeAlternatives_1_0()); }
(rule__Field__TypeAlternatives_1_0)
{ after(grammarAccess.getFieldAccess().getTypeAlternatives_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Field__FieldNameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getFieldNameNAMETerminalRuleCall_2_0()); }
	RULE_NAME{ after(grammarAccess.getFieldAccess().getFieldNameNAMETerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Field__NodePathAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFieldAccess().getNodePathSTRINGTerminalRuleCall_4_0()); }
	RULE_STRING{ after(grammarAccess.getFieldAccess().getNodePathSTRINGTerminalRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NativeType__TypeAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNativeTypeAccess().getTypeTypeNameParserRuleCall_0()); }
	ruleTypeName{ after(grammarAccess.getNativeTypeAccess().getTypeTypeNameParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ListType__TypeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getListTypeAccess().getTypeTypeNameParserRuleCall_2_0()); }
	ruleTypeName{ after(grammarAccess.getListTypeAccess().getTypeTypeNameParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HashType__TypeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHashTypeAccess().getTypeTypeNameParserRuleCall_2_0()); }
	ruleTypeName{ after(grammarAccess.getHashTypeAccess().getTypeTypeNameParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HashType__ParamsAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHashTypeAccess().getParamsParamParserRuleCall_4_1_0()); }
	ruleParam{ after(grammarAccess.getHashTypeAccess().getParamsParamParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__HashType__ParamsAssignment_4_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getHashTypeAccess().getParamsParamParserRuleCall_4_2_1_0()); }
	ruleParam{ after(grammarAccess.getHashTypeAccess().getParamsParamParserRuleCall_4_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Param__ParamNameAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParamAccess().getParamNameNAMETerminalRuleCall_0()); }
	RULE_NAME{ after(grammarAccess.getParamAccess().getParamNameNAMETerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


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


