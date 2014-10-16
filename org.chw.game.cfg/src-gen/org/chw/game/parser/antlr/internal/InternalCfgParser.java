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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_C_INPUT", "RULE_STRING", "RULE_C_SEMICOLON", "RULE_C_PACKAGE", "RULE_C_TYPE", "RULE_C_BRACE_L", "RULE_C_BRACE_R", "RULE_C_EQUALS", "RULE_C_ENUM", "RULE_C_BRACKET_L", "RULE_C_PAREN_L", "RULE_C_COMMA", "RULE_C_PAREN_R", "RULE_C_BRACKET_R", "RULE_COMMENT", "RULE_C_INT", "RULE_C_UINT", "RULE_C_BOOL", "RULE_C_NUMBER", "RULE_C_STRING", "RULE_NAME", "RULE_C_ANGLE_L", "RULE_C_ANGLE_R", "RULE_COMMENT_END", "RULE_WS", "'.'"
    };
    public static final int RULE_C_NUMBER=22;
    public static final int T__29=29;
    public static final int RULE_C_COMMA=15;
    public static final int RULE_C_TYPE=8;
    public static final int RULE_C_PAREN_R=16;
    public static final int RULE_C_SEMICOLON=6;
    public static final int RULE_C_PAREN_L=14;
    public static final int RULE_C_INPUT=4;
    public static final int RULE_C_STRING=23;
    public static final int RULE_COMMENT=18;
    public static final int RULE_C_PACKAGE=7;
    public static final int EOF=-1;
    public static final int RULE_C_ANGLE_L=25;
    public static final int RULE_C_ANGLE_R=26;
    public static final int RULE_COMMENT_END=27;
    public static final int RULE_C_BRACKET_L=13;
    public static final int RULE_STRING=5;
    public static final int RULE_C_EQUALS=11;
    public static final int RULE_C_UINT=20;
    public static final int RULE_C_BRACKET_R=17;
    public static final int RULE_C_INT=19;
    public static final int RULE_NAME=24;
    public static final int RULE_WS=28;
    public static final int RULE_C_BOOL=21;
    public static final int RULE_C_BRACE_L=9;
    public static final int RULE_C_ENUM=12;
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:430:1: ruleType returns [EObject current=null] : ( ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_meta_1_0= ruleMeta ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= ruleTypeName ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_2_0=null;
        Token this_C_BRACE_L_4=null;
        Token this_C_BRACE_R_7=null;
        AntlrDatatypeRuleToken lv_comment_0_0 = null;

        EObject lv_meta_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_fields_5_0 = null;

        EObject lv_comm_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:433:28: ( ( ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_meta_1_0= ruleMeta ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= ruleTypeName ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:434:1: ( ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_meta_1_0= ruleMeta ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= ruleTypeName ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:434:1: ( ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_meta_1_0= ruleMeta ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= ruleTypeName ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:434:2: ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_meta_1_0= ruleMeta ) )? ( (lv_prefix_2_0= RULE_C_TYPE ) ) ( (lv_name_3_0= ruleTypeName ) ) this_C_BRACE_L_4= RULE_C_BRACE_L ( ( ( ( ruleField ) )=> (lv_fields_5_0= ruleField ) ) | ( (lv_comm_6_0= ruleOtherComent ) ) )* this_C_BRACE_R_7= RULE_C_BRACE_R
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:452:3: ( (lv_meta_1_0= ruleMeta ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_C_BRACKET_L) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:453:1: (lv_meta_1_0= ruleMeta )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:453:1: (lv_meta_1_0= ruleMeta )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:454:3: lv_meta_1_0= ruleMeta
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getMetaMetaParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMeta_in_ruleType772);
                    lv_meta_1_0=ruleMeta();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                      	        }
                             		add(
                             			current, 
                             			"meta",
                              		lv_meta_1_0, 
                              		"Meta");
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


    // $ANTLR start "entryRuleField"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:563:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:564:2: (iv_ruleField= ruleField EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:565:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField933);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField943); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:572:1: ruleField returns [EObject current=null] : ( ( (lv_comment_0_0= ruleFieldComment ) )? ( (lv_meta_1_0= ruleMeta ) )* ( (lv_type_2_0= ruleFieldType ) ) ( (lv_fieldName_3_0= ruleTypeName ) ) this_C_EQUALS_4= RULE_C_EQUALS ( (lv_nodePath_5_0= RULE_STRING ) ) (this_C_SEMICOLON_6= RULE_C_SEMICOLON )? ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token this_C_EQUALS_4=null;
        Token lv_nodePath_5_0=null;
        Token this_C_SEMICOLON_6=null;
        AntlrDatatypeRuleToken lv_comment_0_0 = null;

        EObject lv_meta_1_0 = null;

        EObject lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_fieldName_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:575:28: ( ( ( (lv_comment_0_0= ruleFieldComment ) )? ( (lv_meta_1_0= ruleMeta ) )* ( (lv_type_2_0= ruleFieldType ) ) ( (lv_fieldName_3_0= ruleTypeName ) ) this_C_EQUALS_4= RULE_C_EQUALS ( (lv_nodePath_5_0= RULE_STRING ) ) (this_C_SEMICOLON_6= RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:576:1: ( ( (lv_comment_0_0= ruleFieldComment ) )? ( (lv_meta_1_0= ruleMeta ) )* ( (lv_type_2_0= ruleFieldType ) ) ( (lv_fieldName_3_0= ruleTypeName ) ) this_C_EQUALS_4= RULE_C_EQUALS ( (lv_nodePath_5_0= RULE_STRING ) ) (this_C_SEMICOLON_6= RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:576:1: ( ( (lv_comment_0_0= ruleFieldComment ) )? ( (lv_meta_1_0= ruleMeta ) )* ( (lv_type_2_0= ruleFieldType ) ) ( (lv_fieldName_3_0= ruleTypeName ) ) this_C_EQUALS_4= RULE_C_EQUALS ( (lv_nodePath_5_0= RULE_STRING ) ) (this_C_SEMICOLON_6= RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:576:2: ( (lv_comment_0_0= ruleFieldComment ) )? ( (lv_meta_1_0= ruleMeta ) )* ( (lv_type_2_0= ruleFieldType ) ) ( (lv_fieldName_3_0= ruleTypeName ) ) this_C_EQUALS_4= RULE_C_EQUALS ( (lv_nodePath_5_0= RULE_STRING ) ) (this_C_SEMICOLON_6= RULE_C_SEMICOLON )?
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:576:2: ( (lv_comment_0_0= ruleFieldComment ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_COMMENT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:577:1: (lv_comment_0_0= ruleFieldComment )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:577:1: (lv_comment_0_0= ruleFieldComment )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:578:3: lv_comment_0_0= ruleFieldComment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldAccess().getCommentFieldCommentParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFieldComment_in_ruleField989);
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:594:3: ( (lv_meta_1_0= ruleMeta ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_C_BRACKET_L) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:595:1: (lv_meta_1_0= ruleMeta )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:595:1: (lv_meta_1_0= ruleMeta )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:596:3: lv_meta_1_0= ruleMeta
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFieldAccess().getMetaMetaParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMeta_in_ruleField1011);
            	    lv_meta_1_0=ruleMeta();

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
            	              		"Meta");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:612:3: ( (lv_type_2_0= ruleFieldType ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:613:1: (lv_type_2_0= ruleFieldType )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:613:1: (lv_type_2_0= ruleFieldType )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:614:3: lv_type_2_0= ruleFieldType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFieldType_in_ruleField1033);
            lv_type_2_0=ruleFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFieldRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"FieldType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:630:2: ( (lv_fieldName_3_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:631:1: (lv_fieldName_3_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:631:1: (lv_fieldName_3_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:632:3: lv_fieldName_3_0= ruleTypeName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldAccess().getFieldNameTypeNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeName_in_ruleField1054);
            lv_fieldName_3_0=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFieldRule());
              	        }
                     		set(
                     			current, 
                     			"fieldName",
                      		lv_fieldName_3_0, 
                      		"TypeName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_C_EQUALS_4=(Token)match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_ruleField1065); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_EQUALS_4, grammarAccess.getFieldAccess().getC_EQUALSTerminalRuleCall_4()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:652:1: ( (lv_nodePath_5_0= RULE_STRING ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:653:1: (lv_nodePath_5_0= RULE_STRING )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:653:1: (lv_nodePath_5_0= RULE_STRING )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:654:3: lv_nodePath_5_0= RULE_STRING
            {
            lv_nodePath_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleField1081); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_nodePath_5_0, grammarAccess.getFieldAccess().getNodePathSTRINGTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"nodePath",
                      		lv_nodePath_5_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:670:2: (this_C_SEMICOLON_6= RULE_C_SEMICOLON )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_C_SEMICOLON) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:670:3: this_C_SEMICOLON_6= RULE_C_SEMICOLON
                    {
                    this_C_SEMICOLON_6=(Token)match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_ruleField1098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_SEMICOLON_6, grammarAccess.getFieldAccess().getC_SEMICOLONTerminalRuleCall_6()); 
                          
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:682:1: entryRuleFieldType returns [EObject current=null] : iv_ruleFieldType= ruleFieldType EOF ;
    public final EObject entryRuleFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldType = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:683:2: (iv_ruleFieldType= ruleFieldType EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:684:2: iv_ruleFieldType= ruleFieldType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleFieldType_in_entryRuleFieldType1135);
            iv_ruleFieldType=ruleFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldType1145); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:691:1: ruleFieldType returns [EObject current=null] : ( (lv_type_0_0= ruleTypeName ) ) ;
    public final EObject ruleFieldType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:694:28: ( ( (lv_type_0_0= ruleTypeName ) ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:695:1: ( (lv_type_0_0= ruleTypeName ) )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:695:1: ( (lv_type_0_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:696:1: (lv_type_0_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:696:1: (lv_type_0_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:697:3: lv_type_0_0= ruleTypeName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldTypeAccess().getTypeTypeNameParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeName_in_ruleFieldType1190);
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


    // $ANTLR start "entryRuleEnum"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:721:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:722:2: (iv_ruleEnum= ruleEnum EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:723:2: iv_ruleEnum= ruleEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumRule()); 
            }
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum1225);
            iv_ruleEnum=ruleEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnum; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum1235); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:730:1: ruleEnum returns [EObject current=null] : ( ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_prefix_1_0= RULE_C_ENUM ) ) ( (lv_name_2_0= ruleTypeName ) ) this_C_BRACE_L_3= RULE_C_BRACE_L ( ( ( ( ruleEnumField ) )=> (lv_fields_4_0= ruleEnumField ) ) | ( (lv_comm_5_0= ruleOtherComent ) ) )* this_C_BRACE_R_6= RULE_C_BRACE_R ) ;
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
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:733:28: ( ( ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_prefix_1_0= RULE_C_ENUM ) ) ( (lv_name_2_0= ruleTypeName ) ) this_C_BRACE_L_3= RULE_C_BRACE_L ( ( ( ( ruleEnumField ) )=> (lv_fields_4_0= ruleEnumField ) ) | ( (lv_comm_5_0= ruleOtherComent ) ) )* this_C_BRACE_R_6= RULE_C_BRACE_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:734:1: ( ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_prefix_1_0= RULE_C_ENUM ) ) ( (lv_name_2_0= ruleTypeName ) ) this_C_BRACE_L_3= RULE_C_BRACE_L ( ( ( ( ruleEnumField ) )=> (lv_fields_4_0= ruleEnumField ) ) | ( (lv_comm_5_0= ruleOtherComent ) ) )* this_C_BRACE_R_6= RULE_C_BRACE_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:734:1: ( ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_prefix_1_0= RULE_C_ENUM ) ) ( (lv_name_2_0= ruleTypeName ) ) this_C_BRACE_L_3= RULE_C_BRACE_L ( ( ( ( ruleEnumField ) )=> (lv_fields_4_0= ruleEnumField ) ) | ( (lv_comm_5_0= ruleOtherComent ) ) )* this_C_BRACE_R_6= RULE_C_BRACE_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:734:2: ( (lv_comment_0_0= ruleTypeComment ) )? ( (lv_prefix_1_0= RULE_C_ENUM ) ) ( (lv_name_2_0= ruleTypeName ) ) this_C_BRACE_L_3= RULE_C_BRACE_L ( ( ( ( ruleEnumField ) )=> (lv_fields_4_0= ruleEnumField ) ) | ( (lv_comm_5_0= ruleOtherComent ) ) )* this_C_BRACE_R_6= RULE_C_BRACE_R
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:734:2: ( (lv_comment_0_0= ruleTypeComment ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_COMMENT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:735:1: (lv_comment_0_0= ruleTypeComment )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:735:1: (lv_comment_0_0= ruleTypeComment )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:736:3: lv_comment_0_0= ruleTypeComment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnumAccess().getCommentTypeCommentParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeComment_in_ruleEnum1281);
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:752:3: ( (lv_prefix_1_0= RULE_C_ENUM ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:753:1: (lv_prefix_1_0= RULE_C_ENUM )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:753:1: (lv_prefix_1_0= RULE_C_ENUM )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:754:3: lv_prefix_1_0= RULE_C_ENUM
            {
            lv_prefix_1_0=(Token)match(input,RULE_C_ENUM,FOLLOW_RULE_C_ENUM_in_ruleEnum1299); if (state.failed) return current;
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:770:2: ( (lv_name_2_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:771:1: (lv_name_2_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:771:1: (lv_name_2_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:772:3: lv_name_2_0= ruleTypeName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumAccess().getNameTypeNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeName_in_ruleEnum1325);
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

            this_C_BRACE_L_3=(Token)match(input,RULE_C_BRACE_L,FOLLOW_RULE_C_BRACE_L_in_ruleEnum1336); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_BRACE_L_3, grammarAccess.getEnumAccess().getC_BRACE_LTerminalRuleCall_3()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:792:1: ( ( ( ( ruleEnumField ) )=> (lv_fields_4_0= ruleEnumField ) ) | ( (lv_comm_5_0= ruleOtherComent ) ) )*
            loop15:
            do {
                int alt15=3;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:792:2: ( ( ( ruleEnumField ) )=> (lv_fields_4_0= ruleEnumField ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:792:2: ( ( ( ruleEnumField ) )=> (lv_fields_4_0= ruleEnumField ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:792:3: ( ( ruleEnumField ) )=> (lv_fields_4_0= ruleEnumField )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:797:1: (lv_fields_4_0= ruleEnumField )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:798:3: lv_fields_4_0= ruleEnumField
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumAccess().getFieldsEnumFieldParserRuleCall_4_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEnumField_in_ruleEnum1367);
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
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:815:6: ( (lv_comm_5_0= ruleOtherComent ) )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:815:6: ( (lv_comm_5_0= ruleOtherComent ) )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:816:1: (lv_comm_5_0= ruleOtherComent )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:816:1: (lv_comm_5_0= ruleOtherComent )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:817:3: lv_comm_5_0= ruleOtherComent
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumAccess().getCommOtherComentParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOtherComent_in_ruleEnum1394);
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
            	    break loop15;
                }
            } while (true);

            this_C_BRACE_R_6=(Token)match(input,RULE_C_BRACE_R,FOLLOW_RULE_C_BRACE_R_in_ruleEnum1407); if (state.failed) return current;
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:845:1: entryRuleEnumField returns [EObject current=null] : iv_ruleEnumField= ruleEnumField EOF ;
    public final EObject entryRuleEnumField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumField = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:846:2: (iv_ruleEnumField= ruleEnumField EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:847:2: iv_ruleEnumField= ruleEnumField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumFieldRule()); 
            }
            pushFollow(FOLLOW_ruleEnumField_in_entryRuleEnumField1442);
            iv_ruleEnumField=ruleEnumField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumField1452); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:854:1: ruleEnumField returns [EObject current=null] : ( ( (lv_comment_0_0= ruleFieldComment ) )? ( (lv_meta_1_0= ruleMeta ) )* ( (lv_fieldName_2_0= ruleTypeName ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_fieldValue_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )? ) ;
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
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:857:28: ( ( ( (lv_comment_0_0= ruleFieldComment ) )? ( (lv_meta_1_0= ruleMeta ) )* ( (lv_fieldName_2_0= ruleTypeName ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_fieldValue_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:858:1: ( ( (lv_comment_0_0= ruleFieldComment ) )? ( (lv_meta_1_0= ruleMeta ) )* ( (lv_fieldName_2_0= ruleTypeName ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_fieldValue_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:858:1: ( ( (lv_comment_0_0= ruleFieldComment ) )? ( (lv_meta_1_0= ruleMeta ) )* ( (lv_fieldName_2_0= ruleTypeName ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_fieldValue_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:858:2: ( (lv_comment_0_0= ruleFieldComment ) )? ( (lv_meta_1_0= ruleMeta ) )* ( (lv_fieldName_2_0= ruleTypeName ) ) this_C_EQUALS_3= RULE_C_EQUALS ( (lv_fieldValue_4_0= RULE_STRING ) ) (this_C_SEMICOLON_5= RULE_C_SEMICOLON )?
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:858:2: ( (lv_comment_0_0= ruleFieldComment ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_COMMENT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:859:1: (lv_comment_0_0= ruleFieldComment )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:859:1: (lv_comment_0_0= ruleFieldComment )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:860:3: lv_comment_0_0= ruleFieldComment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnumFieldAccess().getCommentFieldCommentParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFieldComment_in_ruleEnumField1498);
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:876:3: ( (lv_meta_1_0= ruleMeta ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_C_BRACKET_L) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:877:1: (lv_meta_1_0= ruleMeta )
            	    {
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:877:1: (lv_meta_1_0= ruleMeta )
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:878:3: lv_meta_1_0= ruleMeta
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumFieldAccess().getMetaMetaParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMeta_in_ruleEnumField1520);
            	    lv_meta_1_0=ruleMeta();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEnumFieldRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"meta",
            	              		lv_meta_1_0, 
            	              		"Meta");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:894:3: ( (lv_fieldName_2_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:895:1: (lv_fieldName_2_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:895:1: (lv_fieldName_2_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:896:3: lv_fieldName_2_0= ruleTypeName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumFieldAccess().getFieldNameTypeNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeName_in_ruleEnumField1542);
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

            this_C_EQUALS_3=(Token)match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_ruleEnumField1553); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_EQUALS_3, grammarAccess.getEnumFieldAccess().getC_EQUALSTerminalRuleCall_3()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:916:1: ( (lv_fieldValue_4_0= RULE_STRING ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:917:1: (lv_fieldValue_4_0= RULE_STRING )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:917:1: (lv_fieldValue_4_0= RULE_STRING )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:918:3: lv_fieldValue_4_0= RULE_STRING
            {
            lv_fieldValue_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumField1569); if (state.failed) return current;
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

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:934:2: (this_C_SEMICOLON_5= RULE_C_SEMICOLON )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_C_SEMICOLON) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:934:3: this_C_SEMICOLON_5= RULE_C_SEMICOLON
                    {
                    this_C_SEMICOLON_5=(Token)match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_ruleEnumField1586); if (state.failed) return current;
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


    // $ANTLR start "entryRuleMeta"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:946:1: entryRuleMeta returns [EObject current=null] : iv_ruleMeta= ruleMeta EOF ;
    public final EObject entryRuleMeta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeta = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:947:2: (iv_ruleMeta= ruleMeta EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:948:2: iv_ruleMeta= ruleMeta EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaRule()); 
            }
            pushFollow(FOLLOW_ruleMeta_in_entryRuleMeta1623);
            iv_ruleMeta=ruleMeta();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMeta; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeta1633); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMeta"


    // $ANTLR start "ruleMeta"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:955:1: ruleMeta returns [EObject current=null] : (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= ruleTypeName ) ) (this_C_PAREN_L_2= RULE_C_PAREN_L ( ( (lv_params_3_0= ruleMetaParam ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleMetaParam ) ) )* )? this_C_PAREN_R_6= RULE_C_PAREN_R )? this_C_BRACKET_R_7= RULE_C_BRACKET_R ) ;
    public final EObject ruleMeta() throws RecognitionException {
        EObject current = null;

        Token this_C_BRACKET_L_0=null;
        Token this_C_PAREN_L_2=null;
        Token this_C_COMMA_4=null;
        Token this_C_PAREN_R_6=null;
        Token this_C_BRACKET_R_7=null;
        AntlrDatatypeRuleToken lv_prefix_1_0 = null;

        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:958:28: ( (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= ruleTypeName ) ) (this_C_PAREN_L_2= RULE_C_PAREN_L ( ( (lv_params_3_0= ruleMetaParam ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleMetaParam ) ) )* )? this_C_PAREN_R_6= RULE_C_PAREN_R )? this_C_BRACKET_R_7= RULE_C_BRACKET_R ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:959:1: (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= ruleTypeName ) ) (this_C_PAREN_L_2= RULE_C_PAREN_L ( ( (lv_params_3_0= ruleMetaParam ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleMetaParam ) ) )* )? this_C_PAREN_R_6= RULE_C_PAREN_R )? this_C_BRACKET_R_7= RULE_C_BRACKET_R )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:959:1: (this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= ruleTypeName ) ) (this_C_PAREN_L_2= RULE_C_PAREN_L ( ( (lv_params_3_0= ruleMetaParam ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleMetaParam ) ) )* )? this_C_PAREN_R_6= RULE_C_PAREN_R )? this_C_BRACKET_R_7= RULE_C_BRACKET_R )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:959:2: this_C_BRACKET_L_0= RULE_C_BRACKET_L ( (lv_prefix_1_0= ruleTypeName ) ) (this_C_PAREN_L_2= RULE_C_PAREN_L ( ( (lv_params_3_0= ruleMetaParam ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleMetaParam ) ) )* )? this_C_PAREN_R_6= RULE_C_PAREN_R )? this_C_BRACKET_R_7= RULE_C_BRACKET_R
            {
            this_C_BRACKET_L_0=(Token)match(input,RULE_C_BRACKET_L,FOLLOW_RULE_C_BRACKET_L_in_ruleMeta1669); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_BRACKET_L_0, grammarAccess.getMetaAccess().getC_BRACKET_LTerminalRuleCall_0()); 
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:963:1: ( (lv_prefix_1_0= ruleTypeName ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:964:1: (lv_prefix_1_0= ruleTypeName )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:964:1: (lv_prefix_1_0= ruleTypeName )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:965:3: lv_prefix_1_0= ruleTypeName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMetaAccess().getPrefixTypeNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTypeName_in_ruleMeta1689);
            lv_prefix_1_0=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMetaRule());
              	        }
                     		set(
                     			current, 
                     			"prefix",
                      		lv_prefix_1_0, 
                      		"TypeName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:981:2: (this_C_PAREN_L_2= RULE_C_PAREN_L ( ( (lv_params_3_0= ruleMetaParam ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleMetaParam ) ) )* )? this_C_PAREN_R_6= RULE_C_PAREN_R )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_C_PAREN_L) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:981:3: this_C_PAREN_L_2= RULE_C_PAREN_L ( ( (lv_params_3_0= ruleMetaParam ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleMetaParam ) ) )* )? this_C_PAREN_R_6= RULE_C_PAREN_R
                    {
                    this_C_PAREN_L_2=(Token)match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_ruleMeta1701); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_PAREN_L_2, grammarAccess.getMetaAccess().getC_PAREN_LTerminalRuleCall_2_0()); 
                          
                    }
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:985:1: ( ( (lv_params_3_0= ruleMetaParam ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleMetaParam ) ) )* )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=RULE_C_INPUT && LA20_0<=RULE_STRING)||LA20_0==RULE_C_TYPE||LA20_0==RULE_C_ENUM||(LA20_0>=RULE_C_INT && LA20_0<=RULE_NAME)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:985:2: ( (lv_params_3_0= ruleMetaParam ) ) (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleMetaParam ) ) )*
                            {
                            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:985:2: ( (lv_params_3_0= ruleMetaParam ) )
                            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:986:1: (lv_params_3_0= ruleMetaParam )
                            {
                            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:986:1: (lv_params_3_0= ruleMetaParam )
                            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:987:3: lv_params_3_0= ruleMetaParam
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getMetaAccess().getParamsMetaParamParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleMetaParam_in_ruleMeta1722);
                            lv_params_3_0=ruleMetaParam();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getMetaRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"params",
                                      		lv_params_3_0, 
                                      		"MetaParam");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1003:2: (this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleMetaParam ) ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==RULE_C_COMMA) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1003:3: this_C_COMMA_4= RULE_C_COMMA ( (lv_params_5_0= ruleMetaParam ) )
                            	    {
                            	    this_C_COMMA_4=(Token)match(input,RULE_C_COMMA,FOLLOW_RULE_C_COMMA_in_ruleMeta1734); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_C_COMMA_4, grammarAccess.getMetaAccess().getC_COMMATerminalRuleCall_2_1_1_0()); 
                            	          
                            	    }
                            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1007:1: ( (lv_params_5_0= ruleMetaParam ) )
                            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1008:1: (lv_params_5_0= ruleMetaParam )
                            	    {
                            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1008:1: (lv_params_5_0= ruleMetaParam )
                            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1009:3: lv_params_5_0= ruleMetaParam
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getMetaAccess().getParamsMetaParamParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleMetaParam_in_ruleMeta1754);
                            	    lv_params_5_0=ruleMetaParam();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getMetaRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"params",
                            	              		lv_params_5_0, 
                            	              		"MetaParam");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop19;
                                }
                            } while (true);


                            }
                            break;

                    }

                    this_C_PAREN_R_6=(Token)match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_ruleMeta1769); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_PAREN_R_6, grammarAccess.getMetaAccess().getC_PAREN_RTerminalRuleCall_2_2()); 
                          
                    }

                    }
                    break;

            }

            this_C_BRACKET_R_7=(Token)match(input,RULE_C_BRACKET_R,FOLLOW_RULE_C_BRACKET_R_in_ruleMeta1781); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_C_BRACKET_R_7, grammarAccess.getMetaAccess().getC_BRACKET_RTerminalRuleCall_3()); 
                  
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
    // $ANTLR end "ruleMeta"


    // $ANTLR start "entryRuleMetaParam"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1041:1: entryRuleMetaParam returns [EObject current=null] : iv_ruleMetaParam= ruleMetaParam EOF ;
    public final EObject entryRuleMetaParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaParam = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1042:2: (iv_ruleMetaParam= ruleMetaParam EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1043:2: iv_ruleMetaParam= ruleMetaParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMetaParamRule()); 
            }
            pushFollow(FOLLOW_ruleMetaParam_in_entryRuleMetaParam1816);
            iv_ruleMetaParam=ruleMetaParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMetaParam; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaParam1826); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMetaParam"


    // $ANTLR start "ruleMetaParam"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1050:1: ruleMetaParam returns [EObject current=null] : ( ( (lv_fieldName_0_0= ruleTypeName ) ) | ( (lv_fieldName_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMetaParam() throws RecognitionException {
        EObject current = null;

        Token lv_fieldName_1_0=null;
        AntlrDatatypeRuleToken lv_fieldName_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1053:28: ( ( ( (lv_fieldName_0_0= ruleTypeName ) ) | ( (lv_fieldName_1_0= RULE_STRING ) ) ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1054:1: ( ( (lv_fieldName_0_0= ruleTypeName ) ) | ( (lv_fieldName_1_0= RULE_STRING ) ) )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1054:1: ( ( (lv_fieldName_0_0= ruleTypeName ) ) | ( (lv_fieldName_1_0= RULE_STRING ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_C_INPUT||LA22_0==RULE_C_TYPE||LA22_0==RULE_C_ENUM||(LA22_0>=RULE_C_INT && LA22_0<=RULE_NAME)) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_STRING) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1054:2: ( (lv_fieldName_0_0= ruleTypeName ) )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1054:2: ( (lv_fieldName_0_0= ruleTypeName ) )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1055:1: (lv_fieldName_0_0= ruleTypeName )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1055:1: (lv_fieldName_0_0= ruleTypeName )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1056:3: lv_fieldName_0_0= ruleTypeName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMetaParamAccess().getFieldNameTypeNameParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTypeName_in_ruleMetaParam1872);
                    lv_fieldName_0_0=ruleTypeName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMetaParamRule());
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
                    break;
                case 2 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1073:6: ( (lv_fieldName_1_0= RULE_STRING ) )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1073:6: ( (lv_fieldName_1_0= RULE_STRING ) )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1074:1: (lv_fieldName_1_0= RULE_STRING )
                    {
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1074:1: (lv_fieldName_1_0= RULE_STRING )
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1075:3: lv_fieldName_1_0= RULE_STRING
                    {
                    lv_fieldName_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetaParam1895); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_fieldName_1_0, grammarAccess.getMetaParamAccess().getFieldNameSTRINGTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMetaParamRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"fieldName",
                              		lv_fieldName_1_0, 
                              		"STRING");
                      	    
                    }

                    }


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
    // $ANTLR end "ruleMetaParam"


    // $ANTLR start "entryRuleTypeComment"
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1099:1: entryRuleTypeComment returns [String current=null] : iv_ruleTypeComment= ruleTypeComment EOF ;
    public final String entryRuleTypeComment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeComment = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1100:2: (iv_ruleTypeComment= ruleTypeComment EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1101:2: iv_ruleTypeComment= ruleTypeComment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeCommentRule()); 
            }
            pushFollow(FOLLOW_ruleTypeComment_in_entryRuleTypeComment1937);
            iv_ruleTypeComment=ruleTypeComment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeComment.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeComment1948); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1108:1: ruleTypeComment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_COMMENT_0= RULE_COMMENT ;
    public final AntlrDatatypeRuleToken ruleTypeComment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_COMMENT_0=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1111:28: (this_COMMENT_0= RULE_COMMENT )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1112:5: this_COMMENT_0= RULE_COMMENT
            {
            this_COMMENT_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleTypeComment1987); if (state.failed) return current;
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1127:1: entryRuleFieldComment returns [String current=null] : iv_ruleFieldComment= ruleFieldComment EOF ;
    public final String entryRuleFieldComment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldComment = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1128:2: (iv_ruleFieldComment= ruleFieldComment EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1129:2: iv_ruleFieldComment= ruleFieldComment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldCommentRule()); 
            }
            pushFollow(FOLLOW_ruleFieldComment_in_entryRuleFieldComment2032);
            iv_ruleFieldComment=ruleFieldComment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldComment.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldComment2043); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1136:1: ruleFieldComment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_COMMENT_0= RULE_COMMENT ;
    public final AntlrDatatypeRuleToken ruleFieldComment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_COMMENT_0=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1139:28: (this_COMMENT_0= RULE_COMMENT )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1140:5: this_COMMENT_0= RULE_COMMENT
            {
            this_COMMENT_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleFieldComment2082); if (state.failed) return current;
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1155:1: entryRuleOtherComent returns [EObject current=null] : iv_ruleOtherComent= ruleOtherComent EOF ;
    public final EObject entryRuleOtherComent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOtherComent = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1156:2: (iv_ruleOtherComent= ruleOtherComent EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1157:2: iv_ruleOtherComent= ruleOtherComent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOtherComentRule()); 
            }
            pushFollow(FOLLOW_ruleOtherComent_in_entryRuleOtherComent2126);
            iv_ruleOtherComent=ruleOtherComent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOtherComent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherComent2136); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1164:1: ruleOtherComent returns [EObject current=null] : ( (lv_comm_0_0= RULE_COMMENT ) ) ;
    public final EObject ruleOtherComent() throws RecognitionException {
        EObject current = null;

        Token lv_comm_0_0=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1167:28: ( ( (lv_comm_0_0= RULE_COMMENT ) ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1168:1: ( (lv_comm_0_0= RULE_COMMENT ) )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1168:1: ( (lv_comm_0_0= RULE_COMMENT ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1169:1: (lv_comm_0_0= RULE_COMMENT )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1169:1: (lv_comm_0_0= RULE_COMMENT )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1170:3: lv_comm_0_0= RULE_COMMENT
            {
            lv_comm_0_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleOtherComent2177); if (state.failed) return current;
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1194:1: entryRulePackName returns [String current=null] : iv_rulePackName= rulePackName EOF ;
    public final String entryRulePackName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackName = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1195:2: (iv_rulePackName= rulePackName EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1196:2: iv_rulePackName= rulePackName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackNameRule()); 
            }
            pushFollow(FOLLOW_rulePackName_in_entryRulePackName2218);
            iv_rulePackName=rulePackName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackName2229); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1203:1: rulePackName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TypeName_0= ruleTypeName (kw= '.' this_TypeName_2= ruleTypeName )* ) ;
    public final AntlrDatatypeRuleToken rulePackName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_TypeName_0 = null;

        AntlrDatatypeRuleToken this_TypeName_2 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1206:28: ( (this_TypeName_0= ruleTypeName (kw= '.' this_TypeName_2= ruleTypeName )* ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1207:1: (this_TypeName_0= ruleTypeName (kw= '.' this_TypeName_2= ruleTypeName )* )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1207:1: (this_TypeName_0= ruleTypeName (kw= '.' this_TypeName_2= ruleTypeName )* )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1208:5: this_TypeName_0= ruleTypeName (kw= '.' this_TypeName_2= ruleTypeName )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPackNameAccess().getTypeNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTypeName_in_rulePackName2276);
            this_TypeName_0=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_TypeName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1218:1: (kw= '.' this_TypeName_2= ruleTypeName )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==29) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1219:2: kw= '.' this_TypeName_2= ruleTypeName
            	    {
            	    kw=(Token)match(input,29,FOLLOW_29_in_rulePackName2295); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getPackNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getPackNameAccess().getTypeNameParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleTypeName_in_rulePackName2317);
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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1243:1: entryRuleTypeName returns [String current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final String entryRuleTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeName = null;


        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1244:2: (iv_ruleTypeName= ruleTypeName EOF )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1245:2: iv_ruleTypeName= ruleTypeName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameRule()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_entryRuleTypeName2365);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeName2376); if (state.failed) return current;

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
    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1252:1: ruleTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_C_INPUT_0= RULE_C_INPUT | this_C_TYPE_1= RULE_C_TYPE | this_C_ENUM_2= RULE_C_ENUM | this_C_INT_3= RULE_C_INT | this_C_UINT_4= RULE_C_UINT | this_C_BOOL_5= RULE_C_BOOL | this_C_NUMBER_6= RULE_C_NUMBER | this_C_STRING_7= RULE_C_STRING | this_NAME_8= RULE_NAME ) ;
    public final AntlrDatatypeRuleToken ruleTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_C_INPUT_0=null;
        Token this_C_TYPE_1=null;
        Token this_C_ENUM_2=null;
        Token this_C_INT_3=null;
        Token this_C_UINT_4=null;
        Token this_C_BOOL_5=null;
        Token this_C_NUMBER_6=null;
        Token this_C_STRING_7=null;
        Token this_NAME_8=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1255:28: ( (this_C_INPUT_0= RULE_C_INPUT | this_C_TYPE_1= RULE_C_TYPE | this_C_ENUM_2= RULE_C_ENUM | this_C_INT_3= RULE_C_INT | this_C_UINT_4= RULE_C_UINT | this_C_BOOL_5= RULE_C_BOOL | this_C_NUMBER_6= RULE_C_NUMBER | this_C_STRING_7= RULE_C_STRING | this_NAME_8= RULE_NAME ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1256:1: (this_C_INPUT_0= RULE_C_INPUT | this_C_TYPE_1= RULE_C_TYPE | this_C_ENUM_2= RULE_C_ENUM | this_C_INT_3= RULE_C_INT | this_C_UINT_4= RULE_C_UINT | this_C_BOOL_5= RULE_C_BOOL | this_C_NUMBER_6= RULE_C_NUMBER | this_C_STRING_7= RULE_C_STRING | this_NAME_8= RULE_NAME )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1256:1: (this_C_INPUT_0= RULE_C_INPUT | this_C_TYPE_1= RULE_C_TYPE | this_C_ENUM_2= RULE_C_ENUM | this_C_INT_3= RULE_C_INT | this_C_UINT_4= RULE_C_UINT | this_C_BOOL_5= RULE_C_BOOL | this_C_NUMBER_6= RULE_C_NUMBER | this_C_STRING_7= RULE_C_STRING | this_NAME_8= RULE_NAME )
            int alt24=9;
            switch ( input.LA(1) ) {
            case RULE_C_INPUT:
                {
                alt24=1;
                }
                break;
            case RULE_C_TYPE:
                {
                alt24=2;
                }
                break;
            case RULE_C_ENUM:
                {
                alt24=3;
                }
                break;
            case RULE_C_INT:
                {
                alt24=4;
                }
                break;
            case RULE_C_UINT:
                {
                alt24=5;
                }
                break;
            case RULE_C_BOOL:
                {
                alt24=6;
                }
                break;
            case RULE_C_NUMBER:
                {
                alt24=7;
                }
                break;
            case RULE_C_STRING:
                {
                alt24=8;
                }
                break;
            case RULE_NAME:
                {
                alt24=9;
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
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1256:6: this_C_INPUT_0= RULE_C_INPUT
                    {
                    this_C_INPUT_0=(Token)match(input,RULE_C_INPUT,FOLLOW_RULE_C_INPUT_in_ruleTypeName2416); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_INPUT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_INPUT_0, grammarAccess.getTypeNameAccess().getC_INPUTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1264:10: this_C_TYPE_1= RULE_C_TYPE
                    {
                    this_C_TYPE_1=(Token)match(input,RULE_C_TYPE,FOLLOW_RULE_C_TYPE_in_ruleTypeName2442); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_TYPE_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_TYPE_1, grammarAccess.getTypeNameAccess().getC_TYPETerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1272:10: this_C_ENUM_2= RULE_C_ENUM
                    {
                    this_C_ENUM_2=(Token)match(input,RULE_C_ENUM,FOLLOW_RULE_C_ENUM_in_ruleTypeName2468); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_ENUM_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_ENUM_2, grammarAccess.getTypeNameAccess().getC_ENUMTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1280:10: this_C_INT_3= RULE_C_INT
                    {
                    this_C_INT_3=(Token)match(input,RULE_C_INT,FOLLOW_RULE_C_INT_in_ruleTypeName2494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_INT_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_INT_3, grammarAccess.getTypeNameAccess().getC_INTTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1288:10: this_C_UINT_4= RULE_C_UINT
                    {
                    this_C_UINT_4=(Token)match(input,RULE_C_UINT,FOLLOW_RULE_C_UINT_in_ruleTypeName2520); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_UINT_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_UINT_4, grammarAccess.getTypeNameAccess().getC_UINTTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1296:10: this_C_BOOL_5= RULE_C_BOOL
                    {
                    this_C_BOOL_5=(Token)match(input,RULE_C_BOOL,FOLLOW_RULE_C_BOOL_in_ruleTypeName2546); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_BOOL_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_BOOL_5, grammarAccess.getTypeNameAccess().getC_BOOLTerminalRuleCall_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1304:10: this_C_NUMBER_6= RULE_C_NUMBER
                    {
                    this_C_NUMBER_6=(Token)match(input,RULE_C_NUMBER,FOLLOW_RULE_C_NUMBER_in_ruleTypeName2572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_NUMBER_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_NUMBER_6, grammarAccess.getTypeNameAccess().getC_NUMBERTerminalRuleCall_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1312:10: this_C_STRING_7= RULE_C_STRING
                    {
                    this_C_STRING_7=(Token)match(input,RULE_C_STRING,FOLLOW_RULE_C_STRING_in_ruleTypeName2598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_C_STRING_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_C_STRING_7, grammarAccess.getTypeNameAccess().getC_STRINGTerminalRuleCall_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1320:10: this_NAME_8= RULE_NAME
                    {
                    this_NAME_8=(Token)match(input,RULE_NAME,FOLLOW_RULE_NAME_in_ruleTypeName2624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NAME_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NAME_8, grammarAccess.getTypeNameAccess().getNAMETerminalRuleCall_8()); 
                          
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
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:792:3: ( ( ruleEnumField ) )
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:793:1: ( ruleEnumField )
        {
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:793:1: ( ruleEnumField )
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:794:1: ruleEnumField
        {
        pushFollow(FOLLOW_ruleEnumField_in_synpred4_InternalCfg1350);
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
    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA1_eotS =
        "\42\uffff";
    static final String DFA1_eofS =
        "\3\uffff\1\20\1\24\13\20\1\uffff\2\24\6\uffff\11\20";
    static final String DFA1_minS =
        "\2\4\1\5\1\4\1\6\13\4\1\uffff\2\7\2\uffff\1\4\1\uffff\2\5\11\4";
    static final String DFA1_maxS =
        "\2\22\1\5\1\30\1\22\11\35\2\22\1\uffff\2\22\2\uffff\1\30\1\uffff"+
        "\2\11\11\35";
    static final String DFA1_acceptS =
        "\20\uffff\1\3\2\uffff\1\1\1\4\1\uffff\1\2\13\uffff";
    static final String DFA1_specialS =
        "\42\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\2\uffff\1\3\12\uffff\1\1",
            "\1\2\2\uffff\1\3\12\uffff\1\1",
            "\1\4",
            "\1\5\1\uffff\1\16\1\uffff\1\6\3\uffff\1\7\1\20\4\uffff\1\17"+
            "\1\10\1\11\1\12\1\13\1\14\1\15",
            "\1\21\1\23\1\24\3\uffff\2\24\4\uffff\1\22",
            "\2\26\1\16\1\uffff\1\20\3\uffff\2\20\4\uffff\1\17\12\uffff"+
            "\1\25",
            "\1\27\1\uffff\1\16\1\uffff\1\20\3\uffff\2\20\4\uffff\1\17"+
            "\6\20\4\uffff\1\25",
            "\1\30\1\uffff\1\16\1\uffff\1\20\3\uffff\2\20\4\uffff\1\17"+
            "\6\20\4\uffff\1\25",
            "\1\26\1\uffff\1\16\1\uffff\1\20\3\uffff\2\20\4\uffff\1\17"+
            "\12\uffff\1\25",
            "\1\26\1\uffff\1\16\1\uffff\1\20\3\uffff\2\20\4\uffff\1\17"+
            "\12\uffff\1\25",
            "\1\26\1\uffff\1\16\1\uffff\1\20\3\uffff\2\20\4\uffff\1\17"+
            "\12\uffff\1\25",
            "\1\26\1\uffff\1\16\1\uffff\1\20\3\uffff\2\20\4\uffff\1\17"+
            "\12\uffff\1\25",
            "\1\26\1\uffff\1\16\1\uffff\1\20\3\uffff\2\20\4\uffff\1\17"+
            "\12\uffff\1\25",
            "\1\26\1\uffff\1\16\1\uffff\1\20\3\uffff\2\20\4\uffff\1\17"+
            "\12\uffff\1\25",
            "\1\26\3\uffff\1\20\3\uffff\2\20\4\uffff\1\17",
            "\1\26\3\uffff\1\20\3\uffff\2\20\4\uffff\1\17",
            "",
            "\1\23\1\24\3\uffff\2\24\4\uffff\1\22",
            "\1\23\1\24\3\uffff\2\24\4\uffff\1\22",
            "",
            "",
            "\1\31\3\uffff\1\32\3\uffff\1\33\6\uffff\1\34\1\35\1\36\1\37"+
            "\1\40\1\41",
            "",
            "\1\26\3\uffff\1\20",
            "\1\26\3\uffff\1\20",
            "\1\26\1\uffff\1\16\1\uffff\1\20\3\uffff\2\20\4\uffff\1\17"+
            "\12\uffff\1\25",
            "\1\26\1\uffff\1\16\1\uffff\1\20\3\uffff\2\20\4\uffff\1\17"+
            "\12\uffff\1\25",
            "\1\26\1\uffff\1\16\1\uffff\1\20\3\uffff\2\20\4\uffff\1\17"+
            "\12\uffff\1\25",
            "\1\26\1\uffff\1\16\1\uffff\1\20\3\uffff\2\20\4\uffff\1\17"+
            "\12\uffff\1\25",
            "\1\26\1\uffff\1\16\1\uffff\1\20\3\uffff\2\20\4\uffff\1\17"+
            "\12\uffff\1\25",
            "\1\26\1\uffff\1\16\1\uffff\1\20\3\uffff\2\20\4\uffff\1\17"+
            "\12\uffff\1\25",
            "\1\26\1\uffff\1\16\1\uffff\1\20\3\uffff\2\20\4\uffff\1\17"+
            "\12\uffff\1\25",
            "\1\26\1\uffff\1\16\1\uffff\1\20\3\uffff\2\20\4\uffff\1\17"+
            "\12\uffff\1\25",
            "\1\26\1\uffff\1\16\1\uffff\1\20\3\uffff\2\20\4\uffff\1\17"+
            "\12\uffff\1\25"
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
        "\1\5\3\4\10\uffff";
    static final String DFA6_minS =
        "\4\4\2\uffff\1\5\4\4\1\5";
    static final String DFA6_maxS =
        "\1\30\3\35\2\uffff\1\11\4\30\1\11";
    static final String DFA6_acceptS =
        "\4\uffff\1\1\1\2\6\uffff";
    static final String DFA6_specialS =
        "\14\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\1\uffff\1\5\1\uffff\1\2\3\uffff\1\3\1\5\4\uffff\1\5\6"+
            "\4",
            "\1\4\1\5\1\4\1\uffff\1\4\3\uffff\2\4\4\uffff\1\4\12\uffff"+
            "\1\4",
            "\1\6\1\uffff\1\4\1\uffff\1\7\3\uffff\1\10\1\4\4\uffff\1\4"+
            "\6\5\4\uffff\1\4",
            "\1\13\1\uffff\1\4\1\uffff\1\11\3\uffff\1\12\1\4\4\uffff\1"+
            "\4\6\5\4\uffff\1\4",
            "",
            "",
            "\1\4\3\uffff\1\5",
            "\1\4\3\uffff\1\4\1\5\2\uffff\1\4\6\uffff\6\4",
            "\1\4\3\uffff\1\4\1\5\2\uffff\1\4\6\uffff\6\4",
            "\1\4\3\uffff\1\4\1\5\2\uffff\1\4\6\uffff\6\4",
            "\1\4\3\uffff\1\4\1\5\2\uffff\1\4\6\uffff\6\4",
            "\1\4\3\uffff\1\5"
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
        "\16\uffff";
    static final String DFA10_eofS =
        "\16\uffff";
    static final String DFA10_minS =
        "\1\4\1\uffff\1\0\13\uffff";
    static final String DFA10_maxS =
        "\1\30\1\uffff\1\0\13\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\3\1\uffff\12\1\1\2";
    static final String DFA10_specialS =
        "\1\1\1\uffff\1\0\13\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\4\3\uffff\1\5\1\uffff\1\1\1\uffff\1\6\1\3\4\uffff\1\2\1"+
            "\7\1\10\1\11\1\12\1\13\1\14",
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
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalCfg()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index10_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_0 = input.LA(1);

                         
                        int index10_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA10_0==RULE_C_BRACE_R) ) {s = 1;}

                        else if ( (LA10_0==RULE_COMMENT) ) {s = 2;}

                        else if ( (LA10_0==RULE_C_BRACKET_L) && (synpred3_InternalCfg())) {s = 3;}

                        else if ( (LA10_0==RULE_C_INPUT) && (synpred3_InternalCfg())) {s = 4;}

                        else if ( (LA10_0==RULE_C_TYPE) && (synpred3_InternalCfg())) {s = 5;}

                        else if ( (LA10_0==RULE_C_ENUM) && (synpred3_InternalCfg())) {s = 6;}

                        else if ( (LA10_0==RULE_C_INT) && (synpred3_InternalCfg())) {s = 7;}

                        else if ( (LA10_0==RULE_C_UINT) && (synpred3_InternalCfg())) {s = 8;}

                        else if ( (LA10_0==RULE_C_BOOL) && (synpred3_InternalCfg())) {s = 9;}

                        else if ( (LA10_0==RULE_C_NUMBER) && (synpred3_InternalCfg())) {s = 10;}

                        else if ( (LA10_0==RULE_C_STRING) && (synpred3_InternalCfg())) {s = 11;}

                        else if ( (LA10_0==RULE_NAME) && (synpred3_InternalCfg())) {s = 12;}

                         
                        input.seek(index10_0);
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
    static final String DFA15_eotS =
        "\16\uffff";
    static final String DFA15_eofS =
        "\16\uffff";
    static final String DFA15_minS =
        "\1\4\1\uffff\1\0\13\uffff";
    static final String DFA15_maxS =
        "\1\30\1\uffff\1\0\13\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\3\1\uffff\12\1\1\2";
    static final String DFA15_specialS =
        "\1\1\1\uffff\1\0\13\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\4\3\uffff\1\5\1\uffff\1\1\1\uffff\1\6\1\3\4\uffff\1\2\1"+
            "\7\1\10\1\11\1\12\1\13\1\14",
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
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "()* loopback of 792:1: ( ( ( ( ruleEnumField ) )=> (lv_fields_4_0= ruleEnumField ) ) | ( (lv_comm_5_0= ruleOtherComent ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_2 = input.LA(1);

                         
                        int index15_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalCfg()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index15_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                         
                        int index15_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA15_0==RULE_C_BRACE_R) ) {s = 1;}

                        else if ( (LA15_0==RULE_COMMENT) ) {s = 2;}

                        else if ( (LA15_0==RULE_C_BRACKET_L) && (synpred4_InternalCfg())) {s = 3;}

                        else if ( (LA15_0==RULE_C_INPUT) && (synpred4_InternalCfg())) {s = 4;}

                        else if ( (LA15_0==RULE_C_TYPE) && (synpred4_InternalCfg())) {s = 5;}

                        else if ( (LA15_0==RULE_C_ENUM) && (synpred4_InternalCfg())) {s = 6;}

                        else if ( (LA15_0==RULE_C_INT) && (synpred4_InternalCfg())) {s = 7;}

                        else if ( (LA15_0==RULE_C_UINT) && (synpred4_InternalCfg())) {s = 8;}

                        else if ( (LA15_0==RULE_C_BOOL) && (synpred4_InternalCfg())) {s = 9;}

                        else if ( (LA15_0==RULE_C_NUMBER) && (synpred4_InternalCfg())) {s = 10;}

                        else if ( (LA15_0==RULE_C_STRING) && (synpred4_InternalCfg())) {s = 11;}

                        else if ( (LA15_0==RULE_NAME) && (synpred4_InternalCfg())) {s = 12;}

                         
                        input.seek(index15_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleXML2_in_entryRuleXML275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXML285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputDef_in_ruleXML2133 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_rulePackDef_in_ruleXML2154 = new BitSet(new long[]{0x0000000000043102L});
    public static final BitSet FOLLOW_rulePackDef_in_ruleXML2183 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleInputDef_in_ruleXML2204 = new BitSet(new long[]{0x0000000000043102L});
    public static final BitSet FOLLOW_rulePackDef_in_ruleXML2232 = new BitSet(new long[]{0x0000000000043102L});
    public static final BitSet FOLLOW_ruleInputDef_in_ruleXML2259 = new BitSet(new long[]{0x0000000000043102L});
    public static final BitSet FOLLOW_ruleType_in_ruleXML2292 = new BitSet(new long[]{0x0000000000043102L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleXML2329 = new BitSet(new long[]{0x0000000000043102L});
    public static final BitSet FOLLOW_ruleOtherComent_in_ruleXML2356 = new BitSet(new long[]{0x0000000000043102L});
    public static final BitSet FOLLOW_ruleInputDef_in_entryRuleInputDef394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputDef404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_ruleInputDef450 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_RULE_C_INPUT_in_ruleInputDef468 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInputDef490 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_ruleInputDef507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackDef_in_entryRulePackDef544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackDef554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_rulePackDef600 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_RULE_C_PACKAGE_in_rulePackDef618 = new BitSet(new long[]{0x0000000001F81152L});
    public static final BitSet FOLLOW_rulePackName_in_rulePackDef644 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_rulePackDef657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeComment_in_ruleType750 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_ruleMeta_in_ruleType772 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_C_TYPE_in_ruleType790 = new BitSet(new long[]{0x0000000001F81110L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleType816 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_C_BRACE_L_in_ruleType827 = new BitSet(new long[]{0x0000000001FC3510L});
    public static final BitSet FOLLOW_ruleField_in_ruleType858 = new BitSet(new long[]{0x0000000001FC3510L});
    public static final BitSet FOLLOW_ruleOtherComent_in_ruleType885 = new BitSet(new long[]{0x0000000001FC3510L});
    public static final BitSet FOLLOW_RULE_C_BRACE_R_in_ruleType898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldComment_in_ruleField989 = new BitSet(new long[]{0x0000000001FC3110L});
    public static final BitSet FOLLOW_ruleMeta_in_ruleField1011 = new BitSet(new long[]{0x0000000001FC3110L});
    public static final BitSet FOLLOW_ruleFieldType_in_ruleField1033 = new BitSet(new long[]{0x0000000001F81110L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleField1054 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_ruleField1065 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleField1081 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_ruleField1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_entryRuleFieldType1135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldType1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleFieldType1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum1225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeComment_in_ruleEnum1281 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_C_ENUM_in_ruleEnum1299 = new BitSet(new long[]{0x0000000001F81110L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleEnum1325 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_C_BRACE_L_in_ruleEnum1336 = new BitSet(new long[]{0x0000000001FC3510L});
    public static final BitSet FOLLOW_ruleEnumField_in_ruleEnum1367 = new BitSet(new long[]{0x0000000001FC3510L});
    public static final BitSet FOLLOW_ruleOtherComent_in_ruleEnum1394 = new BitSet(new long[]{0x0000000001FC3510L});
    public static final BitSet FOLLOW_RULE_C_BRACE_R_in_ruleEnum1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_entryRuleEnumField1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumField1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldComment_in_ruleEnumField1498 = new BitSet(new long[]{0x0000000001F83110L});
    public static final BitSet FOLLOW_ruleMeta_in_ruleEnumField1520 = new BitSet(new long[]{0x0000000001F83110L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleEnumField1542 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_ruleEnumField1553 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumField1569 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_ruleEnumField1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeta_in_entryRuleMeta1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeta1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_L_in_ruleMeta1669 = new BitSet(new long[]{0x0000000001F81110L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleMeta1689 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_ruleMeta1701 = new BitSet(new long[]{0x0000000001F91130L});
    public static final BitSet FOLLOW_ruleMetaParam_in_ruleMeta1722 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_RULE_C_COMMA_in_ruleMeta1734 = new BitSet(new long[]{0x0000000001F81130L});
    public static final BitSet FOLLOW_ruleMetaParam_in_ruleMeta1754 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_ruleMeta1769 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_R_in_ruleMeta1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaParam_in_entryRuleMetaParam1816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaParam1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleMetaParam1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetaParam1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeComment_in_entryRuleTypeComment1937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeComment1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleTypeComment1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldComment_in_entryRuleFieldComment2032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldComment2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleFieldComment2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_entryRuleOtherComent2126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherComent2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleOtherComent2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackName_in_entryRulePackName2218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackName2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rulePackName2276 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_rulePackName2295 = new BitSet(new long[]{0x0000000001F81110L});
    public static final BitSet FOLLOW_ruleTypeName_in_rulePackName2317 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_entryRuleTypeName2365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeName2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INPUT_in_ruleTypeName2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_TYPE_in_ruleTypeName2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_ENUM_in_ruleTypeName2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INT_in_ruleTypeName2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_UINT_in_ruleTypeName2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BOOL_in_ruleTypeName2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_NUMBER_in_ruleTypeName2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_STRING_in_ruleTypeName2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_ruleTypeName2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_synpred1_InternalCfg275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_synpred2_InternalCfg312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_synpred3_InternalCfg841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_synpred4_InternalCfg1350 = new BitSet(new long[]{0x0000000000000002L});

}