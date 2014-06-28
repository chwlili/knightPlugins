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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCfgParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMMENT", "RULE_C_TYPE", "RULE_NAME", "RULE_C_BRACE_L", "RULE_C_BRACE_R", "RULE_C_BRACKET_L", "RULE_C_INPUT", "RULE_C_PAREN_L", "RULE_C_FILE", "RULE_C_EQUALS", "RULE_STRING", "RULE_C_COMMA", "RULE_C_NODE", "RULE_C_PAREN_R", "RULE_C_BRACKET_R", "RULE_C_SEMICOLON", "RULE_C_LIST", "RULE_C_ANGLE_L", "RULE_C_ANGLE_R", "RULE_C_HASH", "RULE_C_INT", "RULE_C_UINT", "RULE_C_BOOL", "RULE_C_NUMBER", "RULE_C_STRING", "RULE_COMMENT_END", "RULE_WS"
    };
    public static final int RULE_C_NUMBER=27;
    public static final int RULE_C_COMMA=15;
    public static final int RULE_C_TYPE=5;
    public static final int RULE_C_PAREN_R=17;
    public static final int RULE_C_SEMICOLON=19;
    public static final int RULE_C_PAREN_L=11;
    public static final int RULE_C_NODE=16;
    public static final int RULE_C_INPUT=10;
    public static final int RULE_C_STRING=28;
    public static final int RULE_COMMENT=4;
    public static final int RULE_C_HASH=23;
    public static final int EOF=-1;
    public static final int RULE_C_ANGLE_L=21;
    public static final int RULE_C_ANGLE_R=22;
    public static final int RULE_COMMENT_END=29;
    public static final int RULE_C_BRACKET_L=9;
    public static final int RULE_STRING=14;
    public static final int RULE_C_EQUALS=13;
    public static final int RULE_C_UINT=25;
    public static final int RULE_C_BRACKET_R=18;
    public static final int RULE_C_INT=24;
    public static final int RULE_C_FILE=12;
    public static final int RULE_NAME=6;
    public static final int RULE_WS=30;
    public static final int RULE_C_BOOL=26;
    public static final int RULE_C_LIST=20;
    public static final int RULE_C_BRACE_L=7;
    public static final int RULE_C_BRACE_R=8;

    // delegates
    // delegators


        public InternalCfgParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCfgParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCfgParser.tokenNames; }
    public String getGrammarFileName() { return "../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g"; }



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



    // $ANTLR start "entryRuleXML2"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:67:1: entryRuleXML2 returns [EObject current=null] : iv_ruleXML2= ruleXML2 EOF ;
    public final EObject entryRuleXML2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXML2 = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:68:2: (iv_ruleXML2= ruleXML2 EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:69:2: iv_ruleXML2= ruleXML2 EOF
            {
             newCompositeNode(grammarAccess.getXML2Rule()); 
            pushFollow(FOLLOW_ruleXML2_in_entryRuleXML275);
            iv_ruleXML2=ruleXML2();

            state._fsp--;

             current =iv_ruleXML2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXML285); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXML2"


    // $ANTLR start "ruleXML2"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:76:1: ruleXML2 returns [EObject current=null] : ( ( (lv_types_0_0= ruleType ) ) | ( (lv_otherComm_1_0= RULE_COMMENT ) ) )* ;
    public final EObject ruleXML2() throws RecognitionException {
        EObject current = null;

        Token lv_otherComm_1_0=null;
        EObject lv_types_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:79:28: ( ( ( (lv_types_0_0= ruleType ) ) | ( (lv_otherComm_1_0= RULE_COMMENT ) ) )* )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:1: ( ( (lv_types_0_0= ruleType ) ) | ( (lv_otherComm_1_0= RULE_COMMENT ) ) )*
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:1: ( ( (lv_types_0_0= ruleType ) ) | ( (lv_otherComm_1_0= RULE_COMMENT ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_COMMENT) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==RULE_C_TYPE||LA1_2==RULE_C_BRACKET_L) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==EOF||LA1_2==RULE_COMMENT) ) {
                        alt1=2;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:2: ( (lv_types_0_0= ruleType ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:2: ( (lv_types_0_0= ruleType ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:81:1: (lv_types_0_0= ruleType )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:81:1: (lv_types_0_0= ruleType )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:82:3: lv_types_0_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXML2Access().getTypesTypeParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleXML2131);
            	    lv_types_0_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXML2Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_0_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:99:6: ( (lv_otherComm_1_0= RULE_COMMENT ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:99:6: ( (lv_otherComm_1_0= RULE_COMMENT ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:100:1: (lv_otherComm_1_0= RULE_COMMENT )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:100:1: (lv_otherComm_1_0= RULE_COMMENT )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:101:3: lv_otherComm_1_0= RULE_COMMENT
            	    {
            	    lv_otherComm_1_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleXML2154); 

            	    			newLeafNode(lv_otherComm_1_0, grammarAccess.getXML2Access().getOtherCommCOMMENTTerminalRuleCall_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getXML2Rule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"otherComm",
            	            		lv_otherComm_1_0, 
            	            		"COMMENT");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXML2"


    // $ANTLR start "entryRuleType"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:125:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:126:2: (iv_ruleType= ruleType EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:127:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType196);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType206); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:134:1: ruleType returns [EObject current=null] : ( ( (lv_comm_0_0= RULE_COMMENT ) ) ( (lv_input_1_0= ruleInput ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= RULE_NAME ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( (lv_fields_5_0= ruleField ) ) | ( (lv_otherComm_6_0= RULE_COMMENT ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_comm_0_0=null;
        Token lv_prefix_2_0=null;
        Token lv_name_3_0=null;
        Token this_C_BRACE_L_4=null;
        Token lv_otherComm_6_0=null;
        Token this_C_BRACE_R_7=null;
        EObject lv_input_1_0 = null;

        EObject lv_fields_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:137:28: ( ( ( (lv_comm_0_0= RULE_COMMENT ) ) ( (lv_input_1_0= ruleInput ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= RULE_NAME ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( (lv_fields_5_0= ruleField ) ) | ( (lv_otherComm_6_0= RULE_COMMENT ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:138:1: ( ( (lv_comm_0_0= RULE_COMMENT ) ) ( (lv_input_1_0= ruleInput ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= RULE_NAME ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( (lv_fields_5_0= ruleField ) ) | ( (lv_otherComm_6_0= RULE_COMMENT ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:138:1: ( ( (lv_comm_0_0= RULE_COMMENT ) ) ( (lv_input_1_0= ruleInput ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= RULE_NAME ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( (lv_fields_5_0= ruleField ) ) | ( (lv_otherComm_6_0= RULE_COMMENT ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:138:2: ( (lv_comm_0_0= RULE_COMMENT ) ) ( (lv_input_1_0= ruleInput ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= RULE_NAME ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( (lv_fields_5_0= ruleField ) ) | ( (lv_otherComm_6_0= RULE_COMMENT ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:138:2: ( (lv_comm_0_0= RULE_COMMENT ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:139:1: (lv_comm_0_0= RULE_COMMENT )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:139:1: (lv_comm_0_0= RULE_COMMENT )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:140:3: lv_comm_0_0= RULE_COMMENT
            {
            lv_comm_0_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleType248); 

            			newLeafNode(lv_comm_0_0, grammarAccess.getTypeAccess().getCommCOMMENTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"comm",
                    		lv_comm_0_0, 
                    		"COMMENT");
            	    

            }


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:156:2: ( (lv_input_1_0= ruleInput ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_C_BRACKET_L) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:157:1: (lv_input_1_0= ruleInput )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:157:1: (lv_input_1_0= ruleInput )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:158:3: lv_input_1_0= ruleInput
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getInputInputParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInput_in_ruleType274);
                    lv_input_1_0=ruleInput();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"input",
                            		lv_input_1_0, 
                            		"Input");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:174:3: ( (lv_prefix_2_0= RULE_C_TYPE ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:175:1: (lv_prefix_2_0= RULE_C_TYPE )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:175:1: (lv_prefix_2_0= RULE_C_TYPE )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:176:3: lv_prefix_2_0= RULE_C_TYPE
            {
            lv_prefix_2_0=(Token)match(input,RULE_C_TYPE,FOLLOW_RULE_C_TYPE_in_ruleType292); 

            			newLeafNode(lv_prefix_2_0, grammarAccess.getTypeAccess().getPrefixC_TYPETerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"prefix",
                    		lv_prefix_2_0, 
                    		"C_TYPE");
            	    

            }


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:192:2: ( (lv_name_3_0= RULE_NAME ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:193:1: (lv_name_3_0= RULE_NAME )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:193:1: (lv_name_3_0= RULE_NAME )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:194:3: lv_name_3_0= RULE_NAME
            {
            lv_name_3_0=(Token)match(input,RULE_NAME,FOLLOW_RULE_NAME_in_ruleType314); 

            			newLeafNode(lv_name_3_0, grammarAccess.getTypeAccess().getNameNAMETerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"NAME");
            	    

            }


            }

            this_C_BRACE_L_4=(Token)match(input,RULE_C_BRACE_L,FOLLOW_RULE_C_BRACE_L_in_ruleType330); 
             
                newLeafNode(this_C_BRACE_L_4, grammarAccess.getTypeAccess().getC_BRACE_LTerminalRuleCall_4()); 
                
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:214:1: ( ( (lv_fields_5_0= ruleField ) ) | ( (lv_otherComm_6_0= RULE_COMMENT ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_COMMENT) ) {
                    int LA3_2 = input.LA(2);

                    if ( ((LA3_2>=RULE_C_TYPE && LA3_2<=RULE_NAME)||LA3_2==RULE_C_INPUT||LA3_2==RULE_C_FILE||LA3_2==RULE_C_NODE||LA3_2==RULE_C_LIST||(LA3_2>=RULE_C_HASH && LA3_2<=RULE_C_STRING)) ) {
                        alt3=1;
                    }
                    else if ( (LA3_2==RULE_COMMENT||LA3_2==RULE_C_BRACE_R) ) {
                        alt3=2;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:214:2: ( (lv_fields_5_0= ruleField ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:214:2: ( (lv_fields_5_0= ruleField ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:215:1: (lv_fields_5_0= ruleField )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:215:1: (lv_fields_5_0= ruleField )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:216:3: lv_fields_5_0= ruleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTypeAccess().getFieldsFieldParserRuleCall_5_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_in_ruleType351);
            	    lv_fields_5_0=ruleField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_5_0, 
            	            		"Field");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:233:6: ( (lv_otherComm_6_0= RULE_COMMENT ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:233:6: ( (lv_otherComm_6_0= RULE_COMMENT ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:234:1: (lv_otherComm_6_0= RULE_COMMENT )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:234:1: (lv_otherComm_6_0= RULE_COMMENT )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:235:3: lv_otherComm_6_0= RULE_COMMENT
            	    {
            	    lv_otherComm_6_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleType374); 

            	    			newLeafNode(lv_otherComm_6_0, grammarAccess.getTypeAccess().getOtherCommCOMMENTTerminalRuleCall_5_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTypeRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"otherComm",
            	            		lv_otherComm_6_0, 
            	            		"COMMENT");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            this_C_BRACE_R_7=(Token)match(input,RULE_C_BRACE_R,FOLLOW_RULE_C_BRACE_R_in_ruleType392); 
             
                newLeafNode(this_C_BRACE_R_7, grammarAccess.getTypeAccess().getC_BRACE_RTerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleInput"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:263:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:264:2: (iv_ruleInput= ruleInput EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:265:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput427);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput437); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:272:1: ruleInput returns [EObject current=null] : (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_INPUT ) ) this_C_PAREN_L_2= RULE_C_PAREN_L this_C_FILE_3= RULE_C_FILE this_C_EQUALS_4= RULE_C_EQUALS ( (lv_filePath_5_0= RULE_STRING ) ) (this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) ) )? this_C_PAREN_R_10= RULE_C_PAREN_R this_C_BRACKET_R_11= RULE_C_BRACKET_R ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token this_C_BRACKET_L_0=null;
        Token lv_prefix_1_0=null;
        Token this_C_PAREN_L_2=null;
        Token this_C_FILE_3=null;
        Token this_C_EQUALS_4=null;
        Token lv_filePath_5_0=null;
        Token this_C_COMMA_6=null;
        Token this_C_NODE_7=null;
        Token this_C_EQUALS_8=null;
        Token lv_nodePath_9_0=null;
        Token this_C_PAREN_R_10=null;
        Token this_C_BRACKET_R_11=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:275:28: ( (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_INPUT ) ) this_C_PAREN_L_2= RULE_C_PAREN_L this_C_FILE_3= RULE_C_FILE this_C_EQUALS_4= RULE_C_EQUALS ( (lv_filePath_5_0= RULE_STRING ) ) (this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) ) )? this_C_PAREN_R_10= RULE_C_PAREN_R this_C_BRACKET_R_11= RULE_C_BRACKET_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:276:1: (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_INPUT ) ) this_C_PAREN_L_2= RULE_C_PAREN_L this_C_FILE_3= RULE_C_FILE this_C_EQUALS_4= RULE_C_EQUALS ( (lv_filePath_5_0= RULE_STRING ) ) (this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) ) )? this_C_PAREN_R_10= RULE_C_PAREN_R this_C_BRACKET_R_11= RULE_C_BRACKET_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:276:1: (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_INPUT ) ) this_C_PAREN_L_2= RULE_C_PAREN_L this_C_FILE_3= RULE_C_FILE this_C_EQUALS_4= RULE_C_EQUALS ( (lv_filePath_5_0= RULE_STRING ) ) (this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) ) )? this_C_PAREN_R_10= RULE_C_PAREN_R this_C_BRACKET_R_11= RULE_C_BRACKET_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:276:2: this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_INPUT ) ) this_C_PAREN_L_2= RULE_C_PAREN_L this_C_FILE_3= RULE_C_FILE this_C_EQUALS_4= RULE_C_EQUALS ( (lv_filePath_5_0= RULE_STRING ) ) (this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) ) )? this_C_PAREN_R_10= RULE_C_PAREN_R this_C_BRACKET_R_11= RULE_C_BRACKET_R
            {
            this_C_BRACKET_L_0=(Token)match(input,RULE_C_BRACKET_L,FOLLOW_RULE_C_BRACKET_L_in_ruleInput473); 
             
                newLeafNode(this_C_BRACKET_L_0, grammarAccess.getInputAccess().getC_BRACKET_LTerminalRuleCall_0()); 
                
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:280:1: ( (lv_prefix_1_0= RULE_C_INPUT ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:281:1: (lv_prefix_1_0= RULE_C_INPUT )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:281:1: (lv_prefix_1_0= RULE_C_INPUT )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:282:3: lv_prefix_1_0= RULE_C_INPUT
            {
            lv_prefix_1_0=(Token)match(input,RULE_C_INPUT,FOLLOW_RULE_C_INPUT_in_ruleInput489); 

            			newLeafNode(lv_prefix_1_0, grammarAccess.getInputAccess().getPrefixC_INPUTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInputRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"prefix",
                    		lv_prefix_1_0, 
                    		"C_INPUT");
            	    

            }


            }

            this_C_PAREN_L_2=(Token)match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_ruleInput505); 
             
                newLeafNode(this_C_PAREN_L_2, grammarAccess.getInputAccess().getC_PAREN_LTerminalRuleCall_2()); 
                
            this_C_FILE_3=(Token)match(input,RULE_C_FILE,FOLLOW_RULE_C_FILE_in_ruleInput515); 
             
                newLeafNode(this_C_FILE_3, grammarAccess.getInputAccess().getC_FILETerminalRuleCall_3()); 
                
            this_C_EQUALS_4=(Token)match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_ruleInput525); 
             
                newLeafNode(this_C_EQUALS_4, grammarAccess.getInputAccess().getC_EQUALSTerminalRuleCall_4()); 
                
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:310:1: ( (lv_filePath_5_0= RULE_STRING ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:311:1: (lv_filePath_5_0= RULE_STRING )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:311:1: (lv_filePath_5_0= RULE_STRING )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:312:3: lv_filePath_5_0= RULE_STRING
            {
            lv_filePath_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInput541); 

            			newLeafNode(lv_filePath_5_0, grammarAccess.getInputAccess().getFilePathSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInputRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"filePath",
                    		lv_filePath_5_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:328:2: (this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_C_COMMA) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:328:3: this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) )
                    {
                    this_C_COMMA_6=(Token)match(input,RULE_C_COMMA,FOLLOW_RULE_C_COMMA_in_ruleInput558); 
                     
                        newLeafNode(this_C_COMMA_6, grammarAccess.getInputAccess().getC_COMMATerminalRuleCall_6_0()); 
                        
                    this_C_NODE_7=(Token)match(input,RULE_C_NODE,FOLLOW_RULE_C_NODE_in_ruleInput568); 
                     
                        newLeafNode(this_C_NODE_7, grammarAccess.getInputAccess().getC_NODETerminalRuleCall_6_1()); 
                        
                    this_C_EQUALS_8=(Token)match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_ruleInput578); 
                     
                        newLeafNode(this_C_EQUALS_8, grammarAccess.getInputAccess().getC_EQUALSTerminalRuleCall_6_2()); 
                        
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:340:1: ( (lv_nodePath_9_0= RULE_STRING ) )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:341:1: (lv_nodePath_9_0= RULE_STRING )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:341:1: (lv_nodePath_9_0= RULE_STRING )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:342:3: lv_nodePath_9_0= RULE_STRING
                    {
                    lv_nodePath_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInput594); 

                    			newLeafNode(lv_nodePath_9_0, grammarAccess.getInputAccess().getNodePathSTRINGTerminalRuleCall_6_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"nodePath",
                            		lv_nodePath_9_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            this_C_PAREN_R_10=(Token)match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_ruleInput612); 
             
                newLeafNode(this_C_PAREN_R_10, grammarAccess.getInputAccess().getC_PAREN_RTerminalRuleCall_7()); 
                
            this_C_BRACKET_R_11=(Token)match(input,RULE_C_BRACKET_R,FOLLOW_RULE_C_BRACKET_R_in_ruleInput622); 
             
                newLeafNode(this_C_BRACKET_R_11, grammarAccess.getInputAccess().getC_BRACKET_RTerminalRuleCall_8()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleField"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:374:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:375:2: (iv_ruleField= ruleField EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:376:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField657);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField667); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:383:1: ruleField returns [EObject current=null] : ( ( (lv_comm_0_0= RULE_COMMENT ) ) ( ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) ) ) ( (lv_fieldName_2_0= RULE_NAME ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_nodePath_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )? ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_comm_0_0=null;
        Token lv_fieldName_2_0=null;
        Token this_C_EQUALS_3=null;
        Token lv_nodePath_4_0=null;
        Token this_C_SEMICOLON_5=null;
        EObject lv_type_1_1 = null;

        EObject lv_type_1_2 = null;

        EObject lv_type_1_3 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:386:28: ( ( ( (lv_comm_0_0= RULE_COMMENT ) ) ( ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) ) ) ( (lv_fieldName_2_0= RULE_NAME ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_nodePath_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:387:1: ( ( (lv_comm_0_0= RULE_COMMENT ) ) ( ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) ) ) ( (lv_fieldName_2_0= RULE_NAME ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_nodePath_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:387:1: ( ( (lv_comm_0_0= RULE_COMMENT ) ) ( ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) ) ) ( (lv_fieldName_2_0= RULE_NAME ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_nodePath_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:387:2: ( (lv_comm_0_0= RULE_COMMENT ) ) ( ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) ) ) ( (lv_fieldName_2_0= RULE_NAME ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_nodePath_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )?
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:387:2: ( (lv_comm_0_0= RULE_COMMENT ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:388:1: (lv_comm_0_0= RULE_COMMENT )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:388:1: (lv_comm_0_0= RULE_COMMENT )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:389:3: lv_comm_0_0= RULE_COMMENT
            {
            lv_comm_0_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleField709); 

            			newLeafNode(lv_comm_0_0, grammarAccess.getFieldAccess().getCommCOMMENTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"comm",
                    		lv_comm_0_0, 
                    		"COMMENT");
            	    

            }


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:405:2: ( ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:406:1: ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:406:1: ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:407:1: (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:407:1: (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_C_TYPE:
            case RULE_NAME:
            case RULE_C_INPUT:
            case RULE_C_FILE:
            case RULE_C_NODE:
            case RULE_C_INT:
            case RULE_C_UINT:
            case RULE_C_BOOL:
            case RULE_C_NUMBER:
            case RULE_C_STRING:
                {
                alt5=1;
                }
                break;
            case RULE_C_LIST:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==RULE_NAME) ) {
                    alt5=1;
                }
                else if ( (LA5_2==RULE_C_ANGLE_L) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_C_HASH:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==RULE_C_ANGLE_L) ) {
                    alt5=3;
                }
                else if ( (LA5_3==RULE_NAME) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:408:3: lv_type_1_1= ruleNativeType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getTypeNativeTypeParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNativeType_in_ruleField737);
                    lv_type_1_1=ruleNativeType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_1_1, 
                            		"NativeType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:423:8: lv_type_1_2= ruleListType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getTypeListTypeParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleListType_in_ruleField756);
                    lv_type_1_2=ruleListType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_1_2, 
                            		"ListType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:438:8: lv_type_1_3= ruleHashType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getTypeHashTypeParserRuleCall_1_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleHashType_in_ruleField775);
                    lv_type_1_3=ruleHashType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_1_3, 
                            		"HashType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:456:2: ( (lv_fieldName_2_0= RULE_NAME ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:457:1: (lv_fieldName_2_0= RULE_NAME )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:457:1: (lv_fieldName_2_0= RULE_NAME )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:458:3: lv_fieldName_2_0= RULE_NAME
            {
            lv_fieldName_2_0=(Token)match(input,RULE_NAME,FOLLOW_RULE_NAME_in_ruleField795); 

            			newLeafNode(lv_fieldName_2_0, grammarAccess.getFieldAccess().getFieldNameNAMETerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"fieldName",
                    		lv_fieldName_2_0, 
                    		"NAME");
            	    

            }


            }

            this_C_EQUALS_3=(Token)match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_ruleField811); 
             
                newLeafNode(this_C_EQUALS_3, grammarAccess.getFieldAccess().getC_EQUALSTerminalRuleCall_3()); 
                
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:478:1: ( (lv_nodePath_4_0= RULE_STRING ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:479:1: (lv_nodePath_4_0= RULE_STRING )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:479:1: (lv_nodePath_4_0= RULE_STRING )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:480:3: lv_nodePath_4_0= RULE_STRING
            {
            lv_nodePath_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleField827); 

            			newLeafNode(lv_nodePath_4_0, grammarAccess.getFieldAccess().getNodePathSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nodePath",
                    		lv_nodePath_4_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:496:2: (this_C_SEMICOLON_5= RULE_C_SEMICOLON )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_C_SEMICOLON) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:496:3: this_C_SEMICOLON_5= RULE_C_SEMICOLON
                    {
                    this_C_SEMICOLON_5=(Token)match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_ruleField844); 
                     
                        newLeafNode(this_C_SEMICOLON_5, grammarAccess.getFieldAccess().getC_SEMICOLONTerminalRuleCall_5()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleNativeType"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:508:1: entryRuleNativeType returns [EObject current=null] : iv_ruleNativeType= ruleNativeType EOF ;
    public final EObject entryRuleNativeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNativeType = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:509:2: (iv_ruleNativeType= ruleNativeType EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:510:2: iv_ruleNativeType= ruleNativeType EOF
            {
             newCompositeNode(grammarAccess.getNativeTypeRule()); 
            pushFollow(FOLLOW_ruleNativeType_in_entryRuleNativeType881);
            iv_ruleNativeType=ruleNativeType();

            state._fsp--;

             current =iv_ruleNativeType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeType891); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNativeType"


    // $ANTLR start "ruleNativeType"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:517:1: ruleNativeType returns [EObject current=null] : ( (lv_type_0_0= ruleTypeName ) ) ;
    public final EObject ruleNativeType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:520:28: ( ( (lv_type_0_0= ruleTypeName ) ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:521:1: ( (lv_type_0_0= ruleTypeName ) )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:521:1: ( (lv_type_0_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:522:1: (lv_type_0_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:522:1: (lv_type_0_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:523:3: lv_type_0_0= ruleTypeName
            {
             
            	        newCompositeNode(grammarAccess.getNativeTypeAccess().getTypeTypeNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeName_in_ruleNativeType936);
            lv_type_0_0=ruleTypeName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNativeTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"TypeName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNativeType"


    // $ANTLR start "entryRuleListType"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:547:1: entryRuleListType returns [EObject current=null] : iv_ruleListType= ruleListType EOF ;
    public final EObject entryRuleListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListType = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:548:2: (iv_ruleListType= ruleListType EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:549:2: iv_ruleListType= ruleListType EOF
            {
             newCompositeNode(grammarAccess.getListTypeRule()); 
            pushFollow(FOLLOW_ruleListType_in_entryRuleListType971);
            iv_ruleListType=ruleListType();

            state._fsp--;

             current =iv_ruleListType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListType981); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListType"


    // $ANTLR start "ruleListType"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:556:1: ruleListType returns [EObject current=null] : (this_C_LIST_0= RULE_C_LIST this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R ) ;
    public final EObject ruleListType() throws RecognitionException {
        EObject current = null;

        Token this_C_LIST_0=null;
        Token this_C_ANGLE_L_1=null;
        Token this_C_ANGLE_R_3=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:559:28: ( (this_C_LIST_0= RULE_C_LIST this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:560:1: (this_C_LIST_0= RULE_C_LIST this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:560:1: (this_C_LIST_0= RULE_C_LIST this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:560:2: this_C_LIST_0= RULE_C_LIST this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R
            {
            this_C_LIST_0=(Token)match(input,RULE_C_LIST,FOLLOW_RULE_C_LIST_in_ruleListType1017); 
             
                newLeafNode(this_C_LIST_0, grammarAccess.getListTypeAccess().getC_LISTTerminalRuleCall_0()); 
                
            this_C_ANGLE_L_1=(Token)match(input,RULE_C_ANGLE_L,FOLLOW_RULE_C_ANGLE_L_in_ruleListType1027); 
             
                newLeafNode(this_C_ANGLE_L_1, grammarAccess.getListTypeAccess().getC_ANGLE_LTerminalRuleCall_1()); 
                
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:568:1: ( (lv_type_2_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:569:1: (lv_type_2_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:569:1: (lv_type_2_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:570:3: lv_type_2_0= ruleTypeName
            {
             
            	        newCompositeNode(grammarAccess.getListTypeAccess().getTypeTypeNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeName_in_ruleListType1047);
            lv_type_2_0=ruleTypeName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getListTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"TypeName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_C_ANGLE_R_3=(Token)match(input,RULE_C_ANGLE_R,FOLLOW_RULE_C_ANGLE_R_in_ruleListType1058); 
             
                newLeafNode(this_C_ANGLE_R_3, grammarAccess.getListTypeAccess().getC_ANGLE_RTerminalRuleCall_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListType"


    // $ANTLR start "entryRuleHashType"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:598:1: entryRuleHashType returns [EObject current=null] : iv_ruleHashType= ruleHashType EOF ;
    public final EObject entryRuleHashType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashType = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:599:2: (iv_ruleHashType= ruleHashType EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:600:2: iv_ruleHashType= ruleHashType EOF
            {
             newCompositeNode(grammarAccess.getHashTypeRule()); 
            pushFollow(FOLLOW_ruleHashType_in_entryRuleHashType1093);
            iv_ruleHashType=ruleHashType();

            state._fsp--;

             current =iv_ruleHashType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHashType1103); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHashType"


    // $ANTLR start "ruleHashType"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:607:1: ruleHashType returns [EObject current=null] : (this_C_HASH_0= RULE_C_HASH this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R (this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= RULE_NAME ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= RULE_NAME ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R )? ) ;
    public final EObject ruleHashType() throws RecognitionException {
        EObject current = null;

        Token this_C_HASH_0=null;
        Token this_C_ANGLE_L_1=null;
        Token this_C_ANGLE_R_3=null;
        Token this_C_PAREN_L_4=null;
        Token lv_params_5_0=null;
        Token this_C_COMMA_6=null;
        Token lv_params_7_0=null;
        Token this_C_PAREN_R_8=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:610:28: ( (this_C_HASH_0= RULE_C_HASH this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R (this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= RULE_NAME ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= RULE_NAME ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R )? ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:611:1: (this_C_HASH_0= RULE_C_HASH this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R (this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= RULE_NAME ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= RULE_NAME ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R )? )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:611:1: (this_C_HASH_0= RULE_C_HASH this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R (this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= RULE_NAME ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= RULE_NAME ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R )? )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:611:2: this_C_HASH_0= RULE_C_HASH this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R (this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= RULE_NAME ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= RULE_NAME ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R )?
            {
            this_C_HASH_0=(Token)match(input,RULE_C_HASH,FOLLOW_RULE_C_HASH_in_ruleHashType1139); 
             
                newLeafNode(this_C_HASH_0, grammarAccess.getHashTypeAccess().getC_HASHTerminalRuleCall_0()); 
                
            this_C_ANGLE_L_1=(Token)match(input,RULE_C_ANGLE_L,FOLLOW_RULE_C_ANGLE_L_in_ruleHashType1149); 
             
                newLeafNode(this_C_ANGLE_L_1, grammarAccess.getHashTypeAccess().getC_ANGLE_LTerminalRuleCall_1()); 
                
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:619:1: ( (lv_type_2_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:620:1: (lv_type_2_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:620:1: (lv_type_2_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:621:3: lv_type_2_0= ruleTypeName
            {
             
            	        newCompositeNode(grammarAccess.getHashTypeAccess().getTypeTypeNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeName_in_ruleHashType1169);
            lv_type_2_0=ruleTypeName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHashTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"TypeName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_C_ANGLE_R_3=(Token)match(input,RULE_C_ANGLE_R,FOLLOW_RULE_C_ANGLE_R_in_ruleHashType1180); 
             
                newLeafNode(this_C_ANGLE_R_3, grammarAccess.getHashTypeAccess().getC_ANGLE_RTerminalRuleCall_3()); 
                
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:641:1: (this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= RULE_NAME ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= RULE_NAME ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_C_PAREN_L) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:641:2: this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= RULE_NAME ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= RULE_NAME ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R
                    {
                    this_C_PAREN_L_4=(Token)match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_ruleHashType1191); 
                     
                        newLeafNode(this_C_PAREN_L_4, grammarAccess.getHashTypeAccess().getC_PAREN_LTerminalRuleCall_4_0()); 
                        
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:645:1: ( (lv_params_5_0= RULE_NAME ) )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:646:1: (lv_params_5_0= RULE_NAME )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:646:1: (lv_params_5_0= RULE_NAME )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:647:3: lv_params_5_0= RULE_NAME
                    {
                    lv_params_5_0=(Token)match(input,RULE_NAME,FOLLOW_RULE_NAME_in_ruleHashType1207); 

                    			newLeafNode(lv_params_5_0, grammarAccess.getHashTypeAccess().getParamsNAMETerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHashTypeRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"params",
                            		lv_params_5_0, 
                            		"NAME");
                    	    

                    }


                    }

                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:663:2: (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= RULE_NAME ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_C_COMMA) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:663:3: this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= RULE_NAME ) )
                    	    {
                    	    this_C_COMMA_6=(Token)match(input,RULE_C_COMMA,FOLLOW_RULE_C_COMMA_in_ruleHashType1224); 
                    	     
                    	        newLeafNode(this_C_COMMA_6, grammarAccess.getHashTypeAccess().getC_COMMATerminalRuleCall_4_2_0()); 
                    	        
                    	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:667:1: ( (lv_params_7_0= RULE_NAME ) )
                    	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:668:1: (lv_params_7_0= RULE_NAME )
                    	    {
                    	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:668:1: (lv_params_7_0= RULE_NAME )
                    	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:669:3: lv_params_7_0= RULE_NAME
                    	    {
                    	    lv_params_7_0=(Token)match(input,RULE_NAME,FOLLOW_RULE_NAME_in_ruleHashType1240); 

                    	    			newLeafNode(lv_params_7_0, grammarAccess.getHashTypeAccess().getParamsNAMETerminalRuleCall_4_2_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getHashTypeRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_7_0, 
                    	            		"NAME");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    this_C_PAREN_R_8=(Token)match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_ruleHashType1258); 
                     
                        newLeafNode(this_C_PAREN_R_8, grammarAccess.getHashTypeAccess().getC_PAREN_RTerminalRuleCall_4_3()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHashType"


    // $ANTLR start "entryRuleTypeName"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:697:1: entryRuleTypeName returns [String current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final String entryRuleTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeName = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:698:2: (iv_ruleTypeName= ruleTypeName EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:699:2: iv_ruleTypeName= ruleTypeName EOF
            {
             newCompositeNode(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_ruleTypeName_in_entryRuleTypeName1296);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;

             current =iv_ruleTypeName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeName1307); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeName"


    // $ANTLR start "ruleTypeName"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:706:1: ruleTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_C_INPUT_0= RULE_C_INPUT | this_C_FILE_1= RULE_C_FILE | this_C_NODE_2= RULE_C_NODE | this_C_TYPE_3= RULE_C_TYPE | this_C_INT_4= RULE_C_INT | this_C_UINT_5= RULE_C_UINT | this_C_BOOL_6= RULE_C_BOOL | this_C_NUMBER_7= RULE_C_NUMBER | this_C_STRING_8= RULE_C_STRING | this_C_LIST_9= RULE_C_LIST | this_C_HASH_10= RULE_C_HASH | this_NAME_11= RULE_NAME ) ;
    public final AntlrDatatypeRuleToken ruleTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_C_INPUT_0=null;
        Token this_C_FILE_1=null;
        Token this_C_NODE_2=null;
        Token this_C_TYPE_3=null;
        Token this_C_INT_4=null;
        Token this_C_UINT_5=null;
        Token this_C_BOOL_6=null;
        Token this_C_NUMBER_7=null;
        Token this_C_STRING_8=null;
        Token this_C_LIST_9=null;
        Token this_C_HASH_10=null;
        Token this_NAME_11=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:709:28: ( (this_C_INPUT_0= RULE_C_INPUT | this_C_FILE_1= RULE_C_FILE | this_C_NODE_2= RULE_C_NODE | this_C_TYPE_3= RULE_C_TYPE | this_C_INT_4= RULE_C_INT | this_C_UINT_5= RULE_C_UINT | this_C_BOOL_6= RULE_C_BOOL | this_C_NUMBER_7= RULE_C_NUMBER | this_C_STRING_8= RULE_C_STRING | this_C_LIST_9= RULE_C_LIST | this_C_HASH_10= RULE_C_HASH | this_NAME_11= RULE_NAME ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:710:1: (this_C_INPUT_0= RULE_C_INPUT | this_C_FILE_1= RULE_C_FILE | this_C_NODE_2= RULE_C_NODE | this_C_TYPE_3= RULE_C_TYPE | this_C_INT_4= RULE_C_INT | this_C_UINT_5= RULE_C_UINT | this_C_BOOL_6= RULE_C_BOOL | this_C_NUMBER_7= RULE_C_NUMBER | this_C_STRING_8= RULE_C_STRING | this_C_LIST_9= RULE_C_LIST | this_C_HASH_10= RULE_C_HASH | this_NAME_11= RULE_NAME )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:710:1: (this_C_INPUT_0= RULE_C_INPUT | this_C_FILE_1= RULE_C_FILE | this_C_NODE_2= RULE_C_NODE | this_C_TYPE_3= RULE_C_TYPE | this_C_INT_4= RULE_C_INT | this_C_UINT_5= RULE_C_UINT | this_C_BOOL_6= RULE_C_BOOL | this_C_NUMBER_7= RULE_C_NUMBER | this_C_STRING_8= RULE_C_STRING | this_C_LIST_9= RULE_C_LIST | this_C_HASH_10= RULE_C_HASH | this_NAME_11= RULE_NAME )
            int alt9=12;
            switch ( input.LA(1) ) {
            case RULE_C_INPUT:
                {
                alt9=1;
                }
                break;
            case RULE_C_FILE:
                {
                alt9=2;
                }
                break;
            case RULE_C_NODE:
                {
                alt9=3;
                }
                break;
            case RULE_C_TYPE:
                {
                alt9=4;
                }
                break;
            case RULE_C_INT:
                {
                alt9=5;
                }
                break;
            case RULE_C_UINT:
                {
                alt9=6;
                }
                break;
            case RULE_C_BOOL:
                {
                alt9=7;
                }
                break;
            case RULE_C_NUMBER:
                {
                alt9=8;
                }
                break;
            case RULE_C_STRING:
                {
                alt9=9;
                }
                break;
            case RULE_C_LIST:
                {
                alt9=10;
                }
                break;
            case RULE_C_HASH:
                {
                alt9=11;
                }
                break;
            case RULE_NAME:
                {
                alt9=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:710:6: this_C_INPUT_0= RULE_C_INPUT
                    {
                    this_C_INPUT_0=(Token)match(input,RULE_C_INPUT,FOLLOW_RULE_C_INPUT_in_ruleTypeName1347); 

                    		current.merge(this_C_INPUT_0);
                        
                     
                        newLeafNode(this_C_INPUT_0, grammarAccess.getTypeNameAccess().getC_INPUTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:718:10: this_C_FILE_1= RULE_C_FILE
                    {
                    this_C_FILE_1=(Token)match(input,RULE_C_FILE,FOLLOW_RULE_C_FILE_in_ruleTypeName1373); 

                    		current.merge(this_C_FILE_1);
                        
                     
                        newLeafNode(this_C_FILE_1, grammarAccess.getTypeNameAccess().getC_FILETerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:726:10: this_C_NODE_2= RULE_C_NODE
                    {
                    this_C_NODE_2=(Token)match(input,RULE_C_NODE,FOLLOW_RULE_C_NODE_in_ruleTypeName1399); 

                    		current.merge(this_C_NODE_2);
                        
                     
                        newLeafNode(this_C_NODE_2, grammarAccess.getTypeNameAccess().getC_NODETerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:734:10: this_C_TYPE_3= RULE_C_TYPE
                    {
                    this_C_TYPE_3=(Token)match(input,RULE_C_TYPE,FOLLOW_RULE_C_TYPE_in_ruleTypeName1425); 

                    		current.merge(this_C_TYPE_3);
                        
                     
                        newLeafNode(this_C_TYPE_3, grammarAccess.getTypeNameAccess().getC_TYPETerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:742:10: this_C_INT_4= RULE_C_INT
                    {
                    this_C_INT_4=(Token)match(input,RULE_C_INT,FOLLOW_RULE_C_INT_in_ruleTypeName1451); 

                    		current.merge(this_C_INT_4);
                        
                     
                        newLeafNode(this_C_INT_4, grammarAccess.getTypeNameAccess().getC_INTTerminalRuleCall_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:750:10: this_C_UINT_5= RULE_C_UINT
                    {
                    this_C_UINT_5=(Token)match(input,RULE_C_UINT,FOLLOW_RULE_C_UINT_in_ruleTypeName1477); 

                    		current.merge(this_C_UINT_5);
                        
                     
                        newLeafNode(this_C_UINT_5, grammarAccess.getTypeNameAccess().getC_UINTTerminalRuleCall_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:758:10: this_C_BOOL_6= RULE_C_BOOL
                    {
                    this_C_BOOL_6=(Token)match(input,RULE_C_BOOL,FOLLOW_RULE_C_BOOL_in_ruleTypeName1503); 

                    		current.merge(this_C_BOOL_6);
                        
                     
                        newLeafNode(this_C_BOOL_6, grammarAccess.getTypeNameAccess().getC_BOOLTerminalRuleCall_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:766:10: this_C_NUMBER_7= RULE_C_NUMBER
                    {
                    this_C_NUMBER_7=(Token)match(input,RULE_C_NUMBER,FOLLOW_RULE_C_NUMBER_in_ruleTypeName1529); 

                    		current.merge(this_C_NUMBER_7);
                        
                     
                        newLeafNode(this_C_NUMBER_7, grammarAccess.getTypeNameAccess().getC_NUMBERTerminalRuleCall_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:774:10: this_C_STRING_8= RULE_C_STRING
                    {
                    this_C_STRING_8=(Token)match(input,RULE_C_STRING,FOLLOW_RULE_C_STRING_in_ruleTypeName1555); 

                    		current.merge(this_C_STRING_8);
                        
                     
                        newLeafNode(this_C_STRING_8, grammarAccess.getTypeNameAccess().getC_STRINGTerminalRuleCall_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:782:10: this_C_LIST_9= RULE_C_LIST
                    {
                    this_C_LIST_9=(Token)match(input,RULE_C_LIST,FOLLOW_RULE_C_LIST_in_ruleTypeName1581); 

                    		current.merge(this_C_LIST_9);
                        
                     
                        newLeafNode(this_C_LIST_9, grammarAccess.getTypeNameAccess().getC_LISTTerminalRuleCall_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:790:10: this_C_HASH_10= RULE_C_HASH
                    {
                    this_C_HASH_10=(Token)match(input,RULE_C_HASH,FOLLOW_RULE_C_HASH_in_ruleTypeName1607); 

                    		current.merge(this_C_HASH_10);
                        
                     
                        newLeafNode(this_C_HASH_10, grammarAccess.getTypeNameAccess().getC_HASHTerminalRuleCall_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:798:10: this_NAME_11= RULE_NAME
                    {
                    this_NAME_11=(Token)match(input,RULE_NAME,FOLLOW_RULE_NAME_in_ruleTypeName1633); 

                    		current.merge(this_NAME_11);
                        
                     
                        newLeafNode(this_NAME_11, grammarAccess.getTypeNameAccess().getNAMETerminalRuleCall_11()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeName"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleXML2_in_entryRuleXML275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXML285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleXML2131 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleXML2154 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleType248 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_ruleInput_in_ruleType274 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_C_TYPE_in_ruleType292 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NAME_in_ruleType314 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_C_BRACE_L_in_ruleType330 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleField_in_ruleType351 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleType374 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_RULE_C_BRACE_R_in_ruleType392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_L_in_ruleInput473 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_C_INPUT_in_ruleInput489 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_ruleInput505 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_C_FILE_in_ruleInput515 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_ruleInput525 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInput541 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_RULE_C_COMMA_in_ruleInput558 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_C_NODE_in_ruleInput568 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_ruleInput578 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInput594 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_ruleInput612 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_R_in_ruleInput622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleField709 = new BitSet(new long[]{0x000000001F911460L});
    public static final BitSet FOLLOW_ruleNativeType_in_ruleField737 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleListType_in_ruleField756 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleHashType_in_ruleField775 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NAME_in_ruleField795 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_ruleField811 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleField827 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_ruleField844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeType_in_entryRuleNativeType881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeType891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleNativeType936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListType_in_entryRuleListType971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListType981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_LIST_in_ruleListType1017 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_C_ANGLE_L_in_ruleListType1027 = new BitSet(new long[]{0x000000001F911460L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleListType1047 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_C_ANGLE_R_in_ruleListType1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashType_in_entryRuleHashType1093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHashType1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_HASH_in_ruleHashType1139 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_C_ANGLE_L_in_ruleHashType1149 = new BitSet(new long[]{0x000000001F911460L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleHashType1169 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_C_ANGLE_R_in_ruleHashType1180 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_ruleHashType1191 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NAME_in_ruleHashType1207 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_RULE_C_COMMA_in_ruleHashType1224 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NAME_in_ruleHashType1240 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_ruleHashType1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_entryRuleTypeName1296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeName1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INPUT_in_ruleTypeName1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_FILE_in_ruleTypeName1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_NODE_in_ruleTypeName1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_TYPE_in_ruleTypeName1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INT_in_ruleTypeName1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_UINT_in_ruleTypeName1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BOOL_in_ruleTypeName1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_NUMBER_in_ruleTypeName1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_STRING_in_ruleTypeName1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_LIST_in_ruleTypeName1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_HASH_in_ruleTypeName1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_ruleTypeName1633 = new BitSet(new long[]{0x0000000000000002L});

}