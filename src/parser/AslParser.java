// $ANTLR 3.4 /mnt/d/Downloads/Asl/src/parser/Asl.g 2017-02-27 22:07:55

package parser;
import interp.AslTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


/**
 * Copyright (c) 2011, Jordi Cortadella
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of the <organization> nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "BOOLEAN", "COMMENT", "DIV", "DO", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "PREF", "PVALUE", "READ", "RETURN", "STRING", "THEN", "TRUE", "VECTOR", "WHILE", "WRITE", "WS", "'&'", "'('", "')'", "','", "';'", "'['", "']'"
    };

    public static final int EOF=-1;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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
    public static final int FALSE=17;
    public static final int FUNC=18;
    public static final int FUNCALL=19;
    public static final int GE=20;
    public static final int GT=21;
    public static final int ID=22;
    public static final int IF=23;
    public static final int INT=24;
    public static final int LE=25;
    public static final int LIST_FUNCTIONS=26;
    public static final int LIST_INSTR=27;
    public static final int LT=28;
    public static final int MINUS=29;
    public static final int MOD=30;
    public static final int MUL=31;
    public static final int NOT=32;
    public static final int NOT_EQUAL=33;
    public static final int OR=34;
    public static final int PARAMS=35;
    public static final int PLUS=36;
    public static final int PREF=37;
    public static final int PVALUE=38;
    public static final int READ=39;
    public static final int RETURN=40;
    public static final int STRING=41;
    public static final int THEN=42;
    public static final int TRUE=43;
    public static final int VECTOR=44;
    public static final int WHILE=45;
    public static final int WRITE=46;
    public static final int WS=47;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public AslParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return AslParser.tokenNames; }
    public String getGrammarFileName() { return "/mnt/d/Downloads/Asl/src/parser/Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /mnt/d/Downloads/Asl/src/parser/Asl.g:61:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
    public final AslParser.prog_return prog() throws RecognitionException {
        AslParser.prog_return retval = new AslParser.prog_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EOF2=null;
        AslParser.func_return func1 =null;


        AslTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_func=new RewriteRuleSubtreeStream(adaptor,"rule func");
        try {
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:61:6: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:61:8: ( func )+ EOF
            {
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:61:8: ( func )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /mnt/d/Downloads/Asl/src/parser/Asl.g:61:8: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog170);
            	    func1=func();

            	    state._fsp--;

            	    stream_func.add(func1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog173);  
            stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: func
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 61:18: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /mnt/d/Downloads/Asl/src/parser/Asl.g:61:21: ^( LIST_FUNCTIONS ( func )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_FUNCTIONS, "LIST_FUNCTIONS")
                , root_1);

                if ( !(stream_func.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_func.hasNext() ) {
                    adaptor.addChild(root_1, stream_func.nextTree());

                }
                stream_func.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class func_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func"
    // /mnt/d/Downloads/Asl/src/parser/Asl.g:65:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
    public final AslParser.func_return func() throws RecognitionException {
        AslParser.func_return retval = new AslParser.func_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FUNC3=null;
        Token ID4=null;
        Token ENDFUNC7=null;
        AslParser.params_return params5 =null;

        AslParser.block_instructions_return block_instructions6 =null;


        AslTree FUNC3_tree=null;
        AslTree ID4_tree=null;
        AslTree ENDFUNC7_tree=null;

        try {
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:65:6: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:65:8: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func212); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func215); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func217);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_func219);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func221); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func"


    public static class params_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /mnt/d/Downloads/Asl/src/parser/Asl.g:69:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.paramlist_return paramlist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:69:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:69:10: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,49,FOLLOW_49_in_params240);  
            stream_49.add(char_literal8);


            // /mnt/d/Downloads/Asl/src/parser/Asl.g:69:14: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==48) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:69:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params242);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,50,FOLLOW_50_in_params245);  
            stream_50.add(char_literal10);


            // AST REWRITE
            // elements: paramlist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 69:29: -> ^( PARAMS ( paramlist )? )
            {
                // /mnt/d/Downloads/Asl/src/parser/Asl.g:69:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /mnt/d/Downloads/Asl/src/parser/Asl.g:69:41: ( paramlist )?
                if ( stream_paramlist.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramlist.nextTree());

                }
                stream_paramlist.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class paramlist_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramlist"
    // /mnt/d/Downloads/Asl/src/parser/Asl.g:73:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:73:10: ( param ( ',' ! param )* )
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:73:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist271);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // /mnt/d/Downloads/Asl/src/parser/Asl.g:73:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==51) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /mnt/d/Downloads/Asl/src/parser/Asl.g:73:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,51,FOLLOW_51_in_paramlist274); 

            	    pushFollow(FOLLOW_param_in_paramlist277);
            	    param13=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param13.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "paramlist"


    public static class param_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param"
    // /mnt/d/Downloads/Asl/src/parser/Asl.g:78:1: param : ( '&' id= ID -> ^( PREF[$id, $id.text] ) | var -> ^( PVALUE var ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal14=null;
        AslParser.var_return var15 =null;


        AslTree id_tree=null;
        AslTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var");
        try {
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:78:9: ( '&' id= ID -> ^( PREF[$id, $id.text] ) | var -> ^( PVALUE var ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==48) ) {
                alt4=1;
            }
            else if ( (LA4_0==ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:78:13: '&' id= ID
                    {
                    char_literal14=(Token)match(input,48,FOLLOW_48_in_param302);  
                    stream_48.add(char_literal14);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param306);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 78:23: -> ^( PREF[$id, $id.text] )
                    {
                        // /mnt/d/Downloads/Asl/src/parser/Asl.g:78:26: ^( PREF[$id, $id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PREF, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:79:13: var
                    {
                    pushFollow(FOLLOW_var_in_param327);
                    var15=var();

                    state._fsp--;

                    stream_var.add(var15.getTree());

                    // AST REWRITE
                    // elements: var
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 79:17: -> ^( PVALUE var )
                    {
                        // /mnt/d/Downloads/Asl/src/parser/Asl.g:79:20: ^( PVALUE var )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PVALUE, "PVALUE")
                        , root_1);

                        adaptor.addChild(root_1, stream_var.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param"


    public static class block_instructions_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_instructions"
    // /mnt/d/Downloads/Asl/src/parser/Asl.g:83:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal17=null;
        AslParser.instruction_return instruction16 =null;

        AslParser.instruction_return instruction18 =null;


        AslTree char_literal17_tree=null;
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:84:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:84:12: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions362);
            instruction16=instruction();

            state._fsp--;

            stream_instruction.add(instruction16.getTree());

            // /mnt/d/Downloads/Asl/src/parser/Asl.g:84:24: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==52) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /mnt/d/Downloads/Asl/src/parser/Asl.g:84:25: ';' instruction
            	    {
            	    char_literal17=(Token)match(input,52,FOLLOW_52_in_block_instructions365);  
            	    stream_52.add(char_literal17);


            	    pushFollow(FOLLOW_instruction_in_block_instructions367);
            	    instruction18=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction18.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // AST REWRITE
            // elements: instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 85:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /mnt/d/Downloads/Asl/src/parser/Asl.g:85:16: ^( LIST_INSTR ( instruction )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_INSTR, "LIST_INSTR")
                , root_1);

                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block_instructions"


    public static class instruction_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instruction"
    // /mnt/d/Downloads/Asl/src/parser/Asl.g:89:1: instruction : ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |);
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign19 =null;

        AslParser.ite_stmt_return ite_stmt20 =null;

        AslParser.while_stmt_return while_stmt21 =null;

        AslParser.funcall_return funcall22 =null;

        AslParser.return_stmt_return return_stmt23 =null;

        AslParser.read_return read24 =null;

        AslParser.write_return write25 =null;



        try {
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:90:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |)
            int alt6=8;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EQUAL||LA6_1==53) ) {
                    alt6=1;
                }
                else if ( (LA6_1==49) ) {
                    alt6=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt6=2;
                }
                break;
            case WHILE:
                {
                alt6=3;
                }
                break;
            case RETURN:
                {
                alt6=5;
                }
                break;
            case READ:
                {
                alt6=6;
                }
                break;
            case WRITE:
                {
                alt6=7;
                }
                break;
            case ELSE:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case 52:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:90:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction416);
                    assign19=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign19.getTree());

                    }
                    break;
                case 2 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:91:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction438);
                    ite_stmt20=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt20.getTree());

                    }
                    break;
                case 3 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:92:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction458);
                    while_stmt21=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt21.getTree());

                    }
                    break;
                case 4 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:93:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction478);
                    funcall22=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall22.getTree());

                    }
                    break;
                case 5 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:94:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction499);
                    return_stmt23=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt23.getTree());

                    }
                    break;
                case 6 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:95:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction516);
                    read24=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read24.getTree());

                    }
                    break;
                case 7 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:96:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction541);
                    write25=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write25.getTree());

                    }
                    break;
                case 8 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:98:9: 
                    {
                    root_0 = (AslTree)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instruction"


    public static class assign_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // /mnt/d/Downloads/Asl/src/parser/Asl.g:101:1: assign : var eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] var expr ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        AslParser.var_return var26 =null;

        AslParser.expr_return expr27 =null;


        AslTree eq_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:101:8: ( var eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] var expr ) )
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:101:10: var eq= EQUAL expr
            {
            pushFollow(FOLLOW_var_in_assign599);
            var26=var();

            state._fsp--;

            stream_var.add(var26.getTree());

            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign603);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign605);
            expr27=expr();

            state._fsp--;

            stream_expr.add(expr27.getTree());

            // AST REWRITE
            // elements: expr, var
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 101:28: -> ^( ASSIGN[$eq,\":=\"] var expr )
            {
                // /mnt/d/Downloads/Asl/src/parser/Asl.g:101:31: ^( ASSIGN[$eq,\":=\"] var expr )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ASSIGN, eq, ":=")
                , root_1);

                adaptor.addChild(root_1, stream_var.nextTree());

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign"


    public static class ite_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /mnt/d/Downloads/Asl/src/parser/Asl.g:105:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF28=null;
        Token THEN30=null;
        Token ELSE32=null;
        Token ENDIF34=null;
        AslParser.expr_return expr29 =null;

        AslParser.block_instructions_return block_instructions31 =null;

        AslParser.block_instructions_return block_instructions33 =null;


        AslTree IF28_tree=null;
        AslTree THEN30_tree=null;
        AslTree ELSE32_tree=null;
        AslTree ENDIF34_tree=null;

        try {
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:105:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:105:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF28=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt634); 
            IF28_tree = 
            (AslTree)adaptor.create(IF28)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF28_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt637);
            expr29=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr29.getTree());

            THEN30=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt639); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt642);
            block_instructions31=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions31.getTree());

            // /mnt/d/Downloads/Asl/src/parser/Asl.g:105:46: ( ELSE ! block_instructions )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ELSE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:105:47: ELSE ! block_instructions
                    {
                    ELSE32=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt645); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt648);
                    block_instructions33=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions33.getTree());

                    }
                    break;

            }


            ENDIF34=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt652); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ite_stmt"


    public static class while_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // /mnt/d/Downloads/Asl/src/parser/Asl.g:109:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE35=null;
        Token DO37=null;
        Token ENDWHILE39=null;
        AslParser.expr_return expr36 =null;

        AslParser.block_instructions_return block_instructions38 =null;


        AslTree WHILE35_tree=null;
        AslTree DO37_tree=null;
        AslTree ENDWHILE39_tree=null;

        try {
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:109:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:109:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE35=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt675); 
            WHILE35_tree = 
            (AslTree)adaptor.create(WHILE35)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE35_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt678);
            expr36=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr36.getTree());

            DO37=(Token)match(input,DO,FOLLOW_DO_in_while_stmt680); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt683);
            block_instructions38=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions38.getTree());

            ENDWHILE39=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt685); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_stmt"


    public static class return_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // /mnt/d/Downloads/Asl/src/parser/Asl.g:113:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN40=null;
        AslParser.expr_return expr41 =null;


        AslTree RETURN40_tree=null;

        try {
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:113:13: ( RETURN ^ ( expr )? )
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:113:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN40=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt708); 
            RETURN40_tree = 
            (AslTree)adaptor.create(RETURN40)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN40_tree, root_0);


            // /mnt/d/Downloads/Asl/src/parser/Asl.g:113:23: ( expr )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==FALSE||LA8_0==ID||LA8_0==INT||LA8_0==MINUS||LA8_0==NOT||LA8_0==PLUS||LA8_0==TRUE||LA8_0==49) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:113:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt711);
                    expr41=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr41.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_stmt"


    public static class read_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read"
    // /mnt/d/Downloads/Asl/src/parser/Asl.g:117:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ42=null;
        Token ID43=null;

        AslTree READ42_tree=null;
        AslTree ID43_tree=null;

        try {
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:117:6: ( READ ^ ID )
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:117:8: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ42=(Token)match(input,READ,FOLLOW_READ_in_read730); 
            READ42_tree = 
            (AslTree)adaptor.create(READ42)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ42_tree, root_0);


            ID43=(Token)match(input,ID,FOLLOW_ID_in_read733); 
            ID43_tree = 
            (AslTree)adaptor.create(ID43)
            ;
            adaptor.addChild(root_0, ID43_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "read"


    public static class write_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "write"
    // /mnt/d/Downloads/Asl/src/parser/Asl.g:121:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE44=null;
        Token STRING46=null;
        AslParser.expr_return expr45 =null;


        AslTree WRITE44_tree=null;
        AslTree STRING46_tree=null;

        try {
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:121:7: ( WRITE ^ ( expr | STRING ) )
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:121:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE44=(Token)match(input,WRITE,FOLLOW_WRITE_in_write753); 
            WRITE44_tree = 
            (AslTree)adaptor.create(WRITE44)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE44_tree, root_0);


            // /mnt/d/Downloads/Asl/src/parser/Asl.g:121:18: ( expr | STRING )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==FALSE||LA9_0==ID||LA9_0==INT||LA9_0==MINUS||LA9_0==NOT||LA9_0==PLUS||LA9_0==TRUE||LA9_0==49) ) {
                alt9=1;
            }
            else if ( (LA9_0==STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:121:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write757);
                    expr45=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr45.getTree());

                    }
                    break;
                case 2 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:121:26: STRING
                    {
                    STRING46=(Token)match(input,STRING,FOLLOW_STRING_in_write761); 
                    STRING46_tree = 
                    (AslTree)adaptor.create(STRING46)
                    ;
                    adaptor.addChild(root_0, STRING46_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "write"


    public static class expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /mnt/d/Downloads/Asl/src/parser/Asl.g:125:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR48=null;
        AslParser.boolterm_return boolterm47 =null;

        AslParser.boolterm_return boolterm49 =null;


        AslTree OR48_tree=null;

        try {
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:125:9: ( boolterm ( OR ^ boolterm )* )
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:125:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr786);
            boolterm47=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm47.getTree());

            // /mnt/d/Downloads/Asl/src/parser/Asl.g:125:22: ( OR ^ boolterm )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==OR) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /mnt/d/Downloads/Asl/src/parser/Asl.g:125:23: OR ^ boolterm
            	    {
            	    OR48=(Token)match(input,OR,FOLLOW_OR_in_expr789); 
            	    OR48_tree = 
            	    (AslTree)adaptor.create(OR48)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR48_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr792);
            	    boolterm49=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm49.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /mnt/d/Downloads/Asl/src/parser/Asl.g:128:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND51=null;
        AslParser.boolfact_return boolfact50 =null;

        AslParser.boolfact_return boolfact52 =null;


        AslTree AND51_tree=null;

        try {
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:128:9: ( boolfact ( AND ^ boolfact )* )
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:128:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm812);
            boolfact50=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact50.getTree());

            // /mnt/d/Downloads/Asl/src/parser/Asl.g:128:22: ( AND ^ boolfact )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==AND) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /mnt/d/Downloads/Asl/src/parser/Asl.g:128:23: AND ^ boolfact
            	    {
            	    AND51=(Token)match(input,AND,FOLLOW_AND_in_boolterm815); 
            	    AND51_tree = 
            	    (AslTree)adaptor.create(AND51)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND51_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm818);
            	    boolfact52=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact52.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /mnt/d/Downloads/Asl/src/parser/Asl.g:131:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL54=null;
        Token NOT_EQUAL55=null;
        Token LT56=null;
        Token LE57=null;
        Token GT58=null;
        Token GE59=null;
        AslParser.num_expr_return num_expr53 =null;

        AslParser.num_expr_return num_expr60 =null;


        AslTree EQUAL54_tree=null;
        AslTree NOT_EQUAL55_tree=null;
        AslTree LT56_tree=null;
        AslTree LE57_tree=null;
        AslTree GT58_tree=null;
        AslTree GE59_tree=null;

        try {
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:131:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:131:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact838);
            num_expr53=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr53.getTree());

            // /mnt/d/Downloads/Asl/src/parser/Asl.g:131:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==EQUAL||(LA13_0 >= GE && LA13_0 <= GT)||LA13_0==LE||LA13_0==LT||LA13_0==NOT_EQUAL) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:131:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:131:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt12=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt12=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt12=2;
                        }
                        break;
                    case LT:
                        {
                        alt12=3;
                        }
                        break;
                    case LE:
                        {
                        alt12=4;
                        }
                        break;
                    case GT:
                        {
                        alt12=5;
                        }
                        break;
                    case GE:
                        {
                        alt12=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;

                    }

                    switch (alt12) {
                        case 1 :
                            // /mnt/d/Downloads/Asl/src/parser/Asl.g:131:24: EQUAL ^
                            {
                            EQUAL54=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact842); 
                            EQUAL54_tree = 
                            (AslTree)adaptor.create(EQUAL54)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL54_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /mnt/d/Downloads/Asl/src/parser/Asl.g:131:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL55=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact847); 
                            NOT_EQUAL55_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL55)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL55_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /mnt/d/Downloads/Asl/src/parser/Asl.g:131:46: LT ^
                            {
                            LT56=(Token)match(input,LT,FOLLOW_LT_in_boolfact852); 
                            LT56_tree = 
                            (AslTree)adaptor.create(LT56)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT56_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /mnt/d/Downloads/Asl/src/parser/Asl.g:131:52: LE ^
                            {
                            LE57=(Token)match(input,LE,FOLLOW_LE_in_boolfact857); 
                            LE57_tree = 
                            (AslTree)adaptor.create(LE57)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE57_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /mnt/d/Downloads/Asl/src/parser/Asl.g:131:58: GT ^
                            {
                            GT58=(Token)match(input,GT,FOLLOW_GT_in_boolfact862); 
                            GT58_tree = 
                            (AslTree)adaptor.create(GT58)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT58_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /mnt/d/Downloads/Asl/src/parser/Asl.g:131:64: GE ^
                            {
                            GE59=(Token)match(input,GE,FOLLOW_GE_in_boolfact867); 
                            GE59_tree = 
                            (AslTree)adaptor.create(GE59)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE59_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact871);
                    num_expr60=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr60.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolfact"


    public static class num_expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_expr"
    // /mnt/d/Downloads/Asl/src/parser/Asl.g:134:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS62=null;
        Token MINUS63=null;
        AslParser.term_return term61 =null;

        AslParser.term_return term64 =null;


        AslTree PLUS62_tree=null;
        AslTree MINUS63_tree=null;

        try {
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:134:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:134:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr891);
            term61=term();

            state._fsp--;

            adaptor.addChild(root_0, term61.getTree());

            // /mnt/d/Downloads/Asl/src/parser/Asl.g:134:18: ( ( PLUS ^| MINUS ^) term )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==MINUS||LA15_0==PLUS) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /mnt/d/Downloads/Asl/src/parser/Asl.g:134:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /mnt/d/Downloads/Asl/src/parser/Asl.g:134:20: ( PLUS ^| MINUS ^)
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==PLUS) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==MINUS) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // /mnt/d/Downloads/Asl/src/parser/Asl.g:134:21: PLUS ^
            	            {
            	            PLUS62=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr896); 
            	            PLUS62_tree = 
            	            (AslTree)adaptor.create(PLUS62)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS62_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /mnt/d/Downloads/Asl/src/parser/Asl.g:134:29: MINUS ^
            	            {
            	            MINUS63=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr901); 
            	            MINUS63_tree = 
            	            (AslTree)adaptor.create(MINUS63)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS63_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr905);
            	    term64=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term64.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /mnt/d/Downloads/Asl/src/parser/Asl.g:137:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL66=null;
        Token DIV67=null;
        Token MOD68=null;
        AslParser.factor_return factor65 =null;

        AslParser.factor_return factor69 =null;


        AslTree MUL66_tree=null;
        AslTree DIV67_tree=null;
        AslTree MOD68_tree=null;

        try {
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:137:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:137:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term929);
            factor65=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor65.getTree());

            // /mnt/d/Downloads/Asl/src/parser/Asl.g:137:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==DIV||(LA17_0 >= MOD && LA17_0 <= MUL)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /mnt/d/Downloads/Asl/src/parser/Asl.g:137:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /mnt/d/Downloads/Asl/src/parser/Asl.g:137:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt16=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt16=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt16=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt16=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt16) {
            	        case 1 :
            	            // /mnt/d/Downloads/Asl/src/parser/Asl.g:137:23: MUL ^
            	            {
            	            MUL66=(Token)match(input,MUL,FOLLOW_MUL_in_term934); 
            	            MUL66_tree = 
            	            (AslTree)adaptor.create(MUL66)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL66_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /mnt/d/Downloads/Asl/src/parser/Asl.g:137:30: DIV ^
            	            {
            	            DIV67=(Token)match(input,DIV,FOLLOW_DIV_in_term939); 
            	            DIV67_tree = 
            	            (AslTree)adaptor.create(DIV67)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV67_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /mnt/d/Downloads/Asl/src/parser/Asl.g:137:37: MOD ^
            	            {
            	            MOD68=(Token)match(input,MOD,FOLLOW_MOD_in_term944); 
            	            MOD68_tree = 
            	            (AslTree)adaptor.create(MOD68)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD68_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term948);
            	    factor69=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor69.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /mnt/d/Downloads/Asl/src/parser/Asl.g:140:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT70=null;
        Token PLUS71=null;
        Token MINUS72=null;
        AslParser.atom_return atom73 =null;


        AslTree NOT70_tree=null;
        AslTree PLUS71_tree=null;
        AslTree MINUS72_tree=null;

        try {
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:140:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:140:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /mnt/d/Downloads/Asl/src/parser/Asl.g:140:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt18=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt18=1;
                    }
                    break;
                case PLUS:
                    {
                    alt18=2;
                    }
                    break;
                case MINUS:
                    {
                    alt18=3;
                    }
                    break;
            }

            switch (alt18) {
                case 1 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:140:14: NOT ^
                    {
                    NOT70=(Token)match(input,NOT,FOLLOW_NOT_in_factor971); 
                    NOT70_tree = 
                    (AslTree)adaptor.create(NOT70)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT70_tree, root_0);


                    }
                    break;
                case 2 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:140:21: PLUS ^
                    {
                    PLUS71=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor976); 
                    PLUS71_tree = 
                    (AslTree)adaptor.create(PLUS71)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS71_tree, root_0);


                    }
                    break;
                case 3 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:140:29: MINUS ^
                    {
                    MINUS72=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor981); 
                    MINUS72_tree = 
                    (AslTree)adaptor.create(MINUS72)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS72_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor986);
            atom73=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom73.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class atom_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /mnt/d/Downloads/Asl/src/parser/Asl.g:146:1: atom : ( var | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token INT75=null;
        Token char_literal77=null;
        Token char_literal79=null;
        AslParser.var_return var74 =null;

        AslParser.funcall_return funcall76 =null;

        AslParser.expr_return expr78 =null;


        AslTree b_tree=null;
        AslTree INT75_tree=null;
        AslTree char_literal77_tree=null;
        AslTree char_literal79_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:146:9: ( var | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt20=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==AND||(LA20_1 >= DIV && LA20_1 <= EQUAL)||(LA20_1 >= GE && LA20_1 <= GT)||LA20_1==LE||(LA20_1 >= LT && LA20_1 <= MUL)||(LA20_1 >= NOT_EQUAL && LA20_1 <= OR)||LA20_1==PLUS||LA20_1==THEN||(LA20_1 >= 50 && LA20_1 <= 54)) ) {
                    alt20=1;
                }
                else if ( (LA20_1==49) ) {
                    alt20=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt20=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt20=3;
                }
                break;
            case 49:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:146:13: var
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_var_in_atom1011);
                    var74=var();

                    state._fsp--;

                    adaptor.addChild(root_0, var74.getTree());

                    }
                    break;
                case 2 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:147:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT75=(Token)match(input,INT,FOLLOW_INT_in_atom1025); 
                    INT75_tree = 
                    (AslTree)adaptor.create(INT75)
                    ;
                    adaptor.addChild(root_0, INT75_tree);


                    }
                    break;
                case 3 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:148:13: (b= TRUE |b= FALSE )
                    {
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:148:13: (b= TRUE |b= FALSE )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==TRUE) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==FALSE) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;

                    }
                    switch (alt19) {
                        case 1 :
                            // /mnt/d/Downloads/Asl/src/parser/Asl.g:148:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1042);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /mnt/d/Downloads/Asl/src/parser/Asl.g:148:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1048);  
                            stream_FALSE.add(b);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 148:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /mnt/d/Downloads/Asl/src/parser/Asl.g:148:36: ^( BOOLEAN[$b,$b.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(BOOLEAN, b, (b!=null?b.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:149:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1071);
                    funcall76=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall76.getTree());

                    }
                    break;
                case 5 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:150:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal77=(Token)match(input,49,FOLLOW_49_in_atom1085); 

                    pushFollow(FOLLOW_expr_in_atom1088);
                    expr78=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr78.getTree());

                    char_literal79=(Token)match(input,50,FOLLOW_50_in_atom1090); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class funcall_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // /mnt/d/Downloads/Asl/src/parser/Asl.g:154:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID80=null;
        Token char_literal81=null;
        Token char_literal83=null;
        AslParser.expr_list_return expr_list82 =null;


        AslTree ID80_tree=null;
        AslTree char_literal81_tree=null;
        AslTree char_literal83_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:154:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:154:13: ID '(' ( expr_list )? ')'
            {
            ID80=(Token)match(input,ID,FOLLOW_ID_in_funcall1111);  
            stream_ID.add(ID80);


            char_literal81=(Token)match(input,49,FOLLOW_49_in_funcall1113);  
            stream_49.add(char_literal81);


            // /mnt/d/Downloads/Asl/src/parser/Asl.g:154:20: ( expr_list )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==FALSE||LA21_0==ID||LA21_0==INT||LA21_0==MINUS||LA21_0==NOT||LA21_0==PLUS||LA21_0==TRUE||LA21_0==49) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:154:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1115);
                    expr_list82=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list82.getTree());

                    }
                    break;

            }


            char_literal83=(Token)match(input,50,FOLLOW_50_in_funcall1118);  
            stream_50.add(char_literal83);


            // AST REWRITE
            // elements: expr_list, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 154:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /mnt/d/Downloads/Asl/src/parser/Asl.g:154:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /mnt/d/Downloads/Asl/src/parser/Asl.g:154:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /mnt/d/Downloads/Asl/src/parser/Asl.g:154:61: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcall"


    public static class expr_list_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_list"
    // /mnt/d/Downloads/Asl/src/parser/Asl.g:158:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal85=null;
        AslParser.expr_return expr84 =null;

        AslParser.expr_return expr86 =null;


        AslTree char_literal85_tree=null;

        try {
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:158:10: ( expr ( ',' ! expr )* )
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:158:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1151);
            expr84=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr84.getTree());

            // /mnt/d/Downloads/Asl/src/parser/Asl.g:158:18: ( ',' ! expr )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==51) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /mnt/d/Downloads/Asl/src/parser/Asl.g:158:19: ',' ! expr
            	    {
            	    char_literal85=(Token)match(input,51,FOLLOW_51_in_expr_list1154); 

            	    pushFollow(FOLLOW_expr_in_expr_list1157);
            	    expr86=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr86.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_list"


    public static class var_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var"
    // /mnt/d/Downloads/Asl/src/parser/Asl.g:161:1: var : ( ID | ID '[' expr ']' -> ^( VECTOR ID expr ) );
    public final AslParser.var_return var() throws RecognitionException {
        AslParser.var_return retval = new AslParser.var_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID87=null;
        Token ID88=null;
        Token char_literal89=null;
        Token char_literal91=null;
        AslParser.expr_return expr90 =null;


        AslTree ID87_tree=null;
        AslTree ID88_tree=null;
        AslTree char_literal89_tree=null;
        AslTree char_literal91_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /mnt/d/Downloads/Asl/src/parser/Asl.g:161:5: ( ID | ID '[' expr ']' -> ^( VECTOR ID expr ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==53) ) {
                    alt23=2;
                }
                else if ( (LA23_1==AND||(LA23_1 >= DIV && LA23_1 <= EQUAL)||(LA23_1 >= GE && LA23_1 <= GT)||LA23_1==LE||(LA23_1 >= LT && LA23_1 <= MUL)||(LA23_1 >= NOT_EQUAL && LA23_1 <= OR)||LA23_1==PLUS||LA23_1==THEN||(LA23_1 >= 50 && LA23_1 <= 52)||LA23_1==54) ) {
                    alt23=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:161:7: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID87=(Token)match(input,ID,FOLLOW_ID_in_var1176); 
                    ID87_tree = 
                    (AslTree)adaptor.create(ID87)
                    ;
                    adaptor.addChild(root_0, ID87_tree);


                    }
                    break;
                case 2 :
                    // /mnt/d/Downloads/Asl/src/parser/Asl.g:162:7: ID '[' expr ']'
                    {
                    ID88=(Token)match(input,ID,FOLLOW_ID_in_var1184);  
                    stream_ID.add(ID88);


                    char_literal89=(Token)match(input,53,FOLLOW_53_in_var1185);  
                    stream_53.add(char_literal89);


                    pushFollow(FOLLOW_expr_in_var1186);
                    expr90=expr();

                    state._fsp--;

                    stream_expr.add(expr90.getTree());

                    char_literal91=(Token)match(input,54,FOLLOW_54_in_var1187);  
                    stream_54.add(char_literal91);


                    // AST REWRITE
                    // elements: expr, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 162:20: -> ^( VECTOR ID expr )
                    {
                        // /mnt/d/Downloads/Asl/src/parser/Asl.g:162:23: ^( VECTOR ID expr )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(VECTOR, "VECTOR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "var"

    // Delegated rules


 

    public static final BitSet FOLLOW_func_in_prog170 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EOF_in_prog173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func212 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_func215 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_params_in_func217 = new BitSet(new long[]{0x0010618000C00000L});
    public static final BitSet FOLLOW_block_instructions_in_func219 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_params240 = new BitSet(new long[]{0x0005000000400000L});
    public static final BitSet FOLLOW_paramlist_in_params242 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_params245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist271 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_paramlist274 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_param_in_paramlist277 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_48_in_param302 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_param306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_param327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions362 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_block_instructions365 = new BitSet(new long[]{0x0010618000C00000L});
    public static final BitSet FOLLOW_instruction_in_block_instructions367 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_assign599 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUAL_in_assign603 = new BitSet(new long[]{0x0002081121420000L});
    public static final BitSet FOLLOW_expr_in_assign605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt634 = new BitSet(new long[]{0x0002081121420000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt637 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt639 = new BitSet(new long[]{0x0010618000C00000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt642 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt645 = new BitSet(new long[]{0x0010618000C00000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt648 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt675 = new BitSet(new long[]{0x0002081121420000L});
    public static final BitSet FOLLOW_expr_in_while_stmt678 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DO_in_while_stmt680 = new BitSet(new long[]{0x0010618000C00000L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt683 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt708 = new BitSet(new long[]{0x0002081121420002L});
    public static final BitSet FOLLOW_expr_in_return_stmt711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read730 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ID_in_read733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write753 = new BitSet(new long[]{0x00020A1121420000L});
    public static final BitSet FOLLOW_expr_in_write757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr786 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_OR_in_expr789 = new BitSet(new long[]{0x0002081121420000L});
    public static final BitSet FOLLOW_boolterm_in_expr792 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm812 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm815 = new BitSet(new long[]{0x0002081121420000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm818 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact838 = new BitSet(new long[]{0x0000000212308002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact842 = new BitSet(new long[]{0x0002081121420000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact847 = new BitSet(new long[]{0x0002081121420000L});
    public static final BitSet FOLLOW_LT_in_boolfact852 = new BitSet(new long[]{0x0002081121420000L});
    public static final BitSet FOLLOW_LE_in_boolfact857 = new BitSet(new long[]{0x0002081121420000L});
    public static final BitSet FOLLOW_GT_in_boolfact862 = new BitSet(new long[]{0x0002081121420000L});
    public static final BitSet FOLLOW_GE_in_boolfact867 = new BitSet(new long[]{0x0002081121420000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr891 = new BitSet(new long[]{0x0000001020000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr896 = new BitSet(new long[]{0x0002081121420000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr901 = new BitSet(new long[]{0x0002081121420000L});
    public static final BitSet FOLLOW_term_in_num_expr905 = new BitSet(new long[]{0x0000001020000002L});
    public static final BitSet FOLLOW_factor_in_term929 = new BitSet(new long[]{0x00000000C0000202L});
    public static final BitSet FOLLOW_MUL_in_term934 = new BitSet(new long[]{0x0002081121420000L});
    public static final BitSet FOLLOW_DIV_in_term939 = new BitSet(new long[]{0x0002081121420000L});
    public static final BitSet FOLLOW_MOD_in_term944 = new BitSet(new long[]{0x0002081121420000L});
    public static final BitSet FOLLOW_factor_in_term948 = new BitSet(new long[]{0x00000000C0000202L});
    public static final BitSet FOLLOW_NOT_in_factor971 = new BitSet(new long[]{0x0002080001420000L});
    public static final BitSet FOLLOW_PLUS_in_factor976 = new BitSet(new long[]{0x0002080001420000L});
    public static final BitSet FOLLOW_MINUS_in_factor981 = new BitSet(new long[]{0x0002080001420000L});
    public static final BitSet FOLLOW_atom_in_factor986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_atom1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_atom1085 = new BitSet(new long[]{0x0002081121420000L});
    public static final BitSet FOLLOW_expr_in_atom1088 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_atom1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1111 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_funcall1113 = new BitSet(new long[]{0x0006081121420000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1115 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_funcall1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1151 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_expr_list1154 = new BitSet(new long[]{0x0002081121420000L});
    public static final BitSet FOLLOW_expr_in_expr_list1157 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ID_in_var1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_var1184 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_var1185 = new BitSet(new long[]{0x0002081121420000L});
    public static final BitSet FOLLOW_expr_in_var1186 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_var1187 = new BitSet(new long[]{0x0000000000000002L});

}