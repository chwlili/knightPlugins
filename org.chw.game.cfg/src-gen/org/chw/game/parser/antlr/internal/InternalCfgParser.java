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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_C_INPUT", "RULE_STRING", "RULE_C_SEMICOLON", "RULE_C_PACKAGE", "RULE_C_TYPE", "RULE_C_BRACE_L", "RULE_C_BRACE_R", "RULE_C_BRACKET_L", "RULE_C_MAIN", "RULE_C_PAREN_L", "RULE_C_PAREN_R", "RULE_C_BRACKET_R", "RULE_C_EQUALS", "RULE_C_LIST", "RULE_C_COMMA", "RULE_C_SLICE", "RULE_COMMENT", "RULE_C_INT", "RULE_C_UINT", "RULE_C_BOOL", "RULE_C_NUMBER", "RULE_C_STRING", "RULE_NAME", "RULE_C_ANGLE_L", "RULE_C_ANGLE_R", "RULE_COMMENT_END", "RULE_WS", "'.'"
    };
    public static final int RULE_C_NUMBER=24;
    public static final int RULE_C_COMMA=18;
    public static final int RULE_C_TYPE=8;
    public static final int RULE_C_PAREN_R=14;
    public static final int RULE_C_SEMICOLON=6;
    public static final int RULE_C_PAREN_L=13;
    public static final int RULE_C_INPUT=4;
    public static final int RULE_C_STRING=25;
    public static final int RULE_C_SLICE=19;
    public static final int RULE_COMMENT=20;
    public static final int RULE_C_PACKAGE=7;
    public static final int EOF=-1;
    public static final int RULE_C_ANGLE_L=27;
    public static final int RULE_C_ANGLE_R=28;
    public static final int RULE_COMMENT_END=29;
    public static final int RULE_C_BRACKET_L=11;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int RULE_C_EQUALS=16;
    public static final int RULE_C_UINT=22;
    public static final int RULE_C_BRACKET_R=15;
    public static final int RULE_C_MAIN=12;
    public static final int RULE_C_INT=21;
    public static final int RULE_NAME=26;
    public static final int RULE_WS=30;
    public static final int RULE_C_BOOL=23;
    public static final int RULE_C_BRACE_L=9;
    public static final int RULE_C_LIST=17;
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:76:1: ruleXML2 returns [EObject current=null] : ( ( ( ( (lv_input_0_0= ruleInputDef ) ) ( (lv_pack_1_0= rulePackDef ) ) ) | ( ( (lv_pack_2_0= rulePackDef ) ) ( (lv_input_3_0= ruleInputDef ) ) ) | ( (lv_pack_4_0= rulePackDef ) ) | ( (lv_input_5_0= ruleInputDef ) ) ) ( ( ( ( ruleType ) )=> (lv_types_6_0= ruleType ) ) | ( (lv_comm_7_0= ruleOtherComent ) ) )* ) ;
    public final EObject ruleXML2() throws RecognitionException {
        EObject current = null;

        EObject lv_input_0_0 = null;

        EObject lv_pack_1_0 = null;

        EObject lv_pack_2_0 = null;

        EObject lv_input_3_0 = null;

        EObject lv_pack_4_0 = null;

        EObject lv_input_5_0 = null;

        EObject lv_types_6_0 = null;

        EObject lv_comm_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:79:28: ( ( ( ( ( (lv_input_0_0= ruleInputDef ) ) ( (lv_pack_1_0= rulePackDef ) ) ) | ( ( (lv_pack_2_0= rulePackDef ) ) ( (lv_input_3_0= ruleInputDef ) ) ) | ( (lv_pack_4_0= rulePackDef ) ) | ( (lv_input_5_0= ruleInputDef ) ) ) ( ( ( ( ruleType ) )=> (lv_types_6_0= ruleType ) ) | ( (lv_comm_7_0= ruleOtherComent ) ) )* ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:1: ( ( ( ( (lv_input_0_0= ruleInputDef ) ) ( (lv_pack_1_0= rulePackDef ) ) ) | ( ( (lv_pack_2_0= rulePackDef ) ) ( (lv_input_3_0= ruleInputDef ) ) ) | ( (lv_pack_4_0= rulePackDef ) ) | ( (lv_input_5_0= ruleInputDef ) ) ) ( ( ( ( ruleType ) )=> (lv_types_6_0= ruleType ) ) | ( (lv_comm_7_0= ruleOtherComent ) ) )* )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:1: ( ( ( ( (lv_input_0_0= ruleInputDef ) ) ( (lv_pack_1_0= rulePackDef ) ) ) | ( ( (lv_pack_2_0= rulePackDef ) ) ( (lv_input_3_0= ruleInputDef ) ) ) | ( (lv_pack_4_0= rulePackDef ) ) | ( (lv_input_5_0= ruleInputDef ) ) ) ( ( ( ( ruleType ) )=> (lv_types_6_0= ruleType ) ) | ( (lv_comm_7_0= ruleOtherComent ) ) )* )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:2: ( ( ( (lv_input_0_0= ruleInputDef ) ) ( (lv_pack_1_0= rulePackDef ) ) ) | ( ( (lv_pack_2_0= rulePackDef ) ) ( (lv_input_3_0= ruleInputDef ) ) ) | ( (lv_pack_4_0= rulePackDef ) ) | ( (lv_input_5_0= ruleInputDef ) ) ) ( ( ( ( ruleType ) )=> (lv_types_6_0= ruleType ) ) | ( (lv_comm_7_0= ruleOtherComent ) ) )*
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:2: ( ( ( (lv_input_0_0= ruleInputDef ) ) ( (lv_pack_1_0= rulePackDef ) ) ) | ( ( (lv_pack_2_0= rulePackDef ) ) ( (lv_input_3_0= ruleInputDef ) ) ) | ( (lv_pack_4_0= rulePackDef ) ) | ( (lv_input_5_0= ruleInputDef ) ) )
            int alt1=4;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:3: ( ( (lv_input_0_0= ruleInputDef ) ) ( (lv_pack_1_0= rulePackDef ) ) )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:3: ( ( (lv_input_0_0= ruleInputDef ) ) ( (lv_pack_1_0= rulePackDef ) ) )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:4: ( (lv_input_0_0= ruleInputDef ) ) ( (lv_pack_1_0= rulePackDef ) )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:4: ( (lv_input_0_0= ruleInputDef ) )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:81:1: (lv_input_0_0= ruleInputDef )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:81:1: (lv_input_0_0= ruleInputDef )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:82:3: lv_input_0_0= ruleInputDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXML2Access().getInputInputDefParserRuleCall_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInputDef_in_ruleXML2133);
                    lv_input_0_0=ruleInputDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXML2Rule());
                      	        }
                             		set(
                             			current, 
                             			"input",
                              		lv_input_0_0, 
                              		"InputDef");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:98:2: ( (lv_pack_1_0= rulePackDef ) )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:99:1: (lv_pack_1_0= rulePackDef )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:99:1: (lv_pack_1_0= rulePackDef )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:100:3: lv_pack_1_0= rulePackDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXML2Access().getPackPackDefParserRuleCall_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackDef_in_ruleXML2154);
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


                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:117:6: ( ( (lv_pack_2_0= rulePackDef ) ) ( (lv_input_3_0= ruleInputDef ) ) )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:117:6: ( ( (lv_pack_2_0= rulePackDef ) ) ( (lv_input_3_0= ruleInputDef ) ) )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:117:7: ( (lv_pack_2_0= rulePackDef ) ) ( (lv_input_3_0= ruleInputDef ) )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:117:7: ( (lv_pack_2_0= rulePackDef ) )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:118:1: (lv_pack_2_0= rulePackDef )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:118:1: (lv_pack_2_0= rulePackDef )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:119:3: lv_pack_2_0= rulePackDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXML2Access().getPackPackDefParserRuleCall_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackDef_in_ruleXML2183);
                    lv_pack_2_0=rulePackDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXML2Rule());
                      	        }
                             		set(
                             			current, 
                             			"pack",
                              		lv_pack_2_0, 
                              		"PackDef");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:135:2: ( (lv_input_3_0= ruleInputDef ) )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:136:1: (lv_input_3_0= ruleInputDef )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:136:1: (lv_input_3_0= ruleInputDef )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:137:3: lv_input_3_0= ruleInputDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXML2Access().getInputInputDefParserRuleCall_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInputDef_in_ruleXML2204);
                    lv_input_3_0=ruleInputDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXML2Rule());
                      	        }
                             		set(
                             			current, 
                             			"input",
                              		lv_input_3_0, 
                              		"InputDef");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:154:6: ( (lv_pack_4_0= rulePackDef ) )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:154:6: ( (lv_pack_4_0= rulePackDef ) )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:155:1: (lv_pack_4_0= rulePackDef )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:155:1: (lv_pack_4_0= rulePackDef )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:156:3: lv_pack_4_0= rulePackDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXML2Access().getPackPackDefParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackDef_in_ruleXML2232);
                    lv_pack_4_0=rulePackDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXML2Rule());
                      	        }
                             		set(
                             			current, 
                             			"pack",
                              		lv_pack_4_0, 
                              		"PackDef");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:173:6: ( (lv_input_5_0= ruleInputDef ) )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:173:6: ( (lv_input_5_0= ruleInputDef ) )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:174:1: (lv_input_5_0= ruleInputDef )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:174:1: (lv_input_5_0= ruleInputDef )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:175:3: lv_input_5_0= ruleInputDef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXML2Access().getInputInputDefParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInputDef_in_ruleXML2259);
                    lv_input_5_0=ruleInputDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXML2Rule());
                      	        }
                             		set(
                             			current, 
                             			"input",
                              		lv_input_5_0, 
                              		"InputDef");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:191:3: ( ( ( ( ruleType ) )=> (lv_types_6_0= ruleType ) ) | ( (lv_comm_7_0= ruleOtherComent ) ) )*
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
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:191:4: ( ( ( ruleType ) )=> (lv_types_6_0= ruleType ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:191:4: ( ( ( ruleType ) )=> (lv_types_6_0= ruleType ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:191:5: ( ( ruleType ) )=> (lv_types_6_0= ruleType )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:196:1: (lv_types_6_0= ruleType )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:197:3: lv_types_6_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXML2Access().getTypesTypeParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleType_in_ruleXML2292);
            	    lv_types_6_0=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXML2Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"types",
            	              		lv_types_6_0, 
            	              		"Type");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:214:6: ( (lv_comm_7_0= ruleOtherComent ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:214:6: ( (lv_comm_7_0= ruleOtherComent ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:215:1: (lv_comm_7_0= ruleOtherComent )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:215:1: (lv_comm_7_0= ruleOtherComent )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:216:3: lv_comm_7_0= ruleOtherComent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXML2Access().getCommOtherComentParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOtherComent_in_ruleXML2319);
            	    lv_comm_7_0=ruleOtherComent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXML2Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"comm",
            	              		lv_comm_7_0, 
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


    // $ANTLR start "entryRuleInputDef"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:240:1: entryRuleInputDef returns [EObject current=null] : iv_ruleInputDef= ruleInputDef EOF ;
    public final EObject entryRuleInputDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputDef = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:241:2: (iv_ruleInputDef= ruleInputDef EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:242:2: iv_ruleInputDef= ruleInputDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputDefRule()); 
            }
            pushFollow(FOLLOW_ruleInputDef_in_entryRuleInputDef357);
            iv_ruleInputDef=ruleInputDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInputDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputDef367); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInputDef"


    // $ANTLR start "ruleInputDef"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:249:1: ruleInputDef returns [EObject current=null] : ( ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_inputCHAR_1_0= RULE_C_INPUT ) ) ( (lv_url_2_0= RULE_STRING ) ) (this_C_SEMICOLON_3= RULE_C_SEMICOLON )? ) ;
    public final EObject ruleInputDef() throws RecognitionException {
        EObject current = null;

        Token lv_inputCHAR_1_0=null;
        Token lv_url_2_0=null;
        Token this_C_SEMICOLON_3=null;
        EObject lv_comment_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:252:28: ( ( ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_inputCHAR_1_0= RULE_C_INPUT ) ) ( (lv_url_2_0= RULE_STRING ) ) (this_C_SEMICOLON_3= RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:253:1: ( ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_inputCHAR_1_0= RULE_C_INPUT ) ) ( (lv_url_2_0= RULE_STRING ) ) (this_C_SEMICOLON_3= RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:253:1: ( ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_inputCHAR_1_0= RULE_C_INPUT ) ) ( (lv_url_2_0= RULE_STRING ) ) (this_C_SEMICOLON_3= RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:253:2: ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_inputCHAR_1_0= RULE_C_INPUT ) ) ( (lv_url_2_0= RULE_STRING ) ) (this_C_SEMICOLON_3= RULE_C_SEMICOLON )?
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:253:2: ( (lv_comment_0_0= ruleOtherComent ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_COMMENT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:254:1: (lv_comment_0_0= ruleOtherComent )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:254:1: (lv_comment_0_0= ruleOtherComent )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:255:3: lv_comment_0_0= ruleOtherComent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInputDefAccess().getCommentOtherComentParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOtherComent_in_ruleInputDef413);
            	    lv_comment_0_0=ruleOtherComent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInputDefRule());
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
            	    break loop3;
                }
            } while (true);

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:271:3: ( (lv_inputCHAR_1_0= RULE_C_INPUT ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:272:1: (lv_inputCHAR_1_0= RULE_C_INPUT )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:272:1: (lv_inputCHAR_1_0= RULE_C_INPUT )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:273:3: lv_inputCHAR_1_0= RULE_C_INPUT
            {
            lv_inputCHAR_1_0=(Token)match(input,RULE_C_INPUT,FOLLOW_RULE_C_INPUT_in_ruleInputDef431); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_inputCHAR_1_0, grammarAccess.getInputDefAccess().getInputCHARC_INPUTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInputDefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"inputCHAR",
                      		lv_inputCHAR_1_0, 
                      		"C_INPUT");
              	    
            }

            }


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:289:2: ( (lv_url_2_0= RULE_STRING ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:290:1: (lv_url_2_0= RULE_STRING )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:290:1: (lv_url_2_0= RULE_STRING )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:291:3: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInputDef453); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_url_2_0, grammarAccess.getInputDefAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInputDefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"url",
                      		lv_url_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:307:2: (this_C_SEMICOLON_3= RULE_C_SEMICOLON )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_C_SEMICOLON) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:307:3: this_C_SEMICOLON_3= RULE_C_SEMICOLON
                    {
                    this_C_SEMICOLON_3=(Token)match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_ruleInputDef470); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_SEMICOLON_3, grammarAccess.getInputDefAccess().getC_SEMICOLONTerminalRuleCall_3()); 
                          
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
    // $ANTLR end "ruleInputDef"


    // $ANTLR start "entryRulePackDef"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:319:1: entryRulePackDef returns [EObject current=null] : iv_rulePackDef= rulePackDef EOF ;
    public final EObject entryRulePackDef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackDef = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:320:2: (iv_rulePackDef= rulePackDef EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:321:2: iv_rulePackDef= rulePackDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackDefRule()); 
            }
            pushFollow(FOLLOW_rulePackDef_in_entryRulePackDef507);
            iv_rulePackDef=rulePackDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackDef517); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:328:1: rulePackDef returns [EObject current=null] : ( ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_packCHAR_1_0= RULE_C_PACKAGE ) ) ( (lv_pack_2_0= rulePackName ) )? (this_C_SEMICOLON_3= RULE_C_SEMICOLON )? ) ;
    public final EObject rulePackDef() throws RecognitionException {
        EObject current = null;

        Token lv_packCHAR_1_0=null;
        Token this_C_SEMICOLON_3=null;
        EObject lv_comment_0_0 = null;

        AntlrDatatypeRuleToken lv_pack_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:331:28: ( ( ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_packCHAR_1_0= RULE_C_PACKAGE ) ) ( (lv_pack_2_0= rulePackName ) )? (this_C_SEMICOLON_3= RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:332:1: ( ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_packCHAR_1_0= RULE_C_PACKAGE ) ) ( (lv_pack_2_0= rulePackName ) )? (this_C_SEMICOLON_3= RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:332:1: ( ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_packCHAR_1_0= RULE_C_PACKAGE ) ) ( (lv_pack_2_0= rulePackName ) )? (this_C_SEMICOLON_3= RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:332:2: ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_packCHAR_1_0= RULE_C_PACKAGE ) ) ( (lv_pack_2_0= rulePackName ) )? (this_C_SEMICOLON_3= RULE_C_SEMICOLON )?
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:332:2: ( (lv_comment_0_0= ruleOtherComent ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMMENT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:333:1: (lv_comment_0_0= ruleOtherComent )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:333:1: (lv_comment_0_0= ruleOtherComent )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:334:3: lv_comment_0_0= ruleOtherComent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackDefAccess().getCommentOtherComentParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOtherComent_in_rulePackDef563);
            	    lv_comment_0_0=ruleOtherComent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackDefRule());
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
            	    break loop5;
                }
            } while (true);

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:350:3: ( (lv_packCHAR_1_0= RULE_C_PACKAGE ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:351:1: (lv_packCHAR_1_0= RULE_C_PACKAGE )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:351:1: (lv_packCHAR_1_0= RULE_C_PACKAGE )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:352:3: lv_packCHAR_1_0= RULE_C_PACKAGE
            {
            lv_packCHAR_1_0=(Token)match(input,RULE_C_PACKAGE,FOLLOW_RULE_C_PACKAGE_in_rulePackDef581); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_packCHAR_1_0, grammarAccess.getPackDefAccess().getPackCHARC_PACKAGETerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPackDefRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"packCHAR",
                      		lv_packCHAR_1_0, 
                      		"C_PACKAGE");
              	    
            }

            }


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:368:2: ( (lv_pack_2_0= rulePackName ) )?
            int alt6=2;
            switch ( input.LA(1) ) {
                case RULE_C_INPUT:
                    {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==EOF||LA6_1==RULE_C_INPUT||LA6_1==RULE_C_SEMICOLON||LA6_1==RULE_C_TYPE||LA6_1==RULE_C_BRACKET_L||LA6_1==RULE_COMMENT||LA6_1==31) ) {
                        alt6=1;
                    }
                    }
                    break;
                case RULE_C_MAIN:
                case RULE_C_LIST:
                case RULE_C_SLICE:
                case RULE_C_INT:
                case RULE_C_UINT:
                case RULE_C_BOOL:
                case RULE_C_NUMBER:
                case RULE_C_STRING:
                case RULE_NAME:
                    {
                    alt6=1;
                    }
                    break;
                case RULE_C_TYPE:
                    {
                    switch ( input.LA(2) ) {
                        case EOF:
                        case RULE_C_SEMICOLON:
                        case RULE_C_BRACKET_L:
                        case RULE_COMMENT:
                        case 31:
                            {
                            alt6=1;
                            }
                            break;
                        case RULE_C_TYPE:
                            {
                            int LA6_5 = input.LA(3);

                            if ( (LA6_5==RULE_C_INPUT||LA6_5==RULE_C_TYPE||LA6_5==RULE_C_MAIN||LA6_5==RULE_C_LIST||LA6_5==RULE_C_SLICE||(LA6_5>=RULE_C_INT && LA6_5<=RULE_NAME)) ) {
                                alt6=1;
                            }
                            }
                            break;
                        case RULE_C_INPUT:
                            {
                            int LA6_6 = input.LA(3);

                            if ( (LA6_6==RULE_STRING) ) {
                                alt6=1;
                            }
                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt6) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:369:1: (lv_pack_2_0= rulePackName )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:369:1: (lv_pack_2_0= rulePackName )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:370:3: lv_pack_2_0= rulePackName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPackDefAccess().getPackPackNameParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackName_in_rulePackDef607);
                    lv_pack_2_0=rulePackName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPackDefRule());
                      	        }
                             		set(
                             			current, 
                             			"pack",
                              		lv_pack_2_0, 
                              		"PackName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:386:3: (this_C_SEMICOLON_3= RULE_C_SEMICOLON )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_C_SEMICOLON) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:386:4: this_C_SEMICOLON_3= RULE_C_SEMICOLON
                    {
                    this_C_SEMICOLON_3=(Token)match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_rulePackDef620); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_SEMICOLON_3, grammarAccess.getPackDefAccess().getC_SEMICOLONTerminalRuleCall_3()); 
                          
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:398:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:399:2: (iv_ruleType= ruleType EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:400:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType657);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType667); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:407:1: ruleType returns [EObject current=null] : ( ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_enter_1_0= ruleEnter ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= ruleTypeName ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_2_0=null;
        Token this_C_BRACE_L_4=null;
        Token this_C_BRACE_R_7=null;
        AntlrDatatypeRuleToken lv_comment_0_0 = null;

        EObject lv_enter_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_fields_5_0 = null;

        EObject lv_comm_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:410:28: ( ( ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_enter_1_0= ruleEnter ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= ruleTypeName ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:411:1: ( ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_enter_1_0= ruleEnter ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= ruleTypeName ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:411:1: ( ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_enter_1_0= ruleEnter ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= ruleTypeName ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:411:2: ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_enter_1_0= ruleEnter ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= ruleTypeName ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:411:2: ( (lv_comment_0_0= ruleTypeComment ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_COMMENT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:412:1: (lv_comment_0_0= ruleTypeComment )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:412:1: (lv_comment_0_0= ruleTypeComment )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:413:3: lv_comment_0_0= ruleTypeComment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getCommentTypeCommentParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeComment_in_ruleType713);
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:429:3: ( (lv_enter_1_0= ruleEnter ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_C_BRACKET_L) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:430:1: (lv_enter_1_0= ruleEnter )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:430:1: (lv_enter_1_0= ruleEnter )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:431:3: lv_enter_1_0= ruleEnter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getEnterEnterParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEnter_in_ruleType735);
                    lv_enter_1_0=ruleEnter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"enter",
                              		lv_enter_1_0, 
                              		"Enter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:447:3: ( (lv_prefix_2_0= RULE_C_TYPE ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:448:1: (lv_prefix_2_0= RULE_C_TYPE )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:448:1: (lv_prefix_2_0= RULE_C_TYPE )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:449:3: lv_prefix_2_0= RULE_C_TYPE
            {
            lv_prefix_2_0=(Token)match(input,RULE_C_TYPE,FOLLOW_RULE_C_TYPE_in_ruleType753); if (state.failed) return current;
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:465:2: ( (lv_name_3_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:466:1: (lv_name_3_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:466:1: (lv_name_3_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:467:3: lv_name_3_0= ruleTypeName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAccess().getNameTypeNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeName_in_ruleType779);
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

            this_C_BRACE_L_4=(Token)match(input,RULE_C_BRACE_L,FOLLOW_RULE_C_BRACE_L_in_ruleType790); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_BRACE_L_4, grammarAccess.getTypeAccess().getC_BRACE_LTerminalRuleCall_4()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:487:1: ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )*
            loop10:
            do {
                int alt10=3;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:487:2: ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:487:2: ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:487:3: ( ( ruleField ) )=> (lv_fields_5_0= ruleField )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:492:1: (lv_fields_5_0= ruleField )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:493:3: lv_fields_5_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypeAccess().getFieldsFieldParserRuleCall_5_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleField_in_ruleType821);
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
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:510:6: ( (lv_comm_6_0= ruleOtherComent ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:510:6: ( (lv_comm_6_0= ruleOtherComent ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:511:1: (lv_comm_6_0= ruleOtherComent )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:511:1: (lv_comm_6_0= ruleOtherComent )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:512:3: lv_comm_6_0= ruleOtherComent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypeAccess().getCommOtherComentParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOtherComent_in_ruleType848);
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
            	    break loop10;
                }
            } while (true);

            this_C_BRACE_R_7=(Token)match(input,RULE_C_BRACE_R,FOLLOW_RULE_C_BRACE_R_in_ruleType861); if (state.failed) return current;
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


    // $ANTLR start "entryRuleEnter"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:540:1: entryRuleEnter returns [EObject current=null] : iv_ruleEnter= ruleEnter EOF ;
    public final EObject entryRuleEnter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnter = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:541:2: (iv_ruleEnter= ruleEnter EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:542:2: iv_ruleEnter= ruleEnter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnterRule()); 
            }
            pushFollow(FOLLOW_ruleEnter_in_entryRuleEnter896);
            iv_ruleEnter=ruleEnter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnter906); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnter"


    // $ANTLR start "ruleEnter"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:549:1: ruleEnter returns [EObject current=null] : (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_MAIN ) ) this_C_PAREN_L_2= RULE_C_PAREN_L ( (lv_rootPath_3_0= RULE_STRING ) ) this_C_PAREN_R_4= RULE_C_PAREN_R this_C_BRACKET_R_5= RULE_C_BRACKET_R ) ;
    public final EObject ruleEnter() throws RecognitionException {
        EObject current = null;

        Token this_C_BRACKET_L_0=null;
        Token lv_prefix_1_0=null;
        Token this_C_PAREN_L_2=null;
        Token lv_rootPath_3_0=null;
        Token this_C_PAREN_R_4=null;
        Token this_C_BRACKET_R_5=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:552:28: ( (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_MAIN ) ) this_C_PAREN_L_2= RULE_C_PAREN_L ( (lv_rootPath_3_0= RULE_STRING ) ) this_C_PAREN_R_4= RULE_C_PAREN_R this_C_BRACKET_R_5= RULE_C_BRACKET_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:553:1: (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_MAIN ) ) this_C_PAREN_L_2= RULE_C_PAREN_L ( (lv_rootPath_3_0= RULE_STRING ) ) this_C_PAREN_R_4= RULE_C_PAREN_R this_C_BRACKET_R_5= RULE_C_BRACKET_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:553:1: (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_MAIN ) ) this_C_PAREN_L_2= RULE_C_PAREN_L ( (lv_rootPath_3_0= RULE_STRING ) ) this_C_PAREN_R_4= RULE_C_PAREN_R this_C_BRACKET_R_5= RULE_C_BRACKET_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:553:2: this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_MAIN ) ) this_C_PAREN_L_2= RULE_C_PAREN_L ( (lv_rootPath_3_0= RULE_STRING ) ) this_C_PAREN_R_4= RULE_C_PAREN_R this_C_BRACKET_R_5= RULE_C_BRACKET_R
            {
            this_C_BRACKET_L_0=(Token)match(input,RULE_C_BRACKET_L,FOLLOW_RULE_C_BRACKET_L_in_ruleEnter942); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_BRACKET_L_0, grammarAccess.getEnterAccess().getC_BRACKET_LTerminalRuleCall_0()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:557:1: ( (lv_prefix_1_0= RULE_C_MAIN ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:558:1: (lv_prefix_1_0= RULE_C_MAIN )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:558:1: (lv_prefix_1_0= RULE_C_MAIN )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:559:3: lv_prefix_1_0= RULE_C_MAIN
            {
            lv_prefix_1_0=(Token)match(input,RULE_C_MAIN,FOLLOW_RULE_C_MAIN_in_ruleEnter958); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_prefix_1_0, grammarAccess.getEnterAccess().getPrefixC_MAINTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"prefix",
                      		lv_prefix_1_0, 
                      		"C_MAIN");
              	    
            }

            }


            }

            this_C_PAREN_L_2=(Token)match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_ruleEnter974); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_PAREN_L_2, grammarAccess.getEnterAccess().getC_PAREN_LTerminalRuleCall_2()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:579:1: ( (lv_rootPath_3_0= RULE_STRING ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:580:1: (lv_rootPath_3_0= RULE_STRING )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:580:1: (lv_rootPath_3_0= RULE_STRING )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:581:3: lv_rootPath_3_0= RULE_STRING
            {
            lv_rootPath_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnter990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_rootPath_3_0, grammarAccess.getEnterAccess().getRootPathSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"rootPath",
                      		lv_rootPath_3_0, 
                      		"STRING");
              	    
            }

            }


            }

            this_C_PAREN_R_4=(Token)match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_ruleEnter1006); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_PAREN_R_4, grammarAccess.getEnterAccess().getC_PAREN_RTerminalRuleCall_4()); 
                  
            }
            this_C_BRACKET_R_5=(Token)match(input,RULE_C_BRACKET_R,FOLLOW_RULE_C_BRACKET_R_in_ruleEnter1016); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_BRACKET_R_5, grammarAccess.getEnterAccess().getC_BRACKET_RTerminalRuleCall_5()); 
                  
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
    // $ANTLR end "ruleEnter"


    // $ANTLR start "entryRuleField"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:613:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:614:2: (iv_ruleField= ruleField EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:615:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField1051);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1061); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:622:1: ruleField returns [EObject current=null] : ( ( (lv_comment_0_0= ruleFieldComment ) )? ( ( (lv_meta_1_0= ruleListMeta ) ) | ( (lv_meta_2_0= ruleSliceMeta ) ) )* ( (lv_type_3_0= ruleFieldType ) ) ( (lv_fieldName_4_0= ruleTypeName ) ) this_C_EQUALS_5= RULE_C_EQUALS ( (lv_nodePath_6_0= RULE_STRING ) ) (this_C_SEMICOLON_7= RULE_C_SEMICOLON )? ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token this_C_EQUALS_5=null;
        Token lv_nodePath_6_0=null;
        Token this_C_SEMICOLON_7=null;
        AntlrDatatypeRuleToken lv_comment_0_0 = null;

        EObject lv_meta_1_0 = null;

        EObject lv_meta_2_0 = null;

        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_fieldName_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:625:28: ( ( ( (lv_comment_0_0= ruleFieldComment ) )? ( ( (lv_meta_1_0= ruleListMeta ) ) | ( (lv_meta_2_0= ruleSliceMeta ) ) )* ( (lv_type_3_0= ruleFieldType ) ) ( (lv_fieldName_4_0= ruleTypeName ) ) this_C_EQUALS_5= RULE_C_EQUALS ( (lv_nodePath_6_0= RULE_STRING ) ) (this_C_SEMICOLON_7= RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:626:1: ( ( (lv_comment_0_0= ruleFieldComment ) )? ( ( (lv_meta_1_0= ruleListMeta ) ) | ( (lv_meta_2_0= ruleSliceMeta ) ) )* ( (lv_type_3_0= ruleFieldType ) ) ( (lv_fieldName_4_0= ruleTypeName ) ) this_C_EQUALS_5= RULE_C_EQUALS ( (lv_nodePath_6_0= RULE_STRING ) ) (this_C_SEMICOLON_7= RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:626:1: ( ( (lv_comment_0_0= ruleFieldComment ) )? ( ( (lv_meta_1_0= ruleListMeta ) ) | ( (lv_meta_2_0= ruleSliceMeta ) ) )* ( (lv_type_3_0= ruleFieldType ) ) ( (lv_fieldName_4_0= ruleTypeName ) ) this_C_EQUALS_5= RULE_C_EQUALS ( (lv_nodePath_6_0= RULE_STRING ) ) (this_C_SEMICOLON_7= RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:626:2: ( (lv_comment_0_0= ruleFieldComment ) )? ( ( (lv_meta_1_0= ruleListMeta ) ) | ( (lv_meta_2_0= ruleSliceMeta ) ) )* ( (lv_type_3_0= ruleFieldType ) ) ( (lv_fieldName_4_0= ruleTypeName ) ) this_C_EQUALS_5= RULE_C_EQUALS ( (lv_nodePath_6_0= RULE_STRING ) ) (this_C_SEMICOLON_7= RULE_C_SEMICOLON )?
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:626:2: ( (lv_comment_0_0= ruleFieldComment ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_COMMENT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:627:1: (lv_comment_0_0= ruleFieldComment )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:627:1: (lv_comment_0_0= ruleFieldComment )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:628:3: lv_comment_0_0= ruleFieldComment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldAccess().getCommentFieldCommentParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFieldComment_in_ruleField1107);
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:644:3: ( ( (lv_meta_1_0= ruleListMeta ) ) | ( (lv_meta_2_0= ruleSliceMeta ) ) )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_C_BRACKET_L) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==RULE_C_LIST) ) {
                        alt12=1;
                    }
                    else if ( (LA12_2==RULE_C_SLICE) ) {
                        alt12=2;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:644:4: ( (lv_meta_1_0= ruleListMeta ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:644:4: ( (lv_meta_1_0= ruleListMeta ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:645:1: (lv_meta_1_0= ruleListMeta )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:645:1: (lv_meta_1_0= ruleListMeta )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:646:3: lv_meta_1_0= ruleListMeta
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFieldAccess().getMetaListMetaParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleListMeta_in_ruleField1130);
            	    lv_meta_1_0=ruleListMeta();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFieldRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"meta",
            	              		lv_meta_1_0, 
            	              		"ListMeta");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:663:6: ( (lv_meta_2_0= ruleSliceMeta ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:663:6: ( (lv_meta_2_0= ruleSliceMeta ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:664:1: (lv_meta_2_0= ruleSliceMeta )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:664:1: (lv_meta_2_0= ruleSliceMeta )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:665:3: lv_meta_2_0= ruleSliceMeta
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFieldAccess().getMetaSliceMetaParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSliceMeta_in_ruleField1157);
            	    lv_meta_2_0=ruleSliceMeta();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFieldRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"meta",
            	              		lv_meta_2_0, 
            	              		"SliceMeta");
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:681:4: ( (lv_type_3_0= ruleFieldType ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:682:1: (lv_type_3_0= ruleFieldType )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:682:1: (lv_type_3_0= ruleFieldType )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:683:3: lv_type_3_0= ruleFieldType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFieldType_in_ruleField1180);
            lv_type_3_0=ruleFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFieldRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"FieldType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:699:2: ( (lv_fieldName_4_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:700:1: (lv_fieldName_4_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:700:1: (lv_fieldName_4_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:701:3: lv_fieldName_4_0= ruleTypeName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldAccess().getFieldNameTypeNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeName_in_ruleField1201);
            lv_fieldName_4_0=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFieldRule());
              	        }
                     		set(
                     			current, 
                     			"fieldName",
                      		lv_fieldName_4_0, 
                      		"TypeName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_C_EQUALS_5=(Token)match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_ruleField1212); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_EQUALS_5, grammarAccess.getFieldAccess().getC_EQUALSTerminalRuleCall_4()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:721:1: ( (lv_nodePath_6_0= RULE_STRING ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:722:1: (lv_nodePath_6_0= RULE_STRING )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:722:1: (lv_nodePath_6_0= RULE_STRING )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:723:3: lv_nodePath_6_0= RULE_STRING
            {
            lv_nodePath_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleField1228); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_nodePath_6_0, grammarAccess.getFieldAccess().getNodePathSTRINGTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"nodePath",
                      		lv_nodePath_6_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:739:2: (this_C_SEMICOLON_7= RULE_C_SEMICOLON )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_C_SEMICOLON) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:739:3: this_C_SEMICOLON_7= RULE_C_SEMICOLON
                    {
                    this_C_SEMICOLON_7=(Token)match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_ruleField1245); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_SEMICOLON_7, grammarAccess.getFieldAccess().getC_SEMICOLONTerminalRuleCall_6()); 
                          
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


    // $ANTLR start "entryRuleFieldType"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:751:1: entryRuleFieldType returns [EObject current=null] : iv_ruleFieldType= ruleFieldType EOF ;
    public final EObject entryRuleFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldType = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:752:2: (iv_ruleFieldType= ruleFieldType EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:753:2: iv_ruleFieldType= ruleFieldType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleFieldType_in_entryRuleFieldType1282);
            iv_ruleFieldType=ruleFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldType1292); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFieldType"


    // $ANTLR start "ruleFieldType"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:760:1: ruleFieldType returns [EObject current=null] : ( (lv_type_0_0= ruleTypeName ) ) ;
    public final EObject ruleFieldType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:763:28: ( ( (lv_type_0_0= ruleTypeName ) ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:764:1: ( (lv_type_0_0= ruleTypeName ) )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:764:1: ( (lv_type_0_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:765:1: (lv_type_0_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:765:1: (lv_type_0_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:766:3: lv_type_0_0= ruleTypeName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldTypeAccess().getTypeTypeNameParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeName_in_ruleFieldType1337);
            lv_type_0_0=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFieldTypeRule());
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
    // $ANTLR end "ruleFieldType"


    // $ANTLR start "entryRuleListMeta"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:790:1: entryRuleListMeta returns [EObject current=null] : iv_ruleListMeta= ruleListMeta EOF ;
    public final EObject entryRuleListMeta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListMeta = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:791:2: (iv_ruleListMeta= ruleListMeta EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:792:2: iv_ruleListMeta= ruleListMeta EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListMetaRule()); 
            }
            pushFollow(FOLLOW_ruleListMeta_in_entryRuleListMeta1372);
            iv_ruleListMeta=ruleListMeta();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListMeta; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleListMeta1382); if (state.failed) return current;

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
    // $ANTLR end "entryRuleListMeta"


    // $ANTLR start "ruleListMeta"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:799:1: ruleListMeta returns [EObject current=null] : (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_LIST ) ) (this_C_PAREN_L_2= RULE_C_PAREN_L ( ( (lv_params_3_0= ruleFieldMetaKey ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleFieldMetaKey ) ) )* )? this_C_PAREN_R_6= RULE_C_PAREN_R )? this_C_BRACKET_R_7= RULE_C_BRACKET_R ) ;
    public final EObject ruleListMeta() throws RecognitionException {
        EObject current = null;

        Token this_C_BRACKET_L_0=null;
        Token lv_prefix_1_0=null;
        Token this_C_PAREN_L_2=null;
        Token this_C_COMMA_4=null;
        Token this_C_PAREN_R_6=null;
        Token this_C_BRACKET_R_7=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:802:28: ( (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_LIST ) ) (this_C_PAREN_L_2= RULE_C_PAREN_L ( ( (lv_params_3_0= ruleFieldMetaKey ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleFieldMetaKey ) ) )* )? this_C_PAREN_R_6= RULE_C_PAREN_R )? this_C_BRACKET_R_7= RULE_C_BRACKET_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:803:1: (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_LIST ) ) (this_C_PAREN_L_2= RULE_C_PAREN_L ( ( (lv_params_3_0= ruleFieldMetaKey ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleFieldMetaKey ) ) )* )? this_C_PAREN_R_6= RULE_C_PAREN_R )? this_C_BRACKET_R_7= RULE_C_BRACKET_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:803:1: (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_LIST ) ) (this_C_PAREN_L_2= RULE_C_PAREN_L ( ( (lv_params_3_0= ruleFieldMetaKey ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleFieldMetaKey ) ) )* )? this_C_PAREN_R_6= RULE_C_PAREN_R )? this_C_BRACKET_R_7= RULE_C_BRACKET_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:803:2: this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_LIST ) ) (this_C_PAREN_L_2= RULE_C_PAREN_L ( ( (lv_params_3_0= ruleFieldMetaKey ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleFieldMetaKey ) ) )* )? this_C_PAREN_R_6= RULE_C_PAREN_R )? this_C_BRACKET_R_7= RULE_C_BRACKET_R
            {
            this_C_BRACKET_L_0=(Token)match(input,RULE_C_BRACKET_L,FOLLOW_RULE_C_BRACKET_L_in_ruleListMeta1418); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_BRACKET_L_0, grammarAccess.getListMetaAccess().getC_BRACKET_LTerminalRuleCall_0()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:807:1: ( (lv_prefix_1_0= RULE_C_LIST ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:808:1: (lv_prefix_1_0= RULE_C_LIST )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:808:1: (lv_prefix_1_0= RULE_C_LIST )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:809:3: lv_prefix_1_0= RULE_C_LIST
            {
            lv_prefix_1_0=(Token)match(input,RULE_C_LIST,FOLLOW_RULE_C_LIST_in_ruleListMeta1434); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_prefix_1_0, grammarAccess.getListMetaAccess().getPrefixC_LISTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getListMetaRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"prefix",
                      		lv_prefix_1_0, 
                      		"C_LIST");
              	    
            }

            }


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:825:2: (this_C_PAREN_L_2= RULE_C_PAREN_L ( ( (lv_params_3_0= ruleFieldMetaKey ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleFieldMetaKey ) ) )* )? this_C_PAREN_R_6= RULE_C_PAREN_R )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_C_PAREN_L) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:825:3: this_C_PAREN_L_2= RULE_C_PAREN_L ( ( (lv_params_3_0= ruleFieldMetaKey ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleFieldMetaKey ) ) )* )? this_C_PAREN_R_6= RULE_C_PAREN_R
                    {
                    this_C_PAREN_L_2=(Token)match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_ruleListMeta1451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_PAREN_L_2, grammarAccess.getListMetaAccess().getC_PAREN_LTerminalRuleCall_2_0()); 
                          
                    }
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:829:1: ( ( (lv_params_3_0= ruleFieldMetaKey ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleFieldMetaKey ) ) )* )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_C_INPUT||LA15_0==RULE_C_TYPE||LA15_0==RULE_C_MAIN||LA15_0==RULE_C_LIST||LA15_0==RULE_C_SLICE||(LA15_0>=RULE_C_INT && LA15_0<=RULE_NAME)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:829:2: ( (lv_params_3_0= ruleFieldMetaKey ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleFieldMetaKey ) ) )*
                            {
                            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:829:2: ( (lv_params_3_0= ruleFieldMetaKey ) )
                            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:830:1: (lv_params_3_0= ruleFieldMetaKey )
                            {
                            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:830:1: (lv_params_3_0= ruleFieldMetaKey )
                            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:831:3: lv_params_3_0= ruleFieldMetaKey
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getListMetaAccess().getParamsFieldMetaKeyParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleFieldMetaKey_in_ruleListMeta1472);
                            lv_params_3_0=ruleFieldMetaKey();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getListMetaRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"params",
                                      		lv_params_3_0, 
                                      		"FieldMetaKey");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:847:2: (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleFieldMetaKey ) ) )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==RULE_C_COMMA) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:847:3: this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleFieldMetaKey ) )
                            	    {
                            	    this_C_COMMA_4=(Token)match(input,RULE_C_COMMA,FOLLOW_RULE_C_COMMA_in_ruleListMeta1484); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_C_COMMA_4, grammarAccess.getListMetaAccess().getC_COMMATerminalRuleCall_2_1_1_0()); 
                            	          
                            	    }
                            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:851:1: ( (lv_params_5_0= ruleFieldMetaKey ) )
                            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:852:1: (lv_params_5_0= ruleFieldMetaKey )
                            	    {
                            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:852:1: (lv_params_5_0= ruleFieldMetaKey )
                            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:853:3: lv_params_5_0= ruleFieldMetaKey
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getListMetaAccess().getParamsFieldMetaKeyParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleFieldMetaKey_in_ruleListMeta1504);
                            	    lv_params_5_0=ruleFieldMetaKey();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getListMetaRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"params",
                            	              		lv_params_5_0, 
                            	              		"FieldMetaKey");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop14;
                                }
                            } while (true);


                            }
                            break;

                    }

                    this_C_PAREN_R_6=(Token)match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_ruleListMeta1519); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_PAREN_R_6, grammarAccess.getListMetaAccess().getC_PAREN_RTerminalRuleCall_2_2()); 
                          
                    }

                    }
                    break;

            }

            this_C_BRACKET_R_7=(Token)match(input,RULE_C_BRACKET_R,FOLLOW_RULE_C_BRACKET_R_in_ruleListMeta1531); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_BRACKET_R_7, grammarAccess.getListMetaAccess().getC_BRACKET_RTerminalRuleCall_3()); 
                  
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
    // $ANTLR end "ruleListMeta"


    // $ANTLR start "entryRuleSliceMeta"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:885:1: entryRuleSliceMeta returns [EObject current=null] : iv_ruleSliceMeta= ruleSliceMeta EOF ;
    public final EObject entryRuleSliceMeta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSliceMeta = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:886:2: (iv_ruleSliceMeta= ruleSliceMeta EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:887:2: iv_ruleSliceMeta= ruleSliceMeta EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSliceMetaRule()); 
            }
            pushFollow(FOLLOW_ruleSliceMeta_in_entryRuleSliceMeta1566);
            iv_ruleSliceMeta=ruleSliceMeta();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSliceMeta; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSliceMeta1576); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSliceMeta"


    // $ANTLR start "ruleSliceMeta"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:894:1: ruleSliceMeta returns [EObject current=null] : (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_SLICE ) ) this_C_PAREN_L_2= RULE_C_PAREN_L ( (lv_sliceChar_3_0= RULE_STRING ) ) this_C_PAREN_R_4= RULE_C_PAREN_R this_C_BRACKET_R_5= RULE_C_BRACKET_R ) ;
    public final EObject ruleSliceMeta() throws RecognitionException {
        EObject current = null;

        Token this_C_BRACKET_L_0=null;
        Token lv_prefix_1_0=null;
        Token this_C_PAREN_L_2=null;
        Token lv_sliceChar_3_0=null;
        Token this_C_PAREN_R_4=null;
        Token this_C_BRACKET_R_5=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:897:28: ( (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_SLICE ) ) this_C_PAREN_L_2= RULE_C_PAREN_L ( (lv_sliceChar_3_0= RULE_STRING ) ) this_C_PAREN_R_4= RULE_C_PAREN_R this_C_BRACKET_R_5= RULE_C_BRACKET_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:898:1: (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_SLICE ) ) this_C_PAREN_L_2= RULE_C_PAREN_L ( (lv_sliceChar_3_0= RULE_STRING ) ) this_C_PAREN_R_4= RULE_C_PAREN_R this_C_BRACKET_R_5= RULE_C_BRACKET_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:898:1: (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_SLICE ) ) this_C_PAREN_L_2= RULE_C_PAREN_L ( (lv_sliceChar_3_0= RULE_STRING ) ) this_C_PAREN_R_4= RULE_C_PAREN_R this_C_BRACKET_R_5= RULE_C_BRACKET_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:898:2: this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_SLICE ) ) this_C_PAREN_L_2= RULE_C_PAREN_L ( (lv_sliceChar_3_0= RULE_STRING ) ) this_C_PAREN_R_4= RULE_C_PAREN_R this_C_BRACKET_R_5= RULE_C_BRACKET_R
            {
            this_C_BRACKET_L_0=(Token)match(input,RULE_C_BRACKET_L,FOLLOW_RULE_C_BRACKET_L_in_ruleSliceMeta1612); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_BRACKET_L_0, grammarAccess.getSliceMetaAccess().getC_BRACKET_LTerminalRuleCall_0()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:902:1: ( (lv_prefix_1_0= RULE_C_SLICE ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:903:1: (lv_prefix_1_0= RULE_C_SLICE )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:903:1: (lv_prefix_1_0= RULE_C_SLICE )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:904:3: lv_prefix_1_0= RULE_C_SLICE
            {
            lv_prefix_1_0=(Token)match(input,RULE_C_SLICE,FOLLOW_RULE_C_SLICE_in_ruleSliceMeta1628); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_prefix_1_0, grammarAccess.getSliceMetaAccess().getPrefixC_SLICETerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSliceMetaRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"prefix",
                      		lv_prefix_1_0, 
                      		"C_SLICE");
              	    
            }

            }


            }

            this_C_PAREN_L_2=(Token)match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_ruleSliceMeta1644); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_PAREN_L_2, grammarAccess.getSliceMetaAccess().getC_PAREN_LTerminalRuleCall_2()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:924:1: ( (lv_sliceChar_3_0= RULE_STRING ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:925:1: (lv_sliceChar_3_0= RULE_STRING )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:925:1: (lv_sliceChar_3_0= RULE_STRING )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:926:3: lv_sliceChar_3_0= RULE_STRING
            {
            lv_sliceChar_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSliceMeta1660); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_sliceChar_3_0, grammarAccess.getSliceMetaAccess().getSliceCharSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSliceMetaRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"sliceChar",
                      		lv_sliceChar_3_0, 
                      		"STRING");
              	    
            }

            }


            }

            this_C_PAREN_R_4=(Token)match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_ruleSliceMeta1676); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_PAREN_R_4, grammarAccess.getSliceMetaAccess().getC_PAREN_RTerminalRuleCall_4()); 
                  
            }
            this_C_BRACKET_R_5=(Token)match(input,RULE_C_BRACKET_R,FOLLOW_RULE_C_BRACKET_R_in_ruleSliceMeta1686); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_BRACKET_R_5, grammarAccess.getSliceMetaAccess().getC_BRACKET_RTerminalRuleCall_5()); 
                  
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
    // $ANTLR end "ruleSliceMeta"


    // $ANTLR start "entryRuleFieldMetaKey"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:958:1: entryRuleFieldMetaKey returns [EObject current=null] : iv_ruleFieldMetaKey= ruleFieldMetaKey EOF ;
    public final EObject entryRuleFieldMetaKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldMetaKey = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:959:2: (iv_ruleFieldMetaKey= ruleFieldMetaKey EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:960:2: iv_ruleFieldMetaKey= ruleFieldMetaKey EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldMetaKeyRule()); 
            }
            pushFollow(FOLLOW_ruleFieldMetaKey_in_entryRuleFieldMetaKey1721);
            iv_ruleFieldMetaKey=ruleFieldMetaKey();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldMetaKey; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldMetaKey1731); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFieldMetaKey"


    // $ANTLR start "ruleFieldMetaKey"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:967:1: ruleFieldMetaKey returns [EObject current=null] : ( (lv_fieldName_0_0= ruleTypeName ) ) ;
    public final EObject ruleFieldMetaKey() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_fieldName_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:970:28: ( ( (lv_fieldName_0_0= ruleTypeName ) ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:971:1: ( (lv_fieldName_0_0= ruleTypeName ) )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:971:1: ( (lv_fieldName_0_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:972:1: (lv_fieldName_0_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:972:1: (lv_fieldName_0_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:973:3: lv_fieldName_0_0= ruleTypeName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldMetaKeyAccess().getFieldNameTypeNameParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeName_in_ruleFieldMetaKey1776);
            lv_fieldName_0_0=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFieldMetaKeyRule());
              	        }
                     		set(
                     			current, 
                     			"fieldName",
                      		lv_fieldName_0_0, 
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
    // $ANTLR end "ruleFieldMetaKey"


    // $ANTLR start "entryRuleTypeComment"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:997:1: entryRuleTypeComment returns [String current=null] : iv_ruleTypeComment= ruleTypeComment EOF ;
    public final String entryRuleTypeComment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeComment = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:998:2: (iv_ruleTypeComment= ruleTypeComment EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:999:2: iv_ruleTypeComment= ruleTypeComment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeCommentRule()); 
            }
            pushFollow(FOLLOW_ruleTypeComment_in_entryRuleTypeComment1812);
            iv_ruleTypeComment=ruleTypeComment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeComment.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeComment1823); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1006:1: ruleTypeComment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_COMMENT_0= RULE_COMMENT ;
    public final AntlrDatatypeRuleToken ruleTypeComment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_COMMENT_0=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1009:28: (this_COMMENT_0= RULE_COMMENT )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1010:5: this_COMMENT_0= RULE_COMMENT
            {
            this_COMMENT_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleTypeComment1862); if (state.failed) return current;
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1025:1: entryRuleFieldComment returns [String current=null] : iv_ruleFieldComment= ruleFieldComment EOF ;
    public final String entryRuleFieldComment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldComment = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1026:2: (iv_ruleFieldComment= ruleFieldComment EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1027:2: iv_ruleFieldComment= ruleFieldComment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldCommentRule()); 
            }
            pushFollow(FOLLOW_ruleFieldComment_in_entryRuleFieldComment1907);
            iv_ruleFieldComment=ruleFieldComment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldComment.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldComment1918); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1034:1: ruleFieldComment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_COMMENT_0= RULE_COMMENT ;
    public final AntlrDatatypeRuleToken ruleFieldComment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_COMMENT_0=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1037:28: (this_COMMENT_0= RULE_COMMENT )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1038:5: this_COMMENT_0= RULE_COMMENT
            {
            this_COMMENT_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleFieldComment1957); if (state.failed) return current;
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1053:1: entryRuleOtherComent returns [EObject current=null] : iv_ruleOtherComent= ruleOtherComent EOF ;
    public final EObject entryRuleOtherComent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherComent = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1054:2: (iv_ruleOtherComent= ruleOtherComent EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1055:2: iv_ruleOtherComent= ruleOtherComent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOtherComentRule()); 
            }
            pushFollow(FOLLOW_ruleOtherComent_in_entryRuleOtherComent2001);
            iv_ruleOtherComent=ruleOtherComent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOtherComent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherComent2011); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1062:1: ruleOtherComent returns [EObject current=null] : ( (lv_comm_0_0= RULE_COMMENT ) ) ;
    public final EObject ruleOtherComent() throws RecognitionException {
        EObject current = null;

        Token lv_comm_0_0=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1065:28: ( ( (lv_comm_0_0= RULE_COMMENT ) ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1066:1: ( (lv_comm_0_0= RULE_COMMENT ) )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1066:1: ( (lv_comm_0_0= RULE_COMMENT ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1067:1: (lv_comm_0_0= RULE_COMMENT )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1067:1: (lv_comm_0_0= RULE_COMMENT )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1068:3: lv_comm_0_0= RULE_COMMENT
            {
            lv_comm_0_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleOtherComent2052); if (state.failed) return current;
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1092:1: entryRulePackName returns [String current=null] : iv_rulePackName= rulePackName EOF ;
    public final String entryRulePackName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackName = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1093:2: (iv_rulePackName= rulePackName EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1094:2: iv_rulePackName= rulePackName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackNameRule()); 
            }
            pushFollow(FOLLOW_rulePackName_in_entryRulePackName2093);
            iv_rulePackName=rulePackName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackName2104); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1101:1: rulePackName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TypeName_0= ruleTypeName (kw= '.' this_TypeName_2= ruleTypeName )* ) ;
    public final AntlrDatatypeRuleToken rulePackName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeName_0 = null;

        AntlrDatatypeRuleToken this_TypeName_2 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1104:28: ( (this_TypeName_0= ruleTypeName (kw= '.' this_TypeName_2= ruleTypeName )* ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1105:1: (this_TypeName_0= ruleTypeName (kw= '.' this_TypeName_2= ruleTypeName )* )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1105:1: (this_TypeName_0= ruleTypeName (kw= '.' this_TypeName_2= ruleTypeName )* )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1106:5: this_TypeName_0= ruleTypeName (kw= '.' this_TypeName_2= ruleTypeName )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPackNameAccess().getTypeNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTypeName_in_rulePackName2151);
            this_TypeName_0=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_TypeName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1116:1: (kw= '.' this_TypeName_2= ruleTypeName )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==31) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1117:2: kw= '.' this_TypeName_2= ruleTypeName
            	    {
            	    kw=(Token)match(input,31,FOLLOW_31_in_rulePackName2170); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getPackNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getPackNameAccess().getTypeNameParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleTypeName_in_rulePackName2192);
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
            	    break loop17;
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1141:1: entryRuleTypeName returns [String current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final String entryRuleTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeName = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1142:2: (iv_ruleTypeName= ruleTypeName EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1143:2: iv_ruleTypeName= ruleTypeName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameRule()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_entryRuleTypeName2240);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeName2251); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1150:1: ruleTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_C_INPUT_0= RULE_C_INPUT | this_C_MAIN_1= RULE_C_MAIN | this_C_TYPE_2= RULE_C_TYPE | this_C_INT_3= RULE_C_INT | this_C_UINT_4= RULE_C_UINT | this_C_BOOL_5= RULE_C_BOOL | this_C_NUMBER_6= RULE_C_NUMBER | this_C_STRING_7= RULE_C_STRING | this_C_LIST_8= RULE_C_LIST | this_C_SLICE_9= RULE_C_SLICE | this_NAME_10= RULE_NAME ) ;
    public final AntlrDatatypeRuleToken ruleTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_C_INPUT_0=null;
        Token this_C_MAIN_1=null;
        Token this_C_TYPE_2=null;
        Token this_C_INT_3=null;
        Token this_C_UINT_4=null;
        Token this_C_BOOL_5=null;
        Token this_C_NUMBER_6=null;
        Token this_C_STRING_7=null;
        Token this_C_LIST_8=null;
        Token this_C_SLICE_9=null;
        Token this_NAME_10=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1153:28: ( (this_C_INPUT_0= RULE_C_INPUT | this_C_MAIN_1= RULE_C_MAIN | this_C_TYPE_2= RULE_C_TYPE | this_C_INT_3= RULE_C_INT | this_C_UINT_4= RULE_C_UINT | this_C_BOOL_5= RULE_C_BOOL | this_C_NUMBER_6= RULE_C_NUMBER | this_C_STRING_7= RULE_C_STRING | this_C_LIST_8= RULE_C_LIST | this_C_SLICE_9= RULE_C_SLICE | this_NAME_10= RULE_NAME ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1154:1: (this_C_INPUT_0= RULE_C_INPUT | this_C_MAIN_1= RULE_C_MAIN | this_C_TYPE_2= RULE_C_TYPE | this_C_INT_3= RULE_C_INT | this_C_UINT_4= RULE_C_UINT | this_C_BOOL_5= RULE_C_BOOL | this_C_NUMBER_6= RULE_C_NUMBER | this_C_STRING_7= RULE_C_STRING | this_C_LIST_8= RULE_C_LIST | this_C_SLICE_9= RULE_C_SLICE | this_NAME_10= RULE_NAME )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1154:1: (this_C_INPUT_0= RULE_C_INPUT | this_C_MAIN_1= RULE_C_MAIN | this_C_TYPE_2= RULE_C_TYPE | this_C_INT_3= RULE_C_INT | this_C_UINT_4= RULE_C_UINT | this_C_BOOL_5= RULE_C_BOOL | this_C_NUMBER_6= RULE_C_NUMBER | this_C_STRING_7= RULE_C_STRING | this_C_LIST_8= RULE_C_LIST | this_C_SLICE_9= RULE_C_SLICE | this_NAME_10= RULE_NAME )
            int alt18=11;
            switch ( input.LA(1) ) {
            case RULE_C_INPUT:
                {
                alt18=1;
                }
                break;
            case RULE_C_MAIN:
                {
                alt18=2;
                }
                break;
            case RULE_C_TYPE:
                {
                alt18=3;
                }
                break;
            case RULE_C_INT:
                {
                alt18=4;
                }
                break;
            case RULE_C_UINT:
                {
                alt18=5;
                }
                break;
            case RULE_C_BOOL:
                {
                alt18=6;
                }
                break;
            case RULE_C_NUMBER:
                {
                alt18=7;
                }
                break;
            case RULE_C_STRING:
                {
                alt18=8;
                }
                break;
            case RULE_C_LIST:
                {
                alt18=9;
                }
                break;
            case RULE_C_SLICE:
                {
                alt18=10;
                }
                break;
            case RULE_NAME:
                {
                alt18=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1154:6: this_C_INPUT_0= RULE_C_INPUT
                    {
                    this_C_INPUT_0=(Token)match(input,RULE_C_INPUT,FOLLOW_RULE_C_INPUT_in_ruleTypeName2291); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_INPUT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_INPUT_0, grammarAccess.getTypeNameAccess().getC_INPUTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1162:10: this_C_MAIN_1= RULE_C_MAIN
                    {
                    this_C_MAIN_1=(Token)match(input,RULE_C_MAIN,FOLLOW_RULE_C_MAIN_in_ruleTypeName2317); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_MAIN_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_MAIN_1, grammarAccess.getTypeNameAccess().getC_MAINTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1170:10: this_C_TYPE_2= RULE_C_TYPE
                    {
                    this_C_TYPE_2=(Token)match(input,RULE_C_TYPE,FOLLOW_RULE_C_TYPE_in_ruleTypeName2343); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_TYPE_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_TYPE_2, grammarAccess.getTypeNameAccess().getC_TYPETerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1178:10: this_C_INT_3= RULE_C_INT
                    {
                    this_C_INT_3=(Token)match(input,RULE_C_INT,FOLLOW_RULE_C_INT_in_ruleTypeName2369); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_INT_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_INT_3, grammarAccess.getTypeNameAccess().getC_INTTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1186:10: this_C_UINT_4= RULE_C_UINT
                    {
                    this_C_UINT_4=(Token)match(input,RULE_C_UINT,FOLLOW_RULE_C_UINT_in_ruleTypeName2395); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_UINT_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_UINT_4, grammarAccess.getTypeNameAccess().getC_UINTTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1194:10: this_C_BOOL_5= RULE_C_BOOL
                    {
                    this_C_BOOL_5=(Token)match(input,RULE_C_BOOL,FOLLOW_RULE_C_BOOL_in_ruleTypeName2421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_BOOL_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_BOOL_5, grammarAccess.getTypeNameAccess().getC_BOOLTerminalRuleCall_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1202:10: this_C_NUMBER_6= RULE_C_NUMBER
                    {
                    this_C_NUMBER_6=(Token)match(input,RULE_C_NUMBER,FOLLOW_RULE_C_NUMBER_in_ruleTypeName2447); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_NUMBER_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_NUMBER_6, grammarAccess.getTypeNameAccess().getC_NUMBERTerminalRuleCall_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1210:10: this_C_STRING_7= RULE_C_STRING
                    {
                    this_C_STRING_7=(Token)match(input,RULE_C_STRING,FOLLOW_RULE_C_STRING_in_ruleTypeName2473); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_STRING_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_STRING_7, grammarAccess.getTypeNameAccess().getC_STRINGTerminalRuleCall_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1218:10: this_C_LIST_8= RULE_C_LIST
                    {
                    this_C_LIST_8=(Token)match(input,RULE_C_LIST,FOLLOW_RULE_C_LIST_in_ruleTypeName2499); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_LIST_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_LIST_8, grammarAccess.getTypeNameAccess().getC_LISTTerminalRuleCall_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1226:10: this_C_SLICE_9= RULE_C_SLICE
                    {
                    this_C_SLICE_9=(Token)match(input,RULE_C_SLICE,FOLLOW_RULE_C_SLICE_in_ruleTypeName2525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_SLICE_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_SLICE_9, grammarAccess.getTypeNameAccess().getC_SLICETerminalRuleCall_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1234:10: this_NAME_10= RULE_NAME
                    {
                    this_NAME_10=(Token)match(input,RULE_NAME,FOLLOW_RULE_NAME_in_ruleTypeName2551); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NAME_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NAME_10, grammarAccess.getTypeNameAccess().getNAMETerminalRuleCall_10()); 
                          
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
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:191:5: ( ( ruleType ) )
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:192:1: ( ruleType )
        {
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:192:1: ( ruleType )
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:193:1: ruleType
        {
        pushFollow(FOLLOW_ruleType_in_synpred1_InternalCfg275);
        ruleType();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalCfg

    // $ANTLR start synpred2_InternalCfg
    public final void synpred2_InternalCfg_fragment() throws RecognitionException {   
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:487:3: ( ( ruleField ) )
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:488:1: ( ruleField )
        {
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:488:1: ( ruleField )
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:489:1: ruleField
        {
        pushFollow(FOLLOW_ruleField_in_synpred2_InternalCfg804);
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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA1_eotS =
        "\45\uffff";
    static final String DFA1_eofS =
        "\3\uffff\1\22\1\25\15\22\1\uffff\2\25\5\uffff\13\22";
    static final String DFA1_minS =
        "\2\4\1\5\1\4\1\6\15\4\1\uffff\2\7\2\uffff\1\4\1\uffff\1\5\13\4";
    static final String DFA1_maxS =
        "\2\24\1\5\1\32\1\24\13\37\2\24\1\uffff\2\24\2\uffff\1\32\1\uffff"+
        "\1\11\13\37";
    static final String DFA1_acceptS =
        "\22\uffff\1\3\2\uffff\1\4\1\1\1\uffff\1\2\14\uffff";
    static final String DFA1_specialS =
        "\45\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\2\uffff\1\3\14\uffff\1\1",
            "\1\2\2\uffff\1\3\14\uffff\1\1",
            "\1\4",
            "\1\5\1\uffff\1\20\1\uffff\1\7\2\uffff\1\22\1\6\4\uffff\1\15"+
            "\1\uffff\1\16\1\21\1\10\1\11\1\12\1\13\1\14\1\17",
            "\1\23\1\26\1\25\2\uffff\1\25\10\uffff\1\24",
            "\2\30\1\20\1\uffff\1\22\2\uffff\1\22\10\uffff\1\21\12\uffff"+
            "\1\27",
            "\1\30\1\uffff\1\20\1\uffff\1\22\2\uffff\1\22\10\uffff\1\21"+
            "\12\uffff\1\27",
            "\1\31\1\uffff\1\20\1\uffff\1\22\2\uffff\2\22\4\uffff\1\22"+
            "\1\uffff\1\22\1\21\6\22\4\uffff\1\27",
            "\1\30\1\uffff\1\20\1\uffff\1\22\2\uffff\1\22\10\uffff\1\21"+
            "\12\uffff\1\27",
            "\1\30\1\uffff\1\20\1\uffff\1\22\2\uffff\1\22\10\uffff\1\21"+
            "\12\uffff\1\27",
            "\1\30\1\uffff\1\20\1\uffff\1\22\2\uffff\1\22\10\uffff\1\21"+
            "\12\uffff\1\27",
            "\1\30\1\uffff\1\20\1\uffff\1\22\2\uffff\1\22\10\uffff\1\21"+
            "\12\uffff\1\27",
            "\1\30\1\uffff\1\20\1\uffff\1\22\2\uffff\1\22\10\uffff\1\21"+
            "\12\uffff\1\27",
            "\1\30\1\uffff\1\20\1\uffff\1\22\2\uffff\1\22\10\uffff\1\21"+
            "\12\uffff\1\27",
            "\1\30\1\uffff\1\20\1\uffff\1\22\2\uffff\1\22\10\uffff\1\21"+
            "\12\uffff\1\27",
            "\1\30\1\uffff\1\20\1\uffff\1\22\2\uffff\1\22\10\uffff\1\21"+
            "\12\uffff\1\27",
            "\1\30\3\uffff\1\22\2\uffff\1\22\10\uffff\1\21",
            "\1\30\3\uffff\1\22\2\uffff\1\22\10\uffff\1\21",
            "",
            "\1\26\1\25\2\uffff\1\25\10\uffff\1\24",
            "\1\26\1\25\2\uffff\1\25\10\uffff\1\24",
            "",
            "",
            "\1\32\3\uffff\1\34\3\uffff\1\33\4\uffff\1\42\1\uffff\1\43"+
            "\1\uffff\1\35\1\36\1\37\1\40\1\41\1\44",
            "",
            "\1\30\3\uffff\1\22",
            "\1\30\1\uffff\1\20\1\uffff\1\22\2\uffff\1\22\10\uffff\1\21"+
            "\12\uffff\1\27",
            "\1\30\1\uffff\1\20\1\uffff\1\22\2\uffff\1\22\10\uffff\1\21"+
            "\12\uffff\1\27",
            "\1\30\1\uffff\1\20\1\uffff\1\22\2\uffff\1\22\10\uffff\1\21"+
            "\12\uffff\1\27",
            "\1\30\1\uffff\1\20\1\uffff\1\22\2\uffff\1\22\10\uffff\1\21"+
            "\12\uffff\1\27",
            "\1\30\1\uffff\1\20\1\uffff\1\22\2\uffff\1\22\10\uffff\1\21"+
            "\12\uffff\1\27",
            "\1\30\1\uffff\1\20\1\uffff\1\22\2\uffff\1\22\10\uffff\1\21"+
            "\12\uffff\1\27",
            "\1\30\1\uffff\1\20\1\uffff\1\22\2\uffff\1\22\10\uffff\1\21"+
            "\12\uffff\1\27",
            "\1\30\1\uffff\1\20\1\uffff\1\22\2\uffff\1\22\10\uffff\1\21"+
            "\12\uffff\1\27",
            "\1\30\1\uffff\1\20\1\uffff\1\22\2\uffff\1\22\10\uffff\1\21"+
            "\12\uffff\1\27",
            "\1\30\1\uffff\1\20\1\uffff\1\22\2\uffff\1\22\10\uffff\1\21"+
            "\12\uffff\1\27",
            "\1\30\1\uffff\1\20\1\uffff\1\22\2\uffff\1\22\10\uffff\1\21"+
            "\12\uffff\1\27"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "80:2: ( ( ( (lv_input_0_0= ruleInputDef ) ) ( (lv_pack_1_0= rulePackDef ) ) ) | ( ( (lv_pack_2_0= rulePackDef ) ) ( (lv_input_3_0= ruleInputDef ) ) ) | ( (lv_pack_4_0= rulePackDef ) ) | ( (lv_input_5_0= ruleInputDef ) ) )";
        }
    }
    static final String DFA10_eotS =
        "\20\uffff";
    static final String DFA10_eofS =
        "\20\uffff";
    static final String DFA10_minS =
        "\1\4\1\uffff\1\0\15\uffff";
    static final String DFA10_maxS =
        "\1\32\1\uffff\1\0\15\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\3\1\uffff\14\1\1\2";
    static final String DFA10_specialS =
        "\1\0\1\uffff\1\1\15\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\4\3\uffff\1\6\1\uffff\1\1\1\3\1\5\4\uffff\1\14\1\uffff\1"+
            "\15\1\2\1\7\1\10\1\11\1\12\1\13\1\16",
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

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "()* loopback of 487:1: ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_0 = input.LA(1);

                         
                        int index10_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA10_0==RULE_C_BRACE_R) ) {s = 1;}

                        else if ( (LA10_0==RULE_COMMENT) ) {s = 2;}

                        else if ( (LA10_0==RULE_C_BRACKET_L) && (synpred2_InternalCfg())) {s = 3;}

                        else if ( (LA10_0==RULE_C_INPUT) && (synpred2_InternalCfg())) {s = 4;}

                        else if ( (LA10_0==RULE_C_MAIN) && (synpred2_InternalCfg())) {s = 5;}

                        else if ( (LA10_0==RULE_C_TYPE) && (synpred2_InternalCfg())) {s = 6;}

                        else if ( (LA10_0==RULE_C_INT) && (synpred2_InternalCfg())) {s = 7;}

                        else if ( (LA10_0==RULE_C_UINT) && (synpred2_InternalCfg())) {s = 8;}

                        else if ( (LA10_0==RULE_C_BOOL) && (synpred2_InternalCfg())) {s = 9;}

                        else if ( (LA10_0==RULE_C_NUMBER) && (synpred2_InternalCfg())) {s = 10;}

                        else if ( (LA10_0==RULE_C_STRING) && (synpred2_InternalCfg())) {s = 11;}

                        else if ( (LA10_0==RULE_C_LIST) && (synpred2_InternalCfg())) {s = 12;}

                        else if ( (LA10_0==RULE_C_SLICE) && (synpred2_InternalCfg())) {s = 13;}

                        else if ( (LA10_0==RULE_NAME) && (synpred2_InternalCfg())) {s = 14;}

                         
                        input.seek(index10_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalCfg()) ) {s = 14;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index10_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleXML2_in_entryRuleXML275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXML285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputDef_in_ruleXML2133 = new BitSet(new long[]{0x0000000000100080L});
    public static final BitSet FOLLOW_rulePackDef_in_ruleXML2154 = new BitSet(new long[]{0x0000000000100902L});
    public static final BitSet FOLLOW_rulePackDef_in_ruleXML2183 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleInputDef_in_ruleXML2204 = new BitSet(new long[]{0x0000000000100902L});
    public static final BitSet FOLLOW_rulePackDef_in_ruleXML2232 = new BitSet(new long[]{0x0000000000100902L});
    public static final BitSet FOLLOW_ruleInputDef_in_ruleXML2259 = new BitSet(new long[]{0x0000000000100902L});
    public static final BitSet FOLLOW_ruleType_in_ruleXML2292 = new BitSet(new long[]{0x0000000000100902L});
    public static final BitSet FOLLOW_ruleOtherComent_in_ruleXML2319 = new BitSet(new long[]{0x0000000000100902L});
    public static final BitSet FOLLOW_ruleInputDef_in_entryRuleInputDef357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputDef367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_ruleInputDef413 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_RULE_C_INPUT_in_ruleInputDef431 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInputDef453 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_ruleInputDef470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackDef_in_entryRulePackDef507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackDef517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_rulePackDef563 = new BitSet(new long[]{0x0000000000100080L});
    public static final BitSet FOLLOW_RULE_C_PACKAGE_in_rulePackDef581 = new BitSet(new long[]{0x0000000007EA1152L});
    public static final BitSet FOLLOW_rulePackName_in_rulePackDef607 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_rulePackDef620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeComment_in_ruleType713 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ruleEnter_in_ruleType735 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_C_TYPE_in_ruleType753 = new BitSet(new long[]{0x0000000007EA1110L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleType779 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_C_BRACE_L_in_ruleType790 = new BitSet(new long[]{0x0000000007FA1D10L});
    public static final BitSet FOLLOW_ruleField_in_ruleType821 = new BitSet(new long[]{0x0000000007FA1D10L});
    public static final BitSet FOLLOW_ruleOtherComent_in_ruleType848 = new BitSet(new long[]{0x0000000007FA1D10L});
    public static final BitSet FOLLOW_RULE_C_BRACE_R_in_ruleType861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnter_in_entryRuleEnter896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnter906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_L_in_ruleEnter942 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_C_MAIN_in_ruleEnter958 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_ruleEnter974 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnter990 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_ruleEnter1006 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_R_in_ruleEnter1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldComment_in_ruleField1107 = new BitSet(new long[]{0x0000000007FA1910L});
    public static final BitSet FOLLOW_ruleListMeta_in_ruleField1130 = new BitSet(new long[]{0x0000000007FA1910L});
    public static final BitSet FOLLOW_ruleSliceMeta_in_ruleField1157 = new BitSet(new long[]{0x0000000007FA1910L});
    public static final BitSet FOLLOW_ruleFieldType_in_ruleField1180 = new BitSet(new long[]{0x0000000007EA1110L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleField1201 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_ruleField1212 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleField1228 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_ruleField1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_entryRuleFieldType1282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldType1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleFieldType1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListMeta_in_entryRuleListMeta1372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListMeta1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_L_in_ruleListMeta1418 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_C_LIST_in_ruleListMeta1434 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_ruleListMeta1451 = new BitSet(new long[]{0x0000000007EA5110L});
    public static final BitSet FOLLOW_ruleFieldMetaKey_in_ruleListMeta1472 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_RULE_C_COMMA_in_ruleListMeta1484 = new BitSet(new long[]{0x0000000007EA1110L});
    public static final BitSet FOLLOW_ruleFieldMetaKey_in_ruleListMeta1504 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_ruleListMeta1519 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_R_in_ruleListMeta1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSliceMeta_in_entryRuleSliceMeta1566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSliceMeta1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_L_in_ruleSliceMeta1612 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_C_SLICE_in_ruleSliceMeta1628 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_ruleSliceMeta1644 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSliceMeta1660 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_ruleSliceMeta1676 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_R_in_ruleSliceMeta1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldMetaKey_in_entryRuleFieldMetaKey1721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldMetaKey1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleFieldMetaKey1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeComment_in_entryRuleTypeComment1812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeComment1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleTypeComment1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldComment_in_entryRuleFieldComment1907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldComment1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleFieldComment1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_entryRuleOtherComent2001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherComent2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleOtherComent2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackName_in_entryRulePackName2093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackName2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rulePackName2151 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_rulePackName2170 = new BitSet(new long[]{0x0000000007EA1110L});
    public static final BitSet FOLLOW_ruleTypeName_in_rulePackName2192 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_entryRuleTypeName2240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeName2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INPUT_in_ruleTypeName2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_MAIN_in_ruleTypeName2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_TYPE_in_ruleTypeName2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INT_in_ruleTypeName2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_UINT_in_ruleTypeName2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BOOL_in_ruleTypeName2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_NUMBER_in_ruleTypeName2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_STRING_in_ruleTypeName2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_LIST_in_ruleTypeName2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_SLICE_in_ruleTypeName2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_ruleTypeName2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_synpred1_InternalCfg275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_synpred2_InternalCfg804 = new BitSet(new long[]{0x0000000000000002L});

}