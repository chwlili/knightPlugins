package org.chw.game.ide.parser.antlr.internal; 

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.chw.game.ide.services.ProtoGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;

@SuppressWarnings("all")
public class InternalProtoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PACKAGE", "RULE_END", "RULE_IMPORT", "RULE_SL_STRING", "RULE_OPTION", "RULE_EQUALS", "RULE_MAP_KIND", "RULE_FILETER_A", "RULE_BRACE_L", "RULE_BRACE_R", "RULE_FIELD_ATTR", "RULE_FILETER_B", "RULE_IDENTITY", "RULE_DOT", "RULE_MESSAGE", "RULE_FIELD_TYPE", "RULE_NUMBER", "RULE_BRACKET_L", "RULE_DEFAULT_KIND", "RULE_BRACKET_R", "RULE_ENUM", "RULE_COMMENT_SL", "RULE_COMMENT_ML", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_MAP_KIND=10;
    public static final int RULE_OPTION=8;
    public static final int RULE_IDENTITY=16;
    public static final int RULE_ANY_OTHER=28;
    public static final int RULE_SL_STRING=7;
    public static final int RULE_BRACE_R=13;
    public static final int RULE_BRACKET_L=21;
    public static final int RULE_FIELD_TYPE=19;
    public static final int RULE_COMMENT_SL=25;
    public static final int RULE_DEFAULT_KIND=22;
    public static final int EOF=-1;
    public static final int RULE_BRACKET_R=23;
    public static final int RULE_PACKAGE=4;
    public static final int RULE_DOT=17;
    public static final int RULE_NUMBER=20;
    public static final int RULE_END=5;
    public static final int RULE_IMPORT=6;
    public static final int RULE_BRACE_L=12;
    public static final int RULE_FILETER_A=11;
    public static final int RULE_MESSAGE=18;
    public static final int RULE_FILETER_B=15;
    public static final int RULE_COMMENT_ML=26;
    public static final int RULE_EQUALS=9;
    public static final int RULE_FIELD_ATTR=14;
    public static final int RULE_WS=27;
    public static final int RULE_ENUM=24;

    // delegates
    // delegators


        public InternalProtoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProtoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProtoParser.tokenNames; }
    public String getGrammarFileName() { return "../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g"; }



     	private ProtoGrammarAccess grammarAccess;
     	
        public InternalProtoParser(TokenStream input, ProtoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ProtoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:76:1: ruleModel returns [EObject current=null] : ( (this_PACKAGE_0= RULE_PACKAGE ( (lv_name_1_0= ruleQualifiedName ) ) (this_END_2= RULE_END )? ) | ( (lv_imports_3_0= ruleImportInfo ) ) | ( (lv_options_4_0= ruleOptionInfo ) ) | ( (lv_elements_5_0= ruleElement ) ) | ( (lv_comm_6_0= ruleComment_ALL ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token this_PACKAGE_0=null;
        Token this_END_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_options_4_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_comm_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:79:28: ( ( (this_PACKAGE_0= RULE_PACKAGE ( (lv_name_1_0= ruleQualifiedName ) ) (this_END_2= RULE_END )? ) | ( (lv_imports_3_0= ruleImportInfo ) ) | ( (lv_options_4_0= ruleOptionInfo ) ) | ( (lv_elements_5_0= ruleElement ) ) | ( (lv_comm_6_0= ruleComment_ALL ) ) )* )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:80:1: ( (this_PACKAGE_0= RULE_PACKAGE ( (lv_name_1_0= ruleQualifiedName ) ) (this_END_2= RULE_END )? ) | ( (lv_imports_3_0= ruleImportInfo ) ) | ( (lv_options_4_0= ruleOptionInfo ) ) | ( (lv_elements_5_0= ruleElement ) ) | ( (lv_comm_6_0= ruleComment_ALL ) ) )*
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:80:1: ( (this_PACKAGE_0= RULE_PACKAGE ( (lv_name_1_0= ruleQualifiedName ) ) (this_END_2= RULE_END )? ) | ( (lv_imports_3_0= ruleImportInfo ) ) | ( (lv_options_4_0= ruleOptionInfo ) ) | ( (lv_elements_5_0= ruleElement ) ) | ( (lv_comm_6_0= ruleComment_ALL ) ) )*
            loop2:
            do {
                int alt2=6;
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
                case RULE_MAP_KIND:
                case RULE_MESSAGE:
                case RULE_ENUM:
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

                }

                switch (alt2) {
            	case 1 :
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:80:2: (this_PACKAGE_0= RULE_PACKAGE ( (lv_name_1_0= ruleQualifiedName ) ) (this_END_2= RULE_END )? )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:80:2: (this_PACKAGE_0= RULE_PACKAGE ( (lv_name_1_0= ruleQualifiedName ) ) (this_END_2= RULE_END )? )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:80:3: this_PACKAGE_0= RULE_PACKAGE ( (lv_name_1_0= ruleQualifiedName ) ) (this_END_2= RULE_END )?
            	    {
            	    this_PACKAGE_0=(Token)match(input,RULE_PACKAGE,FOLLOW_RULE_PACKAGE_in_ruleModel122); 
            	     
            	        newLeafNode(this_PACKAGE_0, grammarAccess.getModelAccess().getPACKAGETerminalRuleCall_0_0()); 
            	        
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:84:1: ( (lv_name_1_0= ruleQualifiedName ) )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:85:1: (lv_name_1_0= ruleQualifiedName )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:85:1: (lv_name_1_0= ruleQualifiedName )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:86:3: lv_name_1_0= ruleQualifiedName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleModel142);
            	    lv_name_1_0=ruleQualifiedName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"name",
            	            		lv_name_1_0, 
            	            		"QualifiedName");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:102:2: (this_END_2= RULE_END )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==RULE_END) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:102:3: this_END_2= RULE_END
            	            {
            	            this_END_2=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleModel154); 
            	             
            	                newLeafNode(this_END_2, grammarAccess.getModelAccess().getENDTerminalRuleCall_0_2()); 
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:107:6: ( (lv_imports_3_0= ruleImportInfo ) )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:107:6: ( (lv_imports_3_0= ruleImportInfo ) )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:108:1: (lv_imports_3_0= ruleImportInfo )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:108:1: (lv_imports_3_0= ruleImportInfo )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:109:3: lv_imports_3_0= ruleImportInfo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportInfoParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImportInfo_in_ruleModel183);
            	    lv_imports_3_0=ruleImportInfo();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_3_0, 
            	            		"ImportInfo");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:126:6: ( (lv_options_4_0= ruleOptionInfo ) )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:126:6: ( (lv_options_4_0= ruleOptionInfo ) )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:127:1: (lv_options_4_0= ruleOptionInfo )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:127:1: (lv_options_4_0= ruleOptionInfo )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:128:3: lv_options_4_0= ruleOptionInfo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getOptionsOptionInfoParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOptionInfo_in_ruleModel210);
            	    lv_options_4_0=ruleOptionInfo();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_4_0, 
            	            		"OptionInfo");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:145:6: ( (lv_elements_5_0= ruleElement ) )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:145:6: ( (lv_elements_5_0= ruleElement ) )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:146:1: (lv_elements_5_0= ruleElement )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:146:1: (lv_elements_5_0= ruleElement )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:147:3: lv_elements_5_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElement_in_ruleModel237);
            	    lv_elements_5_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_5_0, 
            	            		"Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:164:6: ( (lv_comm_6_0= ruleComment_ALL ) )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:164:6: ( (lv_comm_6_0= ruleComment_ALL ) )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:165:1: (lv_comm_6_0= ruleComment_ALL )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:165:1: (lv_comm_6_0= ruleComment_ALL )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:166:3: lv_comm_6_0= ruleComment_ALL
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getCommComment_ALLParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComment_ALL_in_ruleModel264);
            	    lv_comm_6_0=ruleComment_ALL();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"comm",
            	            		lv_comm_6_0, 
            	            		"Comment_ALL");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImportInfo"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:190:1: entryRuleImportInfo returns [EObject current=null] : iv_ruleImportInfo= ruleImportInfo EOF ;
    public final EObject entryRuleImportInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportInfo = null;


        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:191:2: (iv_ruleImportInfo= ruleImportInfo EOF )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:192:2: iv_ruleImportInfo= ruleImportInfo EOF
            {
             newCompositeNode(grammarAccess.getImportInfoRule()); 
            pushFollow(FOLLOW_ruleImportInfo_in_entryRuleImportInfo301);
            iv_ruleImportInfo=ruleImportInfo();

            state._fsp--;

             current =iv_ruleImportInfo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportInfo311); 

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
    // $ANTLR end "entryRuleImportInfo"


    // $ANTLR start "ruleImportInfo"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:199:1: ruleImportInfo returns [EObject current=null] : (this_IMPORT_0= RULE_IMPORT ( (lv_importURI_1_0= RULE_SL_STRING ) ) (this_END_2= RULE_END )? ) ;
    public final EObject ruleImportInfo() throws RecognitionException {
        EObject current = null;

        Token this_IMPORT_0=null;
        Token lv_importURI_1_0=null;
        Token this_END_2=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:202:28: ( (this_IMPORT_0= RULE_IMPORT ( (lv_importURI_1_0= RULE_SL_STRING ) ) (this_END_2= RULE_END )? ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:203:1: (this_IMPORT_0= RULE_IMPORT ( (lv_importURI_1_0= RULE_SL_STRING ) ) (this_END_2= RULE_END )? )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:203:1: (this_IMPORT_0= RULE_IMPORT ( (lv_importURI_1_0= RULE_SL_STRING ) ) (this_END_2= RULE_END )? )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:203:2: this_IMPORT_0= RULE_IMPORT ( (lv_importURI_1_0= RULE_SL_STRING ) ) (this_END_2= RULE_END )?
            {
            this_IMPORT_0=(Token)match(input,RULE_IMPORT,FOLLOW_RULE_IMPORT_in_ruleImportInfo347); 
             
                newLeafNode(this_IMPORT_0, grammarAccess.getImportInfoAccess().getIMPORTTerminalRuleCall_0()); 
                
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:207:1: ( (lv_importURI_1_0= RULE_SL_STRING ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:208:1: (lv_importURI_1_0= RULE_SL_STRING )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:208:1: (lv_importURI_1_0= RULE_SL_STRING )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:209:3: lv_importURI_1_0= RULE_SL_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_SL_STRING,FOLLOW_RULE_SL_STRING_in_ruleImportInfo363); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getImportInfoAccess().getImportURISL_STRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportInfoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"SL_STRING");
            	    

            }


            }

            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:225:2: (this_END_2= RULE_END )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_END) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:225:3: this_END_2= RULE_END
                    {
                    this_END_2=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleImportInfo380); 
                     
                        newLeafNode(this_END_2, grammarAccess.getImportInfoAccess().getENDTerminalRuleCall_2()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportInfo"


    // $ANTLR start "entryRuleOptionInfo"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:237:1: entryRuleOptionInfo returns [EObject current=null] : iv_ruleOptionInfo= ruleOptionInfo EOF ;
    public final EObject entryRuleOptionInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionInfo = null;


        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:238:2: (iv_ruleOptionInfo= ruleOptionInfo EOF )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:239:2: iv_ruleOptionInfo= ruleOptionInfo EOF
            {
             newCompositeNode(grammarAccess.getOptionInfoRule()); 
            pushFollow(FOLLOW_ruleOptionInfo_in_entryRuleOptionInfo417);
            iv_ruleOptionInfo=ruleOptionInfo();

            state._fsp--;

             current =iv_ruleOptionInfo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionInfo427); 

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
    // $ANTLR end "entryRuleOptionInfo"


    // $ANTLR start "ruleOptionInfo"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:246:1: ruleOptionInfo returns [EObject current=null] : (this_OPTION_0= RULE_OPTION ( (lv_name_1_0= ruleENTITY_NAME ) ) this_EQUALS_2= RULE_EQUALS ( (lv_value_3_0= RULE_SL_STRING ) ) (this_END_4= RULE_END )? ) ;
    public final EObject ruleOptionInfo() throws RecognitionException {
        EObject current = null;

        Token this_OPTION_0=null;
        Token this_EQUALS_2=null;
        Token lv_value_3_0=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:249:28: ( (this_OPTION_0= RULE_OPTION ( (lv_name_1_0= ruleENTITY_NAME ) ) this_EQUALS_2= RULE_EQUALS ( (lv_value_3_0= RULE_SL_STRING ) ) (this_END_4= RULE_END )? ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:250:1: (this_OPTION_0= RULE_OPTION ( (lv_name_1_0= ruleENTITY_NAME ) ) this_EQUALS_2= RULE_EQUALS ( (lv_value_3_0= RULE_SL_STRING ) ) (this_END_4= RULE_END )? )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:250:1: (this_OPTION_0= RULE_OPTION ( (lv_name_1_0= ruleENTITY_NAME ) ) this_EQUALS_2= RULE_EQUALS ( (lv_value_3_0= RULE_SL_STRING ) ) (this_END_4= RULE_END )? )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:250:2: this_OPTION_0= RULE_OPTION ( (lv_name_1_0= ruleENTITY_NAME ) ) this_EQUALS_2= RULE_EQUALS ( (lv_value_3_0= RULE_SL_STRING ) ) (this_END_4= RULE_END )?
            {
            this_OPTION_0=(Token)match(input,RULE_OPTION,FOLLOW_RULE_OPTION_in_ruleOptionInfo463); 
             
                newLeafNode(this_OPTION_0, grammarAccess.getOptionInfoAccess().getOPTIONTerminalRuleCall_0()); 
                
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:254:1: ( (lv_name_1_0= ruleENTITY_NAME ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:255:1: (lv_name_1_0= ruleENTITY_NAME )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:255:1: (lv_name_1_0= ruleENTITY_NAME )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:256:3: lv_name_1_0= ruleENTITY_NAME
            {
             
            	        newCompositeNode(grammarAccess.getOptionInfoAccess().getNameENTITY_NAMEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleENTITY_NAME_in_ruleOptionInfo483);
            lv_name_1_0=ruleENTITY_NAME();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionInfoRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ENTITY_NAME");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_EQUALS_2=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleOptionInfo494); 
             
                newLeafNode(this_EQUALS_2, grammarAccess.getOptionInfoAccess().getEQUALSTerminalRuleCall_2()); 
                
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:276:1: ( (lv_value_3_0= RULE_SL_STRING ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:277:1: (lv_value_3_0= RULE_SL_STRING )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:277:1: (lv_value_3_0= RULE_SL_STRING )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:278:3: lv_value_3_0= RULE_SL_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_SL_STRING,FOLLOW_RULE_SL_STRING_in_ruleOptionInfo510); 

            			newLeafNode(lv_value_3_0, grammarAccess.getOptionInfoAccess().getValueSL_STRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOptionInfoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"SL_STRING");
            	    

            }


            }

            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:294:2: (this_END_4= RULE_END )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_END) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:294:3: this_END_4= RULE_END
                    {
                    this_END_4=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleOptionInfo527); 
                     
                        newLeafNode(this_END_4, grammarAccess.getOptionInfoAccess().getENDTerminalRuleCall_4()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionInfo"


    // $ANTLR start "entryRuleElement"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:306:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:307:2: (iv_ruleElement= ruleElement EOF )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:308:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement564);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement574); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:315:1: ruleElement returns [EObject current=null] : (this_Type_0= ruleType | this_Map_1= ruleMap ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Type_0 = null;

        EObject this_Map_1 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:318:28: ( (this_Type_0= ruleType | this_Map_1= ruleMap ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:319:1: (this_Type_0= ruleType | this_Map_1= ruleMap )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:319:1: (this_Type_0= ruleType | this_Map_1= ruleMap )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_MESSAGE||LA5_0==RULE_ENUM) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_MAP_KIND) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:320:5: this_Type_0= ruleType
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleElement621);
                    this_Type_0=ruleType();

                    state._fsp--;

                     
                            current = this_Type_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:330:5: this_Map_1= ruleMap
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getMapParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMap_in_ruleElement648);
                    this_Map_1=ruleMap();

                    state._fsp--;

                     
                            current = this_Map_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleType"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:346:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:347:2: (iv_ruleType= ruleType EOF )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:348:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType683);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType693); 

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
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:355:1: ruleType returns [EObject current=null] : (this_MessageType_0= ruleMessageType | this_EnumType_1= ruleEnumType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_MessageType_0 = null;

        EObject this_EnumType_1 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:358:28: ( (this_MessageType_0= ruleMessageType | this_EnumType_1= ruleEnumType ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:359:1: (this_MessageType_0= ruleMessageType | this_EnumType_1= ruleEnumType )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:359:1: (this_MessageType_0= ruleMessageType | this_EnumType_1= ruleEnumType )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_MESSAGE) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ENUM) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:360:5: this_MessageType_0= ruleMessageType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getMessageTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMessageType_in_ruleType740);
                    this_MessageType_0=ruleMessageType();

                    state._fsp--;

                     
                            current = this_MessageType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:370:5: this_EnumType_1= ruleEnumType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEnumTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEnumType_in_ruleType767);
                    this_EnumType_1=ruleEnumType();

                    state._fsp--;

                     
                            current = this_EnumType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleMap"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:386:1: entryRuleMap returns [EObject current=null] : iv_ruleMap= ruleMap EOF ;
    public final EObject entryRuleMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMap = null;


        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:387:2: (iv_ruleMap= ruleMap EOF )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:388:2: iv_ruleMap= ruleMap EOF
            {
             newCompositeNode(grammarAccess.getMapRule()); 
            pushFollow(FOLLOW_ruleMap_in_entryRuleMap802);
            iv_ruleMap=ruleMap();

            state._fsp--;

             current =iv_ruleMap; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMap812); 

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
    // $ANTLR end "entryRuleMap"


    // $ANTLR start "ruleMap"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:395:1: ruleMap returns [EObject current=null] : (this_MAP_KIND_0= RULE_MAP_KIND ( (lv_name_1_0= ruleENTITY_NAME ) ) this_FILETER_A_2= RULE_FILETER_A ( ( ruleQualifiedName ) ) this_BRACE_L_4= RULE_BRACE_L ( ( (lv_comm_5_0= ruleComment_ALL ) ) | ( (lv_fields_6_0= ruleMapField ) ) )* this_BRACE_R_7= RULE_BRACE_R (this_END_8= RULE_END )? ) ;
    public final EObject ruleMap() throws RecognitionException {
        EObject current = null;

        Token this_MAP_KIND_0=null;
        Token this_FILETER_A_2=null;
        Token this_BRACE_L_4=null;
        Token this_BRACE_R_7=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_comm_5_0 = null;

        EObject lv_fields_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:398:28: ( (this_MAP_KIND_0= RULE_MAP_KIND ( (lv_name_1_0= ruleENTITY_NAME ) ) this_FILETER_A_2= RULE_FILETER_A ( ( ruleQualifiedName ) ) this_BRACE_L_4= RULE_BRACE_L ( ( (lv_comm_5_0= ruleComment_ALL ) ) | ( (lv_fields_6_0= ruleMapField ) ) )* this_BRACE_R_7= RULE_BRACE_R (this_END_8= RULE_END )? ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:399:1: (this_MAP_KIND_0= RULE_MAP_KIND ( (lv_name_1_0= ruleENTITY_NAME ) ) this_FILETER_A_2= RULE_FILETER_A ( ( ruleQualifiedName ) ) this_BRACE_L_4= RULE_BRACE_L ( ( (lv_comm_5_0= ruleComment_ALL ) ) | ( (lv_fields_6_0= ruleMapField ) ) )* this_BRACE_R_7= RULE_BRACE_R (this_END_8= RULE_END )? )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:399:1: (this_MAP_KIND_0= RULE_MAP_KIND ( (lv_name_1_0= ruleENTITY_NAME ) ) this_FILETER_A_2= RULE_FILETER_A ( ( ruleQualifiedName ) ) this_BRACE_L_4= RULE_BRACE_L ( ( (lv_comm_5_0= ruleComment_ALL ) ) | ( (lv_fields_6_0= ruleMapField ) ) )* this_BRACE_R_7= RULE_BRACE_R (this_END_8= RULE_END )? )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:399:2: this_MAP_KIND_0= RULE_MAP_KIND ( (lv_name_1_0= ruleENTITY_NAME ) ) this_FILETER_A_2= RULE_FILETER_A ( ( ruleQualifiedName ) ) this_BRACE_L_4= RULE_BRACE_L ( ( (lv_comm_5_0= ruleComment_ALL ) ) | ( (lv_fields_6_0= ruleMapField ) ) )* this_BRACE_R_7= RULE_BRACE_R (this_END_8= RULE_END )?
            {
            this_MAP_KIND_0=(Token)match(input,RULE_MAP_KIND,FOLLOW_RULE_MAP_KIND_in_ruleMap848); 
             
                newLeafNode(this_MAP_KIND_0, grammarAccess.getMapAccess().getMAP_KINDTerminalRuleCall_0()); 
                
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:403:1: ( (lv_name_1_0= ruleENTITY_NAME ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:404:1: (lv_name_1_0= ruleENTITY_NAME )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:404:1: (lv_name_1_0= ruleENTITY_NAME )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:405:3: lv_name_1_0= ruleENTITY_NAME
            {
             
            	        newCompositeNode(grammarAccess.getMapAccess().getNameENTITY_NAMEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleENTITY_NAME_in_ruleMap868);
            lv_name_1_0=ruleENTITY_NAME();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMapRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ENTITY_NAME");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_FILETER_A_2=(Token)match(input,RULE_FILETER_A,FOLLOW_RULE_FILETER_A_in_ruleMap879); 
             
                newLeafNode(this_FILETER_A_2, grammarAccess.getMapAccess().getFILETER_ATerminalRuleCall_2()); 
                
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:425:1: ( ( ruleQualifiedName ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:426:1: ( ruleQualifiedName )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:426:1: ( ruleQualifiedName )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:427:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMapRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMapAccess().getBindMessageTypeCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMap901);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_BRACE_L_4=(Token)match(input,RULE_BRACE_L,FOLLOW_RULE_BRACE_L_in_ruleMap912); 
             
                newLeafNode(this_BRACE_L_4, grammarAccess.getMapAccess().getBRACE_LTerminalRuleCall_4()); 
                
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:444:1: ( ( (lv_comm_5_0= ruleComment_ALL ) ) | ( (lv_fields_6_0= ruleMapField ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_COMMENT_SL && LA7_0<=RULE_COMMENT_ML)) ) {
                    alt7=1;
                }
                else if ( (LA7_0==RULE_FIELD_ATTR) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:444:2: ( (lv_comm_5_0= ruleComment_ALL ) )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:444:2: ( (lv_comm_5_0= ruleComment_ALL ) )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:445:1: (lv_comm_5_0= ruleComment_ALL )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:445:1: (lv_comm_5_0= ruleComment_ALL )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:446:3: lv_comm_5_0= ruleComment_ALL
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMapAccess().getCommComment_ALLParserRuleCall_5_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComment_ALL_in_ruleMap933);
            	    lv_comm_5_0=ruleComment_ALL();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMapRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"comm",
            	            		lv_comm_5_0, 
            	            		"Comment_ALL");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:463:6: ( (lv_fields_6_0= ruleMapField ) )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:463:6: ( (lv_fields_6_0= ruleMapField ) )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:464:1: (lv_fields_6_0= ruleMapField )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:464:1: (lv_fields_6_0= ruleMapField )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:465:3: lv_fields_6_0= ruleMapField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMapAccess().getFieldsMapFieldParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMapField_in_ruleMap960);
            	    lv_fields_6_0=ruleMapField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMapRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_6_0, 
            	            		"MapField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            this_BRACE_R_7=(Token)match(input,RULE_BRACE_R,FOLLOW_RULE_BRACE_R_in_ruleMap973); 
             
                newLeafNode(this_BRACE_R_7, grammarAccess.getMapAccess().getBRACE_RTerminalRuleCall_6()); 
                
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:485:1: (this_END_8= RULE_END )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_END) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:485:2: this_END_8= RULE_END
                    {
                    this_END_8=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleMap984); 
                     
                        newLeafNode(this_END_8, grammarAccess.getMapAccess().getENDTerminalRuleCall_7()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMap"


    // $ANTLR start "entryRuleMapField"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:497:1: entryRuleMapField returns [EObject current=null] : iv_ruleMapField= ruleMapField EOF ;
    public final EObject entryRuleMapField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapField = null;


        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:498:2: (iv_ruleMapField= ruleMapField EOF )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:499:2: iv_ruleMapField= ruleMapField EOF
            {
             newCompositeNode(grammarAccess.getMapFieldRule()); 
            pushFollow(FOLLOW_ruleMapField_in_entryRuleMapField1021);
            iv_ruleMapField=ruleMapField();

            state._fsp--;

             current =iv_ruleMapField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapField1031); 

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
    // $ANTLR end "entryRuleMapField"


    // $ANTLR start "ruleMapField"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:506:1: ruleMapField returns [EObject current=null] : ( ( (lv_attr_0_0= RULE_FIELD_ATTR ) ) ( (lv_name_1_0= ruleENTITY_NAME ) ) (this_FILETER_B_2= RULE_FILETER_B ( ( ruleQualifiedName ) ) )? this_FILETER_A_4= RULE_FILETER_A ( (lv_links_5_0= ruleMapRef ) ) (this_END_6= RULE_END )? ) ;
    public final EObject ruleMapField() throws RecognitionException {
        EObject current = null;

        Token lv_attr_0_0=null;
        Token this_FILETER_B_2=null;
        Token this_FILETER_A_4=null;
        Token this_END_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_links_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:509:28: ( ( ( (lv_attr_0_0= RULE_FIELD_ATTR ) ) ( (lv_name_1_0= ruleENTITY_NAME ) ) (this_FILETER_B_2= RULE_FILETER_B ( ( ruleQualifiedName ) ) )? this_FILETER_A_4= RULE_FILETER_A ( (lv_links_5_0= ruleMapRef ) ) (this_END_6= RULE_END )? ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:510:1: ( ( (lv_attr_0_0= RULE_FIELD_ATTR ) ) ( (lv_name_1_0= ruleENTITY_NAME ) ) (this_FILETER_B_2= RULE_FILETER_B ( ( ruleQualifiedName ) ) )? this_FILETER_A_4= RULE_FILETER_A ( (lv_links_5_0= ruleMapRef ) ) (this_END_6= RULE_END )? )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:510:1: ( ( (lv_attr_0_0= RULE_FIELD_ATTR ) ) ( (lv_name_1_0= ruleENTITY_NAME ) ) (this_FILETER_B_2= RULE_FILETER_B ( ( ruleQualifiedName ) ) )? this_FILETER_A_4= RULE_FILETER_A ( (lv_links_5_0= ruleMapRef ) ) (this_END_6= RULE_END )? )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:510:2: ( (lv_attr_0_0= RULE_FIELD_ATTR ) ) ( (lv_name_1_0= ruleENTITY_NAME ) ) (this_FILETER_B_2= RULE_FILETER_B ( ( ruleQualifiedName ) ) )? this_FILETER_A_4= RULE_FILETER_A ( (lv_links_5_0= ruleMapRef ) ) (this_END_6= RULE_END )?
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:510:2: ( (lv_attr_0_0= RULE_FIELD_ATTR ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:511:1: (lv_attr_0_0= RULE_FIELD_ATTR )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:511:1: (lv_attr_0_0= RULE_FIELD_ATTR )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:512:3: lv_attr_0_0= RULE_FIELD_ATTR
            {
            lv_attr_0_0=(Token)match(input,RULE_FIELD_ATTR,FOLLOW_RULE_FIELD_ATTR_in_ruleMapField1073); 

            			newLeafNode(lv_attr_0_0, grammarAccess.getMapFieldAccess().getAttrFIELD_ATTRTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMapFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attr",
                    		lv_attr_0_0, 
                    		"FIELD_ATTR");
            	    

            }


            }

            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:528:2: ( (lv_name_1_0= ruleENTITY_NAME ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:529:1: (lv_name_1_0= ruleENTITY_NAME )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:529:1: (lv_name_1_0= ruleENTITY_NAME )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:530:3: lv_name_1_0= ruleENTITY_NAME
            {
             
            	        newCompositeNode(grammarAccess.getMapFieldAccess().getNameENTITY_NAMEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleENTITY_NAME_in_ruleMapField1099);
            lv_name_1_0=ruleENTITY_NAME();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMapFieldRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ENTITY_NAME");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:546:2: (this_FILETER_B_2= RULE_FILETER_B ( ( ruleQualifiedName ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_FILETER_B) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:546:3: this_FILETER_B_2= RULE_FILETER_B ( ( ruleQualifiedName ) )
                    {
                    this_FILETER_B_2=(Token)match(input,RULE_FILETER_B,FOLLOW_RULE_FILETER_B_in_ruleMapField1111); 
                     
                        newLeafNode(this_FILETER_B_2, grammarAccess.getMapFieldAccess().getFILETER_BTerminalRuleCall_2_0()); 
                        
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:550:1: ( ( ruleQualifiedName ) )
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:551:1: ( ruleQualifiedName )
                    {
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:551:1: ( ruleQualifiedName )
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:552:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMapFieldRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMapFieldAccess().getFilterMapCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleMapField1133);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            this_FILETER_A_4=(Token)match(input,RULE_FILETER_A,FOLLOW_RULE_FILETER_A_in_ruleMapField1146); 
             
                newLeafNode(this_FILETER_A_4, grammarAccess.getMapFieldAccess().getFILETER_ATerminalRuleCall_3()); 
                
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:569:1: ( (lv_links_5_0= ruleMapRef ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:570:1: (lv_links_5_0= ruleMapRef )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:570:1: (lv_links_5_0= ruleMapRef )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:571:3: lv_links_5_0= ruleMapRef
            {
             
            	        newCompositeNode(grammarAccess.getMapFieldAccess().getLinksMapRefParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleMapRef_in_ruleMapField1166);
            lv_links_5_0=ruleMapRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMapFieldRule());
            	        }
                   		set(
                   			current, 
                   			"links",
                    		lv_links_5_0, 
                    		"MapRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:587:2: (this_END_6= RULE_END )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_END) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:587:3: this_END_6= RULE_END
                    {
                    this_END_6=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleMapField1178); 
                     
                        newLeafNode(this_END_6, grammarAccess.getMapFieldAccess().getENDTerminalRuleCall_5()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapField"


    // $ANTLR start "entryRuleMapRef"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:599:1: entryRuleMapRef returns [EObject current=null] : iv_ruleMapRef= ruleMapRef EOF ;
    public final EObject entryRuleMapRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapRef = null;


        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:600:2: (iv_ruleMapRef= ruleMapRef EOF )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:601:2: iv_ruleMapRef= ruleMapRef EOF
            {
             newCompositeNode(grammarAccess.getMapRefRule()); 
            pushFollow(FOLLOW_ruleMapRef_in_entryRuleMapRef1215);
            iv_ruleMapRef=ruleMapRef();

            state._fsp--;

             current =iv_ruleMapRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapRef1225); 

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
    // $ANTLR end "entryRuleMapRef"


    // $ANTLR start "ruleMapRef"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:608:1: ruleMapRef returns [EObject current=null] : ( ( (otherlv_0= RULE_IDENTITY ) ) (this_DOT_1= RULE_DOT ( (lv_child_2_0= ruleMapRef ) ) )? ) ;
    public final EObject ruleMapRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_DOT_1=null;
        EObject lv_child_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:611:28: ( ( ( (otherlv_0= RULE_IDENTITY ) ) (this_DOT_1= RULE_DOT ( (lv_child_2_0= ruleMapRef ) ) )? ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:612:1: ( ( (otherlv_0= RULE_IDENTITY ) ) (this_DOT_1= RULE_DOT ( (lv_child_2_0= ruleMapRef ) ) )? )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:612:1: ( ( (otherlv_0= RULE_IDENTITY ) ) (this_DOT_1= RULE_DOT ( (lv_child_2_0= ruleMapRef ) ) )? )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:612:2: ( (otherlv_0= RULE_IDENTITY ) ) (this_DOT_1= RULE_DOT ( (lv_child_2_0= ruleMapRef ) ) )?
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:612:2: ( (otherlv_0= RULE_IDENTITY ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:613:1: (otherlv_0= RULE_IDENTITY )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:613:1: (otherlv_0= RULE_IDENTITY )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:614:3: otherlv_0= RULE_IDENTITY
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMapRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_IDENTITY,FOLLOW_RULE_IDENTITY_in_ruleMapRef1270); 

            		newLeafNode(otherlv_0, grammarAccess.getMapRefAccess().getLinkMessageFieldCrossReference_0_0()); 
            	

            }


            }

            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:625:2: (this_DOT_1= RULE_DOT ( (lv_child_2_0= ruleMapRef ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_DOT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:625:3: this_DOT_1= RULE_DOT ( (lv_child_2_0= ruleMapRef ) )
                    {
                    this_DOT_1=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleMapRef1282); 
                     
                        newLeafNode(this_DOT_1, grammarAccess.getMapRefAccess().getDOTTerminalRuleCall_1_0()); 
                        
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:629:1: ( (lv_child_2_0= ruleMapRef ) )
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:630:1: (lv_child_2_0= ruleMapRef )
                    {
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:630:1: (lv_child_2_0= ruleMapRef )
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:631:3: lv_child_2_0= ruleMapRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapRefAccess().getChildMapRefParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapRef_in_ruleMapRef1302);
                    lv_child_2_0=ruleMapRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMapRefRule());
                    	        }
                           		set(
                           			current, 
                           			"child",
                            		lv_child_2_0, 
                            		"MapRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapRef"


    // $ANTLR start "entryRuleMessageType"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:655:1: entryRuleMessageType returns [EObject current=null] : iv_ruleMessageType= ruleMessageType EOF ;
    public final EObject entryRuleMessageType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageType = null;


        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:656:2: (iv_ruleMessageType= ruleMessageType EOF )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:657:2: iv_ruleMessageType= ruleMessageType EOF
            {
             newCompositeNode(grammarAccess.getMessageTypeRule()); 
            pushFollow(FOLLOW_ruleMessageType_in_entryRuleMessageType1340);
            iv_ruleMessageType=ruleMessageType();

            state._fsp--;

             current =iv_ruleMessageType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageType1350); 

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
    // $ANTLR end "entryRuleMessageType"


    // $ANTLR start "ruleMessageType"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:664:1: ruleMessageType returns [EObject current=null] : (this_MESSAGE_0= RULE_MESSAGE ( (lv_name_1_0= ruleENTITY_NAME ) ) this_BRACE_L_2= RULE_BRACE_L ( ( (lv_comm_3_0= ruleComment_ALL ) ) | ( (lv_fields_4_0= ruleMessageField ) ) | ( (lv_types_5_0= ruleType ) ) )* this_BRACE_R_6= RULE_BRACE_R (this_END_7= RULE_END )? ) ;
    public final EObject ruleMessageType() throws RecognitionException {
        EObject current = null;

        Token this_MESSAGE_0=null;
        Token this_BRACE_L_2=null;
        Token this_BRACE_R_6=null;
        Token this_END_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_comm_3_0 = null;

        EObject lv_fields_4_0 = null;

        EObject lv_types_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:667:28: ( (this_MESSAGE_0= RULE_MESSAGE ( (lv_name_1_0= ruleENTITY_NAME ) ) this_BRACE_L_2= RULE_BRACE_L ( ( (lv_comm_3_0= ruleComment_ALL ) ) | ( (lv_fields_4_0= ruleMessageField ) ) | ( (lv_types_5_0= ruleType ) ) )* this_BRACE_R_6= RULE_BRACE_R (this_END_7= RULE_END )? ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:668:1: (this_MESSAGE_0= RULE_MESSAGE ( (lv_name_1_0= ruleENTITY_NAME ) ) this_BRACE_L_2= RULE_BRACE_L ( ( (lv_comm_3_0= ruleComment_ALL ) ) | ( (lv_fields_4_0= ruleMessageField ) ) | ( (lv_types_5_0= ruleType ) ) )* this_BRACE_R_6= RULE_BRACE_R (this_END_7= RULE_END )? )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:668:1: (this_MESSAGE_0= RULE_MESSAGE ( (lv_name_1_0= ruleENTITY_NAME ) ) this_BRACE_L_2= RULE_BRACE_L ( ( (lv_comm_3_0= ruleComment_ALL ) ) | ( (lv_fields_4_0= ruleMessageField ) ) | ( (lv_types_5_0= ruleType ) ) )* this_BRACE_R_6= RULE_BRACE_R (this_END_7= RULE_END )? )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:668:2: this_MESSAGE_0= RULE_MESSAGE ( (lv_name_1_0= ruleENTITY_NAME ) ) this_BRACE_L_2= RULE_BRACE_L ( ( (lv_comm_3_0= ruleComment_ALL ) ) | ( (lv_fields_4_0= ruleMessageField ) ) | ( (lv_types_5_0= ruleType ) ) )* this_BRACE_R_6= RULE_BRACE_R (this_END_7= RULE_END )?
            {
            this_MESSAGE_0=(Token)match(input,RULE_MESSAGE,FOLLOW_RULE_MESSAGE_in_ruleMessageType1386); 
             
                newLeafNode(this_MESSAGE_0, grammarAccess.getMessageTypeAccess().getMESSAGETerminalRuleCall_0()); 
                
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:672:1: ( (lv_name_1_0= ruleENTITY_NAME ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:673:1: (lv_name_1_0= ruleENTITY_NAME )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:673:1: (lv_name_1_0= ruleENTITY_NAME )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:674:3: lv_name_1_0= ruleENTITY_NAME
            {
             
            	        newCompositeNode(grammarAccess.getMessageTypeAccess().getNameENTITY_NAMEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleENTITY_NAME_in_ruleMessageType1406);
            lv_name_1_0=ruleENTITY_NAME();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMessageTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ENTITY_NAME");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_BRACE_L_2=(Token)match(input,RULE_BRACE_L,FOLLOW_RULE_BRACE_L_in_ruleMessageType1417); 
             
                newLeafNode(this_BRACE_L_2, grammarAccess.getMessageTypeAccess().getBRACE_LTerminalRuleCall_2()); 
                
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:694:1: ( ( (lv_comm_3_0= ruleComment_ALL ) ) | ( (lv_fields_4_0= ruleMessageField ) ) | ( (lv_types_5_0= ruleType ) ) )*
            loop12:
            do {
                int alt12=4;
                switch ( input.LA(1) ) {
                case RULE_COMMENT_SL:
                case RULE_COMMENT_ML:
                    {
                    alt12=1;
                    }
                    break;
                case RULE_FIELD_ATTR:
                    {
                    alt12=2;
                    }
                    break;
                case RULE_MESSAGE:
                case RULE_ENUM:
                    {
                    alt12=3;
                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:694:2: ( (lv_comm_3_0= ruleComment_ALL ) )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:694:2: ( (lv_comm_3_0= ruleComment_ALL ) )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:695:1: (lv_comm_3_0= ruleComment_ALL )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:695:1: (lv_comm_3_0= ruleComment_ALL )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:696:3: lv_comm_3_0= ruleComment_ALL
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMessageTypeAccess().getCommComment_ALLParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComment_ALL_in_ruleMessageType1438);
            	    lv_comm_3_0=ruleComment_ALL();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMessageTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"comm",
            	            		lv_comm_3_0, 
            	            		"Comment_ALL");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:713:6: ( (lv_fields_4_0= ruleMessageField ) )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:713:6: ( (lv_fields_4_0= ruleMessageField ) )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:714:1: (lv_fields_4_0= ruleMessageField )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:714:1: (lv_fields_4_0= ruleMessageField )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:715:3: lv_fields_4_0= ruleMessageField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMessageTypeAccess().getFieldsMessageFieldParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMessageField_in_ruleMessageType1465);
            	    lv_fields_4_0=ruleMessageField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMessageTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_4_0, 
            	            		"MessageField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:732:6: ( (lv_types_5_0= ruleType ) )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:732:6: ( (lv_types_5_0= ruleType ) )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:733:1: (lv_types_5_0= ruleType )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:733:1: (lv_types_5_0= ruleType )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:734:3: lv_types_5_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMessageTypeAccess().getTypesTypeParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleMessageType1492);
            	    lv_types_5_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMessageTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_5_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            this_BRACE_R_6=(Token)match(input,RULE_BRACE_R,FOLLOW_RULE_BRACE_R_in_ruleMessageType1505); 
             
                newLeafNode(this_BRACE_R_6, grammarAccess.getMessageTypeAccess().getBRACE_RTerminalRuleCall_4()); 
                
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:754:1: (this_END_7= RULE_END )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_END) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:754:2: this_END_7= RULE_END
                    {
                    this_END_7=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleMessageType1516); 
                     
                        newLeafNode(this_END_7, grammarAccess.getMessageTypeAccess().getENDTerminalRuleCall_5()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageType"


    // $ANTLR start "entryRuleMessageField"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:766:1: entryRuleMessageField returns [EObject current=null] : iv_ruleMessageField= ruleMessageField EOF ;
    public final EObject entryRuleMessageField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageField = null;


        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:767:2: (iv_ruleMessageField= ruleMessageField EOF )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:768:2: iv_ruleMessageField= ruleMessageField EOF
            {
             newCompositeNode(grammarAccess.getMessageFieldRule()); 
            pushFollow(FOLLOW_ruleMessageField_in_entryRuleMessageField1553);
            iv_ruleMessageField=ruleMessageField();

            state._fsp--;

             current =iv_ruleMessageField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageField1563); 

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
    // $ANTLR end "entryRuleMessageField"


    // $ANTLR start "ruleMessageField"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:775:1: ruleMessageField returns [EObject current=null] : (this_MessageSimpleField_0= ruleMessageSimpleField | this_MessageComplexField_1= ruleMessageComplexField ) ;
    public final EObject ruleMessageField() throws RecognitionException {
        EObject current = null;

        EObject this_MessageSimpleField_0 = null;

        EObject this_MessageComplexField_1 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:778:28: ( (this_MessageSimpleField_0= ruleMessageSimpleField | this_MessageComplexField_1= ruleMessageComplexField ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:779:1: (this_MessageSimpleField_0= ruleMessageSimpleField | this_MessageComplexField_1= ruleMessageComplexField )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:779:1: (this_MessageSimpleField_0= ruleMessageSimpleField | this_MessageComplexField_1= ruleMessageComplexField )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_FIELD_ATTR) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_FIELD_TYPE) ) {
                    alt14=1;
                }
                else if ( (LA14_1==RULE_IDENTITY) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:780:5: this_MessageSimpleField_0= ruleMessageSimpleField
                    {
                     
                            newCompositeNode(grammarAccess.getMessageFieldAccess().getMessageSimpleFieldParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMessageSimpleField_in_ruleMessageField1610);
                    this_MessageSimpleField_0=ruleMessageSimpleField();

                    state._fsp--;

                     
                            current = this_MessageSimpleField_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:790:5: this_MessageComplexField_1= ruleMessageComplexField
                    {
                     
                            newCompositeNode(grammarAccess.getMessageFieldAccess().getMessageComplexFieldParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMessageComplexField_in_ruleMessageField1637);
                    this_MessageComplexField_1=ruleMessageComplexField();

                    state._fsp--;

                     
                            current = this_MessageComplexField_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageField"


    // $ANTLR start "entryRuleMessageSimpleField"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:806:1: entryRuleMessageSimpleField returns [EObject current=null] : iv_ruleMessageSimpleField= ruleMessageSimpleField EOF ;
    public final EObject entryRuleMessageSimpleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageSimpleField = null;


        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:807:2: (iv_ruleMessageSimpleField= ruleMessageSimpleField EOF )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:808:2: iv_ruleMessageSimpleField= ruleMessageSimpleField EOF
            {
             newCompositeNode(grammarAccess.getMessageSimpleFieldRule()); 
            pushFollow(FOLLOW_ruleMessageSimpleField_in_entryRuleMessageSimpleField1672);
            iv_ruleMessageSimpleField=ruleMessageSimpleField();

            state._fsp--;

             current =iv_ruleMessageSimpleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageSimpleField1682); 

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
    // $ANTLR end "entryRuleMessageSimpleField"


    // $ANTLR start "ruleMessageSimpleField"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:815:1: ruleMessageSimpleField returns [EObject current=null] : ( ( (lv_attr_0_0= RULE_FIELD_ATTR ) ) ( (lv_type_1_0= RULE_FIELD_TYPE ) ) ( (lv_name_2_0= ruleENTITY_NAME ) ) this_EQUALS_3= RULE_EQUALS ( (lv_index_4_0= RULE_NUMBER ) ) ( ruleMessageFieldDefault )? (this_END_6= RULE_END )? ) ;
    public final EObject ruleMessageSimpleField() throws RecognitionException {
        EObject current = null;

        Token lv_attr_0_0=null;
        Token lv_type_1_0=null;
        Token this_EQUALS_3=null;
        Token lv_index_4_0=null;
        Token this_END_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:818:28: ( ( ( (lv_attr_0_0= RULE_FIELD_ATTR ) ) ( (lv_type_1_0= RULE_FIELD_TYPE ) ) ( (lv_name_2_0= ruleENTITY_NAME ) ) this_EQUALS_3= RULE_EQUALS ( (lv_index_4_0= RULE_NUMBER ) ) ( ruleMessageFieldDefault )? (this_END_6= RULE_END )? ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:819:1: ( ( (lv_attr_0_0= RULE_FIELD_ATTR ) ) ( (lv_type_1_0= RULE_FIELD_TYPE ) ) ( (lv_name_2_0= ruleENTITY_NAME ) ) this_EQUALS_3= RULE_EQUALS ( (lv_index_4_0= RULE_NUMBER ) ) ( ruleMessageFieldDefault )? (this_END_6= RULE_END )? )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:819:1: ( ( (lv_attr_0_0= RULE_FIELD_ATTR ) ) ( (lv_type_1_0= RULE_FIELD_TYPE ) ) ( (lv_name_2_0= ruleENTITY_NAME ) ) this_EQUALS_3= RULE_EQUALS ( (lv_index_4_0= RULE_NUMBER ) ) ( ruleMessageFieldDefault )? (this_END_6= RULE_END )? )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:819:2: ( (lv_attr_0_0= RULE_FIELD_ATTR ) ) ( (lv_type_1_0= RULE_FIELD_TYPE ) ) ( (lv_name_2_0= ruleENTITY_NAME ) ) this_EQUALS_3= RULE_EQUALS ( (lv_index_4_0= RULE_NUMBER ) ) ( ruleMessageFieldDefault )? (this_END_6= RULE_END )?
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:819:2: ( (lv_attr_0_0= RULE_FIELD_ATTR ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:820:1: (lv_attr_0_0= RULE_FIELD_ATTR )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:820:1: (lv_attr_0_0= RULE_FIELD_ATTR )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:821:3: lv_attr_0_0= RULE_FIELD_ATTR
            {
            lv_attr_0_0=(Token)match(input,RULE_FIELD_ATTR,FOLLOW_RULE_FIELD_ATTR_in_ruleMessageSimpleField1724); 

            			newLeafNode(lv_attr_0_0, grammarAccess.getMessageSimpleFieldAccess().getAttrFIELD_ATTRTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageSimpleFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attr",
                    		lv_attr_0_0, 
                    		"FIELD_ATTR");
            	    

            }


            }

            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:837:2: ( (lv_type_1_0= RULE_FIELD_TYPE ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:838:1: (lv_type_1_0= RULE_FIELD_TYPE )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:838:1: (lv_type_1_0= RULE_FIELD_TYPE )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:839:3: lv_type_1_0= RULE_FIELD_TYPE
            {
            lv_type_1_0=(Token)match(input,RULE_FIELD_TYPE,FOLLOW_RULE_FIELD_TYPE_in_ruleMessageSimpleField1746); 

            			newLeafNode(lv_type_1_0, grammarAccess.getMessageSimpleFieldAccess().getTypeFIELD_TYPETerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageSimpleFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"FIELD_TYPE");
            	    

            }


            }

            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:855:2: ( (lv_name_2_0= ruleENTITY_NAME ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:856:1: (lv_name_2_0= ruleENTITY_NAME )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:856:1: (lv_name_2_0= ruleENTITY_NAME )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:857:3: lv_name_2_0= ruleENTITY_NAME
            {
             
            	        newCompositeNode(grammarAccess.getMessageSimpleFieldAccess().getNameENTITY_NAMEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleENTITY_NAME_in_ruleMessageSimpleField1772);
            lv_name_2_0=ruleENTITY_NAME();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMessageSimpleFieldRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ENTITY_NAME");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleMessageSimpleField1783); 
             
                newLeafNode(this_EQUALS_3, grammarAccess.getMessageSimpleFieldAccess().getEQUALSTerminalRuleCall_3()); 
                
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:877:1: ( (lv_index_4_0= RULE_NUMBER ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:878:1: (lv_index_4_0= RULE_NUMBER )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:878:1: (lv_index_4_0= RULE_NUMBER )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:879:3: lv_index_4_0= RULE_NUMBER
            {
            lv_index_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMessageSimpleField1799); 

            			newLeafNode(lv_index_4_0, grammarAccess.getMessageSimpleFieldAccess().getIndexNUMBERTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageSimpleFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"index",
                    		lv_index_4_0, 
                    		"NUMBER");
            	    

            }


            }

            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:895:2: ( ruleMessageFieldDefault )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_BRACKET_L) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:896:5: ruleMessageFieldDefault
                    {
                     
                            newCompositeNode(grammarAccess.getMessageSimpleFieldAccess().getMessageFieldDefaultParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleMessageFieldDefault_in_ruleMessageSimpleField1821);
                    ruleMessageFieldDefault();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:903:3: (this_END_6= RULE_END )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_END) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:903:4: this_END_6= RULE_END
                    {
                    this_END_6=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleMessageSimpleField1834); 
                     
                        newLeafNode(this_END_6, grammarAccess.getMessageSimpleFieldAccess().getENDTerminalRuleCall_6()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageSimpleField"


    // $ANTLR start "entryRuleMessageComplexField"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:915:1: entryRuleMessageComplexField returns [EObject current=null] : iv_ruleMessageComplexField= ruleMessageComplexField EOF ;
    public final EObject entryRuleMessageComplexField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageComplexField = null;


        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:916:2: (iv_ruleMessageComplexField= ruleMessageComplexField EOF )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:917:2: iv_ruleMessageComplexField= ruleMessageComplexField EOF
            {
             newCompositeNode(grammarAccess.getMessageComplexFieldRule()); 
            pushFollow(FOLLOW_ruleMessageComplexField_in_entryRuleMessageComplexField1871);
            iv_ruleMessageComplexField=ruleMessageComplexField();

            state._fsp--;

             current =iv_ruleMessageComplexField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageComplexField1881); 

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
    // $ANTLR end "entryRuleMessageComplexField"


    // $ANTLR start "ruleMessageComplexField"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:924:1: ruleMessageComplexField returns [EObject current=null] : ( ( (lv_attr_0_0= RULE_FIELD_ATTR ) ) ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleENTITY_NAME ) ) this_EQUALS_3= RULE_EQUALS ( (lv_index_4_0= RULE_NUMBER ) ) ( ruleMessageFieldDefault )? (this_END_6= RULE_END )? ) ;
    public final EObject ruleMessageComplexField() throws RecognitionException {
        EObject current = null;

        Token lv_attr_0_0=null;
        Token this_EQUALS_3=null;
        Token lv_index_4_0=null;
        Token this_END_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:927:28: ( ( ( (lv_attr_0_0= RULE_FIELD_ATTR ) ) ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleENTITY_NAME ) ) this_EQUALS_3= RULE_EQUALS ( (lv_index_4_0= RULE_NUMBER ) ) ( ruleMessageFieldDefault )? (this_END_6= RULE_END )? ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:928:1: ( ( (lv_attr_0_0= RULE_FIELD_ATTR ) ) ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleENTITY_NAME ) ) this_EQUALS_3= RULE_EQUALS ( (lv_index_4_0= RULE_NUMBER ) ) ( ruleMessageFieldDefault )? (this_END_6= RULE_END )? )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:928:1: ( ( (lv_attr_0_0= RULE_FIELD_ATTR ) ) ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleENTITY_NAME ) ) this_EQUALS_3= RULE_EQUALS ( (lv_index_4_0= RULE_NUMBER ) ) ( ruleMessageFieldDefault )? (this_END_6= RULE_END )? )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:928:2: ( (lv_attr_0_0= RULE_FIELD_ATTR ) ) ( ( ruleQualifiedName ) ) ( (lv_name_2_0= ruleENTITY_NAME ) ) this_EQUALS_3= RULE_EQUALS ( (lv_index_4_0= RULE_NUMBER ) ) ( ruleMessageFieldDefault )? (this_END_6= RULE_END )?
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:928:2: ( (lv_attr_0_0= RULE_FIELD_ATTR ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:929:1: (lv_attr_0_0= RULE_FIELD_ATTR )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:929:1: (lv_attr_0_0= RULE_FIELD_ATTR )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:930:3: lv_attr_0_0= RULE_FIELD_ATTR
            {
            lv_attr_0_0=(Token)match(input,RULE_FIELD_ATTR,FOLLOW_RULE_FIELD_ATTR_in_ruleMessageComplexField1923); 

            			newLeafNode(lv_attr_0_0, grammarAccess.getMessageComplexFieldAccess().getAttrFIELD_ATTRTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageComplexFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attr",
                    		lv_attr_0_0, 
                    		"FIELD_ATTR");
            	    

            }


            }

            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:946:2: ( ( ruleQualifiedName ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:947:1: ( ruleQualifiedName )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:947:1: ( ruleQualifiedName )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:948:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageComplexFieldRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMessageComplexFieldAccess().getTypeTypeCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMessageComplexField1951);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:961:2: ( (lv_name_2_0= ruleENTITY_NAME ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:962:1: (lv_name_2_0= ruleENTITY_NAME )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:962:1: (lv_name_2_0= ruleENTITY_NAME )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:963:3: lv_name_2_0= ruleENTITY_NAME
            {
             
            	        newCompositeNode(grammarAccess.getMessageComplexFieldAccess().getNameENTITY_NAMEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleENTITY_NAME_in_ruleMessageComplexField1972);
            lv_name_2_0=ruleENTITY_NAME();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMessageComplexFieldRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ENTITY_NAME");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleMessageComplexField1983); 
             
                newLeafNode(this_EQUALS_3, grammarAccess.getMessageComplexFieldAccess().getEQUALSTerminalRuleCall_3()); 
                
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:983:1: ( (lv_index_4_0= RULE_NUMBER ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:984:1: (lv_index_4_0= RULE_NUMBER )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:984:1: (lv_index_4_0= RULE_NUMBER )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:985:3: lv_index_4_0= RULE_NUMBER
            {
            lv_index_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMessageComplexField1999); 

            			newLeafNode(lv_index_4_0, grammarAccess.getMessageComplexFieldAccess().getIndexNUMBERTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageComplexFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"index",
                    		lv_index_4_0, 
                    		"NUMBER");
            	    

            }


            }

            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1001:2: ( ruleMessageFieldDefault )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_BRACKET_L) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1002:5: ruleMessageFieldDefault
                    {
                     
                            newCompositeNode(grammarAccess.getMessageComplexFieldAccess().getMessageFieldDefaultParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleMessageFieldDefault_in_ruleMessageComplexField2021);
                    ruleMessageFieldDefault();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1009:3: (this_END_6= RULE_END )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_END) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1009:4: this_END_6= RULE_END
                    {
                    this_END_6=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleMessageComplexField2034); 
                     
                        newLeafNode(this_END_6, grammarAccess.getMessageComplexFieldAccess().getENDTerminalRuleCall_6()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageComplexField"


    // $ANTLR start "entryRuleMessageFieldDefault"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1021:1: entryRuleMessageFieldDefault returns [String current=null] : iv_ruleMessageFieldDefault= ruleMessageFieldDefault EOF ;
    public final String entryRuleMessageFieldDefault() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMessageFieldDefault = null;


        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1022:2: (iv_ruleMessageFieldDefault= ruleMessageFieldDefault EOF )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1023:2: iv_ruleMessageFieldDefault= ruleMessageFieldDefault EOF
            {
             newCompositeNode(grammarAccess.getMessageFieldDefaultRule()); 
            pushFollow(FOLLOW_ruleMessageFieldDefault_in_entryRuleMessageFieldDefault2072);
            iv_ruleMessageFieldDefault=ruleMessageFieldDefault();

            state._fsp--;

             current =iv_ruleMessageFieldDefault.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessageFieldDefault2083); 

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
    // $ANTLR end "entryRuleMessageFieldDefault"


    // $ANTLR start "ruleMessageFieldDefault"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1030:1: ruleMessageFieldDefault returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BRACKET_L_0= RULE_BRACKET_L this_DEFAULT_KIND_1= RULE_DEFAULT_KIND this_EQUALS_2= RULE_EQUALS (this_NUMBER_3= RULE_NUMBER | this_IDENTITY_4= RULE_IDENTITY ) this_BRACKET_R_5= RULE_BRACKET_R ) ;
    public final AntlrDatatypeRuleToken ruleMessageFieldDefault() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BRACKET_L_0=null;
        Token this_DEFAULT_KIND_1=null;
        Token this_EQUALS_2=null;
        Token this_NUMBER_3=null;
        Token this_IDENTITY_4=null;
        Token this_BRACKET_R_5=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1033:28: ( (this_BRACKET_L_0= RULE_BRACKET_L this_DEFAULT_KIND_1= RULE_DEFAULT_KIND this_EQUALS_2= RULE_EQUALS (this_NUMBER_3= RULE_NUMBER | this_IDENTITY_4= RULE_IDENTITY ) this_BRACKET_R_5= RULE_BRACKET_R ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1034:1: (this_BRACKET_L_0= RULE_BRACKET_L this_DEFAULT_KIND_1= RULE_DEFAULT_KIND this_EQUALS_2= RULE_EQUALS (this_NUMBER_3= RULE_NUMBER | this_IDENTITY_4= RULE_IDENTITY ) this_BRACKET_R_5= RULE_BRACKET_R )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1034:1: (this_BRACKET_L_0= RULE_BRACKET_L this_DEFAULT_KIND_1= RULE_DEFAULT_KIND this_EQUALS_2= RULE_EQUALS (this_NUMBER_3= RULE_NUMBER | this_IDENTITY_4= RULE_IDENTITY ) this_BRACKET_R_5= RULE_BRACKET_R )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1034:6: this_BRACKET_L_0= RULE_BRACKET_L this_DEFAULT_KIND_1= RULE_DEFAULT_KIND this_EQUALS_2= RULE_EQUALS (this_NUMBER_3= RULE_NUMBER | this_IDENTITY_4= RULE_IDENTITY ) this_BRACKET_R_5= RULE_BRACKET_R
            {
            this_BRACKET_L_0=(Token)match(input,RULE_BRACKET_L,FOLLOW_RULE_BRACKET_L_in_ruleMessageFieldDefault2123); 

            		current.merge(this_BRACKET_L_0);
                
             
                newLeafNode(this_BRACKET_L_0, grammarAccess.getMessageFieldDefaultAccess().getBRACKET_LTerminalRuleCall_0()); 
                
            this_DEFAULT_KIND_1=(Token)match(input,RULE_DEFAULT_KIND,FOLLOW_RULE_DEFAULT_KIND_in_ruleMessageFieldDefault2143); 

            		current.merge(this_DEFAULT_KIND_1);
                
             
                newLeafNode(this_DEFAULT_KIND_1, grammarAccess.getMessageFieldDefaultAccess().getDEFAULT_KINDTerminalRuleCall_1()); 
                
            this_EQUALS_2=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleMessageFieldDefault2163); 

            		current.merge(this_EQUALS_2);
                
             
                newLeafNode(this_EQUALS_2, grammarAccess.getMessageFieldDefaultAccess().getEQUALSTerminalRuleCall_2()); 
                
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1055:1: (this_NUMBER_3= RULE_NUMBER | this_IDENTITY_4= RULE_IDENTITY )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_NUMBER) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_IDENTITY) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1055:6: this_NUMBER_3= RULE_NUMBER
                    {
                    this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMessageFieldDefault2184); 

                    		current.merge(this_NUMBER_3);
                        
                     
                        newLeafNode(this_NUMBER_3, grammarAccess.getMessageFieldDefaultAccess().getNUMBERTerminalRuleCall_3_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1063:10: this_IDENTITY_4= RULE_IDENTITY
                    {
                    this_IDENTITY_4=(Token)match(input,RULE_IDENTITY,FOLLOW_RULE_IDENTITY_in_ruleMessageFieldDefault2210); 

                    		current.merge(this_IDENTITY_4);
                        
                     
                        newLeafNode(this_IDENTITY_4, grammarAccess.getMessageFieldDefaultAccess().getIDENTITYTerminalRuleCall_3_1()); 
                        

                    }
                    break;

            }

            this_BRACKET_R_5=(Token)match(input,RULE_BRACKET_R,FOLLOW_RULE_BRACKET_R_in_ruleMessageFieldDefault2231); 

            		current.merge(this_BRACKET_R_5);
                
             
                newLeafNode(this_BRACKET_R_5, grammarAccess.getMessageFieldDefaultAccess().getBRACKET_RTerminalRuleCall_4()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageFieldDefault"


    // $ANTLR start "entryRuleEnumType"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1085:1: entryRuleEnumType returns [EObject current=null] : iv_ruleEnumType= ruleEnumType EOF ;
    public final EObject entryRuleEnumType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumType = null;


        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1086:2: (iv_ruleEnumType= ruleEnumType EOF )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1087:2: iv_ruleEnumType= ruleEnumType EOF
            {
             newCompositeNode(grammarAccess.getEnumTypeRule()); 
            pushFollow(FOLLOW_ruleEnumType_in_entryRuleEnumType2276);
            iv_ruleEnumType=ruleEnumType();

            state._fsp--;

             current =iv_ruleEnumType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumType2286); 

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
    // $ANTLR end "entryRuleEnumType"


    // $ANTLR start "ruleEnumType"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1094:1: ruleEnumType returns [EObject current=null] : (this_ENUM_0= RULE_ENUM ( (lv_name_1_0= ruleENTITY_NAME ) ) this_BRACE_L_2= RULE_BRACE_L ( ( (lv_comm_3_0= ruleComment_ALL ) ) | ( (lv_fields_4_0= ruleEnumField ) ) | ( (lv_options_5_0= ruleEnumFieldOpt ) ) )* this_BRACE_R_6= RULE_BRACE_R (this_END_7= RULE_END )? ) ;
    public final EObject ruleEnumType() throws RecognitionException {
        EObject current = null;

        Token this_ENUM_0=null;
        Token this_BRACE_L_2=null;
        Token this_BRACE_R_6=null;
        Token this_END_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_comm_3_0 = null;

        EObject lv_fields_4_0 = null;

        EObject lv_options_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1097:28: ( (this_ENUM_0= RULE_ENUM ( (lv_name_1_0= ruleENTITY_NAME ) ) this_BRACE_L_2= RULE_BRACE_L ( ( (lv_comm_3_0= ruleComment_ALL ) ) | ( (lv_fields_4_0= ruleEnumField ) ) | ( (lv_options_5_0= ruleEnumFieldOpt ) ) )* this_BRACE_R_6= RULE_BRACE_R (this_END_7= RULE_END )? ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1098:1: (this_ENUM_0= RULE_ENUM ( (lv_name_1_0= ruleENTITY_NAME ) ) this_BRACE_L_2= RULE_BRACE_L ( ( (lv_comm_3_0= ruleComment_ALL ) ) | ( (lv_fields_4_0= ruleEnumField ) ) | ( (lv_options_5_0= ruleEnumFieldOpt ) ) )* this_BRACE_R_6= RULE_BRACE_R (this_END_7= RULE_END )? )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1098:1: (this_ENUM_0= RULE_ENUM ( (lv_name_1_0= ruleENTITY_NAME ) ) this_BRACE_L_2= RULE_BRACE_L ( ( (lv_comm_3_0= ruleComment_ALL ) ) | ( (lv_fields_4_0= ruleEnumField ) ) | ( (lv_options_5_0= ruleEnumFieldOpt ) ) )* this_BRACE_R_6= RULE_BRACE_R (this_END_7= RULE_END )? )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1098:2: this_ENUM_0= RULE_ENUM ( (lv_name_1_0= ruleENTITY_NAME ) ) this_BRACE_L_2= RULE_BRACE_L ( ( (lv_comm_3_0= ruleComment_ALL ) ) | ( (lv_fields_4_0= ruleEnumField ) ) | ( (lv_options_5_0= ruleEnumFieldOpt ) ) )* this_BRACE_R_6= RULE_BRACE_R (this_END_7= RULE_END )?
            {
            this_ENUM_0=(Token)match(input,RULE_ENUM,FOLLOW_RULE_ENUM_in_ruleEnumType2322); 
             
                newLeafNode(this_ENUM_0, grammarAccess.getEnumTypeAccess().getENUMTerminalRuleCall_0()); 
                
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1102:1: ( (lv_name_1_0= ruleENTITY_NAME ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1103:1: (lv_name_1_0= ruleENTITY_NAME )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1103:1: (lv_name_1_0= ruleENTITY_NAME )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1104:3: lv_name_1_0= ruleENTITY_NAME
            {
             
            	        newCompositeNode(grammarAccess.getEnumTypeAccess().getNameENTITY_NAMEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleENTITY_NAME_in_ruleEnumType2342);
            lv_name_1_0=ruleENTITY_NAME();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ENTITY_NAME");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_BRACE_L_2=(Token)match(input,RULE_BRACE_L,FOLLOW_RULE_BRACE_L_in_ruleEnumType2353); 
             
                newLeafNode(this_BRACE_L_2, grammarAccess.getEnumTypeAccess().getBRACE_LTerminalRuleCall_2()); 
                
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1124:1: ( ( (lv_comm_3_0= ruleComment_ALL ) ) | ( (lv_fields_4_0= ruleEnumField ) ) | ( (lv_options_5_0= ruleEnumFieldOpt ) ) )*
            loop20:
            do {
                int alt20=4;
                switch ( input.LA(1) ) {
                case RULE_COMMENT_SL:
                case RULE_COMMENT_ML:
                    {
                    alt20=1;
                    }
                    break;
                case RULE_PACKAGE:
                case RULE_IMPORT:
                case RULE_MAP_KIND:
                case RULE_FIELD_ATTR:
                case RULE_IDENTITY:
                case RULE_MESSAGE:
                case RULE_FIELD_TYPE:
                case RULE_DEFAULT_KIND:
                case RULE_ENUM:
                    {
                    alt20=2;
                    }
                    break;
                case RULE_OPTION:
                    {
                    int LA20_4 = input.LA(2);

                    if ( (LA20_4==RULE_EQUALS) ) {
                        alt20=2;
                    }
                    else if ( (LA20_4==RULE_PACKAGE||LA20_4==RULE_IMPORT||LA20_4==RULE_OPTION||LA20_4==RULE_MAP_KIND||LA20_4==RULE_FIELD_ATTR||LA20_4==RULE_IDENTITY||(LA20_4>=RULE_MESSAGE && LA20_4<=RULE_FIELD_TYPE)||LA20_4==RULE_DEFAULT_KIND||LA20_4==RULE_ENUM) ) {
                        alt20=3;
                    }


                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1124:2: ( (lv_comm_3_0= ruleComment_ALL ) )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1124:2: ( (lv_comm_3_0= ruleComment_ALL ) )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1125:1: (lv_comm_3_0= ruleComment_ALL )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1125:1: (lv_comm_3_0= ruleComment_ALL )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1126:3: lv_comm_3_0= ruleComment_ALL
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumTypeAccess().getCommComment_ALLParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComment_ALL_in_ruleEnumType2374);
            	    lv_comm_3_0=ruleComment_ALL();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"comm",
            	            		lv_comm_3_0, 
            	            		"Comment_ALL");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1143:6: ( (lv_fields_4_0= ruleEnumField ) )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1143:6: ( (lv_fields_4_0= ruleEnumField ) )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1144:1: (lv_fields_4_0= ruleEnumField )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1144:1: (lv_fields_4_0= ruleEnumField )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1145:3: lv_fields_4_0= ruleEnumField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumTypeAccess().getFieldsEnumFieldParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumField_in_ruleEnumType2401);
            	    lv_fields_4_0=ruleEnumField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumTypeRule());
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
            	    break;
            	case 3 :
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1162:6: ( (lv_options_5_0= ruleEnumFieldOpt ) )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1162:6: ( (lv_options_5_0= ruleEnumFieldOpt ) )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1163:1: (lv_options_5_0= ruleEnumFieldOpt )
            	    {
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1163:1: (lv_options_5_0= ruleEnumFieldOpt )
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1164:3: lv_options_5_0= ruleEnumFieldOpt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumTypeAccess().getOptionsEnumFieldOptParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumFieldOpt_in_ruleEnumType2428);
            	    lv_options_5_0=ruleEnumFieldOpt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_5_0, 
            	            		"EnumFieldOpt");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            this_BRACE_R_6=(Token)match(input,RULE_BRACE_R,FOLLOW_RULE_BRACE_R_in_ruleEnumType2441); 
             
                newLeafNode(this_BRACE_R_6, grammarAccess.getEnumTypeAccess().getBRACE_RTerminalRuleCall_4()); 
                
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1184:1: (this_END_7= RULE_END )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_END) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1184:2: this_END_7= RULE_END
                    {
                    this_END_7=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleEnumType2452); 
                     
                        newLeafNode(this_END_7, grammarAccess.getEnumTypeAccess().getENDTerminalRuleCall_5()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumType"


    // $ANTLR start "entryRuleEnumField"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1196:1: entryRuleEnumField returns [EObject current=null] : iv_ruleEnumField= ruleEnumField EOF ;
    public final EObject entryRuleEnumField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumField = null;


        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1197:2: (iv_ruleEnumField= ruleEnumField EOF )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1198:2: iv_ruleEnumField= ruleEnumField EOF
            {
             newCompositeNode(grammarAccess.getEnumFieldRule()); 
            pushFollow(FOLLOW_ruleEnumField_in_entryRuleEnumField2489);
            iv_ruleEnumField=ruleEnumField();

            state._fsp--;

             current =iv_ruleEnumField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumField2499); 

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
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1205:1: ruleEnumField returns [EObject current=null] : ( ( (lv_name_0_0= ruleENTITY_NAME ) ) this_EQUALS_1= RULE_EQUALS ( (lv_index_2_0= RULE_NUMBER ) ) (this_END_3= RULE_END )? ) ;
    public final EObject ruleEnumField() throws RecognitionException {
        EObject current = null;

        Token this_EQUALS_1=null;
        Token lv_index_2_0=null;
        Token this_END_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1208:28: ( ( ( (lv_name_0_0= ruleENTITY_NAME ) ) this_EQUALS_1= RULE_EQUALS ( (lv_index_2_0= RULE_NUMBER ) ) (this_END_3= RULE_END )? ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1209:1: ( ( (lv_name_0_0= ruleENTITY_NAME ) ) this_EQUALS_1= RULE_EQUALS ( (lv_index_2_0= RULE_NUMBER ) ) (this_END_3= RULE_END )? )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1209:1: ( ( (lv_name_0_0= ruleENTITY_NAME ) ) this_EQUALS_1= RULE_EQUALS ( (lv_index_2_0= RULE_NUMBER ) ) (this_END_3= RULE_END )? )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1209:2: ( (lv_name_0_0= ruleENTITY_NAME ) ) this_EQUALS_1= RULE_EQUALS ( (lv_index_2_0= RULE_NUMBER ) ) (this_END_3= RULE_END )?
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1209:2: ( (lv_name_0_0= ruleENTITY_NAME ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1210:1: (lv_name_0_0= ruleENTITY_NAME )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1210:1: (lv_name_0_0= ruleENTITY_NAME )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1211:3: lv_name_0_0= ruleENTITY_NAME
            {
             
            	        newCompositeNode(grammarAccess.getEnumFieldAccess().getNameENTITY_NAMEParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleENTITY_NAME_in_ruleEnumField2545);
            lv_name_0_0=ruleENTITY_NAME();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumFieldRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ENTITY_NAME");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_EQUALS_1=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleEnumField2556); 
             
                newLeafNode(this_EQUALS_1, grammarAccess.getEnumFieldAccess().getEQUALSTerminalRuleCall_1()); 
                
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1231:1: ( (lv_index_2_0= RULE_NUMBER ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1232:1: (lv_index_2_0= RULE_NUMBER )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1232:1: (lv_index_2_0= RULE_NUMBER )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1233:3: lv_index_2_0= RULE_NUMBER
            {
            lv_index_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleEnumField2572); 

            			newLeafNode(lv_index_2_0, grammarAccess.getEnumFieldAccess().getIndexNUMBERTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"index",
                    		lv_index_2_0, 
                    		"NUMBER");
            	    

            }


            }

            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1249:2: (this_END_3= RULE_END )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_END) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1249:3: this_END_3= RULE_END
                    {
                    this_END_3=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleEnumField2589); 
                     
                        newLeafNode(this_END_3, grammarAccess.getEnumFieldAccess().getENDTerminalRuleCall_3()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleEnumFieldOpt"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1261:1: entryRuleEnumFieldOpt returns [EObject current=null] : iv_ruleEnumFieldOpt= ruleEnumFieldOpt EOF ;
    public final EObject entryRuleEnumFieldOpt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumFieldOpt = null;


        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1262:2: (iv_ruleEnumFieldOpt= ruleEnumFieldOpt EOF )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1263:2: iv_ruleEnumFieldOpt= ruleEnumFieldOpt EOF
            {
             newCompositeNode(grammarAccess.getEnumFieldOptRule()); 
            pushFollow(FOLLOW_ruleEnumFieldOpt_in_entryRuleEnumFieldOpt2626);
            iv_ruleEnumFieldOpt=ruleEnumFieldOpt();

            state._fsp--;

             current =iv_ruleEnumFieldOpt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumFieldOpt2636); 

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
    // $ANTLR end "entryRuleEnumFieldOpt"


    // $ANTLR start "ruleEnumFieldOpt"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1270:1: ruleEnumFieldOpt returns [EObject current=null] : (this_OPTION_0= RULE_OPTION ( (lv_name_1_0= ruleENTITY_NAME ) ) this_EQUALS_2= RULE_EQUALS ( (lv_value_3_0= RULE_IDENTITY ) ) (this_END_4= RULE_END )? ) ;
    public final EObject ruleEnumFieldOpt() throws RecognitionException {
        EObject current = null;

        Token this_OPTION_0=null;
        Token this_EQUALS_2=null;
        Token lv_value_3_0=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1273:28: ( (this_OPTION_0= RULE_OPTION ( (lv_name_1_0= ruleENTITY_NAME ) ) this_EQUALS_2= RULE_EQUALS ( (lv_value_3_0= RULE_IDENTITY ) ) (this_END_4= RULE_END )? ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1274:1: (this_OPTION_0= RULE_OPTION ( (lv_name_1_0= ruleENTITY_NAME ) ) this_EQUALS_2= RULE_EQUALS ( (lv_value_3_0= RULE_IDENTITY ) ) (this_END_4= RULE_END )? )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1274:1: (this_OPTION_0= RULE_OPTION ( (lv_name_1_0= ruleENTITY_NAME ) ) this_EQUALS_2= RULE_EQUALS ( (lv_value_3_0= RULE_IDENTITY ) ) (this_END_4= RULE_END )? )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1274:2: this_OPTION_0= RULE_OPTION ( (lv_name_1_0= ruleENTITY_NAME ) ) this_EQUALS_2= RULE_EQUALS ( (lv_value_3_0= RULE_IDENTITY ) ) (this_END_4= RULE_END )?
            {
            this_OPTION_0=(Token)match(input,RULE_OPTION,FOLLOW_RULE_OPTION_in_ruleEnumFieldOpt2672); 
             
                newLeafNode(this_OPTION_0, grammarAccess.getEnumFieldOptAccess().getOPTIONTerminalRuleCall_0()); 
                
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1278:1: ( (lv_name_1_0= ruleENTITY_NAME ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1279:1: (lv_name_1_0= ruleENTITY_NAME )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1279:1: (lv_name_1_0= ruleENTITY_NAME )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1280:3: lv_name_1_0= ruleENTITY_NAME
            {
             
            	        newCompositeNode(grammarAccess.getEnumFieldOptAccess().getNameENTITY_NAMEParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleENTITY_NAME_in_ruleEnumFieldOpt2692);
            lv_name_1_0=ruleENTITY_NAME();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumFieldOptRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ENTITY_NAME");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_EQUALS_2=(Token)match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_ruleEnumFieldOpt2703); 
             
                newLeafNode(this_EQUALS_2, grammarAccess.getEnumFieldOptAccess().getEQUALSTerminalRuleCall_2()); 
                
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1300:1: ( (lv_value_3_0= RULE_IDENTITY ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1301:1: (lv_value_3_0= RULE_IDENTITY )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1301:1: (lv_value_3_0= RULE_IDENTITY )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1302:3: lv_value_3_0= RULE_IDENTITY
            {
            lv_value_3_0=(Token)match(input,RULE_IDENTITY,FOLLOW_RULE_IDENTITY_in_ruleEnumFieldOpt2719); 

            			newLeafNode(lv_value_3_0, grammarAccess.getEnumFieldOptAccess().getValueIDENTITYTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumFieldOptRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"IDENTITY");
            	    

            }


            }

            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1318:2: (this_END_4= RULE_END )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_END) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1318:3: this_END_4= RULE_END
                    {
                    this_END_4=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleEnumFieldOpt2736); 
                     
                        newLeafNode(this_END_4, grammarAccess.getEnumFieldOptAccess().getENDTerminalRuleCall_4()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumFieldOpt"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1330:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1331:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1332:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2774);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName2785); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1339:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTITY_0= RULE_IDENTITY (this_DOT_1= RULE_DOT this_IDENTITY_2= RULE_IDENTITY )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTITY_0=null;
        Token this_DOT_1=null;
        Token this_IDENTITY_2=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1342:28: ( (this_IDENTITY_0= RULE_IDENTITY (this_DOT_1= RULE_DOT this_IDENTITY_2= RULE_IDENTITY )* ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1343:1: (this_IDENTITY_0= RULE_IDENTITY (this_DOT_1= RULE_DOT this_IDENTITY_2= RULE_IDENTITY )* )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1343:1: (this_IDENTITY_0= RULE_IDENTITY (this_DOT_1= RULE_DOT this_IDENTITY_2= RULE_IDENTITY )* )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1343:6: this_IDENTITY_0= RULE_IDENTITY (this_DOT_1= RULE_DOT this_IDENTITY_2= RULE_IDENTITY )*
            {
            this_IDENTITY_0=(Token)match(input,RULE_IDENTITY,FOLLOW_RULE_IDENTITY_in_ruleQualifiedName2825); 

            		current.merge(this_IDENTITY_0);
                
             
                newLeafNode(this_IDENTITY_0, grammarAccess.getQualifiedNameAccess().getIDENTITYTerminalRuleCall_0()); 
                
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1350:1: (this_DOT_1= RULE_DOT this_IDENTITY_2= RULE_IDENTITY )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_DOT) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1350:6: this_DOT_1= RULE_DOT this_IDENTITY_2= RULE_IDENTITY
            	    {
            	    this_DOT_1=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleQualifiedName2846); 

            	    		current.merge(this_DOT_1);
            	        
            	     
            	        newLeafNode(this_DOT_1, grammarAccess.getQualifiedNameAccess().getDOTTerminalRuleCall_1_0()); 
            	        
            	    this_IDENTITY_2=(Token)match(input,RULE_IDENTITY,FOLLOW_RULE_IDENTITY_in_ruleQualifiedName2866); 

            	    		current.merge(this_IDENTITY_2);
            	        
            	     
            	        newLeafNode(this_IDENTITY_2, grammarAccess.getQualifiedNameAccess().getIDENTITYTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleENTITY_NAME"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1372:1: entryRuleENTITY_NAME returns [String current=null] : iv_ruleENTITY_NAME= ruleENTITY_NAME EOF ;
    public final String entryRuleENTITY_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleENTITY_NAME = null;


        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1373:2: (iv_ruleENTITY_NAME= ruleENTITY_NAME EOF )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1374:2: iv_ruleENTITY_NAME= ruleENTITY_NAME EOF
            {
             newCompositeNode(grammarAccess.getENTITY_NAMERule()); 
            pushFollow(FOLLOW_ruleENTITY_NAME_in_entryRuleENTITY_NAME2914);
            iv_ruleENTITY_NAME=ruleENTITY_NAME();

            state._fsp--;

             current =iv_ruleENTITY_NAME.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleENTITY_NAME2925); 

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
    // $ANTLR end "entryRuleENTITY_NAME"


    // $ANTLR start "ruleENTITY_NAME"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1381:1: ruleENTITY_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FIELD_ATTR_0= RULE_FIELD_ATTR | this_FIELD_TYPE_1= RULE_FIELD_TYPE | this_IDENTITY_2= RULE_IDENTITY | this_PACKAGE_3= RULE_PACKAGE | this_IMPORT_4= RULE_IMPORT | this_OPTION_5= RULE_OPTION | this_MESSAGE_6= RULE_MESSAGE | this_ENUM_7= RULE_ENUM | this_MAP_KIND_8= RULE_MAP_KIND | this_DEFAULT_KIND_9= RULE_DEFAULT_KIND ) ;
    public final AntlrDatatypeRuleToken ruleENTITY_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FIELD_ATTR_0=null;
        Token this_FIELD_TYPE_1=null;
        Token this_IDENTITY_2=null;
        Token this_PACKAGE_3=null;
        Token this_IMPORT_4=null;
        Token this_OPTION_5=null;
        Token this_MESSAGE_6=null;
        Token this_ENUM_7=null;
        Token this_MAP_KIND_8=null;
        Token this_DEFAULT_KIND_9=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1384:28: ( (this_FIELD_ATTR_0= RULE_FIELD_ATTR | this_FIELD_TYPE_1= RULE_FIELD_TYPE | this_IDENTITY_2= RULE_IDENTITY | this_PACKAGE_3= RULE_PACKAGE | this_IMPORT_4= RULE_IMPORT | this_OPTION_5= RULE_OPTION | this_MESSAGE_6= RULE_MESSAGE | this_ENUM_7= RULE_ENUM | this_MAP_KIND_8= RULE_MAP_KIND | this_DEFAULT_KIND_9= RULE_DEFAULT_KIND ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1385:1: (this_FIELD_ATTR_0= RULE_FIELD_ATTR | this_FIELD_TYPE_1= RULE_FIELD_TYPE | this_IDENTITY_2= RULE_IDENTITY | this_PACKAGE_3= RULE_PACKAGE | this_IMPORT_4= RULE_IMPORT | this_OPTION_5= RULE_OPTION | this_MESSAGE_6= RULE_MESSAGE | this_ENUM_7= RULE_ENUM | this_MAP_KIND_8= RULE_MAP_KIND | this_DEFAULT_KIND_9= RULE_DEFAULT_KIND )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1385:1: (this_FIELD_ATTR_0= RULE_FIELD_ATTR | this_FIELD_TYPE_1= RULE_FIELD_TYPE | this_IDENTITY_2= RULE_IDENTITY | this_PACKAGE_3= RULE_PACKAGE | this_IMPORT_4= RULE_IMPORT | this_OPTION_5= RULE_OPTION | this_MESSAGE_6= RULE_MESSAGE | this_ENUM_7= RULE_ENUM | this_MAP_KIND_8= RULE_MAP_KIND | this_DEFAULT_KIND_9= RULE_DEFAULT_KIND )
            int alt25=10;
            switch ( input.LA(1) ) {
            case RULE_FIELD_ATTR:
                {
                alt25=1;
                }
                break;
            case RULE_FIELD_TYPE:
                {
                alt25=2;
                }
                break;
            case RULE_IDENTITY:
                {
                alt25=3;
                }
                break;
            case RULE_PACKAGE:
                {
                alt25=4;
                }
                break;
            case RULE_IMPORT:
                {
                alt25=5;
                }
                break;
            case RULE_OPTION:
                {
                alt25=6;
                }
                break;
            case RULE_MESSAGE:
                {
                alt25=7;
                }
                break;
            case RULE_ENUM:
                {
                alt25=8;
                }
                break;
            case RULE_MAP_KIND:
                {
                alt25=9;
                }
                break;
            case RULE_DEFAULT_KIND:
                {
                alt25=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1385:6: this_FIELD_ATTR_0= RULE_FIELD_ATTR
                    {
                    this_FIELD_ATTR_0=(Token)match(input,RULE_FIELD_ATTR,FOLLOW_RULE_FIELD_ATTR_in_ruleENTITY_NAME2965); 

                    		current.merge(this_FIELD_ATTR_0);
                        
                     
                        newLeafNode(this_FIELD_ATTR_0, grammarAccess.getENTITY_NAMEAccess().getFIELD_ATTRTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1393:10: this_FIELD_TYPE_1= RULE_FIELD_TYPE
                    {
                    this_FIELD_TYPE_1=(Token)match(input,RULE_FIELD_TYPE,FOLLOW_RULE_FIELD_TYPE_in_ruleENTITY_NAME2991); 

                    		current.merge(this_FIELD_TYPE_1);
                        
                     
                        newLeafNode(this_FIELD_TYPE_1, grammarAccess.getENTITY_NAMEAccess().getFIELD_TYPETerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1401:10: this_IDENTITY_2= RULE_IDENTITY
                    {
                    this_IDENTITY_2=(Token)match(input,RULE_IDENTITY,FOLLOW_RULE_IDENTITY_in_ruleENTITY_NAME3017); 

                    		current.merge(this_IDENTITY_2);
                        
                     
                        newLeafNode(this_IDENTITY_2, grammarAccess.getENTITY_NAMEAccess().getIDENTITYTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1409:10: this_PACKAGE_3= RULE_PACKAGE
                    {
                    this_PACKAGE_3=(Token)match(input,RULE_PACKAGE,FOLLOW_RULE_PACKAGE_in_ruleENTITY_NAME3043); 

                    		current.merge(this_PACKAGE_3);
                        
                     
                        newLeafNode(this_PACKAGE_3, grammarAccess.getENTITY_NAMEAccess().getPACKAGETerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1417:10: this_IMPORT_4= RULE_IMPORT
                    {
                    this_IMPORT_4=(Token)match(input,RULE_IMPORT,FOLLOW_RULE_IMPORT_in_ruleENTITY_NAME3069); 

                    		current.merge(this_IMPORT_4);
                        
                     
                        newLeafNode(this_IMPORT_4, grammarAccess.getENTITY_NAMEAccess().getIMPORTTerminalRuleCall_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1425:10: this_OPTION_5= RULE_OPTION
                    {
                    this_OPTION_5=(Token)match(input,RULE_OPTION,FOLLOW_RULE_OPTION_in_ruleENTITY_NAME3095); 

                    		current.merge(this_OPTION_5);
                        
                     
                        newLeafNode(this_OPTION_5, grammarAccess.getENTITY_NAMEAccess().getOPTIONTerminalRuleCall_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1433:10: this_MESSAGE_6= RULE_MESSAGE
                    {
                    this_MESSAGE_6=(Token)match(input,RULE_MESSAGE,FOLLOW_RULE_MESSAGE_in_ruleENTITY_NAME3121); 

                    		current.merge(this_MESSAGE_6);
                        
                     
                        newLeafNode(this_MESSAGE_6, grammarAccess.getENTITY_NAMEAccess().getMESSAGETerminalRuleCall_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1441:10: this_ENUM_7= RULE_ENUM
                    {
                    this_ENUM_7=(Token)match(input,RULE_ENUM,FOLLOW_RULE_ENUM_in_ruleENTITY_NAME3147); 

                    		current.merge(this_ENUM_7);
                        
                     
                        newLeafNode(this_ENUM_7, grammarAccess.getENTITY_NAMEAccess().getENUMTerminalRuleCall_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1449:10: this_MAP_KIND_8= RULE_MAP_KIND
                    {
                    this_MAP_KIND_8=(Token)match(input,RULE_MAP_KIND,FOLLOW_RULE_MAP_KIND_in_ruleENTITY_NAME3173); 

                    		current.merge(this_MAP_KIND_8);
                        
                     
                        newLeafNode(this_MAP_KIND_8, grammarAccess.getENTITY_NAMEAccess().getMAP_KINDTerminalRuleCall_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1457:10: this_DEFAULT_KIND_9= RULE_DEFAULT_KIND
                    {
                    this_DEFAULT_KIND_9=(Token)match(input,RULE_DEFAULT_KIND,FOLLOW_RULE_DEFAULT_KIND_in_ruleENTITY_NAME3199); 

                    		current.merge(this_DEFAULT_KIND_9);
                        
                     
                        newLeafNode(this_DEFAULT_KIND_9, grammarAccess.getENTITY_NAMEAccess().getDEFAULT_KINDTerminalRuleCall_9()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleENTITY_NAME"


    // $ANTLR start "entryRuleComment_ALL"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1472:1: entryRuleComment_ALL returns [EObject current=null] : iv_ruleComment_ALL= ruleComment_ALL EOF ;
    public final EObject entryRuleComment_ALL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment_ALL = null;


        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1473:2: (iv_ruleComment_ALL= ruleComment_ALL EOF )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1474:2: iv_ruleComment_ALL= ruleComment_ALL EOF
            {
             newCompositeNode(grammarAccess.getComment_ALLRule()); 
            pushFollow(FOLLOW_ruleComment_ALL_in_entryRuleComment_ALL3244);
            iv_ruleComment_ALL=ruleComment_ALL();

            state._fsp--;

             current =iv_ruleComment_ALL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment_ALL3254); 

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
    // $ANTLR end "entryRuleComment_ALL"


    // $ANTLR start "ruleComment_ALL"
    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1481:1: ruleComment_ALL returns [EObject current=null] : ( ( (lv_text_0_0= RULE_COMMENT_SL ) ) | ( (lv_text_1_0= RULE_COMMENT_ML ) ) ) ;
    public final EObject ruleComment_ALL() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;
        Token lv_text_1_0=null;

         enterRule(); 
            
        try {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1484:28: ( ( ( (lv_text_0_0= RULE_COMMENT_SL ) ) | ( (lv_text_1_0= RULE_COMMENT_ML ) ) ) )
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1485:1: ( ( (lv_text_0_0= RULE_COMMENT_SL ) ) | ( (lv_text_1_0= RULE_COMMENT_ML ) ) )
            {
            // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1485:1: ( ( (lv_text_0_0= RULE_COMMENT_SL ) ) | ( (lv_text_1_0= RULE_COMMENT_ML ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_COMMENT_SL) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_COMMENT_ML) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1485:2: ( (lv_text_0_0= RULE_COMMENT_SL ) )
                    {
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1485:2: ( (lv_text_0_0= RULE_COMMENT_SL ) )
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1486:1: (lv_text_0_0= RULE_COMMENT_SL )
                    {
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1486:1: (lv_text_0_0= RULE_COMMENT_SL )
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1487:3: lv_text_0_0= RULE_COMMENT_SL
                    {
                    lv_text_0_0=(Token)match(input,RULE_COMMENT_SL,FOLLOW_RULE_COMMENT_SL_in_ruleComment_ALL3296); 

                    			newLeafNode(lv_text_0_0, grammarAccess.getComment_ALLAccess().getTextCOMMENT_SLTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getComment_ALLRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_0_0, 
                            		"COMMENT_SL");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1504:6: ( (lv_text_1_0= RULE_COMMENT_ML ) )
                    {
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1504:6: ( (lv_text_1_0= RULE_COMMENT_ML ) )
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1505:1: (lv_text_1_0= RULE_COMMENT_ML )
                    {
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1505:1: (lv_text_1_0= RULE_COMMENT_ML )
                    // ../org.chw.game.ide/src-gen/org/chw/game/ide/parser/antlr/internal/InternalProto.g:1506:3: lv_text_1_0= RULE_COMMENT_ML
                    {
                    lv_text_1_0=(Token)match(input,RULE_COMMENT_ML,FOLLOW_RULE_COMMENT_ML_in_ruleComment_ALL3324); 

                    			newLeafNode(lv_text_1_0, grammarAccess.getComment_ALLAccess().getTextCOMMENT_MLTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getComment_ALLRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_1_0, 
                            		"COMMENT_ML");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComment_ALL"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PACKAGE_in_ruleModel122 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModel142 = new BitSet(new long[]{0x0000000007040572L});
    public static final BitSet FOLLOW_RULE_END_in_ruleModel154 = new BitSet(new long[]{0x0000000007040572L});
    public static final BitSet FOLLOW_ruleImportInfo_in_ruleModel183 = new BitSet(new long[]{0x0000000007040572L});
    public static final BitSet FOLLOW_ruleOptionInfo_in_ruleModel210 = new BitSet(new long[]{0x0000000007040572L});
    public static final BitSet FOLLOW_ruleElement_in_ruleModel237 = new BitSet(new long[]{0x0000000007040572L});
    public static final BitSet FOLLOW_ruleComment_ALL_in_ruleModel264 = new BitSet(new long[]{0x0000000007040572L});
    public static final BitSet FOLLOW_ruleImportInfo_in_entryRuleImportInfo301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportInfo311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IMPORT_in_ruleImportInfo347 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_SL_STRING_in_ruleImportInfo363 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_END_in_ruleImportInfo380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionInfo_in_entryRuleOptionInfo417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionInfo427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPTION_in_ruleOptionInfo463 = new BitSet(new long[]{0x00000000014D4550L});
    public static final BitSet FOLLOW_ruleENTITY_NAME_in_ruleOptionInfo483 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleOptionInfo494 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_SL_STRING_in_ruleOptionInfo510 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_END_in_ruleOptionInfo527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleElement621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMap_in_ruleElement648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageType_in_ruleType740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_ruleType767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMap_in_entryRuleMap802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMap812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MAP_KIND_in_ruleMap848 = new BitSet(new long[]{0x00000000014D4550L});
    public static final BitSet FOLLOW_ruleENTITY_NAME_in_ruleMap868 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_FILETER_A_in_ruleMap879 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMap901 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_BRACE_L_in_ruleMap912 = new BitSet(new long[]{0x0000000007046570L});
    public static final BitSet FOLLOW_ruleComment_ALL_in_ruleMap933 = new BitSet(new long[]{0x0000000007046570L});
    public static final BitSet FOLLOW_ruleMapField_in_ruleMap960 = new BitSet(new long[]{0x0000000007046570L});
    public static final BitSet FOLLOW_RULE_BRACE_R_in_ruleMap973 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_END_in_ruleMap984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapField_in_entryRuleMapField1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapField1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FIELD_ATTR_in_ruleMapField1073 = new BitSet(new long[]{0x00000000014D4550L});
    public static final BitSet FOLLOW_ruleENTITY_NAME_in_ruleMapField1099 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_RULE_FILETER_B_in_ruleMapField1111 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMapField1133 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_FILETER_A_in_ruleMapField1146 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleMapRef_in_ruleMapField1166 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_END_in_ruleMapField1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapRef_in_entryRuleMapRef1215 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapRef1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTITY_in_ruleMapRef1270 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleMapRef1282 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleMapRef_in_ruleMapRef1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageType_in_entryRuleMessageType1340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageType1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MESSAGE_in_ruleMessageType1386 = new BitSet(new long[]{0x00000000014D4550L});
    public static final BitSet FOLLOW_ruleENTITY_NAME_in_ruleMessageType1406 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_BRACE_L_in_ruleMessageType1417 = new BitSet(new long[]{0x0000000007046570L});
    public static final BitSet FOLLOW_ruleComment_ALL_in_ruleMessageType1438 = new BitSet(new long[]{0x0000000007046570L});
    public static final BitSet FOLLOW_ruleMessageField_in_ruleMessageType1465 = new BitSet(new long[]{0x0000000007046570L});
    public static final BitSet FOLLOW_ruleType_in_ruleMessageType1492 = new BitSet(new long[]{0x0000000007046570L});
    public static final BitSet FOLLOW_RULE_BRACE_R_in_ruleMessageType1505 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_END_in_ruleMessageType1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageField_in_entryRuleMessageField1553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageField1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageSimpleField_in_ruleMessageField1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageComplexField_in_ruleMessageField1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageSimpleField_in_entryRuleMessageSimpleField1672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageSimpleField1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FIELD_ATTR_in_ruleMessageSimpleField1724 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_FIELD_TYPE_in_ruleMessageSimpleField1746 = new BitSet(new long[]{0x00000000014D4550L});
    public static final BitSet FOLLOW_ruleENTITY_NAME_in_ruleMessageSimpleField1772 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMessageSimpleField1783 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMessageSimpleField1799 = new BitSet(new long[]{0x0000000000200022L});
    public static final BitSet FOLLOW_ruleMessageFieldDefault_in_ruleMessageSimpleField1821 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_END_in_ruleMessageSimpleField1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageComplexField_in_entryRuleMessageComplexField1871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageComplexField1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FIELD_ATTR_in_ruleMessageComplexField1923 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMessageComplexField1951 = new BitSet(new long[]{0x00000000014D4550L});
    public static final BitSet FOLLOW_ruleENTITY_NAME_in_ruleMessageComplexField1972 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMessageComplexField1983 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMessageComplexField1999 = new BitSet(new long[]{0x0000000000200022L});
    public static final BitSet FOLLOW_ruleMessageFieldDefault_in_ruleMessageComplexField2021 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_END_in_ruleMessageComplexField2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessageFieldDefault_in_entryRuleMessageFieldDefault2072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessageFieldDefault2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACKET_L_in_ruleMessageFieldDefault2123 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_DEFAULT_KIND_in_ruleMessageFieldDefault2143 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleMessageFieldDefault2163 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMessageFieldDefault2184 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RULE_IDENTITY_in_ruleMessageFieldDefault2210 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RULE_BRACKET_R_in_ruleMessageFieldDefault2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumType_in_entryRuleEnumType2276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumType2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENUM_in_ruleEnumType2322 = new BitSet(new long[]{0x00000000014D4550L});
    public static final BitSet FOLLOW_ruleENTITY_NAME_in_ruleEnumType2342 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_BRACE_L_in_ruleEnumType2353 = new BitSet(new long[]{0x00000000074D6570L});
    public static final BitSet FOLLOW_ruleComment_ALL_in_ruleEnumType2374 = new BitSet(new long[]{0x00000000074D6570L});
    public static final BitSet FOLLOW_ruleEnumField_in_ruleEnumType2401 = new BitSet(new long[]{0x00000000074D6570L});
    public static final BitSet FOLLOW_ruleEnumFieldOpt_in_ruleEnumType2428 = new BitSet(new long[]{0x00000000074D6570L});
    public static final BitSet FOLLOW_RULE_BRACE_R_in_ruleEnumType2441 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_END_in_ruleEnumType2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumField_in_entryRuleEnumField2489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumField2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleENTITY_NAME_in_ruleEnumField2545 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleEnumField2556 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleEnumField2572 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_END_in_ruleEnumField2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumFieldOpt_in_entryRuleEnumFieldOpt2626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumFieldOpt2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPTION_in_ruleEnumFieldOpt2672 = new BitSet(new long[]{0x00000000014D4550L});
    public static final BitSet FOLLOW_ruleENTITY_NAME_in_ruleEnumFieldOpt2692 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_EQUALS_in_ruleEnumFieldOpt2703 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_IDENTITY_in_ruleEnumFieldOpt2719 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_END_in_ruleEnumFieldOpt2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTITY_in_ruleQualifiedName2825 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleQualifiedName2846 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_IDENTITY_in_ruleQualifiedName2866 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleENTITY_NAME_in_entryRuleENTITY_NAME2914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleENTITY_NAME2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FIELD_ATTR_in_ruleENTITY_NAME2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FIELD_TYPE_in_ruleENTITY_NAME2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTITY_in_ruleENTITY_NAME3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PACKAGE_in_ruleENTITY_NAME3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IMPORT_in_ruleENTITY_NAME3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPTION_in_ruleENTITY_NAME3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MESSAGE_in_ruleENTITY_NAME3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENUM_in_ruleENTITY_NAME3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MAP_KIND_in_ruleENTITY_NAME3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEFAULT_KIND_in_ruleENTITY_NAME3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_ALL_in_entryRuleComment_ALL3244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment_ALL3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_SL_in_ruleComment_ALL3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_ML_in_ruleComment_ALL3324 = new BitSet(new long[]{0x0000000000000002L});

}