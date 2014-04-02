package org.chw.game.ide.ui.contentassist.antlr.internal; 

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
import org.chw.game.ide.services.ProtoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProtoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NUMBER", "RULE_IDENTITY", "RULE_FIELD_ATTR", "RULE_FIELD_TYPE", "RULE_PACKAGE", "RULE_IMPORT", "RULE_OPTION", "RULE_MESSAGE", "RULE_ENUM", "RULE_MAP_KIND", "RULE_DEFAULT_KIND", "RULE_END", "RULE_EQUALS", "RULE_FILETER_A", "RULE_BRACE_L", "RULE_BRACE_R", "RULE_FILETER_B", "RULE_DOT", "RULE_BRACKET_L", "RULE_BRACKET_R", "RULE_SL_STRING", "RULE_COMMENT_SL", "RULE_COMMENT_ML", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_MAP_KIND=13;
    public static final int RULE_OPTION=10;
    public static final int RULE_IDENTITY=5;
    public static final int RULE_ANY_OTHER=28;
    public static final int RULE_SL_STRING=24;
    public static final int RULE_BRACE_R=19;
    public static final int RULE_BRACKET_L=22;
    public static final int RULE_FIELD_TYPE=7;
    public static final int RULE_COMMENT_SL=25;
    public static final int RULE_DEFAULT_KIND=14;
    public static final int EOF=-1;
    public static final int RULE_BRACKET_R=23;
    public static final int RULE_PACKAGE=8;
    public static final int RULE_DOT=21;
    public static final int RULE_NUMBER=4;
    public static final int RULE_END=15;
    public static final int RULE_IMPORT=9;
    public static final int RULE_BRACE_L=18;
    public static final int RULE_MESSAGE=11;
    public static final int RULE_FILETER_A=17;
    public static final int RULE_FILETER_B=20;
    public static final int RULE_COMMENT_ML=26;
    public static final int RULE_EQUALS=16;
    public static final int RULE_FIELD_ATTR=6;
    public static final int RULE_WS=27;
    public static final int RULE_ENUM=12;

    // delegates
    // delegators


        public InternalProtoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProtoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProtoParser.tokenNames; }
    public String getGrammarFileName() { return "../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g"; }


     
     	private ProtoGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ProtoGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:61:1: ( ruleModel EOF )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:69:1: ruleModel : ( ( rule__Model__Alternatives )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:73:2: ( ( ( rule__Model__Alternatives )* ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:74:1: ( ( rule__Model__Alternatives )* )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:74:1: ( ( rule__Model__Alternatives )* )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:75:1: ( rule__Model__Alternatives )*
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:76:1: ( rule__Model__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_PACKAGE && LA1_0<=RULE_MAP_KIND)||(LA1_0>=RULE_COMMENT_SL && LA1_0<=RULE_COMMENT_ML)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:76:2: rule__Model__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Model__Alternatives_in_ruleModel94);
            	    rule__Model__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImportInfo"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:88:1: entryRuleImportInfo : ruleImportInfo EOF ;
    public final void entryRuleImportInfo() throws RecognitionException {
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:89:1: ( ruleImportInfo EOF )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:90:1: ruleImportInfo EOF
            {
             before(grammarAccess.getImportInfoRule()); 
            pushFollow(FOLLOW_ruleImportInfo_in_entryRuleImportInfo122);
            ruleImportInfo();

            state._fsp--;

             after(grammarAccess.getImportInfoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportInfo129); 

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
    // $ANTLR end "entryRuleImportInfo"


    // $ANTLR start "ruleImportInfo"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:97:1: ruleImportInfo : ( ( rule__ImportInfo__Group__0 ) ) ;
    public final void ruleImportInfo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:101:2: ( ( ( rule__ImportInfo__Group__0 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:102:1: ( ( rule__ImportInfo__Group__0 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:102:1: ( ( rule__ImportInfo__Group__0 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:103:1: ( rule__ImportInfo__Group__0 )
            {
             before(grammarAccess.getImportInfoAccess().getGroup()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:104:1: ( rule__ImportInfo__Group__0 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:104:2: rule__ImportInfo__Group__0
            {
            pushFollow(FOLLOW_rule__ImportInfo__Group__0_in_ruleImportInfo155);
            rule__ImportInfo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportInfoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportInfo"


    // $ANTLR start "entryRuleOptionInfo"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:116:1: entryRuleOptionInfo : ruleOptionInfo EOF ;
    public final void entryRuleOptionInfo() throws RecognitionException {
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:117:1: ( ruleOptionInfo EOF )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:118:1: ruleOptionInfo EOF
            {
             before(grammarAccess.getOptionInfoRule()); 
            pushFollow(FOLLOW_ruleOptionInfo_in_entryRuleOptionInfo182);
            ruleOptionInfo();

            state._fsp--;

             after(grammarAccess.getOptionInfoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionInfo189); 

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
    // $ANTLR end "entryRuleOptionInfo"


    // $ANTLR start "ruleOptionInfo"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:125:1: ruleOptionInfo : ( ( rule__OptionInfo__Group__0 ) ) ;
    public final void ruleOptionInfo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:129:2: ( ( ( rule__OptionInfo__Group__0 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:130:1: ( ( rule__OptionInfo__Group__0 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:130:1: ( ( rule__OptionInfo__Group__0 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:131:1: ( rule__OptionInfo__Group__0 )
            {
             before(grammarAccess.getOptionInfoAccess().getGroup()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:132:1: ( rule__OptionInfo__Group__0 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:132:2: rule__OptionInfo__Group__0
            {
            pushFollow(FOLLOW_rule__OptionInfo__Group__0_in_ruleOptionInfo215);
            rule__OptionInfo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionInfoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptionInfo"


    // $ANTLR start "entryRuleElement"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:144:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:145:1: ( ruleElement EOF )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:146:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement242);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement249); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:153:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:157:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:158:1: ( ( rule__Element__Alternatives ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:158:1: ( ( rule__Element__Alternatives ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:159:1: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:160:1: ( rule__Element__Alternatives )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:160:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement275);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleType"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:172:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:173:1: ( ruleType EOF )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:174:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType302);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType309); 

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
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:181:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:185:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:186:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:186:1: ( ( rule__Type__Alternatives ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:187:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:188:1: ( rule__Type__Alternatives )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:188:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType335);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleMap"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:200:1: entryRuleMap : ruleMap EOF ;
    public final void entryRuleMap() throws RecognitionException {
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:201:1: ( ruleMap EOF )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:202:1: ruleMap EOF
            {
             before(grammarAccess.getMapRule()); 
            pushFollow(FOLLOW_ruleMap_in_entryRuleMap362);
            ruleMap();

            state._fsp--;

             after(grammarAccess.getMapRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMap369); 

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
    // $ANTLR end "entryRuleMap"


    // $ANTLR start "ruleMap"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:209:1: ruleMap : ( ( rule__Map__Group__0 ) ) ;
    public final void ruleMap() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:213:2: ( ( ( rule__Map__Group__0 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:214:1: ( ( rule__Map__Group__0 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:214:1: ( ( rule__Map__Group__0 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:215:1: ( rule__Map__Group__0 )
            {
             before(grammarAccess.getMapAccess().getGroup()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:216:1: ( rule__Map__Group__0 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:216:2: rule__Map__Group__0
            {
            pushFollow(FOLLOW_rule__Map__Group__0_in_ruleMap395);
            rule__Map__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMap"


    // $ANTLR start "entryRuleMapField"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:228:1: entryRuleMapField : ruleMapField EOF ;
    public final void entryRuleMapField() throws RecognitionException {
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:229:1: ( ruleMapField EOF )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:230:1: ruleMapField EOF
            {
             before(grammarAccess.getMapFieldRule()); 
            pushFollow(FOLLOW_ruleMapField_in_entryRuleMapField422);
            ruleMapField();

            state._fsp--;

             after(grammarAccess.getMapFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapField429); 

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
    // $ANTLR end "entryRuleMapField"


    // $ANTLR start "ruleMapField"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:237:1: ruleMapField : ( ( rule__MapField__Group__0 ) ) ;
    public final void ruleMapField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:241:2: ( ( ( rule__MapField__Group__0 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:242:1: ( ( rule__MapField__Group__0 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:242:1: ( ( rule__MapField__Group__0 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:243:1: ( rule__MapField__Group__0 )
            {
             before(grammarAccess.getMapFieldAccess().getGroup()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:244:1: ( rule__MapField__Group__0 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:244:2: rule__MapField__Group__0
            {
            pushFollow(FOLLOW_rule__MapField__Group__0_in_ruleMapField455);
            rule__MapField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapField"


    // $ANTLR start "entryRuleMapRef"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:256:1: entryRuleMapRef : ruleMapRef EOF ;
    public final void entryRuleMapRef() throws RecognitionException {
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:257:1: ( ruleMapRef EOF )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:258:1: ruleMapRef EOF
            {
             before(grammarAccess.getMapRefRule()); 
            pushFollow(FOLLOW_ruleMapRef_in_entryRuleMapRef482);
            ruleMapRef();

            state._fsp--;

             after(grammarAccess.getMapRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapRef489); 

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
    // $ANTLR end "entryRuleMapRef"


    // $ANTLR start "ruleMapRef"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:265:1: ruleMapRef : ( ( rule__MapRef__Group__0 ) ) ;
    public final void ruleMapRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:269:2: ( ( ( rule__MapRef__Group__0 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:270:1: ( ( rule__MapRef__Group__0 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:270:1: ( ( rule__MapRef__Group__0 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:271:1: ( rule__MapRef__Group__0 )
            {
             before(grammarAccess.getMapRefAccess().getGroup()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:272:1: ( rule__MapRef__Group__0 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:272:2: rule__MapRef__Group__0
            {
            pushFollow(FOLLOW_rule__MapRef__Group__0_in_ruleMapRef515);
            rule__MapRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapRef"


    // $ANTLR start "entryRuleMessageType"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:284:1: entryRuleMessageType : ruleMessageType EOF ;
    public final void entryRuleMessageType() throws RecognitionException {
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:285:1: ( ruleMessageType EOF )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:286:1: ruleMessageType EOF
            {
             before(grammarAccess.getMessageTypeRule()); 
            pushFollow(FOLLOW_ruleMessageType_in_entryRuleMessageType542);
            ruleMessageType();

            state._fsp--;

             after(grammarAccess.getMessageTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageType549); 

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
    // $ANTLR end "entryRuleMessageType"


    // $ANTLR start "ruleMessageType"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:293:1: ruleMessageType : ( ( rule__MessageType__Group__0 ) ) ;
    public final void ruleMessageType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:297:2: ( ( ( rule__MessageType__Group__0 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:298:1: ( ( rule__MessageType__Group__0 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:298:1: ( ( rule__MessageType__Group__0 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:299:1: ( rule__MessageType__Group__0 )
            {
             before(grammarAccess.getMessageTypeAccess().getGroup()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:300:1: ( rule__MessageType__Group__0 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:300:2: rule__MessageType__Group__0
            {
            pushFollow(FOLLOW_rule__MessageType__Group__0_in_ruleMessageType575);
            rule__MessageType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageType"


    // $ANTLR start "entryRuleMessageField"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:312:1: entryRuleMessageField : ruleMessageField EOF ;
    public final void entryRuleMessageField() throws RecognitionException {
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:313:1: ( ruleMessageField EOF )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:314:1: ruleMessageField EOF
            {
             before(grammarAccess.getMessageFieldRule()); 
            pushFollow(FOLLOW_ruleMessageField_in_entryRuleMessageField602);
            ruleMessageField();

            state._fsp--;

             after(grammarAccess.getMessageFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageField609); 

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
    // $ANTLR end "entryRuleMessageField"


    // $ANTLR start "ruleMessageField"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:321:1: ruleMessageField : ( ( rule__MessageField__Alternatives ) ) ;
    public final void ruleMessageField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:325:2: ( ( ( rule__MessageField__Alternatives ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:326:1: ( ( rule__MessageField__Alternatives ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:326:1: ( ( rule__MessageField__Alternatives ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:327:1: ( rule__MessageField__Alternatives )
            {
             before(grammarAccess.getMessageFieldAccess().getAlternatives()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:328:1: ( rule__MessageField__Alternatives )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:328:2: rule__MessageField__Alternatives
            {
            pushFollow(FOLLOW_rule__MessageField__Alternatives_in_ruleMessageField635);
            rule__MessageField__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMessageFieldAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageField"


    // $ANTLR start "entryRuleMessageSimpleField"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:340:1: entryRuleMessageSimpleField : ruleMessageSimpleField EOF ;
    public final void entryRuleMessageSimpleField() throws RecognitionException {
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:341:1: ( ruleMessageSimpleField EOF )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:342:1: ruleMessageSimpleField EOF
            {
             before(grammarAccess.getMessageSimpleFieldRule()); 
            pushFollow(FOLLOW_ruleMessageSimpleField_in_entryRuleMessageSimpleField662);
            ruleMessageSimpleField();

            state._fsp--;

             after(grammarAccess.getMessageSimpleFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageSimpleField669); 

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
    // $ANTLR end "entryRuleMessageSimpleField"


    // $ANTLR start "ruleMessageSimpleField"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:349:1: ruleMessageSimpleField : ( ( rule__MessageSimpleField__Group__0 ) ) ;
    public final void ruleMessageSimpleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:353:2: ( ( ( rule__MessageSimpleField__Group__0 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:354:1: ( ( rule__MessageSimpleField__Group__0 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:354:1: ( ( rule__MessageSimpleField__Group__0 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:355:1: ( rule__MessageSimpleField__Group__0 )
            {
             before(grammarAccess.getMessageSimpleFieldAccess().getGroup()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:356:1: ( rule__MessageSimpleField__Group__0 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:356:2: rule__MessageSimpleField__Group__0
            {
            pushFollow(FOLLOW_rule__MessageSimpleField__Group__0_in_ruleMessageSimpleField695);
            rule__MessageSimpleField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageSimpleFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageSimpleField"


    // $ANTLR start "entryRuleMessageComplexField"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:368:1: entryRuleMessageComplexField : ruleMessageComplexField EOF ;
    public final void entryRuleMessageComplexField() throws RecognitionException {
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:369:1: ( ruleMessageComplexField EOF )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:370:1: ruleMessageComplexField EOF
            {
             before(grammarAccess.getMessageComplexFieldRule()); 
            pushFollow(FOLLOW_ruleMessageComplexField_in_entryRuleMessageComplexField722);
            ruleMessageComplexField();

            state._fsp--;

             after(grammarAccess.getMessageComplexFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageComplexField729); 

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
    // $ANTLR end "entryRuleMessageComplexField"


    // $ANTLR start "ruleMessageComplexField"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:377:1: ruleMessageComplexField : ( ( rule__MessageComplexField__Group__0 ) ) ;
    public final void ruleMessageComplexField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:381:2: ( ( ( rule__MessageComplexField__Group__0 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:382:1: ( ( rule__MessageComplexField__Group__0 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:382:1: ( ( rule__MessageComplexField__Group__0 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:383:1: ( rule__MessageComplexField__Group__0 )
            {
             before(grammarAccess.getMessageComplexFieldAccess().getGroup()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:384:1: ( rule__MessageComplexField__Group__0 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:384:2: rule__MessageComplexField__Group__0
            {
            pushFollow(FOLLOW_rule__MessageComplexField__Group__0_in_ruleMessageComplexField755);
            rule__MessageComplexField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageComplexFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageComplexField"


    // $ANTLR start "entryRuleMessageFieldDefault"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:396:1: entryRuleMessageFieldDefault : ruleMessageFieldDefault EOF ;
    public final void entryRuleMessageFieldDefault() throws RecognitionException {
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:397:1: ( ruleMessageFieldDefault EOF )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:398:1: ruleMessageFieldDefault EOF
            {
             before(grammarAccess.getMessageFieldDefaultRule()); 
            pushFollow(FOLLOW_ruleMessageFieldDefault_in_entryRuleMessageFieldDefault782);
            ruleMessageFieldDefault();

            state._fsp--;

             after(grammarAccess.getMessageFieldDefaultRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageFieldDefault789); 

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
    // $ANTLR end "entryRuleMessageFieldDefault"


    // $ANTLR start "ruleMessageFieldDefault"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:405:1: ruleMessageFieldDefault : ( ( rule__MessageFieldDefault__Group__0 ) ) ;
    public final void ruleMessageFieldDefault() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:409:2: ( ( ( rule__MessageFieldDefault__Group__0 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:410:1: ( ( rule__MessageFieldDefault__Group__0 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:410:1: ( ( rule__MessageFieldDefault__Group__0 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:411:1: ( rule__MessageFieldDefault__Group__0 )
            {
             before(grammarAccess.getMessageFieldDefaultAccess().getGroup()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:412:1: ( rule__MessageFieldDefault__Group__0 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:412:2: rule__MessageFieldDefault__Group__0
            {
            pushFollow(FOLLOW_rule__MessageFieldDefault__Group__0_in_ruleMessageFieldDefault815);
            rule__MessageFieldDefault__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageFieldDefaultAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageFieldDefault"


    // $ANTLR start "entryRuleEnumType"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:424:1: entryRuleEnumType : ruleEnumType EOF ;
    public final void entryRuleEnumType() throws RecognitionException {
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:425:1: ( ruleEnumType EOF )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:426:1: ruleEnumType EOF
            {
             before(grammarAccess.getEnumTypeRule()); 
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType842);
            ruleEnumType();

            state._fsp--;

             after(grammarAccess.getEnumTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType849); 

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
    // $ANTLR end "entryRuleEnumType"


    // $ANTLR start "ruleEnumType"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:433:1: ruleEnumType : ( ( rule__EnumType__Group__0 ) ) ;
    public final void ruleEnumType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:437:2: ( ( ( rule__EnumType__Group__0 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:438:1: ( ( rule__EnumType__Group__0 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:438:1: ( ( rule__EnumType__Group__0 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:439:1: ( rule__EnumType__Group__0 )
            {
             before(grammarAccess.getEnumTypeAccess().getGroup()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:440:1: ( rule__EnumType__Group__0 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:440:2: rule__EnumType__Group__0
            {
            pushFollow(FOLLOW_rule__EnumType__Group__0_in_ruleEnumType875);
            rule__EnumType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumType"


    // $ANTLR start "entryRuleEnumField"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:452:1: entryRuleEnumField : ruleEnumField EOF ;
    public final void entryRuleEnumField() throws RecognitionException {
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:453:1: ( ruleEnumField EOF )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:454:1: ruleEnumField EOF
            {
             before(grammarAccess.getEnumFieldRule()); 
            pushFollow(FOLLOW_ruleEnumField_in_entryRuleEnumField902);
            ruleEnumField();

            state._fsp--;

             after(grammarAccess.getEnumFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumField909); 

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
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:461:1: ruleEnumField : ( ( rule__EnumField__Group__0 ) ) ;
    public final void ruleEnumField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:465:2: ( ( ( rule__EnumField__Group__0 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:466:1: ( ( rule__EnumField__Group__0 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:466:1: ( ( rule__EnumField__Group__0 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:467:1: ( rule__EnumField__Group__0 )
            {
             before(grammarAccess.getEnumFieldAccess().getGroup()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:468:1: ( rule__EnumField__Group__0 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:468:2: rule__EnumField__Group__0
            {
            pushFollow(FOLLOW_rule__EnumField__Group__0_in_ruleEnumField935);
            rule__EnumField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumFieldAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEnumFieldOpt"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:480:1: entryRuleEnumFieldOpt : ruleEnumFieldOpt EOF ;
    public final void entryRuleEnumFieldOpt() throws RecognitionException {
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:481:1: ( ruleEnumFieldOpt EOF )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:482:1: ruleEnumFieldOpt EOF
            {
             before(grammarAccess.getEnumFieldOptRule()); 
            pushFollow(FOLLOW_ruleEnumFieldOpt_in_entryRuleEnumFieldOpt962);
            ruleEnumFieldOpt();

            state._fsp--;

             after(grammarAccess.getEnumFieldOptRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumFieldOpt969); 

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
    // $ANTLR end "entryRuleEnumFieldOpt"


    // $ANTLR start "ruleEnumFieldOpt"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:489:1: ruleEnumFieldOpt : ( ( rule__EnumFieldOpt__Group__0 ) ) ;
    public final void ruleEnumFieldOpt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:493:2: ( ( ( rule__EnumFieldOpt__Group__0 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:494:1: ( ( rule__EnumFieldOpt__Group__0 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:494:1: ( ( rule__EnumFieldOpt__Group__0 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:495:1: ( rule__EnumFieldOpt__Group__0 )
            {
             before(grammarAccess.getEnumFieldOptAccess().getGroup()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:496:1: ( rule__EnumFieldOpt__Group__0 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:496:2: rule__EnumFieldOpt__Group__0
            {
            pushFollow(FOLLOW_rule__EnumFieldOpt__Group__0_in_ruleEnumFieldOpt995);
            rule__EnumFieldOpt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumFieldOptAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumFieldOpt"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:508:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:509:1: ( ruleQualifiedName EOF )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:510:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1022);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1029); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:517:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:521:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:522:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:522:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:523:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:524:1: ( rule__QualifiedName__Group__0 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:524:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1055);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleENTITY_NAME"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:536:1: entryRuleENTITY_NAME : ruleENTITY_NAME EOF ;
    public final void entryRuleENTITY_NAME() throws RecognitionException {
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:537:1: ( ruleENTITY_NAME EOF )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:538:1: ruleENTITY_NAME EOF
            {
             before(grammarAccess.getENTITY_NAMERule()); 
            pushFollow(FOLLOW_ruleENTITY_NAME_in_entryRuleENTITY_NAME1082);
            ruleENTITY_NAME();

            state._fsp--;

             after(grammarAccess.getENTITY_NAMERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleENTITY_NAME1089); 

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
    // $ANTLR end "entryRuleENTITY_NAME"


    // $ANTLR start "ruleENTITY_NAME"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:545:1: ruleENTITY_NAME : ( ( rule__ENTITY_NAME__Alternatives ) ) ;
    public final void ruleENTITY_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:549:2: ( ( ( rule__ENTITY_NAME__Alternatives ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:550:1: ( ( rule__ENTITY_NAME__Alternatives ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:550:1: ( ( rule__ENTITY_NAME__Alternatives ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:551:1: ( rule__ENTITY_NAME__Alternatives )
            {
             before(grammarAccess.getENTITY_NAMEAccess().getAlternatives()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:552:1: ( rule__ENTITY_NAME__Alternatives )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:552:2: rule__ENTITY_NAME__Alternatives
            {
            pushFollow(FOLLOW_rule__ENTITY_NAME__Alternatives_in_ruleENTITY_NAME1115);
            rule__ENTITY_NAME__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getENTITY_NAMEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleENTITY_NAME"


    // $ANTLR start "entryRuleComment_ALL"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:564:1: entryRuleComment_ALL : ruleComment_ALL EOF ;
    public final void entryRuleComment_ALL() throws RecognitionException {
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:565:1: ( ruleComment_ALL EOF )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:566:1: ruleComment_ALL EOF
            {
             before(grammarAccess.getComment_ALLRule()); 
            pushFollow(FOLLOW_ruleComment_ALL_in_entryRuleComment_ALL1142);
            ruleComment_ALL();

            state._fsp--;

             after(grammarAccess.getComment_ALLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment_ALL1149); 

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
    // $ANTLR end "entryRuleComment_ALL"


    // $ANTLR start "ruleComment_ALL"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:573:1: ruleComment_ALL : ( ( rule__Comment_ALL__Alternatives ) ) ;
    public final void ruleComment_ALL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:577:2: ( ( ( rule__Comment_ALL__Alternatives ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:578:1: ( ( rule__Comment_ALL__Alternatives ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:578:1: ( ( rule__Comment_ALL__Alternatives ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:579:1: ( rule__Comment_ALL__Alternatives )
            {
             before(grammarAccess.getComment_ALLAccess().getAlternatives()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:580:1: ( rule__Comment_ALL__Alternatives )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:580:2: rule__Comment_ALL__Alternatives
            {
            pushFollow(FOLLOW_rule__Comment_ALL__Alternatives_in_ruleComment_ALL1175);
            rule__Comment_ALL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComment_ALLAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComment_ALL"


    // $ANTLR start "rule__Model__Alternatives"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:592:1: rule__Model__Alternatives : ( ( ( rule__Model__Group_0__0 ) ) | ( ( rule__Model__ImportsAssignment_1 ) ) | ( ( rule__Model__OptionsAssignment_2 ) ) | ( ( rule__Model__ElementsAssignment_3 ) ) | ( ( rule__Model__CommAssignment_4 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:596:1: ( ( ( rule__Model__Group_0__0 ) ) | ( ( rule__Model__ImportsAssignment_1 ) ) | ( ( rule__Model__OptionsAssignment_2 ) ) | ( ( rule__Model__ElementsAssignment_3 ) ) | ( ( rule__Model__CommAssignment_4 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_PACKAGE:
                {
                alt2=1;
                }
                break;
            case RULE_IMPORT:
                {
                alt2=2;
                }
                break;
            case RULE_OPTION:
                {
                alt2=3;
                }
                break;
            case RULE_MESSAGE:
            case RULE_ENUM:
            case RULE_MAP_KIND:
                {
                alt2=4;
                }
                break;
            case RULE_COMMENT_SL:
            case RULE_COMMENT_ML:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:597:1: ( ( rule__Model__Group_0__0 ) )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:597:1: ( ( rule__Model__Group_0__0 ) )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:598:1: ( rule__Model__Group_0__0 )
                    {
                     before(grammarAccess.getModelAccess().getGroup_0()); 
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:599:1: ( rule__Model__Group_0__0 )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:599:2: rule__Model__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_0__0_in_rule__Model__Alternatives1211);
                    rule__Model__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:603:6: ( ( rule__Model__ImportsAssignment_1 ) )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:603:6: ( ( rule__Model__ImportsAssignment_1 ) )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:604:1: ( rule__Model__ImportsAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getImportsAssignment_1()); 
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:605:1: ( rule__Model__ImportsAssignment_1 )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:605:2: rule__Model__ImportsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__ImportsAssignment_1_in_rule__Model__Alternatives1229);
                    rule__Model__ImportsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getImportsAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:609:6: ( ( rule__Model__OptionsAssignment_2 ) )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:609:6: ( ( rule__Model__OptionsAssignment_2 ) )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:610:1: ( rule__Model__OptionsAssignment_2 )
                    {
                     before(grammarAccess.getModelAccess().getOptionsAssignment_2()); 
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:611:1: ( rule__Model__OptionsAssignment_2 )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:611:2: rule__Model__OptionsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Model__OptionsAssignment_2_in_rule__Model__Alternatives1247);
                    rule__Model__OptionsAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getOptionsAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:615:6: ( ( rule__Model__ElementsAssignment_3 ) )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:615:6: ( ( rule__Model__ElementsAssignment_3 ) )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:616:1: ( rule__Model__ElementsAssignment_3 )
                    {
                     before(grammarAccess.getModelAccess().getElementsAssignment_3()); 
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:617:1: ( rule__Model__ElementsAssignment_3 )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:617:2: rule__Model__ElementsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Model__ElementsAssignment_3_in_rule__Model__Alternatives1265);
                    rule__Model__ElementsAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getElementsAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:621:6: ( ( rule__Model__CommAssignment_4 ) )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:621:6: ( ( rule__Model__CommAssignment_4 ) )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:622:1: ( rule__Model__CommAssignment_4 )
                    {
                     before(grammarAccess.getModelAccess().getCommAssignment_4()); 
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:623:1: ( rule__Model__CommAssignment_4 )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:623:2: rule__Model__CommAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Model__CommAssignment_4_in_rule__Model__Alternatives1283);
                    rule__Model__CommAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getCommAssignment_4()); 

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
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__Element__Alternatives"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:632:1: rule__Element__Alternatives : ( ( ruleType ) | ( ruleMap ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:636:1: ( ( ruleType ) | ( ruleMap ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_MESSAGE && LA3_0<=RULE_ENUM)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_MAP_KIND) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:637:1: ( ruleType )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:637:1: ( ruleType )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:638:1: ruleType
                    {
                     before(grammarAccess.getElementAccess().getTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleType_in_rule__Element__Alternatives1316);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:643:6: ( ruleMap )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:643:6: ( ruleMap )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:644:1: ruleMap
                    {
                     before(grammarAccess.getElementAccess().getMapParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMap_in_rule__Element__Alternatives1333);
                    ruleMap();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getMapParserRuleCall_1()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:654:1: rule__Type__Alternatives : ( ( ruleMessageType ) | ( ruleEnumType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:658:1: ( ( ruleMessageType ) | ( ruleEnumType ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_MESSAGE) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ENUM) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:659:1: ( ruleMessageType )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:659:1: ( ruleMessageType )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:660:1: ruleMessageType
                    {
                     before(grammarAccess.getTypeAccess().getMessageTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMessageType_in_rule__Type__Alternatives1365);
                    ruleMessageType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getMessageTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:665:6: ( ruleEnumType )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:665:6: ( ruleEnumType )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:666:1: ruleEnumType
                    {
                     before(grammarAccess.getTypeAccess().getEnumTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEnumType_in_rule__Type__Alternatives1382);
                    ruleEnumType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEnumTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Map__Alternatives_5"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:676:1: rule__Map__Alternatives_5 : ( ( ( rule__Map__CommAssignment_5_0 ) ) | ( ( rule__Map__FieldsAssignment_5_1 ) ) );
    public final void rule__Map__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:680:1: ( ( ( rule__Map__CommAssignment_5_0 ) ) | ( ( rule__Map__FieldsAssignment_5_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_COMMENT_SL && LA5_0<=RULE_COMMENT_ML)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_FIELD_ATTR) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:681:1: ( ( rule__Map__CommAssignment_5_0 ) )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:681:1: ( ( rule__Map__CommAssignment_5_0 ) )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:682:1: ( rule__Map__CommAssignment_5_0 )
                    {
                     before(grammarAccess.getMapAccess().getCommAssignment_5_0()); 
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:683:1: ( rule__Map__CommAssignment_5_0 )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:683:2: rule__Map__CommAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__Map__CommAssignment_5_0_in_rule__Map__Alternatives_51414);
                    rule__Map__CommAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapAccess().getCommAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:687:6: ( ( rule__Map__FieldsAssignment_5_1 ) )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:687:6: ( ( rule__Map__FieldsAssignment_5_1 ) )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:688:1: ( rule__Map__FieldsAssignment_5_1 )
                    {
                     before(grammarAccess.getMapAccess().getFieldsAssignment_5_1()); 
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:689:1: ( rule__Map__FieldsAssignment_5_1 )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:689:2: rule__Map__FieldsAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__Map__FieldsAssignment_5_1_in_rule__Map__Alternatives_51432);
                    rule__Map__FieldsAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapAccess().getFieldsAssignment_5_1()); 

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
    // $ANTLR end "rule__Map__Alternatives_5"


    // $ANTLR start "rule__MessageType__Alternatives_3"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:698:1: rule__MessageType__Alternatives_3 : ( ( ( rule__MessageType__CommAssignment_3_0 ) ) | ( ( rule__MessageType__FieldsAssignment_3_1 ) ) | ( ( rule__MessageType__TypesAssignment_3_2 ) ) );
    public final void rule__MessageType__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:702:1: ( ( ( rule__MessageType__CommAssignment_3_0 ) ) | ( ( rule__MessageType__FieldsAssignment_3_1 ) ) | ( ( rule__MessageType__TypesAssignment_3_2 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_COMMENT_SL:
            case RULE_COMMENT_ML:
                {
                alt6=1;
                }
                break;
            case RULE_FIELD_ATTR:
                {
                alt6=2;
                }
                break;
            case RULE_MESSAGE:
            case RULE_ENUM:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:703:1: ( ( rule__MessageType__CommAssignment_3_0 ) )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:703:1: ( ( rule__MessageType__CommAssignment_3_0 ) )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:704:1: ( rule__MessageType__CommAssignment_3_0 )
                    {
                     before(grammarAccess.getMessageTypeAccess().getCommAssignment_3_0()); 
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:705:1: ( rule__MessageType__CommAssignment_3_0 )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:705:2: rule__MessageType__CommAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__MessageType__CommAssignment_3_0_in_rule__MessageType__Alternatives_31465);
                    rule__MessageType__CommAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMessageTypeAccess().getCommAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:709:6: ( ( rule__MessageType__FieldsAssignment_3_1 ) )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:709:6: ( ( rule__MessageType__FieldsAssignment_3_1 ) )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:710:1: ( rule__MessageType__FieldsAssignment_3_1 )
                    {
                     before(grammarAccess.getMessageTypeAccess().getFieldsAssignment_3_1()); 
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:711:1: ( rule__MessageType__FieldsAssignment_3_1 )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:711:2: rule__MessageType__FieldsAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__MessageType__FieldsAssignment_3_1_in_rule__MessageType__Alternatives_31483);
                    rule__MessageType__FieldsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMessageTypeAccess().getFieldsAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:715:6: ( ( rule__MessageType__TypesAssignment_3_2 ) )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:715:6: ( ( rule__MessageType__TypesAssignment_3_2 ) )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:716:1: ( rule__MessageType__TypesAssignment_3_2 )
                    {
                     before(grammarAccess.getMessageTypeAccess().getTypesAssignment_3_2()); 
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:717:1: ( rule__MessageType__TypesAssignment_3_2 )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:717:2: rule__MessageType__TypesAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__MessageType__TypesAssignment_3_2_in_rule__MessageType__Alternatives_31501);
                    rule__MessageType__TypesAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMessageTypeAccess().getTypesAssignment_3_2()); 

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
    // $ANTLR end "rule__MessageType__Alternatives_3"


    // $ANTLR start "rule__MessageField__Alternatives"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:726:1: rule__MessageField__Alternatives : ( ( ruleMessageSimpleField ) | ( ruleMessageComplexField ) );
    public final void rule__MessageField__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:730:1: ( ( ruleMessageSimpleField ) | ( ruleMessageComplexField ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_FIELD_ATTR) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_IDENTITY) ) {
                    alt7=2;
                }
                else if ( (LA7_1==RULE_FIELD_TYPE) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:731:1: ( ruleMessageSimpleField )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:731:1: ( ruleMessageSimpleField )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:732:1: ruleMessageSimpleField
                    {
                     before(grammarAccess.getMessageFieldAccess().getMessageSimpleFieldParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMessageSimpleField_in_rule__MessageField__Alternatives1534);
                    ruleMessageSimpleField();

                    state._fsp--;

                     after(grammarAccess.getMessageFieldAccess().getMessageSimpleFieldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:737:6: ( ruleMessageComplexField )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:737:6: ( ruleMessageComplexField )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:738:1: ruleMessageComplexField
                    {
                     before(grammarAccess.getMessageFieldAccess().getMessageComplexFieldParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMessageComplexField_in_rule__MessageField__Alternatives1551);
                    ruleMessageComplexField();

                    state._fsp--;

                     after(grammarAccess.getMessageFieldAccess().getMessageComplexFieldParserRuleCall_1()); 

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
    // $ANTLR end "rule__MessageField__Alternatives"


    // $ANTLR start "rule__MessageFieldDefault__Alternatives_3"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:748:1: rule__MessageFieldDefault__Alternatives_3 : ( ( RULE_NUMBER ) | ( RULE_IDENTITY ) );
    public final void rule__MessageFieldDefault__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:752:1: ( ( RULE_NUMBER ) | ( RULE_IDENTITY ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_NUMBER) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_IDENTITY) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:753:1: ( RULE_NUMBER )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:753:1: ( RULE_NUMBER )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:754:1: RULE_NUMBER
                    {
                     before(grammarAccess.getMessageFieldDefaultAccess().getNUMBERTerminalRuleCall_3_0()); 
                    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__MessageFieldDefault__Alternatives_31583); 
                     after(grammarAccess.getMessageFieldDefaultAccess().getNUMBERTerminalRuleCall_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:759:6: ( RULE_IDENTITY )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:759:6: ( RULE_IDENTITY )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:760:1: RULE_IDENTITY
                    {
                     before(grammarAccess.getMessageFieldDefaultAccess().getIDENTITYTerminalRuleCall_3_1()); 
                    match(input,RULE_IDENTITY,FOLLOW_RULE_IDENTITY_in_rule__MessageFieldDefault__Alternatives_31600); 
                     after(grammarAccess.getMessageFieldDefaultAccess().getIDENTITYTerminalRuleCall_3_1()); 

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
    // $ANTLR end "rule__MessageFieldDefault__Alternatives_3"


    // $ANTLR start "rule__EnumType__Alternatives_3"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:770:1: rule__EnumType__Alternatives_3 : ( ( ( rule__EnumType__CommAssignment_3_0 ) ) | ( ( rule__EnumType__FieldsAssignment_3_1 ) ) | ( ( rule__EnumType__OptionsAssignment_3_2 ) ) );
    public final void rule__EnumType__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:774:1: ( ( ( rule__EnumType__CommAssignment_3_0 ) ) | ( ( rule__EnumType__FieldsAssignment_3_1 ) ) | ( ( rule__EnumType__OptionsAssignment_3_2 ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_COMMENT_SL:
            case RULE_COMMENT_ML:
                {
                alt9=1;
                }
                break;
            case RULE_IDENTITY:
            case RULE_FIELD_ATTR:
            case RULE_FIELD_TYPE:
            case RULE_PACKAGE:
            case RULE_IMPORT:
            case RULE_MESSAGE:
            case RULE_ENUM:
            case RULE_MAP_KIND:
            case RULE_DEFAULT_KIND:
                {
                alt9=2;
                }
                break;
            case RULE_OPTION:
                {
                int LA9_3 = input.LA(2);

                if ( ((LA9_3>=RULE_IDENTITY && LA9_3<=RULE_DEFAULT_KIND)) ) {
                    alt9=3;
                }
                else if ( (LA9_3==RULE_EQUALS) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:775:1: ( ( rule__EnumType__CommAssignment_3_0 ) )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:775:1: ( ( rule__EnumType__CommAssignment_3_0 ) )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:776:1: ( rule__EnumType__CommAssignment_3_0 )
                    {
                     before(grammarAccess.getEnumTypeAccess().getCommAssignment_3_0()); 
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:777:1: ( rule__EnumType__CommAssignment_3_0 )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:777:2: rule__EnumType__CommAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__EnumType__CommAssignment_3_0_in_rule__EnumType__Alternatives_31632);
                    rule__EnumType__CommAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnumTypeAccess().getCommAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:781:6: ( ( rule__EnumType__FieldsAssignment_3_1 ) )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:781:6: ( ( rule__EnumType__FieldsAssignment_3_1 ) )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:782:1: ( rule__EnumType__FieldsAssignment_3_1 )
                    {
                     before(grammarAccess.getEnumTypeAccess().getFieldsAssignment_3_1()); 
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:783:1: ( rule__EnumType__FieldsAssignment_3_1 )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:783:2: rule__EnumType__FieldsAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__EnumType__FieldsAssignment_3_1_in_rule__EnumType__Alternatives_31650);
                    rule__EnumType__FieldsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnumTypeAccess().getFieldsAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:787:6: ( ( rule__EnumType__OptionsAssignment_3_2 ) )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:787:6: ( ( rule__EnumType__OptionsAssignment_3_2 ) )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:788:1: ( rule__EnumType__OptionsAssignment_3_2 )
                    {
                     before(grammarAccess.getEnumTypeAccess().getOptionsAssignment_3_2()); 
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:789:1: ( rule__EnumType__OptionsAssignment_3_2 )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:789:2: rule__EnumType__OptionsAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__EnumType__OptionsAssignment_3_2_in_rule__EnumType__Alternatives_31668);
                    rule__EnumType__OptionsAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnumTypeAccess().getOptionsAssignment_3_2()); 

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
    // $ANTLR end "rule__EnumType__Alternatives_3"


    // $ANTLR start "rule__ENTITY_NAME__Alternatives"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:798:1: rule__ENTITY_NAME__Alternatives : ( ( RULE_FIELD_ATTR ) | ( RULE_FIELD_TYPE ) | ( RULE_IDENTITY ) | ( RULE_PACKAGE ) | ( RULE_IMPORT ) | ( RULE_OPTION ) | ( RULE_MESSAGE ) | ( RULE_ENUM ) | ( RULE_MAP_KIND ) | ( RULE_DEFAULT_KIND ) );
    public final void rule__ENTITY_NAME__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:802:1: ( ( RULE_FIELD_ATTR ) | ( RULE_FIELD_TYPE ) | ( RULE_IDENTITY ) | ( RULE_PACKAGE ) | ( RULE_IMPORT ) | ( RULE_OPTION ) | ( RULE_MESSAGE ) | ( RULE_ENUM ) | ( RULE_MAP_KIND ) | ( RULE_DEFAULT_KIND ) )
            int alt10=10;
            switch ( input.LA(1) ) {
            case RULE_FIELD_ATTR:
                {
                alt10=1;
                }
                break;
            case RULE_FIELD_TYPE:
                {
                alt10=2;
                }
                break;
            case RULE_IDENTITY:
                {
                alt10=3;
                }
                break;
            case RULE_PACKAGE:
                {
                alt10=4;
                }
                break;
            case RULE_IMPORT:
                {
                alt10=5;
                }
                break;
            case RULE_OPTION:
                {
                alt10=6;
                }
                break;
            case RULE_MESSAGE:
                {
                alt10=7;
                }
                break;
            case RULE_ENUM:
                {
                alt10=8;
                }
                break;
            case RULE_MAP_KIND:
                {
                alt10=9;
                }
                break;
            case RULE_DEFAULT_KIND:
                {
                alt10=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:803:1: ( RULE_FIELD_ATTR )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:803:1: ( RULE_FIELD_ATTR )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:804:1: RULE_FIELD_ATTR
                    {
                     before(grammarAccess.getENTITY_NAMEAccess().getFIELD_ATTRTerminalRuleCall_0()); 
                    match(input,RULE_FIELD_ATTR,FOLLOW_RULE_FIELD_ATTR_in_rule__ENTITY_NAME__Alternatives1701); 
                     after(grammarAccess.getENTITY_NAMEAccess().getFIELD_ATTRTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:809:6: ( RULE_FIELD_TYPE )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:809:6: ( RULE_FIELD_TYPE )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:810:1: RULE_FIELD_TYPE
                    {
                     before(grammarAccess.getENTITY_NAMEAccess().getFIELD_TYPETerminalRuleCall_1()); 
                    match(input,RULE_FIELD_TYPE,FOLLOW_RULE_FIELD_TYPE_in_rule__ENTITY_NAME__Alternatives1718); 
                     after(grammarAccess.getENTITY_NAMEAccess().getFIELD_TYPETerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:815:6: ( RULE_IDENTITY )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:815:6: ( RULE_IDENTITY )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:816:1: RULE_IDENTITY
                    {
                     before(grammarAccess.getENTITY_NAMEAccess().getIDENTITYTerminalRuleCall_2()); 
                    match(input,RULE_IDENTITY,FOLLOW_RULE_IDENTITY_in_rule__ENTITY_NAME__Alternatives1735); 
                     after(grammarAccess.getENTITY_NAMEAccess().getIDENTITYTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:821:6: ( RULE_PACKAGE )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:821:6: ( RULE_PACKAGE )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:822:1: RULE_PACKAGE
                    {
                     before(grammarAccess.getENTITY_NAMEAccess().getPACKAGETerminalRuleCall_3()); 
                    match(input,RULE_PACKAGE,FOLLOW_RULE_PACKAGE_in_rule__ENTITY_NAME__Alternatives1752); 
                     after(grammarAccess.getENTITY_NAMEAccess().getPACKAGETerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:827:6: ( RULE_IMPORT )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:827:6: ( RULE_IMPORT )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:828:1: RULE_IMPORT
                    {
                     before(grammarAccess.getENTITY_NAMEAccess().getIMPORTTerminalRuleCall_4()); 
                    match(input,RULE_IMPORT,FOLLOW_RULE_IMPORT_in_rule__ENTITY_NAME__Alternatives1769); 
                     after(grammarAccess.getENTITY_NAMEAccess().getIMPORTTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:833:6: ( RULE_OPTION )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:833:6: ( RULE_OPTION )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:834:1: RULE_OPTION
                    {
                     before(grammarAccess.getENTITY_NAMEAccess().getOPTIONTerminalRuleCall_5()); 
                    match(input,RULE_OPTION,FOLLOW_RULE_OPTION_in_rule__ENTITY_NAME__Alternatives1786); 
                     after(grammarAccess.getENTITY_NAMEAccess().getOPTIONTerminalRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:839:6: ( RULE_MESSAGE )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:839:6: ( RULE_MESSAGE )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:840:1: RULE_MESSAGE
                    {
                     before(grammarAccess.getENTITY_NAMEAccess().getMESSAGETerminalRuleCall_6()); 
                    match(input,RULE_MESSAGE,FOLLOW_RULE_MESSAGE_in_rule__ENTITY_NAME__Alternatives1803); 
                     after(grammarAccess.getENTITY_NAMEAccess().getMESSAGETerminalRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:845:6: ( RULE_ENUM )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:845:6: ( RULE_ENUM )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:846:1: RULE_ENUM
                    {
                     before(grammarAccess.getENTITY_NAMEAccess().getENUMTerminalRuleCall_7()); 
                    match(input,RULE_ENUM,FOLLOW_RULE_ENUM_in_rule__ENTITY_NAME__Alternatives1820); 
                     after(grammarAccess.getENTITY_NAMEAccess().getENUMTerminalRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:851:6: ( RULE_MAP_KIND )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:851:6: ( RULE_MAP_KIND )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:852:1: RULE_MAP_KIND
                    {
                     before(grammarAccess.getENTITY_NAMEAccess().getMAP_KINDTerminalRuleCall_8()); 
                    match(input,RULE_MAP_KIND,FOLLOW_RULE_MAP_KIND_in_rule__ENTITY_NAME__Alternatives1837); 
                     after(grammarAccess.getENTITY_NAMEAccess().getMAP_KINDTerminalRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:857:6: ( RULE_DEFAULT_KIND )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:857:6: ( RULE_DEFAULT_KIND )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:858:1: RULE_DEFAULT_KIND
                    {
                     before(grammarAccess.getENTITY_NAMEAccess().getDEFAULT_KINDTerminalRuleCall_9()); 
                    match(input,RULE_DEFAULT_KIND,FOLLOW_RULE_DEFAULT_KIND_in_rule__ENTITY_NAME__Alternatives1854); 
                     after(grammarAccess.getENTITY_NAMEAccess().getDEFAULT_KINDTerminalRuleCall_9()); 

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
    // $ANTLR end "rule__ENTITY_NAME__Alternatives"


    // $ANTLR start "rule__Comment_ALL__Alternatives"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:868:1: rule__Comment_ALL__Alternatives : ( ( ( rule__Comment_ALL__TextAssignment_0 ) ) | ( ( rule__Comment_ALL__TextAssignment_1 ) ) );
    public final void rule__Comment_ALL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:872:1: ( ( ( rule__Comment_ALL__TextAssignment_0 ) ) | ( ( rule__Comment_ALL__TextAssignment_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_COMMENT_SL) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_COMMENT_ML) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:873:1: ( ( rule__Comment_ALL__TextAssignment_0 ) )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:873:1: ( ( rule__Comment_ALL__TextAssignment_0 ) )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:874:1: ( rule__Comment_ALL__TextAssignment_0 )
                    {
                     before(grammarAccess.getComment_ALLAccess().getTextAssignment_0()); 
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:875:1: ( rule__Comment_ALL__TextAssignment_0 )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:875:2: rule__Comment_ALL__TextAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Comment_ALL__TextAssignment_0_in_rule__Comment_ALL__Alternatives1886);
                    rule__Comment_ALL__TextAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComment_ALLAccess().getTextAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:879:6: ( ( rule__Comment_ALL__TextAssignment_1 ) )
                    {
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:879:6: ( ( rule__Comment_ALL__TextAssignment_1 ) )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:880:1: ( rule__Comment_ALL__TextAssignment_1 )
                    {
                     before(grammarAccess.getComment_ALLAccess().getTextAssignment_1()); 
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:881:1: ( rule__Comment_ALL__TextAssignment_1 )
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:881:2: rule__Comment_ALL__TextAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Comment_ALL__TextAssignment_1_in_rule__Comment_ALL__Alternatives1904);
                    rule__Comment_ALL__TextAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getComment_ALLAccess().getTextAssignment_1()); 

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
    // $ANTLR end "rule__Comment_ALL__Alternatives"


    // $ANTLR start "rule__Model__Group_0__0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:892:1: rule__Model__Group_0__0 : rule__Model__Group_0__0__Impl rule__Model__Group_0__1 ;
    public final void rule__Model__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:896:1: ( rule__Model__Group_0__0__Impl rule__Model__Group_0__1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:897:2: rule__Model__Group_0__0__Impl rule__Model__Group_0__1
            {
            pushFollow(FOLLOW_rule__Model__Group_0__0__Impl_in_rule__Model__Group_0__01935);
            rule__Model__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_0__1_in_rule__Model__Group_0__01938);
            rule__Model__Group_0__1();

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
    // $ANTLR end "rule__Model__Group_0__0"


    // $ANTLR start "rule__Model__Group_0__0__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:904:1: rule__Model__Group_0__0__Impl : ( RULE_PACKAGE ) ;
    public final void rule__Model__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:908:1: ( ( RULE_PACKAGE ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:909:1: ( RULE_PACKAGE )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:909:1: ( RULE_PACKAGE )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:910:1: RULE_PACKAGE
            {
             before(grammarAccess.getModelAccess().getPACKAGETerminalRuleCall_0_0()); 
            match(input,RULE_PACKAGE,FOLLOW_RULE_PACKAGE_in_rule__Model__Group_0__0__Impl1965); 
             after(grammarAccess.getModelAccess().getPACKAGETerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__0__Impl"


    // $ANTLR start "rule__Model__Group_0__1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:921:1: rule__Model__Group_0__1 : rule__Model__Group_0__1__Impl rule__Model__Group_0__2 ;
    public final void rule__Model__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:925:1: ( rule__Model__Group_0__1__Impl rule__Model__Group_0__2 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:926:2: rule__Model__Group_0__1__Impl rule__Model__Group_0__2
            {
            pushFollow(FOLLOW_rule__Model__Group_0__1__Impl_in_rule__Model__Group_0__11994);
            rule__Model__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group_0__2_in_rule__Model__Group_0__11997);
            rule__Model__Group_0__2();

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
    // $ANTLR end "rule__Model__Group_0__1"


    // $ANTLR start "rule__Model__Group_0__1__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:933:1: rule__Model__Group_0__1__Impl : ( ( rule__Model__NameAssignment_0_1 ) ) ;
    public final void rule__Model__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:937:1: ( ( ( rule__Model__NameAssignment_0_1 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:938:1: ( ( rule__Model__NameAssignment_0_1 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:938:1: ( ( rule__Model__NameAssignment_0_1 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:939:1: ( rule__Model__NameAssignment_0_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_0_1()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:940:1: ( rule__Model__NameAssignment_0_1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:940:2: rule__Model__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_0_1_in_rule__Model__Group_0__1__Impl2024);
            rule__Model__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__1__Impl"


    // $ANTLR start "rule__Model__Group_0__2"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:950:1: rule__Model__Group_0__2 : rule__Model__Group_0__2__Impl ;
    public final void rule__Model__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:954:1: ( rule__Model__Group_0__2__Impl )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:955:2: rule__Model__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_0__2__Impl_in_rule__Model__Group_0__22054);
            rule__Model__Group_0__2__Impl();

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
    // $ANTLR end "rule__Model__Group_0__2"


    // $ANTLR start "rule__Model__Group_0__2__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:961:1: rule__Model__Group_0__2__Impl : ( ( RULE_END )? ) ;
    public final void rule__Model__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:965:1: ( ( ( RULE_END )? ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:966:1: ( ( RULE_END )? )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:966:1: ( ( RULE_END )? )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:967:1: ( RULE_END )?
            {
             before(grammarAccess.getModelAccess().getENDTerminalRuleCall_0_2()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:968:1: ( RULE_END )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_END) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:968:3: RULE_END
                    {
                    match(input,RULE_END,FOLLOW_RULE_END_in_rule__Model__Group_0__2__Impl2082); 

                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getENDTerminalRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__2__Impl"


    // $ANTLR start "rule__ImportInfo__Group__0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:984:1: rule__ImportInfo__Group__0 : rule__ImportInfo__Group__0__Impl rule__ImportInfo__Group__1 ;
    public final void rule__ImportInfo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:988:1: ( rule__ImportInfo__Group__0__Impl rule__ImportInfo__Group__1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:989:2: rule__ImportInfo__Group__0__Impl rule__ImportInfo__Group__1
            {
            pushFollow(FOLLOW_rule__ImportInfo__Group__0__Impl_in_rule__ImportInfo__Group__02119);
            rule__ImportInfo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportInfo__Group__1_in_rule__ImportInfo__Group__02122);
            rule__ImportInfo__Group__1();

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
    // $ANTLR end "rule__ImportInfo__Group__0"


    // $ANTLR start "rule__ImportInfo__Group__0__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:996:1: rule__ImportInfo__Group__0__Impl : ( RULE_IMPORT ) ;
    public final void rule__ImportInfo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1000:1: ( ( RULE_IMPORT ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1001:1: ( RULE_IMPORT )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1001:1: ( RULE_IMPORT )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1002:1: RULE_IMPORT
            {
             before(grammarAccess.getImportInfoAccess().getIMPORTTerminalRuleCall_0()); 
            match(input,RULE_IMPORT,FOLLOW_RULE_IMPORT_in_rule__ImportInfo__Group__0__Impl2149); 
             after(grammarAccess.getImportInfoAccess().getIMPORTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportInfo__Group__0__Impl"


    // $ANTLR start "rule__ImportInfo__Group__1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1013:1: rule__ImportInfo__Group__1 : rule__ImportInfo__Group__1__Impl rule__ImportInfo__Group__2 ;
    public final void rule__ImportInfo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1017:1: ( rule__ImportInfo__Group__1__Impl rule__ImportInfo__Group__2 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1018:2: rule__ImportInfo__Group__1__Impl rule__ImportInfo__Group__2
            {
            pushFollow(FOLLOW_rule__ImportInfo__Group__1__Impl_in_rule__ImportInfo__Group__12178);
            rule__ImportInfo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportInfo__Group__2_in_rule__ImportInfo__Group__12181);
            rule__ImportInfo__Group__2();

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
    // $ANTLR end "rule__ImportInfo__Group__1"


    // $ANTLR start "rule__ImportInfo__Group__1__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1025:1: rule__ImportInfo__Group__1__Impl : ( ( rule__ImportInfo__ImportURIAssignment_1 ) ) ;
    public final void rule__ImportInfo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1029:1: ( ( ( rule__ImportInfo__ImportURIAssignment_1 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1030:1: ( ( rule__ImportInfo__ImportURIAssignment_1 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1030:1: ( ( rule__ImportInfo__ImportURIAssignment_1 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1031:1: ( rule__ImportInfo__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportInfoAccess().getImportURIAssignment_1()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1032:1: ( rule__ImportInfo__ImportURIAssignment_1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1032:2: rule__ImportInfo__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__ImportInfo__ImportURIAssignment_1_in_rule__ImportInfo__Group__1__Impl2208);
            rule__ImportInfo__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportInfoAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportInfo__Group__1__Impl"


    // $ANTLR start "rule__ImportInfo__Group__2"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1042:1: rule__ImportInfo__Group__2 : rule__ImportInfo__Group__2__Impl ;
    public final void rule__ImportInfo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1046:1: ( rule__ImportInfo__Group__2__Impl )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1047:2: rule__ImportInfo__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ImportInfo__Group__2__Impl_in_rule__ImportInfo__Group__22238);
            rule__ImportInfo__Group__2__Impl();

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
    // $ANTLR end "rule__ImportInfo__Group__2"


    // $ANTLR start "rule__ImportInfo__Group__2__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1053:1: rule__ImportInfo__Group__2__Impl : ( ( RULE_END )? ) ;
    public final void rule__ImportInfo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1057:1: ( ( ( RULE_END )? ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1058:1: ( ( RULE_END )? )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1058:1: ( ( RULE_END )? )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1059:1: ( RULE_END )?
            {
             before(grammarAccess.getImportInfoAccess().getENDTerminalRuleCall_2()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1060:1: ( RULE_END )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_END) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1060:3: RULE_END
                    {
                    match(input,RULE_END,FOLLOW_RULE_END_in_rule__ImportInfo__Group__2__Impl2266); 

                    }
                    break;

            }

             after(grammarAccess.getImportInfoAccess().getENDTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportInfo__Group__2__Impl"


    // $ANTLR start "rule__OptionInfo__Group__0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1076:1: rule__OptionInfo__Group__0 : rule__OptionInfo__Group__0__Impl rule__OptionInfo__Group__1 ;
    public final void rule__OptionInfo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1080:1: ( rule__OptionInfo__Group__0__Impl rule__OptionInfo__Group__1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1081:2: rule__OptionInfo__Group__0__Impl rule__OptionInfo__Group__1
            {
            pushFollow(FOLLOW_rule__OptionInfo__Group__0__Impl_in_rule__OptionInfo__Group__02303);
            rule__OptionInfo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionInfo__Group__1_in_rule__OptionInfo__Group__02306);
            rule__OptionInfo__Group__1();

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
    // $ANTLR end "rule__OptionInfo__Group__0"


    // $ANTLR start "rule__OptionInfo__Group__0__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1088:1: rule__OptionInfo__Group__0__Impl : ( RULE_OPTION ) ;
    public final void rule__OptionInfo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1092:1: ( ( RULE_OPTION ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1093:1: ( RULE_OPTION )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1093:1: ( RULE_OPTION )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1094:1: RULE_OPTION
            {
             before(grammarAccess.getOptionInfoAccess().getOPTIONTerminalRuleCall_0()); 
            match(input,RULE_OPTION,FOLLOW_RULE_OPTION_in_rule__OptionInfo__Group__0__Impl2333); 
             after(grammarAccess.getOptionInfoAccess().getOPTIONTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionInfo__Group__0__Impl"


    // $ANTLR start "rule__OptionInfo__Group__1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1105:1: rule__OptionInfo__Group__1 : rule__OptionInfo__Group__1__Impl rule__OptionInfo__Group__2 ;
    public final void rule__OptionInfo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1109:1: ( rule__OptionInfo__Group__1__Impl rule__OptionInfo__Group__2 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1110:2: rule__OptionInfo__Group__1__Impl rule__OptionInfo__Group__2
            {
            pushFollow(FOLLOW_rule__OptionInfo__Group__1__Impl_in_rule__OptionInfo__Group__12362);
            rule__OptionInfo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionInfo__Group__2_in_rule__OptionInfo__Group__12365);
            rule__OptionInfo__Group__2();

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
    // $ANTLR end "rule__OptionInfo__Group__1"


    // $ANTLR start "rule__OptionInfo__Group__1__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1117:1: rule__OptionInfo__Group__1__Impl : ( ( rule__OptionInfo__NameAssignment_1 ) ) ;
    public final void rule__OptionInfo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1121:1: ( ( ( rule__OptionInfo__NameAssignment_1 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1122:1: ( ( rule__OptionInfo__NameAssignment_1 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1122:1: ( ( rule__OptionInfo__NameAssignment_1 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1123:1: ( rule__OptionInfo__NameAssignment_1 )
            {
             before(grammarAccess.getOptionInfoAccess().getNameAssignment_1()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1124:1: ( rule__OptionInfo__NameAssignment_1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1124:2: rule__OptionInfo__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__OptionInfo__NameAssignment_1_in_rule__OptionInfo__Group__1__Impl2392);
            rule__OptionInfo__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionInfoAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionInfo__Group__1__Impl"


    // $ANTLR start "rule__OptionInfo__Group__2"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1134:1: rule__OptionInfo__Group__2 : rule__OptionInfo__Group__2__Impl rule__OptionInfo__Group__3 ;
    public final void rule__OptionInfo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1138:1: ( rule__OptionInfo__Group__2__Impl rule__OptionInfo__Group__3 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1139:2: rule__OptionInfo__Group__2__Impl rule__OptionInfo__Group__3
            {
            pushFollow(FOLLOW_rule__OptionInfo__Group__2__Impl_in_rule__OptionInfo__Group__22422);
            rule__OptionInfo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionInfo__Group__3_in_rule__OptionInfo__Group__22425);
            rule__OptionInfo__Group__3();

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
    // $ANTLR end "rule__OptionInfo__Group__2"


    // $ANTLR start "rule__OptionInfo__Group__2__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1146:1: rule__OptionInfo__Group__2__Impl : ( RULE_EQUALS ) ;
    public final void rule__OptionInfo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1150:1: ( ( RULE_EQUALS ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1151:1: ( RULE_EQUALS )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1151:1: ( RULE_EQUALS )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1152:1: RULE_EQUALS
            {
             before(grammarAccess.getOptionInfoAccess().getEQUALSTerminalRuleCall_2()); 
            match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_rule__OptionInfo__Group__2__Impl2452); 
             after(grammarAccess.getOptionInfoAccess().getEQUALSTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionInfo__Group__2__Impl"


    // $ANTLR start "rule__OptionInfo__Group__3"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1163:1: rule__OptionInfo__Group__3 : rule__OptionInfo__Group__3__Impl rule__OptionInfo__Group__4 ;
    public final void rule__OptionInfo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1167:1: ( rule__OptionInfo__Group__3__Impl rule__OptionInfo__Group__4 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1168:2: rule__OptionInfo__Group__3__Impl rule__OptionInfo__Group__4
            {
            pushFollow(FOLLOW_rule__OptionInfo__Group__3__Impl_in_rule__OptionInfo__Group__32481);
            rule__OptionInfo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionInfo__Group__4_in_rule__OptionInfo__Group__32484);
            rule__OptionInfo__Group__4();

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
    // $ANTLR end "rule__OptionInfo__Group__3"


    // $ANTLR start "rule__OptionInfo__Group__3__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1175:1: rule__OptionInfo__Group__3__Impl : ( ( rule__OptionInfo__ValueAssignment_3 ) ) ;
    public final void rule__OptionInfo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1179:1: ( ( ( rule__OptionInfo__ValueAssignment_3 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1180:1: ( ( rule__OptionInfo__ValueAssignment_3 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1180:1: ( ( rule__OptionInfo__ValueAssignment_3 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1181:1: ( rule__OptionInfo__ValueAssignment_3 )
            {
             before(grammarAccess.getOptionInfoAccess().getValueAssignment_3()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1182:1: ( rule__OptionInfo__ValueAssignment_3 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1182:2: rule__OptionInfo__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__OptionInfo__ValueAssignment_3_in_rule__OptionInfo__Group__3__Impl2511);
            rule__OptionInfo__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOptionInfoAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionInfo__Group__3__Impl"


    // $ANTLR start "rule__OptionInfo__Group__4"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1192:1: rule__OptionInfo__Group__4 : rule__OptionInfo__Group__4__Impl ;
    public final void rule__OptionInfo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1196:1: ( rule__OptionInfo__Group__4__Impl )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1197:2: rule__OptionInfo__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__OptionInfo__Group__4__Impl_in_rule__OptionInfo__Group__42541);
            rule__OptionInfo__Group__4__Impl();

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
    // $ANTLR end "rule__OptionInfo__Group__4"


    // $ANTLR start "rule__OptionInfo__Group__4__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1203:1: rule__OptionInfo__Group__4__Impl : ( ( RULE_END )? ) ;
    public final void rule__OptionInfo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1207:1: ( ( ( RULE_END )? ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1208:1: ( ( RULE_END )? )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1208:1: ( ( RULE_END )? )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1209:1: ( RULE_END )?
            {
             before(grammarAccess.getOptionInfoAccess().getENDTerminalRuleCall_4()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1210:1: ( RULE_END )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_END) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1210:3: RULE_END
                    {
                    match(input,RULE_END,FOLLOW_RULE_END_in_rule__OptionInfo__Group__4__Impl2569); 

                    }
                    break;

            }

             after(grammarAccess.getOptionInfoAccess().getENDTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionInfo__Group__4__Impl"


    // $ANTLR start "rule__Map__Group__0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1230:1: rule__Map__Group__0 : rule__Map__Group__0__Impl rule__Map__Group__1 ;
    public final void rule__Map__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1234:1: ( rule__Map__Group__0__Impl rule__Map__Group__1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1235:2: rule__Map__Group__0__Impl rule__Map__Group__1
            {
            pushFollow(FOLLOW_rule__Map__Group__0__Impl_in_rule__Map__Group__02610);
            rule__Map__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Map__Group__1_in_rule__Map__Group__02613);
            rule__Map__Group__1();

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
    // $ANTLR end "rule__Map__Group__0"


    // $ANTLR start "rule__Map__Group__0__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1242:1: rule__Map__Group__0__Impl : ( RULE_MAP_KIND ) ;
    public final void rule__Map__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1246:1: ( ( RULE_MAP_KIND ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1247:1: ( RULE_MAP_KIND )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1247:1: ( RULE_MAP_KIND )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1248:1: RULE_MAP_KIND
            {
             before(grammarAccess.getMapAccess().getMAP_KINDTerminalRuleCall_0()); 
            match(input,RULE_MAP_KIND,FOLLOW_RULE_MAP_KIND_in_rule__Map__Group__0__Impl2640); 
             after(grammarAccess.getMapAccess().getMAP_KINDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__0__Impl"


    // $ANTLR start "rule__Map__Group__1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1259:1: rule__Map__Group__1 : rule__Map__Group__1__Impl rule__Map__Group__2 ;
    public final void rule__Map__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1263:1: ( rule__Map__Group__1__Impl rule__Map__Group__2 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1264:2: rule__Map__Group__1__Impl rule__Map__Group__2
            {
            pushFollow(FOLLOW_rule__Map__Group__1__Impl_in_rule__Map__Group__12669);
            rule__Map__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Map__Group__2_in_rule__Map__Group__12672);
            rule__Map__Group__2();

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
    // $ANTLR end "rule__Map__Group__1"


    // $ANTLR start "rule__Map__Group__1__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1271:1: rule__Map__Group__1__Impl : ( ( rule__Map__NameAssignment_1 ) ) ;
    public final void rule__Map__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1275:1: ( ( ( rule__Map__NameAssignment_1 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1276:1: ( ( rule__Map__NameAssignment_1 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1276:1: ( ( rule__Map__NameAssignment_1 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1277:1: ( rule__Map__NameAssignment_1 )
            {
             before(grammarAccess.getMapAccess().getNameAssignment_1()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1278:1: ( rule__Map__NameAssignment_1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1278:2: rule__Map__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Map__NameAssignment_1_in_rule__Map__Group__1__Impl2699);
            rule__Map__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMapAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__1__Impl"


    // $ANTLR start "rule__Map__Group__2"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1288:1: rule__Map__Group__2 : rule__Map__Group__2__Impl rule__Map__Group__3 ;
    public final void rule__Map__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1292:1: ( rule__Map__Group__2__Impl rule__Map__Group__3 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1293:2: rule__Map__Group__2__Impl rule__Map__Group__3
            {
            pushFollow(FOLLOW_rule__Map__Group__2__Impl_in_rule__Map__Group__22729);
            rule__Map__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Map__Group__3_in_rule__Map__Group__22732);
            rule__Map__Group__3();

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
    // $ANTLR end "rule__Map__Group__2"


    // $ANTLR start "rule__Map__Group__2__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1300:1: rule__Map__Group__2__Impl : ( RULE_FILETER_A ) ;
    public final void rule__Map__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1304:1: ( ( RULE_FILETER_A ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1305:1: ( RULE_FILETER_A )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1305:1: ( RULE_FILETER_A )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1306:1: RULE_FILETER_A
            {
             before(grammarAccess.getMapAccess().getFILETER_ATerminalRuleCall_2()); 
            match(input,RULE_FILETER_A,FOLLOW_RULE_FILETER_A_in_rule__Map__Group__2__Impl2759); 
             after(grammarAccess.getMapAccess().getFILETER_ATerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__2__Impl"


    // $ANTLR start "rule__Map__Group__3"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1317:1: rule__Map__Group__3 : rule__Map__Group__3__Impl rule__Map__Group__4 ;
    public final void rule__Map__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1321:1: ( rule__Map__Group__3__Impl rule__Map__Group__4 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1322:2: rule__Map__Group__3__Impl rule__Map__Group__4
            {
            pushFollow(FOLLOW_rule__Map__Group__3__Impl_in_rule__Map__Group__32788);
            rule__Map__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Map__Group__4_in_rule__Map__Group__32791);
            rule__Map__Group__4();

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
    // $ANTLR end "rule__Map__Group__3"


    // $ANTLR start "rule__Map__Group__3__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1329:1: rule__Map__Group__3__Impl : ( ( rule__Map__BindAssignment_3 ) ) ;
    public final void rule__Map__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1333:1: ( ( ( rule__Map__BindAssignment_3 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1334:1: ( ( rule__Map__BindAssignment_3 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1334:1: ( ( rule__Map__BindAssignment_3 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1335:1: ( rule__Map__BindAssignment_3 )
            {
             before(grammarAccess.getMapAccess().getBindAssignment_3()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1336:1: ( rule__Map__BindAssignment_3 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1336:2: rule__Map__BindAssignment_3
            {
            pushFollow(FOLLOW_rule__Map__BindAssignment_3_in_rule__Map__Group__3__Impl2818);
            rule__Map__BindAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMapAccess().getBindAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__3__Impl"


    // $ANTLR start "rule__Map__Group__4"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1346:1: rule__Map__Group__4 : rule__Map__Group__4__Impl rule__Map__Group__5 ;
    public final void rule__Map__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1350:1: ( rule__Map__Group__4__Impl rule__Map__Group__5 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1351:2: rule__Map__Group__4__Impl rule__Map__Group__5
            {
            pushFollow(FOLLOW_rule__Map__Group__4__Impl_in_rule__Map__Group__42848);
            rule__Map__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Map__Group__5_in_rule__Map__Group__42851);
            rule__Map__Group__5();

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
    // $ANTLR end "rule__Map__Group__4"


    // $ANTLR start "rule__Map__Group__4__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1358:1: rule__Map__Group__4__Impl : ( RULE_BRACE_L ) ;
    public final void rule__Map__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1362:1: ( ( RULE_BRACE_L ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1363:1: ( RULE_BRACE_L )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1363:1: ( RULE_BRACE_L )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1364:1: RULE_BRACE_L
            {
             before(grammarAccess.getMapAccess().getBRACE_LTerminalRuleCall_4()); 
            match(input,RULE_BRACE_L,FOLLOW_RULE_BRACE_L_in_rule__Map__Group__4__Impl2878); 
             after(grammarAccess.getMapAccess().getBRACE_LTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__4__Impl"


    // $ANTLR start "rule__Map__Group__5"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1375:1: rule__Map__Group__5 : rule__Map__Group__5__Impl rule__Map__Group__6 ;
    public final void rule__Map__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1379:1: ( rule__Map__Group__5__Impl rule__Map__Group__6 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1380:2: rule__Map__Group__5__Impl rule__Map__Group__6
            {
            pushFollow(FOLLOW_rule__Map__Group__5__Impl_in_rule__Map__Group__52907);
            rule__Map__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Map__Group__6_in_rule__Map__Group__52910);
            rule__Map__Group__6();

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
    // $ANTLR end "rule__Map__Group__5"


    // $ANTLR start "rule__Map__Group__5__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1387:1: rule__Map__Group__5__Impl : ( ( rule__Map__Alternatives_5 )* ) ;
    public final void rule__Map__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1391:1: ( ( ( rule__Map__Alternatives_5 )* ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1392:1: ( ( rule__Map__Alternatives_5 )* )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1392:1: ( ( rule__Map__Alternatives_5 )* )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1393:1: ( rule__Map__Alternatives_5 )*
            {
             before(grammarAccess.getMapAccess().getAlternatives_5()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1394:1: ( rule__Map__Alternatives_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_FIELD_ATTR||(LA15_0>=RULE_COMMENT_SL && LA15_0<=RULE_COMMENT_ML)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1394:2: rule__Map__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_rule__Map__Alternatives_5_in_rule__Map__Group__5__Impl2937);
            	    rule__Map__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMapAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__5__Impl"


    // $ANTLR start "rule__Map__Group__6"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1404:1: rule__Map__Group__6 : rule__Map__Group__6__Impl rule__Map__Group__7 ;
    public final void rule__Map__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1408:1: ( rule__Map__Group__6__Impl rule__Map__Group__7 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1409:2: rule__Map__Group__6__Impl rule__Map__Group__7
            {
            pushFollow(FOLLOW_rule__Map__Group__6__Impl_in_rule__Map__Group__62968);
            rule__Map__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Map__Group__7_in_rule__Map__Group__62971);
            rule__Map__Group__7();

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
    // $ANTLR end "rule__Map__Group__6"


    // $ANTLR start "rule__Map__Group__6__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1416:1: rule__Map__Group__6__Impl : ( RULE_BRACE_R ) ;
    public final void rule__Map__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1420:1: ( ( RULE_BRACE_R ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1421:1: ( RULE_BRACE_R )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1421:1: ( RULE_BRACE_R )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1422:1: RULE_BRACE_R
            {
             before(grammarAccess.getMapAccess().getBRACE_RTerminalRuleCall_6()); 
            match(input,RULE_BRACE_R,FOLLOW_RULE_BRACE_R_in_rule__Map__Group__6__Impl2998); 
             after(grammarAccess.getMapAccess().getBRACE_RTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__6__Impl"


    // $ANTLR start "rule__Map__Group__7"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1433:1: rule__Map__Group__7 : rule__Map__Group__7__Impl ;
    public final void rule__Map__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1437:1: ( rule__Map__Group__7__Impl )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1438:2: rule__Map__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Map__Group__7__Impl_in_rule__Map__Group__73027);
            rule__Map__Group__7__Impl();

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
    // $ANTLR end "rule__Map__Group__7"


    // $ANTLR start "rule__Map__Group__7__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1444:1: rule__Map__Group__7__Impl : ( ( RULE_END )? ) ;
    public final void rule__Map__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1448:1: ( ( ( RULE_END )? ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1449:1: ( ( RULE_END )? )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1449:1: ( ( RULE_END )? )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1450:1: ( RULE_END )?
            {
             before(grammarAccess.getMapAccess().getENDTerminalRuleCall_7()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1451:1: ( RULE_END )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_END) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1451:3: RULE_END
                    {
                    match(input,RULE_END,FOLLOW_RULE_END_in_rule__Map__Group__7__Impl3055); 

                    }
                    break;

            }

             after(grammarAccess.getMapAccess().getENDTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__7__Impl"


    // $ANTLR start "rule__MapField__Group__0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1477:1: rule__MapField__Group__0 : rule__MapField__Group__0__Impl rule__MapField__Group__1 ;
    public final void rule__MapField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1481:1: ( rule__MapField__Group__0__Impl rule__MapField__Group__1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1482:2: rule__MapField__Group__0__Impl rule__MapField__Group__1
            {
            pushFollow(FOLLOW_rule__MapField__Group__0__Impl_in_rule__MapField__Group__03102);
            rule__MapField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapField__Group__1_in_rule__MapField__Group__03105);
            rule__MapField__Group__1();

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
    // $ANTLR end "rule__MapField__Group__0"


    // $ANTLR start "rule__MapField__Group__0__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1489:1: rule__MapField__Group__0__Impl : ( ( rule__MapField__AttrAssignment_0 ) ) ;
    public final void rule__MapField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1493:1: ( ( ( rule__MapField__AttrAssignment_0 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1494:1: ( ( rule__MapField__AttrAssignment_0 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1494:1: ( ( rule__MapField__AttrAssignment_0 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1495:1: ( rule__MapField__AttrAssignment_0 )
            {
             before(grammarAccess.getMapFieldAccess().getAttrAssignment_0()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1496:1: ( rule__MapField__AttrAssignment_0 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1496:2: rule__MapField__AttrAssignment_0
            {
            pushFollow(FOLLOW_rule__MapField__AttrAssignment_0_in_rule__MapField__Group__0__Impl3132);
            rule__MapField__AttrAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMapFieldAccess().getAttrAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapField__Group__0__Impl"


    // $ANTLR start "rule__MapField__Group__1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1506:1: rule__MapField__Group__1 : rule__MapField__Group__1__Impl rule__MapField__Group__2 ;
    public final void rule__MapField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1510:1: ( rule__MapField__Group__1__Impl rule__MapField__Group__2 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1511:2: rule__MapField__Group__1__Impl rule__MapField__Group__2
            {
            pushFollow(FOLLOW_rule__MapField__Group__1__Impl_in_rule__MapField__Group__13162);
            rule__MapField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapField__Group__2_in_rule__MapField__Group__13165);
            rule__MapField__Group__2();

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
    // $ANTLR end "rule__MapField__Group__1"


    // $ANTLR start "rule__MapField__Group__1__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1518:1: rule__MapField__Group__1__Impl : ( ( rule__MapField__NameAssignment_1 ) ) ;
    public final void rule__MapField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1522:1: ( ( ( rule__MapField__NameAssignment_1 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1523:1: ( ( rule__MapField__NameAssignment_1 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1523:1: ( ( rule__MapField__NameAssignment_1 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1524:1: ( rule__MapField__NameAssignment_1 )
            {
             before(grammarAccess.getMapFieldAccess().getNameAssignment_1()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1525:1: ( rule__MapField__NameAssignment_1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1525:2: rule__MapField__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MapField__NameAssignment_1_in_rule__MapField__Group__1__Impl3192);
            rule__MapField__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMapFieldAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapField__Group__1__Impl"


    // $ANTLR start "rule__MapField__Group__2"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1535:1: rule__MapField__Group__2 : rule__MapField__Group__2__Impl rule__MapField__Group__3 ;
    public final void rule__MapField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1539:1: ( rule__MapField__Group__2__Impl rule__MapField__Group__3 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1540:2: rule__MapField__Group__2__Impl rule__MapField__Group__3
            {
            pushFollow(FOLLOW_rule__MapField__Group__2__Impl_in_rule__MapField__Group__23222);
            rule__MapField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapField__Group__3_in_rule__MapField__Group__23225);
            rule__MapField__Group__3();

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
    // $ANTLR end "rule__MapField__Group__2"


    // $ANTLR start "rule__MapField__Group__2__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1547:1: rule__MapField__Group__2__Impl : ( ( rule__MapField__Group_2__0 )? ) ;
    public final void rule__MapField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1551:1: ( ( ( rule__MapField__Group_2__0 )? ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1552:1: ( ( rule__MapField__Group_2__0 )? )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1552:1: ( ( rule__MapField__Group_2__0 )? )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1553:1: ( rule__MapField__Group_2__0 )?
            {
             before(grammarAccess.getMapFieldAccess().getGroup_2()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1554:1: ( rule__MapField__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_FILETER_B) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1554:2: rule__MapField__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__MapField__Group_2__0_in_rule__MapField__Group__2__Impl3252);
                    rule__MapField__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMapFieldAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapField__Group__2__Impl"


    // $ANTLR start "rule__MapField__Group__3"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1564:1: rule__MapField__Group__3 : rule__MapField__Group__3__Impl rule__MapField__Group__4 ;
    public final void rule__MapField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1568:1: ( rule__MapField__Group__3__Impl rule__MapField__Group__4 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1569:2: rule__MapField__Group__3__Impl rule__MapField__Group__4
            {
            pushFollow(FOLLOW_rule__MapField__Group__3__Impl_in_rule__MapField__Group__33283);
            rule__MapField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapField__Group__4_in_rule__MapField__Group__33286);
            rule__MapField__Group__4();

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
    // $ANTLR end "rule__MapField__Group__3"


    // $ANTLR start "rule__MapField__Group__3__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1576:1: rule__MapField__Group__3__Impl : ( RULE_FILETER_A ) ;
    public final void rule__MapField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1580:1: ( ( RULE_FILETER_A ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1581:1: ( RULE_FILETER_A )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1581:1: ( RULE_FILETER_A )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1582:1: RULE_FILETER_A
            {
             before(grammarAccess.getMapFieldAccess().getFILETER_ATerminalRuleCall_3()); 
            match(input,RULE_FILETER_A,FOLLOW_RULE_FILETER_A_in_rule__MapField__Group__3__Impl3313); 
             after(grammarAccess.getMapFieldAccess().getFILETER_ATerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapField__Group__3__Impl"


    // $ANTLR start "rule__MapField__Group__4"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1593:1: rule__MapField__Group__4 : rule__MapField__Group__4__Impl rule__MapField__Group__5 ;
    public final void rule__MapField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1597:1: ( rule__MapField__Group__4__Impl rule__MapField__Group__5 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1598:2: rule__MapField__Group__4__Impl rule__MapField__Group__5
            {
            pushFollow(FOLLOW_rule__MapField__Group__4__Impl_in_rule__MapField__Group__43342);
            rule__MapField__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapField__Group__5_in_rule__MapField__Group__43345);
            rule__MapField__Group__5();

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
    // $ANTLR end "rule__MapField__Group__4"


    // $ANTLR start "rule__MapField__Group__4__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1605:1: rule__MapField__Group__4__Impl : ( ( rule__MapField__LinksAssignment_4 ) ) ;
    public final void rule__MapField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1609:1: ( ( ( rule__MapField__LinksAssignment_4 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1610:1: ( ( rule__MapField__LinksAssignment_4 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1610:1: ( ( rule__MapField__LinksAssignment_4 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1611:1: ( rule__MapField__LinksAssignment_4 )
            {
             before(grammarAccess.getMapFieldAccess().getLinksAssignment_4()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1612:1: ( rule__MapField__LinksAssignment_4 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1612:2: rule__MapField__LinksAssignment_4
            {
            pushFollow(FOLLOW_rule__MapField__LinksAssignment_4_in_rule__MapField__Group__4__Impl3372);
            rule__MapField__LinksAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMapFieldAccess().getLinksAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapField__Group__4__Impl"


    // $ANTLR start "rule__MapField__Group__5"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1622:1: rule__MapField__Group__5 : rule__MapField__Group__5__Impl ;
    public final void rule__MapField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1626:1: ( rule__MapField__Group__5__Impl )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1627:2: rule__MapField__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__MapField__Group__5__Impl_in_rule__MapField__Group__53402);
            rule__MapField__Group__5__Impl();

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
    // $ANTLR end "rule__MapField__Group__5"


    // $ANTLR start "rule__MapField__Group__5__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1633:1: rule__MapField__Group__5__Impl : ( ( RULE_END )? ) ;
    public final void rule__MapField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1637:1: ( ( ( RULE_END )? ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1638:1: ( ( RULE_END )? )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1638:1: ( ( RULE_END )? )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1639:1: ( RULE_END )?
            {
             before(grammarAccess.getMapFieldAccess().getENDTerminalRuleCall_5()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1640:1: ( RULE_END )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_END) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1640:3: RULE_END
                    {
                    match(input,RULE_END,FOLLOW_RULE_END_in_rule__MapField__Group__5__Impl3430); 

                    }
                    break;

            }

             after(grammarAccess.getMapFieldAccess().getENDTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapField__Group__5__Impl"


    // $ANTLR start "rule__MapField__Group_2__0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1662:1: rule__MapField__Group_2__0 : rule__MapField__Group_2__0__Impl rule__MapField__Group_2__1 ;
    public final void rule__MapField__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1666:1: ( rule__MapField__Group_2__0__Impl rule__MapField__Group_2__1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1667:2: rule__MapField__Group_2__0__Impl rule__MapField__Group_2__1
            {
            pushFollow(FOLLOW_rule__MapField__Group_2__0__Impl_in_rule__MapField__Group_2__03473);
            rule__MapField__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapField__Group_2__1_in_rule__MapField__Group_2__03476);
            rule__MapField__Group_2__1();

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
    // $ANTLR end "rule__MapField__Group_2__0"


    // $ANTLR start "rule__MapField__Group_2__0__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1674:1: rule__MapField__Group_2__0__Impl : ( RULE_FILETER_B ) ;
    public final void rule__MapField__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1678:1: ( ( RULE_FILETER_B ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1679:1: ( RULE_FILETER_B )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1679:1: ( RULE_FILETER_B )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1680:1: RULE_FILETER_B
            {
             before(grammarAccess.getMapFieldAccess().getFILETER_BTerminalRuleCall_2_0()); 
            match(input,RULE_FILETER_B,FOLLOW_RULE_FILETER_B_in_rule__MapField__Group_2__0__Impl3503); 
             after(grammarAccess.getMapFieldAccess().getFILETER_BTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapField__Group_2__0__Impl"


    // $ANTLR start "rule__MapField__Group_2__1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1691:1: rule__MapField__Group_2__1 : rule__MapField__Group_2__1__Impl ;
    public final void rule__MapField__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1695:1: ( rule__MapField__Group_2__1__Impl )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1696:2: rule__MapField__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MapField__Group_2__1__Impl_in_rule__MapField__Group_2__13532);
            rule__MapField__Group_2__1__Impl();

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
    // $ANTLR end "rule__MapField__Group_2__1"


    // $ANTLR start "rule__MapField__Group_2__1__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1702:1: rule__MapField__Group_2__1__Impl : ( ( rule__MapField__FilterAssignment_2_1 ) ) ;
    public final void rule__MapField__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1706:1: ( ( ( rule__MapField__FilterAssignment_2_1 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1707:1: ( ( rule__MapField__FilterAssignment_2_1 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1707:1: ( ( rule__MapField__FilterAssignment_2_1 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1708:1: ( rule__MapField__FilterAssignment_2_1 )
            {
             before(grammarAccess.getMapFieldAccess().getFilterAssignment_2_1()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1709:1: ( rule__MapField__FilterAssignment_2_1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1709:2: rule__MapField__FilterAssignment_2_1
            {
            pushFollow(FOLLOW_rule__MapField__FilterAssignment_2_1_in_rule__MapField__Group_2__1__Impl3559);
            rule__MapField__FilterAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMapFieldAccess().getFilterAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapField__Group_2__1__Impl"


    // $ANTLR start "rule__MapRef__Group__0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1723:1: rule__MapRef__Group__0 : rule__MapRef__Group__0__Impl rule__MapRef__Group__1 ;
    public final void rule__MapRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1727:1: ( rule__MapRef__Group__0__Impl rule__MapRef__Group__1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1728:2: rule__MapRef__Group__0__Impl rule__MapRef__Group__1
            {
            pushFollow(FOLLOW_rule__MapRef__Group__0__Impl_in_rule__MapRef__Group__03593);
            rule__MapRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapRef__Group__1_in_rule__MapRef__Group__03596);
            rule__MapRef__Group__1();

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
    // $ANTLR end "rule__MapRef__Group__0"


    // $ANTLR start "rule__MapRef__Group__0__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1735:1: rule__MapRef__Group__0__Impl : ( ( rule__MapRef__LinkAssignment_0 ) ) ;
    public final void rule__MapRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1739:1: ( ( ( rule__MapRef__LinkAssignment_0 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1740:1: ( ( rule__MapRef__LinkAssignment_0 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1740:1: ( ( rule__MapRef__LinkAssignment_0 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1741:1: ( rule__MapRef__LinkAssignment_0 )
            {
             before(grammarAccess.getMapRefAccess().getLinkAssignment_0()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1742:1: ( rule__MapRef__LinkAssignment_0 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1742:2: rule__MapRef__LinkAssignment_0
            {
            pushFollow(FOLLOW_rule__MapRef__LinkAssignment_0_in_rule__MapRef__Group__0__Impl3623);
            rule__MapRef__LinkAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMapRefAccess().getLinkAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapRef__Group__0__Impl"


    // $ANTLR start "rule__MapRef__Group__1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1752:1: rule__MapRef__Group__1 : rule__MapRef__Group__1__Impl ;
    public final void rule__MapRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1756:1: ( rule__MapRef__Group__1__Impl )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1757:2: rule__MapRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MapRef__Group__1__Impl_in_rule__MapRef__Group__13653);
            rule__MapRef__Group__1__Impl();

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
    // $ANTLR end "rule__MapRef__Group__1"


    // $ANTLR start "rule__MapRef__Group__1__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1763:1: rule__MapRef__Group__1__Impl : ( ( rule__MapRef__Group_1__0 )? ) ;
    public final void rule__MapRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1767:1: ( ( ( rule__MapRef__Group_1__0 )? ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1768:1: ( ( rule__MapRef__Group_1__0 )? )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1768:1: ( ( rule__MapRef__Group_1__0 )? )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1769:1: ( rule__MapRef__Group_1__0 )?
            {
             before(grammarAccess.getMapRefAccess().getGroup_1()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1770:1: ( rule__MapRef__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_DOT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1770:2: rule__MapRef__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__MapRef__Group_1__0_in_rule__MapRef__Group__1__Impl3680);
                    rule__MapRef__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMapRefAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapRef__Group__1__Impl"


    // $ANTLR start "rule__MapRef__Group_1__0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1784:1: rule__MapRef__Group_1__0 : rule__MapRef__Group_1__0__Impl rule__MapRef__Group_1__1 ;
    public final void rule__MapRef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1788:1: ( rule__MapRef__Group_1__0__Impl rule__MapRef__Group_1__1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1789:2: rule__MapRef__Group_1__0__Impl rule__MapRef__Group_1__1
            {
            pushFollow(FOLLOW_rule__MapRef__Group_1__0__Impl_in_rule__MapRef__Group_1__03715);
            rule__MapRef__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapRef__Group_1__1_in_rule__MapRef__Group_1__03718);
            rule__MapRef__Group_1__1();

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
    // $ANTLR end "rule__MapRef__Group_1__0"


    // $ANTLR start "rule__MapRef__Group_1__0__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1796:1: rule__MapRef__Group_1__0__Impl : ( RULE_DOT ) ;
    public final void rule__MapRef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1800:1: ( ( RULE_DOT ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1801:1: ( RULE_DOT )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1801:1: ( RULE_DOT )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1802:1: RULE_DOT
            {
             before(grammarAccess.getMapRefAccess().getDOTTerminalRuleCall_1_0()); 
            match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rule__MapRef__Group_1__0__Impl3745); 
             after(grammarAccess.getMapRefAccess().getDOTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapRef__Group_1__0__Impl"


    // $ANTLR start "rule__MapRef__Group_1__1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1813:1: rule__MapRef__Group_1__1 : rule__MapRef__Group_1__1__Impl ;
    public final void rule__MapRef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1817:1: ( rule__MapRef__Group_1__1__Impl )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1818:2: rule__MapRef__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MapRef__Group_1__1__Impl_in_rule__MapRef__Group_1__13774);
            rule__MapRef__Group_1__1__Impl();

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
    // $ANTLR end "rule__MapRef__Group_1__1"


    // $ANTLR start "rule__MapRef__Group_1__1__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1824:1: rule__MapRef__Group_1__1__Impl : ( ( rule__MapRef__ChildAssignment_1_1 ) ) ;
    public final void rule__MapRef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1828:1: ( ( ( rule__MapRef__ChildAssignment_1_1 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1829:1: ( ( rule__MapRef__ChildAssignment_1_1 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1829:1: ( ( rule__MapRef__ChildAssignment_1_1 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1830:1: ( rule__MapRef__ChildAssignment_1_1 )
            {
             before(grammarAccess.getMapRefAccess().getChildAssignment_1_1()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1831:1: ( rule__MapRef__ChildAssignment_1_1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1831:2: rule__MapRef__ChildAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MapRef__ChildAssignment_1_1_in_rule__MapRef__Group_1__1__Impl3801);
            rule__MapRef__ChildAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMapRefAccess().getChildAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapRef__Group_1__1__Impl"


    // $ANTLR start "rule__MessageType__Group__0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1845:1: rule__MessageType__Group__0 : rule__MessageType__Group__0__Impl rule__MessageType__Group__1 ;
    public final void rule__MessageType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1849:1: ( rule__MessageType__Group__0__Impl rule__MessageType__Group__1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1850:2: rule__MessageType__Group__0__Impl rule__MessageType__Group__1
            {
            pushFollow(FOLLOW_rule__MessageType__Group__0__Impl_in_rule__MessageType__Group__03835);
            rule__MessageType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageType__Group__1_in_rule__MessageType__Group__03838);
            rule__MessageType__Group__1();

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
    // $ANTLR end "rule__MessageType__Group__0"


    // $ANTLR start "rule__MessageType__Group__0__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1857:1: rule__MessageType__Group__0__Impl : ( RULE_MESSAGE ) ;
    public final void rule__MessageType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1861:1: ( ( RULE_MESSAGE ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1862:1: ( RULE_MESSAGE )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1862:1: ( RULE_MESSAGE )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1863:1: RULE_MESSAGE
            {
             before(grammarAccess.getMessageTypeAccess().getMESSAGETerminalRuleCall_0()); 
            match(input,RULE_MESSAGE,FOLLOW_RULE_MESSAGE_in_rule__MessageType__Group__0__Impl3865); 
             after(grammarAccess.getMessageTypeAccess().getMESSAGETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageType__Group__0__Impl"


    // $ANTLR start "rule__MessageType__Group__1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1874:1: rule__MessageType__Group__1 : rule__MessageType__Group__1__Impl rule__MessageType__Group__2 ;
    public final void rule__MessageType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1878:1: ( rule__MessageType__Group__1__Impl rule__MessageType__Group__2 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1879:2: rule__MessageType__Group__1__Impl rule__MessageType__Group__2
            {
            pushFollow(FOLLOW_rule__MessageType__Group__1__Impl_in_rule__MessageType__Group__13894);
            rule__MessageType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageType__Group__2_in_rule__MessageType__Group__13897);
            rule__MessageType__Group__2();

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
    // $ANTLR end "rule__MessageType__Group__1"


    // $ANTLR start "rule__MessageType__Group__1__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1886:1: rule__MessageType__Group__1__Impl : ( ( rule__MessageType__NameAssignment_1 ) ) ;
    public final void rule__MessageType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1890:1: ( ( ( rule__MessageType__NameAssignment_1 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1891:1: ( ( rule__MessageType__NameAssignment_1 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1891:1: ( ( rule__MessageType__NameAssignment_1 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1892:1: ( rule__MessageType__NameAssignment_1 )
            {
             before(grammarAccess.getMessageTypeAccess().getNameAssignment_1()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1893:1: ( rule__MessageType__NameAssignment_1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1893:2: rule__MessageType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MessageType__NameAssignment_1_in_rule__MessageType__Group__1__Impl3924);
            rule__MessageType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageType__Group__1__Impl"


    // $ANTLR start "rule__MessageType__Group__2"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1903:1: rule__MessageType__Group__2 : rule__MessageType__Group__2__Impl rule__MessageType__Group__3 ;
    public final void rule__MessageType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1907:1: ( rule__MessageType__Group__2__Impl rule__MessageType__Group__3 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1908:2: rule__MessageType__Group__2__Impl rule__MessageType__Group__3
            {
            pushFollow(FOLLOW_rule__MessageType__Group__2__Impl_in_rule__MessageType__Group__23954);
            rule__MessageType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageType__Group__3_in_rule__MessageType__Group__23957);
            rule__MessageType__Group__3();

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
    // $ANTLR end "rule__MessageType__Group__2"


    // $ANTLR start "rule__MessageType__Group__2__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1915:1: rule__MessageType__Group__2__Impl : ( RULE_BRACE_L ) ;
    public final void rule__MessageType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1919:1: ( ( RULE_BRACE_L ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1920:1: ( RULE_BRACE_L )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1920:1: ( RULE_BRACE_L )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1921:1: RULE_BRACE_L
            {
             before(grammarAccess.getMessageTypeAccess().getBRACE_LTerminalRuleCall_2()); 
            match(input,RULE_BRACE_L,FOLLOW_RULE_BRACE_L_in_rule__MessageType__Group__2__Impl3984); 
             after(grammarAccess.getMessageTypeAccess().getBRACE_LTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageType__Group__2__Impl"


    // $ANTLR start "rule__MessageType__Group__3"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1932:1: rule__MessageType__Group__3 : rule__MessageType__Group__3__Impl rule__MessageType__Group__4 ;
    public final void rule__MessageType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1936:1: ( rule__MessageType__Group__3__Impl rule__MessageType__Group__4 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1937:2: rule__MessageType__Group__3__Impl rule__MessageType__Group__4
            {
            pushFollow(FOLLOW_rule__MessageType__Group__3__Impl_in_rule__MessageType__Group__34013);
            rule__MessageType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageType__Group__4_in_rule__MessageType__Group__34016);
            rule__MessageType__Group__4();

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
    // $ANTLR end "rule__MessageType__Group__3"


    // $ANTLR start "rule__MessageType__Group__3__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1944:1: rule__MessageType__Group__3__Impl : ( ( rule__MessageType__Alternatives_3 )* ) ;
    public final void rule__MessageType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1948:1: ( ( ( rule__MessageType__Alternatives_3 )* ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1949:1: ( ( rule__MessageType__Alternatives_3 )* )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1949:1: ( ( rule__MessageType__Alternatives_3 )* )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1950:1: ( rule__MessageType__Alternatives_3 )*
            {
             before(grammarAccess.getMessageTypeAccess().getAlternatives_3()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1951:1: ( rule__MessageType__Alternatives_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_FIELD_ATTR||(LA20_0>=RULE_MESSAGE && LA20_0<=RULE_ENUM)||(LA20_0>=RULE_COMMENT_SL && LA20_0<=RULE_COMMENT_ML)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1951:2: rule__MessageType__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__MessageType__Alternatives_3_in_rule__MessageType__Group__3__Impl4043);
            	    rule__MessageType__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getMessageTypeAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageType__Group__3__Impl"


    // $ANTLR start "rule__MessageType__Group__4"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1961:1: rule__MessageType__Group__4 : rule__MessageType__Group__4__Impl rule__MessageType__Group__5 ;
    public final void rule__MessageType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1965:1: ( rule__MessageType__Group__4__Impl rule__MessageType__Group__5 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1966:2: rule__MessageType__Group__4__Impl rule__MessageType__Group__5
            {
            pushFollow(FOLLOW_rule__MessageType__Group__4__Impl_in_rule__MessageType__Group__44074);
            rule__MessageType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageType__Group__5_in_rule__MessageType__Group__44077);
            rule__MessageType__Group__5();

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
    // $ANTLR end "rule__MessageType__Group__4"


    // $ANTLR start "rule__MessageType__Group__4__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1973:1: rule__MessageType__Group__4__Impl : ( RULE_BRACE_R ) ;
    public final void rule__MessageType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1977:1: ( ( RULE_BRACE_R ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1978:1: ( RULE_BRACE_R )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1978:1: ( RULE_BRACE_R )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1979:1: RULE_BRACE_R
            {
             before(grammarAccess.getMessageTypeAccess().getBRACE_RTerminalRuleCall_4()); 
            match(input,RULE_BRACE_R,FOLLOW_RULE_BRACE_R_in_rule__MessageType__Group__4__Impl4104); 
             after(grammarAccess.getMessageTypeAccess().getBRACE_RTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageType__Group__4__Impl"


    // $ANTLR start "rule__MessageType__Group__5"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1990:1: rule__MessageType__Group__5 : rule__MessageType__Group__5__Impl ;
    public final void rule__MessageType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1994:1: ( rule__MessageType__Group__5__Impl )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1995:2: rule__MessageType__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__MessageType__Group__5__Impl_in_rule__MessageType__Group__54133);
            rule__MessageType__Group__5__Impl();

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
    // $ANTLR end "rule__MessageType__Group__5"


    // $ANTLR start "rule__MessageType__Group__5__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2001:1: rule__MessageType__Group__5__Impl : ( ( RULE_END )? ) ;
    public final void rule__MessageType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2005:1: ( ( ( RULE_END )? ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2006:1: ( ( RULE_END )? )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2006:1: ( ( RULE_END )? )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2007:1: ( RULE_END )?
            {
             before(grammarAccess.getMessageTypeAccess().getENDTerminalRuleCall_5()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2008:1: ( RULE_END )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_END) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2008:3: RULE_END
                    {
                    match(input,RULE_END,FOLLOW_RULE_END_in_rule__MessageType__Group__5__Impl4161); 

                    }
                    break;

            }

             after(grammarAccess.getMessageTypeAccess().getENDTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageType__Group__5__Impl"


    // $ANTLR start "rule__MessageSimpleField__Group__0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2030:1: rule__MessageSimpleField__Group__0 : rule__MessageSimpleField__Group__0__Impl rule__MessageSimpleField__Group__1 ;
    public final void rule__MessageSimpleField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2034:1: ( rule__MessageSimpleField__Group__0__Impl rule__MessageSimpleField__Group__1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2035:2: rule__MessageSimpleField__Group__0__Impl rule__MessageSimpleField__Group__1
            {
            pushFollow(FOLLOW_rule__MessageSimpleField__Group__0__Impl_in_rule__MessageSimpleField__Group__04204);
            rule__MessageSimpleField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageSimpleField__Group__1_in_rule__MessageSimpleField__Group__04207);
            rule__MessageSimpleField__Group__1();

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
    // $ANTLR end "rule__MessageSimpleField__Group__0"


    // $ANTLR start "rule__MessageSimpleField__Group__0__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2042:1: rule__MessageSimpleField__Group__0__Impl : ( ( rule__MessageSimpleField__AttrAssignment_0 ) ) ;
    public final void rule__MessageSimpleField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2046:1: ( ( ( rule__MessageSimpleField__AttrAssignment_0 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2047:1: ( ( rule__MessageSimpleField__AttrAssignment_0 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2047:1: ( ( rule__MessageSimpleField__AttrAssignment_0 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2048:1: ( rule__MessageSimpleField__AttrAssignment_0 )
            {
             before(grammarAccess.getMessageSimpleFieldAccess().getAttrAssignment_0()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2049:1: ( rule__MessageSimpleField__AttrAssignment_0 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2049:2: rule__MessageSimpleField__AttrAssignment_0
            {
            pushFollow(FOLLOW_rule__MessageSimpleField__AttrAssignment_0_in_rule__MessageSimpleField__Group__0__Impl4234);
            rule__MessageSimpleField__AttrAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageSimpleFieldAccess().getAttrAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSimpleField__Group__0__Impl"


    // $ANTLR start "rule__MessageSimpleField__Group__1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2059:1: rule__MessageSimpleField__Group__1 : rule__MessageSimpleField__Group__1__Impl rule__MessageSimpleField__Group__2 ;
    public final void rule__MessageSimpleField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2063:1: ( rule__MessageSimpleField__Group__1__Impl rule__MessageSimpleField__Group__2 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2064:2: rule__MessageSimpleField__Group__1__Impl rule__MessageSimpleField__Group__2
            {
            pushFollow(FOLLOW_rule__MessageSimpleField__Group__1__Impl_in_rule__MessageSimpleField__Group__14264);
            rule__MessageSimpleField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageSimpleField__Group__2_in_rule__MessageSimpleField__Group__14267);
            rule__MessageSimpleField__Group__2();

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
    // $ANTLR end "rule__MessageSimpleField__Group__1"


    // $ANTLR start "rule__MessageSimpleField__Group__1__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2071:1: rule__MessageSimpleField__Group__1__Impl : ( ( rule__MessageSimpleField__TypeAssignment_1 ) ) ;
    public final void rule__MessageSimpleField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2075:1: ( ( ( rule__MessageSimpleField__TypeAssignment_1 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2076:1: ( ( rule__MessageSimpleField__TypeAssignment_1 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2076:1: ( ( rule__MessageSimpleField__TypeAssignment_1 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2077:1: ( rule__MessageSimpleField__TypeAssignment_1 )
            {
             before(grammarAccess.getMessageSimpleFieldAccess().getTypeAssignment_1()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2078:1: ( rule__MessageSimpleField__TypeAssignment_1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2078:2: rule__MessageSimpleField__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__MessageSimpleField__TypeAssignment_1_in_rule__MessageSimpleField__Group__1__Impl4294);
            rule__MessageSimpleField__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageSimpleFieldAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSimpleField__Group__1__Impl"


    // $ANTLR start "rule__MessageSimpleField__Group__2"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2088:1: rule__MessageSimpleField__Group__2 : rule__MessageSimpleField__Group__2__Impl rule__MessageSimpleField__Group__3 ;
    public final void rule__MessageSimpleField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2092:1: ( rule__MessageSimpleField__Group__2__Impl rule__MessageSimpleField__Group__3 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2093:2: rule__MessageSimpleField__Group__2__Impl rule__MessageSimpleField__Group__3
            {
            pushFollow(FOLLOW_rule__MessageSimpleField__Group__2__Impl_in_rule__MessageSimpleField__Group__24324);
            rule__MessageSimpleField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageSimpleField__Group__3_in_rule__MessageSimpleField__Group__24327);
            rule__MessageSimpleField__Group__3();

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
    // $ANTLR end "rule__MessageSimpleField__Group__2"


    // $ANTLR start "rule__MessageSimpleField__Group__2__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2100:1: rule__MessageSimpleField__Group__2__Impl : ( ( rule__MessageSimpleField__NameAssignment_2 ) ) ;
    public final void rule__MessageSimpleField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2104:1: ( ( ( rule__MessageSimpleField__NameAssignment_2 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2105:1: ( ( rule__MessageSimpleField__NameAssignment_2 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2105:1: ( ( rule__MessageSimpleField__NameAssignment_2 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2106:1: ( rule__MessageSimpleField__NameAssignment_2 )
            {
             before(grammarAccess.getMessageSimpleFieldAccess().getNameAssignment_2()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2107:1: ( rule__MessageSimpleField__NameAssignment_2 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2107:2: rule__MessageSimpleField__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__MessageSimpleField__NameAssignment_2_in_rule__MessageSimpleField__Group__2__Impl4354);
            rule__MessageSimpleField__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMessageSimpleFieldAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSimpleField__Group__2__Impl"


    // $ANTLR start "rule__MessageSimpleField__Group__3"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2117:1: rule__MessageSimpleField__Group__3 : rule__MessageSimpleField__Group__3__Impl rule__MessageSimpleField__Group__4 ;
    public final void rule__MessageSimpleField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2121:1: ( rule__MessageSimpleField__Group__3__Impl rule__MessageSimpleField__Group__4 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2122:2: rule__MessageSimpleField__Group__3__Impl rule__MessageSimpleField__Group__4
            {
            pushFollow(FOLLOW_rule__MessageSimpleField__Group__3__Impl_in_rule__MessageSimpleField__Group__34384);
            rule__MessageSimpleField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageSimpleField__Group__4_in_rule__MessageSimpleField__Group__34387);
            rule__MessageSimpleField__Group__4();

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
    // $ANTLR end "rule__MessageSimpleField__Group__3"


    // $ANTLR start "rule__MessageSimpleField__Group__3__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2129:1: rule__MessageSimpleField__Group__3__Impl : ( RULE_EQUALS ) ;
    public final void rule__MessageSimpleField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2133:1: ( ( RULE_EQUALS ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2134:1: ( RULE_EQUALS )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2134:1: ( RULE_EQUALS )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2135:1: RULE_EQUALS
            {
             before(grammarAccess.getMessageSimpleFieldAccess().getEQUALSTerminalRuleCall_3()); 
            match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_rule__MessageSimpleField__Group__3__Impl4414); 
             after(grammarAccess.getMessageSimpleFieldAccess().getEQUALSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSimpleField__Group__3__Impl"


    // $ANTLR start "rule__MessageSimpleField__Group__4"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2146:1: rule__MessageSimpleField__Group__4 : rule__MessageSimpleField__Group__4__Impl rule__MessageSimpleField__Group__5 ;
    public final void rule__MessageSimpleField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2150:1: ( rule__MessageSimpleField__Group__4__Impl rule__MessageSimpleField__Group__5 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2151:2: rule__MessageSimpleField__Group__4__Impl rule__MessageSimpleField__Group__5
            {
            pushFollow(FOLLOW_rule__MessageSimpleField__Group__4__Impl_in_rule__MessageSimpleField__Group__44443);
            rule__MessageSimpleField__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageSimpleField__Group__5_in_rule__MessageSimpleField__Group__44446);
            rule__MessageSimpleField__Group__5();

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
    // $ANTLR end "rule__MessageSimpleField__Group__4"


    // $ANTLR start "rule__MessageSimpleField__Group__4__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2158:1: rule__MessageSimpleField__Group__4__Impl : ( ( rule__MessageSimpleField__IndexAssignment_4 ) ) ;
    public final void rule__MessageSimpleField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2162:1: ( ( ( rule__MessageSimpleField__IndexAssignment_4 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2163:1: ( ( rule__MessageSimpleField__IndexAssignment_4 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2163:1: ( ( rule__MessageSimpleField__IndexAssignment_4 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2164:1: ( rule__MessageSimpleField__IndexAssignment_4 )
            {
             before(grammarAccess.getMessageSimpleFieldAccess().getIndexAssignment_4()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2165:1: ( rule__MessageSimpleField__IndexAssignment_4 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2165:2: rule__MessageSimpleField__IndexAssignment_4
            {
            pushFollow(FOLLOW_rule__MessageSimpleField__IndexAssignment_4_in_rule__MessageSimpleField__Group__4__Impl4473);
            rule__MessageSimpleField__IndexAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMessageSimpleFieldAccess().getIndexAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSimpleField__Group__4__Impl"


    // $ANTLR start "rule__MessageSimpleField__Group__5"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2175:1: rule__MessageSimpleField__Group__5 : rule__MessageSimpleField__Group__5__Impl rule__MessageSimpleField__Group__6 ;
    public final void rule__MessageSimpleField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2179:1: ( rule__MessageSimpleField__Group__5__Impl rule__MessageSimpleField__Group__6 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2180:2: rule__MessageSimpleField__Group__5__Impl rule__MessageSimpleField__Group__6
            {
            pushFollow(FOLLOW_rule__MessageSimpleField__Group__5__Impl_in_rule__MessageSimpleField__Group__54503);
            rule__MessageSimpleField__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageSimpleField__Group__6_in_rule__MessageSimpleField__Group__54506);
            rule__MessageSimpleField__Group__6();

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
    // $ANTLR end "rule__MessageSimpleField__Group__5"


    // $ANTLR start "rule__MessageSimpleField__Group__5__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2187:1: rule__MessageSimpleField__Group__5__Impl : ( ( ruleMessageFieldDefault )? ) ;
    public final void rule__MessageSimpleField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2191:1: ( ( ( ruleMessageFieldDefault )? ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2192:1: ( ( ruleMessageFieldDefault )? )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2192:1: ( ( ruleMessageFieldDefault )? )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2193:1: ( ruleMessageFieldDefault )?
            {
             before(grammarAccess.getMessageSimpleFieldAccess().getMessageFieldDefaultParserRuleCall_5()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2194:1: ( ruleMessageFieldDefault )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_BRACKET_L) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2194:3: ruleMessageFieldDefault
                    {
                    pushFollow(FOLLOW_ruleMessageFieldDefault_in_rule__MessageSimpleField__Group__5__Impl4534);
                    ruleMessageFieldDefault();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageSimpleFieldAccess().getMessageFieldDefaultParserRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSimpleField__Group__5__Impl"


    // $ANTLR start "rule__MessageSimpleField__Group__6"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2204:1: rule__MessageSimpleField__Group__6 : rule__MessageSimpleField__Group__6__Impl ;
    public final void rule__MessageSimpleField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2208:1: ( rule__MessageSimpleField__Group__6__Impl )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2209:2: rule__MessageSimpleField__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__MessageSimpleField__Group__6__Impl_in_rule__MessageSimpleField__Group__64565);
            rule__MessageSimpleField__Group__6__Impl();

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
    // $ANTLR end "rule__MessageSimpleField__Group__6"


    // $ANTLR start "rule__MessageSimpleField__Group__6__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2215:1: rule__MessageSimpleField__Group__6__Impl : ( ( RULE_END )? ) ;
    public final void rule__MessageSimpleField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2219:1: ( ( ( RULE_END )? ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2220:1: ( ( RULE_END )? )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2220:1: ( ( RULE_END )? )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2221:1: ( RULE_END )?
            {
             before(grammarAccess.getMessageSimpleFieldAccess().getENDTerminalRuleCall_6()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2222:1: ( RULE_END )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_END) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2222:3: RULE_END
                    {
                    match(input,RULE_END,FOLLOW_RULE_END_in_rule__MessageSimpleField__Group__6__Impl4593); 

                    }
                    break;

            }

             after(grammarAccess.getMessageSimpleFieldAccess().getENDTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSimpleField__Group__6__Impl"


    // $ANTLR start "rule__MessageComplexField__Group__0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2246:1: rule__MessageComplexField__Group__0 : rule__MessageComplexField__Group__0__Impl rule__MessageComplexField__Group__1 ;
    public final void rule__MessageComplexField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2250:1: ( rule__MessageComplexField__Group__0__Impl rule__MessageComplexField__Group__1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2251:2: rule__MessageComplexField__Group__0__Impl rule__MessageComplexField__Group__1
            {
            pushFollow(FOLLOW_rule__MessageComplexField__Group__0__Impl_in_rule__MessageComplexField__Group__04638);
            rule__MessageComplexField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageComplexField__Group__1_in_rule__MessageComplexField__Group__04641);
            rule__MessageComplexField__Group__1();

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
    // $ANTLR end "rule__MessageComplexField__Group__0"


    // $ANTLR start "rule__MessageComplexField__Group__0__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2258:1: rule__MessageComplexField__Group__0__Impl : ( ( rule__MessageComplexField__AttrAssignment_0 ) ) ;
    public final void rule__MessageComplexField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2262:1: ( ( ( rule__MessageComplexField__AttrAssignment_0 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2263:1: ( ( rule__MessageComplexField__AttrAssignment_0 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2263:1: ( ( rule__MessageComplexField__AttrAssignment_0 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2264:1: ( rule__MessageComplexField__AttrAssignment_0 )
            {
             before(grammarAccess.getMessageComplexFieldAccess().getAttrAssignment_0()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2265:1: ( rule__MessageComplexField__AttrAssignment_0 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2265:2: rule__MessageComplexField__AttrAssignment_0
            {
            pushFollow(FOLLOW_rule__MessageComplexField__AttrAssignment_0_in_rule__MessageComplexField__Group__0__Impl4668);
            rule__MessageComplexField__AttrAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageComplexFieldAccess().getAttrAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageComplexField__Group__0__Impl"


    // $ANTLR start "rule__MessageComplexField__Group__1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2275:1: rule__MessageComplexField__Group__1 : rule__MessageComplexField__Group__1__Impl rule__MessageComplexField__Group__2 ;
    public final void rule__MessageComplexField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2279:1: ( rule__MessageComplexField__Group__1__Impl rule__MessageComplexField__Group__2 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2280:2: rule__MessageComplexField__Group__1__Impl rule__MessageComplexField__Group__2
            {
            pushFollow(FOLLOW_rule__MessageComplexField__Group__1__Impl_in_rule__MessageComplexField__Group__14698);
            rule__MessageComplexField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageComplexField__Group__2_in_rule__MessageComplexField__Group__14701);
            rule__MessageComplexField__Group__2();

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
    // $ANTLR end "rule__MessageComplexField__Group__1"


    // $ANTLR start "rule__MessageComplexField__Group__1__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2287:1: rule__MessageComplexField__Group__1__Impl : ( ( rule__MessageComplexField__TypeAssignment_1 ) ) ;
    public final void rule__MessageComplexField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2291:1: ( ( ( rule__MessageComplexField__TypeAssignment_1 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2292:1: ( ( rule__MessageComplexField__TypeAssignment_1 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2292:1: ( ( rule__MessageComplexField__TypeAssignment_1 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2293:1: ( rule__MessageComplexField__TypeAssignment_1 )
            {
             before(grammarAccess.getMessageComplexFieldAccess().getTypeAssignment_1()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2294:1: ( rule__MessageComplexField__TypeAssignment_1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2294:2: rule__MessageComplexField__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__MessageComplexField__TypeAssignment_1_in_rule__MessageComplexField__Group__1__Impl4728);
            rule__MessageComplexField__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageComplexFieldAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageComplexField__Group__1__Impl"


    // $ANTLR start "rule__MessageComplexField__Group__2"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2304:1: rule__MessageComplexField__Group__2 : rule__MessageComplexField__Group__2__Impl rule__MessageComplexField__Group__3 ;
    public final void rule__MessageComplexField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2308:1: ( rule__MessageComplexField__Group__2__Impl rule__MessageComplexField__Group__3 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2309:2: rule__MessageComplexField__Group__2__Impl rule__MessageComplexField__Group__3
            {
            pushFollow(FOLLOW_rule__MessageComplexField__Group__2__Impl_in_rule__MessageComplexField__Group__24758);
            rule__MessageComplexField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageComplexField__Group__3_in_rule__MessageComplexField__Group__24761);
            rule__MessageComplexField__Group__3();

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
    // $ANTLR end "rule__MessageComplexField__Group__2"


    // $ANTLR start "rule__MessageComplexField__Group__2__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2316:1: rule__MessageComplexField__Group__2__Impl : ( ( rule__MessageComplexField__NameAssignment_2 ) ) ;
    public final void rule__MessageComplexField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2320:1: ( ( ( rule__MessageComplexField__NameAssignment_2 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2321:1: ( ( rule__MessageComplexField__NameAssignment_2 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2321:1: ( ( rule__MessageComplexField__NameAssignment_2 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2322:1: ( rule__MessageComplexField__NameAssignment_2 )
            {
             before(grammarAccess.getMessageComplexFieldAccess().getNameAssignment_2()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2323:1: ( rule__MessageComplexField__NameAssignment_2 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2323:2: rule__MessageComplexField__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__MessageComplexField__NameAssignment_2_in_rule__MessageComplexField__Group__2__Impl4788);
            rule__MessageComplexField__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMessageComplexFieldAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageComplexField__Group__2__Impl"


    // $ANTLR start "rule__MessageComplexField__Group__3"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2333:1: rule__MessageComplexField__Group__3 : rule__MessageComplexField__Group__3__Impl rule__MessageComplexField__Group__4 ;
    public final void rule__MessageComplexField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2337:1: ( rule__MessageComplexField__Group__3__Impl rule__MessageComplexField__Group__4 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2338:2: rule__MessageComplexField__Group__3__Impl rule__MessageComplexField__Group__4
            {
            pushFollow(FOLLOW_rule__MessageComplexField__Group__3__Impl_in_rule__MessageComplexField__Group__34818);
            rule__MessageComplexField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageComplexField__Group__4_in_rule__MessageComplexField__Group__34821);
            rule__MessageComplexField__Group__4();

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
    // $ANTLR end "rule__MessageComplexField__Group__3"


    // $ANTLR start "rule__MessageComplexField__Group__3__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2345:1: rule__MessageComplexField__Group__3__Impl : ( RULE_EQUALS ) ;
    public final void rule__MessageComplexField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2349:1: ( ( RULE_EQUALS ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2350:1: ( RULE_EQUALS )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2350:1: ( RULE_EQUALS )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2351:1: RULE_EQUALS
            {
             before(grammarAccess.getMessageComplexFieldAccess().getEQUALSTerminalRuleCall_3()); 
            match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_rule__MessageComplexField__Group__3__Impl4848); 
             after(grammarAccess.getMessageComplexFieldAccess().getEQUALSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageComplexField__Group__3__Impl"


    // $ANTLR start "rule__MessageComplexField__Group__4"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2362:1: rule__MessageComplexField__Group__4 : rule__MessageComplexField__Group__4__Impl rule__MessageComplexField__Group__5 ;
    public final void rule__MessageComplexField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2366:1: ( rule__MessageComplexField__Group__4__Impl rule__MessageComplexField__Group__5 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2367:2: rule__MessageComplexField__Group__4__Impl rule__MessageComplexField__Group__5
            {
            pushFollow(FOLLOW_rule__MessageComplexField__Group__4__Impl_in_rule__MessageComplexField__Group__44877);
            rule__MessageComplexField__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageComplexField__Group__5_in_rule__MessageComplexField__Group__44880);
            rule__MessageComplexField__Group__5();

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
    // $ANTLR end "rule__MessageComplexField__Group__4"


    // $ANTLR start "rule__MessageComplexField__Group__4__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2374:1: rule__MessageComplexField__Group__4__Impl : ( ( rule__MessageComplexField__IndexAssignment_4 ) ) ;
    public final void rule__MessageComplexField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2378:1: ( ( ( rule__MessageComplexField__IndexAssignment_4 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2379:1: ( ( rule__MessageComplexField__IndexAssignment_4 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2379:1: ( ( rule__MessageComplexField__IndexAssignment_4 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2380:1: ( rule__MessageComplexField__IndexAssignment_4 )
            {
             before(grammarAccess.getMessageComplexFieldAccess().getIndexAssignment_4()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2381:1: ( rule__MessageComplexField__IndexAssignment_4 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2381:2: rule__MessageComplexField__IndexAssignment_4
            {
            pushFollow(FOLLOW_rule__MessageComplexField__IndexAssignment_4_in_rule__MessageComplexField__Group__4__Impl4907);
            rule__MessageComplexField__IndexAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMessageComplexFieldAccess().getIndexAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageComplexField__Group__4__Impl"


    // $ANTLR start "rule__MessageComplexField__Group__5"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2391:1: rule__MessageComplexField__Group__5 : rule__MessageComplexField__Group__5__Impl rule__MessageComplexField__Group__6 ;
    public final void rule__MessageComplexField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2395:1: ( rule__MessageComplexField__Group__5__Impl rule__MessageComplexField__Group__6 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2396:2: rule__MessageComplexField__Group__5__Impl rule__MessageComplexField__Group__6
            {
            pushFollow(FOLLOW_rule__MessageComplexField__Group__5__Impl_in_rule__MessageComplexField__Group__54937);
            rule__MessageComplexField__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageComplexField__Group__6_in_rule__MessageComplexField__Group__54940);
            rule__MessageComplexField__Group__6();

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
    // $ANTLR end "rule__MessageComplexField__Group__5"


    // $ANTLR start "rule__MessageComplexField__Group__5__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2403:1: rule__MessageComplexField__Group__5__Impl : ( ( ruleMessageFieldDefault )? ) ;
    public final void rule__MessageComplexField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2407:1: ( ( ( ruleMessageFieldDefault )? ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2408:1: ( ( ruleMessageFieldDefault )? )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2408:1: ( ( ruleMessageFieldDefault )? )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2409:1: ( ruleMessageFieldDefault )?
            {
             before(grammarAccess.getMessageComplexFieldAccess().getMessageFieldDefaultParserRuleCall_5()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2410:1: ( ruleMessageFieldDefault )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_BRACKET_L) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2410:3: ruleMessageFieldDefault
                    {
                    pushFollow(FOLLOW_ruleMessageFieldDefault_in_rule__MessageComplexField__Group__5__Impl4968);
                    ruleMessageFieldDefault();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageComplexFieldAccess().getMessageFieldDefaultParserRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageComplexField__Group__5__Impl"


    // $ANTLR start "rule__MessageComplexField__Group__6"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2420:1: rule__MessageComplexField__Group__6 : rule__MessageComplexField__Group__6__Impl ;
    public final void rule__MessageComplexField__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2424:1: ( rule__MessageComplexField__Group__6__Impl )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2425:2: rule__MessageComplexField__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__MessageComplexField__Group__6__Impl_in_rule__MessageComplexField__Group__64999);
            rule__MessageComplexField__Group__6__Impl();

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
    // $ANTLR end "rule__MessageComplexField__Group__6"


    // $ANTLR start "rule__MessageComplexField__Group__6__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2431:1: rule__MessageComplexField__Group__6__Impl : ( ( RULE_END )? ) ;
    public final void rule__MessageComplexField__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2435:1: ( ( ( RULE_END )? ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2436:1: ( ( RULE_END )? )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2436:1: ( ( RULE_END )? )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2437:1: ( RULE_END )?
            {
             before(grammarAccess.getMessageComplexFieldAccess().getENDTerminalRuleCall_6()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2438:1: ( RULE_END )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_END) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2438:3: RULE_END
                    {
                    match(input,RULE_END,FOLLOW_RULE_END_in_rule__MessageComplexField__Group__6__Impl5027); 

                    }
                    break;

            }

             after(grammarAccess.getMessageComplexFieldAccess().getENDTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageComplexField__Group__6__Impl"


    // $ANTLR start "rule__MessageFieldDefault__Group__0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2462:1: rule__MessageFieldDefault__Group__0 : rule__MessageFieldDefault__Group__0__Impl rule__MessageFieldDefault__Group__1 ;
    public final void rule__MessageFieldDefault__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2466:1: ( rule__MessageFieldDefault__Group__0__Impl rule__MessageFieldDefault__Group__1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2467:2: rule__MessageFieldDefault__Group__0__Impl rule__MessageFieldDefault__Group__1
            {
            pushFollow(FOLLOW_rule__MessageFieldDefault__Group__0__Impl_in_rule__MessageFieldDefault__Group__05072);
            rule__MessageFieldDefault__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageFieldDefault__Group__1_in_rule__MessageFieldDefault__Group__05075);
            rule__MessageFieldDefault__Group__1();

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
    // $ANTLR end "rule__MessageFieldDefault__Group__0"


    // $ANTLR start "rule__MessageFieldDefault__Group__0__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2474:1: rule__MessageFieldDefault__Group__0__Impl : ( RULE_BRACKET_L ) ;
    public final void rule__MessageFieldDefault__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2478:1: ( ( RULE_BRACKET_L ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2479:1: ( RULE_BRACKET_L )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2479:1: ( RULE_BRACKET_L )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2480:1: RULE_BRACKET_L
            {
             before(grammarAccess.getMessageFieldDefaultAccess().getBRACKET_LTerminalRuleCall_0()); 
            match(input,RULE_BRACKET_L,FOLLOW_RULE_BRACKET_L_in_rule__MessageFieldDefault__Group__0__Impl5102); 
             after(grammarAccess.getMessageFieldDefaultAccess().getBRACKET_LTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFieldDefault__Group__0__Impl"


    // $ANTLR start "rule__MessageFieldDefault__Group__1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2491:1: rule__MessageFieldDefault__Group__1 : rule__MessageFieldDefault__Group__1__Impl rule__MessageFieldDefault__Group__2 ;
    public final void rule__MessageFieldDefault__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2495:1: ( rule__MessageFieldDefault__Group__1__Impl rule__MessageFieldDefault__Group__2 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2496:2: rule__MessageFieldDefault__Group__1__Impl rule__MessageFieldDefault__Group__2
            {
            pushFollow(FOLLOW_rule__MessageFieldDefault__Group__1__Impl_in_rule__MessageFieldDefault__Group__15131);
            rule__MessageFieldDefault__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageFieldDefault__Group__2_in_rule__MessageFieldDefault__Group__15134);
            rule__MessageFieldDefault__Group__2();

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
    // $ANTLR end "rule__MessageFieldDefault__Group__1"


    // $ANTLR start "rule__MessageFieldDefault__Group__1__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2503:1: rule__MessageFieldDefault__Group__1__Impl : ( RULE_DEFAULT_KIND ) ;
    public final void rule__MessageFieldDefault__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2507:1: ( ( RULE_DEFAULT_KIND ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2508:1: ( RULE_DEFAULT_KIND )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2508:1: ( RULE_DEFAULT_KIND )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2509:1: RULE_DEFAULT_KIND
            {
             before(grammarAccess.getMessageFieldDefaultAccess().getDEFAULT_KINDTerminalRuleCall_1()); 
            match(input,RULE_DEFAULT_KIND,FOLLOW_RULE_DEFAULT_KIND_in_rule__MessageFieldDefault__Group__1__Impl5161); 
             after(grammarAccess.getMessageFieldDefaultAccess().getDEFAULT_KINDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFieldDefault__Group__1__Impl"


    // $ANTLR start "rule__MessageFieldDefault__Group__2"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2520:1: rule__MessageFieldDefault__Group__2 : rule__MessageFieldDefault__Group__2__Impl rule__MessageFieldDefault__Group__3 ;
    public final void rule__MessageFieldDefault__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2524:1: ( rule__MessageFieldDefault__Group__2__Impl rule__MessageFieldDefault__Group__3 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2525:2: rule__MessageFieldDefault__Group__2__Impl rule__MessageFieldDefault__Group__3
            {
            pushFollow(FOLLOW_rule__MessageFieldDefault__Group__2__Impl_in_rule__MessageFieldDefault__Group__25190);
            rule__MessageFieldDefault__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageFieldDefault__Group__3_in_rule__MessageFieldDefault__Group__25193);
            rule__MessageFieldDefault__Group__3();

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
    // $ANTLR end "rule__MessageFieldDefault__Group__2"


    // $ANTLR start "rule__MessageFieldDefault__Group__2__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2532:1: rule__MessageFieldDefault__Group__2__Impl : ( RULE_EQUALS ) ;
    public final void rule__MessageFieldDefault__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2536:1: ( ( RULE_EQUALS ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2537:1: ( RULE_EQUALS )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2537:1: ( RULE_EQUALS )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2538:1: RULE_EQUALS
            {
             before(grammarAccess.getMessageFieldDefaultAccess().getEQUALSTerminalRuleCall_2()); 
            match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_rule__MessageFieldDefault__Group__2__Impl5220); 
             after(grammarAccess.getMessageFieldDefaultAccess().getEQUALSTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFieldDefault__Group__2__Impl"


    // $ANTLR start "rule__MessageFieldDefault__Group__3"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2549:1: rule__MessageFieldDefault__Group__3 : rule__MessageFieldDefault__Group__3__Impl rule__MessageFieldDefault__Group__4 ;
    public final void rule__MessageFieldDefault__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2553:1: ( rule__MessageFieldDefault__Group__3__Impl rule__MessageFieldDefault__Group__4 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2554:2: rule__MessageFieldDefault__Group__3__Impl rule__MessageFieldDefault__Group__4
            {
            pushFollow(FOLLOW_rule__MessageFieldDefault__Group__3__Impl_in_rule__MessageFieldDefault__Group__35249);
            rule__MessageFieldDefault__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MessageFieldDefault__Group__4_in_rule__MessageFieldDefault__Group__35252);
            rule__MessageFieldDefault__Group__4();

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
    // $ANTLR end "rule__MessageFieldDefault__Group__3"


    // $ANTLR start "rule__MessageFieldDefault__Group__3__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2561:1: rule__MessageFieldDefault__Group__3__Impl : ( ( rule__MessageFieldDefault__Alternatives_3 ) ) ;
    public final void rule__MessageFieldDefault__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2565:1: ( ( ( rule__MessageFieldDefault__Alternatives_3 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2566:1: ( ( rule__MessageFieldDefault__Alternatives_3 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2566:1: ( ( rule__MessageFieldDefault__Alternatives_3 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2567:1: ( rule__MessageFieldDefault__Alternatives_3 )
            {
             before(grammarAccess.getMessageFieldDefaultAccess().getAlternatives_3()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2568:1: ( rule__MessageFieldDefault__Alternatives_3 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2568:2: rule__MessageFieldDefault__Alternatives_3
            {
            pushFollow(FOLLOW_rule__MessageFieldDefault__Alternatives_3_in_rule__MessageFieldDefault__Group__3__Impl5279);
            rule__MessageFieldDefault__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getMessageFieldDefaultAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFieldDefault__Group__3__Impl"


    // $ANTLR start "rule__MessageFieldDefault__Group__4"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2578:1: rule__MessageFieldDefault__Group__4 : rule__MessageFieldDefault__Group__4__Impl ;
    public final void rule__MessageFieldDefault__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2582:1: ( rule__MessageFieldDefault__Group__4__Impl )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2583:2: rule__MessageFieldDefault__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MessageFieldDefault__Group__4__Impl_in_rule__MessageFieldDefault__Group__45309);
            rule__MessageFieldDefault__Group__4__Impl();

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
    // $ANTLR end "rule__MessageFieldDefault__Group__4"


    // $ANTLR start "rule__MessageFieldDefault__Group__4__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2589:1: rule__MessageFieldDefault__Group__4__Impl : ( RULE_BRACKET_R ) ;
    public final void rule__MessageFieldDefault__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2593:1: ( ( RULE_BRACKET_R ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2594:1: ( RULE_BRACKET_R )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2594:1: ( RULE_BRACKET_R )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2595:1: RULE_BRACKET_R
            {
             before(grammarAccess.getMessageFieldDefaultAccess().getBRACKET_RTerminalRuleCall_4()); 
            match(input,RULE_BRACKET_R,FOLLOW_RULE_BRACKET_R_in_rule__MessageFieldDefault__Group__4__Impl5336); 
             after(grammarAccess.getMessageFieldDefaultAccess().getBRACKET_RTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageFieldDefault__Group__4__Impl"


    // $ANTLR start "rule__EnumType__Group__0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2616:1: rule__EnumType__Group__0 : rule__EnumType__Group__0__Impl rule__EnumType__Group__1 ;
    public final void rule__EnumType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2620:1: ( rule__EnumType__Group__0__Impl rule__EnumType__Group__1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2621:2: rule__EnumType__Group__0__Impl rule__EnumType__Group__1
            {
            pushFollow(FOLLOW_rule__EnumType__Group__0__Impl_in_rule__EnumType__Group__05375);
            rule__EnumType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__1_in_rule__EnumType__Group__05378);
            rule__EnumType__Group__1();

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
    // $ANTLR end "rule__EnumType__Group__0"


    // $ANTLR start "rule__EnumType__Group__0__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2628:1: rule__EnumType__Group__0__Impl : ( RULE_ENUM ) ;
    public final void rule__EnumType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2632:1: ( ( RULE_ENUM ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2633:1: ( RULE_ENUM )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2633:1: ( RULE_ENUM )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2634:1: RULE_ENUM
            {
             before(grammarAccess.getEnumTypeAccess().getENUMTerminalRuleCall_0()); 
            match(input,RULE_ENUM,FOLLOW_RULE_ENUM_in_rule__EnumType__Group__0__Impl5405); 
             after(grammarAccess.getEnumTypeAccess().getENUMTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__0__Impl"


    // $ANTLR start "rule__EnumType__Group__1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2645:1: rule__EnumType__Group__1 : rule__EnumType__Group__1__Impl rule__EnumType__Group__2 ;
    public final void rule__EnumType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2649:1: ( rule__EnumType__Group__1__Impl rule__EnumType__Group__2 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2650:2: rule__EnumType__Group__1__Impl rule__EnumType__Group__2
            {
            pushFollow(FOLLOW_rule__EnumType__Group__1__Impl_in_rule__EnumType__Group__15434);
            rule__EnumType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__2_in_rule__EnumType__Group__15437);
            rule__EnumType__Group__2();

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
    // $ANTLR end "rule__EnumType__Group__1"


    // $ANTLR start "rule__EnumType__Group__1__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2657:1: rule__EnumType__Group__1__Impl : ( ( rule__EnumType__NameAssignment_1 ) ) ;
    public final void rule__EnumType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2661:1: ( ( ( rule__EnumType__NameAssignment_1 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2662:1: ( ( rule__EnumType__NameAssignment_1 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2662:1: ( ( rule__EnumType__NameAssignment_1 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2663:1: ( rule__EnumType__NameAssignment_1 )
            {
             before(grammarAccess.getEnumTypeAccess().getNameAssignment_1()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2664:1: ( rule__EnumType__NameAssignment_1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2664:2: rule__EnumType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumType__NameAssignment_1_in_rule__EnumType__Group__1__Impl5464);
            rule__EnumType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__1__Impl"


    // $ANTLR start "rule__EnumType__Group__2"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2674:1: rule__EnumType__Group__2 : rule__EnumType__Group__2__Impl rule__EnumType__Group__3 ;
    public final void rule__EnumType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2678:1: ( rule__EnumType__Group__2__Impl rule__EnumType__Group__3 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2679:2: rule__EnumType__Group__2__Impl rule__EnumType__Group__3
            {
            pushFollow(FOLLOW_rule__EnumType__Group__2__Impl_in_rule__EnumType__Group__25494);
            rule__EnumType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__3_in_rule__EnumType__Group__25497);
            rule__EnumType__Group__3();

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
    // $ANTLR end "rule__EnumType__Group__2"


    // $ANTLR start "rule__EnumType__Group__2__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2686:1: rule__EnumType__Group__2__Impl : ( RULE_BRACE_L ) ;
    public final void rule__EnumType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2690:1: ( ( RULE_BRACE_L ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2691:1: ( RULE_BRACE_L )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2691:1: ( RULE_BRACE_L )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2692:1: RULE_BRACE_L
            {
             before(grammarAccess.getEnumTypeAccess().getBRACE_LTerminalRuleCall_2()); 
            match(input,RULE_BRACE_L,FOLLOW_RULE_BRACE_L_in_rule__EnumType__Group__2__Impl5524); 
             after(grammarAccess.getEnumTypeAccess().getBRACE_LTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__2__Impl"


    // $ANTLR start "rule__EnumType__Group__3"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2703:1: rule__EnumType__Group__3 : rule__EnumType__Group__3__Impl rule__EnumType__Group__4 ;
    public final void rule__EnumType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2707:1: ( rule__EnumType__Group__3__Impl rule__EnumType__Group__4 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2708:2: rule__EnumType__Group__3__Impl rule__EnumType__Group__4
            {
            pushFollow(FOLLOW_rule__EnumType__Group__3__Impl_in_rule__EnumType__Group__35553);
            rule__EnumType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__4_in_rule__EnumType__Group__35556);
            rule__EnumType__Group__4();

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
    // $ANTLR end "rule__EnumType__Group__3"


    // $ANTLR start "rule__EnumType__Group__3__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2715:1: rule__EnumType__Group__3__Impl : ( ( rule__EnumType__Alternatives_3 )* ) ;
    public final void rule__EnumType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2719:1: ( ( ( rule__EnumType__Alternatives_3 )* ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2720:1: ( ( rule__EnumType__Alternatives_3 )* )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2720:1: ( ( rule__EnumType__Alternatives_3 )* )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2721:1: ( rule__EnumType__Alternatives_3 )*
            {
             before(grammarAccess.getEnumTypeAccess().getAlternatives_3()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2722:1: ( rule__EnumType__Alternatives_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_IDENTITY && LA26_0<=RULE_DEFAULT_KIND)||(LA26_0>=RULE_COMMENT_SL && LA26_0<=RULE_COMMENT_ML)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2722:2: rule__EnumType__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__EnumType__Alternatives_3_in_rule__EnumType__Group__3__Impl5583);
            	    rule__EnumType__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getEnumTypeAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__3__Impl"


    // $ANTLR start "rule__EnumType__Group__4"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2732:1: rule__EnumType__Group__4 : rule__EnumType__Group__4__Impl rule__EnumType__Group__5 ;
    public final void rule__EnumType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2736:1: ( rule__EnumType__Group__4__Impl rule__EnumType__Group__5 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2737:2: rule__EnumType__Group__4__Impl rule__EnumType__Group__5
            {
            pushFollow(FOLLOW_rule__EnumType__Group__4__Impl_in_rule__EnumType__Group__45614);
            rule__EnumType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumType__Group__5_in_rule__EnumType__Group__45617);
            rule__EnumType__Group__5();

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
    // $ANTLR end "rule__EnumType__Group__4"


    // $ANTLR start "rule__EnumType__Group__4__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2744:1: rule__EnumType__Group__4__Impl : ( RULE_BRACE_R ) ;
    public final void rule__EnumType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2748:1: ( ( RULE_BRACE_R ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2749:1: ( RULE_BRACE_R )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2749:1: ( RULE_BRACE_R )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2750:1: RULE_BRACE_R
            {
             before(grammarAccess.getEnumTypeAccess().getBRACE_RTerminalRuleCall_4()); 
            match(input,RULE_BRACE_R,FOLLOW_RULE_BRACE_R_in_rule__EnumType__Group__4__Impl5644); 
             after(grammarAccess.getEnumTypeAccess().getBRACE_RTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__4__Impl"


    // $ANTLR start "rule__EnumType__Group__5"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2761:1: rule__EnumType__Group__5 : rule__EnumType__Group__5__Impl ;
    public final void rule__EnumType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2765:1: ( rule__EnumType__Group__5__Impl )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2766:2: rule__EnumType__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EnumType__Group__5__Impl_in_rule__EnumType__Group__55673);
            rule__EnumType__Group__5__Impl();

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
    // $ANTLR end "rule__EnumType__Group__5"


    // $ANTLR start "rule__EnumType__Group__5__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2772:1: rule__EnumType__Group__5__Impl : ( ( RULE_END )? ) ;
    public final void rule__EnumType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2776:1: ( ( ( RULE_END )? ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2777:1: ( ( RULE_END )? )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2777:1: ( ( RULE_END )? )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2778:1: ( RULE_END )?
            {
             before(grammarAccess.getEnumTypeAccess().getENDTerminalRuleCall_5()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2779:1: ( RULE_END )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_END) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2779:3: RULE_END
                    {
                    match(input,RULE_END,FOLLOW_RULE_END_in_rule__EnumType__Group__5__Impl5701); 

                    }
                    break;

            }

             after(grammarAccess.getEnumTypeAccess().getENDTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__Group__5__Impl"


    // $ANTLR start "rule__EnumField__Group__0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2801:1: rule__EnumField__Group__0 : rule__EnumField__Group__0__Impl rule__EnumField__Group__1 ;
    public final void rule__EnumField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2805:1: ( rule__EnumField__Group__0__Impl rule__EnumField__Group__1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2806:2: rule__EnumField__Group__0__Impl rule__EnumField__Group__1
            {
            pushFollow(FOLLOW_rule__EnumField__Group__0__Impl_in_rule__EnumField__Group__05744);
            rule__EnumField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumField__Group__1_in_rule__EnumField__Group__05747);
            rule__EnumField__Group__1();

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
    // $ANTLR end "rule__EnumField__Group__0"


    // $ANTLR start "rule__EnumField__Group__0__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2813:1: rule__EnumField__Group__0__Impl : ( ( rule__EnumField__NameAssignment_0 ) ) ;
    public final void rule__EnumField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2817:1: ( ( ( rule__EnumField__NameAssignment_0 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2818:1: ( ( rule__EnumField__NameAssignment_0 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2818:1: ( ( rule__EnumField__NameAssignment_0 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2819:1: ( rule__EnumField__NameAssignment_0 )
            {
             before(grammarAccess.getEnumFieldAccess().getNameAssignment_0()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2820:1: ( rule__EnumField__NameAssignment_0 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2820:2: rule__EnumField__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EnumField__NameAssignment_0_in_rule__EnumField__Group__0__Impl5774);
            rule__EnumField__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumFieldAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2830:1: rule__EnumField__Group__1 : rule__EnumField__Group__1__Impl rule__EnumField__Group__2 ;
    public final void rule__EnumField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2834:1: ( rule__EnumField__Group__1__Impl rule__EnumField__Group__2 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2835:2: rule__EnumField__Group__1__Impl rule__EnumField__Group__2
            {
            pushFollow(FOLLOW_rule__EnumField__Group__1__Impl_in_rule__EnumField__Group__15804);
            rule__EnumField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumField__Group__2_in_rule__EnumField__Group__15807);
            rule__EnumField__Group__2();

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
    // $ANTLR end "rule__EnumField__Group__1"


    // $ANTLR start "rule__EnumField__Group__1__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2842:1: rule__EnumField__Group__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__EnumField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2846:1: ( ( RULE_EQUALS ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2847:1: ( RULE_EQUALS )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2847:1: ( RULE_EQUALS )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2848:1: RULE_EQUALS
            {
             before(grammarAccess.getEnumFieldAccess().getEQUALSTerminalRuleCall_1()); 
            match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_rule__EnumField__Group__1__Impl5834); 
             after(grammarAccess.getEnumFieldAccess().getEQUALSTerminalRuleCall_1()); 

            }


            }

        }
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
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2859:1: rule__EnumField__Group__2 : rule__EnumField__Group__2__Impl rule__EnumField__Group__3 ;
    public final void rule__EnumField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2863:1: ( rule__EnumField__Group__2__Impl rule__EnumField__Group__3 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2864:2: rule__EnumField__Group__2__Impl rule__EnumField__Group__3
            {
            pushFollow(FOLLOW_rule__EnumField__Group__2__Impl_in_rule__EnumField__Group__25863);
            rule__EnumField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumField__Group__3_in_rule__EnumField__Group__25866);
            rule__EnumField__Group__3();

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
    // $ANTLR end "rule__EnumField__Group__2"


    // $ANTLR start "rule__EnumField__Group__2__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2871:1: rule__EnumField__Group__2__Impl : ( ( rule__EnumField__IndexAssignment_2 ) ) ;
    public final void rule__EnumField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2875:1: ( ( ( rule__EnumField__IndexAssignment_2 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2876:1: ( ( rule__EnumField__IndexAssignment_2 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2876:1: ( ( rule__EnumField__IndexAssignment_2 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2877:1: ( rule__EnumField__IndexAssignment_2 )
            {
             before(grammarAccess.getEnumFieldAccess().getIndexAssignment_2()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2878:1: ( rule__EnumField__IndexAssignment_2 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2878:2: rule__EnumField__IndexAssignment_2
            {
            pushFollow(FOLLOW_rule__EnumField__IndexAssignment_2_in_rule__EnumField__Group__2__Impl5893);
            rule__EnumField__IndexAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumFieldAccess().getIndexAssignment_2()); 

            }


            }

        }
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
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2888:1: rule__EnumField__Group__3 : rule__EnumField__Group__3__Impl ;
    public final void rule__EnumField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2892:1: ( rule__EnumField__Group__3__Impl )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2893:2: rule__EnumField__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EnumField__Group__3__Impl_in_rule__EnumField__Group__35923);
            rule__EnumField__Group__3__Impl();

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
    // $ANTLR end "rule__EnumField__Group__3"


    // $ANTLR start "rule__EnumField__Group__3__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2899:1: rule__EnumField__Group__3__Impl : ( ( RULE_END )? ) ;
    public final void rule__EnumField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2903:1: ( ( ( RULE_END )? ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2904:1: ( ( RULE_END )? )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2904:1: ( ( RULE_END )? )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2905:1: ( RULE_END )?
            {
             before(grammarAccess.getEnumFieldAccess().getENDTerminalRuleCall_3()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2906:1: ( RULE_END )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_END) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2906:3: RULE_END
                    {
                    match(input,RULE_END,FOLLOW_RULE_END_in_rule__EnumField__Group__3__Impl5951); 

                    }
                    break;

            }

             after(grammarAccess.getEnumFieldAccess().getENDTerminalRuleCall_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__EnumFieldOpt__Group__0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2924:1: rule__EnumFieldOpt__Group__0 : rule__EnumFieldOpt__Group__0__Impl rule__EnumFieldOpt__Group__1 ;
    public final void rule__EnumFieldOpt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2928:1: ( rule__EnumFieldOpt__Group__0__Impl rule__EnumFieldOpt__Group__1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2929:2: rule__EnumFieldOpt__Group__0__Impl rule__EnumFieldOpt__Group__1
            {
            pushFollow(FOLLOW_rule__EnumFieldOpt__Group__0__Impl_in_rule__EnumFieldOpt__Group__05990);
            rule__EnumFieldOpt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumFieldOpt__Group__1_in_rule__EnumFieldOpt__Group__05993);
            rule__EnumFieldOpt__Group__1();

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
    // $ANTLR end "rule__EnumFieldOpt__Group__0"


    // $ANTLR start "rule__EnumFieldOpt__Group__0__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2936:1: rule__EnumFieldOpt__Group__0__Impl : ( RULE_OPTION ) ;
    public final void rule__EnumFieldOpt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2940:1: ( ( RULE_OPTION ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2941:1: ( RULE_OPTION )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2941:1: ( RULE_OPTION )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2942:1: RULE_OPTION
            {
             before(grammarAccess.getEnumFieldOptAccess().getOPTIONTerminalRuleCall_0()); 
            match(input,RULE_OPTION,FOLLOW_RULE_OPTION_in_rule__EnumFieldOpt__Group__0__Impl6020); 
             after(grammarAccess.getEnumFieldOptAccess().getOPTIONTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumFieldOpt__Group__0__Impl"


    // $ANTLR start "rule__EnumFieldOpt__Group__1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2953:1: rule__EnumFieldOpt__Group__1 : rule__EnumFieldOpt__Group__1__Impl rule__EnumFieldOpt__Group__2 ;
    public final void rule__EnumFieldOpt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2957:1: ( rule__EnumFieldOpt__Group__1__Impl rule__EnumFieldOpt__Group__2 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2958:2: rule__EnumFieldOpt__Group__1__Impl rule__EnumFieldOpt__Group__2
            {
            pushFollow(FOLLOW_rule__EnumFieldOpt__Group__1__Impl_in_rule__EnumFieldOpt__Group__16049);
            rule__EnumFieldOpt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumFieldOpt__Group__2_in_rule__EnumFieldOpt__Group__16052);
            rule__EnumFieldOpt__Group__2();

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
    // $ANTLR end "rule__EnumFieldOpt__Group__1"


    // $ANTLR start "rule__EnumFieldOpt__Group__1__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2965:1: rule__EnumFieldOpt__Group__1__Impl : ( ( rule__EnumFieldOpt__NameAssignment_1 ) ) ;
    public final void rule__EnumFieldOpt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2969:1: ( ( ( rule__EnumFieldOpt__NameAssignment_1 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2970:1: ( ( rule__EnumFieldOpt__NameAssignment_1 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2970:1: ( ( rule__EnumFieldOpt__NameAssignment_1 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2971:1: ( rule__EnumFieldOpt__NameAssignment_1 )
            {
             before(grammarAccess.getEnumFieldOptAccess().getNameAssignment_1()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2972:1: ( rule__EnumFieldOpt__NameAssignment_1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2972:2: rule__EnumFieldOpt__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumFieldOpt__NameAssignment_1_in_rule__EnumFieldOpt__Group__1__Impl6079);
            rule__EnumFieldOpt__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumFieldOptAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumFieldOpt__Group__1__Impl"


    // $ANTLR start "rule__EnumFieldOpt__Group__2"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2982:1: rule__EnumFieldOpt__Group__2 : rule__EnumFieldOpt__Group__2__Impl rule__EnumFieldOpt__Group__3 ;
    public final void rule__EnumFieldOpt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2986:1: ( rule__EnumFieldOpt__Group__2__Impl rule__EnumFieldOpt__Group__3 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2987:2: rule__EnumFieldOpt__Group__2__Impl rule__EnumFieldOpt__Group__3
            {
            pushFollow(FOLLOW_rule__EnumFieldOpt__Group__2__Impl_in_rule__EnumFieldOpt__Group__26109);
            rule__EnumFieldOpt__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumFieldOpt__Group__3_in_rule__EnumFieldOpt__Group__26112);
            rule__EnumFieldOpt__Group__3();

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
    // $ANTLR end "rule__EnumFieldOpt__Group__2"


    // $ANTLR start "rule__EnumFieldOpt__Group__2__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2994:1: rule__EnumFieldOpt__Group__2__Impl : ( RULE_EQUALS ) ;
    public final void rule__EnumFieldOpt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2998:1: ( ( RULE_EQUALS ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2999:1: ( RULE_EQUALS )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:2999:1: ( RULE_EQUALS )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3000:1: RULE_EQUALS
            {
             before(grammarAccess.getEnumFieldOptAccess().getEQUALSTerminalRuleCall_2()); 
            match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_rule__EnumFieldOpt__Group__2__Impl6139); 
             after(grammarAccess.getEnumFieldOptAccess().getEQUALSTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumFieldOpt__Group__2__Impl"


    // $ANTLR start "rule__EnumFieldOpt__Group__3"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3011:1: rule__EnumFieldOpt__Group__3 : rule__EnumFieldOpt__Group__3__Impl rule__EnumFieldOpt__Group__4 ;
    public final void rule__EnumFieldOpt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3015:1: ( rule__EnumFieldOpt__Group__3__Impl rule__EnumFieldOpt__Group__4 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3016:2: rule__EnumFieldOpt__Group__3__Impl rule__EnumFieldOpt__Group__4
            {
            pushFollow(FOLLOW_rule__EnumFieldOpt__Group__3__Impl_in_rule__EnumFieldOpt__Group__36168);
            rule__EnumFieldOpt__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumFieldOpt__Group__4_in_rule__EnumFieldOpt__Group__36171);
            rule__EnumFieldOpt__Group__4();

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
    // $ANTLR end "rule__EnumFieldOpt__Group__3"


    // $ANTLR start "rule__EnumFieldOpt__Group__3__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3023:1: rule__EnumFieldOpt__Group__3__Impl : ( ( rule__EnumFieldOpt__ValueAssignment_3 ) ) ;
    public final void rule__EnumFieldOpt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3027:1: ( ( ( rule__EnumFieldOpt__ValueAssignment_3 ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3028:1: ( ( rule__EnumFieldOpt__ValueAssignment_3 ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3028:1: ( ( rule__EnumFieldOpt__ValueAssignment_3 ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3029:1: ( rule__EnumFieldOpt__ValueAssignment_3 )
            {
             before(grammarAccess.getEnumFieldOptAccess().getValueAssignment_3()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3030:1: ( rule__EnumFieldOpt__ValueAssignment_3 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3030:2: rule__EnumFieldOpt__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumFieldOpt__ValueAssignment_3_in_rule__EnumFieldOpt__Group__3__Impl6198);
            rule__EnumFieldOpt__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumFieldOptAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumFieldOpt__Group__3__Impl"


    // $ANTLR start "rule__EnumFieldOpt__Group__4"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3040:1: rule__EnumFieldOpt__Group__4 : rule__EnumFieldOpt__Group__4__Impl ;
    public final void rule__EnumFieldOpt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3044:1: ( rule__EnumFieldOpt__Group__4__Impl )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3045:2: rule__EnumFieldOpt__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EnumFieldOpt__Group__4__Impl_in_rule__EnumFieldOpt__Group__46228);
            rule__EnumFieldOpt__Group__4__Impl();

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
    // $ANTLR end "rule__EnumFieldOpt__Group__4"


    // $ANTLR start "rule__EnumFieldOpt__Group__4__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3051:1: rule__EnumFieldOpt__Group__4__Impl : ( ( RULE_END )? ) ;
    public final void rule__EnumFieldOpt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3055:1: ( ( ( RULE_END )? ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3056:1: ( ( RULE_END )? )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3056:1: ( ( RULE_END )? )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3057:1: ( RULE_END )?
            {
             before(grammarAccess.getEnumFieldOptAccess().getENDTerminalRuleCall_4()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3058:1: ( RULE_END )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_END) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3058:3: RULE_END
                    {
                    match(input,RULE_END,FOLLOW_RULE_END_in_rule__EnumFieldOpt__Group__4__Impl6256); 

                    }
                    break;

            }

             after(grammarAccess.getEnumFieldOptAccess().getENDTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumFieldOpt__Group__4__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3078:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3082:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3083:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06297);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06300);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3090:1: rule__QualifiedName__Group__0__Impl : ( RULE_IDENTITY ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3094:1: ( ( RULE_IDENTITY ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3095:1: ( RULE_IDENTITY )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3095:1: ( RULE_IDENTITY )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3096:1: RULE_IDENTITY
            {
             before(grammarAccess.getQualifiedNameAccess().getIDENTITYTerminalRuleCall_0()); 
            match(input,RULE_IDENTITY,FOLLOW_RULE_IDENTITY_in_rule__QualifiedName__Group__0__Impl6327); 
             after(grammarAccess.getQualifiedNameAccess().getIDENTITYTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3107:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3111:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3112:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16356);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3118:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3122:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3123:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3123:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3124:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3125:1: ( rule__QualifiedName__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_DOT) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3125:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl6383);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3139:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3143:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3144:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06418);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06421);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3151:1: rule__QualifiedName__Group_1__0__Impl : ( RULE_DOT ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3155:1: ( ( RULE_DOT ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3156:1: ( RULE_DOT )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3156:1: ( RULE_DOT )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3157:1: RULE_DOT
            {
             before(grammarAccess.getQualifiedNameAccess().getDOTTerminalRuleCall_1_0()); 
            match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rule__QualifiedName__Group_1__0__Impl6448); 
             after(grammarAccess.getQualifiedNameAccess().getDOTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3168:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3172:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3173:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16477);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3179:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_IDENTITY ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3183:1: ( ( RULE_IDENTITY ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3184:1: ( RULE_IDENTITY )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3184:1: ( RULE_IDENTITY )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3185:1: RULE_IDENTITY
            {
             before(grammarAccess.getQualifiedNameAccess().getIDENTITYTerminalRuleCall_1_1()); 
            match(input,RULE_IDENTITY,FOLLOW_RULE_IDENTITY_in_rule__QualifiedName__Group_1__1__Impl6504); 
             after(grammarAccess.getQualifiedNameAccess().getIDENTITYTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__NameAssignment_0_1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3201:1: rule__Model__NameAssignment_0_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3205:1: ( ( ruleQualifiedName ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3206:1: ( ruleQualifiedName )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3206:1: ( ruleQualifiedName )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3207:1: ruleQualifiedName
            {
             before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_0_16542);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_0_1"


    // $ANTLR start "rule__Model__ImportsAssignment_1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3216:1: rule__Model__ImportsAssignment_1 : ( ruleImportInfo ) ;
    public final void rule__Model__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3220:1: ( ( ruleImportInfo ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3221:1: ( ruleImportInfo )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3221:1: ( ruleImportInfo )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3222:1: ruleImportInfo
            {
             before(grammarAccess.getModelAccess().getImportsImportInfoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImportInfo_in_rule__Model__ImportsAssignment_16573);
            ruleImportInfo();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportInfoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportsAssignment_1"


    // $ANTLR start "rule__Model__OptionsAssignment_2"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3231:1: rule__Model__OptionsAssignment_2 : ( ruleOptionInfo ) ;
    public final void rule__Model__OptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3235:1: ( ( ruleOptionInfo ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3236:1: ( ruleOptionInfo )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3236:1: ( ruleOptionInfo )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3237:1: ruleOptionInfo
            {
             before(grammarAccess.getModelAccess().getOptionsOptionInfoParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOptionInfo_in_rule__Model__OptionsAssignment_26604);
            ruleOptionInfo();

            state._fsp--;

             after(grammarAccess.getModelAccess().getOptionsOptionInfoParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__OptionsAssignment_2"


    // $ANTLR start "rule__Model__ElementsAssignment_3"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3246:1: rule__Model__ElementsAssignment_3 : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3250:1: ( ( ruleElement ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3251:1: ( ruleElement )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3251:1: ( ruleElement )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3252:1: ruleElement
            {
             before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Model__ElementsAssignment_36635);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment_3"


    // $ANTLR start "rule__Model__CommAssignment_4"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3261:1: rule__Model__CommAssignment_4 : ( ruleComment_ALL ) ;
    public final void rule__Model__CommAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3265:1: ( ( ruleComment_ALL ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3266:1: ( ruleComment_ALL )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3266:1: ( ruleComment_ALL )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3267:1: ruleComment_ALL
            {
             before(grammarAccess.getModelAccess().getCommComment_ALLParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleComment_ALL_in_rule__Model__CommAssignment_46666);
            ruleComment_ALL();

            state._fsp--;

             after(grammarAccess.getModelAccess().getCommComment_ALLParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__CommAssignment_4"


    // $ANTLR start "rule__ImportInfo__ImportURIAssignment_1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3276:1: rule__ImportInfo__ImportURIAssignment_1 : ( RULE_SL_STRING ) ;
    public final void rule__ImportInfo__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3280:1: ( ( RULE_SL_STRING ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3281:1: ( RULE_SL_STRING )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3281:1: ( RULE_SL_STRING )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3282:1: RULE_SL_STRING
            {
             before(grammarAccess.getImportInfoAccess().getImportURISL_STRINGTerminalRuleCall_1_0()); 
            match(input,RULE_SL_STRING,FOLLOW_RULE_SL_STRING_in_rule__ImportInfo__ImportURIAssignment_16697); 
             after(grammarAccess.getImportInfoAccess().getImportURISL_STRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportInfo__ImportURIAssignment_1"


    // $ANTLR start "rule__OptionInfo__NameAssignment_1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3291:1: rule__OptionInfo__NameAssignment_1 : ( ruleENTITY_NAME ) ;
    public final void rule__OptionInfo__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3295:1: ( ( ruleENTITY_NAME ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3296:1: ( ruleENTITY_NAME )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3296:1: ( ruleENTITY_NAME )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3297:1: ruleENTITY_NAME
            {
             before(grammarAccess.getOptionInfoAccess().getNameENTITY_NAMEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleENTITY_NAME_in_rule__OptionInfo__NameAssignment_16728);
            ruleENTITY_NAME();

            state._fsp--;

             after(grammarAccess.getOptionInfoAccess().getNameENTITY_NAMEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionInfo__NameAssignment_1"


    // $ANTLR start "rule__OptionInfo__ValueAssignment_3"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3306:1: rule__OptionInfo__ValueAssignment_3 : ( RULE_SL_STRING ) ;
    public final void rule__OptionInfo__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3310:1: ( ( RULE_SL_STRING ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3311:1: ( RULE_SL_STRING )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3311:1: ( RULE_SL_STRING )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3312:1: RULE_SL_STRING
            {
             before(grammarAccess.getOptionInfoAccess().getValueSL_STRINGTerminalRuleCall_3_0()); 
            match(input,RULE_SL_STRING,FOLLOW_RULE_SL_STRING_in_rule__OptionInfo__ValueAssignment_36759); 
             after(grammarAccess.getOptionInfoAccess().getValueSL_STRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionInfo__ValueAssignment_3"


    // $ANTLR start "rule__Map__NameAssignment_1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3321:1: rule__Map__NameAssignment_1 : ( ruleENTITY_NAME ) ;
    public final void rule__Map__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3325:1: ( ( ruleENTITY_NAME ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3326:1: ( ruleENTITY_NAME )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3326:1: ( ruleENTITY_NAME )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3327:1: ruleENTITY_NAME
            {
             before(grammarAccess.getMapAccess().getNameENTITY_NAMEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleENTITY_NAME_in_rule__Map__NameAssignment_16790);
            ruleENTITY_NAME();

            state._fsp--;

             after(grammarAccess.getMapAccess().getNameENTITY_NAMEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__NameAssignment_1"


    // $ANTLR start "rule__Map__BindAssignment_3"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3336:1: rule__Map__BindAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Map__BindAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3340:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3341:1: ( ( ruleQualifiedName ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3341:1: ( ( ruleQualifiedName ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3342:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getMapAccess().getBindMessageTypeCrossReference_3_0()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3343:1: ( ruleQualifiedName )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3344:1: ruleQualifiedName
            {
             before(grammarAccess.getMapAccess().getBindMessageTypeQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Map__BindAssignment_36825);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMapAccess().getBindMessageTypeQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMapAccess().getBindMessageTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__BindAssignment_3"


    // $ANTLR start "rule__Map__CommAssignment_5_0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3355:1: rule__Map__CommAssignment_5_0 : ( ruleComment_ALL ) ;
    public final void rule__Map__CommAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3359:1: ( ( ruleComment_ALL ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3360:1: ( ruleComment_ALL )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3360:1: ( ruleComment_ALL )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3361:1: ruleComment_ALL
            {
             before(grammarAccess.getMapAccess().getCommComment_ALLParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleComment_ALL_in_rule__Map__CommAssignment_5_06860);
            ruleComment_ALL();

            state._fsp--;

             after(grammarAccess.getMapAccess().getCommComment_ALLParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__CommAssignment_5_0"


    // $ANTLR start "rule__Map__FieldsAssignment_5_1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3370:1: rule__Map__FieldsAssignment_5_1 : ( ruleMapField ) ;
    public final void rule__Map__FieldsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3374:1: ( ( ruleMapField ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3375:1: ( ruleMapField )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3375:1: ( ruleMapField )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3376:1: ruleMapField
            {
             before(grammarAccess.getMapAccess().getFieldsMapFieldParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleMapField_in_rule__Map__FieldsAssignment_5_16891);
            ruleMapField();

            state._fsp--;

             after(grammarAccess.getMapAccess().getFieldsMapFieldParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__FieldsAssignment_5_1"


    // $ANTLR start "rule__MapField__AttrAssignment_0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3385:1: rule__MapField__AttrAssignment_0 : ( RULE_FIELD_ATTR ) ;
    public final void rule__MapField__AttrAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3389:1: ( ( RULE_FIELD_ATTR ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3390:1: ( RULE_FIELD_ATTR )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3390:1: ( RULE_FIELD_ATTR )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3391:1: RULE_FIELD_ATTR
            {
             before(grammarAccess.getMapFieldAccess().getAttrFIELD_ATTRTerminalRuleCall_0_0()); 
            match(input,RULE_FIELD_ATTR,FOLLOW_RULE_FIELD_ATTR_in_rule__MapField__AttrAssignment_06922); 
             after(grammarAccess.getMapFieldAccess().getAttrFIELD_ATTRTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapField__AttrAssignment_0"


    // $ANTLR start "rule__MapField__NameAssignment_1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3400:1: rule__MapField__NameAssignment_1 : ( ruleENTITY_NAME ) ;
    public final void rule__MapField__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3404:1: ( ( ruleENTITY_NAME ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3405:1: ( ruleENTITY_NAME )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3405:1: ( ruleENTITY_NAME )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3406:1: ruleENTITY_NAME
            {
             before(grammarAccess.getMapFieldAccess().getNameENTITY_NAMEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleENTITY_NAME_in_rule__MapField__NameAssignment_16953);
            ruleENTITY_NAME();

            state._fsp--;

             after(grammarAccess.getMapFieldAccess().getNameENTITY_NAMEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapField__NameAssignment_1"


    // $ANTLR start "rule__MapField__FilterAssignment_2_1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3415:1: rule__MapField__FilterAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MapField__FilterAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3419:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3420:1: ( ( ruleQualifiedName ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3420:1: ( ( ruleQualifiedName ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3421:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getMapFieldAccess().getFilterMapCrossReference_2_1_0()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3422:1: ( ruleQualifiedName )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3423:1: ruleQualifiedName
            {
             before(grammarAccess.getMapFieldAccess().getFilterMapQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__MapField__FilterAssignment_2_16988);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMapFieldAccess().getFilterMapQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getMapFieldAccess().getFilterMapCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapField__FilterAssignment_2_1"


    // $ANTLR start "rule__MapField__LinksAssignment_4"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3434:1: rule__MapField__LinksAssignment_4 : ( ruleMapRef ) ;
    public final void rule__MapField__LinksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3438:1: ( ( ruleMapRef ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3439:1: ( ruleMapRef )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3439:1: ( ruleMapRef )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3440:1: ruleMapRef
            {
             before(grammarAccess.getMapFieldAccess().getLinksMapRefParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMapRef_in_rule__MapField__LinksAssignment_47023);
            ruleMapRef();

            state._fsp--;

             after(grammarAccess.getMapFieldAccess().getLinksMapRefParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapField__LinksAssignment_4"


    // $ANTLR start "rule__MapRef__LinkAssignment_0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3449:1: rule__MapRef__LinkAssignment_0 : ( ( RULE_IDENTITY ) ) ;
    public final void rule__MapRef__LinkAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3453:1: ( ( ( RULE_IDENTITY ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3454:1: ( ( RULE_IDENTITY ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3454:1: ( ( RULE_IDENTITY ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3455:1: ( RULE_IDENTITY )
            {
             before(grammarAccess.getMapRefAccess().getLinkMessageFieldCrossReference_0_0()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3456:1: ( RULE_IDENTITY )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3457:1: RULE_IDENTITY
            {
             before(grammarAccess.getMapRefAccess().getLinkMessageFieldIDENTITYTerminalRuleCall_0_0_1()); 
            match(input,RULE_IDENTITY,FOLLOW_RULE_IDENTITY_in_rule__MapRef__LinkAssignment_07058); 
             after(grammarAccess.getMapRefAccess().getLinkMessageFieldIDENTITYTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMapRefAccess().getLinkMessageFieldCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapRef__LinkAssignment_0"


    // $ANTLR start "rule__MapRef__ChildAssignment_1_1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3468:1: rule__MapRef__ChildAssignment_1_1 : ( ruleMapRef ) ;
    public final void rule__MapRef__ChildAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3472:1: ( ( ruleMapRef ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3473:1: ( ruleMapRef )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3473:1: ( ruleMapRef )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3474:1: ruleMapRef
            {
             before(grammarAccess.getMapRefAccess().getChildMapRefParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMapRef_in_rule__MapRef__ChildAssignment_1_17093);
            ruleMapRef();

            state._fsp--;

             after(grammarAccess.getMapRefAccess().getChildMapRefParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapRef__ChildAssignment_1_1"


    // $ANTLR start "rule__MessageType__NameAssignment_1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3483:1: rule__MessageType__NameAssignment_1 : ( ruleENTITY_NAME ) ;
    public final void rule__MessageType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3487:1: ( ( ruleENTITY_NAME ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3488:1: ( ruleENTITY_NAME )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3488:1: ( ruleENTITY_NAME )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3489:1: ruleENTITY_NAME
            {
             before(grammarAccess.getMessageTypeAccess().getNameENTITY_NAMEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleENTITY_NAME_in_rule__MessageType__NameAssignment_17124);
            ruleENTITY_NAME();

            state._fsp--;

             after(grammarAccess.getMessageTypeAccess().getNameENTITY_NAMEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageType__NameAssignment_1"


    // $ANTLR start "rule__MessageType__CommAssignment_3_0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3498:1: rule__MessageType__CommAssignment_3_0 : ( ruleComment_ALL ) ;
    public final void rule__MessageType__CommAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3502:1: ( ( ruleComment_ALL ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3503:1: ( ruleComment_ALL )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3503:1: ( ruleComment_ALL )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3504:1: ruleComment_ALL
            {
             before(grammarAccess.getMessageTypeAccess().getCommComment_ALLParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleComment_ALL_in_rule__MessageType__CommAssignment_3_07155);
            ruleComment_ALL();

            state._fsp--;

             after(grammarAccess.getMessageTypeAccess().getCommComment_ALLParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageType__CommAssignment_3_0"


    // $ANTLR start "rule__MessageType__FieldsAssignment_3_1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3513:1: rule__MessageType__FieldsAssignment_3_1 : ( ruleMessageField ) ;
    public final void rule__MessageType__FieldsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3517:1: ( ( ruleMessageField ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3518:1: ( ruleMessageField )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3518:1: ( ruleMessageField )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3519:1: ruleMessageField
            {
             before(grammarAccess.getMessageTypeAccess().getFieldsMessageFieldParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleMessageField_in_rule__MessageType__FieldsAssignment_3_17186);
            ruleMessageField();

            state._fsp--;

             after(grammarAccess.getMessageTypeAccess().getFieldsMessageFieldParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageType__FieldsAssignment_3_1"


    // $ANTLR start "rule__MessageType__TypesAssignment_3_2"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3528:1: rule__MessageType__TypesAssignment_3_2 : ( ruleType ) ;
    public final void rule__MessageType__TypesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3532:1: ( ( ruleType ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3533:1: ( ruleType )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3533:1: ( ruleType )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3534:1: ruleType
            {
             before(grammarAccess.getMessageTypeAccess().getTypesTypeParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__MessageType__TypesAssignment_3_27217);
            ruleType();

            state._fsp--;

             after(grammarAccess.getMessageTypeAccess().getTypesTypeParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageType__TypesAssignment_3_2"


    // $ANTLR start "rule__MessageSimpleField__AttrAssignment_0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3543:1: rule__MessageSimpleField__AttrAssignment_0 : ( RULE_FIELD_ATTR ) ;
    public final void rule__MessageSimpleField__AttrAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3547:1: ( ( RULE_FIELD_ATTR ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3548:1: ( RULE_FIELD_ATTR )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3548:1: ( RULE_FIELD_ATTR )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3549:1: RULE_FIELD_ATTR
            {
             before(grammarAccess.getMessageSimpleFieldAccess().getAttrFIELD_ATTRTerminalRuleCall_0_0()); 
            match(input,RULE_FIELD_ATTR,FOLLOW_RULE_FIELD_ATTR_in_rule__MessageSimpleField__AttrAssignment_07248); 
             after(grammarAccess.getMessageSimpleFieldAccess().getAttrFIELD_ATTRTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSimpleField__AttrAssignment_0"


    // $ANTLR start "rule__MessageSimpleField__TypeAssignment_1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3558:1: rule__MessageSimpleField__TypeAssignment_1 : ( RULE_FIELD_TYPE ) ;
    public final void rule__MessageSimpleField__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3562:1: ( ( RULE_FIELD_TYPE ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3563:1: ( RULE_FIELD_TYPE )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3563:1: ( RULE_FIELD_TYPE )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3564:1: RULE_FIELD_TYPE
            {
             before(grammarAccess.getMessageSimpleFieldAccess().getTypeFIELD_TYPETerminalRuleCall_1_0()); 
            match(input,RULE_FIELD_TYPE,FOLLOW_RULE_FIELD_TYPE_in_rule__MessageSimpleField__TypeAssignment_17279); 
             after(grammarAccess.getMessageSimpleFieldAccess().getTypeFIELD_TYPETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSimpleField__TypeAssignment_1"


    // $ANTLR start "rule__MessageSimpleField__NameAssignment_2"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3573:1: rule__MessageSimpleField__NameAssignment_2 : ( ruleENTITY_NAME ) ;
    public final void rule__MessageSimpleField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3577:1: ( ( ruleENTITY_NAME ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3578:1: ( ruleENTITY_NAME )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3578:1: ( ruleENTITY_NAME )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3579:1: ruleENTITY_NAME
            {
             before(grammarAccess.getMessageSimpleFieldAccess().getNameENTITY_NAMEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleENTITY_NAME_in_rule__MessageSimpleField__NameAssignment_27310);
            ruleENTITY_NAME();

            state._fsp--;

             after(grammarAccess.getMessageSimpleFieldAccess().getNameENTITY_NAMEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSimpleField__NameAssignment_2"


    // $ANTLR start "rule__MessageSimpleField__IndexAssignment_4"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3588:1: rule__MessageSimpleField__IndexAssignment_4 : ( RULE_NUMBER ) ;
    public final void rule__MessageSimpleField__IndexAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3592:1: ( ( RULE_NUMBER ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3593:1: ( RULE_NUMBER )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3593:1: ( RULE_NUMBER )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3594:1: RULE_NUMBER
            {
             before(grammarAccess.getMessageSimpleFieldAccess().getIndexNUMBERTerminalRuleCall_4_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__MessageSimpleField__IndexAssignment_47341); 
             after(grammarAccess.getMessageSimpleFieldAccess().getIndexNUMBERTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageSimpleField__IndexAssignment_4"


    // $ANTLR start "rule__MessageComplexField__AttrAssignment_0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3603:1: rule__MessageComplexField__AttrAssignment_0 : ( RULE_FIELD_ATTR ) ;
    public final void rule__MessageComplexField__AttrAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3607:1: ( ( RULE_FIELD_ATTR ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3608:1: ( RULE_FIELD_ATTR )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3608:1: ( RULE_FIELD_ATTR )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3609:1: RULE_FIELD_ATTR
            {
             before(grammarAccess.getMessageComplexFieldAccess().getAttrFIELD_ATTRTerminalRuleCall_0_0()); 
            match(input,RULE_FIELD_ATTR,FOLLOW_RULE_FIELD_ATTR_in_rule__MessageComplexField__AttrAssignment_07372); 
             after(grammarAccess.getMessageComplexFieldAccess().getAttrFIELD_ATTRTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageComplexField__AttrAssignment_0"


    // $ANTLR start "rule__MessageComplexField__TypeAssignment_1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3618:1: rule__MessageComplexField__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MessageComplexField__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3622:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3623:1: ( ( ruleQualifiedName ) )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3623:1: ( ( ruleQualifiedName ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3624:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getMessageComplexFieldAccess().getTypeTypeCrossReference_1_0()); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3625:1: ( ruleQualifiedName )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3626:1: ruleQualifiedName
            {
             before(grammarAccess.getMessageComplexFieldAccess().getTypeTypeQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__MessageComplexField__TypeAssignment_17407);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMessageComplexFieldAccess().getTypeTypeQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMessageComplexFieldAccess().getTypeTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageComplexField__TypeAssignment_1"


    // $ANTLR start "rule__MessageComplexField__NameAssignment_2"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3637:1: rule__MessageComplexField__NameAssignment_2 : ( ruleENTITY_NAME ) ;
    public final void rule__MessageComplexField__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3641:1: ( ( ruleENTITY_NAME ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3642:1: ( ruleENTITY_NAME )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3642:1: ( ruleENTITY_NAME )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3643:1: ruleENTITY_NAME
            {
             before(grammarAccess.getMessageComplexFieldAccess().getNameENTITY_NAMEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleENTITY_NAME_in_rule__MessageComplexField__NameAssignment_27442);
            ruleENTITY_NAME();

            state._fsp--;

             after(grammarAccess.getMessageComplexFieldAccess().getNameENTITY_NAMEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageComplexField__NameAssignment_2"


    // $ANTLR start "rule__MessageComplexField__IndexAssignment_4"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3652:1: rule__MessageComplexField__IndexAssignment_4 : ( RULE_NUMBER ) ;
    public final void rule__MessageComplexField__IndexAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3656:1: ( ( RULE_NUMBER ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3657:1: ( RULE_NUMBER )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3657:1: ( RULE_NUMBER )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3658:1: RULE_NUMBER
            {
             before(grammarAccess.getMessageComplexFieldAccess().getIndexNUMBERTerminalRuleCall_4_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__MessageComplexField__IndexAssignment_47473); 
             after(grammarAccess.getMessageComplexFieldAccess().getIndexNUMBERTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MessageComplexField__IndexAssignment_4"


    // $ANTLR start "rule__EnumType__NameAssignment_1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3667:1: rule__EnumType__NameAssignment_1 : ( ruleENTITY_NAME ) ;
    public final void rule__EnumType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3671:1: ( ( ruleENTITY_NAME ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3672:1: ( ruleENTITY_NAME )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3672:1: ( ruleENTITY_NAME )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3673:1: ruleENTITY_NAME
            {
             before(grammarAccess.getEnumTypeAccess().getNameENTITY_NAMEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleENTITY_NAME_in_rule__EnumType__NameAssignment_17504);
            ruleENTITY_NAME();

            state._fsp--;

             after(grammarAccess.getEnumTypeAccess().getNameENTITY_NAMEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__NameAssignment_1"


    // $ANTLR start "rule__EnumType__CommAssignment_3_0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3682:1: rule__EnumType__CommAssignment_3_0 : ( ruleComment_ALL ) ;
    public final void rule__EnumType__CommAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3686:1: ( ( ruleComment_ALL ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3687:1: ( ruleComment_ALL )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3687:1: ( ruleComment_ALL )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3688:1: ruleComment_ALL
            {
             before(grammarAccess.getEnumTypeAccess().getCommComment_ALLParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleComment_ALL_in_rule__EnumType__CommAssignment_3_07535);
            ruleComment_ALL();

            state._fsp--;

             after(grammarAccess.getEnumTypeAccess().getCommComment_ALLParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__CommAssignment_3_0"


    // $ANTLR start "rule__EnumType__FieldsAssignment_3_1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3697:1: rule__EnumType__FieldsAssignment_3_1 : ( ruleEnumField ) ;
    public final void rule__EnumType__FieldsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3701:1: ( ( ruleEnumField ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3702:1: ( ruleEnumField )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3702:1: ( ruleEnumField )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3703:1: ruleEnumField
            {
             before(grammarAccess.getEnumTypeAccess().getFieldsEnumFieldParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEnumField_in_rule__EnumType__FieldsAssignment_3_17566);
            ruleEnumField();

            state._fsp--;

             after(grammarAccess.getEnumTypeAccess().getFieldsEnumFieldParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__FieldsAssignment_3_1"


    // $ANTLR start "rule__EnumType__OptionsAssignment_3_2"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3712:1: rule__EnumType__OptionsAssignment_3_2 : ( ruleEnumFieldOpt ) ;
    public final void rule__EnumType__OptionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3716:1: ( ( ruleEnumFieldOpt ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3717:1: ( ruleEnumFieldOpt )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3717:1: ( ruleEnumFieldOpt )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3718:1: ruleEnumFieldOpt
            {
             before(grammarAccess.getEnumTypeAccess().getOptionsEnumFieldOptParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleEnumFieldOpt_in_rule__EnumType__OptionsAssignment_3_27597);
            ruleEnumFieldOpt();

            state._fsp--;

             after(grammarAccess.getEnumTypeAccess().getOptionsEnumFieldOptParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumType__OptionsAssignment_3_2"


    // $ANTLR start "rule__EnumField__NameAssignment_0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3727:1: rule__EnumField__NameAssignment_0 : ( ruleENTITY_NAME ) ;
    public final void rule__EnumField__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3731:1: ( ( ruleENTITY_NAME ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3732:1: ( ruleENTITY_NAME )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3732:1: ( ruleENTITY_NAME )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3733:1: ruleENTITY_NAME
            {
             before(grammarAccess.getEnumFieldAccess().getNameENTITY_NAMEParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleENTITY_NAME_in_rule__EnumField__NameAssignment_07628);
            ruleENTITY_NAME();

            state._fsp--;

             after(grammarAccess.getEnumFieldAccess().getNameENTITY_NAMEParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__NameAssignment_0"


    // $ANTLR start "rule__EnumField__IndexAssignment_2"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3742:1: rule__EnumField__IndexAssignment_2 : ( RULE_NUMBER ) ;
    public final void rule__EnumField__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3746:1: ( ( RULE_NUMBER ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3747:1: ( RULE_NUMBER )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3747:1: ( RULE_NUMBER )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3748:1: RULE_NUMBER
            {
             before(grammarAccess.getEnumFieldAccess().getIndexNUMBERTerminalRuleCall_2_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__EnumField__IndexAssignment_27659); 
             after(grammarAccess.getEnumFieldAccess().getIndexNUMBERTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumField__IndexAssignment_2"


    // $ANTLR start "rule__EnumFieldOpt__NameAssignment_1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3757:1: rule__EnumFieldOpt__NameAssignment_1 : ( ruleENTITY_NAME ) ;
    public final void rule__EnumFieldOpt__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3761:1: ( ( ruleENTITY_NAME ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3762:1: ( ruleENTITY_NAME )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3762:1: ( ruleENTITY_NAME )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3763:1: ruleENTITY_NAME
            {
             before(grammarAccess.getEnumFieldOptAccess().getNameENTITY_NAMEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleENTITY_NAME_in_rule__EnumFieldOpt__NameAssignment_17690);
            ruleENTITY_NAME();

            state._fsp--;

             after(grammarAccess.getEnumFieldOptAccess().getNameENTITY_NAMEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumFieldOpt__NameAssignment_1"


    // $ANTLR start "rule__EnumFieldOpt__ValueAssignment_3"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3772:1: rule__EnumFieldOpt__ValueAssignment_3 : ( RULE_IDENTITY ) ;
    public final void rule__EnumFieldOpt__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3776:1: ( ( RULE_IDENTITY ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3777:1: ( RULE_IDENTITY )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3777:1: ( RULE_IDENTITY )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3778:1: RULE_IDENTITY
            {
             before(grammarAccess.getEnumFieldOptAccess().getValueIDENTITYTerminalRuleCall_3_0()); 
            match(input,RULE_IDENTITY,FOLLOW_RULE_IDENTITY_in_rule__EnumFieldOpt__ValueAssignment_37721); 
             after(grammarAccess.getEnumFieldOptAccess().getValueIDENTITYTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumFieldOpt__ValueAssignment_3"


    // $ANTLR start "rule__Comment_ALL__TextAssignment_0"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3787:1: rule__Comment_ALL__TextAssignment_0 : ( RULE_COMMENT_SL ) ;
    public final void rule__Comment_ALL__TextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3791:1: ( ( RULE_COMMENT_SL ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3792:1: ( RULE_COMMENT_SL )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3792:1: ( RULE_COMMENT_SL )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3793:1: RULE_COMMENT_SL
            {
             before(grammarAccess.getComment_ALLAccess().getTextCOMMENT_SLTerminalRuleCall_0_0()); 
            match(input,RULE_COMMENT_SL,FOLLOW_RULE_COMMENT_SL_in_rule__Comment_ALL__TextAssignment_07752); 
             after(grammarAccess.getComment_ALLAccess().getTextCOMMENT_SLTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment_ALL__TextAssignment_0"


    // $ANTLR start "rule__Comment_ALL__TextAssignment_1"
    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3802:1: rule__Comment_ALL__TextAssignment_1 : ( RULE_COMMENT_ML ) ;
    public final void rule__Comment_ALL__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3806:1: ( ( RULE_COMMENT_ML ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3807:1: ( RULE_COMMENT_ML )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3807:1: ( RULE_COMMENT_ML )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3808:1: RULE_COMMENT_ML
            {
             before(grammarAccess.getComment_ALLAccess().getTextCOMMENT_MLTerminalRuleCall_1_0()); 
            match(input,RULE_COMMENT_ML,FOLLOW_RULE_COMMENT_ML_in_rule__Comment_ALL__TextAssignment_17783); 
             after(grammarAccess.getComment_ALLAccess().getTextCOMMENT_MLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment_ALL__TextAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_in_ruleModel94 = new BitSet(new long[]{0x0000000006003F02L});
    public static final BitSet FOLLOW_ruleImportInfo_in_entryRuleImportInfo122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportInfo129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportInfo__Group__0_in_ruleImportInfo155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionInfo_in_entryRuleOptionInfo182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionInfo189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionInfo__Group__0_in_ruleOptionInfo215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMap_in_entryRuleMap362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMap369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__Group__0_in_ruleMap395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapField_in_entryRuleMapField422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapField429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapField__Group__0_in_ruleMapField455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapRef_in_entryRuleMapRef482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapRef489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapRef__Group__0_in_ruleMapRef515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageType_in_entryRuleMessageType542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageType549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageType__Group__0_in_ruleMessageType575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_entryRuleMessageField602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageField609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageField__Alternatives_in_ruleMessageField635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageSimpleField_in_entryRuleMessageSimpleField662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageSimpleField669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSimpleField__Group__0_in_ruleMessageSimpleField695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageComplexField_in_entryRuleMessageComplexField722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageComplexField729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageComplexField__Group__0_in_ruleMessageComplexField755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageFieldDefault_in_entryRuleMessageFieldDefault782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageFieldDefault789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageFieldDefault__Group__0_in_ruleMessageFieldDefault815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__0_in_ruleEnumType875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_entryRuleEnumField902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumField909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__0_in_ruleEnumField935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumFieldOpt_in_entryRuleEnumFieldOpt962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumFieldOpt969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumFieldOpt__Group__0_in_ruleEnumFieldOpt995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENTITY_NAME_in_entryRuleENTITY_NAME1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleENTITY_NAME1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ENTITY_NAME__Alternatives_in_ruleENTITY_NAME1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_ALL_in_entryRuleComment_ALL1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment_ALL1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comment_ALL__Alternatives_in_ruleComment_ALL1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0_in_rule__Model__Alternatives1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_1_in_rule__Model__Alternatives1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__OptionsAssignment_2_in_rule__Model__Alternatives1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_3_in_rule__Model__Alternatives1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__CommAssignment_4_in_rule__Model__Alternatives1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Element__Alternatives1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMap_in_rule__Element__Alternatives1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageType_in_rule__Type__Alternatives1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_rule__Type__Alternatives1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__CommAssignment_5_0_in_rule__Map__Alternatives_51414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__FieldsAssignment_5_1_in_rule__Map__Alternatives_51432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageType__CommAssignment_3_0_in_rule__MessageType__Alternatives_31465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageType__FieldsAssignment_3_1_in_rule__MessageType__Alternatives_31483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageType__TypesAssignment_3_2_in_rule__MessageType__Alternatives_31501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageSimpleField_in_rule__MessageField__Alternatives1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageComplexField_in_rule__MessageField__Alternatives1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__MessageFieldDefault__Alternatives_31583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTITY_in_rule__MessageFieldDefault__Alternatives_31600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__CommAssignment_3_0_in_rule__EnumType__Alternatives_31632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__FieldsAssignment_3_1_in_rule__EnumType__Alternatives_31650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__OptionsAssignment_3_2_in_rule__EnumType__Alternatives_31668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FIELD_ATTR_in_rule__ENTITY_NAME__Alternatives1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FIELD_TYPE_in_rule__ENTITY_NAME__Alternatives1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTITY_in_rule__ENTITY_NAME__Alternatives1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PACKAGE_in_rule__ENTITY_NAME__Alternatives1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IMPORT_in_rule__ENTITY_NAME__Alternatives1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPTION_in_rule__ENTITY_NAME__Alternatives1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MESSAGE_in_rule__ENTITY_NAME__Alternatives1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENUM_in_rule__ENTITY_NAME__Alternatives1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MAP_KIND_in_rule__ENTITY_NAME__Alternatives1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEFAULT_KIND_in_rule__ENTITY_NAME__Alternatives1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comment_ALL__TextAssignment_0_in_rule__Comment_ALL__Alternatives1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comment_ALL__TextAssignment_1_in_rule__Comment_ALL__Alternatives1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0__Impl_in_rule__Model__Group_0__01935 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group_0__1_in_rule__Model__Group_0__01938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PACKAGE_in_rule__Model__Group_0__0__Impl1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__1__Impl_in_rule__Model__Group_0__11994 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Model__Group_0__2_in_rule__Model__Group_0__11997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_0_1_in_rule__Model__Group_0__1__Impl2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__2__Impl_in_rule__Model__Group_0__22054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__Model__Group_0__2__Impl2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportInfo__Group__0__Impl_in_rule__ImportInfo__Group__02119 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ImportInfo__Group__1_in_rule__ImportInfo__Group__02122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IMPORT_in_rule__ImportInfo__Group__0__Impl2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportInfo__Group__1__Impl_in_rule__ImportInfo__Group__12178 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ImportInfo__Group__2_in_rule__ImportInfo__Group__12181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportInfo__ImportURIAssignment_1_in_rule__ImportInfo__Group__1__Impl2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportInfo__Group__2__Impl_in_rule__ImportInfo__Group__22238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__ImportInfo__Group__2__Impl2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionInfo__Group__0__Impl_in_rule__OptionInfo__Group__02303 = new BitSet(new long[]{0x0000000000007FE0L});
    public static final BitSet FOLLOW_rule__OptionInfo__Group__1_in_rule__OptionInfo__Group__02306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPTION_in_rule__OptionInfo__Group__0__Impl2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionInfo__Group__1__Impl_in_rule__OptionInfo__Group__12362 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__OptionInfo__Group__2_in_rule__OptionInfo__Group__12365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionInfo__NameAssignment_1_in_rule__OptionInfo__Group__1__Impl2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionInfo__Group__2__Impl_in_rule__OptionInfo__Group__22422 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__OptionInfo__Group__3_in_rule__OptionInfo__Group__22425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_rule__OptionInfo__Group__2__Impl2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionInfo__Group__3__Impl_in_rule__OptionInfo__Group__32481 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__OptionInfo__Group__4_in_rule__OptionInfo__Group__32484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionInfo__ValueAssignment_3_in_rule__OptionInfo__Group__3__Impl2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionInfo__Group__4__Impl_in_rule__OptionInfo__Group__42541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__OptionInfo__Group__4__Impl2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__Group__0__Impl_in_rule__Map__Group__02610 = new BitSet(new long[]{0x0000000000007FE0L});
    public static final BitSet FOLLOW_rule__Map__Group__1_in_rule__Map__Group__02613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MAP_KIND_in_rule__Map__Group__0__Impl2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__Group__1__Impl_in_rule__Map__Group__12669 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Map__Group__2_in_rule__Map__Group__12672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__NameAssignment_1_in_rule__Map__Group__1__Impl2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__Group__2__Impl_in_rule__Map__Group__22729 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Map__Group__3_in_rule__Map__Group__22732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FILETER_A_in_rule__Map__Group__2__Impl2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__Group__3__Impl_in_rule__Map__Group__32788 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Map__Group__4_in_rule__Map__Group__32791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__BindAssignment_3_in_rule__Map__Group__3__Impl2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__Group__4__Impl_in_rule__Map__Group__42848 = new BitSet(new long[]{0x0000000006083F40L});
    public static final BitSet FOLLOW_rule__Map__Group__5_in_rule__Map__Group__42851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_L_in_rule__Map__Group__4__Impl2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__Group__5__Impl_in_rule__Map__Group__52907 = new BitSet(new long[]{0x0000000006083F40L});
    public static final BitSet FOLLOW_rule__Map__Group__6_in_rule__Map__Group__52910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__Alternatives_5_in_rule__Map__Group__5__Impl2937 = new BitSet(new long[]{0x0000000006003F42L});
    public static final BitSet FOLLOW_rule__Map__Group__6__Impl_in_rule__Map__Group__62968 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Map__Group__7_in_rule__Map__Group__62971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_R_in_rule__Map__Group__6__Impl2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__Group__7__Impl_in_rule__Map__Group__73027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__Map__Group__7__Impl3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapField__Group__0__Impl_in_rule__MapField__Group__03102 = new BitSet(new long[]{0x0000000000007FE0L});
    public static final BitSet FOLLOW_rule__MapField__Group__1_in_rule__MapField__Group__03105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapField__AttrAssignment_0_in_rule__MapField__Group__0__Impl3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapField__Group__1__Impl_in_rule__MapField__Group__13162 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_rule__MapField__Group__2_in_rule__MapField__Group__13165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapField__NameAssignment_1_in_rule__MapField__Group__1__Impl3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapField__Group__2__Impl_in_rule__MapField__Group__23222 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_rule__MapField__Group__3_in_rule__MapField__Group__23225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapField__Group_2__0_in_rule__MapField__Group__2__Impl3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapField__Group__3__Impl_in_rule__MapField__Group__33283 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MapField__Group__4_in_rule__MapField__Group__33286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FILETER_A_in_rule__MapField__Group__3__Impl3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapField__Group__4__Impl_in_rule__MapField__Group__43342 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__MapField__Group__5_in_rule__MapField__Group__43345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapField__LinksAssignment_4_in_rule__MapField__Group__4__Impl3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapField__Group__5__Impl_in_rule__MapField__Group__53402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__MapField__Group__5__Impl3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapField__Group_2__0__Impl_in_rule__MapField__Group_2__03473 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MapField__Group_2__1_in_rule__MapField__Group_2__03476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FILETER_B_in_rule__MapField__Group_2__0__Impl3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapField__Group_2__1__Impl_in_rule__MapField__Group_2__13532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapField__FilterAssignment_2_1_in_rule__MapField__Group_2__1__Impl3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapRef__Group__0__Impl_in_rule__MapRef__Group__03593 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__MapRef__Group__1_in_rule__MapRef__Group__03596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapRef__LinkAssignment_0_in_rule__MapRef__Group__0__Impl3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapRef__Group__1__Impl_in_rule__MapRef__Group__13653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapRef__Group_1__0_in_rule__MapRef__Group__1__Impl3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapRef__Group_1__0__Impl_in_rule__MapRef__Group_1__03715 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MapRef__Group_1__1_in_rule__MapRef__Group_1__03718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_rule__MapRef__Group_1__0__Impl3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapRef__Group_1__1__Impl_in_rule__MapRef__Group_1__13774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapRef__ChildAssignment_1_1_in_rule__MapRef__Group_1__1__Impl3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageType__Group__0__Impl_in_rule__MessageType__Group__03835 = new BitSet(new long[]{0x0000000000007FE0L});
    public static final BitSet FOLLOW_rule__MessageType__Group__1_in_rule__MessageType__Group__03838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MESSAGE_in_rule__MessageType__Group__0__Impl3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageType__Group__1__Impl_in_rule__MessageType__Group__13894 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__MessageType__Group__2_in_rule__MessageType__Group__13897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageType__NameAssignment_1_in_rule__MessageType__Group__1__Impl3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageType__Group__2__Impl_in_rule__MessageType__Group__23954 = new BitSet(new long[]{0x0000000006083F40L});
    public static final BitSet FOLLOW_rule__MessageType__Group__3_in_rule__MessageType__Group__23957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_L_in_rule__MessageType__Group__2__Impl3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageType__Group__3__Impl_in_rule__MessageType__Group__34013 = new BitSet(new long[]{0x0000000006083F40L});
    public static final BitSet FOLLOW_rule__MessageType__Group__4_in_rule__MessageType__Group__34016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageType__Alternatives_3_in_rule__MessageType__Group__3__Impl4043 = new BitSet(new long[]{0x0000000006003F42L});
    public static final BitSet FOLLOW_rule__MessageType__Group__4__Impl_in_rule__MessageType__Group__44074 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__MessageType__Group__5_in_rule__MessageType__Group__44077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_R_in_rule__MessageType__Group__4__Impl4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageType__Group__5__Impl_in_rule__MessageType__Group__54133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__MessageType__Group__5__Impl4161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSimpleField__Group__0__Impl_in_rule__MessageSimpleField__Group__04204 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__MessageSimpleField__Group__1_in_rule__MessageSimpleField__Group__04207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSimpleField__AttrAssignment_0_in_rule__MessageSimpleField__Group__0__Impl4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSimpleField__Group__1__Impl_in_rule__MessageSimpleField__Group__14264 = new BitSet(new long[]{0x0000000000007FE0L});
    public static final BitSet FOLLOW_rule__MessageSimpleField__Group__2_in_rule__MessageSimpleField__Group__14267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSimpleField__TypeAssignment_1_in_rule__MessageSimpleField__Group__1__Impl4294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSimpleField__Group__2__Impl_in_rule__MessageSimpleField__Group__24324 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__MessageSimpleField__Group__3_in_rule__MessageSimpleField__Group__24327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSimpleField__NameAssignment_2_in_rule__MessageSimpleField__Group__2__Impl4354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSimpleField__Group__3__Impl_in_rule__MessageSimpleField__Group__34384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageSimpleField__Group__4_in_rule__MessageSimpleField__Group__34387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_rule__MessageSimpleField__Group__3__Impl4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSimpleField__Group__4__Impl_in_rule__MessageSimpleField__Group__44443 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_rule__MessageSimpleField__Group__5_in_rule__MessageSimpleField__Group__44446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSimpleField__IndexAssignment_4_in_rule__MessageSimpleField__Group__4__Impl4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSimpleField__Group__5__Impl_in_rule__MessageSimpleField__Group__54503 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_rule__MessageSimpleField__Group__6_in_rule__MessageSimpleField__Group__54506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageFieldDefault_in_rule__MessageSimpleField__Group__5__Impl4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageSimpleField__Group__6__Impl_in_rule__MessageSimpleField__Group__64565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__MessageSimpleField__Group__6__Impl4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageComplexField__Group__0__Impl_in_rule__MessageComplexField__Group__04638 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MessageComplexField__Group__1_in_rule__MessageComplexField__Group__04641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageComplexField__AttrAssignment_0_in_rule__MessageComplexField__Group__0__Impl4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageComplexField__Group__1__Impl_in_rule__MessageComplexField__Group__14698 = new BitSet(new long[]{0x0000000000007FE0L});
    public static final BitSet FOLLOW_rule__MessageComplexField__Group__2_in_rule__MessageComplexField__Group__14701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageComplexField__TypeAssignment_1_in_rule__MessageComplexField__Group__1__Impl4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageComplexField__Group__2__Impl_in_rule__MessageComplexField__Group__24758 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__MessageComplexField__Group__3_in_rule__MessageComplexField__Group__24761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageComplexField__NameAssignment_2_in_rule__MessageComplexField__Group__2__Impl4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageComplexField__Group__3__Impl_in_rule__MessageComplexField__Group__34818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MessageComplexField__Group__4_in_rule__MessageComplexField__Group__34821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_rule__MessageComplexField__Group__3__Impl4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageComplexField__Group__4__Impl_in_rule__MessageComplexField__Group__44877 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_rule__MessageComplexField__Group__5_in_rule__MessageComplexField__Group__44880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageComplexField__IndexAssignment_4_in_rule__MessageComplexField__Group__4__Impl4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageComplexField__Group__5__Impl_in_rule__MessageComplexField__Group__54937 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_rule__MessageComplexField__Group__6_in_rule__MessageComplexField__Group__54940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageFieldDefault_in_rule__MessageComplexField__Group__5__Impl4968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageComplexField__Group__6__Impl_in_rule__MessageComplexField__Group__64999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__MessageComplexField__Group__6__Impl5027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageFieldDefault__Group__0__Impl_in_rule__MessageFieldDefault__Group__05072 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__MessageFieldDefault__Group__1_in_rule__MessageFieldDefault__Group__05075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACKET_L_in_rule__MessageFieldDefault__Group__0__Impl5102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageFieldDefault__Group__1__Impl_in_rule__MessageFieldDefault__Group__15131 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__MessageFieldDefault__Group__2_in_rule__MessageFieldDefault__Group__15134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEFAULT_KIND_in_rule__MessageFieldDefault__Group__1__Impl5161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageFieldDefault__Group__2__Impl_in_rule__MessageFieldDefault__Group__25190 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__MessageFieldDefault__Group__3_in_rule__MessageFieldDefault__Group__25193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_rule__MessageFieldDefault__Group__2__Impl5220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageFieldDefault__Group__3__Impl_in_rule__MessageFieldDefault__Group__35249 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MessageFieldDefault__Group__4_in_rule__MessageFieldDefault__Group__35252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageFieldDefault__Alternatives_3_in_rule__MessageFieldDefault__Group__3__Impl5279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MessageFieldDefault__Group__4__Impl_in_rule__MessageFieldDefault__Group__45309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACKET_R_in_rule__MessageFieldDefault__Group__4__Impl5336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__0__Impl_in_rule__EnumType__Group__05375 = new BitSet(new long[]{0x0000000000007FE0L});
    public static final BitSet FOLLOW_rule__EnumType__Group__1_in_rule__EnumType__Group__05378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENUM_in_rule__EnumType__Group__0__Impl5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__1__Impl_in_rule__EnumType__Group__15434 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__2_in_rule__EnumType__Group__15437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__NameAssignment_1_in_rule__EnumType__Group__1__Impl5464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__2__Impl_in_rule__EnumType__Group__25494 = new BitSet(new long[]{0x0000000006087FE0L});
    public static final BitSet FOLLOW_rule__EnumType__Group__3_in_rule__EnumType__Group__25497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_L_in_rule__EnumType__Group__2__Impl5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__3__Impl_in_rule__EnumType__Group__35553 = new BitSet(new long[]{0x0000000006087FE0L});
    public static final BitSet FOLLOW_rule__EnumType__Group__4_in_rule__EnumType__Group__35556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Alternatives_3_in_rule__EnumType__Group__3__Impl5583 = new BitSet(new long[]{0x0000000006007FE2L});
    public static final BitSet FOLLOW_rule__EnumType__Group__4__Impl_in_rule__EnumType__Group__45614 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__EnumType__Group__5_in_rule__EnumType__Group__45617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACE_R_in_rule__EnumType__Group__4__Impl5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumType__Group__5__Impl_in_rule__EnumType__Group__55673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__EnumType__Group__5__Impl5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__0__Impl_in_rule__EnumField__Group__05744 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__EnumField__Group__1_in_rule__EnumField__Group__05747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__NameAssignment_0_in_rule__EnumField__Group__0__Impl5774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__1__Impl_in_rule__EnumField__Group__15804 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumField__Group__2_in_rule__EnumField__Group__15807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_rule__EnumField__Group__1__Impl5834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__2__Impl_in_rule__EnumField__Group__25863 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__EnumField__Group__3_in_rule__EnumField__Group__25866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__IndexAssignment_2_in_rule__EnumField__Group__2__Impl5893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumField__Group__3__Impl_in_rule__EnumField__Group__35923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__EnumField__Group__3__Impl5951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumFieldOpt__Group__0__Impl_in_rule__EnumFieldOpt__Group__05990 = new BitSet(new long[]{0x0000000000007FE0L});
    public static final BitSet FOLLOW_rule__EnumFieldOpt__Group__1_in_rule__EnumFieldOpt__Group__05993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPTION_in_rule__EnumFieldOpt__Group__0__Impl6020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumFieldOpt__Group__1__Impl_in_rule__EnumFieldOpt__Group__16049 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__EnumFieldOpt__Group__2_in_rule__EnumFieldOpt__Group__16052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumFieldOpt__NameAssignment_1_in_rule__EnumFieldOpt__Group__1__Impl6079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumFieldOpt__Group__2__Impl_in_rule__EnumFieldOpt__Group__26109 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EnumFieldOpt__Group__3_in_rule__EnumFieldOpt__Group__26112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_rule__EnumFieldOpt__Group__2__Impl6139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumFieldOpt__Group__3__Impl_in_rule__EnumFieldOpt__Group__36168 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__EnumFieldOpt__Group__4_in_rule__EnumFieldOpt__Group__36171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumFieldOpt__ValueAssignment_3_in_rule__EnumFieldOpt__Group__3__Impl6198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumFieldOpt__Group__4__Impl_in_rule__EnumFieldOpt__Group__46228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__EnumFieldOpt__Group__4__Impl6256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06297 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTITY_in_rule__QualifiedName__Group__0__Impl6327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl6383 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06418 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_rule__QualifiedName__Group_1__0__Impl6448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTITY_in_rule__QualifiedName__Group_1__1__Impl6504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_0_16542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportInfo_in_rule__Model__ImportsAssignment_16573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionInfo_in_rule__Model__OptionsAssignment_26604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Model__ElementsAssignment_36635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_ALL_in_rule__Model__CommAssignment_46666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_STRING_in_rule__ImportInfo__ImportURIAssignment_16697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENTITY_NAME_in_rule__OptionInfo__NameAssignment_16728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_STRING_in_rule__OptionInfo__ValueAssignment_36759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENTITY_NAME_in_rule__Map__NameAssignment_16790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Map__BindAssignment_36825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_ALL_in_rule__Map__CommAssignment_5_06860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapField_in_rule__Map__FieldsAssignment_5_16891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FIELD_ATTR_in_rule__MapField__AttrAssignment_06922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENTITY_NAME_in_rule__MapField__NameAssignment_16953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MapField__FilterAssignment_2_16988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapRef_in_rule__MapField__LinksAssignment_47023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTITY_in_rule__MapRef__LinkAssignment_07058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapRef_in_rule__MapRef__ChildAssignment_1_17093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENTITY_NAME_in_rule__MessageType__NameAssignment_17124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_ALL_in_rule__MessageType__CommAssignment_3_07155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_rule__MessageType__FieldsAssignment_3_17186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__MessageType__TypesAssignment_3_27217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FIELD_ATTR_in_rule__MessageSimpleField__AttrAssignment_07248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FIELD_TYPE_in_rule__MessageSimpleField__TypeAssignment_17279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENTITY_NAME_in_rule__MessageSimpleField__NameAssignment_27310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__MessageSimpleField__IndexAssignment_47341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FIELD_ATTR_in_rule__MessageComplexField__AttrAssignment_07372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MessageComplexField__TypeAssignment_17407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENTITY_NAME_in_rule__MessageComplexField__NameAssignment_27442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__MessageComplexField__IndexAssignment_47473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENTITY_NAME_in_rule__EnumType__NameAssignment_17504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_ALL_in_rule__EnumType__CommAssignment_3_07535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_rule__EnumType__FieldsAssignment_3_17566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumFieldOpt_in_rule__EnumType__OptionsAssignment_3_27597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENTITY_NAME_in_rule__EnumField__NameAssignment_07628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__EnumField__IndexAssignment_27659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENTITY_NAME_in_rule__EnumFieldOpt__NameAssignment_17690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTITY_in_rule__EnumFieldOpt__ValueAssignment_37721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_SL_in_rule__Comment_ALL__TextAssignment_07752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_ML_in_rule__Comment_ALL__TextAssignment_17783 = new BitSet(new long[]{0x0000000000000002L});

}