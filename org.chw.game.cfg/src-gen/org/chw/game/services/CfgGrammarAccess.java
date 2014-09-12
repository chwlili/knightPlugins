/*
* generated by Xtext
*/
package org.chw.game.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;


@Singleton
public class CfgGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class XML2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "XML2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPackAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cPackPackDefParserRuleCall_0_0 = (RuleCall)cPackAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cTypesAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cTypesTypeParserRuleCall_1_0_0 = (RuleCall)cTypesAssignment_1_0.eContents().get(0);
		private final Assignment cOtherCommAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cOtherCommCOMMENTTerminalRuleCall_1_1_0 = (RuleCall)cOtherCommAssignment_1_1.eContents().get(0);
		
		//XML2:
		//
		//	pack=PackDef? (types+=Type | otherComm+=COMMENT)*;
		public ParserRule getRule() { return rule; }

		//pack=PackDef? (types+=Type | otherComm+=COMMENT)*
		public Group getGroup() { return cGroup; }

		//pack=PackDef?
		public Assignment getPackAssignment_0() { return cPackAssignment_0; }

		//PackDef
		public RuleCall getPackPackDefParserRuleCall_0_0() { return cPackPackDefParserRuleCall_0_0; }

		//(types+=Type | otherComm+=COMMENT)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//types+=Type
		public Assignment getTypesAssignment_1_0() { return cTypesAssignment_1_0; }

		//Type
		public RuleCall getTypesTypeParserRuleCall_1_0_0() { return cTypesTypeParserRuleCall_1_0_0; }

		//otherComm+=COMMENT
		public Assignment getOtherCommAssignment_1_1() { return cOtherCommAssignment_1_1; }

		//COMMENT
		public RuleCall getOtherCommCOMMENTTerminalRuleCall_1_1_0() { return cOtherCommCOMMENTTerminalRuleCall_1_1_0; }
	}

	public class PackDefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PackDef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPackCHARAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cPackCHARC_PACKAGETerminalRuleCall_0_0 = (RuleCall)cPackCHARAssignment_0.eContents().get(0);
		private final Assignment cPackAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPackPackNameParserRuleCall_1_0 = (RuleCall)cPackAssignment_1.eContents().get(0);
		private final RuleCall cC_SEMICOLONTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//PackDef:
		//
		//	packCHAR=C_PACKAGE pack=PackName C_SEMICOLON?;
		public ParserRule getRule() { return rule; }

		//packCHAR=C_PACKAGE pack=PackName C_SEMICOLON?
		public Group getGroup() { return cGroup; }

		//packCHAR=C_PACKAGE
		public Assignment getPackCHARAssignment_0() { return cPackCHARAssignment_0; }

		//C_PACKAGE
		public RuleCall getPackCHARC_PACKAGETerminalRuleCall_0_0() { return cPackCHARC_PACKAGETerminalRuleCall_0_0; }

		//pack=PackName
		public Assignment getPackAssignment_1() { return cPackAssignment_1; }

		//PackName
		public RuleCall getPackPackNameParserRuleCall_1_0() { return cPackPackNameParserRuleCall_1_0; }

		//C_SEMICOLON?
		public RuleCall getC_SEMICOLONTerminalRuleCall_2() { return cC_SEMICOLONTerminalRuleCall_2; }
	}

	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Type");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCommAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCommCOMMENTTerminalRuleCall_0_0 = (RuleCall)cCommAssignment_0.eContents().get(0);
		private final Assignment cInputAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cInputInputParserRuleCall_1_0 = (RuleCall)cInputAssignment_1.eContents().get(0);
		private final Assignment cPrefixAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPrefixC_TYPETerminalRuleCall_2_0 = (RuleCall)cPrefixAssignment_2.eContents().get(0);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameNAMETerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final RuleCall cC_BRACE_LTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Alternatives cAlternatives_5 = (Alternatives)cGroup.eContents().get(5);
		private final Assignment cFieldsAssignment_5_0 = (Assignment)cAlternatives_5.eContents().get(0);
		private final RuleCall cFieldsFieldParserRuleCall_5_0_0 = (RuleCall)cFieldsAssignment_5_0.eContents().get(0);
		private final Assignment cOtherCommAssignment_5_1 = (Assignment)cAlternatives_5.eContents().get(1);
		private final RuleCall cOtherCommCOMMENTTerminalRuleCall_5_1_0 = (RuleCall)cOtherCommAssignment_5_1.eContents().get(0);
		private final RuleCall cC_BRACE_RTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		
		//Type:
		//
		//	comm=COMMENT input=Input? prefix=C_TYPE name=NAME C_BRACE_L (fields+=Field | otherComm+=COMMENT)* C_BRACE_R;
		public ParserRule getRule() { return rule; }

		//comm=COMMENT input=Input? prefix=C_TYPE name=NAME C_BRACE_L (fields+=Field | otherComm+=COMMENT)* C_BRACE_R
		public Group getGroup() { return cGroup; }

		//comm=COMMENT
		public Assignment getCommAssignment_0() { return cCommAssignment_0; }

		//COMMENT
		public RuleCall getCommCOMMENTTerminalRuleCall_0_0() { return cCommCOMMENTTerminalRuleCall_0_0; }

		//input=Input?
		public Assignment getInputAssignment_1() { return cInputAssignment_1; }

		//Input
		public RuleCall getInputInputParserRuleCall_1_0() { return cInputInputParserRuleCall_1_0; }

		//prefix=C_TYPE
		public Assignment getPrefixAssignment_2() { return cPrefixAssignment_2; }

		//C_TYPE
		public RuleCall getPrefixC_TYPETerminalRuleCall_2_0() { return cPrefixC_TYPETerminalRuleCall_2_0; }

		//name=NAME
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//NAME
		public RuleCall getNameNAMETerminalRuleCall_3_0() { return cNameNAMETerminalRuleCall_3_0; }

		//C_BRACE_L
		public RuleCall getC_BRACE_LTerminalRuleCall_4() { return cC_BRACE_LTerminalRuleCall_4; }

		//(fields+=Field | otherComm+=COMMENT)*
		public Alternatives getAlternatives_5() { return cAlternatives_5; }

		//fields+=Field
		public Assignment getFieldsAssignment_5_0() { return cFieldsAssignment_5_0; }

		//Field
		public RuleCall getFieldsFieldParserRuleCall_5_0_0() { return cFieldsFieldParserRuleCall_5_0_0; }

		//otherComm+=COMMENT
		public Assignment getOtherCommAssignment_5_1() { return cOtherCommAssignment_5_1; }

		//COMMENT
		public RuleCall getOtherCommCOMMENTTerminalRuleCall_5_1_0() { return cOtherCommCOMMENTTerminalRuleCall_5_1_0; }

		//C_BRACE_R
		public RuleCall getC_BRACE_RTerminalRuleCall_6() { return cC_BRACE_RTerminalRuleCall_6; }
	}

	public class InputElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Input");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cC_BRACKET_LTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cPrefixAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPrefixC_INPUTTerminalRuleCall_1_0 = (RuleCall)cPrefixAssignment_1.eContents().get(0);
		private final RuleCall cC_PAREN_LTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cC_FILETerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final RuleCall cC_EQUALSTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Assignment cFilePathAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cFilePathSTRINGTerminalRuleCall_5_0 = (RuleCall)cFilePathAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final RuleCall cC_COMMATerminalRuleCall_6_0 = (RuleCall)cGroup_6.eContents().get(0);
		private final RuleCall cC_NODETerminalRuleCall_6_1 = (RuleCall)cGroup_6.eContents().get(1);
		private final RuleCall cC_EQUALSTerminalRuleCall_6_2 = (RuleCall)cGroup_6.eContents().get(2);
		private final Assignment cNodePathAssignment_6_3 = (Assignment)cGroup_6.eContents().get(3);
		private final RuleCall cNodePathSTRINGTerminalRuleCall_6_3_0 = (RuleCall)cNodePathAssignment_6_3.eContents().get(0);
		private final RuleCall cC_PAREN_RTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final RuleCall cC_BRACKET_RTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		
		//Input:
		//
		//	C_BRACKET_L prefix=C_INPUT C_PAREN_L C_FILE C_EQUALS filePath=STRING (C_COMMA C_NODE C_EQUALS nodePath=STRING)?
		//
		//	C_PAREN_R C_BRACKET_R;
		public ParserRule getRule() { return rule; }

		//C_BRACKET_L prefix=C_INPUT C_PAREN_L C_FILE C_EQUALS filePath=STRING (C_COMMA C_NODE C_EQUALS nodePath=STRING)?
		//
		//C_PAREN_R C_BRACKET_R
		public Group getGroup() { return cGroup; }

		//C_BRACKET_L
		public RuleCall getC_BRACKET_LTerminalRuleCall_0() { return cC_BRACKET_LTerminalRuleCall_0; }

		//prefix=C_INPUT
		public Assignment getPrefixAssignment_1() { return cPrefixAssignment_1; }

		//C_INPUT
		public RuleCall getPrefixC_INPUTTerminalRuleCall_1_0() { return cPrefixC_INPUTTerminalRuleCall_1_0; }

		//C_PAREN_L
		public RuleCall getC_PAREN_LTerminalRuleCall_2() { return cC_PAREN_LTerminalRuleCall_2; }

		//C_FILE
		public RuleCall getC_FILETerminalRuleCall_3() { return cC_FILETerminalRuleCall_3; }

		//C_EQUALS
		public RuleCall getC_EQUALSTerminalRuleCall_4() { return cC_EQUALSTerminalRuleCall_4; }

		//filePath=STRING
		public Assignment getFilePathAssignment_5() { return cFilePathAssignment_5; }

		//STRING
		public RuleCall getFilePathSTRINGTerminalRuleCall_5_0() { return cFilePathSTRINGTerminalRuleCall_5_0; }

		//(C_COMMA C_NODE C_EQUALS nodePath=STRING)?
		public Group getGroup_6() { return cGroup_6; }

		//C_COMMA
		public RuleCall getC_COMMATerminalRuleCall_6_0() { return cC_COMMATerminalRuleCall_6_0; }

		//C_NODE
		public RuleCall getC_NODETerminalRuleCall_6_1() { return cC_NODETerminalRuleCall_6_1; }

		//C_EQUALS
		public RuleCall getC_EQUALSTerminalRuleCall_6_2() { return cC_EQUALSTerminalRuleCall_6_2; }

		//nodePath=STRING
		public Assignment getNodePathAssignment_6_3() { return cNodePathAssignment_6_3; }

		//STRING
		public RuleCall getNodePathSTRINGTerminalRuleCall_6_3_0() { return cNodePathSTRINGTerminalRuleCall_6_3_0; }

		//C_PAREN_R
		public RuleCall getC_PAREN_RTerminalRuleCall_7() { return cC_PAREN_RTerminalRuleCall_7; }

		//C_BRACKET_R
		public RuleCall getC_BRACKET_RTerminalRuleCall_8() { return cC_BRACKET_RTerminalRuleCall_8; }
	}

	public class FieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Field");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCommAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCommCOMMENTTerminalRuleCall_0_0 = (RuleCall)cCommAssignment_0.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cTypeAlternatives_1_0 = (Alternatives)cTypeAssignment_1.eContents().get(0);
		private final RuleCall cTypeNativeTypeParserRuleCall_1_0_0 = (RuleCall)cTypeAlternatives_1_0.eContents().get(0);
		private final RuleCall cTypeListTypeParserRuleCall_1_0_1 = (RuleCall)cTypeAlternatives_1_0.eContents().get(1);
		private final RuleCall cTypeHashTypeParserRuleCall_1_0_2 = (RuleCall)cTypeAlternatives_1_0.eContents().get(2);
		private final Assignment cFieldNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFieldNameNAMETerminalRuleCall_2_0 = (RuleCall)cFieldNameAssignment_2.eContents().get(0);
		private final RuleCall cC_EQUALSTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cNodePathAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNodePathSTRINGTerminalRuleCall_4_0 = (RuleCall)cNodePathAssignment_4.eContents().get(0);
		private final RuleCall cC_SEMICOLONTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//Field:
		//
		//	comm=COMMENT type=(NativeType | ListType | HashType) fieldName=NAME C_EQUALS nodePath=STRING C_SEMICOLON?;
		public ParserRule getRule() { return rule; }

		//comm=COMMENT type=(NativeType | ListType | HashType) fieldName=NAME C_EQUALS nodePath=STRING C_SEMICOLON?
		public Group getGroup() { return cGroup; }

		//comm=COMMENT
		public Assignment getCommAssignment_0() { return cCommAssignment_0; }

		//COMMENT
		public RuleCall getCommCOMMENTTerminalRuleCall_0_0() { return cCommCOMMENTTerminalRuleCall_0_0; }

		//type=(NativeType | ListType | HashType)
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//NativeType | ListType | HashType
		public Alternatives getTypeAlternatives_1_0() { return cTypeAlternatives_1_0; }

		//NativeType
		public RuleCall getTypeNativeTypeParserRuleCall_1_0_0() { return cTypeNativeTypeParserRuleCall_1_0_0; }

		//ListType
		public RuleCall getTypeListTypeParserRuleCall_1_0_1() { return cTypeListTypeParserRuleCall_1_0_1; }

		//HashType
		public RuleCall getTypeHashTypeParserRuleCall_1_0_2() { return cTypeHashTypeParserRuleCall_1_0_2; }

		//fieldName=NAME
		public Assignment getFieldNameAssignment_2() { return cFieldNameAssignment_2; }

		//NAME
		public RuleCall getFieldNameNAMETerminalRuleCall_2_0() { return cFieldNameNAMETerminalRuleCall_2_0; }

		//C_EQUALS
		public RuleCall getC_EQUALSTerminalRuleCall_3() { return cC_EQUALSTerminalRuleCall_3; }

		//nodePath=STRING
		public Assignment getNodePathAssignment_4() { return cNodePathAssignment_4; }

		//STRING
		public RuleCall getNodePathSTRINGTerminalRuleCall_4_0() { return cNodePathSTRINGTerminalRuleCall_4_0; }

		//C_SEMICOLON?
		public RuleCall getC_SEMICOLONTerminalRuleCall_5() { return cC_SEMICOLONTerminalRuleCall_5; }
	}

	public class NativeTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NativeType");
		private final Assignment cTypeAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTypeTypeNameParserRuleCall_0 = (RuleCall)cTypeAssignment.eContents().get(0);
		
		//NativeType:
		//
		//	type=TypeName;
		public ParserRule getRule() { return rule; }

		//type=TypeName
		public Assignment getTypeAssignment() { return cTypeAssignment; }

		//TypeName
		public RuleCall getTypeTypeNameParserRuleCall_0() { return cTypeTypeNameParserRuleCall_0; }
	}

	public class ListTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ListType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cC_LISTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cC_ANGLE_LTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeTypeNameParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cC_ANGLE_RTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//ListType:
		//
		//	C_LIST C_ANGLE_L type=TypeName C_ANGLE_R;
		public ParserRule getRule() { return rule; }

		//C_LIST C_ANGLE_L type=TypeName C_ANGLE_R
		public Group getGroup() { return cGroup; }

		//C_LIST
		public RuleCall getC_LISTTerminalRuleCall_0() { return cC_LISTTerminalRuleCall_0; }

		//C_ANGLE_L
		public RuleCall getC_ANGLE_LTerminalRuleCall_1() { return cC_ANGLE_LTerminalRuleCall_1; }

		//type=TypeName
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//TypeName
		public RuleCall getTypeTypeNameParserRuleCall_2_0() { return cTypeTypeNameParserRuleCall_2_0; }

		//C_ANGLE_R
		public RuleCall getC_ANGLE_RTerminalRuleCall_3() { return cC_ANGLE_RTerminalRuleCall_3; }
	}

	public class HashTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "HashType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cC_HASHTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cC_ANGLE_LTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeTypeNameParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cC_ANGLE_RTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final RuleCall cC_PAREN_LTerminalRuleCall_4_0 = (RuleCall)cGroup_4.eContents().get(0);
		private final Assignment cParamsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cParamsParamParserRuleCall_4_1_0 = (RuleCall)cParamsAssignment_4_1.eContents().get(0);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final RuleCall cC_COMMATerminalRuleCall_4_2_0 = (RuleCall)cGroup_4_2.eContents().get(0);
		private final Assignment cParamsAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final RuleCall cParamsParamParserRuleCall_4_2_1_0 = (RuleCall)cParamsAssignment_4_2_1.eContents().get(0);
		private final RuleCall cC_PAREN_RTerminalRuleCall_4_3 = (RuleCall)cGroup_4.eContents().get(3);
		
		//HashType:
		//
		//	C_HASH C_ANGLE_L type=TypeName C_ANGLE_R (C_PAREN_L params+=Param (C_COMMA params+=Param)* C_PAREN_R)?;
		public ParserRule getRule() { return rule; }

		//C_HASH C_ANGLE_L type=TypeName C_ANGLE_R (C_PAREN_L params+=Param (C_COMMA params+=Param)* C_PAREN_R)?
		public Group getGroup() { return cGroup; }

		//C_HASH
		public RuleCall getC_HASHTerminalRuleCall_0() { return cC_HASHTerminalRuleCall_0; }

		//C_ANGLE_L
		public RuleCall getC_ANGLE_LTerminalRuleCall_1() { return cC_ANGLE_LTerminalRuleCall_1; }

		//type=TypeName
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//TypeName
		public RuleCall getTypeTypeNameParserRuleCall_2_0() { return cTypeTypeNameParserRuleCall_2_0; }

		//C_ANGLE_R
		public RuleCall getC_ANGLE_RTerminalRuleCall_3() { return cC_ANGLE_RTerminalRuleCall_3; }

		//(C_PAREN_L params+=Param (C_COMMA params+=Param)* C_PAREN_R)?
		public Group getGroup_4() { return cGroup_4; }

		//C_PAREN_L
		public RuleCall getC_PAREN_LTerminalRuleCall_4_0() { return cC_PAREN_LTerminalRuleCall_4_0; }

		//params+=Param
		public Assignment getParamsAssignment_4_1() { return cParamsAssignment_4_1; }

		//Param
		public RuleCall getParamsParamParserRuleCall_4_1_0() { return cParamsParamParserRuleCall_4_1_0; }

		//(C_COMMA params+=Param)*
		public Group getGroup_4_2() { return cGroup_4_2; }

		//C_COMMA
		public RuleCall getC_COMMATerminalRuleCall_4_2_0() { return cC_COMMATerminalRuleCall_4_2_0; }

		//params+=Param
		public Assignment getParamsAssignment_4_2_1() { return cParamsAssignment_4_2_1; }

		//Param
		public RuleCall getParamsParamParserRuleCall_4_2_1_0() { return cParamsParamParserRuleCall_4_2_1_0; }

		//C_PAREN_R
		public RuleCall getC_PAREN_RTerminalRuleCall_4_3() { return cC_PAREN_RTerminalRuleCall_4_3; }
	}

	public class ParamElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Param");
		private final Assignment cParamNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cParamNameNAMETerminalRuleCall_0 = (RuleCall)cParamNameAssignment.eContents().get(0);
		
		//Param:
		//
		//	paramName=NAME;
		public ParserRule getRule() { return rule; }

		//paramName=NAME
		public Assignment getParamNameAssignment() { return cParamNameAssignment; }

		//NAME
		public RuleCall getParamNameNAMETerminalRuleCall_0() { return cParamNameNAMETerminalRuleCall_0; }
	}

	public class PackNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PackName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cNAMETerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cNAMETerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//PackName:
		//
		//	NAME ("." NAME)*;
		public ParserRule getRule() { return rule; }

		//NAME ("." NAME)*
		public Group getGroup() { return cGroup; }

		//NAME
		public RuleCall getNAMETerminalRuleCall_0() { return cNAMETerminalRuleCall_0; }

		//("." NAME)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//NAME
		public RuleCall getNAMETerminalRuleCall_1_1() { return cNAMETerminalRuleCall_1_1; }
	}

	public class TypeNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TypeName");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cC_INPUTTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cC_FILETerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cC_NODETerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cC_TYPETerminalRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cC_INTTerminalRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cC_UINTTerminalRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cC_BOOLTerminalRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cC_NUMBERTerminalRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cC_STRINGTerminalRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final RuleCall cC_LISTTerminalRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		private final RuleCall cC_HASHTerminalRuleCall_10 = (RuleCall)cAlternatives.eContents().get(10);
		private final RuleCall cNAMETerminalRuleCall_11 = (RuleCall)cAlternatives.eContents().get(11);
		
		//TypeName:
		//
		//	C_INPUT | C_FILE | C_NODE | C_TYPE | C_INT | C_UINT | C_BOOL | C_NUMBER | C_STRING | C_LIST | C_HASH | NAME;
		public ParserRule getRule() { return rule; }

		//C_INPUT | C_FILE | C_NODE | C_TYPE | C_INT | C_UINT | C_BOOL | C_NUMBER | C_STRING | C_LIST | C_HASH | NAME
		public Alternatives getAlternatives() { return cAlternatives; }

		//C_INPUT
		public RuleCall getC_INPUTTerminalRuleCall_0() { return cC_INPUTTerminalRuleCall_0; }

		//C_FILE
		public RuleCall getC_FILETerminalRuleCall_1() { return cC_FILETerminalRuleCall_1; }

		//C_NODE
		public RuleCall getC_NODETerminalRuleCall_2() { return cC_NODETerminalRuleCall_2; }

		//C_TYPE
		public RuleCall getC_TYPETerminalRuleCall_3() { return cC_TYPETerminalRuleCall_3; }

		//C_INT
		public RuleCall getC_INTTerminalRuleCall_4() { return cC_INTTerminalRuleCall_4; }

		//C_UINT
		public RuleCall getC_UINTTerminalRuleCall_5() { return cC_UINTTerminalRuleCall_5; }

		//C_BOOL
		public RuleCall getC_BOOLTerminalRuleCall_6() { return cC_BOOLTerminalRuleCall_6; }

		//C_NUMBER
		public RuleCall getC_NUMBERTerminalRuleCall_7() { return cC_NUMBERTerminalRuleCall_7; }

		//C_STRING
		public RuleCall getC_STRINGTerminalRuleCall_8() { return cC_STRINGTerminalRuleCall_8; }

		//C_LIST
		public RuleCall getC_LISTTerminalRuleCall_9() { return cC_LISTTerminalRuleCall_9; }

		//C_HASH
		public RuleCall getC_HASHTerminalRuleCall_10() { return cC_HASHTerminalRuleCall_10; }

		//NAME
		public RuleCall getNAMETerminalRuleCall_11() { return cNAMETerminalRuleCall_11; }
	}
	
	
	private XML2Elements pXML2;
	private PackDefElements pPackDef;
	private TypeElements pType;
	private InputElements pInput;
	private FieldElements pField;
	private NativeTypeElements pNativeType;
	private ListTypeElements pListType;
	private HashTypeElements pHashType;
	private ParamElements pParam;
	private PackNameElements pPackName;
	private TypeNameElements pTypeName;
	private TerminalRule tC_BRACKET_L;
	private TerminalRule tC_BRACKET_R;
	private TerminalRule tC_PAREN_L;
	private TerminalRule tC_PAREN_R;
	private TerminalRule tC_BRACE_L;
	private TerminalRule tC_BRACE_R;
	private TerminalRule tC_ANGLE_L;
	private TerminalRule tC_ANGLE_R;
	private TerminalRule tC_EQUALS;
	private TerminalRule tC_COMMA;
	private TerminalRule tC_SEMICOLON;
	private TerminalRule tC_INPUT;
	private TerminalRule tC_FILE;
	private TerminalRule tC_NODE;
	private TerminalRule tC_TYPE;
	private TerminalRule tC_INT;
	private TerminalRule tC_UINT;
	private TerminalRule tC_BOOL;
	private TerminalRule tC_NUMBER;
	private TerminalRule tC_STRING;
	private TerminalRule tC_LIST;
	private TerminalRule tC_HASH;
	private TerminalRule tC_PACKAGE;
	private TerminalRule tNAME;
	private TerminalRule tSTRING;
	private TerminalRule tCOMMENT_END;
	private TerminalRule tCOMMENT;
	private TerminalRule tWS;
	
	private final Grammar grammar;

	@Inject
	public CfgGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.chw.game.Cfg".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	//XML2:
	//
	//	pack=PackDef? (types+=Type | otherComm+=COMMENT)*;
	public XML2Elements getXML2Access() {
		return (pXML2 != null) ? pXML2 : (pXML2 = new XML2Elements());
	}
	
	public ParserRule getXML2Rule() {
		return getXML2Access().getRule();
	}

	//PackDef:
	//
	//	packCHAR=C_PACKAGE pack=PackName C_SEMICOLON?;
	public PackDefElements getPackDefAccess() {
		return (pPackDef != null) ? pPackDef : (pPackDef = new PackDefElements());
	}
	
	public ParserRule getPackDefRule() {
		return getPackDefAccess().getRule();
	}

	//Type:
	//
	//	comm=COMMENT input=Input? prefix=C_TYPE name=NAME C_BRACE_L (fields+=Field | otherComm+=COMMENT)* C_BRACE_R;
	public TypeElements getTypeAccess() {
		return (pType != null) ? pType : (pType = new TypeElements());
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}

	//Input:
	//
	//	C_BRACKET_L prefix=C_INPUT C_PAREN_L C_FILE C_EQUALS filePath=STRING (C_COMMA C_NODE C_EQUALS nodePath=STRING)?
	//
	//	C_PAREN_R C_BRACKET_R;
	public InputElements getInputAccess() {
		return (pInput != null) ? pInput : (pInput = new InputElements());
	}
	
	public ParserRule getInputRule() {
		return getInputAccess().getRule();
	}

	//Field:
	//
	//	comm=COMMENT type=(NativeType | ListType | HashType) fieldName=NAME C_EQUALS nodePath=STRING C_SEMICOLON?;
	public FieldElements getFieldAccess() {
		return (pField != null) ? pField : (pField = new FieldElements());
	}
	
	public ParserRule getFieldRule() {
		return getFieldAccess().getRule();
	}

	//NativeType:
	//
	//	type=TypeName;
	public NativeTypeElements getNativeTypeAccess() {
		return (pNativeType != null) ? pNativeType : (pNativeType = new NativeTypeElements());
	}
	
	public ParserRule getNativeTypeRule() {
		return getNativeTypeAccess().getRule();
	}

	//ListType:
	//
	//	C_LIST C_ANGLE_L type=TypeName C_ANGLE_R;
	public ListTypeElements getListTypeAccess() {
		return (pListType != null) ? pListType : (pListType = new ListTypeElements());
	}
	
	public ParserRule getListTypeRule() {
		return getListTypeAccess().getRule();
	}

	//HashType:
	//
	//	C_HASH C_ANGLE_L type=TypeName C_ANGLE_R (C_PAREN_L params+=Param (C_COMMA params+=Param)* C_PAREN_R)?;
	public HashTypeElements getHashTypeAccess() {
		return (pHashType != null) ? pHashType : (pHashType = new HashTypeElements());
	}
	
	public ParserRule getHashTypeRule() {
		return getHashTypeAccess().getRule();
	}

	//Param:
	//
	//	paramName=NAME;
	public ParamElements getParamAccess() {
		return (pParam != null) ? pParam : (pParam = new ParamElements());
	}
	
	public ParserRule getParamRule() {
		return getParamAccess().getRule();
	}

	//PackName:
	//
	//	NAME ("." NAME)*;
	public PackNameElements getPackNameAccess() {
		return (pPackName != null) ? pPackName : (pPackName = new PackNameElements());
	}
	
	public ParserRule getPackNameRule() {
		return getPackNameAccess().getRule();
	}

	//TypeName:
	//
	//	C_INPUT | C_FILE | C_NODE | C_TYPE | C_INT | C_UINT | C_BOOL | C_NUMBER | C_STRING | C_LIST | C_HASH | NAME;
	public TypeNameElements getTypeNameAccess() {
		return (pTypeName != null) ? pTypeName : (pTypeName = new TypeNameElements());
	}
	
	public ParserRule getTypeNameRule() {
		return getTypeNameAccess().getRule();
	}

	//terminal C_BRACKET_L:
	//
	//	"[";
	public TerminalRule getC_BRACKET_LRule() {
		return (tC_BRACKET_L != null) ? tC_BRACKET_L : (tC_BRACKET_L = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "C_BRACKET_L"));
	} 

	//terminal C_BRACKET_R:
	//
	//	"]";
	public TerminalRule getC_BRACKET_RRule() {
		return (tC_BRACKET_R != null) ? tC_BRACKET_R : (tC_BRACKET_R = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "C_BRACKET_R"));
	} 

	//terminal C_PAREN_L:
	//
	//	"(";
	public TerminalRule getC_PAREN_LRule() {
		return (tC_PAREN_L != null) ? tC_PAREN_L : (tC_PAREN_L = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "C_PAREN_L"));
	} 

	//terminal C_PAREN_R:
	//
	//	")";
	public TerminalRule getC_PAREN_RRule() {
		return (tC_PAREN_R != null) ? tC_PAREN_R : (tC_PAREN_R = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "C_PAREN_R"));
	} 

	//terminal C_BRACE_L:
	//
	//	"{";
	public TerminalRule getC_BRACE_LRule() {
		return (tC_BRACE_L != null) ? tC_BRACE_L : (tC_BRACE_L = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "C_BRACE_L"));
	} 

	//terminal C_BRACE_R:
	//
	//	"}";
	public TerminalRule getC_BRACE_RRule() {
		return (tC_BRACE_R != null) ? tC_BRACE_R : (tC_BRACE_R = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "C_BRACE_R"));
	} 

	//terminal C_ANGLE_L:
	//
	//	"<";
	public TerminalRule getC_ANGLE_LRule() {
		return (tC_ANGLE_L != null) ? tC_ANGLE_L : (tC_ANGLE_L = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "C_ANGLE_L"));
	} 

	//terminal C_ANGLE_R:
	//
	//	">";
	public TerminalRule getC_ANGLE_RRule() {
		return (tC_ANGLE_R != null) ? tC_ANGLE_R : (tC_ANGLE_R = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "C_ANGLE_R"));
	} 

	//terminal C_EQUALS:
	//
	//	"=";
	public TerminalRule getC_EQUALSRule() {
		return (tC_EQUALS != null) ? tC_EQUALS : (tC_EQUALS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "C_EQUALS"));
	} 

	//terminal C_COMMA:
	//
	//	",";
	public TerminalRule getC_COMMARule() {
		return (tC_COMMA != null) ? tC_COMMA : (tC_COMMA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "C_COMMA"));
	} 

	//terminal C_SEMICOLON:
	//
	//	";";
	public TerminalRule getC_SEMICOLONRule() {
		return (tC_SEMICOLON != null) ? tC_SEMICOLON : (tC_SEMICOLON = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "C_SEMICOLON"));
	} 

	//terminal C_INPUT:
	//
	//	"input";
	public TerminalRule getC_INPUTRule() {
		return (tC_INPUT != null) ? tC_INPUT : (tC_INPUT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "C_INPUT"));
	} 

	//terminal C_FILE:
	//
	//	"file";
	public TerminalRule getC_FILERule() {
		return (tC_FILE != null) ? tC_FILE : (tC_FILE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "C_FILE"));
	} 

	//terminal C_NODE:
	//
	//	"node";
	public TerminalRule getC_NODERule() {
		return (tC_NODE != null) ? tC_NODE : (tC_NODE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "C_NODE"));
	} 

	//terminal C_TYPE:
	//
	//	"type";
	public TerminalRule getC_TYPERule() {
		return (tC_TYPE != null) ? tC_TYPE : (tC_TYPE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "C_TYPE"));
	} 

	//terminal C_INT:
	//
	//	"int";
	public TerminalRule getC_INTRule() {
		return (tC_INT != null) ? tC_INT : (tC_INT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "C_INT"));
	} 

	//terminal C_UINT:
	//
	//	"uint";
	public TerminalRule getC_UINTRule() {
		return (tC_UINT != null) ? tC_UINT : (tC_UINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "C_UINT"));
	} 

	//terminal C_BOOL:
	//
	//	"Boolean";
	public TerminalRule getC_BOOLRule() {
		return (tC_BOOL != null) ? tC_BOOL : (tC_BOOL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "C_BOOL"));
	} 

	//terminal C_NUMBER:
	//
	//	"Number";
	public TerminalRule getC_NUMBERRule() {
		return (tC_NUMBER != null) ? tC_NUMBER : (tC_NUMBER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "C_NUMBER"));
	} 

	//terminal C_STRING:
	//
	//	"String";
	public TerminalRule getC_STRINGRule() {
		return (tC_STRING != null) ? tC_STRING : (tC_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "C_STRING"));
	} 

	//terminal C_LIST:
	//
	//	"List";
	public TerminalRule getC_LISTRule() {
		return (tC_LIST != null) ? tC_LIST : (tC_LIST = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "C_LIST"));
	} 

	//terminal C_HASH:
	//
	//	"Hash";
	public TerminalRule getC_HASHRule() {
		return (tC_HASH != null) ? tC_HASH : (tC_HASH = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "C_HASH"));
	} 

	//terminal C_PACKAGE:
	//
	//	"package";
	public TerminalRule getC_PACKAGERule() {
		return (tC_PACKAGE != null) ? tC_PACKAGE : (tC_PACKAGE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "C_PACKAGE"));
	} 

	//terminal NAME:
	//
	//	("a".."z" | "A".."Z") ("a".."z" | "A".."Z" | "0".."9" | "_")*;
	public TerminalRule getNAMERule() {
		return (tNAME != null) ? tNAME : (tNAME = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "NAME"));
	} 

	//terminal STRING:
	//
	//	"\"" !("\r" | "\n" | "\"")* "\"";
	public TerminalRule getSTRINGRule() {
		return (tSTRING != null) ? tSTRING : (tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "STRING"));
	} 

	//terminal fragment COMMENT_END:
	//
	//	"* /";
	public TerminalRule getCOMMENT_ENDRule() {
		return (tCOMMENT_END != null) ? tCOMMENT_END : (tCOMMENT_END = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "COMMENT_END"));
	} 

	//terminal COMMENT:
	//
	//	"/ *"->COMMENT_END | "//" !("\r" | "\n")*;
	public TerminalRule getCOMMENTRule() {
		return (tCOMMENT != null) ? tCOMMENT : (tCOMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "COMMENT"));
	} 

	//terminal WS:
	//
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return (tWS != null) ? tWS : (tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "WS"));
	} 
}
