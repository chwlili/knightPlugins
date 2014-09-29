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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMMENT", "RULE_C_INPUT", "RULE_C_MAIN", "RULE_C_DEFAULT", "RULE_C_TYPE", "RULE_C_ENUM", "RULE_C_INT", "RULE_C_UINT", "RULE_C_BOOL", "RULE_C_NUMBER", "RULE_C_STRING", "RULE_C_LIST", "RULE_C_SLICE", "RULE_NAME", "RULE_C_SEMICOLON", "RULE_C_BRACE_L", "RULE_C_BRACE_R", "RULE_C_BRACKET_L", "RULE_C_PAREN_L", "RULE_C_PAREN_R", "RULE_C_BRACKET_R", "RULE_C_EQUALS", "RULE_C_COMMA", "RULE_STRING", "RULE_C_PACKAGE", "RULE_C_ANGLE_L", "RULE_C_ANGLE_R", "RULE_COMMENT_END", "RULE_WS", "'.'"
    };
    public static final int RULE_C_NUMBER=13;
    public static final int RULE_C_COMMA=26;
    public static final int RULE_C_TYPE=8;
    public static final int RULE_C_PAREN_R=23;
    public static final int RULE_C_SEMICOLON=18;
    public static final int RULE_C_PAREN_L=22;
    public static final int RULE_C_INPUT=5;
    public static final int RULE_C_STRING=14;
    public static final int RULE_C_SLICE=16;
    public static final int RULE_COMMENT=4;
    public static final int RULE_C_PACKAGE=28;
    public static final int EOF=-1;
    public static final int RULE_C_ANGLE_L=29;
    public static final int RULE_C_ANGLE_R=30;
    public static final int RULE_COMMENT_END=31;
    public static final int RULE_C_BRACKET_L=21;
    public static final int RULE_STRING=27;
    public static final int T__33=33;
    public static final int RULE_C_EQUALS=25;
    public static final int RULE_C_UINT=11;
    public static final int RULE_C_BRACKET_R=24;
    public static final int RULE_C_MAIN=6;
    public static final int RULE_C_INT=10;
    public static final int RULE_NAME=17;
    public static final int RULE_WS=32;
    public static final int RULE_C_BRACE_L=19;
    public static final int RULE_C_BOOL=12;
    public static final int RULE_C_LIST=15;
    public static final int RULE_C_DEFAULT=7;
    public static final int RULE_C_ENUM=9;
    public static final int RULE_C_BRACE_R=20;

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


    // $ANTLR start "entryRuleEnum"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:341:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:342:1: ( ruleEnum EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:343:1: ruleEnum EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumRule()); 
            }
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum667);
            ruleEnum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum674); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:350:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:354:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:355:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:355:1: ( ( rule__Enum__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:356:1: ( rule__Enum__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getGroup()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:357:1: ( rule__Enum__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:357:2: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_rule__Enum__Group__0_in_ruleEnum700);
            rule__Enum__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getGroup()); 
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
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumField"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:369:1: entryRuleEnumField : ruleEnumField EOF ;
    public final void entryRuleEnumField() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:370:1: ( ruleEnumField EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:371:1: ruleEnumField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldRule()); 
            }
            pushFollow(FOLLOW_ruleEnumField_in_entryRuleEnumField727);
            ruleEnumField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumField734); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEnumField"


    // $ANTLR start "ruleEnumField"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:378:1: ruleEnumField : ( ( rule__EnumField__Group__0 ) ) ;
    public final void ruleEnumField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:382:2: ( ( ( rule__EnumField__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:383:1: ( ( rule__EnumField__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:383:1: ( ( rule__EnumField__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:384:1: ( rule__EnumField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getGroup()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:385:1: ( rule__EnumField__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:385:2: rule__EnumField__Group__0
            {
            pushFollow(FOLLOW_rule__EnumField__Group__0_in_ruleEnumField760);
            rule__EnumField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getGroup()); 
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
    // $ANTLR end "ruleEnumField"


    // $ANTLR start "entryRuleDefaultMeta"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:397:1: entryRuleDefaultMeta : ruleDefaultMeta EOF ;
    public final void entryRuleDefaultMeta() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:398:1: ( ruleDefaultMeta EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:399:1: ruleDefaultMeta EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultMetaRule()); 
            }
            pushFollow(FOLLOW_ruleDefaultMeta_in_entryRuleDefaultMeta787);
            ruleDefaultMeta();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultMetaRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultMeta794); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDefaultMeta"


    // $ANTLR start "ruleDefaultMeta"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:406:1: ruleDefaultMeta : ( ( rule__DefaultMeta__Group__0 ) ) ;
    public final void ruleDefaultMeta() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:410:2: ( ( ( rule__DefaultMeta__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:411:1: ( ( rule__DefaultMeta__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:411:1: ( ( rule__DefaultMeta__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:412:1: ( rule__DefaultMeta__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultMetaAccess().getGroup()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:413:1: ( rule__DefaultMeta__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:413:2: rule__DefaultMeta__Group__0
            {
            pushFollow(FOLLOW_rule__DefaultMeta__Group__0_in_ruleDefaultMeta820);
            rule__DefaultMeta__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultMetaAccess().getGroup()); 
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
    // $ANTLR end "ruleDefaultMeta"


    // $ANTLR start "entryRuleTypeComment"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:425:1: entryRuleTypeComment : ruleTypeComment EOF ;
    public final void entryRuleTypeComment() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:426:1: ( ruleTypeComment EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:427:1: ruleTypeComment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeCommentRule()); 
            }
            pushFollow(FOLLOW_ruleTypeComment_in_entryRuleTypeComment847);
            ruleTypeComment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeCommentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeComment854); if (state.failed) return ;

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:434:1: ruleTypeComment : ( RULE_COMMENT ) ;
    public final void ruleTypeComment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:438:2: ( ( RULE_COMMENT ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:439:1: ( RULE_COMMENT )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:439:1: ( RULE_COMMENT )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:440:1: RULE_COMMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeCommentAccess().getCOMMENTTerminalRuleCall()); 
            }
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleTypeComment880); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:453:1: entryRuleFieldComment : ruleFieldComment EOF ;
    public final void entryRuleFieldComment() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:454:1: ( ruleFieldComment EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:455:1: ruleFieldComment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldCommentRule()); 
            }
            pushFollow(FOLLOW_ruleFieldComment_in_entryRuleFieldComment906);
            ruleFieldComment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldCommentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldComment913); if (state.failed) return ;

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:462:1: ruleFieldComment : ( RULE_COMMENT ) ;
    public final void ruleFieldComment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:466:2: ( ( RULE_COMMENT ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:467:1: ( RULE_COMMENT )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:467:1: ( RULE_COMMENT )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:468:1: RULE_COMMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldCommentAccess().getCOMMENTTerminalRuleCall()); 
            }
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleFieldComment939); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:481:1: entryRuleOtherComent : ruleOtherComent EOF ;
    public final void entryRuleOtherComent() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:482:1: ( ruleOtherComent EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:483:1: ruleOtherComent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherComentRule()); 
            }
            pushFollow(FOLLOW_ruleOtherComent_in_entryRuleOtherComent965);
            ruleOtherComent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOtherComentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOtherComent972); if (state.failed) return ;

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:490:1: ruleOtherComent : ( ( rule__OtherComent__CommAssignment ) ) ;
    public final void ruleOtherComent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:494:2: ( ( ( rule__OtherComent__CommAssignment ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:495:1: ( ( rule__OtherComent__CommAssignment ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:495:1: ( ( rule__OtherComent__CommAssignment ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:496:1: ( rule__OtherComent__CommAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherComentAccess().getCommAssignment()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:497:1: ( rule__OtherComent__CommAssignment )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:497:2: rule__OtherComent__CommAssignment
            {
            pushFollow(FOLLOW_rule__OtherComent__CommAssignment_in_ruleOtherComent998);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:509:1: entryRulePackName : rulePackName EOF ;
    public final void entryRulePackName() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:510:1: ( rulePackName EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:511:1: rulePackName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackNameRule()); 
            }
            pushFollow(FOLLOW_rulePackName_in_entryRulePackName1025);
            rulePackName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackName1032); if (state.failed) return ;

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:518:1: rulePackName : ( ( rule__PackName__Group__0 ) ) ;
    public final void rulePackName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:522:2: ( ( ( rule__PackName__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:523:1: ( ( rule__PackName__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:523:1: ( ( rule__PackName__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:524:1: ( rule__PackName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackNameAccess().getGroup()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:525:1: ( rule__PackName__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:525:2: rule__PackName__Group__0
            {
            pushFollow(FOLLOW_rule__PackName__Group__0_in_rulePackName1058);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:537:1: entryRuleTypeName : ruleTypeName EOF ;
    public final void entryRuleTypeName() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:538:1: ( ruleTypeName EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:539:1: ruleTypeName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeNameRule()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_entryRuleTypeName1085);
            ruleTypeName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeName1092); if (state.failed) return ;

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:546:1: ruleTypeName : ( ( rule__TypeName__Alternatives ) ) ;
    public final void ruleTypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:550:2: ( ( ( rule__TypeName__Alternatives ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:551:1: ( ( rule__TypeName__Alternatives ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:551:1: ( ( rule__TypeName__Alternatives ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:552:1: ( rule__TypeName__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeNameAccess().getAlternatives()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:553:1: ( rule__TypeName__Alternatives )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:553:2: rule__TypeName__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeName__Alternatives_in_ruleTypeName1118);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:565:1: rule__XML2__Alternatives_0 : ( ( ( rule__XML2__Group_0_0__0 ) ) | ( ( rule__XML2__Group_0_1__0 ) ) | ( ( rule__XML2__PackAssignment_0_2 ) ) | ( ( rule__XML2__InputAssignment_0_3 ) ) );
    public final void rule__XML2__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:569:1: ( ( ( rule__XML2__Group_0_0__0 ) ) | ( ( rule__XML2__Group_0_1__0 ) ) | ( ( rule__XML2__PackAssignment_0_2 ) ) | ( ( rule__XML2__InputAssignment_0_3 ) ) )
            int alt1=4;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:570:1: ( ( rule__XML2__Group_0_0__0 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:570:1: ( ( rule__XML2__Group_0_0__0 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:571:1: ( rule__XML2__Group_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXML2Access().getGroup_0_0()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:572:1: ( rule__XML2__Group_0_0__0 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:572:2: rule__XML2__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__XML2__Group_0_0__0_in_rule__XML2__Alternatives_01154);
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
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:576:6: ( ( rule__XML2__Group_0_1__0 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:576:6: ( ( rule__XML2__Group_0_1__0 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:577:1: ( rule__XML2__Group_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXML2Access().getGroup_0_1()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:578:1: ( rule__XML2__Group_0_1__0 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:578:2: rule__XML2__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__XML2__Group_0_1__0_in_rule__XML2__Alternatives_01172);
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
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:582:6: ( ( rule__XML2__PackAssignment_0_2 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:582:6: ( ( rule__XML2__PackAssignment_0_2 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:583:1: ( rule__XML2__PackAssignment_0_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXML2Access().getPackAssignment_0_2()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:584:1: ( rule__XML2__PackAssignment_0_2 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:584:2: rule__XML2__PackAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__XML2__PackAssignment_0_2_in_rule__XML2__Alternatives_01190);
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
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:588:6: ( ( rule__XML2__InputAssignment_0_3 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:588:6: ( ( rule__XML2__InputAssignment_0_3 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:589:1: ( rule__XML2__InputAssignment_0_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXML2Access().getInputAssignment_0_3()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:590:1: ( rule__XML2__InputAssignment_0_3 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:590:2: rule__XML2__InputAssignment_0_3
                    {
                    pushFollow(FOLLOW_rule__XML2__InputAssignment_0_3_in_rule__XML2__Alternatives_01208);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:599:1: rule__XML2__Alternatives_1 : ( ( ( rule__XML2__TypesAssignment_1_0 ) ) | ( ( rule__XML2__EnumsAssignment_1_1 ) ) | ( ( rule__XML2__CommAssignment_1_2 ) ) );
    public final void rule__XML2__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:603:1: ( ( ( rule__XML2__TypesAssignment_1_0 ) ) | ( ( rule__XML2__EnumsAssignment_1_1 ) ) | ( ( rule__XML2__CommAssignment_1_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_COMMENT:
                {
                int LA2_1 = input.LA(2);

                if ( (synpred4_InternalCfg()) ) {
                    alt2=1;
                }
                else if ( (synpred5_InternalCfg()) ) {
                    alt2=2;
                }
                else if ( (true) ) {
                    alt2=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_C_TYPE:
            case RULE_C_BRACKET_L:
                {
                alt2=1;
                }
                break;
            case RULE_C_ENUM:
                {
                alt2=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:604:1: ( ( rule__XML2__TypesAssignment_1_0 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:604:1: ( ( rule__XML2__TypesAssignment_1_0 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:605:1: ( rule__XML2__TypesAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXML2Access().getTypesAssignment_1_0()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:606:1: ( rule__XML2__TypesAssignment_1_0 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:606:2: rule__XML2__TypesAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__XML2__TypesAssignment_1_0_in_rule__XML2__Alternatives_11241);
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
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:610:6: ( ( rule__XML2__EnumsAssignment_1_1 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:610:6: ( ( rule__XML2__EnumsAssignment_1_1 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:611:1: ( rule__XML2__EnumsAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXML2Access().getEnumsAssignment_1_1()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:612:1: ( rule__XML2__EnumsAssignment_1_1 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:612:2: rule__XML2__EnumsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__XML2__EnumsAssignment_1_1_in_rule__XML2__Alternatives_11259);
                    rule__XML2__EnumsAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXML2Access().getEnumsAssignment_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:616:6: ( ( rule__XML2__CommAssignment_1_2 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:616:6: ( ( rule__XML2__CommAssignment_1_2 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:617:1: ( rule__XML2__CommAssignment_1_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getXML2Access().getCommAssignment_1_2()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:618:1: ( rule__XML2__CommAssignment_1_2 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:618:2: rule__XML2__CommAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__XML2__CommAssignment_1_2_in_rule__XML2__Alternatives_11277);
                    rule__XML2__CommAssignment_1_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getXML2Access().getCommAssignment_1_2()); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:627:1: rule__Type__Alternatives_5 : ( ( ( rule__Type__FieldsAssignment_5_0 ) ) | ( ( rule__Type__CommAssignment_5_1 ) ) );
    public final void rule__Type__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:631:1: ( ( ( rule__Type__FieldsAssignment_5_0 ) ) | ( ( rule__Type__CommAssignment_5_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_COMMENT) ) {
                int LA3_1 = input.LA(2);

                if ( (synpred6_InternalCfg()) ) {
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
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:632:1: ( ( rule__Type__FieldsAssignment_5_0 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:632:1: ( ( rule__Type__FieldsAssignment_5_0 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:633:1: ( rule__Type__FieldsAssignment_5_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getFieldsAssignment_5_0()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:634:1: ( rule__Type__FieldsAssignment_5_0 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:634:2: rule__Type__FieldsAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__Type__FieldsAssignment_5_0_in_rule__Type__Alternatives_51310);
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
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:638:6: ( ( rule__Type__CommAssignment_5_1 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:638:6: ( ( rule__Type__CommAssignment_5_1 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:639:1: ( rule__Type__CommAssignment_5_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getCommAssignment_5_1()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:640:1: ( rule__Type__CommAssignment_5_1 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:640:2: rule__Type__CommAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__Type__CommAssignment_5_1_in_rule__Type__Alternatives_51328);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:649:1: rule__Field__Alternatives_1 : ( ( ( rule__Field__MetaAssignment_1_0 ) ) | ( ( rule__Field__MetaAssignment_1_1 ) ) );
    public final void rule__Field__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:653:1: ( ( ( rule__Field__MetaAssignment_1_0 ) ) | ( ( rule__Field__MetaAssignment_1_1 ) ) )
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
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:654:1: ( ( rule__Field__MetaAssignment_1_0 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:654:1: ( ( rule__Field__MetaAssignment_1_0 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:655:1: ( rule__Field__MetaAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldAccess().getMetaAssignment_1_0()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:656:1: ( rule__Field__MetaAssignment_1_0 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:656:2: rule__Field__MetaAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Field__MetaAssignment_1_0_in_rule__Field__Alternatives_11361);
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
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:660:6: ( ( rule__Field__MetaAssignment_1_1 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:660:6: ( ( rule__Field__MetaAssignment_1_1 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:661:1: ( rule__Field__MetaAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFieldAccess().getMetaAssignment_1_1()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:662:1: ( rule__Field__MetaAssignment_1_1 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:662:2: rule__Field__MetaAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Field__MetaAssignment_1_1_in_rule__Field__Alternatives_11379);
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


    // $ANTLR start "rule__Enum__Alternatives_4"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:671:1: rule__Enum__Alternatives_4 : ( ( ( rule__Enum__FieldsAssignment_4_0 ) ) | ( ( rule__Enum__CommAssignment_4_1 ) ) );
    public final void rule__Enum__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:675:1: ( ( ( rule__Enum__FieldsAssignment_4_0 ) ) | ( ( rule__Enum__CommAssignment_4_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_COMMENT) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred8_InternalCfg()) ) {
                    alt5=1;
                }
                else if ( (true) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA5_0>=RULE_C_INPUT && LA5_0<=RULE_NAME)||LA5_0==RULE_C_BRACKET_L) ) {
                alt5=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:676:1: ( ( rule__Enum__FieldsAssignment_4_0 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:676:1: ( ( rule__Enum__FieldsAssignment_4_0 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:677:1: ( rule__Enum__FieldsAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnumAccess().getFieldsAssignment_4_0()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:678:1: ( rule__Enum__FieldsAssignment_4_0 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:678:2: rule__Enum__FieldsAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__Enum__FieldsAssignment_4_0_in_rule__Enum__Alternatives_41412);
                    rule__Enum__FieldsAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEnumAccess().getFieldsAssignment_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:682:6: ( ( rule__Enum__CommAssignment_4_1 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:682:6: ( ( rule__Enum__CommAssignment_4_1 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:683:1: ( rule__Enum__CommAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEnumAccess().getCommAssignment_4_1()); 
                    }
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:684:1: ( rule__Enum__CommAssignment_4_1 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:684:2: rule__Enum__CommAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__Enum__CommAssignment_4_1_in_rule__Enum__Alternatives_41430);
                    rule__Enum__CommAssignment_4_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEnumAccess().getCommAssignment_4_1()); 
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
    // $ANTLR end "rule__Enum__Alternatives_4"


    // $ANTLR start "rule__TypeName__Alternatives"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:693:1: rule__TypeName__Alternatives : ( ( RULE_C_INPUT ) | ( RULE_C_MAIN ) | ( RULE_C_DEFAULT ) | ( RULE_C_TYPE ) | ( RULE_C_ENUM ) | ( RULE_C_INT ) | ( RULE_C_UINT ) | ( RULE_C_BOOL ) | ( RULE_C_NUMBER ) | ( RULE_C_STRING ) | ( RULE_C_LIST ) | ( RULE_C_SLICE ) | ( RULE_NAME ) );
    public final void rule__TypeName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:697:1: ( ( RULE_C_INPUT ) | ( RULE_C_MAIN ) | ( RULE_C_DEFAULT ) | ( RULE_C_TYPE ) | ( RULE_C_ENUM ) | ( RULE_C_INT ) | ( RULE_C_UINT ) | ( RULE_C_BOOL ) | ( RULE_C_NUMBER ) | ( RULE_C_STRING ) | ( RULE_C_LIST ) | ( RULE_C_SLICE ) | ( RULE_NAME ) )
            int alt6=13;
            switch ( input.LA(1) ) {
            case RULE_C_INPUT:
                {
                alt6=1;
                }
                break;
            case RULE_C_MAIN:
                {
                alt6=2;
                }
                break;
            case RULE_C_DEFAULT:
                {
                alt6=3;
                }
                break;
            case RULE_C_TYPE:
                {
                alt6=4;
                }
                break;
            case RULE_C_ENUM:
                {
                alt6=5;
                }
                break;
            case RULE_C_INT:
                {
                alt6=6;
                }
                break;
            case RULE_C_UINT:
                {
                alt6=7;
                }
                break;
            case RULE_C_BOOL:
                {
                alt6=8;
                }
                break;
            case RULE_C_NUMBER:
                {
                alt6=9;
                }
                break;
            case RULE_C_STRING:
                {
                alt6=10;
                }
                break;
            case RULE_C_LIST:
                {
                alt6=11;
                }
                break;
            case RULE_C_SLICE:
                {
                alt6=12;
                }
                break;
            case RULE_NAME:
                {
                alt6=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:698:1: ( RULE_C_INPUT )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:698:1: ( RULE_C_INPUT )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:699:1: RULE_C_INPUT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_INPUTTerminalRuleCall_0()); 
                    }
                    match(input,RULE_C_INPUT,FOLLOW_RULE_C_INPUT_in_rule__TypeName__Alternatives1463); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_INPUTTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:704:6: ( RULE_C_MAIN )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:704:6: ( RULE_C_MAIN )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:705:1: RULE_C_MAIN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_MAINTerminalRuleCall_1()); 
                    }
                    match(input,RULE_C_MAIN,FOLLOW_RULE_C_MAIN_in_rule__TypeName__Alternatives1480); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_MAINTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:710:6: ( RULE_C_DEFAULT )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:710:6: ( RULE_C_DEFAULT )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:711:1: RULE_C_DEFAULT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_DEFAULTTerminalRuleCall_2()); 
                    }
                    match(input,RULE_C_DEFAULT,FOLLOW_RULE_C_DEFAULT_in_rule__TypeName__Alternatives1497); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_DEFAULTTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:716:6: ( RULE_C_TYPE )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:716:6: ( RULE_C_TYPE )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:717:1: RULE_C_TYPE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_TYPETerminalRuleCall_3()); 
                    }
                    match(input,RULE_C_TYPE,FOLLOW_RULE_C_TYPE_in_rule__TypeName__Alternatives1514); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_TYPETerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:722:6: ( RULE_C_ENUM )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:722:6: ( RULE_C_ENUM )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:723:1: RULE_C_ENUM
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_ENUMTerminalRuleCall_4()); 
                    }
                    match(input,RULE_C_ENUM,FOLLOW_RULE_C_ENUM_in_rule__TypeName__Alternatives1531); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_ENUMTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:728:6: ( RULE_C_INT )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:728:6: ( RULE_C_INT )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:729:1: RULE_C_INT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_INTTerminalRuleCall_5()); 
                    }
                    match(input,RULE_C_INT,FOLLOW_RULE_C_INT_in_rule__TypeName__Alternatives1548); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_INTTerminalRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:734:6: ( RULE_C_UINT )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:734:6: ( RULE_C_UINT )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:735:1: RULE_C_UINT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_UINTTerminalRuleCall_6()); 
                    }
                    match(input,RULE_C_UINT,FOLLOW_RULE_C_UINT_in_rule__TypeName__Alternatives1565); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_UINTTerminalRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:740:6: ( RULE_C_BOOL )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:740:6: ( RULE_C_BOOL )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:741:1: RULE_C_BOOL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_BOOLTerminalRuleCall_7()); 
                    }
                    match(input,RULE_C_BOOL,FOLLOW_RULE_C_BOOL_in_rule__TypeName__Alternatives1582); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_BOOLTerminalRuleCall_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:746:6: ( RULE_C_NUMBER )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:746:6: ( RULE_C_NUMBER )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:747:1: RULE_C_NUMBER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_NUMBERTerminalRuleCall_8()); 
                    }
                    match(input,RULE_C_NUMBER,FOLLOW_RULE_C_NUMBER_in_rule__TypeName__Alternatives1599); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_NUMBERTerminalRuleCall_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:752:6: ( RULE_C_STRING )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:752:6: ( RULE_C_STRING )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:753:1: RULE_C_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_STRINGTerminalRuleCall_9()); 
                    }
                    match(input,RULE_C_STRING,FOLLOW_RULE_C_STRING_in_rule__TypeName__Alternatives1616); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_STRINGTerminalRuleCall_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:758:6: ( RULE_C_LIST )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:758:6: ( RULE_C_LIST )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:759:1: RULE_C_LIST
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_LISTTerminalRuleCall_10()); 
                    }
                    match(input,RULE_C_LIST,FOLLOW_RULE_C_LIST_in_rule__TypeName__Alternatives1633); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_LISTTerminalRuleCall_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:764:6: ( RULE_C_SLICE )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:764:6: ( RULE_C_SLICE )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:765:1: RULE_C_SLICE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getC_SLICETerminalRuleCall_11()); 
                    }
                    match(input,RULE_C_SLICE,FOLLOW_RULE_C_SLICE_in_rule__TypeName__Alternatives1650); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getC_SLICETerminalRuleCall_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:770:6: ( RULE_NAME )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:770:6: ( RULE_NAME )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:771:1: RULE_NAME
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeNameAccess().getNAMETerminalRuleCall_12()); 
                    }
                    match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rule__TypeName__Alternatives1667); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeNameAccess().getNAMETerminalRuleCall_12()); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:783:1: rule__XML2__Group__0 : rule__XML2__Group__0__Impl rule__XML2__Group__1 ;
    public final void rule__XML2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:787:1: ( rule__XML2__Group__0__Impl rule__XML2__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:788:2: rule__XML2__Group__0__Impl rule__XML2__Group__1
            {
            pushFollow(FOLLOW_rule__XML2__Group__0__Impl_in_rule__XML2__Group__01697);
            rule__XML2__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__XML2__Group__1_in_rule__XML2__Group__01700);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:795:1: rule__XML2__Group__0__Impl : ( ( rule__XML2__Alternatives_0 ) ) ;
    public final void rule__XML2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:799:1: ( ( ( rule__XML2__Alternatives_0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:800:1: ( ( rule__XML2__Alternatives_0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:800:1: ( ( rule__XML2__Alternatives_0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:801:1: ( rule__XML2__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getAlternatives_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:802:1: ( rule__XML2__Alternatives_0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:802:2: rule__XML2__Alternatives_0
            {
            pushFollow(FOLLOW_rule__XML2__Alternatives_0_in_rule__XML2__Group__0__Impl1727);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:812:1: rule__XML2__Group__1 : rule__XML2__Group__1__Impl ;
    public final void rule__XML2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:816:1: ( rule__XML2__Group__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:817:2: rule__XML2__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__XML2__Group__1__Impl_in_rule__XML2__Group__11757);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:823:1: rule__XML2__Group__1__Impl : ( ( rule__XML2__Alternatives_1 )* ) ;
    public final void rule__XML2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:827:1: ( ( ( rule__XML2__Alternatives_1 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:828:1: ( ( rule__XML2__Alternatives_1 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:828:1: ( ( rule__XML2__Alternatives_1 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:829:1: ( rule__XML2__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getAlternatives_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:830:1: ( rule__XML2__Alternatives_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_COMMENT||(LA7_0>=RULE_C_TYPE && LA7_0<=RULE_C_ENUM)||LA7_0==RULE_C_BRACKET_L) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:830:2: rule__XML2__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__XML2__Alternatives_1_in_rule__XML2__Group__1__Impl1784);
            	    rule__XML2__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:844:1: rule__XML2__Group_0_0__0 : rule__XML2__Group_0_0__0__Impl rule__XML2__Group_0_0__1 ;
    public final void rule__XML2__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:848:1: ( rule__XML2__Group_0_0__0__Impl rule__XML2__Group_0_0__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:849:2: rule__XML2__Group_0_0__0__Impl rule__XML2__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__XML2__Group_0_0__0__Impl_in_rule__XML2__Group_0_0__01819);
            rule__XML2__Group_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__XML2__Group_0_0__1_in_rule__XML2__Group_0_0__01822);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:856:1: rule__XML2__Group_0_0__0__Impl : ( ( rule__XML2__InputAssignment_0_0_0 ) ) ;
    public final void rule__XML2__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:860:1: ( ( ( rule__XML2__InputAssignment_0_0_0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:861:1: ( ( rule__XML2__InputAssignment_0_0_0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:861:1: ( ( rule__XML2__InputAssignment_0_0_0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:862:1: ( rule__XML2__InputAssignment_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getInputAssignment_0_0_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:863:1: ( rule__XML2__InputAssignment_0_0_0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:863:2: rule__XML2__InputAssignment_0_0_0
            {
            pushFollow(FOLLOW_rule__XML2__InputAssignment_0_0_0_in_rule__XML2__Group_0_0__0__Impl1849);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:873:1: rule__XML2__Group_0_0__1 : rule__XML2__Group_0_0__1__Impl ;
    public final void rule__XML2__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:877:1: ( rule__XML2__Group_0_0__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:878:2: rule__XML2__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__XML2__Group_0_0__1__Impl_in_rule__XML2__Group_0_0__11879);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:884:1: rule__XML2__Group_0_0__1__Impl : ( ( rule__XML2__PackAssignment_0_0_1 ) ) ;
    public final void rule__XML2__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:888:1: ( ( ( rule__XML2__PackAssignment_0_0_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:889:1: ( ( rule__XML2__PackAssignment_0_0_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:889:1: ( ( rule__XML2__PackAssignment_0_0_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:890:1: ( rule__XML2__PackAssignment_0_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getPackAssignment_0_0_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:891:1: ( rule__XML2__PackAssignment_0_0_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:891:2: rule__XML2__PackAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__XML2__PackAssignment_0_0_1_in_rule__XML2__Group_0_0__1__Impl1906);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:905:1: rule__XML2__Group_0_1__0 : rule__XML2__Group_0_1__0__Impl rule__XML2__Group_0_1__1 ;
    public final void rule__XML2__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:909:1: ( rule__XML2__Group_0_1__0__Impl rule__XML2__Group_0_1__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:910:2: rule__XML2__Group_0_1__0__Impl rule__XML2__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__XML2__Group_0_1__0__Impl_in_rule__XML2__Group_0_1__01940);
            rule__XML2__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__XML2__Group_0_1__1_in_rule__XML2__Group_0_1__01943);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:917:1: rule__XML2__Group_0_1__0__Impl : ( ( rule__XML2__PackAssignment_0_1_0 ) ) ;
    public final void rule__XML2__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:921:1: ( ( ( rule__XML2__PackAssignment_0_1_0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:922:1: ( ( rule__XML2__PackAssignment_0_1_0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:922:1: ( ( rule__XML2__PackAssignment_0_1_0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:923:1: ( rule__XML2__PackAssignment_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getPackAssignment_0_1_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:924:1: ( rule__XML2__PackAssignment_0_1_0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:924:2: rule__XML2__PackAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__XML2__PackAssignment_0_1_0_in_rule__XML2__Group_0_1__0__Impl1970);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:934:1: rule__XML2__Group_0_1__1 : rule__XML2__Group_0_1__1__Impl ;
    public final void rule__XML2__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:938:1: ( rule__XML2__Group_0_1__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:939:2: rule__XML2__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__XML2__Group_0_1__1__Impl_in_rule__XML2__Group_0_1__12000);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:945:1: rule__XML2__Group_0_1__1__Impl : ( ( rule__XML2__InputAssignment_0_1_1 ) ) ;
    public final void rule__XML2__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:949:1: ( ( ( rule__XML2__InputAssignment_0_1_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:950:1: ( ( rule__XML2__InputAssignment_0_1_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:950:1: ( ( rule__XML2__InputAssignment_0_1_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:951:1: ( rule__XML2__InputAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getInputAssignment_0_1_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:952:1: ( rule__XML2__InputAssignment_0_1_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:952:2: rule__XML2__InputAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__XML2__InputAssignment_0_1_1_in_rule__XML2__Group_0_1__1__Impl2027);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:966:1: rule__InputDef__Group__0 : rule__InputDef__Group__0__Impl rule__InputDef__Group__1 ;
    public final void rule__InputDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:970:1: ( rule__InputDef__Group__0__Impl rule__InputDef__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:971:2: rule__InputDef__Group__0__Impl rule__InputDef__Group__1
            {
            pushFollow(FOLLOW_rule__InputDef__Group__0__Impl_in_rule__InputDef__Group__02061);
            rule__InputDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__InputDef__Group__1_in_rule__InputDef__Group__02064);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:978:1: rule__InputDef__Group__0__Impl : ( ( rule__InputDef__CommentAssignment_0 )* ) ;
    public final void rule__InputDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:982:1: ( ( ( rule__InputDef__CommentAssignment_0 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:983:1: ( ( rule__InputDef__CommentAssignment_0 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:983:1: ( ( rule__InputDef__CommentAssignment_0 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:984:1: ( rule__InputDef__CommentAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputDefAccess().getCommentAssignment_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:985:1: ( rule__InputDef__CommentAssignment_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMENT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:985:2: rule__InputDef__CommentAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__InputDef__CommentAssignment_0_in_rule__InputDef__Group__0__Impl2091);
            	    rule__InputDef__CommentAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:995:1: rule__InputDef__Group__1 : rule__InputDef__Group__1__Impl rule__InputDef__Group__2 ;
    public final void rule__InputDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:999:1: ( rule__InputDef__Group__1__Impl rule__InputDef__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1000:2: rule__InputDef__Group__1__Impl rule__InputDef__Group__2
            {
            pushFollow(FOLLOW_rule__InputDef__Group__1__Impl_in_rule__InputDef__Group__12122);
            rule__InputDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__InputDef__Group__2_in_rule__InputDef__Group__12125);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1007:1: rule__InputDef__Group__1__Impl : ( ( rule__InputDef__InputCHARAssignment_1 ) ) ;
    public final void rule__InputDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1011:1: ( ( ( rule__InputDef__InputCHARAssignment_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1012:1: ( ( rule__InputDef__InputCHARAssignment_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1012:1: ( ( rule__InputDef__InputCHARAssignment_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1013:1: ( rule__InputDef__InputCHARAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputDefAccess().getInputCHARAssignment_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1014:1: ( rule__InputDef__InputCHARAssignment_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1014:2: rule__InputDef__InputCHARAssignment_1
            {
            pushFollow(FOLLOW_rule__InputDef__InputCHARAssignment_1_in_rule__InputDef__Group__1__Impl2152);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1024:1: rule__InputDef__Group__2 : rule__InputDef__Group__2__Impl rule__InputDef__Group__3 ;
    public final void rule__InputDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1028:1: ( rule__InputDef__Group__2__Impl rule__InputDef__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1029:2: rule__InputDef__Group__2__Impl rule__InputDef__Group__3
            {
            pushFollow(FOLLOW_rule__InputDef__Group__2__Impl_in_rule__InputDef__Group__22182);
            rule__InputDef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__InputDef__Group__3_in_rule__InputDef__Group__22185);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1036:1: rule__InputDef__Group__2__Impl : ( ( rule__InputDef__UrlAssignment_2 ) ) ;
    public final void rule__InputDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1040:1: ( ( ( rule__InputDef__UrlAssignment_2 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1041:1: ( ( rule__InputDef__UrlAssignment_2 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1041:1: ( ( rule__InputDef__UrlAssignment_2 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1042:1: ( rule__InputDef__UrlAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputDefAccess().getUrlAssignment_2()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1043:1: ( rule__InputDef__UrlAssignment_2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1043:2: rule__InputDef__UrlAssignment_2
            {
            pushFollow(FOLLOW_rule__InputDef__UrlAssignment_2_in_rule__InputDef__Group__2__Impl2212);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1053:1: rule__InputDef__Group__3 : rule__InputDef__Group__3__Impl ;
    public final void rule__InputDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1057:1: ( rule__InputDef__Group__3__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1058:2: rule__InputDef__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__InputDef__Group__3__Impl_in_rule__InputDef__Group__32242);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1064:1: rule__InputDef__Group__3__Impl : ( ( RULE_C_SEMICOLON )? ) ;
    public final void rule__InputDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1068:1: ( ( ( RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1069:1: ( ( RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1069:1: ( ( RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1070:1: ( RULE_C_SEMICOLON )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputDefAccess().getC_SEMICOLONTerminalRuleCall_3()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1071:1: ( RULE_C_SEMICOLON )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_C_SEMICOLON) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1071:3: RULE_C_SEMICOLON
                    {
                    match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_rule__InputDef__Group__3__Impl2270); if (state.failed) return ;

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1089:1: rule__PackDef__Group__0 : rule__PackDef__Group__0__Impl rule__PackDef__Group__1 ;
    public final void rule__PackDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1093:1: ( rule__PackDef__Group__0__Impl rule__PackDef__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1094:2: rule__PackDef__Group__0__Impl rule__PackDef__Group__1
            {
            pushFollow(FOLLOW_rule__PackDef__Group__0__Impl_in_rule__PackDef__Group__02309);
            rule__PackDef__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackDef__Group__1_in_rule__PackDef__Group__02312);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1101:1: rule__PackDef__Group__0__Impl : ( ( rule__PackDef__CommentAssignment_0 )* ) ;
    public final void rule__PackDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1105:1: ( ( ( rule__PackDef__CommentAssignment_0 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1106:1: ( ( rule__PackDef__CommentAssignment_0 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1106:1: ( ( rule__PackDef__CommentAssignment_0 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1107:1: ( rule__PackDef__CommentAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackDefAccess().getCommentAssignment_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1108:1: ( rule__PackDef__CommentAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_COMMENT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1108:2: rule__PackDef__CommentAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__PackDef__CommentAssignment_0_in_rule__PackDef__Group__0__Impl2339);
            	    rule__PackDef__CommentAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1118:1: rule__PackDef__Group__1 : rule__PackDef__Group__1__Impl rule__PackDef__Group__2 ;
    public final void rule__PackDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1122:1: ( rule__PackDef__Group__1__Impl rule__PackDef__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1123:2: rule__PackDef__Group__1__Impl rule__PackDef__Group__2
            {
            pushFollow(FOLLOW_rule__PackDef__Group__1__Impl_in_rule__PackDef__Group__12370);
            rule__PackDef__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackDef__Group__2_in_rule__PackDef__Group__12373);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1130:1: rule__PackDef__Group__1__Impl : ( ( rule__PackDef__PackCHARAssignment_1 ) ) ;
    public final void rule__PackDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1134:1: ( ( ( rule__PackDef__PackCHARAssignment_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1135:1: ( ( rule__PackDef__PackCHARAssignment_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1135:1: ( ( rule__PackDef__PackCHARAssignment_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1136:1: ( rule__PackDef__PackCHARAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackDefAccess().getPackCHARAssignment_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1137:1: ( rule__PackDef__PackCHARAssignment_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1137:2: rule__PackDef__PackCHARAssignment_1
            {
            pushFollow(FOLLOW_rule__PackDef__PackCHARAssignment_1_in_rule__PackDef__Group__1__Impl2400);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1147:1: rule__PackDef__Group__2 : rule__PackDef__Group__2__Impl rule__PackDef__Group__3 ;
    public final void rule__PackDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1151:1: ( rule__PackDef__Group__2__Impl rule__PackDef__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1152:2: rule__PackDef__Group__2__Impl rule__PackDef__Group__3
            {
            pushFollow(FOLLOW_rule__PackDef__Group__2__Impl_in_rule__PackDef__Group__22430);
            rule__PackDef__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackDef__Group__3_in_rule__PackDef__Group__22433);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1159:1: rule__PackDef__Group__2__Impl : ( ( rule__PackDef__PackAssignment_2 )? ) ;
    public final void rule__PackDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1163:1: ( ( ( rule__PackDef__PackAssignment_2 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1164:1: ( ( rule__PackDef__PackAssignment_2 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1164:1: ( ( rule__PackDef__PackAssignment_2 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1165:1: ( rule__PackDef__PackAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackDefAccess().getPackAssignment_2()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1166:1: ( rule__PackDef__PackAssignment_2 )?
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1166:2: rule__PackDef__PackAssignment_2
                    {
                    pushFollow(FOLLOW_rule__PackDef__PackAssignment_2_in_rule__PackDef__Group__2__Impl2460);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1176:1: rule__PackDef__Group__3 : rule__PackDef__Group__3__Impl ;
    public final void rule__PackDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1180:1: ( rule__PackDef__Group__3__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1181:2: rule__PackDef__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PackDef__Group__3__Impl_in_rule__PackDef__Group__32491);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1187:1: rule__PackDef__Group__3__Impl : ( ( RULE_C_SEMICOLON )? ) ;
    public final void rule__PackDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1191:1: ( ( ( RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1192:1: ( ( RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1192:1: ( ( RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1193:1: ( RULE_C_SEMICOLON )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackDefAccess().getC_SEMICOLONTerminalRuleCall_3()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1194:1: ( RULE_C_SEMICOLON )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_C_SEMICOLON) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1194:3: RULE_C_SEMICOLON
                    {
                    match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_rule__PackDef__Group__3__Impl2519); if (state.failed) return ;

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1212:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1216:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1217:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__02558);
            rule__Type__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__02561);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1224:1: rule__Type__Group__0__Impl : ( ( rule__Type__CommentAssignment_0 )? ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1228:1: ( ( ( rule__Type__CommentAssignment_0 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1229:1: ( ( rule__Type__CommentAssignment_0 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1229:1: ( ( rule__Type__CommentAssignment_0 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1230:1: ( rule__Type__CommentAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getCommentAssignment_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1231:1: ( rule__Type__CommentAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_COMMENT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1231:2: rule__Type__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type__CommentAssignment_0_in_rule__Type__Group__0__Impl2588);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1241:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1245:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1246:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__12619);
            rule__Type__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__2_in_rule__Type__Group__12622);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1253:1: rule__Type__Group__1__Impl : ( ( rule__Type__EnterAssignment_1 )? ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1257:1: ( ( ( rule__Type__EnterAssignment_1 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1258:1: ( ( rule__Type__EnterAssignment_1 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1258:1: ( ( rule__Type__EnterAssignment_1 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1259:1: ( rule__Type__EnterAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getEnterAssignment_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1260:1: ( rule__Type__EnterAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_C_BRACKET_L) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1260:2: rule__Type__EnterAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Type__EnterAssignment_1_in_rule__Type__Group__1__Impl2649);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1270:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1274:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1275:2: rule__Type__Group__2__Impl rule__Type__Group__3
            {
            pushFollow(FOLLOW_rule__Type__Group__2__Impl_in_rule__Type__Group__22680);
            rule__Type__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__3_in_rule__Type__Group__22683);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1282:1: rule__Type__Group__2__Impl : ( ( rule__Type__PrefixAssignment_2 ) ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1286:1: ( ( ( rule__Type__PrefixAssignment_2 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1287:1: ( ( rule__Type__PrefixAssignment_2 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1287:1: ( ( rule__Type__PrefixAssignment_2 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1288:1: ( rule__Type__PrefixAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getPrefixAssignment_2()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1289:1: ( rule__Type__PrefixAssignment_2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1289:2: rule__Type__PrefixAssignment_2
            {
            pushFollow(FOLLOW_rule__Type__PrefixAssignment_2_in_rule__Type__Group__2__Impl2710);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1299:1: rule__Type__Group__3 : rule__Type__Group__3__Impl rule__Type__Group__4 ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1303:1: ( rule__Type__Group__3__Impl rule__Type__Group__4 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1304:2: rule__Type__Group__3__Impl rule__Type__Group__4
            {
            pushFollow(FOLLOW_rule__Type__Group__3__Impl_in_rule__Type__Group__32740);
            rule__Type__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__4_in_rule__Type__Group__32743);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1311:1: rule__Type__Group__3__Impl : ( ( rule__Type__NameAssignment_3 ) ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1315:1: ( ( ( rule__Type__NameAssignment_3 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1316:1: ( ( rule__Type__NameAssignment_3 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1316:1: ( ( rule__Type__NameAssignment_3 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1317:1: ( rule__Type__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getNameAssignment_3()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1318:1: ( rule__Type__NameAssignment_3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1318:2: rule__Type__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Type__NameAssignment_3_in_rule__Type__Group__3__Impl2770);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1328:1: rule__Type__Group__4 : rule__Type__Group__4__Impl rule__Type__Group__5 ;
    public final void rule__Type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1332:1: ( rule__Type__Group__4__Impl rule__Type__Group__5 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1333:2: rule__Type__Group__4__Impl rule__Type__Group__5
            {
            pushFollow(FOLLOW_rule__Type__Group__4__Impl_in_rule__Type__Group__42800);
            rule__Type__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__5_in_rule__Type__Group__42803);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1340:1: rule__Type__Group__4__Impl : ( RULE_C_BRACE_L ) ;
    public final void rule__Type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1344:1: ( ( RULE_C_BRACE_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1345:1: ( RULE_C_BRACE_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1345:1: ( RULE_C_BRACE_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1346:1: RULE_C_BRACE_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getC_BRACE_LTerminalRuleCall_4()); 
            }
            match(input,RULE_C_BRACE_L,FOLLOW_RULE_C_BRACE_L_in_rule__Type__Group__4__Impl2830); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1357:1: rule__Type__Group__5 : rule__Type__Group__5__Impl rule__Type__Group__6 ;
    public final void rule__Type__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1361:1: ( rule__Type__Group__5__Impl rule__Type__Group__6 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1362:2: rule__Type__Group__5__Impl rule__Type__Group__6
            {
            pushFollow(FOLLOW_rule__Type__Group__5__Impl_in_rule__Type__Group__52859);
            rule__Type__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Type__Group__6_in_rule__Type__Group__52862);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1369:1: rule__Type__Group__5__Impl : ( ( rule__Type__Alternatives_5 )* ) ;
    public final void rule__Type__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1373:1: ( ( ( rule__Type__Alternatives_5 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1374:1: ( ( rule__Type__Alternatives_5 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1374:1: ( ( rule__Type__Alternatives_5 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1375:1: ( rule__Type__Alternatives_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives_5()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1376:1: ( rule__Type__Alternatives_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_COMMENT && LA15_0<=RULE_NAME)||LA15_0==RULE_C_BRACKET_L) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1376:2: rule__Type__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_rule__Type__Alternatives_5_in_rule__Type__Group__5__Impl2889);
            	    rule__Type__Alternatives_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1386:1: rule__Type__Group__6 : rule__Type__Group__6__Impl ;
    public final void rule__Type__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1390:1: ( rule__Type__Group__6__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1391:2: rule__Type__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__6__Impl_in_rule__Type__Group__62920);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1397:1: rule__Type__Group__6__Impl : ( RULE_C_BRACE_R ) ;
    public final void rule__Type__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1401:1: ( ( RULE_C_BRACE_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1402:1: ( RULE_C_BRACE_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1402:1: ( RULE_C_BRACE_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1403:1: RULE_C_BRACE_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getC_BRACE_RTerminalRuleCall_6()); 
            }
            match(input,RULE_C_BRACE_R,FOLLOW_RULE_C_BRACE_R_in_rule__Type__Group__6__Impl2947); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1428:1: rule__Enter__Group__0 : rule__Enter__Group__0__Impl rule__Enter__Group__1 ;
    public final void rule__Enter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1432:1: ( rule__Enter__Group__0__Impl rule__Enter__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1433:2: rule__Enter__Group__0__Impl rule__Enter__Group__1
            {
            pushFollow(FOLLOW_rule__Enter__Group__0__Impl_in_rule__Enter__Group__02990);
            rule__Enter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enter__Group__1_in_rule__Enter__Group__02993);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1440:1: rule__Enter__Group__0__Impl : ( RULE_C_BRACKET_L ) ;
    public final void rule__Enter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1444:1: ( ( RULE_C_BRACKET_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1445:1: ( RULE_C_BRACKET_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1445:1: ( RULE_C_BRACKET_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1446:1: RULE_C_BRACKET_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getC_BRACKET_LTerminalRuleCall_0()); 
            }
            match(input,RULE_C_BRACKET_L,FOLLOW_RULE_C_BRACKET_L_in_rule__Enter__Group__0__Impl3020); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1457:1: rule__Enter__Group__1 : rule__Enter__Group__1__Impl rule__Enter__Group__2 ;
    public final void rule__Enter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1461:1: ( rule__Enter__Group__1__Impl rule__Enter__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1462:2: rule__Enter__Group__1__Impl rule__Enter__Group__2
            {
            pushFollow(FOLLOW_rule__Enter__Group__1__Impl_in_rule__Enter__Group__13049);
            rule__Enter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enter__Group__2_in_rule__Enter__Group__13052);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1469:1: rule__Enter__Group__1__Impl : ( ( rule__Enter__PrefixAssignment_1 ) ) ;
    public final void rule__Enter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1473:1: ( ( ( rule__Enter__PrefixAssignment_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1474:1: ( ( rule__Enter__PrefixAssignment_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1474:1: ( ( rule__Enter__PrefixAssignment_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1475:1: ( rule__Enter__PrefixAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getPrefixAssignment_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1476:1: ( rule__Enter__PrefixAssignment_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1476:2: rule__Enter__PrefixAssignment_1
            {
            pushFollow(FOLLOW_rule__Enter__PrefixAssignment_1_in_rule__Enter__Group__1__Impl3079);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1486:1: rule__Enter__Group__2 : rule__Enter__Group__2__Impl rule__Enter__Group__3 ;
    public final void rule__Enter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1490:1: ( rule__Enter__Group__2__Impl rule__Enter__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1491:2: rule__Enter__Group__2__Impl rule__Enter__Group__3
            {
            pushFollow(FOLLOW_rule__Enter__Group__2__Impl_in_rule__Enter__Group__23109);
            rule__Enter__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enter__Group__3_in_rule__Enter__Group__23112);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1498:1: rule__Enter__Group__2__Impl : ( RULE_C_PAREN_L ) ;
    public final void rule__Enter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1502:1: ( ( RULE_C_PAREN_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1503:1: ( RULE_C_PAREN_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1503:1: ( RULE_C_PAREN_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1504:1: RULE_C_PAREN_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getC_PAREN_LTerminalRuleCall_2()); 
            }
            match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_rule__Enter__Group__2__Impl3139); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1515:1: rule__Enter__Group__3 : rule__Enter__Group__3__Impl rule__Enter__Group__4 ;
    public final void rule__Enter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1519:1: ( rule__Enter__Group__3__Impl rule__Enter__Group__4 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1520:2: rule__Enter__Group__3__Impl rule__Enter__Group__4
            {
            pushFollow(FOLLOW_rule__Enter__Group__3__Impl_in_rule__Enter__Group__33168);
            rule__Enter__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enter__Group__4_in_rule__Enter__Group__33171);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1527:1: rule__Enter__Group__3__Impl : ( ( rule__Enter__RootPathAssignment_3 ) ) ;
    public final void rule__Enter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1531:1: ( ( ( rule__Enter__RootPathAssignment_3 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1532:1: ( ( rule__Enter__RootPathAssignment_3 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1532:1: ( ( rule__Enter__RootPathAssignment_3 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1533:1: ( rule__Enter__RootPathAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getRootPathAssignment_3()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1534:1: ( rule__Enter__RootPathAssignment_3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1534:2: rule__Enter__RootPathAssignment_3
            {
            pushFollow(FOLLOW_rule__Enter__RootPathAssignment_3_in_rule__Enter__Group__3__Impl3198);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1544:1: rule__Enter__Group__4 : rule__Enter__Group__4__Impl rule__Enter__Group__5 ;
    public final void rule__Enter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1548:1: ( rule__Enter__Group__4__Impl rule__Enter__Group__5 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1549:2: rule__Enter__Group__4__Impl rule__Enter__Group__5
            {
            pushFollow(FOLLOW_rule__Enter__Group__4__Impl_in_rule__Enter__Group__43228);
            rule__Enter__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enter__Group__5_in_rule__Enter__Group__43231);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1556:1: rule__Enter__Group__4__Impl : ( RULE_C_PAREN_R ) ;
    public final void rule__Enter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1560:1: ( ( RULE_C_PAREN_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1561:1: ( RULE_C_PAREN_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1561:1: ( RULE_C_PAREN_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1562:1: RULE_C_PAREN_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getC_PAREN_RTerminalRuleCall_4()); 
            }
            match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_rule__Enter__Group__4__Impl3258); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1573:1: rule__Enter__Group__5 : rule__Enter__Group__5__Impl ;
    public final void rule__Enter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1577:1: ( rule__Enter__Group__5__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1578:2: rule__Enter__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Enter__Group__5__Impl_in_rule__Enter__Group__53287);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1584:1: rule__Enter__Group__5__Impl : ( RULE_C_BRACKET_R ) ;
    public final void rule__Enter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1588:1: ( ( RULE_C_BRACKET_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1589:1: ( RULE_C_BRACKET_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1589:1: ( RULE_C_BRACKET_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1590:1: RULE_C_BRACKET_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getC_BRACKET_RTerminalRuleCall_5()); 
            }
            match(input,RULE_C_BRACKET_R,FOLLOW_RULE_C_BRACKET_R_in_rule__Enter__Group__5__Impl3314); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1613:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1617:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1618:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__03355);
            rule__Field__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__03358);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1625:1: rule__Field__Group__0__Impl : ( ( rule__Field__CommentAssignment_0 )? ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1629:1: ( ( ( rule__Field__CommentAssignment_0 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1630:1: ( ( rule__Field__CommentAssignment_0 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1630:1: ( ( rule__Field__CommentAssignment_0 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1631:1: ( rule__Field__CommentAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getCommentAssignment_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1632:1: ( rule__Field__CommentAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_COMMENT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1632:2: rule__Field__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Field__CommentAssignment_0_in_rule__Field__Group__0__Impl3385);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1642:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1646:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1647:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__13416);
            rule__Field__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__13419);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1654:1: rule__Field__Group__1__Impl : ( ( rule__Field__Alternatives_1 )* ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1658:1: ( ( ( rule__Field__Alternatives_1 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1659:1: ( ( rule__Field__Alternatives_1 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1659:1: ( ( rule__Field__Alternatives_1 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1660:1: ( rule__Field__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getAlternatives_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1661:1: ( rule__Field__Alternatives_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_C_BRACKET_L) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1661:2: rule__Field__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Field__Alternatives_1_in_rule__Field__Group__1__Impl3446);
            	    rule__Field__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1671:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1675:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1676:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__23477);
            rule__Field__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__23480);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1683:1: rule__Field__Group__2__Impl : ( ( rule__Field__TypeAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1687:1: ( ( ( rule__Field__TypeAssignment_2 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1688:1: ( ( rule__Field__TypeAssignment_2 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1688:1: ( ( rule__Field__TypeAssignment_2 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1689:1: ( rule__Field__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeAssignment_2()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1690:1: ( rule__Field__TypeAssignment_2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1690:2: rule__Field__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Field__TypeAssignment_2_in_rule__Field__Group__2__Impl3507);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1700:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1704:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1705:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__33537);
            rule__Field__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__33540);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1712:1: rule__Field__Group__3__Impl : ( ( rule__Field__FieldNameAssignment_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1716:1: ( ( ( rule__Field__FieldNameAssignment_3 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1717:1: ( ( rule__Field__FieldNameAssignment_3 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1717:1: ( ( rule__Field__FieldNameAssignment_3 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1718:1: ( rule__Field__FieldNameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getFieldNameAssignment_3()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1719:1: ( rule__Field__FieldNameAssignment_3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1719:2: rule__Field__FieldNameAssignment_3
            {
            pushFollow(FOLLOW_rule__Field__FieldNameAssignment_3_in_rule__Field__Group__3__Impl3567);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1729:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1733:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1734:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__43597);
            rule__Field__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__5_in_rule__Field__Group__43600);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1741:1: rule__Field__Group__4__Impl : ( RULE_C_EQUALS ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1745:1: ( ( RULE_C_EQUALS ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1746:1: ( RULE_C_EQUALS )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1746:1: ( RULE_C_EQUALS )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1747:1: RULE_C_EQUALS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getC_EQUALSTerminalRuleCall_4()); 
            }
            match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_rule__Field__Group__4__Impl3627); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1758:1: rule__Field__Group__5 : rule__Field__Group__5__Impl rule__Field__Group__6 ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1762:1: ( rule__Field__Group__5__Impl rule__Field__Group__6 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1763:2: rule__Field__Group__5__Impl rule__Field__Group__6
            {
            pushFollow(FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__53656);
            rule__Field__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__6_in_rule__Field__Group__53659);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1770:1: rule__Field__Group__5__Impl : ( ( rule__Field__NodePathAssignment_5 ) ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1774:1: ( ( ( rule__Field__NodePathAssignment_5 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1775:1: ( ( rule__Field__NodePathAssignment_5 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1775:1: ( ( rule__Field__NodePathAssignment_5 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1776:1: ( rule__Field__NodePathAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNodePathAssignment_5()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1777:1: ( rule__Field__NodePathAssignment_5 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1777:2: rule__Field__NodePathAssignment_5
            {
            pushFollow(FOLLOW_rule__Field__NodePathAssignment_5_in_rule__Field__Group__5__Impl3686);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1787:1: rule__Field__Group__6 : rule__Field__Group__6__Impl ;
    public final void rule__Field__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1791:1: ( rule__Field__Group__6__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1792:2: rule__Field__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__63716);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1798:1: rule__Field__Group__6__Impl : ( ( RULE_C_SEMICOLON )? ) ;
    public final void rule__Field__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1802:1: ( ( ( RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1803:1: ( ( RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1803:1: ( ( RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1804:1: ( RULE_C_SEMICOLON )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getC_SEMICOLONTerminalRuleCall_6()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1805:1: ( RULE_C_SEMICOLON )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_C_SEMICOLON) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1805:3: RULE_C_SEMICOLON
                    {
                    match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_rule__Field__Group__6__Impl3744); if (state.failed) return ;

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1829:1: rule__ListMeta__Group__0 : rule__ListMeta__Group__0__Impl rule__ListMeta__Group__1 ;
    public final void rule__ListMeta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1833:1: ( rule__ListMeta__Group__0__Impl rule__ListMeta__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1834:2: rule__ListMeta__Group__0__Impl rule__ListMeta__Group__1
            {
            pushFollow(FOLLOW_rule__ListMeta__Group__0__Impl_in_rule__ListMeta__Group__03789);
            rule__ListMeta__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListMeta__Group__1_in_rule__ListMeta__Group__03792);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1841:1: rule__ListMeta__Group__0__Impl : ( RULE_C_BRACKET_L ) ;
    public final void rule__ListMeta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1845:1: ( ( RULE_C_BRACKET_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1846:1: ( RULE_C_BRACKET_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1846:1: ( RULE_C_BRACKET_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1847:1: RULE_C_BRACKET_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getC_BRACKET_LTerminalRuleCall_0()); 
            }
            match(input,RULE_C_BRACKET_L,FOLLOW_RULE_C_BRACKET_L_in_rule__ListMeta__Group__0__Impl3819); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1858:1: rule__ListMeta__Group__1 : rule__ListMeta__Group__1__Impl rule__ListMeta__Group__2 ;
    public final void rule__ListMeta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1862:1: ( rule__ListMeta__Group__1__Impl rule__ListMeta__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1863:2: rule__ListMeta__Group__1__Impl rule__ListMeta__Group__2
            {
            pushFollow(FOLLOW_rule__ListMeta__Group__1__Impl_in_rule__ListMeta__Group__13848);
            rule__ListMeta__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListMeta__Group__2_in_rule__ListMeta__Group__13851);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1870:1: rule__ListMeta__Group__1__Impl : ( ( rule__ListMeta__PrefixAssignment_1 ) ) ;
    public final void rule__ListMeta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1874:1: ( ( ( rule__ListMeta__PrefixAssignment_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1875:1: ( ( rule__ListMeta__PrefixAssignment_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1875:1: ( ( rule__ListMeta__PrefixAssignment_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1876:1: ( rule__ListMeta__PrefixAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getPrefixAssignment_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1877:1: ( rule__ListMeta__PrefixAssignment_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1877:2: rule__ListMeta__PrefixAssignment_1
            {
            pushFollow(FOLLOW_rule__ListMeta__PrefixAssignment_1_in_rule__ListMeta__Group__1__Impl3878);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1887:1: rule__ListMeta__Group__2 : rule__ListMeta__Group__2__Impl rule__ListMeta__Group__3 ;
    public final void rule__ListMeta__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1891:1: ( rule__ListMeta__Group__2__Impl rule__ListMeta__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1892:2: rule__ListMeta__Group__2__Impl rule__ListMeta__Group__3
            {
            pushFollow(FOLLOW_rule__ListMeta__Group__2__Impl_in_rule__ListMeta__Group__23908);
            rule__ListMeta__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListMeta__Group__3_in_rule__ListMeta__Group__23911);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1899:1: rule__ListMeta__Group__2__Impl : ( ( rule__ListMeta__Group_2__0 )? ) ;
    public final void rule__ListMeta__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1903:1: ( ( ( rule__ListMeta__Group_2__0 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1904:1: ( ( rule__ListMeta__Group_2__0 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1904:1: ( ( rule__ListMeta__Group_2__0 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1905:1: ( rule__ListMeta__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getGroup_2()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1906:1: ( rule__ListMeta__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_C_PAREN_L) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1906:2: rule__ListMeta__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ListMeta__Group_2__0_in_rule__ListMeta__Group__2__Impl3938);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1916:1: rule__ListMeta__Group__3 : rule__ListMeta__Group__3__Impl ;
    public final void rule__ListMeta__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1920:1: ( rule__ListMeta__Group__3__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1921:2: rule__ListMeta__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ListMeta__Group__3__Impl_in_rule__ListMeta__Group__33969);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1927:1: rule__ListMeta__Group__3__Impl : ( RULE_C_BRACKET_R ) ;
    public final void rule__ListMeta__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1931:1: ( ( RULE_C_BRACKET_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1932:1: ( RULE_C_BRACKET_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1932:1: ( RULE_C_BRACKET_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1933:1: RULE_C_BRACKET_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getC_BRACKET_RTerminalRuleCall_3()); 
            }
            match(input,RULE_C_BRACKET_R,FOLLOW_RULE_C_BRACKET_R_in_rule__ListMeta__Group__3__Impl3996); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1952:1: rule__ListMeta__Group_2__0 : rule__ListMeta__Group_2__0__Impl rule__ListMeta__Group_2__1 ;
    public final void rule__ListMeta__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1956:1: ( rule__ListMeta__Group_2__0__Impl rule__ListMeta__Group_2__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1957:2: rule__ListMeta__Group_2__0__Impl rule__ListMeta__Group_2__1
            {
            pushFollow(FOLLOW_rule__ListMeta__Group_2__0__Impl_in_rule__ListMeta__Group_2__04033);
            rule__ListMeta__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListMeta__Group_2__1_in_rule__ListMeta__Group_2__04036);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1964:1: rule__ListMeta__Group_2__0__Impl : ( RULE_C_PAREN_L ) ;
    public final void rule__ListMeta__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1968:1: ( ( RULE_C_PAREN_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1969:1: ( RULE_C_PAREN_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1969:1: ( RULE_C_PAREN_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1970:1: RULE_C_PAREN_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getC_PAREN_LTerminalRuleCall_2_0()); 
            }
            match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_rule__ListMeta__Group_2__0__Impl4063); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1981:1: rule__ListMeta__Group_2__1 : rule__ListMeta__Group_2__1__Impl rule__ListMeta__Group_2__2 ;
    public final void rule__ListMeta__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1985:1: ( rule__ListMeta__Group_2__1__Impl rule__ListMeta__Group_2__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1986:2: rule__ListMeta__Group_2__1__Impl rule__ListMeta__Group_2__2
            {
            pushFollow(FOLLOW_rule__ListMeta__Group_2__1__Impl_in_rule__ListMeta__Group_2__14092);
            rule__ListMeta__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListMeta__Group_2__2_in_rule__ListMeta__Group_2__14095);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1993:1: rule__ListMeta__Group_2__1__Impl : ( ( rule__ListMeta__Group_2_1__0 )? ) ;
    public final void rule__ListMeta__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1997:1: ( ( ( rule__ListMeta__Group_2_1__0 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1998:1: ( ( rule__ListMeta__Group_2_1__0 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1998:1: ( ( rule__ListMeta__Group_2_1__0 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1999:1: ( rule__ListMeta__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getGroup_2_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2000:1: ( rule__ListMeta__Group_2_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_C_INPUT && LA20_0<=RULE_NAME)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2000:2: rule__ListMeta__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ListMeta__Group_2_1__0_in_rule__ListMeta__Group_2__1__Impl4122);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2010:1: rule__ListMeta__Group_2__2 : rule__ListMeta__Group_2__2__Impl ;
    public final void rule__ListMeta__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2014:1: ( rule__ListMeta__Group_2__2__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2015:2: rule__ListMeta__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ListMeta__Group_2__2__Impl_in_rule__ListMeta__Group_2__24153);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2021:1: rule__ListMeta__Group_2__2__Impl : ( RULE_C_PAREN_R ) ;
    public final void rule__ListMeta__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2025:1: ( ( RULE_C_PAREN_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2026:1: ( RULE_C_PAREN_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2026:1: ( RULE_C_PAREN_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2027:1: RULE_C_PAREN_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getC_PAREN_RTerminalRuleCall_2_2()); 
            }
            match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_rule__ListMeta__Group_2__2__Impl4180); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2044:1: rule__ListMeta__Group_2_1__0 : rule__ListMeta__Group_2_1__0__Impl rule__ListMeta__Group_2_1__1 ;
    public final void rule__ListMeta__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2048:1: ( rule__ListMeta__Group_2_1__0__Impl rule__ListMeta__Group_2_1__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2049:2: rule__ListMeta__Group_2_1__0__Impl rule__ListMeta__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ListMeta__Group_2_1__0__Impl_in_rule__ListMeta__Group_2_1__04215);
            rule__ListMeta__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListMeta__Group_2_1__1_in_rule__ListMeta__Group_2_1__04218);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2056:1: rule__ListMeta__Group_2_1__0__Impl : ( ( rule__ListMeta__ParamsAssignment_2_1_0 ) ) ;
    public final void rule__ListMeta__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2060:1: ( ( ( rule__ListMeta__ParamsAssignment_2_1_0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2061:1: ( ( rule__ListMeta__ParamsAssignment_2_1_0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2061:1: ( ( rule__ListMeta__ParamsAssignment_2_1_0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2062:1: ( rule__ListMeta__ParamsAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getParamsAssignment_2_1_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2063:1: ( rule__ListMeta__ParamsAssignment_2_1_0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2063:2: rule__ListMeta__ParamsAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__ListMeta__ParamsAssignment_2_1_0_in_rule__ListMeta__Group_2_1__0__Impl4245);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2073:1: rule__ListMeta__Group_2_1__1 : rule__ListMeta__Group_2_1__1__Impl ;
    public final void rule__ListMeta__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2077:1: ( rule__ListMeta__Group_2_1__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2078:2: rule__ListMeta__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListMeta__Group_2_1__1__Impl_in_rule__ListMeta__Group_2_1__14275);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2084:1: rule__ListMeta__Group_2_1__1__Impl : ( ( rule__ListMeta__Group_2_1_1__0 )* ) ;
    public final void rule__ListMeta__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2088:1: ( ( ( rule__ListMeta__Group_2_1_1__0 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2089:1: ( ( rule__ListMeta__Group_2_1_1__0 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2089:1: ( ( rule__ListMeta__Group_2_1_1__0 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2090:1: ( rule__ListMeta__Group_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getGroup_2_1_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2091:1: ( rule__ListMeta__Group_2_1_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_C_COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2091:2: rule__ListMeta__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ListMeta__Group_2_1_1__0_in_rule__ListMeta__Group_2_1__1__Impl4302);
            	    rule__ListMeta__Group_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2105:1: rule__ListMeta__Group_2_1_1__0 : rule__ListMeta__Group_2_1_1__0__Impl rule__ListMeta__Group_2_1_1__1 ;
    public final void rule__ListMeta__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2109:1: ( rule__ListMeta__Group_2_1_1__0__Impl rule__ListMeta__Group_2_1_1__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2110:2: rule__ListMeta__Group_2_1_1__0__Impl rule__ListMeta__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__ListMeta__Group_2_1_1__0__Impl_in_rule__ListMeta__Group_2_1_1__04337);
            rule__ListMeta__Group_2_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ListMeta__Group_2_1_1__1_in_rule__ListMeta__Group_2_1_1__04340);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2117:1: rule__ListMeta__Group_2_1_1__0__Impl : ( RULE_C_COMMA ) ;
    public final void rule__ListMeta__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2121:1: ( ( RULE_C_COMMA ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2122:1: ( RULE_C_COMMA )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2122:1: ( RULE_C_COMMA )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2123:1: RULE_C_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getC_COMMATerminalRuleCall_2_1_1_0()); 
            }
            match(input,RULE_C_COMMA,FOLLOW_RULE_C_COMMA_in_rule__ListMeta__Group_2_1_1__0__Impl4367); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2134:1: rule__ListMeta__Group_2_1_1__1 : rule__ListMeta__Group_2_1_1__1__Impl ;
    public final void rule__ListMeta__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2138:1: ( rule__ListMeta__Group_2_1_1__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2139:2: rule__ListMeta__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListMeta__Group_2_1_1__1__Impl_in_rule__ListMeta__Group_2_1_1__14396);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2145:1: rule__ListMeta__Group_2_1_1__1__Impl : ( ( rule__ListMeta__ParamsAssignment_2_1_1_1 ) ) ;
    public final void rule__ListMeta__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2149:1: ( ( ( rule__ListMeta__ParamsAssignment_2_1_1_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2150:1: ( ( rule__ListMeta__ParamsAssignment_2_1_1_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2150:1: ( ( rule__ListMeta__ParamsAssignment_2_1_1_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2151:1: ( rule__ListMeta__ParamsAssignment_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getParamsAssignment_2_1_1_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2152:1: ( rule__ListMeta__ParamsAssignment_2_1_1_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2152:2: rule__ListMeta__ParamsAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__ListMeta__ParamsAssignment_2_1_1_1_in_rule__ListMeta__Group_2_1_1__1__Impl4423);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2166:1: rule__SliceMeta__Group__0 : rule__SliceMeta__Group__0__Impl rule__SliceMeta__Group__1 ;
    public final void rule__SliceMeta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2170:1: ( rule__SliceMeta__Group__0__Impl rule__SliceMeta__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2171:2: rule__SliceMeta__Group__0__Impl rule__SliceMeta__Group__1
            {
            pushFollow(FOLLOW_rule__SliceMeta__Group__0__Impl_in_rule__SliceMeta__Group__04457);
            rule__SliceMeta__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SliceMeta__Group__1_in_rule__SliceMeta__Group__04460);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2178:1: rule__SliceMeta__Group__0__Impl : ( RULE_C_BRACKET_L ) ;
    public final void rule__SliceMeta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2182:1: ( ( RULE_C_BRACKET_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2183:1: ( RULE_C_BRACKET_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2183:1: ( RULE_C_BRACKET_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2184:1: RULE_C_BRACKET_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSliceMetaAccess().getC_BRACKET_LTerminalRuleCall_0()); 
            }
            match(input,RULE_C_BRACKET_L,FOLLOW_RULE_C_BRACKET_L_in_rule__SliceMeta__Group__0__Impl4487); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2195:1: rule__SliceMeta__Group__1 : rule__SliceMeta__Group__1__Impl rule__SliceMeta__Group__2 ;
    public final void rule__SliceMeta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2199:1: ( rule__SliceMeta__Group__1__Impl rule__SliceMeta__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2200:2: rule__SliceMeta__Group__1__Impl rule__SliceMeta__Group__2
            {
            pushFollow(FOLLOW_rule__SliceMeta__Group__1__Impl_in_rule__SliceMeta__Group__14516);
            rule__SliceMeta__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SliceMeta__Group__2_in_rule__SliceMeta__Group__14519);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2207:1: rule__SliceMeta__Group__1__Impl : ( ( rule__SliceMeta__PrefixAssignment_1 ) ) ;
    public final void rule__SliceMeta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2211:1: ( ( ( rule__SliceMeta__PrefixAssignment_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2212:1: ( ( rule__SliceMeta__PrefixAssignment_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2212:1: ( ( rule__SliceMeta__PrefixAssignment_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2213:1: ( rule__SliceMeta__PrefixAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSliceMetaAccess().getPrefixAssignment_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2214:1: ( rule__SliceMeta__PrefixAssignment_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2214:2: rule__SliceMeta__PrefixAssignment_1
            {
            pushFollow(FOLLOW_rule__SliceMeta__PrefixAssignment_1_in_rule__SliceMeta__Group__1__Impl4546);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2224:1: rule__SliceMeta__Group__2 : rule__SliceMeta__Group__2__Impl rule__SliceMeta__Group__3 ;
    public final void rule__SliceMeta__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2228:1: ( rule__SliceMeta__Group__2__Impl rule__SliceMeta__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2229:2: rule__SliceMeta__Group__2__Impl rule__SliceMeta__Group__3
            {
            pushFollow(FOLLOW_rule__SliceMeta__Group__2__Impl_in_rule__SliceMeta__Group__24576);
            rule__SliceMeta__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SliceMeta__Group__3_in_rule__SliceMeta__Group__24579);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2236:1: rule__SliceMeta__Group__2__Impl : ( RULE_C_PAREN_L ) ;
    public final void rule__SliceMeta__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2240:1: ( ( RULE_C_PAREN_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2241:1: ( RULE_C_PAREN_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2241:1: ( RULE_C_PAREN_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2242:1: RULE_C_PAREN_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSliceMetaAccess().getC_PAREN_LTerminalRuleCall_2()); 
            }
            match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_rule__SliceMeta__Group__2__Impl4606); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2253:1: rule__SliceMeta__Group__3 : rule__SliceMeta__Group__3__Impl rule__SliceMeta__Group__4 ;
    public final void rule__SliceMeta__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2257:1: ( rule__SliceMeta__Group__3__Impl rule__SliceMeta__Group__4 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2258:2: rule__SliceMeta__Group__3__Impl rule__SliceMeta__Group__4
            {
            pushFollow(FOLLOW_rule__SliceMeta__Group__3__Impl_in_rule__SliceMeta__Group__34635);
            rule__SliceMeta__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SliceMeta__Group__4_in_rule__SliceMeta__Group__34638);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2265:1: rule__SliceMeta__Group__3__Impl : ( ( rule__SliceMeta__SliceCharAssignment_3 ) ) ;
    public final void rule__SliceMeta__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2269:1: ( ( ( rule__SliceMeta__SliceCharAssignment_3 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2270:1: ( ( rule__SliceMeta__SliceCharAssignment_3 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2270:1: ( ( rule__SliceMeta__SliceCharAssignment_3 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2271:1: ( rule__SliceMeta__SliceCharAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSliceMetaAccess().getSliceCharAssignment_3()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2272:1: ( rule__SliceMeta__SliceCharAssignment_3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2272:2: rule__SliceMeta__SliceCharAssignment_3
            {
            pushFollow(FOLLOW_rule__SliceMeta__SliceCharAssignment_3_in_rule__SliceMeta__Group__3__Impl4665);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2282:1: rule__SliceMeta__Group__4 : rule__SliceMeta__Group__4__Impl rule__SliceMeta__Group__5 ;
    public final void rule__SliceMeta__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2286:1: ( rule__SliceMeta__Group__4__Impl rule__SliceMeta__Group__5 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2287:2: rule__SliceMeta__Group__4__Impl rule__SliceMeta__Group__5
            {
            pushFollow(FOLLOW_rule__SliceMeta__Group__4__Impl_in_rule__SliceMeta__Group__44695);
            rule__SliceMeta__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SliceMeta__Group__5_in_rule__SliceMeta__Group__44698);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2294:1: rule__SliceMeta__Group__4__Impl : ( RULE_C_PAREN_R ) ;
    public final void rule__SliceMeta__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2298:1: ( ( RULE_C_PAREN_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2299:1: ( RULE_C_PAREN_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2299:1: ( RULE_C_PAREN_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2300:1: RULE_C_PAREN_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSliceMetaAccess().getC_PAREN_RTerminalRuleCall_4()); 
            }
            match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_rule__SliceMeta__Group__4__Impl4725); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2311:1: rule__SliceMeta__Group__5 : rule__SliceMeta__Group__5__Impl ;
    public final void rule__SliceMeta__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2315:1: ( rule__SliceMeta__Group__5__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2316:2: rule__SliceMeta__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SliceMeta__Group__5__Impl_in_rule__SliceMeta__Group__54754);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2322:1: rule__SliceMeta__Group__5__Impl : ( RULE_C_BRACKET_R ) ;
    public final void rule__SliceMeta__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2326:1: ( ( RULE_C_BRACKET_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2327:1: ( RULE_C_BRACKET_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2327:1: ( RULE_C_BRACKET_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2328:1: RULE_C_BRACKET_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSliceMetaAccess().getC_BRACKET_RTerminalRuleCall_5()); 
            }
            match(input,RULE_C_BRACKET_R,FOLLOW_RULE_C_BRACKET_R_in_rule__SliceMeta__Group__5__Impl4781); if (state.failed) return ;
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


    // $ANTLR start "rule__Enum__Group__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2351:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2355:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2356:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__04822);
            rule__Enum__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__04825);
            rule__Enum__Group__1();

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
    // $ANTLR end "rule__Enum__Group__0"


    // $ANTLR start "rule__Enum__Group__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2363:1: rule__Enum__Group__0__Impl : ( ( rule__Enum__CommentAssignment_0 )? ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2367:1: ( ( ( rule__Enum__CommentAssignment_0 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2368:1: ( ( rule__Enum__CommentAssignment_0 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2368:1: ( ( rule__Enum__CommentAssignment_0 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2369:1: ( rule__Enum__CommentAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getCommentAssignment_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2370:1: ( rule__Enum__CommentAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_COMMENT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2370:2: rule__Enum__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Enum__CommentAssignment_0_in_rule__Enum__Group__0__Impl4852);
                    rule__Enum__CommentAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getCommentAssignment_0()); 
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
    // $ANTLR end "rule__Enum__Group__0__Impl"


    // $ANTLR start "rule__Enum__Group__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2380:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2384:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2385:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__14883);
            rule__Enum__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__14886);
            rule__Enum__Group__2();

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
    // $ANTLR end "rule__Enum__Group__1"


    // $ANTLR start "rule__Enum__Group__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2392:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__PrefixAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2396:1: ( ( ( rule__Enum__PrefixAssignment_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2397:1: ( ( rule__Enum__PrefixAssignment_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2397:1: ( ( rule__Enum__PrefixAssignment_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2398:1: ( rule__Enum__PrefixAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getPrefixAssignment_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2399:1: ( rule__Enum__PrefixAssignment_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2399:2: rule__Enum__PrefixAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__PrefixAssignment_1_in_rule__Enum__Group__1__Impl4913);
            rule__Enum__PrefixAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getPrefixAssignment_1()); 
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
    // $ANTLR end "rule__Enum__Group__1__Impl"


    // $ANTLR start "rule__Enum__Group__2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2409:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2413:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2414:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__24943);
            rule__Enum__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__24946);
            rule__Enum__Group__3();

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
    // $ANTLR end "rule__Enum__Group__2"


    // $ANTLR start "rule__Enum__Group__2__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2421:1: rule__Enum__Group__2__Impl : ( ( rule__Enum__NameAssignment_2 ) ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2425:1: ( ( ( rule__Enum__NameAssignment_2 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2426:1: ( ( rule__Enum__NameAssignment_2 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2426:1: ( ( rule__Enum__NameAssignment_2 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2427:1: ( rule__Enum__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getNameAssignment_2()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2428:1: ( rule__Enum__NameAssignment_2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2428:2: rule__Enum__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Enum__NameAssignment_2_in_rule__Enum__Group__2__Impl4973);
            rule__Enum__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__Enum__Group__2__Impl"


    // $ANTLR start "rule__Enum__Group__3"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2438:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2442:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2443:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__35003);
            rule__Enum__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__35006);
            rule__Enum__Group__4();

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
    // $ANTLR end "rule__Enum__Group__3"


    // $ANTLR start "rule__Enum__Group__3__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2450:1: rule__Enum__Group__3__Impl : ( RULE_C_BRACE_L ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2454:1: ( ( RULE_C_BRACE_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2455:1: ( RULE_C_BRACE_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2455:1: ( RULE_C_BRACE_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2456:1: RULE_C_BRACE_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getC_BRACE_LTerminalRuleCall_3()); 
            }
            match(input,RULE_C_BRACE_L,FOLLOW_RULE_C_BRACE_L_in_rule__Enum__Group__3__Impl5033); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getC_BRACE_LTerminalRuleCall_3()); 
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
    // $ANTLR end "rule__Enum__Group__3__Impl"


    // $ANTLR start "rule__Enum__Group__4"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2467:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl rule__Enum__Group__5 ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2471:1: ( rule__Enum__Group__4__Impl rule__Enum__Group__5 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2472:2: rule__Enum__Group__4__Impl rule__Enum__Group__5
            {
            pushFollow(FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__45062);
            rule__Enum__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__45065);
            rule__Enum__Group__5();

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
    // $ANTLR end "rule__Enum__Group__4"


    // $ANTLR start "rule__Enum__Group__4__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2479:1: rule__Enum__Group__4__Impl : ( ( rule__Enum__Alternatives_4 )* ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2483:1: ( ( ( rule__Enum__Alternatives_4 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2484:1: ( ( rule__Enum__Alternatives_4 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2484:1: ( ( rule__Enum__Alternatives_4 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2485:1: ( rule__Enum__Alternatives_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getAlternatives_4()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2486:1: ( rule__Enum__Alternatives_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_COMMENT && LA23_0<=RULE_NAME)||LA23_0==RULE_C_BRACKET_L) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2486:2: rule__Enum__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__Enum__Alternatives_4_in_rule__Enum__Group__4__Impl5092);
            	    rule__Enum__Alternatives_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getAlternatives_4()); 
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
    // $ANTLR end "rule__Enum__Group__4__Impl"


    // $ANTLR start "rule__Enum__Group__5"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2496:1: rule__Enum__Group__5 : rule__Enum__Group__5__Impl ;
    public final void rule__Enum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2500:1: ( rule__Enum__Group__5__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2501:2: rule__Enum__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__55123);
            rule__Enum__Group__5__Impl();

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
    // $ANTLR end "rule__Enum__Group__5"


    // $ANTLR start "rule__Enum__Group__5__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2507:1: rule__Enum__Group__5__Impl : ( RULE_C_BRACE_R ) ;
    public final void rule__Enum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2511:1: ( ( RULE_C_BRACE_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2512:1: ( RULE_C_BRACE_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2512:1: ( RULE_C_BRACE_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2513:1: RULE_C_BRACE_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getC_BRACE_RTerminalRuleCall_5()); 
            }
            match(input,RULE_C_BRACE_R,FOLLOW_RULE_C_BRACE_R_in_rule__Enum__Group__5__Impl5150); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getC_BRACE_RTerminalRuleCall_5()); 
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
    // $ANTLR end "rule__Enum__Group__5__Impl"


    // $ANTLR start "rule__EnumField__Group__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2536:1: rule__EnumField__Group__0 : rule__EnumField__Group__0__Impl rule__EnumField__Group__1 ;
    public final void rule__EnumField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2540:1: ( rule__EnumField__Group__0__Impl rule__EnumField__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2541:2: rule__EnumField__Group__0__Impl rule__EnumField__Group__1
            {
            pushFollow(FOLLOW_rule__EnumField__Group__0__Impl_in_rule__EnumField__Group__05191);
            rule__EnumField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__1_in_rule__EnumField__Group__05194);
            rule__EnumField__Group__1();

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
    // $ANTLR end "rule__EnumField__Group__0"


    // $ANTLR start "rule__EnumField__Group__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2548:1: rule__EnumField__Group__0__Impl : ( ( rule__EnumField__CommentAssignment_0 )? ) ;
    public final void rule__EnumField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2552:1: ( ( ( rule__EnumField__CommentAssignment_0 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2553:1: ( ( rule__EnumField__CommentAssignment_0 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2553:1: ( ( rule__EnumField__CommentAssignment_0 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2554:1: ( rule__EnumField__CommentAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getCommentAssignment_0()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2555:1: ( rule__EnumField__CommentAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_COMMENT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2555:2: rule__EnumField__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__EnumField__CommentAssignment_0_in_rule__EnumField__Group__0__Impl5221);
                    rule__EnumField__CommentAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getCommentAssignment_0()); 
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
    // $ANTLR end "rule__EnumField__Group__0__Impl"


    // $ANTLR start "rule__EnumField__Group__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2565:1: rule__EnumField__Group__1 : rule__EnumField__Group__1__Impl rule__EnumField__Group__2 ;
    public final void rule__EnumField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2569:1: ( rule__EnumField__Group__1__Impl rule__EnumField__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2570:2: rule__EnumField__Group__1__Impl rule__EnumField__Group__2
            {
            pushFollow(FOLLOW_rule__EnumField__Group__1__Impl_in_rule__EnumField__Group__15252);
            rule__EnumField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__2_in_rule__EnumField__Group__15255);
            rule__EnumField__Group__2();

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
    // $ANTLR end "rule__EnumField__Group__1"


    // $ANTLR start "rule__EnumField__Group__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2577:1: rule__EnumField__Group__1__Impl : ( ( rule__EnumField__MetaAssignment_1 )? ) ;
    public final void rule__EnumField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2581:1: ( ( ( rule__EnumField__MetaAssignment_1 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2582:1: ( ( rule__EnumField__MetaAssignment_1 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2582:1: ( ( rule__EnumField__MetaAssignment_1 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2583:1: ( rule__EnumField__MetaAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getMetaAssignment_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2584:1: ( rule__EnumField__MetaAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_C_BRACKET_L) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2584:2: rule__EnumField__MetaAssignment_1
                    {
                    pushFollow(FOLLOW_rule__EnumField__MetaAssignment_1_in_rule__EnumField__Group__1__Impl5282);
                    rule__EnumField__MetaAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getMetaAssignment_1()); 
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
    // $ANTLR end "rule__EnumField__Group__1__Impl"


    // $ANTLR start "rule__EnumField__Group__2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2594:1: rule__EnumField__Group__2 : rule__EnumField__Group__2__Impl rule__EnumField__Group__3 ;
    public final void rule__EnumField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2598:1: ( rule__EnumField__Group__2__Impl rule__EnumField__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2599:2: rule__EnumField__Group__2__Impl rule__EnumField__Group__3
            {
            pushFollow(FOLLOW_rule__EnumField__Group__2__Impl_in_rule__EnumField__Group__25313);
            rule__EnumField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__3_in_rule__EnumField__Group__25316);
            rule__EnumField__Group__3();

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
    // $ANTLR end "rule__EnumField__Group__2"


    // $ANTLR start "rule__EnumField__Group__2__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2606:1: rule__EnumField__Group__2__Impl : ( ( rule__EnumField__FieldNameAssignment_2 ) ) ;
    public final void rule__EnumField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2610:1: ( ( ( rule__EnumField__FieldNameAssignment_2 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2611:1: ( ( rule__EnumField__FieldNameAssignment_2 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2611:1: ( ( rule__EnumField__FieldNameAssignment_2 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2612:1: ( rule__EnumField__FieldNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getFieldNameAssignment_2()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2613:1: ( rule__EnumField__FieldNameAssignment_2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2613:2: rule__EnumField__FieldNameAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumField__FieldNameAssignment_2_in_rule__EnumField__Group__2__Impl5343);
            rule__EnumField__FieldNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getFieldNameAssignment_2()); 
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
    // $ANTLR end "rule__EnumField__Group__2__Impl"


    // $ANTLR start "rule__EnumField__Group__3"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2623:1: rule__EnumField__Group__3 : rule__EnumField__Group__3__Impl rule__EnumField__Group__4 ;
    public final void rule__EnumField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2627:1: ( rule__EnumField__Group__3__Impl rule__EnumField__Group__4 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2628:2: rule__EnumField__Group__3__Impl rule__EnumField__Group__4
            {
            pushFollow(FOLLOW_rule__EnumField__Group__3__Impl_in_rule__EnumField__Group__35373);
            rule__EnumField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__4_in_rule__EnumField__Group__35376);
            rule__EnumField__Group__4();

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
    // $ANTLR end "rule__EnumField__Group__3"


    // $ANTLR start "rule__EnumField__Group__3__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2635:1: rule__EnumField__Group__3__Impl : ( RULE_C_EQUALS ) ;
    public final void rule__EnumField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2639:1: ( ( RULE_C_EQUALS ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2640:1: ( RULE_C_EQUALS )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2640:1: ( RULE_C_EQUALS )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2641:1: RULE_C_EQUALS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getC_EQUALSTerminalRuleCall_3()); 
            }
            match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_rule__EnumField__Group__3__Impl5403); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getC_EQUALSTerminalRuleCall_3()); 
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
    // $ANTLR end "rule__EnumField__Group__3__Impl"


    // $ANTLR start "rule__EnumField__Group__4"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2652:1: rule__EnumField__Group__4 : rule__EnumField__Group__4__Impl rule__EnumField__Group__5 ;
    public final void rule__EnumField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2656:1: ( rule__EnumField__Group__4__Impl rule__EnumField__Group__5 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2657:2: rule__EnumField__Group__4__Impl rule__EnumField__Group__5
            {
            pushFollow(FOLLOW_rule__EnumField__Group__4__Impl_in_rule__EnumField__Group__45432);
            rule__EnumField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumField__Group__5_in_rule__EnumField__Group__45435);
            rule__EnumField__Group__5();

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
    // $ANTLR end "rule__EnumField__Group__4"


    // $ANTLR start "rule__EnumField__Group__4__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2664:1: rule__EnumField__Group__4__Impl : ( ( rule__EnumField__FieldValueAssignment_4 ) ) ;
    public final void rule__EnumField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2668:1: ( ( ( rule__EnumField__FieldValueAssignment_4 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2669:1: ( ( rule__EnumField__FieldValueAssignment_4 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2669:1: ( ( rule__EnumField__FieldValueAssignment_4 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2670:1: ( rule__EnumField__FieldValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getFieldValueAssignment_4()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2671:1: ( rule__EnumField__FieldValueAssignment_4 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2671:2: rule__EnumField__FieldValueAssignment_4
            {
            pushFollow(FOLLOW_rule__EnumField__FieldValueAssignment_4_in_rule__EnumField__Group__4__Impl5462);
            rule__EnumField__FieldValueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getFieldValueAssignment_4()); 
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
    // $ANTLR end "rule__EnumField__Group__4__Impl"


    // $ANTLR start "rule__EnumField__Group__5"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2681:1: rule__EnumField__Group__5 : rule__EnumField__Group__5__Impl ;
    public final void rule__EnumField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2685:1: ( rule__EnumField__Group__5__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2686:2: rule__EnumField__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EnumField__Group__5__Impl_in_rule__EnumField__Group__55492);
            rule__EnumField__Group__5__Impl();

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
    // $ANTLR end "rule__EnumField__Group__5"


    // $ANTLR start "rule__EnumField__Group__5__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2692:1: rule__EnumField__Group__5__Impl : ( ( RULE_C_SEMICOLON )? ) ;
    public final void rule__EnumField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2696:1: ( ( ( RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2697:1: ( ( RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2697:1: ( ( RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2698:1: ( RULE_C_SEMICOLON )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getC_SEMICOLONTerminalRuleCall_5()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2699:1: ( RULE_C_SEMICOLON )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_C_SEMICOLON) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2699:3: RULE_C_SEMICOLON
                    {
                    match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_rule__EnumField__Group__5__Impl5520); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getC_SEMICOLONTerminalRuleCall_5()); 
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
    // $ANTLR end "rule__EnumField__Group__5__Impl"


    // $ANTLR start "rule__DefaultMeta__Group__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2721:1: rule__DefaultMeta__Group__0 : rule__DefaultMeta__Group__0__Impl rule__DefaultMeta__Group__1 ;
    public final void rule__DefaultMeta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2725:1: ( rule__DefaultMeta__Group__0__Impl rule__DefaultMeta__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2726:2: rule__DefaultMeta__Group__0__Impl rule__DefaultMeta__Group__1
            {
            pushFollow(FOLLOW_rule__DefaultMeta__Group__0__Impl_in_rule__DefaultMeta__Group__05563);
            rule__DefaultMeta__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DefaultMeta__Group__1_in_rule__DefaultMeta__Group__05566);
            rule__DefaultMeta__Group__1();

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
    // $ANTLR end "rule__DefaultMeta__Group__0"


    // $ANTLR start "rule__DefaultMeta__Group__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2733:1: rule__DefaultMeta__Group__0__Impl : ( RULE_C_BRACKET_L ) ;
    public final void rule__DefaultMeta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2737:1: ( ( RULE_C_BRACKET_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2738:1: ( RULE_C_BRACKET_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2738:1: ( RULE_C_BRACKET_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2739:1: RULE_C_BRACKET_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultMetaAccess().getC_BRACKET_LTerminalRuleCall_0()); 
            }
            match(input,RULE_C_BRACKET_L,FOLLOW_RULE_C_BRACKET_L_in_rule__DefaultMeta__Group__0__Impl5593); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultMetaAccess().getC_BRACKET_LTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__DefaultMeta__Group__0__Impl"


    // $ANTLR start "rule__DefaultMeta__Group__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2750:1: rule__DefaultMeta__Group__1 : rule__DefaultMeta__Group__1__Impl rule__DefaultMeta__Group__2 ;
    public final void rule__DefaultMeta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2754:1: ( rule__DefaultMeta__Group__1__Impl rule__DefaultMeta__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2755:2: rule__DefaultMeta__Group__1__Impl rule__DefaultMeta__Group__2
            {
            pushFollow(FOLLOW_rule__DefaultMeta__Group__1__Impl_in_rule__DefaultMeta__Group__15622);
            rule__DefaultMeta__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DefaultMeta__Group__2_in_rule__DefaultMeta__Group__15625);
            rule__DefaultMeta__Group__2();

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
    // $ANTLR end "rule__DefaultMeta__Group__1"


    // $ANTLR start "rule__DefaultMeta__Group__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2762:1: rule__DefaultMeta__Group__1__Impl : ( ( rule__DefaultMeta__PrefixAssignment_1 ) ) ;
    public final void rule__DefaultMeta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2766:1: ( ( ( rule__DefaultMeta__PrefixAssignment_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2767:1: ( ( rule__DefaultMeta__PrefixAssignment_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2767:1: ( ( rule__DefaultMeta__PrefixAssignment_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2768:1: ( rule__DefaultMeta__PrefixAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultMetaAccess().getPrefixAssignment_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2769:1: ( rule__DefaultMeta__PrefixAssignment_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2769:2: rule__DefaultMeta__PrefixAssignment_1
            {
            pushFollow(FOLLOW_rule__DefaultMeta__PrefixAssignment_1_in_rule__DefaultMeta__Group__1__Impl5652);
            rule__DefaultMeta__PrefixAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultMetaAccess().getPrefixAssignment_1()); 
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
    // $ANTLR end "rule__DefaultMeta__Group__1__Impl"


    // $ANTLR start "rule__DefaultMeta__Group__2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2779:1: rule__DefaultMeta__Group__2 : rule__DefaultMeta__Group__2__Impl rule__DefaultMeta__Group__3 ;
    public final void rule__DefaultMeta__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2783:1: ( rule__DefaultMeta__Group__2__Impl rule__DefaultMeta__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2784:2: rule__DefaultMeta__Group__2__Impl rule__DefaultMeta__Group__3
            {
            pushFollow(FOLLOW_rule__DefaultMeta__Group__2__Impl_in_rule__DefaultMeta__Group__25682);
            rule__DefaultMeta__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DefaultMeta__Group__3_in_rule__DefaultMeta__Group__25685);
            rule__DefaultMeta__Group__3();

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
    // $ANTLR end "rule__DefaultMeta__Group__2"


    // $ANTLR start "rule__DefaultMeta__Group__2__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2791:1: rule__DefaultMeta__Group__2__Impl : ( ( rule__DefaultMeta__Group_2__0 )? ) ;
    public final void rule__DefaultMeta__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2795:1: ( ( ( rule__DefaultMeta__Group_2__0 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2796:1: ( ( rule__DefaultMeta__Group_2__0 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2796:1: ( ( rule__DefaultMeta__Group_2__0 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2797:1: ( rule__DefaultMeta__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultMetaAccess().getGroup_2()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2798:1: ( rule__DefaultMeta__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_C_PAREN_L) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2798:2: rule__DefaultMeta__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DefaultMeta__Group_2__0_in_rule__DefaultMeta__Group__2__Impl5712);
                    rule__DefaultMeta__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultMetaAccess().getGroup_2()); 
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
    // $ANTLR end "rule__DefaultMeta__Group__2__Impl"


    // $ANTLR start "rule__DefaultMeta__Group__3"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2808:1: rule__DefaultMeta__Group__3 : rule__DefaultMeta__Group__3__Impl ;
    public final void rule__DefaultMeta__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2812:1: ( rule__DefaultMeta__Group__3__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2813:2: rule__DefaultMeta__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DefaultMeta__Group__3__Impl_in_rule__DefaultMeta__Group__35743);
            rule__DefaultMeta__Group__3__Impl();

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
    // $ANTLR end "rule__DefaultMeta__Group__3"


    // $ANTLR start "rule__DefaultMeta__Group__3__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2819:1: rule__DefaultMeta__Group__3__Impl : ( RULE_C_BRACKET_R ) ;
    public final void rule__DefaultMeta__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2823:1: ( ( RULE_C_BRACKET_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2824:1: ( RULE_C_BRACKET_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2824:1: ( RULE_C_BRACKET_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2825:1: RULE_C_BRACKET_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultMetaAccess().getC_BRACKET_RTerminalRuleCall_3()); 
            }
            match(input,RULE_C_BRACKET_R,FOLLOW_RULE_C_BRACKET_R_in_rule__DefaultMeta__Group__3__Impl5770); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultMetaAccess().getC_BRACKET_RTerminalRuleCall_3()); 
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
    // $ANTLR end "rule__DefaultMeta__Group__3__Impl"


    // $ANTLR start "rule__DefaultMeta__Group_2__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2844:1: rule__DefaultMeta__Group_2__0 : rule__DefaultMeta__Group_2__0__Impl rule__DefaultMeta__Group_2__1 ;
    public final void rule__DefaultMeta__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2848:1: ( rule__DefaultMeta__Group_2__0__Impl rule__DefaultMeta__Group_2__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2849:2: rule__DefaultMeta__Group_2__0__Impl rule__DefaultMeta__Group_2__1
            {
            pushFollow(FOLLOW_rule__DefaultMeta__Group_2__0__Impl_in_rule__DefaultMeta__Group_2__05807);
            rule__DefaultMeta__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DefaultMeta__Group_2__1_in_rule__DefaultMeta__Group_2__05810);
            rule__DefaultMeta__Group_2__1();

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
    // $ANTLR end "rule__DefaultMeta__Group_2__0"


    // $ANTLR start "rule__DefaultMeta__Group_2__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2856:1: rule__DefaultMeta__Group_2__0__Impl : ( RULE_C_PAREN_L ) ;
    public final void rule__DefaultMeta__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2860:1: ( ( RULE_C_PAREN_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2861:1: ( RULE_C_PAREN_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2861:1: ( RULE_C_PAREN_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2862:1: RULE_C_PAREN_L
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultMetaAccess().getC_PAREN_LTerminalRuleCall_2_0()); 
            }
            match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_rule__DefaultMeta__Group_2__0__Impl5837); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultMetaAccess().getC_PAREN_LTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__DefaultMeta__Group_2__0__Impl"


    // $ANTLR start "rule__DefaultMeta__Group_2__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2873:1: rule__DefaultMeta__Group_2__1 : rule__DefaultMeta__Group_2__1__Impl ;
    public final void rule__DefaultMeta__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2877:1: ( rule__DefaultMeta__Group_2__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2878:2: rule__DefaultMeta__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DefaultMeta__Group_2__1__Impl_in_rule__DefaultMeta__Group_2__15866);
            rule__DefaultMeta__Group_2__1__Impl();

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
    // $ANTLR end "rule__DefaultMeta__Group_2__1"


    // $ANTLR start "rule__DefaultMeta__Group_2__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2884:1: rule__DefaultMeta__Group_2__1__Impl : ( RULE_C_PAREN_R ) ;
    public final void rule__DefaultMeta__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2888:1: ( ( RULE_C_PAREN_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2889:1: ( RULE_C_PAREN_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2889:1: ( RULE_C_PAREN_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2890:1: RULE_C_PAREN_R
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultMetaAccess().getC_PAREN_RTerminalRuleCall_2_1()); 
            }
            match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_rule__DefaultMeta__Group_2__1__Impl5893); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultMetaAccess().getC_PAREN_RTerminalRuleCall_2_1()); 
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
    // $ANTLR end "rule__DefaultMeta__Group_2__1__Impl"


    // $ANTLR start "rule__PackName__Group__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2905:1: rule__PackName__Group__0 : rule__PackName__Group__0__Impl rule__PackName__Group__1 ;
    public final void rule__PackName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2909:1: ( rule__PackName__Group__0__Impl rule__PackName__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2910:2: rule__PackName__Group__0__Impl rule__PackName__Group__1
            {
            pushFollow(FOLLOW_rule__PackName__Group__0__Impl_in_rule__PackName__Group__05926);
            rule__PackName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackName__Group__1_in_rule__PackName__Group__05929);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2917:1: rule__PackName__Group__0__Impl : ( ruleTypeName ) ;
    public final void rule__PackName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2921:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2922:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2922:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2923:1: ruleTypeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackNameAccess().getTypeNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_rule__PackName__Group__0__Impl5956);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2934:1: rule__PackName__Group__1 : rule__PackName__Group__1__Impl ;
    public final void rule__PackName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2938:1: ( rule__PackName__Group__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2939:2: rule__PackName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PackName__Group__1__Impl_in_rule__PackName__Group__15985);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2945:1: rule__PackName__Group__1__Impl : ( ( rule__PackName__Group_1__0 )* ) ;
    public final void rule__PackName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2949:1: ( ( ( rule__PackName__Group_1__0 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2950:1: ( ( rule__PackName__Group_1__0 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2950:1: ( ( rule__PackName__Group_1__0 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2951:1: ( rule__PackName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackNameAccess().getGroup_1()); 
            }
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2952:1: ( rule__PackName__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==33) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2952:2: rule__PackName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PackName__Group_1__0_in_rule__PackName__Group__1__Impl6012);
            	    rule__PackName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2966:1: rule__PackName__Group_1__0 : rule__PackName__Group_1__0__Impl rule__PackName__Group_1__1 ;
    public final void rule__PackName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2970:1: ( rule__PackName__Group_1__0__Impl rule__PackName__Group_1__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2971:2: rule__PackName__Group_1__0__Impl rule__PackName__Group_1__1
            {
            pushFollow(FOLLOW_rule__PackName__Group_1__0__Impl_in_rule__PackName__Group_1__06047);
            rule__PackName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PackName__Group_1__1_in_rule__PackName__Group_1__06050);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2978:1: rule__PackName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__PackName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2982:1: ( ( '.' ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2983:1: ( '.' )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2983:1: ( '.' )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2984:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__PackName__Group_1__0__Impl6078); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2997:1: rule__PackName__Group_1__1 : rule__PackName__Group_1__1__Impl ;
    public final void rule__PackName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3001:1: ( rule__PackName__Group_1__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3002:2: rule__PackName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PackName__Group_1__1__Impl_in_rule__PackName__Group_1__16109);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3008:1: rule__PackName__Group_1__1__Impl : ( ruleTypeName ) ;
    public final void rule__PackName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3012:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3013:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3013:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3014:1: ruleTypeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackNameAccess().getTypeNameParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_rule__PackName__Group_1__1__Impl6136);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3030:1: rule__XML2__InputAssignment_0_0_0 : ( ruleInputDef ) ;
    public final void rule__XML2__InputAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3034:1: ( ( ruleInputDef ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3035:1: ( ruleInputDef )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3035:1: ( ruleInputDef )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3036:1: ruleInputDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getInputInputDefParserRuleCall_0_0_0_0()); 
            }
            pushFollow(FOLLOW_ruleInputDef_in_rule__XML2__InputAssignment_0_0_06174);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3045:1: rule__XML2__PackAssignment_0_0_1 : ( rulePackDef ) ;
    public final void rule__XML2__PackAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3049:1: ( ( rulePackDef ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3050:1: ( rulePackDef )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3050:1: ( rulePackDef )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3051:1: rulePackDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getPackPackDefParserRuleCall_0_0_1_0()); 
            }
            pushFollow(FOLLOW_rulePackDef_in_rule__XML2__PackAssignment_0_0_16205);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3060:1: rule__XML2__PackAssignment_0_1_0 : ( rulePackDef ) ;
    public final void rule__XML2__PackAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3064:1: ( ( rulePackDef ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3065:1: ( rulePackDef )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3065:1: ( rulePackDef )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3066:1: rulePackDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getPackPackDefParserRuleCall_0_1_0_0()); 
            }
            pushFollow(FOLLOW_rulePackDef_in_rule__XML2__PackAssignment_0_1_06236);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3075:1: rule__XML2__InputAssignment_0_1_1 : ( ruleInputDef ) ;
    public final void rule__XML2__InputAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3079:1: ( ( ruleInputDef ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3080:1: ( ruleInputDef )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3080:1: ( ruleInputDef )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3081:1: ruleInputDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getInputInputDefParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleInputDef_in_rule__XML2__InputAssignment_0_1_16267);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3090:1: rule__XML2__PackAssignment_0_2 : ( rulePackDef ) ;
    public final void rule__XML2__PackAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3094:1: ( ( rulePackDef ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3095:1: ( rulePackDef )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3095:1: ( rulePackDef )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3096:1: rulePackDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getPackPackDefParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_rulePackDef_in_rule__XML2__PackAssignment_0_26298);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3105:1: rule__XML2__InputAssignment_0_3 : ( ruleInputDef ) ;
    public final void rule__XML2__InputAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3109:1: ( ( ruleInputDef ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3110:1: ( ruleInputDef )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3110:1: ( ruleInputDef )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3111:1: ruleInputDef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getInputInputDefParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_ruleInputDef_in_rule__XML2__InputAssignment_0_36329);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3120:1: rule__XML2__TypesAssignment_1_0 : ( ruleType ) ;
    public final void rule__XML2__TypesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3124:1: ( ( ruleType ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3125:1: ( ruleType )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3125:1: ( ruleType )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3126:1: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getTypesTypeParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleType_in_rule__XML2__TypesAssignment_1_06360);
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


    // $ANTLR start "rule__XML2__EnumsAssignment_1_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3135:1: rule__XML2__EnumsAssignment_1_1 : ( ruleEnum ) ;
    public final void rule__XML2__EnumsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3139:1: ( ( ruleEnum ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3140:1: ( ruleEnum )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3140:1: ( ruleEnum )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3141:1: ruleEnum
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getEnumsEnumParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleEnum_in_rule__XML2__EnumsAssignment_1_16391);
            ruleEnum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXML2Access().getEnumsEnumParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__XML2__EnumsAssignment_1_1"


    // $ANTLR start "rule__XML2__CommAssignment_1_2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3150:1: rule__XML2__CommAssignment_1_2 : ( ruleOtherComent ) ;
    public final void rule__XML2__CommAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3154:1: ( ( ruleOtherComent ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3155:1: ( ruleOtherComent )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3155:1: ( ruleOtherComent )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3156:1: ruleOtherComent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXML2Access().getCommOtherComentParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleOtherComent_in_rule__XML2__CommAssignment_1_26422);
            ruleOtherComent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXML2Access().getCommOtherComentParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__XML2__CommAssignment_1_2"


    // $ANTLR start "rule__InputDef__CommentAssignment_0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3165:1: rule__InputDef__CommentAssignment_0 : ( ruleOtherComent ) ;
    public final void rule__InputDef__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3169:1: ( ( ruleOtherComent ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3170:1: ( ruleOtherComent )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3170:1: ( ruleOtherComent )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3171:1: ruleOtherComent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputDefAccess().getCommentOtherComentParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleOtherComent_in_rule__InputDef__CommentAssignment_06453);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3180:1: rule__InputDef__InputCHARAssignment_1 : ( RULE_C_INPUT ) ;
    public final void rule__InputDef__InputCHARAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3184:1: ( ( RULE_C_INPUT ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3185:1: ( RULE_C_INPUT )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3185:1: ( RULE_C_INPUT )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3186:1: RULE_C_INPUT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputDefAccess().getInputCHARC_INPUTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_C_INPUT,FOLLOW_RULE_C_INPUT_in_rule__InputDef__InputCHARAssignment_16484); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3195:1: rule__InputDef__UrlAssignment_2 : ( RULE_STRING ) ;
    public final void rule__InputDef__UrlAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3199:1: ( ( RULE_STRING ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3200:1: ( RULE_STRING )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3200:1: ( RULE_STRING )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3201:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputDefAccess().getUrlSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__InputDef__UrlAssignment_26515); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3210:1: rule__PackDef__CommentAssignment_0 : ( ruleOtherComent ) ;
    public final void rule__PackDef__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3214:1: ( ( ruleOtherComent ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3215:1: ( ruleOtherComent )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3215:1: ( ruleOtherComent )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3216:1: ruleOtherComent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackDefAccess().getCommentOtherComentParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleOtherComent_in_rule__PackDef__CommentAssignment_06546);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3225:1: rule__PackDef__PackCHARAssignment_1 : ( RULE_C_PACKAGE ) ;
    public final void rule__PackDef__PackCHARAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3229:1: ( ( RULE_C_PACKAGE ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3230:1: ( RULE_C_PACKAGE )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3230:1: ( RULE_C_PACKAGE )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3231:1: RULE_C_PACKAGE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackDefAccess().getPackCHARC_PACKAGETerminalRuleCall_1_0()); 
            }
            match(input,RULE_C_PACKAGE,FOLLOW_RULE_C_PACKAGE_in_rule__PackDef__PackCHARAssignment_16577); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3240:1: rule__PackDef__PackAssignment_2 : ( rulePackName ) ;
    public final void rule__PackDef__PackAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3244:1: ( ( rulePackName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3245:1: ( rulePackName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3245:1: ( rulePackName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3246:1: rulePackName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackDefAccess().getPackPackNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_rulePackName_in_rule__PackDef__PackAssignment_26608);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3255:1: rule__Type__CommentAssignment_0 : ( ruleTypeComment ) ;
    public final void rule__Type__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3259:1: ( ( ruleTypeComment ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3260:1: ( ruleTypeComment )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3260:1: ( ruleTypeComment )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3261:1: ruleTypeComment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getCommentTypeCommentParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleTypeComment_in_rule__Type__CommentAssignment_06639);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3270:1: rule__Type__EnterAssignment_1 : ( ruleEnter ) ;
    public final void rule__Type__EnterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3274:1: ( ( ruleEnter ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3275:1: ( ruleEnter )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3275:1: ( ruleEnter )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3276:1: ruleEnter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getEnterEnterParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEnter_in_rule__Type__EnterAssignment_16670);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3285:1: rule__Type__PrefixAssignment_2 : ( RULE_C_TYPE ) ;
    public final void rule__Type__PrefixAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3289:1: ( ( RULE_C_TYPE ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3290:1: ( RULE_C_TYPE )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3290:1: ( RULE_C_TYPE )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3291:1: RULE_C_TYPE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getPrefixC_TYPETerminalRuleCall_2_0()); 
            }
            match(input,RULE_C_TYPE,FOLLOW_RULE_C_TYPE_in_rule__Type__PrefixAssignment_26701); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3300:1: rule__Type__NameAssignment_3 : ( ruleTypeName ) ;
    public final void rule__Type__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3304:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3305:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3305:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3306:1: ruleTypeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getNameTypeNameParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_rule__Type__NameAssignment_36732);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3315:1: rule__Type__FieldsAssignment_5_0 : ( ruleField ) ;
    public final void rule__Type__FieldsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3319:1: ( ( ruleField ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3320:1: ( ruleField )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3320:1: ( ruleField )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3321:1: ruleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getFieldsFieldParserRuleCall_5_0_0()); 
            }
            pushFollow(FOLLOW_ruleField_in_rule__Type__FieldsAssignment_5_06763);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3330:1: rule__Type__CommAssignment_5_1 : ( ruleOtherComent ) ;
    public final void rule__Type__CommAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3334:1: ( ( ruleOtherComent ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3335:1: ( ruleOtherComent )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3335:1: ( ruleOtherComent )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3336:1: ruleOtherComent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getCommOtherComentParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleOtherComent_in_rule__Type__CommAssignment_5_16794);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3345:1: rule__Enter__PrefixAssignment_1 : ( RULE_C_MAIN ) ;
    public final void rule__Enter__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3349:1: ( ( RULE_C_MAIN ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3350:1: ( RULE_C_MAIN )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3350:1: ( RULE_C_MAIN )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3351:1: RULE_C_MAIN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getPrefixC_MAINTerminalRuleCall_1_0()); 
            }
            match(input,RULE_C_MAIN,FOLLOW_RULE_C_MAIN_in_rule__Enter__PrefixAssignment_16825); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3360:1: rule__Enter__RootPathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Enter__RootPathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3364:1: ( ( RULE_STRING ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3365:1: ( RULE_STRING )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3365:1: ( RULE_STRING )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3366:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnterAccess().getRootPathSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Enter__RootPathAssignment_36856); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3375:1: rule__Field__CommentAssignment_0 : ( ruleFieldComment ) ;
    public final void rule__Field__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3379:1: ( ( ruleFieldComment ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3380:1: ( ruleFieldComment )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3380:1: ( ruleFieldComment )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3381:1: ruleFieldComment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getCommentFieldCommentParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleFieldComment_in_rule__Field__CommentAssignment_06887);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3390:1: rule__Field__MetaAssignment_1_0 : ( ruleListMeta ) ;
    public final void rule__Field__MetaAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3394:1: ( ( ruleListMeta ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3395:1: ( ruleListMeta )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3395:1: ( ruleListMeta )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3396:1: ruleListMeta
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getMetaListMetaParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleListMeta_in_rule__Field__MetaAssignment_1_06918);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3405:1: rule__Field__MetaAssignment_1_1 : ( ruleSliceMeta ) ;
    public final void rule__Field__MetaAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3409:1: ( ( ruleSliceMeta ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3410:1: ( ruleSliceMeta )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3410:1: ( ruleSliceMeta )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3411:1: ruleSliceMeta
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getMetaSliceMetaParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleSliceMeta_in_rule__Field__MetaAssignment_1_16949);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3420:1: rule__Field__TypeAssignment_2 : ( ruleFieldType ) ;
    public final void rule__Field__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3424:1: ( ( ruleFieldType ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3425:1: ( ruleFieldType )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3425:1: ( ruleFieldType )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3426:1: ruleFieldType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFieldType_in_rule__Field__TypeAssignment_26980);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3435:1: rule__Field__FieldNameAssignment_3 : ( ruleTypeName ) ;
    public final void rule__Field__FieldNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3439:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3440:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3440:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3441:1: ruleTypeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getFieldNameTypeNameParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_rule__Field__FieldNameAssignment_37011);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3450:1: rule__Field__NodePathAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Field__NodePathAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3454:1: ( ( RULE_STRING ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3455:1: ( RULE_STRING )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3455:1: ( RULE_STRING )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3456:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNodePathSTRINGTerminalRuleCall_5_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Field__NodePathAssignment_57042); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3465:1: rule__FieldType__TypeAssignment : ( ruleTypeName ) ;
    public final void rule__FieldType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3469:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3470:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3470:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3471:1: ruleTypeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldTypeAccess().getTypeTypeNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_rule__FieldType__TypeAssignment7073);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3480:1: rule__ListMeta__PrefixAssignment_1 : ( RULE_C_LIST ) ;
    public final void rule__ListMeta__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3484:1: ( ( RULE_C_LIST ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3485:1: ( RULE_C_LIST )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3485:1: ( RULE_C_LIST )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3486:1: RULE_C_LIST
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getPrefixC_LISTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_C_LIST,FOLLOW_RULE_C_LIST_in_rule__ListMeta__PrefixAssignment_17104); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3495:1: rule__ListMeta__ParamsAssignment_2_1_0 : ( ruleFieldMetaKey ) ;
    public final void rule__ListMeta__ParamsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3499:1: ( ( ruleFieldMetaKey ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3500:1: ( ruleFieldMetaKey )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3500:1: ( ruleFieldMetaKey )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3501:1: ruleFieldMetaKey
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getParamsFieldMetaKeyParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleFieldMetaKey_in_rule__ListMeta__ParamsAssignment_2_1_07135);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3510:1: rule__ListMeta__ParamsAssignment_2_1_1_1 : ( ruleFieldMetaKey ) ;
    public final void rule__ListMeta__ParamsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3514:1: ( ( ruleFieldMetaKey ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3515:1: ( ruleFieldMetaKey )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3515:1: ( ruleFieldMetaKey )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3516:1: ruleFieldMetaKey
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListMetaAccess().getParamsFieldMetaKeyParserRuleCall_2_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleFieldMetaKey_in_rule__ListMeta__ParamsAssignment_2_1_1_17166);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3525:1: rule__SliceMeta__PrefixAssignment_1 : ( RULE_C_SLICE ) ;
    public final void rule__SliceMeta__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3529:1: ( ( RULE_C_SLICE ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3530:1: ( RULE_C_SLICE )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3530:1: ( RULE_C_SLICE )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3531:1: RULE_C_SLICE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSliceMetaAccess().getPrefixC_SLICETerminalRuleCall_1_0()); 
            }
            match(input,RULE_C_SLICE,FOLLOW_RULE_C_SLICE_in_rule__SliceMeta__PrefixAssignment_17197); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3540:1: rule__SliceMeta__SliceCharAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SliceMeta__SliceCharAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3544:1: ( ( RULE_STRING ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3545:1: ( RULE_STRING )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3545:1: ( RULE_STRING )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3546:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSliceMetaAccess().getSliceCharSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SliceMeta__SliceCharAssignment_37228); if (state.failed) return ;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3555:1: rule__FieldMetaKey__FieldNameAssignment : ( ruleTypeName ) ;
    public final void rule__FieldMetaKey__FieldNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3559:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3560:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3560:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3561:1: ruleTypeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldMetaKeyAccess().getFieldNameTypeNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_rule__FieldMetaKey__FieldNameAssignment7259);
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


    // $ANTLR start "rule__Enum__CommentAssignment_0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3570:1: rule__Enum__CommentAssignment_0 : ( ruleTypeComment ) ;
    public final void rule__Enum__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3574:1: ( ( ruleTypeComment ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3575:1: ( ruleTypeComment )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3575:1: ( ruleTypeComment )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3576:1: ruleTypeComment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getCommentTypeCommentParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleTypeComment_in_rule__Enum__CommentAssignment_07290);
            ruleTypeComment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getCommentTypeCommentParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Enum__CommentAssignment_0"


    // $ANTLR start "rule__Enum__PrefixAssignment_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3585:1: rule__Enum__PrefixAssignment_1 : ( RULE_C_ENUM ) ;
    public final void rule__Enum__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3589:1: ( ( RULE_C_ENUM ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3590:1: ( RULE_C_ENUM )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3590:1: ( RULE_C_ENUM )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3591:1: RULE_C_ENUM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getPrefixC_ENUMTerminalRuleCall_1_0()); 
            }
            match(input,RULE_C_ENUM,FOLLOW_RULE_C_ENUM_in_rule__Enum__PrefixAssignment_17321); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getPrefixC_ENUMTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Enum__PrefixAssignment_1"


    // $ANTLR start "rule__Enum__NameAssignment_2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3600:1: rule__Enum__NameAssignment_2 : ( ruleTypeName ) ;
    public final void rule__Enum__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3604:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3605:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3605:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3606:1: ruleTypeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getNameTypeNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_rule__Enum__NameAssignment_27352);
            ruleTypeName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getNameTypeNameParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Enum__NameAssignment_2"


    // $ANTLR start "rule__Enum__FieldsAssignment_4_0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3615:1: rule__Enum__FieldsAssignment_4_0 : ( ruleEnumField ) ;
    public final void rule__Enum__FieldsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3619:1: ( ( ruleEnumField ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3620:1: ( ruleEnumField )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3620:1: ( ruleEnumField )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3621:1: ruleEnumField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getFieldsEnumFieldParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_ruleEnumField_in_rule__Enum__FieldsAssignment_4_07383);
            ruleEnumField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getFieldsEnumFieldParserRuleCall_4_0_0()); 
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
    // $ANTLR end "rule__Enum__FieldsAssignment_4_0"


    // $ANTLR start "rule__Enum__CommAssignment_4_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3630:1: rule__Enum__CommAssignment_4_1 : ( ruleOtherComent ) ;
    public final void rule__Enum__CommAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3634:1: ( ( ruleOtherComent ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3635:1: ( ruleOtherComent )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3635:1: ( ruleOtherComent )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3636:1: ruleOtherComent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getCommOtherComentParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleOtherComent_in_rule__Enum__CommAssignment_4_17414);
            ruleOtherComent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getCommOtherComentParserRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__Enum__CommAssignment_4_1"


    // $ANTLR start "rule__EnumField__CommentAssignment_0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3645:1: rule__EnumField__CommentAssignment_0 : ( ruleFieldComment ) ;
    public final void rule__EnumField__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3649:1: ( ( ruleFieldComment ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3650:1: ( ruleFieldComment )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3650:1: ( ruleFieldComment )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3651:1: ruleFieldComment
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getCommentFieldCommentParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleFieldComment_in_rule__EnumField__CommentAssignment_07445);
            ruleFieldComment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getCommentFieldCommentParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__EnumField__CommentAssignment_0"


    // $ANTLR start "rule__EnumField__MetaAssignment_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3660:1: rule__EnumField__MetaAssignment_1 : ( ruleDefaultMeta ) ;
    public final void rule__EnumField__MetaAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3664:1: ( ( ruleDefaultMeta ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3665:1: ( ruleDefaultMeta )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3665:1: ( ruleDefaultMeta )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3666:1: ruleDefaultMeta
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getMetaDefaultMetaParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleDefaultMeta_in_rule__EnumField__MetaAssignment_17476);
            ruleDefaultMeta();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getMetaDefaultMetaParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__EnumField__MetaAssignment_1"


    // $ANTLR start "rule__EnumField__FieldNameAssignment_2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3675:1: rule__EnumField__FieldNameAssignment_2 : ( ruleTypeName ) ;
    public final void rule__EnumField__FieldNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3679:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3680:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3680:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3681:1: ruleTypeName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getFieldNameTypeNameParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleTypeName_in_rule__EnumField__FieldNameAssignment_27507);
            ruleTypeName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getFieldNameTypeNameParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__EnumField__FieldNameAssignment_2"


    // $ANTLR start "rule__EnumField__FieldValueAssignment_4"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3690:1: rule__EnumField__FieldValueAssignment_4 : ( RULE_STRING ) ;
    public final void rule__EnumField__FieldValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3694:1: ( ( RULE_STRING ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3695:1: ( RULE_STRING )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3695:1: ( RULE_STRING )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3696:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumFieldAccess().getFieldValueSTRINGTerminalRuleCall_4_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EnumField__FieldValueAssignment_47538); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumFieldAccess().getFieldValueSTRINGTerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__EnumField__FieldValueAssignment_4"


    // $ANTLR start "rule__DefaultMeta__PrefixAssignment_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3705:1: rule__DefaultMeta__PrefixAssignment_1 : ( RULE_C_DEFAULT ) ;
    public final void rule__DefaultMeta__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3709:1: ( ( RULE_C_DEFAULT ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3710:1: ( RULE_C_DEFAULT )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3710:1: ( RULE_C_DEFAULT )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3711:1: RULE_C_DEFAULT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultMetaAccess().getPrefixC_DEFAULTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_C_DEFAULT,FOLLOW_RULE_C_DEFAULT_in_rule__DefaultMeta__PrefixAssignment_17569); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultMetaAccess().getPrefixC_DEFAULTTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__DefaultMeta__PrefixAssignment_1"


    // $ANTLR start "rule__OtherComent__CommAssignment"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3720:1: rule__OtherComent__CommAssignment : ( RULE_COMMENT ) ;
    public final void rule__OtherComent__CommAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3724:1: ( ( RULE_COMMENT ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3725:1: ( RULE_COMMENT )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3725:1: ( RULE_COMMENT )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:3726:1: RULE_COMMENT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOtherComentAccess().getCommCOMMENTTerminalRuleCall_0()); 
            }
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__OtherComent__CommAssignment7600); if (state.failed) return ;
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
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:604:1: ( ( ( rule__XML2__TypesAssignment_1_0 ) ) )
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:604:1: ( ( rule__XML2__TypesAssignment_1_0 ) )
        {
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:604:1: ( ( rule__XML2__TypesAssignment_1_0 ) )
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:605:1: ( rule__XML2__TypesAssignment_1_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getXML2Access().getTypesAssignment_1_0()); 
        }
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:606:1: ( rule__XML2__TypesAssignment_1_0 )
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:606:2: rule__XML2__TypesAssignment_1_0
        {
        pushFollow(FOLLOW_rule__XML2__TypesAssignment_1_0_in_synpred4_InternalCfg1241);
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
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:610:6: ( ( ( rule__XML2__EnumsAssignment_1_1 ) ) )
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:610:6: ( ( rule__XML2__EnumsAssignment_1_1 ) )
        {
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:610:6: ( ( rule__XML2__EnumsAssignment_1_1 ) )
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:611:1: ( rule__XML2__EnumsAssignment_1_1 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getXML2Access().getEnumsAssignment_1_1()); 
        }
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:612:1: ( rule__XML2__EnumsAssignment_1_1 )
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:612:2: rule__XML2__EnumsAssignment_1_1
        {
        pushFollow(FOLLOW_rule__XML2__EnumsAssignment_1_1_in_synpred5_InternalCfg1259);
        rule__XML2__EnumsAssignment_1_1();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred5_InternalCfg

    // $ANTLR start synpred6_InternalCfg
    public final void synpred6_InternalCfg_fragment() throws RecognitionException {   
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:632:1: ( ( ( rule__Type__FieldsAssignment_5_0 ) ) )
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:632:1: ( ( rule__Type__FieldsAssignment_5_0 ) )
        {
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:632:1: ( ( rule__Type__FieldsAssignment_5_0 ) )
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:633:1: ( rule__Type__FieldsAssignment_5_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getTypeAccess().getFieldsAssignment_5_0()); 
        }
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:634:1: ( rule__Type__FieldsAssignment_5_0 )
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:634:2: rule__Type__FieldsAssignment_5_0
        {
        pushFollow(FOLLOW_rule__Type__FieldsAssignment_5_0_in_synpred6_InternalCfg1310);
        rule__Type__FieldsAssignment_5_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred6_InternalCfg

    // $ANTLR start synpred8_InternalCfg
    public final void synpred8_InternalCfg_fragment() throws RecognitionException {   
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:676:1: ( ( ( rule__Enum__FieldsAssignment_4_0 ) ) )
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:676:1: ( ( rule__Enum__FieldsAssignment_4_0 ) )
        {
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:676:1: ( ( rule__Enum__FieldsAssignment_4_0 ) )
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:677:1: ( rule__Enum__FieldsAssignment_4_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getEnumAccess().getFieldsAssignment_4_0()); 
        }
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:678:1: ( rule__Enum__FieldsAssignment_4_0 )
        // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:678:2: rule__Enum__FieldsAssignment_4_0
        {
        pushFollow(FOLLOW_rule__Enum__FieldsAssignment_4_0_in_synpred8_InternalCfg1412);
        rule__Enum__FieldsAssignment_4_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred8_InternalCfg

    // Delegated rules

    public final boolean synpred6_InternalCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalCfg_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred8_InternalCfg() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalCfg_fragment(); // can never throw exception
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
    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA1_eotS =
        "\52\uffff";
    static final String DFA1_eofS =
        "\3\uffff\1\24\1\30\17\24\1\uffff\2\30\6\uffff\15\24";
    static final String DFA1_minS =
        "\2\4\1\33\21\4\1\uffff\2\4\2\uffff\1\5\1\uffff\2\23\15\4";
    static final String DFA1_maxS =
        "\2\34\1\33\1\25\1\34\15\41\2\25\1\uffff\2\34\2\uffff\1\21\1\uffff"+
        "\2\33\15\41";
    static final String DFA1_acceptS =
        "\24\uffff\1\3\2\uffff\1\1\1\4\1\uffff\1\2\17\uffff";
    static final String DFA1_specialS =
        "\52\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\1\2\26\uffff\1\3",
            "\1\1\1\2\26\uffff\1\3",
            "\1\4",
            "\1\23\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
            "\1\20\1\21\1\22\2\uffff\1\24",
            "\1\26\3\uffff\2\30\10\uffff\1\25\2\uffff\1\30\6\uffff\1\27",
            "\1\23\1\32\2\uffff\2\24\10\uffff\1\22\2\uffff\1\24\5\uffff"+
            "\1\32\5\uffff\1\31",
            "\1\23\1\32\2\uffff\2\24\10\uffff\1\22\2\uffff\1\24\13\uffff"+
            "\1\31",
            "\1\23\1\32\2\uffff\2\24\10\uffff\1\22\2\uffff\1\24\13\uffff"+
            "\1\31",
            "\1\23\1\33\14\24\1\22\2\uffff\1\24\13\uffff\1\31",
            "\1\23\1\34\14\24\1\22\2\uffff\1\24\13\uffff\1\31",
            "\1\23\1\32\2\uffff\2\24\10\uffff\1\22\2\uffff\1\24\13\uffff"+
            "\1\31",
            "\1\23\1\32\2\uffff\2\24\10\uffff\1\22\2\uffff\1\24\13\uffff"+
            "\1\31",
            "\1\23\1\32\2\uffff\2\24\10\uffff\1\22\2\uffff\1\24\13\uffff"+
            "\1\31",
            "\1\23\1\32\2\uffff\2\24\10\uffff\1\22\2\uffff\1\24\13\uffff"+
            "\1\31",
            "\1\23\1\32\2\uffff\2\24\10\uffff\1\22\2\uffff\1\24\13\uffff"+
            "\1\31",
            "\1\23\1\32\2\uffff\2\24\10\uffff\1\22\2\uffff\1\24\13\uffff"+
            "\1\31",
            "\1\23\1\32\2\uffff\2\24\10\uffff\1\22\2\uffff\1\24\13\uffff"+
            "\1\31",
            "\1\23\1\32\2\uffff\2\24\10\uffff\1\22\2\uffff\1\24\13\uffff"+
            "\1\31",
            "\1\23\1\32\2\uffff\2\24\13\uffff\1\24",
            "\1\23\1\32\2\uffff\2\24\13\uffff\1\24",
            "",
            "\1\26\3\uffff\2\30\13\uffff\1\30\6\uffff\1\27",
            "\1\26\3\uffff\2\30\13\uffff\1\30\6\uffff\1\27",
            "",
            "",
            "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1"+
            "\50\1\51",
            "",
            "\1\24\7\uffff\1\32",
            "\1\24\7\uffff\1\32",
            "\1\23\1\32\2\uffff\2\24\10\uffff\1\22\2\uffff\1\24\13\uffff"+
            "\1\31",
            "\1\23\1\32\2\uffff\2\24\10\uffff\1\22\2\uffff\1\24\13\uffff"+
            "\1\31",
            "\1\23\1\32\2\uffff\2\24\10\uffff\1\22\2\uffff\1\24\13\uffff"+
            "\1\31",
            "\1\23\1\32\2\uffff\2\24\10\uffff\1\22\2\uffff\1\24\13\uffff"+
            "\1\31",
            "\1\23\1\32\2\uffff\2\24\10\uffff\1\22\2\uffff\1\24\13\uffff"+
            "\1\31",
            "\1\23\1\32\2\uffff\2\24\10\uffff\1\22\2\uffff\1\24\13\uffff"+
            "\1\31",
            "\1\23\1\32\2\uffff\2\24\10\uffff\1\22\2\uffff\1\24\13\uffff"+
            "\1\31",
            "\1\23\1\32\2\uffff\2\24\10\uffff\1\22\2\uffff\1\24\13\uffff"+
            "\1\31",
            "\1\23\1\32\2\uffff\2\24\10\uffff\1\22\2\uffff\1\24\13\uffff"+
            "\1\31",
            "\1\23\1\32\2\uffff\2\24\10\uffff\1\22\2\uffff\1\24\13\uffff"+
            "\1\31",
            "\1\23\1\32\2\uffff\2\24\10\uffff\1\22\2\uffff\1\24\13\uffff"+
            "\1\31",
            "\1\23\1\32\2\uffff\2\24\10\uffff\1\22\2\uffff\1\24\13\uffff"+
            "\1\31",
            "\1\23\1\32\2\uffff\2\24\10\uffff\1\22\2\uffff\1\24\13\uffff"+
            "\1\31"
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
            return "565:1: rule__XML2__Alternatives_0 : ( ( ( rule__XML2__Group_0_0__0 ) ) | ( ( rule__XML2__Group_0_1__0 ) ) | ( ( rule__XML2__PackAssignment_0_2 ) ) | ( ( rule__XML2__InputAssignment_0_3 ) ) );";
        }
    }
    static final String DFA11_eotS =
        "\14\uffff";
    static final String DFA11_eofS =
        "\1\5\1\2\1\uffff\2\2\7\uffff";
    static final String DFA11_minS =
        "\2\4\1\uffff\2\4\1\uffff\1\23\4\5\1\23";
    static final String DFA11_maxS =
        "\1\25\1\41\1\uffff\2\41\1\uffff\1\33\4\23\1\33";
    static final String DFA11_acceptS =
        "\2\uffff\1\1\2\uffff\1\2\6\uffff";
    static final String DFA11_specialS =
        "\14\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\5\1\1\2\2\1\3\1\4\10\2\1\5\2\uffff\1\5",
            "\2\2\2\uffff\2\2\10\uffff\1\2\2\uffff\1\2\5\uffff\1\5\5\uffff"+
            "\1\2",
            "",
            "\1\2\1\6\2\5\1\7\1\10\10\5\1\2\2\uffff\1\2\13\uffff\1\2",
            "\1\2\1\13\2\5\1\11\1\12\10\5\1\2\2\uffff\1\2\13\uffff\1\2",
            "",
            "\1\5\7\uffff\1\2",
            "\15\2\1\uffff\1\5",
            "\15\2\1\uffff\1\5",
            "\15\2\1\uffff\1\5",
            "\15\2\1\uffff\1\5",
            "\1\5\7\uffff\1\2"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1166:1: ( rule__PackDef__PackAssignment_2 )?";
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
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_entryRuleEnumField727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumField734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__0_in_ruleEnumField760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultMeta_in_entryRuleDefaultMeta787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultMeta794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultMeta__Group__0_in_ruleDefaultMeta820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeComment_in_entryRuleTypeComment847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeComment854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleTypeComment880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldComment_in_entryRuleFieldComment906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldComment913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleFieldComment939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_entryRuleOtherComent965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOtherComent972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OtherComent__CommAssignment_in_ruleOtherComent998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackName_in_entryRulePackName1025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackName1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackName__Group__0_in_rulePackName1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_entryRuleTypeName1085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeName1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeName__Alternatives_in_ruleTypeName1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group_0_0__0_in_rule__XML2__Alternatives_01154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group_0_1__0_in_rule__XML2__Alternatives_01172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__PackAssignment_0_2_in_rule__XML2__Alternatives_01190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__InputAssignment_0_3_in_rule__XML2__Alternatives_01208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__TypesAssignment_1_0_in_rule__XML2__Alternatives_11241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__EnumsAssignment_1_1_in_rule__XML2__Alternatives_11259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__CommAssignment_1_2_in_rule__XML2__Alternatives_11277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__FieldsAssignment_5_0_in_rule__Type__Alternatives_51310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__CommAssignment_5_1_in_rule__Type__Alternatives_51328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__MetaAssignment_1_0_in_rule__Field__Alternatives_11361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__MetaAssignment_1_1_in_rule__Field__Alternatives_11379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__FieldsAssignment_4_0_in_rule__Enum__Alternatives_41412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__CommAssignment_4_1_in_rule__Enum__Alternatives_41430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INPUT_in_rule__TypeName__Alternatives1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_MAIN_in_rule__TypeName__Alternatives1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_DEFAULT_in_rule__TypeName__Alternatives1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_TYPE_in_rule__TypeName__Alternatives1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_ENUM_in_rule__TypeName__Alternatives1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INT_in_rule__TypeName__Alternatives1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_UINT_in_rule__TypeName__Alternatives1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BOOL_in_rule__TypeName__Alternatives1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_NUMBER_in_rule__TypeName__Alternatives1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_STRING_in_rule__TypeName__Alternatives1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_LIST_in_rule__TypeName__Alternatives1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_SLICE_in_rule__TypeName__Alternatives1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rule__TypeName__Alternatives1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group__0__Impl_in_rule__XML2__Group__01697 = new BitSet(new long[]{0x0000000000200310L});
    public static final BitSet FOLLOW_rule__XML2__Group__1_in_rule__XML2__Group__01700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Alternatives_0_in_rule__XML2__Group__0__Impl1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group__1__Impl_in_rule__XML2__Group__11757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Alternatives_1_in_rule__XML2__Group__1__Impl1784 = new BitSet(new long[]{0x0000000000200312L});
    public static final BitSet FOLLOW_rule__XML2__Group_0_0__0__Impl_in_rule__XML2__Group_0_0__01819 = new BitSet(new long[]{0x0000000010200310L});
    public static final BitSet FOLLOW_rule__XML2__Group_0_0__1_in_rule__XML2__Group_0_0__01822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__InputAssignment_0_0_0_in_rule__XML2__Group_0_0__0__Impl1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group_0_0__1__Impl_in_rule__XML2__Group_0_0__11879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__PackAssignment_0_0_1_in_rule__XML2__Group_0_0__1__Impl1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group_0_1__0__Impl_in_rule__XML2__Group_0_1__01940 = new BitSet(new long[]{0x0000000000200330L});
    public static final BitSet FOLLOW_rule__XML2__Group_0_1__1_in_rule__XML2__Group_0_1__01943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__PackAssignment_0_1_0_in_rule__XML2__Group_0_1__0__Impl1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group_0_1__1__Impl_in_rule__XML2__Group_0_1__12000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__InputAssignment_0_1_1_in_rule__XML2__Group_0_1__1__Impl2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDef__Group__0__Impl_in_rule__InputDef__Group__02061 = new BitSet(new long[]{0x0000000000200330L});
    public static final BitSet FOLLOW_rule__InputDef__Group__1_in_rule__InputDef__Group__02064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDef__CommentAssignment_0_in_rule__InputDef__Group__0__Impl2091 = new BitSet(new long[]{0x0000000000200312L});
    public static final BitSet FOLLOW_rule__InputDef__Group__1__Impl_in_rule__InputDef__Group__12122 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__InputDef__Group__2_in_rule__InputDef__Group__12125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDef__InputCHARAssignment_1_in_rule__InputDef__Group__1__Impl2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDef__Group__2__Impl_in_rule__InputDef__Group__22182 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__InputDef__Group__3_in_rule__InputDef__Group__22185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDef__UrlAssignment_2_in_rule__InputDef__Group__2__Impl2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InputDef__Group__3__Impl_in_rule__InputDef__Group__32242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_rule__InputDef__Group__3__Impl2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackDef__Group__0__Impl_in_rule__PackDef__Group__02309 = new BitSet(new long[]{0x0000000010200310L});
    public static final BitSet FOLLOW_rule__PackDef__Group__1_in_rule__PackDef__Group__02312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackDef__CommentAssignment_0_in_rule__PackDef__Group__0__Impl2339 = new BitSet(new long[]{0x0000000000200312L});
    public static final BitSet FOLLOW_rule__PackDef__Group__1__Impl_in_rule__PackDef__Group__12370 = new BitSet(new long[]{0x000000000007FFE0L});
    public static final BitSet FOLLOW_rule__PackDef__Group__2_in_rule__PackDef__Group__12373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackDef__PackCHARAssignment_1_in_rule__PackDef__Group__1__Impl2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackDef__Group__2__Impl_in_rule__PackDef__Group__22430 = new BitSet(new long[]{0x000000000007FFE0L});
    public static final BitSet FOLLOW_rule__PackDef__Group__3_in_rule__PackDef__Group__22433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackDef__PackAssignment_2_in_rule__PackDef__Group__2__Impl2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackDef__Group__3__Impl_in_rule__PackDef__Group__32491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_rule__PackDef__Group__3__Impl2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__02558 = new BitSet(new long[]{0x0000000000200110L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__02561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__CommentAssignment_0_in_rule__Type__Group__0__Impl2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__12619 = new BitSet(new long[]{0x0000000000200110L});
    public static final BitSet FOLLOW_rule__Type__Group__2_in_rule__Type__Group__12622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__EnterAssignment_1_in_rule__Type__Group__1__Impl2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__2__Impl_in_rule__Type__Group__22680 = new BitSet(new long[]{0x000000000003FFE0L});
    public static final BitSet FOLLOW_rule__Type__Group__3_in_rule__Type__Group__22683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__PrefixAssignment_2_in_rule__Type__Group__2__Impl2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__3__Impl_in_rule__Type__Group__32740 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Type__Group__4_in_rule__Type__Group__32743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__NameAssignment_3_in_rule__Type__Group__3__Impl2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__4__Impl_in_rule__Type__Group__42800 = new BitSet(new long[]{0x000000000033FFF0L});
    public static final BitSet FOLLOW_rule__Type__Group__5_in_rule__Type__Group__42803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACE_L_in_rule__Type__Group__4__Impl2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__5__Impl_in_rule__Type__Group__52859 = new BitSet(new long[]{0x000000000033FFF0L});
    public static final BitSet FOLLOW_rule__Type__Group__6_in_rule__Type__Group__52862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_5_in_rule__Type__Group__5__Impl2889 = new BitSet(new long[]{0x000000000023FFF2L});
    public static final BitSet FOLLOW_rule__Type__Group__6__Impl_in_rule__Type__Group__62920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACE_R_in_rule__Type__Group__6__Impl2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__Group__0__Impl_in_rule__Enter__Group__02990 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Enter__Group__1_in_rule__Enter__Group__02993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_L_in_rule__Enter__Group__0__Impl3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__Group__1__Impl_in_rule__Enter__Group__13049 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Enter__Group__2_in_rule__Enter__Group__13052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__PrefixAssignment_1_in_rule__Enter__Group__1__Impl3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__Group__2__Impl_in_rule__Enter__Group__23109 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Enter__Group__3_in_rule__Enter__Group__23112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_rule__Enter__Group__2__Impl3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__Group__3__Impl_in_rule__Enter__Group__33168 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Enter__Group__4_in_rule__Enter__Group__33171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__RootPathAssignment_3_in_rule__Enter__Group__3__Impl3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__Group__4__Impl_in_rule__Enter__Group__43228 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Enter__Group__5_in_rule__Enter__Group__43231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_rule__Enter__Group__4__Impl3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enter__Group__5__Impl_in_rule__Enter__Group__53287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_R_in_rule__Enter__Group__5__Impl3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__03355 = new BitSet(new long[]{0x000000000023FFF0L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__03358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__CommentAssignment_0_in_rule__Field__Group__0__Impl3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__13416 = new BitSet(new long[]{0x000000000023FFF0L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__13419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Alternatives_1_in_rule__Field__Group__1__Impl3446 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__23477 = new BitSet(new long[]{0x000000000003FFE0L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__23480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypeAssignment_2_in_rule__Field__Group__2__Impl3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__33537 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__33540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__FieldNameAssignment_3_in_rule__Field__Group__3__Impl3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__43597 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Field__Group__5_in_rule__Field__Group__43600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_rule__Field__Group__4__Impl3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__53656 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Field__Group__6_in_rule__Field__Group__53659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NodePathAssignment_5_in_rule__Field__Group__5__Impl3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__6__Impl_in_rule__Field__Group__63716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_rule__Field__Group__6__Impl3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group__0__Impl_in_rule__ListMeta__Group__03789 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ListMeta__Group__1_in_rule__ListMeta__Group__03792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_L_in_rule__ListMeta__Group__0__Impl3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group__1__Impl_in_rule__ListMeta__Group__13848 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__ListMeta__Group__2_in_rule__ListMeta__Group__13851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__PrefixAssignment_1_in_rule__ListMeta__Group__1__Impl3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group__2__Impl_in_rule__ListMeta__Group__23908 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__ListMeta__Group__3_in_rule__ListMeta__Group__23911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2__0_in_rule__ListMeta__Group__2__Impl3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group__3__Impl_in_rule__ListMeta__Group__33969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_R_in_rule__ListMeta__Group__3__Impl3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2__0__Impl_in_rule__ListMeta__Group_2__04033 = new BitSet(new long[]{0x000000000083FFE0L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2__1_in_rule__ListMeta__Group_2__04036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_rule__ListMeta__Group_2__0__Impl4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2__1__Impl_in_rule__ListMeta__Group_2__14092 = new BitSet(new long[]{0x000000000083FFE0L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2__2_in_rule__ListMeta__Group_2__14095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2_1__0_in_rule__ListMeta__Group_2__1__Impl4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2__2__Impl_in_rule__ListMeta__Group_2__24153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_rule__ListMeta__Group_2__2__Impl4180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2_1__0__Impl_in_rule__ListMeta__Group_2_1__04215 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2_1__1_in_rule__ListMeta__Group_2_1__04218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__ParamsAssignment_2_1_0_in_rule__ListMeta__Group_2_1__0__Impl4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2_1__1__Impl_in_rule__ListMeta__Group_2_1__14275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2_1_1__0_in_rule__ListMeta__Group_2_1__1__Impl4302 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2_1_1__0__Impl_in_rule__ListMeta__Group_2_1_1__04337 = new BitSet(new long[]{0x000000000003FFE0L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2_1_1__1_in_rule__ListMeta__Group_2_1_1__04340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_COMMA_in_rule__ListMeta__Group_2_1_1__0__Impl4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__Group_2_1_1__1__Impl_in_rule__ListMeta__Group_2_1_1__14396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListMeta__ParamsAssignment_2_1_1_1_in_rule__ListMeta__Group_2_1_1__1__Impl4423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SliceMeta__Group__0__Impl_in_rule__SliceMeta__Group__04457 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SliceMeta__Group__1_in_rule__SliceMeta__Group__04460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_L_in_rule__SliceMeta__Group__0__Impl4487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SliceMeta__Group__1__Impl_in_rule__SliceMeta__Group__14516 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SliceMeta__Group__2_in_rule__SliceMeta__Group__14519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SliceMeta__PrefixAssignment_1_in_rule__SliceMeta__Group__1__Impl4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SliceMeta__Group__2__Impl_in_rule__SliceMeta__Group__24576 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__SliceMeta__Group__3_in_rule__SliceMeta__Group__24579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_rule__SliceMeta__Group__2__Impl4606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SliceMeta__Group__3__Impl_in_rule__SliceMeta__Group__34635 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SliceMeta__Group__4_in_rule__SliceMeta__Group__34638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SliceMeta__SliceCharAssignment_3_in_rule__SliceMeta__Group__3__Impl4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SliceMeta__Group__4__Impl_in_rule__SliceMeta__Group__44695 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__SliceMeta__Group__5_in_rule__SliceMeta__Group__44698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_rule__SliceMeta__Group__4__Impl4725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SliceMeta__Group__5__Impl_in_rule__SliceMeta__Group__54754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_R_in_rule__SliceMeta__Group__5__Impl4781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__04822 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__04825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__CommentAssignment_0_in_rule__Enum__Group__0__Impl4852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__14883 = new BitSet(new long[]{0x000000000003FFE0L});
    public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__14886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__PrefixAssignment_1_in_rule__Enum__Group__1__Impl4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__24943 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__24946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__NameAssignment_2_in_rule__Enum__Group__2__Impl4973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__35003 = new BitSet(new long[]{0x000000000033FFF0L});
    public static final BitSet FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__35006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACE_L_in_rule__Enum__Group__3__Impl5033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__45062 = new BitSet(new long[]{0x000000000033FFF0L});
    public static final BitSet FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__45065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Alternatives_4_in_rule__Enum__Group__4__Impl5092 = new BitSet(new long[]{0x000000000023FFF2L});
    public static final BitSet FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__55123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACE_R_in_rule__Enum__Group__5__Impl5150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__0__Impl_in_rule__EnumField__Group__05191 = new BitSet(new long[]{0x000000000023FFF0L});
    public static final BitSet FOLLOW_rule__EnumField__Group__1_in_rule__EnumField__Group__05194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__CommentAssignment_0_in_rule__EnumField__Group__0__Impl5221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__1__Impl_in_rule__EnumField__Group__15252 = new BitSet(new long[]{0x000000000023FFF0L});
    public static final BitSet FOLLOW_rule__EnumField__Group__2_in_rule__EnumField__Group__15255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__MetaAssignment_1_in_rule__EnumField__Group__1__Impl5282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__2__Impl_in_rule__EnumField__Group__25313 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group__3_in_rule__EnumField__Group__25316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__FieldNameAssignment_2_in_rule__EnumField__Group__2__Impl5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__3__Impl_in_rule__EnumField__Group__35373 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__EnumField__Group__4_in_rule__EnumField__Group__35376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_rule__EnumField__Group__3__Impl5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__4__Impl_in_rule__EnumField__Group__45432 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__EnumField__Group__5_in_rule__EnumField__Group__45435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__FieldValueAssignment_4_in_rule__EnumField__Group__4__Impl5462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__5__Impl_in_rule__EnumField__Group__55492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_rule__EnumField__Group__5__Impl5520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultMeta__Group__0__Impl_in_rule__DefaultMeta__Group__05563 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__DefaultMeta__Group__1_in_rule__DefaultMeta__Group__05566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_L_in_rule__DefaultMeta__Group__0__Impl5593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultMeta__Group__1__Impl_in_rule__DefaultMeta__Group__15622 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__DefaultMeta__Group__2_in_rule__DefaultMeta__Group__15625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultMeta__PrefixAssignment_1_in_rule__DefaultMeta__Group__1__Impl5652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultMeta__Group__2__Impl_in_rule__DefaultMeta__Group__25682 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__DefaultMeta__Group__3_in_rule__DefaultMeta__Group__25685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultMeta__Group_2__0_in_rule__DefaultMeta__Group__2__Impl5712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultMeta__Group__3__Impl_in_rule__DefaultMeta__Group__35743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_R_in_rule__DefaultMeta__Group__3__Impl5770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultMeta__Group_2__0__Impl_in_rule__DefaultMeta__Group_2__05807 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__DefaultMeta__Group_2__1_in_rule__DefaultMeta__Group_2__05810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_rule__DefaultMeta__Group_2__0__Impl5837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultMeta__Group_2__1__Impl_in_rule__DefaultMeta__Group_2__15866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_rule__DefaultMeta__Group_2__1__Impl5893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackName__Group__0__Impl_in_rule__PackName__Group__05926 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__PackName__Group__1_in_rule__PackName__Group__05929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__PackName__Group__0__Impl5956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackName__Group__1__Impl_in_rule__PackName__Group__15985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackName__Group_1__0_in_rule__PackName__Group__1__Impl6012 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__PackName__Group_1__0__Impl_in_rule__PackName__Group_1__06047 = new BitSet(new long[]{0x000000000003FFE0L});
    public static final BitSet FOLLOW_rule__PackName__Group_1__1_in_rule__PackName__Group_1__06050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PackName__Group_1__0__Impl6078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackName__Group_1__1__Impl_in_rule__PackName__Group_1__16109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__PackName__Group_1__1__Impl6136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputDef_in_rule__XML2__InputAssignment_0_0_06174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackDef_in_rule__XML2__PackAssignment_0_0_16205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackDef_in_rule__XML2__PackAssignment_0_1_06236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputDef_in_rule__XML2__InputAssignment_0_1_16267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackDef_in_rule__XML2__PackAssignment_0_26298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputDef_in_rule__XML2__InputAssignment_0_36329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__XML2__TypesAssignment_1_06360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__XML2__EnumsAssignment_1_16391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_rule__XML2__CommAssignment_1_26422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_rule__InputDef__CommentAssignment_06453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INPUT_in_rule__InputDef__InputCHARAssignment_16484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__InputDef__UrlAssignment_26515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_rule__PackDef__CommentAssignment_06546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PACKAGE_in_rule__PackDef__PackCHARAssignment_16577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackName_in_rule__PackDef__PackAssignment_26608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeComment_in_rule__Type__CommentAssignment_06639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnter_in_rule__Type__EnterAssignment_16670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_TYPE_in_rule__Type__PrefixAssignment_26701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__Type__NameAssignment_36732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Type__FieldsAssignment_5_06763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_rule__Type__CommAssignment_5_16794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_MAIN_in_rule__Enter__PrefixAssignment_16825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Enter__RootPathAssignment_36856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldComment_in_rule__Field__CommentAssignment_06887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListMeta_in_rule__Field__MetaAssignment_1_06918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSliceMeta_in_rule__Field__MetaAssignment_1_16949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldType_in_rule__Field__TypeAssignment_26980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__Field__FieldNameAssignment_37011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Field__NodePathAssignment_57042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__FieldType__TypeAssignment7073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_LIST_in_rule__ListMeta__PrefixAssignment_17104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldMetaKey_in_rule__ListMeta__ParamsAssignment_2_1_07135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldMetaKey_in_rule__ListMeta__ParamsAssignment_2_1_1_17166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_SLICE_in_rule__SliceMeta__PrefixAssignment_17197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SliceMeta__SliceCharAssignment_37228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__FieldMetaKey__FieldNameAssignment7259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeComment_in_rule__Enum__CommentAssignment_07290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_ENUM_in_rule__Enum__PrefixAssignment_17321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__Enum__NameAssignment_27352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_rule__Enum__FieldsAssignment_4_07383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherComent_in_rule__Enum__CommAssignment_4_17414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldComment_in_rule__EnumField__CommentAssignment_07445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultMeta_in_rule__EnumField__MetaAssignment_17476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__EnumField__FieldNameAssignment_27507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EnumField__FieldValueAssignment_47538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_DEFAULT_in_rule__DefaultMeta__PrefixAssignment_17569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__OtherComent__CommAssignment7600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__TypesAssignment_1_0_in_synpred4_InternalCfg1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__EnumsAssignment_1_1_in_synpred5_InternalCfg1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__FieldsAssignment_5_0_in_synpred6_InternalCfg1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__FieldsAssignment_4_0_in_synpred8_InternalCfg1412 = new BitSet(new long[]{0x0000000000000002L});

}