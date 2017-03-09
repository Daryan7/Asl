// $ANTLR 3.4 F:\\Compiladores\\Asl\\src\\parser\\Asl.g 2017-03-09 15:54:12

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "BOOLEAN", "COMMENT", "DIV", "DO", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "FUNCVEC", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "PREF", "PVALUE", "READ", "RETURN", "STRING", "TERNARY", "THEN", "TRUE", "VECTOR", "WHILE", "WRITE", "WS", "'&'", "'('", "')'", "','", "':'", "';'", "'?'", "'['", "']'"
    };

    public static final int EOF=-1;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
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
    public static final int FUNCVEC=20;
    public static final int GE=21;
    public static final int GT=22;
    public static final int ID=23;
    public static final int IF=24;
    public static final int INT=25;
    public static final int LE=26;
    public static final int LIST_FUNCTIONS=27;
    public static final int LIST_INSTR=28;
    public static final int LT=29;
    public static final int MINUS=30;
    public static final int MOD=31;
    public static final int MUL=32;
    public static final int NOT=33;
    public static final int NOT_EQUAL=34;
    public static final int OR=35;
    public static final int PARAMS=36;
    public static final int PLUS=37;
    public static final int PREF=38;
    public static final int PVALUE=39;
    public static final int READ=40;
    public static final int RETURN=41;
    public static final int STRING=42;
    public static final int TERNARY=43;
    public static final int THEN=44;
    public static final int TRUE=45;
    public static final int VECTOR=46;
    public static final int WHILE=47;
    public static final int WRITE=48;
    public static final int WS=49;

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
    public String getGrammarFileName() { return "F:\\Compiladores\\Asl\\src\\parser\\Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:63:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
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
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:63:6: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:63:8: ( func )+ EOF
            {
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:63:8: ( func )+
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
            	    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:63:8: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog184);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog187);  
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
            // 63:18: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:63:21: ^( LIST_FUNCTIONS ( func )+ )
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
    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:67:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
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
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:67:6: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:67:8: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func226); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func229); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func231);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_func233);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func235); 

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
    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:71:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.paramlist_return paramlist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:71:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:71:10: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,51,FOLLOW_51_in_params254);  
            stream_51.add(char_literal8);


            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:71:14: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==50) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:71:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params256);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,52,FOLLOW_52_in_params259);  
            stream_52.add(char_literal10);


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
            // 71:29: -> ^( PARAMS ( paramlist )? )
            {
                // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:71:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:71:41: ( paramlist )?
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
    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:75:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:75:10: ( param ( ',' ! param )* )
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:75:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist285);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:75:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==53) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:75:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,53,FOLLOW_53_in_paramlist288); 

            	    pushFollow(FOLLOW_param_in_paramlist291);
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
    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:80:1: param : ( '&' id= ID -> ^( PREF[$id, $id.text] ) |id= ID -> ^( PVALUE[$id, $id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal14=null;

        AslTree id_tree=null;
        AslTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");

        try {
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:80:9: ( '&' id= ID -> ^( PREF[$id, $id.text] ) |id= ID -> ^( PVALUE[$id, $id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==50) ) {
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
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:80:13: '&' id= ID
                    {
                    char_literal14=(Token)match(input,50,FOLLOW_50_in_param316);  
                    stream_50.add(char_literal14);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param320);  
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
                    // 80:23: -> ^( PREF[$id, $id.text] )
                    {
                        // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:80:26: ^( PREF[$id, $id.text] )
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
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:81:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param343);  
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
                    // 81:19: -> ^( PVALUE[$id, $id.text] )
                    {
                        // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:81:22: ^( PVALUE[$id, $id.text] )
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
    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:85:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal16=null;
        AslParser.instruction_return instruction15 =null;

        AslParser.instruction_return instruction17 =null;


        AslTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:86:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:86:12: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions377);
            instruction15=instruction();

            state._fsp--;

            stream_instruction.add(instruction15.getTree());

            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:86:24: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==55) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:86:25: ';' instruction
            	    {
            	    char_literal16=(Token)match(input,55,FOLLOW_55_in_block_instructions380);  
            	    stream_55.add(char_literal16);


            	    pushFollow(FOLLOW_instruction_in_block_instructions382);
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
            // 87:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:87:16: ^( LIST_INSTR ( instruction )+ )
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
    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:91:1: instruction : ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |);
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
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:92:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |)
            int alt6=8;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EQUAL||LA6_1==57) ) {
                    alt6=1;
                }
                else if ( (LA6_1==51) ) {
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
            case 55:
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
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:92:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction431);
                    assign18=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign18.getTree());

                    }
                    break;
                case 2 :
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:93:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction453);
                    ite_stmt19=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt19.getTree());

                    }
                    break;
                case 3 :
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:94:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction473);
                    while_stmt20=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt20.getTree());

                    }
                    break;
                case 4 :
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:95:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction493);
                    funcall21=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall21.getTree());

                    }
                    break;
                case 5 :
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:96:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction514);
                    return_stmt22=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt22.getTree());

                    }
                    break;
                case 6 :
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:97:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction531);
                    read23=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read23.getTree());

                    }
                    break;
                case 7 :
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:98:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction556);
                    write24=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write24.getTree());

                    }
                    break;
                case 8 :
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:100:9: 
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
    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:103:1: assign : var eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] var expr ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        AslParser.var_return var25 =null;

        AslParser.expr_return expr26 =null;


        AslTree eq_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:103:8: ( var eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] var expr ) )
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:103:10: var eq= EQUAL expr
            {
            pushFollow(FOLLOW_var_in_assign614);
            var25=var();

            state._fsp--;

            stream_var.add(var25.getTree());

            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign618);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign620);
            expr26=expr();

            state._fsp--;

            stream_expr.add(expr26.getTree());

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
            // 103:28: -> ^( ASSIGN[$eq,\":=\"] var expr )
            {
                // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:103:31: ^( ASSIGN[$eq,\":=\"] var expr )
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
    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:107:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF27=null;
        Token THEN29=null;
        Token ELSE31=null;
        Token ENDIF33=null;
        AslParser.expr_return expr28 =null;

        AslParser.block_instructions_return block_instructions30 =null;

        AslParser.block_instructions_return block_instructions32 =null;


        AslTree IF27_tree=null;
        AslTree THEN29_tree=null;
        AslTree ELSE31_tree=null;
        AslTree ENDIF33_tree=null;

        try {
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:107:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:107:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF27=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt649); 
            IF27_tree = 
            (AslTree)adaptor.create(IF27)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF27_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt652);
            expr28=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr28.getTree());

            THEN29=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt654); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt657);
            block_instructions30=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions30.getTree());

            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:107:46: ( ELSE ! block_instructions )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ELSE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:107:47: ELSE ! block_instructions
                    {
                    ELSE31=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt660); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt663);
                    block_instructions32=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions32.getTree());

                    }
                    break;

            }


            ENDIF33=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt667); 

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
    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:111:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE34=null;
        Token DO36=null;
        Token ENDWHILE38=null;
        AslParser.expr_return expr35 =null;

        AslParser.block_instructions_return block_instructions37 =null;


        AslTree WHILE34_tree=null;
        AslTree DO36_tree=null;
        AslTree ENDWHILE38_tree=null;

        try {
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:111:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:111:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE34=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt690); 
            WHILE34_tree = 
            (AslTree)adaptor.create(WHILE34)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE34_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt693);
            expr35=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr35.getTree());

            DO36=(Token)match(input,DO,FOLLOW_DO_in_while_stmt695); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt698);
            block_instructions37=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions37.getTree());

            ENDWHILE38=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt700); 

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
    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:115:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN39=null;
        AslParser.expr_return expr40 =null;


        AslTree RETURN39_tree=null;

        try {
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:115:13: ( RETURN ^ ( expr )? )
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:115:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN39=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt723); 
            RETURN39_tree = 
            (AslTree)adaptor.create(RETURN39)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN39_tree, root_0);


            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:115:23: ( expr )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==FALSE||LA8_0==ID||LA8_0==INT||LA8_0==MINUS||LA8_0==NOT||LA8_0==PLUS||LA8_0==TRUE||LA8_0==51) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:115:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt726);
                    expr40=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr40.getTree());

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
    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:119:1: read : READ ^ var ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ41=null;
        AslParser.var_return var42 =null;


        AslTree READ41_tree=null;

        try {
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:119:6: ( READ ^ var )
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:119:8: READ ^ var
            {
            root_0 = (AslTree)adaptor.nil();


            READ41=(Token)match(input,READ,FOLLOW_READ_in_read745); 
            READ41_tree = 
            (AslTree)adaptor.create(READ41)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ41_tree, root_0);


            pushFollow(FOLLOW_var_in_read748);
            var42=var();

            state._fsp--;

            adaptor.addChild(root_0, var42.getTree());

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
    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:123:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE43=null;
        Token STRING45=null;
        AslParser.expr_return expr44 =null;


        AslTree WRITE43_tree=null;
        AslTree STRING45_tree=null;

        try {
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:123:7: ( WRITE ^ ( expr | STRING ) )
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:123:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE43=(Token)match(input,WRITE,FOLLOW_WRITE_in_write768); 
            WRITE43_tree = 
            (AslTree)adaptor.create(WRITE43)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE43_tree, root_0);


            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:123:18: ( expr | STRING )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==FALSE||LA9_0==ID||LA9_0==INT||LA9_0==MINUS||LA9_0==NOT||LA9_0==PLUS||LA9_0==TRUE||LA9_0==51) ) {
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
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:123:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write772);
                    expr44=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr44.getTree());

                    }
                    break;
                case 2 :
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:123:26: STRING
                    {
                    STRING45=(Token)match(input,STRING,FOLLOW_STRING_in_write776); 
                    STRING45_tree = 
                    (AslTree)adaptor.create(STRING45)
                    ;
                    adaptor.addChild(root_0, STRING45_tree);


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
    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:127:1: expr : orexpr ( '?' ^ orexpr ':' ! orexpr )? ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal47=null;
        Token char_literal49=null;
        AslParser.orexpr_return orexpr46 =null;

        AslParser.orexpr_return orexpr48 =null;

        AslParser.orexpr_return orexpr50 =null;


        AslTree char_literal47_tree=null;
        AslTree char_literal49_tree=null;

        try {
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:127:9: ( orexpr ( '?' ^ orexpr ':' ! orexpr )? )
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:127:13: orexpr ( '?' ^ orexpr ':' ! orexpr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_orexpr_in_expr801);
            orexpr46=orexpr();

            state._fsp--;

            adaptor.addChild(root_0, orexpr46.getTree());

            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:127:20: ( '?' ^ orexpr ':' ! orexpr )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==56) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:127:21: '?' ^ orexpr ':' ! orexpr
                    {
                    char_literal47=(Token)match(input,56,FOLLOW_56_in_expr804); 
                    char_literal47_tree = 
                    (AslTree)adaptor.create(char_literal47)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(char_literal47_tree, root_0);


                    pushFollow(FOLLOW_orexpr_in_expr807);
                    orexpr48=orexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, orexpr48.getTree());

                    char_literal49=(Token)match(input,54,FOLLOW_54_in_expr809); 

                    pushFollow(FOLLOW_orexpr_in_expr812);
                    orexpr50=orexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, orexpr50.getTree());

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
    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:129:1: orexpr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.orexpr_return orexpr() throws RecognitionException {
        AslParser.orexpr_return retval = new AslParser.orexpr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR52=null;
        AslParser.boolterm_return boolterm51 =null;

        AslParser.boolterm_return boolterm53 =null;


        AslTree OR52_tree=null;

        try {
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:129:11: ( boolterm ( OR ^ boolterm )* )
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:129:15: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_orexpr827);
            boolterm51=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm51.getTree());

            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:129:24: ( OR ^ boolterm )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==OR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:129:25: OR ^ boolterm
            	    {
            	    OR52=(Token)match(input,OR,FOLLOW_OR_in_orexpr830); 
            	    OR52_tree = 
            	    (AslTree)adaptor.create(OR52)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR52_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_orexpr833);
            	    boolterm53=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm53.getTree());

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
    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:132:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND55=null;
        AslParser.boolfact_return boolfact54 =null;

        AslParser.boolfact_return boolfact56 =null;


        AslTree AND55_tree=null;

        try {
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:132:9: ( boolfact ( AND ^ boolfact )* )
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:132:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm853);
            boolfact54=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact54.getTree());

            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:132:22: ( AND ^ boolfact )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==AND) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:132:23: AND ^ boolfact
            	    {
            	    AND55=(Token)match(input,AND,FOLLOW_AND_in_boolterm856); 
            	    AND55_tree = 
            	    (AslTree)adaptor.create(AND55)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND55_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm859);
            	    boolfact56=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact56.getTree());

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
    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:135:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL58=null;
        Token NOT_EQUAL59=null;
        Token LT60=null;
        Token LE61=null;
        Token GT62=null;
        Token GE63=null;
        AslParser.num_expr_return num_expr57 =null;

        AslParser.num_expr_return num_expr64 =null;


        AslTree EQUAL58_tree=null;
        AslTree NOT_EQUAL59_tree=null;
        AslTree LT60_tree=null;
        AslTree LE61_tree=null;
        AslTree GT62_tree=null;
        AslTree GE63_tree=null;

        try {
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:135:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:135:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact879);
            num_expr57=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr57.getTree());

            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:135:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EQUAL||(LA14_0 >= GE && LA14_0 <= GT)||LA14_0==LE||LA14_0==LT||LA14_0==NOT_EQUAL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:135:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:135:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
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
                            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:135:24: EQUAL ^
                            {
                            EQUAL58=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact883); 
                            EQUAL58_tree = 
                            (AslTree)adaptor.create(EQUAL58)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL58_tree, root_0);


                            }
                            break;
                        case 2 :
                            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:135:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL59=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact888); 
                            NOT_EQUAL59_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL59)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL59_tree, root_0);


                            }
                            break;
                        case 3 :
                            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:135:46: LT ^
                            {
                            LT60=(Token)match(input,LT,FOLLOW_LT_in_boolfact893); 
                            LT60_tree = 
                            (AslTree)adaptor.create(LT60)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT60_tree, root_0);


                            }
                            break;
                        case 4 :
                            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:135:52: LE ^
                            {
                            LE61=(Token)match(input,LE,FOLLOW_LE_in_boolfact898); 
                            LE61_tree = 
                            (AslTree)adaptor.create(LE61)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE61_tree, root_0);


                            }
                            break;
                        case 5 :
                            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:135:58: GT ^
                            {
                            GT62=(Token)match(input,GT,FOLLOW_GT_in_boolfact903); 
                            GT62_tree = 
                            (AslTree)adaptor.create(GT62)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT62_tree, root_0);


                            }
                            break;
                        case 6 :
                            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:135:64: GE ^
                            {
                            GE63=(Token)match(input,GE,FOLLOW_GE_in_boolfact908); 
                            GE63_tree = 
                            (AslTree)adaptor.create(GE63)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE63_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact912);
                    num_expr64=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr64.getTree());

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
    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:138:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS66=null;
        Token MINUS67=null;
        AslParser.term_return term65 =null;

        AslParser.term_return term68 =null;


        AslTree PLUS66_tree=null;
        AslTree MINUS67_tree=null;

        try {
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:138:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:138:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr932);
            term65=term();

            state._fsp--;

            adaptor.addChild(root_0, term65.getTree());

            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:138:18: ( ( PLUS ^| MINUS ^) term )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==MINUS||LA16_0==PLUS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:138:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:138:20: ( PLUS ^| MINUS ^)
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
            	            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:138:21: PLUS ^
            	            {
            	            PLUS66=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr937); 
            	            PLUS66_tree = 
            	            (AslTree)adaptor.create(PLUS66)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS66_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:138:29: MINUS ^
            	            {
            	            MINUS67=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr942); 
            	            MINUS67_tree = 
            	            (AslTree)adaptor.create(MINUS67)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS67_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr946);
            	    term68=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term68.getTree());

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
    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:141:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL70=null;
        Token DIV71=null;
        Token MOD72=null;
        AslParser.factor_return factor69 =null;

        AslParser.factor_return factor73 =null;


        AslTree MUL70_tree=null;
        AslTree DIV71_tree=null;
        AslTree MOD72_tree=null;

        try {
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:141:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:141:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term970);
            factor69=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor69.getTree());

            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:141:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==DIV||(LA18_0 >= MOD && LA18_0 <= MUL)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:141:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:141:22: ( MUL ^| DIV ^| MOD ^)
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
            	            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:141:23: MUL ^
            	            {
            	            MUL70=(Token)match(input,MUL,FOLLOW_MUL_in_term975); 
            	            MUL70_tree = 
            	            (AslTree)adaptor.create(MUL70)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL70_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:141:30: DIV ^
            	            {
            	            DIV71=(Token)match(input,DIV,FOLLOW_DIV_in_term980); 
            	            DIV71_tree = 
            	            (AslTree)adaptor.create(DIV71)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV71_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:141:37: MOD ^
            	            {
            	            MOD72=(Token)match(input,MOD,FOLLOW_MOD_in_term985); 
            	            MOD72_tree = 
            	            (AslTree)adaptor.create(MOD72)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD72_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term989);
            	    factor73=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor73.getTree());

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
    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:144:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT74=null;
        Token PLUS75=null;
        Token MINUS76=null;
        AslParser.atom_return atom77 =null;


        AslTree NOT74_tree=null;
        AslTree PLUS75_tree=null;
        AslTree MINUS76_tree=null;

        try {
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:144:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:144:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:144:13: ( NOT ^| PLUS ^| MINUS ^)?
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
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:144:14: NOT ^
                    {
                    NOT74=(Token)match(input,NOT,FOLLOW_NOT_in_factor1012); 
                    NOT74_tree = 
                    (AslTree)adaptor.create(NOT74)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT74_tree, root_0);


                    }
                    break;
                case 2 :
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:144:21: PLUS ^
                    {
                    PLUS75=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1017); 
                    PLUS75_tree = 
                    (AslTree)adaptor.create(PLUS75)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS75_tree, root_0);


                    }
                    break;
                case 3 :
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:144:29: MINUS ^
                    {
                    MINUS76=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1022); 
                    MINUS76_tree = 
                    (AslTree)adaptor.create(MINUS76)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS76_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1027);
            atom77=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom77.getTree());

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
    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:150:1: atom : ( var | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token INT79=null;
        Token char_literal81=null;
        Token char_literal83=null;
        AslParser.var_return var78 =null;

        AslParser.funcall_return funcall80 =null;

        AslParser.expr_return expr82 =null;


        AslTree b_tree=null;
        AslTree INT79_tree=null;
        AslTree char_literal81_tree=null;
        AslTree char_literal83_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:150:9: ( var | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt21=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==AND||(LA21_1 >= DIV && LA21_1 <= EQUAL)||(LA21_1 >= GE && LA21_1 <= GT)||LA21_1==LE||(LA21_1 >= LT && LA21_1 <= MUL)||(LA21_1 >= NOT_EQUAL && LA21_1 <= OR)||LA21_1==PLUS||LA21_1==THEN||(LA21_1 >= 52 && LA21_1 <= 58)) ) {
                    alt21=1;
                }
                else if ( (LA21_1==51) ) {
                    alt21=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt21=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt21=3;
                }
                break;
            case 51:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:150:13: var
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_var_in_atom1052);
                    var78=var();

                    state._fsp--;

                    adaptor.addChild(root_0, var78.getTree());

                    }
                    break;
                case 2 :
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:151:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT79=(Token)match(input,INT,FOLLOW_INT_in_atom1066); 
                    INT79_tree = 
                    (AslTree)adaptor.create(INT79)
                    ;
                    adaptor.addChild(root_0, INT79_tree);


                    }
                    break;
                case 3 :
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:152:13: (b= TRUE |b= FALSE )
                    {
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:152:13: (b= TRUE |b= FALSE )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==TRUE) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==FALSE) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;

                    }
                    switch (alt20) {
                        case 1 :
                            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:152:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1083);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:152:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1089);  
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
                    // 152:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:152:36: ^( BOOLEAN[$b,$b.text] )
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
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:153:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1112);
                    funcall80=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall80.getTree());

                    }
                    break;
                case 5 :
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:154:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal81=(Token)match(input,51,FOLLOW_51_in_atom1126); 

                    pushFollow(FOLLOW_expr_in_atom1129);
                    expr82=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr82.getTree());

                    char_literal83=(Token)match(input,52,FOLLOW_52_in_atom1131); 

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
    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:158:1: funcall : ID '(' ( expr_list )? ')' ( '[' expr ']' )? -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ( expr )? ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID84=null;
        Token char_literal85=null;
        Token char_literal87=null;
        Token char_literal88=null;
        Token char_literal90=null;
        AslParser.expr_list_return expr_list86 =null;

        AslParser.expr_return expr89 =null;


        AslTree ID84_tree=null;
        AslTree char_literal85_tree=null;
        AslTree char_literal87_tree=null;
        AslTree char_literal88_tree=null;
        AslTree char_literal90_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:158:9: ( ID '(' ( expr_list )? ')' ( '[' expr ']' )? -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ( expr )? ) )
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:158:13: ID '(' ( expr_list )? ')' ( '[' expr ']' )?
            {
            ID84=(Token)match(input,ID,FOLLOW_ID_in_funcall1152);  
            stream_ID.add(ID84);


            char_literal85=(Token)match(input,51,FOLLOW_51_in_funcall1154);  
            stream_51.add(char_literal85);


            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:158:20: ( expr_list )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==FALSE||LA22_0==ID||LA22_0==INT||LA22_0==MINUS||LA22_0==NOT||LA22_0==PLUS||LA22_0==TRUE||LA22_0==51) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:158:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1156);
                    expr_list86=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list86.getTree());

                    }
                    break;

            }


            char_literal87=(Token)match(input,52,FOLLOW_52_in_funcall1159);  
            stream_52.add(char_literal87);


            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:158:34: ( '[' expr ']' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==57) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:158:35: '[' expr ']'
                    {
                    char_literal88=(Token)match(input,57,FOLLOW_57_in_funcall1161);  
                    stream_57.add(char_literal88);


                    pushFollow(FOLLOW_expr_in_funcall1162);
                    expr89=expr();

                    state._fsp--;

                    stream_expr.add(expr89.getTree());

                    char_literal90=(Token)match(input,58,FOLLOW_58_in_funcall1163);  
                    stream_58.add(char_literal90);


                    }
                    break;

            }


            // AST REWRITE
            // elements: expr, ID, expr_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 158:48: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ( expr )? )
            {
                // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:158:51: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ( expr )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:158:64: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:158:74: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();

                adaptor.addChild(root_1, root_2);
                }

                // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:158:86: ( expr )?
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
    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:162:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal92=null;
        AslParser.expr_return expr91 =null;

        AslParser.expr_return expr93 =null;


        AslTree char_literal92_tree=null;

        try {
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:162:10: ( expr ( ',' ! expr )* )
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:162:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1201);
            expr91=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr91.getTree());

            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:162:18: ( ',' ! expr )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==53) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:162:19: ',' ! expr
            	    {
            	    char_literal92=(Token)match(input,53,FOLLOW_53_in_expr_list1204); 

            	    pushFollow(FOLLOW_expr_in_expr_list1207);
            	    expr93=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr93.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:165:1: var : ( ID |id= ID '[' expr ']' -> ^( VECTOR[$id.text] expr ) );
    public final AslParser.var_return var() throws RecognitionException {
        AslParser.var_return retval = new AslParser.var_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token ID94=null;
        Token char_literal95=null;
        Token char_literal97=null;
        AslParser.expr_return expr96 =null;


        AslTree id_tree=null;
        AslTree ID94_tree=null;
        AslTree char_literal95_tree=null;
        AslTree char_literal97_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:165:5: ( ID |id= ID '[' expr ']' -> ^( VECTOR[$id.text] expr ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==57) ) {
                    alt25=2;
                }
                else if ( (LA25_1==AND||(LA25_1 >= DIV && LA25_1 <= EQUAL)||(LA25_1 >= GE && LA25_1 <= GT)||LA25_1==LE||(LA25_1 >= LT && LA25_1 <= MUL)||(LA25_1 >= NOT_EQUAL && LA25_1 <= OR)||LA25_1==PLUS||LA25_1==THEN||(LA25_1 >= 52 && LA25_1 <= 56)||LA25_1==58) ) {
                    alt25=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:165:7: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID94=(Token)match(input,ID,FOLLOW_ID_in_var1226); 
                    ID94_tree = 
                    (AslTree)adaptor.create(ID94)
                    ;
                    adaptor.addChild(root_0, ID94_tree);


                    }
                    break;
                case 2 :
                    // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:166:7: id= ID '[' expr ']'
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_var1236);  
                    stream_ID.add(id);


                    char_literal95=(Token)match(input,57,FOLLOW_57_in_var1237);  
                    stream_57.add(char_literal95);


                    pushFollow(FOLLOW_expr_in_var1238);
                    expr96=expr();

                    state._fsp--;

                    stream_expr.add(expr96.getTree());

                    char_literal97=(Token)match(input,58,FOLLOW_58_in_var1239);  
                    stream_58.add(char_literal97);


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
                    // 166:23: -> ^( VECTOR[$id.text] expr )
                    {
                        // F:\\Compiladores\\Asl\\src\\parser\\Asl.g:166:26: ^( VECTOR[$id.text] expr )
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


 

    public static final BitSet FOLLOW_func_in_prog184 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EOF_in_prog187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func226 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_func229 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_params_in_func231 = new BitSet(new long[]{0x0081830001800000L});
    public static final BitSet FOLLOW_block_instructions_in_func233 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_params254 = new BitSet(new long[]{0x0014000000800000L});
    public static final BitSet FOLLOW_paramlist_in_params256 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_params259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist285 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_paramlist288 = new BitSet(new long[]{0x0004000000800000L});
    public static final BitSet FOLLOW_param_in_paramlist291 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_50_in_param316 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_param320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions377 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_block_instructions380 = new BitSet(new long[]{0x0081830001800000L});
    public static final BitSet FOLLOW_instruction_in_block_instructions382 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_assign614 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUAL_in_assign618 = new BitSet(new long[]{0x0008202242820000L});
    public static final BitSet FOLLOW_expr_in_assign620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt649 = new BitSet(new long[]{0x0008202242820000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt652 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt654 = new BitSet(new long[]{0x0081830001800000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt657 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt660 = new BitSet(new long[]{0x0081830001800000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt663 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt690 = new BitSet(new long[]{0x0008202242820000L});
    public static final BitSet FOLLOW_expr_in_while_stmt693 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DO_in_while_stmt695 = new BitSet(new long[]{0x0081830001800000L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt698 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt723 = new BitSet(new long[]{0x0008202242820002L});
    public static final BitSet FOLLOW_expr_in_return_stmt726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read745 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_var_in_read748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write768 = new BitSet(new long[]{0x0008242242820000L});
    public static final BitSet FOLLOW_expr_in_write772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orexpr_in_expr801 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_expr804 = new BitSet(new long[]{0x0008202242820000L});
    public static final BitSet FOLLOW_orexpr_in_expr807 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_expr809 = new BitSet(new long[]{0x0008202242820000L});
    public static final BitSet FOLLOW_orexpr_in_expr812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_orexpr827 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_OR_in_orexpr830 = new BitSet(new long[]{0x0008202242820000L});
    public static final BitSet FOLLOW_boolterm_in_orexpr833 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm853 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm856 = new BitSet(new long[]{0x0008202242820000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm859 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact879 = new BitSet(new long[]{0x0000000424608002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact883 = new BitSet(new long[]{0x0008202242820000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact888 = new BitSet(new long[]{0x0008202242820000L});
    public static final BitSet FOLLOW_LT_in_boolfact893 = new BitSet(new long[]{0x0008202242820000L});
    public static final BitSet FOLLOW_LE_in_boolfact898 = new BitSet(new long[]{0x0008202242820000L});
    public static final BitSet FOLLOW_GT_in_boolfact903 = new BitSet(new long[]{0x0008202242820000L});
    public static final BitSet FOLLOW_GE_in_boolfact908 = new BitSet(new long[]{0x0008202242820000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr932 = new BitSet(new long[]{0x0000002040000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr937 = new BitSet(new long[]{0x0008202242820000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr942 = new BitSet(new long[]{0x0008202242820000L});
    public static final BitSet FOLLOW_term_in_num_expr946 = new BitSet(new long[]{0x0000002040000002L});
    public static final BitSet FOLLOW_factor_in_term970 = new BitSet(new long[]{0x0000000180000202L});
    public static final BitSet FOLLOW_MUL_in_term975 = new BitSet(new long[]{0x0008202242820000L});
    public static final BitSet FOLLOW_DIV_in_term980 = new BitSet(new long[]{0x0008202242820000L});
    public static final BitSet FOLLOW_MOD_in_term985 = new BitSet(new long[]{0x0008202242820000L});
    public static final BitSet FOLLOW_factor_in_term989 = new BitSet(new long[]{0x0000000180000202L});
    public static final BitSet FOLLOW_NOT_in_factor1012 = new BitSet(new long[]{0x0008200002820000L});
    public static final BitSet FOLLOW_PLUS_in_factor1017 = new BitSet(new long[]{0x0008200002820000L});
    public static final BitSet FOLLOW_MINUS_in_factor1022 = new BitSet(new long[]{0x0008200002820000L});
    public static final BitSet FOLLOW_atom_in_factor1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_atom1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_atom1126 = new BitSet(new long[]{0x0008202242820000L});
    public static final BitSet FOLLOW_expr_in_atom1129 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_atom1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1152 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_funcall1154 = new BitSet(new long[]{0x0018202242820000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1156 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_funcall1159 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_funcall1161 = new BitSet(new long[]{0x0008202242820000L});
    public static final BitSet FOLLOW_expr_in_funcall1162 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_funcall1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1201 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_expr_list1204 = new BitSet(new long[]{0x0008202242820000L});
    public static final BitSet FOLLOW_expr_in_expr_list1207 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ID_in_var1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_var1236 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_var1237 = new BitSet(new long[]{0x0008202242820000L});
    public static final BitSet FOLLOW_expr_in_var1238 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_var1239 = new BitSet(new long[]{0x0000000000000002L});

}