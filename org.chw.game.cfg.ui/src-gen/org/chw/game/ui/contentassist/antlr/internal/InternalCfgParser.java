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

@SuppressWarnings("all")
public class InternalCfgParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_C_INPUT", "RULE_C_FILE", "RULE_C_NODE", "RULE_C_TYPE", "RULE_C_INT", "RULE_C_UINT", "RULE_C_BOOL", "RULE_C_NUMBER", "RULE_C_STRING", "RULE_C_LIST", "RULE_C_HASH", "RULE_NAME", "RULE_C_SEMICOLON", "RULE_C_BRACE_L", "RULE_C_BRACE_R", "RULE_C_BRACKET_L", "RULE_C_PAREN_L", "RULE_C_EQUALS", "RULE_C_PAREN_R", "RULE_C_BRACKET_R", "RULE_C_COMMA", "RULE_C_ANGLE_L", "RULE_C_ANGLE_R", "RULE_COMMENT", "RULE_C_PACKAGE", "RULE_STRING", "RULE_COMMENT_END", "RULE_WS", "'.'"
    };
    public static final int RULE_C_NUMBER=11;
    public static final int RULE_C_COMMA=24;
    public static final int RULE_C_TYPE=7;
    public static final int RULE_C_PAREN_R=22;
    public static final int RULE_C_SEMICOLON=16;
    public static final int RULE_C_PAREN_L=20;
    public static final int RULE_C_NODE=6;
    public static final int RULE_C_INPUT=4;
    public static final int RULE_C_STRING=12;
    public static final int RULE_COMMENT=27;
    public static final int RULE_C_PACKAGE=28;
    public static final int EOF=-1;
    public static final int RULE_C_HASH=14;
    public static final int RULE_C_ANGLE_L=25;
    public static final int RULE_C_ANGLE_R=26;
    public static final int RULE_COMMENT_END=30;
    public static final int RULE_C_BRACKET_L=19;
    public static final int RULE_STRING=29;
    public static final int T__32=32;
    public static final int RULE_C_EQUALS=21;
    public static final int RULE_C_UINT=9;
    public static final int RULE_C_BRACKET_R=23;
    public static final int RULE_C_INT=8;
    public static final int RULE_C_FILE=5;
    public static final int RULE_NAME=15;
    public static final int RULE_WS=31;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:60:1: entryRuleXML2 : ruleXML2 EOF ;
    public final void entryRuleXML2() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:61:1: ( ruleXML2 EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:62:1: ruleXML2 EOF
            {
             before(grammarAccess.getXML2Rule()); 
            pushFollow(FOLLOW_ruleXML2_in_entryRuleXML261);
            ruleXML2();

            state._fsp--;

             after(grammarAccess.getXML2Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXML268); 

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:69:1: ruleXML2 : ( ( rule__XML2__Group__0 ) ) ;
    public final void ruleXML2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:73:2: ( ( ( rule__XML2__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:74:1: ( ( rule__XML2__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:74:1: ( ( rule__XML2__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:75:1: ( rule__XML2__Group__0 )
            {
             before(grammarAccess.getXML2Access().getGroup()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:76:1: ( rule__XML2__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:76:2: rule__XML2__Group__0
            {
            pushFollow(FOLLOW_rule__XML2__Group__0_in_ruleXML294);
            rule__XML2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXML2Access().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRulePackDef"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:88:1: entryRulePackDef : rulePackDef EOF ;
    public final void entryRulePackDef() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:89:1: ( rulePackDef EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:90:1: rulePackDef EOF
            {
             before(grammarAccess.getPackDefRule()); 
            pushFollow(FOLLOW_rulePackDef_in_entryRulePackDef121);
            rulePackDef();

            state._fsp--;

             after(grammarAccess.getPackDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackDef128); 

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:97:1: rulePackDef : ( ( rule__PackDef__Group__0 ) ) ;
    public final void rulePackDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:101:2: ( ( ( rule__PackDef__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:102:1: ( ( rule__PackDef__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:102:1: ( ( rule__PackDef__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:103:1: ( rule__PackDef__Group__0 )
            {
             before(grammarAccess.getPackDefAccess().getGroup()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:104:1: ( rule__PackDef__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:104:2: rule__PackDef__Group__0
            {
            pushFollow(FOLLOW_rule__PackDef__Group__0_in_rulePackDef154);
            rule__PackDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackDefAccess().getGroup()); 

            }


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:116:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:117:1: ( ruleType EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:118:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType181);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType188); 

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:125:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:129:2: ( ( ( rule__Type__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:130:1: ( ( rule__Type__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:130:1: ( ( rule__Type__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:131:1: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:132:1: ( rule__Type__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:132:2: rule__Type__Group__0
            {
            pushFollow(FOLLOW_rule__Type__Group__0_in_ruleType214);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleInput"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:144:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:145:1: ( ruleInput EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:146:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput241);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput248); 

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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:153:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:157:2: ( ( ( rule__Input__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:158:1: ( ( rule__Input__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:158:1: ( ( rule__Input__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:159:1: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:160:1: ( rule__Input__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:160:2: rule__Input__Group__0
            {
            pushFollow(FOLLOW_rule__Input__Group__0_in_ruleInput274);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleField"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:172:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:173:1: ( ruleField EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:174:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField301);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField308); 

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:181:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:185:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:186:1: ( ( rule__Field__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:186:1: ( ( rule__Field__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:187:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:188:1: ( rule__Field__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:188:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField334);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleNativeType"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:200:1: entryRuleNativeType : ruleNativeType EOF ;
    public final void entryRuleNativeType() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:201:1: ( ruleNativeType EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:202:1: ruleNativeType EOF
            {
             before(grammarAccess.getNativeTypeRule()); 
            pushFollow(FOLLOW_ruleNativeType_in_entryRuleNativeType361);
            ruleNativeType();

            state._fsp--;

             after(grammarAccess.getNativeTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeType368); 

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
    // $ANTLR end "entryRuleNativeType"


    // $ANTLR start "ruleNativeType"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:209:1: ruleNativeType : ( ( rule__NativeType__TypeAssignment ) ) ;
    public final void ruleNativeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:213:2: ( ( ( rule__NativeType__TypeAssignment ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:214:1: ( ( rule__NativeType__TypeAssignment ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:214:1: ( ( rule__NativeType__TypeAssignment ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:215:1: ( rule__NativeType__TypeAssignment )
            {
             before(grammarAccess.getNativeTypeAccess().getTypeAssignment()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:216:1: ( rule__NativeType__TypeAssignment )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:216:2: rule__NativeType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__NativeType__TypeAssignment_in_ruleNativeType394);
            rule__NativeType__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNativeTypeAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNativeType"


    // $ANTLR start "entryRuleListType"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:228:1: entryRuleListType : ruleListType EOF ;
    public final void entryRuleListType() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:229:1: ( ruleListType EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:230:1: ruleListType EOF
            {
             before(grammarAccess.getListTypeRule()); 
            pushFollow(FOLLOW_ruleListType_in_entryRuleListType421);
            ruleListType();

            state._fsp--;

             after(grammarAccess.getListTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListType428); 

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
    // $ANTLR end "entryRuleListType"


    // $ANTLR start "ruleListType"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:237:1: ruleListType : ( ( rule__ListType__Group__0 ) ) ;
    public final void ruleListType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:241:2: ( ( ( rule__ListType__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:242:1: ( ( rule__ListType__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:242:1: ( ( rule__ListType__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:243:1: ( rule__ListType__Group__0 )
            {
             before(grammarAccess.getListTypeAccess().getGroup()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:244:1: ( rule__ListType__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:244:2: rule__ListType__Group__0
            {
            pushFollow(FOLLOW_rule__ListType__Group__0_in_ruleListType454);
            rule__ListType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListType"


    // $ANTLR start "entryRuleHashType"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:256:1: entryRuleHashType : ruleHashType EOF ;
    public final void entryRuleHashType() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:257:1: ( ruleHashType EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:258:1: ruleHashType EOF
            {
             before(grammarAccess.getHashTypeRule()); 
            pushFollow(FOLLOW_ruleHashType_in_entryRuleHashType481);
            ruleHashType();

            state._fsp--;

             after(grammarAccess.getHashTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHashType488); 

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
    // $ANTLR end "entryRuleHashType"


    // $ANTLR start "ruleHashType"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:265:1: ruleHashType : ( ( rule__HashType__Group__0 ) ) ;
    public final void ruleHashType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:269:2: ( ( ( rule__HashType__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:270:1: ( ( rule__HashType__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:270:1: ( ( rule__HashType__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:271:1: ( rule__HashType__Group__0 )
            {
             before(grammarAccess.getHashTypeAccess().getGroup()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:272:1: ( rule__HashType__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:272:2: rule__HashType__Group__0
            {
            pushFollow(FOLLOW_rule__HashType__Group__0_in_ruleHashType514);
            rule__HashType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHashTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHashType"


    // $ANTLR start "entryRuleParam"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:284:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:285:1: ( ruleParam EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:286:1: ruleParam EOF
            {
             before(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam541);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam548); 

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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:293:1: ruleParam : ( ( rule__Param__ParamNameAssignment ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:297:2: ( ( ( rule__Param__ParamNameAssignment ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:298:1: ( ( rule__Param__ParamNameAssignment ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:298:1: ( ( rule__Param__ParamNameAssignment ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:299:1: ( rule__Param__ParamNameAssignment )
            {
             before(grammarAccess.getParamAccess().getParamNameAssignment()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:300:1: ( rule__Param__ParamNameAssignment )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:300:2: rule__Param__ParamNameAssignment
            {
            pushFollow(FOLLOW_rule__Param__ParamNameAssignment_in_ruleParam574);
            rule__Param__ParamNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getParamNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRulePackName"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:312:1: entryRulePackName : rulePackName EOF ;
    public final void entryRulePackName() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:313:1: ( rulePackName EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:314:1: rulePackName EOF
            {
             before(grammarAccess.getPackNameRule()); 
            pushFollow(FOLLOW_rulePackName_in_entryRulePackName601);
            rulePackName();

            state._fsp--;

             after(grammarAccess.getPackNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackName608); 

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:321:1: rulePackName : ( ( rule__PackName__Group__0 ) ) ;
    public final void rulePackName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:325:2: ( ( ( rule__PackName__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:326:1: ( ( rule__PackName__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:326:1: ( ( rule__PackName__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:327:1: ( rule__PackName__Group__0 )
            {
             before(grammarAccess.getPackNameAccess().getGroup()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:328:1: ( rule__PackName__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:328:2: rule__PackName__Group__0
            {
            pushFollow(FOLLOW_rule__PackName__Group__0_in_rulePackName634);
            rule__PackName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackNameAccess().getGroup()); 

            }


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:340:1: entryRuleTypeName : ruleTypeName EOF ;
    public final void entryRuleTypeName() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:341:1: ( ruleTypeName EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:342:1: ruleTypeName EOF
            {
             before(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_ruleTypeName_in_entryRuleTypeName661);
            ruleTypeName();

            state._fsp--;

             after(grammarAccess.getTypeNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeName668); 

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:349:1: ruleTypeName : ( ( rule__TypeName__Alternatives ) ) ;
    public final void ruleTypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:353:2: ( ( ( rule__TypeName__Alternatives ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:354:1: ( ( rule__TypeName__Alternatives ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:354:1: ( ( rule__TypeName__Alternatives ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:355:1: ( rule__TypeName__Alternatives )
            {
             before(grammarAccess.getTypeNameAccess().getAlternatives()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:356:1: ( rule__TypeName__Alternatives )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:356:2: rule__TypeName__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeName__Alternatives_in_ruleTypeName694);
            rule__TypeName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeNameAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "rule__XML2__Alternatives_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:368:1: rule__XML2__Alternatives_1 : ( ( ( rule__XML2__TypesAssignment_1_0 ) ) | ( ( rule__XML2__OtherCommAssignment_1_1 ) ) );
    public final void rule__XML2__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:372:1: ( ( ( rule__XML2__TypesAssignment_1_0 ) ) | ( ( rule__XML2__OtherCommAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_COMMENT) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF||LA1_1==RULE_COMMENT) ) {
                    alt1=2;
                }
                else if ( (LA1_1==RULE_C_TYPE||LA1_1==RULE_C_BRACKET_L) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:373:1: ( ( rule__XML2__TypesAssignment_1_0 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:373:1: ( ( rule__XML2__TypesAssignment_1_0 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:374:1: ( rule__XML2__TypesAssignment_1_0 )
                    {
                     before(grammarAccess.getXML2Access().getTypesAssignment_1_0()); 
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:375:1: ( rule__XML2__TypesAssignment_1_0 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:375:2: rule__XML2__TypesAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__XML2__TypesAssignment_1_0_in_rule__XML2__Alternatives_1730);
                    rule__XML2__TypesAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXML2Access().getTypesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:379:6: ( ( rule__XML2__OtherCommAssignment_1_1 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:379:6: ( ( rule__XML2__OtherCommAssignment_1_1 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:380:1: ( rule__XML2__OtherCommAssignment_1_1 )
                    {
                     before(grammarAccess.getXML2Access().getOtherCommAssignment_1_1()); 
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:381:1: ( rule__XML2__OtherCommAssignment_1_1 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:381:2: rule__XML2__OtherCommAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__XML2__OtherCommAssignment_1_1_in_rule__XML2__Alternatives_1748);
                    rule__XML2__OtherCommAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getXML2Access().getOtherCommAssignment_1_1()); 

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:390:1: rule__Type__Alternatives_5 : ( ( ( rule__Type__FieldsAssignment_5_0 ) ) | ( ( rule__Type__OtherCommAssignment_5_1 ) ) );
    public final void rule__Type__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:394:1: ( ( ( rule__Type__FieldsAssignment_5_0 ) ) | ( ( rule__Type__OtherCommAssignment_5_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_COMMENT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_C_BRACE_R||LA2_1==RULE_COMMENT) ) {
                    alt2=2;
                }
                else if ( ((LA2_1>=RULE_C_INPUT && LA2_1<=RULE_NAME)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:395:1: ( ( rule__Type__FieldsAssignment_5_0 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:395:1: ( ( rule__Type__FieldsAssignment_5_0 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:396:1: ( rule__Type__FieldsAssignment_5_0 )
                    {
                     before(grammarAccess.getTypeAccess().getFieldsAssignment_5_0()); 
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:397:1: ( rule__Type__FieldsAssignment_5_0 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:397:2: rule__Type__FieldsAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__Type__FieldsAssignment_5_0_in_rule__Type__Alternatives_5781);
                    rule__Type__FieldsAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getFieldsAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:401:6: ( ( rule__Type__OtherCommAssignment_5_1 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:401:6: ( ( rule__Type__OtherCommAssignment_5_1 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:402:1: ( rule__Type__OtherCommAssignment_5_1 )
                    {
                     before(grammarAccess.getTypeAccess().getOtherCommAssignment_5_1()); 
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:403:1: ( rule__Type__OtherCommAssignment_5_1 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:403:2: rule__Type__OtherCommAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__Type__OtherCommAssignment_5_1_in_rule__Type__Alternatives_5799);
                    rule__Type__OtherCommAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getOtherCommAssignment_5_1()); 

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


    // $ANTLR start "rule__Field__TypeAlternatives_1_0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:412:1: rule__Field__TypeAlternatives_1_0 : ( ( ruleNativeType ) | ( ruleListType ) | ( ruleHashType ) );
    public final void rule__Field__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:416:1: ( ( ruleNativeType ) | ( ruleListType ) | ( ruleHashType ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_C_INPUT:
            case RULE_C_FILE:
            case RULE_C_NODE:
            case RULE_C_TYPE:
            case RULE_C_INT:
            case RULE_C_UINT:
            case RULE_C_BOOL:
            case RULE_C_NUMBER:
            case RULE_C_STRING:
            case RULE_NAME:
                {
                alt3=1;
                }
                break;
            case RULE_C_LIST:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==RULE_C_ANGLE_L) ) {
                    alt3=2;
                }
                else if ( (LA3_2==RULE_NAME) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_C_HASH:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==RULE_NAME) ) {
                    alt3=1;
                }
                else if ( (LA3_3==RULE_C_ANGLE_L) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:417:1: ( ruleNativeType )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:417:1: ( ruleNativeType )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:418:1: ruleNativeType
                    {
                     before(grammarAccess.getFieldAccess().getTypeNativeTypeParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_ruleNativeType_in_rule__Field__TypeAlternatives_1_0832);
                    ruleNativeType();

                    state._fsp--;

                     after(grammarAccess.getFieldAccess().getTypeNativeTypeParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:423:6: ( ruleListType )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:423:6: ( ruleListType )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:424:1: ruleListType
                    {
                     before(grammarAccess.getFieldAccess().getTypeListTypeParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_ruleListType_in_rule__Field__TypeAlternatives_1_0849);
                    ruleListType();

                    state._fsp--;

                     after(grammarAccess.getFieldAccess().getTypeListTypeParserRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:429:6: ( ruleHashType )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:429:6: ( ruleHashType )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:430:1: ruleHashType
                    {
                     before(grammarAccess.getFieldAccess().getTypeHashTypeParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_ruleHashType_in_rule__Field__TypeAlternatives_1_0866);
                    ruleHashType();

                    state._fsp--;

                     after(grammarAccess.getFieldAccess().getTypeHashTypeParserRuleCall_1_0_2()); 

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
    // $ANTLR end "rule__Field__TypeAlternatives_1_0"


    // $ANTLR start "rule__TypeName__Alternatives"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:440:1: rule__TypeName__Alternatives : ( ( RULE_C_INPUT ) | ( RULE_C_FILE ) | ( RULE_C_NODE ) | ( RULE_C_TYPE ) | ( RULE_C_INT ) | ( RULE_C_UINT ) | ( RULE_C_BOOL ) | ( RULE_C_NUMBER ) | ( RULE_C_STRING ) | ( RULE_C_LIST ) | ( RULE_C_HASH ) | ( RULE_NAME ) );
    public final void rule__TypeName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:444:1: ( ( RULE_C_INPUT ) | ( RULE_C_FILE ) | ( RULE_C_NODE ) | ( RULE_C_TYPE ) | ( RULE_C_INT ) | ( RULE_C_UINT ) | ( RULE_C_BOOL ) | ( RULE_C_NUMBER ) | ( RULE_C_STRING ) | ( RULE_C_LIST ) | ( RULE_C_HASH ) | ( RULE_NAME ) )
            int alt4=12;
            switch ( input.LA(1) ) {
            case RULE_C_INPUT:
                {
                alt4=1;
                }
                break;
            case RULE_C_FILE:
                {
                alt4=2;
                }
                break;
            case RULE_C_NODE:
                {
                alt4=3;
                }
                break;
            case RULE_C_TYPE:
                {
                alt4=4;
                }
                break;
            case RULE_C_INT:
                {
                alt4=5;
                }
                break;
            case RULE_C_UINT:
                {
                alt4=6;
                }
                break;
            case RULE_C_BOOL:
                {
                alt4=7;
                }
                break;
            case RULE_C_NUMBER:
                {
                alt4=8;
                }
                break;
            case RULE_C_STRING:
                {
                alt4=9;
                }
                break;
            case RULE_C_LIST:
                {
                alt4=10;
                }
                break;
            case RULE_C_HASH:
                {
                alt4=11;
                }
                break;
            case RULE_NAME:
                {
                alt4=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:445:1: ( RULE_C_INPUT )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:445:1: ( RULE_C_INPUT )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:446:1: RULE_C_INPUT
                    {
                     before(grammarAccess.getTypeNameAccess().getC_INPUTTerminalRuleCall_0()); 
                    match(input,RULE_C_INPUT,FOLLOW_RULE_C_INPUT_in_rule__TypeName__Alternatives898); 
                     after(grammarAccess.getTypeNameAccess().getC_INPUTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:451:6: ( RULE_C_FILE )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:451:6: ( RULE_C_FILE )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:452:1: RULE_C_FILE
                    {
                     before(grammarAccess.getTypeNameAccess().getC_FILETerminalRuleCall_1()); 
                    match(input,RULE_C_FILE,FOLLOW_RULE_C_FILE_in_rule__TypeName__Alternatives915); 
                     after(grammarAccess.getTypeNameAccess().getC_FILETerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:457:6: ( RULE_C_NODE )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:457:6: ( RULE_C_NODE )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:458:1: RULE_C_NODE
                    {
                     before(grammarAccess.getTypeNameAccess().getC_NODETerminalRuleCall_2()); 
                    match(input,RULE_C_NODE,FOLLOW_RULE_C_NODE_in_rule__TypeName__Alternatives932); 
                     after(grammarAccess.getTypeNameAccess().getC_NODETerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:463:6: ( RULE_C_TYPE )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:463:6: ( RULE_C_TYPE )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:464:1: RULE_C_TYPE
                    {
                     before(grammarAccess.getTypeNameAccess().getC_TYPETerminalRuleCall_3()); 
                    match(input,RULE_C_TYPE,FOLLOW_RULE_C_TYPE_in_rule__TypeName__Alternatives949); 
                     after(grammarAccess.getTypeNameAccess().getC_TYPETerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:469:6: ( RULE_C_INT )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:469:6: ( RULE_C_INT )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:470:1: RULE_C_INT
                    {
                     before(grammarAccess.getTypeNameAccess().getC_INTTerminalRuleCall_4()); 
                    match(input,RULE_C_INT,FOLLOW_RULE_C_INT_in_rule__TypeName__Alternatives966); 
                     after(grammarAccess.getTypeNameAccess().getC_INTTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:475:6: ( RULE_C_UINT )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:475:6: ( RULE_C_UINT )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:476:1: RULE_C_UINT
                    {
                     before(grammarAccess.getTypeNameAccess().getC_UINTTerminalRuleCall_5()); 
                    match(input,RULE_C_UINT,FOLLOW_RULE_C_UINT_in_rule__TypeName__Alternatives983); 
                     after(grammarAccess.getTypeNameAccess().getC_UINTTerminalRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:481:6: ( RULE_C_BOOL )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:481:6: ( RULE_C_BOOL )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:482:1: RULE_C_BOOL
                    {
                     before(grammarAccess.getTypeNameAccess().getC_BOOLTerminalRuleCall_6()); 
                    match(input,RULE_C_BOOL,FOLLOW_RULE_C_BOOL_in_rule__TypeName__Alternatives1000); 
                     after(grammarAccess.getTypeNameAccess().getC_BOOLTerminalRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:487:6: ( RULE_C_NUMBER )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:487:6: ( RULE_C_NUMBER )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:488:1: RULE_C_NUMBER
                    {
                     before(grammarAccess.getTypeNameAccess().getC_NUMBERTerminalRuleCall_7()); 
                    match(input,RULE_C_NUMBER,FOLLOW_RULE_C_NUMBER_in_rule__TypeName__Alternatives1017); 
                     after(grammarAccess.getTypeNameAccess().getC_NUMBERTerminalRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:493:6: ( RULE_C_STRING )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:493:6: ( RULE_C_STRING )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:494:1: RULE_C_STRING
                    {
                     before(grammarAccess.getTypeNameAccess().getC_STRINGTerminalRuleCall_8()); 
                    match(input,RULE_C_STRING,FOLLOW_RULE_C_STRING_in_rule__TypeName__Alternatives1034); 
                     after(grammarAccess.getTypeNameAccess().getC_STRINGTerminalRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:499:6: ( RULE_C_LIST )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:499:6: ( RULE_C_LIST )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:500:1: RULE_C_LIST
                    {
                     before(grammarAccess.getTypeNameAccess().getC_LISTTerminalRuleCall_9()); 
                    match(input,RULE_C_LIST,FOLLOW_RULE_C_LIST_in_rule__TypeName__Alternatives1051); 
                     after(grammarAccess.getTypeNameAccess().getC_LISTTerminalRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:505:6: ( RULE_C_HASH )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:505:6: ( RULE_C_HASH )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:506:1: RULE_C_HASH
                    {
                     before(grammarAccess.getTypeNameAccess().getC_HASHTerminalRuleCall_10()); 
                    match(input,RULE_C_HASH,FOLLOW_RULE_C_HASH_in_rule__TypeName__Alternatives1068); 
                     after(grammarAccess.getTypeNameAccess().getC_HASHTerminalRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:511:6: ( RULE_NAME )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:511:6: ( RULE_NAME )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:512:1: RULE_NAME
                    {
                     before(grammarAccess.getTypeNameAccess().getNAMETerminalRuleCall_11()); 
                    match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rule__TypeName__Alternatives1085); 
                     after(grammarAccess.getTypeNameAccess().getNAMETerminalRuleCall_11()); 

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:524:1: rule__XML2__Group__0 : rule__XML2__Group__0__Impl rule__XML2__Group__1 ;
    public final void rule__XML2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:528:1: ( rule__XML2__Group__0__Impl rule__XML2__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:529:2: rule__XML2__Group__0__Impl rule__XML2__Group__1
            {
            pushFollow(FOLLOW_rule__XML2__Group__0__Impl_in_rule__XML2__Group__01115);
            rule__XML2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__XML2__Group__1_in_rule__XML2__Group__01118);
            rule__XML2__Group__1();

            state._fsp--;


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:536:1: rule__XML2__Group__0__Impl : ( ( rule__XML2__PackAssignment_0 )? ) ;
    public final void rule__XML2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:540:1: ( ( ( rule__XML2__PackAssignment_0 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:541:1: ( ( rule__XML2__PackAssignment_0 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:541:1: ( ( rule__XML2__PackAssignment_0 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:542:1: ( rule__XML2__PackAssignment_0 )?
            {
             before(grammarAccess.getXML2Access().getPackAssignment_0()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:543:1: ( rule__XML2__PackAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_C_PACKAGE) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:543:2: rule__XML2__PackAssignment_0
                    {
                    pushFollow(FOLLOW_rule__XML2__PackAssignment_0_in_rule__XML2__Group__0__Impl1145);
                    rule__XML2__PackAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXML2Access().getPackAssignment_0()); 

            }


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:553:1: rule__XML2__Group__1 : rule__XML2__Group__1__Impl ;
    public final void rule__XML2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:557:1: ( rule__XML2__Group__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:558:2: rule__XML2__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__XML2__Group__1__Impl_in_rule__XML2__Group__11176);
            rule__XML2__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:564:1: rule__XML2__Group__1__Impl : ( ( rule__XML2__Alternatives_1 )* ) ;
    public final void rule__XML2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:568:1: ( ( ( rule__XML2__Alternatives_1 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:569:1: ( ( rule__XML2__Alternatives_1 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:569:1: ( ( rule__XML2__Alternatives_1 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:570:1: ( rule__XML2__Alternatives_1 )*
            {
             before(grammarAccess.getXML2Access().getAlternatives_1()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:571:1: ( rule__XML2__Alternatives_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMENT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:571:2: rule__XML2__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__XML2__Alternatives_1_in_rule__XML2__Group__1__Impl1203);
            	    rule__XML2__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getXML2Access().getAlternatives_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__PackDef__Group__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:585:1: rule__PackDef__Group__0 : rule__PackDef__Group__0__Impl rule__PackDef__Group__1 ;
    public final void rule__PackDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:589:1: ( rule__PackDef__Group__0__Impl rule__PackDef__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:590:2: rule__PackDef__Group__0__Impl rule__PackDef__Group__1
            {
            pushFollow(FOLLOW_rule__PackDef__Group__0__Impl_in_rule__PackDef__Group__01238);
            rule__PackDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackDef__Group__1_in_rule__PackDef__Group__01241);
            rule__PackDef__Group__1();

            state._fsp--;


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:597:1: rule__PackDef__Group__0__Impl : ( ( rule__PackDef__PackCHARAssignment_0 ) ) ;
    public final void rule__PackDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:601:1: ( ( ( rule__PackDef__PackCHARAssignment_0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:602:1: ( ( rule__PackDef__PackCHARAssignment_0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:602:1: ( ( rule__PackDef__PackCHARAssignment_0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:603:1: ( rule__PackDef__PackCHARAssignment_0 )
            {
             before(grammarAccess.getPackDefAccess().getPackCHARAssignment_0()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:604:1: ( rule__PackDef__PackCHARAssignment_0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:604:2: rule__PackDef__PackCHARAssignment_0
            {
            pushFollow(FOLLOW_rule__PackDef__PackCHARAssignment_0_in_rule__PackDef__Group__0__Impl1268);
            rule__PackDef__PackCHARAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPackDefAccess().getPackCHARAssignment_0()); 

            }


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:614:1: rule__PackDef__Group__1 : rule__PackDef__Group__1__Impl rule__PackDef__Group__2 ;
    public final void rule__PackDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:618:1: ( rule__PackDef__Group__1__Impl rule__PackDef__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:619:2: rule__PackDef__Group__1__Impl rule__PackDef__Group__2
            {
            pushFollow(FOLLOW_rule__PackDef__Group__1__Impl_in_rule__PackDef__Group__11298);
            rule__PackDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackDef__Group__2_in_rule__PackDef__Group__11301);
            rule__PackDef__Group__2();

            state._fsp--;


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:626:1: rule__PackDef__Group__1__Impl : ( ( rule__PackDef__PackAssignment_1 ) ) ;
    public final void rule__PackDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:630:1: ( ( ( rule__PackDef__PackAssignment_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:631:1: ( ( rule__PackDef__PackAssignment_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:631:1: ( ( rule__PackDef__PackAssignment_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:632:1: ( rule__PackDef__PackAssignment_1 )
            {
             before(grammarAccess.getPackDefAccess().getPackAssignment_1()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:633:1: ( rule__PackDef__PackAssignment_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:633:2: rule__PackDef__PackAssignment_1
            {
            pushFollow(FOLLOW_rule__PackDef__PackAssignment_1_in_rule__PackDef__Group__1__Impl1328);
            rule__PackDef__PackAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackDefAccess().getPackAssignment_1()); 

            }


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:643:1: rule__PackDef__Group__2 : rule__PackDef__Group__2__Impl ;
    public final void rule__PackDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:647:1: ( rule__PackDef__Group__2__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:648:2: rule__PackDef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PackDef__Group__2__Impl_in_rule__PackDef__Group__21358);
            rule__PackDef__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:654:1: rule__PackDef__Group__2__Impl : ( ( RULE_C_SEMICOLON )? ) ;
    public final void rule__PackDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:658:1: ( ( ( RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:659:1: ( ( RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:659:1: ( ( RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:660:1: ( RULE_C_SEMICOLON )?
            {
             before(grammarAccess.getPackDefAccess().getC_SEMICOLONTerminalRuleCall_2()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:661:1: ( RULE_C_SEMICOLON )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_C_SEMICOLON) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:661:3: RULE_C_SEMICOLON
                    {
                    match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_rule__PackDef__Group__2__Impl1386); 

                    }
                    break;

            }

             after(grammarAccess.getPackDefAccess().getC_SEMICOLONTerminalRuleCall_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Type__Group__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:677:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:681:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:682:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__01423);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__01426);
            rule__Type__Group__1();

            state._fsp--;


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:689:1: rule__Type__Group__0__Impl : ( ( rule__Type__CommAssignment_0 ) ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:693:1: ( ( ( rule__Type__CommAssignment_0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:694:1: ( ( rule__Type__CommAssignment_0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:694:1: ( ( rule__Type__CommAssignment_0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:695:1: ( rule__Type__CommAssignment_0 )
            {
             before(grammarAccess.getTypeAccess().getCommAssignment_0()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:696:1: ( rule__Type__CommAssignment_0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:696:2: rule__Type__CommAssignment_0
            {
            pushFollow(FOLLOW_rule__Type__CommAssignment_0_in_rule__Type__Group__0__Impl1453);
            rule__Type__CommAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getCommAssignment_0()); 

            }


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:706:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:710:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:711:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__11483);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__2_in_rule__Type__Group__11486);
            rule__Type__Group__2();

            state._fsp--;


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:718:1: rule__Type__Group__1__Impl : ( ( rule__Type__InputAssignment_1 )? ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:722:1: ( ( ( rule__Type__InputAssignment_1 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:723:1: ( ( rule__Type__InputAssignment_1 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:723:1: ( ( rule__Type__InputAssignment_1 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:724:1: ( rule__Type__InputAssignment_1 )?
            {
             before(grammarAccess.getTypeAccess().getInputAssignment_1()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:725:1: ( rule__Type__InputAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_C_BRACKET_L) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:725:2: rule__Type__InputAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Type__InputAssignment_1_in_rule__Type__Group__1__Impl1513);
                    rule__Type__InputAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getInputAssignment_1()); 

            }


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:735:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:739:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:740:2: rule__Type__Group__2__Impl rule__Type__Group__3
            {
            pushFollow(FOLLOW_rule__Type__Group__2__Impl_in_rule__Type__Group__21544);
            rule__Type__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__3_in_rule__Type__Group__21547);
            rule__Type__Group__3();

            state._fsp--;


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:747:1: rule__Type__Group__2__Impl : ( ( rule__Type__PrefixAssignment_2 ) ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:751:1: ( ( ( rule__Type__PrefixAssignment_2 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:752:1: ( ( rule__Type__PrefixAssignment_2 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:752:1: ( ( rule__Type__PrefixAssignment_2 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:753:1: ( rule__Type__PrefixAssignment_2 )
            {
             before(grammarAccess.getTypeAccess().getPrefixAssignment_2()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:754:1: ( rule__Type__PrefixAssignment_2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:754:2: rule__Type__PrefixAssignment_2
            {
            pushFollow(FOLLOW_rule__Type__PrefixAssignment_2_in_rule__Type__Group__2__Impl1574);
            rule__Type__PrefixAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getPrefixAssignment_2()); 

            }


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:764:1: rule__Type__Group__3 : rule__Type__Group__3__Impl rule__Type__Group__4 ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:768:1: ( rule__Type__Group__3__Impl rule__Type__Group__4 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:769:2: rule__Type__Group__3__Impl rule__Type__Group__4
            {
            pushFollow(FOLLOW_rule__Type__Group__3__Impl_in_rule__Type__Group__31604);
            rule__Type__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__4_in_rule__Type__Group__31607);
            rule__Type__Group__4();

            state._fsp--;


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:776:1: rule__Type__Group__3__Impl : ( ( rule__Type__NameAssignment_3 ) ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:780:1: ( ( ( rule__Type__NameAssignment_3 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:781:1: ( ( rule__Type__NameAssignment_3 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:781:1: ( ( rule__Type__NameAssignment_3 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:782:1: ( rule__Type__NameAssignment_3 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_3()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:783:1: ( rule__Type__NameAssignment_3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:783:2: rule__Type__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Type__NameAssignment_3_in_rule__Type__Group__3__Impl1634);
            rule__Type__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:793:1: rule__Type__Group__4 : rule__Type__Group__4__Impl rule__Type__Group__5 ;
    public final void rule__Type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:797:1: ( rule__Type__Group__4__Impl rule__Type__Group__5 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:798:2: rule__Type__Group__4__Impl rule__Type__Group__5
            {
            pushFollow(FOLLOW_rule__Type__Group__4__Impl_in_rule__Type__Group__41664);
            rule__Type__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__5_in_rule__Type__Group__41667);
            rule__Type__Group__5();

            state._fsp--;


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:805:1: rule__Type__Group__4__Impl : ( RULE_C_BRACE_L ) ;
    public final void rule__Type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:809:1: ( ( RULE_C_BRACE_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:810:1: ( RULE_C_BRACE_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:810:1: ( RULE_C_BRACE_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:811:1: RULE_C_BRACE_L
            {
             before(grammarAccess.getTypeAccess().getC_BRACE_LTerminalRuleCall_4()); 
            match(input,RULE_C_BRACE_L,FOLLOW_RULE_C_BRACE_L_in_rule__Type__Group__4__Impl1694); 
             after(grammarAccess.getTypeAccess().getC_BRACE_LTerminalRuleCall_4()); 

            }


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:822:1: rule__Type__Group__5 : rule__Type__Group__5__Impl rule__Type__Group__6 ;
    public final void rule__Type__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:826:1: ( rule__Type__Group__5__Impl rule__Type__Group__6 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:827:2: rule__Type__Group__5__Impl rule__Type__Group__6
            {
            pushFollow(FOLLOW_rule__Type__Group__5__Impl_in_rule__Type__Group__51723);
            rule__Type__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__6_in_rule__Type__Group__51726);
            rule__Type__Group__6();

            state._fsp--;


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:834:1: rule__Type__Group__5__Impl : ( ( rule__Type__Alternatives_5 )* ) ;
    public final void rule__Type__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:838:1: ( ( ( rule__Type__Alternatives_5 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:839:1: ( ( rule__Type__Alternatives_5 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:839:1: ( ( rule__Type__Alternatives_5 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:840:1: ( rule__Type__Alternatives_5 )*
            {
             before(grammarAccess.getTypeAccess().getAlternatives_5()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:841:1: ( rule__Type__Alternatives_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_COMMENT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:841:2: rule__Type__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_rule__Type__Alternatives_5_in_rule__Type__Group__5__Impl1753);
            	    rule__Type__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTypeAccess().getAlternatives_5()); 

            }


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:851:1: rule__Type__Group__6 : rule__Type__Group__6__Impl ;
    public final void rule__Type__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:855:1: ( rule__Type__Group__6__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:856:2: rule__Type__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__6__Impl_in_rule__Type__Group__61784);
            rule__Type__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:862:1: rule__Type__Group__6__Impl : ( RULE_C_BRACE_R ) ;
    public final void rule__Type__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:866:1: ( ( RULE_C_BRACE_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:867:1: ( RULE_C_BRACE_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:867:1: ( RULE_C_BRACE_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:868:1: RULE_C_BRACE_R
            {
             before(grammarAccess.getTypeAccess().getC_BRACE_RTerminalRuleCall_6()); 
            match(input,RULE_C_BRACE_R,FOLLOW_RULE_C_BRACE_R_in_rule__Type__Group__6__Impl1811); 
             after(grammarAccess.getTypeAccess().getC_BRACE_RTerminalRuleCall_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Input__Group__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:893:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:897:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:898:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__01854);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__1_in_rule__Input__Group__01857);
            rule__Input__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:905:1: rule__Input__Group__0__Impl : ( RULE_C_BRACKET_L ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:909:1: ( ( RULE_C_BRACKET_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:910:1: ( RULE_C_BRACKET_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:910:1: ( RULE_C_BRACKET_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:911:1: RULE_C_BRACKET_L
            {
             before(grammarAccess.getInputAccess().getC_BRACKET_LTerminalRuleCall_0()); 
            match(input,RULE_C_BRACKET_L,FOLLOW_RULE_C_BRACKET_L_in_rule__Input__Group__0__Impl1884); 
             after(grammarAccess.getInputAccess().getC_BRACKET_LTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:922:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:926:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:927:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__11913);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__2_in_rule__Input__Group__11916);
            rule__Input__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:934:1: rule__Input__Group__1__Impl : ( ( rule__Input__PrefixAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:938:1: ( ( ( rule__Input__PrefixAssignment_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:939:1: ( ( rule__Input__PrefixAssignment_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:939:1: ( ( rule__Input__PrefixAssignment_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:940:1: ( rule__Input__PrefixAssignment_1 )
            {
             before(grammarAccess.getInputAccess().getPrefixAssignment_1()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:941:1: ( rule__Input__PrefixAssignment_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:941:2: rule__Input__PrefixAssignment_1
            {
            pushFollow(FOLLOW_rule__Input__PrefixAssignment_1_in_rule__Input__Group__1__Impl1943);
            rule__Input__PrefixAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getPrefixAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:951:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:955:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:956:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_rule__Input__Group__2__Impl_in_rule__Input__Group__21973);
            rule__Input__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__3_in_rule__Input__Group__21976);
            rule__Input__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2"


    // $ANTLR start "rule__Input__Group__2__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:963:1: rule__Input__Group__2__Impl : ( RULE_C_PAREN_L ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:967:1: ( ( RULE_C_PAREN_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:968:1: ( RULE_C_PAREN_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:968:1: ( RULE_C_PAREN_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:969:1: RULE_C_PAREN_L
            {
             before(grammarAccess.getInputAccess().getC_PAREN_LTerminalRuleCall_2()); 
            match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_rule__Input__Group__2__Impl2003); 
             after(grammarAccess.getInputAccess().getC_PAREN_LTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2__Impl"


    // $ANTLR start "rule__Input__Group__3"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:980:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:984:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:985:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_rule__Input__Group__3__Impl_in_rule__Input__Group__32032);
            rule__Input__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__4_in_rule__Input__Group__32035);
            rule__Input__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3"


    // $ANTLR start "rule__Input__Group__3__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:992:1: rule__Input__Group__3__Impl : ( RULE_C_FILE ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:996:1: ( ( RULE_C_FILE ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:997:1: ( RULE_C_FILE )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:997:1: ( RULE_C_FILE )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:998:1: RULE_C_FILE
            {
             before(grammarAccess.getInputAccess().getC_FILETerminalRuleCall_3()); 
            match(input,RULE_C_FILE,FOLLOW_RULE_C_FILE_in_rule__Input__Group__3__Impl2062); 
             after(grammarAccess.getInputAccess().getC_FILETerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__3__Impl"


    // $ANTLR start "rule__Input__Group__4"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1009:1: rule__Input__Group__4 : rule__Input__Group__4__Impl rule__Input__Group__5 ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1013:1: ( rule__Input__Group__4__Impl rule__Input__Group__5 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1014:2: rule__Input__Group__4__Impl rule__Input__Group__5
            {
            pushFollow(FOLLOW_rule__Input__Group__4__Impl_in_rule__Input__Group__42091);
            rule__Input__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__5_in_rule__Input__Group__42094);
            rule__Input__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__4"


    // $ANTLR start "rule__Input__Group__4__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1021:1: rule__Input__Group__4__Impl : ( RULE_C_EQUALS ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1025:1: ( ( RULE_C_EQUALS ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1026:1: ( RULE_C_EQUALS )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1026:1: ( RULE_C_EQUALS )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1027:1: RULE_C_EQUALS
            {
             before(grammarAccess.getInputAccess().getC_EQUALSTerminalRuleCall_4()); 
            match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_rule__Input__Group__4__Impl2121); 
             after(grammarAccess.getInputAccess().getC_EQUALSTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__4__Impl"


    // $ANTLR start "rule__Input__Group__5"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1038:1: rule__Input__Group__5 : rule__Input__Group__5__Impl rule__Input__Group__6 ;
    public final void rule__Input__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1042:1: ( rule__Input__Group__5__Impl rule__Input__Group__6 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1043:2: rule__Input__Group__5__Impl rule__Input__Group__6
            {
            pushFollow(FOLLOW_rule__Input__Group__5__Impl_in_rule__Input__Group__52150);
            rule__Input__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__6_in_rule__Input__Group__52153);
            rule__Input__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__5"


    // $ANTLR start "rule__Input__Group__5__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1050:1: rule__Input__Group__5__Impl : ( ( rule__Input__FilePathAssignment_5 ) ) ;
    public final void rule__Input__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1054:1: ( ( ( rule__Input__FilePathAssignment_5 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1055:1: ( ( rule__Input__FilePathAssignment_5 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1055:1: ( ( rule__Input__FilePathAssignment_5 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1056:1: ( rule__Input__FilePathAssignment_5 )
            {
             before(grammarAccess.getInputAccess().getFilePathAssignment_5()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1057:1: ( rule__Input__FilePathAssignment_5 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1057:2: rule__Input__FilePathAssignment_5
            {
            pushFollow(FOLLOW_rule__Input__FilePathAssignment_5_in_rule__Input__Group__5__Impl2180);
            rule__Input__FilePathAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getFilePathAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__5__Impl"


    // $ANTLR start "rule__Input__Group__6"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1067:1: rule__Input__Group__6 : rule__Input__Group__6__Impl rule__Input__Group__7 ;
    public final void rule__Input__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1071:1: ( rule__Input__Group__6__Impl rule__Input__Group__7 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1072:2: rule__Input__Group__6__Impl rule__Input__Group__7
            {
            pushFollow(FOLLOW_rule__Input__Group__6__Impl_in_rule__Input__Group__62210);
            rule__Input__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__7_in_rule__Input__Group__62213);
            rule__Input__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__6"


    // $ANTLR start "rule__Input__Group__6__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1079:1: rule__Input__Group__6__Impl : ( ( rule__Input__Group_6__0 )? ) ;
    public final void rule__Input__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1083:1: ( ( ( rule__Input__Group_6__0 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1084:1: ( ( rule__Input__Group_6__0 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1084:1: ( ( rule__Input__Group_6__0 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1085:1: ( rule__Input__Group_6__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_6()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1086:1: ( rule__Input__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_C_COMMA) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1086:2: rule__Input__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Input__Group_6__0_in_rule__Input__Group__6__Impl2240);
                    rule__Input__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__6__Impl"


    // $ANTLR start "rule__Input__Group__7"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1096:1: rule__Input__Group__7 : rule__Input__Group__7__Impl rule__Input__Group__8 ;
    public final void rule__Input__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1100:1: ( rule__Input__Group__7__Impl rule__Input__Group__8 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1101:2: rule__Input__Group__7__Impl rule__Input__Group__8
            {
            pushFollow(FOLLOW_rule__Input__Group__7__Impl_in_rule__Input__Group__72271);
            rule__Input__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__8_in_rule__Input__Group__72274);
            rule__Input__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__7"


    // $ANTLR start "rule__Input__Group__7__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1108:1: rule__Input__Group__7__Impl : ( RULE_C_PAREN_R ) ;
    public final void rule__Input__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1112:1: ( ( RULE_C_PAREN_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1113:1: ( RULE_C_PAREN_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1113:1: ( RULE_C_PAREN_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1114:1: RULE_C_PAREN_R
            {
             before(grammarAccess.getInputAccess().getC_PAREN_RTerminalRuleCall_7()); 
            match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_rule__Input__Group__7__Impl2301); 
             after(grammarAccess.getInputAccess().getC_PAREN_RTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__7__Impl"


    // $ANTLR start "rule__Input__Group__8"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1125:1: rule__Input__Group__8 : rule__Input__Group__8__Impl ;
    public final void rule__Input__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1129:1: ( rule__Input__Group__8__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1130:2: rule__Input__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group__8__Impl_in_rule__Input__Group__82330);
            rule__Input__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__8"


    // $ANTLR start "rule__Input__Group__8__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1136:1: rule__Input__Group__8__Impl : ( RULE_C_BRACKET_R ) ;
    public final void rule__Input__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1140:1: ( ( RULE_C_BRACKET_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1141:1: ( RULE_C_BRACKET_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1141:1: ( RULE_C_BRACKET_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1142:1: RULE_C_BRACKET_R
            {
             before(grammarAccess.getInputAccess().getC_BRACKET_RTerminalRuleCall_8()); 
            match(input,RULE_C_BRACKET_R,FOLLOW_RULE_C_BRACKET_R_in_rule__Input__Group__8__Impl2357); 
             after(grammarAccess.getInputAccess().getC_BRACKET_RTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__8__Impl"


    // $ANTLR start "rule__Input__Group_6__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1171:1: rule__Input__Group_6__0 : rule__Input__Group_6__0__Impl rule__Input__Group_6__1 ;
    public final void rule__Input__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1175:1: ( rule__Input__Group_6__0__Impl rule__Input__Group_6__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1176:2: rule__Input__Group_6__0__Impl rule__Input__Group_6__1
            {
            pushFollow(FOLLOW_rule__Input__Group_6__0__Impl_in_rule__Input__Group_6__02404);
            rule__Input__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_6__1_in_rule__Input__Group_6__02407);
            rule__Input__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_6__0"


    // $ANTLR start "rule__Input__Group_6__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1183:1: rule__Input__Group_6__0__Impl : ( RULE_C_COMMA ) ;
    public final void rule__Input__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1187:1: ( ( RULE_C_COMMA ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1188:1: ( RULE_C_COMMA )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1188:1: ( RULE_C_COMMA )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1189:1: RULE_C_COMMA
            {
             before(grammarAccess.getInputAccess().getC_COMMATerminalRuleCall_6_0()); 
            match(input,RULE_C_COMMA,FOLLOW_RULE_C_COMMA_in_rule__Input__Group_6__0__Impl2434); 
             after(grammarAccess.getInputAccess().getC_COMMATerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_6__0__Impl"


    // $ANTLR start "rule__Input__Group_6__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1200:1: rule__Input__Group_6__1 : rule__Input__Group_6__1__Impl rule__Input__Group_6__2 ;
    public final void rule__Input__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1204:1: ( rule__Input__Group_6__1__Impl rule__Input__Group_6__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1205:2: rule__Input__Group_6__1__Impl rule__Input__Group_6__2
            {
            pushFollow(FOLLOW_rule__Input__Group_6__1__Impl_in_rule__Input__Group_6__12463);
            rule__Input__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_6__2_in_rule__Input__Group_6__12466);
            rule__Input__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_6__1"


    // $ANTLR start "rule__Input__Group_6__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1212:1: rule__Input__Group_6__1__Impl : ( RULE_C_NODE ) ;
    public final void rule__Input__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1216:1: ( ( RULE_C_NODE ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1217:1: ( RULE_C_NODE )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1217:1: ( RULE_C_NODE )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1218:1: RULE_C_NODE
            {
             before(grammarAccess.getInputAccess().getC_NODETerminalRuleCall_6_1()); 
            match(input,RULE_C_NODE,FOLLOW_RULE_C_NODE_in_rule__Input__Group_6__1__Impl2493); 
             after(grammarAccess.getInputAccess().getC_NODETerminalRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_6__1__Impl"


    // $ANTLR start "rule__Input__Group_6__2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1229:1: rule__Input__Group_6__2 : rule__Input__Group_6__2__Impl rule__Input__Group_6__3 ;
    public final void rule__Input__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1233:1: ( rule__Input__Group_6__2__Impl rule__Input__Group_6__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1234:2: rule__Input__Group_6__2__Impl rule__Input__Group_6__3
            {
            pushFollow(FOLLOW_rule__Input__Group_6__2__Impl_in_rule__Input__Group_6__22522);
            rule__Input__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_6__3_in_rule__Input__Group_6__22525);
            rule__Input__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_6__2"


    // $ANTLR start "rule__Input__Group_6__2__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1241:1: rule__Input__Group_6__2__Impl : ( RULE_C_EQUALS ) ;
    public final void rule__Input__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1245:1: ( ( RULE_C_EQUALS ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1246:1: ( RULE_C_EQUALS )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1246:1: ( RULE_C_EQUALS )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1247:1: RULE_C_EQUALS
            {
             before(grammarAccess.getInputAccess().getC_EQUALSTerminalRuleCall_6_2()); 
            match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_rule__Input__Group_6__2__Impl2552); 
             after(grammarAccess.getInputAccess().getC_EQUALSTerminalRuleCall_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_6__2__Impl"


    // $ANTLR start "rule__Input__Group_6__3"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1258:1: rule__Input__Group_6__3 : rule__Input__Group_6__3__Impl ;
    public final void rule__Input__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1262:1: ( rule__Input__Group_6__3__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1263:2: rule__Input__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_6__3__Impl_in_rule__Input__Group_6__32581);
            rule__Input__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_6__3"


    // $ANTLR start "rule__Input__Group_6__3__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1269:1: rule__Input__Group_6__3__Impl : ( ( rule__Input__NodePathAssignment_6_3 ) ) ;
    public final void rule__Input__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1273:1: ( ( ( rule__Input__NodePathAssignment_6_3 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1274:1: ( ( rule__Input__NodePathAssignment_6_3 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1274:1: ( ( rule__Input__NodePathAssignment_6_3 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1275:1: ( rule__Input__NodePathAssignment_6_3 )
            {
             before(grammarAccess.getInputAccess().getNodePathAssignment_6_3()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1276:1: ( rule__Input__NodePathAssignment_6_3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1276:2: rule__Input__NodePathAssignment_6_3
            {
            pushFollow(FOLLOW_rule__Input__NodePathAssignment_6_3_in_rule__Input__Group_6__3__Impl2608);
            rule__Input__NodePathAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getNodePathAssignment_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_6__3__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1294:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1298:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1299:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__02646);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__02649);
            rule__Field__Group__1();

            state._fsp--;


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1306:1: rule__Field__Group__0__Impl : ( ( rule__Field__CommAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1310:1: ( ( ( rule__Field__CommAssignment_0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1311:1: ( ( rule__Field__CommAssignment_0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1311:1: ( ( rule__Field__CommAssignment_0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1312:1: ( rule__Field__CommAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getCommAssignment_0()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1313:1: ( rule__Field__CommAssignment_0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1313:2: rule__Field__CommAssignment_0
            {
            pushFollow(FOLLOW_rule__Field__CommAssignment_0_in_rule__Field__Group__0__Impl2676);
            rule__Field__CommAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getCommAssignment_0()); 

            }


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1323:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1327:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1328:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__12706);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__12709);
            rule__Field__Group__2();

            state._fsp--;


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1335:1: rule__Field__Group__1__Impl : ( ( rule__Field__TypeAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1339:1: ( ( ( rule__Field__TypeAssignment_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1340:1: ( ( rule__Field__TypeAssignment_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1340:1: ( ( rule__Field__TypeAssignment_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1341:1: ( rule__Field__TypeAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_1()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1342:1: ( rule__Field__TypeAssignment_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1342:2: rule__Field__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__TypeAssignment_1_in_rule__Field__Group__1__Impl2736);
            rule__Field__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypeAssignment_1()); 

            }


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1352:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1356:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1357:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__22766);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__22769);
            rule__Field__Group__3();

            state._fsp--;


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1364:1: rule__Field__Group__2__Impl : ( ( rule__Field__FieldNameAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1368:1: ( ( ( rule__Field__FieldNameAssignment_2 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1369:1: ( ( rule__Field__FieldNameAssignment_2 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1369:1: ( ( rule__Field__FieldNameAssignment_2 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1370:1: ( rule__Field__FieldNameAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getFieldNameAssignment_2()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1371:1: ( rule__Field__FieldNameAssignment_2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1371:2: rule__Field__FieldNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Field__FieldNameAssignment_2_in_rule__Field__Group__2__Impl2796);
            rule__Field__FieldNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getFieldNameAssignment_2()); 

            }


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1381:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1385:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1386:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__32826);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__32829);
            rule__Field__Group__4();

            state._fsp--;


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1393:1: rule__Field__Group__3__Impl : ( RULE_C_EQUALS ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1397:1: ( ( RULE_C_EQUALS ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1398:1: ( RULE_C_EQUALS )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1398:1: ( RULE_C_EQUALS )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1399:1: RULE_C_EQUALS
            {
             before(grammarAccess.getFieldAccess().getC_EQUALSTerminalRuleCall_3()); 
            match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_rule__Field__Group__3__Impl2856); 
             after(grammarAccess.getFieldAccess().getC_EQUALSTerminalRuleCall_3()); 

            }


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1410:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1414:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1415:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__42885);
            rule__Field__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__5_in_rule__Field__Group__42888);
            rule__Field__Group__5();

            state._fsp--;


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1422:1: rule__Field__Group__4__Impl : ( ( rule__Field__NodePathAssignment_4 ) ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1426:1: ( ( ( rule__Field__NodePathAssignment_4 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1427:1: ( ( rule__Field__NodePathAssignment_4 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1427:1: ( ( rule__Field__NodePathAssignment_4 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1428:1: ( rule__Field__NodePathAssignment_4 )
            {
             before(grammarAccess.getFieldAccess().getNodePathAssignment_4()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1429:1: ( rule__Field__NodePathAssignment_4 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1429:2: rule__Field__NodePathAssignment_4
            {
            pushFollow(FOLLOW_rule__Field__NodePathAssignment_4_in_rule__Field__Group__4__Impl2915);
            rule__Field__NodePathAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNodePathAssignment_4()); 

            }


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1439:1: rule__Field__Group__5 : rule__Field__Group__5__Impl ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1443:1: ( rule__Field__Group__5__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1444:2: rule__Field__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__52945);
            rule__Field__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1450:1: rule__Field__Group__5__Impl : ( ( RULE_C_SEMICOLON )? ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1454:1: ( ( ( RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1455:1: ( ( RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1455:1: ( ( RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1456:1: ( RULE_C_SEMICOLON )?
            {
             before(grammarAccess.getFieldAccess().getC_SEMICOLONTerminalRuleCall_5()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1457:1: ( RULE_C_SEMICOLON )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_C_SEMICOLON) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1457:3: RULE_C_SEMICOLON
                    {
                    match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_rule__Field__Group__5__Impl2973); 

                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getC_SEMICOLONTerminalRuleCall_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__ListType__Group__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1479:1: rule__ListType__Group__0 : rule__ListType__Group__0__Impl rule__ListType__Group__1 ;
    public final void rule__ListType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1483:1: ( rule__ListType__Group__0__Impl rule__ListType__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1484:2: rule__ListType__Group__0__Impl rule__ListType__Group__1
            {
            pushFollow(FOLLOW_rule__ListType__Group__0__Impl_in_rule__ListType__Group__03016);
            rule__ListType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListType__Group__1_in_rule__ListType__Group__03019);
            rule__ListType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__0"


    // $ANTLR start "rule__ListType__Group__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1491:1: rule__ListType__Group__0__Impl : ( RULE_C_LIST ) ;
    public final void rule__ListType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1495:1: ( ( RULE_C_LIST ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1496:1: ( RULE_C_LIST )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1496:1: ( RULE_C_LIST )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1497:1: RULE_C_LIST
            {
             before(grammarAccess.getListTypeAccess().getC_LISTTerminalRuleCall_0()); 
            match(input,RULE_C_LIST,FOLLOW_RULE_C_LIST_in_rule__ListType__Group__0__Impl3046); 
             after(grammarAccess.getListTypeAccess().getC_LISTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__0__Impl"


    // $ANTLR start "rule__ListType__Group__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1508:1: rule__ListType__Group__1 : rule__ListType__Group__1__Impl rule__ListType__Group__2 ;
    public final void rule__ListType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1512:1: ( rule__ListType__Group__1__Impl rule__ListType__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1513:2: rule__ListType__Group__1__Impl rule__ListType__Group__2
            {
            pushFollow(FOLLOW_rule__ListType__Group__1__Impl_in_rule__ListType__Group__13075);
            rule__ListType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListType__Group__2_in_rule__ListType__Group__13078);
            rule__ListType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__1"


    // $ANTLR start "rule__ListType__Group__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1520:1: rule__ListType__Group__1__Impl : ( RULE_C_ANGLE_L ) ;
    public final void rule__ListType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1524:1: ( ( RULE_C_ANGLE_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1525:1: ( RULE_C_ANGLE_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1525:1: ( RULE_C_ANGLE_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1526:1: RULE_C_ANGLE_L
            {
             before(grammarAccess.getListTypeAccess().getC_ANGLE_LTerminalRuleCall_1()); 
            match(input,RULE_C_ANGLE_L,FOLLOW_RULE_C_ANGLE_L_in_rule__ListType__Group__1__Impl3105); 
             after(grammarAccess.getListTypeAccess().getC_ANGLE_LTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__1__Impl"


    // $ANTLR start "rule__ListType__Group__2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1537:1: rule__ListType__Group__2 : rule__ListType__Group__2__Impl rule__ListType__Group__3 ;
    public final void rule__ListType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1541:1: ( rule__ListType__Group__2__Impl rule__ListType__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1542:2: rule__ListType__Group__2__Impl rule__ListType__Group__3
            {
            pushFollow(FOLLOW_rule__ListType__Group__2__Impl_in_rule__ListType__Group__23134);
            rule__ListType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListType__Group__3_in_rule__ListType__Group__23137);
            rule__ListType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__2"


    // $ANTLR start "rule__ListType__Group__2__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1549:1: rule__ListType__Group__2__Impl : ( ( rule__ListType__TypeAssignment_2 ) ) ;
    public final void rule__ListType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1553:1: ( ( ( rule__ListType__TypeAssignment_2 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1554:1: ( ( rule__ListType__TypeAssignment_2 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1554:1: ( ( rule__ListType__TypeAssignment_2 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1555:1: ( rule__ListType__TypeAssignment_2 )
            {
             before(grammarAccess.getListTypeAccess().getTypeAssignment_2()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1556:1: ( rule__ListType__TypeAssignment_2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1556:2: rule__ListType__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ListType__TypeAssignment_2_in_rule__ListType__Group__2__Impl3164);
            rule__ListType__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListTypeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__2__Impl"


    // $ANTLR start "rule__ListType__Group__3"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1566:1: rule__ListType__Group__3 : rule__ListType__Group__3__Impl ;
    public final void rule__ListType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1570:1: ( rule__ListType__Group__3__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1571:2: rule__ListType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ListType__Group__3__Impl_in_rule__ListType__Group__33194);
            rule__ListType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__3"


    // $ANTLR start "rule__ListType__Group__3__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1577:1: rule__ListType__Group__3__Impl : ( RULE_C_ANGLE_R ) ;
    public final void rule__ListType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1581:1: ( ( RULE_C_ANGLE_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1582:1: ( RULE_C_ANGLE_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1582:1: ( RULE_C_ANGLE_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1583:1: RULE_C_ANGLE_R
            {
             before(grammarAccess.getListTypeAccess().getC_ANGLE_RTerminalRuleCall_3()); 
            match(input,RULE_C_ANGLE_R,FOLLOW_RULE_C_ANGLE_R_in_rule__ListType__Group__3__Impl3221); 
             after(grammarAccess.getListTypeAccess().getC_ANGLE_RTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__3__Impl"


    // $ANTLR start "rule__HashType__Group__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1602:1: rule__HashType__Group__0 : rule__HashType__Group__0__Impl rule__HashType__Group__1 ;
    public final void rule__HashType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1606:1: ( rule__HashType__Group__0__Impl rule__HashType__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1607:2: rule__HashType__Group__0__Impl rule__HashType__Group__1
            {
            pushFollow(FOLLOW_rule__HashType__Group__0__Impl_in_rule__HashType__Group__03258);
            rule__HashType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashType__Group__1_in_rule__HashType__Group__03261);
            rule__HashType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__Group__0"


    // $ANTLR start "rule__HashType__Group__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1614:1: rule__HashType__Group__0__Impl : ( RULE_C_HASH ) ;
    public final void rule__HashType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1618:1: ( ( RULE_C_HASH ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1619:1: ( RULE_C_HASH )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1619:1: ( RULE_C_HASH )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1620:1: RULE_C_HASH
            {
             before(grammarAccess.getHashTypeAccess().getC_HASHTerminalRuleCall_0()); 
            match(input,RULE_C_HASH,FOLLOW_RULE_C_HASH_in_rule__HashType__Group__0__Impl3288); 
             after(grammarAccess.getHashTypeAccess().getC_HASHTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__Group__0__Impl"


    // $ANTLR start "rule__HashType__Group__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1631:1: rule__HashType__Group__1 : rule__HashType__Group__1__Impl rule__HashType__Group__2 ;
    public final void rule__HashType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1635:1: ( rule__HashType__Group__1__Impl rule__HashType__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1636:2: rule__HashType__Group__1__Impl rule__HashType__Group__2
            {
            pushFollow(FOLLOW_rule__HashType__Group__1__Impl_in_rule__HashType__Group__13317);
            rule__HashType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashType__Group__2_in_rule__HashType__Group__13320);
            rule__HashType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__Group__1"


    // $ANTLR start "rule__HashType__Group__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1643:1: rule__HashType__Group__1__Impl : ( RULE_C_ANGLE_L ) ;
    public final void rule__HashType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1647:1: ( ( RULE_C_ANGLE_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1648:1: ( RULE_C_ANGLE_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1648:1: ( RULE_C_ANGLE_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1649:1: RULE_C_ANGLE_L
            {
             before(grammarAccess.getHashTypeAccess().getC_ANGLE_LTerminalRuleCall_1()); 
            match(input,RULE_C_ANGLE_L,FOLLOW_RULE_C_ANGLE_L_in_rule__HashType__Group__1__Impl3347); 
             after(grammarAccess.getHashTypeAccess().getC_ANGLE_LTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__Group__1__Impl"


    // $ANTLR start "rule__HashType__Group__2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1660:1: rule__HashType__Group__2 : rule__HashType__Group__2__Impl rule__HashType__Group__3 ;
    public final void rule__HashType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1664:1: ( rule__HashType__Group__2__Impl rule__HashType__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1665:2: rule__HashType__Group__2__Impl rule__HashType__Group__3
            {
            pushFollow(FOLLOW_rule__HashType__Group__2__Impl_in_rule__HashType__Group__23376);
            rule__HashType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashType__Group__3_in_rule__HashType__Group__23379);
            rule__HashType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__Group__2"


    // $ANTLR start "rule__HashType__Group__2__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1672:1: rule__HashType__Group__2__Impl : ( ( rule__HashType__TypeAssignment_2 ) ) ;
    public final void rule__HashType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1676:1: ( ( ( rule__HashType__TypeAssignment_2 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1677:1: ( ( rule__HashType__TypeAssignment_2 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1677:1: ( ( rule__HashType__TypeAssignment_2 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1678:1: ( rule__HashType__TypeAssignment_2 )
            {
             before(grammarAccess.getHashTypeAccess().getTypeAssignment_2()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1679:1: ( rule__HashType__TypeAssignment_2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1679:2: rule__HashType__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__HashType__TypeAssignment_2_in_rule__HashType__Group__2__Impl3406);
            rule__HashType__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHashTypeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__Group__2__Impl"


    // $ANTLR start "rule__HashType__Group__3"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1689:1: rule__HashType__Group__3 : rule__HashType__Group__3__Impl rule__HashType__Group__4 ;
    public final void rule__HashType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1693:1: ( rule__HashType__Group__3__Impl rule__HashType__Group__4 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1694:2: rule__HashType__Group__3__Impl rule__HashType__Group__4
            {
            pushFollow(FOLLOW_rule__HashType__Group__3__Impl_in_rule__HashType__Group__33436);
            rule__HashType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashType__Group__4_in_rule__HashType__Group__33439);
            rule__HashType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__Group__3"


    // $ANTLR start "rule__HashType__Group__3__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1701:1: rule__HashType__Group__3__Impl : ( RULE_C_ANGLE_R ) ;
    public final void rule__HashType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1705:1: ( ( RULE_C_ANGLE_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1706:1: ( RULE_C_ANGLE_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1706:1: ( RULE_C_ANGLE_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1707:1: RULE_C_ANGLE_R
            {
             before(grammarAccess.getHashTypeAccess().getC_ANGLE_RTerminalRuleCall_3()); 
            match(input,RULE_C_ANGLE_R,FOLLOW_RULE_C_ANGLE_R_in_rule__HashType__Group__3__Impl3466); 
             after(grammarAccess.getHashTypeAccess().getC_ANGLE_RTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__Group__3__Impl"


    // $ANTLR start "rule__HashType__Group__4"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1718:1: rule__HashType__Group__4 : rule__HashType__Group__4__Impl ;
    public final void rule__HashType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1722:1: ( rule__HashType__Group__4__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1723:2: rule__HashType__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__HashType__Group__4__Impl_in_rule__HashType__Group__43495);
            rule__HashType__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__Group__4"


    // $ANTLR start "rule__HashType__Group__4__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1729:1: rule__HashType__Group__4__Impl : ( ( rule__HashType__Group_4__0 )? ) ;
    public final void rule__HashType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1733:1: ( ( ( rule__HashType__Group_4__0 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1734:1: ( ( rule__HashType__Group_4__0 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1734:1: ( ( rule__HashType__Group_4__0 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1735:1: ( rule__HashType__Group_4__0 )?
            {
             before(grammarAccess.getHashTypeAccess().getGroup_4()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1736:1: ( rule__HashType__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_C_PAREN_L) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1736:2: rule__HashType__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__HashType__Group_4__0_in_rule__HashType__Group__4__Impl3522);
                    rule__HashType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHashTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__Group__4__Impl"


    // $ANTLR start "rule__HashType__Group_4__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1756:1: rule__HashType__Group_4__0 : rule__HashType__Group_4__0__Impl rule__HashType__Group_4__1 ;
    public final void rule__HashType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1760:1: ( rule__HashType__Group_4__0__Impl rule__HashType__Group_4__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1761:2: rule__HashType__Group_4__0__Impl rule__HashType__Group_4__1
            {
            pushFollow(FOLLOW_rule__HashType__Group_4__0__Impl_in_rule__HashType__Group_4__03563);
            rule__HashType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashType__Group_4__1_in_rule__HashType__Group_4__03566);
            rule__HashType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__Group_4__0"


    // $ANTLR start "rule__HashType__Group_4__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1768:1: rule__HashType__Group_4__0__Impl : ( RULE_C_PAREN_L ) ;
    public final void rule__HashType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1772:1: ( ( RULE_C_PAREN_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1773:1: ( RULE_C_PAREN_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1773:1: ( RULE_C_PAREN_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1774:1: RULE_C_PAREN_L
            {
             before(grammarAccess.getHashTypeAccess().getC_PAREN_LTerminalRuleCall_4_0()); 
            match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_rule__HashType__Group_4__0__Impl3593); 
             after(grammarAccess.getHashTypeAccess().getC_PAREN_LTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__Group_4__0__Impl"


    // $ANTLR start "rule__HashType__Group_4__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1785:1: rule__HashType__Group_4__1 : rule__HashType__Group_4__1__Impl rule__HashType__Group_4__2 ;
    public final void rule__HashType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1789:1: ( rule__HashType__Group_4__1__Impl rule__HashType__Group_4__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1790:2: rule__HashType__Group_4__1__Impl rule__HashType__Group_4__2
            {
            pushFollow(FOLLOW_rule__HashType__Group_4__1__Impl_in_rule__HashType__Group_4__13622);
            rule__HashType__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashType__Group_4__2_in_rule__HashType__Group_4__13625);
            rule__HashType__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__Group_4__1"


    // $ANTLR start "rule__HashType__Group_4__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1797:1: rule__HashType__Group_4__1__Impl : ( ( rule__HashType__ParamsAssignment_4_1 ) ) ;
    public final void rule__HashType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1801:1: ( ( ( rule__HashType__ParamsAssignment_4_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1802:1: ( ( rule__HashType__ParamsAssignment_4_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1802:1: ( ( rule__HashType__ParamsAssignment_4_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1803:1: ( rule__HashType__ParamsAssignment_4_1 )
            {
             before(grammarAccess.getHashTypeAccess().getParamsAssignment_4_1()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1804:1: ( rule__HashType__ParamsAssignment_4_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1804:2: rule__HashType__ParamsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__HashType__ParamsAssignment_4_1_in_rule__HashType__Group_4__1__Impl3652);
            rule__HashType__ParamsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getHashTypeAccess().getParamsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__Group_4__1__Impl"


    // $ANTLR start "rule__HashType__Group_4__2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1814:1: rule__HashType__Group_4__2 : rule__HashType__Group_4__2__Impl rule__HashType__Group_4__3 ;
    public final void rule__HashType__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1818:1: ( rule__HashType__Group_4__2__Impl rule__HashType__Group_4__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1819:2: rule__HashType__Group_4__2__Impl rule__HashType__Group_4__3
            {
            pushFollow(FOLLOW_rule__HashType__Group_4__2__Impl_in_rule__HashType__Group_4__23682);
            rule__HashType__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashType__Group_4__3_in_rule__HashType__Group_4__23685);
            rule__HashType__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__Group_4__2"


    // $ANTLR start "rule__HashType__Group_4__2__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1826:1: rule__HashType__Group_4__2__Impl : ( ( rule__HashType__Group_4_2__0 )* ) ;
    public final void rule__HashType__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1830:1: ( ( ( rule__HashType__Group_4_2__0 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1831:1: ( ( rule__HashType__Group_4_2__0 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1831:1: ( ( rule__HashType__Group_4_2__0 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1832:1: ( rule__HashType__Group_4_2__0 )*
            {
             before(grammarAccess.getHashTypeAccess().getGroup_4_2()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1833:1: ( rule__HashType__Group_4_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_C_COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1833:2: rule__HashType__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__HashType__Group_4_2__0_in_rule__HashType__Group_4__2__Impl3712);
            	    rule__HashType__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getHashTypeAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__Group_4__2__Impl"


    // $ANTLR start "rule__HashType__Group_4__3"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1843:1: rule__HashType__Group_4__3 : rule__HashType__Group_4__3__Impl ;
    public final void rule__HashType__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1847:1: ( rule__HashType__Group_4__3__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1848:2: rule__HashType__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__HashType__Group_4__3__Impl_in_rule__HashType__Group_4__33743);
            rule__HashType__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__Group_4__3"


    // $ANTLR start "rule__HashType__Group_4__3__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1854:1: rule__HashType__Group_4__3__Impl : ( RULE_C_PAREN_R ) ;
    public final void rule__HashType__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1858:1: ( ( RULE_C_PAREN_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1859:1: ( RULE_C_PAREN_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1859:1: ( RULE_C_PAREN_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1860:1: RULE_C_PAREN_R
            {
             before(grammarAccess.getHashTypeAccess().getC_PAREN_RTerminalRuleCall_4_3()); 
            match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_rule__HashType__Group_4__3__Impl3770); 
             after(grammarAccess.getHashTypeAccess().getC_PAREN_RTerminalRuleCall_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__Group_4__3__Impl"


    // $ANTLR start "rule__HashType__Group_4_2__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1879:1: rule__HashType__Group_4_2__0 : rule__HashType__Group_4_2__0__Impl rule__HashType__Group_4_2__1 ;
    public final void rule__HashType__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1883:1: ( rule__HashType__Group_4_2__0__Impl rule__HashType__Group_4_2__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1884:2: rule__HashType__Group_4_2__0__Impl rule__HashType__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__HashType__Group_4_2__0__Impl_in_rule__HashType__Group_4_2__03807);
            rule__HashType__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashType__Group_4_2__1_in_rule__HashType__Group_4_2__03810);
            rule__HashType__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__Group_4_2__0"


    // $ANTLR start "rule__HashType__Group_4_2__0__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1891:1: rule__HashType__Group_4_2__0__Impl : ( RULE_C_COMMA ) ;
    public final void rule__HashType__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1895:1: ( ( RULE_C_COMMA ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1896:1: ( RULE_C_COMMA )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1896:1: ( RULE_C_COMMA )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1897:1: RULE_C_COMMA
            {
             before(grammarAccess.getHashTypeAccess().getC_COMMATerminalRuleCall_4_2_0()); 
            match(input,RULE_C_COMMA,FOLLOW_RULE_C_COMMA_in_rule__HashType__Group_4_2__0__Impl3837); 
             after(grammarAccess.getHashTypeAccess().getC_COMMATerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__Group_4_2__0__Impl"


    // $ANTLR start "rule__HashType__Group_4_2__1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1908:1: rule__HashType__Group_4_2__1 : rule__HashType__Group_4_2__1__Impl ;
    public final void rule__HashType__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1912:1: ( rule__HashType__Group_4_2__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1913:2: rule__HashType__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__HashType__Group_4_2__1__Impl_in_rule__HashType__Group_4_2__13866);
            rule__HashType__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__Group_4_2__1"


    // $ANTLR start "rule__HashType__Group_4_2__1__Impl"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1919:1: rule__HashType__Group_4_2__1__Impl : ( ( rule__HashType__ParamsAssignment_4_2_1 ) ) ;
    public final void rule__HashType__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1923:1: ( ( ( rule__HashType__ParamsAssignment_4_2_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1924:1: ( ( rule__HashType__ParamsAssignment_4_2_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1924:1: ( ( rule__HashType__ParamsAssignment_4_2_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1925:1: ( rule__HashType__ParamsAssignment_4_2_1 )
            {
             before(grammarAccess.getHashTypeAccess().getParamsAssignment_4_2_1()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1926:1: ( rule__HashType__ParamsAssignment_4_2_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1926:2: rule__HashType__ParamsAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__HashType__ParamsAssignment_4_2_1_in_rule__HashType__Group_4_2__1__Impl3893);
            rule__HashType__ParamsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getHashTypeAccess().getParamsAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__Group_4_2__1__Impl"


    // $ANTLR start "rule__PackName__Group__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1940:1: rule__PackName__Group__0 : rule__PackName__Group__0__Impl rule__PackName__Group__1 ;
    public final void rule__PackName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1944:1: ( rule__PackName__Group__0__Impl rule__PackName__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1945:2: rule__PackName__Group__0__Impl rule__PackName__Group__1
            {
            pushFollow(FOLLOW_rule__PackName__Group__0__Impl_in_rule__PackName__Group__03927);
            rule__PackName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackName__Group__1_in_rule__PackName__Group__03930);
            rule__PackName__Group__1();

            state._fsp--;


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1952:1: rule__PackName__Group__0__Impl : ( RULE_NAME ) ;
    public final void rule__PackName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1956:1: ( ( RULE_NAME ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1957:1: ( RULE_NAME )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1957:1: ( RULE_NAME )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1958:1: RULE_NAME
            {
             before(grammarAccess.getPackNameAccess().getNAMETerminalRuleCall_0()); 
            match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rule__PackName__Group__0__Impl3957); 
             after(grammarAccess.getPackNameAccess().getNAMETerminalRuleCall_0()); 

            }


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1969:1: rule__PackName__Group__1 : rule__PackName__Group__1__Impl ;
    public final void rule__PackName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1973:1: ( rule__PackName__Group__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1974:2: rule__PackName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PackName__Group__1__Impl_in_rule__PackName__Group__13986);
            rule__PackName__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1980:1: rule__PackName__Group__1__Impl : ( ( rule__PackName__Group_1__0 )* ) ;
    public final void rule__PackName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1984:1: ( ( ( rule__PackName__Group_1__0 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1985:1: ( ( rule__PackName__Group_1__0 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1985:1: ( ( rule__PackName__Group_1__0 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1986:1: ( rule__PackName__Group_1__0 )*
            {
             before(grammarAccess.getPackNameAccess().getGroup_1()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1987:1: ( rule__PackName__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1987:2: rule__PackName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PackName__Group_1__0_in_rule__PackName__Group__1__Impl4013);
            	    rule__PackName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPackNameAccess().getGroup_1()); 

            }


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2001:1: rule__PackName__Group_1__0 : rule__PackName__Group_1__0__Impl rule__PackName__Group_1__1 ;
    public final void rule__PackName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2005:1: ( rule__PackName__Group_1__0__Impl rule__PackName__Group_1__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2006:2: rule__PackName__Group_1__0__Impl rule__PackName__Group_1__1
            {
            pushFollow(FOLLOW_rule__PackName__Group_1__0__Impl_in_rule__PackName__Group_1__04048);
            rule__PackName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PackName__Group_1__1_in_rule__PackName__Group_1__04051);
            rule__PackName__Group_1__1();

            state._fsp--;


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2013:1: rule__PackName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__PackName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2017:1: ( ( '.' ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2018:1: ( '.' )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2018:1: ( '.' )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2019:1: '.'
            {
             before(grammarAccess.getPackNameAccess().getFullStopKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__PackName__Group_1__0__Impl4079); 
             after(grammarAccess.getPackNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2032:1: rule__PackName__Group_1__1 : rule__PackName__Group_1__1__Impl ;
    public final void rule__PackName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2036:1: ( rule__PackName__Group_1__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2037:2: rule__PackName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PackName__Group_1__1__Impl_in_rule__PackName__Group_1__14110);
            rule__PackName__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2043:1: rule__PackName__Group_1__1__Impl : ( RULE_NAME ) ;
    public final void rule__PackName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2047:1: ( ( RULE_NAME ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2048:1: ( RULE_NAME )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2048:1: ( RULE_NAME )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2049:1: RULE_NAME
            {
             before(grammarAccess.getPackNameAccess().getNAMETerminalRuleCall_1_1()); 
            match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rule__PackName__Group_1__1__Impl4137); 
             after(grammarAccess.getPackNameAccess().getNAMETerminalRuleCall_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__XML2__PackAssignment_0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2065:1: rule__XML2__PackAssignment_0 : ( rulePackDef ) ;
    public final void rule__XML2__PackAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2069:1: ( ( rulePackDef ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2070:1: ( rulePackDef )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2070:1: ( rulePackDef )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2071:1: rulePackDef
            {
             before(grammarAccess.getXML2Access().getPackPackDefParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePackDef_in_rule__XML2__PackAssignment_04175);
            rulePackDef();

            state._fsp--;

             after(grammarAccess.getXML2Access().getPackPackDefParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__PackAssignment_0"


    // $ANTLR start "rule__XML2__TypesAssignment_1_0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2080:1: rule__XML2__TypesAssignment_1_0 : ( ruleType ) ;
    public final void rule__XML2__TypesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2084:1: ( ( ruleType ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2085:1: ( ruleType )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2085:1: ( ruleType )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2086:1: ruleType
            {
             before(grammarAccess.getXML2Access().getTypesTypeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__XML2__TypesAssignment_1_04206);
            ruleType();

            state._fsp--;

             after(grammarAccess.getXML2Access().getTypesTypeParserRuleCall_1_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__XML2__OtherCommAssignment_1_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2095:1: rule__XML2__OtherCommAssignment_1_1 : ( RULE_COMMENT ) ;
    public final void rule__XML2__OtherCommAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2099:1: ( ( RULE_COMMENT ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2100:1: ( RULE_COMMENT )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2100:1: ( RULE_COMMENT )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2101:1: RULE_COMMENT
            {
             before(grammarAccess.getXML2Access().getOtherCommCOMMENTTerminalRuleCall_1_1_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__XML2__OtherCommAssignment_1_14237); 
             after(grammarAccess.getXML2Access().getOtherCommCOMMENTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__OtherCommAssignment_1_1"


    // $ANTLR start "rule__PackDef__PackCHARAssignment_0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2110:1: rule__PackDef__PackCHARAssignment_0 : ( RULE_C_PACKAGE ) ;
    public final void rule__PackDef__PackCHARAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2114:1: ( ( RULE_C_PACKAGE ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2115:1: ( RULE_C_PACKAGE )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2115:1: ( RULE_C_PACKAGE )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2116:1: RULE_C_PACKAGE
            {
             before(grammarAccess.getPackDefAccess().getPackCHARC_PACKAGETerminalRuleCall_0_0()); 
            match(input,RULE_C_PACKAGE,FOLLOW_RULE_C_PACKAGE_in_rule__PackDef__PackCHARAssignment_04268); 
             after(grammarAccess.getPackDefAccess().getPackCHARC_PACKAGETerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackDef__PackCHARAssignment_0"


    // $ANTLR start "rule__PackDef__PackAssignment_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2125:1: rule__PackDef__PackAssignment_1 : ( rulePackName ) ;
    public final void rule__PackDef__PackAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2129:1: ( ( rulePackName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2130:1: ( rulePackName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2130:1: ( rulePackName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2131:1: rulePackName
            {
             before(grammarAccess.getPackDefAccess().getPackPackNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePackName_in_rule__PackDef__PackAssignment_14299);
            rulePackName();

            state._fsp--;

             after(grammarAccess.getPackDefAccess().getPackPackNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackDef__PackAssignment_1"


    // $ANTLR start "rule__Type__CommAssignment_0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2140:1: rule__Type__CommAssignment_0 : ( RULE_COMMENT ) ;
    public final void rule__Type__CommAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2144:1: ( ( RULE_COMMENT ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2145:1: ( RULE_COMMENT )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2145:1: ( RULE_COMMENT )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2146:1: RULE_COMMENT
            {
             before(grammarAccess.getTypeAccess().getCommCOMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__Type__CommAssignment_04330); 
             after(grammarAccess.getTypeAccess().getCommCOMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__CommAssignment_0"


    // $ANTLR start "rule__Type__InputAssignment_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2155:1: rule__Type__InputAssignment_1 : ( ruleInput ) ;
    public final void rule__Type__InputAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2159:1: ( ( ruleInput ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2160:1: ( ruleInput )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2160:1: ( ruleInput )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2161:1: ruleInput
            {
             before(grammarAccess.getTypeAccess().getInputInputParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInput_in_rule__Type__InputAssignment_14361);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getInputInputParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__InputAssignment_1"


    // $ANTLR start "rule__Type__PrefixAssignment_2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2170:1: rule__Type__PrefixAssignment_2 : ( RULE_C_TYPE ) ;
    public final void rule__Type__PrefixAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2174:1: ( ( RULE_C_TYPE ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2175:1: ( RULE_C_TYPE )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2175:1: ( RULE_C_TYPE )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2176:1: RULE_C_TYPE
            {
             before(grammarAccess.getTypeAccess().getPrefixC_TYPETerminalRuleCall_2_0()); 
            match(input,RULE_C_TYPE,FOLLOW_RULE_C_TYPE_in_rule__Type__PrefixAssignment_24392); 
             after(grammarAccess.getTypeAccess().getPrefixC_TYPETerminalRuleCall_2_0()); 

            }


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2185:1: rule__Type__NameAssignment_3 : ( RULE_NAME ) ;
    public final void rule__Type__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2189:1: ( ( RULE_NAME ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2190:1: ( RULE_NAME )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2190:1: ( RULE_NAME )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2191:1: RULE_NAME
            {
             before(grammarAccess.getTypeAccess().getNameNAMETerminalRuleCall_3_0()); 
            match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rule__Type__NameAssignment_34423); 
             after(grammarAccess.getTypeAccess().getNameNAMETerminalRuleCall_3_0()); 

            }


            }

        }
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2200:1: rule__Type__FieldsAssignment_5_0 : ( ruleField ) ;
    public final void rule__Type__FieldsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2204:1: ( ( ruleField ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2205:1: ( ruleField )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2205:1: ( ruleField )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2206:1: ruleField
            {
             before(grammarAccess.getTypeAccess().getFieldsFieldParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__Type__FieldsAssignment_5_04454);
            ruleField();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getFieldsFieldParserRuleCall_5_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Type__OtherCommAssignment_5_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2215:1: rule__Type__OtherCommAssignment_5_1 : ( RULE_COMMENT ) ;
    public final void rule__Type__OtherCommAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2219:1: ( ( RULE_COMMENT ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2220:1: ( RULE_COMMENT )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2220:1: ( RULE_COMMENT )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2221:1: RULE_COMMENT
            {
             before(grammarAccess.getTypeAccess().getOtherCommCOMMENTTerminalRuleCall_5_1_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__Type__OtherCommAssignment_5_14485); 
             after(grammarAccess.getTypeAccess().getOtherCommCOMMENTTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__OtherCommAssignment_5_1"


    // $ANTLR start "rule__Input__PrefixAssignment_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2230:1: rule__Input__PrefixAssignment_1 : ( RULE_C_INPUT ) ;
    public final void rule__Input__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2234:1: ( ( RULE_C_INPUT ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2235:1: ( RULE_C_INPUT )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2235:1: ( RULE_C_INPUT )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2236:1: RULE_C_INPUT
            {
             before(grammarAccess.getInputAccess().getPrefixC_INPUTTerminalRuleCall_1_0()); 
            match(input,RULE_C_INPUT,FOLLOW_RULE_C_INPUT_in_rule__Input__PrefixAssignment_14516); 
             after(grammarAccess.getInputAccess().getPrefixC_INPUTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__PrefixAssignment_1"


    // $ANTLR start "rule__Input__FilePathAssignment_5"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2245:1: rule__Input__FilePathAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Input__FilePathAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2249:1: ( ( RULE_STRING ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2250:1: ( RULE_STRING )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2250:1: ( RULE_STRING )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2251:1: RULE_STRING
            {
             before(grammarAccess.getInputAccess().getFilePathSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Input__FilePathAssignment_54547); 
             after(grammarAccess.getInputAccess().getFilePathSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__FilePathAssignment_5"


    // $ANTLR start "rule__Input__NodePathAssignment_6_3"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2260:1: rule__Input__NodePathAssignment_6_3 : ( RULE_STRING ) ;
    public final void rule__Input__NodePathAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2264:1: ( ( RULE_STRING ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2265:1: ( RULE_STRING )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2265:1: ( RULE_STRING )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2266:1: RULE_STRING
            {
             before(grammarAccess.getInputAccess().getNodePathSTRINGTerminalRuleCall_6_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Input__NodePathAssignment_6_34578); 
             after(grammarAccess.getInputAccess().getNodePathSTRINGTerminalRuleCall_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__NodePathAssignment_6_3"


    // $ANTLR start "rule__Field__CommAssignment_0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2275:1: rule__Field__CommAssignment_0 : ( RULE_COMMENT ) ;
    public final void rule__Field__CommAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2279:1: ( ( RULE_COMMENT ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2280:1: ( RULE_COMMENT )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2280:1: ( RULE_COMMENT )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2281:1: RULE_COMMENT
            {
             before(grammarAccess.getFieldAccess().getCommCOMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__Field__CommAssignment_04609); 
             after(grammarAccess.getFieldAccess().getCommCOMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__CommAssignment_0"


    // $ANTLR start "rule__Field__TypeAssignment_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2290:1: rule__Field__TypeAssignment_1 : ( ( rule__Field__TypeAlternatives_1_0 ) ) ;
    public final void rule__Field__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2294:1: ( ( ( rule__Field__TypeAlternatives_1_0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2295:1: ( ( rule__Field__TypeAlternatives_1_0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2295:1: ( ( rule__Field__TypeAlternatives_1_0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2296:1: ( rule__Field__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getFieldAccess().getTypeAlternatives_1_0()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2297:1: ( rule__Field__TypeAlternatives_1_0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2297:2: rule__Field__TypeAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Field__TypeAlternatives_1_0_in_rule__Field__TypeAssignment_14640);
            rule__Field__TypeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypeAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__TypeAssignment_1"


    // $ANTLR start "rule__Field__FieldNameAssignment_2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2306:1: rule__Field__FieldNameAssignment_2 : ( RULE_NAME ) ;
    public final void rule__Field__FieldNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2310:1: ( ( RULE_NAME ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2311:1: ( RULE_NAME )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2311:1: ( RULE_NAME )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2312:1: RULE_NAME
            {
             before(grammarAccess.getFieldAccess().getFieldNameNAMETerminalRuleCall_2_0()); 
            match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rule__Field__FieldNameAssignment_24673); 
             after(grammarAccess.getFieldAccess().getFieldNameNAMETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__FieldNameAssignment_2"


    // $ANTLR start "rule__Field__NodePathAssignment_4"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2321:1: rule__Field__NodePathAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Field__NodePathAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2325:1: ( ( RULE_STRING ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2326:1: ( RULE_STRING )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2326:1: ( RULE_STRING )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2327:1: RULE_STRING
            {
             before(grammarAccess.getFieldAccess().getNodePathSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Field__NodePathAssignment_44704); 
             after(grammarAccess.getFieldAccess().getNodePathSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NodePathAssignment_4"


    // $ANTLR start "rule__NativeType__TypeAssignment"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2336:1: rule__NativeType__TypeAssignment : ( ruleTypeName ) ;
    public final void rule__NativeType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2340:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2341:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2341:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2342:1: ruleTypeName
            {
             before(grammarAccess.getNativeTypeAccess().getTypeTypeNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTypeName_in_rule__NativeType__TypeAssignment4735);
            ruleTypeName();

            state._fsp--;

             after(grammarAccess.getNativeTypeAccess().getTypeTypeNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NativeType__TypeAssignment"


    // $ANTLR start "rule__ListType__TypeAssignment_2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2351:1: rule__ListType__TypeAssignment_2 : ( ruleTypeName ) ;
    public final void rule__ListType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2355:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2356:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2356:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2357:1: ruleTypeName
            {
             before(grammarAccess.getListTypeAccess().getTypeTypeNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeName_in_rule__ListType__TypeAssignment_24766);
            ruleTypeName();

            state._fsp--;

             after(grammarAccess.getListTypeAccess().getTypeTypeNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__TypeAssignment_2"


    // $ANTLR start "rule__HashType__TypeAssignment_2"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2366:1: rule__HashType__TypeAssignment_2 : ( ruleTypeName ) ;
    public final void rule__HashType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2370:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2371:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2371:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2372:1: ruleTypeName
            {
             before(grammarAccess.getHashTypeAccess().getTypeTypeNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeName_in_rule__HashType__TypeAssignment_24797);
            ruleTypeName();

            state._fsp--;

             after(grammarAccess.getHashTypeAccess().getTypeTypeNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__TypeAssignment_2"


    // $ANTLR start "rule__HashType__ParamsAssignment_4_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2381:1: rule__HashType__ParamsAssignment_4_1 : ( ruleParam ) ;
    public final void rule__HashType__ParamsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2385:1: ( ( ruleParam ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2386:1: ( ruleParam )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2386:1: ( ruleParam )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2387:1: ruleParam
            {
             before(grammarAccess.getHashTypeAccess().getParamsParamParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__HashType__ParamsAssignment_4_14828);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getHashTypeAccess().getParamsParamParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__ParamsAssignment_4_1"


    // $ANTLR start "rule__HashType__ParamsAssignment_4_2_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2396:1: rule__HashType__ParamsAssignment_4_2_1 : ( ruleParam ) ;
    public final void rule__HashType__ParamsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2400:1: ( ( ruleParam ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2401:1: ( ruleParam )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2401:1: ( ruleParam )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2402:1: ruleParam
            {
             before(grammarAccess.getHashTypeAccess().getParamsParamParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__HashType__ParamsAssignment_4_2_14859);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getHashTypeAccess().getParamsParamParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashType__ParamsAssignment_4_2_1"


    // $ANTLR start "rule__Param__ParamNameAssignment"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2411:1: rule__Param__ParamNameAssignment : ( RULE_NAME ) ;
    public final void rule__Param__ParamNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2415:1: ( ( RULE_NAME ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2416:1: ( RULE_NAME )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2416:1: ( RULE_NAME )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2417:1: RULE_NAME
            {
             before(grammarAccess.getParamAccess().getParamNameNAMETerminalRuleCall_0()); 
            match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rule__Param__ParamNameAssignment4890); 
             after(grammarAccess.getParamAccess().getParamNameNAMETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Param__ParamNameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleXML2_in_entryRuleXML261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXML268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group__0_in_ruleXML294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackDef_in_entryRulePackDef121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackDef128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackDef__Group__0_in_rulePackDef154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0_in_ruleType214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0_in_ruleInput274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeType_in_entryRuleNativeType361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeType368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeType__TypeAssignment_in_ruleNativeType394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListType_in_entryRuleListType421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListType428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListType__Group__0_in_ruleListType454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashType_in_entryRuleHashType481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHashType488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group__0_in_ruleHashType514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__ParamNameAssignment_in_ruleParam574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackName_in_entryRulePackName601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackName608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackName__Group__0_in_rulePackName634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_entryRuleTypeName661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeName668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeName__Alternatives_in_ruleTypeName694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__TypesAssignment_1_0_in_rule__XML2__Alternatives_1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__OtherCommAssignment_1_1_in_rule__XML2__Alternatives_1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__FieldsAssignment_5_0_in_rule__Type__Alternatives_5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__OtherCommAssignment_5_1_in_rule__Type__Alternatives_5799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeType_in_rule__Field__TypeAlternatives_1_0832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListType_in_rule__Field__TypeAlternatives_1_0849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashType_in_rule__Field__TypeAlternatives_1_0866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INPUT_in_rule__TypeName__Alternatives898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_FILE_in_rule__TypeName__Alternatives915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_NODE_in_rule__TypeName__Alternatives932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_TYPE_in_rule__TypeName__Alternatives949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INT_in_rule__TypeName__Alternatives966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_UINT_in_rule__TypeName__Alternatives983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BOOL_in_rule__TypeName__Alternatives1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_NUMBER_in_rule__TypeName__Alternatives1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_STRING_in_rule__TypeName__Alternatives1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_LIST_in_rule__TypeName__Alternatives1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_HASH_in_rule__TypeName__Alternatives1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rule__TypeName__Alternatives1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group__0__Impl_in_rule__XML2__Group__01115 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__XML2__Group__1_in_rule__XML2__Group__01118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__PackAssignment_0_in_rule__XML2__Group__0__Impl1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Group__1__Impl_in_rule__XML2__Group__11176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__Alternatives_1_in_rule__XML2__Group__1__Impl1203 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__PackDef__Group__0__Impl_in_rule__PackDef__Group__01238 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__PackDef__Group__1_in_rule__PackDef__Group__01241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackDef__PackCHARAssignment_0_in_rule__PackDef__Group__0__Impl1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackDef__Group__1__Impl_in_rule__PackDef__Group__11298 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__PackDef__Group__2_in_rule__PackDef__Group__11301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackDef__PackAssignment_1_in_rule__PackDef__Group__1__Impl1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackDef__Group__2__Impl_in_rule__PackDef__Group__21358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_rule__PackDef__Group__2__Impl1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__01423 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__01426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__CommAssignment_0_in_rule__Type__Group__0__Impl1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__11483 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_rule__Type__Group__2_in_rule__Type__Group__11486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__InputAssignment_1_in_rule__Type__Group__1__Impl1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__2__Impl_in_rule__Type__Group__21544 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Type__Group__3_in_rule__Type__Group__21547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__PrefixAssignment_2_in_rule__Type__Group__2__Impl1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__3__Impl_in_rule__Type__Group__31604 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Type__Group__4_in_rule__Type__Group__31607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__NameAssignment_3_in_rule__Type__Group__3__Impl1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__4__Impl_in_rule__Type__Group__41664 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_rule__Type__Group__5_in_rule__Type__Group__41667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACE_L_in_rule__Type__Group__4__Impl1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__5__Impl_in_rule__Type__Group__51723 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_rule__Type__Group__6_in_rule__Type__Group__51726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_5_in_rule__Type__Group__5__Impl1753 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Type__Group__6__Impl_in_rule__Type__Group__61784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACE_R_in_rule__Type__Group__6__Impl1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__01854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Input__Group__1_in_rule__Input__Group__01857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_L_in_rule__Input__Group__0__Impl1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__11913 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Input__Group__2_in_rule__Input__Group__11916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__PrefixAssignment_1_in_rule__Input__Group__1__Impl1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__2__Impl_in_rule__Input__Group__21973 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Input__Group__3_in_rule__Input__Group__21976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_rule__Input__Group__2__Impl2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__3__Impl_in_rule__Input__Group__32032 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Input__Group__4_in_rule__Input__Group__32035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_FILE_in_rule__Input__Group__3__Impl2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__4__Impl_in_rule__Input__Group__42091 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Input__Group__5_in_rule__Input__Group__42094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_rule__Input__Group__4__Impl2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__5__Impl_in_rule__Input__Group__52150 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__Input__Group__6_in_rule__Input__Group__52153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__FilePathAssignment_5_in_rule__Input__Group__5__Impl2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__6__Impl_in_rule__Input__Group__62210 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__Input__Group__7_in_rule__Input__Group__62213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_6__0_in_rule__Input__Group__6__Impl2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__7__Impl_in_rule__Input__Group__72271 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Input__Group__8_in_rule__Input__Group__72274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_rule__Input__Group__7__Impl2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__8__Impl_in_rule__Input__Group__82330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_R_in_rule__Input__Group__8__Impl2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_6__0__Impl_in_rule__Input__Group_6__02404 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Input__Group_6__1_in_rule__Input__Group_6__02407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_COMMA_in_rule__Input__Group_6__0__Impl2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_6__1__Impl_in_rule__Input__Group_6__12463 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Input__Group_6__2_in_rule__Input__Group_6__12466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_NODE_in_rule__Input__Group_6__1__Impl2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_6__2__Impl_in_rule__Input__Group_6__22522 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Input__Group_6__3_in_rule__Input__Group_6__22525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_rule__Input__Group_6__2__Impl2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_6__3__Impl_in_rule__Input__Group_6__32581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__NodePathAssignment_6_3_in_rule__Input__Group_6__3__Impl2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__02646 = new BitSet(new long[]{0x000000000000FFF0L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__02649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__CommAssignment_0_in_rule__Field__Group__0__Impl2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__12706 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__12709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypeAssignment_1_in_rule__Field__Group__1__Impl2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__22766 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__22769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__FieldNameAssignment_2_in_rule__Field__Group__2__Impl2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__32826 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__32829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_rule__Field__Group__3__Impl2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__42885 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Field__Group__5_in_rule__Field__Group__42888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NodePathAssignment_4_in_rule__Field__Group__4__Impl2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__52945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_rule__Field__Group__5__Impl2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListType__Group__0__Impl_in_rule__ListType__Group__03016 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ListType__Group__1_in_rule__ListType__Group__03019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_LIST_in_rule__ListType__Group__0__Impl3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListType__Group__1__Impl_in_rule__ListType__Group__13075 = new BitSet(new long[]{0x000000000000FFF0L});
    public static final BitSet FOLLOW_rule__ListType__Group__2_in_rule__ListType__Group__13078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_ANGLE_L_in_rule__ListType__Group__1__Impl3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListType__Group__2__Impl_in_rule__ListType__Group__23134 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ListType__Group__3_in_rule__ListType__Group__23137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListType__TypeAssignment_2_in_rule__ListType__Group__2__Impl3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListType__Group__3__Impl_in_rule__ListType__Group__33194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_ANGLE_R_in_rule__ListType__Group__3__Impl3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group__0__Impl_in_rule__HashType__Group__03258 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__HashType__Group__1_in_rule__HashType__Group__03261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_HASH_in_rule__HashType__Group__0__Impl3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group__1__Impl_in_rule__HashType__Group__13317 = new BitSet(new long[]{0x000000000000FFF0L});
    public static final BitSet FOLLOW_rule__HashType__Group__2_in_rule__HashType__Group__13320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_ANGLE_L_in_rule__HashType__Group__1__Impl3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group__2__Impl_in_rule__HashType__Group__23376 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__HashType__Group__3_in_rule__HashType__Group__23379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__TypeAssignment_2_in_rule__HashType__Group__2__Impl3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group__3__Impl_in_rule__HashType__Group__33436 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__HashType__Group__4_in_rule__HashType__Group__33439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_ANGLE_R_in_rule__HashType__Group__3__Impl3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group__4__Impl_in_rule__HashType__Group__43495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group_4__0_in_rule__HashType__Group__4__Impl3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group_4__0__Impl_in_rule__HashType__Group_4__03563 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__HashType__Group_4__1_in_rule__HashType__Group_4__03566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_rule__HashType__Group_4__0__Impl3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group_4__1__Impl_in_rule__HashType__Group_4__13622 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__HashType__Group_4__2_in_rule__HashType__Group_4__13625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__ParamsAssignment_4_1_in_rule__HashType__Group_4__1__Impl3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group_4__2__Impl_in_rule__HashType__Group_4__23682 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_rule__HashType__Group_4__3_in_rule__HashType__Group_4__23685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group_4_2__0_in_rule__HashType__Group_4__2__Impl3712 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__HashType__Group_4__3__Impl_in_rule__HashType__Group_4__33743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_rule__HashType__Group_4__3__Impl3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group_4_2__0__Impl_in_rule__HashType__Group_4_2__03807 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__HashType__Group_4_2__1_in_rule__HashType__Group_4_2__03810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_COMMA_in_rule__HashType__Group_4_2__0__Impl3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group_4_2__1__Impl_in_rule__HashType__Group_4_2__13866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__ParamsAssignment_4_2_1_in_rule__HashType__Group_4_2__1__Impl3893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackName__Group__0__Impl_in_rule__PackName__Group__03927 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__PackName__Group__1_in_rule__PackName__Group__03930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rule__PackName__Group__0__Impl3957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackName__Group__1__Impl_in_rule__PackName__Group__13986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackName__Group_1__0_in_rule__PackName__Group__1__Impl4013 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__PackName__Group_1__0__Impl_in_rule__PackName__Group_1__04048 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__PackName__Group_1__1_in_rule__PackName__Group_1__04051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PackName__Group_1__0__Impl4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PackName__Group_1__1__Impl_in_rule__PackName__Group_1__14110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rule__PackName__Group_1__1__Impl4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackDef_in_rule__XML2__PackAssignment_04175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__XML2__TypesAssignment_1_04206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__XML2__OtherCommAssignment_1_14237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PACKAGE_in_rule__PackDef__PackCHARAssignment_04268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackName_in_rule__PackDef__PackAssignment_14299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__Type__CommAssignment_04330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_rule__Type__InputAssignment_14361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_TYPE_in_rule__Type__PrefixAssignment_24392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rule__Type__NameAssignment_34423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Type__FieldsAssignment_5_04454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__Type__OtherCommAssignment_5_14485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INPUT_in_rule__Input__PrefixAssignment_14516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Input__FilePathAssignment_54547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Input__NodePathAssignment_6_34578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__Field__CommAssignment_04609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypeAlternatives_1_0_in_rule__Field__TypeAssignment_14640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rule__Field__FieldNameAssignment_24673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Field__NodePathAssignment_44704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__NativeType__TypeAssignment4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__ListType__TypeAssignment_24766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__HashType__TypeAssignment_24797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__HashType__ParamsAssignment_4_14828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__HashType__ParamsAssignment_4_2_14859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rule__Param__ParamNameAssignment4890 = new BitSet(new long[]{0x0000000000000002L});

}