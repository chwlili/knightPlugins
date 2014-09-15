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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCfgParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_C_PACKAGE", "RULE_C_SEMICOLON", "RULE_C_TYPE", "RULE_C_BRACE_L", "RULE_C_BRACE_R", "RULE_C_BRACKET_L", "RULE_C_INPUT", "RULE_C_PAREN_L", "RULE_C_FILE", "RULE_C_EQUALS", "RULE_STRING", "RULE_C_COMMA", "RULE_C_NODE", "RULE_C_PAREN_R", "RULE_C_BRACKET_R", "RULE_C_LIST", "RULE_C_ANGLE_L", "RULE_C_ANGLE_R", "RULE_C_HASH", "RULE_NAME", "RULE_COMMENT", "RULE_C_INT", "RULE_C_UINT", "RULE_C_BOOL", "RULE_C_NUMBER", "RULE_C_STRING", "RULE_COMMENT_END", "RULE_WS", "'.'"
    };
    public static final int RULE_C_NUMBER=28;
    public static final int RULE_C_COMMA=15;
    public static final int RULE_C_TYPE=6;
    public static final int RULE_C_PAREN_R=17;
    public static final int RULE_C_SEMICOLON=5;
    public static final int RULE_C_PAREN_L=11;
    public static final int RULE_C_NODE=16;
    public static final int RULE_C_INPUT=10;
    public static final int RULE_C_STRING=29;
    public static final int RULE_COMMENT=24;
    public static final int RULE_C_PACKAGE=4;
    public static final int RULE_C_HASH=22;
    public static final int EOF=-1;
    public static final int RULE_C_ANGLE_L=20;
    public static final int RULE_C_ANGLE_R=21;
    public static final int RULE_COMMENT_END=30;
    public static final int RULE_C_BRACKET_L=9;
    public static final int T__32=32;
    public static final int RULE_STRING=14;
    public static final int RULE_C_EQUALS=13;
    public static final int RULE_C_UINT=26;
    public static final int RULE_C_BRACKET_R=18;
    public static final int RULE_C_INT=25;
    public static final int RULE_C_FILE=12;
    public static final int RULE_NAME=23;
    public static final int RULE_WS=31;
    public static final int RULE_C_BOOL=27;
    public static final int RULE_C_LIST=19;
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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXML2Rule()); 
            }
            pushFollow(FOLLOW_ruleXML2_in_entryRuleXML275);
            iv_ruleXML2=ruleXML2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXML2; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXML285); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:76:1: ruleXML2 returns [EObject current=null] : ( ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_pack_1_0= rulePackDef ) ) ( ( ( ( ruleType ) )=> (lv_types_2_0= ruleType ) ) | ( (lv_comm_3_0= ruleOtherComent ) ) )* ) ;
    public final EObject ruleXML2() throws RecognitionException {
        EObject current = null;

        EObject lv_comment_0_0 = null;

        EObject lv_pack_1_0 = null;

        EObject lv_types_2_0 = null;

        EObject lv_comm_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:79:28: ( ( ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_pack_1_0= rulePackDef ) ) ( ( ( ( ruleType ) )=> (lv_types_2_0= ruleType ) ) | ( (lv_comm_3_0= ruleOtherComent ) ) )* ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:1: ( ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_pack_1_0= rulePackDef ) ) ( ( ( ( ruleType ) )=> (lv_types_2_0= ruleType ) ) | ( (lv_comm_3_0= ruleOtherComent ) ) )* )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:1: ( ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_pack_1_0= rulePackDef ) ) ( ( ( ( ruleType ) )=> (lv_types_2_0= ruleType ) ) | ( (lv_comm_3_0= ruleOtherComent ) ) )* )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:2: ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_pack_1_0= rulePackDef ) ) ( ( ( ( ruleType ) )=> (lv_types_2_0= ruleType ) ) | ( (lv_comm_3_0= ruleOtherComent ) ) )*
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:2: ( (lv_comment_0_0= ruleOtherComent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_COMMENT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:81:1: (lv_comment_0_0= ruleOtherComent )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:81:1: (lv_comment_0_0= ruleOtherComent )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:82:3: lv_comment_0_0= ruleOtherComent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXML2Access().getCommentOtherComentParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOtherComent_in_ruleXML2131);
            	    lv_comment_0_0=ruleOtherComent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXML2Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"comment",
            	              		lv_comment_0_0, 
            	              		"OtherComent");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:98:3: ( (lv_pack_1_0= rulePackDef ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:99:1: (lv_pack_1_0= rulePackDef )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:99:1: (lv_pack_1_0= rulePackDef )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:100:3: lv_pack_1_0= rulePackDef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXML2Access().getPackPackDefParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePackDef_in_ruleXML2153);
            lv_pack_1_0=rulePackDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXML2Rule());
              	        }
                     		set(
                     			current, 
                     			"pack",
                      		lv_pack_1_0, 
                      		"PackDef");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:116:2: ( ( ( ( ruleType ) )=> (lv_types_2_0= ruleType ) ) | ( (lv_comm_3_0= ruleOtherComent ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMMENT) ) {
                    int LA2_2 = input.LA(2);

                    if ( (synpred1_InternalCfg()) ) {
                        alt2=1;
                    }
                    else if ( (true) ) {
                        alt2=2;
                    }


                }
                else if ( (LA2_0==RULE_C_BRACKET_L) && (synpred1_InternalCfg())) {
                    alt2=1;
                }
                else if ( (LA2_0==RULE_C_TYPE) && (synpred1_InternalCfg())) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:116:3: ( ( ( ruleType ) )=> (lv_types_2_0= ruleType ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:116:3: ( ( ( ruleType ) )=> (lv_types_2_0= ruleType ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:116:4: ( ( ruleType ) )=> (lv_types_2_0= ruleType )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:121:1: (lv_types_2_0= ruleType )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:122:3: lv_types_2_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXML2Access().getTypesTypeParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleType_in_ruleXML2185);
            	    lv_types_2_0=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXML2Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"types",
            	              		lv_types_2_0, 
            	              		"Type");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:139:6: ( (lv_comm_3_0= ruleOtherComent ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:139:6: ( (lv_comm_3_0= ruleOtherComent ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:140:1: (lv_comm_3_0= ruleOtherComent )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:140:1: (lv_comm_3_0= ruleOtherComent )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:141:3: lv_comm_3_0= ruleOtherComent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXML2Access().getCommOtherComentParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOtherComent_in_ruleXML2212);
            	    lv_comm_3_0=ruleOtherComent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXML2Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"comm",
            	              		lv_comm_3_0, 
            	              		"OtherComent");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXML2"


    // $ANTLR start "entryRulePackDef"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:165:1: entryRulePackDef returns [EObject current=null] : iv_rulePackDef= rulePackDef EOF ;
    public final EObject entryRulePackDef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackDef = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:166:2: (iv_rulePackDef= rulePackDef EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:167:2: iv_rulePackDef= rulePackDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackDefRule()); 
            }
            pushFollow(FOLLOW_rulePackDef_in_entryRulePackDef250);
            iv_rulePackDef=rulePackDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackDef260); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:174:1: rulePackDef returns [EObject current=null] : ( ( (lv_packCHAR_0_0= RULE_C_PACKAGE ) ) ( (lv_pack_1_0= rulePackName ) )? (this_C_SEMICOLON_2= RULE_C_SEMICOLON )? ) ;
    public final EObject rulePackDef() throws RecognitionException {
        EObject current = null;

        Token lv_packCHAR_0_0=null;
        Token this_C_SEMICOLON_2=null;
        AntlrDatatypeRuleToken lv_pack_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:177:28: ( ( ( (lv_packCHAR_0_0= RULE_C_PACKAGE ) ) ( (lv_pack_1_0= rulePackName ) )? (this_C_SEMICOLON_2= RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:178:1: ( ( (lv_packCHAR_0_0= RULE_C_PACKAGE ) ) ( (lv_pack_1_0= rulePackName ) )? (this_C_SEMICOLON_2= RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:178:1: ( ( (lv_packCHAR_0_0= RULE_C_PACKAGE ) ) ( (lv_pack_1_0= rulePackName ) )? (this_C_SEMICOLON_2= RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:178:2: ( (lv_packCHAR_0_0= RULE_C_PACKAGE ) ) ( (lv_pack_1_0= rulePackName ) )? (this_C_SEMICOLON_2= RULE_C_SEMICOLON )?
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:178:2: ( (lv_packCHAR_0_0= RULE_C_PACKAGE ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:179:1: (lv_packCHAR_0_0= RULE_C_PACKAGE )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:179:1: (lv_packCHAR_0_0= RULE_C_PACKAGE )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:180:3: lv_packCHAR_0_0= RULE_C_PACKAGE
            {
            lv_packCHAR_0_0=(Token)match(input,RULE_C_PACKAGE,FOLLOW_RULE_C_PACKAGE_in_rulePackDef302); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_packCHAR_0_0, grammarAccess.getPackDefAccess().getPackCHARC_PACKAGETerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:196:2: ( (lv_pack_1_0= rulePackName ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_C_INPUT||LA3_0==RULE_C_FILE||LA3_0==RULE_C_NODE||LA3_0==RULE_C_LIST||(LA3_0>=RULE_C_HASH && LA3_0<=RULE_NAME)||(LA3_0>=RULE_C_INT && LA3_0<=RULE_C_STRING)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_C_TYPE) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==RULE_C_TYPE) ) {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==RULE_C_TYPE||LA3_4==RULE_C_INPUT||LA3_4==RULE_C_FILE||LA3_4==RULE_C_NODE||LA3_4==RULE_C_LIST||(LA3_4>=RULE_C_HASH && LA3_4<=RULE_NAME)||(LA3_4>=RULE_C_INT && LA3_4<=RULE_C_STRING)) ) {
                        alt3=1;
                    }
                }
                else if ( (LA3_2==EOF||LA3_2==RULE_C_SEMICOLON||LA3_2==RULE_C_BRACKET_L||LA3_2==RULE_COMMENT||LA3_2==32) ) {
                    alt3=1;
                }
            }
            switch (alt3) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:197:1: (lv_pack_1_0= rulePackName )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:197:1: (lv_pack_1_0= rulePackName )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:198:3: lv_pack_1_0= rulePackName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPackDefAccess().getPackPackNameParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackName_in_rulePackDef328);
                    lv_pack_1_0=rulePackName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:214:3: (this_C_SEMICOLON_2= RULE_C_SEMICOLON )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_C_SEMICOLON) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:214:4: this_C_SEMICOLON_2= RULE_C_SEMICOLON
                    {
                    this_C_SEMICOLON_2=(Token)match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_rulePackDef341); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_SEMICOLON_2, grammarAccess.getPackDefAccess().getC_SEMICOLONTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePackDef"


    // $ANTLR start "entryRuleType"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:226:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:227:2: (iv_ruleType= ruleType EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:228:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType378);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType388); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:235:1: ruleType returns [EObject current=null] : ( ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_input_1_0= ruleInput ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= ruleTypeName ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_2_0=null;
        Token this_C_BRACE_L_4=null;
        Token this_C_BRACE_R_7=null;
        AntlrDatatypeRuleToken lv_comment_0_0 = null;

        EObject lv_input_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_fields_5_0 = null;

        EObject lv_comm_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:238:28: ( ( ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_input_1_0= ruleInput ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= ruleTypeName ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:239:1: ( ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_input_1_0= ruleInput ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= ruleTypeName ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:239:1: ( ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_input_1_0= ruleInput ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= ruleTypeName ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:239:2: ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_input_1_0= ruleInput ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= ruleTypeName ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:239:2: ( (lv_comment_0_0= ruleTypeComment ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_COMMENT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:240:1: (lv_comment_0_0= ruleTypeComment )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:240:1: (lv_comment_0_0= ruleTypeComment )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:241:3: lv_comment_0_0= ruleTypeComment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getCommentTypeCommentParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeComment_in_ruleType434);
                    lv_comment_0_0=ruleTypeComment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"comment",
                              		lv_comment_0_0, 
                              		"TypeComment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:257:3: ( (lv_input_1_0= ruleInput ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_C_BRACKET_L) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:258:1: (lv_input_1_0= ruleInput )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:258:1: (lv_input_1_0= ruleInput )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:259:3: lv_input_1_0= ruleInput
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getInputInputParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInput_in_ruleType456);
                    lv_input_1_0=ruleInput();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:275:3: ( (lv_prefix_2_0= RULE_C_TYPE ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:276:1: (lv_prefix_2_0= RULE_C_TYPE )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:276:1: (lv_prefix_2_0= RULE_C_TYPE )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:277:3: lv_prefix_2_0= RULE_C_TYPE
            {
            lv_prefix_2_0=(Token)match(input,RULE_C_TYPE,FOLLOW_RULE_C_TYPE_in_ruleType474); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_prefix_2_0, grammarAccess.getTypeAccess().getPrefixC_TYPETerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:293:2: ( (lv_name_3_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:294:1: (lv_name_3_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:294:1: (lv_name_3_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:295:3: lv_name_3_0= ruleTypeName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAccess().getNameTypeNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeName_in_ruleType500);
            lv_name_3_0=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"TypeName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_C_BRACE_L_4=(Token)match(input,RULE_C_BRACE_L,FOLLOW_RULE_C_BRACE_L_in_ruleType511); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_BRACE_L_4, grammarAccess.getTypeAccess().getC_BRACE_LTerminalRuleCall_4()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:315:1: ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )*
            loop7:
            do {
                int alt7=3;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:315:2: ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:315:2: ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:315:3: ( ( ruleField ) )=> (lv_fields_5_0= ruleField )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:320:1: (lv_fields_5_0= ruleField )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:321:3: lv_fields_5_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypeAccess().getFieldsFieldParserRuleCall_5_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleField_in_ruleType542);
            	    lv_fields_5_0=ruleField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;
            	case 2 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:338:6: ( (lv_comm_6_0= ruleOtherComent ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:338:6: ( (lv_comm_6_0= ruleOtherComent ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:339:1: (lv_comm_6_0= ruleOtherComent )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:339:1: (lv_comm_6_0= ruleOtherComent )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:340:3: lv_comm_6_0= ruleOtherComent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypeAccess().getCommOtherComentParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOtherComent_in_ruleType569);
            	    lv_comm_6_0=ruleOtherComent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTypeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"comm",
            	              		lv_comm_6_0, 
            	              		"OtherComent");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            this_C_BRACE_R_7=(Token)match(input,RULE_C_BRACE_R,FOLLOW_RULE_C_BRACE_R_in_ruleType582); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_BRACE_R_7, grammarAccess.getTypeAccess().getC_BRACE_RTerminalRuleCall_6()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleInput"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:368:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:369:2: (iv_ruleInput= ruleInput EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:370:2: iv_ruleInput= ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput617);
            iv_ruleInput=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInput; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput627); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:377:1: ruleInput returns [EObject current=null] : (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_INPUT ) ) this_C_PAREN_L_2= RULE_C_PAREN_L this_C_FILE_3= RULE_C_FILE this_C_EQUALS_4= RULE_C_EQUALS ( (lv_filePath_5_0= RULE_STRING ) ) (this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) ) )? this_C_PAREN_R_10= RULE_C_PAREN_R this_C_BRACKET_R_11= RULE_C_BRACKET_R ) ;
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
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:380:28: ( (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_INPUT ) ) this_C_PAREN_L_2= RULE_C_PAREN_L this_C_FILE_3= RULE_C_FILE this_C_EQUALS_4= RULE_C_EQUALS ( (lv_filePath_5_0= RULE_STRING ) ) (this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) ) )? this_C_PAREN_R_10= RULE_C_PAREN_R this_C_BRACKET_R_11= RULE_C_BRACKET_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:381:1: (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_INPUT ) ) this_C_PAREN_L_2= RULE_C_PAREN_L this_C_FILE_3= RULE_C_FILE this_C_EQUALS_4= RULE_C_EQUALS ( (lv_filePath_5_0= RULE_STRING ) ) (this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) ) )? this_C_PAREN_R_10= RULE_C_PAREN_R this_C_BRACKET_R_11= RULE_C_BRACKET_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:381:1: (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_INPUT ) ) this_C_PAREN_L_2= RULE_C_PAREN_L this_C_FILE_3= RULE_C_FILE this_C_EQUALS_4= RULE_C_EQUALS ( (lv_filePath_5_0= RULE_STRING ) ) (this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) ) )? this_C_PAREN_R_10= RULE_C_PAREN_R this_C_BRACKET_R_11= RULE_C_BRACKET_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:381:2: this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_INPUT ) ) this_C_PAREN_L_2= RULE_C_PAREN_L this_C_FILE_3= RULE_C_FILE this_C_EQUALS_4= RULE_C_EQUALS ( (lv_filePath_5_0= RULE_STRING ) ) (this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) ) )? this_C_PAREN_R_10= RULE_C_PAREN_R this_C_BRACKET_R_11= RULE_C_BRACKET_R
            {
            this_C_BRACKET_L_0=(Token)match(input,RULE_C_BRACKET_L,FOLLOW_RULE_C_BRACKET_L_in_ruleInput663); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_BRACKET_L_0, grammarAccess.getInputAccess().getC_BRACKET_LTerminalRuleCall_0()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:385:1: ( (lv_prefix_1_0= RULE_C_INPUT ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:386:1: (lv_prefix_1_0= RULE_C_INPUT )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:386:1: (lv_prefix_1_0= RULE_C_INPUT )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:387:3: lv_prefix_1_0= RULE_C_INPUT
            {
            lv_prefix_1_0=(Token)match(input,RULE_C_INPUT,FOLLOW_RULE_C_INPUT_in_ruleInput679); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_prefix_1_0, grammarAccess.getInputAccess().getPrefixC_INPUTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            this_C_PAREN_L_2=(Token)match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_ruleInput695); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_PAREN_L_2, grammarAccess.getInputAccess().getC_PAREN_LTerminalRuleCall_2()); 
                  
            }
            this_C_FILE_3=(Token)match(input,RULE_C_FILE,FOLLOW_RULE_C_FILE_in_ruleInput705); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_FILE_3, grammarAccess.getInputAccess().getC_FILETerminalRuleCall_3()); 
                  
            }
            this_C_EQUALS_4=(Token)match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_ruleInput715); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_EQUALS_4, grammarAccess.getInputAccess().getC_EQUALSTerminalRuleCall_4()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:415:1: ( (lv_filePath_5_0= RULE_STRING ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:416:1: (lv_filePath_5_0= RULE_STRING )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:416:1: (lv_filePath_5_0= RULE_STRING )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:417:3: lv_filePath_5_0= RULE_STRING
            {
            lv_filePath_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInput731); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_filePath_5_0, grammarAccess.getInputAccess().getFilePathSTRINGTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:433:2: (this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_C_COMMA) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:433:3: this_C_COMMA_6= RULE_C_COMMA this_C_NODE_7= RULE_C_NODE this_C_EQUALS_8= RULE_C_EQUALS ( (lv_nodePath_9_0= RULE_STRING ) )
                    {
                    this_C_COMMA_6=(Token)match(input,RULE_C_COMMA,FOLLOW_RULE_C_COMMA_in_ruleInput748); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_COMMA_6, grammarAccess.getInputAccess().getC_COMMATerminalRuleCall_6_0()); 
                          
                    }
                    this_C_NODE_7=(Token)match(input,RULE_C_NODE,FOLLOW_RULE_C_NODE_in_ruleInput758); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_NODE_7, grammarAccess.getInputAccess().getC_NODETerminalRuleCall_6_1()); 
                          
                    }
                    this_C_EQUALS_8=(Token)match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_ruleInput768); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_EQUALS_8, grammarAccess.getInputAccess().getC_EQUALSTerminalRuleCall_6_2()); 
                          
                    }
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:445:1: ( (lv_nodePath_9_0= RULE_STRING ) )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:446:1: (lv_nodePath_9_0= RULE_STRING )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:446:1: (lv_nodePath_9_0= RULE_STRING )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:447:3: lv_nodePath_9_0= RULE_STRING
                    {
                    lv_nodePath_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInput784); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_nodePath_9_0, grammarAccess.getInputAccess().getNodePathSTRINGTerminalRuleCall_6_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }

            this_C_PAREN_R_10=(Token)match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_ruleInput802); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_PAREN_R_10, grammarAccess.getInputAccess().getC_PAREN_RTerminalRuleCall_7()); 
                  
            }
            this_C_BRACKET_R_11=(Token)match(input,RULE_C_BRACKET_R,FOLLOW_RULE_C_BRACKET_R_in_ruleInput812); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_BRACKET_R_11, grammarAccess.getInputAccess().getC_BRACKET_RTerminalRuleCall_8()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleField"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:479:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:480:2: (iv_ruleField= ruleField EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:481:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField847);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField857); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:488:1: ruleField returns [EObject current=null] : ( ( (lv_comment_0_0= ruleFieldComment ) )? ( ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) ) ) ( (lv_fieldName_2_0= ruleTypeName ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_nodePath_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )? ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token this_C_EQUALS_3=null;
        Token lv_nodePath_4_0=null;
        Token this_C_SEMICOLON_5=null;
        AntlrDatatypeRuleToken lv_comment_0_0 = null;

        EObject lv_type_1_1 = null;

        EObject lv_type_1_2 = null;

        EObject lv_type_1_3 = null;

        AntlrDatatypeRuleToken lv_fieldName_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:491:28: ( ( ( (lv_comment_0_0= ruleFieldComment ) )? ( ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) ) ) ( (lv_fieldName_2_0= ruleTypeName ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_nodePath_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:492:1: ( ( (lv_comment_0_0= ruleFieldComment ) )? ( ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) ) ) ( (lv_fieldName_2_0= ruleTypeName ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_nodePath_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:492:1: ( ( (lv_comment_0_0= ruleFieldComment ) )? ( ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) ) ) ( (lv_fieldName_2_0= ruleTypeName ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_nodePath_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:492:2: ( (lv_comment_0_0= ruleFieldComment ) )? ( ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) ) ) ( (lv_fieldName_2_0= ruleTypeName ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_nodePath_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )?
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:492:2: ( (lv_comment_0_0= ruleFieldComment ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_COMMENT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:493:1: (lv_comment_0_0= ruleFieldComment )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:493:1: (lv_comment_0_0= ruleFieldComment )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:494:3: lv_comment_0_0= ruleFieldComment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldAccess().getCommentFieldCommentParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFieldComment_in_ruleField903);
                    lv_comment_0_0=ruleFieldComment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFieldRule());
                      	        }
                             		set(
                             			current, 
                             			"comment",
                              		lv_comment_0_0, 
                              		"FieldComment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:510:3: ( ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:511:1: ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:511:1: ( (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:512:1: (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:512:1: (lv_type_1_1= ruleNativeType | lv_type_1_2= ruleListType | lv_type_1_3= ruleHashType )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_C_TYPE:
            case RULE_C_INPUT:
            case RULE_C_FILE:
            case RULE_C_NODE:
            case RULE_NAME:
            case RULE_C_INT:
            case RULE_C_UINT:
            case RULE_C_BOOL:
            case RULE_C_NUMBER:
            case RULE_C_STRING:
                {
                alt10=1;
                }
                break;
            case RULE_C_LIST:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==RULE_C_ANGLE_L) ) {
                    alt10=2;
                }
                else if ( (LA10_2==RULE_C_TYPE||LA10_2==RULE_C_INPUT||LA10_2==RULE_C_FILE||LA10_2==RULE_C_NODE||LA10_2==RULE_C_LIST||(LA10_2>=RULE_C_HASH && LA10_2<=RULE_NAME)||(LA10_2>=RULE_C_INT && LA10_2<=RULE_C_STRING)) ) {
                    alt10=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_C_HASH:
                {
                int LA10_3 = input.LA(2);

                if ( (LA10_3==RULE_C_ANGLE_L) ) {
                    alt10=3;
                }
                else if ( (LA10_3==RULE_C_TYPE||LA10_3==RULE_C_INPUT||LA10_3==RULE_C_FILE||LA10_3==RULE_C_NODE||LA10_3==RULE_C_LIST||(LA10_3>=RULE_C_HASH && LA10_3<=RULE_NAME)||(LA10_3>=RULE_C_INT && LA10_3<=RULE_C_STRING)) ) {
                    alt10=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:513:3: lv_type_1_1= ruleNativeType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldAccess().getTypeNativeTypeParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNativeType_in_ruleField927);
                    lv_type_1_1=ruleNativeType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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

                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:528:8: lv_type_1_2= ruleListType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldAccess().getTypeListTypeParserRuleCall_1_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleListType_in_ruleField946);
                    lv_type_1_2=ruleListType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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

                    }
                    break;
                case 3 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:543:8: lv_type_1_3= ruleHashType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldAccess().getTypeHashTypeParserRuleCall_1_0_2()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleHashType_in_ruleField965);
                    lv_type_1_3=ruleHashType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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

                    }
                    break;

            }


            }


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:561:2: ( (lv_fieldName_2_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:562:1: (lv_fieldName_2_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:562:1: (lv_fieldName_2_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:563:3: lv_fieldName_2_0= ruleTypeName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldAccess().getFieldNameTypeNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeName_in_ruleField989);
            lv_fieldName_2_0=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFieldRule());
              	        }
                     		set(
                     			current, 
                     			"fieldName",
                      		lv_fieldName_2_0, 
                      		"TypeName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_C_EQUALS_3=(Token)match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_ruleField1000); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_EQUALS_3, grammarAccess.getFieldAccess().getC_EQUALSTerminalRuleCall_3()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:583:1: ( (lv_nodePath_4_0= RULE_STRING ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:584:1: (lv_nodePath_4_0= RULE_STRING )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:584:1: (lv_nodePath_4_0= RULE_STRING )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:585:3: lv_nodePath_4_0= RULE_STRING
            {
            lv_nodePath_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleField1016); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_nodePath_4_0, grammarAccess.getFieldAccess().getNodePathSTRINGTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:601:2: (this_C_SEMICOLON_5= RULE_C_SEMICOLON )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_C_SEMICOLON) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:601:3: this_C_SEMICOLON_5= RULE_C_SEMICOLON
                    {
                    this_C_SEMICOLON_5=(Token)match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_ruleField1033); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_SEMICOLON_5, grammarAccess.getFieldAccess().getC_SEMICOLONTerminalRuleCall_5()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleNativeType"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:613:1: entryRuleNativeType returns [EObject current=null] : iv_ruleNativeType= ruleNativeType EOF ;
    public final EObject entryRuleNativeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNativeType = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:614:2: (iv_ruleNativeType= ruleNativeType EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:615:2: iv_ruleNativeType= ruleNativeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNativeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleNativeType_in_entryRuleNativeType1070);
            iv_ruleNativeType=ruleNativeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNativeType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeType1080); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:622:1: ruleNativeType returns [EObject current=null] : ( (lv_type_0_0= ruleTypeName ) ) ;
    public final EObject ruleNativeType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:625:28: ( ( (lv_type_0_0= ruleTypeName ) ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:626:1: ( (lv_type_0_0= ruleTypeName ) )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:626:1: ( (lv_type_0_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:627:1: (lv_type_0_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:627:1: (lv_type_0_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:628:3: lv_type_0_0= ruleTypeName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNativeTypeAccess().getTypeTypeNameParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeName_in_ruleNativeType1125);
            lv_type_0_0=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNativeType"


    // $ANTLR start "entryRuleListType"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:652:1: entryRuleListType returns [EObject current=null] : iv_ruleListType= ruleListType EOF ;
    public final EObject entryRuleListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListType = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:653:2: (iv_ruleListType= ruleListType EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:654:2: iv_ruleListType= ruleListType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListTypeRule()); 
            }
            pushFollow(FOLLOW_ruleListType_in_entryRuleListType1160);
            iv_ruleListType=ruleListType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleListType1170); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:661:1: ruleListType returns [EObject current=null] : (this_C_LIST_0= RULE_C_LIST this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R ) ;
    public final EObject ruleListType() throws RecognitionException {
        EObject current = null;

        Token this_C_LIST_0=null;
        Token this_C_ANGLE_L_1=null;
        Token this_C_ANGLE_R_3=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:664:28: ( (this_C_LIST_0= RULE_C_LIST this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:665:1: (this_C_LIST_0= RULE_C_LIST this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:665:1: (this_C_LIST_0= RULE_C_LIST this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:665:2: this_C_LIST_0= RULE_C_LIST this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R
            {
            this_C_LIST_0=(Token)match(input,RULE_C_LIST,FOLLOW_RULE_C_LIST_in_ruleListType1206); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_LIST_0, grammarAccess.getListTypeAccess().getC_LISTTerminalRuleCall_0()); 
                  
            }
            this_C_ANGLE_L_1=(Token)match(input,RULE_C_ANGLE_L,FOLLOW_RULE_C_ANGLE_L_in_ruleListType1216); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_ANGLE_L_1, grammarAccess.getListTypeAccess().getC_ANGLE_LTerminalRuleCall_1()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:673:1: ( (lv_type_2_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:674:1: (lv_type_2_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:674:1: (lv_type_2_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:675:3: lv_type_2_0= ruleTypeName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getListTypeAccess().getTypeTypeNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeName_in_ruleListType1236);
            lv_type_2_0=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            this_C_ANGLE_R_3=(Token)match(input,RULE_C_ANGLE_R,FOLLOW_RULE_C_ANGLE_R_in_ruleListType1247); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_ANGLE_R_3, grammarAccess.getListTypeAccess().getC_ANGLE_RTerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleListType"


    // $ANTLR start "entryRuleHashType"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:703:1: entryRuleHashType returns [EObject current=null] : iv_ruleHashType= ruleHashType EOF ;
    public final EObject entryRuleHashType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashType = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:704:2: (iv_ruleHashType= ruleHashType EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:705:2: iv_ruleHashType= ruleHashType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHashTypeRule()); 
            }
            pushFollow(FOLLOW_ruleHashType_in_entryRuleHashType1282);
            iv_ruleHashType=ruleHashType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHashType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHashType1292); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:712:1: ruleHashType returns [EObject current=null] : (this_C_HASH_0= RULE_C_HASH this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R (this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= ruleParam ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= ruleParam ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R )? ) ;
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
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:715:28: ( (this_C_HASH_0= RULE_C_HASH this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R (this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= ruleParam ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= ruleParam ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R )? ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:716:1: (this_C_HASH_0= RULE_C_HASH this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R (this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= ruleParam ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= ruleParam ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R )? )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:716:1: (this_C_HASH_0= RULE_C_HASH this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R (this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= ruleParam ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= ruleParam ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R )? )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:716:2: this_C_HASH_0= RULE_C_HASH this_C_ANGLE_L_1= RULE_C_ANGLE_L ( (lv_type_2_0= ruleTypeName ) ) this_C_ANGLE_R_3= RULE_C_ANGLE_R (this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= ruleParam ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= ruleParam ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R )?
            {
            this_C_HASH_0=(Token)match(input,RULE_C_HASH,FOLLOW_RULE_C_HASH_in_ruleHashType1328); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_HASH_0, grammarAccess.getHashTypeAccess().getC_HASHTerminalRuleCall_0()); 
                  
            }
            this_C_ANGLE_L_1=(Token)match(input,RULE_C_ANGLE_L,FOLLOW_RULE_C_ANGLE_L_in_ruleHashType1338); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_ANGLE_L_1, grammarAccess.getHashTypeAccess().getC_ANGLE_LTerminalRuleCall_1()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:724:1: ( (lv_type_2_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:725:1: (lv_type_2_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:725:1: (lv_type_2_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:726:3: lv_type_2_0= ruleTypeName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHashTypeAccess().getTypeTypeNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeName_in_ruleHashType1358);
            lv_type_2_0=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            this_C_ANGLE_R_3=(Token)match(input,RULE_C_ANGLE_R,FOLLOW_RULE_C_ANGLE_R_in_ruleHashType1369); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_ANGLE_R_3, grammarAccess.getHashTypeAccess().getC_ANGLE_RTerminalRuleCall_3()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:746:1: (this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= ruleParam ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= ruleParam ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_C_PAREN_L) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:746:2: this_C_PAREN_L_4= RULE_C_PAREN_L ( (lv_params_5_0= ruleParam ) ) (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= ruleParam ) ) )* this_C_PAREN_R_8= RULE_C_PAREN_R
                    {
                    this_C_PAREN_L_4=(Token)match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_ruleHashType1380); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_PAREN_L_4, grammarAccess.getHashTypeAccess().getC_PAREN_LTerminalRuleCall_4_0()); 
                          
                    }
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:750:1: ( (lv_params_5_0= ruleParam ) )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:751:1: (lv_params_5_0= ruleParam )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:751:1: (lv_params_5_0= ruleParam )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:752:3: lv_params_5_0= ruleParam
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getHashTypeAccess().getParamsParamParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParam_in_ruleHashType1400);
                    lv_params_5_0=ruleParam();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:768:2: (this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= ruleParam ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_C_COMMA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:768:3: this_C_COMMA_6= RULE_C_COMMA ( (lv_params_7_0= ruleParam ) )
                    	    {
                    	    this_C_COMMA_6=(Token)match(input,RULE_C_COMMA,FOLLOW_RULE_C_COMMA_in_ruleHashType1412); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_C_COMMA_6, grammarAccess.getHashTypeAccess().getC_COMMATerminalRuleCall_4_2_0()); 
                    	          
                    	    }
                    	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:772:1: ( (lv_params_7_0= ruleParam ) )
                    	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:773:1: (lv_params_7_0= ruleParam )
                    	    {
                    	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:773:1: (lv_params_7_0= ruleParam )
                    	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:774:3: lv_params_7_0= ruleParam
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getHashTypeAccess().getParamsParamParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParam_in_ruleHashType1432);
                    	    lv_params_7_0=ruleParam();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    this_C_PAREN_R_8=(Token)match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_ruleHashType1445); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_PAREN_R_8, grammarAccess.getHashTypeAccess().getC_PAREN_RTerminalRuleCall_4_3()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleHashType"


    // $ANTLR start "entryRuleParam"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:802:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:803:2: (iv_ruleParam= ruleParam EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:804:2: iv_ruleParam= ruleParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamRule()); 
            }
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam1482);
            iv_ruleParam=ruleParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParam; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam1492); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:811:1: ruleParam returns [EObject current=null] : ( (lv_paramName_0_0= RULE_NAME ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_paramName_0_0=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:814:28: ( ( (lv_paramName_0_0= RULE_NAME ) ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:815:1: ( (lv_paramName_0_0= RULE_NAME ) )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:815:1: ( (lv_paramName_0_0= RULE_NAME ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:816:1: (lv_paramName_0_0= RULE_NAME )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:816:1: (lv_paramName_0_0= RULE_NAME )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:817:3: lv_paramName_0_0= RULE_NAME
            {
            lv_paramName_0_0=(Token)match(input,RULE_NAME,FOLLOW_RULE_NAME_in_ruleParam1533); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_paramName_0_0, grammarAccess.getParamAccess().getParamNameNAMETerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleTypeComment"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:841:1: entryRuleTypeComment returns [String current=null] : iv_ruleTypeComment= ruleTypeComment EOF ;
    public final String entryRuleTypeComment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeComment = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:842:2: (iv_ruleTypeComment= ruleTypeComment EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:843:2: iv_ruleTypeComment= ruleTypeComment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeCommentRule()); 
            }
            pushFollow(FOLLOW_ruleTypeComment_in_entryRuleTypeComment1574);
            iv_ruleTypeComment=ruleTypeComment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeComment.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeComment1585); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeComment"


    // $ANTLR start "ruleTypeComment"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:850:1: ruleTypeComment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_COMMENT_0= RULE_COMMENT ;
    public final AntlrDatatypeRuleToken ruleTypeComment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_COMMENT_0=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:853:28: (this_COMMENT_0= RULE_COMMENT )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:854:5: this_COMMENT_0= RULE_COMMENT
            {
            this_COMMENT_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleTypeComment1624); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_COMMENT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COMMENT_0, grammarAccess.getTypeCommentAccess().getCOMMENTTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeComment"


    // $ANTLR start "entryRuleFieldComment"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:869:1: entryRuleFieldComment returns [String current=null] : iv_ruleFieldComment= ruleFieldComment EOF ;
    public final String entryRuleFieldComment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldComment = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:870:2: (iv_ruleFieldComment= ruleFieldComment EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:871:2: iv_ruleFieldComment= ruleFieldComment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldCommentRule()); 
            }
            pushFollow(FOLLOW_ruleFieldComment_in_entryRuleFieldComment1669);
            iv_ruleFieldComment=ruleFieldComment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldComment.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldComment1680); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFieldComment"


    // $ANTLR start "ruleFieldComment"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:878:1: ruleFieldComment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_COMMENT_0= RULE_COMMENT ;
    public final AntlrDatatypeRuleToken ruleFieldComment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_COMMENT_0=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:881:28: (this_COMMENT_0= RULE_COMMENT )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:882:5: this_COMMENT_0= RULE_COMMENT
            {
            this_COMMENT_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleFieldComment1719); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_COMMENT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COMMENT_0, grammarAccess.getFieldCommentAccess().getCOMMENTTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFieldComment"


    // $ANTLR start "entryRuleOtherComent"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:897:1: entryRuleOtherComent returns [EObject current=null] : iv_ruleOtherComent= ruleOtherComent EOF ;
    public final EObject entryRuleOtherComent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherComent = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:898:2: (iv_ruleOtherComent= ruleOtherComent EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:899:2: iv_ruleOtherComent= ruleOtherComent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOtherComentRule()); 
            }
            pushFollow(FOLLOW_ruleOtherComent_in_entryRuleOtherComent1763);
            iv_ruleOtherComent=ruleOtherComent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOtherComent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherComent1773); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOtherComent"


    // $ANTLR start "ruleOtherComent"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:906:1: ruleOtherComent returns [EObject current=null] : ( (lv_comm_0_0= RULE_COMMENT ) ) ;
    public final EObject ruleOtherComent() throws RecognitionException {
        EObject current = null;

        Token lv_comm_0_0=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:909:28: ( ( (lv_comm_0_0= RULE_COMMENT ) ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:910:1: ( (lv_comm_0_0= RULE_COMMENT ) )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:910:1: ( (lv_comm_0_0= RULE_COMMENT ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:911:1: (lv_comm_0_0= RULE_COMMENT )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:911:1: (lv_comm_0_0= RULE_COMMENT )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:912:3: lv_comm_0_0= RULE_COMMENT
            {
            lv_comm_0_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleOtherComent1814); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_comm_0_0, grammarAccess.getOtherComentAccess().getCommCOMMENTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOtherComentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"comm",
                      		lv_comm_0_0, 
                      		"COMMENT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOtherComent"


    // $ANTLR start "entryRulePackName"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:936:1: entryRulePackName returns [String current=null] : iv_rulePackName= rulePackName EOF ;
    public final String entryRulePackName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackName = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:937:2: (iv_rulePackName= rulePackName EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:938:2: iv_rulePackName= rulePackName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackNameRule()); 
            }
            pushFollow(FOLLOW_rulePackName_in_entryRulePackName1855);
            iv_rulePackName=rulePackName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackName1866); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:945:1: rulePackName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TypeName_0= ruleTypeName (kw= '.' this_TypeName_2= ruleTypeName )* ) ;
    public final AntlrDatatypeRuleToken rulePackName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeName_0 = null;

        AntlrDatatypeRuleToken this_TypeName_2 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:948:28: ( (this_TypeName_0= ruleTypeName (kw= '.' this_TypeName_2= ruleTypeName )* ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:949:1: (this_TypeName_0= ruleTypeName (kw= '.' this_TypeName_2= ruleTypeName )* )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:949:1: (this_TypeName_0= ruleTypeName (kw= '.' this_TypeName_2= ruleTypeName )* )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:950:5: this_TypeName_0= ruleTypeName (kw= '.' this_TypeName_2= ruleTypeName )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPackNameAccess().getTypeNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTypeName_in_rulePackName1913);
            this_TypeName_0=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_TypeName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:960:1: (kw= '.' this_TypeName_2= ruleTypeName )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:961:2: kw= '.' this_TypeName_2= ruleTypeName
            	    {
            	    kw=(Token)match(input,32,FOLLOW_32_in_rulePackName1932); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getPackNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getPackNameAccess().getTypeNameParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleTypeName_in_rulePackName1954);
            	    this_TypeName_2=ruleTypeName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_TypeName_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePackName"


    // $ANTLR start "entryRuleTypeName"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:985:1: entryRuleTypeName returns [String current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final String entryRuleTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeName = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:986:2: (iv_ruleTypeName= ruleTypeName EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:987:2: iv_ruleTypeName= ruleTypeName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameRule()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_entryRuleTypeName2002);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeName2013); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:994:1: ruleTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_C_INPUT_0= RULE_C_INPUT | this_C_FILE_1= RULE_C_FILE | this_C_NODE_2= RULE_C_NODE | this_C_TYPE_3= RULE_C_TYPE | this_C_INT_4= RULE_C_INT | this_C_UINT_5= RULE_C_UINT | this_C_BOOL_6= RULE_C_BOOL | this_C_NUMBER_7= RULE_C_NUMBER | this_C_STRING_8= RULE_C_STRING | this_C_LIST_9= RULE_C_LIST | this_C_HASH_10= RULE_C_HASH | this_NAME_11= RULE_NAME ) ;
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
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:997:28: ( (this_C_INPUT_0= RULE_C_INPUT | this_C_FILE_1= RULE_C_FILE | this_C_NODE_2= RULE_C_NODE | this_C_TYPE_3= RULE_C_TYPE | this_C_INT_4= RULE_C_INT | this_C_UINT_5= RULE_C_UINT | this_C_BOOL_6= RULE_C_BOOL | this_C_NUMBER_7= RULE_C_NUMBER | this_C_STRING_8= RULE_C_STRING | this_C_LIST_9= RULE_C_LIST | this_C_HASH_10= RULE_C_HASH | this_NAME_11= RULE_NAME ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:998:1: (this_C_INPUT_0= RULE_C_INPUT | this_C_FILE_1= RULE_C_FILE | this_C_NODE_2= RULE_C_NODE | this_C_TYPE_3= RULE_C_TYPE | this_C_INT_4= RULE_C_INT | this_C_UINT_5= RULE_C_UINT | this_C_BOOL_6= RULE_C_BOOL | this_C_NUMBER_7= RULE_C_NUMBER | this_C_STRING_8= RULE_C_STRING | this_C_LIST_9= RULE_C_LIST | this_C_HASH_10= RULE_C_HASH | this_NAME_11= RULE_NAME )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:998:1: (this_C_INPUT_0= RULE_C_INPUT | this_C_FILE_1= RULE_C_FILE | this_C_NODE_2= RULE_C_NODE | this_C_TYPE_3= RULE_C_TYPE | this_C_INT_4= RULE_C_INT | this_C_UINT_5= RULE_C_UINT | this_C_BOOL_6= RULE_C_BOOL | this_C_NUMBER_7= RULE_C_NUMBER | this_C_STRING_8= RULE_C_STRING | this_C_LIST_9= RULE_C_LIST | this_C_HASH_10= RULE_C_HASH | this_NAME_11= RULE_NAME )
            int alt15=12;
            switch ( input.LA(1) ) {
            case RULE_C_INPUT:
                {
                alt15=1;
                }
                break;
            case RULE_C_FILE:
                {
                alt15=2;
                }
                break;
            case RULE_C_NODE:
                {
                alt15=3;
                }
                break;
            case RULE_C_TYPE:
                {
                alt15=4;
                }
                break;
            case RULE_C_INT:
                {
                alt15=5;
                }
                break;
            case RULE_C_UINT:
                {
                alt15=6;
                }
                break;
            case RULE_C_BOOL:
                {
                alt15=7;
                }
                break;
            case RULE_C_NUMBER:
                {
                alt15=8;
                }
                break;
            case RULE_C_STRING:
                {
                alt15=9;
                }
                break;
            case RULE_C_LIST:
                {
                alt15=10;
                }
                break;
            case RULE_C_HASH:
                {
                alt15=11;
                }
                break;
            case RULE_NAME:
                {
                alt15=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:998:6: this_C_INPUT_0= RULE_C_INPUT
                    {
                    this_C_INPUT_0=(Token)match(input,RULE_C_INPUT,FOLLOW_RULE_C_INPUT_in_ruleTypeName2053); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_INPUT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_INPUT_0, grammarAccess.getTypeNameAccess().getC_INPUTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1006:10: this_C_FILE_1= RULE_C_FILE
                    {
                    this_C_FILE_1=(Token)match(input,RULE_C_FILE,FOLLOW_RULE_C_FILE_in_ruleTypeName2079); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_FILE_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_FILE_1, grammarAccess.getTypeNameAccess().getC_FILETerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1014:10: this_C_NODE_2= RULE_C_NODE
                    {
                    this_C_NODE_2=(Token)match(input,RULE_C_NODE,FOLLOW_RULE_C_NODE_in_ruleTypeName2105); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_NODE_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_NODE_2, grammarAccess.getTypeNameAccess().getC_NODETerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1022:10: this_C_TYPE_3= RULE_C_TYPE
                    {
                    this_C_TYPE_3=(Token)match(input,RULE_C_TYPE,FOLLOW_RULE_C_TYPE_in_ruleTypeName2131); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_TYPE_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_TYPE_3, grammarAccess.getTypeNameAccess().getC_TYPETerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1030:10: this_C_INT_4= RULE_C_INT
                    {
                    this_C_INT_4=(Token)match(input,RULE_C_INT,FOLLOW_RULE_C_INT_in_ruleTypeName2157); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_INT_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_INT_4, grammarAccess.getTypeNameAccess().getC_INTTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1038:10: this_C_UINT_5= RULE_C_UINT
                    {
                    this_C_UINT_5=(Token)match(input,RULE_C_UINT,FOLLOW_RULE_C_UINT_in_ruleTypeName2183); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_UINT_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_UINT_5, grammarAccess.getTypeNameAccess().getC_UINTTerminalRuleCall_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1046:10: this_C_BOOL_6= RULE_C_BOOL
                    {
                    this_C_BOOL_6=(Token)match(input,RULE_C_BOOL,FOLLOW_RULE_C_BOOL_in_ruleTypeName2209); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_BOOL_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_BOOL_6, grammarAccess.getTypeNameAccess().getC_BOOLTerminalRuleCall_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1054:10: this_C_NUMBER_7= RULE_C_NUMBER
                    {
                    this_C_NUMBER_7=(Token)match(input,RULE_C_NUMBER,FOLLOW_RULE_C_NUMBER_in_ruleTypeName2235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_NUMBER_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_NUMBER_7, grammarAccess.getTypeNameAccess().getC_NUMBERTerminalRuleCall_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1062:10: this_C_STRING_8= RULE_C_STRING
                    {
                    this_C_STRING_8=(Token)match(input,RULE_C_STRING,FOLLOW_RULE_C_STRING_in_ruleTypeName2261); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_STRING_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_STRING_8, grammarAccess.getTypeNameAccess().getC_STRINGTerminalRuleCall_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1070:10: this_C_LIST_9= RULE_C_LIST
                    {
                    this_C_LIST_9=(Token)match(input,RULE_C_LIST,FOLLOW_RULE_C_LIST_in_ruleTypeName2287); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_LIST_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_LIST_9, grammarAccess.getTypeNameAccess().getC_LISTTerminalRuleCall_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1078:10: this_C_HASH_10= RULE_C_HASH
                    {
                    this_C_HASH_10=(Token)match(input,RULE_C_HASH,FOLLOW_RULE_C_HASH_in_ruleTypeName2313); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_HASH_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_HASH_10, grammarAccess.getTypeNameAccess().getC_HASHTerminalRuleCall_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1086:10: this_NAME_11= RULE_NAME
                    {
                    this_NAME_11=(Token)match(input,RULE_NAME,FOLLOW_RULE_NAME_in_ruleTypeName2339); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NAME_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NAME_11, grammarAccess.getTypeNameAccess().getNAMETerminalRuleCall_11()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTypeName"

    // $ANTLR start synpred1_InternalCfg
    public final void synpred1_InternalCfg_fragment() throws RecognitionException {   
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:116:4: ( ( ruleType ) )
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:117:1: ( ruleType )
        {
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:117:1: ( ruleType )
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:118:1: ruleType
        {
        pushFollow(FOLLOW_ruleType_in_synpred1_InternalCfg168);
        ruleType();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalCfg

    // $ANTLR start synpred2_InternalCfg
    public final void synpred2_InternalCfg_fragment() throws RecognitionException {   
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:315:3: ( ( ruleField ) )
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:316:1: ( ruleField )
        {
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:316:1: ( ruleField )
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:317:1: ruleField
        {
        pushFollow(FOLLOW_ruleField_in_synpred2_InternalCfg525);
        ruleField();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalCfg

    // Delegated rules

    public final boolean synpred1_InternalCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\20\uffff";
    static final String DFA7_eofS =
        "\20\uffff";
    static final String DFA7_minS =
        "\1\6\1\uffff\1\0\15\uffff";
    static final String DFA7_maxS =
        "\1\35\1\uffff\1\0\15\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\3\1\uffff\14\1\1\2";
    static final String DFA7_specialS =
        "\1\1\1\uffff\1\0\15\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\6\1\uffff\1\1\1\uffff\1\3\1\uffff\1\4\3\uffff\1\5\2\uffff"+
            "\1\14\2\uffff\1\15\1\16\1\2\1\7\1\10\1\11\1\12\1\13",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()* loopback of 315:1: ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_2 = input.LA(1);

                         
                        int index7_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalCfg()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index7_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_0 = input.LA(1);

                         
                        int index7_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA7_0==RULE_C_BRACE_R) ) {s = 1;}

                        else if ( (LA7_0==RULE_COMMENT) ) {s = 2;}

                        else if ( (LA7_0==RULE_C_INPUT) && (synpred2_InternalCfg())) {s = 3;}

                        else if ( (LA7_0==RULE_C_FILE) && (synpred2_InternalCfg())) {s = 4;}

                        else if ( (LA7_0==RULE_C_NODE) && (synpred2_InternalCfg())) {s = 5;}

                        else if ( (LA7_0==RULE_C_TYPE) && (synpred2_InternalCfg())) {s = 6;}

                        else if ( (LA7_0==RULE_C_INT) && (synpred2_InternalCfg())) {s = 7;}

                        else if ( (LA7_0==RULE_C_UINT) && (synpred2_InternalCfg())) {s = 8;}

                        else if ( (LA7_0==RULE_C_BOOL) && (synpred2_InternalCfg())) {s = 9;}

                        else if ( (LA7_0==RULE_C_NUMBER) && (synpred2_InternalCfg())) {s = 10;}

                        else if ( (LA7_0==RULE_C_STRING) && (synpred2_InternalCfg())) {s = 11;}

                        else if ( (LA7_0==RULE_C_LIST) && (synpred2_InternalCfg())) {s = 12;}

                        else if ( (LA7_0==RULE_C_HASH) && (synpred2_InternalCfg())) {s = 13;}

                        else if ( (LA7_0==RULE_NAME) && (synpred2_InternalCfg())) {s = 14;}

                         
                        input.seek(index7_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleXML2_in_entryRuleXML275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXML285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_ruleXML2131 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_rulePackDef_in_ruleXML2153 = new BitSet(new long[]{0x0000000001000252L});
    public static final BitSet FOLLOW_ruleType_in_ruleXML2185 = new BitSet(new long[]{0x0000000001000252L});
    public static final BitSet FOLLOW_ruleOtherComent_in_ruleXML2212 = new BitSet(new long[]{0x0000000001000252L});
    public static final BitSet FOLLOW_rulePackDef_in_entryRulePackDef250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackDef260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PACKAGE_in_rulePackDef302 = new BitSet(new long[]{0x000000003EC91462L});
    public static final BitSet FOLLOW_rulePackName_in_rulePackDef328 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_rulePackDef341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeComment_in_ruleType434 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_ruleInput_in_ruleType456 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_C_TYPE_in_ruleType474 = new BitSet(new long[]{0x000000003EC91440L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleType500 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_C_BRACE_L_in_ruleType511 = new BitSet(new long[]{0x000000003FC91550L});
    public static final BitSet FOLLOW_ruleField_in_ruleType542 = new BitSet(new long[]{0x000000003FC91550L});
    public static final BitSet FOLLOW_ruleOtherComent_in_ruleType569 = new BitSet(new long[]{0x000000003FC91550L});
    public static final BitSet FOLLOW_RULE_C_BRACE_R_in_ruleType582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_L_in_ruleInput663 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_C_INPUT_in_ruleInput679 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_ruleInput695 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_C_FILE_in_ruleInput705 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_ruleInput715 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInput731 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_RULE_C_COMMA_in_ruleInput748 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_C_NODE_in_ruleInput758 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_ruleInput768 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInput784 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_ruleInput802 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_R_in_ruleInput812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldComment_in_ruleField903 = new BitSet(new long[]{0x000000003FC91440L});
    public static final BitSet FOLLOW_ruleNativeType_in_ruleField927 = new BitSet(new long[]{0x000000003EC91440L});
    public static final BitSet FOLLOW_ruleListType_in_ruleField946 = new BitSet(new long[]{0x000000003EC91440L});
    public static final BitSet FOLLOW_ruleHashType_in_ruleField965 = new BitSet(new long[]{0x000000003EC91440L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleField989 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_ruleField1000 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleField1016 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_ruleField1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeType_in_entryRuleNativeType1070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeType1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleNativeType1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListType_in_entryRuleListType1160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListType1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_LIST_in_ruleListType1206 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_C_ANGLE_L_in_ruleListType1216 = new BitSet(new long[]{0x000000003EC91440L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleListType1236 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_C_ANGLE_R_in_ruleListType1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashType_in_entryRuleHashType1282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHashType1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_HASH_in_ruleHashType1328 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_C_ANGLE_L_in_ruleHashType1338 = new BitSet(new long[]{0x000000003EC91440L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleHashType1358 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_C_ANGLE_R_in_ruleHashType1369 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_ruleHashType1380 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleParam_in_ruleHashType1400 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_RULE_C_COMMA_in_ruleHashType1412 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleParam_in_ruleHashType1432 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_ruleHashType1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam1482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_ruleParam1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeComment_in_entryRuleTypeComment1574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeComment1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleTypeComment1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldComment_in_entryRuleFieldComment1669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldComment1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleFieldComment1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_entryRuleOtherComent1763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherComent1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleOtherComent1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackName_in_entryRulePackName1855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackName1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rulePackName1913 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_rulePackName1932 = new BitSet(new long[]{0x000000003EC91440L});
    public static final BitSet FOLLOW_ruleTypeName_in_rulePackName1954 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_entryRuleTypeName2002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeName2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INPUT_in_ruleTypeName2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_FILE_in_ruleTypeName2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_NODE_in_ruleTypeName2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_TYPE_in_ruleTypeName2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INT_in_ruleTypeName2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_UINT_in_ruleTypeName2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BOOL_in_ruleTypeName2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_NUMBER_in_ruleTypeName2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_STRING_in_ruleTypeName2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_LIST_in_ruleTypeName2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_HASH_in_ruleTypeName2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_ruleTypeName2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_synpred1_InternalCfg168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_synpred2_InternalCfg525 = new BitSet(new long[]{0x0000000000000002L});

}