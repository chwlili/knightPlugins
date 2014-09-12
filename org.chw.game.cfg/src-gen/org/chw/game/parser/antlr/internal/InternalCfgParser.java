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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMMENT", "RULE_C_PACKAGE", "RULE_C_SEMICOLON", "RULE_C_TYPE", "RULE_NAME", "RULE_C_BRACE_L", "RULE_C_BRACE_R", "RULE_C_BRACKET_L", "RULE_C_INPUT", "RULE_C_PAREN_L", "RULE_C_FILE", "RULE_C_EQUALS", "RULE_STRING", "RULE_C_COMMA", "RULE_C_NODE", "RULE_C_PAREN_R", "RULE_C_BRACKET_R", "RULE_C_LIST", "RULE_C_ANGLE_L", "RULE_C_ANGLE_R", "RULE_C_HASH", "RULE_C_INT", "RULE_C_UINT", "RULE_C_BOOL", "RULE_C_NUMBER", "RULE_C_STRING", "RULE_COMMENT_END", "RULE_WS", "'.'"
    };
    public static final int RULE_C_NUMBER=28;
    public static final int RULE_C_COMMA=17;
    public static final int RULE_C_TYPE=7;
    public static final int RULE_C_PAREN_R=19;
    public static final int RULE_C_SEMICOLON=6;
    public static final int RULE_C_PAREN_L=13;
    public static final int RULE_C_NODE=18;
    public static final int RULE_C_INPUT=12;
    public static final int RULE_C_STRING=29;
    public static final int RULE_COMMENT=4;
    public static final int RULE_C_PACKAGE=5;
    public static final int RULE_C_HASH=24;
    public static final int EOF=-1;
    public static final int RULE_C_ANGLE_L=22;
    public static final int RULE_C_ANGLE_R=23;
    public static final int RULE_COMMENT_END=30;
    public static final int RULE_C_BRACKET_L=11;
    public static final int T__32=32;
    public static final int RULE_STRING=16;
    public static final int RULE_C_EQUALS=15;
    public static final int RULE_C_UINT=26;
    public static final int RULE_C_BRACKET_R=20;
    public static final int RULE_C_INT=25;
    public static final int RULE_C_FILE=14;
    public static final int RULE_NAME=8;
    public static final int RULE_WS=31;
    public static final int RULE_C_BOOL=27;
    public static final int RULE_C_LIST=21;
    public static final int RULE_C_BRACE_L=9;
    public static final int RULE_C_BRACE_R=10;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:76:1: ruleXML2 returns [EObject current=null] : ( ( (lv_pack_0_0= rulePackDef ) )? ( ( (lv_types_1_0= ruleType ) ) | ( (lv_otherComm_2_0= RULE_COMMENT ) ) )* ) ;
    public final EObject ruleXML2() throws RecognitionException {
        EObject current = null;

        Token lv_otherComm_2_0=null;
        EObject lv_pack_0_0 = null;

        EObject lv_types_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:79:28: ( ( ( (lv_pack_0_0= rulePackDef ) )? ( ( (lv_types_1_0= ruleType ) ) | ( (lv_otherComm_2_0= RULE_COMMENT ) ) )* ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:1: ( ( (lv_pack_0_0= rulePackDef ) )? ( ( (lv_types_1_0= ruleType ) ) | ( (lv_otherComm_2_0= RULE_COMMENT ) ) )* )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:1: ( ( (lv_pack_0_0= rulePackDef ) )? ( ( (lv_types_1_0= ruleType ) ) | ( (lv_otherComm_2_0= RULE_COMMENT ) ) )* )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:2: ( (lv_pack_0_0= rulePackDef ) )? ( ( (lv_types_1_0= ruleType ) ) | ( (lv_otherComm_2_0= RULE_COMMENT ) ) )*
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:2: ( (lv_pack_0_0= rulePackDef ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_C_PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:81:1: (lv_pack_0_0= rulePackDef )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:81:1: (lv_pack_0_0= rulePackDef )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:82:3: lv_pack_0_0= rulePackDef
                    {
                     
                    	        newCompositeNode(grammarAccess.getXML2Access().getPackPackDefParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePackDef_in_ruleXML2131);
                    lv_pack_0_0=rulePackDef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getXML2Rule());
                    	        }
                           		set(
                           			current, 
                           			"pack",
                            		lv_pack_0_0, 
                            		"PackDef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:98:3: ( ( (lv_types_1_0= ruleType ) ) | ( (lv_otherComm_2_0= RULE_COMMENT ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMMENT) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==RULE_C_TYPE||LA2_2==RULE_C_BRACKET_L) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==EOF||LA2_2==RULE_COMMENT) ) {
                        alt2=2;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:98:4: ( (lv_types_1_0= ruleType ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:98:4: ( (lv_types_1_0= ruleType ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:99:1: (lv_types_1_0= ruleType )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:99:1: (lv_types_1_0= ruleType )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:100:3: lv_types_1_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXML2Access().getTypesTypeParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleXML2154);
            	    lv_types_1_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXML2Rule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_1_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:117:6: ( (lv_otherComm_2_0= RULE_COMMENT ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:117:6: ( (lv_otherComm_2_0= RULE_COMMENT ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:118:1: (lv_otherComm_2_0= RULE_COMMENT )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:118:1: (lv_otherComm_2_0= RULE_COMMENT )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:119:3: lv_otherComm_2_0= RULE_COMMENT
            	    {
            	    lv_otherComm_2_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleXML2177); 

            	    			newLeafNode(lv_otherComm_2_0, grammarAccess.getXML2Access().getOtherCommCOMMENTTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getXML2Rule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"otherComm",
            	            		lv_otherComm_2_0, 
            	            		"COMMENT");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleXML2"


    // $ANTLR start "entryRulePackDef"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:143:1: entryRulePackDef returns [EObject current=null] : iv_rulePackDef= rulePackDef EOF ;
    public final EObject entryRulePackDef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackDef = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:144:2: (iv_rulePackDef= rulePackDef EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:145:2: iv_rulePackDef= rulePackDef EOF
            {
             newCompositeNode(grammarAccess.getPackDefRule()); 
            pushFollow(FOLLOW_rulePackDef_in_entryRulePackDef220);
            iv_rulePackDef=rulePackDef();

            state._fsp--;

             current =iv_rulePackDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackDef230); 

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
    // $ANTLR end "entryRulePackDef"


    // $ANTLR start "rulePackDef"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:152:1: rulePackDef returns [EObject current=null] : ( ( (lv_packCHAR_0_0= RULE_C_PACKAGE ) ) ( (lv_pack_1_0= rulePackName ) ) (this_C_SEMICOLON_2= RULE_C_SEMICOLON )? ) ;
    public final EObject rulePackDef() throws RecognitionException {
        EObject current = null;

        Token lv_packCHAR_0_0=null;
        Token this_C_SEMICOLON_2=null;
        AntlrDatatypeRuleToken lv_pack_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:155:28: ( ( ( (lv_packCHAR_0_0= RULE_C_PACKAGE ) ) ( (lv_pack_1_0= rulePackName ) ) (this_C_SEMICOLON_2= RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:156:1: ( ( (lv_packCHAR_0_0= RULE_C_PACKAGE ) ) ( (lv_pack_1_0= rulePackName ) ) (this_C_SEMICOLON_2= RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:156:1: ( ( (lv_packCHAR_0_0= RULE_C_PACKAGE ) ) ( (lv_pack_1_0= rulePackName ) ) (this_C_SEMICOLON_2= RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:156:2: ( (lv_packCHAR_0_0= RULE_C_PACKAGE ) ) ( (lv_pack_1_0= rulePackName ) ) (this_C_SEMICOLON_2= RULE_C_SEMICOLON )?
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:156:2: ( (lv_packCHAR_0_0= RULE_C_PACKAGE ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:157:1: (lv_packCHAR_0_0= RULE_C_PACKAGE )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:157:1: (lv_packCHAR_0_0= RULE_C_PACKAGE )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:158:3: lv_packCHAR_0_0= RULE_C_PACKAGE
            {
            lv_packCHAR_0_0=(Token)match(input,RULE_C_PACKAGE,FOLLOW_RULE_C_PACKAGE_in_rulePackDef272); 

            			newLeafNode(lv_packCHAR_0_0, grammarAccess.getPackDefAccess().getPackCHARC_PACKAGETerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPackDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"packCHAR",
                    		lv_packCHAR_0_0, 
                    		"C_PACKAGE");
            	    

            }


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:174:2: ( (lv_pack_1_0= rulePackName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:175:1: (lv_pack_1_0= rulePackName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:175:1: (lv_pack_1_0= rulePackName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:176:3: lv_pack_1_0= rulePackName
            {
             
            	        newCompositeNode(grammarAccess.getPackDefAccess().getPackPackNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePackName_in_rulePackDef298);
            lv_pack_1_0=rulePackName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackDefRule());
            	        }
                   		set(
                   			current, 
                   			"pack",
                    		lv_pack_1_0, 
                    		"PackName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:192:2: (this_C_SEMICOLON_2= RULE_C_SEMICOLON )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_C_SEMICOLON) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:192:3: this_C_SEMICOLON_2= RULE_C_SEMICOLON
                    {
                    this_C_SEMICOLON_2=(Token)match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_rulePackDef310); 
                     
                        newLeafNode(this_C_SEMICOLON_2, grammarAccess.getPackDefAccess().getC_SEMICOLONTerminalRuleCall_2()); 
                        

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
    // $ANTLR end "rulePackDef"


    // $ANTLR start "entryRuleType"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:204:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:205:2: (iv_ruleType= ruleType EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:206:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType347);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType357); 

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:213:1: ruleType returns [EObject current=null] : ( ( (lv_comm_0_0= RULE_COMMENT ) ) ( (lv_input_1_0= ruleInput ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= RULE_NAME ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( (lv_fields_5_0= ruleField ) ) | ( (lv_otherComm_6_0= RULE_COMMENT ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R ) ;
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
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:216:28: ( ( ( (lv_comm_0_0= RULE_COMMENT ) ) ( (lv_input_1_0= ruleInput ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= RULE_NAME ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( (lv_fields_5_0= ruleField ) ) | ( (lv_otherComm_6_0= RULE_COMMENT ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:217:1: ( ( (lv_comm_0_0= RULE_COMMENT ) ) ( (lv_input_1_0= ruleInput ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= RULE_NAME ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( (lv_fields_5_0= ruleField ) ) | ( (lv_otherComm_6_0= RULE_COMMENT ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:217:1: ( ( (lv_comm_0_0= RULE_COMMENT ) ) ( (lv_input_1_0= ruleInput ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= RULE_NAME ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( (lv_fields_5_0= ruleField ) ) | ( (lv_otherComm_6_0= RULE_COMMENT ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:217:2: ( (lv_comm_0_0= RULE_COMMENT ) ) ( (lv_input_1_0= ruleInput ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= RULE_NAME ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( (lv_fields_5_0= ruleField ) ) | ( (lv_otherComm_6_0= RULE_COMMENT ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:217:2: ( (lv_comm_0_0= RULE_COMMENT ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:218:1: (lv_comm_0_0= RULE_COMMENT )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:218:1: (lv_comm_0_0= RULE_COMMENT )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:219:3: lv_comm_0_0= RULE_COMMENT
            {
            lv_comm_0_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleType399); 

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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:235:2: ( (lv_input_1_0= ruleInput ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_C_BRACKET_L) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:236:1: (lv_input_1_0= ruleInput )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:236:1: (lv_input_1_0= ruleInput )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:237:3: lv_input_1_0= ruleInput
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getInputInputParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInput_in_ruleType425);
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:253:3: ( (lv_prefix_2_0= RULE_C_TYPE ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:254:1: (lv_prefix_2_0= RULE_C_TYPE )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:254:1: (lv_prefix_2_0= RULE_C_TYPE )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:255:3: lv_prefix_2_0= RULE_C_TYPE
            {
            lv_prefix_2_0=(Token)match(input,RULE_C_TYPE,FOLLOW_RULE_C_TYPE_in_ruleType443); 

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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:271:2: ( (lv_name_3_0= RULE_NAME ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:272:1: (lv_name_3_0= RULE_NAME )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:272:1: (lv_name_3_0= RULE_NAME )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:273:3: lv_name_3_0= RULE_NAME
            {
            lv_name_3_0=(Token)match(input,RULE_NAME,FOLLOW_RULE_NAME_in_ruleType465); 

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

            this_C_BRACE_L_4=(Token)match(input,RULE_C_BRACE_L,FOLLOW_RULE_C_BRACE_L_in_ruleType481); 
             
                newLeafNode(this_C_BRACE_L_4, grammarAccess.getTypeAccess().getC_BRACE_LTerminalRuleCall_4()); 
                
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:293:1: ( ( (lv_fields_5_0= ruleField ) ) | ( (lv_otherComm_6_0= RULE_COMMENT ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMMENT) ) {
                    int LA5_2 = input.LA(2);

                    if ( ((LA5_2>=RULE_C_TYPE && LA5_2<=RULE_NAME)||LA5_2==RULE_C_INPUT||LA5_2==RULE_C_FILE||LA5_2==RULE_C_NODE||LA5_2==RULE_C_LIST||(LA5_2>=RULE_C_HASH && LA5_2<=RULE_C_STRING)) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==RULE_COMMENT||LA5_2==RULE_C_BRACE_R) ) {
                        alt5=2;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:293:2: ( (lv_fields_5_0= ruleField ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:293:2: ( (lv_fields_5_0= ruleField ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:294:1: (lv_fields_5_0= ruleField )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:294:1: (lv_fields_5_0= ruleField )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:295:3: lv_fields_5_0= ruleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTypeAccess().getFieldsFieldParserRuleCall_5_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_in_ruleType502);
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
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:312:6: ( (lv_otherComm_6_0= RULE_COMMENT ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:312:6: ( (lv_otherComm_6_0= RULE_COMMENT ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:313:1: (lv_otherComm_6_0= RULE_COMMENT )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:313:1: (lv_otherComm_6_0= RULE_COMMENT )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:314:3: lv_otherComm_6_0= RULE_COMMENT
            	    {
            	    lv_otherComm_6_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleType525); 

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
            	    break loop5;
                }
            } while (true);

            this_C_BRACE_R_7=(Token)match(input,RULE_C_BRACE_R,FOLLOW_RULE_C_BRACE_R_in_ruleType543); 
             
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:342:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:343:2: (iv_ruleInput= ruleInput EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:344:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput578);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput588); 

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:351:1: ruleInput returns [EObject current=null] : (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_INPUT ) ) this_C_PAREN_L_2= RULE_C_PAREN_L this_C_FILE_3= RULE_C_FILE this_C_EQUALS_4= RULE_C_EQUALS ( (lv_filePath_5_0= RULE_STRING ) ) (this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) ) )? this_C_PAREN_R_10= RULE_C_PAREN_R this_C_BRACKET_R_11= RULE_C_BRACKET_R ) ;
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
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:354:28: ( (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_INPUT ) ) this_C_PAREN_L_2= RULE_C_PAREN_L this_C_FILE_3= RULE_C_FILE this_C_EQUALS_4= RULE_C_EQUALS ( (lv_filePath_5_0= RULE_STRING ) ) (this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) ) )? this_C_PAREN_R_10= RULE_C_PAREN_R this_C_BRACKET_R_11= RULE_C_BRACKET_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:355:1: (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_INPUT ) ) this_C_PAREN_L_2= RULE_C_PAREN_L this_C_FILE_3= RULE_C_FILE this_C_EQUALS_4= RULE_C_EQUALS ( (lv_filePath_5_0= RULE_STRING ) ) (this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) ) )? this_C_PAREN_R_10= RULE_C_PAREN_R this_C_BRACKET_R_11= RULE_C_BRACKET_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:355:1: (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_INPUT ) ) this_C_PAREN_L_2= RULE_C_PAREN_L this_C_FILE_3= RULE_C_FILE this_C_EQUALS_4= RULE_C_EQUALS ( (lv_filePath_5_0= RULE_STRING ) ) (this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) ) )? this_C_PAREN_R_10= RULE_C_PAREN_R this_C_BRACKET_R_11= RULE_C_BRACKET_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:355:2: this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_INPUT ) ) this_C_PAREN_L_2= RULE_C_PAREN_L this_C_FILE_3= RULE_C_FILE this_C_EQUALS_4= RULE_C_EQUALS ( (lv_filePath_5_0= RULE_STRING ) ) (this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) ) )? this_C_PAREN_R_10= RULE_C_PAREN_R this_C_BRACKET_R_11= RULE_C_BRACKET_R
            {
            this_C_BRACKET_L_0=(Token)match(input,RULE_C_BRACKET_L,FOLLOW_RULE_C_BRACKET_L_in_ruleInput624); 
             
                newLeafNode(this_C_BRACKET_L_0, grammarAccess.getInputAccess().getC_BRACKET_LTerminalRuleCall_0()); 
                
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:359:1: ( (lv_prefix_1_0= RULE_C_INPUT ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:360:1: (lv_prefix_1_0= RULE_C_INPUT )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:360:1: (lv_prefix_1_0= RULE_C_INPUT )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:361:3: lv_prefix_1_0= RULE_C_INPUT
            {
            lv_prefix_1_0=(Token)match(input,RULE_C_INPUT,FOLLOW_RULE_C_INPUT_in_ruleInput640); 

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

            this_C_PAREN_L_2=(Token)match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_ruleInput656); 
             
                newLeafNode(this_C_PAREN_L_2, grammarAccess.getInputAccess().getC_PAREN_LTerminalRuleCall_2()); 
                
            this_C_FILE_3=(Token)match(input,RULE_C_FILE,FOLLOW_RULE_C_FILE_in_ruleInput666); 
             
                newLeafNode(this_C_FILE_3, grammarAccess.getInputAccess().getC_FILETerminalRuleCall_3()); 
                
            this_C_EQUALS_4=(Token)match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_ruleInput676); 
             
                newLeafNode(this_C_EQUALS_4, grammarAccess.getInputAccess().getC_EQUALSTerminalRuleCall_4()); 
                
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:389:1: ( (lv_filePath_5_0= RULE_STRING ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:390:1: (lv_filePath_5_0= RULE_STRING )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:390:1: (lv_filePath_5_0= RULE_STRING )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:391:3: lv_filePath_5_0= RULE_STRING
            {
            lv_filePath_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInput692); 

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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:407:2: (this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_C_COMMA) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:407:3: this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) )
                    {
                    this_C_COMMA_6=(Token)match(input,RULE_C_COMMA,FOLLOW_RULE_C_COMMA_in_ruleInput709); 
                     
                        newLeafNode(this_C_COMMA_6, grammarAccess.getInputAccess().getC_COMMATerminalRuleCall_6_0()); 
                        
                    this_C_NODE_7=(Token)match(input,RULE_C_NODE,FOLLOW_RULE_C_NODE_in_ruleInput719); 
                     
                        newLeafNode(this_C_NODE_7, grammarAccess.getInputAccess().getC_NODETerminalRuleCall_6_1()); 
                        
                    this_C_EQUALS_8=(Token)match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_ruleInput729); 
                     
                        newLeafNode(this_C_EQUALS_8, grammarAccess.getInputAccess().getC_EQUALSTerminalRuleCall_6_2()); 
                        
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:419:1: ( (lv_nodePath_9_0= RULE_STRING ) )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:420:1: (lv_nodePath_9_0= RULE_STRING )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:420:1: (lv_nodePath_9_0= RULE_STRING )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:421:3: lv_nodePath_9_0= RULE_STRING
                    {
                    lv_nodePath_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInput745); 

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

            this_C_PAREN_R_10=(Token)match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_ruleInput763); 
             
                newLeafNode(this_C_PAREN_R_10, grammarAccess.getInputAccess().getC_PAREN_RTerminalRuleCall_7()); 
                
            this_C_BRACKET_R_11=(Token)match(input,RULE_C_BRACKET_R,FOLLOW_RULE_C_BRACKET_R_in_ruleInput773); 
             
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:453:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:454:2: (iv_ruleField= ruleField EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:455:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField808);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField818); 

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:462:1: ruleField returns [EObject current=null] : ( ( (lv_comm_0_0= RULE_COMMENT ) ) ( ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) ) ) ( (lv_fieldName_2_0= RULE_NAME ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_nodePath_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )? ) ;
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
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:465:28: ( ( ( (lv_comm_0_0= RULE_COMMENT ) ) ( ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) ) ) ( (lv_fieldName_2_0= RULE_NAME ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_nodePath_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:466:1: ( ( (lv_comm_0_0= RULE_COMMENT ) ) ( ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) ) ) ( (lv_fieldName_2_0= RULE_NAME ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_nodePath_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:466:1: ( ( (lv_comm_0_0= RULE_COMMENT ) ) ( ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) ) ) ( (lv_fieldName_2_0= RULE_NAME ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_nodePath_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:466:2: ( (lv_comm_0_0= RULE_COMMENT ) ) ( ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) ) ) ( (lv_fieldName_2_0= RULE_NAME ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_nodePath_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )?
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:466:2: ( (lv_comm_0_0= RULE_COMMENT ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:467:1: (lv_comm_0_0= RULE_COMMENT )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:467:1: (lv_comm_0_0= RULE_COMMENT )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:468:3: lv_comm_0_0= RULE_COMMENT
            {
            lv_comm_0_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleField860); 

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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:484:2: ( ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:485:1: ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:485:1: ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:486:1: (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:486:1: (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType )
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
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:487:3: lv_type_1_1= ruleNativeType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getTypeNativeTypeParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNativeType_in_ruleField888);
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
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:502:8: lv_type_1_2= ruleListType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getTypeListTypeParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleListType_in_ruleField907);
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
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:517:8: lv_type_1_3= ruleHashType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFieldAccess().getTypeHashTypeParserRuleCall_1_0_2()); 
                    	    
                    pushFollow(FOLLOW_ruleHashType_in_ruleField926);
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:535:2: ( (lv_fieldName_2_0= RULE_NAME ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:536:1: (lv_fieldName_2_0= RULE_NAME )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:536:1: (lv_fieldName_2_0= RULE_NAME )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:537:3: lv_fieldName_2_0= RULE_NAME
            {
            lv_fieldName_2_0=(Token)match(input,RULE_NAME,FOLLOW_RULE_NAME_in_ruleField946); 

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

            this_C_EQUALS_3=(Token)match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_ruleField962); 
             
                newLeafNode(this_C_EQUALS_3, grammarAccess.getFieldAccess().getC_EQUALSTerminalRuleCall_3()); 
                
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:557:1: ( (lv_nodePath_4_0= RULE_STRING ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:558:1: (lv_nodePath_4_0= RULE_STRING )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:558:1: (lv_nodePath_4_0= RULE_STRING )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:559:3: lv_nodePath_4_0= RULE_STRING
            {
            lv_nodePath_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleField978); 

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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:575:2: (this_C_SEMICOLON_5= RULE_C_SEMICOLON )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_C_SEMICOLON) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:575:3: this_C_SEMICOLON_5= RULE_C_SEMICOLON
                    {
                    this_C_SEMICOLON_5=(Token)match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_ruleField995); 
                     
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:587:1: entryRuleNativeType returns [EObject current=null] : iv_ruleNativeType= ruleNativeType EOF ;
    public final EObject entryRuleNativeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNativeType = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:588:2: (iv_ruleNativeType= ruleNativeType EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:589:2: iv_ruleNativeType= ruleNativeType EOF
            {
             newCompositeNode(grammarAccess.getNativeTypeRule()); 
            pushFollow(FOLLOW_ruleNativeType_in_entryRuleNativeType1032);
            iv_ruleNativeType=ruleNativeType();

            state._fsp--;

             current =iv_ruleNativeType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeType1042); 

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:596:1: ruleNativeType returns [EObject current=null] : ( (lv_type_0_0= ruleTypeName ) ) ;
    public final EObject ruleNativeType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:599:28: ( ( (lv_type_0_0= ruleTypeName ) ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:600:1: ( (lv_type_0_0= ruleTypeName ) )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:600:1: ( (lv_type_0_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:601:1: (lv_type_0_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:601:1: (lv_type_0_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:602:3: lv_type_0_0= ruleTypeName
            {
             
            	        newCompositeNode(grammarAccess.getNativeTypeAccess().getTypeTypeNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeName_in_ruleNativeType1087);
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:626:1: entryRuleListType returns [EObject current=null] : iv_ruleListType= ruleListType EOF ;
    public final EObject entryRuleListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListType = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:627:2: (iv_ruleListType= ruleListType EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:628:2: iv_ruleListType= ruleListType EOF
            {
             newCompositeNode(grammarAccess.getListTypeRule()); 
            pushFollow(FOLLOW_ruleListType_in_entryRuleListType1122);
            iv_ruleListType=ruleListType();

            state._fsp--;

             current =iv_ruleListType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListType1132); 

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:635:1: ruleListType returns [EObject current=null] : (this_C_LIST_0= RULE_C_LIST this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R ) ;
    public final EObject ruleListType() throws RecognitionException {
        EObject current = null;

        Token this_C_LIST_0=null;
        Token this_C_ANGLE_L_1=null;
        Token this_C_ANGLE_R_3=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:638:28: ( (this_C_LIST_0= RULE_C_LIST this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:639:1: (this_C_LIST_0= RULE_C_LIST this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:639:1: (this_C_LIST_0= RULE_C_LIST this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:639:2: this_C_LIST_0= RULE_C_LIST this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R
            {
            this_C_LIST_0=(Token)match(input,RULE_C_LIST,FOLLOW_RULE_C_LIST_in_ruleListType1168); 
             
                newLeafNode(this_C_LIST_0, grammarAccess.getListTypeAccess().getC_LISTTerminalRuleCall_0()); 
                
            this_C_ANGLE_L_1=(Token)match(input,RULE_C_ANGLE_L,FOLLOW_RULE_C_ANGLE_L_in_ruleListType1178); 
             
                newLeafNode(this_C_ANGLE_L_1, grammarAccess.getListTypeAccess().getC_ANGLE_LTerminalRuleCall_1()); 
                
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:647:1: ( (lv_type_2_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:648:1: (lv_type_2_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:648:1: (lv_type_2_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:649:3: lv_type_2_0= ruleTypeName
            {
             
            	        newCompositeNode(grammarAccess.getListTypeAccess().getTypeTypeNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeName_in_ruleListType1198);
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

            this_C_ANGLE_R_3=(Token)match(input,RULE_C_ANGLE_R,FOLLOW_RULE_C_ANGLE_R_in_ruleListType1209); 
             
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:677:1: entryRuleHashType returns [EObject current=null] : iv_ruleHashType= ruleHashType EOF ;
    public final EObject entryRuleHashType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashType = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:678:2: (iv_ruleHashType= ruleHashType EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:679:2: iv_ruleHashType= ruleHashType EOF
            {
             newCompositeNode(grammarAccess.getHashTypeRule()); 
            pushFollow(FOLLOW_ruleHashType_in_entryRuleHashType1244);
            iv_ruleHashType=ruleHashType();

            state._fsp--;

             current =iv_ruleHashType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHashType1254); 

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:686:1: ruleHashType returns [EObject current=null] : (this_C_HASH_0= RULE_C_HASH this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R (this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= ruleParam ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= ruleParam ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R )? ) ;
    public final EObject ruleHashType() throws RecognitionException {
        EObject current = null;

        Token this_C_HASH_0=null;
        Token this_C_ANGLE_L_1=null;
        Token this_C_ANGLE_R_3=null;
        Token this_C_PAREN_L_4=null;
        Token this_C_COMMA_6=null;
        Token this_C_PAREN_R_8=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_params_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:689:28: ( (this_C_HASH_0= RULE_C_HASH this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R (this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= ruleParam ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= ruleParam ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R )? ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:690:1: (this_C_HASH_0= RULE_C_HASH this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R (this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= ruleParam ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= ruleParam ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R )? )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:690:1: (this_C_HASH_0= RULE_C_HASH this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R (this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= ruleParam ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= ruleParam ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R )? )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:690:2: this_C_HASH_0= RULE_C_HASH this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R (this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= ruleParam ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= ruleParam ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R )?
            {
            this_C_HASH_0=(Token)match(input,RULE_C_HASH,FOLLOW_RULE_C_HASH_in_ruleHashType1290); 
             
                newLeafNode(this_C_HASH_0, grammarAccess.getHashTypeAccess().getC_HASHTerminalRuleCall_0()); 
                
            this_C_ANGLE_L_1=(Token)match(input,RULE_C_ANGLE_L,FOLLOW_RULE_C_ANGLE_L_in_ruleHashType1300); 
             
                newLeafNode(this_C_ANGLE_L_1, grammarAccess.getHashTypeAccess().getC_ANGLE_LTerminalRuleCall_1()); 
                
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:698:1: ( (lv_type_2_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:699:1: (lv_type_2_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:699:1: (lv_type_2_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:700:3: lv_type_2_0= ruleTypeName
            {
             
            	        newCompositeNode(grammarAccess.getHashTypeAccess().getTypeTypeNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeName_in_ruleHashType1320);
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

            this_C_ANGLE_R_3=(Token)match(input,RULE_C_ANGLE_R,FOLLOW_RULE_C_ANGLE_R_in_ruleHashType1331); 
             
                newLeafNode(this_C_ANGLE_R_3, grammarAccess.getHashTypeAccess().getC_ANGLE_RTerminalRuleCall_3()); 
                
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:720:1: (this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= ruleParam ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= ruleParam ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_C_PAREN_L) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:720:2: this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= ruleParam ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= ruleParam ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R
                    {
                    this_C_PAREN_L_4=(Token)match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_ruleHashType1342); 
                     
                        newLeafNode(this_C_PAREN_L_4, grammarAccess.getHashTypeAccess().getC_PAREN_LTerminalRuleCall_4_0()); 
                        
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:724:1: ( (lv_params_5_0= ruleParam ) )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:725:1: (lv_params_5_0= ruleParam )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:725:1: (lv_params_5_0= ruleParam )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:726:3: lv_params_5_0= ruleParam
                    {
                     
                    	        newCompositeNode(grammarAccess.getHashTypeAccess().getParamsParamParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParam_in_ruleHashType1362);
                    lv_params_5_0=ruleParam();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHashTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_5_0, 
                            		"Param");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:742:2: (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= ruleParam ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_C_COMMA) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:742:3: this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= ruleParam ) )
                    	    {
                    	    this_C_COMMA_6=(Token)match(input,RULE_C_COMMA,FOLLOW_RULE_C_COMMA_in_ruleHashType1374); 
                    	     
                    	        newLeafNode(this_C_COMMA_6, grammarAccess.getHashTypeAccess().getC_COMMATerminalRuleCall_4_2_0()); 
                    	        
                    	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:746:1: ( (lv_params_7_0= ruleParam ) )
                    	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:747:1: (lv_params_7_0= ruleParam )
                    	    {
                    	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:747:1: (lv_params_7_0= ruleParam )
                    	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:748:3: lv_params_7_0= ruleParam
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getHashTypeAccess().getParamsParamParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParam_in_ruleHashType1394);
                    	    lv_params_7_0=ruleParam();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getHashTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_7_0, 
                    	            		"Param");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    this_C_PAREN_R_8=(Token)match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_ruleHashType1407); 
                     
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


    // $ANTLR start "entryRuleParam"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:776:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:777:2: (iv_ruleParam= ruleParam EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:778:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam1444);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam1454); 

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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:785:1: ruleParam returns [EObject current=null] : ( (lv_paramName_0_0= RULE_NAME ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_paramName_0_0=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:788:28: ( ( (lv_paramName_0_0= RULE_NAME ) ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:789:1: ( (lv_paramName_0_0= RULE_NAME ) )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:789:1: ( (lv_paramName_0_0= RULE_NAME ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:790:1: (lv_paramName_0_0= RULE_NAME )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:790:1: (lv_paramName_0_0= RULE_NAME )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:791:3: lv_paramName_0_0= RULE_NAME
            {
            lv_paramName_0_0=(Token)match(input,RULE_NAME,FOLLOW_RULE_NAME_in_ruleParam1495); 

            			newLeafNode(lv_paramName_0_0, grammarAccess.getParamAccess().getParamNameNAMETerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParamRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"paramName",
                    		lv_paramName_0_0, 
                    		"NAME");
            	    

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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRulePackName"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:815:1: entryRulePackName returns [String current=null] : iv_rulePackName= rulePackName EOF ;
    public final String entryRulePackName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackName = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:816:2: (iv_rulePackName= rulePackName EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:817:2: iv_rulePackName= rulePackName EOF
            {
             newCompositeNode(grammarAccess.getPackNameRule()); 
            pushFollow(FOLLOW_rulePackName_in_entryRulePackName1536);
            iv_rulePackName=rulePackName();

            state._fsp--;

             current =iv_rulePackName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackName1547); 

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
    // $ANTLR end "entryRulePackName"


    // $ANTLR start "rulePackName"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:824:1: rulePackName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NAME_0= RULE_NAME (kw= '.' this_NAME_2= RULE_NAME )* ) ;
    public final AntlrDatatypeRuleToken rulePackName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NAME_0=null;
        Token kw=null;
        Token this_NAME_2=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:827:28: ( (this_NAME_0= RULE_NAME (kw= '.' this_NAME_2= RULE_NAME )* ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:828:1: (this_NAME_0= RULE_NAME (kw= '.' this_NAME_2= RULE_NAME )* )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:828:1: (this_NAME_0= RULE_NAME (kw= '.' this_NAME_2= RULE_NAME )* )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:828:6: this_NAME_0= RULE_NAME (kw= '.' this_NAME_2= RULE_NAME )*
            {
            this_NAME_0=(Token)match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rulePackName1587); 

            		current.merge(this_NAME_0);
                
             
                newLeafNode(this_NAME_0, grammarAccess.getPackNameAccess().getNAMETerminalRuleCall_0()); 
                
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:835:1: (kw= '.' this_NAME_2= RULE_NAME )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==32) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:836:2: kw= '.' this_NAME_2= RULE_NAME
            	    {
            	    kw=(Token)match(input,32,FOLLOW_32_in_rulePackName1606); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPackNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_NAME_2=(Token)match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rulePackName1621); 

            	    		current.merge(this_NAME_2);
            	        
            	     
            	        newLeafNode(this_NAME_2, grammarAccess.getPackNameAccess().getNAMETerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // $ANTLR end "rulePackName"


    // $ANTLR start "entryRuleTypeName"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:856:1: entryRuleTypeName returns [String current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final String entryRuleTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeName = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:857:2: (iv_ruleTypeName= ruleTypeName EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:858:2: iv_ruleTypeName= ruleTypeName EOF
            {
             newCompositeNode(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_ruleTypeName_in_entryRuleTypeName1669);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;

             current =iv_ruleTypeName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeName1680); 

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:865:1: ruleTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_C_INPUT_0= RULE_C_INPUT | this_C_FILE_1= RULE_C_FILE | this_C_NODE_2= RULE_C_NODE | this_C_TYPE_3= RULE_C_TYPE | this_C_INT_4= RULE_C_INT | this_C_UINT_5= RULE_C_UINT | this_C_BOOL_6= RULE_C_BOOL | this_C_NUMBER_7= RULE_C_NUMBER | this_C_STRING_8= RULE_C_STRING | this_C_LIST_9= RULE_C_LIST | this_C_HASH_10= RULE_C_HASH | this_NAME_11= RULE_NAME ) ;
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
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:868:28: ( (this_C_INPUT_0= RULE_C_INPUT | this_C_FILE_1= RULE_C_FILE | this_C_NODE_2= RULE_C_NODE | this_C_TYPE_3= RULE_C_TYPE | this_C_INT_4= RULE_C_INT | this_C_UINT_5= RULE_C_UINT | this_C_BOOL_6= RULE_C_BOOL | this_C_NUMBER_7= RULE_C_NUMBER | this_C_STRING_8= RULE_C_STRING | this_C_LIST_9= RULE_C_LIST | this_C_HASH_10= RULE_C_HASH | this_NAME_11= RULE_NAME ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:869:1: (this_C_INPUT_0= RULE_C_INPUT | this_C_FILE_1= RULE_C_FILE | this_C_NODE_2= RULE_C_NODE | this_C_TYPE_3= RULE_C_TYPE | this_C_INT_4= RULE_C_INT | this_C_UINT_5= RULE_C_UINT | this_C_BOOL_6= RULE_C_BOOL | this_C_NUMBER_7= RULE_C_NUMBER | this_C_STRING_8= RULE_C_STRING | this_C_LIST_9= RULE_C_LIST | this_C_HASH_10= RULE_C_HASH | this_NAME_11= RULE_NAME )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:869:1: (this_C_INPUT_0= RULE_C_INPUT | this_C_FILE_1= RULE_C_FILE | this_C_NODE_2= RULE_C_NODE | this_C_TYPE_3= RULE_C_TYPE | this_C_INT_4= RULE_C_INT | this_C_UINT_5= RULE_C_UINT | this_C_BOOL_6= RULE_C_BOOL | this_C_NUMBER_7= RULE_C_NUMBER | this_C_STRING_8= RULE_C_STRING | this_C_LIST_9= RULE_C_LIST | this_C_HASH_10= RULE_C_HASH | this_NAME_11= RULE_NAME )
            int alt12=12;
            switch ( input.LA(1) ) {
            case RULE_C_INPUT:
                {
                alt12=1;
                }
                break;
            case RULE_C_FILE:
                {
                alt12=2;
                }
                break;
            case RULE_C_NODE:
                {
                alt12=3;
                }
                break;
            case RULE_C_TYPE:
                {
                alt12=4;
                }
                break;
            case RULE_C_INT:
                {
                alt12=5;
                }
                break;
            case RULE_C_UINT:
                {
                alt12=6;
                }
                break;
            case RULE_C_BOOL:
                {
                alt12=7;
                }
                break;
            case RULE_C_NUMBER:
                {
                alt12=8;
                }
                break;
            case RULE_C_STRING:
                {
                alt12=9;
                }
                break;
            case RULE_C_LIST:
                {
                alt12=10;
                }
                break;
            case RULE_C_HASH:
                {
                alt12=11;
                }
                break;
            case RULE_NAME:
                {
                alt12=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:869:6: this_C_INPUT_0= RULE_C_INPUT
                    {
                    this_C_INPUT_0=(Token)match(input,RULE_C_INPUT,FOLLOW_RULE_C_INPUT_in_ruleTypeName1720); 

                    		current.merge(this_C_INPUT_0);
                        
                     
                        newLeafNode(this_C_INPUT_0, grammarAccess.getTypeNameAccess().getC_INPUTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:877:10: this_C_FILE_1= RULE_C_FILE
                    {
                    this_C_FILE_1=(Token)match(input,RULE_C_FILE,FOLLOW_RULE_C_FILE_in_ruleTypeName1746); 

                    		current.merge(this_C_FILE_1);
                        
                     
                        newLeafNode(this_C_FILE_1, grammarAccess.getTypeNameAccess().getC_FILETerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:885:10: this_C_NODE_2= RULE_C_NODE
                    {
                    this_C_NODE_2=(Token)match(input,RULE_C_NODE,FOLLOW_RULE_C_NODE_in_ruleTypeName1772); 

                    		current.merge(this_C_NODE_2);
                        
                     
                        newLeafNode(this_C_NODE_2, grammarAccess.getTypeNameAccess().getC_NODETerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:893:10: this_C_TYPE_3= RULE_C_TYPE
                    {
                    this_C_TYPE_3=(Token)match(input,RULE_C_TYPE,FOLLOW_RULE_C_TYPE_in_ruleTypeName1798); 

                    		current.merge(this_C_TYPE_3);
                        
                     
                        newLeafNode(this_C_TYPE_3, grammarAccess.getTypeNameAccess().getC_TYPETerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:901:10: this_C_INT_4= RULE_C_INT
                    {
                    this_C_INT_4=(Token)match(input,RULE_C_INT,FOLLOW_RULE_C_INT_in_ruleTypeName1824); 

                    		current.merge(this_C_INT_4);
                        
                     
                        newLeafNode(this_C_INT_4, grammarAccess.getTypeNameAccess().getC_INTTerminalRuleCall_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:909:10: this_C_UINT_5= RULE_C_UINT
                    {
                    this_C_UINT_5=(Token)match(input,RULE_C_UINT,FOLLOW_RULE_C_UINT_in_ruleTypeName1850); 

                    		current.merge(this_C_UINT_5);
                        
                     
                        newLeafNode(this_C_UINT_5, grammarAccess.getTypeNameAccess().getC_UINTTerminalRuleCall_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:917:10: this_C_BOOL_6= RULE_C_BOOL
                    {
                    this_C_BOOL_6=(Token)match(input,RULE_C_BOOL,FOLLOW_RULE_C_BOOL_in_ruleTypeName1876); 

                    		current.merge(this_C_BOOL_6);
                        
                     
                        newLeafNode(this_C_BOOL_6, grammarAccess.getTypeNameAccess().getC_BOOLTerminalRuleCall_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:925:10: this_C_NUMBER_7= RULE_C_NUMBER
                    {
                    this_C_NUMBER_7=(Token)match(input,RULE_C_NUMBER,FOLLOW_RULE_C_NUMBER_in_ruleTypeName1902); 

                    		current.merge(this_C_NUMBER_7);
                        
                     
                        newLeafNode(this_C_NUMBER_7, grammarAccess.getTypeNameAccess().getC_NUMBERTerminalRuleCall_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:933:10: this_C_STRING_8= RULE_C_STRING
                    {
                    this_C_STRING_8=(Token)match(input,RULE_C_STRING,FOLLOW_RULE_C_STRING_in_ruleTypeName1928); 

                    		current.merge(this_C_STRING_8);
                        
                     
                        newLeafNode(this_C_STRING_8, grammarAccess.getTypeNameAccess().getC_STRINGTerminalRuleCall_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:941:10: this_C_LIST_9= RULE_C_LIST
                    {
                    this_C_LIST_9=(Token)match(input,RULE_C_LIST,FOLLOW_RULE_C_LIST_in_ruleTypeName1954); 

                    		current.merge(this_C_LIST_9);
                        
                     
                        newLeafNode(this_C_LIST_9, grammarAccess.getTypeNameAccess().getC_LISTTerminalRuleCall_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:949:10: this_C_HASH_10= RULE_C_HASH
                    {
                    this_C_HASH_10=(Token)match(input,RULE_C_HASH,FOLLOW_RULE_C_HASH_in_ruleTypeName1980); 

                    		current.merge(this_C_HASH_10);
                        
                     
                        newLeafNode(this_C_HASH_10, grammarAccess.getTypeNameAccess().getC_HASHTerminalRuleCall_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:957:10: this_NAME_11= RULE_NAME
                    {
                    this_NAME_11=(Token)match(input,RULE_NAME,FOLLOW_RULE_NAME_in_ruleTypeName2006); 

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
    public static final BitSet FOLLOW_rulePackDef_in_ruleXML2131 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleType_in_ruleXML2154 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleXML2177 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulePackDef_in_entryRulePackDef220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackDef230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PACKAGE_in_rulePackDef272 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rulePackName_in_rulePackDef298 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_rulePackDef310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleType399 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_ruleInput_in_ruleType425 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_C_TYPE_in_ruleType443 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_NAME_in_ruleType465 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_C_BRACE_L_in_ruleType481 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_ruleField_in_ruleType502 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleType525 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_RULE_C_BRACE_R_in_ruleType543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_L_in_ruleInput624 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_C_INPUT_in_ruleInput640 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_ruleInput656 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_C_FILE_in_ruleInput666 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_ruleInput676 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInput692 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_RULE_C_COMMA_in_ruleInput709 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_C_NODE_in_ruleInput719 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_ruleInput729 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInput745 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_ruleInput763 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_R_in_ruleInput773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleField860 = new BitSet(new long[]{0x000000003F245180L});
    public static final BitSet FOLLOW_ruleNativeType_in_ruleField888 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleListType_in_ruleField907 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleHashType_in_ruleField926 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_NAME_in_ruleField946 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_ruleField962 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleField978 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_ruleField995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeType_in_entryRuleNativeType1032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeType1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleNativeType1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListType_in_entryRuleListType1122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListType1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_LIST_in_ruleListType1168 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_C_ANGLE_L_in_ruleListType1178 = new BitSet(new long[]{0x000000003F245180L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleListType1198 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RULE_C_ANGLE_R_in_ruleListType1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashType_in_entryRuleHashType1244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHashType1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_HASH_in_ruleHashType1290 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_C_ANGLE_L_in_ruleHashType1300 = new BitSet(new long[]{0x000000003F245180L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleHashType1320 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RULE_C_ANGLE_R_in_ruleHashType1331 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_ruleHashType1342 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleParam_in_ruleHashType1362 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_RULE_C_COMMA_in_ruleHashType1374 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleParam_in_ruleHashType1394 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_ruleHashType1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam1444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_ruleParam1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackName_in_entryRulePackName1536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackName1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rulePackName1587 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_rulePackName1606 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_NAME_in_rulePackName1621 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_entryRuleTypeName1669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeName1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INPUT_in_ruleTypeName1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_FILE_in_ruleTypeName1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_NODE_in_ruleTypeName1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_TYPE_in_ruleTypeName1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INT_in_ruleTypeName1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_UINT_in_ruleTypeName1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BOOL_in_ruleTypeName1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_NUMBER_in_ruleTypeName1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_STRING_in_ruleTypeName1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_LIST_in_ruleTypeName1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_HASH_in_ruleTypeName1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_ruleTypeName2006 = new BitSet(new long[]{0x0000000000000002L});

}