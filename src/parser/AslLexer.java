// $ANTLR 3.4 D:\\Asl\\src\\parser\\Asl.g 2017-03-12 17:31:46

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ASSIGN=6;
    public static final int BOOLEAN=7;
    public static final int COMMENT=8;
    public static final int DIV=9;
    public static final int DO=10;
    public static final int ELSE=11;
    public static final int ENDFUNC=12;
    public static final int ENDIF=13;
    public static final int ENDWHILE=14;
    public static final int EQUAL=15;
    public static final int ESC_SEQ=16;
    public static final int FACTORIAL=17;
    public static final int FALSE=18;
    public static final int FUNC=19;
    public static final int FUNCALL=20;
    public static final int FUNCVEC=21;
    public static final int GE=22;
    public static final int GT=23;
    public static final int ID=24;
    public static final int IF=25;
    public static final int INT=26;
    public static final int LE=27;
    public static final int LIST_FUNCTIONS=28;
    public static final int LIST_INSTR=29;
    public static final int LT=30;
    public static final int MINUS=31;
    public static final int MOD=32;
    public static final int MUL=33;
    public static final int NOT=34;
    public static final int NOT_EQUAL=35;
    public static final int OR=36;
    public static final int PARAMS=37;
    public static final int PLUS=38;
    public static final int PREF=39;
    public static final int PVALUE=40;
    public static final int QUESTION=41;
    public static final int READ=42;
    public static final int RETURN=43;
    public static final int SIZE=44;
    public static final int STRING=45;
    public static final int SUMFUNC=46;
    public static final int TERNARY=47;
    public static final int THEN=48;
    public static final int TRUE=49;
    public static final int VARLIST=50;
    public static final int VECTOR=51;
    public static final int WHILE=52;
    public static final int WRITE=53;
    public static final int WS=54;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AslLexer() {} 
    public AslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\Asl\\src\\parser\\Asl.g"; }

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:6:7: ( '&' )
            // D:\\Asl\\src\\parser\\Asl.g:6:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:7:7: ( '(' )
            // D:\\Asl\\src\\parser\\Asl.g:7:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:8:7: ( ')' )
            // D:\\Asl\\src\\parser\\Asl.g:8:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:9:7: ( ',' )
            // D:\\Asl\\src\\parser\\Asl.g:9:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:10:7: ( '.size' )
            // D:\\Asl\\src\\parser\\Asl.g:10:9: '.size'
            {
            match(".size"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:11:7: ( ':' )
            // D:\\Asl\\src\\parser\\Asl.g:11:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:12:7: ( ';' )
            // D:\\Asl\\src\\parser\\Asl.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:13:7: ( '[' )
            // D:\\Asl\\src\\parser\\Asl.g:13:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:14:7: ( ']' )
            // D:\\Asl\\src\\parser\\Asl.g:14:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "SUMFUNC"
    public final void mSUMFUNC() throws RecognitionException {
        try {
            int _type = SUMFUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:175:8: ( 'sum' )
            // D:\\Asl\\src\\parser\\Asl.g:175:10: 'sum'
            {
            match("sum"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUMFUNC"

    // $ANTLR start "FACTORIAL"
    public final void mFACTORIAL() throws RecognitionException {
        try {
            int _type = FACTORIAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:176:11: ( '!' )
            // D:\\Asl\\src\\parser\\Asl.g:176:13: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FACTORIAL"

    // $ANTLR start "QUESTION"
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:177:10: ( '?' )
            // D:\\Asl\\src\\parser\\Asl.g:177:12: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUESTION"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:178:7: ( '=' )
            // D:\\Asl\\src\\parser\\Asl.g:178:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:179:10: ( '!=' )
            // D:\\Asl\\src\\parser\\Asl.g:179:13: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:180:4: ( '<' )
            // D:\\Asl\\src\\parser\\Asl.g:180:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:181:4: ( '<=' )
            // D:\\Asl\\src\\parser\\Asl.g:181:6: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:182:4: ( '>' )
            // D:\\Asl\\src\\parser\\Asl.g:182:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:183:4: ( '>=' )
            // D:\\Asl\\src\\parser\\Asl.g:183:6: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:184:6: ( '+' )
            // D:\\Asl\\src\\parser\\Asl.g:184:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:185:7: ( '-' )
            // D:\\Asl\\src\\parser\\Asl.g:185:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:186:5: ( '*' )
            // D:\\Asl\\src\\parser\\Asl.g:186:7: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:187:5: ( '/' )
            // D:\\Asl\\src\\parser\\Asl.g:187:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:188:5: ( '%' )
            // D:\\Asl\\src\\parser\\Asl.g:188:7: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:189:5: ( 'not' )
            // D:\\Asl\\src\\parser\\Asl.g:189:7: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:190:5: ( 'and' )
            // D:\\Asl\\src\\parser\\Asl.g:190:7: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:191:4: ( 'or' )
            // D:\\Asl\\src\\parser\\Asl.g:191:6: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:192:6: ( 'if' )
            // D:\\Asl\\src\\parser\\Asl.g:192:8: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:193:6: ( 'then' )
            // D:\\Asl\\src\\parser\\Asl.g:193:8: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:194:6: ( 'else' )
            // D:\\Asl\\src\\parser\\Asl.g:194:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ENDIF"
    public final void mENDIF() throws RecognitionException {
        try {
            int _type = ENDIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:195:7: ( 'endif' )
            // D:\\Asl\\src\\parser\\Asl.g:195:9: 'endif'
            {
            match("endif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDIF"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:196:7: ( 'while' )
            // D:\\Asl\\src\\parser\\Asl.g:196:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:197:4: ( 'do' )
            // D:\\Asl\\src\\parser\\Asl.g:197:6: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "ENDWHILE"
    public final void mENDWHILE() throws RecognitionException {
        try {
            int _type = ENDWHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:198:10: ( 'endwhile' )
            // D:\\Asl\\src\\parser\\Asl.g:198:12: 'endwhile'
            {
            match("endwhile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDWHILE"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:199:6: ( 'func' )
            // D:\\Asl\\src\\parser\\Asl.g:199:8: 'func'
            {
            match("func"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "ENDFUNC"
    public final void mENDFUNC() throws RecognitionException {
        try {
            int _type = ENDFUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:200:9: ( 'endfunc' )
            // D:\\Asl\\src\\parser\\Asl.g:200:11: 'endfunc'
            {
            match("endfunc"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDFUNC"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:201:8: ( 'return' )
            // D:\\Asl\\src\\parser\\Asl.g:201:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:202:6: ( 'read' )
            // D:\\Asl\\src\\parser\\Asl.g:202:8: 'read'
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "WRITE"
    public final void mWRITE() throws RecognitionException {
        try {
            int _type = WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:203:7: ( 'write' )
            // D:\\Asl\\src\\parser\\Asl.g:203:9: 'write'
            {
            match("write"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WRITE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:204:9: ( 'true' )
            // D:\\Asl\\src\\parser\\Asl.g:204:11: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:205:9: ( 'false' )
            // D:\\Asl\\src\\parser\\Asl.g:205:11: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:206:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // D:\\Asl\\src\\parser\\Asl.g:206:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\Asl\\src\\parser\\Asl.g:206:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Asl\\src\\parser\\Asl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:207:6: ( ( '0' .. '9' )+ )
            // D:\\Asl\\src\\parser\\Asl.g:207:7: ( '0' .. '9' )+
            {
            // D:\\Asl\\src\\parser\\Asl.g:207:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Asl\\src\\parser\\Asl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:210:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='/') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='/') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='*') ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // D:\\Asl\\src\\parser\\Asl.g:210:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // D:\\Asl\\src\\parser\\Asl.g:210:16: (~ ( '\\n' | '\\r' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // D:\\Asl\\src\\parser\\Asl.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    // D:\\Asl\\src\\parser\\Asl.g:210:30: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // D:\\Asl\\src\\parser\\Asl.g:210:30: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // D:\\Asl\\src\\parser\\Asl.g:211:8: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // D:\\Asl\\src\\parser\\Asl.g:211:13: ( options {greedy=false; } : . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='*') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1=='/') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\Asl\\src\\parser\\Asl.g:211:41: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:215:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // D:\\Asl\\src\\parser\\Asl.g:215:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // D:\\Asl\\src\\parser\\Asl.g:215:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    alt7=1;
                }
                else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '!')||(LA7_0 >= '#' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Asl\\src\\parser\\Asl.g:215:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // D:\\Asl\\src\\parser\\Asl.g:215:28: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // D:\\Asl\\src\\parser\\Asl.g:221:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // D:\\Asl\\src\\parser\\Asl.g:221:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Asl\\src\\parser\\Asl.g:224:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // D:\\Asl\\src\\parser\\Asl.g:224:8: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // D:\\Asl\\src\\parser\\Asl.g:1:8: ( T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | SUMFUNC | FACTORIAL | QUESTION | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | ID | INT | COMMENT | STRING | WS )
        int alt8=45;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // D:\\Asl\\src\\parser\\Asl.g:1:10: T__55
                {
                mT__55(); 


                }
                break;
            case 2 :
                // D:\\Asl\\src\\parser\\Asl.g:1:16: T__56
                {
                mT__56(); 


                }
                break;
            case 3 :
                // D:\\Asl\\src\\parser\\Asl.g:1:22: T__57
                {
                mT__57(); 


                }
                break;
            case 4 :
                // D:\\Asl\\src\\parser\\Asl.g:1:28: T__58
                {
                mT__58(); 


                }
                break;
            case 5 :
                // D:\\Asl\\src\\parser\\Asl.g:1:34: T__59
                {
                mT__59(); 


                }
                break;
            case 6 :
                // D:\\Asl\\src\\parser\\Asl.g:1:40: T__60
                {
                mT__60(); 


                }
                break;
            case 7 :
                // D:\\Asl\\src\\parser\\Asl.g:1:46: T__61
                {
                mT__61(); 


                }
                break;
            case 8 :
                // D:\\Asl\\src\\parser\\Asl.g:1:52: T__62
                {
                mT__62(); 


                }
                break;
            case 9 :
                // D:\\Asl\\src\\parser\\Asl.g:1:58: T__63
                {
                mT__63(); 


                }
                break;
            case 10 :
                // D:\\Asl\\src\\parser\\Asl.g:1:64: SUMFUNC
                {
                mSUMFUNC(); 


                }
                break;
            case 11 :
                // D:\\Asl\\src\\parser\\Asl.g:1:72: FACTORIAL
                {
                mFACTORIAL(); 


                }
                break;
            case 12 :
                // D:\\Asl\\src\\parser\\Asl.g:1:82: QUESTION
                {
                mQUESTION(); 


                }
                break;
            case 13 :
                // D:\\Asl\\src\\parser\\Asl.g:1:91: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 14 :
                // D:\\Asl\\src\\parser\\Asl.g:1:97: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 15 :
                // D:\\Asl\\src\\parser\\Asl.g:1:107: LT
                {
                mLT(); 


                }
                break;
            case 16 :
                // D:\\Asl\\src\\parser\\Asl.g:1:110: LE
                {
                mLE(); 


                }
                break;
            case 17 :
                // D:\\Asl\\src\\parser\\Asl.g:1:113: GT
                {
                mGT(); 


                }
                break;
            case 18 :
                // D:\\Asl\\src\\parser\\Asl.g:1:116: GE
                {
                mGE(); 


                }
                break;
            case 19 :
                // D:\\Asl\\src\\parser\\Asl.g:1:119: PLUS
                {
                mPLUS(); 


                }
                break;
            case 20 :
                // D:\\Asl\\src\\parser\\Asl.g:1:124: MINUS
                {
                mMINUS(); 


                }
                break;
            case 21 :
                // D:\\Asl\\src\\parser\\Asl.g:1:130: MUL
                {
                mMUL(); 


                }
                break;
            case 22 :
                // D:\\Asl\\src\\parser\\Asl.g:1:134: DIV
                {
                mDIV(); 


                }
                break;
            case 23 :
                // D:\\Asl\\src\\parser\\Asl.g:1:138: MOD
                {
                mMOD(); 


                }
                break;
            case 24 :
                // D:\\Asl\\src\\parser\\Asl.g:1:142: NOT
                {
                mNOT(); 


                }
                break;
            case 25 :
                // D:\\Asl\\src\\parser\\Asl.g:1:146: AND
                {
                mAND(); 


                }
                break;
            case 26 :
                // D:\\Asl\\src\\parser\\Asl.g:1:150: OR
                {
                mOR(); 


                }
                break;
            case 27 :
                // D:\\Asl\\src\\parser\\Asl.g:1:153: IF
                {
                mIF(); 


                }
                break;
            case 28 :
                // D:\\Asl\\src\\parser\\Asl.g:1:156: THEN
                {
                mTHEN(); 


                }
                break;
            case 29 :
                // D:\\Asl\\src\\parser\\Asl.g:1:161: ELSE
                {
                mELSE(); 


                }
                break;
            case 30 :
                // D:\\Asl\\src\\parser\\Asl.g:1:166: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 31 :
                // D:\\Asl\\src\\parser\\Asl.g:1:172: WHILE
                {
                mWHILE(); 


                }
                break;
            case 32 :
                // D:\\Asl\\src\\parser\\Asl.g:1:178: DO
                {
                mDO(); 


                }
                break;
            case 33 :
                // D:\\Asl\\src\\parser\\Asl.g:1:181: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 34 :
                // D:\\Asl\\src\\parser\\Asl.g:1:190: FUNC
                {
                mFUNC(); 


                }
                break;
            case 35 :
                // D:\\Asl\\src\\parser\\Asl.g:1:195: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 36 :
                // D:\\Asl\\src\\parser\\Asl.g:1:203: RETURN
                {
                mRETURN(); 


                }
                break;
            case 37 :
                // D:\\Asl\\src\\parser\\Asl.g:1:210: READ
                {
                mREAD(); 


                }
                break;
            case 38 :
                // D:\\Asl\\src\\parser\\Asl.g:1:215: WRITE
                {
                mWRITE(); 


                }
                break;
            case 39 :
                // D:\\Asl\\src\\parser\\Asl.g:1:221: TRUE
                {
                mTRUE(); 


                }
                break;
            case 40 :
                // D:\\Asl\\src\\parser\\Asl.g:1:226: FALSE
                {
                mFALSE(); 


                }
                break;
            case 41 :
                // D:\\Asl\\src\\parser\\Asl.g:1:232: ID
                {
                mID(); 


                }
                break;
            case 42 :
                // D:\\Asl\\src\\parser\\Asl.g:1:235: INT
                {
                mINT(); 


                }
                break;
            case 43 :
                // D:\\Asl\\src\\parser\\Asl.g:1:239: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 44 :
                // D:\\Asl\\src\\parser\\Asl.g:1:247: STRING
                {
                mSTRING(); 


                }
                break;
            case 45 :
                // D:\\Asl\\src\\parser\\Asl.g:1:254: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\12\uffff\1\37\1\45\2\uffff\1\47\1\51\3\uffff\1\53\1\uffff\12\37"+
        "\4\uffff\1\37\10\uffff\2\37\1\75\1\76\6\37\1\105\3\37\1\112\1\113"+
        "\1\114\2\uffff\6\37\1\uffff\4\37\3\uffff\1\131\1\132\1\133\5\37"+
        "\1\141\2\37\1\144\3\uffff\1\145\2\37\1\150\1\151\1\uffff\1\152\1"+
        "\37\2\uffff\2\37\3\uffff\1\156\1\37\1\160\1\uffff\1\161\2\uffff";
    static final String DFA8_eofS =
        "\162\uffff";
    static final String DFA8_minS =
        "\1\11\11\uffff\1\165\1\75\2\uffff\2\75\3\uffff\1\52\1\uffff\1\157"+
        "\1\156\1\162\1\146\1\150\1\154\1\150\1\157\1\141\1\145\4\uffff\1"+
        "\155\10\uffff\1\164\1\144\2\60\1\145\1\165\1\163\1\144\2\151\1\60"+
        "\1\156\1\154\1\141\3\60\2\uffff\1\156\2\145\1\146\1\154\1\164\1"+
        "\uffff\1\143\1\163\1\165\1\144\3\uffff\3\60\1\146\1\150\1\165\2"+
        "\145\1\60\1\145\1\162\1\60\3\uffff\1\60\1\151\1\156\2\60\1\uffff"+
        "\1\60\1\156\2\uffff\1\154\1\143\3\uffff\1\60\1\145\1\60\1\uffff"+
        "\1\60\2\uffff";
    static final String DFA8_maxS =
        "\1\172\11\uffff\1\165\1\75\2\uffff\2\75\3\uffff\1\57\1\uffff\1\157"+
        "\1\156\1\162\1\146\1\162\1\156\1\162\1\157\1\165\1\145\4\uffff\1"+
        "\155\10\uffff\1\164\1\144\2\172\1\145\1\165\1\163\1\144\2\151\1"+
        "\172\1\156\1\154\1\164\3\172\2\uffff\1\156\2\145\1\167\1\154\1\164"+
        "\1\uffff\1\143\1\163\1\165\1\144\3\uffff\3\172\1\146\1\150\1\165"+
        "\2\145\1\172\1\145\1\162\1\172\3\uffff\1\172\1\151\1\156\2\172\1"+
        "\uffff\1\172\1\156\2\uffff\1\154\1\143\3\uffff\1\172\1\145\1\172"+
        "\1\uffff\1\172\2\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff\1\14\1\15"+
        "\2\uffff\1\23\1\24\1\25\1\uffff\1\27\12\uffff\1\51\1\52\1\54\1\55"+
        "\1\uffff\1\16\1\13\1\20\1\17\1\22\1\21\1\53\1\26\21\uffff\1\32\1"+
        "\33\6\uffff\1\40\4\uffff\1\12\1\30\1\31\14\uffff\1\34\1\47\1\35"+
        "\5\uffff\1\42\2\uffff\1\45\1\36\2\uffff\1\37\1\46\1\50\3\uffff\1"+
        "\44\1\uffff\1\43\1\41";
    static final String DFA8_specialS =
        "\162\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\42\2\uffff\1\42\22\uffff\1\42\1\13\1\41\2\uffff\1\24\1\1"+
            "\1\uffff\1\2\1\3\1\22\1\20\1\4\1\21\1\5\1\23\12\40\1\6\1\7\1"+
            "\16\1\15\1\17\1\14\1\uffff\32\37\1\10\1\uffff\1\11\1\uffff\1"+
            "\37\1\uffff\1\26\2\37\1\34\1\32\1\35\2\37\1\30\4\37\1\25\1\27"+
            "\2\37\1\36\1\12\1\31\2\37\1\33\3\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43",
            "\1\44",
            "",
            "",
            "\1\46",
            "\1\50",
            "",
            "",
            "",
            "\1\52\4\uffff\1\52",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60\11\uffff\1\61",
            "\1\62\1\uffff\1\63",
            "\1\64\11\uffff\1\65",
            "\1\66",
            "\1\70\23\uffff\1\67",
            "\1\71",
            "",
            "",
            "",
            "",
            "\1\72",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\73",
            "\1\74",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\106",
            "\1\107",
            "\1\111\22\uffff\1\110",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\122\2\uffff\1\120\15\uffff\1\121",
            "\1\123",
            "\1\124",
            "",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\142",
            "\1\143",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\146",
            "\1\147",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\153",
            "",
            "",
            "\1\154",
            "\1\155",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\157",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | SUMFUNC | FACTORIAL | QUESTION | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | ID | INT | COMMENT | STRING | WS );";
        }
    }
 

}