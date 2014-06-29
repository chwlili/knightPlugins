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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_C_INPUT", "RULE_C_FILE", "RULE_C_NODE", "RULE_C_TYPE", "RULE_C_INT", "RULE_C_UINT", "RULE_C_BOOL", "RULE_C_NUMBER", "RULE_C_STRING", "RULE_C_LIST", "RULE_C_HASH", "RULE_NAME", "RULE_C_BRACE_L", "RULE_C_BRACE_R", "RULE_C_BRACKET_L", "RULE_C_PAREN_L", "RULE_C_EQUALS", "RULE_C_PAREN_R", "RULE_C_BRACKET_R", "RULE_C_COMMA", "RULE_C_SEMICOLON", "RULE_C_ANGLE_L", "RULE_C_ANGLE_R", "RULE_COMMENT", "RULE_STRING", "RULE_COMMENT_END", "RULE_WS"
    };
    public static final int RULE_C_NUMBER=11;
    public static final int RULE_C_COMMA=23;
    public static final int RULE_C_TYPE=7;
    public static final int RULE_C_PAREN_R=21;
    public static final int RULE_C_SEMICOLON=24;
    public static final int RULE_C_PAREN_L=19;
    public static final int RULE_C_NODE=6;
    public static final int RULE_C_INPUT=4;
    public static final int RULE_C_STRING=12;
    public static final int RULE_COMMENT=27;
    public static final int EOF=-1;
    public static final int RULE_C_HASH=14;
    public static final int RULE_C_ANGLE_L=25;
    public static final int RULE_C_ANGLE_R=26;
    public static final int RULE_COMMENT_END=29;
    public static final int RULE_C_BRACKET_L=18;
    public static final int RULE_STRING=28;
    public static final int RULE_C_EQUALS=20;
    public static final int RULE_C_UINT=9;
    public static final int RULE_C_BRACKET_R=22;
    public static final int RULE_C_INT=8;
    public static final int RULE_C_FILE=5;
    public static final int RULE_NAME=15;
    public static final int RULE_WS=30;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:69:1: ruleXML2 : ( ( rule__XML2__Alternatives )* ) ;
    public final void ruleXML2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:73:2: ( ( ( rule__XML2__Alternatives )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:74:1: ( ( rule__XML2__Alternatives )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:74:1: ( ( rule__XML2__Alternatives )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:75:1: ( rule__XML2__Alternatives )*
            {
             before(grammarAccess.getXML2Access().getAlternatives()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:76:1: ( rule__XML2__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_COMMENT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:76:2: rule__XML2__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__XML2__Alternatives_in_ruleXML294);
            	    rule__XML2__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getXML2Access().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleType"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:88:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:89:1: ( ruleType EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:90:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType122);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType129); 

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:97:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:101:2: ( ( ( rule__Type__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:102:1: ( ( rule__Type__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:102:1: ( ( rule__Type__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:103:1: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:104:1: ( rule__Type__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:104:2: rule__Type__Group__0
            {
            pushFollow(FOLLOW_rule__Type__Group__0_in_ruleType155);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:116:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:117:1: ( ruleInput EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:118:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput182);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput189); 

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:125:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:129:2: ( ( ( rule__Input__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:130:1: ( ( rule__Input__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:130:1: ( ( rule__Input__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:131:1: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:132:1: ( rule__Input__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:132:2: rule__Input__Group__0
            {
            pushFollow(FOLLOW_rule__Input__Group__0_in_ruleInput215);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:144:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:145:1: ( ruleField EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:146:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField242);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField249); 

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:153:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:157:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:158:1: ( ( rule__Field__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:158:1: ( ( rule__Field__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:159:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:160:1: ( rule__Field__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:160:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField275);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:172:1: entryRuleNativeType : ruleNativeType EOF ;
    public final void entryRuleNativeType() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:173:1: ( ruleNativeType EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:174:1: ruleNativeType EOF
            {
             before(grammarAccess.getNativeTypeRule()); 
            pushFollow(FOLLOW_ruleNativeType_in_entryRuleNativeType302);
            ruleNativeType();

            state._fsp--;

             after(grammarAccess.getNativeTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNativeType309); 

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:181:1: ruleNativeType : ( ( rule__NativeType__TypeAssignment ) ) ;
    public final void ruleNativeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:185:2: ( ( ( rule__NativeType__TypeAssignment ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:186:1: ( ( rule__NativeType__TypeAssignment ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:186:1: ( ( rule__NativeType__TypeAssignment ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:187:1: ( rule__NativeType__TypeAssignment )
            {
             before(grammarAccess.getNativeTypeAccess().getTypeAssignment()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:188:1: ( rule__NativeType__TypeAssignment )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:188:2: rule__NativeType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__NativeType__TypeAssignment_in_ruleNativeType335);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:200:1: entryRuleListType : ruleListType EOF ;
    public final void entryRuleListType() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:201:1: ( ruleListType EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:202:1: ruleListType EOF
            {
             before(grammarAccess.getListTypeRule()); 
            pushFollow(FOLLOW_ruleListType_in_entryRuleListType362);
            ruleListType();

            state._fsp--;

             after(grammarAccess.getListTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListType369); 

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:209:1: ruleListType : ( ( rule__ListType__Group__0 ) ) ;
    public final void ruleListType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:213:2: ( ( ( rule__ListType__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:214:1: ( ( rule__ListType__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:214:1: ( ( rule__ListType__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:215:1: ( rule__ListType__Group__0 )
            {
             before(grammarAccess.getListTypeAccess().getGroup()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:216:1: ( rule__ListType__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:216:2: rule__ListType__Group__0
            {
            pushFollow(FOLLOW_rule__ListType__Group__0_in_ruleListType395);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:228:1: entryRuleHashType : ruleHashType EOF ;
    public final void entryRuleHashType() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:229:1: ( ruleHashType EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:230:1: ruleHashType EOF
            {
             before(grammarAccess.getHashTypeRule()); 
            pushFollow(FOLLOW_ruleHashType_in_entryRuleHashType422);
            ruleHashType();

            state._fsp--;

             after(grammarAccess.getHashTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHashType429); 

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:237:1: ruleHashType : ( ( rule__HashType__Group__0 ) ) ;
    public final void ruleHashType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:241:2: ( ( ( rule__HashType__Group__0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:242:1: ( ( rule__HashType__Group__0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:242:1: ( ( rule__HashType__Group__0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:243:1: ( rule__HashType__Group__0 )
            {
             before(grammarAccess.getHashTypeAccess().getGroup()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:244:1: ( rule__HashType__Group__0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:244:2: rule__HashType__Group__0
            {
            pushFollow(FOLLOW_rule__HashType__Group__0_in_ruleHashType455);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:256:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:257:1: ( ruleParam EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:258:1: ruleParam EOF
            {
             before(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam482);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam489); 

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:265:1: ruleParam : ( ( rule__Param__ParamNameAssignment ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:269:2: ( ( ( rule__Param__ParamNameAssignment ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:270:1: ( ( rule__Param__ParamNameAssignment ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:270:1: ( ( rule__Param__ParamNameAssignment ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:271:1: ( rule__Param__ParamNameAssignment )
            {
             before(grammarAccess.getParamAccess().getParamNameAssignment()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:272:1: ( rule__Param__ParamNameAssignment )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:272:2: rule__Param__ParamNameAssignment
            {
            pushFollow(FOLLOW_rule__Param__ParamNameAssignment_in_ruleParam515);
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


    // $ANTLR start "entryRuleTypeName"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:284:1: entryRuleTypeName : ruleTypeName EOF ;
    public final void entryRuleTypeName() throws RecognitionException {
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:285:1: ( ruleTypeName EOF )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:286:1: ruleTypeName EOF
            {
             before(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_ruleTypeName_in_entryRuleTypeName542);
            ruleTypeName();

            state._fsp--;

             after(grammarAccess.getTypeNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeName549); 

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:293:1: ruleTypeName : ( ( rule__TypeName__Alternatives ) ) ;
    public final void ruleTypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:297:2: ( ( ( rule__TypeName__Alternatives ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:298:1: ( ( rule__TypeName__Alternatives ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:298:1: ( ( rule__TypeName__Alternatives ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:299:1: ( rule__TypeName__Alternatives )
            {
             before(grammarAccess.getTypeNameAccess().getAlternatives()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:300:1: ( rule__TypeName__Alternatives )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:300:2: rule__TypeName__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeName__Alternatives_in_ruleTypeName575);
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


    // $ANTLR start "rule__XML2__Alternatives"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:312:1: rule__XML2__Alternatives : ( ( ( rule__XML2__TypesAssignment_0 ) ) | ( ( rule__XML2__OtherCommAssignment_1 ) ) );
    public final void rule__XML2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:316:1: ( ( ( rule__XML2__TypesAssignment_0 ) ) | ( ( rule__XML2__OtherCommAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_COMMENT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||LA2_1==RULE_COMMENT) ) {
                    alt2=2;
                }
                else if ( (LA2_1==RULE_C_TYPE||LA2_1==RULE_C_BRACKET_L) ) {
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
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:317:1: ( ( rule__XML2__TypesAssignment_0 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:317:1: ( ( rule__XML2__TypesAssignment_0 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:318:1: ( rule__XML2__TypesAssignment_0 )
                    {
                     before(grammarAccess.getXML2Access().getTypesAssignment_0()); 
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:319:1: ( rule__XML2__TypesAssignment_0 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:319:2: rule__XML2__TypesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__XML2__TypesAssignment_0_in_rule__XML2__Alternatives611);
                    rule__XML2__TypesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXML2Access().getTypesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:323:6: ( ( rule__XML2__OtherCommAssignment_1 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:323:6: ( ( rule__XML2__OtherCommAssignment_1 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:324:1: ( rule__XML2__OtherCommAssignment_1 )
                    {
                     before(grammarAccess.getXML2Access().getOtherCommAssignment_1()); 
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:325:1: ( rule__XML2__OtherCommAssignment_1 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:325:2: rule__XML2__OtherCommAssignment_1
                    {
                    pushFollow(FOLLOW_rule__XML2__OtherCommAssignment_1_in_rule__XML2__Alternatives629);
                    rule__XML2__OtherCommAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getXML2Access().getOtherCommAssignment_1()); 

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
    // $ANTLR end "rule__XML2__Alternatives"


    // $ANTLR start "rule__Type__Alternatives_5"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:334:1: rule__Type__Alternatives_5 : ( ( ( rule__Type__FieldsAssignment_5_0 ) ) | ( ( rule__Type__OtherCommAssignment_5_1 ) ) );
    public final void rule__Type__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:338:1: ( ( ( rule__Type__FieldsAssignment_5_0 ) ) | ( ( rule__Type__OtherCommAssignment_5_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_COMMENT) ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>=RULE_C_INPUT && LA3_1<=RULE_NAME)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==RULE_C_BRACE_R||LA3_1==RULE_COMMENT) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:339:1: ( ( rule__Type__FieldsAssignment_5_0 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:339:1: ( ( rule__Type__FieldsAssignment_5_0 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:340:1: ( rule__Type__FieldsAssignment_5_0 )
                    {
                     before(grammarAccess.getTypeAccess().getFieldsAssignment_5_0()); 
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:341:1: ( rule__Type__FieldsAssignment_5_0 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:341:2: rule__Type__FieldsAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__Type__FieldsAssignment_5_0_in_rule__Type__Alternatives_5662);
                    rule__Type__FieldsAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getFieldsAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:345:6: ( ( rule__Type__OtherCommAssignment_5_1 ) )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:345:6: ( ( rule__Type__OtherCommAssignment_5_1 ) )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:346:1: ( rule__Type__OtherCommAssignment_5_1 )
                    {
                     before(grammarAccess.getTypeAccess().getOtherCommAssignment_5_1()); 
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:347:1: ( rule__Type__OtherCommAssignment_5_1 )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:347:2: rule__Type__OtherCommAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__Type__OtherCommAssignment_5_1_in_rule__Type__Alternatives_5680);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:356:1: rule__Field__TypeAlternatives_1_0 : ( ( ruleNativeType ) | ( ruleListType ) | ( ruleHashType ) );
    public final void rule__Field__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:360:1: ( ( ruleNativeType ) | ( ruleListType ) | ( ruleHashType ) )
            int alt4=3;
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
                alt4=1;
                }
                break;
            case RULE_C_LIST:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==RULE_NAME) ) {
                    alt4=1;
                }
                else if ( (LA4_2==RULE_C_ANGLE_L) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_C_HASH:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==RULE_NAME) ) {
                    alt4=1;
                }
                else if ( (LA4_3==RULE_C_ANGLE_L) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:361:1: ( ruleNativeType )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:361:1: ( ruleNativeType )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:362:1: ruleNativeType
                    {
                     before(grammarAccess.getFieldAccess().getTypeNativeTypeParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_ruleNativeType_in_rule__Field__TypeAlternatives_1_0713);
                    ruleNativeType();

                    state._fsp--;

                     after(grammarAccess.getFieldAccess().getTypeNativeTypeParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:367:6: ( ruleListType )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:367:6: ( ruleListType )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:368:1: ruleListType
                    {
                     before(grammarAccess.getFieldAccess().getTypeListTypeParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_ruleListType_in_rule__Field__TypeAlternatives_1_0730);
                    ruleListType();

                    state._fsp--;

                     after(grammarAccess.getFieldAccess().getTypeListTypeParserRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:373:6: ( ruleHashType )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:373:6: ( ruleHashType )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:374:1: ruleHashType
                    {
                     before(grammarAccess.getFieldAccess().getTypeHashTypeParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_ruleHashType_in_rule__Field__TypeAlternatives_1_0747);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:384:1: rule__TypeName__Alternatives : ( ( RULE_C_INPUT ) | ( RULE_C_FILE ) | ( RULE_C_NODE ) | ( RULE_C_TYPE ) | ( RULE_C_INT ) | ( RULE_C_UINT ) | ( RULE_C_BOOL ) | ( RULE_C_NUMBER ) | ( RULE_C_STRING ) | ( RULE_C_LIST ) | ( RULE_C_HASH ) | ( RULE_NAME ) );
    public final void rule__TypeName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:388:1: ( ( RULE_C_INPUT ) | ( RULE_C_FILE ) | ( RULE_C_NODE ) | ( RULE_C_TYPE ) | ( RULE_C_INT ) | ( RULE_C_UINT ) | ( RULE_C_BOOL ) | ( RULE_C_NUMBER ) | ( RULE_C_STRING ) | ( RULE_C_LIST ) | ( RULE_C_HASH ) | ( RULE_NAME ) )
            int alt5=12;
            switch ( input.LA(1) ) {
            case RULE_C_INPUT:
                {
                alt5=1;
                }
                break;
            case RULE_C_FILE:
                {
                alt5=2;
                }
                break;
            case RULE_C_NODE:
                {
                alt5=3;
                }
                break;
            case RULE_C_TYPE:
                {
                alt5=4;
                }
                break;
            case RULE_C_INT:
                {
                alt5=5;
                }
                break;
            case RULE_C_UINT:
                {
                alt5=6;
                }
                break;
            case RULE_C_BOOL:
                {
                alt5=7;
                }
                break;
            case RULE_C_NUMBER:
                {
                alt5=8;
                }
                break;
            case RULE_C_STRING:
                {
                alt5=9;
                }
                break;
            case RULE_C_LIST:
                {
                alt5=10;
                }
                break;
            case RULE_C_HASH:
                {
                alt5=11;
                }
                break;
            case RULE_NAME:
                {
                alt5=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:389:1: ( RULE_C_INPUT )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:389:1: ( RULE_C_INPUT )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:390:1: RULE_C_INPUT
                    {
                     before(grammarAccess.getTypeNameAccess().getC_INPUTTerminalRuleCall_0()); 
                    match(input,RULE_C_INPUT,FOLLOW_RULE_C_INPUT_in_rule__TypeName__Alternatives779); 
                     after(grammarAccess.getTypeNameAccess().getC_INPUTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:395:6: ( RULE_C_FILE )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:395:6: ( RULE_C_FILE )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:396:1: RULE_C_FILE
                    {
                     before(grammarAccess.getTypeNameAccess().getC_FILETerminalRuleCall_1()); 
                    match(input,RULE_C_FILE,FOLLOW_RULE_C_FILE_in_rule__TypeName__Alternatives796); 
                     after(grammarAccess.getTypeNameAccess().getC_FILETerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:401:6: ( RULE_C_NODE )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:401:6: ( RULE_C_NODE )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:402:1: RULE_C_NODE
                    {
                     before(grammarAccess.getTypeNameAccess().getC_NODETerminalRuleCall_2()); 
                    match(input,RULE_C_NODE,FOLLOW_RULE_C_NODE_in_rule__TypeName__Alternatives813); 
                     after(grammarAccess.getTypeNameAccess().getC_NODETerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:407:6: ( RULE_C_TYPE )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:407:6: ( RULE_C_TYPE )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:408:1: RULE_C_TYPE
                    {
                     before(grammarAccess.getTypeNameAccess().getC_TYPETerminalRuleCall_3()); 
                    match(input,RULE_C_TYPE,FOLLOW_RULE_C_TYPE_in_rule__TypeName__Alternatives830); 
                     after(grammarAccess.getTypeNameAccess().getC_TYPETerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:413:6: ( RULE_C_INT )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:413:6: ( RULE_C_INT )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:414:1: RULE_C_INT
                    {
                     before(grammarAccess.getTypeNameAccess().getC_INTTerminalRuleCall_4()); 
                    match(input,RULE_C_INT,FOLLOW_RULE_C_INT_in_rule__TypeName__Alternatives847); 
                     after(grammarAccess.getTypeNameAccess().getC_INTTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:419:6: ( RULE_C_UINT )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:419:6: ( RULE_C_UINT )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:420:1: RULE_C_UINT
                    {
                     before(grammarAccess.getTypeNameAccess().getC_UINTTerminalRuleCall_5()); 
                    match(input,RULE_C_UINT,FOLLOW_RULE_C_UINT_in_rule__TypeName__Alternatives864); 
                     after(grammarAccess.getTypeNameAccess().getC_UINTTerminalRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:425:6: ( RULE_C_BOOL )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:425:6: ( RULE_C_BOOL )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:426:1: RULE_C_BOOL
                    {
                     before(grammarAccess.getTypeNameAccess().getC_BOOLTerminalRuleCall_6()); 
                    match(input,RULE_C_BOOL,FOLLOW_RULE_C_BOOL_in_rule__TypeName__Alternatives881); 
                     after(grammarAccess.getTypeNameAccess().getC_BOOLTerminalRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:431:6: ( RULE_C_NUMBER )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:431:6: ( RULE_C_NUMBER )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:432:1: RULE_C_NUMBER
                    {
                     before(grammarAccess.getTypeNameAccess().getC_NUMBERTerminalRuleCall_7()); 
                    match(input,RULE_C_NUMBER,FOLLOW_RULE_C_NUMBER_in_rule__TypeName__Alternatives898); 
                     after(grammarAccess.getTypeNameAccess().getC_NUMBERTerminalRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:437:6: ( RULE_C_STRING )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:437:6: ( RULE_C_STRING )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:438:1: RULE_C_STRING
                    {
                     before(grammarAccess.getTypeNameAccess().getC_STRINGTerminalRuleCall_8()); 
                    match(input,RULE_C_STRING,FOLLOW_RULE_C_STRING_in_rule__TypeName__Alternatives915); 
                     after(grammarAccess.getTypeNameAccess().getC_STRINGTerminalRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:443:6: ( RULE_C_LIST )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:443:6: ( RULE_C_LIST )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:444:1: RULE_C_LIST
                    {
                     before(grammarAccess.getTypeNameAccess().getC_LISTTerminalRuleCall_9()); 
                    match(input,RULE_C_LIST,FOLLOW_RULE_C_LIST_in_rule__TypeName__Alternatives932); 
                     after(grammarAccess.getTypeNameAccess().getC_LISTTerminalRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:449:6: ( RULE_C_HASH )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:449:6: ( RULE_C_HASH )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:450:1: RULE_C_HASH
                    {
                     before(grammarAccess.getTypeNameAccess().getC_HASHTerminalRuleCall_10()); 
                    match(input,RULE_C_HASH,FOLLOW_RULE_C_HASH_in_rule__TypeName__Alternatives949); 
                     after(grammarAccess.getTypeNameAccess().getC_HASHTerminalRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:455:6: ( RULE_NAME )
                    {
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:455:6: ( RULE_NAME )
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:456:1: RULE_NAME
                    {
                     before(grammarAccess.getTypeNameAccess().getNAMETerminalRuleCall_11()); 
                    match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rule__TypeName__Alternatives966); 
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


    // $ANTLR start "rule__Type__Group__0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:468:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:472:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:473:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__0996);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__1_in_rule__Type__Group__0999);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:480:1: rule__Type__Group__0__Impl : ( ( rule__Type__CommAssignment_0 ) ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:484:1: ( ( ( rule__Type__CommAssignment_0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:485:1: ( ( rule__Type__CommAssignment_0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:485:1: ( ( rule__Type__CommAssignment_0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:486:1: ( rule__Type__CommAssignment_0 )
            {
             before(grammarAccess.getTypeAccess().getCommAssignment_0()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:487:1: ( rule__Type__CommAssignment_0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:487:2: rule__Type__CommAssignment_0
            {
            pushFollow(FOLLOW_rule__Type__CommAssignment_0_in_rule__Type__Group__0__Impl1026);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:497:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:501:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:502:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__11056);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__2_in_rule__Type__Group__11059);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:509:1: rule__Type__Group__1__Impl : ( ( rule__Type__InputAssignment_1 )? ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:513:1: ( ( ( rule__Type__InputAssignment_1 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:514:1: ( ( rule__Type__InputAssignment_1 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:514:1: ( ( rule__Type__InputAssignment_1 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:515:1: ( rule__Type__InputAssignment_1 )?
            {
             before(grammarAccess.getTypeAccess().getInputAssignment_1()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:516:1: ( rule__Type__InputAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_C_BRACKET_L) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:516:2: rule__Type__InputAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Type__InputAssignment_1_in_rule__Type__Group__1__Impl1086);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:526:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:530:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:531:2: rule__Type__Group__2__Impl rule__Type__Group__3
            {
            pushFollow(FOLLOW_rule__Type__Group__2__Impl_in_rule__Type__Group__21117);
            rule__Type__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__3_in_rule__Type__Group__21120);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:538:1: rule__Type__Group__2__Impl : ( ( rule__Type__PrefixAssignment_2 ) ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:542:1: ( ( ( rule__Type__PrefixAssignment_2 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:543:1: ( ( rule__Type__PrefixAssignment_2 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:543:1: ( ( rule__Type__PrefixAssignment_2 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:544:1: ( rule__Type__PrefixAssignment_2 )
            {
             before(grammarAccess.getTypeAccess().getPrefixAssignment_2()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:545:1: ( rule__Type__PrefixAssignment_2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:545:2: rule__Type__PrefixAssignment_2
            {
            pushFollow(FOLLOW_rule__Type__PrefixAssignment_2_in_rule__Type__Group__2__Impl1147);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:555:1: rule__Type__Group__3 : rule__Type__Group__3__Impl rule__Type__Group__4 ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:559:1: ( rule__Type__Group__3__Impl rule__Type__Group__4 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:560:2: rule__Type__Group__3__Impl rule__Type__Group__4
            {
            pushFollow(FOLLOW_rule__Type__Group__3__Impl_in_rule__Type__Group__31177);
            rule__Type__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__4_in_rule__Type__Group__31180);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:567:1: rule__Type__Group__3__Impl : ( ( rule__Type__NameAssignment_3 ) ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:571:1: ( ( ( rule__Type__NameAssignment_3 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:572:1: ( ( rule__Type__NameAssignment_3 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:572:1: ( ( rule__Type__NameAssignment_3 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:573:1: ( rule__Type__NameAssignment_3 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_3()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:574:1: ( rule__Type__NameAssignment_3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:574:2: rule__Type__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Type__NameAssignment_3_in_rule__Type__Group__3__Impl1207);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:584:1: rule__Type__Group__4 : rule__Type__Group__4__Impl rule__Type__Group__5 ;
    public final void rule__Type__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:588:1: ( rule__Type__Group__4__Impl rule__Type__Group__5 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:589:2: rule__Type__Group__4__Impl rule__Type__Group__5
            {
            pushFollow(FOLLOW_rule__Type__Group__4__Impl_in_rule__Type__Group__41237);
            rule__Type__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__5_in_rule__Type__Group__41240);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:596:1: rule__Type__Group__4__Impl : ( RULE_C_BRACE_L ) ;
    public final void rule__Type__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:600:1: ( ( RULE_C_BRACE_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:601:1: ( RULE_C_BRACE_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:601:1: ( RULE_C_BRACE_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:602:1: RULE_C_BRACE_L
            {
             before(grammarAccess.getTypeAccess().getC_BRACE_LTerminalRuleCall_4()); 
            match(input,RULE_C_BRACE_L,FOLLOW_RULE_C_BRACE_L_in_rule__Type__Group__4__Impl1267); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:613:1: rule__Type__Group__5 : rule__Type__Group__5__Impl rule__Type__Group__6 ;
    public final void rule__Type__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:617:1: ( rule__Type__Group__5__Impl rule__Type__Group__6 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:618:2: rule__Type__Group__5__Impl rule__Type__Group__6
            {
            pushFollow(FOLLOW_rule__Type__Group__5__Impl_in_rule__Type__Group__51296);
            rule__Type__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group__6_in_rule__Type__Group__51299);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:625:1: rule__Type__Group__5__Impl : ( ( rule__Type__Alternatives_5 )* ) ;
    public final void rule__Type__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:629:1: ( ( ( rule__Type__Alternatives_5 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:630:1: ( ( rule__Type__Alternatives_5 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:630:1: ( ( rule__Type__Alternatives_5 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:631:1: ( rule__Type__Alternatives_5 )*
            {
             before(grammarAccess.getTypeAccess().getAlternatives_5()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:632:1: ( rule__Type__Alternatives_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_COMMENT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:632:2: rule__Type__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_rule__Type__Alternatives_5_in_rule__Type__Group__5__Impl1326);
            	    rule__Type__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:642:1: rule__Type__Group__6 : rule__Type__Group__6__Impl ;
    public final void rule__Type__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:646:1: ( rule__Type__Group__6__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:647:2: rule__Type__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group__6__Impl_in_rule__Type__Group__61357);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:653:1: rule__Type__Group__6__Impl : ( RULE_C_BRACE_R ) ;
    public final void rule__Type__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:657:1: ( ( RULE_C_BRACE_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:658:1: ( RULE_C_BRACE_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:658:1: ( RULE_C_BRACE_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:659:1: RULE_C_BRACE_R
            {
             before(grammarAccess.getTypeAccess().getC_BRACE_RTerminalRuleCall_6()); 
            match(input,RULE_C_BRACE_R,FOLLOW_RULE_C_BRACE_R_in_rule__Type__Group__6__Impl1384); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:684:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:688:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:689:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__01427);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__1_in_rule__Input__Group__01430);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:696:1: rule__Input__Group__0__Impl : ( RULE_C_BRACKET_L ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:700:1: ( ( RULE_C_BRACKET_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:701:1: ( RULE_C_BRACKET_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:701:1: ( RULE_C_BRACKET_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:702:1: RULE_C_BRACKET_L
            {
             before(grammarAccess.getInputAccess().getC_BRACKET_LTerminalRuleCall_0()); 
            match(input,RULE_C_BRACKET_L,FOLLOW_RULE_C_BRACKET_L_in_rule__Input__Group__0__Impl1457); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:713:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:717:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:718:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__11486);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__2_in_rule__Input__Group__11489);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:725:1: rule__Input__Group__1__Impl : ( ( rule__Input__PrefixAssignment_1 ) ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:729:1: ( ( ( rule__Input__PrefixAssignment_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:730:1: ( ( rule__Input__PrefixAssignment_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:730:1: ( ( rule__Input__PrefixAssignment_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:731:1: ( rule__Input__PrefixAssignment_1 )
            {
             before(grammarAccess.getInputAccess().getPrefixAssignment_1()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:732:1: ( rule__Input__PrefixAssignment_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:732:2: rule__Input__PrefixAssignment_1
            {
            pushFollow(FOLLOW_rule__Input__PrefixAssignment_1_in_rule__Input__Group__1__Impl1516);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:742:1: rule__Input__Group__2 : rule__Input__Group__2__Impl rule__Input__Group__3 ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:746:1: ( rule__Input__Group__2__Impl rule__Input__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:747:2: rule__Input__Group__2__Impl rule__Input__Group__3
            {
            pushFollow(FOLLOW_rule__Input__Group__2__Impl_in_rule__Input__Group__21546);
            rule__Input__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__3_in_rule__Input__Group__21549);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:754:1: rule__Input__Group__2__Impl : ( RULE_C_PAREN_L ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:758:1: ( ( RULE_C_PAREN_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:759:1: ( RULE_C_PAREN_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:759:1: ( RULE_C_PAREN_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:760:1: RULE_C_PAREN_L
            {
             before(grammarAccess.getInputAccess().getC_PAREN_LTerminalRuleCall_2()); 
            match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_rule__Input__Group__2__Impl1576); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:771:1: rule__Input__Group__3 : rule__Input__Group__3__Impl rule__Input__Group__4 ;
    public final void rule__Input__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:775:1: ( rule__Input__Group__3__Impl rule__Input__Group__4 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:776:2: rule__Input__Group__3__Impl rule__Input__Group__4
            {
            pushFollow(FOLLOW_rule__Input__Group__3__Impl_in_rule__Input__Group__31605);
            rule__Input__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__4_in_rule__Input__Group__31608);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:783:1: rule__Input__Group__3__Impl : ( RULE_C_FILE ) ;
    public final void rule__Input__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:787:1: ( ( RULE_C_FILE ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:788:1: ( RULE_C_FILE )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:788:1: ( RULE_C_FILE )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:789:1: RULE_C_FILE
            {
             before(grammarAccess.getInputAccess().getC_FILETerminalRuleCall_3()); 
            match(input,RULE_C_FILE,FOLLOW_RULE_C_FILE_in_rule__Input__Group__3__Impl1635); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:800:1: rule__Input__Group__4 : rule__Input__Group__4__Impl rule__Input__Group__5 ;
    public final void rule__Input__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:804:1: ( rule__Input__Group__4__Impl rule__Input__Group__5 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:805:2: rule__Input__Group__4__Impl rule__Input__Group__5
            {
            pushFollow(FOLLOW_rule__Input__Group__4__Impl_in_rule__Input__Group__41664);
            rule__Input__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__5_in_rule__Input__Group__41667);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:812:1: rule__Input__Group__4__Impl : ( RULE_C_EQUALS ) ;
    public final void rule__Input__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:816:1: ( ( RULE_C_EQUALS ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:817:1: ( RULE_C_EQUALS )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:817:1: ( RULE_C_EQUALS )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:818:1: RULE_C_EQUALS
            {
             before(grammarAccess.getInputAccess().getC_EQUALSTerminalRuleCall_4()); 
            match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_rule__Input__Group__4__Impl1694); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:829:1: rule__Input__Group__5 : rule__Input__Group__5__Impl rule__Input__Group__6 ;
    public final void rule__Input__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:833:1: ( rule__Input__Group__5__Impl rule__Input__Group__6 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:834:2: rule__Input__Group__5__Impl rule__Input__Group__6
            {
            pushFollow(FOLLOW_rule__Input__Group__5__Impl_in_rule__Input__Group__51723);
            rule__Input__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__6_in_rule__Input__Group__51726);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:841:1: rule__Input__Group__5__Impl : ( ( rule__Input__FilePathAssignment_5 ) ) ;
    public final void rule__Input__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:845:1: ( ( ( rule__Input__FilePathAssignment_5 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:846:1: ( ( rule__Input__FilePathAssignment_5 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:846:1: ( ( rule__Input__FilePathAssignment_5 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:847:1: ( rule__Input__FilePathAssignment_5 )
            {
             before(grammarAccess.getInputAccess().getFilePathAssignment_5()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:848:1: ( rule__Input__FilePathAssignment_5 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:848:2: rule__Input__FilePathAssignment_5
            {
            pushFollow(FOLLOW_rule__Input__FilePathAssignment_5_in_rule__Input__Group__5__Impl1753);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:858:1: rule__Input__Group__6 : rule__Input__Group__6__Impl rule__Input__Group__7 ;
    public final void rule__Input__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:862:1: ( rule__Input__Group__6__Impl rule__Input__Group__7 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:863:2: rule__Input__Group__6__Impl rule__Input__Group__7
            {
            pushFollow(FOLLOW_rule__Input__Group__6__Impl_in_rule__Input__Group__61783);
            rule__Input__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__7_in_rule__Input__Group__61786);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:870:1: rule__Input__Group__6__Impl : ( ( rule__Input__Group_6__0 )? ) ;
    public final void rule__Input__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:874:1: ( ( ( rule__Input__Group_6__0 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:875:1: ( ( rule__Input__Group_6__0 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:875:1: ( ( rule__Input__Group_6__0 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:876:1: ( rule__Input__Group_6__0 )?
            {
             before(grammarAccess.getInputAccess().getGroup_6()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:877:1: ( rule__Input__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_C_COMMA) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:877:2: rule__Input__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Input__Group_6__0_in_rule__Input__Group__6__Impl1813);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:887:1: rule__Input__Group__7 : rule__Input__Group__7__Impl rule__Input__Group__8 ;
    public final void rule__Input__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:891:1: ( rule__Input__Group__7__Impl rule__Input__Group__8 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:892:2: rule__Input__Group__7__Impl rule__Input__Group__8
            {
            pushFollow(FOLLOW_rule__Input__Group__7__Impl_in_rule__Input__Group__71844);
            rule__Input__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group__8_in_rule__Input__Group__71847);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:899:1: rule__Input__Group__7__Impl : ( RULE_C_PAREN_R ) ;
    public final void rule__Input__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:903:1: ( ( RULE_C_PAREN_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:904:1: ( RULE_C_PAREN_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:904:1: ( RULE_C_PAREN_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:905:1: RULE_C_PAREN_R
            {
             before(grammarAccess.getInputAccess().getC_PAREN_RTerminalRuleCall_7()); 
            match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_rule__Input__Group__7__Impl1874); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:916:1: rule__Input__Group__8 : rule__Input__Group__8__Impl ;
    public final void rule__Input__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:920:1: ( rule__Input__Group__8__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:921:2: rule__Input__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group__8__Impl_in_rule__Input__Group__81903);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:927:1: rule__Input__Group__8__Impl : ( RULE_C_BRACKET_R ) ;
    public final void rule__Input__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:931:1: ( ( RULE_C_BRACKET_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:932:1: ( RULE_C_BRACKET_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:932:1: ( RULE_C_BRACKET_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:933:1: RULE_C_BRACKET_R
            {
             before(grammarAccess.getInputAccess().getC_BRACKET_RTerminalRuleCall_8()); 
            match(input,RULE_C_BRACKET_R,FOLLOW_RULE_C_BRACKET_R_in_rule__Input__Group__8__Impl1930); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:962:1: rule__Input__Group_6__0 : rule__Input__Group_6__0__Impl rule__Input__Group_6__1 ;
    public final void rule__Input__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:966:1: ( rule__Input__Group_6__0__Impl rule__Input__Group_6__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:967:2: rule__Input__Group_6__0__Impl rule__Input__Group_6__1
            {
            pushFollow(FOLLOW_rule__Input__Group_6__0__Impl_in_rule__Input__Group_6__01977);
            rule__Input__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_6__1_in_rule__Input__Group_6__01980);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:974:1: rule__Input__Group_6__0__Impl : ( RULE_C_COMMA ) ;
    public final void rule__Input__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:978:1: ( ( RULE_C_COMMA ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:979:1: ( RULE_C_COMMA )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:979:1: ( RULE_C_COMMA )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:980:1: RULE_C_COMMA
            {
             before(grammarAccess.getInputAccess().getC_COMMATerminalRuleCall_6_0()); 
            match(input,RULE_C_COMMA,FOLLOW_RULE_C_COMMA_in_rule__Input__Group_6__0__Impl2007); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:991:1: rule__Input__Group_6__1 : rule__Input__Group_6__1__Impl rule__Input__Group_6__2 ;
    public final void rule__Input__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:995:1: ( rule__Input__Group_6__1__Impl rule__Input__Group_6__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:996:2: rule__Input__Group_6__1__Impl rule__Input__Group_6__2
            {
            pushFollow(FOLLOW_rule__Input__Group_6__1__Impl_in_rule__Input__Group_6__12036);
            rule__Input__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_6__2_in_rule__Input__Group_6__12039);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1003:1: rule__Input__Group_6__1__Impl : ( RULE_C_NODE ) ;
    public final void rule__Input__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1007:1: ( ( RULE_C_NODE ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1008:1: ( RULE_C_NODE )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1008:1: ( RULE_C_NODE )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1009:1: RULE_C_NODE
            {
             before(grammarAccess.getInputAccess().getC_NODETerminalRuleCall_6_1()); 
            match(input,RULE_C_NODE,FOLLOW_RULE_C_NODE_in_rule__Input__Group_6__1__Impl2066); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1020:1: rule__Input__Group_6__2 : rule__Input__Group_6__2__Impl rule__Input__Group_6__3 ;
    public final void rule__Input__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1024:1: ( rule__Input__Group_6__2__Impl rule__Input__Group_6__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1025:2: rule__Input__Group_6__2__Impl rule__Input__Group_6__3
            {
            pushFollow(FOLLOW_rule__Input__Group_6__2__Impl_in_rule__Input__Group_6__22095);
            rule__Input__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Input__Group_6__3_in_rule__Input__Group_6__22098);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1032:1: rule__Input__Group_6__2__Impl : ( RULE_C_EQUALS ) ;
    public final void rule__Input__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1036:1: ( ( RULE_C_EQUALS ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1037:1: ( RULE_C_EQUALS )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1037:1: ( RULE_C_EQUALS )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1038:1: RULE_C_EQUALS
            {
             before(grammarAccess.getInputAccess().getC_EQUALSTerminalRuleCall_6_2()); 
            match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_rule__Input__Group_6__2__Impl2125); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1049:1: rule__Input__Group_6__3 : rule__Input__Group_6__3__Impl ;
    public final void rule__Input__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1053:1: ( rule__Input__Group_6__3__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1054:2: rule__Input__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_6__3__Impl_in_rule__Input__Group_6__32154);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1060:1: rule__Input__Group_6__3__Impl : ( ( rule__Input__NodePathAssignment_6_3 ) ) ;
    public final void rule__Input__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1064:1: ( ( ( rule__Input__NodePathAssignment_6_3 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1065:1: ( ( rule__Input__NodePathAssignment_6_3 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1065:1: ( ( rule__Input__NodePathAssignment_6_3 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1066:1: ( rule__Input__NodePathAssignment_6_3 )
            {
             before(grammarAccess.getInputAccess().getNodePathAssignment_6_3()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1067:1: ( rule__Input__NodePathAssignment_6_3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1067:2: rule__Input__NodePathAssignment_6_3
            {
            pushFollow(FOLLOW_rule__Input__NodePathAssignment_6_3_in_rule__Input__Group_6__3__Impl2181);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1085:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1089:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1090:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__02219);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__02222);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1097:1: rule__Field__Group__0__Impl : ( ( rule__Field__CommAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1101:1: ( ( ( rule__Field__CommAssignment_0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1102:1: ( ( rule__Field__CommAssignment_0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1102:1: ( ( rule__Field__CommAssignment_0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1103:1: ( rule__Field__CommAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getCommAssignment_0()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1104:1: ( rule__Field__CommAssignment_0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1104:2: rule__Field__CommAssignment_0
            {
            pushFollow(FOLLOW_rule__Field__CommAssignment_0_in_rule__Field__Group__0__Impl2249);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1114:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1118:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1119:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__12279);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__12282);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1126:1: rule__Field__Group__1__Impl : ( ( rule__Field__TypeAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1130:1: ( ( ( rule__Field__TypeAssignment_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1131:1: ( ( rule__Field__TypeAssignment_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1131:1: ( ( rule__Field__TypeAssignment_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1132:1: ( rule__Field__TypeAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_1()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1133:1: ( rule__Field__TypeAssignment_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1133:2: rule__Field__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__TypeAssignment_1_in_rule__Field__Group__1__Impl2309);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1143:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1147:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1148:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__22339);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__22342);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1155:1: rule__Field__Group__2__Impl : ( ( rule__Field__FieldNameAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1159:1: ( ( ( rule__Field__FieldNameAssignment_2 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1160:1: ( ( rule__Field__FieldNameAssignment_2 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1160:1: ( ( rule__Field__FieldNameAssignment_2 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1161:1: ( rule__Field__FieldNameAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getFieldNameAssignment_2()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1162:1: ( rule__Field__FieldNameAssignment_2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1162:2: rule__Field__FieldNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Field__FieldNameAssignment_2_in_rule__Field__Group__2__Impl2369);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1172:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1176:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1177:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__32399);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__4_in_rule__Field__Group__32402);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1184:1: rule__Field__Group__3__Impl : ( RULE_C_EQUALS ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1188:1: ( ( RULE_C_EQUALS ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1189:1: ( RULE_C_EQUALS )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1189:1: ( RULE_C_EQUALS )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1190:1: RULE_C_EQUALS
            {
             before(grammarAccess.getFieldAccess().getC_EQUALSTerminalRuleCall_3()); 
            match(input,RULE_C_EQUALS,FOLLOW_RULE_C_EQUALS_in_rule__Field__Group__3__Impl2429); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1201:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1205:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1206:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__42458);
            rule__Field__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__5_in_rule__Field__Group__42461);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1213:1: rule__Field__Group__4__Impl : ( ( rule__Field__NodePathAssignment_4 ) ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1217:1: ( ( ( rule__Field__NodePathAssignment_4 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1218:1: ( ( rule__Field__NodePathAssignment_4 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1218:1: ( ( rule__Field__NodePathAssignment_4 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1219:1: ( rule__Field__NodePathAssignment_4 )
            {
             before(grammarAccess.getFieldAccess().getNodePathAssignment_4()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1220:1: ( rule__Field__NodePathAssignment_4 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1220:2: rule__Field__NodePathAssignment_4
            {
            pushFollow(FOLLOW_rule__Field__NodePathAssignment_4_in_rule__Field__Group__4__Impl2488);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1230:1: rule__Field__Group__5 : rule__Field__Group__5__Impl ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1234:1: ( rule__Field__Group__5__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1235:2: rule__Field__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__52518);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1241:1: rule__Field__Group__5__Impl : ( ( RULE_C_SEMICOLON )? ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1245:1: ( ( ( RULE_C_SEMICOLON )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1246:1: ( ( RULE_C_SEMICOLON )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1246:1: ( ( RULE_C_SEMICOLON )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1247:1: ( RULE_C_SEMICOLON )?
            {
             before(grammarAccess.getFieldAccess().getC_SEMICOLONTerminalRuleCall_5()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1248:1: ( RULE_C_SEMICOLON )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_C_SEMICOLON) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1248:3: RULE_C_SEMICOLON
                    {
                    match(input,RULE_C_SEMICOLON,FOLLOW_RULE_C_SEMICOLON_in_rule__Field__Group__5__Impl2546); 

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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1270:1: rule__ListType__Group__0 : rule__ListType__Group__0__Impl rule__ListType__Group__1 ;
    public final void rule__ListType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1274:1: ( rule__ListType__Group__0__Impl rule__ListType__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1275:2: rule__ListType__Group__0__Impl rule__ListType__Group__1
            {
            pushFollow(FOLLOW_rule__ListType__Group__0__Impl_in_rule__ListType__Group__02589);
            rule__ListType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListType__Group__1_in_rule__ListType__Group__02592);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1282:1: rule__ListType__Group__0__Impl : ( RULE_C_LIST ) ;
    public final void rule__ListType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1286:1: ( ( RULE_C_LIST ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1287:1: ( RULE_C_LIST )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1287:1: ( RULE_C_LIST )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1288:1: RULE_C_LIST
            {
             before(grammarAccess.getListTypeAccess().getC_LISTTerminalRuleCall_0()); 
            match(input,RULE_C_LIST,FOLLOW_RULE_C_LIST_in_rule__ListType__Group__0__Impl2619); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1299:1: rule__ListType__Group__1 : rule__ListType__Group__1__Impl rule__ListType__Group__2 ;
    public final void rule__ListType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1303:1: ( rule__ListType__Group__1__Impl rule__ListType__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1304:2: rule__ListType__Group__1__Impl rule__ListType__Group__2
            {
            pushFollow(FOLLOW_rule__ListType__Group__1__Impl_in_rule__ListType__Group__12648);
            rule__ListType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListType__Group__2_in_rule__ListType__Group__12651);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1311:1: rule__ListType__Group__1__Impl : ( RULE_C_ANGLE_L ) ;
    public final void rule__ListType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1315:1: ( ( RULE_C_ANGLE_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1316:1: ( RULE_C_ANGLE_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1316:1: ( RULE_C_ANGLE_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1317:1: RULE_C_ANGLE_L
            {
             before(grammarAccess.getListTypeAccess().getC_ANGLE_LTerminalRuleCall_1()); 
            match(input,RULE_C_ANGLE_L,FOLLOW_RULE_C_ANGLE_L_in_rule__ListType__Group__1__Impl2678); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1328:1: rule__ListType__Group__2 : rule__ListType__Group__2__Impl rule__ListType__Group__3 ;
    public final void rule__ListType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1332:1: ( rule__ListType__Group__2__Impl rule__ListType__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1333:2: rule__ListType__Group__2__Impl rule__ListType__Group__3
            {
            pushFollow(FOLLOW_rule__ListType__Group__2__Impl_in_rule__ListType__Group__22707);
            rule__ListType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListType__Group__3_in_rule__ListType__Group__22710);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1340:1: rule__ListType__Group__2__Impl : ( ( rule__ListType__TypeAssignment_2 ) ) ;
    public final void rule__ListType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1344:1: ( ( ( rule__ListType__TypeAssignment_2 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1345:1: ( ( rule__ListType__TypeAssignment_2 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1345:1: ( ( rule__ListType__TypeAssignment_2 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1346:1: ( rule__ListType__TypeAssignment_2 )
            {
             before(grammarAccess.getListTypeAccess().getTypeAssignment_2()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1347:1: ( rule__ListType__TypeAssignment_2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1347:2: rule__ListType__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__ListType__TypeAssignment_2_in_rule__ListType__Group__2__Impl2737);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1357:1: rule__ListType__Group__3 : rule__ListType__Group__3__Impl ;
    public final void rule__ListType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1361:1: ( rule__ListType__Group__3__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1362:2: rule__ListType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ListType__Group__3__Impl_in_rule__ListType__Group__32767);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1368:1: rule__ListType__Group__3__Impl : ( RULE_C_ANGLE_R ) ;
    public final void rule__ListType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1372:1: ( ( RULE_C_ANGLE_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1373:1: ( RULE_C_ANGLE_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1373:1: ( RULE_C_ANGLE_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1374:1: RULE_C_ANGLE_R
            {
             before(grammarAccess.getListTypeAccess().getC_ANGLE_RTerminalRuleCall_3()); 
            match(input,RULE_C_ANGLE_R,FOLLOW_RULE_C_ANGLE_R_in_rule__ListType__Group__3__Impl2794); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1393:1: rule__HashType__Group__0 : rule__HashType__Group__0__Impl rule__HashType__Group__1 ;
    public final void rule__HashType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1397:1: ( rule__HashType__Group__0__Impl rule__HashType__Group__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1398:2: rule__HashType__Group__0__Impl rule__HashType__Group__1
            {
            pushFollow(FOLLOW_rule__HashType__Group__0__Impl_in_rule__HashType__Group__02831);
            rule__HashType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashType__Group__1_in_rule__HashType__Group__02834);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1405:1: rule__HashType__Group__0__Impl : ( RULE_C_HASH ) ;
    public final void rule__HashType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1409:1: ( ( RULE_C_HASH ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1410:1: ( RULE_C_HASH )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1410:1: ( RULE_C_HASH )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1411:1: RULE_C_HASH
            {
             before(grammarAccess.getHashTypeAccess().getC_HASHTerminalRuleCall_0()); 
            match(input,RULE_C_HASH,FOLLOW_RULE_C_HASH_in_rule__HashType__Group__0__Impl2861); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1422:1: rule__HashType__Group__1 : rule__HashType__Group__1__Impl rule__HashType__Group__2 ;
    public final void rule__HashType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1426:1: ( rule__HashType__Group__1__Impl rule__HashType__Group__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1427:2: rule__HashType__Group__1__Impl rule__HashType__Group__2
            {
            pushFollow(FOLLOW_rule__HashType__Group__1__Impl_in_rule__HashType__Group__12890);
            rule__HashType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashType__Group__2_in_rule__HashType__Group__12893);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1434:1: rule__HashType__Group__1__Impl : ( RULE_C_ANGLE_L ) ;
    public final void rule__HashType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1438:1: ( ( RULE_C_ANGLE_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1439:1: ( RULE_C_ANGLE_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1439:1: ( RULE_C_ANGLE_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1440:1: RULE_C_ANGLE_L
            {
             before(grammarAccess.getHashTypeAccess().getC_ANGLE_LTerminalRuleCall_1()); 
            match(input,RULE_C_ANGLE_L,FOLLOW_RULE_C_ANGLE_L_in_rule__HashType__Group__1__Impl2920); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1451:1: rule__HashType__Group__2 : rule__HashType__Group__2__Impl rule__HashType__Group__3 ;
    public final void rule__HashType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1455:1: ( rule__HashType__Group__2__Impl rule__HashType__Group__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1456:2: rule__HashType__Group__2__Impl rule__HashType__Group__3
            {
            pushFollow(FOLLOW_rule__HashType__Group__2__Impl_in_rule__HashType__Group__22949);
            rule__HashType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashType__Group__3_in_rule__HashType__Group__22952);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1463:1: rule__HashType__Group__2__Impl : ( ( rule__HashType__TypeAssignment_2 ) ) ;
    public final void rule__HashType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1467:1: ( ( ( rule__HashType__TypeAssignment_2 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1468:1: ( ( rule__HashType__TypeAssignment_2 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1468:1: ( ( rule__HashType__TypeAssignment_2 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1469:1: ( rule__HashType__TypeAssignment_2 )
            {
             before(grammarAccess.getHashTypeAccess().getTypeAssignment_2()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1470:1: ( rule__HashType__TypeAssignment_2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1470:2: rule__HashType__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__HashType__TypeAssignment_2_in_rule__HashType__Group__2__Impl2979);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1480:1: rule__HashType__Group__3 : rule__HashType__Group__3__Impl rule__HashType__Group__4 ;
    public final void rule__HashType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1484:1: ( rule__HashType__Group__3__Impl rule__HashType__Group__4 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1485:2: rule__HashType__Group__3__Impl rule__HashType__Group__4
            {
            pushFollow(FOLLOW_rule__HashType__Group__3__Impl_in_rule__HashType__Group__33009);
            rule__HashType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashType__Group__4_in_rule__HashType__Group__33012);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1492:1: rule__HashType__Group__3__Impl : ( RULE_C_ANGLE_R ) ;
    public final void rule__HashType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1496:1: ( ( RULE_C_ANGLE_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1497:1: ( RULE_C_ANGLE_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1497:1: ( RULE_C_ANGLE_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1498:1: RULE_C_ANGLE_R
            {
             before(grammarAccess.getHashTypeAccess().getC_ANGLE_RTerminalRuleCall_3()); 
            match(input,RULE_C_ANGLE_R,FOLLOW_RULE_C_ANGLE_R_in_rule__HashType__Group__3__Impl3039); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1509:1: rule__HashType__Group__4 : rule__HashType__Group__4__Impl ;
    public final void rule__HashType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1513:1: ( rule__HashType__Group__4__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1514:2: rule__HashType__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__HashType__Group__4__Impl_in_rule__HashType__Group__43068);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1520:1: rule__HashType__Group__4__Impl : ( ( rule__HashType__Group_4__0 )? ) ;
    public final void rule__HashType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1524:1: ( ( ( rule__HashType__Group_4__0 )? ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1525:1: ( ( rule__HashType__Group_4__0 )? )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1525:1: ( ( rule__HashType__Group_4__0 )? )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1526:1: ( rule__HashType__Group_4__0 )?
            {
             before(grammarAccess.getHashTypeAccess().getGroup_4()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1527:1: ( rule__HashType__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_C_PAREN_L) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1527:2: rule__HashType__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__HashType__Group_4__0_in_rule__HashType__Group__4__Impl3095);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1547:1: rule__HashType__Group_4__0 : rule__HashType__Group_4__0__Impl rule__HashType__Group_4__1 ;
    public final void rule__HashType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1551:1: ( rule__HashType__Group_4__0__Impl rule__HashType__Group_4__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1552:2: rule__HashType__Group_4__0__Impl rule__HashType__Group_4__1
            {
            pushFollow(FOLLOW_rule__HashType__Group_4__0__Impl_in_rule__HashType__Group_4__03136);
            rule__HashType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashType__Group_4__1_in_rule__HashType__Group_4__03139);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1559:1: rule__HashType__Group_4__0__Impl : ( RULE_C_PAREN_L ) ;
    public final void rule__HashType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1563:1: ( ( RULE_C_PAREN_L ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1564:1: ( RULE_C_PAREN_L )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1564:1: ( RULE_C_PAREN_L )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1565:1: RULE_C_PAREN_L
            {
             before(grammarAccess.getHashTypeAccess().getC_PAREN_LTerminalRuleCall_4_0()); 
            match(input,RULE_C_PAREN_L,FOLLOW_RULE_C_PAREN_L_in_rule__HashType__Group_4__0__Impl3166); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1576:1: rule__HashType__Group_4__1 : rule__HashType__Group_4__1__Impl rule__HashType__Group_4__2 ;
    public final void rule__HashType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1580:1: ( rule__HashType__Group_4__1__Impl rule__HashType__Group_4__2 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1581:2: rule__HashType__Group_4__1__Impl rule__HashType__Group_4__2
            {
            pushFollow(FOLLOW_rule__HashType__Group_4__1__Impl_in_rule__HashType__Group_4__13195);
            rule__HashType__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashType__Group_4__2_in_rule__HashType__Group_4__13198);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1588:1: rule__HashType__Group_4__1__Impl : ( ( rule__HashType__ParamsAssignment_4_1 ) ) ;
    public final void rule__HashType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1592:1: ( ( ( rule__HashType__ParamsAssignment_4_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1593:1: ( ( rule__HashType__ParamsAssignment_4_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1593:1: ( ( rule__HashType__ParamsAssignment_4_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1594:1: ( rule__HashType__ParamsAssignment_4_1 )
            {
             before(grammarAccess.getHashTypeAccess().getParamsAssignment_4_1()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1595:1: ( rule__HashType__ParamsAssignment_4_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1595:2: rule__HashType__ParamsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__HashType__ParamsAssignment_4_1_in_rule__HashType__Group_4__1__Impl3225);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1605:1: rule__HashType__Group_4__2 : rule__HashType__Group_4__2__Impl rule__HashType__Group_4__3 ;
    public final void rule__HashType__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1609:1: ( rule__HashType__Group_4__2__Impl rule__HashType__Group_4__3 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1610:2: rule__HashType__Group_4__2__Impl rule__HashType__Group_4__3
            {
            pushFollow(FOLLOW_rule__HashType__Group_4__2__Impl_in_rule__HashType__Group_4__23255);
            rule__HashType__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashType__Group_4__3_in_rule__HashType__Group_4__23258);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1617:1: rule__HashType__Group_4__2__Impl : ( ( rule__HashType__Group_4_2__0 )* ) ;
    public final void rule__HashType__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1621:1: ( ( ( rule__HashType__Group_4_2__0 )* ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1622:1: ( ( rule__HashType__Group_4_2__0 )* )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1622:1: ( ( rule__HashType__Group_4_2__0 )* )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1623:1: ( rule__HashType__Group_4_2__0 )*
            {
             before(grammarAccess.getHashTypeAccess().getGroup_4_2()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1624:1: ( rule__HashType__Group_4_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_C_COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1624:2: rule__HashType__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__HashType__Group_4_2__0_in_rule__HashType__Group_4__2__Impl3285);
            	    rule__HashType__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1634:1: rule__HashType__Group_4__3 : rule__HashType__Group_4__3__Impl ;
    public final void rule__HashType__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1638:1: ( rule__HashType__Group_4__3__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1639:2: rule__HashType__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__HashType__Group_4__3__Impl_in_rule__HashType__Group_4__33316);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1645:1: rule__HashType__Group_4__3__Impl : ( RULE_C_PAREN_R ) ;
    public final void rule__HashType__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1649:1: ( ( RULE_C_PAREN_R ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1650:1: ( RULE_C_PAREN_R )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1650:1: ( RULE_C_PAREN_R )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1651:1: RULE_C_PAREN_R
            {
             before(grammarAccess.getHashTypeAccess().getC_PAREN_RTerminalRuleCall_4_3()); 
            match(input,RULE_C_PAREN_R,FOLLOW_RULE_C_PAREN_R_in_rule__HashType__Group_4__3__Impl3343); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1670:1: rule__HashType__Group_4_2__0 : rule__HashType__Group_4_2__0__Impl rule__HashType__Group_4_2__1 ;
    public final void rule__HashType__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1674:1: ( rule__HashType__Group_4_2__0__Impl rule__HashType__Group_4_2__1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1675:2: rule__HashType__Group_4_2__0__Impl rule__HashType__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__HashType__Group_4_2__0__Impl_in_rule__HashType__Group_4_2__03380);
            rule__HashType__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__HashType__Group_4_2__1_in_rule__HashType__Group_4_2__03383);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1682:1: rule__HashType__Group_4_2__0__Impl : ( RULE_C_COMMA ) ;
    public final void rule__HashType__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1686:1: ( ( RULE_C_COMMA ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1687:1: ( RULE_C_COMMA )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1687:1: ( RULE_C_COMMA )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1688:1: RULE_C_COMMA
            {
             before(grammarAccess.getHashTypeAccess().getC_COMMATerminalRuleCall_4_2_0()); 
            match(input,RULE_C_COMMA,FOLLOW_RULE_C_COMMA_in_rule__HashType__Group_4_2__0__Impl3410); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1699:1: rule__HashType__Group_4_2__1 : rule__HashType__Group_4_2__1__Impl ;
    public final void rule__HashType__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1703:1: ( rule__HashType__Group_4_2__1__Impl )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1704:2: rule__HashType__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__HashType__Group_4_2__1__Impl_in_rule__HashType__Group_4_2__13439);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1710:1: rule__HashType__Group_4_2__1__Impl : ( ( rule__HashType__ParamsAssignment_4_2_1 ) ) ;
    public final void rule__HashType__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1714:1: ( ( ( rule__HashType__ParamsAssignment_4_2_1 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1715:1: ( ( rule__HashType__ParamsAssignment_4_2_1 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1715:1: ( ( rule__HashType__ParamsAssignment_4_2_1 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1716:1: ( rule__HashType__ParamsAssignment_4_2_1 )
            {
             before(grammarAccess.getHashTypeAccess().getParamsAssignment_4_2_1()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1717:1: ( rule__HashType__ParamsAssignment_4_2_1 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1717:2: rule__HashType__ParamsAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__HashType__ParamsAssignment_4_2_1_in_rule__HashType__Group_4_2__1__Impl3466);
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


    // $ANTLR start "rule__XML2__TypesAssignment_0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1732:1: rule__XML2__TypesAssignment_0 : ( ruleType ) ;
    public final void rule__XML2__TypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1736:1: ( ( ruleType ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1737:1: ( ruleType )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1737:1: ( ruleType )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1738:1: ruleType
            {
             before(grammarAccess.getXML2Access().getTypesTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__XML2__TypesAssignment_03505);
            ruleType();

            state._fsp--;

             after(grammarAccess.getXML2Access().getTypesTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__TypesAssignment_0"


    // $ANTLR start "rule__XML2__OtherCommAssignment_1"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1747:1: rule__XML2__OtherCommAssignment_1 : ( RULE_COMMENT ) ;
    public final void rule__XML2__OtherCommAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1751:1: ( ( RULE_COMMENT ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1752:1: ( RULE_COMMENT )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1752:1: ( RULE_COMMENT )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1753:1: RULE_COMMENT
            {
             before(grammarAccess.getXML2Access().getOtherCommCOMMENTTerminalRuleCall_1_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__XML2__OtherCommAssignment_13536); 
             after(grammarAccess.getXML2Access().getOtherCommCOMMENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XML2__OtherCommAssignment_1"


    // $ANTLR start "rule__Type__CommAssignment_0"
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1762:1: rule__Type__CommAssignment_0 : ( RULE_COMMENT ) ;
    public final void rule__Type__CommAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1766:1: ( ( RULE_COMMENT ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1767:1: ( RULE_COMMENT )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1767:1: ( RULE_COMMENT )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1768:1: RULE_COMMENT
            {
             before(grammarAccess.getTypeAccess().getCommCOMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__Type__CommAssignment_03567); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1777:1: rule__Type__InputAssignment_1 : ( ruleInput ) ;
    public final void rule__Type__InputAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1781:1: ( ( ruleInput ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1782:1: ( ruleInput )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1782:1: ( ruleInput )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1783:1: ruleInput
            {
             before(grammarAccess.getTypeAccess().getInputInputParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInput_in_rule__Type__InputAssignment_13598);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1792:1: rule__Type__PrefixAssignment_2 : ( RULE_C_TYPE ) ;
    public final void rule__Type__PrefixAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1796:1: ( ( RULE_C_TYPE ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1797:1: ( RULE_C_TYPE )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1797:1: ( RULE_C_TYPE )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1798:1: RULE_C_TYPE
            {
             before(grammarAccess.getTypeAccess().getPrefixC_TYPETerminalRuleCall_2_0()); 
            match(input,RULE_C_TYPE,FOLLOW_RULE_C_TYPE_in_rule__Type__PrefixAssignment_23629); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1807:1: rule__Type__NameAssignment_3 : ( RULE_NAME ) ;
    public final void rule__Type__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1811:1: ( ( RULE_NAME ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1812:1: ( RULE_NAME )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1812:1: ( RULE_NAME )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1813:1: RULE_NAME
            {
             before(grammarAccess.getTypeAccess().getNameNAMETerminalRuleCall_3_0()); 
            match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rule__Type__NameAssignment_33660); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1822:1: rule__Type__FieldsAssignment_5_0 : ( ruleField ) ;
    public final void rule__Type__FieldsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1826:1: ( ( ruleField ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1827:1: ( ruleField )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1827:1: ( ruleField )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1828:1: ruleField
            {
             before(grammarAccess.getTypeAccess().getFieldsFieldParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__Type__FieldsAssignment_5_03691);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1837:1: rule__Type__OtherCommAssignment_5_1 : ( RULE_COMMENT ) ;
    public final void rule__Type__OtherCommAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1841:1: ( ( RULE_COMMENT ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1842:1: ( RULE_COMMENT )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1842:1: ( RULE_COMMENT )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1843:1: RULE_COMMENT
            {
             before(grammarAccess.getTypeAccess().getOtherCommCOMMENTTerminalRuleCall_5_1_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__Type__OtherCommAssignment_5_13722); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1852:1: rule__Input__PrefixAssignment_1 : ( RULE_C_INPUT ) ;
    public final void rule__Input__PrefixAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1856:1: ( ( RULE_C_INPUT ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1857:1: ( RULE_C_INPUT )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1857:1: ( RULE_C_INPUT )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1858:1: RULE_C_INPUT
            {
             before(grammarAccess.getInputAccess().getPrefixC_INPUTTerminalRuleCall_1_0()); 
            match(input,RULE_C_INPUT,FOLLOW_RULE_C_INPUT_in_rule__Input__PrefixAssignment_13753); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1867:1: rule__Input__FilePathAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Input__FilePathAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1871:1: ( ( RULE_STRING ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1872:1: ( RULE_STRING )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1872:1: ( RULE_STRING )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1873:1: RULE_STRING
            {
             before(grammarAccess.getInputAccess().getFilePathSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Input__FilePathAssignment_53784); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1882:1: rule__Input__NodePathAssignment_6_3 : ( RULE_STRING ) ;
    public final void rule__Input__NodePathAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1886:1: ( ( RULE_STRING ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1887:1: ( RULE_STRING )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1887:1: ( RULE_STRING )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1888:1: RULE_STRING
            {
             before(grammarAccess.getInputAccess().getNodePathSTRINGTerminalRuleCall_6_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Input__NodePathAssignment_6_33815); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1897:1: rule__Field__CommAssignment_0 : ( RULE_COMMENT ) ;
    public final void rule__Field__CommAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1901:1: ( ( RULE_COMMENT ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1902:1: ( RULE_COMMENT )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1902:1: ( RULE_COMMENT )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1903:1: RULE_COMMENT
            {
             before(grammarAccess.getFieldAccess().getCommCOMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__Field__CommAssignment_03846); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1912:1: rule__Field__TypeAssignment_1 : ( ( rule__Field__TypeAlternatives_1_0 ) ) ;
    public final void rule__Field__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1916:1: ( ( ( rule__Field__TypeAlternatives_1_0 ) ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1917:1: ( ( rule__Field__TypeAlternatives_1_0 ) )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1917:1: ( ( rule__Field__TypeAlternatives_1_0 ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1918:1: ( rule__Field__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getFieldAccess().getTypeAlternatives_1_0()); 
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1919:1: ( rule__Field__TypeAlternatives_1_0 )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1919:2: rule__Field__TypeAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Field__TypeAlternatives_1_0_in_rule__Field__TypeAssignment_13877);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1928:1: rule__Field__FieldNameAssignment_2 : ( RULE_NAME ) ;
    public final void rule__Field__FieldNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1932:1: ( ( RULE_NAME ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1933:1: ( RULE_NAME )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1933:1: ( RULE_NAME )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1934:1: RULE_NAME
            {
             before(grammarAccess.getFieldAccess().getFieldNameNAMETerminalRuleCall_2_0()); 
            match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rule__Field__FieldNameAssignment_23910); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1943:1: rule__Field__NodePathAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Field__NodePathAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1947:1: ( ( RULE_STRING ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1948:1: ( RULE_STRING )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1948:1: ( RULE_STRING )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1949:1: RULE_STRING
            {
             before(grammarAccess.getFieldAccess().getNodePathSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Field__NodePathAssignment_43941); 
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1958:1: rule__NativeType__TypeAssignment : ( ruleTypeName ) ;
    public final void rule__NativeType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1962:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1963:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1963:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1964:1: ruleTypeName
            {
             before(grammarAccess.getNativeTypeAccess().getTypeTypeNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTypeName_in_rule__NativeType__TypeAssignment3972);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1973:1: rule__ListType__TypeAssignment_2 : ( ruleTypeName ) ;
    public final void rule__ListType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1977:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1978:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1978:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1979:1: ruleTypeName
            {
             before(grammarAccess.getListTypeAccess().getTypeTypeNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeName_in_rule__ListType__TypeAssignment_24003);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1988:1: rule__HashType__TypeAssignment_2 : ( ruleTypeName ) ;
    public final void rule__HashType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1992:1: ( ( ruleTypeName ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1993:1: ( ruleTypeName )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1993:1: ( ruleTypeName )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:1994:1: ruleTypeName
            {
             before(grammarAccess.getHashTypeAccess().getTypeTypeNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTypeName_in_rule__HashType__TypeAssignment_24034);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2003:1: rule__HashType__ParamsAssignment_4_1 : ( ruleParam ) ;
    public final void rule__HashType__ParamsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2007:1: ( ( ruleParam ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2008:1: ( ruleParam )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2008:1: ( ruleParam )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2009:1: ruleParam
            {
             before(grammarAccess.getHashTypeAccess().getParamsParamParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__HashType__ParamsAssignment_4_14065);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2018:1: rule__HashType__ParamsAssignment_4_2_1 : ( ruleParam ) ;
    public final void rule__HashType__ParamsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2022:1: ( ( ruleParam ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2023:1: ( ruleParam )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2023:1: ( ruleParam )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2024:1: ruleParam
            {
             before(grammarAccess.getHashTypeAccess().getParamsParamParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_ruleParam_in_rule__HashType__ParamsAssignment_4_2_14096);
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
    // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2033:1: rule__Param__ParamNameAssignment : ( RULE_NAME ) ;
    public final void rule__Param__ParamNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2037:1: ( ( RULE_NAME ) )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2038:1: ( RULE_NAME )
            {
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2038:1: ( RULE_NAME )
            // ../org.chw.game.cfg.ui/src-gen/org/chw/game/ui/contentassist/antlr/internal/InternalCfg.g:2039:1: RULE_NAME
            {
             before(grammarAccess.getParamAccess().getParamNameNAMETerminalRuleCall_0()); 
            match(input,RULE_NAME,FOLLOW_RULE_NAME_in_rule__Param__ParamNameAssignment4127); 
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
    public static final BitSet FOLLOW_rule__XML2__Alternatives_in_ruleXML294 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0_in_ruleType155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0_in_ruleInput215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeType_in_entryRuleNativeType302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNativeType309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NativeType__TypeAssignment_in_ruleNativeType335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListType_in_entryRuleListType362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListType369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListType__Group__0_in_ruleListType395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashType_in_entryRuleHashType422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHashType429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group__0_in_ruleHashType455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__ParamNameAssignment_in_ruleParam515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_entryRuleTypeName542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeName549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeName__Alternatives_in_ruleTypeName575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__TypesAssignment_0_in_rule__XML2__Alternatives611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XML2__OtherCommAssignment_1_in_rule__XML2__Alternatives629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__FieldsAssignment_5_0_in_rule__Type__Alternatives_5662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__OtherCommAssignment_5_1_in_rule__Type__Alternatives_5680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNativeType_in_rule__Field__TypeAlternatives_1_0713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListType_in_rule__Field__TypeAlternatives_1_0730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHashType_in_rule__Field__TypeAlternatives_1_0747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INPUT_in_rule__TypeName__Alternatives779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_FILE_in_rule__TypeName__Alternatives796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_NODE_in_rule__TypeName__Alternatives813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_TYPE_in_rule__TypeName__Alternatives830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INT_in_rule__TypeName__Alternatives847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_UINT_in_rule__TypeName__Alternatives864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BOOL_in_rule__TypeName__Alternatives881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_NUMBER_in_rule__TypeName__Alternatives898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_STRING_in_rule__TypeName__Alternatives915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_LIST_in_rule__TypeName__Alternatives932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_HASH_in_rule__TypeName__Alternatives949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rule__TypeName__Alternatives966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__0__Impl_in_rule__Type__Group__0996 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_rule__Type__Group__1_in_rule__Type__Group__0999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__CommAssignment_0_in_rule__Type__Group__0__Impl1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__1__Impl_in_rule__Type__Group__11056 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_rule__Type__Group__2_in_rule__Type__Group__11059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__InputAssignment_1_in_rule__Type__Group__1__Impl1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__2__Impl_in_rule__Type__Group__21117 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Type__Group__3_in_rule__Type__Group__21120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__PrefixAssignment_2_in_rule__Type__Group__2__Impl1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__3__Impl_in_rule__Type__Group__31177 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Type__Group__4_in_rule__Type__Group__31180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__NameAssignment_3_in_rule__Type__Group__3__Impl1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__4__Impl_in_rule__Type__Group__41237 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_rule__Type__Group__5_in_rule__Type__Group__41240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACE_L_in_rule__Type__Group__4__Impl1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group__5__Impl_in_rule__Type__Group__51296 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_rule__Type__Group__6_in_rule__Type__Group__51299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_5_in_rule__Type__Group__5__Impl1326 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Type__Group__6__Impl_in_rule__Type__Group__61357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACE_R_in_rule__Type__Group__6__Impl1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__01427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Input__Group__1_in_rule__Input__Group__01430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_L_in_rule__Input__Group__0__Impl1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__11486 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Input__Group__2_in_rule__Input__Group__11489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__PrefixAssignment_1_in_rule__Input__Group__1__Impl1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__2__Impl_in_rule__Input__Group__21546 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Input__Group__3_in_rule__Input__Group__21549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_rule__Input__Group__2__Impl1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__3__Impl_in_rule__Input__Group__31605 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Input__Group__4_in_rule__Input__Group__31608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_FILE_in_rule__Input__Group__3__Impl1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__4__Impl_in_rule__Input__Group__41664 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Input__Group__5_in_rule__Input__Group__41667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_rule__Input__Group__4__Impl1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__5__Impl_in_rule__Input__Group__51723 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Input__Group__6_in_rule__Input__Group__51726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__FilePathAssignment_5_in_rule__Input__Group__5__Impl1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__6__Impl_in_rule__Input__Group__61783 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Input__Group__7_in_rule__Input__Group__61786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_6__0_in_rule__Input__Group__6__Impl1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__7__Impl_in_rule__Input__Group__71844 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Input__Group__8_in_rule__Input__Group__71847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_rule__Input__Group__7__Impl1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__8__Impl_in_rule__Input__Group__81903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_BRACKET_R_in_rule__Input__Group__8__Impl1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_6__0__Impl_in_rule__Input__Group_6__01977 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Input__Group_6__1_in_rule__Input__Group_6__01980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_COMMA_in_rule__Input__Group_6__0__Impl2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_6__1__Impl_in_rule__Input__Group_6__12036 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Input__Group_6__2_in_rule__Input__Group_6__12039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_NODE_in_rule__Input__Group_6__1__Impl2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_6__2__Impl_in_rule__Input__Group_6__22095 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Input__Group_6__3_in_rule__Input__Group_6__22098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_rule__Input__Group_6__2__Impl2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_6__3__Impl_in_rule__Input__Group_6__32154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__NodePathAssignment_6_3_in_rule__Input__Group_6__3__Impl2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__02219 = new BitSet(new long[]{0x000000000000FFF0L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__02222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__CommAssignment_0_in_rule__Field__Group__0__Impl2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__12279 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__12282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypeAssignment_1_in_rule__Field__Group__1__Impl2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__22339 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__22342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__FieldNameAssignment_2_in_rule__Field__Group__2__Impl2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__32399 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Field__Group__4_in_rule__Field__Group__32402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_EQUALS_in_rule__Field__Group__3__Impl2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__4__Impl_in_rule__Field__Group__42458 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Field__Group__5_in_rule__Field__Group__42461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NodePathAssignment_4_in_rule__Field__Group__4__Impl2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__5__Impl_in_rule__Field__Group__52518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_SEMICOLON_in_rule__Field__Group__5__Impl2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListType__Group__0__Impl_in_rule__ListType__Group__02589 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ListType__Group__1_in_rule__ListType__Group__02592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_LIST_in_rule__ListType__Group__0__Impl2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListType__Group__1__Impl_in_rule__ListType__Group__12648 = new BitSet(new long[]{0x000000000000FFF0L});
    public static final BitSet FOLLOW_rule__ListType__Group__2_in_rule__ListType__Group__12651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_ANGLE_L_in_rule__ListType__Group__1__Impl2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListType__Group__2__Impl_in_rule__ListType__Group__22707 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ListType__Group__3_in_rule__ListType__Group__22710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListType__TypeAssignment_2_in_rule__ListType__Group__2__Impl2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListType__Group__3__Impl_in_rule__ListType__Group__32767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_ANGLE_R_in_rule__ListType__Group__3__Impl2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group__0__Impl_in_rule__HashType__Group__02831 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__HashType__Group__1_in_rule__HashType__Group__02834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_HASH_in_rule__HashType__Group__0__Impl2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group__1__Impl_in_rule__HashType__Group__12890 = new BitSet(new long[]{0x000000000000FFF0L});
    public static final BitSet FOLLOW_rule__HashType__Group__2_in_rule__HashType__Group__12893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_ANGLE_L_in_rule__HashType__Group__1__Impl2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group__2__Impl_in_rule__HashType__Group__22949 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__HashType__Group__3_in_rule__HashType__Group__22952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__TypeAssignment_2_in_rule__HashType__Group__2__Impl2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group__3__Impl_in_rule__HashType__Group__33009 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__HashType__Group__4_in_rule__HashType__Group__33012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_ANGLE_R_in_rule__HashType__Group__3__Impl3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group__4__Impl_in_rule__HashType__Group__43068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group_4__0_in_rule__HashType__Group__4__Impl3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group_4__0__Impl_in_rule__HashType__Group_4__03136 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__HashType__Group_4__1_in_rule__HashType__Group_4__03139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_L_in_rule__HashType__Group_4__0__Impl3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group_4__1__Impl_in_rule__HashType__Group_4__13195 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__HashType__Group_4__2_in_rule__HashType__Group_4__13198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__ParamsAssignment_4_1_in_rule__HashType__Group_4__1__Impl3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group_4__2__Impl_in_rule__HashType__Group_4__23255 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__HashType__Group_4__3_in_rule__HashType__Group_4__23258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group_4_2__0_in_rule__HashType__Group_4__2__Impl3285 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__HashType__Group_4__3__Impl_in_rule__HashType__Group_4__33316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_PAREN_R_in_rule__HashType__Group_4__3__Impl3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group_4_2__0__Impl_in_rule__HashType__Group_4_2__03380 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__HashType__Group_4_2__1_in_rule__HashType__Group_4_2__03383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_COMMA_in_rule__HashType__Group_4_2__0__Impl3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__Group_4_2__1__Impl_in_rule__HashType__Group_4_2__13439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HashType__ParamsAssignment_4_2_1_in_rule__HashType__Group_4_2__1__Impl3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__XML2__TypesAssignment_03505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__XML2__OtherCommAssignment_13536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__Type__CommAssignment_03567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_rule__Type__InputAssignment_13598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_TYPE_in_rule__Type__PrefixAssignment_23629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rule__Type__NameAssignment_33660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Type__FieldsAssignment_5_03691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__Type__OtherCommAssignment_5_13722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_C_INPUT_in_rule__Input__PrefixAssignment_13753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Input__FilePathAssignment_53784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Input__NodePathAssignment_6_33815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__Field__CommAssignment_03846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__TypeAlternatives_1_0_in_rule__Field__TypeAssignment_13877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rule__Field__FieldNameAssignment_23910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Field__NodePathAssignment_43941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__NativeType__TypeAssignment3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__ListType__TypeAssignment_24003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_rule__HashType__TypeAssignment_24034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__HashType__ParamsAssignment_4_14065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_rule__HashType__ParamsAssignment_4_2_14096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_in_rule__Param__ParamNameAssignment4127 = new BitSet(new long[]{0x0000000000000002L});

}