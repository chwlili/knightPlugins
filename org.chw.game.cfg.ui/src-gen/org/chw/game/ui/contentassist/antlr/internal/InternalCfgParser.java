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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMMENT", "RULE_C_INPUT", "RULE_C_MAIN", "RULE_C_TYPE", "RULE_C_INT", "RULE_C_UINT", "RULE_C_BOOL", "RULE_C_NUMBER", "RULE_C_STRING", "RULE_C_LIST", "RULE_NAME", "RULE_C_SEMICOLON", "RULE_C_BRACE_L", "RULE_C_BRACE_R", "RULE_C_BRACKET_L", "RULE_C_PAREN_L", "RULE_C_PAREN_R", "RULE_C_BRACKET_R", "RULE_C_EQUALS", "RULE_C_COMMA", "RULE_STRING", "RULE_C_PACKAGE", "RULE_C_ANGLE_L", "RULE_C_ANGLE_R", "RULE_COMMENT_END", "RULE_WS", "'.'"
    };
    public static final int RULE_C_NUMBER=11;
    public static final int RULE_C_COMMA=23;
    public static final int RULE_C_TYPE=7;
    public static final int RULE_C_PAREN_R=20;
    public static final int RULE_C_SEMICOLON=15;
    public static final int RULE_C_PAREN_L=19;
    public static final int RULE_C_INPUT=5;
    public static final int RULE_C_STRING=12;
    public static final int RULE_COMMENT=4;
    public static final int RULE_C_PACKAGE=25;
    public static final int EOF=-1;
    public static final int RULE_C_ANGLE_L=26;
    public static final int RULE_C_ANGLE_R=27;
    public static final int RULE_COMMENT_END=28;
    public static final int RULE_C_BRACKET_L=18;
    public static final int T__30=30;
    public static final int RULE_STRING=24;
    public static final int RULE_C_EQUALS=22;
    public static final int RULE_C_UINT=9;
    public static final int RULE_C_BRACKET_R=21;
    public static final int RULE_C_MAIN=6;
    public static final int RULE_C_INT=8;
    public static final int RULE_NAME=14;
    public static final int RULE_WS=29;
    public static final int RULE_C_BOOL=10;
    public static final int RULE_C_LIST=13;
    public static final int RULE_C_BRACE_L=16;
    public static final int RULE_C_BRACE_R=17;

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


    // $ANTLR start "entryRuleFieldMeta"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:257:1: entryRuleFieldMeta : ruleFieldMeta EOF ;
    public final void entryRuleFieldMeta() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:258:1: ( ruleFieldMeta EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:259:1: ruleFieldMeta EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMetaRule()); 
            }
            pushFollow(FOLLOW_ruleFieldMeta_in_entryRuleFieldMeta487);
            ruleFieldMeta();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMetaRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldMeta494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFieldMeta"


    // $ANTLR start "ruleFieldMeta"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:266:1: ruleFieldMeta : ( ( rule__FieldMeta__Group__0 ) ) ;
    public final void ruleFieldMeta() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:270:2: ( ( ( rule__FieldMeta__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:271:1: ( ( rule__FieldMeta__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:271:1: ( ( rule__FieldMeta__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:272:1: ( rule__FieldMeta__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMetaAccess().getGroup()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:273:1: ( rule__FieldMeta__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:273:2: rule__FieldMeta__Group__0
            {
            pushFollow(FOLLOW_rule__FieldMeta__Group__0_in_ruleFieldMeta520);
            rule__FieldMeta__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMetaAccess().getGroup()); 
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
    // $ANTLR end "ruleFieldMeta"


    // $ANTLR start "entryRuleFieldMetaKey"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:285:1: entryRuleFieldMetaKey : ruleFieldMetaKey EOF ;
    public final void entryRuleFieldMetaKey() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:286:1: ( ruleFieldMetaKey EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:287:1: ruleFieldMetaKey EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMetaKeyRule()); 
            }
            pushFollow(FOLLOW_ruleFieldMetaKey_in_entryRuleFieldMetaKey547);
            ruleFieldMetaKey();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMetaKeyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldMetaKey554); if (state.failed) return ;

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:294:1: ruleFieldMetaKey : ( ( rule__FieldMetaKey__FieldNameAssignment ) ) ;
    public final void ruleFieldMetaKey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:298:2: ( ( ( rule__FieldMetaKey__FieldNameAssignment ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:299:1: ( ( rule__FieldMetaKey__FieldNameAssignment ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:299:1: ( ( rule__FieldMetaKey__FieldNameAssignment ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:300:1: ( rule__FieldMetaKey__FieldNameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMetaKeyAccess().getFieldNameAssignment()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:301:1: ( rule__FieldMetaKey__FieldNameAssignment )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:301:2: rule__FieldMetaKey__FieldNameAssignment
            {
            pushFollow(FOLLOW_rule__FieldMetaKey__FieldNameAssignment_in_ruleFieldMetaKey580);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:313:1: entryRuleTypeComment : ruleTypeComment EOF ;
    public final void entryRuleTypeComment() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:314:1: ( ruleTypeComment EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:315:1: ruleTypeComment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeCommentRule()); 
            }
            pushFollow(FOLLOW_ruleTypeComment_in_entryRuleTypeComment607);
            ruleTypeComment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeCommentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeComment614); if (state.failed) return ;

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:322:1: ruleTypeComment : ( RULE_COMMENT ) ;
    public final void ruleTypeComment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:326:2: ( ( RULE_COMMENT ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:327:1: ( RULE_COMMENT )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:327:1: ( RULE_COMMENT )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:328:1: RULE_COMMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeCommentAccess().getCOMMENTTerminalRuleCall()); 
            }
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleTypeComment640); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:341:1: entryRuleFieldComment : ruleFieldComment EOF ;
    public final void entryRuleFieldComment() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:342:1: ( ruleFieldComment EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:343:1: ruleFieldComment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldCommentRule()); 
            }
            pushFollow(FOLLOW_ruleFieldComment_in_entryRuleFieldComment666);
            ruleFieldComment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldCommentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldComment673); if (state.failed) return ;

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:350:1: ruleFieldComment : ( RULE_COMMENT ) ;
    public final void ruleFieldComment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:354:2: ( ( RULE_COMMENT ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:355:1: ( RULE_COMMENT )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:355:1: ( RULE_COMMENT )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:356:1: RULE_COMMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldCommentAccess().getCOMMENTTerminalRuleCall()); 
            }
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleFieldComment699); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:369:1: entryRuleOtherComent : ruleOtherComent EOF ;
    public final void entryRuleOtherComent() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:370:1: ( ruleOtherComent EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:371:1: ruleOtherComent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherComentRule()); 
            }
            pushFollow(FOLLOW_ruleOtherComent_in_entryRuleOtherComent725);
            ruleOtherComent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherComentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherComent732); if (state.failed) return ;

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:378:1: ruleOtherComent : ( ( rule__OtherComent__CommAssignment ) ) ;
    public final void ruleOtherComent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:382:2: ( ( ( rule__OtherComent__CommAssignment ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:383:1: ( ( rule__OtherComent__CommAssignment ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:383:1: ( ( rule__OtherComent__CommAssignment ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:384:1: ( rule__OtherComent__CommAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherComentAccess().getCommAssignment()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:385:1: ( rule__OtherComent__CommAssignment )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:385:2: rule__OtherComent__CommAssignment
            {
            pushFollow(FOLLOW_rule__OtherComent__CommAssignment_in_ruleOtherComent758);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:397:1: entryRulePackName : rulePackName EOF ;
    public final void entryRulePackName() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:398:1: ( rulePackName EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:399:1: rulePackName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackNameRule()); 
            }
            pushFollow(FOLLOW_rulePackName_in_entryRulePackName785);
            rulePackName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackName792); if (state.failed) return ;

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:406:1: rulePackName : ( ( rule__PackName__Group__0 ) ) ;
    public final void rulePackName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:410:2: ( ( ( rule__PackName__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:411:1: ( ( rule__PackName__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:411:1: ( ( rule__PackName__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:412:1: ( rule__PackName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackNameAccess().getGroup()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:413:1: ( rule__PackName__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:413:2: rule__PackName__Group__0
            {
            pushFollow(FOLLOW_rule__PackName__Group__0_in_rulePackName818);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:425:1: entryRuleTypeName : ruleTypeName EOF ;
    public final void entryRuleTypeName() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:426:1: ( ruleTypeName EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:427:1: ruleTypeName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeNameRule()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_entryRuleTypeName845);
            ruleTypeName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeName852); if (state.failed) return ;

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:434:1: ruleTypeName : ( ( rule__TypeName__Alternatives ) ) ;
    public final void ruleTypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:438:2: ( ( ( rule__TypeName__Alternatives ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:439:1: ( ( rule__TypeName__Alternatives ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:439:1: ( ( rule__TypeName__Alternatives ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:440:1: ( rule__TypeName__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeNameAccess().getAlternatives()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:441:1: ( rule__TypeName__Alternatives )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:441:2: rule__TypeName__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeName__Alternatives_in_ruleTypeName878);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:453:1: rule__XML2__Alternatives_0 : ( ( ( rule__XML2__Group_0_0__0 ) ) | ( ( rule__XML2__Group_0_1__0 ) ) | ( ( rule__XML2__PackAssignment_0_2 ) ) | ( ( rule__XML2__InputAssignment_0_3 ) ) );
    public final void rule__XML2__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:457:1: ( ( ( rule__XML2__Group_0_0__0 ) ) | ( ( rule__XML2__Group_0_1__0 ) ) | ( ( rule__XML2__PackAssignment_0_2 ) ) | ( ( rule__XML2__InputAssignment_0_3 ) ) )
            int alt1=4;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:458:1: ( ( rule__XML2__Group_0_0__0 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:458:1: ( ( rule__XML2__Group_0_0__0 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:459:1: ( rule__XML2__Group_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXML2Access().getGroup_0_0()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:460:1: ( rule__XML2__Group_0_0__0 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:460:2: rule__XML2__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__XML2__Group_0_0__0_in_rule__XML2__Alternatives_0914);
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
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:464:6: ( ( rule__XML2__Group_0_1__0 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:464:6: ( ( rule__XML2__Group_0_1__0 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:465:1: ( rule__XML2__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXML2Access().getGroup_0_1()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:466:1: ( rule__XML2__Group_0_1__0 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:466:2: rule__XML2__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__XML2__Group_0_1__0_in_rule__XML2__Alternatives_0932);
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
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:470:6: ( ( rule__XML2__PackAssignment_0_2 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:470:6: ( ( rule__XML2__PackAssignment_0_2 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:471:1: ( rule__XML2__PackAssignment_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXML2Access().getPackAssignment_0_2()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:472:1: ( rule__XML2__PackAssignment_0_2 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:472:2: rule__XML2__PackAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__XML2__PackAssignment_0_2_in_rule__XML2__Alternatives_0950);
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
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:476:6: ( ( rule__XML2__InputAssignment_0_3 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:476:6: ( ( rule__XML2__InputAssignment_0_3 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:477:1: ( rule__XML2__InputAssignment_0_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXML2Access().getInputAssignment_0_3()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:478:1: ( rule__XML2__InputAssignment_0_3 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:478:2: rule__XML2__InputAssignment_0_3
                    {
                    pushFollow(FOLLOW_rule__XML2__InputAssignment_0_3_in_rule__XML2__Alternatives_0968);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:487:1: rule__XML2__Alternatives_1 : ( ( ( rule__XML2__TypesAssignment_1_0 ) ) | ( ( rule__XML2__CommAssignment_1_1 ) ) );
    public final void rule__XML2__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:491:1: ( ( ( rule__XML2__TypesAssignment_1_0 ) ) | ( ( rule__XML2__CommAssignment_1_1 ) ) )
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
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:492:1: ( ( rule__XML2__TypesAssignment_1_0 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:492:1: ( ( rule__XML2__TypesAssignment_1_0 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:493:1: ( rule__XML2__TypesAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXML2Access().getTypesAssignment_1_0()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:494:1: ( rule__XML2__TypesAssignment_1_0 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:494:2: rule__XML2__TypesAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__XML2__TypesAssignment_1_0_in_rule__XML2__Alternatives_11001);
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
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:498:6: ( ( rule__XML2__CommAssignment_1_1 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:498:6: ( ( rule__XML2__CommAssignment_1_1 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:499:1: ( rule__XML2__CommAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXML2Access().getCommAssignment_1_1()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:500:1: ( rule__XML2__CommAssignment_1_1 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:500:2: rule__XML2__CommAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__XML2__CommAssignment_1_1_in_rule__XML2__Alternatives_11019);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:509:1: rule__Type__Alternatives_5 : ( ( ( rule__Type__FieldsAssignment_5_0 ) ) | ( ( rule__Type__CommAssignment_5_1 ) ) );
    public final void rule__Type__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:513:1: ( ( ( rule__Type__FieldsAssignment_5_0 ) ) | ( ( rule__Type__CommAssignment_5_1 ) ) )
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
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:514:1: ( ( rule__Type__FieldsAssignment_5_0 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:514:1: ( ( rule__Type__FieldsAssignment_5_0 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:515:1: ( rule__Type__FieldsAssignment_5_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getFieldsAssignment_5_0()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:516:1: ( rule__Type__FieldsAssignment_5_0 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:516:2: rule__Type__FieldsAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__Type__FieldsAssignment_5_0_in_rule__Type__Alternatives_51052);
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
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:520:6: ( ( rule__Type__CommAssignment_5_1 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:520:6: ( ( rule__Type__CommAssignment_5_1 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:521:1: ( rule__Type__CommAssignment_5_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getCommAssignment_5_1()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:522:1: ( rule__Type__CommAssignment_5_1 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:522:2: rule__Type__CommAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__Type__CommAssignment_5_1_in_rule__Type__Alternatives_51070);
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


    // $ANTLR start "rule__TypeName__Alternatives"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:531:1: rule__TypeName__Alternatives : ( ( RULE_C_INPUT ) | ( RULE_C_MAIN ) | ( RULE_C_TYPE ) | ( RULE_C_INT ) | ( RULE_C_UINT ) | ( RULE_C_BOOL ) | ( RULE_C_NUMBER ) | ( RULE_C_STRING ) | ( RULE_C_LIST ) | ( RULE_NAME ) );
    public final void rule__TypeName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:535:1: ( ( RULE_C_INPUT ) | ( RULE_C_MAIN ) | ( RULE_C_TYPE ) | ( RULE_C_INT ) | ( RULE_C_UINT ) | ( RULE_C_BOOL ) | ( RULE_C_NUMBER ) | ( RULE_C_STRING ) | ( RULE_C_LIST ) | ( RULE_NAME ) )
            int alt4=10;
            switch ( input.LA(1) ) {
            case RULE_C_INPUT:
                {
                alt4=1;
                }
                break;
            case RULE_C_MAIN:
                {
                alt4=2;
                }
                break;
            case RULE_C_TYPE:
                {
                alt4=3;
                }
                break;
            case RULE_C_INT:
                {
                alt4=4;
                }
                break;
            case RULE_C_UINT:
                {
                alt4=5;
                }
                break;
            case RULE_C_BOOL:
                {
                alt4=6;
                }
                break;
            case RULE_C_NUMBER:
                {
                alt4=7;
                }
                break;
            case RULE_C_STRING:
                {
                alt4=8;
                }
                break;
            case RULE_C_LIST:
                {
                alt4=9;
                }
                break;
            case RULE_NAME:
                {
                alt4=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:536:1: ( RULE_C_INPUT )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:536:1: ( RULE_C_INPUT )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:537:1: RULE_C_INPUT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_INPUTTerminalRuleCall_0()); 
                    }
                    match(input,RULE_C_INPUT,FOLLOW_RULE_C_INPUT_in_rule__TypeName__Alternatives1103); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_INPUTTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:542:6: ( RULE_C_MAIN )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:542:6: ( RULE_C_MAIN )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:543:1: RULE_C_MAIN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_MAINTerminalRuleCall_1()); 
                    }
                    match(input,RULE_C_MAIN,FOLLOW_RULE_C_MAIN_in_rule__TypeName__Alternatives1120); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_MAINTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:548:6: ( RULE_C_TYPE )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:548:6: ( RULE_C_TYPE )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:549:1: RULE_C_TYPE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_TYPETerminalRuleCall_2()); 
                    }
                    match(input,RULE_C_TYPE,FOLLOW_RULE_C_TYPE_in_rule__TypeName__Alternatives1137); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_TYPETerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:554:6: ( RULE_C_INT )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:554:6: ( RULE_C_INT )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:555:1: RULE_C_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_INTTerminalRuleCall_3()); 
                    }
                    match(input,RULE_C_INT,FOLLOW_RULE_C_INT_in_rule__TypeName__Alternatives1154); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_INTTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:560:6: ( RULE_C_UINT )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:560:6: ( RULE_C_UINT )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:561:1: RULE_C_UINT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_UINTTerminalRuleCall_4()); 
                    }
                    match(input,RULE_C_UINT,FOLLOW_RULE_C_UINT_in_rule__TypeName__Alternatives1171); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_UINTTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:566:6: ( RULE_C_BOOL )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:566:6: ( RULE_C_BOOL )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:567:1: RULE_C_BOOL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_BOOLTerminalRuleCall_5()); 
                    }
                    match(input,RULE_C_BOOL,FOLLOW_RULE_C_BOOL_in_rule__TypeName__Alternatives1188); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_BOOLTerminalRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:572:6: ( RULE_C_NUMBER )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:572:6: ( RULE_C_NUMBER )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:573:1: RULE_C_NUMBER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_NUMBERTerminalRuleCall_6()); 
                    }
                    match(input,RULE_C_NUMBER,FOLLOW_RULE_C_NUMBER_in_rule__TypeName__Alternatives1205); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_NUMBERTerminalRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:578:6: ( RULE_C_STRING )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:578:6: ( RULE_C_STRING )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:579:1: RULE_C_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_STRINGTerminalRuleCall_7()); 
                    }
                    match(input,RULE_C_STRING,FOLLOW_RULE_C_STRING_in_rule__TypeName__Alternatives1222); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_STRINGTerminalRuleCall_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:584:6: ( RULE_C_LIST )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:584:6: ( RULE_C_LIST )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:585:1: RULE_C_LIST
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_LISTTerminalRuleCall_8()); 
                    }
                    match(input,RULE_C_LIST,FOLLOW_RULE_C_LIST_in_rule__TypeName__Alternatives1239); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_LISTTerminalRuleCall_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:590:6: ( RULE_NAME )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:590:6: ( RULE_NAME )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:591:1: RULE_NAME
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getNAMETerminalRuleCall_9()); 
                    }
                    match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rule__TypeName__Alternatives1256); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getNAMETerminalRuleCall_9()); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:603:1: rule__XML2__Group__0 : rule__XML2__Group__0__Impl rule__XML2__Group__1 ;
    public final void rule__XML2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:607:1: ( rule__XML2__Group__0__Impl rule__XML2__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:608:2: rule__XML2__Group__0__Impl rule__XML2__Group__1
            {
            pushFollow(FOLLOW_rule__XML2__Group__0__Impl_in_rule__XML2__Group__01286);
            rule__XML2__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__XML2__Group__1_in_rule__XML2__Group__01289);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:615:1: rule__XML2__Group__0__Impl : ( ( rule__XML2__Alternatives_0 ) ) ;
    public final void rule__XML2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:619:1: ( ( ( rule__XML2__Alternatives_0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:620:1: ( ( rule__XML2__Alternatives_0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:620:1: ( ( rule__XML2__Alternatives_0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:621:1: ( rule__XML2__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getAlternatives_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:622:1: ( rule__XML2__Alternatives_0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:622:2: rule__XML2__Alternatives_0
            {
            pushFollow(FOLLOW_rule__XML2__Alternatives_0_in_rule__XML2__Group__0__Impl1316);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:632:1: rule__XML2__Group__1 : rule__XML2__Group__1__Impl ;
    public final void rule__XML2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:636:1: ( rule__XML2__Group__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:637:2: rule__XML2__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__XML2__Group__1__Impl_in_rule__XML2__Group__11346);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:643:1: rule__XML2__Group__1__Impl : ( ( rule__XML2__Alternatives_1 )* ) ;
    public final void rule__XML2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:647:1: ( ( ( rule__XML2__Alternatives_1 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:648:1: ( ( rule__XML2__Alternatives_1 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:648:1: ( ( rule__XML2__Alternatives_1 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:649:1: ( rule__XML2__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getAlternatives_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:650:1: ( rule__XML2__Alternatives_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMMENT||LA5_0==RULE_C_TYPE||LA5_0==RULE_C_BRACKET_L) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:650:2: rule__XML2__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__XML2__Alternatives_1_in_rule__XML2__Group__1__Impl1373);
            	    rule__XML2__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:664:1: rule__XML2__Group_0_0__0 : rule__XML2__Group_0_0__0__Impl rule__XML2__Group_0_0__1 ;
    public final void rule__XML2__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:668:1: ( rule__XML2__Group_0_0__0__Impl rule__XML2__Group_0_0__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:669:2: rule__XML2__Group_0_0__0__Impl rule__XML2__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__XML2__Group_0_0__0__Impl_in_rule__XML2__Group_0_0__01408);
            rule__XML2__Group_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__XML2__Group_0_0__1_in_rule__XML2__Group_0_0__01411);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:676:1: rule__XML2__Group_0_0__0__Impl : ( ( rule__XML2__InputAssignment_0_0_0 ) ) ;
    public final void rule__XML2__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:680:1: ( ( ( rule__XML2__InputAssignment_0_0_0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:681:1: ( ( rule__XML2__InputAssignment_0_0_0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:681:1: ( ( rule__XML2__InputAssignment_0_0_0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:682:1: ( rule__XML2__InputAssignment_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getInputAssignment_0_0_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:683:1: ( rule__XML2__InputAssignment_0_0_0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:683:2: rule__XML2__InputAssignment_0_0_0
            {
            pushFollow(FOLLOW_rule__XML2__InputAssignment_0_0_0_in_rule__XML2__Group_0_0__0__Impl1438);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:693:1: rule__XML2__Group_0_0__1 : rule__XML2__Group_0_0__1__Impl ;
    public final void rule__XML2__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:697:1: ( rule__XML2__Group_0_0__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:698:2: rule__XML2__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__XML2__Group_0_0__1__Impl_in_rule__XML2__Group_0_0__11468);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:704:1: rule__XML2__Group_0_0__1__Impl : ( ( rule__XML2__PackAssignment_0_0_1 ) ) ;
    public final void rule__XML2__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:708:1: ( ( ( rule__XML2__PackAssignment_0_0_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:709:1: ( ( rule__XML2__PackAssignment_0_0_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:709:1: ( ( rule__XML2__PackAssignment_0_0_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:710:1: ( rule__XML2__PackAssignment_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getPackAssignment_0_0_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:711:1: ( rule__XML2__PackAssignment_0_0_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:711:2: rule__XML2__PackAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__XML2__PackAssignment_0_0_1_in_rule__XML2__Group_0_0__1__Impl1495);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:725:1: rule__XML2__Group_0_1__0 : rule__XML2__Group_0_1__0__Impl rule__XML2__Group_0_1__1 ;
    public final void rule__XML2__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:729:1: ( rule__XML2__Group_0_1__0__Impl rule__XML2__Group_0_1__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:730:2: rule__XML2__Group_0_1__0__Impl rule__XML2__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__XML2__Group_0_1__0__Impl_in_rule__XML2__Group_0_1__01529);
            rule__XML2__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__XML2__Group_0_1__1_in_rule__XML2__Group_0_1__01532);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:737:1: rule__XML2__Group_0_1__0__Impl : ( ( rule__XML2__PackAssignment_0_1_0 ) ) ;
    public final void rule__XML2__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:741:1: ( ( ( rule__XML2__PackAssignment_0_1_0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:742:1: ( ( rule__XML2__PackAssignment_0_1_0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:742:1: ( ( rule__XML2__PackAssignment_0_1_0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:743:1: ( rule__XML2__PackAssignment_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getPackAssignment_0_1_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:744:1: ( rule__XML2__PackAssignment_0_1_0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:744:2: rule__XML2__PackAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__XML2__PackAssignment_0_1_0_in_rule__XML2__Group_0_1__0__Impl1559);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:754:1: rule__XML2__Group_0_1__1 : rule__XML2__Group_0_1__1__Impl ;
    public final void rule__XML2__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:758:1: ( rule__XML2__Group_0_1__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:759:2: rule__XML2__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__XML2__Group_0_1__1__Impl_in_rule__XML2__Group_0_1__11589);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:765:1: rule__XML2__Group_0_1__1__Impl : ( ( rule__XML2__InputAssignment_0_1_1 ) ) ;
    public final void rule__XML2__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:769:1: ( ( ( rule__XML2__InputAssignment_0_1_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:770:1: ( ( rule__XML2__InputAssignment_0_1_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:770:1: ( ( rule__XML2__InputAssignment_0_1_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:771:1: ( rule__XML2__InputAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getInputAssignment_0_1_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:772:1: ( rule__XML2__InputAssignment_0_1_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:772:2: rule__XML2__InputAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__XML2__InputAssignment_0_1_1_in_rule__XML2__Group_0_1__1__Impl1616);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:786:1: rule__InputDef__Group__0 : rule__InputDef__Group__0__Impl rule__InputDef__Group__1 ;
    public final void rule__InputDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:790:1: ( rule__InputDef__Group__0__Impl rule__InputDef__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:791:2: rule__InputDef__Group__0__Impl rule__InputDef__Group__1
            {
            pushFollow(FOLLOW_rule__InputDef__Group__0__Impl_in_rule__InputDef__Group__01650);
            rule__InputDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__InputDef__Group__1_in_rule__InputDef__Group__01653);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:798:1: rule__InputDef__Group__0__Impl : ( ( rule__InputDef__CommentAssignment_0 )* ) ;
    public final void rule__InputDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:802:1: ( ( ( rule__InputDef__CommentAssignment_0 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:803:1: ( ( rule__InputDef__CommentAssignment_0 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:803:1: ( ( rule__InputDef__CommentAssignment_0 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:804:1: ( rule__InputDef__CommentAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputDefAccess().getCommentAssignment_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:805:1: ( rule__InputDef__CommentAssignment_0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMENT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:805:2: rule__InputDef__CommentAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__InputDef__CommentAssignment_0_in_rule__InputDef__Group__0__Impl1680);
            	    rule__InputDef__CommentAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:815:1: rule__InputDef__Group__1 : rule__InputDef__Group__1__Impl rule__InputDef__Group__2 ;
    public final void rule__InputDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:819:1: ( rule__InputDef__Group__1__Impl rule__InputDef__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:820:2: rule__InputDef__Group__1__Impl rule__InputDef__Group__2
            {
            pushFollow(FOLLOW_rule__InputDef__Group__1__Impl_in_rule__InputDef__Group__11711);
            rule__InputDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__InputDef__Group__2_in_rule__InputDef__Group__11714);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:827:1: rule__InputDef__Group__1__Impl : ( ( rule__InputDef__InputCHARAssignment_1 ) ) ;
    public final void rule__InputDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:831:1: ( ( ( rule__InputDef__InputCHARAssignment_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:832:1: ( ( rule__InputDef__InputCHARAssignment_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:832:1: ( ( rule__InputDef__InputCHARAssignment_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:833:1: ( rule__InputDef__InputCHARAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputDefAccess().getInputCHARAssignment_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:834:1: ( rule__InputDef__InputCHARAssignment_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:834:2: rule__InputDef__InputCHARAssignment_1
            {
            pushFollow(FOLLOW_rule__InputDef__InputCHARAssignment_1_in_rule__InputDef__Group__1__Impl1741);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:844:1: rule__InputDef__Group__2 : rule__InputDef__Group__2__Impl rule__InputDef__Group__3 ;
    public final void rule__InputDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:848:1: ( rule__InputDef__Group__2__Impl rule__InputDef__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:849:2: rule__InputDef__Group__2__Impl rule__InputDef__Group__3
            {
            pushFollow(FOLLOW_rule__InputDef__Group__2__Impl_in_rule__InputDef__Group__21771);
            rule__InputDef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__InputDef__Group__3_in_rule__InputDef__Group__21774);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:856:1: rule__InputDef__Group__2__Impl : ( ( rule__InputDef__UrlAssignment_2 ) ) ;
    public final void rule__InputDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:860:1: ( ( ( rule__InputDef__UrlAssignment_2 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:861:1: ( ( rule__InputDef__UrlAssignment_2 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:861:1: ( ( rule__InputDef__UrlAssignment_2 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:862:1: ( rule__InputDef__UrlAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputDefAccess().getUrlAssignment_2()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:863:1: ( rule__InputDef__UrlAssignment_2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:863:2: rule__InputDef__UrlAssignment_2
            {
            pushFollow(FOLLOW_rule__InputDef__UrlAssignment_2_in_rule__InputDef__Group__2__Impl1801);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:873:1: rule__InputDef__Group__3 : rule__InputDef__Group__3__Impl ;
    public final void rule__InputDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:877:1: ( rule__InputDef__Group__3__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:878:2: rule__InputDef__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__InputDef__Group__3__Impl_in_rule__InputDef__Group__31831);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:884:1: rule__InputDef__Group__3__Impl : ( ( RULE_C_SEMICOLON )? ) ;
    public final void rule__InputDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:888:1: ( ( ( RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:889:1: ( ( RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:889:1: ( ( RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:890:1: ( RULE_C_SEMICOLON )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputDefAccess().getC_SEMICOLONTerminalRuleCall_3()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:891:1: ( RULE_C_SEMICOLON )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_C_SEMICOLON) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:891:3: RULE_C_SEMICOLON
                    {
                    match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_rule__InputDef__Group__3__Impl1859); if (state.failed) return ;

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:909:1: rule__PackDef__Group__0 : rule__PackDef__Group__0__Impl rule__PackDef__Group__1 ;
    public final void rule__PackDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:913:1: ( rule__PackDef__Group__0__Impl rule__PackDef__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:914:2: rule__PackDef__Group__0__Impl rule__PackDef__Group__1
            {
            pushFollow(FOLLOW_rule__PackDef__Group__0__Impl_in_rule__PackDef__Group__01898);
            rule__PackDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackDef__Group__1_in_rule__PackDef__Group__01901);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:921:1: rule__PackDef__Group__0__Impl : ( ( rule__PackDef__CommentAssignment_0 )* ) ;
    public final void rule__PackDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:925:1: ( ( ( rule__PackDef__CommentAssignment_0 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:926:1: ( ( rule__PackDef__CommentAssignment_0 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:926:1: ( ( rule__PackDef__CommentAssignment_0 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:927:1: ( rule__PackDef__CommentAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackDefAccess().getCommentAssignment_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:928:1: ( rule__PackDef__CommentAssignment_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMENT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:928:2: rule__PackDef__CommentAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__PackDef__CommentAssignment_0_in_rule__PackDef__Group__0__Impl1928);
            	    rule__PackDef__CommentAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:938:1: rule__PackDef__Group__1 : rule__PackDef__Group__1__Impl rule__PackDef__Group__2 ;
    public final void rule__PackDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:942:1: ( rule__PackDef__Group__1__Impl rule__PackDef__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:943:2: rule__PackDef__Group__1__Impl rule__PackDef__Group__2
            {
            pushFollow(FOLLOW_rule__PackDef__Group__1__Impl_in_rule__PackDef__Group__11959);
            rule__PackDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackDef__Group__2_in_rule__PackDef__Group__11962);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:950:1: rule__PackDef__Group__1__Impl : ( ( rule__PackDef__PackCHARAssignment_1 ) ) ;
    public final void rule__PackDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:954:1: ( ( ( rule__PackDef__PackCHARAssignment_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:955:1: ( ( rule__PackDef__PackCHARAssignment_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:955:1: ( ( rule__PackDef__PackCHARAssignment_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:956:1: ( rule__PackDef__PackCHARAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackDefAccess().getPackCHARAssignment_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:957:1: ( rule__PackDef__PackCHARAssignment_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:957:2: rule__PackDef__PackCHARAssignment_1
            {
            pushFollow(FOLLOW_rule__PackDef__PackCHARAssignment_1_in_rule__PackDef__Group__1__Impl1989);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:967:1: rule__PackDef__Group__2 : rule__PackDef__Group__2__Impl rule__PackDef__Group__3 ;
    public final void rule__PackDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:971:1: ( rule__PackDef__Group__2__Impl rule__PackDef__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:972:2: rule__PackDef__Group__2__Impl rule__PackDef__Group__3
            {
            pushFollow(FOLLOW_rule__PackDef__Group__2__Impl_in_rule__PackDef__Group__22019);
            rule__PackDef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackDef__Group__3_in_rule__PackDef__Group__22022);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:979:1: rule__PackDef__Group__2__Impl : ( ( rule__PackDef__PackAssignment_2 )? ) ;
    public final void rule__PackDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:983:1: ( ( ( rule__PackDef__PackAssignment_2 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:984:1: ( ( rule__PackDef__PackAssignment_2 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:984:1: ( ( rule__PackDef__PackAssignment_2 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:985:1: ( rule__PackDef__PackAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackDefAccess().getPackAssignment_2()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:986:1: ( rule__PackDef__PackAssignment_2 )?
            int alt9=2;
            switch ( input.LA(1) ) {
                case RULE_C_INPUT:
                    {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==EOF||(LA9_1>=RULE_COMMENT && LA9_1<=RULE_C_INPUT)||LA9_1==RULE_C_TYPE||LA9_1==RULE_C_SEMICOLON||LA9_1==RULE_C_BRACKET_L||LA9_1==30) ) {
                        alt9=1;
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
                case RULE_NAME:
                    {
                    alt9=1;
                    }
                    break;
                case RULE_C_TYPE:
                    {
                    switch ( input.LA(2) ) {
                        case EOF:
                        case RULE_COMMENT:
                        case RULE_C_SEMICOLON:
                        case RULE_C_BRACKET_L:
                        case 30:
                            {
                            alt9=1;
                            }
                            break;
                        case RULE_C_TYPE:
                            {
                            int LA9_5 = input.LA(3);

                            if ( ((LA9_5>=RULE_C_INPUT && LA9_5<=RULE_NAME)) ) {
                                alt9=1;
                            }
                            }
                            break;
                        case RULE_C_INPUT:
                            {
                            int LA9_6 = input.LA(3);

                            if ( (LA9_6==RULE_STRING) ) {
                                alt9=1;
                            }
                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt9) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:986:2: rule__PackDef__PackAssignment_2
                    {
                    pushFollow(FOLLOW_rule__PackDef__PackAssignment_2_in_rule__PackDef__Group__2__Impl2049);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:996:1: rule__PackDef__Group__3 : rule__PackDef__Group__3__Impl ;
    public final void rule__PackDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1000:1: ( rule__PackDef__Group__3__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1001:2: rule__PackDef__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PackDef__Group__3__Impl_in_rule__PackDef__Group__32080);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1007:1: rule__PackDef__Group__3__Impl : ( ( RULE_C_SEMICOLON )? ) ;
    public final void rule__PackDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1011:1: ( ( ( RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1012:1: ( ( RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1012:1: ( ( RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1013:1: ( RULE_C_SEMICOLON )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackDefAccess().getC_SEMICOLONTerminalRuleCall_3()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1014:1: ( RULE_C_SEMICOLON )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_C_SEMICOLON) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1014:3: RULE_C_SEMICOLON
                    {
                    match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_rule__PackDef__Group__3__Impl2108); if (state.failed) return ;

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1032:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1036:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1037:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__02147);
            rule__Type__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__02150);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1044:1: rule__Type__Group__0__Impl : ( ( rule__Type__CommentAssignment_0 )? ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1048:1: ( ( ( rule__Type__CommentAssignment_0 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1049:1: ( ( rule__Type__CommentAssignment_0 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1049:1: ( ( rule__Type__CommentAssignment_0 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1050:1: ( rule__Type__CommentAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getCommentAssignment_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1051:1: ( rule__Type__CommentAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_COMMENT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1051:2: rule__Type__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type__CommentAssignment_0_in_rule__Type__Group__0__Impl2177);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1061:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1065:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1066:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__12208);
            rule__Type__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__2_in_rule__Type__Group__12211);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1073:1: rule__Type__Group__1__Impl : ( ( rule__Type__EnterAssignment_1 )? ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1077:1: ( ( ( rule__Type__EnterAssignment_1 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1078:1: ( ( rule__Type__EnterAssignment_1 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1078:1: ( ( rule__Type__EnterAssignment_1 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1079:1: ( rule__Type__EnterAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getEnterAssignment_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1080:1: ( rule__Type__EnterAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_C_BRACKET_L) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1080:2: rule__Type__EnterAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Type__EnterAssignment_1_in_rule__Type__Group__1__Impl2238);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1090:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1094:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1095:2: rule__Type__Group__2__Impl rule__Type__Group__3
            {
            pushFollow(FOLLOW_rule__Type__Group__2__Impl_in_rule__Type__Group__22269);
            rule__Type__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__3_in_rule__Type__Group__22272);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1102:1: rule__Type__Group__2__Impl : ( ( rule__Type__PrefixAssignment_2 ) ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1106:1: ( ( ( rule__Type__PrefixAssignment_2 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1107:1: ( ( rule__Type__PrefixAssignment_2 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1107:1: ( ( rule__Type__PrefixAssignment_2 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1108:1: ( rule__Type__PrefixAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getPrefixAssignment_2()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1109:1: ( rule__Type__PrefixAssignment_2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1109:2: rule__Type__PrefixAssignment_2
            {
            pushFollow(FOLLOW_rule__Type__PrefixAssignment_2_in_rule__Type__Group__2__Impl2299);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1119:1: rule__Type__Group__3 : rule__Type__Group__3__Impl rule__Type__Group__4 ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1123:1: ( rule__Type__Group__3__Impl rule__Type__Group__4 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1124:2: rule__Type__Group__3__Impl rule__Type__Group__4
            {
            pushFollow(FOLLOW_rule__Type__Group__3__Impl_in_rule__Type__Group__32329);
            rule__Type__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__4_in_rule__Type__Group__32332);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1131:1: rule__Type__Group__3__Impl : ( ( rule__Type__NameAssignment_3 ) ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1135:1: ( ( ( rule__Type__NameAssignment_3 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1136:1: ( ( rule__Type__NameAssignment_3 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1136:1: ( ( rule__Type__NameAssignment_3 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1137:1: ( rule__Type__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getNameAssignment_3()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1138:1: ( rule__Type__NameAssignment_3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1138:2: rule__Type__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Type__NameAssignment_3_in_rule__Type__Group__3__Impl2359);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1148:1: rule__Type__Group__4 : rule__Type__Group__4__Impl rule__Type__Group__5 ;
    public final void rule__Type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1152:1: ( rule__Type__Group__4__Impl rule__Type__Group__5 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1153:2: rule__Type__Group__4__Impl rule__Type__Group__5
            {
            pushFollow(FOLLOW_rule__Type__Group__4__Impl_in_rule__Type__Group__42389);
            rule__Type__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__5_in_rule__Type__Group__42392);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1160:1: rule__Type__Group__4__Impl : ( RULE_C_BRACE_L ) ;
    public final void rule__Type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1164:1: ( ( RULE_C_BRACE_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1165:1: ( RULE_C_BRACE_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1165:1: ( RULE_C_BRACE_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1166:1: RULE_C_BRACE_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getC_BRACE_LTerminalRuleCall_4()); 
            }
            match(input,RULE_C_BRACE_L,FOLLOW_RULE_C_BRACE_L_in_rule__Type__Group__4__Impl2419); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1177:1: rule__Type__Group__5 : rule__Type__Group__5__Impl rule__Type__Group__6 ;
    public final void rule__Type__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1181:1: ( rule__Type__Group__5__Impl rule__Type__Group__6 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1182:2: rule__Type__Group__5__Impl rule__Type__Group__6
            {
            pushFollow(FOLLOW_rule__Type__Group__5__Impl_in_rule__Type__Group__52448);
            rule__Type__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__6_in_rule__Type__Group__52451);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1189:1: rule__Type__Group__5__Impl : ( ( rule__Type__Alternatives_5 )* ) ;
    public final void rule__Type__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1193:1: ( ( ( rule__Type__Alternatives_5 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1194:1: ( ( rule__Type__Alternatives_5 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1194:1: ( ( rule__Type__Alternatives_5 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1195:1: ( rule__Type__Alternatives_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives_5()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1196:1: ( rule__Type__Alternatives_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_COMMENT && LA13_0<=RULE_NAME)||LA13_0==RULE_C_BRACKET_L) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1196:2: rule__Type__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_rule__Type__Alternatives_5_in_rule__Type__Group__5__Impl2478);
            	    rule__Type__Alternatives_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1206:1: rule__Type__Group__6 : rule__Type__Group__6__Impl ;
    public final void rule__Type__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1210:1: ( rule__Type__Group__6__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1211:2: rule__Type__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__6__Impl_in_rule__Type__Group__62509);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1217:1: rule__Type__Group__6__Impl : ( RULE_C_BRACE_R ) ;
    public final void rule__Type__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1221:1: ( ( RULE_C_BRACE_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1222:1: ( RULE_C_BRACE_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1222:1: ( RULE_C_BRACE_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1223:1: RULE_C_BRACE_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getC_BRACE_RTerminalRuleCall_6()); 
            }
            match(input,RULE_C_BRACE_R,FOLLOW_RULE_C_BRACE_R_in_rule__Type__Group__6__Impl2536); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1248:1: rule__Enter__Group__0 : rule__Enter__Group__0__Impl rule__Enter__Group__1 ;
    public final void rule__Enter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1252:1: ( rule__Enter__Group__0__Impl rule__Enter__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1253:2: rule__Enter__Group__0__Impl rule__Enter__Group__1
            {
            pushFollow(FOLLOW_rule__Enter__Group__0__Impl_in_rule__Enter__Group__02579);
            rule__Enter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enter__Group__1_in_rule__Enter__Group__02582);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1260:1: rule__Enter__Group__0__Impl : ( RULE_C_BRACKET_L ) ;
    public final void rule__Enter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1264:1: ( ( RULE_C_BRACKET_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1265:1: ( RULE_C_BRACKET_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1265:1: ( RULE_C_BRACKET_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1266:1: RULE_C_BRACKET_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getC_BRACKET_LTerminalRuleCall_0()); 
            }
            match(input,RULE_C_BRACKET_L,FOLLOW_RULE_C_BRACKET_L_in_rule__Enter__Group__0__Impl2609); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1277:1: rule__Enter__Group__1 : rule__Enter__Group__1__Impl rule__Enter__Group__2 ;
    public final void rule__Enter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1281:1: ( rule__Enter__Group__1__Impl rule__Enter__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1282:2: rule__Enter__Group__1__Impl rule__Enter__Group__2
            {
            pushFollow(FOLLOW_rule__Enter__Group__1__Impl_in_rule__Enter__Group__12638);
            rule__Enter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enter__Group__2_in_rule__Enter__Group__12641);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1289:1: rule__Enter__Group__1__Impl : ( ( rule__Enter__PrefixAssignment_1 ) ) ;
    public final void rule__Enter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1293:1: ( ( ( rule__Enter__PrefixAssignment_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1294:1: ( ( rule__Enter__PrefixAssignment_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1294:1: ( ( rule__Enter__PrefixAssignment_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1295:1: ( rule__Enter__PrefixAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getPrefixAssignment_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1296:1: ( rule__Enter__PrefixAssignment_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1296:2: rule__Enter__PrefixAssignment_1
            {
            pushFollow(FOLLOW_rule__Enter__PrefixAssignment_1_in_rule__Enter__Group__1__Impl2668);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1306:1: rule__Enter__Group__2 : rule__Enter__Group__2__Impl rule__Enter__Group__3 ;
    public final void rule__Enter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1310:1: ( rule__Enter__Group__2__Impl rule__Enter__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1311:2: rule__Enter__Group__2__Impl rule__Enter__Group__3
            {
            pushFollow(FOLLOW_rule__Enter__Group__2__Impl_in_rule__Enter__Group__22698);
            rule__Enter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enter__Group__3_in_rule__Enter__Group__22701);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1318:1: rule__Enter__Group__2__Impl : ( RULE_C_PAREN_L ) ;
    public final void rule__Enter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1322:1: ( ( RULE_C_PAREN_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1323:1: ( RULE_C_PAREN_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1323:1: ( RULE_C_PAREN_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1324:1: RULE_C_PAREN_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getC_PAREN_LTerminalRuleCall_2()); 
            }
            match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_rule__Enter__Group__2__Impl2728); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1335:1: rule__Enter__Group__3 : rule__Enter__Group__3__Impl rule__Enter__Group__4 ;
    public final void rule__Enter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1339:1: ( rule__Enter__Group__3__Impl rule__Enter__Group__4 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1340:2: rule__Enter__Group__3__Impl rule__Enter__Group__4
            {
            pushFollow(FOLLOW_rule__Enter__Group__3__Impl_in_rule__Enter__Group__32757);
            rule__Enter__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enter__Group__4_in_rule__Enter__Group__32760);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1347:1: rule__Enter__Group__3__Impl : ( ( rule__Enter__RootPathAssignment_3 ) ) ;
    public final void rule__Enter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1351:1: ( ( ( rule__Enter__RootPathAssignment_3 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1352:1: ( ( rule__Enter__RootPathAssignment_3 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1352:1: ( ( rule__Enter__RootPathAssignment_3 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1353:1: ( rule__Enter__RootPathAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getRootPathAssignment_3()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1354:1: ( rule__Enter__RootPathAssignment_3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1354:2: rule__Enter__RootPathAssignment_3
            {
            pushFollow(FOLLOW_rule__Enter__RootPathAssignment_3_in_rule__Enter__Group__3__Impl2787);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1364:1: rule__Enter__Group__4 : rule__Enter__Group__4__Impl rule__Enter__Group__5 ;
    public final void rule__Enter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1368:1: ( rule__Enter__Group__4__Impl rule__Enter__Group__5 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1369:2: rule__Enter__Group__4__Impl rule__Enter__Group__5
            {
            pushFollow(FOLLOW_rule__Enter__Group__4__Impl_in_rule__Enter__Group__42817);
            rule__Enter__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enter__Group__5_in_rule__Enter__Group__42820);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1376:1: rule__Enter__Group__4__Impl : ( RULE_C_PAREN_R ) ;
    public final void rule__Enter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1380:1: ( ( RULE_C_PAREN_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1381:1: ( RULE_C_PAREN_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1381:1: ( RULE_C_PAREN_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1382:1: RULE_C_PAREN_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getC_PAREN_RTerminalRuleCall_4()); 
            }
            match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_rule__Enter__Group__4__Impl2847); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1393:1: rule__Enter__Group__5 : rule__Enter__Group__5__Impl ;
    public final void rule__Enter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1397:1: ( rule__Enter__Group__5__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1398:2: rule__Enter__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Enter__Group__5__Impl_in_rule__Enter__Group__52876);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1404:1: rule__Enter__Group__5__Impl : ( RULE_C_BRACKET_R ) ;
    public final void rule__Enter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1408:1: ( ( RULE_C_BRACKET_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1409:1: ( RULE_C_BRACKET_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1409:1: ( RULE_C_BRACKET_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1410:1: RULE_C_BRACKET_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getC_BRACKET_RTerminalRuleCall_5()); 
            }
            match(input,RULE_C_BRACKET_R,FOLLOW_RULE_C_BRACKET_R_in_rule__Enter__Group__5__Impl2903); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1433:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1437:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1438:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__02944);
            rule__Field__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__02947);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1445:1: rule__Field__Group__0__Impl : ( ( rule__Field__CommentAssignment_0 )? ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1449:1: ( ( ( rule__Field__CommentAssignment_0 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1450:1: ( ( rule__Field__CommentAssignment_0 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1450:1: ( ( rule__Field__CommentAssignment_0 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1451:1: ( rule__Field__CommentAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getCommentAssignment_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1452:1: ( rule__Field__CommentAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_COMMENT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1452:2: rule__Field__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Field__CommentAssignment_0_in_rule__Field__Group__0__Impl2974);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1462:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1466:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1467:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__13005);
            rule__Field__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__13008);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1474:1: rule__Field__Group__1__Impl : ( ( rule__Field__MetaAssignment_1 )? ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1478:1: ( ( ( rule__Field__MetaAssignment_1 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1479:1: ( ( rule__Field__MetaAssignment_1 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1479:1: ( ( rule__Field__MetaAssignment_1 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1480:1: ( rule__Field__MetaAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getMetaAssignment_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1481:1: ( rule__Field__MetaAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_C_BRACKET_L) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1481:2: rule__Field__MetaAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Field__MetaAssignment_1_in_rule__Field__Group__1__Impl3035);
                    rule__Field__MetaAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getMetaAssignment_1()); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1491:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1495:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1496:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__23066);
            rule__Field__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__23069);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1503:1: rule__Field__Group__2__Impl : ( ( rule__Field__TypeAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1507:1: ( ( ( rule__Field__TypeAssignment_2 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1508:1: ( ( rule__Field__TypeAssignment_2 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1508:1: ( ( rule__Field__TypeAssignment_2 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1509:1: ( rule__Field__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeAssignment_2()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1510:1: ( rule__Field__TypeAssignment_2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1510:2: rule__Field__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Field__TypeAssignment_2_in_rule__Field__Group__2__Impl3096);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1520:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1524:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1525:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__33126);
            rule__Field__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__33129);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1532:1: rule__Field__Group__3__Impl : ( ( rule__Field__FieldNameAssignment_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1536:1: ( ( ( rule__Field__FieldNameAssignment_3 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1537:1: ( ( rule__Field__FieldNameAssignment_3 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1537:1: ( ( rule__Field__FieldNameAssignment_3 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1538:1: ( rule__Field__FieldNameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getFieldNameAssignment_3()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1539:1: ( rule__Field__FieldNameAssignment_3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1539:2: rule__Field__FieldNameAssignment_3
            {
            pushFollow(FOLLOW_rule__Field__FieldNameAssignment_3_in_rule__Field__Group__3__Impl3156);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1549:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1553:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1554:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__43186);
            rule__Field__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__5_in_rule__Field__Group__43189);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1561:1: rule__Field__Group__4__Impl : ( RULE_C_EQUALS ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1565:1: ( ( RULE_C_EQUALS ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1566:1: ( RULE_C_EQUALS )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1566:1: ( RULE_C_EQUALS )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1567:1: RULE_C_EQUALS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getC_EQUALSTerminalRuleCall_4()); 
            }
            match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_rule__Field__Group__4__Impl3216); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1578:1: rule__Field__Group__5 : rule__Field__Group__5__Impl rule__Field__Group__6 ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1582:1: ( rule__Field__Group__5__Impl rule__Field__Group__6 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1583:2: rule__Field__Group__5__Impl rule__Field__Group__6
            {
            pushFollow(FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__53245);
            rule__Field__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__6_in_rule__Field__Group__53248);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1590:1: rule__Field__Group__5__Impl : ( ( rule__Field__NodePathAssignment_5 ) ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1594:1: ( ( ( rule__Field__NodePathAssignment_5 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1595:1: ( ( rule__Field__NodePathAssignment_5 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1595:1: ( ( rule__Field__NodePathAssignment_5 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1596:1: ( rule__Field__NodePathAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNodePathAssignment_5()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1597:1: ( rule__Field__NodePathAssignment_5 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1597:2: rule__Field__NodePathAssignment_5
            {
            pushFollow(FOLLOW_rule__Field__NodePathAssignment_5_in_rule__Field__Group__5__Impl3275);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1607:1: rule__Field__Group__6 : rule__Field__Group__6__Impl ;
    public final void rule__Field__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1611:1: ( rule__Field__Group__6__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1612:2: rule__Field__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__63305);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1618:1: rule__Field__Group__6__Impl : ( ( RULE_C_SEMICOLON )? ) ;
    public final void rule__Field__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1622:1: ( ( ( RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1623:1: ( ( RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1623:1: ( ( RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1624:1: ( RULE_C_SEMICOLON )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getC_SEMICOLONTerminalRuleCall_6()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1625:1: ( RULE_C_SEMICOLON )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_C_SEMICOLON) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1625:3: RULE_C_SEMICOLON
                    {
                    match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_rule__Field__Group__6__Impl3333); if (state.failed) return ;

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


    // $ANTLR start "rule__FieldMeta__Group__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1649:1: rule__FieldMeta__Group__0 : rule__FieldMeta__Group__0__Impl rule__FieldMeta__Group__1 ;
    public final void rule__FieldMeta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1653:1: ( rule__FieldMeta__Group__0__Impl rule__FieldMeta__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1654:2: rule__FieldMeta__Group__0__Impl rule__FieldMeta__Group__1
            {
            pushFollow(FOLLOW_rule__FieldMeta__Group__0__Impl_in_rule__FieldMeta__Group__03378);
            rule__FieldMeta__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldMeta__Group__1_in_rule__FieldMeta__Group__03381);
            rule__FieldMeta__Group__1();

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
    // $ANTLR end "rule__FieldMeta__Group__0"


    // $ANTLR start "rule__FieldMeta__Group__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1661:1: rule__FieldMeta__Group__0__Impl : ( RULE_C_BRACKET_L ) ;
    public final void rule__FieldMeta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1665:1: ( ( RULE_C_BRACKET_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1666:1: ( RULE_C_BRACKET_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1666:1: ( RULE_C_BRACKET_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1667:1: RULE_C_BRACKET_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMetaAccess().getC_BRACKET_LTerminalRuleCall_0()); 
            }
            match(input,RULE_C_BRACKET_L,FOLLOW_RULE_C_BRACKET_L_in_rule__FieldMeta__Group__0__Impl3408); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMetaAccess().getC_BRACKET_LTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__FieldMeta__Group__0__Impl"


    // $ANTLR start "rule__FieldMeta__Group__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1678:1: rule__FieldMeta__Group__1 : rule__FieldMeta__Group__1__Impl rule__FieldMeta__Group__2 ;
    public final void rule__FieldMeta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1682:1: ( rule__FieldMeta__Group__1__Impl rule__FieldMeta__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1683:2: rule__FieldMeta__Group__1__Impl rule__FieldMeta__Group__2
            {
            pushFollow(FOLLOW_rule__FieldMeta__Group__1__Impl_in_rule__FieldMeta__Group__13437);
            rule__FieldMeta__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldMeta__Group__2_in_rule__FieldMeta__Group__13440);
            rule__FieldMeta__Group__2();

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
    // $ANTLR end "rule__FieldMeta__Group__1"


    // $ANTLR start "rule__FieldMeta__Group__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1690:1: rule__FieldMeta__Group__1__Impl : ( ( rule__FieldMeta__PrefixAssignment_1 ) ) ;
    public final void rule__FieldMeta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1694:1: ( ( ( rule__FieldMeta__PrefixAssignment_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1695:1: ( ( rule__FieldMeta__PrefixAssignment_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1695:1: ( ( rule__FieldMeta__PrefixAssignment_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1696:1: ( rule__FieldMeta__PrefixAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMetaAccess().getPrefixAssignment_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1697:1: ( rule__FieldMeta__PrefixAssignment_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1697:2: rule__FieldMeta__PrefixAssignment_1
            {
            pushFollow(FOLLOW_rule__FieldMeta__PrefixAssignment_1_in_rule__FieldMeta__Group__1__Impl3467);
            rule__FieldMeta__PrefixAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMetaAccess().getPrefixAssignment_1()); 
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
    // $ANTLR end "rule__FieldMeta__Group__1__Impl"


    // $ANTLR start "rule__FieldMeta__Group__2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1707:1: rule__FieldMeta__Group__2 : rule__FieldMeta__Group__2__Impl rule__FieldMeta__Group__3 ;
    public final void rule__FieldMeta__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1711:1: ( rule__FieldMeta__Group__2__Impl rule__FieldMeta__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1712:2: rule__FieldMeta__Group__2__Impl rule__FieldMeta__Group__3
            {
            pushFollow(FOLLOW_rule__FieldMeta__Group__2__Impl_in_rule__FieldMeta__Group__23497);
            rule__FieldMeta__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldMeta__Group__3_in_rule__FieldMeta__Group__23500);
            rule__FieldMeta__Group__3();

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
    // $ANTLR end "rule__FieldMeta__Group__2"


    // $ANTLR start "rule__FieldMeta__Group__2__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1719:1: rule__FieldMeta__Group__2__Impl : ( ( rule__FieldMeta__Group_2__0 )? ) ;
    public final void rule__FieldMeta__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1723:1: ( ( ( rule__FieldMeta__Group_2__0 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1724:1: ( ( rule__FieldMeta__Group_2__0 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1724:1: ( ( rule__FieldMeta__Group_2__0 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1725:1: ( rule__FieldMeta__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMetaAccess().getGroup_2()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1726:1: ( rule__FieldMeta__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_C_PAREN_L) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1726:2: rule__FieldMeta__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FieldMeta__Group_2__0_in_rule__FieldMeta__Group__2__Impl3527);
                    rule__FieldMeta__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMetaAccess().getGroup_2()); 
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
    // $ANTLR end "rule__FieldMeta__Group__2__Impl"


    // $ANTLR start "rule__FieldMeta__Group__3"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1736:1: rule__FieldMeta__Group__3 : rule__FieldMeta__Group__3__Impl ;
    public final void rule__FieldMeta__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1740:1: ( rule__FieldMeta__Group__3__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1741:2: rule__FieldMeta__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FieldMeta__Group__3__Impl_in_rule__FieldMeta__Group__33558);
            rule__FieldMeta__Group__3__Impl();

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
    // $ANTLR end "rule__FieldMeta__Group__3"


    // $ANTLR start "rule__FieldMeta__Group__3__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1747:1: rule__FieldMeta__Group__3__Impl : ( RULE_C_BRACKET_R ) ;
    public final void rule__FieldMeta__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1751:1: ( ( RULE_C_BRACKET_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1752:1: ( RULE_C_BRACKET_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1752:1: ( RULE_C_BRACKET_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1753:1: RULE_C_BRACKET_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMetaAccess().getC_BRACKET_RTerminalRuleCall_3()); 
            }
            match(input,RULE_C_BRACKET_R,FOLLOW_RULE_C_BRACKET_R_in_rule__FieldMeta__Group__3__Impl3585); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMetaAccess().getC_BRACKET_RTerminalRuleCall_3()); 
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
    // $ANTLR end "rule__FieldMeta__Group__3__Impl"


    // $ANTLR start "rule__FieldMeta__Group_2__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1772:1: rule__FieldMeta__Group_2__0 : rule__FieldMeta__Group_2__0__Impl rule__FieldMeta__Group_2__1 ;
    public final void rule__FieldMeta__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1776:1: ( rule__FieldMeta__Group_2__0__Impl rule__FieldMeta__Group_2__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1777:2: rule__FieldMeta__Group_2__0__Impl rule__FieldMeta__Group_2__1
            {
            pushFollow(FOLLOW_rule__FieldMeta__Group_2__0__Impl_in_rule__FieldMeta__Group_2__03622);
            rule__FieldMeta__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldMeta__Group_2__1_in_rule__FieldMeta__Group_2__03625);
            rule__FieldMeta__Group_2__1();

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
    // $ANTLR end "rule__FieldMeta__Group_2__0"


    // $ANTLR start "rule__FieldMeta__Group_2__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1784:1: rule__FieldMeta__Group_2__0__Impl : ( RULE_C_PAREN_L ) ;
    public final void rule__FieldMeta__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1788:1: ( ( RULE_C_PAREN_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1789:1: ( RULE_C_PAREN_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1789:1: ( RULE_C_PAREN_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1790:1: RULE_C_PAREN_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMetaAccess().getC_PAREN_LTerminalRuleCall_2_0()); 
            }
            match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_rule__FieldMeta__Group_2__0__Impl3652); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMetaAccess().getC_PAREN_LTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__FieldMeta__Group_2__0__Impl"


    // $ANTLR start "rule__FieldMeta__Group_2__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1801:1: rule__FieldMeta__Group_2__1 : rule__FieldMeta__Group_2__1__Impl rule__FieldMeta__Group_2__2 ;
    public final void rule__FieldMeta__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1805:1: ( rule__FieldMeta__Group_2__1__Impl rule__FieldMeta__Group_2__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1806:2: rule__FieldMeta__Group_2__1__Impl rule__FieldMeta__Group_2__2
            {
            pushFollow(FOLLOW_rule__FieldMeta__Group_2__1__Impl_in_rule__FieldMeta__Group_2__13681);
            rule__FieldMeta__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldMeta__Group_2__2_in_rule__FieldMeta__Group_2__13684);
            rule__FieldMeta__Group_2__2();

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
    // $ANTLR end "rule__FieldMeta__Group_2__1"


    // $ANTLR start "rule__FieldMeta__Group_2__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1813:1: rule__FieldMeta__Group_2__1__Impl : ( ( rule__FieldMeta__Group_2_1__0 )? ) ;
    public final void rule__FieldMeta__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1817:1: ( ( ( rule__FieldMeta__Group_2_1__0 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1818:1: ( ( rule__FieldMeta__Group_2_1__0 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1818:1: ( ( rule__FieldMeta__Group_2_1__0 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1819:1: ( rule__FieldMeta__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMetaAccess().getGroup_2_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1820:1: ( rule__FieldMeta__Group_2_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_C_INPUT && LA18_0<=RULE_NAME)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1820:2: rule__FieldMeta__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__FieldMeta__Group_2_1__0_in_rule__FieldMeta__Group_2__1__Impl3711);
                    rule__FieldMeta__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMetaAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__FieldMeta__Group_2__1__Impl"


    // $ANTLR start "rule__FieldMeta__Group_2__2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1830:1: rule__FieldMeta__Group_2__2 : rule__FieldMeta__Group_2__2__Impl ;
    public final void rule__FieldMeta__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1834:1: ( rule__FieldMeta__Group_2__2__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1835:2: rule__FieldMeta__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__FieldMeta__Group_2__2__Impl_in_rule__FieldMeta__Group_2__23742);
            rule__FieldMeta__Group_2__2__Impl();

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
    // $ANTLR end "rule__FieldMeta__Group_2__2"


    // $ANTLR start "rule__FieldMeta__Group_2__2__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1841:1: rule__FieldMeta__Group_2__2__Impl : ( RULE_C_PAREN_R ) ;
    public final void rule__FieldMeta__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1845:1: ( ( RULE_C_PAREN_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1846:1: ( RULE_C_PAREN_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1846:1: ( RULE_C_PAREN_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1847:1: RULE_C_PAREN_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMetaAccess().getC_PAREN_RTerminalRuleCall_2_2()); 
            }
            match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_rule__FieldMeta__Group_2__2__Impl3769); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMetaAccess().getC_PAREN_RTerminalRuleCall_2_2()); 
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
    // $ANTLR end "rule__FieldMeta__Group_2__2__Impl"


    // $ANTLR start "rule__FieldMeta__Group_2_1__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1864:1: rule__FieldMeta__Group_2_1__0 : rule__FieldMeta__Group_2_1__0__Impl rule__FieldMeta__Group_2_1__1 ;
    public final void rule__FieldMeta__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1868:1: ( rule__FieldMeta__Group_2_1__0__Impl rule__FieldMeta__Group_2_1__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1869:2: rule__FieldMeta__Group_2_1__0__Impl rule__FieldMeta__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__FieldMeta__Group_2_1__0__Impl_in_rule__FieldMeta__Group_2_1__03804);
            rule__FieldMeta__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldMeta__Group_2_1__1_in_rule__FieldMeta__Group_2_1__03807);
            rule__FieldMeta__Group_2_1__1();

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
    // $ANTLR end "rule__FieldMeta__Group_2_1__0"


    // $ANTLR start "rule__FieldMeta__Group_2_1__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1876:1: rule__FieldMeta__Group_2_1__0__Impl : ( ( rule__FieldMeta__ParamsAssignment_2_1_0 ) ) ;
    public final void rule__FieldMeta__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1880:1: ( ( ( rule__FieldMeta__ParamsAssignment_2_1_0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1881:1: ( ( rule__FieldMeta__ParamsAssignment_2_1_0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1881:1: ( ( rule__FieldMeta__ParamsAssignment_2_1_0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1882:1: ( rule__FieldMeta__ParamsAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMetaAccess().getParamsAssignment_2_1_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1883:1: ( rule__FieldMeta__ParamsAssignment_2_1_0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1883:2: rule__FieldMeta__ParamsAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__FieldMeta__ParamsAssignment_2_1_0_in_rule__FieldMeta__Group_2_1__0__Impl3834);
            rule__FieldMeta__ParamsAssignment_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMetaAccess().getParamsAssignment_2_1_0()); 
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
    // $ANTLR end "rule__FieldMeta__Group_2_1__0__Impl"


    // $ANTLR start "rule__FieldMeta__Group_2_1__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1893:1: rule__FieldMeta__Group_2_1__1 : rule__FieldMeta__Group_2_1__1__Impl ;
    public final void rule__FieldMeta__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1897:1: ( rule__FieldMeta__Group_2_1__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1898:2: rule__FieldMeta__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FieldMeta__Group_2_1__1__Impl_in_rule__FieldMeta__Group_2_1__13864);
            rule__FieldMeta__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__FieldMeta__Group_2_1__1"


    // $ANTLR start "rule__FieldMeta__Group_2_1__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1904:1: rule__FieldMeta__Group_2_1__1__Impl : ( ( rule__FieldMeta__Group_2_1_1__0 )* ) ;
    public final void rule__FieldMeta__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1908:1: ( ( ( rule__FieldMeta__Group_2_1_1__0 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1909:1: ( ( rule__FieldMeta__Group_2_1_1__0 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1909:1: ( ( rule__FieldMeta__Group_2_1_1__0 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1910:1: ( rule__FieldMeta__Group_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMetaAccess().getGroup_2_1_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1911:1: ( rule__FieldMeta__Group_2_1_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_C_COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1911:2: rule__FieldMeta__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FieldMeta__Group_2_1_1__0_in_rule__FieldMeta__Group_2_1__1__Impl3891);
            	    rule__FieldMeta__Group_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMetaAccess().getGroup_2_1_1()); 
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
    // $ANTLR end "rule__FieldMeta__Group_2_1__1__Impl"


    // $ANTLR start "rule__FieldMeta__Group_2_1_1__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1925:1: rule__FieldMeta__Group_2_1_1__0 : rule__FieldMeta__Group_2_1_1__0__Impl rule__FieldMeta__Group_2_1_1__1 ;
    public final void rule__FieldMeta__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1929:1: ( rule__FieldMeta__Group_2_1_1__0__Impl rule__FieldMeta__Group_2_1_1__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1930:2: rule__FieldMeta__Group_2_1_1__0__Impl rule__FieldMeta__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__FieldMeta__Group_2_1_1__0__Impl_in_rule__FieldMeta__Group_2_1_1__03926);
            rule__FieldMeta__Group_2_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FieldMeta__Group_2_1_1__1_in_rule__FieldMeta__Group_2_1_1__03929);
            rule__FieldMeta__Group_2_1_1__1();

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
    // $ANTLR end "rule__FieldMeta__Group_2_1_1__0"


    // $ANTLR start "rule__FieldMeta__Group_2_1_1__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1937:1: rule__FieldMeta__Group_2_1_1__0__Impl : ( RULE_C_COMMA ) ;
    public final void rule__FieldMeta__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1941:1: ( ( RULE_C_COMMA ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1942:1: ( RULE_C_COMMA )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1942:1: ( RULE_C_COMMA )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1943:1: RULE_C_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMetaAccess().getC_COMMATerminalRuleCall_2_1_1_0()); 
            }
            match(input,RULE_C_COMMA,FOLLOW_RULE_C_COMMA_in_rule__FieldMeta__Group_2_1_1__0__Impl3956); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMetaAccess().getC_COMMATerminalRuleCall_2_1_1_0()); 
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
    // $ANTLR end "rule__FieldMeta__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__FieldMeta__Group_2_1_1__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1954:1: rule__FieldMeta__Group_2_1_1__1 : rule__FieldMeta__Group_2_1_1__1__Impl ;
    public final void rule__FieldMeta__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1958:1: ( rule__FieldMeta__Group_2_1_1__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1959:2: rule__FieldMeta__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FieldMeta__Group_2_1_1__1__Impl_in_rule__FieldMeta__Group_2_1_1__13985);
            rule__FieldMeta__Group_2_1_1__1__Impl();

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
    // $ANTLR end "rule__FieldMeta__Group_2_1_1__1"


    // $ANTLR start "rule__FieldMeta__Group_2_1_1__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1965:1: rule__FieldMeta__Group_2_1_1__1__Impl : ( ( rule__FieldMeta__ParamsAssignment_2_1_1_1 ) ) ;
    public final void rule__FieldMeta__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1969:1: ( ( ( rule__FieldMeta__ParamsAssignment_2_1_1_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1970:1: ( ( rule__FieldMeta__ParamsAssignment_2_1_1_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1970:1: ( ( rule__FieldMeta__ParamsAssignment_2_1_1_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1971:1: ( rule__FieldMeta__ParamsAssignment_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMetaAccess().getParamsAssignment_2_1_1_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1972:1: ( rule__FieldMeta__ParamsAssignment_2_1_1_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1972:2: rule__FieldMeta__ParamsAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__FieldMeta__ParamsAssignment_2_1_1_1_in_rule__FieldMeta__Group_2_1_1__1__Impl4012);
            rule__FieldMeta__ParamsAssignment_2_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMetaAccess().getParamsAssignment_2_1_1_1()); 
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
    // $ANTLR end "rule__FieldMeta__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__PackName__Group__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1986:1: rule__PackName__Group__0 : rule__PackName__Group__0__Impl rule__PackName__Group__1 ;
    public final void rule__PackName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1990:1: ( rule__PackName__Group__0__Impl rule__PackName__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1991:2: rule__PackName__Group__0__Impl rule__PackName__Group__1
            {
            pushFollow(FOLLOW_rule__PackName__Group__0__Impl_in_rule__PackName__Group__04046);
            rule__PackName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackName__Group__1_in_rule__PackName__Group__04049);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1998:1: rule__PackName__Group__0__Impl : ( ruleTypeName ) ;
    public final void rule__PackName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2002:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2003:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2003:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2004:1: ruleTypeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackNameAccess().getTypeNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_rule__PackName__Group__0__Impl4076);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2015:1: rule__PackName__Group__1 : rule__PackName__Group__1__Impl ;
    public final void rule__PackName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2019:1: ( rule__PackName__Group__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2020:2: rule__PackName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PackName__Group__1__Impl_in_rule__PackName__Group__14105);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2026:1: rule__PackName__Group__1__Impl : ( ( rule__PackName__Group_1__0 )* ) ;
    public final void rule__PackName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2030:1: ( ( ( rule__PackName__Group_1__0 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2031:1: ( ( rule__PackName__Group_1__0 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2031:1: ( ( rule__PackName__Group_1__0 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2032:1: ( rule__PackName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackNameAccess().getGroup_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2033:1: ( rule__PackName__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2033:2: rule__PackName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PackName__Group_1__0_in_rule__PackName__Group__1__Impl4132);
            	    rule__PackName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2047:1: rule__PackName__Group_1__0 : rule__PackName__Group_1__0__Impl rule__PackName__Group_1__1 ;
    public final void rule__PackName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2051:1: ( rule__PackName__Group_1__0__Impl rule__PackName__Group_1__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2052:2: rule__PackName__Group_1__0__Impl rule__PackName__Group_1__1
            {
            pushFollow(FOLLOW_rule__PackName__Group_1__0__Impl_in_rule__PackName__Group_1__04167);
            rule__PackName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackName__Group_1__1_in_rule__PackName__Group_1__04170);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2059:1: rule__PackName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__PackName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2063:1: ( ( '.' ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2064:1: ( '.' )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2064:1: ( '.' )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2065:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__PackName__Group_1__0__Impl4198); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2078:1: rule__PackName__Group_1__1 : rule__PackName__Group_1__1__Impl ;
    public final void rule__PackName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2082:1: ( rule__PackName__Group_1__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2083:2: rule__PackName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PackName__Group_1__1__Impl_in_rule__PackName__Group_1__14229);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2089:1: rule__PackName__Group_1__1__Impl : ( ruleTypeName ) ;
    public final void rule__PackName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2093:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2094:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2094:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2095:1: ruleTypeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackNameAccess().getTypeNameParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_rule__PackName__Group_1__1__Impl4256);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2111:1: rule__XML2__InputAssignment_0_0_0 : ( ruleInputDef ) ;
    public final void rule__XML2__InputAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2115:1: ( ( ruleInputDef ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2116:1: ( ruleInputDef )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2116:1: ( ruleInputDef )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2117:1: ruleInputDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getInputInputDefParserRuleCall_0_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleInputDef_in_rule__XML2__InputAssignment_0_0_04294);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2126:1: rule__XML2__PackAssignment_0_0_1 : ( rulePackDef ) ;
    public final void rule__XML2__PackAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2130:1: ( ( rulePackDef ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2131:1: ( rulePackDef )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2131:1: ( rulePackDef )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2132:1: rulePackDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getPackPackDefParserRuleCall_0_0_1_0()); 
            }
            pushFollow(FOLLOW_rulePackDef_in_rule__XML2__PackAssignment_0_0_14325);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2141:1: rule__XML2__PackAssignment_0_1_0 : ( rulePackDef ) ;
    public final void rule__XML2__PackAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2145:1: ( ( rulePackDef ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2146:1: ( rulePackDef )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2146:1: ( rulePackDef )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2147:1: rulePackDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getPackPackDefParserRuleCall_0_1_0_0()); 
            }
            pushFollow(FOLLOW_rulePackDef_in_rule__XML2__PackAssignment_0_1_04356);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2156:1: rule__XML2__InputAssignment_0_1_1 : ( ruleInputDef ) ;
    public final void rule__XML2__InputAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2160:1: ( ( ruleInputDef ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2161:1: ( ruleInputDef )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2161:1: ( ruleInputDef )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2162:1: ruleInputDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getInputInputDefParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleInputDef_in_rule__XML2__InputAssignment_0_1_14387);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2171:1: rule__XML2__PackAssignment_0_2 : ( rulePackDef ) ;
    public final void rule__XML2__PackAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2175:1: ( ( rulePackDef ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2176:1: ( rulePackDef )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2176:1: ( rulePackDef )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2177:1: rulePackDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getPackPackDefParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_rulePackDef_in_rule__XML2__PackAssignment_0_24418);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2186:1: rule__XML2__InputAssignment_0_3 : ( ruleInputDef ) ;
    public final void rule__XML2__InputAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2190:1: ( ( ruleInputDef ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2191:1: ( ruleInputDef )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2191:1: ( ruleInputDef )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2192:1: ruleInputDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getInputInputDefParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_ruleInputDef_in_rule__XML2__InputAssignment_0_34449);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2201:1: rule__XML2__TypesAssignment_1_0 : ( ruleType ) ;
    public final void rule__XML2__TypesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2205:1: ( ( ruleType ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2206:1: ( ruleType )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2206:1: ( ruleType )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2207:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getTypesTypeParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__XML2__TypesAssignment_1_04480);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2216:1: rule__XML2__CommAssignment_1_1 : ( ruleOtherComent ) ;
    public final void rule__XML2__CommAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2220:1: ( ( ruleOtherComent ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2221:1: ( ruleOtherComent )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2221:1: ( ruleOtherComent )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2222:1: ruleOtherComent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getCommOtherComentParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleOtherComent_in_rule__XML2__CommAssignment_1_14511);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2231:1: rule__InputDef__CommentAssignment_0 : ( ruleOtherComent ) ;
    public final void rule__InputDef__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2235:1: ( ( ruleOtherComent ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2236:1: ( ruleOtherComent )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2236:1: ( ruleOtherComent )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2237:1: ruleOtherComent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputDefAccess().getCommentOtherComentParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleOtherComent_in_rule__InputDef__CommentAssignment_04542);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2246:1: rule__InputDef__InputCHARAssignment_1 : ( RULE_C_INPUT ) ;
    public final void rule__InputDef__InputCHARAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2250:1: ( ( RULE_C_INPUT ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2251:1: ( RULE_C_INPUT )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2251:1: ( RULE_C_INPUT )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2252:1: RULE_C_INPUT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputDefAccess().getInputCHARC_INPUTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_C_INPUT,FOLLOW_RULE_C_INPUT_in_rule__InputDef__InputCHARAssignment_14573); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2261:1: rule__InputDef__UrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__InputDef__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2265:1: ( ( RULE_STRING ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2266:1: ( RULE_STRING )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2266:1: ( RULE_STRING )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2267:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputDefAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InputDef__UrlAssignment_24604); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2276:1: rule__PackDef__CommentAssignment_0 : ( ruleOtherComent ) ;
    public final void rule__PackDef__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2280:1: ( ( ruleOtherComent ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2281:1: ( ruleOtherComent )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2281:1: ( ruleOtherComent )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2282:1: ruleOtherComent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackDefAccess().getCommentOtherComentParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleOtherComent_in_rule__PackDef__CommentAssignment_04635);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2291:1: rule__PackDef__PackCHARAssignment_1 : ( RULE_C_PACKAGE ) ;
    public final void rule__PackDef__PackCHARAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2295:1: ( ( RULE_C_PACKAGE ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2296:1: ( RULE_C_PACKAGE )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2296:1: ( RULE_C_PACKAGE )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2297:1: RULE_C_PACKAGE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackDefAccess().getPackCHARC_PACKAGETerminalRuleCall_1_0()); 
            }
            match(input,RULE_C_PACKAGE,FOLLOW_RULE_C_PACKAGE_in_rule__PackDef__PackCHARAssignment_14666); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2306:1: rule__PackDef__PackAssignment_2 : ( rulePackName ) ;
    public final void rule__PackDef__PackAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2310:1: ( ( rulePackName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2311:1: ( rulePackName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2311:1: ( rulePackName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2312:1: rulePackName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackDefAccess().getPackPackNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_rulePackName_in_rule__PackDef__PackAssignment_24697);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2321:1: rule__Type__CommentAssignment_0 : ( ruleTypeComment ) ;
    public final void rule__Type__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2325:1: ( ( ruleTypeComment ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2326:1: ( ruleTypeComment )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2326:1: ( ruleTypeComment )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2327:1: ruleTypeComment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getCommentTypeCommentParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleTypeComment_in_rule__Type__CommentAssignment_04728);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2336:1: rule__Type__EnterAssignment_1 : ( ruleEnter ) ;
    public final void rule__Type__EnterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2340:1: ( ( ruleEnter ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2341:1: ( ruleEnter )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2341:1: ( ruleEnter )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2342:1: ruleEnter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getEnterEnterParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEnter_in_rule__Type__EnterAssignment_14759);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2351:1: rule__Type__PrefixAssignment_2 : ( RULE_C_TYPE ) ;
    public final void rule__Type__PrefixAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2355:1: ( ( RULE_C_TYPE ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2356:1: ( RULE_C_TYPE )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2356:1: ( RULE_C_TYPE )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2357:1: RULE_C_TYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getPrefixC_TYPETerminalRuleCall_2_0()); 
            }
            match(input,RULE_C_TYPE,FOLLOW_RULE_C_TYPE_in_rule__Type__PrefixAssignment_24790); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2366:1: rule__Type__NameAssignment_3 : ( ruleTypeName ) ;
    public final void rule__Type__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2370:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2371:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2371:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2372:1: ruleTypeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getNameTypeNameParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_rule__Type__NameAssignment_34821);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2381:1: rule__Type__FieldsAssignment_5_0 : ( ruleField ) ;
    public final void rule__Type__FieldsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2385:1: ( ( ruleField ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2386:1: ( ruleField )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2386:1: ( ruleField )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2387:1: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getFieldsFieldParserRuleCall_5_0_0()); 
            }
            pushFollow(FOLLOW_ruleField_in_rule__Type__FieldsAssignment_5_04852);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2396:1: rule__Type__CommAssignment_5_1 : ( ruleOtherComent ) ;
    public final void rule__Type__CommAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2400:1: ( ( ruleOtherComent ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2401:1: ( ruleOtherComent )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2401:1: ( ruleOtherComent )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2402:1: ruleOtherComent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getCommOtherComentParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleOtherComent_in_rule__Type__CommAssignment_5_14883);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2411:1: rule__Enter__PrefixAssignment_1 : ( RULE_C_MAIN ) ;
    public final void rule__Enter__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2415:1: ( ( RULE_C_MAIN ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2416:1: ( RULE_C_MAIN )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2416:1: ( RULE_C_MAIN )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2417:1: RULE_C_MAIN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getPrefixC_MAINTerminalRuleCall_1_0()); 
            }
            match(input,RULE_C_MAIN,FOLLOW_RULE_C_MAIN_in_rule__Enter__PrefixAssignment_14914); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2426:1: rule__Enter__RootPathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Enter__RootPathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2430:1: ( ( RULE_STRING ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2431:1: ( RULE_STRING )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2431:1: ( RULE_STRING )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2432:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getRootPathSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Enter__RootPathAssignment_34945); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2441:1: rule__Field__CommentAssignment_0 : ( ruleFieldComment ) ;
    public final void rule__Field__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2445:1: ( ( ruleFieldComment ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2446:1: ( ruleFieldComment )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2446:1: ( ruleFieldComment )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2447:1: ruleFieldComment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getCommentFieldCommentParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleFieldComment_in_rule__Field__CommentAssignment_04976);
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


    // $ANTLR start "rule__Field__MetaAssignment_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2456:1: rule__Field__MetaAssignment_1 : ( ruleFieldMeta ) ;
    public final void rule__Field__MetaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2460:1: ( ( ruleFieldMeta ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2461:1: ( ruleFieldMeta )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2461:1: ( ruleFieldMeta )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2462:1: ruleFieldMeta
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getMetaFieldMetaParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldMeta_in_rule__Field__MetaAssignment_15007);
            ruleFieldMeta();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getMetaFieldMetaParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Field__MetaAssignment_1"


    // $ANTLR start "rule__Field__TypeAssignment_2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2471:1: rule__Field__TypeAssignment_2 : ( ruleFieldType ) ;
    public final void rule__Field__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2475:1: ( ( ruleFieldType ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2476:1: ( ruleFieldType )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2476:1: ( ruleFieldType )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2477:1: ruleFieldType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFieldType_in_rule__Field__TypeAssignment_25038);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2486:1: rule__Field__FieldNameAssignment_3 : ( ruleTypeName ) ;
    public final void rule__Field__FieldNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2490:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2491:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2491:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2492:1: ruleTypeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getFieldNameTypeNameParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_rule__Field__FieldNameAssignment_35069);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2501:1: rule__Field__NodePathAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Field__NodePathAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2505:1: ( ( RULE_STRING ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2506:1: ( RULE_STRING )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2506:1: ( RULE_STRING )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2507:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNodePathSTRINGTerminalRuleCall_5_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Field__NodePathAssignment_55100); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2516:1: rule__FieldType__TypeAssignment : ( ruleTypeName ) ;
    public final void rule__FieldType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2520:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2521:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2521:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2522:1: ruleTypeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldTypeAccess().getTypeTypeNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_rule__FieldType__TypeAssignment5131);
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


    // $ANTLR start "rule__FieldMeta__PrefixAssignment_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2531:1: rule__FieldMeta__PrefixAssignment_1 : ( RULE_C_LIST ) ;
    public final void rule__FieldMeta__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2535:1: ( ( RULE_C_LIST ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2536:1: ( RULE_C_LIST )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2536:1: ( RULE_C_LIST )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2537:1: RULE_C_LIST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMetaAccess().getPrefixC_LISTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_C_LIST,FOLLOW_RULE_C_LIST_in_rule__FieldMeta__PrefixAssignment_15162); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMetaAccess().getPrefixC_LISTTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__FieldMeta__PrefixAssignment_1"


    // $ANTLR start "rule__FieldMeta__ParamsAssignment_2_1_0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2546:1: rule__FieldMeta__ParamsAssignment_2_1_0 : ( ruleFieldMetaKey ) ;
    public final void rule__FieldMeta__ParamsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2550:1: ( ( ruleFieldMetaKey ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2551:1: ( ruleFieldMetaKey )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2551:1: ( ruleFieldMetaKey )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2552:1: ruleFieldMetaKey
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMetaAccess().getParamsFieldMetaKeyParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleFieldMetaKey_in_rule__FieldMeta__ParamsAssignment_2_1_05193);
            ruleFieldMetaKey();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMetaAccess().getParamsFieldMetaKeyParserRuleCall_2_1_0_0()); 
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
    // $ANTLR end "rule__FieldMeta__ParamsAssignment_2_1_0"


    // $ANTLR start "rule__FieldMeta__ParamsAssignment_2_1_1_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2561:1: rule__FieldMeta__ParamsAssignment_2_1_1_1 : ( ruleFieldMetaKey ) ;
    public final void rule__FieldMeta__ParamsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2565:1: ( ( ruleFieldMetaKey ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2566:1: ( ruleFieldMetaKey )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2566:1: ( ruleFieldMetaKey )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2567:1: ruleFieldMetaKey
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMetaAccess().getParamsFieldMetaKeyParserRuleCall_2_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldMetaKey_in_rule__FieldMeta__ParamsAssignment_2_1_1_15224);
            ruleFieldMetaKey();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldMetaAccess().getParamsFieldMetaKeyParserRuleCall_2_1_1_1_0()); 
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
    // $ANTLR end "rule__FieldMeta__ParamsAssignment_2_1_1_1"


    // $ANTLR start "rule__FieldMetaKey__FieldNameAssignment"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2576:1: rule__FieldMetaKey__FieldNameAssignment : ( ruleTypeName ) ;
    public final void rule__FieldMetaKey__FieldNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2580:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2581:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2581:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2582:1: ruleTypeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMetaKeyAccess().getFieldNameTypeNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_rule__FieldMetaKey__FieldNameAssignment5255);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2591:1: rule__OtherComent__CommAssignment : ( RULE_COMMENT ) ;
    public final void rule__OtherComent__CommAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2595:1: ( ( RULE_COMMENT ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2596:1: ( RULE_COMMENT )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2596:1: ( RULE_COMMENT )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2597:1: RULE_COMMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherComentAccess().getCommCOMMENTTerminalRuleCall_0()); 
            }
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__OtherComent__CommAssignment5286); if (state.failed) return ;
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
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:492:1: ( ( ( rule__XML2__TypesAssignment_1_0 ) ) )
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:492:1: ( ( rule__XML2__TypesAssignment_1_0 ) )
        {
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:492:1: ( ( rule__XML2__TypesAssignment_1_0 ) )
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:493:1: ( rule__XML2__TypesAssignment_1_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getXML2Access().getTypesAssignment_1_0()); 
        }
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:494:1: ( rule__XML2__TypesAssignment_1_0 )
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:494:2: rule__XML2__TypesAssignment_1_0
        {
        pushFollow(FOLLOW_rule__XML2__TypesAssignment_1_0_in_synpred4_InternalCfg1001);
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
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:514:1: ( ( ( rule__Type__FieldsAssignment_5_0 ) ) )
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:514:1: ( ( rule__Type__FieldsAssignment_5_0 ) )
        {
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:514:1: ( ( rule__Type__FieldsAssignment_5_0 ) )
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:515:1: ( rule__Type__FieldsAssignment_5_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getTypeAccess().getFieldsAssignment_5_0()); 
        }
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:516:1: ( rule__Type__FieldsAssignment_5_0 )
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:516:2: rule__Type__FieldsAssignment_5_0
        {
        pushFollow(FOLLOW_rule__Type__FieldsAssignment_5_0_in_synpred5_InternalCfg1052);
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
        "\43\uffff";
    static final String DFA1_eofS =
        "\3\uffff\1\21\1\24\14\21\1\uffff\2\24\5\uffff\12\21";
    static final String DFA1_minS =
        "\2\4\1\30\16\4\1\uffff\2\4\3\uffff\1\5\1\20\12\4";
    static final String DFA1_maxS =
        "\2\31\1\30\1\22\1\31\12\36\2\22\1\uffff\2\31\3\uffff\1\16\1\30"+
        "\12\36";
    static final String DFA1_acceptS =
        "\21\uffff\1\3\2\uffff\1\4\1\1\1\2\14\uffff";
    static final String DFA1_specialS =
        "\43\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\1\2\23\uffff\1\3",
            "\1\1\1\2\23\uffff\1\3",
            "\1\4",
            "\1\20\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
            "\2\uffff\1\21",
            "\1\23\2\uffff\1\24\7\uffff\1\22\2\uffff\1\24\6\uffff\1\25",
            "\1\20\1\26\1\uffff\1\21\7\uffff\1\17\2\uffff\1\21\5\uffff"+
            "\1\26\5\uffff\1\27",
            "\1\20\1\26\1\uffff\1\21\7\uffff\1\17\2\uffff\1\21\13\uffff"+
            "\1\27",
            "\1\20\1\30\11\21\1\17\2\uffff\1\21\13\uffff\1\27",
            "\1\20\1\26\1\uffff\1\21\7\uffff\1\17\2\uffff\1\21\13\uffff"+
            "\1\27",
            "\1\20\1\26\1\uffff\1\21\7\uffff\1\17\2\uffff\1\21\13\uffff"+
            "\1\27",
            "\1\20\1\26\1\uffff\1\21\7\uffff\1\17\2\uffff\1\21\13\uffff"+
            "\1\27",
            "\1\20\1\26\1\uffff\1\21\7\uffff\1\17\2\uffff\1\21\13\uffff"+
            "\1\27",
            "\1\20\1\26\1\uffff\1\21\7\uffff\1\17\2\uffff\1\21\13\uffff"+
            "\1\27",
            "\1\20\1\26\1\uffff\1\21\7\uffff\1\17\2\uffff\1\21\13\uffff"+
            "\1\27",
            "\1\20\1\26\1\uffff\1\21\7\uffff\1\17\2\uffff\1\21\13\uffff"+
            "\1\27",
            "\1\20\1\26\1\uffff\1\21\12\uffff\1\21",
            "\1\20\1\26\1\uffff\1\21\12\uffff\1\21",
            "",
            "\1\23\2\uffff\1\24\12\uffff\1\24\6\uffff\1\25",
            "\1\23\2\uffff\1\24\12\uffff\1\24\6\uffff\1\25",
            "",
            "",
            "",
            "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42",
            "\1\21\7\uffff\1\26",
            "\1\20\1\26\1\uffff\1\21\7\uffff\1\17\2\uffff\1\21\13\uffff"+
            "\1\27",
            "\1\20\1\26\1\uffff\1\21\7\uffff\1\17\2\uffff\1\21\13\uffff"+
            "\1\27",
            "\1\20\1\26\1\uffff\1\21\7\uffff\1\17\2\uffff\1\21\13\uffff"+
            "\1\27",
            "\1\20\1\26\1\uffff\1\21\7\uffff\1\17\2\uffff\1\21\13\uffff"+
            "\1\27",
            "\1\20\1\26\1\uffff\1\21\7\uffff\1\17\2\uffff\1\21\13\uffff"+
            "\1\27",
            "\1\20\1\26\1\uffff\1\21\7\uffff\1\17\2\uffff\1\21\13\uffff"+
            "\1\27",
            "\1\20\1\26\1\uffff\1\21\7\uffff\1\17\2\uffff\1\21\13\uffff"+
            "\1\27",
            "\1\20\1\26\1\uffff\1\21\7\uffff\1\17\2\uffff\1\21\13\uffff"+
            "\1\27",
            "\1\20\1\26\1\uffff\1\21\7\uffff\1\17\2\uffff\1\21\13\uffff"+
            "\1\27",
            "\1\20\1\26\1\uffff\1\21\7\uffff\1\17\2\uffff\1\21\13\uffff"+
            "\1\27"
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
            return "453:1: rule__XML2__Alternatives_0 : ( ( ( rule__XML2__Group_0_0__0 ) ) | ( ( rule__XML2__Group_0_1__0 ) ) | ( ( rule__XML2__PackAssignment_0_2 ) ) | ( ( rule__XML2__InputAssignment_0_3 ) ) );";
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
    public static final BitSet FOLLOW_ruleFieldMeta_in_entryRuleFieldMeta487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldMeta494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldMeta__Group__0_in_ruleFieldMeta520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldMetaKey_in_entryRuleFieldMetaKey547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldMetaKey554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldMetaKey__FieldNameAssignment_in_ruleFieldMetaKey580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeComment_in_entryRuleTypeComment607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeComment614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleTypeComment640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldComment_in_entryRuleFieldComment666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldComment673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleFieldComment699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_entryRuleOtherComent725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherComent732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OtherComent__CommAssignment_in_ruleOtherComent758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackName_in_entryRulePackName785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackName792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackName__Group__0_in_rulePackName818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_entryRuleTypeName845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeName852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeName__Alternatives_in_ruleTypeName878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group_0_0__0_in_rule__XML2__Alternatives_0914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group_0_1__0_in_rule__XML2__Alternatives_0932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__PackAssignment_0_2_in_rule__XML2__Alternatives_0950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__InputAssignment_0_3_in_rule__XML2__Alternatives_0968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__TypesAssignment_1_0_in_rule__XML2__Alternatives_11001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__CommAssignment_1_1_in_rule__XML2__Alternatives_11019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__FieldsAssignment_5_0_in_rule__Type__Alternatives_51052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__CommAssignment_5_1_in_rule__Type__Alternatives_51070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INPUT_in_rule__TypeName__Alternatives1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_MAIN_in_rule__TypeName__Alternatives1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_TYPE_in_rule__TypeName__Alternatives1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INT_in_rule__TypeName__Alternatives1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_UINT_in_rule__TypeName__Alternatives1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BOOL_in_rule__TypeName__Alternatives1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_NUMBER_in_rule__TypeName__Alternatives1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_STRING_in_rule__TypeName__Alternatives1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_LIST_in_rule__TypeName__Alternatives1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rule__TypeName__Alternatives1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group__0__Impl_in_rule__XML2__Group__01286 = new BitSet(new long[]{0x0000000000040090L});
    public static final BitSet FOLLOW_rule__XML2__Group__1_in_rule__XML2__Group__01289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Alternatives_0_in_rule__XML2__Group__0__Impl1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group__1__Impl_in_rule__XML2__Group__11346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Alternatives_1_in_rule__XML2__Group__1__Impl1373 = new BitSet(new long[]{0x0000000000040092L});
    public static final BitSet FOLLOW_rule__XML2__Group_0_0__0__Impl_in_rule__XML2__Group_0_0__01408 = new BitSet(new long[]{0x0000000002040090L});
    public static final BitSet FOLLOW_rule__XML2__Group_0_0__1_in_rule__XML2__Group_0_0__01411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__InputAssignment_0_0_0_in_rule__XML2__Group_0_0__0__Impl1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group_0_0__1__Impl_in_rule__XML2__Group_0_0__11468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__PackAssignment_0_0_1_in_rule__XML2__Group_0_0__1__Impl1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group_0_1__0__Impl_in_rule__XML2__Group_0_1__01529 = new BitSet(new long[]{0x00000000000400B0L});
    public static final BitSet FOLLOW_rule__XML2__Group_0_1__1_in_rule__XML2__Group_0_1__01532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__PackAssignment_0_1_0_in_rule__XML2__Group_0_1__0__Impl1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group_0_1__1__Impl_in_rule__XML2__Group_0_1__11589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__InputAssignment_0_1_1_in_rule__XML2__Group_0_1__1__Impl1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDef__Group__0__Impl_in_rule__InputDef__Group__01650 = new BitSet(new long[]{0x00000000000400B0L});
    public static final BitSet FOLLOW_rule__InputDef__Group__1_in_rule__InputDef__Group__01653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDef__CommentAssignment_0_in_rule__InputDef__Group__0__Impl1680 = new BitSet(new long[]{0x0000000000040092L});
    public static final BitSet FOLLOW_rule__InputDef__Group__1__Impl_in_rule__InputDef__Group__11711 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__InputDef__Group__2_in_rule__InputDef__Group__11714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDef__InputCHARAssignment_1_in_rule__InputDef__Group__1__Impl1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDef__Group__2__Impl_in_rule__InputDef__Group__21771 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__InputDef__Group__3_in_rule__InputDef__Group__21774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDef__UrlAssignment_2_in_rule__InputDef__Group__2__Impl1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDef__Group__3__Impl_in_rule__InputDef__Group__31831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_rule__InputDef__Group__3__Impl1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackDef__Group__0__Impl_in_rule__PackDef__Group__01898 = new BitSet(new long[]{0x0000000002040090L});
    public static final BitSet FOLLOW_rule__PackDef__Group__1_in_rule__PackDef__Group__01901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackDef__CommentAssignment_0_in_rule__PackDef__Group__0__Impl1928 = new BitSet(new long[]{0x0000000000040092L});
    public static final BitSet FOLLOW_rule__PackDef__Group__1__Impl_in_rule__PackDef__Group__11959 = new BitSet(new long[]{0x000000000000FFE0L});
    public static final BitSet FOLLOW_rule__PackDef__Group__2_in_rule__PackDef__Group__11962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackDef__PackCHARAssignment_1_in_rule__PackDef__Group__1__Impl1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackDef__Group__2__Impl_in_rule__PackDef__Group__22019 = new BitSet(new long[]{0x000000000000FFE0L});
    public static final BitSet FOLLOW_rule__PackDef__Group__3_in_rule__PackDef__Group__22022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackDef__PackAssignment_2_in_rule__PackDef__Group__2__Impl2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackDef__Group__3__Impl_in_rule__PackDef__Group__32080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_rule__PackDef__Group__3__Impl2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__02147 = new BitSet(new long[]{0x0000000000040090L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__02150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__CommentAssignment_0_in_rule__Type__Group__0__Impl2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__12208 = new BitSet(new long[]{0x0000000000040090L});
    public static final BitSet FOLLOW_rule__Type__Group__2_in_rule__Type__Group__12211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__EnterAssignment_1_in_rule__Type__Group__1__Impl2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__2__Impl_in_rule__Type__Group__22269 = new BitSet(new long[]{0x0000000000007FE0L});
    public static final BitSet FOLLOW_rule__Type__Group__3_in_rule__Type__Group__22272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__PrefixAssignment_2_in_rule__Type__Group__2__Impl2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__3__Impl_in_rule__Type__Group__32329 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Type__Group__4_in_rule__Type__Group__32332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__NameAssignment_3_in_rule__Type__Group__3__Impl2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__4__Impl_in_rule__Type__Group__42389 = new BitSet(new long[]{0x0000000000067FF0L});
    public static final BitSet FOLLOW_rule__Type__Group__5_in_rule__Type__Group__42392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACE_L_in_rule__Type__Group__4__Impl2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__5__Impl_in_rule__Type__Group__52448 = new BitSet(new long[]{0x0000000000067FF0L});
    public static final BitSet FOLLOW_rule__Type__Group__6_in_rule__Type__Group__52451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_5_in_rule__Type__Group__5__Impl2478 = new BitSet(new long[]{0x0000000000047FF2L});
    public static final BitSet FOLLOW_rule__Type__Group__6__Impl_in_rule__Type__Group__62509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACE_R_in_rule__Type__Group__6__Impl2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__Group__0__Impl_in_rule__Enter__Group__02579 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Enter__Group__1_in_rule__Enter__Group__02582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_L_in_rule__Enter__Group__0__Impl2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__Group__1__Impl_in_rule__Enter__Group__12638 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Enter__Group__2_in_rule__Enter__Group__12641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__PrefixAssignment_1_in_rule__Enter__Group__1__Impl2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__Group__2__Impl_in_rule__Enter__Group__22698 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Enter__Group__3_in_rule__Enter__Group__22701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_rule__Enter__Group__2__Impl2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__Group__3__Impl_in_rule__Enter__Group__32757 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Enter__Group__4_in_rule__Enter__Group__32760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__RootPathAssignment_3_in_rule__Enter__Group__3__Impl2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__Group__4__Impl_in_rule__Enter__Group__42817 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Enter__Group__5_in_rule__Enter__Group__42820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_rule__Enter__Group__4__Impl2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__Group__5__Impl_in_rule__Enter__Group__52876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_R_in_rule__Enter__Group__5__Impl2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__02944 = new BitSet(new long[]{0x0000000000047FF0L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__02947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__CommentAssignment_0_in_rule__Field__Group__0__Impl2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__13005 = new BitSet(new long[]{0x0000000000047FF0L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__13008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__MetaAssignment_1_in_rule__Field__Group__1__Impl3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__23066 = new BitSet(new long[]{0x0000000000007FE0L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__23069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypeAssignment_2_in_rule__Field__Group__2__Impl3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__33126 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__33129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__FieldNameAssignment_3_in_rule__Field__Group__3__Impl3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__43186 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Field__Group__5_in_rule__Field__Group__43189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_rule__Field__Group__4__Impl3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__53245 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Field__Group__6_in_rule__Field__Group__53248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NodePathAssignment_5_in_rule__Field__Group__5__Impl3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__63305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_rule__Field__Group__6__Impl3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldMeta__Group__0__Impl_in_rule__FieldMeta__Group__03378 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__FieldMeta__Group__1_in_rule__FieldMeta__Group__03381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_L_in_rule__FieldMeta__Group__0__Impl3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldMeta__Group__1__Impl_in_rule__FieldMeta__Group__13437 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__FieldMeta__Group__2_in_rule__FieldMeta__Group__13440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldMeta__PrefixAssignment_1_in_rule__FieldMeta__Group__1__Impl3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldMeta__Group__2__Impl_in_rule__FieldMeta__Group__23497 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__FieldMeta__Group__3_in_rule__FieldMeta__Group__23500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldMeta__Group_2__0_in_rule__FieldMeta__Group__2__Impl3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldMeta__Group__3__Impl_in_rule__FieldMeta__Group__33558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_R_in_rule__FieldMeta__Group__3__Impl3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldMeta__Group_2__0__Impl_in_rule__FieldMeta__Group_2__03622 = new BitSet(new long[]{0x0000000000107FE0L});
    public static final BitSet FOLLOW_rule__FieldMeta__Group_2__1_in_rule__FieldMeta__Group_2__03625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_rule__FieldMeta__Group_2__0__Impl3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldMeta__Group_2__1__Impl_in_rule__FieldMeta__Group_2__13681 = new BitSet(new long[]{0x0000000000107FE0L});
    public static final BitSet FOLLOW_rule__FieldMeta__Group_2__2_in_rule__FieldMeta__Group_2__13684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldMeta__Group_2_1__0_in_rule__FieldMeta__Group_2__1__Impl3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldMeta__Group_2__2__Impl_in_rule__FieldMeta__Group_2__23742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_rule__FieldMeta__Group_2__2__Impl3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldMeta__Group_2_1__0__Impl_in_rule__FieldMeta__Group_2_1__03804 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__FieldMeta__Group_2_1__1_in_rule__FieldMeta__Group_2_1__03807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldMeta__ParamsAssignment_2_1_0_in_rule__FieldMeta__Group_2_1__0__Impl3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldMeta__Group_2_1__1__Impl_in_rule__FieldMeta__Group_2_1__13864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldMeta__Group_2_1_1__0_in_rule__FieldMeta__Group_2_1__1__Impl3891 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__FieldMeta__Group_2_1_1__0__Impl_in_rule__FieldMeta__Group_2_1_1__03926 = new BitSet(new long[]{0x0000000000007FE0L});
    public static final BitSet FOLLOW_rule__FieldMeta__Group_2_1_1__1_in_rule__FieldMeta__Group_2_1_1__03929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_COMMA_in_rule__FieldMeta__Group_2_1_1__0__Impl3956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldMeta__Group_2_1_1__1__Impl_in_rule__FieldMeta__Group_2_1_1__13985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldMeta__ParamsAssignment_2_1_1_1_in_rule__FieldMeta__Group_2_1_1__1__Impl4012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackName__Group__0__Impl_in_rule__PackName__Group__04046 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__PackName__Group__1_in_rule__PackName__Group__04049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__PackName__Group__0__Impl4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackName__Group__1__Impl_in_rule__PackName__Group__14105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackName__Group_1__0_in_rule__PackName__Group__1__Impl4132 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__PackName__Group_1__0__Impl_in_rule__PackName__Group_1__04167 = new BitSet(new long[]{0x0000000000007FE0L});
    public static final BitSet FOLLOW_rule__PackName__Group_1__1_in_rule__PackName__Group_1__04170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PackName__Group_1__0__Impl4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackName__Group_1__1__Impl_in_rule__PackName__Group_1__14229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__PackName__Group_1__1__Impl4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputDef_in_rule__XML2__InputAssignment_0_0_04294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackDef_in_rule__XML2__PackAssignment_0_0_14325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackDef_in_rule__XML2__PackAssignment_0_1_04356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputDef_in_rule__XML2__InputAssignment_0_1_14387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackDef_in_rule__XML2__PackAssignment_0_24418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputDef_in_rule__XML2__InputAssignment_0_34449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__XML2__TypesAssignment_1_04480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_rule__XML2__CommAssignment_1_14511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_rule__InputDef__CommentAssignment_04542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INPUT_in_rule__InputDef__InputCHARAssignment_14573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InputDef__UrlAssignment_24604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_rule__PackDef__CommentAssignment_04635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PACKAGE_in_rule__PackDef__PackCHARAssignment_14666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackName_in_rule__PackDef__PackAssignment_24697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeComment_in_rule__Type__CommentAssignment_04728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnter_in_rule__Type__EnterAssignment_14759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_TYPE_in_rule__Type__PrefixAssignment_24790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__Type__NameAssignment_34821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Type__FieldsAssignment_5_04852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_rule__Type__CommAssignment_5_14883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_MAIN_in_rule__Enter__PrefixAssignment_14914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Enter__RootPathAssignment_34945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldComment_in_rule__Field__CommentAssignment_04976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldMeta_in_rule__Field__MetaAssignment_15007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_rule__Field__TypeAssignment_25038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__Field__FieldNameAssignment_35069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Field__NodePathAssignment_55100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__FieldType__TypeAssignment5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_LIST_in_rule__FieldMeta__PrefixAssignment_15162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldMetaKey_in_rule__FieldMeta__ParamsAssignment_2_1_05193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldMetaKey_in_rule__FieldMeta__ParamsAssignment_2_1_1_15224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__FieldMetaKey__FieldNameAssignment5255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__OtherComent__CommAssignment5286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__TypesAssignment_1_0_in_synpred4_InternalCfg1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__FieldsAssignment_5_0_in_synpred5_InternalCfg1052 = new BitSet(new long[]{0x0000000000000002L});

}