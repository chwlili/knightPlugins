package org.chw.game.ide.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProtoLexer extends Lexer {
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
    public static final int RULE_BRACE_L=18;
    public static final int RULE_IMPORT=9;
    public static final int RULE_FILETER_A=17;
    public static final int RULE_MESSAGE=11;
    public static final int RULE_FILETER_B=20;
    public static final int RULE_COMMENT_ML=26;
    public static final int RULE_EQUALS=16;
    public static final int RULE_FIELD_ATTR=6;
    public static final int RULE_WS=27;
    public static final int RULE_ENUM=12;

    // delegates
    // delegators

    public InternalProtoLexer() {;} 
    public InternalProtoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalProtoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g"; }

    // $ANTLR start "RULE_BRACE_L"
    public final void mRULE_BRACE_L() throws RecognitionException {
        try {
            int _type = RULE_BRACE_L;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3818:14: ( '{' )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3818:16: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BRACE_L"

    // $ANTLR start "RULE_BRACE_R"
    public final void mRULE_BRACE_R() throws RecognitionException {
        try {
            int _type = RULE_BRACE_R;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3820:14: ( '}' )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3820:16: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BRACE_R"

    // $ANTLR start "RULE_BRACKET_L"
    public final void mRULE_BRACKET_L() throws RecognitionException {
        try {
            int _type = RULE_BRACKET_L;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3822:16: ( '[' )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3822:18: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BRACKET_L"

    // $ANTLR start "RULE_BRACKET_R"
    public final void mRULE_BRACKET_R() throws RecognitionException {
        try {
            int _type = RULE_BRACKET_R;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3824:16: ( ']' )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3824:18: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BRACKET_R"

    // $ANTLR start "RULE_EQUALS"
    public final void mRULE_EQUALS() throws RecognitionException {
        try {
            int _type = RULE_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3826:13: ( '=' )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3826:15: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUALS"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            int _type = RULE_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3828:10: ( ';' )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3828:12: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3830:10: ( '.' )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3830:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_FILETER_A"
    public final void mRULE_FILETER_A() throws RecognitionException {
        try {
            int _type = RULE_FILETER_A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3832:16: ( '<=' )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3832:18: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FILETER_A"

    // $ANTLR start "RULE_FILETER_B"
    public final void mRULE_FILETER_B() throws RecognitionException {
        try {
            int _type = RULE_FILETER_B;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3834:16: ( '<-' )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3834:18: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FILETER_B"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3836:13: ( ( '-' )? ( '0' .. '9' | '1' .. '9' ( '0' .. '9' )+ ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3836:15: ( '-' )? ( '0' .. '9' | '1' .. '9' ( '0' .. '9' )+ )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3836:15: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3836:15: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3836:20: ( '0' .. '9' | '1' .. '9' ( '0' .. '9' )+ )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='1' && LA3_0<='9')) ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>='0' && LA3_1<='9')) ) {
                    alt3=2;
                }
                else {
                    alt3=1;}
            }
            else if ( (LA3_0=='0') ) {
                alt3=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3836:21: '0' .. '9'
                    {
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3836:30: '1' .. '9' ( '0' .. '9' )+
                    {
                    matchRange('1','9'); 
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3836:39: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3836:40: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_PACKAGE"
    public final void mRULE_PACKAGE() throws RecognitionException {
        try {
            int _type = RULE_PACKAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3838:14: ( 'package' )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3838:16: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PACKAGE"

    // $ANTLR start "RULE_IMPORT"
    public final void mRULE_IMPORT() throws RecognitionException {
        try {
            int _type = RULE_IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3840:13: ( 'import' )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3840:15: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IMPORT"

    // $ANTLR start "RULE_OPTION"
    public final void mRULE_OPTION() throws RecognitionException {
        try {
            int _type = RULE_OPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3842:13: ( 'option' )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3842:15: 'option'
            {
            match("option"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPTION"

    // $ANTLR start "RULE_MESSAGE"
    public final void mRULE_MESSAGE() throws RecognitionException {
        try {
            int _type = RULE_MESSAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3844:14: ( 'message' )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3844:16: 'message'
            {
            match("message"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MESSAGE"

    // $ANTLR start "RULE_ENUM"
    public final void mRULE_ENUM() throws RecognitionException {
        try {
            int _type = RULE_ENUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3846:11: ( 'enum' )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3846:13: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENUM"

    // $ANTLR start "RULE_MAP_KIND"
    public final void mRULE_MAP_KIND() throws RecognitionException {
        try {
            int _type = RULE_MAP_KIND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3848:15: ( 'map' )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3848:17: 'map'
            {
            match("map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAP_KIND"

    // $ANTLR start "RULE_DEFAULT_KIND"
    public final void mRULE_DEFAULT_KIND() throws RecognitionException {
        try {
            int _type = RULE_DEFAULT_KIND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3850:19: ( 'default' )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3850:21: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEFAULT_KIND"

    // $ANTLR start "RULE_FIELD_ATTR"
    public final void mRULE_FIELD_ATTR() throws RecognitionException {
        try {
            int _type = RULE_FIELD_ATTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3852:17: ( ( 'optional' | 'repeated' | 'required' ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3852:19: ( 'optional' | 'repeated' | 'required' )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3852:19: ( 'optional' | 'repeated' | 'required' )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='o') ) {
                alt4=1;
            }
            else if ( (LA4_0=='r') ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2=='e') ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3=='p') ) {
                        alt4=2;
                    }
                    else if ( (LA4_3=='q') ) {
                        alt4=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3852:20: 'optional'
                    {
                    match("optional"); 


                    }
                    break;
                case 2 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3852:31: 'repeated'
                    {
                    match("repeated"); 


                    }
                    break;
                case 3 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3852:42: 'required'
                    {
                    match("required"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FIELD_ATTR"

    // $ANTLR start "RULE_FIELD_TYPE"
    public final void mRULE_FIELD_TYPE() throws RecognitionException {
        try {
            int _type = RULE_FIELD_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3854:17: ( ( 'int32' | 'sint32' | 'uint32' | 'int64' | 'sint64' | 'uint64' | 'float' | 'double' | 'string' | 'bool' | 'bytes' | 'fixed32' | 'fixed64' | 'sfixed32' | 'sfixed64' ) )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3854:19: ( 'int32' | 'sint32' | 'uint32' | 'int64' | 'sint64' | 'uint64' | 'float' | 'double' | 'string' | 'bool' | 'bytes' | 'fixed32' | 'fixed64' | 'sfixed32' | 'sfixed64' )
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3854:19: ( 'int32' | 'sint32' | 'uint32' | 'int64' | 'sint64' | 'uint64' | 'float' | 'double' | 'string' | 'bool' | 'bytes' | 'fixed32' | 'fixed64' | 'sfixed32' | 'sfixed64' )
            int alt5=15;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3854:20: 'int32'
                    {
                    match("int32"); 


                    }
                    break;
                case 2 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3854:28: 'sint32'
                    {
                    match("sint32"); 


                    }
                    break;
                case 3 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3854:37: 'uint32'
                    {
                    match("uint32"); 


                    }
                    break;
                case 4 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3854:46: 'int64'
                    {
                    match("int64"); 


                    }
                    break;
                case 5 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3854:54: 'sint64'
                    {
                    match("sint64"); 


                    }
                    break;
                case 6 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3854:63: 'uint64'
                    {
                    match("uint64"); 


                    }
                    break;
                case 7 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3854:72: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 8 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3854:80: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 9 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3854:89: 'string'
                    {
                    match("string"); 


                    }
                    break;
                case 10 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3854:98: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 11 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3854:105: 'bytes'
                    {
                    match("bytes"); 


                    }
                    break;
                case 12 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3854:113: 'fixed32'
                    {
                    match("fixed32"); 


                    }
                    break;
                case 13 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3854:123: 'fixed64'
                    {
                    match("fixed64"); 


                    }
                    break;
                case 14 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3854:133: 'sfixed32'
                    {
                    match("sfixed32"); 


                    }
                    break;
                case 15 :
                    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3854:144: 'sfixed64'
                    {
                    match("sfixed64"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FIELD_TYPE"

    // $ANTLR start "RULE_IDENTITY"
    public final void mRULE_IDENTITY() throws RecognitionException {
        try {
            int _type = RULE_IDENTITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3856:15: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3856:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3856:41: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENTITY"

    // $ANTLR start "RULE_COMMENT_ML"
    public final void mRULE_COMMENT_ML() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_ML;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3858:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3858:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3858:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3858:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT_ML"

    // $ANTLR start "RULE_COMMENT_SL"
    public final void mRULE_COMMENT_SL() throws RecognitionException {
        try {
            int _type = RULE_COMMENT_SL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3860:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3860:19: '//' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match("//"); 

            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3860:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3860:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT_SL"

    // $ANTLR start "RULE_SL_STRING"
    public final void mRULE_SL_STRING() throws RecognitionException {
        try {
            int _type = RULE_SL_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3862:16: ( '\"' (~ ( ( '\\n' | '\\r' | '\"' ) ) )* '\"' )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3862:18: '\"' (~ ( ( '\\n' | '\\r' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3862:22: (~ ( ( '\\n' | '\\r' | '\"' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3862:22: ~ ( ( '\\n' | '\\r' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_STRING"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3864:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3864:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3864:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3866:16: ( . )
            // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:3866:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:8: ( RULE_BRACE_L | RULE_BRACE_R | RULE_BRACKET_L | RULE_BRACKET_R | RULE_EQUALS | RULE_END | RULE_DOT | RULE_FILETER_A | RULE_FILETER_B | RULE_NUMBER | RULE_PACKAGE | RULE_IMPORT | RULE_OPTION | RULE_MESSAGE | RULE_ENUM | RULE_MAP_KIND | RULE_DEFAULT_KIND | RULE_FIELD_ATTR | RULE_FIELD_TYPE | RULE_IDENTITY | RULE_COMMENT_ML | RULE_COMMENT_SL | RULE_SL_STRING | RULE_WS | RULE_ANY_OTHER )
        int alt11=25;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:10: RULE_BRACE_L
                {
                mRULE_BRACE_L(); 

                }
                break;
            case 2 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:23: RULE_BRACE_R
                {
                mRULE_BRACE_R(); 

                }
                break;
            case 3 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:36: RULE_BRACKET_L
                {
                mRULE_BRACKET_L(); 

                }
                break;
            case 4 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:51: RULE_BRACKET_R
                {
                mRULE_BRACKET_R(); 

                }
                break;
            case 5 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:66: RULE_EQUALS
                {
                mRULE_EQUALS(); 

                }
                break;
            case 6 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:78: RULE_END
                {
                mRULE_END(); 

                }
                break;
            case 7 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:87: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 8 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:96: RULE_FILETER_A
                {
                mRULE_FILETER_A(); 

                }
                break;
            case 9 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:111: RULE_FILETER_B
                {
                mRULE_FILETER_B(); 

                }
                break;
            case 10 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:126: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 11 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:138: RULE_PACKAGE
                {
                mRULE_PACKAGE(); 

                }
                break;
            case 12 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:151: RULE_IMPORT
                {
                mRULE_IMPORT(); 

                }
                break;
            case 13 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:163: RULE_OPTION
                {
                mRULE_OPTION(); 

                }
                break;
            case 14 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:175: RULE_MESSAGE
                {
                mRULE_MESSAGE(); 

                }
                break;
            case 15 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:188: RULE_ENUM
                {
                mRULE_ENUM(); 

                }
                break;
            case 16 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:198: RULE_MAP_KIND
                {
                mRULE_MAP_KIND(); 

                }
                break;
            case 17 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:212: RULE_DEFAULT_KIND
                {
                mRULE_DEFAULT_KIND(); 

                }
                break;
            case 18 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:230: RULE_FIELD_ATTR
                {
                mRULE_FIELD_ATTR(); 

                }
                break;
            case 19 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:246: RULE_FIELD_TYPE
                {
                mRULE_FIELD_TYPE(); 

                }
                break;
            case 20 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:262: RULE_IDENTITY
                {
                mRULE_IDENTITY(); 

                }
                break;
            case 21 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:276: RULE_COMMENT_ML
                {
                mRULE_COMMENT_ML(); 

                }
                break;
            case 22 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:292: RULE_COMMENT_SL
                {
                mRULE_COMMENT_SL(); 

                }
                break;
            case 23 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:308: RULE_SL_STRING
                {
                mRULE_SL_STRING(); 

                }
                break;
            case 24 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:323: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // ../org.chw.game.ide.ui/src-gen/org/chw/game/ide/ui/contentassist/antlr/internal/InternalProto.g:1:331: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA5_eotS =
        "\46\uffff";
    static final String DFA5_eofS =
        "\46\uffff";
    static final String DFA5_minS =
        "\1\142\1\156\1\146\2\151\1\uffff\1\157\1\164\1\156\1\uffff\1\151"+
        "\1\156\1\uffff\1\170\2\uffff\1\63\1\164\1\170\1\164\1\145\2\uffff"+
        "\1\63\1\145\1\63\1\144\2\uffff\1\144\2\uffff\2\63\4\uffff";
    static final String DFA5_maxS =
        "\1\165\1\156\1\164\1\151\1\154\1\uffff\1\171\1\164\1\156\1\uffff"+
        "\1\151\1\156\1\uffff\1\170\2\uffff\1\66\1\164\1\170\1\164\1\145"+
        "\2\uffff\1\66\1\145\1\66\1\144\2\uffff\1\144\2\uffff\2\66\4\uffff";
    static final String DFA5_acceptS =
        "\5\uffff\1\10\3\uffff\1\11\2\uffff\1\7\1\uffff\1\12\1\13\5\uffff"+
        "\1\1\1\4\4\uffff\1\2\1\5\1\uffff\1\3\1\6\2\uffff\1\14\1\15\1\16"+
        "\1\17";
    static final String DFA5_specialS =
        "\46\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\6\1\uffff\1\5\1\uffff\1\4\2\uffff\1\1\11\uffff\1\2\1\uffff"+
            "\1\3",
            "\1\7",
            "\1\12\2\uffff\1\10\12\uffff\1\11",
            "\1\13",
            "\1\15\2\uffff\1\14",
            "",
            "\1\16\11\uffff\1\17",
            "\1\20",
            "\1\21",
            "",
            "\1\22",
            "\1\23",
            "",
            "\1\24",
            "",
            "",
            "\1\25\2\uffff\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "",
            "",
            "\1\33\2\uffff\1\34",
            "\1\35",
            "\1\36\2\uffff\1\37",
            "\1\40",
            "",
            "",
            "\1\41",
            "",
            "",
            "\1\42\2\uffff\1\43",
            "\1\44\2\uffff\1\45",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "3854:19: ( 'int32' | 'sint32' | 'uint32' | 'int64' | 'sint64' | 'uint64' | 'float' | 'double' | 'string' | 'bool' | 'bytes' | 'fixed32' | 'fixed64' | 'sfixed32' | 'sfixed64' )";
        }
    }
    static final String DFA11_eotS =
        "\10\uffff\2\33\2\uffff\13\47\1\uffff\2\33\14\uffff\1\47\1\uffff"+
        "\21\47\4\uffff\5\47\1\126\23\47\1\uffff\1\152\12\47\1\167\3\47\2"+
        "\167\2\47\1\uffff\12\47\1\167\1\47\1\uffff\1\167\1\47\1\u008a\1"+
        "\u008c\2\47\1\167\2\47\3\167\1\47\2\167\2\47\1\u0095\1\uffff\1\47"+
        "\1\uffff\1\u0097\1\u0098\4\47\2\167\1\uffff\1\u009d\2\uffff\2\u009d"+
        "\2\167\1\uffff";
    static final String DFA11_eofS =
        "\u009e\uffff";
    static final String DFA11_minS =
        "\1\0\7\uffff\1\55\1\60\2\uffff\1\141\1\155\1\160\1\141\1\156\2"+
        "\145\1\146\2\151\1\157\1\uffff\1\52\1\0\14\uffff\1\143\1\uffff\1"+
        "\160\2\164\1\163\1\160\1\165\1\146\1\165\1\160\1\156\1\162\1\151"+
        "\1\156\1\157\1\170\1\157\1\164\4\uffff\1\153\1\157\1\63\1\151\1"+
        "\163\1\60\1\155\1\141\1\142\1\145\1\165\1\164\1\151\1\170\1\164"+
        "\1\141\1\145\1\154\1\145\1\141\1\162\1\62\1\64\1\157\1\141\1\uffff"+
        "\1\60\1\165\1\154\1\141\1\151\1\63\1\156\1\145\1\63\1\164\1\144"+
        "\1\60\1\163\1\147\1\164\2\60\1\156\1\147\1\uffff\1\154\1\145\1\164"+
        "\1\162\1\62\1\64\1\147\1\144\1\62\1\64\1\60\1\63\1\uffff\1\60\1"+
        "\145\2\60\1\145\1\164\1\60\2\145\3\60\1\63\2\60\1\62\1\64\1\60\1"+
        "\uffff\1\154\1\uffff\2\60\2\144\1\62\1\64\2\60\1\uffff\1\60\2\uffff"+
        "\4\60\1\uffff";
    static final String DFA11_maxS =
        "\1\uffff\7\uffff\1\75\1\71\2\uffff\1\141\1\156\1\160\1\145\1\156"+
        "\1\157\1\145\1\164\1\151\1\154\1\171\1\uffff\1\57\1\uffff\14\uffff"+
        "\1\143\1\uffff\1\160\2\164\1\163\1\160\1\165\1\146\1\165\1\161\1"+
        "\156\1\162\1\151\1\156\1\157\1\170\1\157\1\164\4\uffff\1\153\1\157"+
        "\1\66\1\151\1\163\1\172\1\155\1\141\1\142\1\145\1\165\1\164\1\151"+
        "\1\170\1\164\1\141\1\145\1\154\1\145\1\141\1\162\1\62\1\64\1\157"+
        "\1\141\1\uffff\1\172\1\165\1\154\1\141\1\151\1\66\1\156\1\145\1"+
        "\66\1\164\1\144\1\172\1\163\1\147\1\164\2\172\1\156\1\147\1\uffff"+
        "\1\154\1\145\1\164\1\162\1\62\1\64\1\147\1\144\1\62\1\64\1\172\1"+
        "\66\1\uffff\1\172\1\145\2\172\1\145\1\164\1\172\2\145\3\172\1\66"+
        "\2\172\1\62\1\64\1\172\1\uffff\1\154\1\uffff\2\172\2\144\1\62\1"+
        "\64\2\172\1\uffff\1\172\2\uffff\4\172\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff\2\12\13\uffff\1\24"+
        "\2\uffff\1\30\1\31\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1"+
        "\uffff\1\24\21\uffff\1\25\1\26\1\27\1\30\31\uffff\1\20\23\uffff"+
        "\1\17\14\uffff\1\23\22\uffff\1\14\1\uffff\1\15\10\uffff\1\13\1\uffff"+
        "\1\16\1\21\4\uffff\1\22";
    static final String DFA11_specialS =
        "\1\0\30\uffff\1\1\u0084\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\33\2\32\2\33\1\32\22\33\1\32\1\33\1\31\12\33\1\11\1\7\1"+
            "\30\1\13\11\12\1\33\1\6\1\10\1\5\3\33\32\27\1\3\1\33\1\4\1\33"+
            "\1\27\1\33\1\27\1\26\1\27\1\21\1\20\1\25\2\27\1\15\3\27\1\17"+
            "\1\27\1\16\1\14\1\27\1\22\1\23\1\27\1\24\5\27\1\1\1\33\1\2\uff82"+
            "\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44\17\uffff\1\43",
            "\12\45",
            "",
            "",
            "\1\46",
            "\1\50\1\51",
            "\1\52",
            "\1\54\3\uffff\1\53",
            "\1\55",
            "\1\56\11\uffff\1\57",
            "\1\60",
            "\1\63\2\uffff\1\61\12\uffff\1\62",
            "\1\64",
            "\1\66\2\uffff\1\65",
            "\1\67\11\uffff\1\70",
            "",
            "\1\71\4\uffff\1\72",
            "\12\73\1\uffff\2\73\1\uffff\ufff2\73",
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
            "\1\75",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "",
            "",
            "",
            "\1\120",
            "\1\121",
            "\1\122\2\uffff\1\123",
            "\1\124",
            "\1\125",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157\2\uffff\1\160",
            "\1\161",
            "\1\162",
            "\1\163\2\uffff\1\164",
            "\1\165",
            "\1\166",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\170",
            "\1\171",
            "\1\172",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\173",
            "\1\174",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0087\2\uffff\1\u0088",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0089",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u008b\31\47",
            "\1\u008d",
            "\1\u008e",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u008f",
            "\1\u0090",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0091\2\uffff\1\u0092",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0093",
            "\1\u0094",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0096",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            ""
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
            return "1:1: Tokens : ( RULE_BRACE_L | RULE_BRACE_R | RULE_BRACKET_L | RULE_BRACKET_R | RULE_EQUALS | RULE_END | RULE_DOT | RULE_FILETER_A | RULE_FILETER_B | RULE_NUMBER | RULE_PACKAGE | RULE_IMPORT | RULE_OPTION | RULE_MESSAGE | RULE_ENUM | RULE_MAP_KIND | RULE_DEFAULT_KIND | RULE_FIELD_ATTR | RULE_FIELD_TYPE | RULE_IDENTITY | RULE_COMMENT_ML | RULE_COMMENT_SL | RULE_SL_STRING | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='{') ) {s = 1;}

                        else if ( (LA11_0=='}') ) {s = 2;}

                        else if ( (LA11_0=='[') ) {s = 3;}

                        else if ( (LA11_0==']') ) {s = 4;}

                        else if ( (LA11_0=='=') ) {s = 5;}

                        else if ( (LA11_0==';') ) {s = 6;}

                        else if ( (LA11_0=='.') ) {s = 7;}

                        else if ( (LA11_0=='<') ) {s = 8;}

                        else if ( (LA11_0=='-') ) {s = 9;}

                        else if ( ((LA11_0>='1' && LA11_0<='9')) ) {s = 10;}

                        else if ( (LA11_0=='0') ) {s = 11;}

                        else if ( (LA11_0=='p') ) {s = 12;}

                        else if ( (LA11_0=='i') ) {s = 13;}

                        else if ( (LA11_0=='o') ) {s = 14;}

                        else if ( (LA11_0=='m') ) {s = 15;}

                        else if ( (LA11_0=='e') ) {s = 16;}

                        else if ( (LA11_0=='d') ) {s = 17;}

                        else if ( (LA11_0=='r') ) {s = 18;}

                        else if ( (LA11_0=='s') ) {s = 19;}

                        else if ( (LA11_0=='u') ) {s = 20;}

                        else if ( (LA11_0=='f') ) {s = 21;}

                        else if ( (LA11_0=='b') ) {s = 22;}

                        else if ( ((LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||LA11_0=='a'||LA11_0=='c'||(LA11_0>='g' && LA11_0<='h')||(LA11_0>='j' && LA11_0<='l')||LA11_0=='n'||LA11_0=='q'||LA11_0=='t'||(LA11_0>='v' && LA11_0<='z')) ) {s = 23;}

                        else if ( (LA11_0=='/') ) {s = 24;}

                        else if ( (LA11_0=='\"') ) {s = 25;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {s = 26;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='#' && LA11_0<=',')||LA11_0==':'||(LA11_0>='>' && LA11_0<='@')||LA11_0=='\\'||LA11_0=='^'||LA11_0=='`'||LA11_0=='|'||(LA11_0>='~' && LA11_0<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_25 = input.LA(1);

                        s = -1;
                        if ( ((LA11_25>='\u0000' && LA11_25<='\t')||(LA11_25>='\u000B' && LA11_25<='\f')||(LA11_25>='\u000E' && LA11_25<='\uFFFF')) ) {s = 59;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}