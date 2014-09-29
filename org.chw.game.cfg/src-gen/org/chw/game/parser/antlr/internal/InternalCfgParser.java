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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_C_INPUT", "RULE_STRING", "RULE_C_SEMICOLON", "RULE_C_PACKAGE", "RULE_C_TYPE", "RULE_C_BRACE_L", "RULE_C_BRACE_R", "RULE_C_BRACKET_L", "RULE_C_MAIN", "RULE_C_PAREN_L", "RULE_C_PAREN_R", "RULE_C_BRACKET_R", "RULE_C_EQUALS", "RULE_C_LIST", "RULE_C_COMMA", "RULE_C_SLICE", "RULE_C_ENUM", "RULE_C_DEFAULT", "RULE_COMMENT", "RULE_C_INT", "RULE_C_UINT", "RULE_C_BOOL", "RULE_C_NUMBER", "RULE_C_STRING", "RULE_NAME", "RULE_C_ANGLE_L", "RULE_C_ANGLE_R", "RULE_COMMENT_END", "RULE_WS", "'.'"
    };
    public static final int RULE_C_NUMBER=26;
    public static final int RULE_C_COMMA=18;
    public static final int RULE_C_TYPE=8;
    public static final int RULE_C_PAREN_R=14;
    public static final int RULE_C_SEMICOLON=6;
    public static final int RULE_C_PAREN_L=13;
    public static final int RULE_C_INPUT=4;
    public static final int RULE_C_STRING=27;
    public static final int RULE_C_SLICE=19;
    public static final int RULE_COMMENT=22;
    public static final int RULE_C_PACKAGE=7;
    public static final int EOF=-1;
    public static final int RULE_C_ANGLE_L=29;
    public static final int RULE_C_ANGLE_R=30;
    public static final int RULE_COMMENT_END=31;
    public static final int RULE_C_BRACKET_L=11;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int RULE_C_EQUALS=16;
    public static final int RULE_C_UINT=24;
    public static final int RULE_C_BRACKET_R=15;
    public static final int RULE_C_MAIN=12;
    public static final int RULE_C_INT=23;
    public static final int RULE_NAME=28;
    public static final int RULE_WS=32;
    public static final int RULE_C_BOOL=25;
    public static final int RULE_C_BRACE_L=9;
    public static final int RULE_C_LIST=17;
    public static final int RULE_C_DEFAULT=21;
    public static final int RULE_C_ENUM=20;
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:76:1: ruleXML2 returns [EObject current=null] : ( ( ( ( (lv_input_0_0= ruleInputDef ) ) ( (lv_pack_1_0= rulePackDef ) ) ) | ( ( (lv_pack_2_0= rulePackDef ) ) ( (lv_input_3_0= ruleInputDef ) ) ) | ( (lv_pack_4_0= rulePackDef ) ) | ( (lv_input_5_0= ruleInputDef ) ) ) ( ( ( ( ruleType ) )=> (lv_types_6_0= ruleType ) ) | ( ( ( ruleEnum ) )=> (lv_enums_7_0= ruleEnum ) ) | ( (lv_comm_8_0= ruleOtherComent ) ) )* ) ;
    public final EObject ruleXML2() throws RecognitionException {
        EObject current = null;

        EObject lv_input_0_0 = null;

        EObject lv_pack_1_0 = null;

        EObject lv_pack_2_0 = null;

        EObject lv_input_3_0 = null;

        EObject lv_pack_4_0 = null;

        EObject lv_input_5_0 = null;

        EObject lv_types_6_0 = null;

        EObject lv_enums_7_0 = null;

        EObject lv_comm_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:79:28: ( ( ( ( ( (lv_input_0_0= ruleInputDef ) ) ( (lv_pack_1_0= rulePackDef ) ) ) | ( ( (lv_pack_2_0= rulePackDef ) ) ( (lv_input_3_0= ruleInputDef ) ) ) | ( (lv_pack_4_0= rulePackDef ) ) | ( (lv_input_5_0= ruleInputDef ) ) ) ( ( ( ( ruleType ) )=> (lv_types_6_0= ruleType ) ) | ( ( ( ruleEnum ) )=> (lv_enums_7_0= ruleEnum ) ) | ( (lv_comm_8_0= ruleOtherComent ) ) )* ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:1: ( ( ( ( (lv_input_0_0= ruleInputDef ) ) ( (lv_pack_1_0= rulePackDef ) ) ) | ( ( (lv_pack_2_0= rulePackDef ) ) ( (lv_input_3_0= ruleInputDef ) ) ) | ( (lv_pack_4_0= rulePackDef ) ) | ( (lv_input_5_0= ruleInputDef ) ) ) ( ( ( ( ruleType ) )=> (lv_types_6_0= ruleType ) ) | ( ( ( ruleEnum ) )=> (lv_enums_7_0= ruleEnum ) ) | ( (lv_comm_8_0= ruleOtherComent ) ) )* )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:1: ( ( ( ( (lv_input_0_0= ruleInputDef ) ) ( (lv_pack_1_0= rulePackDef ) ) ) | ( ( (lv_pack_2_0= rulePackDef ) ) ( (lv_input_3_0= ruleInputDef ) ) ) | ( (lv_pack_4_0= rulePackDef ) ) | ( (lv_input_5_0= ruleInputDef ) ) ) ( ( ( ( ruleType ) )=> (lv_types_6_0= ruleType ) ) | ( ( ( ruleEnum ) )=> (lv_enums_7_0= ruleEnum ) ) | ( (lv_comm_8_0= ruleOtherComent ) ) )* )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:80:2: ( ( ( (lv_input_0_0= ruleInputDef ) ) ( (lv_pack_1_0= rulePackDef ) ) ) | ( ( (lv_pack_2_0= rulePackDef ) ) ( (lv_input_3_0= ruleInputDef ) ) ) | ( (lv_pack_4_0= rulePackDef ) ) | ( (lv_input_5_0= ruleInputDef ) ) ) ( ( ( ( ruleType ) )=> (lv_types_6_0= ruleType ) ) | ( ( ( ruleEnum ) )=> (lv_enums_7_0= ruleEnum ) ) | ( (lv_comm_8_0= ruleOtherComent ) ) )*
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:191:3: ( ( ( ( ruleType ) )=> (lv_types_6_0= ruleType ) ) | ( ( ( ruleEnum ) )=> (lv_enums_7_0= ruleEnum ) ) | ( (lv_comm_8_0= ruleOtherComent ) ) )*
            loop2:
            do {
                int alt2=4;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMMENT) ) {
                    int LA2_2 = input.LA(2);

                    if ( (synpred1_InternalCfg()) ) {
                        alt2=1;
                    }
                    else if ( (synpred2_InternalCfg()) ) {
                        alt2=2;
                    }
                    else if ( (true) ) {
                        alt2=3;
                    }


                }
                else if ( (LA2_0==RULE_C_BRACKET_L) && (synpred1_InternalCfg())) {
                    alt2=1;
                }
                else if ( (LA2_0==RULE_C_TYPE) && (synpred1_InternalCfg())) {
                    alt2=1;
                }
                else if ( (LA2_0==RULE_C_ENUM) && (synpred2_InternalCfg())) {
                    alt2=2;
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
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:214:6: ( ( ( ruleEnum ) )=> (lv_enums_7_0= ruleEnum ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:214:6: ( ( ( ruleEnum ) )=> (lv_enums_7_0= ruleEnum ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:214:7: ( ( ruleEnum ) )=> (lv_enums_7_0= ruleEnum )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:219:1: (lv_enums_7_0= ruleEnum )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:220:3: lv_enums_7_0= ruleEnum
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXML2Access().getEnumsEnumParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEnum_in_ruleXML2329);
            	    lv_enums_7_0=ruleEnum();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXML2Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"enums",
            	              		lv_enums_7_0, 
            	              		"Enum");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:237:6: ( (lv_comm_8_0= ruleOtherComent ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:237:6: ( (lv_comm_8_0= ruleOtherComent ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:238:1: (lv_comm_8_0= ruleOtherComent )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:238:1: (lv_comm_8_0= ruleOtherComent )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:239:3: lv_comm_8_0= ruleOtherComent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXML2Access().getCommOtherComentParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOtherComent_in_ruleXML2356);
            	    lv_comm_8_0=ruleOtherComent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXML2Rule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"comm",
            	              		lv_comm_8_0, 
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:263:1: entryRuleInputDef returns [EObject current=null] : iv_ruleInputDef= ruleInputDef EOF ;
    public final EObject entryRuleInputDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputDef = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:264:2: (iv_ruleInputDef= ruleInputDef EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:265:2: iv_ruleInputDef= ruleInputDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputDefRule()); 
            }
            pushFollow(FOLLOW_ruleInputDef_in_entryRuleInputDef394);
            iv_ruleInputDef=ruleInputDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInputDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputDef404); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:272:1: ruleInputDef returns [EObject current=null] : ( ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_inputCHAR_1_0= RULE_C_INPUT ) ) ( (lv_url_2_0= RULE_STRING ) ) (this_C_SEMICOLON_3= RULE_C_SEMICOLON )? ) ;
    public final EObject ruleInputDef() throws RecognitionException {
        EObject current = null;

        Token lv_inputCHAR_1_0=null;
        Token lv_url_2_0=null;
        Token this_C_SEMICOLON_3=null;
        EObject lv_comment_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:275:28: ( ( ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_inputCHAR_1_0= RULE_C_INPUT ) ) ( (lv_url_2_0= RULE_STRING ) ) (this_C_SEMICOLON_3= RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:276:1: ( ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_inputCHAR_1_0= RULE_C_INPUT ) ) ( (lv_url_2_0= RULE_STRING ) ) (this_C_SEMICOLON_3= RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:276:1: ( ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_inputCHAR_1_0= RULE_C_INPUT ) ) ( (lv_url_2_0= RULE_STRING ) ) (this_C_SEMICOLON_3= RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:276:2: ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_inputCHAR_1_0= RULE_C_INPUT ) ) ( (lv_url_2_0= RULE_STRING ) ) (this_C_SEMICOLON_3= RULE_C_SEMICOLON )?
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:276:2: ( (lv_comment_0_0= ruleOtherComent ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_COMMENT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:277:1: (lv_comment_0_0= ruleOtherComent )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:277:1: (lv_comment_0_0= ruleOtherComent )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:278:3: lv_comment_0_0= ruleOtherComent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInputDefAccess().getCommentOtherComentParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOtherComent_in_ruleInputDef450);
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:294:3: ( (lv_inputCHAR_1_0= RULE_C_INPUT ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:295:1: (lv_inputCHAR_1_0= RULE_C_INPUT )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:295:1: (lv_inputCHAR_1_0= RULE_C_INPUT )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:296:3: lv_inputCHAR_1_0= RULE_C_INPUT
            {
            lv_inputCHAR_1_0=(Token)match(input,RULE_C_INPUT,FOLLOW_RULE_C_INPUT_in_ruleInputDef468); if (state.failed) return current;
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:312:2: ( (lv_url_2_0= RULE_STRING ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:313:1: (lv_url_2_0= RULE_STRING )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:313:1: (lv_url_2_0= RULE_STRING )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:314:3: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInputDef490); if (state.failed) return current;
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:330:2: (this_C_SEMICOLON_3= RULE_C_SEMICOLON )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_C_SEMICOLON) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:330:3: this_C_SEMICOLON_3= RULE_C_SEMICOLON
                    {
                    this_C_SEMICOLON_3=(Token)match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_ruleInputDef507); if (state.failed) return current;
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:342:1: entryRulePackDef returns [EObject current=null] : iv_rulePackDef= rulePackDef EOF ;
    public final EObject entryRulePackDef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackDef = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:343:2: (iv_rulePackDef= rulePackDef EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:344:2: iv_rulePackDef= rulePackDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackDefRule()); 
            }
            pushFollow(FOLLOW_rulePackDef_in_entryRulePackDef544);
            iv_rulePackDef=rulePackDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackDef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackDef554); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:351:1: rulePackDef returns [EObject current=null] : ( ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_packCHAR_1_0= RULE_C_PACKAGE ) ) ( (lv_pack_2_0= rulePackName ) )? (this_C_SEMICOLON_3= RULE_C_SEMICOLON )? ) ;
    public final EObject rulePackDef() throws RecognitionException {
        EObject current = null;

        Token lv_packCHAR_1_0=null;
        Token this_C_SEMICOLON_3=null;
        EObject lv_comment_0_0 = null;

        AntlrDatatypeRuleToken lv_pack_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:354:28: ( ( ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_packCHAR_1_0= RULE_C_PACKAGE ) ) ( (lv_pack_2_0= rulePackName ) )? (this_C_SEMICOLON_3= RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:355:1: ( ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_packCHAR_1_0= RULE_C_PACKAGE ) ) ( (lv_pack_2_0= rulePackName ) )? (this_C_SEMICOLON_3= RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:355:1: ( ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_packCHAR_1_0= RULE_C_PACKAGE ) ) ( (lv_pack_2_0= rulePackName ) )? (this_C_SEMICOLON_3= RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:355:2: ( (lv_comment_0_0= ruleOtherComent ) )* ( (lv_packCHAR_1_0= RULE_C_PACKAGE ) ) ( (lv_pack_2_0= rulePackName ) )? (this_C_SEMICOLON_3= RULE_C_SEMICOLON )?
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:355:2: ( (lv_comment_0_0= ruleOtherComent ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMMENT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:356:1: (lv_comment_0_0= ruleOtherComent )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:356:1: (lv_comment_0_0= ruleOtherComent )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:357:3: lv_comment_0_0= ruleOtherComent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackDefAccess().getCommentOtherComentParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOtherComent_in_rulePackDef600);
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:373:3: ( (lv_packCHAR_1_0= RULE_C_PACKAGE ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:374:1: (lv_packCHAR_1_0= RULE_C_PACKAGE )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:374:1: (lv_packCHAR_1_0= RULE_C_PACKAGE )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:375:3: lv_packCHAR_1_0= RULE_C_PACKAGE
            {
            lv_packCHAR_1_0=(Token)match(input,RULE_C_PACKAGE,FOLLOW_RULE_C_PACKAGE_in_rulePackDef618); if (state.failed) return current;
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:391:2: ( (lv_pack_2_0= rulePackName ) )?
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:392:1: (lv_pack_2_0= rulePackName )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:392:1: (lv_pack_2_0= rulePackName )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:393:3: lv_pack_2_0= rulePackName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPackDefAccess().getPackPackNameParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePackName_in_rulePackDef644);
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:409:3: (this_C_SEMICOLON_3= RULE_C_SEMICOLON )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_C_SEMICOLON) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:409:4: this_C_SEMICOLON_3= RULE_C_SEMICOLON
                    {
                    this_C_SEMICOLON_3=(Token)match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_rulePackDef657); if (state.failed) return current;
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:421:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:422:2: (iv_ruleType= ruleType EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:423:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType694);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType704); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:430:1: ruleType returns [EObject current=null] : ( ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_enter_1_0= ruleEnter ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= ruleTypeName ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R ) ;
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
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:433:28: ( ( ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_enter_1_0= ruleEnter ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= ruleTypeName ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:434:1: ( ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_enter_1_0= ruleEnter ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= ruleTypeName ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:434:1: ( ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_enter_1_0= ruleEnter ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= ruleTypeName ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:434:2: ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_enter_1_0= ruleEnter ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= ruleTypeName ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:434:2: ( (lv_comment_0_0= ruleTypeComment ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_COMMENT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:435:1: (lv_comment_0_0= ruleTypeComment )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:435:1: (lv_comment_0_0= ruleTypeComment )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:436:3: lv_comment_0_0= ruleTypeComment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getCommentTypeCommentParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeComment_in_ruleType750);
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:452:3: ( (lv_enter_1_0= ruleEnter ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_C_BRACKET_L) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:453:1: (lv_enter_1_0= ruleEnter )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:453:1: (lv_enter_1_0= ruleEnter )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:454:3: lv_enter_1_0= ruleEnter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getEnterEnterParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEnter_in_ruleType772);
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:470:3: ( (lv_prefix_2_0= RULE_C_TYPE ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:471:1: (lv_prefix_2_0= RULE_C_TYPE )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:471:1: (lv_prefix_2_0= RULE_C_TYPE )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:472:3: lv_prefix_2_0= RULE_C_TYPE
            {
            lv_prefix_2_0=(Token)match(input,RULE_C_TYPE,FOLLOW_RULE_C_TYPE_in_ruleType790); if (state.failed) return current;
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:488:2: ( (lv_name_3_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:489:1: (lv_name_3_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:489:1: (lv_name_3_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:490:3: lv_name_3_0= ruleTypeName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAccess().getNameTypeNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeName_in_ruleType816);
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

            this_C_BRACE_L_4=(Token)match(input,RULE_C_BRACE_L,FOLLOW_RULE_C_BRACE_L_in_ruleType827); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_BRACE_L_4, grammarAccess.getTypeAccess().getC_BRACE_LTerminalRuleCall_4()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:510:1: ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )*
            loop10:
            do {
                int alt10=3;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:510:2: ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:510:2: ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:510:3: ( ( ruleField ) )=> (lv_fields_5_0= ruleField )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:515:1: (lv_fields_5_0= ruleField )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:516:3: lv_fields_5_0= ruleField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypeAccess().getFieldsFieldParserRuleCall_5_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleField_in_ruleType858);
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
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:533:6: ( (lv_comm_6_0= ruleOtherComent ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:533:6: ( (lv_comm_6_0= ruleOtherComent ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:534:1: (lv_comm_6_0= ruleOtherComent )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:534:1: (lv_comm_6_0= ruleOtherComent )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:535:3: lv_comm_6_0= ruleOtherComent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypeAccess().getCommOtherComentParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOtherComent_in_ruleType885);
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

            this_C_BRACE_R_7=(Token)match(input,RULE_C_BRACE_R,FOLLOW_RULE_C_BRACE_R_in_ruleType898); if (state.failed) return current;
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:563:1: entryRuleEnter returns [EObject current=null] : iv_ruleEnter= ruleEnter EOF ;
    public final EObject entryRuleEnter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnter = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:564:2: (iv_ruleEnter= ruleEnter EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:565:2: iv_ruleEnter= ruleEnter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnterRule()); 
            }
            pushFollow(FOLLOW_ruleEnter_in_entryRuleEnter933);
            iv_ruleEnter=ruleEnter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnter943); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:572:1: ruleEnter returns [EObject current=null] : (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_MAIN ) ) this_C_PAREN_L_2= RULE_C_PAREN_L ( (lv_rootPath_3_0= RULE_STRING ) ) this_C_PAREN_R_4= RULE_C_PAREN_R this_C_BRACKET_R_5= RULE_C_BRACKET_R ) ;
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
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:575:28: ( (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_MAIN ) ) this_C_PAREN_L_2= RULE_C_PAREN_L ( (lv_rootPath_3_0= RULE_STRING ) ) this_C_PAREN_R_4= RULE_C_PAREN_R this_C_BRACKET_R_5= RULE_C_BRACKET_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:576:1: (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_MAIN ) ) this_C_PAREN_L_2= RULE_C_PAREN_L ( (lv_rootPath_3_0= RULE_STRING ) ) this_C_PAREN_R_4= RULE_C_PAREN_R this_C_BRACKET_R_5= RULE_C_BRACKET_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:576:1: (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_MAIN ) ) this_C_PAREN_L_2= RULE_C_PAREN_L ( (lv_rootPath_3_0= RULE_STRING ) ) this_C_PAREN_R_4= RULE_C_PAREN_R this_C_BRACKET_R_5= RULE_C_BRACKET_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:576:2: this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_MAIN ) ) this_C_PAREN_L_2= RULE_C_PAREN_L ( (lv_rootPath_3_0= RULE_STRING ) ) this_C_PAREN_R_4= RULE_C_PAREN_R this_C_BRACKET_R_5= RULE_C_BRACKET_R
            {
            this_C_BRACKET_L_0=(Token)match(input,RULE_C_BRACKET_L,FOLLOW_RULE_C_BRACKET_L_in_ruleEnter979); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_BRACKET_L_0, grammarAccess.getEnterAccess().getC_BRACKET_LTerminalRuleCall_0()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:580:1: ( (lv_prefix_1_0= RULE_C_MAIN ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:581:1: (lv_prefix_1_0= RULE_C_MAIN )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:581:1: (lv_prefix_1_0= RULE_C_MAIN )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:582:3: lv_prefix_1_0= RULE_C_MAIN
            {
            lv_prefix_1_0=(Token)match(input,RULE_C_MAIN,FOLLOW_RULE_C_MAIN_in_ruleEnter995); if (state.failed) return current;
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

            this_C_PAREN_L_2=(Token)match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_ruleEnter1011); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_PAREN_L_2, grammarAccess.getEnterAccess().getC_PAREN_LTerminalRuleCall_2()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:602:1: ( (lv_rootPath_3_0= RULE_STRING ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:603:1: (lv_rootPath_3_0= RULE_STRING )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:603:1: (lv_rootPath_3_0= RULE_STRING )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:604:3: lv_rootPath_3_0= RULE_STRING
            {
            lv_rootPath_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnter1027); if (state.failed) return current;
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

            this_C_PAREN_R_4=(Token)match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_ruleEnter1043); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_PAREN_R_4, grammarAccess.getEnterAccess().getC_PAREN_RTerminalRuleCall_4()); 
                  
            }
            this_C_BRACKET_R_5=(Token)match(input,RULE_C_BRACKET_R,FOLLOW_RULE_C_BRACKET_R_in_ruleEnter1053); if (state.failed) return current;
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:636:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:637:2: (iv_ruleField= ruleField EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:638:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField1088);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1098); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:645:1: ruleField returns [EObject current=null] : ( ( (lv_comment_0_0= ruleFieldComment ) )? ( ( (lv_meta_1_0= ruleListMeta ) ) | ( (lv_meta_2_0= ruleSliceMeta ) ) )* ( (lv_type_3_0= ruleFieldType ) ) ( (lv_fieldName_4_0= ruleTypeName ) ) this_C_EQUALS_5= RULE_C_EQUALS ( (lv_nodePath_6_0= RULE_STRING ) ) (this_C_SEMICOLON_7= RULE_C_SEMICOLON )? ) ;
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
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:648:28: ( ( ( (lv_comment_0_0= ruleFieldComment ) )? ( ( (lv_meta_1_0= ruleListMeta ) ) | ( (lv_meta_2_0= ruleSliceMeta ) ) )* ( (lv_type_3_0= ruleFieldType ) ) ( (lv_fieldName_4_0= ruleTypeName ) ) this_C_EQUALS_5= RULE_C_EQUALS ( (lv_nodePath_6_0= RULE_STRING ) ) (this_C_SEMICOLON_7= RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:649:1: ( ( (lv_comment_0_0= ruleFieldComment ) )? ( ( (lv_meta_1_0= ruleListMeta ) ) | ( (lv_meta_2_0= ruleSliceMeta ) ) )* ( (lv_type_3_0= ruleFieldType ) ) ( (lv_fieldName_4_0= ruleTypeName ) ) this_C_EQUALS_5= RULE_C_EQUALS ( (lv_nodePath_6_0= RULE_STRING ) ) (this_C_SEMICOLON_7= RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:649:1: ( ( (lv_comment_0_0= ruleFieldComment ) )? ( ( (lv_meta_1_0= ruleListMeta ) ) | ( (lv_meta_2_0= ruleSliceMeta ) ) )* ( (lv_type_3_0= ruleFieldType ) ) ( (lv_fieldName_4_0= ruleTypeName ) ) this_C_EQUALS_5= RULE_C_EQUALS ( (lv_nodePath_6_0= RULE_STRING ) ) (this_C_SEMICOLON_7= RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:649:2: ( (lv_comment_0_0= ruleFieldComment ) )? ( ( (lv_meta_1_0= ruleListMeta ) ) | ( (lv_meta_2_0= ruleSliceMeta ) ) )* ( (lv_type_3_0= ruleFieldType ) ) ( (lv_fieldName_4_0= ruleTypeName ) ) this_C_EQUALS_5= RULE_C_EQUALS ( (lv_nodePath_6_0= RULE_STRING ) ) (this_C_SEMICOLON_7= RULE_C_SEMICOLON )?
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:649:2: ( (lv_comment_0_0= ruleFieldComment ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_COMMENT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:650:1: (lv_comment_0_0= ruleFieldComment )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:650:1: (lv_comment_0_0= ruleFieldComment )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:651:3: lv_comment_0_0= ruleFieldComment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldAccess().getCommentFieldCommentParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFieldComment_in_ruleField1144);
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:667:3: ( ( (lv_meta_1_0= ruleListMeta ) ) | ( (lv_meta_2_0= ruleSliceMeta ) ) )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_C_BRACKET_L) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==RULE_C_SLICE) ) {
                        alt12=2;
                    }
                    else if ( (LA12_2==RULE_C_LIST) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:667:4: ( (lv_meta_1_0= ruleListMeta ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:667:4: ( (lv_meta_1_0= ruleListMeta ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:668:1: (lv_meta_1_0= ruleListMeta )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:668:1: (lv_meta_1_0= ruleListMeta )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:669:3: lv_meta_1_0= ruleListMeta
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFieldAccess().getMetaListMetaParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleListMeta_in_ruleField1167);
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
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:686:6: ( (lv_meta_2_0= ruleSliceMeta ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:686:6: ( (lv_meta_2_0= ruleSliceMeta ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:687:1: (lv_meta_2_0= ruleSliceMeta )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:687:1: (lv_meta_2_0= ruleSliceMeta )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:688:3: lv_meta_2_0= ruleSliceMeta
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFieldAccess().getMetaSliceMetaParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSliceMeta_in_ruleField1194);
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:704:4: ( (lv_type_3_0= ruleFieldType ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:705:1: (lv_type_3_0= ruleFieldType )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:705:1: (lv_type_3_0= ruleFieldType )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:706:3: lv_type_3_0= ruleFieldType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFieldType_in_ruleField1217);
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:722:2: ( (lv_fieldName_4_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:723:1: (lv_fieldName_4_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:723:1: (lv_fieldName_4_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:724:3: lv_fieldName_4_0= ruleTypeName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldAccess().getFieldNameTypeNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeName_in_ruleField1238);
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

            this_C_EQUALS_5=(Token)match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_ruleField1249); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_EQUALS_5, grammarAccess.getFieldAccess().getC_EQUALSTerminalRuleCall_4()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:744:1: ( (lv_nodePath_6_0= RULE_STRING ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:745:1: (lv_nodePath_6_0= RULE_STRING )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:745:1: (lv_nodePath_6_0= RULE_STRING )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:746:3: lv_nodePath_6_0= RULE_STRING
            {
            lv_nodePath_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleField1265); if (state.failed) return current;
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:762:2: (this_C_SEMICOLON_7= RULE_C_SEMICOLON )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_C_SEMICOLON) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:762:3: this_C_SEMICOLON_7= RULE_C_SEMICOLON
                    {
                    this_C_SEMICOLON_7=(Token)match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_ruleField1282); if (state.failed) return current;
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:774:1: entryRuleFieldType returns [EObject current=null] : iv_ruleFieldType= ruleFieldType EOF ;
    public final EObject entryRuleFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldType = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:775:2: (iv_ruleFieldType= ruleFieldType EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:776:2: iv_ruleFieldType= ruleFieldType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleFieldType_in_entryRuleFieldType1319);
            iv_ruleFieldType=ruleFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldType1329); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:783:1: ruleFieldType returns [EObject current=null] : ( (lv_type_0_0= ruleTypeName ) ) ;
    public final EObject ruleFieldType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:786:28: ( ( (lv_type_0_0= ruleTypeName ) ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:787:1: ( (lv_type_0_0= ruleTypeName ) )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:787:1: ( (lv_type_0_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:788:1: (lv_type_0_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:788:1: (lv_type_0_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:789:3: lv_type_0_0= ruleTypeName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldTypeAccess().getTypeTypeNameParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeName_in_ruleFieldType1374);
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:813:1: entryRuleListMeta returns [EObject current=null] : iv_ruleListMeta= ruleListMeta EOF ;
    public final EObject entryRuleListMeta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListMeta = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:814:2: (iv_ruleListMeta= ruleListMeta EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:815:2: iv_ruleListMeta= ruleListMeta EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListMetaRule()); 
            }
            pushFollow(FOLLOW_ruleListMeta_in_entryRuleListMeta1409);
            iv_ruleListMeta=ruleListMeta();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleListMeta; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleListMeta1419); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:822:1: ruleListMeta returns [EObject current=null] : (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_LIST ) ) (this_C_PAREN_L_2= RULE_C_PAREN_L ( ( (lv_params_3_0= ruleFieldMetaKey ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleFieldMetaKey ) ) )* )? this_C_PAREN_R_6= RULE_C_PAREN_R )? this_C_BRACKET_R_7= RULE_C_BRACKET_R ) ;
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
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:825:28: ( (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_LIST ) ) (this_C_PAREN_L_2= RULE_C_PAREN_L ( ( (lv_params_3_0= ruleFieldMetaKey ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleFieldMetaKey ) ) )* )? this_C_PAREN_R_6= RULE_C_PAREN_R )? this_C_BRACKET_R_7= RULE_C_BRACKET_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:826:1: (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_LIST ) ) (this_C_PAREN_L_2= RULE_C_PAREN_L ( ( (lv_params_3_0= ruleFieldMetaKey ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleFieldMetaKey ) ) )* )? this_C_PAREN_R_6= RULE_C_PAREN_R )? this_C_BRACKET_R_7= RULE_C_BRACKET_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:826:1: (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_LIST ) ) (this_C_PAREN_L_2= RULE_C_PAREN_L ( ( (lv_params_3_0= ruleFieldMetaKey ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleFieldMetaKey ) ) )* )? this_C_PAREN_R_6= RULE_C_PAREN_R )? this_C_BRACKET_R_7= RULE_C_BRACKET_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:826:2: this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_LIST ) ) (this_C_PAREN_L_2= RULE_C_PAREN_L ( ( (lv_params_3_0= ruleFieldMetaKey ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleFieldMetaKey ) ) )* )? this_C_PAREN_R_6= RULE_C_PAREN_R )? this_C_BRACKET_R_7= RULE_C_BRACKET_R
            {
            this_C_BRACKET_L_0=(Token)match(input,RULE_C_BRACKET_L,FOLLOW_RULE_C_BRACKET_L_in_ruleListMeta1455); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_BRACKET_L_0, grammarAccess.getListMetaAccess().getC_BRACKET_LTerminalRuleCall_0()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:830:1: ( (lv_prefix_1_0= RULE_C_LIST ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:831:1: (lv_prefix_1_0= RULE_C_LIST )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:831:1: (lv_prefix_1_0= RULE_C_LIST )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:832:3: lv_prefix_1_0= RULE_C_LIST
            {
            lv_prefix_1_0=(Token)match(input,RULE_C_LIST,FOLLOW_RULE_C_LIST_in_ruleListMeta1471); if (state.failed) return current;
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:848:2: (this_C_PAREN_L_2= RULE_C_PAREN_L ( ( (lv_params_3_0= ruleFieldMetaKey ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleFieldMetaKey ) ) )* )? this_C_PAREN_R_6= RULE_C_PAREN_R )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_C_PAREN_L) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:848:3: this_C_PAREN_L_2= RULE_C_PAREN_L ( ( (lv_params_3_0= ruleFieldMetaKey ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleFieldMetaKey ) ) )* )? this_C_PAREN_R_6= RULE_C_PAREN_R
                    {
                    this_C_PAREN_L_2=(Token)match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_ruleListMeta1488); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_PAREN_L_2, grammarAccess.getListMetaAccess().getC_PAREN_LTerminalRuleCall_2_0()); 
                          
                    }
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:852:1: ( ( (lv_params_3_0= ruleFieldMetaKey ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleFieldMetaKey ) ) )* )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_C_INPUT||LA15_0==RULE_C_TYPE||LA15_0==RULE_C_MAIN||LA15_0==RULE_C_LIST||(LA15_0>=RULE_C_SLICE && LA15_0<=RULE_C_DEFAULT)||(LA15_0>=RULE_C_INT && LA15_0<=RULE_NAME)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:852:2: ( (lv_params_3_0= ruleFieldMetaKey ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleFieldMetaKey ) ) )*
                            {
                            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:852:2: ( (lv_params_3_0= ruleFieldMetaKey ) )
                            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:853:1: (lv_params_3_0= ruleFieldMetaKey )
                            {
                            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:853:1: (lv_params_3_0= ruleFieldMetaKey )
                            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:854:3: lv_params_3_0= ruleFieldMetaKey
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getListMetaAccess().getParamsFieldMetaKeyParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleFieldMetaKey_in_ruleListMeta1509);
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

                            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:870:2: (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleFieldMetaKey ) ) )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==RULE_C_COMMA) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:870:3: this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleFieldMetaKey ) )
                            	    {
                            	    this_C_COMMA_4=(Token)match(input,RULE_C_COMMA,FOLLOW_RULE_C_COMMA_in_ruleListMeta1521); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_C_COMMA_4, grammarAccess.getListMetaAccess().getC_COMMATerminalRuleCall_2_1_1_0()); 
                            	          
                            	    }
                            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:874:1: ( (lv_params_5_0= ruleFieldMetaKey ) )
                            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:875:1: (lv_params_5_0= ruleFieldMetaKey )
                            	    {
                            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:875:1: (lv_params_5_0= ruleFieldMetaKey )
                            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:876:3: lv_params_5_0= ruleFieldMetaKey
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getListMetaAccess().getParamsFieldMetaKeyParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleFieldMetaKey_in_ruleListMeta1541);
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

                    this_C_PAREN_R_6=(Token)match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_ruleListMeta1556); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_PAREN_R_6, grammarAccess.getListMetaAccess().getC_PAREN_RTerminalRuleCall_2_2()); 
                          
                    }

                    }
                    break;

            }

            this_C_BRACKET_R_7=(Token)match(input,RULE_C_BRACKET_R,FOLLOW_RULE_C_BRACKET_R_in_ruleListMeta1568); if (state.failed) return current;
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:908:1: entryRuleSliceMeta returns [EObject current=null] : iv_ruleSliceMeta= ruleSliceMeta EOF ;
    public final EObject entryRuleSliceMeta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSliceMeta = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:909:2: (iv_ruleSliceMeta= ruleSliceMeta EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:910:2: iv_ruleSliceMeta= ruleSliceMeta EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSliceMetaRule()); 
            }
            pushFollow(FOLLOW_ruleSliceMeta_in_entryRuleSliceMeta1603);
            iv_ruleSliceMeta=ruleSliceMeta();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSliceMeta; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSliceMeta1613); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:917:1: ruleSliceMeta returns [EObject current=null] : (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_SLICE ) ) this_C_PAREN_L_2= RULE_C_PAREN_L ( (lv_sliceChar_3_0= RULE_STRING ) ) this_C_PAREN_R_4= RULE_C_PAREN_R this_C_BRACKET_R_5= RULE_C_BRACKET_R ) ;
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
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:920:28: ( (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_SLICE ) ) this_C_PAREN_L_2= RULE_C_PAREN_L ( (lv_sliceChar_3_0= RULE_STRING ) ) this_C_PAREN_R_4= RULE_C_PAREN_R this_C_BRACKET_R_5= RULE_C_BRACKET_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:921:1: (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_SLICE ) ) this_C_PAREN_L_2= RULE_C_PAREN_L ( (lv_sliceChar_3_0= RULE_STRING ) ) this_C_PAREN_R_4= RULE_C_PAREN_R this_C_BRACKET_R_5= RULE_C_BRACKET_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:921:1: (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_SLICE ) ) this_C_PAREN_L_2= RULE_C_PAREN_L ( (lv_sliceChar_3_0= RULE_STRING ) ) this_C_PAREN_R_4= RULE_C_PAREN_R this_C_BRACKET_R_5= RULE_C_BRACKET_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:921:2: this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_SLICE ) ) this_C_PAREN_L_2= RULE_C_PAREN_L ( (lv_sliceChar_3_0= RULE_STRING ) ) this_C_PAREN_R_4= RULE_C_PAREN_R this_C_BRACKET_R_5= RULE_C_BRACKET_R
            {
            this_C_BRACKET_L_0=(Token)match(input,RULE_C_BRACKET_L,FOLLOW_RULE_C_BRACKET_L_in_ruleSliceMeta1649); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_BRACKET_L_0, grammarAccess.getSliceMetaAccess().getC_BRACKET_LTerminalRuleCall_0()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:925:1: ( (lv_prefix_1_0= RULE_C_SLICE ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:926:1: (lv_prefix_1_0= RULE_C_SLICE )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:926:1: (lv_prefix_1_0= RULE_C_SLICE )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:927:3: lv_prefix_1_0= RULE_C_SLICE
            {
            lv_prefix_1_0=(Token)match(input,RULE_C_SLICE,FOLLOW_RULE_C_SLICE_in_ruleSliceMeta1665); if (state.failed) return current;
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

            this_C_PAREN_L_2=(Token)match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_ruleSliceMeta1681); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_PAREN_L_2, grammarAccess.getSliceMetaAccess().getC_PAREN_LTerminalRuleCall_2()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:947:1: ( (lv_sliceChar_3_0= RULE_STRING ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:948:1: (lv_sliceChar_3_0= RULE_STRING )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:948:1: (lv_sliceChar_3_0= RULE_STRING )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:949:3: lv_sliceChar_3_0= RULE_STRING
            {
            lv_sliceChar_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSliceMeta1697); if (state.failed) return current;
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

            this_C_PAREN_R_4=(Token)match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_ruleSliceMeta1713); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_PAREN_R_4, grammarAccess.getSliceMetaAccess().getC_PAREN_RTerminalRuleCall_4()); 
                  
            }
            this_C_BRACKET_R_5=(Token)match(input,RULE_C_BRACKET_R,FOLLOW_RULE_C_BRACKET_R_in_ruleSliceMeta1723); if (state.failed) return current;
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:981:1: entryRuleFieldMetaKey returns [EObject current=null] : iv_ruleFieldMetaKey= ruleFieldMetaKey EOF ;
    public final EObject entryRuleFieldMetaKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldMetaKey = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:982:2: (iv_ruleFieldMetaKey= ruleFieldMetaKey EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:983:2: iv_ruleFieldMetaKey= ruleFieldMetaKey EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldMetaKeyRule()); 
            }
            pushFollow(FOLLOW_ruleFieldMetaKey_in_entryRuleFieldMetaKey1758);
            iv_ruleFieldMetaKey=ruleFieldMetaKey();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldMetaKey; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldMetaKey1768); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:990:1: ruleFieldMetaKey returns [EObject current=null] : ( (lv_fieldName_0_0= ruleTypeName ) ) ;
    public final EObject ruleFieldMetaKey() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_fieldName_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:993:28: ( ( (lv_fieldName_0_0= ruleTypeName ) ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:994:1: ( (lv_fieldName_0_0= ruleTypeName ) )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:994:1: ( (lv_fieldName_0_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:995:1: (lv_fieldName_0_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:995:1: (lv_fieldName_0_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:996:3: lv_fieldName_0_0= ruleTypeName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldMetaKeyAccess().getFieldNameTypeNameParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeName_in_ruleFieldMetaKey1813);
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


    // $ANTLR start "entryRuleEnum"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1020:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1021:2: (iv_ruleEnum= ruleEnum EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1022:2: iv_ruleEnum= ruleEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumRule()); 
            }
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum1848);
            iv_ruleEnum=ruleEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnum; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum1858); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1029:1: ruleEnum returns [EObject current=null] : ( ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_prefix_1_0= RULE_C_ENUM ) ) ( (lv_name_2_0= ruleTypeName ) ) this_C_BRACE_L_3= RULE_C_BRACE_L ( ( ( ( ruleEnumField ) )=> (lv_fields_4_0= ruleEnumField ) ) | ( (lv_comm_5_0= ruleOtherComent ) ) )* this_C_BRACE_R_6= RULE_C_BRACE_R ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_1_0=null;
        Token this_C_BRACE_L_3=null;
        Token this_C_BRACE_R_6=null;
        AntlrDatatypeRuleToken lv_comment_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_fields_4_0 = null;

        EObject lv_comm_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1032:28: ( ( ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_prefix_1_0= RULE_C_ENUM ) ) ( (lv_name_2_0= ruleTypeName ) ) this_C_BRACE_L_3= RULE_C_BRACE_L ( ( ( ( ruleEnumField ) )=> (lv_fields_4_0= ruleEnumField ) ) | ( (lv_comm_5_0= ruleOtherComent ) ) )* this_C_BRACE_R_6= RULE_C_BRACE_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1033:1: ( ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_prefix_1_0= RULE_C_ENUM ) ) ( (lv_name_2_0= ruleTypeName ) ) this_C_BRACE_L_3= RULE_C_BRACE_L ( ( ( ( ruleEnumField ) )=> (lv_fields_4_0= ruleEnumField ) ) | ( (lv_comm_5_0= ruleOtherComent ) ) )* this_C_BRACE_R_6= RULE_C_BRACE_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1033:1: ( ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_prefix_1_0= RULE_C_ENUM ) ) ( (lv_name_2_0= ruleTypeName ) ) this_C_BRACE_L_3= RULE_C_BRACE_L ( ( ( ( ruleEnumField ) )=> (lv_fields_4_0= ruleEnumField ) ) | ( (lv_comm_5_0= ruleOtherComent ) ) )* this_C_BRACE_R_6= RULE_C_BRACE_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1033:2: ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_prefix_1_0= RULE_C_ENUM ) ) ( (lv_name_2_0= ruleTypeName ) ) this_C_BRACE_L_3= RULE_C_BRACE_L ( ( ( ( ruleEnumField ) )=> (lv_fields_4_0= ruleEnumField ) ) | ( (lv_comm_5_0= ruleOtherComent ) ) )* this_C_BRACE_R_6= RULE_C_BRACE_R
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1033:2: ( (lv_comment_0_0= ruleTypeComment ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_COMMENT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1034:1: (lv_comment_0_0= ruleTypeComment )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1034:1: (lv_comment_0_0= ruleTypeComment )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1035:3: lv_comment_0_0= ruleTypeComment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnumAccess().getCommentTypeCommentParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeComment_in_ruleEnum1904);
                    lv_comment_0_0=ruleTypeComment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEnumRule());
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1051:3: ( (lv_prefix_1_0= RULE_C_ENUM ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1052:1: (lv_prefix_1_0= RULE_C_ENUM )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1052:1: (lv_prefix_1_0= RULE_C_ENUM )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1053:3: lv_prefix_1_0= RULE_C_ENUM
            {
            lv_prefix_1_0=(Token)match(input,RULE_C_ENUM,FOLLOW_RULE_C_ENUM_in_ruleEnum1922); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_prefix_1_0, grammarAccess.getEnumAccess().getPrefixC_ENUMTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"prefix",
                      		lv_prefix_1_0, 
                      		"C_ENUM");
              	    
            }

            }


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1069:2: ( (lv_name_2_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1070:1: (lv_name_2_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1070:1: (lv_name_2_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1071:3: lv_name_2_0= ruleTypeName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumAccess().getNameTypeNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeName_in_ruleEnum1948);
            lv_name_2_0=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEnumRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"TypeName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_C_BRACE_L_3=(Token)match(input,RULE_C_BRACE_L,FOLLOW_RULE_C_BRACE_L_in_ruleEnum1959); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_BRACE_L_3, grammarAccess.getEnumAccess().getC_BRACE_LTerminalRuleCall_3()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1091:1: ( ( ( ( ruleEnumField ) )=> (lv_fields_4_0= ruleEnumField ) ) | ( (lv_comm_5_0= ruleOtherComent ) ) )*
            loop18:
            do {
                int alt18=3;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1091:2: ( ( ( ruleEnumField ) )=> (lv_fields_4_0= ruleEnumField ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1091:2: ( ( ( ruleEnumField ) )=> (lv_fields_4_0= ruleEnumField ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1091:3: ( ( ruleEnumField ) )=> (lv_fields_4_0= ruleEnumField )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1096:1: (lv_fields_4_0= ruleEnumField )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1097:3: lv_fields_4_0= ruleEnumField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumAccess().getFieldsEnumFieldParserRuleCall_4_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEnumField_in_ruleEnum1990);
            	    lv_fields_4_0=ruleEnumField();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEnumRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fields",
            	              		lv_fields_4_0, 
            	              		"EnumField");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1114:6: ( (lv_comm_5_0= ruleOtherComent ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1114:6: ( (lv_comm_5_0= ruleOtherComent ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1115:1: (lv_comm_5_0= ruleOtherComent )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1115:1: (lv_comm_5_0= ruleOtherComent )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1116:3: lv_comm_5_0= ruleOtherComent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumAccess().getCommOtherComentParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOtherComent_in_ruleEnum2017);
            	    lv_comm_5_0=ruleOtherComent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEnumRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"comm",
            	              		lv_comm_5_0, 
            	              		"OtherComent");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            this_C_BRACE_R_6=(Token)match(input,RULE_C_BRACE_R,FOLLOW_RULE_C_BRACE_R_in_ruleEnum2030); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_BRACE_R_6, grammarAccess.getEnumAccess().getC_BRACE_RTerminalRuleCall_5()); 
                  
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
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumField"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1144:1: entryRuleEnumField returns [EObject current=null] : iv_ruleEnumField= ruleEnumField EOF ;
    public final EObject entryRuleEnumField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumField = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1145:2: (iv_ruleEnumField= ruleEnumField EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1146:2: iv_ruleEnumField= ruleEnumField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumFieldRule()); 
            }
            pushFollow(FOLLOW_ruleEnumField_in_entryRuleEnumField2065);
            iv_ruleEnumField=ruleEnumField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumField2075); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumField"


    // $ANTLR start "ruleEnumField"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1153:1: ruleEnumField returns [EObject current=null] : ( ( (lv_comment_0_0= ruleFieldComment ) )? ( (lv_meta_1_0= ruleDefaultMeta ) )? ( (lv_fieldName_2_0= ruleTypeName ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_fieldValue_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )? ) ;
    public final EObject ruleEnumField() throws RecognitionException {
        EObject current = null;

        Token this_C_EQUALS_3=null;
        Token lv_fieldValue_4_0=null;
        Token this_C_SEMICOLON_5=null;
        AntlrDatatypeRuleToken lv_comment_0_0 = null;

        EObject lv_meta_1_0 = null;

        AntlrDatatypeRuleToken lv_fieldName_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1156:28: ( ( ( (lv_comment_0_0= ruleFieldComment ) )? ( (lv_meta_1_0= ruleDefaultMeta ) )? ( (lv_fieldName_2_0= ruleTypeName ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_fieldValue_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1157:1: ( ( (lv_comment_0_0= ruleFieldComment ) )? ( (lv_meta_1_0= ruleDefaultMeta ) )? ( (lv_fieldName_2_0= ruleTypeName ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_fieldValue_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1157:1: ( ( (lv_comment_0_0= ruleFieldComment ) )? ( (lv_meta_1_0= ruleDefaultMeta ) )? ( (lv_fieldName_2_0= ruleTypeName ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_fieldValue_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1157:2: ( (lv_comment_0_0= ruleFieldComment ) )? ( (lv_meta_1_0= ruleDefaultMeta ) )? ( (lv_fieldName_2_0= ruleTypeName ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_fieldValue_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )?
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1157:2: ( (lv_comment_0_0= ruleFieldComment ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_COMMENT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1158:1: (lv_comment_0_0= ruleFieldComment )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1158:1: (lv_comment_0_0= ruleFieldComment )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1159:3: lv_comment_0_0= ruleFieldComment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnumFieldAccess().getCommentFieldCommentParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFieldComment_in_ruleEnumField2121);
                    lv_comment_0_0=ruleFieldComment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEnumFieldRule());
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1175:3: ( (lv_meta_1_0= ruleDefaultMeta ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_C_BRACKET_L) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1176:1: (lv_meta_1_0= ruleDefaultMeta )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1176:1: (lv_meta_1_0= ruleDefaultMeta )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1177:3: lv_meta_1_0= ruleDefaultMeta
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnumFieldAccess().getMetaDefaultMetaParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDefaultMeta_in_ruleEnumField2143);
                    lv_meta_1_0=ruleDefaultMeta();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEnumFieldRule());
                      	        }
                             		set(
                             			current, 
                             			"meta",
                              		lv_meta_1_0, 
                              		"DefaultMeta");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1193:3: ( (lv_fieldName_2_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1194:1: (lv_fieldName_2_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1194:1: (lv_fieldName_2_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1195:3: lv_fieldName_2_0= ruleTypeName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumFieldAccess().getFieldNameTypeNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeName_in_ruleEnumField2165);
            lv_fieldName_2_0=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEnumFieldRule());
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

            this_C_EQUALS_3=(Token)match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_ruleEnumField2176); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_EQUALS_3, grammarAccess.getEnumFieldAccess().getC_EQUALSTerminalRuleCall_3()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1215:1: ( (lv_fieldValue_4_0= RULE_STRING ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1216:1: (lv_fieldValue_4_0= RULE_STRING )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1216:1: (lv_fieldValue_4_0= RULE_STRING )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1217:3: lv_fieldValue_4_0= RULE_STRING
            {
            lv_fieldValue_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumField2192); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_fieldValue_4_0, grammarAccess.getEnumFieldAccess().getFieldValueSTRINGTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"fieldValue",
                      		lv_fieldValue_4_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1233:2: (this_C_SEMICOLON_5= RULE_C_SEMICOLON )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_C_SEMICOLON) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1233:3: this_C_SEMICOLON_5= RULE_C_SEMICOLON
                    {
                    this_C_SEMICOLON_5=(Token)match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_ruleEnumField2209); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_SEMICOLON_5, grammarAccess.getEnumFieldAccess().getC_SEMICOLONTerminalRuleCall_5()); 
                          
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
    // $ANTLR end "ruleEnumField"


    // $ANTLR start "entryRuleDefaultMeta"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1245:1: entryRuleDefaultMeta returns [EObject current=null] : iv_ruleDefaultMeta= ruleDefaultMeta EOF ;
    public final EObject entryRuleDefaultMeta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultMeta = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1246:2: (iv_ruleDefaultMeta= ruleDefaultMeta EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1247:2: iv_ruleDefaultMeta= ruleDefaultMeta EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultMetaRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultMeta_in_entryRuleDefaultMeta2246);
            iv_ruleDefaultMeta=ruleDefaultMeta();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultMeta; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultMeta2256); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDefaultMeta"


    // $ANTLR start "ruleDefaultMeta"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1254:1: ruleDefaultMeta returns [EObject current=null] : (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_DEFAULT ) ) (this_C_PAREN_L_2= RULE_C_PAREN_L this_C_PAREN_R_3= RULE_C_PAREN_R )? this_C_BRACKET_R_4= RULE_C_BRACKET_R ) ;
    public final EObject ruleDefaultMeta() throws RecognitionException {
        EObject current = null;

        Token this_C_BRACKET_L_0=null;
        Token lv_prefix_1_0=null;
        Token this_C_PAREN_L_2=null;
        Token this_C_PAREN_R_3=null;
        Token this_C_BRACKET_R_4=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1257:28: ( (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_DEFAULT ) ) (this_C_PAREN_L_2= RULE_C_PAREN_L this_C_PAREN_R_3= RULE_C_PAREN_R )? this_C_BRACKET_R_4= RULE_C_BRACKET_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1258:1: (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_DEFAULT ) ) (this_C_PAREN_L_2= RULE_C_PAREN_L this_C_PAREN_R_3= RULE_C_PAREN_R )? this_C_BRACKET_R_4= RULE_C_BRACKET_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1258:1: (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_DEFAULT ) ) (this_C_PAREN_L_2= RULE_C_PAREN_L this_C_PAREN_R_3= RULE_C_PAREN_R )? this_C_BRACKET_R_4= RULE_C_BRACKET_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1258:2: this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= RULE_C_DEFAULT ) ) (this_C_PAREN_L_2= RULE_C_PAREN_L this_C_PAREN_R_3= RULE_C_PAREN_R )? this_C_BRACKET_R_4= RULE_C_BRACKET_R
            {
            this_C_BRACKET_L_0=(Token)match(input,RULE_C_BRACKET_L,FOLLOW_RULE_C_BRACKET_L_in_ruleDefaultMeta2292); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_BRACKET_L_0, grammarAccess.getDefaultMetaAccess().getC_BRACKET_LTerminalRuleCall_0()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1262:1: ( (lv_prefix_1_0= RULE_C_DEFAULT ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1263:1: (lv_prefix_1_0= RULE_C_DEFAULT )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1263:1: (lv_prefix_1_0= RULE_C_DEFAULT )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1264:3: lv_prefix_1_0= RULE_C_DEFAULT
            {
            lv_prefix_1_0=(Token)match(input,RULE_C_DEFAULT,FOLLOW_RULE_C_DEFAULT_in_ruleDefaultMeta2308); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_prefix_1_0, grammarAccess.getDefaultMetaAccess().getPrefixC_DEFAULTTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDefaultMetaRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"prefix",
                      		lv_prefix_1_0, 
                      		"C_DEFAULT");
              	    
            }

            }


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1280:2: (this_C_PAREN_L_2= RULE_C_PAREN_L this_C_PAREN_R_3= RULE_C_PAREN_R )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_C_PAREN_L) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1280:3: this_C_PAREN_L_2= RULE_C_PAREN_L this_C_PAREN_R_3= RULE_C_PAREN_R
                    {
                    this_C_PAREN_L_2=(Token)match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_ruleDefaultMeta2325); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_PAREN_L_2, grammarAccess.getDefaultMetaAccess().getC_PAREN_LTerminalRuleCall_2_0()); 
                          
                    }
                    this_C_PAREN_R_3=(Token)match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_ruleDefaultMeta2335); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_PAREN_R_3, grammarAccess.getDefaultMetaAccess().getC_PAREN_RTerminalRuleCall_2_1()); 
                          
                    }

                    }
                    break;

            }

            this_C_BRACKET_R_4=(Token)match(input,RULE_C_BRACKET_R,FOLLOW_RULE_C_BRACKET_R_in_ruleDefaultMeta2347); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_BRACKET_R_4, grammarAccess.getDefaultMetaAccess().getC_BRACKET_RTerminalRuleCall_3()); 
                  
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
    // $ANTLR end "ruleDefaultMeta"


    // $ANTLR start "entryRuleTypeComment"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1300:1: entryRuleTypeComment returns [String current=null] : iv_ruleTypeComment= ruleTypeComment EOF ;
    public final String entryRuleTypeComment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeComment = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1301:2: (iv_ruleTypeComment= ruleTypeComment EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1302:2: iv_ruleTypeComment= ruleTypeComment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeCommentRule()); 
            }
            pushFollow(FOLLOW_ruleTypeComment_in_entryRuleTypeComment2383);
            iv_ruleTypeComment=ruleTypeComment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeComment.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeComment2394); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1309:1: ruleTypeComment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_COMMENT_0= RULE_COMMENT ;
    public final AntlrDatatypeRuleToken ruleTypeComment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_COMMENT_0=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1312:28: (this_COMMENT_0= RULE_COMMENT )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1313:5: this_COMMENT_0= RULE_COMMENT
            {
            this_COMMENT_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleTypeComment2433); if (state.failed) return current;
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1328:1: entryRuleFieldComment returns [String current=null] : iv_ruleFieldComment= ruleFieldComment EOF ;
    public final String entryRuleFieldComment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldComment = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1329:2: (iv_ruleFieldComment= ruleFieldComment EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1330:2: iv_ruleFieldComment= ruleFieldComment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldCommentRule()); 
            }
            pushFollow(FOLLOW_ruleFieldComment_in_entryRuleFieldComment2478);
            iv_ruleFieldComment=ruleFieldComment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldComment.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldComment2489); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1337:1: ruleFieldComment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_COMMENT_0= RULE_COMMENT ;
    public final AntlrDatatypeRuleToken ruleFieldComment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_COMMENT_0=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1340:28: (this_COMMENT_0= RULE_COMMENT )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1341:5: this_COMMENT_0= RULE_COMMENT
            {
            this_COMMENT_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleFieldComment2528); if (state.failed) return current;
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1356:1: entryRuleOtherComent returns [EObject current=null] : iv_ruleOtherComent= ruleOtherComent EOF ;
    public final EObject entryRuleOtherComent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherComent = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1357:2: (iv_ruleOtherComent= ruleOtherComent EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1358:2: iv_ruleOtherComent= ruleOtherComent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOtherComentRule()); 
            }
            pushFollow(FOLLOW_ruleOtherComent_in_entryRuleOtherComent2572);
            iv_ruleOtherComent=ruleOtherComent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOtherComent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherComent2582); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1365:1: ruleOtherComent returns [EObject current=null] : ( (lv_comm_0_0= RULE_COMMENT ) ) ;
    public final EObject ruleOtherComent() throws RecognitionException {
        EObject current = null;

        Token lv_comm_0_0=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1368:28: ( ( (lv_comm_0_0= RULE_COMMENT ) ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1369:1: ( (lv_comm_0_0= RULE_COMMENT ) )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1369:1: ( (lv_comm_0_0= RULE_COMMENT ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1370:1: (lv_comm_0_0= RULE_COMMENT )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1370:1: (lv_comm_0_0= RULE_COMMENT )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1371:3: lv_comm_0_0= RULE_COMMENT
            {
            lv_comm_0_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleOtherComent2623); if (state.failed) return current;
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1395:1: entryRulePackName returns [String current=null] : iv_rulePackName= rulePackName EOF ;
    public final String entryRulePackName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackName = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1396:2: (iv_rulePackName= rulePackName EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1397:2: iv_rulePackName= rulePackName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackNameRule()); 
            }
            pushFollow(FOLLOW_rulePackName_in_entryRulePackName2664);
            iv_rulePackName=rulePackName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackName2675); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1404:1: rulePackName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TypeName_0= ruleTypeName (kw= '.' this_TypeName_2= ruleTypeName )* ) ;
    public final AntlrDatatypeRuleToken rulePackName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeName_0 = null;

        AntlrDatatypeRuleToken this_TypeName_2 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1407:28: ( (this_TypeName_0= ruleTypeName (kw= '.' this_TypeName_2= ruleTypeName )* ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1408:1: (this_TypeName_0= ruleTypeName (kw= '.' this_TypeName_2= ruleTypeName )* )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1408:1: (this_TypeName_0= ruleTypeName (kw= '.' this_TypeName_2= ruleTypeName )* )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1409:5: this_TypeName_0= ruleTypeName (kw= '.' this_TypeName_2= ruleTypeName )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPackNameAccess().getTypeNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTypeName_in_rulePackName2722);
            this_TypeName_0=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_TypeName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1419:1: (kw= '.' this_TypeName_2= ruleTypeName )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==33) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1420:2: kw= '.' this_TypeName_2= ruleTypeName
            	    {
            	    kw=(Token)match(input,33,FOLLOW_33_in_rulePackName2741); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getPackNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getPackNameAccess().getTypeNameParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleTypeName_in_rulePackName2763);
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
            	    break loop23;
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1444:1: entryRuleTypeName returns [String current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final String entryRuleTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeName = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1445:2: (iv_ruleTypeName= ruleTypeName EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1446:2: iv_ruleTypeName= ruleTypeName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameRule()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_entryRuleTypeName2811);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeName2822); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1453:1: ruleTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_C_INPUT_0= RULE_C_INPUT | this_C_MAIN_1= RULE_C_MAIN | this_C_DEFAULT_2= RULE_C_DEFAULT | this_C_TYPE_3= RULE_C_TYPE | this_C_ENUM_4= RULE_C_ENUM | this_C_INT_5= RULE_C_INT | this_C_UINT_6= RULE_C_UINT | this_C_BOOL_7= RULE_C_BOOL | this_C_NUMBER_8= RULE_C_NUMBER | this_C_STRING_9= RULE_C_STRING | this_C_LIST_10= RULE_C_LIST | this_C_SLICE_11= RULE_C_SLICE | this_NAME_12= RULE_NAME ) ;
    public final AntlrDatatypeRuleToken ruleTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_C_INPUT_0=null;
        Token this_C_MAIN_1=null;
        Token this_C_DEFAULT_2=null;
        Token this_C_TYPE_3=null;
        Token this_C_ENUM_4=null;
        Token this_C_INT_5=null;
        Token this_C_UINT_6=null;
        Token this_C_BOOL_7=null;
        Token this_C_NUMBER_8=null;
        Token this_C_STRING_9=null;
        Token this_C_LIST_10=null;
        Token this_C_SLICE_11=null;
        Token this_NAME_12=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1456:28: ( (this_C_INPUT_0= RULE_C_INPUT | this_C_MAIN_1= RULE_C_MAIN | this_C_DEFAULT_2= RULE_C_DEFAULT | this_C_TYPE_3= RULE_C_TYPE | this_C_ENUM_4= RULE_C_ENUM | this_C_INT_5= RULE_C_INT | this_C_UINT_6= RULE_C_UINT | this_C_BOOL_7= RULE_C_BOOL | this_C_NUMBER_8= RULE_C_NUMBER | this_C_STRING_9= RULE_C_STRING | this_C_LIST_10= RULE_C_LIST | this_C_SLICE_11= RULE_C_SLICE | this_NAME_12= RULE_NAME ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1457:1: (this_C_INPUT_0= RULE_C_INPUT | this_C_MAIN_1= RULE_C_MAIN | this_C_DEFAULT_2= RULE_C_DEFAULT | this_C_TYPE_3= RULE_C_TYPE | this_C_ENUM_4= RULE_C_ENUM | this_C_INT_5= RULE_C_INT | this_C_UINT_6= RULE_C_UINT | this_C_BOOL_7= RULE_C_BOOL | this_C_NUMBER_8= RULE_C_NUMBER | this_C_STRING_9= RULE_C_STRING | this_C_LIST_10= RULE_C_LIST | this_C_SLICE_11= RULE_C_SLICE | this_NAME_12= RULE_NAME )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1457:1: (this_C_INPUT_0= RULE_C_INPUT | this_C_MAIN_1= RULE_C_MAIN | this_C_DEFAULT_2= RULE_C_DEFAULT | this_C_TYPE_3= RULE_C_TYPE | this_C_ENUM_4= RULE_C_ENUM | this_C_INT_5= RULE_C_INT | this_C_UINT_6= RULE_C_UINT | this_C_BOOL_7= RULE_C_BOOL | this_C_NUMBER_8= RULE_C_NUMBER | this_C_STRING_9= RULE_C_STRING | this_C_LIST_10= RULE_C_LIST | this_C_SLICE_11= RULE_C_SLICE | this_NAME_12= RULE_NAME )
            int alt24=13;
            switch ( input.LA(1) ) {
            case RULE_C_INPUT:
                {
                alt24=1;
                }
                break;
            case RULE_C_MAIN:
                {
                alt24=2;
                }
                break;
            case RULE_C_DEFAULT:
                {
                alt24=3;
                }
                break;
            case RULE_C_TYPE:
                {
                alt24=4;
                }
                break;
            case RULE_C_ENUM:
                {
                alt24=5;
                }
                break;
            case RULE_C_INT:
                {
                alt24=6;
                }
                break;
            case RULE_C_UINT:
                {
                alt24=7;
                }
                break;
            case RULE_C_BOOL:
                {
                alt24=8;
                }
                break;
            case RULE_C_NUMBER:
                {
                alt24=9;
                }
                break;
            case RULE_C_STRING:
                {
                alt24=10;
                }
                break;
            case RULE_C_LIST:
                {
                alt24=11;
                }
                break;
            case RULE_C_SLICE:
                {
                alt24=12;
                }
                break;
            case RULE_NAME:
                {
                alt24=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1457:6: this_C_INPUT_0= RULE_C_INPUT
                    {
                    this_C_INPUT_0=(Token)match(input,RULE_C_INPUT,FOLLOW_RULE_C_INPUT_in_ruleTypeName2862); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_INPUT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_INPUT_0, grammarAccess.getTypeNameAccess().getC_INPUTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1465:10: this_C_MAIN_1= RULE_C_MAIN
                    {
                    this_C_MAIN_1=(Token)match(input,RULE_C_MAIN,FOLLOW_RULE_C_MAIN_in_ruleTypeName2888); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_MAIN_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_MAIN_1, grammarAccess.getTypeNameAccess().getC_MAINTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1473:10: this_C_DEFAULT_2= RULE_C_DEFAULT
                    {
                    this_C_DEFAULT_2=(Token)match(input,RULE_C_DEFAULT,FOLLOW_RULE_C_DEFAULT_in_ruleTypeName2914); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_DEFAULT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_DEFAULT_2, grammarAccess.getTypeNameAccess().getC_DEFAULTTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1481:10: this_C_TYPE_3= RULE_C_TYPE
                    {
                    this_C_TYPE_3=(Token)match(input,RULE_C_TYPE,FOLLOW_RULE_C_TYPE_in_ruleTypeName2940); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_TYPE_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_TYPE_3, grammarAccess.getTypeNameAccess().getC_TYPETerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1489:10: this_C_ENUM_4= RULE_C_ENUM
                    {
                    this_C_ENUM_4=(Token)match(input,RULE_C_ENUM,FOLLOW_RULE_C_ENUM_in_ruleTypeName2966); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_ENUM_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_ENUM_4, grammarAccess.getTypeNameAccess().getC_ENUMTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1497:10: this_C_INT_5= RULE_C_INT
                    {
                    this_C_INT_5=(Token)match(input,RULE_C_INT,FOLLOW_RULE_C_INT_in_ruleTypeName2992); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_INT_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_INT_5, grammarAccess.getTypeNameAccess().getC_INTTerminalRuleCall_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1505:10: this_C_UINT_6= RULE_C_UINT
                    {
                    this_C_UINT_6=(Token)match(input,RULE_C_UINT,FOLLOW_RULE_C_UINT_in_ruleTypeName3018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_UINT_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_UINT_6, grammarAccess.getTypeNameAccess().getC_UINTTerminalRuleCall_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1513:10: this_C_BOOL_7= RULE_C_BOOL
                    {
                    this_C_BOOL_7=(Token)match(input,RULE_C_BOOL,FOLLOW_RULE_C_BOOL_in_ruleTypeName3044); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_BOOL_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_BOOL_7, grammarAccess.getTypeNameAccess().getC_BOOLTerminalRuleCall_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1521:10: this_C_NUMBER_8= RULE_C_NUMBER
                    {
                    this_C_NUMBER_8=(Token)match(input,RULE_C_NUMBER,FOLLOW_RULE_C_NUMBER_in_ruleTypeName3070); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_NUMBER_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_NUMBER_8, grammarAccess.getTypeNameAccess().getC_NUMBERTerminalRuleCall_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1529:10: this_C_STRING_9= RULE_C_STRING
                    {
                    this_C_STRING_9=(Token)match(input,RULE_C_STRING,FOLLOW_RULE_C_STRING_in_ruleTypeName3096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_STRING_9);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_STRING_9, grammarAccess.getTypeNameAccess().getC_STRINGTerminalRuleCall_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1537:10: this_C_LIST_10= RULE_C_LIST
                    {
                    this_C_LIST_10=(Token)match(input,RULE_C_LIST,FOLLOW_RULE_C_LIST_in_ruleTypeName3122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_LIST_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_LIST_10, grammarAccess.getTypeNameAccess().getC_LISTTerminalRuleCall_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1545:10: this_C_SLICE_11= RULE_C_SLICE
                    {
                    this_C_SLICE_11=(Token)match(input,RULE_C_SLICE,FOLLOW_RULE_C_SLICE_in_ruleTypeName3148); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_SLICE_11);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_SLICE_11, grammarAccess.getTypeNameAccess().getC_SLICETerminalRuleCall_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1553:10: this_NAME_12= RULE_NAME
                    {
                    this_NAME_12=(Token)match(input,RULE_NAME,FOLLOW_RULE_NAME_in_ruleTypeName3174); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NAME_12);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NAME_12, grammarAccess.getTypeNameAccess().getNAMETerminalRuleCall_12()); 
                          
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
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:214:7: ( ( ruleEnum ) )
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:215:1: ( ruleEnum )
        {
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:215:1: ( ruleEnum )
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:216:1: ruleEnum
        {
        pushFollow(FOLLOW_ruleEnum_in_synpred2_InternalCfg312);
        ruleEnum();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalCfg

    // $ANTLR start synpred3_InternalCfg
    public final void synpred3_InternalCfg_fragment() throws RecognitionException {   
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:510:3: ( ( ruleField ) )
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:511:1: ( ruleField )
        {
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:511:1: ( ruleField )
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:512:1: ruleField
        {
        pushFollow(FOLLOW_ruleField_in_synpred3_InternalCfg841);
        ruleField();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalCfg

    // $ANTLR start synpred4_InternalCfg
    public final void synpred4_InternalCfg_fragment() throws RecognitionException {   
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1091:3: ( ( ruleEnumField ) )
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1092:1: ( ruleEnumField )
        {
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1092:1: ( ruleEnumField )
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1093:1: ruleEnumField
        {
        pushFollow(FOLLOW_ruleEnumField_in_synpred4_InternalCfg1973);
        ruleEnumField();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalCfg

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
    public final boolean synpred3_InternalCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalCfg_fragment(); // can never throw exception
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
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA1_eotS =
        "\52\uffff";
    static final String DFA1_eofS =
        "\3\uffff\1\24\1\30\17\24\1\uffff\2\30\6\uffff\15\24";
    static final String DFA1_minS =
        "\2\4\1\5\1\4\1\6\17\4\1\uffff\2\7\3\uffff\1\4\2\5\15\4";
    static final String DFA1_maxS =
        "\2\26\1\5\1\34\1\26\15\41\2\26\1\uffff\2\26\3\uffff\1\34\2\11\15"+
        "\41";
    static final String DFA1_acceptS =
        "\24\uffff\1\3\2\uffff\1\1\1\4\1\2\20\uffff";
    static final String DFA1_specialS =
        "\52\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\2\uffff\1\3\16\uffff\1\1",
            "\1\2\2\uffff\1\3\16\uffff\1\1",
            "\1\4",
            "\1\5\1\uffff\1\22\1\uffff\1\10\2\uffff\1\24\1\6\4\uffff\1"+
            "\17\1\uffff\1\20\1\11\1\7\1\23\1\12\1\13\1\14\1\15\1\16\1\21",
            "\1\25\1\27\1\30\2\uffff\1\30\10\uffff\1\30\1\uffff\1\26",
            "\2\31\1\22\1\uffff\1\24\2\uffff\1\24\10\uffff\1\24\1\uffff"+
            "\1\23\12\uffff\1\32",
            "\1\31\1\uffff\1\22\1\uffff\1\24\2\uffff\1\24\10\uffff\1\24"+
            "\1\uffff\1\23\12\uffff\1\32",
            "\1\31\1\uffff\1\22\1\uffff\1\24\2\uffff\1\24\10\uffff\1\24"+
            "\1\uffff\1\23\12\uffff\1\32",
            "\1\33\1\uffff\1\22\1\uffff\1\24\2\uffff\2\24\4\uffff\1\24"+
            "\1\uffff\3\24\1\23\6\24\4\uffff\1\32",
            "\1\34\1\uffff\1\22\1\uffff\1\24\2\uffff\2\24\4\uffff\1\24"+
            "\1\uffff\3\24\1\23\6\24\4\uffff\1\32",
            "\1\31\1\uffff\1\22\1\uffff\1\24\2\uffff\1\24\10\uffff\1\24"+
            "\1\uffff\1\23\12\uffff\1\32",
            "\1\31\1\uffff\1\22\1\uffff\1\24\2\uffff\1\24\10\uffff\1\24"+
            "\1\uffff\1\23\12\uffff\1\32",
            "\1\31\1\uffff\1\22\1\uffff\1\24\2\uffff\1\24\10\uffff\1\24"+
            "\1\uffff\1\23\12\uffff\1\32",
            "\1\31\1\uffff\1\22\1\uffff\1\24\2\uffff\1\24\10\uffff\1\24"+
            "\1\uffff\1\23\12\uffff\1\32",
            "\1\31\1\uffff\1\22\1\uffff\1\24\2\uffff\1\24\10\uffff\1\24"+
            "\1\uffff\1\23\12\uffff\1\32",
            "\1\31\1\uffff\1\22\1\uffff\1\24\2\uffff\1\24\10\uffff\1\24"+
            "\1\uffff\1\23\12\uffff\1\32",
            "\1\31\1\uffff\1\22\1\uffff\1\24\2\uffff\1\24\10\uffff\1\24"+
            "\1\uffff\1\23\12\uffff\1\32",
            "\1\31\1\uffff\1\22\1\uffff\1\24\2\uffff\1\24\10\uffff\1\24"+
            "\1\uffff\1\23\12\uffff\1\32",
            "\1\31\3\uffff\1\24\2\uffff\1\24\10\uffff\1\24\1\uffff\1\23",
            "\1\31\3\uffff\1\24\2\uffff\1\24\10\uffff\1\24\1\uffff\1\23",
            "",
            "\1\27\1\30\2\uffff\1\30\10\uffff\1\30\1\uffff\1\26",
            "\1\27\1\30\2\uffff\1\30\10\uffff\1\30\1\uffff\1\26",
            "",
            "",
            "",
            "\1\35\3\uffff\1\40\3\uffff\1\36\4\uffff\1\47\1\uffff\1\50"+
            "\1\41\1\37\1\uffff\1\42\1\43\1\44\1\45\1\46\1\51",
            "\1\31\3\uffff\1\24",
            "\1\31\3\uffff\1\24",
            "\1\31\1\uffff\1\22\1\uffff\1\24\2\uffff\1\24\10\uffff\1\24"+
            "\1\uffff\1\23\12\uffff\1\32",
            "\1\31\1\uffff\1\22\1\uffff\1\24\2\uffff\1\24\10\uffff\1\24"+
            "\1\uffff\1\23\12\uffff\1\32",
            "\1\31\1\uffff\1\22\1\uffff\1\24\2\uffff\1\24\10\uffff\1\24"+
            "\1\uffff\1\23\12\uffff\1\32",
            "\1\31\1\uffff\1\22\1\uffff\1\24\2\uffff\1\24\10\uffff\1\24"+
            "\1\uffff\1\23\12\uffff\1\32",
            "\1\31\1\uffff\1\22\1\uffff\1\24\2\uffff\1\24\10\uffff\1\24"+
            "\1\uffff\1\23\12\uffff\1\32",
            "\1\31\1\uffff\1\22\1\uffff\1\24\2\uffff\1\24\10\uffff\1\24"+
            "\1\uffff\1\23\12\uffff\1\32",
            "\1\31\1\uffff\1\22\1\uffff\1\24\2\uffff\1\24\10\uffff\1\24"+
            "\1\uffff\1\23\12\uffff\1\32",
            "\1\31\1\uffff\1\22\1\uffff\1\24\2\uffff\1\24\10\uffff\1\24"+
            "\1\uffff\1\23\12\uffff\1\32",
            "\1\31\1\uffff\1\22\1\uffff\1\24\2\uffff\1\24\10\uffff\1\24"+
            "\1\uffff\1\23\12\uffff\1\32",
            "\1\31\1\uffff\1\22\1\uffff\1\24\2\uffff\1\24\10\uffff\1\24"+
            "\1\uffff\1\23\12\uffff\1\32",
            "\1\31\1\uffff\1\22\1\uffff\1\24\2\uffff\1\24\10\uffff\1\24"+
            "\1\uffff\1\23\12\uffff\1\32",
            "\1\31\1\uffff\1\22\1\uffff\1\24\2\uffff\1\24\10\uffff\1\24"+
            "\1\uffff\1\23\12\uffff\1\32",
            "\1\31\1\uffff\1\22\1\uffff\1\24\2\uffff\1\24\10\uffff\1\24"+
            "\1\uffff\1\23\12\uffff\1\32"
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
    static final String DFA6_eotS =
        "\14\uffff";
    static final String DFA6_eofS =
        "\1\5\1\2\1\uffff\2\2\7\uffff";
    static final String DFA6_minS =
        "\2\4\1\uffff\2\4\1\uffff\2\4\2\5\2\4";
    static final String DFA6_maxS =
        "\1\34\1\41\1\uffff\2\41\1\uffff\2\34\2\11\2\34";
    static final String DFA6_acceptS =
        "\2\uffff\1\1\2\uffff\1\2\6\uffff";
    static final String DFA6_specialS =
        "\14\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\1\uffff\1\5\1\uffff\1\3\2\uffff\1\5\1\2\4\uffff\1\2\1"+
            "\uffff\1\2\1\4\1\2\1\5\6\2",
            "\1\2\1\5\1\2\1\uffff\1\2\2\uffff\1\2\10\uffff\1\2\1\uffff"+
            "\1\2\12\uffff\1\2",
            "",
            "\1\10\1\uffff\1\2\1\uffff\1\6\2\uffff\1\2\1\5\4\uffff\1\5"+
            "\1\uffff\1\5\1\7\1\5\1\2\6\5\4\uffff\1\2",
            "\1\11\1\uffff\1\2\1\uffff\1\12\2\uffff\1\2\1\5\4\uffff\1\5"+
            "\1\uffff\1\5\1\13\1\5\1\2\6\5\4\uffff\1\2",
            "",
            "\1\2\3\uffff\1\2\1\5\2\uffff\1\2\4\uffff\1\2\1\uffff\3\2\1"+
            "\uffff\6\2",
            "\1\2\3\uffff\1\2\1\5\2\uffff\1\2\4\uffff\1\2\1\uffff\3\2\1"+
            "\uffff\6\2",
            "\1\2\3\uffff\1\5",
            "\1\2\3\uffff\1\5",
            "\1\2\3\uffff\1\2\1\5\2\uffff\1\2\4\uffff\1\2\1\uffff\3\2\1"+
            "\uffff\6\2",
            "\1\2\3\uffff\1\2\1\5\2\uffff\1\2\4\uffff\1\2\1\uffff\3\2\1"+
            "\uffff\6\2"
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "391:2: ( (lv_pack_2_0= rulePackName ) )?";
        }
    }
    static final String DFA10_eotS =
        "\22\uffff";
    static final String DFA10_eofS =
        "\22\uffff";
    static final String DFA10_minS =
        "\1\4\1\uffff\1\0\17\uffff";
    static final String DFA10_maxS =
        "\1\34\1\uffff\1\0\17\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\3\1\uffff\16\1\1\2";
    static final String DFA10_specialS =
        "\1\0\1\uffff\1\1\17\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\4\3\uffff\1\7\1\uffff\1\1\1\3\1\5\4\uffff\1\16\1\uffff\1"+
            "\17\1\10\1\6\1\2\1\11\1\12\1\13\1\14\1\15\1\20",
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
            return "()* loopback of 510:1: ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )*";
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

                        else if ( (LA10_0==RULE_C_BRACKET_L) && (synpred3_InternalCfg())) {s = 3;}

                        else if ( (LA10_0==RULE_C_INPUT) && (synpred3_InternalCfg())) {s = 4;}

                        else if ( (LA10_0==RULE_C_MAIN) && (synpred3_InternalCfg())) {s = 5;}

                        else if ( (LA10_0==RULE_C_DEFAULT) && (synpred3_InternalCfg())) {s = 6;}

                        else if ( (LA10_0==RULE_C_TYPE) && (synpred3_InternalCfg())) {s = 7;}

                        else if ( (LA10_0==RULE_C_ENUM) && (synpred3_InternalCfg())) {s = 8;}

                        else if ( (LA10_0==RULE_C_INT) && (synpred3_InternalCfg())) {s = 9;}

                        else if ( (LA10_0==RULE_C_UINT) && (synpred3_InternalCfg())) {s = 10;}

                        else if ( (LA10_0==RULE_C_BOOL) && (synpred3_InternalCfg())) {s = 11;}

                        else if ( (LA10_0==RULE_C_NUMBER) && (synpred3_InternalCfg())) {s = 12;}

                        else if ( (LA10_0==RULE_C_STRING) && (synpred3_InternalCfg())) {s = 13;}

                        else if ( (LA10_0==RULE_C_LIST) && (synpred3_InternalCfg())) {s = 14;}

                        else if ( (LA10_0==RULE_C_SLICE) && (synpred3_InternalCfg())) {s = 15;}

                        else if ( (LA10_0==RULE_NAME) && (synpred3_InternalCfg())) {s = 16;}

                         
                        input.seek(index10_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalCfg()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
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
    static final String DFA18_eotS =
        "\22\uffff";
    static final String DFA18_eofS =
        "\22\uffff";
    static final String DFA18_minS =
        "\1\4\1\uffff\1\0\17\uffff";
    static final String DFA18_maxS =
        "\1\34\1\uffff\1\0\17\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\3\1\uffff\16\1\1\2";
    static final String DFA18_specialS =
        "\1\0\1\uffff\1\1\17\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\4\3\uffff\1\7\1\uffff\1\1\1\3\1\5\4\uffff\1\16\1\uffff\1"+
            "\17\1\10\1\6\1\2\1\11\1\12\1\13\1\14\1\15\1\20",
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
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "()* loopback of 1091:1: ( ( ( ( ruleEnumField ) )=> (lv_fields_4_0= ruleEnumField ) ) | ( (lv_comm_5_0= ruleOtherComent ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_0 = input.LA(1);

                         
                        int index18_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_0==RULE_C_BRACE_R) ) {s = 1;}

                        else if ( (LA18_0==RULE_COMMENT) ) {s = 2;}

                        else if ( (LA18_0==RULE_C_BRACKET_L) && (synpred4_InternalCfg())) {s = 3;}

                        else if ( (LA18_0==RULE_C_INPUT) && (synpred4_InternalCfg())) {s = 4;}

                        else if ( (LA18_0==RULE_C_MAIN) && (synpred4_InternalCfg())) {s = 5;}

                        else if ( (LA18_0==RULE_C_DEFAULT) && (synpred4_InternalCfg())) {s = 6;}

                        else if ( (LA18_0==RULE_C_TYPE) && (synpred4_InternalCfg())) {s = 7;}

                        else if ( (LA18_0==RULE_C_ENUM) && (synpred4_InternalCfg())) {s = 8;}

                        else if ( (LA18_0==RULE_C_INT) && (synpred4_InternalCfg())) {s = 9;}

                        else if ( (LA18_0==RULE_C_UINT) && (synpred4_InternalCfg())) {s = 10;}

                        else if ( (LA18_0==RULE_C_BOOL) && (synpred4_InternalCfg())) {s = 11;}

                        else if ( (LA18_0==RULE_C_NUMBER) && (synpred4_InternalCfg())) {s = 12;}

                        else if ( (LA18_0==RULE_C_STRING) && (synpred4_InternalCfg())) {s = 13;}

                        else if ( (LA18_0==RULE_C_LIST) && (synpred4_InternalCfg())) {s = 14;}

                        else if ( (LA18_0==RULE_C_SLICE) && (synpred4_InternalCfg())) {s = 15;}

                        else if ( (LA18_0==RULE_NAME) && (synpred4_InternalCfg())) {s = 16;}

                         
                        input.seek(index18_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_2 = input.LA(1);

                         
                        int index18_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalCfg()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index18_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleXML2_in_entryRuleXML275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXML285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputDef_in_ruleXML2133 = new BitSet(new long[]{0x0000000000400080L});
    public static final BitSet FOLLOW_rulePackDef_in_ruleXML2154 = new BitSet(new long[]{0x0000000000500902L});
    public static final BitSet FOLLOW_rulePackDef_in_ruleXML2183 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_ruleInputDef_in_ruleXML2204 = new BitSet(new long[]{0x0000000000500902L});
    public static final BitSet FOLLOW_rulePackDef_in_ruleXML2232 = new BitSet(new long[]{0x0000000000500902L});
    public static final BitSet FOLLOW_ruleInputDef_in_ruleXML2259 = new BitSet(new long[]{0x0000000000500902L});
    public static final BitSet FOLLOW_ruleType_in_ruleXML2292 = new BitSet(new long[]{0x0000000000500902L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleXML2329 = new BitSet(new long[]{0x0000000000500902L});
    public static final BitSet FOLLOW_ruleOtherComent_in_ruleXML2356 = new BitSet(new long[]{0x0000000000500902L});
    public static final BitSet FOLLOW_ruleInputDef_in_entryRuleInputDef394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputDef404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_ruleInputDef450 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_RULE_C_INPUT_in_ruleInputDef468 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInputDef490 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_ruleInputDef507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackDef_in_entryRulePackDef544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackDef554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_rulePackDef600 = new BitSet(new long[]{0x0000000000400080L});
    public static final BitSet FOLLOW_RULE_C_PACKAGE_in_rulePackDef618 = new BitSet(new long[]{0x000000001FBA1152L});
    public static final BitSet FOLLOW_rulePackName_in_rulePackDef644 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_rulePackDef657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeComment_in_ruleType750 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_ruleEnter_in_ruleType772 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_C_TYPE_in_ruleType790 = new BitSet(new long[]{0x000000001FBA1110L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleType816 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_C_BRACE_L_in_ruleType827 = new BitSet(new long[]{0x000000001FFA1D10L});
    public static final BitSet FOLLOW_ruleField_in_ruleType858 = new BitSet(new long[]{0x000000001FFA1D10L});
    public static final BitSet FOLLOW_ruleOtherComent_in_ruleType885 = new BitSet(new long[]{0x000000001FFA1D10L});
    public static final BitSet FOLLOW_RULE_C_BRACE_R_in_ruleType898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnter_in_entryRuleEnter933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnter943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_L_in_ruleEnter979 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_C_MAIN_in_ruleEnter995 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_ruleEnter1011 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnter1027 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_ruleEnter1043 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_R_in_ruleEnter1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldComment_in_ruleField1144 = new BitSet(new long[]{0x000000001FFA1910L});
    public static final BitSet FOLLOW_ruleListMeta_in_ruleField1167 = new BitSet(new long[]{0x000000001FFA1910L});
    public static final BitSet FOLLOW_ruleSliceMeta_in_ruleField1194 = new BitSet(new long[]{0x000000001FFA1910L});
    public static final BitSet FOLLOW_ruleFieldType_in_ruleField1217 = new BitSet(new long[]{0x000000001FBA1110L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleField1238 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_ruleField1249 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleField1265 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_ruleField1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_entryRuleFieldType1319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldType1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleFieldType1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListMeta_in_entryRuleListMeta1409 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListMeta1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_L_in_ruleListMeta1455 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_C_LIST_in_ruleListMeta1471 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_ruleListMeta1488 = new BitSet(new long[]{0x000000001FBA5110L});
    public static final BitSet FOLLOW_ruleFieldMetaKey_in_ruleListMeta1509 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_RULE_C_COMMA_in_ruleListMeta1521 = new BitSet(new long[]{0x000000001FBA1110L});
    public static final BitSet FOLLOW_ruleFieldMetaKey_in_ruleListMeta1541 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_ruleListMeta1556 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_R_in_ruleListMeta1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSliceMeta_in_entryRuleSliceMeta1603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSliceMeta1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_L_in_ruleSliceMeta1649 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_C_SLICE_in_ruleSliceMeta1665 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_ruleSliceMeta1681 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSliceMeta1697 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_ruleSliceMeta1713 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_R_in_ruleSliceMeta1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldMetaKey_in_entryRuleFieldMetaKey1758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldMetaKey1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleFieldMetaKey1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum1848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeComment_in_ruleEnum1904 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_C_ENUM_in_ruleEnum1922 = new BitSet(new long[]{0x000000001FBA1110L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleEnum1948 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_C_BRACE_L_in_ruleEnum1959 = new BitSet(new long[]{0x000000001FFA1D10L});
    public static final BitSet FOLLOW_ruleEnumField_in_ruleEnum1990 = new BitSet(new long[]{0x000000001FFA1D10L});
    public static final BitSet FOLLOW_ruleOtherComent_in_ruleEnum2017 = new BitSet(new long[]{0x000000001FFA1D10L});
    public static final BitSet FOLLOW_RULE_C_BRACE_R_in_ruleEnum2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_entryRuleEnumField2065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumField2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldComment_in_ruleEnumField2121 = new BitSet(new long[]{0x000000001FBA1910L});
    public static final BitSet FOLLOW_ruleDefaultMeta_in_ruleEnumField2143 = new BitSet(new long[]{0x000000001FBA1110L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleEnumField2165 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_ruleEnumField2176 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumField2192 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_ruleEnumField2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultMeta_in_entryRuleDefaultMeta2246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultMeta2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_L_in_ruleDefaultMeta2292 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_C_DEFAULT_in_ruleDefaultMeta2308 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_ruleDefaultMeta2325 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_ruleDefaultMeta2335 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_R_in_ruleDefaultMeta2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeComment_in_entryRuleTypeComment2383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeComment2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleTypeComment2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldComment_in_entryRuleFieldComment2478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldComment2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleFieldComment2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_entryRuleOtherComent2572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherComent2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleOtherComent2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackName_in_entryRulePackName2664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackName2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rulePackName2722 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_rulePackName2741 = new BitSet(new long[]{0x000000001FBA1110L});
    public static final BitSet FOLLOW_ruleTypeName_in_rulePackName2763 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_entryRuleTypeName2811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeName2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INPUT_in_ruleTypeName2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_MAIN_in_ruleTypeName2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_DEFAULT_in_ruleTypeName2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_TYPE_in_ruleTypeName2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_ENUM_in_ruleTypeName2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INT_in_ruleTypeName2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_UINT_in_ruleTypeName3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BOOL_in_ruleTypeName3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_NUMBER_in_ruleTypeName3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_STRING_in_ruleTypeName3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_LIST_in_ruleTypeName3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_SLICE_in_ruleTypeName3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_ruleTypeName3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_synpred1_InternalCfg275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_synpred2_InternalCfg312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_synpred3_InternalCfg841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_synpred4_InternalCfg1973 = new BitSet(new long[]{0x0000000000000002L});

}