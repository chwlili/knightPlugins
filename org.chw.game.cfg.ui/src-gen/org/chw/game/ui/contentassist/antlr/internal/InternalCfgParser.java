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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCfgParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMMENT", "RULE_C_INPUT", "RULE_C_MAIN", "RULE_C_TYPE", "RULE_C_INT", "RULE_C_UINT", "RULE_C_BOOL", "RULE_C_NUMBER", "RULE_C_STRING", "RULE_C_LIST", "RULE_C_SLICE", "RULE_NAME", "RULE_C_SEMICOLON", "RULE_C_BRACE_L", "RULE_C_BRACE_R", "RULE_C_BRACKET_L", "RULE_C_PAREN_L", "RULE_C_PAREN_R", "RULE_C_BRACKET_R", "RULE_C_EQUALS", "RULE_C_COMMA", "RULE_STRING", "RULE_C_PACKAGE", "RULE_C_ANGLE_L", "RULE_C_ANGLE_R", "RULE_COMMENT_END", "RULE_WS", "'.'"
    };
    public static final int RULE_C_NUMBER=11;
    public static final int RULE_C_COMMA=24;
    public static final int RULE_C_TYPE=7;
    public static final int RULE_C_PAREN_R=21;
    public static final int RULE_C_SEMICOLON=16;
    public static final int RULE_C_PAREN_L=20;
    public static final int RULE_C_INPUT=5;
    public static final int RULE_C_STRING=12;
    public static final int RULE_C_SLICE=14;
    public static final int RULE_COMMENT=4;
    public static final int RULE_C_PACKAGE=26;
    public static final int EOF=-1;
    public static final int RULE_C_ANGLE_L=27;
    public static final int RULE_C_ANGLE_R=28;
    public static final int RULE_COMMENT_END=29;
    public static final int RULE_C_BRACKET_L=19;
    public static final int T__31=31;
    public static final int RULE_STRING=25;
    public static final int RULE_C_EQUALS=23;
    public static final int RULE_C_UINT=9;
    public static final int RULE_C_BRACKET_R=22;
    public static final int RULE_C_MAIN=6;
    public static final int RULE_C_INT=8;
    public static final int RULE_NAME=15;
    public static final int RULE_WS=30;
    public static final int RULE_C_BOOL=10;
    public static final int RULE_C_LIST=13;
    public static final int RULE_C_BRACE_L=17;
    public static final int RULE_C_BRACE_R=18;

    // delegates
    // delegators


        public InternalCfgParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCfgParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCfgParser.tokenNames; }
    public String getGrammarFileName() { return "../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g"; }


     
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




    // $ANTLR start "entryRuleXML2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:61:1: entryRuleXML2 : ruleXML2 EOF ;
    public final void entryRuleXML2() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:62:1: ( ruleXML2 EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:63:1: ruleXML2 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Rule()); 
            }
            pushFollow(FOLLOW_ruleXML2_in_entryRuleXML267);
            ruleXML2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXML2Rule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXML274); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXML2"


    // $ANTLR start "ruleXML2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:70:1: ruleXML2 : ( ( rule__XML2__Group__0 ) ) ;
    public final void ruleXML2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:74:2: ( ( ( rule__XML2__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:75:1: ( ( rule__XML2__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:75:1: ( ( rule__XML2__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:76:1: ( rule__XML2__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getGroup()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:77:1: ( rule__XML2__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:77:2: rule__XML2__Group__0
            {
            pushFollow(FOLLOW_rule__XML2__Group__0_in_ruleXML2100);
            rule__XML2__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXML2Access().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXML2"


    // $ANTLR start "entryRuleInputDef"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:89:1: entryRuleInputDef : ruleInputDef EOF ;
    public final void entryRuleInputDef() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:90:1: ( ruleInputDef EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:91:1: ruleInputDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputDefRule()); 
            }
            pushFollow(FOLLOW_ruleInputDef_in_entryRuleInputDef127);
            ruleInputDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputDefRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputDef134); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputDef"


    // $ANTLR start "ruleInputDef"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:98:1: ruleInputDef : ( ( rule__InputDef__Group__0 ) ) ;
    public final void ruleInputDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:102:2: ( ( ( rule__InputDef__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:103:1: ( ( rule__InputDef__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:103:1: ( ( rule__InputDef__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:104:1: ( rule__InputDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputDefAccess().getGroup()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:105:1: ( rule__InputDef__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:105:2: rule__InputDef__Group__0
            {
            pushFollow(FOLLOW_rule__InputDef__Group__0_in_ruleInputDef160);
            rule__InputDef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputDefAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputDef"


    // $ANTLR start "entryRulePackDef"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:117:1: entryRulePackDef : rulePackDef EOF ;
    public final void entryRulePackDef() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:118:1: ( rulePackDef EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:119:1: rulePackDef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackDefRule()); 
            }
            pushFollow(FOLLOW_rulePackDef_in_entryRulePackDef187);
            rulePackDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackDefRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackDef194); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackDef"


    // $ANTLR start "rulePackDef"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:126:1: rulePackDef : ( ( rule__PackDef__Group__0 ) ) ;
    public final void rulePackDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:130:2: ( ( ( rule__PackDef__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:131:1: ( ( rule__PackDef__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:131:1: ( ( rule__PackDef__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:132:1: ( rule__PackDef__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackDefAccess().getGroup()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:133:1: ( rule__PackDef__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:133:2: rule__PackDef__Group__0
            {
            pushFollow(FOLLOW_rule__PackDef__Group__0_in_rulePackDef220);
            rule__PackDef__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackDefAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackDef"


    // $ANTLR start "entryRuleType"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:145:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:146:1: ( ruleType EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:147:1: ruleType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType247);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType254); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:154:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:158:2: ( ( ( rule__Type__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:159:1: ( ( rule__Type__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:159:1: ( ( rule__Type__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:160:1: ( rule__Type__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getGroup()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:161:1: ( rule__Type__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:161:2: rule__Type__Group__0
            {
            pushFollow(FOLLOW_rule__Type__Group__0_in_ruleType280);
            rule__Type__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleEnter"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:173:1: entryRuleEnter : ruleEnter EOF ;
    public final void entryRuleEnter() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:174:1: ( ruleEnter EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:175:1: ruleEnter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterRule()); 
            }
            pushFollow(FOLLOW_ruleEnter_in_entryRuleEnter307);
            ruleEnter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnter314); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnter"


    // $ANTLR start "ruleEnter"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:182:1: ruleEnter : ( ( rule__Enter__Group__0 ) ) ;
    public final void ruleEnter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:186:2: ( ( ( rule__Enter__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:187:1: ( ( rule__Enter__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:187:1: ( ( rule__Enter__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:188:1: ( rule__Enter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getGroup()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:189:1: ( rule__Enter__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:189:2: rule__Enter__Group__0
            {
            pushFollow(FOLLOW_rule__Enter__Group__0_in_ruleEnter340);
            rule__Enter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnterAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnter"


    // $ANTLR start "entryRuleField"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:201:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:202:1: ( ruleField EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:203:1: ruleField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField367);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField374); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:210:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:214:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:215:1: ( ( rule__Field__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:215:1: ( ( rule__Field__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:216:1: ( rule__Field__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getGroup()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:217:1: ( rule__Field__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:217:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField400);
            rule__Field__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleFieldType"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:229:1: entryRuleFieldType : ruleFieldType EOF ;
    public final void entryRuleFieldType() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:230:1: ( ruleFieldType EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:231:1: ruleFieldType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleFieldType_in_entryRuleFieldType427);
            ruleFieldType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldType434); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldType"


    // $ANTLR start "ruleFieldType"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:238:1: ruleFieldType : ( ( rule__FieldType__TypeAssignment ) ) ;
    public final void ruleFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:242:2: ( ( ( rule__FieldType__TypeAssignment ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:243:1: ( ( rule__FieldType__TypeAssignment ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:243:1: ( ( rule__FieldType__TypeAssignment ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:244:1: ( rule__FieldType__TypeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldTypeAccess().getTypeAssignment()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:245:1: ( rule__FieldType__TypeAssignment )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:245:2: rule__FieldType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__FieldType__TypeAssignment_in_ruleFieldType460);
            rule__FieldType__TypeAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldTypeAccess().getTypeAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldType"


    // $ANTLR start "entryRuleListMeta"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:257:1: entryRuleListMeta : ruleListMeta EOF ;
    public final void entryRuleListMeta() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:258:1: ( ruleListMeta EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:259:1: ruleListMeta EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaRule()); 
            }
            pushFollow(FOLLOW_ruleListMeta_in_entryRuleListMeta487);
            ruleListMeta();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListMetaRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleListMeta494); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListMeta"


    // $ANTLR start "ruleListMeta"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:266:1: ruleListMeta : ( ( rule__ListMeta__Group__0 ) ) ;
    public final void ruleListMeta() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:270:2: ( ( ( rule__ListMeta__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:271:1: ( ( rule__ListMeta__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:271:1: ( ( rule__ListMeta__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:272:1: ( rule__ListMeta__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getGroup()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:273:1: ( rule__ListMeta__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:273:2: rule__ListMeta__Group__0
            {
            pushFollow(FOLLOW_rule__ListMeta__Group__0_in_ruleListMeta520);
            rule__ListMeta__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListMetaAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListMeta"


    // $ANTLR start "entryRuleSliceMeta"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:285:1: entryRuleSliceMeta : ruleSliceMeta EOF ;
    public final void entryRuleSliceMeta() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:286:1: ( ruleSliceMeta EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:287:1: ruleSliceMeta EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSliceMetaRule()); 
            }
            pushFollow(FOLLOW_ruleSliceMeta_in_entryRuleSliceMeta547);
            ruleSliceMeta();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSliceMetaRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSliceMeta554); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSliceMeta"


    // $ANTLR start "ruleSliceMeta"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:294:1: ruleSliceMeta : ( ( rule__SliceMeta__Group__0 ) ) ;
    public final void ruleSliceMeta() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:298:2: ( ( ( rule__SliceMeta__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:299:1: ( ( rule__SliceMeta__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:299:1: ( ( rule__SliceMeta__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:300:1: ( rule__SliceMeta__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSliceMetaAccess().getGroup()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:301:1: ( rule__SliceMeta__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:301:2: rule__SliceMeta__Group__0
            {
            pushFollow(FOLLOW_rule__SliceMeta__Group__0_in_ruleSliceMeta580);
            rule__SliceMeta__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSliceMetaAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSliceMeta"


    // $ANTLR start "entryRuleFieldMetaKey"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:313:1: entryRuleFieldMetaKey : ruleFieldMetaKey EOF ;
    public final void entryRuleFieldMetaKey() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:314:1: ( ruleFieldMetaKey EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:315:1: ruleFieldMetaKey EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMetaKeyRule()); 
            }
            pushFollow(FOLLOW_ruleFieldMetaKey_in_entryRuleFieldMetaKey607);
            ruleFieldMetaKey();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMetaKeyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldMetaKey614); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldMetaKey"


    // $ANTLR start "ruleFieldMetaKey"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:322:1: ruleFieldMetaKey : ( ( rule__FieldMetaKey__FieldNameAssignment ) ) ;
    public final void ruleFieldMetaKey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:326:2: ( ( ( rule__FieldMetaKey__FieldNameAssignment ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:327:1: ( ( rule__FieldMetaKey__FieldNameAssignment ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:327:1: ( ( rule__FieldMetaKey__FieldNameAssignment ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:328:1: ( rule__FieldMetaKey__FieldNameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMetaKeyAccess().getFieldNameAssignment()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:329:1: ( rule__FieldMetaKey__FieldNameAssignment )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:329:2: rule__FieldMetaKey__FieldNameAssignment
            {
            pushFollow(FOLLOW_rule__FieldMetaKey__FieldNameAssignment_in_ruleFieldMetaKey640);
            rule__FieldMetaKey__FieldNameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMetaKeyAccess().getFieldNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldMetaKey"


    // $ANTLR start "entryRuleTypeComment"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:341:1: entryRuleTypeComment : ruleTypeComment EOF ;
    public final void entryRuleTypeComment() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:342:1: ( ruleTypeComment EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:343:1: ruleTypeComment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeCommentRule()); 
            }
            pushFollow(FOLLOW_ruleTypeComment_in_entryRuleTypeComment667);
            ruleTypeComment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeCommentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeComment674); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeComment"


    // $ANTLR start "ruleTypeComment"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:350:1: ruleTypeComment : ( RULE_COMMENT ) ;
    public final void ruleTypeComment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:354:2: ( ( RULE_COMMENT ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:355:1: ( RULE_COMMENT )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:355:1: ( RULE_COMMENT )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:356:1: RULE_COMMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeCommentAccess().getCOMMENTTerminalRuleCall()); 
            }
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleTypeComment700); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeCommentAccess().getCOMMENTTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeComment"


    // $ANTLR start "entryRuleFieldComment"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:369:1: entryRuleFieldComment : ruleFieldComment EOF ;
    public final void entryRuleFieldComment() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:370:1: ( ruleFieldComment EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:371:1: ruleFieldComment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldCommentRule()); 
            }
            pushFollow(FOLLOW_ruleFieldComment_in_entryRuleFieldComment726);
            ruleFieldComment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldCommentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldComment733); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldComment"


    // $ANTLR start "ruleFieldComment"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:378:1: ruleFieldComment : ( RULE_COMMENT ) ;
    public final void ruleFieldComment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:382:2: ( ( RULE_COMMENT ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:383:1: ( RULE_COMMENT )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:383:1: ( RULE_COMMENT )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:384:1: RULE_COMMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldCommentAccess().getCOMMENTTerminalRuleCall()); 
            }
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleFieldComment759); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldCommentAccess().getCOMMENTTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldComment"


    // $ANTLR start "entryRuleOtherComent"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:397:1: entryRuleOtherComent : ruleOtherComent EOF ;
    public final void entryRuleOtherComent() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:398:1: ( ruleOtherComent EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:399:1: ruleOtherComent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherComentRule()); 
            }
            pushFollow(FOLLOW_ruleOtherComent_in_entryRuleOtherComent785);
            ruleOtherComent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherComentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherComent792); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOtherComent"


    // $ANTLR start "ruleOtherComent"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:406:1: ruleOtherComent : ( ( rule__OtherComent__CommAssignment ) ) ;
    public final void ruleOtherComent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:410:2: ( ( ( rule__OtherComent__CommAssignment ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:411:1: ( ( rule__OtherComent__CommAssignment ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:411:1: ( ( rule__OtherComent__CommAssignment ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:412:1: ( rule__OtherComent__CommAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherComentAccess().getCommAssignment()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:413:1: ( rule__OtherComent__CommAssignment )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:413:2: rule__OtherComent__CommAssignment
            {
            pushFollow(FOLLOW_rule__OtherComent__CommAssignment_in_ruleOtherComent818);
            rule__OtherComent__CommAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherComentAccess().getCommAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOtherComent"


    // $ANTLR start "entryRulePackName"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:425:1: entryRulePackName : rulePackName EOF ;
    public final void entryRulePackName() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:426:1: ( rulePackName EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:427:1: rulePackName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackNameRule()); 
            }
            pushFollow(FOLLOW_rulePackName_in_entryRulePackName845);
            rulePackName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackName852); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackName"


    // $ANTLR start "rulePackName"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:434:1: rulePackName : ( ( rule__PackName__Group__0 ) ) ;
    public final void rulePackName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:438:2: ( ( ( rule__PackName__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:439:1: ( ( rule__PackName__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:439:1: ( ( rule__PackName__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:440:1: ( rule__PackName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackNameAccess().getGroup()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:441:1: ( rule__PackName__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:441:2: rule__PackName__Group__0
            {
            pushFollow(FOLLOW_rule__PackName__Group__0_in_rulePackName878);
            rule__PackName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackName"


    // $ANTLR start "entryRuleTypeName"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:453:1: entryRuleTypeName : ruleTypeName EOF ;
    public final void entryRuleTypeName() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:454:1: ( ruleTypeName EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:455:1: ruleTypeName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeNameRule()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_entryRuleTypeName905);
            ruleTypeName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeName912); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeName"


    // $ANTLR start "ruleTypeName"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:462:1: ruleTypeName : ( ( rule__TypeName__Alternatives ) ) ;
    public final void ruleTypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:466:2: ( ( ( rule__TypeName__Alternatives ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:467:1: ( ( rule__TypeName__Alternatives ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:467:1: ( ( rule__TypeName__Alternatives ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:468:1: ( rule__TypeName__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeNameAccess().getAlternatives()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:469:1: ( rule__TypeName__Alternatives )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:469:2: rule__TypeName__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeName__Alternatives_in_ruleTypeName938);
            rule__TypeName__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeNameAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeName"


    // $ANTLR start "rule__XML2__Alternatives_0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:481:1: rule__XML2__Alternatives_0 : ( ( ( rule__XML2__Group_0_0__0 ) ) | ( ( rule__XML2__Group_0_1__0 ) ) | ( ( rule__XML2__PackAssignment_0_2 ) ) | ( ( rule__XML2__InputAssignment_0_3 ) ) );
    public final void rule__XML2__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:485:1: ( ( ( rule__XML2__Group_0_0__0 ) ) | ( ( rule__XML2__Group_0_1__0 ) ) | ( ( rule__XML2__PackAssignment_0_2 ) ) | ( ( rule__XML2__InputAssignment_0_3 ) ) )
            int alt1=4;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:486:1: ( ( rule__XML2__Group_0_0__0 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:486:1: ( ( rule__XML2__Group_0_0__0 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:487:1: ( rule__XML2__Group_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXML2Access().getGroup_0_0()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:488:1: ( rule__XML2__Group_0_0__0 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:488:2: rule__XML2__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__XML2__Group_0_0__0_in_rule__XML2__Alternatives_0974);
                    rule__XML2__Group_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXML2Access().getGroup_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:492:6: ( ( rule__XML2__Group_0_1__0 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:492:6: ( ( rule__XML2__Group_0_1__0 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:493:1: ( rule__XML2__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXML2Access().getGroup_0_1()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:494:1: ( rule__XML2__Group_0_1__0 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:494:2: rule__XML2__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__XML2__Group_0_1__0_in_rule__XML2__Alternatives_0992);
                    rule__XML2__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXML2Access().getGroup_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:498:6: ( ( rule__XML2__PackAssignment_0_2 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:498:6: ( ( rule__XML2__PackAssignment_0_2 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:499:1: ( rule__XML2__PackAssignment_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXML2Access().getPackAssignment_0_2()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:500:1: ( rule__XML2__PackAssignment_0_2 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:500:2: rule__XML2__PackAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__XML2__PackAssignment_0_2_in_rule__XML2__Alternatives_01010);
                    rule__XML2__PackAssignment_0_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXML2Access().getPackAssignment_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:504:6: ( ( rule__XML2__InputAssignment_0_3 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:504:6: ( ( rule__XML2__InputAssignment_0_3 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:505:1: ( rule__XML2__InputAssignment_0_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXML2Access().getInputAssignment_0_3()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:506:1: ( rule__XML2__InputAssignment_0_3 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:506:2: rule__XML2__InputAssignment_0_3
                    {
                    pushFollow(FOLLOW_rule__XML2__InputAssignment_0_3_in_rule__XML2__Alternatives_01028);
                    rule__XML2__InputAssignment_0_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXML2Access().getInputAssignment_0_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__Alternatives_0"


    // $ANTLR start "rule__XML2__Alternatives_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:515:1: rule__XML2__Alternatives_1 : ( ( ( rule__XML2__TypesAssignment_1_0 ) ) | ( ( rule__XML2__CommAssignment_1_1 ) ) );
    public final void rule__XML2__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:519:1: ( ( ( rule__XML2__TypesAssignment_1_0 ) ) | ( ( rule__XML2__CommAssignment_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_COMMENT) ) {
                int LA2_1 = input.LA(2);

                if ( (synpred4_InternalCfg()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_C_TYPE||LA2_0==RULE_C_BRACKET_L) ) {
                alt2=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:520:1: ( ( rule__XML2__TypesAssignment_1_0 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:520:1: ( ( rule__XML2__TypesAssignment_1_0 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:521:1: ( rule__XML2__TypesAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXML2Access().getTypesAssignment_1_0()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:522:1: ( rule__XML2__TypesAssignment_1_0 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:522:2: rule__XML2__TypesAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__XML2__TypesAssignment_1_0_in_rule__XML2__Alternatives_11061);
                    rule__XML2__TypesAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXML2Access().getTypesAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:526:6: ( ( rule__XML2__CommAssignment_1_1 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:526:6: ( ( rule__XML2__CommAssignment_1_1 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:527:1: ( rule__XML2__CommAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXML2Access().getCommAssignment_1_1()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:528:1: ( rule__XML2__CommAssignment_1_1 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:528:2: rule__XML2__CommAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__XML2__CommAssignment_1_1_in_rule__XML2__Alternatives_11079);
                    rule__XML2__CommAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXML2Access().getCommAssignment_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__Alternatives_1"


    // $ANTLR start "rule__Type__Alternatives_5"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:537:1: rule__Type__Alternatives_5 : ( ( ( rule__Type__FieldsAssignment_5_0 ) ) | ( ( rule__Type__CommAssignment_5_1 ) ) );
    public final void rule__Type__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:541:1: ( ( ( rule__Type__FieldsAssignment_5_0 ) ) | ( ( rule__Type__CommAssignment_5_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_COMMENT) ) {
                int LA3_1 = input.LA(2);

                if ( (synpred5_InternalCfg()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA3_0>=RULE_C_INPUT && LA3_0<=RULE_NAME)||LA3_0==RULE_C_BRACKET_L) ) {
                alt3=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:542:1: ( ( rule__Type__FieldsAssignment_5_0 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:542:1: ( ( rule__Type__FieldsAssignment_5_0 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:543:1: ( rule__Type__FieldsAssignment_5_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getFieldsAssignment_5_0()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:544:1: ( rule__Type__FieldsAssignment_5_0 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:544:2: rule__Type__FieldsAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__Type__FieldsAssignment_5_0_in_rule__Type__Alternatives_51112);
                    rule__Type__FieldsAssignment_5_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getFieldsAssignment_5_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:548:6: ( ( rule__Type__CommAssignment_5_1 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:548:6: ( ( rule__Type__CommAssignment_5_1 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:549:1: ( rule__Type__CommAssignment_5_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getCommAssignment_5_1()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:550:1: ( rule__Type__CommAssignment_5_1 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:550:2: rule__Type__CommAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__Type__CommAssignment_5_1_in_rule__Type__Alternatives_51130);
                    rule__Type__CommAssignment_5_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getCommAssignment_5_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives_5"


    // $ANTLR start "rule__Field__Alternatives_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:559:1: rule__Field__Alternatives_1 : ( ( ( rule__Field__MetaAssignment_1_0 ) ) | ( ( rule__Field__MetaAssignment_1_1 ) ) );
    public final void rule__Field__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:563:1: ( ( ( rule__Field__MetaAssignment_1_0 ) ) | ( ( rule__Field__MetaAssignment_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_C_BRACKET_L) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_C_SLICE) ) {
                    alt4=2;
                }
                else if ( (LA4_1==RULE_C_LIST) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:564:1: ( ( rule__Field__MetaAssignment_1_0 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:564:1: ( ( rule__Field__MetaAssignment_1_0 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:565:1: ( rule__Field__MetaAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldAccess().getMetaAssignment_1_0()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:566:1: ( rule__Field__MetaAssignment_1_0 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:566:2: rule__Field__MetaAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Field__MetaAssignment_1_0_in_rule__Field__Alternatives_11163);
                    rule__Field__MetaAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldAccess().getMetaAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:570:6: ( ( rule__Field__MetaAssignment_1_1 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:570:6: ( ( rule__Field__MetaAssignment_1_1 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:571:1: ( rule__Field__MetaAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldAccess().getMetaAssignment_1_1()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:572:1: ( rule__Field__MetaAssignment_1_1 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:572:2: rule__Field__MetaAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Field__MetaAssignment_1_1_in_rule__Field__Alternatives_11181);
                    rule__Field__MetaAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFieldAccess().getMetaAssignment_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Alternatives_1"


    // $ANTLR start "rule__TypeName__Alternatives"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:581:1: rule__TypeName__Alternatives : ( ( RULE_C_INPUT ) | ( RULE_C_MAIN ) | ( RULE_C_TYPE ) | ( RULE_C_INT ) | ( RULE_C_UINT ) | ( RULE_C_BOOL ) | ( RULE_C_NUMBER ) | ( RULE_C_STRING ) | ( RULE_C_LIST ) | ( RULE_C_SLICE ) | ( RULE_NAME ) );
    public final void rule__TypeName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:585:1: ( ( RULE_C_INPUT ) | ( RULE_C_MAIN ) | ( RULE_C_TYPE ) | ( RULE_C_INT ) | ( RULE_C_UINT ) | ( RULE_C_BOOL ) | ( RULE_C_NUMBER ) | ( RULE_C_STRING ) | ( RULE_C_LIST ) | ( RULE_C_SLICE ) | ( RULE_NAME ) )
            int alt5=11;
            switch ( input.LA(1) ) {
            case RULE_C_INPUT:
                {
                alt5=1;
                }
                break;
            case RULE_C_MAIN:
                {
                alt5=2;
                }
                break;
            case RULE_C_TYPE:
                {
                alt5=3;
                }
                break;
            case RULE_C_INT:
                {
                alt5=4;
                }
                break;
            case RULE_C_UINT:
                {
                alt5=5;
                }
                break;
            case RULE_C_BOOL:
                {
                alt5=6;
                }
                break;
            case RULE_C_NUMBER:
                {
                alt5=7;
                }
                break;
            case RULE_C_STRING:
                {
                alt5=8;
                }
                break;
            case RULE_C_LIST:
                {
                alt5=9;
                }
                break;
            case RULE_C_SLICE:
                {
                alt5=10;
                }
                break;
            case RULE_NAME:
                {
                alt5=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:586:1: ( RULE_C_INPUT )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:586:1: ( RULE_C_INPUT )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:587:1: RULE_C_INPUT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_INPUTTerminalRuleCall_0()); 
                    }
                    match(input,RULE_C_INPUT,FOLLOW_RULE_C_INPUT_in_rule__TypeName__Alternatives1214); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_INPUTTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:592:6: ( RULE_C_MAIN )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:592:6: ( RULE_C_MAIN )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:593:1: RULE_C_MAIN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_MAINTerminalRuleCall_1()); 
                    }
                    match(input,RULE_C_MAIN,FOLLOW_RULE_C_MAIN_in_rule__TypeName__Alternatives1231); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_MAINTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:598:6: ( RULE_C_TYPE )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:598:6: ( RULE_C_TYPE )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:599:1: RULE_C_TYPE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_TYPETerminalRuleCall_2()); 
                    }
                    match(input,RULE_C_TYPE,FOLLOW_RULE_C_TYPE_in_rule__TypeName__Alternatives1248); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_TYPETerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:604:6: ( RULE_C_INT )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:604:6: ( RULE_C_INT )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:605:1: RULE_C_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_INTTerminalRuleCall_3()); 
                    }
                    match(input,RULE_C_INT,FOLLOW_RULE_C_INT_in_rule__TypeName__Alternatives1265); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_INTTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:610:6: ( RULE_C_UINT )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:610:6: ( RULE_C_UINT )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:611:1: RULE_C_UINT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_UINTTerminalRuleCall_4()); 
                    }
                    match(input,RULE_C_UINT,FOLLOW_RULE_C_UINT_in_rule__TypeName__Alternatives1282); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_UINTTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:616:6: ( RULE_C_BOOL )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:616:6: ( RULE_C_BOOL )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:617:1: RULE_C_BOOL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_BOOLTerminalRuleCall_5()); 
                    }
                    match(input,RULE_C_BOOL,FOLLOW_RULE_C_BOOL_in_rule__TypeName__Alternatives1299); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_BOOLTerminalRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:622:6: ( RULE_C_NUMBER )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:622:6: ( RULE_C_NUMBER )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:623:1: RULE_C_NUMBER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_NUMBERTerminalRuleCall_6()); 
                    }
                    match(input,RULE_C_NUMBER,FOLLOW_RULE_C_NUMBER_in_rule__TypeName__Alternatives1316); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_NUMBERTerminalRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:628:6: ( RULE_C_STRING )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:628:6: ( RULE_C_STRING )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:629:1: RULE_C_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_STRINGTerminalRuleCall_7()); 
                    }
                    match(input,RULE_C_STRING,FOLLOW_RULE_C_STRING_in_rule__TypeName__Alternatives1333); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_STRINGTerminalRuleCall_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:634:6: ( RULE_C_LIST )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:634:6: ( RULE_C_LIST )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:635:1: RULE_C_LIST
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_LISTTerminalRuleCall_8()); 
                    }
                    match(input,RULE_C_LIST,FOLLOW_RULE_C_LIST_in_rule__TypeName__Alternatives1350); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_LISTTerminalRuleCall_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:640:6: ( RULE_C_SLICE )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:640:6: ( RULE_C_SLICE )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:641:1: RULE_C_SLICE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_SLICETerminalRuleCall_9()); 
                    }
                    match(input,RULE_C_SLICE,FOLLOW_RULE_C_SLICE_in_rule__TypeName__Alternatives1367); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_SLICETerminalRuleCall_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:646:6: ( RULE_NAME )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:646:6: ( RULE_NAME )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:647:1: RULE_NAME
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getNAMETerminalRuleCall_10()); 
                    }
                    match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rule__TypeName__Alternatives1384); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getNAMETerminalRuleCall_10()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeName__Alternatives"


    // $ANTLR start "rule__XML2__Group__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:659:1: rule__XML2__Group__0 : rule__XML2__Group__0__Impl rule__XML2__Group__1 ;
    public final void rule__XML2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:663:1: ( rule__XML2__Group__0__Impl rule__XML2__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:664:2: rule__XML2__Group__0__Impl rule__XML2__Group__1
            {
            pushFollow(FOLLOW_rule__XML2__Group__0__Impl_in_rule__XML2__Group__01414);
            rule__XML2__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__XML2__Group__1_in_rule__XML2__Group__01417);
            rule__XML2__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__Group__0"


    // $ANTLR start "rule__XML2__Group__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:671:1: rule__XML2__Group__0__Impl : ( ( rule__XML2__Alternatives_0 ) ) ;
    public final void rule__XML2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:675:1: ( ( ( rule__XML2__Alternatives_0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:676:1: ( ( rule__XML2__Alternatives_0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:676:1: ( ( rule__XML2__Alternatives_0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:677:1: ( rule__XML2__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getAlternatives_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:678:1: ( rule__XML2__Alternatives_0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:678:2: rule__XML2__Alternatives_0
            {
            pushFollow(FOLLOW_rule__XML2__Alternatives_0_in_rule__XML2__Group__0__Impl1444);
            rule__XML2__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXML2Access().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__Group__0__Impl"


    // $ANTLR start "rule__XML2__Group__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:688:1: rule__XML2__Group__1 : rule__XML2__Group__1__Impl ;
    public final void rule__XML2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:692:1: ( rule__XML2__Group__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:693:2: rule__XML2__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__XML2__Group__1__Impl_in_rule__XML2__Group__11474);
            rule__XML2__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__Group__1"


    // $ANTLR start "rule__XML2__Group__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:699:1: rule__XML2__Group__1__Impl : ( ( rule__XML2__Alternatives_1 )* ) ;
    public final void rule__XML2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:703:1: ( ( ( rule__XML2__Alternatives_1 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:704:1: ( ( rule__XML2__Alternatives_1 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:704:1: ( ( rule__XML2__Alternatives_1 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:705:1: ( rule__XML2__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getAlternatives_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:706:1: ( rule__XML2__Alternatives_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMENT||LA6_0==RULE_C_TYPE||LA6_0==RULE_C_BRACKET_L) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:706:2: rule__XML2__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__XML2__Alternatives_1_in_rule__XML2__Group__1__Impl1501);
            	    rule__XML2__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXML2Access().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__Group__1__Impl"


    // $ANTLR start "rule__XML2__Group_0_0__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:720:1: rule__XML2__Group_0_0__0 : rule__XML2__Group_0_0__0__Impl rule__XML2__Group_0_0__1 ;
    public final void rule__XML2__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:724:1: ( rule__XML2__Group_0_0__0__Impl rule__XML2__Group_0_0__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:725:2: rule__XML2__Group_0_0__0__Impl rule__XML2__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__XML2__Group_0_0__0__Impl_in_rule__XML2__Group_0_0__01536);
            rule__XML2__Group_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__XML2__Group_0_0__1_in_rule__XML2__Group_0_0__01539);
            rule__XML2__Group_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__Group_0_0__0"


    // $ANTLR start "rule__XML2__Group_0_0__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:732:1: rule__XML2__Group_0_0__0__Impl : ( ( rule__XML2__InputAssignment_0_0_0 ) ) ;
    public final void rule__XML2__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:736:1: ( ( ( rule__XML2__InputAssignment_0_0_0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:737:1: ( ( rule__XML2__InputAssignment_0_0_0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:737:1: ( ( rule__XML2__InputAssignment_0_0_0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:738:1: ( rule__XML2__InputAssignment_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getInputAssignment_0_0_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:739:1: ( rule__XML2__InputAssignment_0_0_0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:739:2: rule__XML2__InputAssignment_0_0_0
            {
            pushFollow(FOLLOW_rule__XML2__InputAssignment_0_0_0_in_rule__XML2__Group_0_0__0__Impl1566);
            rule__XML2__InputAssignment_0_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXML2Access().getInputAssignment_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__Group_0_0__0__Impl"


    // $ANTLR start "rule__XML2__Group_0_0__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:749:1: rule__XML2__Group_0_0__1 : rule__XML2__Group_0_0__1__Impl ;
    public final void rule__XML2__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:753:1: ( rule__XML2__Group_0_0__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:754:2: rule__XML2__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__XML2__Group_0_0__1__Impl_in_rule__XML2__Group_0_0__11596);
            rule__XML2__Group_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__Group_0_0__1"


    // $ANTLR start "rule__XML2__Group_0_0__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:760:1: rule__XML2__Group_0_0__1__Impl : ( ( rule__XML2__PackAssignment_0_0_1 ) ) ;
    public final void rule__XML2__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:764:1: ( ( ( rule__XML2__PackAssignment_0_0_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:765:1: ( ( rule__XML2__PackAssignment_0_0_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:765:1: ( ( rule__XML2__PackAssignment_0_0_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:766:1: ( rule__XML2__PackAssignment_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getPackAssignment_0_0_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:767:1: ( rule__XML2__PackAssignment_0_0_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:767:2: rule__XML2__PackAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__XML2__PackAssignment_0_0_1_in_rule__XML2__Group_0_0__1__Impl1623);
            rule__XML2__PackAssignment_0_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXML2Access().getPackAssignment_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__Group_0_0__1__Impl"


    // $ANTLR start "rule__XML2__Group_0_1__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:781:1: rule__XML2__Group_0_1__0 : rule__XML2__Group_0_1__0__Impl rule__XML2__Group_0_1__1 ;
    public final void rule__XML2__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:785:1: ( rule__XML2__Group_0_1__0__Impl rule__XML2__Group_0_1__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:786:2: rule__XML2__Group_0_1__0__Impl rule__XML2__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__XML2__Group_0_1__0__Impl_in_rule__XML2__Group_0_1__01657);
            rule__XML2__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__XML2__Group_0_1__1_in_rule__XML2__Group_0_1__01660);
            rule__XML2__Group_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__Group_0_1__0"


    // $ANTLR start "rule__XML2__Group_0_1__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:793:1: rule__XML2__Group_0_1__0__Impl : ( ( rule__XML2__PackAssignment_0_1_0 ) ) ;
    public final void rule__XML2__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:797:1: ( ( ( rule__XML2__PackAssignment_0_1_0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:798:1: ( ( rule__XML2__PackAssignment_0_1_0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:798:1: ( ( rule__XML2__PackAssignment_0_1_0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:799:1: ( rule__XML2__PackAssignment_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getPackAssignment_0_1_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:800:1: ( rule__XML2__PackAssignment_0_1_0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:800:2: rule__XML2__PackAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__XML2__PackAssignment_0_1_0_in_rule__XML2__Group_0_1__0__Impl1687);
            rule__XML2__PackAssignment_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXML2Access().getPackAssignment_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__Group_0_1__0__Impl"


    // $ANTLR start "rule__XML2__Group_0_1__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:810:1: rule__XML2__Group_0_1__1 : rule__XML2__Group_0_1__1__Impl ;
    public final void rule__XML2__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:814:1: ( rule__XML2__Group_0_1__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:815:2: rule__XML2__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__XML2__Group_0_1__1__Impl_in_rule__XML2__Group_0_1__11717);
            rule__XML2__Group_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__Group_0_1__1"


    // $ANTLR start "rule__XML2__Group_0_1__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:821:1: rule__XML2__Group_0_1__1__Impl : ( ( rule__XML2__InputAssignment_0_1_1 ) ) ;
    public final void rule__XML2__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:825:1: ( ( ( rule__XML2__InputAssignment_0_1_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:826:1: ( ( rule__XML2__InputAssignment_0_1_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:826:1: ( ( rule__XML2__InputAssignment_0_1_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:827:1: ( rule__XML2__InputAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getInputAssignment_0_1_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:828:1: ( rule__XML2__InputAssignment_0_1_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:828:2: rule__XML2__InputAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__XML2__InputAssignment_0_1_1_in_rule__XML2__Group_0_1__1__Impl1744);
            rule__XML2__InputAssignment_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXML2Access().getInputAssignment_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__Group_0_1__1__Impl"


    // $ANTLR start "rule__InputDef__Group__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:842:1: rule__InputDef__Group__0 : rule__InputDef__Group__0__Impl rule__InputDef__Group__1 ;
    public final void rule__InputDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:846:1: ( rule__InputDef__Group__0__Impl rule__InputDef__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:847:2: rule__InputDef__Group__0__Impl rule__InputDef__Group__1
            {
            pushFollow(FOLLOW_rule__InputDef__Group__0__Impl_in_rule__InputDef__Group__01778);
            rule__InputDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__InputDef__Group__1_in_rule__InputDef__Group__01781);
            rule__InputDef__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputDef__Group__0"


    // $ANTLR start "rule__InputDef__Group__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:854:1: rule__InputDef__Group__0__Impl : ( ( rule__InputDef__CommentAssignment_0 )* ) ;
    public final void rule__InputDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:858:1: ( ( ( rule__InputDef__CommentAssignment_0 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:859:1: ( ( rule__InputDef__CommentAssignment_0 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:859:1: ( ( rule__InputDef__CommentAssignment_0 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:860:1: ( rule__InputDef__CommentAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputDefAccess().getCommentAssignment_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:861:1: ( rule__InputDef__CommentAssignment_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_COMMENT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:861:2: rule__InputDef__CommentAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__InputDef__CommentAssignment_0_in_rule__InputDef__Group__0__Impl1808);
            	    rule__InputDef__CommentAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputDefAccess().getCommentAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputDef__Group__0__Impl"


    // $ANTLR start "rule__InputDef__Group__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:871:1: rule__InputDef__Group__1 : rule__InputDef__Group__1__Impl rule__InputDef__Group__2 ;
    public final void rule__InputDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:875:1: ( rule__InputDef__Group__1__Impl rule__InputDef__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:876:2: rule__InputDef__Group__1__Impl rule__InputDef__Group__2
            {
            pushFollow(FOLLOW_rule__InputDef__Group__1__Impl_in_rule__InputDef__Group__11839);
            rule__InputDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__InputDef__Group__2_in_rule__InputDef__Group__11842);
            rule__InputDef__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputDef__Group__1"


    // $ANTLR start "rule__InputDef__Group__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:883:1: rule__InputDef__Group__1__Impl : ( ( rule__InputDef__InputCHARAssignment_1 ) ) ;
    public final void rule__InputDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:887:1: ( ( ( rule__InputDef__InputCHARAssignment_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:888:1: ( ( rule__InputDef__InputCHARAssignment_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:888:1: ( ( rule__InputDef__InputCHARAssignment_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:889:1: ( rule__InputDef__InputCHARAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputDefAccess().getInputCHARAssignment_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:890:1: ( rule__InputDef__InputCHARAssignment_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:890:2: rule__InputDef__InputCHARAssignment_1
            {
            pushFollow(FOLLOW_rule__InputDef__InputCHARAssignment_1_in_rule__InputDef__Group__1__Impl1869);
            rule__InputDef__InputCHARAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputDefAccess().getInputCHARAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputDef__Group__1__Impl"


    // $ANTLR start "rule__InputDef__Group__2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:900:1: rule__InputDef__Group__2 : rule__InputDef__Group__2__Impl rule__InputDef__Group__3 ;
    public final void rule__InputDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:904:1: ( rule__InputDef__Group__2__Impl rule__InputDef__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:905:2: rule__InputDef__Group__2__Impl rule__InputDef__Group__3
            {
            pushFollow(FOLLOW_rule__InputDef__Group__2__Impl_in_rule__InputDef__Group__21899);
            rule__InputDef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__InputDef__Group__3_in_rule__InputDef__Group__21902);
            rule__InputDef__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputDef__Group__2"


    // $ANTLR start "rule__InputDef__Group__2__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:912:1: rule__InputDef__Group__2__Impl : ( ( rule__InputDef__UrlAssignment_2 ) ) ;
    public final void rule__InputDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:916:1: ( ( ( rule__InputDef__UrlAssignment_2 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:917:1: ( ( rule__InputDef__UrlAssignment_2 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:917:1: ( ( rule__InputDef__UrlAssignment_2 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:918:1: ( rule__InputDef__UrlAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputDefAccess().getUrlAssignment_2()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:919:1: ( rule__InputDef__UrlAssignment_2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:919:2: rule__InputDef__UrlAssignment_2
            {
            pushFollow(FOLLOW_rule__InputDef__UrlAssignment_2_in_rule__InputDef__Group__2__Impl1929);
            rule__InputDef__UrlAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputDefAccess().getUrlAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputDef__Group__2__Impl"


    // $ANTLR start "rule__InputDef__Group__3"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:929:1: rule__InputDef__Group__3 : rule__InputDef__Group__3__Impl ;
    public final void rule__InputDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:933:1: ( rule__InputDef__Group__3__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:934:2: rule__InputDef__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__InputDef__Group__3__Impl_in_rule__InputDef__Group__31959);
            rule__InputDef__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputDef__Group__3"


    // $ANTLR start "rule__InputDef__Group__3__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:940:1: rule__InputDef__Group__3__Impl : ( ( RULE_C_SEMICOLON )? ) ;
    public final void rule__InputDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:944:1: ( ( ( RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:945:1: ( ( RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:945:1: ( ( RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:946:1: ( RULE_C_SEMICOLON )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputDefAccess().getC_SEMICOLONTerminalRuleCall_3()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:947:1: ( RULE_C_SEMICOLON )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_C_SEMICOLON) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:947:3: RULE_C_SEMICOLON
                    {
                    match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_rule__InputDef__Group__3__Impl1987); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputDefAccess().getC_SEMICOLONTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputDef__Group__3__Impl"


    // $ANTLR start "rule__PackDef__Group__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:965:1: rule__PackDef__Group__0 : rule__PackDef__Group__0__Impl rule__PackDef__Group__1 ;
    public final void rule__PackDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:969:1: ( rule__PackDef__Group__0__Impl rule__PackDef__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:970:2: rule__PackDef__Group__0__Impl rule__PackDef__Group__1
            {
            pushFollow(FOLLOW_rule__PackDef__Group__0__Impl_in_rule__PackDef__Group__02026);
            rule__PackDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackDef__Group__1_in_rule__PackDef__Group__02029);
            rule__PackDef__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackDef__Group__0"


    // $ANTLR start "rule__PackDef__Group__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:977:1: rule__PackDef__Group__0__Impl : ( ( rule__PackDef__CommentAssignment_0 )* ) ;
    public final void rule__PackDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:981:1: ( ( ( rule__PackDef__CommentAssignment_0 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:982:1: ( ( rule__PackDef__CommentAssignment_0 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:982:1: ( ( rule__PackDef__CommentAssignment_0 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:983:1: ( rule__PackDef__CommentAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackDefAccess().getCommentAssignment_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:984:1: ( rule__PackDef__CommentAssignment_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_COMMENT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:984:2: rule__PackDef__CommentAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__PackDef__CommentAssignment_0_in_rule__PackDef__Group__0__Impl2056);
            	    rule__PackDef__CommentAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackDefAccess().getCommentAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackDef__Group__0__Impl"


    // $ANTLR start "rule__PackDef__Group__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:994:1: rule__PackDef__Group__1 : rule__PackDef__Group__1__Impl rule__PackDef__Group__2 ;
    public final void rule__PackDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:998:1: ( rule__PackDef__Group__1__Impl rule__PackDef__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:999:2: rule__PackDef__Group__1__Impl rule__PackDef__Group__2
            {
            pushFollow(FOLLOW_rule__PackDef__Group__1__Impl_in_rule__PackDef__Group__12087);
            rule__PackDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackDef__Group__2_in_rule__PackDef__Group__12090);
            rule__PackDef__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackDef__Group__1"


    // $ANTLR start "rule__PackDef__Group__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1006:1: rule__PackDef__Group__1__Impl : ( ( rule__PackDef__PackCHARAssignment_1 ) ) ;
    public final void rule__PackDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1010:1: ( ( ( rule__PackDef__PackCHARAssignment_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1011:1: ( ( rule__PackDef__PackCHARAssignment_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1011:1: ( ( rule__PackDef__PackCHARAssignment_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1012:1: ( rule__PackDef__PackCHARAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackDefAccess().getPackCHARAssignment_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1013:1: ( rule__PackDef__PackCHARAssignment_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1013:2: rule__PackDef__PackCHARAssignment_1
            {
            pushFollow(FOLLOW_rule__PackDef__PackCHARAssignment_1_in_rule__PackDef__Group__1__Impl2117);
            rule__PackDef__PackCHARAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackDefAccess().getPackCHARAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackDef__Group__1__Impl"


    // $ANTLR start "rule__PackDef__Group__2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1023:1: rule__PackDef__Group__2 : rule__PackDef__Group__2__Impl rule__PackDef__Group__3 ;
    public final void rule__PackDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1027:1: ( rule__PackDef__Group__2__Impl rule__PackDef__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1028:2: rule__PackDef__Group__2__Impl rule__PackDef__Group__3
            {
            pushFollow(FOLLOW_rule__PackDef__Group__2__Impl_in_rule__PackDef__Group__22147);
            rule__PackDef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackDef__Group__3_in_rule__PackDef__Group__22150);
            rule__PackDef__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackDef__Group__2"


    // $ANTLR start "rule__PackDef__Group__2__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1035:1: rule__PackDef__Group__2__Impl : ( ( rule__PackDef__PackAssignment_2 )? ) ;
    public final void rule__PackDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1039:1: ( ( ( rule__PackDef__PackAssignment_2 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1040:1: ( ( rule__PackDef__PackAssignment_2 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1040:1: ( ( rule__PackDef__PackAssignment_2 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1041:1: ( rule__PackDef__PackAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackDefAccess().getPackAssignment_2()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1042:1: ( rule__PackDef__PackAssignment_2 )?
            int alt10=2;
            switch ( input.LA(1) ) {
                case RULE_C_INPUT:
                    {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==EOF||(LA10_1>=RULE_COMMENT && LA10_1<=RULE_C_INPUT)||LA10_1==RULE_C_TYPE||LA10_1==RULE_C_SEMICOLON||LA10_1==RULE_C_BRACKET_L||LA10_1==31) ) {
                        alt10=1;
                    }
                    }
                    break;
                case RULE_C_MAIN:
                case RULE_C_INT:
                case RULE_C_UINT:
                case RULE_C_BOOL:
                case RULE_C_NUMBER:
                case RULE_C_STRING:
                case RULE_C_LIST:
                case RULE_C_SLICE:
                case RULE_NAME:
                    {
                    alt10=1;
                    }
                    break;
                case RULE_C_TYPE:
                    {
                    switch ( input.LA(2) ) {
                        case EOF:
                        case RULE_COMMENT:
                        case RULE_C_SEMICOLON:
                        case RULE_C_BRACKET_L:
                        case 31:
                            {
                            alt10=1;
                            }
                            break;
                        case RULE_C_TYPE:
                            {
                            int LA10_5 = input.LA(3);

                            if ( ((LA10_5>=RULE_C_INPUT && LA10_5<=RULE_NAME)) ) {
                                alt10=1;
                            }
                            }
                            break;
                        case RULE_C_INPUT:
                            {
                            int LA10_6 = input.LA(3);

                            if ( (LA10_6==RULE_STRING) ) {
                                alt10=1;
                            }
                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt10) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1042:2: rule__PackDef__PackAssignment_2
                    {
                    pushFollow(FOLLOW_rule__PackDef__PackAssignment_2_in_rule__PackDef__Group__2__Impl2177);
                    rule__PackDef__PackAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackDefAccess().getPackAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackDef__Group__2__Impl"


    // $ANTLR start "rule__PackDef__Group__3"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1052:1: rule__PackDef__Group__3 : rule__PackDef__Group__3__Impl ;
    public final void rule__PackDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1056:1: ( rule__PackDef__Group__3__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1057:2: rule__PackDef__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PackDef__Group__3__Impl_in_rule__PackDef__Group__32208);
            rule__PackDef__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackDef__Group__3"


    // $ANTLR start "rule__PackDef__Group__3__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1063:1: rule__PackDef__Group__3__Impl : ( ( RULE_C_SEMICOLON )? ) ;
    public final void rule__PackDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1067:1: ( ( ( RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1068:1: ( ( RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1068:1: ( ( RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1069:1: ( RULE_C_SEMICOLON )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackDefAccess().getC_SEMICOLONTerminalRuleCall_3()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1070:1: ( RULE_C_SEMICOLON )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_C_SEMICOLON) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1070:3: RULE_C_SEMICOLON
                    {
                    match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_rule__PackDef__Group__3__Impl2236); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackDefAccess().getC_SEMICOLONTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackDef__Group__3__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1088:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1092:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1093:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__02275);
            rule__Type__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__02278);
            rule__Type__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1100:1: rule__Type__Group__0__Impl : ( ( rule__Type__CommentAssignment_0 )? ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1104:1: ( ( ( rule__Type__CommentAssignment_0 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1105:1: ( ( rule__Type__CommentAssignment_0 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1105:1: ( ( rule__Type__CommentAssignment_0 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1106:1: ( rule__Type__CommentAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getCommentAssignment_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1107:1: ( rule__Type__CommentAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_COMMENT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1107:2: rule__Type__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type__CommentAssignment_0_in_rule__Type__Group__0__Impl2305);
                    rule__Type__CommentAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getCommentAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1117:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1121:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1122:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__12336);
            rule__Type__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__2_in_rule__Type__Group__12339);
            rule__Type__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1129:1: rule__Type__Group__1__Impl : ( ( rule__Type__EnterAssignment_1 )? ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1133:1: ( ( ( rule__Type__EnterAssignment_1 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1134:1: ( ( rule__Type__EnterAssignment_1 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1134:1: ( ( rule__Type__EnterAssignment_1 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1135:1: ( rule__Type__EnterAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getEnterAssignment_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1136:1: ( rule__Type__EnterAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_C_BRACKET_L) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1136:2: rule__Type__EnterAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Type__EnterAssignment_1_in_rule__Type__Group__1__Impl2366);
                    rule__Type__EnterAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getEnterAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1146:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1150:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1151:2: rule__Type__Group__2__Impl rule__Type__Group__3
            {
            pushFollow(FOLLOW_rule__Type__Group__2__Impl_in_rule__Type__Group__22397);
            rule__Type__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__3_in_rule__Type__Group__22400);
            rule__Type__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2"


    // $ANTLR start "rule__Type__Group__2__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1158:1: rule__Type__Group__2__Impl : ( ( rule__Type__PrefixAssignment_2 ) ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1162:1: ( ( ( rule__Type__PrefixAssignment_2 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1163:1: ( ( rule__Type__PrefixAssignment_2 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1163:1: ( ( rule__Type__PrefixAssignment_2 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1164:1: ( rule__Type__PrefixAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getPrefixAssignment_2()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1165:1: ( rule__Type__PrefixAssignment_2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1165:2: rule__Type__PrefixAssignment_2
            {
            pushFollow(FOLLOW_rule__Type__PrefixAssignment_2_in_rule__Type__Group__2__Impl2427);
            rule__Type__PrefixAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getPrefixAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2__Impl"


    // $ANTLR start "rule__Type__Group__3"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1175:1: rule__Type__Group__3 : rule__Type__Group__3__Impl rule__Type__Group__4 ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1179:1: ( rule__Type__Group__3__Impl rule__Type__Group__4 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1180:2: rule__Type__Group__3__Impl rule__Type__Group__4
            {
            pushFollow(FOLLOW_rule__Type__Group__3__Impl_in_rule__Type__Group__32457);
            rule__Type__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__4_in_rule__Type__Group__32460);
            rule__Type__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__3"


    // $ANTLR start "rule__Type__Group__3__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1187:1: rule__Type__Group__3__Impl : ( ( rule__Type__NameAssignment_3 ) ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1191:1: ( ( ( rule__Type__NameAssignment_3 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1192:1: ( ( rule__Type__NameAssignment_3 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1192:1: ( ( rule__Type__NameAssignment_3 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1193:1: ( rule__Type__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getNameAssignment_3()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1194:1: ( rule__Type__NameAssignment_3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1194:2: rule__Type__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Type__NameAssignment_3_in_rule__Type__Group__3__Impl2487);
            rule__Type__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__3__Impl"


    // $ANTLR start "rule__Type__Group__4"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1204:1: rule__Type__Group__4 : rule__Type__Group__4__Impl rule__Type__Group__5 ;
    public final void rule__Type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1208:1: ( rule__Type__Group__4__Impl rule__Type__Group__5 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1209:2: rule__Type__Group__4__Impl rule__Type__Group__5
            {
            pushFollow(FOLLOW_rule__Type__Group__4__Impl_in_rule__Type__Group__42517);
            rule__Type__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__5_in_rule__Type__Group__42520);
            rule__Type__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__4"


    // $ANTLR start "rule__Type__Group__4__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1216:1: rule__Type__Group__4__Impl : ( RULE_C_BRACE_L ) ;
    public final void rule__Type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1220:1: ( ( RULE_C_BRACE_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1221:1: ( RULE_C_BRACE_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1221:1: ( RULE_C_BRACE_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1222:1: RULE_C_BRACE_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getC_BRACE_LTerminalRuleCall_4()); 
            }
            match(input,RULE_C_BRACE_L,FOLLOW_RULE_C_BRACE_L_in_rule__Type__Group__4__Impl2547); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getC_BRACE_LTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__4__Impl"


    // $ANTLR start "rule__Type__Group__5"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1233:1: rule__Type__Group__5 : rule__Type__Group__5__Impl rule__Type__Group__6 ;
    public final void rule__Type__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1237:1: ( rule__Type__Group__5__Impl rule__Type__Group__6 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1238:2: rule__Type__Group__5__Impl rule__Type__Group__6
            {
            pushFollow(FOLLOW_rule__Type__Group__5__Impl_in_rule__Type__Group__52576);
            rule__Type__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__6_in_rule__Type__Group__52579);
            rule__Type__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__5"


    // $ANTLR start "rule__Type__Group__5__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1245:1: rule__Type__Group__5__Impl : ( ( rule__Type__Alternatives_5 )* ) ;
    public final void rule__Type__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1249:1: ( ( ( rule__Type__Alternatives_5 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1250:1: ( ( rule__Type__Alternatives_5 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1250:1: ( ( rule__Type__Alternatives_5 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1251:1: ( rule__Type__Alternatives_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives_5()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1252:1: ( rule__Type__Alternatives_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_COMMENT && LA14_0<=RULE_NAME)||LA14_0==RULE_C_BRACKET_L) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1252:2: rule__Type__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_rule__Type__Alternatives_5_in_rule__Type__Group__5__Impl2606);
            	    rule__Type__Alternatives_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getAlternatives_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__5__Impl"


    // $ANTLR start "rule__Type__Group__6"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1262:1: rule__Type__Group__6 : rule__Type__Group__6__Impl ;
    public final void rule__Type__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1266:1: ( rule__Type__Group__6__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1267:2: rule__Type__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__6__Impl_in_rule__Type__Group__62637);
            rule__Type__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__6"


    // $ANTLR start "rule__Type__Group__6__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1273:1: rule__Type__Group__6__Impl : ( RULE_C_BRACE_R ) ;
    public final void rule__Type__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1277:1: ( ( RULE_C_BRACE_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1278:1: ( RULE_C_BRACE_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1278:1: ( RULE_C_BRACE_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1279:1: RULE_C_BRACE_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getC_BRACE_RTerminalRuleCall_6()); 
            }
            match(input,RULE_C_BRACE_R,FOLLOW_RULE_C_BRACE_R_in_rule__Type__Group__6__Impl2664); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getC_BRACE_RTerminalRuleCall_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__6__Impl"


    // $ANTLR start "rule__Enter__Group__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1304:1: rule__Enter__Group__0 : rule__Enter__Group__0__Impl rule__Enter__Group__1 ;
    public final void rule__Enter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1308:1: ( rule__Enter__Group__0__Impl rule__Enter__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1309:2: rule__Enter__Group__0__Impl rule__Enter__Group__1
            {
            pushFollow(FOLLOW_rule__Enter__Group__0__Impl_in_rule__Enter__Group__02707);
            rule__Enter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enter__Group__1_in_rule__Enter__Group__02710);
            rule__Enter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enter__Group__0"


    // $ANTLR start "rule__Enter__Group__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1316:1: rule__Enter__Group__0__Impl : ( RULE_C_BRACKET_L ) ;
    public final void rule__Enter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1320:1: ( ( RULE_C_BRACKET_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1321:1: ( RULE_C_BRACKET_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1321:1: ( RULE_C_BRACKET_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1322:1: RULE_C_BRACKET_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getC_BRACKET_LTerminalRuleCall_0()); 
            }
            match(input,RULE_C_BRACKET_L,FOLLOW_RULE_C_BRACKET_L_in_rule__Enter__Group__0__Impl2737); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnterAccess().getC_BRACKET_LTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enter__Group__0__Impl"


    // $ANTLR start "rule__Enter__Group__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1333:1: rule__Enter__Group__1 : rule__Enter__Group__1__Impl rule__Enter__Group__2 ;
    public final void rule__Enter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1337:1: ( rule__Enter__Group__1__Impl rule__Enter__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1338:2: rule__Enter__Group__1__Impl rule__Enter__Group__2
            {
            pushFollow(FOLLOW_rule__Enter__Group__1__Impl_in_rule__Enter__Group__12766);
            rule__Enter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enter__Group__2_in_rule__Enter__Group__12769);
            rule__Enter__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enter__Group__1"


    // $ANTLR start "rule__Enter__Group__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1345:1: rule__Enter__Group__1__Impl : ( ( rule__Enter__PrefixAssignment_1 ) ) ;
    public final void rule__Enter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1349:1: ( ( ( rule__Enter__PrefixAssignment_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1350:1: ( ( rule__Enter__PrefixAssignment_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1350:1: ( ( rule__Enter__PrefixAssignment_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1351:1: ( rule__Enter__PrefixAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getPrefixAssignment_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1352:1: ( rule__Enter__PrefixAssignment_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1352:2: rule__Enter__PrefixAssignment_1
            {
            pushFollow(FOLLOW_rule__Enter__PrefixAssignment_1_in_rule__Enter__Group__1__Impl2796);
            rule__Enter__PrefixAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnterAccess().getPrefixAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enter__Group__1__Impl"


    // $ANTLR start "rule__Enter__Group__2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1362:1: rule__Enter__Group__2 : rule__Enter__Group__2__Impl rule__Enter__Group__3 ;
    public final void rule__Enter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1366:1: ( rule__Enter__Group__2__Impl rule__Enter__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1367:2: rule__Enter__Group__2__Impl rule__Enter__Group__3
            {
            pushFollow(FOLLOW_rule__Enter__Group__2__Impl_in_rule__Enter__Group__22826);
            rule__Enter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enter__Group__3_in_rule__Enter__Group__22829);
            rule__Enter__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enter__Group__2"


    // $ANTLR start "rule__Enter__Group__2__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1374:1: rule__Enter__Group__2__Impl : ( RULE_C_PAREN_L ) ;
    public final void rule__Enter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1378:1: ( ( RULE_C_PAREN_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1379:1: ( RULE_C_PAREN_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1379:1: ( RULE_C_PAREN_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1380:1: RULE_C_PAREN_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getC_PAREN_LTerminalRuleCall_2()); 
            }
            match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_rule__Enter__Group__2__Impl2856); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnterAccess().getC_PAREN_LTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enter__Group__2__Impl"


    // $ANTLR start "rule__Enter__Group__3"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1391:1: rule__Enter__Group__3 : rule__Enter__Group__3__Impl rule__Enter__Group__4 ;
    public final void rule__Enter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1395:1: ( rule__Enter__Group__3__Impl rule__Enter__Group__4 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1396:2: rule__Enter__Group__3__Impl rule__Enter__Group__4
            {
            pushFollow(FOLLOW_rule__Enter__Group__3__Impl_in_rule__Enter__Group__32885);
            rule__Enter__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enter__Group__4_in_rule__Enter__Group__32888);
            rule__Enter__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enter__Group__3"


    // $ANTLR start "rule__Enter__Group__3__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1403:1: rule__Enter__Group__3__Impl : ( ( rule__Enter__RootPathAssignment_3 ) ) ;
    public final void rule__Enter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1407:1: ( ( ( rule__Enter__RootPathAssignment_3 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1408:1: ( ( rule__Enter__RootPathAssignment_3 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1408:1: ( ( rule__Enter__RootPathAssignment_3 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1409:1: ( rule__Enter__RootPathAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getRootPathAssignment_3()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1410:1: ( rule__Enter__RootPathAssignment_3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1410:2: rule__Enter__RootPathAssignment_3
            {
            pushFollow(FOLLOW_rule__Enter__RootPathAssignment_3_in_rule__Enter__Group__3__Impl2915);
            rule__Enter__RootPathAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnterAccess().getRootPathAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enter__Group__3__Impl"


    // $ANTLR start "rule__Enter__Group__4"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1420:1: rule__Enter__Group__4 : rule__Enter__Group__4__Impl rule__Enter__Group__5 ;
    public final void rule__Enter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1424:1: ( rule__Enter__Group__4__Impl rule__Enter__Group__5 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1425:2: rule__Enter__Group__4__Impl rule__Enter__Group__5
            {
            pushFollow(FOLLOW_rule__Enter__Group__4__Impl_in_rule__Enter__Group__42945);
            rule__Enter__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enter__Group__5_in_rule__Enter__Group__42948);
            rule__Enter__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enter__Group__4"


    // $ANTLR start "rule__Enter__Group__4__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1432:1: rule__Enter__Group__4__Impl : ( RULE_C_PAREN_R ) ;
    public final void rule__Enter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1436:1: ( ( RULE_C_PAREN_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1437:1: ( RULE_C_PAREN_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1437:1: ( RULE_C_PAREN_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1438:1: RULE_C_PAREN_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getC_PAREN_RTerminalRuleCall_4()); 
            }
            match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_rule__Enter__Group__4__Impl2975); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnterAccess().getC_PAREN_RTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enter__Group__4__Impl"


    // $ANTLR start "rule__Enter__Group__5"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1449:1: rule__Enter__Group__5 : rule__Enter__Group__5__Impl ;
    public final void rule__Enter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1453:1: ( rule__Enter__Group__5__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1454:2: rule__Enter__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Enter__Group__5__Impl_in_rule__Enter__Group__53004);
            rule__Enter__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enter__Group__5"


    // $ANTLR start "rule__Enter__Group__5__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1460:1: rule__Enter__Group__5__Impl : ( RULE_C_BRACKET_R ) ;
    public final void rule__Enter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1464:1: ( ( RULE_C_BRACKET_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1465:1: ( RULE_C_BRACKET_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1465:1: ( RULE_C_BRACKET_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1466:1: RULE_C_BRACKET_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getC_BRACKET_RTerminalRuleCall_5()); 
            }
            match(input,RULE_C_BRACKET_R,FOLLOW_RULE_C_BRACKET_R_in_rule__Enter__Group__5__Impl3031); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnterAccess().getC_BRACKET_RTerminalRuleCall_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enter__Group__5__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1489:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1493:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1494:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__03072);
            rule__Field__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__03075);
            rule__Field__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1501:1: rule__Field__Group__0__Impl : ( ( rule__Field__CommentAssignment_0 )? ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1505:1: ( ( ( rule__Field__CommentAssignment_0 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1506:1: ( ( rule__Field__CommentAssignment_0 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1506:1: ( ( rule__Field__CommentAssignment_0 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1507:1: ( rule__Field__CommentAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getCommentAssignment_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1508:1: ( rule__Field__CommentAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_COMMENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1508:2: rule__Field__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Field__CommentAssignment_0_in_rule__Field__Group__0__Impl3102);
                    rule__Field__CommentAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getCommentAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1518:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1522:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1523:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__13133);
            rule__Field__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__13136);
            rule__Field__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1530:1: rule__Field__Group__1__Impl : ( ( rule__Field__Alternatives_1 )* ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1534:1: ( ( ( rule__Field__Alternatives_1 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1535:1: ( ( rule__Field__Alternatives_1 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1535:1: ( ( rule__Field__Alternatives_1 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1536:1: ( rule__Field__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getAlternatives_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1537:1: ( rule__Field__Alternatives_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_C_BRACKET_L) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1537:2: rule__Field__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Field__Alternatives_1_in_rule__Field__Group__1__Impl3163);
            	    rule__Field__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1547:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1551:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1552:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__23194);
            rule__Field__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__23197);
            rule__Field__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1559:1: rule__Field__Group__2__Impl : ( ( rule__Field__TypeAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1563:1: ( ( ( rule__Field__TypeAssignment_2 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1564:1: ( ( rule__Field__TypeAssignment_2 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1564:1: ( ( rule__Field__TypeAssignment_2 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1565:1: ( rule__Field__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeAssignment_2()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1566:1: ( rule__Field__TypeAssignment_2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1566:2: rule__Field__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Field__TypeAssignment_2_in_rule__Field__Group__2__Impl3224);
            rule__Field__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1576:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1580:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1581:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__33254);
            rule__Field__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__33257);
            rule__Field__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1588:1: rule__Field__Group__3__Impl : ( ( rule__Field__FieldNameAssignment_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1592:1: ( ( ( rule__Field__FieldNameAssignment_3 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1593:1: ( ( rule__Field__FieldNameAssignment_3 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1593:1: ( ( rule__Field__FieldNameAssignment_3 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1594:1: ( rule__Field__FieldNameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getFieldNameAssignment_3()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1595:1: ( rule__Field__FieldNameAssignment_3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1595:2: rule__Field__FieldNameAssignment_3
            {
            pushFollow(FOLLOW_rule__Field__FieldNameAssignment_3_in_rule__Field__Group__3__Impl3284);
            rule__Field__FieldNameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getFieldNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__4"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1605:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1609:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1610:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__43314);
            rule__Field__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__5_in_rule__Field__Group__43317);
            rule__Field__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4"


    // $ANTLR start "rule__Field__Group__4__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1617:1: rule__Field__Group__4__Impl : ( RULE_C_EQUALS ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1621:1: ( ( RULE_C_EQUALS ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1622:1: ( RULE_C_EQUALS )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1622:1: ( RULE_C_EQUALS )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1623:1: RULE_C_EQUALS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getC_EQUALSTerminalRuleCall_4()); 
            }
            match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_rule__Field__Group__4__Impl3344); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getC_EQUALSTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__4__Impl"


    // $ANTLR start "rule__Field__Group__5"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1634:1: rule__Field__Group__5 : rule__Field__Group__5__Impl rule__Field__Group__6 ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1638:1: ( rule__Field__Group__5__Impl rule__Field__Group__6 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1639:2: rule__Field__Group__5__Impl rule__Field__Group__6
            {
            pushFollow(FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__53373);
            rule__Field__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__6_in_rule__Field__Group__53376);
            rule__Field__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__5"


    // $ANTLR start "rule__Field__Group__5__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1646:1: rule__Field__Group__5__Impl : ( ( rule__Field__NodePathAssignment_5 ) ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1650:1: ( ( ( rule__Field__NodePathAssignment_5 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1651:1: ( ( rule__Field__NodePathAssignment_5 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1651:1: ( ( rule__Field__NodePathAssignment_5 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1652:1: ( rule__Field__NodePathAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNodePathAssignment_5()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1653:1: ( rule__Field__NodePathAssignment_5 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1653:2: rule__Field__NodePathAssignment_5
            {
            pushFollow(FOLLOW_rule__Field__NodePathAssignment_5_in_rule__Field__Group__5__Impl3403);
            rule__Field__NodePathAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNodePathAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__5__Impl"


    // $ANTLR start "rule__Field__Group__6"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1663:1: rule__Field__Group__6 : rule__Field__Group__6__Impl ;
    public final void rule__Field__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1667:1: ( rule__Field__Group__6__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1668:2: rule__Field__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__63433);
            rule__Field__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__6"


    // $ANTLR start "rule__Field__Group__6__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1674:1: rule__Field__Group__6__Impl : ( ( RULE_C_SEMICOLON )? ) ;
    public final void rule__Field__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1678:1: ( ( ( RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1679:1: ( ( RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1679:1: ( ( RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1680:1: ( RULE_C_SEMICOLON )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getC_SEMICOLONTerminalRuleCall_6()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1681:1: ( RULE_C_SEMICOLON )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_C_SEMICOLON) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1681:3: RULE_C_SEMICOLON
                    {
                    match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_rule__Field__Group__6__Impl3461); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getC_SEMICOLONTerminalRuleCall_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__6__Impl"


    // $ANTLR start "rule__ListMeta__Group__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1705:1: rule__ListMeta__Group__0 : rule__ListMeta__Group__0__Impl rule__ListMeta__Group__1 ;
    public final void rule__ListMeta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1709:1: ( rule__ListMeta__Group__0__Impl rule__ListMeta__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1710:2: rule__ListMeta__Group__0__Impl rule__ListMeta__Group__1
            {
            pushFollow(FOLLOW_rule__ListMeta__Group__0__Impl_in_rule__ListMeta__Group__03506);
            rule__ListMeta__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListMeta__Group__1_in_rule__ListMeta__Group__03509);
            rule__ListMeta__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__Group__0"


    // $ANTLR start "rule__ListMeta__Group__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1717:1: rule__ListMeta__Group__0__Impl : ( RULE_C_BRACKET_L ) ;
    public final void rule__ListMeta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1721:1: ( ( RULE_C_BRACKET_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1722:1: ( RULE_C_BRACKET_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1722:1: ( RULE_C_BRACKET_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1723:1: RULE_C_BRACKET_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getC_BRACKET_LTerminalRuleCall_0()); 
            }
            match(input,RULE_C_BRACKET_L,FOLLOW_RULE_C_BRACKET_L_in_rule__ListMeta__Group__0__Impl3536); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListMetaAccess().getC_BRACKET_LTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__Group__0__Impl"


    // $ANTLR start "rule__ListMeta__Group__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1734:1: rule__ListMeta__Group__1 : rule__ListMeta__Group__1__Impl rule__ListMeta__Group__2 ;
    public final void rule__ListMeta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1738:1: ( rule__ListMeta__Group__1__Impl rule__ListMeta__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1739:2: rule__ListMeta__Group__1__Impl rule__ListMeta__Group__2
            {
            pushFollow(FOLLOW_rule__ListMeta__Group__1__Impl_in_rule__ListMeta__Group__13565);
            rule__ListMeta__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListMeta__Group__2_in_rule__ListMeta__Group__13568);
            rule__ListMeta__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__Group__1"


    // $ANTLR start "rule__ListMeta__Group__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1746:1: rule__ListMeta__Group__1__Impl : ( ( rule__ListMeta__PrefixAssignment_1 ) ) ;
    public final void rule__ListMeta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1750:1: ( ( ( rule__ListMeta__PrefixAssignment_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1751:1: ( ( rule__ListMeta__PrefixAssignment_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1751:1: ( ( rule__ListMeta__PrefixAssignment_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1752:1: ( rule__ListMeta__PrefixAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getPrefixAssignment_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1753:1: ( rule__ListMeta__PrefixAssignment_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1753:2: rule__ListMeta__PrefixAssignment_1
            {
            pushFollow(FOLLOW_rule__ListMeta__PrefixAssignment_1_in_rule__ListMeta__Group__1__Impl3595);
            rule__ListMeta__PrefixAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListMetaAccess().getPrefixAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__Group__1__Impl"


    // $ANTLR start "rule__ListMeta__Group__2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1763:1: rule__ListMeta__Group__2 : rule__ListMeta__Group__2__Impl rule__ListMeta__Group__3 ;
    public final void rule__ListMeta__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1767:1: ( rule__ListMeta__Group__2__Impl rule__ListMeta__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1768:2: rule__ListMeta__Group__2__Impl rule__ListMeta__Group__3
            {
            pushFollow(FOLLOW_rule__ListMeta__Group__2__Impl_in_rule__ListMeta__Group__23625);
            rule__ListMeta__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListMeta__Group__3_in_rule__ListMeta__Group__23628);
            rule__ListMeta__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__Group__2"


    // $ANTLR start "rule__ListMeta__Group__2__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1775:1: rule__ListMeta__Group__2__Impl : ( ( rule__ListMeta__Group_2__0 )? ) ;
    public final void rule__ListMeta__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1779:1: ( ( ( rule__ListMeta__Group_2__0 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1780:1: ( ( rule__ListMeta__Group_2__0 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1780:1: ( ( rule__ListMeta__Group_2__0 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1781:1: ( rule__ListMeta__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getGroup_2()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1782:1: ( rule__ListMeta__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_C_PAREN_L) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1782:2: rule__ListMeta__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ListMeta__Group_2__0_in_rule__ListMeta__Group__2__Impl3655);
                    rule__ListMeta__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListMetaAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__Group__2__Impl"


    // $ANTLR start "rule__ListMeta__Group__3"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1792:1: rule__ListMeta__Group__3 : rule__ListMeta__Group__3__Impl ;
    public final void rule__ListMeta__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1796:1: ( rule__ListMeta__Group__3__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1797:2: rule__ListMeta__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ListMeta__Group__3__Impl_in_rule__ListMeta__Group__33686);
            rule__ListMeta__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__Group__3"


    // $ANTLR start "rule__ListMeta__Group__3__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1803:1: rule__ListMeta__Group__3__Impl : ( RULE_C_BRACKET_R ) ;
    public final void rule__ListMeta__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1807:1: ( ( RULE_C_BRACKET_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1808:1: ( RULE_C_BRACKET_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1808:1: ( RULE_C_BRACKET_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1809:1: RULE_C_BRACKET_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getC_BRACKET_RTerminalRuleCall_3()); 
            }
            match(input,RULE_C_BRACKET_R,FOLLOW_RULE_C_BRACKET_R_in_rule__ListMeta__Group__3__Impl3713); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListMetaAccess().getC_BRACKET_RTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__Group__3__Impl"


    // $ANTLR start "rule__ListMeta__Group_2__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1828:1: rule__ListMeta__Group_2__0 : rule__ListMeta__Group_2__0__Impl rule__ListMeta__Group_2__1 ;
    public final void rule__ListMeta__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1832:1: ( rule__ListMeta__Group_2__0__Impl rule__ListMeta__Group_2__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1833:2: rule__ListMeta__Group_2__0__Impl rule__ListMeta__Group_2__1
            {
            pushFollow(FOLLOW_rule__ListMeta__Group_2__0__Impl_in_rule__ListMeta__Group_2__03750);
            rule__ListMeta__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListMeta__Group_2__1_in_rule__ListMeta__Group_2__03753);
            rule__ListMeta__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__Group_2__0"


    // $ANTLR start "rule__ListMeta__Group_2__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1840:1: rule__ListMeta__Group_2__0__Impl : ( RULE_C_PAREN_L ) ;
    public final void rule__ListMeta__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1844:1: ( ( RULE_C_PAREN_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1845:1: ( RULE_C_PAREN_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1845:1: ( RULE_C_PAREN_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1846:1: RULE_C_PAREN_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getC_PAREN_LTerminalRuleCall_2_0()); 
            }
            match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_rule__ListMeta__Group_2__0__Impl3780); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListMetaAccess().getC_PAREN_LTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__Group_2__0__Impl"


    // $ANTLR start "rule__ListMeta__Group_2__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1857:1: rule__ListMeta__Group_2__1 : rule__ListMeta__Group_2__1__Impl rule__ListMeta__Group_2__2 ;
    public final void rule__ListMeta__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1861:1: ( rule__ListMeta__Group_2__1__Impl rule__ListMeta__Group_2__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1862:2: rule__ListMeta__Group_2__1__Impl rule__ListMeta__Group_2__2
            {
            pushFollow(FOLLOW_rule__ListMeta__Group_2__1__Impl_in_rule__ListMeta__Group_2__13809);
            rule__ListMeta__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListMeta__Group_2__2_in_rule__ListMeta__Group_2__13812);
            rule__ListMeta__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__Group_2__1"


    // $ANTLR start "rule__ListMeta__Group_2__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1869:1: rule__ListMeta__Group_2__1__Impl : ( ( rule__ListMeta__Group_2_1__0 )? ) ;
    public final void rule__ListMeta__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1873:1: ( ( ( rule__ListMeta__Group_2_1__0 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1874:1: ( ( rule__ListMeta__Group_2_1__0 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1874:1: ( ( rule__ListMeta__Group_2_1__0 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1875:1: ( rule__ListMeta__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getGroup_2_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1876:1: ( rule__ListMeta__Group_2_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_C_INPUT && LA19_0<=RULE_NAME)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1876:2: rule__ListMeta__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ListMeta__Group_2_1__0_in_rule__ListMeta__Group_2__1__Impl3839);
                    rule__ListMeta__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListMetaAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__Group_2__1__Impl"


    // $ANTLR start "rule__ListMeta__Group_2__2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1886:1: rule__ListMeta__Group_2__2 : rule__ListMeta__Group_2__2__Impl ;
    public final void rule__ListMeta__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1890:1: ( rule__ListMeta__Group_2__2__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1891:2: rule__ListMeta__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ListMeta__Group_2__2__Impl_in_rule__ListMeta__Group_2__23870);
            rule__ListMeta__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__Group_2__2"


    // $ANTLR start "rule__ListMeta__Group_2__2__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1897:1: rule__ListMeta__Group_2__2__Impl : ( RULE_C_PAREN_R ) ;
    public final void rule__ListMeta__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1901:1: ( ( RULE_C_PAREN_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1902:1: ( RULE_C_PAREN_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1902:1: ( RULE_C_PAREN_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1903:1: RULE_C_PAREN_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getC_PAREN_RTerminalRuleCall_2_2()); 
            }
            match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_rule__ListMeta__Group_2__2__Impl3897); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListMetaAccess().getC_PAREN_RTerminalRuleCall_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__Group_2__2__Impl"


    // $ANTLR start "rule__ListMeta__Group_2_1__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1920:1: rule__ListMeta__Group_2_1__0 : rule__ListMeta__Group_2_1__0__Impl rule__ListMeta__Group_2_1__1 ;
    public final void rule__ListMeta__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1924:1: ( rule__ListMeta__Group_2_1__0__Impl rule__ListMeta__Group_2_1__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1925:2: rule__ListMeta__Group_2_1__0__Impl rule__ListMeta__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ListMeta__Group_2_1__0__Impl_in_rule__ListMeta__Group_2_1__03932);
            rule__ListMeta__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListMeta__Group_2_1__1_in_rule__ListMeta__Group_2_1__03935);
            rule__ListMeta__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__Group_2_1__0"


    // $ANTLR start "rule__ListMeta__Group_2_1__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1932:1: rule__ListMeta__Group_2_1__0__Impl : ( ( rule__ListMeta__ParamsAssignment_2_1_0 ) ) ;
    public final void rule__ListMeta__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1936:1: ( ( ( rule__ListMeta__ParamsAssignment_2_1_0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1937:1: ( ( rule__ListMeta__ParamsAssignment_2_1_0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1937:1: ( ( rule__ListMeta__ParamsAssignment_2_1_0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1938:1: ( rule__ListMeta__ParamsAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getParamsAssignment_2_1_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1939:1: ( rule__ListMeta__ParamsAssignment_2_1_0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1939:2: rule__ListMeta__ParamsAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__ListMeta__ParamsAssignment_2_1_0_in_rule__ListMeta__Group_2_1__0__Impl3962);
            rule__ListMeta__ParamsAssignment_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListMetaAccess().getParamsAssignment_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__Group_2_1__0__Impl"


    // $ANTLR start "rule__ListMeta__Group_2_1__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1949:1: rule__ListMeta__Group_2_1__1 : rule__ListMeta__Group_2_1__1__Impl ;
    public final void rule__ListMeta__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1953:1: ( rule__ListMeta__Group_2_1__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1954:2: rule__ListMeta__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListMeta__Group_2_1__1__Impl_in_rule__ListMeta__Group_2_1__13992);
            rule__ListMeta__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__Group_2_1__1"


    // $ANTLR start "rule__ListMeta__Group_2_1__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1960:1: rule__ListMeta__Group_2_1__1__Impl : ( ( rule__ListMeta__Group_2_1_1__0 )* ) ;
    public final void rule__ListMeta__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1964:1: ( ( ( rule__ListMeta__Group_2_1_1__0 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1965:1: ( ( rule__ListMeta__Group_2_1_1__0 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1965:1: ( ( rule__ListMeta__Group_2_1_1__0 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1966:1: ( rule__ListMeta__Group_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getGroup_2_1_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1967:1: ( rule__ListMeta__Group_2_1_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_C_COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1967:2: rule__ListMeta__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ListMeta__Group_2_1_1__0_in_rule__ListMeta__Group_2_1__1__Impl4019);
            	    rule__ListMeta__Group_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListMetaAccess().getGroup_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__Group_2_1__1__Impl"


    // $ANTLR start "rule__ListMeta__Group_2_1_1__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1981:1: rule__ListMeta__Group_2_1_1__0 : rule__ListMeta__Group_2_1_1__0__Impl rule__ListMeta__Group_2_1_1__1 ;
    public final void rule__ListMeta__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1985:1: ( rule__ListMeta__Group_2_1_1__0__Impl rule__ListMeta__Group_2_1_1__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1986:2: rule__ListMeta__Group_2_1_1__0__Impl rule__ListMeta__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__ListMeta__Group_2_1_1__0__Impl_in_rule__ListMeta__Group_2_1_1__04054);
            rule__ListMeta__Group_2_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListMeta__Group_2_1_1__1_in_rule__ListMeta__Group_2_1_1__04057);
            rule__ListMeta__Group_2_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__Group_2_1_1__0"


    // $ANTLR start "rule__ListMeta__Group_2_1_1__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1993:1: rule__ListMeta__Group_2_1_1__0__Impl : ( RULE_C_COMMA ) ;
    public final void rule__ListMeta__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1997:1: ( ( RULE_C_COMMA ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1998:1: ( RULE_C_COMMA )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1998:1: ( RULE_C_COMMA )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1999:1: RULE_C_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getC_COMMATerminalRuleCall_2_1_1_0()); 
            }
            match(input,RULE_C_COMMA,FOLLOW_RULE_C_COMMA_in_rule__ListMeta__Group_2_1_1__0__Impl4084); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListMetaAccess().getC_COMMATerminalRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__ListMeta__Group_2_1_1__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2010:1: rule__ListMeta__Group_2_1_1__1 : rule__ListMeta__Group_2_1_1__1__Impl ;
    public final void rule__ListMeta__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2014:1: ( rule__ListMeta__Group_2_1_1__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2015:2: rule__ListMeta__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListMeta__Group_2_1_1__1__Impl_in_rule__ListMeta__Group_2_1_1__14113);
            rule__ListMeta__Group_2_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__Group_2_1_1__1"


    // $ANTLR start "rule__ListMeta__Group_2_1_1__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2021:1: rule__ListMeta__Group_2_1_1__1__Impl : ( ( rule__ListMeta__ParamsAssignment_2_1_1_1 ) ) ;
    public final void rule__ListMeta__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2025:1: ( ( ( rule__ListMeta__ParamsAssignment_2_1_1_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2026:1: ( ( rule__ListMeta__ParamsAssignment_2_1_1_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2026:1: ( ( rule__ListMeta__ParamsAssignment_2_1_1_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2027:1: ( rule__ListMeta__ParamsAssignment_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getParamsAssignment_2_1_1_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2028:1: ( rule__ListMeta__ParamsAssignment_2_1_1_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2028:2: rule__ListMeta__ParamsAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__ListMeta__ParamsAssignment_2_1_1_1_in_rule__ListMeta__Group_2_1_1__1__Impl4140);
            rule__ListMeta__ParamsAssignment_2_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListMetaAccess().getParamsAssignment_2_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__SliceMeta__Group__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2042:1: rule__SliceMeta__Group__0 : rule__SliceMeta__Group__0__Impl rule__SliceMeta__Group__1 ;
    public final void rule__SliceMeta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2046:1: ( rule__SliceMeta__Group__0__Impl rule__SliceMeta__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2047:2: rule__SliceMeta__Group__0__Impl rule__SliceMeta__Group__1
            {
            pushFollow(FOLLOW_rule__SliceMeta__Group__0__Impl_in_rule__SliceMeta__Group__04174);
            rule__SliceMeta__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SliceMeta__Group__1_in_rule__SliceMeta__Group__04177);
            rule__SliceMeta__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SliceMeta__Group__0"


    // $ANTLR start "rule__SliceMeta__Group__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2054:1: rule__SliceMeta__Group__0__Impl : ( RULE_C_BRACKET_L ) ;
    public final void rule__SliceMeta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2058:1: ( ( RULE_C_BRACKET_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2059:1: ( RULE_C_BRACKET_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2059:1: ( RULE_C_BRACKET_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2060:1: RULE_C_BRACKET_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSliceMetaAccess().getC_BRACKET_LTerminalRuleCall_0()); 
            }
            match(input,RULE_C_BRACKET_L,FOLLOW_RULE_C_BRACKET_L_in_rule__SliceMeta__Group__0__Impl4204); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSliceMetaAccess().getC_BRACKET_LTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SliceMeta__Group__0__Impl"


    // $ANTLR start "rule__SliceMeta__Group__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2071:1: rule__SliceMeta__Group__1 : rule__SliceMeta__Group__1__Impl rule__SliceMeta__Group__2 ;
    public final void rule__SliceMeta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2075:1: ( rule__SliceMeta__Group__1__Impl rule__SliceMeta__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2076:2: rule__SliceMeta__Group__1__Impl rule__SliceMeta__Group__2
            {
            pushFollow(FOLLOW_rule__SliceMeta__Group__1__Impl_in_rule__SliceMeta__Group__14233);
            rule__SliceMeta__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SliceMeta__Group__2_in_rule__SliceMeta__Group__14236);
            rule__SliceMeta__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SliceMeta__Group__1"


    // $ANTLR start "rule__SliceMeta__Group__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2083:1: rule__SliceMeta__Group__1__Impl : ( ( rule__SliceMeta__PrefixAssignment_1 ) ) ;
    public final void rule__SliceMeta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2087:1: ( ( ( rule__SliceMeta__PrefixAssignment_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2088:1: ( ( rule__SliceMeta__PrefixAssignment_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2088:1: ( ( rule__SliceMeta__PrefixAssignment_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2089:1: ( rule__SliceMeta__PrefixAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSliceMetaAccess().getPrefixAssignment_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2090:1: ( rule__SliceMeta__PrefixAssignment_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2090:2: rule__SliceMeta__PrefixAssignment_1
            {
            pushFollow(FOLLOW_rule__SliceMeta__PrefixAssignment_1_in_rule__SliceMeta__Group__1__Impl4263);
            rule__SliceMeta__PrefixAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSliceMetaAccess().getPrefixAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SliceMeta__Group__1__Impl"


    // $ANTLR start "rule__SliceMeta__Group__2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2100:1: rule__SliceMeta__Group__2 : rule__SliceMeta__Group__2__Impl rule__SliceMeta__Group__3 ;
    public final void rule__SliceMeta__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2104:1: ( rule__SliceMeta__Group__2__Impl rule__SliceMeta__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2105:2: rule__SliceMeta__Group__2__Impl rule__SliceMeta__Group__3
            {
            pushFollow(FOLLOW_rule__SliceMeta__Group__2__Impl_in_rule__SliceMeta__Group__24293);
            rule__SliceMeta__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SliceMeta__Group__3_in_rule__SliceMeta__Group__24296);
            rule__SliceMeta__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SliceMeta__Group__2"


    // $ANTLR start "rule__SliceMeta__Group__2__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2112:1: rule__SliceMeta__Group__2__Impl : ( RULE_C_PAREN_L ) ;
    public final void rule__SliceMeta__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2116:1: ( ( RULE_C_PAREN_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2117:1: ( RULE_C_PAREN_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2117:1: ( RULE_C_PAREN_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2118:1: RULE_C_PAREN_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSliceMetaAccess().getC_PAREN_LTerminalRuleCall_2()); 
            }
            match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_rule__SliceMeta__Group__2__Impl4323); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSliceMetaAccess().getC_PAREN_LTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SliceMeta__Group__2__Impl"


    // $ANTLR start "rule__SliceMeta__Group__3"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2129:1: rule__SliceMeta__Group__3 : rule__SliceMeta__Group__3__Impl rule__SliceMeta__Group__4 ;
    public final void rule__SliceMeta__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2133:1: ( rule__SliceMeta__Group__3__Impl rule__SliceMeta__Group__4 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2134:2: rule__SliceMeta__Group__3__Impl rule__SliceMeta__Group__4
            {
            pushFollow(FOLLOW_rule__SliceMeta__Group__3__Impl_in_rule__SliceMeta__Group__34352);
            rule__SliceMeta__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SliceMeta__Group__4_in_rule__SliceMeta__Group__34355);
            rule__SliceMeta__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SliceMeta__Group__3"


    // $ANTLR start "rule__SliceMeta__Group__3__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2141:1: rule__SliceMeta__Group__3__Impl : ( ( rule__SliceMeta__SliceCharAssignment_3 ) ) ;
    public final void rule__SliceMeta__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2145:1: ( ( ( rule__SliceMeta__SliceCharAssignment_3 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2146:1: ( ( rule__SliceMeta__SliceCharAssignment_3 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2146:1: ( ( rule__SliceMeta__SliceCharAssignment_3 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2147:1: ( rule__SliceMeta__SliceCharAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSliceMetaAccess().getSliceCharAssignment_3()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2148:1: ( rule__SliceMeta__SliceCharAssignment_3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2148:2: rule__SliceMeta__SliceCharAssignment_3
            {
            pushFollow(FOLLOW_rule__SliceMeta__SliceCharAssignment_3_in_rule__SliceMeta__Group__3__Impl4382);
            rule__SliceMeta__SliceCharAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSliceMetaAccess().getSliceCharAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SliceMeta__Group__3__Impl"


    // $ANTLR start "rule__SliceMeta__Group__4"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2158:1: rule__SliceMeta__Group__4 : rule__SliceMeta__Group__4__Impl rule__SliceMeta__Group__5 ;
    public final void rule__SliceMeta__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2162:1: ( rule__SliceMeta__Group__4__Impl rule__SliceMeta__Group__5 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2163:2: rule__SliceMeta__Group__4__Impl rule__SliceMeta__Group__5
            {
            pushFollow(FOLLOW_rule__SliceMeta__Group__4__Impl_in_rule__SliceMeta__Group__44412);
            rule__SliceMeta__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SliceMeta__Group__5_in_rule__SliceMeta__Group__44415);
            rule__SliceMeta__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SliceMeta__Group__4"


    // $ANTLR start "rule__SliceMeta__Group__4__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2170:1: rule__SliceMeta__Group__4__Impl : ( RULE_C_PAREN_R ) ;
    public final void rule__SliceMeta__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2174:1: ( ( RULE_C_PAREN_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2175:1: ( RULE_C_PAREN_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2175:1: ( RULE_C_PAREN_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2176:1: RULE_C_PAREN_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSliceMetaAccess().getC_PAREN_RTerminalRuleCall_4()); 
            }
            match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_rule__SliceMeta__Group__4__Impl4442); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSliceMetaAccess().getC_PAREN_RTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SliceMeta__Group__4__Impl"


    // $ANTLR start "rule__SliceMeta__Group__5"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2187:1: rule__SliceMeta__Group__5 : rule__SliceMeta__Group__5__Impl ;
    public final void rule__SliceMeta__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2191:1: ( rule__SliceMeta__Group__5__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2192:2: rule__SliceMeta__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SliceMeta__Group__5__Impl_in_rule__SliceMeta__Group__54471);
            rule__SliceMeta__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SliceMeta__Group__5"


    // $ANTLR start "rule__SliceMeta__Group__5__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2198:1: rule__SliceMeta__Group__5__Impl : ( RULE_C_BRACKET_R ) ;
    public final void rule__SliceMeta__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2202:1: ( ( RULE_C_BRACKET_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2203:1: ( RULE_C_BRACKET_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2203:1: ( RULE_C_BRACKET_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2204:1: RULE_C_BRACKET_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSliceMetaAccess().getC_BRACKET_RTerminalRuleCall_5()); 
            }
            match(input,RULE_C_BRACKET_R,FOLLOW_RULE_C_BRACKET_R_in_rule__SliceMeta__Group__5__Impl4498); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSliceMetaAccess().getC_BRACKET_RTerminalRuleCall_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SliceMeta__Group__5__Impl"


    // $ANTLR start "rule__PackName__Group__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2227:1: rule__PackName__Group__0 : rule__PackName__Group__0__Impl rule__PackName__Group__1 ;
    public final void rule__PackName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2231:1: ( rule__PackName__Group__0__Impl rule__PackName__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2232:2: rule__PackName__Group__0__Impl rule__PackName__Group__1
            {
            pushFollow(FOLLOW_rule__PackName__Group__0__Impl_in_rule__PackName__Group__04539);
            rule__PackName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackName__Group__1_in_rule__PackName__Group__04542);
            rule__PackName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackName__Group__0"


    // $ANTLR start "rule__PackName__Group__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2239:1: rule__PackName__Group__0__Impl : ( ruleTypeName ) ;
    public final void rule__PackName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2243:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2244:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2244:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2245:1: ruleTypeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackNameAccess().getTypeNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_rule__PackName__Group__0__Impl4569);
            ruleTypeName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackNameAccess().getTypeNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackName__Group__0__Impl"


    // $ANTLR start "rule__PackName__Group__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2256:1: rule__PackName__Group__1 : rule__PackName__Group__1__Impl ;
    public final void rule__PackName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2260:1: ( rule__PackName__Group__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2261:2: rule__PackName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PackName__Group__1__Impl_in_rule__PackName__Group__14598);
            rule__PackName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackName__Group__1"


    // $ANTLR start "rule__PackName__Group__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2267:1: rule__PackName__Group__1__Impl : ( ( rule__PackName__Group_1__0 )* ) ;
    public final void rule__PackName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2271:1: ( ( ( rule__PackName__Group_1__0 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2272:1: ( ( rule__PackName__Group_1__0 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2272:1: ( ( rule__PackName__Group_1__0 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2273:1: ( rule__PackName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackNameAccess().getGroup_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2274:1: ( rule__PackName__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2274:2: rule__PackName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PackName__Group_1__0_in_rule__PackName__Group__1__Impl4625);
            	    rule__PackName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackName__Group__1__Impl"


    // $ANTLR start "rule__PackName__Group_1__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2288:1: rule__PackName__Group_1__0 : rule__PackName__Group_1__0__Impl rule__PackName__Group_1__1 ;
    public final void rule__PackName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2292:1: ( rule__PackName__Group_1__0__Impl rule__PackName__Group_1__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2293:2: rule__PackName__Group_1__0__Impl rule__PackName__Group_1__1
            {
            pushFollow(FOLLOW_rule__PackName__Group_1__0__Impl_in_rule__PackName__Group_1__04660);
            rule__PackName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackName__Group_1__1_in_rule__PackName__Group_1__04663);
            rule__PackName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackName__Group_1__0"


    // $ANTLR start "rule__PackName__Group_1__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2300:1: rule__PackName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__PackName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2304:1: ( ( '.' ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2305:1: ( '.' )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2305:1: ( '.' )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2306:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__PackName__Group_1__0__Impl4691); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackName__Group_1__0__Impl"


    // $ANTLR start "rule__PackName__Group_1__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2319:1: rule__PackName__Group_1__1 : rule__PackName__Group_1__1__Impl ;
    public final void rule__PackName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2323:1: ( rule__PackName__Group_1__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2324:2: rule__PackName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PackName__Group_1__1__Impl_in_rule__PackName__Group_1__14722);
            rule__PackName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackName__Group_1__1"


    // $ANTLR start "rule__PackName__Group_1__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2330:1: rule__PackName__Group_1__1__Impl : ( ruleTypeName ) ;
    public final void rule__PackName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2334:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2335:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2335:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2336:1: ruleTypeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackNameAccess().getTypeNameParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_rule__PackName__Group_1__1__Impl4749);
            ruleTypeName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackNameAccess().getTypeNameParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackName__Group_1__1__Impl"


    // $ANTLR start "rule__XML2__InputAssignment_0_0_0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2352:1: rule__XML2__InputAssignment_0_0_0 : ( ruleInputDef ) ;
    public final void rule__XML2__InputAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2356:1: ( ( ruleInputDef ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2357:1: ( ruleInputDef )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2357:1: ( ruleInputDef )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2358:1: ruleInputDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getInputInputDefParserRuleCall_0_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleInputDef_in_rule__XML2__InputAssignment_0_0_04787);
            ruleInputDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXML2Access().getInputInputDefParserRuleCall_0_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__InputAssignment_0_0_0"


    // $ANTLR start "rule__XML2__PackAssignment_0_0_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2367:1: rule__XML2__PackAssignment_0_0_1 : ( rulePackDef ) ;
    public final void rule__XML2__PackAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2371:1: ( ( rulePackDef ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2372:1: ( rulePackDef )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2372:1: ( rulePackDef )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2373:1: rulePackDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getPackPackDefParserRuleCall_0_0_1_0()); 
            }
            pushFollow(FOLLOW_rulePackDef_in_rule__XML2__PackAssignment_0_0_14818);
            rulePackDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXML2Access().getPackPackDefParserRuleCall_0_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__PackAssignment_0_0_1"


    // $ANTLR start "rule__XML2__PackAssignment_0_1_0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2382:1: rule__XML2__PackAssignment_0_1_0 : ( rulePackDef ) ;
    public final void rule__XML2__PackAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2386:1: ( ( rulePackDef ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2387:1: ( rulePackDef )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2387:1: ( rulePackDef )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2388:1: rulePackDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getPackPackDefParserRuleCall_0_1_0_0()); 
            }
            pushFollow(FOLLOW_rulePackDef_in_rule__XML2__PackAssignment_0_1_04849);
            rulePackDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXML2Access().getPackPackDefParserRuleCall_0_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__PackAssignment_0_1_0"


    // $ANTLR start "rule__XML2__InputAssignment_0_1_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2397:1: rule__XML2__InputAssignment_0_1_1 : ( ruleInputDef ) ;
    public final void rule__XML2__InputAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2401:1: ( ( ruleInputDef ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2402:1: ( ruleInputDef )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2402:1: ( ruleInputDef )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2403:1: ruleInputDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getInputInputDefParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleInputDef_in_rule__XML2__InputAssignment_0_1_14880);
            ruleInputDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXML2Access().getInputInputDefParserRuleCall_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__InputAssignment_0_1_1"


    // $ANTLR start "rule__XML2__PackAssignment_0_2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2412:1: rule__XML2__PackAssignment_0_2 : ( rulePackDef ) ;
    public final void rule__XML2__PackAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2416:1: ( ( rulePackDef ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2417:1: ( rulePackDef )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2417:1: ( rulePackDef )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2418:1: rulePackDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getPackPackDefParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_rulePackDef_in_rule__XML2__PackAssignment_0_24911);
            rulePackDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXML2Access().getPackPackDefParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__PackAssignment_0_2"


    // $ANTLR start "rule__XML2__InputAssignment_0_3"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2427:1: rule__XML2__InputAssignment_0_3 : ( ruleInputDef ) ;
    public final void rule__XML2__InputAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2431:1: ( ( ruleInputDef ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2432:1: ( ruleInputDef )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2432:1: ( ruleInputDef )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2433:1: ruleInputDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getInputInputDefParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_ruleInputDef_in_rule__XML2__InputAssignment_0_34942);
            ruleInputDef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXML2Access().getInputInputDefParserRuleCall_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__InputAssignment_0_3"


    // $ANTLR start "rule__XML2__TypesAssignment_1_0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2442:1: rule__XML2__TypesAssignment_1_0 : ( ruleType ) ;
    public final void rule__XML2__TypesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2446:1: ( ( ruleType ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2447:1: ( ruleType )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2447:1: ( ruleType )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2448:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getTypesTypeParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__XML2__TypesAssignment_1_04973);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXML2Access().getTypesTypeParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__TypesAssignment_1_0"


    // $ANTLR start "rule__XML2__CommAssignment_1_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2457:1: rule__XML2__CommAssignment_1_1 : ( ruleOtherComent ) ;
    public final void rule__XML2__CommAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2461:1: ( ( ruleOtherComent ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2462:1: ( ruleOtherComent )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2462:1: ( ruleOtherComent )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2463:1: ruleOtherComent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getCommOtherComentParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleOtherComent_in_rule__XML2__CommAssignment_1_15004);
            ruleOtherComent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXML2Access().getCommOtherComentParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__CommAssignment_1_1"


    // $ANTLR start "rule__InputDef__CommentAssignment_0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2472:1: rule__InputDef__CommentAssignment_0 : ( ruleOtherComent ) ;
    public final void rule__InputDef__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2476:1: ( ( ruleOtherComent ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2477:1: ( ruleOtherComent )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2477:1: ( ruleOtherComent )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2478:1: ruleOtherComent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputDefAccess().getCommentOtherComentParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleOtherComent_in_rule__InputDef__CommentAssignment_05035);
            ruleOtherComent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputDefAccess().getCommentOtherComentParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputDef__CommentAssignment_0"


    // $ANTLR start "rule__InputDef__InputCHARAssignment_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2487:1: rule__InputDef__InputCHARAssignment_1 : ( RULE_C_INPUT ) ;
    public final void rule__InputDef__InputCHARAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2491:1: ( ( RULE_C_INPUT ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2492:1: ( RULE_C_INPUT )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2492:1: ( RULE_C_INPUT )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2493:1: RULE_C_INPUT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputDefAccess().getInputCHARC_INPUTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_C_INPUT,FOLLOW_RULE_C_INPUT_in_rule__InputDef__InputCHARAssignment_15066); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputDefAccess().getInputCHARC_INPUTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputDef__InputCHARAssignment_1"


    // $ANTLR start "rule__InputDef__UrlAssignment_2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2502:1: rule__InputDef__UrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__InputDef__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2506:1: ( ( RULE_STRING ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2507:1: ( RULE_STRING )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2507:1: ( RULE_STRING )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2508:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputDefAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InputDef__UrlAssignment_25097); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputDefAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputDef__UrlAssignment_2"


    // $ANTLR start "rule__PackDef__CommentAssignment_0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2517:1: rule__PackDef__CommentAssignment_0 : ( ruleOtherComent ) ;
    public final void rule__PackDef__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2521:1: ( ( ruleOtherComent ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2522:1: ( ruleOtherComent )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2522:1: ( ruleOtherComent )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2523:1: ruleOtherComent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackDefAccess().getCommentOtherComentParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleOtherComent_in_rule__PackDef__CommentAssignment_05128);
            ruleOtherComent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackDefAccess().getCommentOtherComentParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackDef__CommentAssignment_0"


    // $ANTLR start "rule__PackDef__PackCHARAssignment_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2532:1: rule__PackDef__PackCHARAssignment_1 : ( RULE_C_PACKAGE ) ;
    public final void rule__PackDef__PackCHARAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2536:1: ( ( RULE_C_PACKAGE ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2537:1: ( RULE_C_PACKAGE )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2537:1: ( RULE_C_PACKAGE )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2538:1: RULE_C_PACKAGE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackDefAccess().getPackCHARC_PACKAGETerminalRuleCall_1_0()); 
            }
            match(input,RULE_C_PACKAGE,FOLLOW_RULE_C_PACKAGE_in_rule__PackDef__PackCHARAssignment_15159); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackDefAccess().getPackCHARC_PACKAGETerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackDef__PackCHARAssignment_1"


    // $ANTLR start "rule__PackDef__PackAssignment_2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2547:1: rule__PackDef__PackAssignment_2 : ( rulePackName ) ;
    public final void rule__PackDef__PackAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2551:1: ( ( rulePackName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2552:1: ( rulePackName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2552:1: ( rulePackName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2553:1: rulePackName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackDefAccess().getPackPackNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_rulePackName_in_rule__PackDef__PackAssignment_25190);
            rulePackName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackDefAccess().getPackPackNameParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackDef__PackAssignment_2"


    // $ANTLR start "rule__Type__CommentAssignment_0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2562:1: rule__Type__CommentAssignment_0 : ( ruleTypeComment ) ;
    public final void rule__Type__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2566:1: ( ( ruleTypeComment ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2567:1: ( ruleTypeComment )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2567:1: ( ruleTypeComment )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2568:1: ruleTypeComment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getCommentTypeCommentParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleTypeComment_in_rule__Type__CommentAssignment_05221);
            ruleTypeComment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getCommentTypeCommentParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__CommentAssignment_0"


    // $ANTLR start "rule__Type__EnterAssignment_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2577:1: rule__Type__EnterAssignment_1 : ( ruleEnter ) ;
    public final void rule__Type__EnterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2581:1: ( ( ruleEnter ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2582:1: ( ruleEnter )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2582:1: ( ruleEnter )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2583:1: ruleEnter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getEnterEnterParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEnter_in_rule__Type__EnterAssignment_15252);
            ruleEnter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getEnterEnterParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__EnterAssignment_1"


    // $ANTLR start "rule__Type__PrefixAssignment_2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2592:1: rule__Type__PrefixAssignment_2 : ( RULE_C_TYPE ) ;
    public final void rule__Type__PrefixAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2596:1: ( ( RULE_C_TYPE ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2597:1: ( RULE_C_TYPE )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2597:1: ( RULE_C_TYPE )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2598:1: RULE_C_TYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getPrefixC_TYPETerminalRuleCall_2_0()); 
            }
            match(input,RULE_C_TYPE,FOLLOW_RULE_C_TYPE_in_rule__Type__PrefixAssignment_25283); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getPrefixC_TYPETerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__PrefixAssignment_2"


    // $ANTLR start "rule__Type__NameAssignment_3"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2607:1: rule__Type__NameAssignment_3 : ( ruleTypeName ) ;
    public final void rule__Type__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2611:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2612:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2612:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2613:1: ruleTypeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getNameTypeNameParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_rule__Type__NameAssignment_35314);
            ruleTypeName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getNameTypeNameParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NameAssignment_3"


    // $ANTLR start "rule__Type__FieldsAssignment_5_0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2622:1: rule__Type__FieldsAssignment_5_0 : ( ruleField ) ;
    public final void rule__Type__FieldsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2626:1: ( ( ruleField ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2627:1: ( ruleField )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2627:1: ( ruleField )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2628:1: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getFieldsFieldParserRuleCall_5_0_0()); 
            }
            pushFollow(FOLLOW_ruleField_in_rule__Type__FieldsAssignment_5_05345);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getFieldsFieldParserRuleCall_5_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__FieldsAssignment_5_0"


    // $ANTLR start "rule__Type__CommAssignment_5_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2637:1: rule__Type__CommAssignment_5_1 : ( ruleOtherComent ) ;
    public final void rule__Type__CommAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2641:1: ( ( ruleOtherComent ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2642:1: ( ruleOtherComent )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2642:1: ( ruleOtherComent )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2643:1: ruleOtherComent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getCommOtherComentParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleOtherComent_in_rule__Type__CommAssignment_5_15376);
            ruleOtherComent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getCommOtherComentParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__CommAssignment_5_1"


    // $ANTLR start "rule__Enter__PrefixAssignment_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2652:1: rule__Enter__PrefixAssignment_1 : ( RULE_C_MAIN ) ;
    public final void rule__Enter__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2656:1: ( ( RULE_C_MAIN ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2657:1: ( RULE_C_MAIN )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2657:1: ( RULE_C_MAIN )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2658:1: RULE_C_MAIN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getPrefixC_MAINTerminalRuleCall_1_0()); 
            }
            match(input,RULE_C_MAIN,FOLLOW_RULE_C_MAIN_in_rule__Enter__PrefixAssignment_15407); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnterAccess().getPrefixC_MAINTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enter__PrefixAssignment_1"


    // $ANTLR start "rule__Enter__RootPathAssignment_3"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2667:1: rule__Enter__RootPathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Enter__RootPathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2671:1: ( ( RULE_STRING ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2672:1: ( RULE_STRING )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2672:1: ( RULE_STRING )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2673:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getRootPathSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Enter__RootPathAssignment_35438); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnterAccess().getRootPathSTRINGTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enter__RootPathAssignment_3"


    // $ANTLR start "rule__Field__CommentAssignment_0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2682:1: rule__Field__CommentAssignment_0 : ( ruleFieldComment ) ;
    public final void rule__Field__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2686:1: ( ( ruleFieldComment ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2687:1: ( ruleFieldComment )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2687:1: ( ruleFieldComment )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2688:1: ruleFieldComment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getCommentFieldCommentParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleFieldComment_in_rule__Field__CommentAssignment_05469);
            ruleFieldComment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getCommentFieldCommentParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__CommentAssignment_0"


    // $ANTLR start "rule__Field__MetaAssignment_1_0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2697:1: rule__Field__MetaAssignment_1_0 : ( ruleListMeta ) ;
    public final void rule__Field__MetaAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2701:1: ( ( ruleListMeta ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2702:1: ( ruleListMeta )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2702:1: ( ruleListMeta )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2703:1: ruleListMeta
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getMetaListMetaParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleListMeta_in_rule__Field__MetaAssignment_1_05500);
            ruleListMeta();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getMetaListMetaParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__MetaAssignment_1_0"


    // $ANTLR start "rule__Field__MetaAssignment_1_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2712:1: rule__Field__MetaAssignment_1_1 : ( ruleSliceMeta ) ;
    public final void rule__Field__MetaAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2716:1: ( ( ruleSliceMeta ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2717:1: ( ruleSliceMeta )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2717:1: ( ruleSliceMeta )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2718:1: ruleSliceMeta
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getMetaSliceMetaParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleSliceMeta_in_rule__Field__MetaAssignment_1_15531);
            ruleSliceMeta();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getMetaSliceMetaParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__MetaAssignment_1_1"


    // $ANTLR start "rule__Field__TypeAssignment_2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2727:1: rule__Field__TypeAssignment_2 : ( ruleFieldType ) ;
    public final void rule__Field__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2731:1: ( ( ruleFieldType ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2732:1: ( ruleFieldType )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2732:1: ( ruleFieldType )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2733:1: ruleFieldType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFieldType_in_rule__Field__TypeAssignment_25562);
            ruleFieldType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__TypeAssignment_2"


    // $ANTLR start "rule__Field__FieldNameAssignment_3"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2742:1: rule__Field__FieldNameAssignment_3 : ( ruleTypeName ) ;
    public final void rule__Field__FieldNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2746:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2747:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2747:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2748:1: ruleTypeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getFieldNameTypeNameParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_rule__Field__FieldNameAssignment_35593);
            ruleTypeName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getFieldNameTypeNameParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__FieldNameAssignment_3"


    // $ANTLR start "rule__Field__NodePathAssignment_5"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2757:1: rule__Field__NodePathAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Field__NodePathAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2761:1: ( ( RULE_STRING ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2762:1: ( RULE_STRING )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2762:1: ( RULE_STRING )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2763:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNodePathSTRINGTerminalRuleCall_5_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Field__NodePathAssignment_55624); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNodePathSTRINGTerminalRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NodePathAssignment_5"


    // $ANTLR start "rule__FieldType__TypeAssignment"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2772:1: rule__FieldType__TypeAssignment : ( ruleTypeName ) ;
    public final void rule__FieldType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2776:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2777:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2777:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2778:1: ruleTypeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldTypeAccess().getTypeTypeNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_rule__FieldType__TypeAssignment5655);
            ruleTypeName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldTypeAccess().getTypeTypeNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldType__TypeAssignment"


    // $ANTLR start "rule__ListMeta__PrefixAssignment_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2787:1: rule__ListMeta__PrefixAssignment_1 : ( RULE_C_LIST ) ;
    public final void rule__ListMeta__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2791:1: ( ( RULE_C_LIST ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2792:1: ( RULE_C_LIST )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2792:1: ( RULE_C_LIST )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2793:1: RULE_C_LIST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getPrefixC_LISTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_C_LIST,FOLLOW_RULE_C_LIST_in_rule__ListMeta__PrefixAssignment_15686); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListMetaAccess().getPrefixC_LISTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__PrefixAssignment_1"


    // $ANTLR start "rule__ListMeta__ParamsAssignment_2_1_0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2802:1: rule__ListMeta__ParamsAssignment_2_1_0 : ( ruleFieldMetaKey ) ;
    public final void rule__ListMeta__ParamsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2806:1: ( ( ruleFieldMetaKey ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2807:1: ( ruleFieldMetaKey )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2807:1: ( ruleFieldMetaKey )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2808:1: ruleFieldMetaKey
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getParamsFieldMetaKeyParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleFieldMetaKey_in_rule__ListMeta__ParamsAssignment_2_1_05717);
            ruleFieldMetaKey();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListMetaAccess().getParamsFieldMetaKeyParserRuleCall_2_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__ParamsAssignment_2_1_0"


    // $ANTLR start "rule__ListMeta__ParamsAssignment_2_1_1_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2817:1: rule__ListMeta__ParamsAssignment_2_1_1_1 : ( ruleFieldMetaKey ) ;
    public final void rule__ListMeta__ParamsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2821:1: ( ( ruleFieldMetaKey ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2822:1: ( ruleFieldMetaKey )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2822:1: ( ruleFieldMetaKey )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2823:1: ruleFieldMetaKey
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getParamsFieldMetaKeyParserRuleCall_2_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldMetaKey_in_rule__ListMeta__ParamsAssignment_2_1_1_15748);
            ruleFieldMetaKey();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListMetaAccess().getParamsFieldMetaKeyParserRuleCall_2_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListMeta__ParamsAssignment_2_1_1_1"


    // $ANTLR start "rule__SliceMeta__PrefixAssignment_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2832:1: rule__SliceMeta__PrefixAssignment_1 : ( RULE_C_SLICE ) ;
    public final void rule__SliceMeta__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2836:1: ( ( RULE_C_SLICE ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2837:1: ( RULE_C_SLICE )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2837:1: ( RULE_C_SLICE )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2838:1: RULE_C_SLICE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSliceMetaAccess().getPrefixC_SLICETerminalRuleCall_1_0()); 
            }
            match(input,RULE_C_SLICE,FOLLOW_RULE_C_SLICE_in_rule__SliceMeta__PrefixAssignment_15779); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSliceMetaAccess().getPrefixC_SLICETerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SliceMeta__PrefixAssignment_1"


    // $ANTLR start "rule__SliceMeta__SliceCharAssignment_3"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2847:1: rule__SliceMeta__SliceCharAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SliceMeta__SliceCharAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2851:1: ( ( RULE_STRING ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2852:1: ( RULE_STRING )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2852:1: ( RULE_STRING )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2853:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSliceMetaAccess().getSliceCharSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SliceMeta__SliceCharAssignment_35810); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSliceMetaAccess().getSliceCharSTRINGTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SliceMeta__SliceCharAssignment_3"


    // $ANTLR start "rule__FieldMetaKey__FieldNameAssignment"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2862:1: rule__FieldMetaKey__FieldNameAssignment : ( ruleTypeName ) ;
    public final void rule__FieldMetaKey__FieldNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2866:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2867:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2867:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2868:1: ruleTypeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMetaKeyAccess().getFieldNameTypeNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_rule__FieldMetaKey__FieldNameAssignment5841);
            ruleTypeName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMetaKeyAccess().getFieldNameTypeNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldMetaKey__FieldNameAssignment"


    // $ANTLR start "rule__OtherComent__CommAssignment"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2877:1: rule__OtherComent__CommAssignment : ( RULE_COMMENT ) ;
    public final void rule__OtherComent__CommAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2881:1: ( ( RULE_COMMENT ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2882:1: ( RULE_COMMENT )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2882:1: ( RULE_COMMENT )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2883:1: RULE_COMMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherComentAccess().getCommCOMMENTTerminalRuleCall_0()); 
            }
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__OtherComent__CommAssignment5872); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherComentAccess().getCommCOMMENTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OtherComent__CommAssignment"

    // $ANTLR start synpred4_InternalCfg
    public final void synpred4_InternalCfg_fragment() throws RecognitionException {   
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:520:1: ( ( ( rule__XML2__TypesAssignment_1_0 ) ) )
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:520:1: ( ( rule__XML2__TypesAssignment_1_0 ) )
        {
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:520:1: ( ( rule__XML2__TypesAssignment_1_0 ) )
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:521:1: ( rule__XML2__TypesAssignment_1_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getXML2Access().getTypesAssignment_1_0()); 
        }
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:522:1: ( rule__XML2__TypesAssignment_1_0 )
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:522:2: rule__XML2__TypesAssignment_1_0
        {
        pushFollow(FOLLOW_rule__XML2__TypesAssignment_1_0_in_synpred4_InternalCfg1061);
        rule__XML2__TypesAssignment_1_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4_InternalCfg

    // $ANTLR start synpred5_InternalCfg
    public final void synpred5_InternalCfg_fragment() throws RecognitionException {   
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:542:1: ( ( ( rule__Type__FieldsAssignment_5_0 ) ) )
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:542:1: ( ( rule__Type__FieldsAssignment_5_0 ) )
        {
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:542:1: ( ( rule__Type__FieldsAssignment_5_0 ) )
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:543:1: ( rule__Type__FieldsAssignment_5_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getTypeAccess().getFieldsAssignment_5_0()); 
        }
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:544:1: ( rule__Type__FieldsAssignment_5_0 )
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:544:2: rule__Type__FieldsAssignment_5_0
        {
        pushFollow(FOLLOW_rule__Type__FieldsAssignment_5_0_in_synpred5_InternalCfg1112);
        rule__Type__FieldsAssignment_5_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred5_InternalCfg

    // Delegated rules

    public final boolean synpred5_InternalCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalCfg_fragment(); // can never throw exception
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
    static final String DFA1_eotS =
        "\45\uffff";
    static final String DFA1_eofS =
        "\3\uffff\1\22\1\26\15\22\1\uffff\2\26\5\uffff\13\22";
    static final String DFA1_minS =
        "\2\4\1\31\17\4\1\uffff\2\4\3\uffff\1\5\1\21\13\4";
    static final String DFA1_maxS =
        "\2\32\1\31\1\23\1\32\13\37\2\23\1\uffff\2\32\3\uffff\1\17\1\31"+
        "\13\37";
    static final String DFA1_acceptS =
        "\22\uffff\1\3\2\uffff\1\1\1\4\1\2\15\uffff";
    static final String DFA1_specialS =
        "\45\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\1\2\24\uffff\1\3",
            "\1\1\1\2\24\uffff\1\3",
            "\1\4",
            "\1\21\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
            "\1\20\2\uffff\1\22",
            "\1\24\2\uffff\1\26\10\uffff\1\23\2\uffff\1\26\6\uffff\1\25",
            "\1\21\1\27\1\uffff\1\22\10\uffff\1\20\2\uffff\1\22\5\uffff"+
            "\1\27\5\uffff\1\30",
            "\1\21\1\27\1\uffff\1\22\10\uffff\1\20\2\uffff\1\22\13\uffff"+
            "\1\30",
            "\1\21\1\31\12\22\1\20\2\uffff\1\22\13\uffff\1\30",
            "\1\21\1\27\1\uffff\1\22\10\uffff\1\20\2\uffff\1\22\13\uffff"+
            "\1\30",
            "\1\21\1\27\1\uffff\1\22\10\uffff\1\20\2\uffff\1\22\13\uffff"+
            "\1\30",
            "\1\21\1\27\1\uffff\1\22\10\uffff\1\20\2\uffff\1\22\13\uffff"+
            "\1\30",
            "\1\21\1\27\1\uffff\1\22\10\uffff\1\20\2\uffff\1\22\13\uffff"+
            "\1\30",
            "\1\21\1\27\1\uffff\1\22\10\uffff\1\20\2\uffff\1\22\13\uffff"+
            "\1\30",
            "\1\21\1\27\1\uffff\1\22\10\uffff\1\20\2\uffff\1\22\13\uffff"+
            "\1\30",
            "\1\21\1\27\1\uffff\1\22\10\uffff\1\20\2\uffff\1\22\13\uffff"+
            "\1\30",
            "\1\21\1\27\1\uffff\1\22\10\uffff\1\20\2\uffff\1\22\13\uffff"+
            "\1\30",
            "\1\21\1\27\1\uffff\1\22\13\uffff\1\22",
            "\1\21\1\27\1\uffff\1\22\13\uffff\1\22",
            "",
            "\1\24\2\uffff\1\26\13\uffff\1\26\6\uffff\1\25",
            "\1\24\2\uffff\1\26\13\uffff\1\26\6\uffff\1\25",
            "",
            "",
            "",
            "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44",
            "\1\22\7\uffff\1\27",
            "\1\21\1\27\1\uffff\1\22\10\uffff\1\20\2\uffff\1\22\13\uffff"+
            "\1\30",
            "\1\21\1\27\1\uffff\1\22\10\uffff\1\20\2\uffff\1\22\13\uffff"+
            "\1\30",
            "\1\21\1\27\1\uffff\1\22\10\uffff\1\20\2\uffff\1\22\13\uffff"+
            "\1\30",
            "\1\21\1\27\1\uffff\1\22\10\uffff\1\20\2\uffff\1\22\13\uffff"+
            "\1\30",
            "\1\21\1\27\1\uffff\1\22\10\uffff\1\20\2\uffff\1\22\13\uffff"+
            "\1\30",
            "\1\21\1\27\1\uffff\1\22\10\uffff\1\20\2\uffff\1\22\13\uffff"+
            "\1\30",
            "\1\21\1\27\1\uffff\1\22\10\uffff\1\20\2\uffff\1\22\13\uffff"+
            "\1\30",
            "\1\21\1\27\1\uffff\1\22\10\uffff\1\20\2\uffff\1\22\13\uffff"+
            "\1\30",
            "\1\21\1\27\1\uffff\1\22\10\uffff\1\20\2\uffff\1\22\13\uffff"+
            "\1\30",
            "\1\21\1\27\1\uffff\1\22\10\uffff\1\20\2\uffff\1\22\13\uffff"+
            "\1\30",
            "\1\21\1\27\1\uffff\1\22\10\uffff\1\20\2\uffff\1\22\13\uffff"+
            "\1\30"
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
            return "481:1: rule__XML2__Alternatives_0 : ( ( ( rule__XML2__Group_0_0__0 ) ) | ( ( rule__XML2__Group_0_1__0 ) ) | ( ( rule__XML2__PackAssignment_0_2 ) ) | ( ( rule__XML2__InputAssignment_0_3 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleXML2_in_entryRuleXML267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXML274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group__0_in_ruleXML2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputDef_in_entryRuleInputDef127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputDef134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDef__Group__0_in_ruleInputDef160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackDef_in_entryRulePackDef187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackDef194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackDef__Group__0_in_rulePackDef220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0_in_ruleType280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnter_in_entryRuleEnter307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnter314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__Group__0_in_ruleEnter340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_entryRuleFieldType427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldType434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldType__TypeAssignment_in_ruleFieldType460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListMeta_in_entryRuleListMeta487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListMeta494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group__0_in_ruleListMeta520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSliceMeta_in_entryRuleSliceMeta547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSliceMeta554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SliceMeta__Group__0_in_ruleSliceMeta580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldMetaKey_in_entryRuleFieldMetaKey607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldMetaKey614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldMetaKey__FieldNameAssignment_in_ruleFieldMetaKey640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeComment_in_entryRuleTypeComment667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeComment674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleTypeComment700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldComment_in_entryRuleFieldComment726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldComment733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleFieldComment759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_entryRuleOtherComent785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherComent792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OtherComent__CommAssignment_in_ruleOtherComent818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackName_in_entryRulePackName845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackName852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackName__Group__0_in_rulePackName878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_entryRuleTypeName905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeName912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeName__Alternatives_in_ruleTypeName938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group_0_0__0_in_rule__XML2__Alternatives_0974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group_0_1__0_in_rule__XML2__Alternatives_0992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__PackAssignment_0_2_in_rule__XML2__Alternatives_01010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__InputAssignment_0_3_in_rule__XML2__Alternatives_01028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__TypesAssignment_1_0_in_rule__XML2__Alternatives_11061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__CommAssignment_1_1_in_rule__XML2__Alternatives_11079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__FieldsAssignment_5_0_in_rule__Type__Alternatives_51112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__CommAssignment_5_1_in_rule__Type__Alternatives_51130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__MetaAssignment_1_0_in_rule__Field__Alternatives_11163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__MetaAssignment_1_1_in_rule__Field__Alternatives_11181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INPUT_in_rule__TypeName__Alternatives1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_MAIN_in_rule__TypeName__Alternatives1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_TYPE_in_rule__TypeName__Alternatives1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INT_in_rule__TypeName__Alternatives1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_UINT_in_rule__TypeName__Alternatives1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BOOL_in_rule__TypeName__Alternatives1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_NUMBER_in_rule__TypeName__Alternatives1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_STRING_in_rule__TypeName__Alternatives1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_LIST_in_rule__TypeName__Alternatives1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_SLICE_in_rule__TypeName__Alternatives1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rule__TypeName__Alternatives1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group__0__Impl_in_rule__XML2__Group__01414 = new BitSet(new long[]{0x0000000000080090L});
    public static final BitSet FOLLOW_rule__XML2__Group__1_in_rule__XML2__Group__01417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Alternatives_0_in_rule__XML2__Group__0__Impl1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group__1__Impl_in_rule__XML2__Group__11474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Alternatives_1_in_rule__XML2__Group__1__Impl1501 = new BitSet(new long[]{0x0000000000080092L});
    public static final BitSet FOLLOW_rule__XML2__Group_0_0__0__Impl_in_rule__XML2__Group_0_0__01536 = new BitSet(new long[]{0x0000000004080090L});
    public static final BitSet FOLLOW_rule__XML2__Group_0_0__1_in_rule__XML2__Group_0_0__01539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__InputAssignment_0_0_0_in_rule__XML2__Group_0_0__0__Impl1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group_0_0__1__Impl_in_rule__XML2__Group_0_0__11596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__PackAssignment_0_0_1_in_rule__XML2__Group_0_0__1__Impl1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group_0_1__0__Impl_in_rule__XML2__Group_0_1__01657 = new BitSet(new long[]{0x00000000000800B0L});
    public static final BitSet FOLLOW_rule__XML2__Group_0_1__1_in_rule__XML2__Group_0_1__01660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__PackAssignment_0_1_0_in_rule__XML2__Group_0_1__0__Impl1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group_0_1__1__Impl_in_rule__XML2__Group_0_1__11717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__InputAssignment_0_1_1_in_rule__XML2__Group_0_1__1__Impl1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDef__Group__0__Impl_in_rule__InputDef__Group__01778 = new BitSet(new long[]{0x00000000000800B0L});
    public static final BitSet FOLLOW_rule__InputDef__Group__1_in_rule__InputDef__Group__01781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDef__CommentAssignment_0_in_rule__InputDef__Group__0__Impl1808 = new BitSet(new long[]{0x0000000000080092L});
    public static final BitSet FOLLOW_rule__InputDef__Group__1__Impl_in_rule__InputDef__Group__11839 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__InputDef__Group__2_in_rule__InputDef__Group__11842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDef__InputCHARAssignment_1_in_rule__InputDef__Group__1__Impl1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDef__Group__2__Impl_in_rule__InputDef__Group__21899 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__InputDef__Group__3_in_rule__InputDef__Group__21902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDef__UrlAssignment_2_in_rule__InputDef__Group__2__Impl1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDef__Group__3__Impl_in_rule__InputDef__Group__31959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_rule__InputDef__Group__3__Impl1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackDef__Group__0__Impl_in_rule__PackDef__Group__02026 = new BitSet(new long[]{0x0000000004080090L});
    public static final BitSet FOLLOW_rule__PackDef__Group__1_in_rule__PackDef__Group__02029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackDef__CommentAssignment_0_in_rule__PackDef__Group__0__Impl2056 = new BitSet(new long[]{0x0000000000080092L});
    public static final BitSet FOLLOW_rule__PackDef__Group__1__Impl_in_rule__PackDef__Group__12087 = new BitSet(new long[]{0x000000000001FFE0L});
    public static final BitSet FOLLOW_rule__PackDef__Group__2_in_rule__PackDef__Group__12090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackDef__PackCHARAssignment_1_in_rule__PackDef__Group__1__Impl2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackDef__Group__2__Impl_in_rule__PackDef__Group__22147 = new BitSet(new long[]{0x000000000001FFE0L});
    public static final BitSet FOLLOW_rule__PackDef__Group__3_in_rule__PackDef__Group__22150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackDef__PackAssignment_2_in_rule__PackDef__Group__2__Impl2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackDef__Group__3__Impl_in_rule__PackDef__Group__32208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_rule__PackDef__Group__3__Impl2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__02275 = new BitSet(new long[]{0x0000000000080090L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__02278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__CommentAssignment_0_in_rule__Type__Group__0__Impl2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__12336 = new BitSet(new long[]{0x0000000000080090L});
    public static final BitSet FOLLOW_rule__Type__Group__2_in_rule__Type__Group__12339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__EnterAssignment_1_in_rule__Type__Group__1__Impl2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__2__Impl_in_rule__Type__Group__22397 = new BitSet(new long[]{0x000000000000FFE0L});
    public static final BitSet FOLLOW_rule__Type__Group__3_in_rule__Type__Group__22400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__PrefixAssignment_2_in_rule__Type__Group__2__Impl2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__3__Impl_in_rule__Type__Group__32457 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Type__Group__4_in_rule__Type__Group__32460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__NameAssignment_3_in_rule__Type__Group__3__Impl2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__4__Impl_in_rule__Type__Group__42517 = new BitSet(new long[]{0x00000000000CFFF0L});
    public static final BitSet FOLLOW_rule__Type__Group__5_in_rule__Type__Group__42520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACE_L_in_rule__Type__Group__4__Impl2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__5__Impl_in_rule__Type__Group__52576 = new BitSet(new long[]{0x00000000000CFFF0L});
    public static final BitSet FOLLOW_rule__Type__Group__6_in_rule__Type__Group__52579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_5_in_rule__Type__Group__5__Impl2606 = new BitSet(new long[]{0x000000000008FFF2L});
    public static final BitSet FOLLOW_rule__Type__Group__6__Impl_in_rule__Type__Group__62637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACE_R_in_rule__Type__Group__6__Impl2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__Group__0__Impl_in_rule__Enter__Group__02707 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Enter__Group__1_in_rule__Enter__Group__02710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_L_in_rule__Enter__Group__0__Impl2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__Group__1__Impl_in_rule__Enter__Group__12766 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Enter__Group__2_in_rule__Enter__Group__12769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__PrefixAssignment_1_in_rule__Enter__Group__1__Impl2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__Group__2__Impl_in_rule__Enter__Group__22826 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Enter__Group__3_in_rule__Enter__Group__22829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_rule__Enter__Group__2__Impl2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__Group__3__Impl_in_rule__Enter__Group__32885 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Enter__Group__4_in_rule__Enter__Group__32888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__RootPathAssignment_3_in_rule__Enter__Group__3__Impl2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__Group__4__Impl_in_rule__Enter__Group__42945 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Enter__Group__5_in_rule__Enter__Group__42948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_rule__Enter__Group__4__Impl2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__Group__5__Impl_in_rule__Enter__Group__53004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_R_in_rule__Enter__Group__5__Impl3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__03072 = new BitSet(new long[]{0x000000000008FFF0L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__03075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__CommentAssignment_0_in_rule__Field__Group__0__Impl3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__13133 = new BitSet(new long[]{0x000000000008FFF0L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__13136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Alternatives_1_in_rule__Field__Group__1__Impl3163 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__23194 = new BitSet(new long[]{0x000000000000FFE0L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__23197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypeAssignment_2_in_rule__Field__Group__2__Impl3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__33254 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__33257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__FieldNameAssignment_3_in_rule__Field__Group__3__Impl3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__43314 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Field__Group__5_in_rule__Field__Group__43317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_rule__Field__Group__4__Impl3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__53373 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Field__Group__6_in_rule__Field__Group__53376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NodePathAssignment_5_in_rule__Field__Group__5__Impl3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__63433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_rule__Field__Group__6__Impl3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group__0__Impl_in_rule__ListMeta__Group__03506 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ListMeta__Group__1_in_rule__ListMeta__Group__03509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_L_in_rule__ListMeta__Group__0__Impl3536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group__1__Impl_in_rule__ListMeta__Group__13565 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__ListMeta__Group__2_in_rule__ListMeta__Group__13568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__PrefixAssignment_1_in_rule__ListMeta__Group__1__Impl3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group__2__Impl_in_rule__ListMeta__Group__23625 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_rule__ListMeta__Group__3_in_rule__ListMeta__Group__23628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2__0_in_rule__ListMeta__Group__2__Impl3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group__3__Impl_in_rule__ListMeta__Group__33686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_R_in_rule__ListMeta__Group__3__Impl3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2__0__Impl_in_rule__ListMeta__Group_2__03750 = new BitSet(new long[]{0x000000000020FFE0L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2__1_in_rule__ListMeta__Group_2__03753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_rule__ListMeta__Group_2__0__Impl3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2__1__Impl_in_rule__ListMeta__Group_2__13809 = new BitSet(new long[]{0x000000000020FFE0L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2__2_in_rule__ListMeta__Group_2__13812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2_1__0_in_rule__ListMeta__Group_2__1__Impl3839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2__2__Impl_in_rule__ListMeta__Group_2__23870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_rule__ListMeta__Group_2__2__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2_1__0__Impl_in_rule__ListMeta__Group_2_1__03932 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2_1__1_in_rule__ListMeta__Group_2_1__03935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__ParamsAssignment_2_1_0_in_rule__ListMeta__Group_2_1__0__Impl3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2_1__1__Impl_in_rule__ListMeta__Group_2_1__13992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2_1_1__0_in_rule__ListMeta__Group_2_1__1__Impl4019 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2_1_1__0__Impl_in_rule__ListMeta__Group_2_1_1__04054 = new BitSet(new long[]{0x000000000000FFE0L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2_1_1__1_in_rule__ListMeta__Group_2_1_1__04057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_COMMA_in_rule__ListMeta__Group_2_1_1__0__Impl4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2_1_1__1__Impl_in_rule__ListMeta__Group_2_1_1__14113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__ParamsAssignment_2_1_1_1_in_rule__ListMeta__Group_2_1_1__1__Impl4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SliceMeta__Group__0__Impl_in_rule__SliceMeta__Group__04174 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SliceMeta__Group__1_in_rule__SliceMeta__Group__04177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_L_in_rule__SliceMeta__Group__0__Impl4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SliceMeta__Group__1__Impl_in_rule__SliceMeta__Group__14233 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SliceMeta__Group__2_in_rule__SliceMeta__Group__14236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SliceMeta__PrefixAssignment_1_in_rule__SliceMeta__Group__1__Impl4263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SliceMeta__Group__2__Impl_in_rule__SliceMeta__Group__24293 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__SliceMeta__Group__3_in_rule__SliceMeta__Group__24296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_rule__SliceMeta__Group__2__Impl4323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SliceMeta__Group__3__Impl_in_rule__SliceMeta__Group__34352 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__SliceMeta__Group__4_in_rule__SliceMeta__Group__34355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SliceMeta__SliceCharAssignment_3_in_rule__SliceMeta__Group__3__Impl4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SliceMeta__Group__4__Impl_in_rule__SliceMeta__Group__44412 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SliceMeta__Group__5_in_rule__SliceMeta__Group__44415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_rule__SliceMeta__Group__4__Impl4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SliceMeta__Group__5__Impl_in_rule__SliceMeta__Group__54471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_R_in_rule__SliceMeta__Group__5__Impl4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackName__Group__0__Impl_in_rule__PackName__Group__04539 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__PackName__Group__1_in_rule__PackName__Group__04542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__PackName__Group__0__Impl4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackName__Group__1__Impl_in_rule__PackName__Group__14598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackName__Group_1__0_in_rule__PackName__Group__1__Impl4625 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__PackName__Group_1__0__Impl_in_rule__PackName__Group_1__04660 = new BitSet(new long[]{0x000000000000FFE0L});
    public static final BitSet FOLLOW_rule__PackName__Group_1__1_in_rule__PackName__Group_1__04663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PackName__Group_1__0__Impl4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackName__Group_1__1__Impl_in_rule__PackName__Group_1__14722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__PackName__Group_1__1__Impl4749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputDef_in_rule__XML2__InputAssignment_0_0_04787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackDef_in_rule__XML2__PackAssignment_0_0_14818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackDef_in_rule__XML2__PackAssignment_0_1_04849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputDef_in_rule__XML2__InputAssignment_0_1_14880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackDef_in_rule__XML2__PackAssignment_0_24911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputDef_in_rule__XML2__InputAssignment_0_34942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__XML2__TypesAssignment_1_04973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_rule__XML2__CommAssignment_1_15004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_rule__InputDef__CommentAssignment_05035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INPUT_in_rule__InputDef__InputCHARAssignment_15066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InputDef__UrlAssignment_25097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_rule__PackDef__CommentAssignment_05128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PACKAGE_in_rule__PackDef__PackCHARAssignment_15159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackName_in_rule__PackDef__PackAssignment_25190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeComment_in_rule__Type__CommentAssignment_05221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnter_in_rule__Type__EnterAssignment_15252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_TYPE_in_rule__Type__PrefixAssignment_25283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__Type__NameAssignment_35314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Type__FieldsAssignment_5_05345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_rule__Type__CommAssignment_5_15376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_MAIN_in_rule__Enter__PrefixAssignment_15407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Enter__RootPathAssignment_35438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldComment_in_rule__Field__CommentAssignment_05469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListMeta_in_rule__Field__MetaAssignment_1_05500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSliceMeta_in_rule__Field__MetaAssignment_1_15531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_rule__Field__TypeAssignment_25562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__Field__FieldNameAssignment_35593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Field__NodePathAssignment_55624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__FieldType__TypeAssignment5655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_LIST_in_rule__ListMeta__PrefixAssignment_15686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldMetaKey_in_rule__ListMeta__ParamsAssignment_2_1_05717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldMetaKey_in_rule__ListMeta__ParamsAssignment_2_1_1_15748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_SLICE_in_rule__SliceMeta__PrefixAssignment_15779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SliceMeta__SliceCharAssignment_35810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__FieldMetaKey__FieldNameAssignment5841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__OtherComent__CommAssignment5872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__TypesAssignment_1_0_in_synpred4_InternalCfg1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__FieldsAssignment_5_0_in_synpred5_InternalCfg1112 = new BitSet(new long[]{0x0000000000000002L});

}