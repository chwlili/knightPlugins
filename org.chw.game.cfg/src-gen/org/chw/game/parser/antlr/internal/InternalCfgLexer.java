package org.chw.game.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCfgLexer extends Lexer {
    public static final int RULE_C_NUMBER=24;
    public static final int RULE_C_COMMA=18;
    public static final int RULE_C_TYPE=8;
    public static final int RULE_C_PAREN_R=14;
    public static final int RULE_C_SEMICOLON=6;
    public static final int RULE_C_PAREN_L=13;
    public static final int RULE_C_INPUT=4;
    public static final int RULE_C_STRING=25;
    public static final int RULE_C_SLICE=19;
    public static final int RULE_COMMENT=20;
    public static final int RULE_C_PACKAGE=7;
    public static final int EOF=-1;
    public static final int RULE_C_ANGLE_L=27;
    public static final int RULE_C_ANGLE_R=28;
    public static final int RULE_COMMENT_END=29;
    public static final int RULE_C_BRACKET_L=11;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int RULE_C_EQUALS=16;
    public static final int RULE_C_UINT=22;
    public static final int RULE_C_BRACKET_R=15;
    public static final int RULE_C_MAIN=12;
    public static final int RULE_C_INT=21;
    public static final int RULE_NAME=26;
    public static final int RULE_WS=30;
    public static final int RULE_C_LIST=17;
    public static final int RULE_C_BRACE_L=9;
    public static final int RULE_C_BOOL=23;
    public static final int RULE_C_BRACE_R=10;

    // delegates
    // delegators

    public InternalCfgLexer() {;} 
    public InternalCfgLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCfgLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g"; }

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:11:7: ( '.' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:11:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "RULE_C_BRACKET_L"
    public final void mRULE_C_BRACKET_L() throws RecognitionException {
        try {
            int _type = RULE_C_BRACKET_L;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1248:18: ( '[' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1248:20: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_C_BRACKET_L"

    // $ANTLR start "RULE_C_BRACKET_R"
    public final void mRULE_C_BRACKET_R() throws RecognitionException {
        try {
            int _type = RULE_C_BRACKET_R;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1250:18: ( ']' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1250:20: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_C_BRACKET_R"

    // $ANTLR start "RULE_C_PAREN_L"
    public final void mRULE_C_PAREN_L() throws RecognitionException {
        try {
            int _type = RULE_C_PAREN_L;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1252:16: ( '(' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1252:18: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_C_PAREN_L"

    // $ANTLR start "RULE_C_PAREN_R"
    public final void mRULE_C_PAREN_R() throws RecognitionException {
        try {
            int _type = RULE_C_PAREN_R;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1254:16: ( ')' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1254:18: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_C_PAREN_R"

    // $ANTLR start "RULE_C_BRACE_L"
    public final void mRULE_C_BRACE_L() throws RecognitionException {
        try {
            int _type = RULE_C_BRACE_L;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1256:16: ( '{' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1256:18: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_C_BRACE_L"

    // $ANTLR start "RULE_C_BRACE_R"
    public final void mRULE_C_BRACE_R() throws RecognitionException {
        try {
            int _type = RULE_C_BRACE_R;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1258:16: ( '}' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1258:18: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_C_BRACE_R"

    // $ANTLR start "RULE_C_ANGLE_L"
    public final void mRULE_C_ANGLE_L() throws RecognitionException {
        try {
            int _type = RULE_C_ANGLE_L;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1260:16: ( '<' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1260:18: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_C_ANGLE_L"

    // $ANTLR start "RULE_C_ANGLE_R"
    public final void mRULE_C_ANGLE_R() throws RecognitionException {
        try {
            int _type = RULE_C_ANGLE_R;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1262:16: ( '>' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1262:18: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_C_ANGLE_R"

    // $ANTLR start "RULE_C_EQUALS"
    public final void mRULE_C_EQUALS() throws RecognitionException {
        try {
            int _type = RULE_C_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1264:15: ( '=' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1264:17: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_C_EQUALS"

    // $ANTLR start "RULE_C_COMMA"
    public final void mRULE_C_COMMA() throws RecognitionException {
        try {
            int _type = RULE_C_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1266:14: ( ',' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1266:16: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_C_COMMA"

    // $ANTLR start "RULE_C_SEMICOLON"
    public final void mRULE_C_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_C_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1268:18: ( ';' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1268:20: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_C_SEMICOLON"

    // $ANTLR start "RULE_C_INPUT"
    public final void mRULE_C_INPUT() throws RecognitionException {
        try {
            int _type = RULE_C_INPUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1270:14: ( 'input' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1270:16: 'input'
            {
            match("input"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_C_INPUT"

    // $ANTLR start "RULE_C_MAIN"
    public final void mRULE_C_MAIN() throws RecognitionException {
        try {
            int _type = RULE_C_MAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1272:13: ( 'Main' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1272:15: 'Main'
            {
            match("Main"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_C_MAIN"

    // $ANTLR start "RULE_C_TYPE"
    public final void mRULE_C_TYPE() throws RecognitionException {
        try {
            int _type = RULE_C_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1274:13: ( 'type' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1274:15: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_C_TYPE"

    // $ANTLR start "RULE_C_INT"
    public final void mRULE_C_INT() throws RecognitionException {
        try {
            int _type = RULE_C_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1276:12: ( 'int' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1276:14: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_C_INT"

    // $ANTLR start "RULE_C_UINT"
    public final void mRULE_C_UINT() throws RecognitionException {
        try {
            int _type = RULE_C_UINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1278:13: ( 'uint' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1278:15: 'uint'
            {
            match("uint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_C_UINT"

    // $ANTLR start "RULE_C_BOOL"
    public final void mRULE_C_BOOL() throws RecognitionException {
        try {
            int _type = RULE_C_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1280:13: ( 'Boolean' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1280:15: 'Boolean'
            {
            match("Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_C_BOOL"

    // $ANTLR start "RULE_C_NUMBER"
    public final void mRULE_C_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_C_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1282:15: ( 'Number' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1282:17: 'Number'
            {
            match("Number"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_C_NUMBER"

    // $ANTLR start "RULE_C_STRING"
    public final void mRULE_C_STRING() throws RecognitionException {
        try {
            int _type = RULE_C_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1284:15: ( 'String' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1284:17: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_C_STRING"

    // $ANTLR start "RULE_C_LIST"
    public final void mRULE_C_LIST() throws RecognitionException {
        try {
            int _type = RULE_C_LIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1286:13: ( 'List' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1286:15: 'List'
            {
            match("List"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_C_LIST"

    // $ANTLR start "RULE_C_SLICE"
    public final void mRULE_C_SLICE() throws RecognitionException {
        try {
            int _type = RULE_C_SLICE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1288:14: ( 'Slice' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1288:16: 'Slice'
            {
            match("Slice"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_C_SLICE"

    // $ANTLR start "RULE_C_PACKAGE"
    public final void mRULE_C_PACKAGE() throws RecognitionException {
        try {
            int _type = RULE_C_PACKAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1290:16: ( 'package' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1290:18: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_C_PACKAGE"

    // $ANTLR start "RULE_NAME"
    public final void mRULE_NAME() throws RecognitionException {
        try {
            int _type = RULE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1292:11: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1292:13: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1292:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:
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
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NAME"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1294:13: ( '\"' (~ ( ( '\\r' | '\\n' | '\"' ) ) )* '\"' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1294:15: '\"' (~ ( ( '\\r' | '\\n' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1294:19: (~ ( ( '\\r' | '\\n' | '\"' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1294:19: ~ ( ( '\\r' | '\\n' | '\"' ) )
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
            	    break loop2;
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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_COMMENT_END"
    public final void mRULE_COMMENT_END() throws RecognitionException {
        try {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1296:27: ( '*/' )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1296:29: '*/'
            {
            match("*/"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT_END"

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1298:14: ( ( '/*' ( options {greedy=false; } : . )* RULE_COMMENT_END | '//' (~ ( ( '\\r' | '\\n' ) ) )* ) )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1298:16: ( '/*' ( options {greedy=false; } : . )* RULE_COMMENT_END | '//' (~ ( ( '\\r' | '\\n' ) ) )* )
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1298:16: ( '/*' ( options {greedy=false; } : . )* RULE_COMMENT_END | '//' (~ ( ( '\\r' | '\\n' ) ) )* )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='/') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='*') ) {
                    alt5=1;
                }
                else if ( (LA5_1=='/') ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1298:17: '/*' ( options {greedy=false; } : . )* RULE_COMMENT_END
                    {
                    match("/*"); 

                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1298:22: ( options {greedy=false; } : . )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='*') ) {
                            int LA3_1 = input.LA(2);

                            if ( (LA3_1=='/') ) {
                                alt3=2;
                            }
                            else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFF')) ) {
                                alt3=1;
                            }


                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<=')')||(LA3_0>='+' && LA3_0<='\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1298:50: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    mRULE_COMMENT_END(); 

                    }
                    break;
                case 2 :
                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1298:71: '//' (~ ( ( '\\r' | '\\n' ) ) )*
                    {
                    match("//"); 

                    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1298:76: (~ ( ( '\\r' | '\\n' ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1298:76: ~ ( ( '\\r' | '\\n' ) )
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
                    	    break loop4;
                        }
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
    // $ANTLR end "RULE_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1300:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1300:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1300:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:8: ( T__31 | RULE_C_BRACKET_L | RULE_C_BRACKET_R | RULE_C_PAREN_L | RULE_C_PAREN_R | RULE_C_BRACE_L | RULE_C_BRACE_R | RULE_C_ANGLE_L | RULE_C_ANGLE_R | RULE_C_EQUALS | RULE_C_COMMA | RULE_C_SEMICOLON | RULE_C_INPUT | RULE_C_MAIN | RULE_C_TYPE | RULE_C_INT | RULE_C_UINT | RULE_C_BOOL | RULE_C_NUMBER | RULE_C_STRING | RULE_C_LIST | RULE_C_SLICE | RULE_C_PACKAGE | RULE_NAME | RULE_STRING | RULE_COMMENT | RULE_WS )
        int alt7=27;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:10: T__31
                {
                mT__31(); 

                }
                break;
            case 2 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:16: RULE_C_BRACKET_L
                {
                mRULE_C_BRACKET_L(); 

                }
                break;
            case 3 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:33: RULE_C_BRACKET_R
                {
                mRULE_C_BRACKET_R(); 

                }
                break;
            case 4 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:50: RULE_C_PAREN_L
                {
                mRULE_C_PAREN_L(); 

                }
                break;
            case 5 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:65: RULE_C_PAREN_R
                {
                mRULE_C_PAREN_R(); 

                }
                break;
            case 6 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:80: RULE_C_BRACE_L
                {
                mRULE_C_BRACE_L(); 

                }
                break;
            case 7 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:95: RULE_C_BRACE_R
                {
                mRULE_C_BRACE_R(); 

                }
                break;
            case 8 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:110: RULE_C_ANGLE_L
                {
                mRULE_C_ANGLE_L(); 

                }
                break;
            case 9 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:125: RULE_C_ANGLE_R
                {
                mRULE_C_ANGLE_R(); 

                }
                break;
            case 10 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:140: RULE_C_EQUALS
                {
                mRULE_C_EQUALS(); 

                }
                break;
            case 11 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:154: RULE_C_COMMA
                {
                mRULE_C_COMMA(); 

                }
                break;
            case 12 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:167: RULE_C_SEMICOLON
                {
                mRULE_C_SEMICOLON(); 

                }
                break;
            case 13 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:184: RULE_C_INPUT
                {
                mRULE_C_INPUT(); 

                }
                break;
            case 14 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:197: RULE_C_MAIN
                {
                mRULE_C_MAIN(); 

                }
                break;
            case 15 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:209: RULE_C_TYPE
                {
                mRULE_C_TYPE(); 

                }
                break;
            case 16 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:221: RULE_C_INT
                {
                mRULE_C_INT(); 

                }
                break;
            case 17 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:232: RULE_C_UINT
                {
                mRULE_C_UINT(); 

                }
                break;
            case 18 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:244: RULE_C_BOOL
                {
                mRULE_C_BOOL(); 

                }
                break;
            case 19 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:256: RULE_C_NUMBER
                {
                mRULE_C_NUMBER(); 

                }
                break;
            case 20 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:270: RULE_C_STRING
                {
                mRULE_C_STRING(); 

                }
                break;
            case 21 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:284: RULE_C_LIST
                {
                mRULE_C_LIST(); 

                }
                break;
            case 22 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:296: RULE_C_SLICE
                {
                mRULE_C_SLICE(); 

                }
                break;
            case 23 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:309: RULE_C_PACKAGE
                {
                mRULE_C_PACKAGE(); 

                }
                break;
            case 24 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:324: RULE_NAME
                {
                mRULE_NAME(); 

                }
                break;
            case 25 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:334: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 26 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:346: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 27 :
                // ../org.chw.game.cfg/src-gen/org/chw/game/parser/antlr/internal/InternalCfg.g:1:359: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\15\uffff\11\26\4\uffff\13\26\1\60\12\26\1\uffff\1\73\1\74\1\75"+
        "\4\26\1\102\1\26\1\104\3\uffff\3\26\1\110\1\uffff\1\26\1\uffff\1"+
        "\26\1\113\1\114\1\uffff\1\26\1\116\2\uffff\1\117\2\uffff";
    static final String DFA7_eofS =
        "\120\uffff";
    static final String DFA7_minS =
        "\1\11\14\uffff\1\156\1\141\1\171\1\151\1\157\1\165\1\154\1\151"+
        "\1\141\4\uffff\1\160\1\151\1\160\1\156\1\157\1\155\1\162\1\151\1"+
        "\163\1\143\1\165\1\60\1\156\1\145\1\164\1\154\1\142\1\151\1\143"+
        "\1\164\1\153\1\164\1\uffff\3\60\2\145\1\156\1\145\1\60\1\141\1\60"+
        "\3\uffff\1\141\1\162\1\147\1\60\1\uffff\1\147\1\uffff\1\156\2\60"+
        "\1\uffff\1\145\1\60\2\uffff\1\60\2\uffff";
    static final String DFA7_maxS =
        "\1\175\14\uffff\1\156\1\141\1\171\1\151\1\157\1\165\1\164\1\151"+
        "\1\141\4\uffff\1\164\1\151\1\160\1\156\1\157\1\155\1\162\1\151\1"+
        "\163\1\143\1\165\1\172\1\156\1\145\1\164\1\154\1\142\1\151\1\143"+
        "\1\164\1\153\1\164\1\uffff\3\172\2\145\1\156\1\145\1\172\1\141\1"+
        "\172\3\uffff\1\141\1\162\1\147\1\172\1\uffff\1\147\1\uffff\1\156"+
        "\2\172\1\uffff\1\145\1\172\2\uffff\1\172\2\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\11"+
        "\uffff\1\30\1\31\1\32\1\33\26\uffff\1\20\12\uffff\1\16\1\17\1\21"+
        "\4\uffff\1\25\1\uffff\1\15\3\uffff\1\26\2\uffff\1\23\1\24\1\uffff"+
        "\1\22\1\27";
    static final String DFA7_specialS =
        "\120\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\31\2\uffff\1\31\22\uffff\1\31\1\uffff\1\27\5\uffff\1\4\1"+
            "\5\2\uffff\1\13\1\uffff\1\1\1\30\13\uffff\1\14\1\10\1\12\1\11"+
            "\2\uffff\1\26\1\21\11\26\1\24\1\16\1\22\4\26\1\23\7\26\1\2\1"+
            "\uffff\1\3\3\uffff\10\26\1\15\6\26\1\25\3\26\1\17\1\20\5\26"+
            "\1\6\1\uffff\1\7",
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
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\41\7\uffff\1\40",
            "\1\42",
            "\1\43",
            "",
            "",
            "",
            "",
            "\1\44\3\uffff\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\103",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\111",
            "",
            "\1\112",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\115",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__31 | RULE_C_BRACKET_L | RULE_C_BRACKET_R | RULE_C_PAREN_L | RULE_C_PAREN_R | RULE_C_BRACE_L | RULE_C_BRACE_R | RULE_C_ANGLE_L | RULE_C_ANGLE_R | RULE_C_EQUALS | RULE_C_COMMA | RULE_C_SEMICOLON | RULE_C_INPUT | RULE_C_MAIN | RULE_C_TYPE | RULE_C_INT | RULE_C_UINT | RULE_C_BOOL | RULE_C_NUMBER | RULE_C_STRING | RULE_C_LIST | RULE_C_SLICE | RULE_C_PACKAGE | RULE_NAME | RULE_STRING | RULE_COMMENT | RULE_WS );";
        }
    }
 

}