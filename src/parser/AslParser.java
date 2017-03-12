// $ANTLR 3.4 D:\\Asl\\src\\parser\\Asl.g 2017-03-12 17:31:46

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "BOOLEAN", "COMMENT", "DIV", "DO", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FACTORIAL", "FALSE", "FUNC", "FUNCALL", "FUNCVEC", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "PREF", "PVALUE", "QUESTION", "READ", "RETURN", "SIZE", "STRING", "SUMFUNC", "TERNARY", "THEN", "TRUE", "VARLIST", "VECTOR", "WHILE", "WRITE", "WS", "'&'", "'('", "')'", "','", "'.size'", "':'", "';'", "'['", "']'"
    };

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
    public String getGrammarFileName() { return "D:\\Asl\\src\\parser\\Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // D:\\Asl\\src\\parser\\Asl.g:65:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
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
            // D:\\Asl\\src\\parser\\Asl.g:65:6: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // D:\\Asl\\src\\parser\\Asl.g:65:8: ( func )+ EOF
            {
            // D:\\Asl\\src\\parser\\Asl.g:65:8: ( func )+
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
            	    // D:\\Asl\\src\\parser\\Asl.g:65:8: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog198);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog201);  
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
            // 65:18: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // D:\\Asl\\src\\parser\\Asl.g:65:21: ^( LIST_FUNCTIONS ( func )+ )
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
    // D:\\Asl\\src\\parser\\Asl.g:69:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
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
            // D:\\Asl\\src\\parser\\Asl.g:69:6: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // D:\\Asl\\src\\parser\\Asl.g:69:8: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func240); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func243); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func245);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_func247);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func249); 

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
    // D:\\Asl\\src\\parser\\Asl.g:73:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.paramlist_return paramlist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // D:\\Asl\\src\\parser\\Asl.g:73:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // D:\\Asl\\src\\parser\\Asl.g:73:10: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,56,FOLLOW_56_in_params268);  
            stream_56.add(char_literal8);


            // D:\\Asl\\src\\parser\\Asl.g:73:14: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==55) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\Asl\\src\\parser\\Asl.g:73:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params270);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,57,FOLLOW_57_in_params273);  
            stream_57.add(char_literal10);


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
            // 73:29: -> ^( PARAMS ( paramlist )? )
            {
                // D:\\Asl\\src\\parser\\Asl.g:73:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // D:\\Asl\\src\\parser\\Asl.g:73:41: ( paramlist )?
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
    // D:\\Asl\\src\\parser\\Asl.g:77:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // D:\\Asl\\src\\parser\\Asl.g:77:10: ( param ( ',' ! param )* )
            // D:\\Asl\\src\\parser\\Asl.g:77:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist299);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // D:\\Asl\\src\\parser\\Asl.g:77:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==58) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Asl\\src\\parser\\Asl.g:77:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,58,FOLLOW_58_in_paramlist302); 

            	    pushFollow(FOLLOW_param_in_paramlist305);
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
    // D:\\Asl\\src\\parser\\Asl.g:82:1: param : ( '&' id= ID -> ^( PREF[$id, $id.text] ) |id= ID -> ^( PVALUE[$id, $id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal14=null;

        AslTree id_tree=null;
        AslTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // D:\\Asl\\src\\parser\\Asl.g:82:9: ( '&' id= ID -> ^( PREF[$id, $id.text] ) |id= ID -> ^( PVALUE[$id, $id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==55) ) {
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
                    // D:\\Asl\\src\\parser\\Asl.g:82:13: '&' id= ID
                    {
                    char_literal14=(Token)match(input,55,FOLLOW_55_in_param330);  
                    stream_55.add(char_literal14);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param334);  
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
                    // 82:23: -> ^( PREF[$id, $id.text] )
                    {
                        // D:\\Asl\\src\\parser\\Asl.g:82:26: ^( PREF[$id, $id.text] )
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
                    // D:\\Asl\\src\\parser\\Asl.g:83:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param357);  
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
                    // 83:19: -> ^( PVALUE[$id, $id.text] )
                    {
                        // D:\\Asl\\src\\parser\\Asl.g:83:22: ^( PVALUE[$id, $id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PVALUE, id, (id!=null?id.getText():null))
                        , root_1);

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
    // D:\\Asl\\src\\parser\\Asl.g:87:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal16=null;
        AslParser.instruction_return instruction15 =null;

        AslParser.instruction_return instruction17 =null;


        AslTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // D:\\Asl\\src\\parser\\Asl.g:88:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // D:\\Asl\\src\\parser\\Asl.g:88:12: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions391);
            instruction15=instruction();

            state._fsp--;

            stream_instruction.add(instruction15.getTree());

            // D:\\Asl\\src\\parser\\Asl.g:88:24: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==61) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Asl\\src\\parser\\Asl.g:88:25: ';' instruction
            	    {
            	    char_literal16=(Token)match(input,61,FOLLOW_61_in_block_instructions394);  
            	    stream_61.add(char_literal16);


            	    pushFollow(FOLLOW_instruction_in_block_instructions396);
            	    instruction17=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction17.getTree());

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
            // 89:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // D:\\Asl\\src\\parser\\Asl.g:89:16: ^( LIST_INSTR ( instruction )+ )
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
    // D:\\Asl\\src\\parser\\Asl.g:93:1: instruction : ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |);
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assign_return assign18 =null;

        AslParser.ite_stmt_return ite_stmt19 =null;

        AslParser.while_stmt_return while_stmt20 =null;

        AslParser.funcall_return funcall21 =null;

        AslParser.return_stmt_return return_stmt22 =null;

        AslParser.read_return read23 =null;

        AslParser.write_return write24 =null;



        try {
            // D:\\Asl\\src\\parser\\Asl.g:94:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |)
            int alt6=8;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EQUAL||(LA6_1 >= 58 && LA6_1 <= 59)||LA6_1==62) ) {
                    alt6=1;
                }
                else if ( (LA6_1==56) ) {
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
            case 61:
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
                    // D:\\Asl\\src\\parser\\Asl.g:94:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction445);
                    assign18=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign18.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Asl\\src\\parser\\Asl.g:95:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction467);
                    ite_stmt19=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt19.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Asl\\src\\parser\\Asl.g:96:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction487);
                    while_stmt20=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt20.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Asl\\src\\parser\\Asl.g:97:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction507);
                    funcall21=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall21.getTree());

                    }
                    break;
                case 5 :
                    // D:\\Asl\\src\\parser\\Asl.g:98:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction528);
                    return_stmt22=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt22.getTree());

                    }
                    break;
                case 6 :
                    // D:\\Asl\\src\\parser\\Asl.g:99:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction545);
                    read23=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read23.getTree());

                    }
                    break;
                case 7 :
                    // D:\\Asl\\src\\parser\\Asl.g:100:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction570);
                    write24=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write24.getTree());

                    }
                    break;
                case 8 :
                    // D:\\Asl\\src\\parser\\Asl.g:102:9: 
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
    // D:\\Asl\\src\\parser\\Asl.g:105:1: assign : var ( ',' var )* eq= EQUAL expr_list -> ^( ASSIGN[$eq,\":=\"] ^( VARLIST ( var )+ ) ^( ARGLIST expr_list ) ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token char_literal26=null;
        AslParser.var_return var25 =null;

        AslParser.var_return var27 =null;

        AslParser.expr_list_return expr_list28 =null;


        AslTree eq_tree=null;
        AslTree char_literal26_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var");
        try {
            // D:\\Asl\\src\\parser\\Asl.g:105:8: ( var ( ',' var )* eq= EQUAL expr_list -> ^( ASSIGN[$eq,\":=\"] ^( VARLIST ( var )+ ) ^( ARGLIST expr_list ) ) )
            // D:\\Asl\\src\\parser\\Asl.g:105:10: var ( ',' var )* eq= EQUAL expr_list
            {
            pushFollow(FOLLOW_var_in_assign628);
            var25=var();

            state._fsp--;

            stream_var.add(var25.getTree());

            // D:\\Asl\\src\\parser\\Asl.g:105:13: ( ',' var )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==58) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Asl\\src\\parser\\Asl.g:105:14: ',' var
            	    {
            	    char_literal26=(Token)match(input,58,FOLLOW_58_in_assign630);  
            	    stream_58.add(char_literal26);


            	    pushFollow(FOLLOW_var_in_assign632);
            	    var27=var();

            	    state._fsp--;

            	    stream_var.add(var27.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign638);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_list_in_assign640);
            expr_list28=expr_list();

            state._fsp--;

            stream_expr_list.add(expr_list28.getTree());

            // AST REWRITE
            // elements: var, expr_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 105:43: -> ^( ASSIGN[$eq,\":=\"] ^( VARLIST ( var )+ ) ^( ARGLIST expr_list ) )
            {
                // D:\\Asl\\src\\parser\\Asl.g:105:46: ^( ASSIGN[$eq,\":=\"] ^( VARLIST ( var )+ ) ^( ARGLIST expr_list ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ASSIGN, eq, ":=")
                , root_1);

                // D:\\Asl\\src\\parser\\Asl.g:105:65: ^( VARLIST ( var )+ )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(VARLIST, "VARLIST")
                , root_2);

                if ( !(stream_var.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_var.hasNext() ) {
                    adaptor.addChild(root_2, stream_var.nextTree());

                }
                stream_var.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Asl\\src\\parser\\Asl.g:105:81: ^( ARGLIST expr_list )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                adaptor.addChild(root_2, stream_expr_list.nextTree());

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
    // $ANTLR end "assign"


    public static class ite_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // D:\\Asl\\src\\parser\\Asl.g:109:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF29=null;
        Token THEN31=null;
        Token ELSE33=null;
        Token ENDIF35=null;
        AslParser.expr_return expr30 =null;

        AslParser.block_instructions_return block_instructions32 =null;

        AslParser.block_instructions_return block_instructions34 =null;


        AslTree IF29_tree=null;
        AslTree THEN31_tree=null;
        AslTree ELSE33_tree=null;
        AslTree ENDIF35_tree=null;

        try {
            // D:\\Asl\\src\\parser\\Asl.g:109:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // D:\\Asl\\src\\parser\\Asl.g:109:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF29=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt678); 
            IF29_tree = 
            (AslTree)adaptor.create(IF29)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF29_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt681);
            expr30=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr30.getTree());

            THEN31=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt683); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt686);
            block_instructions32=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions32.getTree());

            // D:\\Asl\\src\\parser\\Asl.g:109:46: ( ELSE ! block_instructions )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ELSE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\Asl\\src\\parser\\Asl.g:109:47: ELSE ! block_instructions
                    {
                    ELSE33=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt689); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt692);
                    block_instructions34=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions34.getTree());

                    }
                    break;

            }


            ENDIF35=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt696); 

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
    // D:\\Asl\\src\\parser\\Asl.g:113:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE36=null;
        Token DO38=null;
        Token ENDWHILE40=null;
        AslParser.expr_return expr37 =null;

        AslParser.block_instructions_return block_instructions39 =null;


        AslTree WHILE36_tree=null;
        AslTree DO38_tree=null;
        AslTree ENDWHILE40_tree=null;

        try {
            // D:\\Asl\\src\\parser\\Asl.g:113:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // D:\\Asl\\src\\parser\\Asl.g:113:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE36=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt719); 
            WHILE36_tree = 
            (AslTree)adaptor.create(WHILE36)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE36_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt722);
            expr37=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr37.getTree());

            DO38=(Token)match(input,DO,FOLLOW_DO_in_while_stmt724); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt727);
            block_instructions39=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions39.getTree());

            ENDWHILE40=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt729); 

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
    // D:\\Asl\\src\\parser\\Asl.g:117:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN41=null;
        AslParser.expr_return expr42 =null;


        AslTree RETURN41_tree=null;

        try {
            // D:\\Asl\\src\\parser\\Asl.g:117:13: ( RETURN ^ ( expr )? )
            // D:\\Asl\\src\\parser\\Asl.g:117:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN41=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt752); 
            RETURN41_tree = 
            (AslTree)adaptor.create(RETURN41)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN41_tree, root_0);


            // D:\\Asl\\src\\parser\\Asl.g:117:23: ( expr )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==FALSE||LA9_0==ID||LA9_0==INT||LA9_0==MINUS||LA9_0==NOT||LA9_0==PLUS||(LA9_0 >= STRING && LA9_0 <= SUMFUNC)||LA9_0==TRUE||LA9_0==56) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // D:\\Asl\\src\\parser\\Asl.g:117:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt755);
                    expr42=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr42.getTree());

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
    // D:\\Asl\\src\\parser\\Asl.g:121:1: read : READ ^ var ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ43=null;
        AslParser.var_return var44 =null;


        AslTree READ43_tree=null;

        try {
            // D:\\Asl\\src\\parser\\Asl.g:121:6: ( READ ^ var )
            // D:\\Asl\\src\\parser\\Asl.g:121:8: READ ^ var
            {
            root_0 = (AslTree)adaptor.nil();


            READ43=(Token)match(input,READ,FOLLOW_READ_in_read774); 
            READ43_tree = 
            (AslTree)adaptor.create(READ43)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ43_tree, root_0);


            pushFollow(FOLLOW_var_in_read777);
            var44=var();

            state._fsp--;

            adaptor.addChild(root_0, var44.getTree());

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
    // D:\\Asl\\src\\parser\\Asl.g:125:1: write : WRITE ^ expr ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE45=null;
        AslParser.expr_return expr46 =null;


        AslTree WRITE45_tree=null;

        try {
            // D:\\Asl\\src\\parser\\Asl.g:125:7: ( WRITE ^ expr )
            // D:\\Asl\\src\\parser\\Asl.g:125:11: WRITE ^ expr
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE45=(Token)match(input,WRITE,FOLLOW_WRITE_in_write797); 
            WRITE45_tree = 
            (AslTree)adaptor.create(WRITE45)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE45_tree, root_0);


            pushFollow(FOLLOW_expr_in_write800);
            expr46=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr46.getTree());

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
    // D:\\Asl\\src\\parser\\Asl.g:129:1: expr : orexpr ( QUESTION ^ expr ':' ! expr )? ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token QUESTION48=null;
        Token char_literal50=null;
        AslParser.orexpr_return orexpr47 =null;

        AslParser.expr_return expr49 =null;

        AslParser.expr_return expr51 =null;


        AslTree QUESTION48_tree=null;
        AslTree char_literal50_tree=null;

        try {
            // D:\\Asl\\src\\parser\\Asl.g:129:9: ( orexpr ( QUESTION ^ expr ':' ! expr )? )
            // D:\\Asl\\src\\parser\\Asl.g:129:13: orexpr ( QUESTION ^ expr ':' ! expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_orexpr_in_expr823);
            orexpr47=orexpr();

            state._fsp--;

            adaptor.addChild(root_0, orexpr47.getTree());

            // D:\\Asl\\src\\parser\\Asl.g:129:20: ( QUESTION ^ expr ':' ! expr )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==QUESTION) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Asl\\src\\parser\\Asl.g:129:21: QUESTION ^ expr ':' ! expr
                    {
                    QUESTION48=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_expr826); 
                    QUESTION48_tree = 
                    (AslTree)adaptor.create(QUESTION48)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(QUESTION48_tree, root_0);


                    pushFollow(FOLLOW_expr_in_expr829);
                    expr49=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr49.getTree());

                    char_literal50=(Token)match(input,60,FOLLOW_60_in_expr831); 

                    pushFollow(FOLLOW_expr_in_expr834);
                    expr51=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr51.getTree());

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
    // $ANTLR end "expr"


    public static class orexpr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orexpr"
    // D:\\Asl\\src\\parser\\Asl.g:131:1: orexpr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.orexpr_return orexpr() throws RecognitionException {
        AslParser.orexpr_return retval = new AslParser.orexpr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR53=null;
        AslParser.boolterm_return boolterm52 =null;

        AslParser.boolterm_return boolterm54 =null;


        AslTree OR53_tree=null;

        try {
            // D:\\Asl\\src\\parser\\Asl.g:131:9: ( boolterm ( OR ^ boolterm )* )
            // D:\\Asl\\src\\parser\\Asl.g:131:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_orexpr847);
            boolterm52=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm52.getTree());

            // D:\\Asl\\src\\parser\\Asl.g:131:22: ( OR ^ boolterm )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==OR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\Asl\\src\\parser\\Asl.g:131:23: OR ^ boolterm
            	    {
            	    OR53=(Token)match(input,OR,FOLLOW_OR_in_orexpr850); 
            	    OR53_tree = 
            	    (AslTree)adaptor.create(OR53)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR53_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_orexpr853);
            	    boolterm54=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm54.getTree());

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
    // $ANTLR end "orexpr"


    public static class boolterm_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // D:\\Asl\\src\\parser\\Asl.g:134:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND56=null;
        AslParser.boolfact_return boolfact55 =null;

        AslParser.boolfact_return boolfact57 =null;


        AslTree AND56_tree=null;

        try {
            // D:\\Asl\\src\\parser\\Asl.g:134:9: ( boolfact ( AND ^ boolfact )* )
            // D:\\Asl\\src\\parser\\Asl.g:134:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm873);
            boolfact55=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact55.getTree());

            // D:\\Asl\\src\\parser\\Asl.g:134:22: ( AND ^ boolfact )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==AND) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\Asl\\src\\parser\\Asl.g:134:23: AND ^ boolfact
            	    {
            	    AND56=(Token)match(input,AND,FOLLOW_AND_in_boolterm876); 
            	    AND56_tree = 
            	    (AslTree)adaptor.create(AND56)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND56_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm879);
            	    boolfact57=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact57.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // D:\\Asl\\src\\parser\\Asl.g:137:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL59=null;
        Token NOT_EQUAL60=null;
        Token LT61=null;
        Token LE62=null;
        Token GT63=null;
        Token GE64=null;
        AslParser.num_expr_return num_expr58 =null;

        AslParser.num_expr_return num_expr65 =null;


        AslTree EQUAL59_tree=null;
        AslTree NOT_EQUAL60_tree=null;
        AslTree LT61_tree=null;
        AslTree LE62_tree=null;
        AslTree GT63_tree=null;
        AslTree GE64_tree=null;

        try {
            // D:\\Asl\\src\\parser\\Asl.g:137:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // D:\\Asl\\src\\parser\\Asl.g:137:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact899);
            num_expr58=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr58.getTree());

            // D:\\Asl\\src\\parser\\Asl.g:137:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EQUAL||(LA14_0 >= GE && LA14_0 <= GT)||LA14_0==LE||LA14_0==LT||LA14_0==NOT_EQUAL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\Asl\\src\\parser\\Asl.g:137:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // D:\\Asl\\src\\parser\\Asl.g:137:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt13=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt13=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt13=2;
                        }
                        break;
                    case LT:
                        {
                        alt13=3;
                        }
                        break;
                    case LE:
                        {
                        alt13=4;
                        }
                        break;
                    case GT:
                        {
                        alt13=5;
                        }
                        break;
                    case GE:
                        {
                        alt13=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;

                    }

                    switch (alt13) {
                        case 1 :
                            // D:\\Asl\\src\\parser\\Asl.g:137:24: EQUAL ^
                            {
                            EQUAL59=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact903); 
                            EQUAL59_tree = 
                            (AslTree)adaptor.create(EQUAL59)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL59_tree, root_0);


                            }
                            break;
                        case 2 :
                            // D:\\Asl\\src\\parser\\Asl.g:137:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL60=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact908); 
                            NOT_EQUAL60_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL60)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL60_tree, root_0);


                            }
                            break;
                        case 3 :
                            // D:\\Asl\\src\\parser\\Asl.g:137:46: LT ^
                            {
                            LT61=(Token)match(input,LT,FOLLOW_LT_in_boolfact913); 
                            LT61_tree = 
                            (AslTree)adaptor.create(LT61)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT61_tree, root_0);


                            }
                            break;
                        case 4 :
                            // D:\\Asl\\src\\parser\\Asl.g:137:52: LE ^
                            {
                            LE62=(Token)match(input,LE,FOLLOW_LE_in_boolfact918); 
                            LE62_tree = 
                            (AslTree)adaptor.create(LE62)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE62_tree, root_0);


                            }
                            break;
                        case 5 :
                            // D:\\Asl\\src\\parser\\Asl.g:137:58: GT ^
                            {
                            GT63=(Token)match(input,GT,FOLLOW_GT_in_boolfact923); 
                            GT63_tree = 
                            (AslTree)adaptor.create(GT63)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT63_tree, root_0);


                            }
                            break;
                        case 6 :
                            // D:\\Asl\\src\\parser\\Asl.g:137:64: GE ^
                            {
                            GE64=(Token)match(input,GE,FOLLOW_GE_in_boolfact928); 
                            GE64_tree = 
                            (AslTree)adaptor.create(GE64)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE64_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact932);
                    num_expr65=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr65.getTree());

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
    // D:\\Asl\\src\\parser\\Asl.g:140:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS67=null;
        Token MINUS68=null;
        AslParser.term_return term66 =null;

        AslParser.term_return term69 =null;


        AslTree PLUS67_tree=null;
        AslTree MINUS68_tree=null;

        try {
            // D:\\Asl\\src\\parser\\Asl.g:140:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // D:\\Asl\\src\\parser\\Asl.g:140:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr952);
            term66=term();

            state._fsp--;

            adaptor.addChild(root_0, term66.getTree());

            // D:\\Asl\\src\\parser\\Asl.g:140:18: ( ( PLUS ^| MINUS ^) term )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==MINUS||LA16_0==PLUS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // D:\\Asl\\src\\parser\\Asl.g:140:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // D:\\Asl\\src\\parser\\Asl.g:140:20: ( PLUS ^| MINUS ^)
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==PLUS) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==MINUS) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // D:\\Asl\\src\\parser\\Asl.g:140:21: PLUS ^
            	            {
            	            PLUS67=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr957); 
            	            PLUS67_tree = 
            	            (AslTree)adaptor.create(PLUS67)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS67_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // D:\\Asl\\src\\parser\\Asl.g:140:29: MINUS ^
            	            {
            	            MINUS68=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr962); 
            	            MINUS68_tree = 
            	            (AslTree)adaptor.create(MINUS68)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS68_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr966);
            	    term69=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term69.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // D:\\Asl\\src\\parser\\Asl.g:143:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL71=null;
        Token DIV72=null;
        Token MOD73=null;
        AslParser.factor_return factor70 =null;

        AslParser.factor_return factor74 =null;


        AslTree MUL71_tree=null;
        AslTree DIV72_tree=null;
        AslTree MOD73_tree=null;

        try {
            // D:\\Asl\\src\\parser\\Asl.g:143:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // D:\\Asl\\src\\parser\\Asl.g:143:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term990);
            factor70=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor70.getTree());

            // D:\\Asl\\src\\parser\\Asl.g:143:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==DIV||(LA18_0 >= MOD && LA18_0 <= MUL)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // D:\\Asl\\src\\parser\\Asl.g:143:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // D:\\Asl\\src\\parser\\Asl.g:143:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt17=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // D:\\Asl\\src\\parser\\Asl.g:143:23: MUL ^
            	            {
            	            MUL71=(Token)match(input,MUL,FOLLOW_MUL_in_term995); 
            	            MUL71_tree = 
            	            (AslTree)adaptor.create(MUL71)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL71_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // D:\\Asl\\src\\parser\\Asl.g:143:30: DIV ^
            	            {
            	            DIV72=(Token)match(input,DIV,FOLLOW_DIV_in_term1000); 
            	            DIV72_tree = 
            	            (AslTree)adaptor.create(DIV72)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV72_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // D:\\Asl\\src\\parser\\Asl.g:143:37: MOD ^
            	            {
            	            MOD73=(Token)match(input,MOD,FOLLOW_MOD_in_term1005); 
            	            MOD73_tree = 
            	            (AslTree)adaptor.create(MOD73)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD73_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1009);
            	    factor74=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor74.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // D:\\Asl\\src\\parser\\Asl.g:146:1: factor : ( NOT ^| PLUS ^| MINUS ^)? factorial ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT75=null;
        Token PLUS76=null;
        Token MINUS77=null;
        AslParser.factorial_return factorial78 =null;


        AslTree NOT75_tree=null;
        AslTree PLUS76_tree=null;
        AslTree MINUS77_tree=null;

        try {
            // D:\\Asl\\src\\parser\\Asl.g:146:9: ( ( NOT ^| PLUS ^| MINUS ^)? factorial )
            // D:\\Asl\\src\\parser\\Asl.g:146:13: ( NOT ^| PLUS ^| MINUS ^)? factorial
            {
            root_0 = (AslTree)adaptor.nil();


            // D:\\Asl\\src\\parser\\Asl.g:146:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt19=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt19=1;
                    }
                    break;
                case PLUS:
                    {
                    alt19=2;
                    }
                    break;
                case MINUS:
                    {
                    alt19=3;
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // D:\\Asl\\src\\parser\\Asl.g:146:14: NOT ^
                    {
                    NOT75=(Token)match(input,NOT,FOLLOW_NOT_in_factor1032); 
                    NOT75_tree = 
                    (AslTree)adaptor.create(NOT75)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT75_tree, root_0);


                    }
                    break;
                case 2 :
                    // D:\\Asl\\src\\parser\\Asl.g:146:21: PLUS ^
                    {
                    PLUS76=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1037); 
                    PLUS76_tree = 
                    (AslTree)adaptor.create(PLUS76)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS76_tree, root_0);


                    }
                    break;
                case 3 :
                    // D:\\Asl\\src\\parser\\Asl.g:146:29: MINUS ^
                    {
                    MINUS77=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1042); 
                    MINUS77_tree = 
                    (AslTree)adaptor.create(MINUS77)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS77_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_factorial_in_factor1047);
            factorial78=factorial();

            state._fsp--;

            adaptor.addChild(root_0, factorial78.getTree());

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


    public static class factorial_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factorial"
    // D:\\Asl\\src\\parser\\Asl.g:148:1: factorial : atom ( FACTORIAL ^)* ;
    public final AslParser.factorial_return factorial() throws RecognitionException {
        AslParser.factorial_return retval = new AslParser.factorial_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FACTORIAL80=null;
        AslParser.atom_return atom79 =null;


        AslTree FACTORIAL80_tree=null;

        try {
            // D:\\Asl\\src\\parser\\Asl.g:148:10: ( atom ( FACTORIAL ^)* )
            // D:\\Asl\\src\\parser\\Asl.g:148:13: atom ( FACTORIAL ^)*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_atom_in_factorial1063);
            atom79=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom79.getTree());

            // D:\\Asl\\src\\parser\\Asl.g:148:27: ( FACTORIAL ^)*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==FACTORIAL) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // D:\\Asl\\src\\parser\\Asl.g:148:27: FACTORIAL ^
            	    {
            	    FACTORIAL80=(Token)match(input,FACTORIAL,FOLLOW_FACTORIAL_in_factorial1065); 
            	    FACTORIAL80_tree = 
            	    (AslTree)adaptor.create(FACTORIAL80)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(FACTORIAL80_tree, root_0);


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "factorial"


    public static class atom_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // D:\\Asl\\src\\parser\\Asl.g:152:1: atom : ( var | STRING | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | SUMFUNC ^ '(' ! ( expr_list )? ')' !| '(' ! expr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token STRING82=null;
        Token INT83=null;
        Token SUMFUNC85=null;
        Token char_literal86=null;
        Token char_literal88=null;
        Token char_literal89=null;
        Token char_literal91=null;
        AslParser.var_return var81 =null;

        AslParser.funcall_return funcall84 =null;

        AslParser.expr_list_return expr_list87 =null;

        AslParser.expr_return expr90 =null;


        AslTree b_tree=null;
        AslTree STRING82_tree=null;
        AslTree INT83_tree=null;
        AslTree SUMFUNC85_tree=null;
        AslTree char_literal86_tree=null;
        AslTree char_literal88_tree=null;
        AslTree char_literal89_tree=null;
        AslTree char_literal91_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // D:\\Asl\\src\\parser\\Asl.g:152:9: ( var | STRING | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | SUMFUNC ^ '(' ! ( expr_list )? ')' !| '(' ! expr ')' !)
            int alt23=7;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==AND||(LA23_1 >= DIV && LA23_1 <= EQUAL)||LA23_1==FACTORIAL||(LA23_1 >= GE && LA23_1 <= GT)||LA23_1==LE||(LA23_1 >= LT && LA23_1 <= MUL)||(LA23_1 >= NOT_EQUAL && LA23_1 <= OR)||LA23_1==PLUS||LA23_1==QUESTION||LA23_1==THEN||(LA23_1 >= 57 && LA23_1 <= 63)) ) {
                    alt23=1;
                }
                else if ( (LA23_1==56) ) {
                    alt23=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;

                }
                }
                break;
            case STRING:
                {
                alt23=2;
                }
                break;
            case INT:
                {
                alt23=3;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt23=4;
                }
                break;
            case SUMFUNC:
                {
                alt23=6;
                }
                break;
            case 56:
                {
                alt23=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // D:\\Asl\\src\\parser\\Asl.g:152:13: var
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_var_in_atom1082);
                    var81=var();

                    state._fsp--;

                    adaptor.addChild(root_0, var81.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Asl\\src\\parser\\Asl.g:153:13: STRING
                    {
                    root_0 = (AslTree)adaptor.nil();


                    STRING82=(Token)match(input,STRING,FOLLOW_STRING_in_atom1096); 
                    STRING82_tree = 
                    (AslTree)adaptor.create(STRING82)
                    ;
                    adaptor.addChild(root_0, STRING82_tree);


                    }
                    break;
                case 3 :
                    // D:\\Asl\\src\\parser\\Asl.g:154:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT83=(Token)match(input,INT,FOLLOW_INT_in_atom1110); 
                    INT83_tree = 
                    (AslTree)adaptor.create(INT83)
                    ;
                    adaptor.addChild(root_0, INT83_tree);


                    }
                    break;
                case 4 :
                    // D:\\Asl\\src\\parser\\Asl.g:155:13: (b= TRUE |b= FALSE )
                    {
                    // D:\\Asl\\src\\parser\\Asl.g:155:13: (b= TRUE |b= FALSE )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==TRUE) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==FALSE) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;

                    }
                    switch (alt21) {
                        case 1 :
                            // D:\\Asl\\src\\parser\\Asl.g:155:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1127);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // D:\\Asl\\src\\parser\\Asl.g:155:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1133);  
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
                    // 155:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // D:\\Asl\\src\\parser\\Asl.g:155:36: ^( BOOLEAN[$b,$b.text] )
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
                case 5 :
                    // D:\\Asl\\src\\parser\\Asl.g:156:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1156);
                    funcall84=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall84.getTree());

                    }
                    break;
                case 6 :
                    // D:\\Asl\\src\\parser\\Asl.g:157:13: SUMFUNC ^ '(' ! ( expr_list )? ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    SUMFUNC85=(Token)match(input,SUMFUNC,FOLLOW_SUMFUNC_in_atom1170); 
                    SUMFUNC85_tree = 
                    (AslTree)adaptor.create(SUMFUNC85)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(SUMFUNC85_tree, root_0);


                    char_literal86=(Token)match(input,56,FOLLOW_56_in_atom1172); 

                    // D:\\Asl\\src\\parser\\Asl.g:157:26: ( expr_list )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==FALSE||LA22_0==ID||LA22_0==INT||LA22_0==MINUS||LA22_0==NOT||LA22_0==PLUS||(LA22_0 >= STRING && LA22_0 <= SUMFUNC)||LA22_0==TRUE||LA22_0==56) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // D:\\Asl\\src\\parser\\Asl.g:157:26: expr_list
                            {
                            pushFollow(FOLLOW_expr_list_in_atom1175);
                            expr_list87=expr_list();

                            state._fsp--;

                            adaptor.addChild(root_0, expr_list87.getTree());

                            }
                            break;

                    }


                    char_literal88=(Token)match(input,57,FOLLOW_57_in_atom1178); 

                    }
                    break;
                case 7 :
                    // D:\\Asl\\src\\parser\\Asl.g:158:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal89=(Token)match(input,56,FOLLOW_56_in_atom1193); 

                    pushFollow(FOLLOW_expr_in_atom1196);
                    expr90=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr90.getTree());

                    char_literal91=(Token)match(input,57,FOLLOW_57_in_atom1198); 

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
    // D:\\Asl\\src\\parser\\Asl.g:162:1: funcall : ID '(' ( expr_list )? ')' ( '[' expr ']' )? -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ( expr )? ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID92=null;
        Token char_literal93=null;
        Token char_literal95=null;
        Token char_literal96=null;
        Token char_literal98=null;
        AslParser.expr_list_return expr_list94 =null;

        AslParser.expr_return expr97 =null;


        AslTree ID92_tree=null;
        AslTree char_literal93_tree=null;
        AslTree char_literal95_tree=null;
        AslTree char_literal96_tree=null;
        AslTree char_literal98_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\Asl\\src\\parser\\Asl.g:162:9: ( ID '(' ( expr_list )? ')' ( '[' expr ']' )? -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ( expr )? ) )
            // D:\\Asl\\src\\parser\\Asl.g:162:13: ID '(' ( expr_list )? ')' ( '[' expr ']' )?
            {
            ID92=(Token)match(input,ID,FOLLOW_ID_in_funcall1219);  
            stream_ID.add(ID92);


            char_literal93=(Token)match(input,56,FOLLOW_56_in_funcall1221);  
            stream_56.add(char_literal93);


            // D:\\Asl\\src\\parser\\Asl.g:162:20: ( expr_list )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==FALSE||LA24_0==ID||LA24_0==INT||LA24_0==MINUS||LA24_0==NOT||LA24_0==PLUS||(LA24_0 >= STRING && LA24_0 <= SUMFUNC)||LA24_0==TRUE||LA24_0==56) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // D:\\Asl\\src\\parser\\Asl.g:162:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1223);
                    expr_list94=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list94.getTree());

                    }
                    break;

            }


            char_literal95=(Token)match(input,57,FOLLOW_57_in_funcall1226);  
            stream_57.add(char_literal95);


            // D:\\Asl\\src\\parser\\Asl.g:162:34: ( '[' expr ']' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==62) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\Asl\\src\\parser\\Asl.g:162:35: '[' expr ']'
                    {
                    char_literal96=(Token)match(input,62,FOLLOW_62_in_funcall1228);  
                    stream_62.add(char_literal96);


                    pushFollow(FOLLOW_expr_in_funcall1229);
                    expr97=expr();

                    state._fsp--;

                    stream_expr.add(expr97.getTree());

                    char_literal98=(Token)match(input,63,FOLLOW_63_in_funcall1230);  
                    stream_63.add(char_literal98);


                    }
                    break;

            }


            // AST REWRITE
            // elements: expr_list, expr, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 162:48: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ( expr )? )
            {
                // D:\\Asl\\src\\parser\\Asl.g:162:51: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ( expr )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // D:\\Asl\\src\\parser\\Asl.g:162:64: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // D:\\Asl\\src\\parser\\Asl.g:162:74: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();

                adaptor.addChild(root_1, root_2);
                }

                // D:\\Asl\\src\\parser\\Asl.g:162:86: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

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
    // D:\\Asl\\src\\parser\\Asl.g:166:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal100=null;
        AslParser.expr_return expr99 =null;

        AslParser.expr_return expr101 =null;


        AslTree char_literal100_tree=null;

        try {
            // D:\\Asl\\src\\parser\\Asl.g:166:10: ( expr ( ',' ! expr )* )
            // D:\\Asl\\src\\parser\\Asl.g:166:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1268);
            expr99=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr99.getTree());

            // D:\\Asl\\src\\parser\\Asl.g:166:18: ( ',' ! expr )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==58) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // D:\\Asl\\src\\parser\\Asl.g:166:19: ',' ! expr
            	    {
            	    char_literal100=(Token)match(input,58,FOLLOW_58_in_expr_list1271); 

            	    pushFollow(FOLLOW_expr_in_expr_list1274);
            	    expr101=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr101.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // D:\\Asl\\src\\parser\\Asl.g:169:1: var : ( ID |id= ID '[' expr ']' -> ^( VECTOR[$id.text] expr ) |id= ID '.size' -> ^( SIZE[$id.text] ) );
    public final AslParser.var_return var() throws RecognitionException {
        AslParser.var_return retval = new AslParser.var_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token ID102=null;
        Token char_literal103=null;
        Token char_literal105=null;
        Token string_literal106=null;
        AslParser.expr_return expr104 =null;


        AslTree id_tree=null;
        AslTree ID102_tree=null;
        AslTree char_literal103_tree=null;
        AslTree char_literal105_tree=null;
        AslTree string_literal106_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\Asl\\src\\parser\\Asl.g:169:5: ( ID |id= ID '[' expr ']' -> ^( VECTOR[$id.text] expr ) |id= ID '.size' -> ^( SIZE[$id.text] ) )
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ID) ) {
                switch ( input.LA(2) ) {
                case 62:
                    {
                    alt27=2;
                    }
                    break;
                case 59:
                    {
                    alt27=3;
                    }
                    break;
                case AND:
                case DIV:
                case DO:
                case ELSE:
                case ENDFUNC:
                case ENDIF:
                case ENDWHILE:
                case EQUAL:
                case FACTORIAL:
                case GE:
                case GT:
                case LE:
                case LT:
                case MINUS:
                case MOD:
                case MUL:
                case NOT_EQUAL:
                case OR:
                case PLUS:
                case QUESTION:
                case THEN:
                case 57:
                case 58:
                case 60:
                case 61:
                case 63:
                    {
                    alt27=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // D:\\Asl\\src\\parser\\Asl.g:169:7: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID102=(Token)match(input,ID,FOLLOW_ID_in_var1293); 
                    ID102_tree = 
                    (AslTree)adaptor.create(ID102)
                    ;
                    adaptor.addChild(root_0, ID102_tree);


                    }
                    break;
                case 2 :
                    // D:\\Asl\\src\\parser\\Asl.g:170:7: id= ID '[' expr ']'
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_var1303);  
                    stream_ID.add(id);


                    char_literal103=(Token)match(input,62,FOLLOW_62_in_var1304);  
                    stream_62.add(char_literal103);


                    pushFollow(FOLLOW_expr_in_var1305);
                    expr104=expr();

                    state._fsp--;

                    stream_expr.add(expr104.getTree());

                    char_literal105=(Token)match(input,63,FOLLOW_63_in_var1306);  
                    stream_63.add(char_literal105);


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 170:23: -> ^( VECTOR[$id.text] expr )
                    {
                        // D:\\Asl\\src\\parser\\Asl.g:170:26: ^( VECTOR[$id.text] expr )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(VECTOR, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // D:\\Asl\\src\\parser\\Asl.g:171:7: id= ID '.size'
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_var1325);  
                    stream_ID.add(id);


                    string_literal106=(Token)match(input,59,FOLLOW_59_in_var1326);  
                    stream_59.add(string_literal106);


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
                    // 171:20: -> ^( SIZE[$id.text] )
                    {
                        // D:\\Asl\\src\\parser\\Asl.g:171:23: ^( SIZE[$id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(SIZE, (id!=null?id.getText():null))
                        , root_1);

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


 

    public static final BitSet FOLLOW_func_in_prog198 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EOF_in_prog201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func240 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_func243 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_params_in_func245 = new BitSet(new long[]{0x20300C0003000000L});
    public static final BitSet FOLLOW_block_instructions_in_func247 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_params268 = new BitSet(new long[]{0x0280000001000000L});
    public static final BitSet FOLLOW_paramlist_in_params270 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_params273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist299 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_paramlist302 = new BitSet(new long[]{0x0080000001000000L});
    public static final BitSet FOLLOW_param_in_paramlist305 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_55_in_param330 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_param334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions391 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_block_instructions394 = new BitSet(new long[]{0x20300C0003000000L});
    public static final BitSet FOLLOW_instruction_in_block_instructions396 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_assign628 = new BitSet(new long[]{0x0400000000008000L});
    public static final BitSet FOLLOW_58_in_assign630 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_var_in_assign632 = new BitSet(new long[]{0x0400000000008000L});
    public static final BitSet FOLLOW_EQUAL_in_assign638 = new BitSet(new long[]{0x0102604485040000L});
    public static final BitSet FOLLOW_expr_list_in_assign640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt678 = new BitSet(new long[]{0x0102604485040000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt681 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt683 = new BitSet(new long[]{0x20300C0003000000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt686 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt689 = new BitSet(new long[]{0x20300C0003000000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt692 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt719 = new BitSet(new long[]{0x0102604485040000L});
    public static final BitSet FOLLOW_expr_in_while_stmt722 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DO_in_while_stmt724 = new BitSet(new long[]{0x20300C0003000000L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt727 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt752 = new BitSet(new long[]{0x0102604485040002L});
    public static final BitSet FOLLOW_expr_in_return_stmt755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read774 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_var_in_read777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write797 = new BitSet(new long[]{0x0102604485040000L});
    public static final BitSet FOLLOW_expr_in_write800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orexpr_in_expr823 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_QUESTION_in_expr826 = new BitSet(new long[]{0x0102604485040000L});
    public static final BitSet FOLLOW_expr_in_expr829 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_expr831 = new BitSet(new long[]{0x0102604485040000L});
    public static final BitSet FOLLOW_expr_in_expr834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_orexpr847 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_OR_in_orexpr850 = new BitSet(new long[]{0x0102604485040000L});
    public static final BitSet FOLLOW_boolterm_in_orexpr853 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm873 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm876 = new BitSet(new long[]{0x0102604485040000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm879 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact899 = new BitSet(new long[]{0x0000000848C08002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact903 = new BitSet(new long[]{0x0102604485040000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact908 = new BitSet(new long[]{0x0102604485040000L});
    public static final BitSet FOLLOW_LT_in_boolfact913 = new BitSet(new long[]{0x0102604485040000L});
    public static final BitSet FOLLOW_LE_in_boolfact918 = new BitSet(new long[]{0x0102604485040000L});
    public static final BitSet FOLLOW_GT_in_boolfact923 = new BitSet(new long[]{0x0102604485040000L});
    public static final BitSet FOLLOW_GE_in_boolfact928 = new BitSet(new long[]{0x0102604485040000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr952 = new BitSet(new long[]{0x0000004080000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr957 = new BitSet(new long[]{0x0102604485040000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr962 = new BitSet(new long[]{0x0102604485040000L});
    public static final BitSet FOLLOW_term_in_num_expr966 = new BitSet(new long[]{0x0000004080000002L});
    public static final BitSet FOLLOW_factor_in_term990 = new BitSet(new long[]{0x0000000300000202L});
    public static final BitSet FOLLOW_MUL_in_term995 = new BitSet(new long[]{0x0102604485040000L});
    public static final BitSet FOLLOW_DIV_in_term1000 = new BitSet(new long[]{0x0102604485040000L});
    public static final BitSet FOLLOW_MOD_in_term1005 = new BitSet(new long[]{0x0102604485040000L});
    public static final BitSet FOLLOW_factor_in_term1009 = new BitSet(new long[]{0x0000000300000202L});
    public static final BitSet FOLLOW_NOT_in_factor1032 = new BitSet(new long[]{0x0102600005040000L});
    public static final BitSet FOLLOW_PLUS_in_factor1037 = new BitSet(new long[]{0x0102600005040000L});
    public static final BitSet FOLLOW_MINUS_in_factor1042 = new BitSet(new long[]{0x0102600005040000L});
    public static final BitSet FOLLOW_factorial_in_factor1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_factorial1063 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_FACTORIAL_in_factorial1065 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_var_in_atom1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUMFUNC_in_atom1170 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_atom1172 = new BitSet(new long[]{0x0302604485040000L});
    public static final BitSet FOLLOW_expr_list_in_atom1175 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_atom1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_atom1193 = new BitSet(new long[]{0x0102604485040000L});
    public static final BitSet FOLLOW_expr_in_atom1196 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_atom1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1219 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_funcall1221 = new BitSet(new long[]{0x0302604485040000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1223 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_funcall1226 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_funcall1228 = new BitSet(new long[]{0x0102604485040000L});
    public static final BitSet FOLLOW_expr_in_funcall1229 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_funcall1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1268 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_expr_list1271 = new BitSet(new long[]{0x0102604485040000L});
    public static final BitSet FOLLOW_expr_in_expr_list1274 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ID_in_var1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_var1303 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_var1304 = new BitSet(new long[]{0x0102604485040000L});
    public static final BitSet FOLLOW_expr_in_var1305 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_var1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_var1325 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_var1326 = new BitSet(new long[]{0x0000000000000002L});

}