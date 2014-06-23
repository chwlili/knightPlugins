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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMMENT", "RULE_C_TYPE", "RULE_NAME", "RULE_C_BRACE_L", "RULE_C_BRACE_R", "RULE_C_BRACKET_L", "RULE_C_INPUT", "RULE_C_PAREN_L", "RULE_C_FILE", "RULE_C_EQUALS", "RULE_STRING", "RULE_C_COMMA", "RULE_C_NODE", "RULE_C_PAREN_R", "RULE_C_BRACKET_R", "RULE_C_SEMICOLON", "RULE_C_LIST", "RULE_C_ANGLE_L", "RULE_C_ANGLE_R", "RULE_C_HASH", "RULE_C_INT", "RULE_C_UINT", "RULE_C_BOOL", "RULE_C_NUMBER", "RULE_C_STRING", "RULE_WS"
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
    public static final int RULE_C_BRACKET_L=9;
    public static final int RULE_STRING=14;
    public static final int RULE_C_EQUALS=13;
    public static final int RULE_C_UINT=25;
    public static final int RULE_C_BRACKET_R=18;
    public static final int RULE_C_INT=24;
    public static final int RULE_C_FILE=12;
    public static final int RULE_NAME=6;
    public static final int RULE_WS=29;
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:76:1: ruleXML2 returns [EObject current=null] : ( (lv_types_0_0= ruleType ) )* ;
    public final EObject ruleXML2() throws RecognitionException {
        EObject current = null;

        EObject lv_types_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:79:28: ( ( (lv_types_0_0= ruleType ) )* )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:1: ( (lv_types_0_0= ruleType ) )*
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:1: ( (lv_types_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_COMMENT && LA1_0<=RULE_C_TYPE)||LA1_0==RULE_C_BRACKET_L) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:81:1: (lv_types_0_0= ruleType )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:81:1: (lv_types_0_0= ruleType )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:82:3: lv_types_0_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXML2Access().getTypesTypeParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleXML2130);
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:106:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:107:2: (iv_ruleType= ruleType EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:108:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType166);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType176); 

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:115:1: ruleType returns [EObject current=null] : ( ( (lv_comm_0_0= RULE_COMMENT ) )* ( (lv_input_1_0= ruleInput ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= RULE_NAME ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( (lv_fields_5_0= ruleField ) )* this_C_BRACE_R_6= RULE_C_BRACE_R ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_comm_0_0=null;
        Token lv_prefix_2_0=null;
        Token lv_name_3_0=null;
        Token this_C_BRACE_L_4=null;
        Token this_C_BRACE_R_6=null;
        EObject lv_input_1_0 = null;

        EObject lv_fields_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:118:28: ( ( ( (lv_comm_0_0= RULE_COMMENT ) )* ( (lv_input_1_0= ruleInput ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= RULE_NAME ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( (lv_fields_5_0= ruleField ) )* this_C_BRACE_R_6= RULE_C_BRACE_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:119:1: ( ( (lv_comm_0_0= RULE_COMMENT ) )* ( (lv_input_1_0= ruleInput ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= RULE_NAME ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( (lv_fields_5_0= ruleField ) )* this_C_BRACE_R_6= RULE_C_BRACE_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:119:1: ( ( (lv_comm_0_0= RULE_COMMENT ) )* ( (lv_input_1_0= ruleInput ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= RULE_NAME ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( (lv_fields_5_0= ruleField ) )* this_C_BRACE_R_6= RULE_C_BRACE_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:119:2: ( (lv_comm_0_0= RULE_COMMENT ) )* ( (lv_input_1_0= ruleInput ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= RULE_NAME ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( (lv_fields_5_0= ruleField ) )* this_C_BRACE_R_6= RULE_C_BRACE_R
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:119:2: ( (lv_comm_0_0= RULE_COMMENT ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMMENT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:120:1: (lv_comm_0_0= RULE_COMMENT )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:120:1: (lv_comm_0_0= RULE_COMMENT )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:121:3: lv_comm_0_0= RULE_COMMENT
            	    {
            	    lv_comm_0_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleType218); 

            	    			newLeafNode(lv_comm_0_0, grammarAccess.getTypeAccess().getCommCOMMENTTerminalRuleCall_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTypeRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"comm",
            	            		lv_comm_0_0, 
            	            		"COMMENT");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:137:3: ( (lv_input_1_0= ruleInput ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_C_BRACKET_L) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:138:1: (lv_input_1_0= ruleInput )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:138:1: (lv_input_1_0= ruleInput )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:139:3: lv_input_1_0= ruleInput
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getInputInputParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInput_in_ruleType245);
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:155:3: ( (lv_prefix_2_0= RULE_C_TYPE ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:156:1: (lv_prefix_2_0= RULE_C_TYPE )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:156:1: (lv_prefix_2_0= RULE_C_TYPE )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:157:3: lv_prefix_2_0= RULE_C_TYPE
            {
            lv_prefix_2_0=(Token)match(input,RULE_C_TYPE,FOLLOW_RULE_C_TYPE_in_ruleType263); 

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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:173:2: ( (lv_name_3_0= RULE_NAME ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:174:1: (lv_name_3_0= RULE_NAME )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:174:1: (lv_name_3_0= RULE_NAME )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:175:3: lv_name_3_0= RULE_NAME
            {
            lv_name_3_0=(Token)match(input,RULE_NAME,FOLLOW_RULE_NAME_in_ruleType285); 

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

            this_C_BRACE_L_4=(Token)match(input,RULE_C_BRACE_L,FOLLOW_RULE_C_BRACE_L_in_ruleType301); 
             
                newLeafNode(this_C_BRACE_L_4, grammarAccess.getTypeAccess().getC_BRACE_LTerminalRuleCall_4()); 
                
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:195:1: ( (lv_fields_5_0= ruleField ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_COMMENT && LA4_0<=RULE_NAME)||LA4_0==RULE_C_INPUT||LA4_0==RULE_C_FILE||LA4_0==RULE_C_NODE||LA4_0==RULE_C_LIST||(LA4_0>=RULE_C_HASH && LA4_0<=RULE_C_STRING)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:196:1: (lv_fields_5_0= ruleField )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:196:1: (lv_fields_5_0= ruleField )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:197:3: lv_fields_5_0= ruleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTypeAccess().getFieldsFieldParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_in_ruleType321);
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
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            this_C_BRACE_R_6=(Token)match(input,RULE_C_BRACE_R,FOLLOW_RULE_C_BRACE_R_in_ruleType333); 
             
                newLeafNode(this_C_BRACE_R_6, grammarAccess.getTypeAccess().getC_BRACE_RTerminalRuleCall_6()); 
                

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:225:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:226:2: (iv_ruleInput= ruleInput EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:227:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput368);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput378); 

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:234:1: ruleInput returns [EObject current=null] : (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_INPUT ) ) this_C_PAREN_L_2= RULE_C_PAREN_L this_C_FILE_3= RULE_C_FILE this_C_EQUALS_4= RULE_C_EQUALS ( (lv_filePath_5_0= RULE_STRING ) ) (this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) ) )? this_C_PAREN_R_10= RULE_C_PAREN_R this_C_BRACKET_R_11= RULE_C_BRACKET_R ) ;
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
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:237:28: ( (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_INPUT ) ) this_C_PAREN_L_2= RULE_C_PAREN_L this_C_FILE_3= RULE_C_FILE this_C_EQUALS_4= RULE_C_EQUALS ( (lv_filePath_5_0= RULE_STRING ) ) (this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) ) )? this_C_PAREN_R_10= RULE_C_PAREN_R this_C_BRACKET_R_11= RULE_C_BRACKET_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:238:1: (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_INPUT ) ) this_C_PAREN_L_2= RULE_C_PAREN_L this_C_FILE_3= RULE_C_FILE this_C_EQUALS_4= RULE_C_EQUALS ( (lv_filePath_5_0= RULE_STRING ) ) (this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) ) )? this_C_PAREN_R_10= RULE_C_PAREN_R this_C_BRACKET_R_11= RULE_C_BRACKET_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:238:1: (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_INPUT ) ) this_C_PAREN_L_2= RULE_C_PAREN_L this_C_FILE_3= RULE_C_FILE this_C_EQUALS_4= RULE_C_EQUALS ( (lv_filePath_5_0= RULE_STRING ) ) (this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) ) )? this_C_PAREN_R_10= RULE_C_PAREN_R this_C_BRACKET_R_11= RULE_C_BRACKET_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:238:2: this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_INPUT ) ) this_C_PAREN_L_2= RULE_C_PAREN_L this_C_FILE_3= RULE_C_FILE this_C_EQUALS_4= RULE_C_EQUALS ( (lv_filePath_5_0= RULE_STRING ) ) (this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) ) )? this_C_PAREN_R_10= RULE_C_PAREN_R this_C_BRACKET_R_11= RULE_C_BRACKET_R
            {
            this_C_BRACKET_L_0=(Token)match(input,RULE_C_BRACKET_L,FOLLOW_RULE_C_BRACKET_L_in_ruleInput414); 
             
                newLeafNode(this_C_BRACKET_L_0, grammarAccess.getInputAccess().getC_BRACKET_LTerminalRuleCall_0()); 
                
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:242:1: ( (lv_prefix_1_0= RULE_C_INPUT ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:243:1: (lv_prefix_1_0= RULE_C_INPUT )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:243:1: (lv_prefix_1_0= RULE_C_INPUT )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:244:3: lv_prefix_1_0= RULE_C_INPUT
            {
            lv_prefix_1_0=(Token)match(input,RULE_C_INPUT,FOLLOW_RULE_C_INPUT_in_ruleInput430); 

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

            this_C_PAREN_L_2=(Token)match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_ruleInput446); 
             
                newLeafNode(this_C_PAREN_L_2, grammarAccess.getInputAccess().getC_PAREN_LTerminalRuleCall_2()); 
                
            this_C_FILE_3=(Token)match(input,RULE_C_FILE,FOLLOW_RULE_C_FILE_in_ruleInput456); 
             
                newLeafNode(this_C_FILE_3, grammarAccess.getInputAccess().getC_FILETerminalRuleCall_3()); 
                
            this_C_EQUALS_4=(Token)match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_ruleInput466); 
             
                newLeafNode(this_C_EQUALS_4, grammarAccess.getInputAccess().getC_EQUALSTerminalRuleCall_4()); 
                
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:272:1: ( (lv_filePath_5_0= RULE_STRING ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:273:1: (lv_filePath_5_0= RULE_STRING )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:273:1: (lv_filePath_5_0= RULE_STRING )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:274:3: lv_filePath_5_0= RULE_STRING
            {
            lv_filePath_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInput482); 

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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:290:2: (this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_C_COMMA) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:290:3: this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) )
                    {
                    this_C_COMMA_6=(Token)match(input,RULE_C_COMMA,FOLLOW_RULE_C_COMMA_in_ruleInput499); 
                     
                        newLeafNode(this_C_COMMA_6, grammarAccess.getInputAccess().getC_COMMATerminalRuleCall_6_0()); 
                        
                    this_C_NODE_7=(Token)match(input,RULE_C_NODE,FOLLOW_RULE_C_NODE_in_ruleInput509); 
                     
                        newLeafNode(this_C_NODE_7, grammarAccess.getInputAccess().getC_NODETerminalRuleCall_6_1()); 
                        
                    this_C_EQUALS_8=(Token)match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_ruleInput519); 
                     
                        newLeafNode(this_C_EQUALS_8, grammarAccess.getInputAccess().getC_EQUALSTerminalRuleCall_6_2()); 
                        
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:302:1: ( (lv_nodePath_9_0= RULE_STRING ) )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:303:1: (lv_nodePath_9_0= RULE_STRING )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:303:1: (lv_nodePath_9_0= RULE_STRING )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:304:3: lv_nodePath_9_0= RULE_STRING
                    {
                    lv_nodePath_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInput535); 

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

            this_C_PAREN_R_10=(Token)match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_ruleInput553); 
             
                newLeafNode(this_C_PAREN_R_10, grammarAccess.getInputAccess().getC_PAREN_RTerminalRuleCall_7()); 
                
            this_C_BRACKET_R_11=(Token)match(input,RULE_C_BRACKET_R,FOLLOW_RULE_C_BRACKET_R_in_ruleInput563); 
             
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:336:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:337:2: (iv_ruleField= ruleField EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:338:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField598);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField608); 

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:345:1: ruleField returns [EObject current=null] : ( ( (lv_comm_0_0= RULE_COMMENT ) )* ( ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) ) ) ( (lv_fieldName_2_0= RULE_NAME ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_nodePath_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )? ) ;
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
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:348:28: ( ( ( (lv_comm_0_0= RULE_COMMENT ) )* ( ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) ) ) ( (lv_fieldName_2_0= RULE_NAME ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_nodePath_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:349:1: ( ( (lv_comm_0_0= RULE_COMMENT ) )* ( ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) ) ) ( (lv_fieldName_2_0= RULE_NAME ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_nodePath_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:349:1: ( ( (lv_comm_0_0= RULE_COMMENT ) )* ( ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) ) ) ( (lv_fieldName_2_0= RULE_NAME ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_nodePath_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:349:2: ( (lv_comm_0_0= RULE_COMMENT ) )* ( ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) ) ) ( (lv_fieldName_2_0= RULE_NAME ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_nodePath_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )?
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:349:2: ( (lv_comm_0_0= RULE_COMMENT ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMENT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:350:1: (lv_comm_0_0= RULE_COMMENT )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:350:1: (lv_comm_0_0= RULE_COMMENT )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:351:3: lv_comm_0_0= RULE_COMMENT
            	    {
            	    lv_comm_0_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleField650); 

            	    			newLeafNode(lv_comm_0_0, grammarAccess.getFieldAccess().getCommCOMMENTTerminalRuleCall_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFieldRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"comm",
            	            		lv_comm_0_0, 
            	            		"COMMENT");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:367:3: ( ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:368:1: ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:368:1: ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:369:1: (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:369:1: (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType )
            int alt7=3;
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
                alt7=1;
                }
                break;
            case RULE_C_LIST:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==RULE_NAME) ) {
                    alt7=1;
                }
                else if ( (LA7_2==RULE_C_ANGLE_L) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_C_HASH:
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3==RULE_C_ANGLE_L) ) {
                    alt7=3;
                }
                else if ( (LA7_3==RULE_NAME) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:370:3: lv_type_1_1= ruleNativeType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getTypeNativeTypeParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNativeType_in_ruleField679);
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
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:385:8: lv_type_1_2= ruleListType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getTypeListTypeParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleListType_in_ruleField698);
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
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:400:8: lv_type_1_3= ruleHashType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getTypeHashTypeParserRuleCall_1_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleHashType_in_ruleField717);
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:418:2: ( (lv_fieldName_2_0= RULE_NAME ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:419:1: (lv_fieldName_2_0= RULE_NAME )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:419:1: (lv_fieldName_2_0= RULE_NAME )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:420:3: lv_fieldName_2_0= RULE_NAME
            {
            lv_fieldName_2_0=(Token)match(input,RULE_NAME,FOLLOW_RULE_NAME_in_ruleField737); 

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

            this_C_EQUALS_3=(Token)match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_ruleField753); 
             
                newLeafNode(this_C_EQUALS_3, grammarAccess.getFieldAccess().getC_EQUALSTerminalRuleCall_3()); 
                
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:440:1: ( (lv_nodePath_4_0= RULE_STRING ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:441:1: (lv_nodePath_4_0= RULE_STRING )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:441:1: (lv_nodePath_4_0= RULE_STRING )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:442:3: lv_nodePath_4_0= RULE_STRING
            {
            lv_nodePath_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleField769); 

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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:458:2: (this_C_SEMICOLON_5= RULE_C_SEMICOLON )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_C_SEMICOLON) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:458:3: this_C_SEMICOLON_5= RULE_C_SEMICOLON
                    {
                    this_C_SEMICOLON_5=(Token)match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_ruleField786); 
                     
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:470:1: entryRuleNativeType returns [EObject current=null] : iv_ruleNativeType= ruleNativeType EOF ;
    public final EObject entryRuleNativeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNativeType = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:471:2: (iv_ruleNativeType= ruleNativeType EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:472:2: iv_ruleNativeType= ruleNativeType EOF
            {
             newCompositeNode(grammarAccess.getNativeTypeRule()); 
            pushFollow(FOLLOW_ruleNativeType_in_entryRuleNativeType823);
            iv_ruleNativeType=ruleNativeType();

            state._fsp--;

             current =iv_ruleNativeType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeType833); 

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:479:1: ruleNativeType returns [EObject current=null] : ( (lv_type_0_0= ruleTypeName ) ) ;
    public final EObject ruleNativeType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:482:28: ( ( (lv_type_0_0= ruleTypeName ) ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:483:1: ( (lv_type_0_0= ruleTypeName ) )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:483:1: ( (lv_type_0_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:484:1: (lv_type_0_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:484:1: (lv_type_0_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:485:3: lv_type_0_0= ruleTypeName
            {
             
            	        newCompositeNode(grammarAccess.getNativeTypeAccess().getTypeTypeNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeName_in_ruleNativeType878);
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:509:1: entryRuleListType returns [EObject current=null] : iv_ruleListType= ruleListType EOF ;
    public final EObject entryRuleListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListType = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:510:2: (iv_ruleListType= ruleListType EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:511:2: iv_ruleListType= ruleListType EOF
            {
             newCompositeNode(grammarAccess.getListTypeRule()); 
            pushFollow(FOLLOW_ruleListType_in_entryRuleListType913);
            iv_ruleListType=ruleListType();

            state._fsp--;

             current =iv_ruleListType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListType923); 

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:518:1: ruleListType returns [EObject current=null] : (this_C_LIST_0= RULE_C_LIST this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R ) ;
    public final EObject ruleListType() throws RecognitionException {
        EObject current = null;

        Token this_C_LIST_0=null;
        Token this_C_ANGLE_L_1=null;
        Token this_C_ANGLE_R_3=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:521:28: ( (this_C_LIST_0= RULE_C_LIST this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:522:1: (this_C_LIST_0= RULE_C_LIST this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:522:1: (this_C_LIST_0= RULE_C_LIST this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:522:2: this_C_LIST_0= RULE_C_LIST this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R
            {
            this_C_LIST_0=(Token)match(input,RULE_C_LIST,FOLLOW_RULE_C_LIST_in_ruleListType959); 
             
                newLeafNode(this_C_LIST_0, grammarAccess.getListTypeAccess().getC_LISTTerminalRuleCall_0()); 
                
            this_C_ANGLE_L_1=(Token)match(input,RULE_C_ANGLE_L,FOLLOW_RULE_C_ANGLE_L_in_ruleListType969); 
             
                newLeafNode(this_C_ANGLE_L_1, grammarAccess.getListTypeAccess().getC_ANGLE_LTerminalRuleCall_1()); 
                
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:530:1: ( (lv_type_2_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:531:1: (lv_type_2_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:531:1: (lv_type_2_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:532:3: lv_type_2_0= ruleTypeName
            {
             
            	        newCompositeNode(grammarAccess.getListTypeAccess().getTypeTypeNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeName_in_ruleListType989);
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

            this_C_ANGLE_R_3=(Token)match(input,RULE_C_ANGLE_R,FOLLOW_RULE_C_ANGLE_R_in_ruleListType1000); 
             
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:560:1: entryRuleHashType returns [EObject current=null] : iv_ruleHashType= ruleHashType EOF ;
    public final EObject entryRuleHashType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashType = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:561:2: (iv_ruleHashType= ruleHashType EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:562:2: iv_ruleHashType= ruleHashType EOF
            {
             newCompositeNode(grammarAccess.getHashTypeRule()); 
            pushFollow(FOLLOW_ruleHashType_in_entryRuleHashType1035);
            iv_ruleHashType=ruleHashType();

            state._fsp--;

             current =iv_ruleHashType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHashType1045); 

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:569:1: ruleHashType returns [EObject current=null] : (this_C_HASH_0= RULE_C_HASH this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R (this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= RULE_NAME ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= RULE_NAME ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R )? ) ;
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
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:572:28: ( (this_C_HASH_0= RULE_C_HASH this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R (this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= RULE_NAME ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= RULE_NAME ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R )? ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:573:1: (this_C_HASH_0= RULE_C_HASH this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R (this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= RULE_NAME ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= RULE_NAME ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R )? )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:573:1: (this_C_HASH_0= RULE_C_HASH this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R (this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= RULE_NAME ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= RULE_NAME ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R )? )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:573:2: this_C_HASH_0= RULE_C_HASH this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R (this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= RULE_NAME ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= RULE_NAME ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R )?
            {
            this_C_HASH_0=(Token)match(input,RULE_C_HASH,FOLLOW_RULE_C_HASH_in_ruleHashType1081); 
             
                newLeafNode(this_C_HASH_0, grammarAccess.getHashTypeAccess().getC_HASHTerminalRuleCall_0()); 
                
            this_C_ANGLE_L_1=(Token)match(input,RULE_C_ANGLE_L,FOLLOW_RULE_C_ANGLE_L_in_ruleHashType1091); 
             
                newLeafNode(this_C_ANGLE_L_1, grammarAccess.getHashTypeAccess().getC_ANGLE_LTerminalRuleCall_1()); 
                
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:581:1: ( (lv_type_2_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:582:1: (lv_type_2_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:582:1: (lv_type_2_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:583:3: lv_type_2_0= ruleTypeName
            {
             
            	        newCompositeNode(grammarAccess.getHashTypeAccess().getTypeTypeNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeName_in_ruleHashType1111);
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

            this_C_ANGLE_R_3=(Token)match(input,RULE_C_ANGLE_R,FOLLOW_RULE_C_ANGLE_R_in_ruleHashType1122); 
             
                newLeafNode(this_C_ANGLE_R_3, grammarAccess.getHashTypeAccess().getC_ANGLE_RTerminalRuleCall_3()); 
                
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:603:1: (this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= RULE_NAME ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= RULE_NAME ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_C_PAREN_L) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:603:2: this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= RULE_NAME ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= RULE_NAME ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R
                    {
                    this_C_PAREN_L_4=(Token)match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_ruleHashType1133); 
                     
                        newLeafNode(this_C_PAREN_L_4, grammarAccess.getHashTypeAccess().getC_PAREN_LTerminalRuleCall_4_0()); 
                        
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:607:1: ( (lv_params_5_0= RULE_NAME ) )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:608:1: (lv_params_5_0= RULE_NAME )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:608:1: (lv_params_5_0= RULE_NAME )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:609:3: lv_params_5_0= RULE_NAME
                    {
                    lv_params_5_0=(Token)match(input,RULE_NAME,FOLLOW_RULE_NAME_in_ruleHashType1149); 

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

                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:625:2: (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= RULE_NAME ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_C_COMMA) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:625:3: this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= RULE_NAME ) )
                    	    {
                    	    this_C_COMMA_6=(Token)match(input,RULE_C_COMMA,FOLLOW_RULE_C_COMMA_in_ruleHashType1166); 
                    	     
                    	        newLeafNode(this_C_COMMA_6, grammarAccess.getHashTypeAccess().getC_COMMATerminalRuleCall_4_2_0()); 
                    	        
                    	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:629:1: ( (lv_params_7_0= RULE_NAME ) )
                    	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:630:1: (lv_params_7_0= RULE_NAME )
                    	    {
                    	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:630:1: (lv_params_7_0= RULE_NAME )
                    	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:631:3: lv_params_7_0= RULE_NAME
                    	    {
                    	    lv_params_7_0=(Token)match(input,RULE_NAME,FOLLOW_RULE_NAME_in_ruleHashType1182); 

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
                    	    break loop9;
                        }
                    } while (true);

                    this_C_PAREN_R_8=(Token)match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_ruleHashType1200); 
                     
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:659:1: entryRuleTypeName returns [String current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final String entryRuleTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeName = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:660:2: (iv_ruleTypeName= ruleTypeName EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:661:2: iv_ruleTypeName= ruleTypeName EOF
            {
             newCompositeNode(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_ruleTypeName_in_entryRuleTypeName1238);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;

             current =iv_ruleTypeName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeName1249); 

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:668:1: ruleTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_C_INPUT_0= RULE_C_INPUT | this_C_FILE_1= RULE_C_FILE | this_C_NODE_2= RULE_C_NODE | this_C_TYPE_3= RULE_C_TYPE | this_C_INT_4= RULE_C_INT | this_C_UINT_5= RULE_C_UINT | this_C_BOOL_6= RULE_C_BOOL | this_C_NUMBER_7= RULE_C_NUMBER | this_C_STRING_8= RULE_C_STRING | this_C_LIST_9= RULE_C_LIST | this_C_HASH_10= RULE_C_HASH | this_NAME_11= RULE_NAME ) ;
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
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:671:28: ( (this_C_INPUT_0= RULE_C_INPUT | this_C_FILE_1= RULE_C_FILE | this_C_NODE_2= RULE_C_NODE | this_C_TYPE_3= RULE_C_TYPE | this_C_INT_4= RULE_C_INT | this_C_UINT_5= RULE_C_UINT | this_C_BOOL_6= RULE_C_BOOL | this_C_NUMBER_7= RULE_C_NUMBER | this_C_STRING_8= RULE_C_STRING | this_C_LIST_9= RULE_C_LIST | this_C_HASH_10= RULE_C_HASH | this_NAME_11= RULE_NAME ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:672:1: (this_C_INPUT_0= RULE_C_INPUT | this_C_FILE_1= RULE_C_FILE | this_C_NODE_2= RULE_C_NODE | this_C_TYPE_3= RULE_C_TYPE | this_C_INT_4= RULE_C_INT | this_C_UINT_5= RULE_C_UINT | this_C_BOOL_6= RULE_C_BOOL | this_C_NUMBER_7= RULE_C_NUMBER | this_C_STRING_8= RULE_C_STRING | this_C_LIST_9= RULE_C_LIST | this_C_HASH_10= RULE_C_HASH | this_NAME_11= RULE_NAME )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:672:1: (this_C_INPUT_0= RULE_C_INPUT | this_C_FILE_1= RULE_C_FILE | this_C_NODE_2= RULE_C_NODE | this_C_TYPE_3= RULE_C_TYPE | this_C_INT_4= RULE_C_INT | this_C_UINT_5= RULE_C_UINT | this_C_BOOL_6= RULE_C_BOOL | this_C_NUMBER_7= RULE_C_NUMBER | this_C_STRING_8= RULE_C_STRING | this_C_LIST_9= RULE_C_LIST | this_C_HASH_10= RULE_C_HASH | this_NAME_11= RULE_NAME )
            int alt11=12;
            switch ( input.LA(1) ) {
            case RULE_C_INPUT:
                {
                alt11=1;
                }
                break;
            case RULE_C_FILE:
                {
                alt11=2;
                }
                break;
            case RULE_C_NODE:
                {
                alt11=3;
                }
                break;
            case RULE_C_TYPE:
                {
                alt11=4;
                }
                break;
            case RULE_C_INT:
                {
                alt11=5;
                }
                break;
            case RULE_C_UINT:
                {
                alt11=6;
                }
                break;
            case RULE_C_BOOL:
                {
                alt11=7;
                }
                break;
            case RULE_C_NUMBER:
                {
                alt11=8;
                }
                break;
            case RULE_C_STRING:
                {
                alt11=9;
                }
                break;
            case RULE_C_LIST:
                {
                alt11=10;
                }
                break;
            case RULE_C_HASH:
                {
                alt11=11;
                }
                break;
            case RULE_NAME:
                {
                alt11=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:672:6: this_C_INPUT_0= RULE_C_INPUT
                    {
                    this_C_INPUT_0=(Token)match(input,RULE_C_INPUT,FOLLOW_RULE_C_INPUT_in_ruleTypeName1289); 

                    		current.merge(this_C_INPUT_0);
                        
                     
                        newLeafNode(this_C_INPUT_0, grammarAccess.getTypeNameAccess().getC_INPUTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:680:10: this_C_FILE_1= RULE_C_FILE
                    {
                    this_C_FILE_1=(Token)match(input,RULE_C_FILE,FOLLOW_RULE_C_FILE_in_ruleTypeName1315); 

                    		current.merge(this_C_FILE_1);
                        
                     
                        newLeafNode(this_C_FILE_1, grammarAccess.getTypeNameAccess().getC_FILETerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:688:10: this_C_NODE_2= RULE_C_NODE
                    {
                    this_C_NODE_2=(Token)match(input,RULE_C_NODE,FOLLOW_RULE_C_NODE_in_ruleTypeName1341); 

                    		current.merge(this_C_NODE_2);
                        
                     
                        newLeafNode(this_C_NODE_2, grammarAccess.getTypeNameAccess().getC_NODETerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:696:10: this_C_TYPE_3= RULE_C_TYPE
                    {
                    this_C_TYPE_3=(Token)match(input,RULE_C_TYPE,FOLLOW_RULE_C_TYPE_in_ruleTypeName1367); 

                    		current.merge(this_C_TYPE_3);
                        
                     
                        newLeafNode(this_C_TYPE_3, grammarAccess.getTypeNameAccess().getC_TYPETerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:704:10: this_C_INT_4= RULE_C_INT
                    {
                    this_C_INT_4=(Token)match(input,RULE_C_INT,FOLLOW_RULE_C_INT_in_ruleTypeName1393); 

                    		current.merge(this_C_INT_4);
                        
                     
                        newLeafNode(this_C_INT_4, grammarAccess.getTypeNameAccess().getC_INTTerminalRuleCall_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:712:10: this_C_UINT_5= RULE_C_UINT
                    {
                    this_C_UINT_5=(Token)match(input,RULE_C_UINT,FOLLOW_RULE_C_UINT_in_ruleTypeName1419); 

                    		current.merge(this_C_UINT_5);
                        
                     
                        newLeafNode(this_C_UINT_5, grammarAccess.getTypeNameAccess().getC_UINTTerminalRuleCall_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:720:10: this_C_BOOL_6= RULE_C_BOOL
                    {
                    this_C_BOOL_6=(Token)match(input,RULE_C_BOOL,FOLLOW_RULE_C_BOOL_in_ruleTypeName1445); 

                    		current.merge(this_C_BOOL_6);
                        
                     
                        newLeafNode(this_C_BOOL_6, grammarAccess.getTypeNameAccess().getC_BOOLTerminalRuleCall_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:728:10: this_C_NUMBER_7= RULE_C_NUMBER
                    {
                    this_C_NUMBER_7=(Token)match(input,RULE_C_NUMBER,FOLLOW_RULE_C_NUMBER_in_ruleTypeName1471); 

                    		current.merge(this_C_NUMBER_7);
                        
                     
                        newLeafNode(this_C_NUMBER_7, grammarAccess.getTypeNameAccess().getC_NUMBERTerminalRuleCall_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:736:10: this_C_STRING_8= RULE_C_STRING
                    {
                    this_C_STRING_8=(Token)match(input,RULE_C_STRING,FOLLOW_RULE_C_STRING_in_ruleTypeName1497); 

                    		current.merge(this_C_STRING_8);
                        
                     
                        newLeafNode(this_C_STRING_8, grammarAccess.getTypeNameAccess().getC_STRINGTerminalRuleCall_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:744:10: this_C_LIST_9= RULE_C_LIST
                    {
                    this_C_LIST_9=(Token)match(input,RULE_C_LIST,FOLLOW_RULE_C_LIST_in_ruleTypeName1523); 

                    		current.merge(this_C_LIST_9);
                        
                     
                        newLeafNode(this_C_LIST_9, grammarAccess.getTypeNameAccess().getC_LISTTerminalRuleCall_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:752:10: this_C_HASH_10= RULE_C_HASH
                    {
                    this_C_HASH_10=(Token)match(input,RULE_C_HASH,FOLLOW_RULE_C_HASH_in_ruleTypeName1549); 

                    		current.merge(this_C_HASH_10);
                        
                     
                        newLeafNode(this_C_HASH_10, grammarAccess.getTypeNameAccess().getC_HASHTerminalRuleCall_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:760:10: this_NAME_11= RULE_NAME
                    {
                    this_NAME_11=(Token)match(input,RULE_NAME,FOLLOW_RULE_NAME_in_ruleTypeName1575); 

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
    public static final BitSet FOLLOW_ruleType_in_ruleXML2130 = new BitSet(new long[]{0x0000000000000232L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleType218 = new BitSet(new long[]{0x0000000000000230L});
    public static final BitSet FOLLOW_ruleInput_in_ruleType245 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_C_TYPE_in_ruleType263 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NAME_in_ruleType285 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_C_BRACE_L_in_ruleType301 = new BitSet(new long[]{0x000000001F911570L});
    public static final BitSet FOLLOW_ruleField_in_ruleType321 = new BitSet(new long[]{0x000000001F911570L});
    public static final BitSet FOLLOW_RULE_C_BRACE_R_in_ruleType333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_L_in_ruleInput414 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_C_INPUT_in_ruleInput430 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_ruleInput446 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_C_FILE_in_ruleInput456 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_ruleInput466 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInput482 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_RULE_C_COMMA_in_ruleInput499 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_C_NODE_in_ruleInput509 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_ruleInput519 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInput535 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_ruleInput553 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_R_in_ruleInput563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleField650 = new BitSet(new long[]{0x000000001F911470L});
    public static final BitSet FOLLOW_ruleNativeType_in_ruleField679 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleListType_in_ruleField698 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleHashType_in_ruleField717 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NAME_in_ruleField737 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_ruleField753 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleField769 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_ruleField786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeType_in_entryRuleNativeType823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeType833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleNativeType878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListType_in_entryRuleListType913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListType923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_LIST_in_ruleListType959 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_C_ANGLE_L_in_ruleListType969 = new BitSet(new long[]{0x000000001F911460L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleListType989 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_C_ANGLE_R_in_ruleListType1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashType_in_entryRuleHashType1035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHashType1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_HASH_in_ruleHashType1081 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_C_ANGLE_L_in_ruleHashType1091 = new BitSet(new long[]{0x000000001F911460L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleHashType1111 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_C_ANGLE_R_in_ruleHashType1122 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_ruleHashType1133 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NAME_in_ruleHashType1149 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_RULE_C_COMMA_in_ruleHashType1166 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_NAME_in_ruleHashType1182 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_ruleHashType1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_entryRuleTypeName1238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeName1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INPUT_in_ruleTypeName1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_FILE_in_ruleTypeName1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_NODE_in_ruleTypeName1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_TYPE_in_ruleTypeName1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INT_in_ruleTypeName1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_UINT_in_ruleTypeName1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BOOL_in_ruleTypeName1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_NUMBER_in_ruleTypeName1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_STRING_in_ruleTypeName1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_LIST_in_ruleTypeName1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_HASH_in_ruleTypeName1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_ruleTypeName1575 = new BitSet(new long[]{0x0000000000000002L});

}