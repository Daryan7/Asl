// $ANTLR 3.4 C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g 2017-03-10 17:55:15

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "BOOLEAN", "COMMENT", "DIV", "DO", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FACTORIAL", "FALSE", "FUNC", "FUNCALL", "FUNCVEC", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MUL", "NOT", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "PREF", "PVALUE", "QUESTION", "READ", "RETURN", "STRING", "SUMFUNC", "TERNARY", "THEN", "TRUE", "VARLIST", "VECTOR", "WHILE", "WRITE", "WS", "'&'", "'('", "')'", "','", "':'", "';'", "'['", "']'"
    };

    public static final int EOF=-1;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
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
    public static final int STRING=44;
    public static final int SUMFUNC=45;
    public static final int TERNARY=46;
    public static final int THEN=47;
    public static final int TRUE=48;
    public static final int VARLIST=49;
    public static final int VECTOR=50;
    public static final int WHILE=51;
    public static final int WRITE=52;
    public static final int WS=53;

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
    public String getGrammarFileName() { return "C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:64:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
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
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:64:6: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:64:8: ( func )+ EOF
            {
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:64:8: ( func )+
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
            	    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:64:8: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog191);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog194);  
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
            // 64:18: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:64:21: ^( LIST_FUNCTIONS ( func )+ )
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
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:68:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
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
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:68:6: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:68:8: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func233); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func236); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func238);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_func240);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func242); 

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
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:72:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.paramlist_return paramlist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:72:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:72:10: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,55,FOLLOW_55_in_params261);  
            stream_55.add(char_literal8);


            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:72:14: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==54) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:72:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params263);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,56,FOLLOW_56_in_params266);  
            stream_56.add(char_literal10);


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
            // 72:29: -> ^( PARAMS ( paramlist )? )
            {
                // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:72:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:72:41: ( paramlist )?
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
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:76:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:76:10: ( param ( ',' ! param )* )
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:76:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist292);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:76:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==57) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:76:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,57,FOLLOW_57_in_paramlist295); 

            	    pushFollow(FOLLOW_param_in_paramlist298);
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
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:81:1: param : ( '&' id= ID -> ^( PREF[$id, $id.text] ) |id= ID -> ^( PVALUE[$id, $id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal14=null;

        AslTree id_tree=null;
        AslTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");

        try {
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:81:9: ( '&' id= ID -> ^( PREF[$id, $id.text] ) |id= ID -> ^( PVALUE[$id, $id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==54) ) {
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
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:81:13: '&' id= ID
                    {
                    char_literal14=(Token)match(input,54,FOLLOW_54_in_param323);  
                    stream_54.add(char_literal14);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param327);  
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
                    // 81:23: -> ^( PREF[$id, $id.text] )
                    {
                        // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:81:26: ^( PREF[$id, $id.text] )
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
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:82:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param350);  
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
                    // 82:19: -> ^( PVALUE[$id, $id.text] )
                    {
                        // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:82:22: ^( PVALUE[$id, $id.text] )
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
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:86:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal16=null;
        AslParser.instruction_return instruction15 =null;

        AslParser.instruction_return instruction17 =null;


        AslTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:87:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:87:12: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions384);
            instruction15=instruction();

            state._fsp--;

            stream_instruction.add(instruction15.getTree());

            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:87:24: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==59) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:87:25: ';' instruction
            	    {
            	    char_literal16=(Token)match(input,59,FOLLOW_59_in_block_instructions387);  
            	    stream_59.add(char_literal16);


            	    pushFollow(FOLLOW_instruction_in_block_instructions389);
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
            // 88:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:88:16: ^( LIST_INSTR ( instruction )+ )
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
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:92:1: instruction : ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |);
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
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:93:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |)
            int alt6=8;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EQUAL||LA6_1==57||LA6_1==60) ) {
                    alt6=1;
                }
                else if ( (LA6_1==55) ) {
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
            case 59:
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
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:93:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction438);
                    assign18=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign18.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:94:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction460);
                    ite_stmt19=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt19.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:95:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction480);
                    while_stmt20=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt20.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:96:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction500);
                    funcall21=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall21.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:97:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction521);
                    return_stmt22=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt22.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:98:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction538);
                    read23=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read23.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:99:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction563);
                    write24=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write24.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:101:9: 
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
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:104:1: assign : var ( ',' var )* eq= EQUAL expr_list -> ^( ASSIGN[$eq,\":=\"] ^( VARLIST ( var )+ ) ^( ARGLIST expr_list ) ) ;
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
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var");
        try {
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:104:8: ( var ( ',' var )* eq= EQUAL expr_list -> ^( ASSIGN[$eq,\":=\"] ^( VARLIST ( var )+ ) ^( ARGLIST expr_list ) ) )
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:104:10: var ( ',' var )* eq= EQUAL expr_list
            {
            pushFollow(FOLLOW_var_in_assign621);
            var25=var();

            state._fsp--;

            stream_var.add(var25.getTree());

            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:104:13: ( ',' var )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==57) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:104:14: ',' var
            	    {
            	    char_literal26=(Token)match(input,57,FOLLOW_57_in_assign623);  
            	    stream_57.add(char_literal26);


            	    pushFollow(FOLLOW_var_in_assign625);
            	    var27=var();

            	    state._fsp--;

            	    stream_var.add(var27.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign631);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_list_in_assign633);
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
            // 104:43: -> ^( ASSIGN[$eq,\":=\"] ^( VARLIST ( var )+ ) ^( ARGLIST expr_list ) )
            {
                // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:104:46: ^( ASSIGN[$eq,\":=\"] ^( VARLIST ( var )+ ) ^( ARGLIST expr_list ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ASSIGN, eq, ":=")
                , root_1);

                // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:104:65: ^( VARLIST ( var )+ )
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

                // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:104:81: ^( ARGLIST expr_list )
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
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:108:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
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
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:108:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:108:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF29=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt671); 
            IF29_tree = 
            (AslTree)adaptor.create(IF29)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF29_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt674);
            expr30=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr30.getTree());

            THEN31=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt676); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt679);
            block_instructions32=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions32.getTree());

            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:108:46: ( ELSE ! block_instructions )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ELSE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:108:47: ELSE ! block_instructions
                    {
                    ELSE33=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt682); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt685);
                    block_instructions34=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions34.getTree());

                    }
                    break;

            }


            ENDIF35=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt689); 

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
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:112:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
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
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:112:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:112:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE36=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt712); 
            WHILE36_tree = 
            (AslTree)adaptor.create(WHILE36)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE36_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt715);
            expr37=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr37.getTree());

            DO38=(Token)match(input,DO,FOLLOW_DO_in_while_stmt717); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt720);
            block_instructions39=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions39.getTree());

            ENDWHILE40=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt722); 

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
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:116:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN41=null;
        AslParser.expr_return expr42 =null;


        AslTree RETURN41_tree=null;

        try {
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:116:13: ( RETURN ^ ( expr )? )
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:116:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN41=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt745); 
            RETURN41_tree = 
            (AslTree)adaptor.create(RETURN41)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN41_tree, root_0);


            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:116:23: ( expr )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==FALSE||LA9_0==ID||LA9_0==INT||LA9_0==MINUS||LA9_0==NOT||LA9_0==PLUS||(LA9_0 >= STRING && LA9_0 <= SUMFUNC)||LA9_0==TRUE||LA9_0==55) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:116:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt748);
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
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:120:1: read : READ ^ var ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ43=null;
        AslParser.var_return var44 =null;


        AslTree READ43_tree=null;

        try {
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:120:6: ( READ ^ var )
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:120:8: READ ^ var
            {
            root_0 = (AslTree)adaptor.nil();


            READ43=(Token)match(input,READ,FOLLOW_READ_in_read767); 
            READ43_tree = 
            (AslTree)adaptor.create(READ43)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ43_tree, root_0);


            pushFollow(FOLLOW_var_in_read770);
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
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:124:1: write : WRITE ^ expr ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE45=null;
        AslParser.expr_return expr46 =null;


        AslTree WRITE45_tree=null;

        try {
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:124:7: ( WRITE ^ expr )
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:124:11: WRITE ^ expr
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE45=(Token)match(input,WRITE,FOLLOW_WRITE_in_write790); 
            WRITE45_tree = 
            (AslTree)adaptor.create(WRITE45)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE45_tree, root_0);


            pushFollow(FOLLOW_expr_in_write793);
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
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:128:1: expr : orexpr ( QUESTION ^ expr ':' ! expr )? ;
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
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:128:9: ( orexpr ( QUESTION ^ expr ':' ! expr )? )
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:128:13: orexpr ( QUESTION ^ expr ':' ! expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_orexpr_in_expr816);
            orexpr47=orexpr();

            state._fsp--;

            adaptor.addChild(root_0, orexpr47.getTree());

            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:128:20: ( QUESTION ^ expr ':' ! expr )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==QUESTION) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:128:21: QUESTION ^ expr ':' ! expr
                    {
                    QUESTION48=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_expr819); 
                    QUESTION48_tree = 
                    (AslTree)adaptor.create(QUESTION48)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(QUESTION48_tree, root_0);


                    pushFollow(FOLLOW_expr_in_expr822);
                    expr49=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr49.getTree());

                    char_literal50=(Token)match(input,58,FOLLOW_58_in_expr824); 

                    pushFollow(FOLLOW_expr_in_expr827);
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
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:130:1: orexpr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.orexpr_return orexpr() throws RecognitionException {
        AslParser.orexpr_return retval = new AslParser.orexpr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR53=null;
        AslParser.boolterm_return boolterm52 =null;

        AslParser.boolterm_return boolterm54 =null;


        AslTree OR53_tree=null;

        try {
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:130:9: ( boolterm ( OR ^ boolterm )* )
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:130:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_orexpr840);
            boolterm52=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm52.getTree());

            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:130:22: ( OR ^ boolterm )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==OR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:130:23: OR ^ boolterm
            	    {
            	    OR53=(Token)match(input,OR,FOLLOW_OR_in_orexpr843); 
            	    OR53_tree = 
            	    (AslTree)adaptor.create(OR53)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR53_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_orexpr846);
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
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:133:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND56=null;
        AslParser.boolfact_return boolfact55 =null;

        AslParser.boolfact_return boolfact57 =null;


        AslTree AND56_tree=null;

        try {
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:133:9: ( boolfact ( AND ^ boolfact )* )
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:133:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm866);
            boolfact55=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact55.getTree());

            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:133:22: ( AND ^ boolfact )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==AND) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:133:23: AND ^ boolfact
            	    {
            	    AND56=(Token)match(input,AND,FOLLOW_AND_in_boolterm869); 
            	    AND56_tree = 
            	    (AslTree)adaptor.create(AND56)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND56_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm872);
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
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:136:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
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
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:136:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:136:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact892);
            num_expr58=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr58.getTree());

            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:136:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EQUAL||(LA14_0 >= GE && LA14_0 <= GT)||LA14_0==LE||LA14_0==LT||LA14_0==NOT_EQUAL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:136:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:136:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
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
                            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:136:24: EQUAL ^
                            {
                            EQUAL59=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact896); 
                            EQUAL59_tree = 
                            (AslTree)adaptor.create(EQUAL59)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL59_tree, root_0);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:136:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL60=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact901); 
                            NOT_EQUAL60_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL60)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL60_tree, root_0);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:136:46: LT ^
                            {
                            LT61=(Token)match(input,LT,FOLLOW_LT_in_boolfact906); 
                            LT61_tree = 
                            (AslTree)adaptor.create(LT61)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT61_tree, root_0);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:136:52: LE ^
                            {
                            LE62=(Token)match(input,LE,FOLLOW_LE_in_boolfact911); 
                            LE62_tree = 
                            (AslTree)adaptor.create(LE62)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE62_tree, root_0);


                            }
                            break;
                        case 5 :
                            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:136:58: GT ^
                            {
                            GT63=(Token)match(input,GT,FOLLOW_GT_in_boolfact916); 
                            GT63_tree = 
                            (AslTree)adaptor.create(GT63)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT63_tree, root_0);


                            }
                            break;
                        case 6 :
                            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:136:64: GE ^
                            {
                            GE64=(Token)match(input,GE,FOLLOW_GE_in_boolfact921); 
                            GE64_tree = 
                            (AslTree)adaptor.create(GE64)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE64_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact925);
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
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:139:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
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
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:139:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:139:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr945);
            term66=term();

            state._fsp--;

            adaptor.addChild(root_0, term66.getTree());

            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:139:18: ( ( PLUS ^| MINUS ^) term )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==MINUS||LA16_0==PLUS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:139:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:139:20: ( PLUS ^| MINUS ^)
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
            	            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:139:21: PLUS ^
            	            {
            	            PLUS67=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr950); 
            	            PLUS67_tree = 
            	            (AslTree)adaptor.create(PLUS67)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS67_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:139:29: MINUS ^
            	            {
            	            MINUS68=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr955); 
            	            MINUS68_tree = 
            	            (AslTree)adaptor.create(MINUS68)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS68_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr959);
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
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:142:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
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
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:142:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:142:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term983);
            factor70=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor70.getTree());

            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:142:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==DIV||(LA18_0 >= MOD && LA18_0 <= MUL)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:142:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:142:22: ( MUL ^| DIV ^| MOD ^)
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
            	            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:142:23: MUL ^
            	            {
            	            MUL71=(Token)match(input,MUL,FOLLOW_MUL_in_term988); 
            	            MUL71_tree = 
            	            (AslTree)adaptor.create(MUL71)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL71_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:142:30: DIV ^
            	            {
            	            DIV72=(Token)match(input,DIV,FOLLOW_DIV_in_term993); 
            	            DIV72_tree = 
            	            (AslTree)adaptor.create(DIV72)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV72_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:142:37: MOD ^
            	            {
            	            MOD73=(Token)match(input,MOD,FOLLOW_MOD_in_term998); 
            	            MOD73_tree = 
            	            (AslTree)adaptor.create(MOD73)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD73_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1002);
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
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:145:1: factor : ( NOT ^| PLUS ^| MINUS ^)? factorial ;
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
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:145:9: ( ( NOT ^| PLUS ^| MINUS ^)? factorial )
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:145:13: ( NOT ^| PLUS ^| MINUS ^)? factorial
            {
            root_0 = (AslTree)adaptor.nil();


            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:145:13: ( NOT ^| PLUS ^| MINUS ^)?
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
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:145:14: NOT ^
                    {
                    NOT75=(Token)match(input,NOT,FOLLOW_NOT_in_factor1025); 
                    NOT75_tree = 
                    (AslTree)adaptor.create(NOT75)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT75_tree, root_0);


                    }
                    break;
                case 2 :
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:145:21: PLUS ^
                    {
                    PLUS76=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1030); 
                    PLUS76_tree = 
                    (AslTree)adaptor.create(PLUS76)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS76_tree, root_0);


                    }
                    break;
                case 3 :
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:145:29: MINUS ^
                    {
                    MINUS77=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1035); 
                    MINUS77_tree = 
                    (AslTree)adaptor.create(MINUS77)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS77_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_factorial_in_factor1040);
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
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:147:1: factorial : atom ( FACTORIAL ^)* ;
    public final AslParser.factorial_return factorial() throws RecognitionException {
        AslParser.factorial_return retval = new AslParser.factorial_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FACTORIAL80=null;
        AslParser.atom_return atom79 =null;


        AslTree FACTORIAL80_tree=null;

        try {
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:147:10: ( atom ( FACTORIAL ^)* )
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:147:13: atom ( FACTORIAL ^)*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_atom_in_factorial1056);
            atom79=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom79.getTree());

            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:147:27: ( FACTORIAL ^)*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==FACTORIAL) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:147:27: FACTORIAL ^
            	    {
            	    FACTORIAL80=(Token)match(input,FACTORIAL,FOLLOW_FACTORIAL_in_factorial1058); 
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
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:151:1: atom : ( var | STRING | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | SUMFUNC ^ '(' ! ( expr_list )? ')' !| '(' ! expr ')' !);
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
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:151:9: ( var | STRING | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | SUMFUNC ^ '(' ! ( expr_list )? ')' !| '(' ! expr ')' !)
            int alt23=7;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==AND||(LA23_1 >= DIV && LA23_1 <= EQUAL)||LA23_1==FACTORIAL||(LA23_1 >= GE && LA23_1 <= GT)||LA23_1==LE||(LA23_1 >= LT && LA23_1 <= MUL)||(LA23_1 >= NOT_EQUAL && LA23_1 <= OR)||LA23_1==PLUS||LA23_1==QUESTION||LA23_1==THEN||(LA23_1 >= 56 && LA23_1 <= 61)) ) {
                    alt23=1;
                }
                else if ( (LA23_1==55) ) {
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
            case 55:
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
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:151:13: var
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_var_in_atom1075);
                    var81=var();

                    state._fsp--;

                    adaptor.addChild(root_0, var81.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:152:13: STRING
                    {
                    root_0 = (AslTree)adaptor.nil();


                    STRING82=(Token)match(input,STRING,FOLLOW_STRING_in_atom1089); 
                    STRING82_tree = 
                    (AslTree)adaptor.create(STRING82)
                    ;
                    adaptor.addChild(root_0, STRING82_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:153:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT83=(Token)match(input,INT,FOLLOW_INT_in_atom1103); 
                    INT83_tree = 
                    (AslTree)adaptor.create(INT83)
                    ;
                    adaptor.addChild(root_0, INT83_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:154:13: (b= TRUE |b= FALSE )
                    {
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:154:13: (b= TRUE |b= FALSE )
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
                            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:154:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1120);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:154:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1126);  
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
                    // 154:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:154:36: ^( BOOLEAN[$b,$b.text] )
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
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:155:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1149);
                    funcall84=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall84.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:156:13: SUMFUNC ^ '(' ! ( expr_list )? ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    SUMFUNC85=(Token)match(input,SUMFUNC,FOLLOW_SUMFUNC_in_atom1163); 
                    SUMFUNC85_tree = 
                    (AslTree)adaptor.create(SUMFUNC85)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(SUMFUNC85_tree, root_0);


                    char_literal86=(Token)match(input,55,FOLLOW_55_in_atom1165); 

                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:156:26: ( expr_list )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==FALSE||LA22_0==ID||LA22_0==INT||LA22_0==MINUS||LA22_0==NOT||LA22_0==PLUS||(LA22_0 >= STRING && LA22_0 <= SUMFUNC)||LA22_0==TRUE||LA22_0==55) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:156:26: expr_list
                            {
                            pushFollow(FOLLOW_expr_list_in_atom1168);
                            expr_list87=expr_list();

                            state._fsp--;

                            adaptor.addChild(root_0, expr_list87.getTree());

                            }
                            break;

                    }


                    char_literal88=(Token)match(input,56,FOLLOW_56_in_atom1171); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:157:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal89=(Token)match(input,55,FOLLOW_55_in_atom1186); 

                    pushFollow(FOLLOW_expr_in_atom1189);
                    expr90=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr90.getTree());

                    char_literal91=(Token)match(input,56,FOLLOW_56_in_atom1191); 

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
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:161:1: funcall : ID '(' ( expr_list )? ')' ( '[' expr ']' )? -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ( expr )? ) ;
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
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:161:9: ( ID '(' ( expr_list )? ')' ( '[' expr ']' )? -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ( expr )? ) )
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:161:13: ID '(' ( expr_list )? ')' ( '[' expr ']' )?
            {
            ID92=(Token)match(input,ID,FOLLOW_ID_in_funcall1212);  
            stream_ID.add(ID92);


            char_literal93=(Token)match(input,55,FOLLOW_55_in_funcall1214);  
            stream_55.add(char_literal93);


            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:161:20: ( expr_list )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==FALSE||LA24_0==ID||LA24_0==INT||LA24_0==MINUS||LA24_0==NOT||LA24_0==PLUS||(LA24_0 >= STRING && LA24_0 <= SUMFUNC)||LA24_0==TRUE||LA24_0==55) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:161:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1216);
                    expr_list94=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list94.getTree());

                    }
                    break;

            }


            char_literal95=(Token)match(input,56,FOLLOW_56_in_funcall1219);  
            stream_56.add(char_literal95);


            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:161:34: ( '[' expr ']' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==60) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:161:35: '[' expr ']'
                    {
                    char_literal96=(Token)match(input,60,FOLLOW_60_in_funcall1221);  
                    stream_60.add(char_literal96);


                    pushFollow(FOLLOW_expr_in_funcall1222);
                    expr97=expr();

                    state._fsp--;

                    stream_expr.add(expr97.getTree());

                    char_literal98=(Token)match(input,61,FOLLOW_61_in_funcall1223);  
                    stream_61.add(char_literal98);


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
            // 161:48: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ( expr )? )
            {
                // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:161:51: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ( expr )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:161:64: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:161:74: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:161:86: ( expr )?
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
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:165:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal100=null;
        AslParser.expr_return expr99 =null;

        AslParser.expr_return expr101 =null;


        AslTree char_literal100_tree=null;

        try {
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:165:10: ( expr ( ',' ! expr )* )
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:165:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1261);
            expr99=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr99.getTree());

            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:165:18: ( ',' ! expr )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==57) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:165:19: ',' ! expr
            	    {
            	    char_literal100=(Token)match(input,57,FOLLOW_57_in_expr_list1264); 

            	    pushFollow(FOLLOW_expr_in_expr_list1267);
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
    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:168:1: var : ( ID |id= ID '[' expr ']' -> ^( VECTOR[$id.text] expr ) );
    public final AslParser.var_return var() throws RecognitionException {
        AslParser.var_return retval = new AslParser.var_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token ID102=null;
        Token char_literal103=null;
        Token char_literal105=null;
        AslParser.expr_return expr104 =null;


        AslTree id_tree=null;
        AslTree ID102_tree=null;
        AslTree char_literal103_tree=null;
        AslTree char_literal105_tree=null;
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:168:5: ( ID |id= ID '[' expr ']' -> ^( VECTOR[$id.text] expr ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ID) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==60) ) {
                    alt27=2;
                }
                else if ( (LA27_1==AND||(LA27_1 >= DIV && LA27_1 <= EQUAL)||LA27_1==FACTORIAL||(LA27_1 >= GE && LA27_1 <= GT)||LA27_1==LE||(LA27_1 >= LT && LA27_1 <= MUL)||(LA27_1 >= NOT_EQUAL && LA27_1 <= OR)||LA27_1==PLUS||LA27_1==QUESTION||LA27_1==THEN||(LA27_1 >= 56 && LA27_1 <= 59)||LA27_1==61) ) {
                    alt27=1;
                }
                else {
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
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:168:7: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID102=(Token)match(input,ID,FOLLOW_ID_in_var1286); 
                    ID102_tree = 
                    (AslTree)adaptor.create(ID102)
                    ;
                    adaptor.addChild(root_0, ID102_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:169:7: id= ID '[' expr ']'
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_var1296);  
                    stream_ID.add(id);


                    char_literal103=(Token)match(input,60,FOLLOW_60_in_var1297);  
                    stream_60.add(char_literal103);


                    pushFollow(FOLLOW_expr_in_var1298);
                    expr104=expr();

                    state._fsp--;

                    stream_expr.add(expr104.getTree());

                    char_literal105=(Token)match(input,61,FOLLOW_61_in_var1299);  
                    stream_61.add(char_literal105);


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
                    // 169:23: -> ^( VECTOR[$id.text] expr )
                    {
                        // C:\\Users\\juanm\\IdeaProjects\\Asl\\src\\parser\\Asl.g:169:26: ^( VECTOR[$id.text] expr )
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


 

    public static final BitSet FOLLOW_func_in_prog191 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EOF_in_prog194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func233 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_func236 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_params_in_func238 = new BitSet(new long[]{0x08180C0003000000L});
    public static final BitSet FOLLOW_block_instructions_in_func240 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_params261 = new BitSet(new long[]{0x0140000001000000L});
    public static final BitSet FOLLOW_paramlist_in_params263 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_params266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist292 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_paramlist295 = new BitSet(new long[]{0x0040000001000000L});
    public static final BitSet FOLLOW_param_in_paramlist298 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_54_in_param323 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_param327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions384 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_block_instructions387 = new BitSet(new long[]{0x08180C0003000000L});
    public static final BitSet FOLLOW_instruction_in_block_instructions389 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_assign621 = new BitSet(new long[]{0x0200000000008000L});
    public static final BitSet FOLLOW_57_in_assign623 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_var_in_assign625 = new BitSet(new long[]{0x0200000000008000L});
    public static final BitSet FOLLOW_EQUAL_in_assign631 = new BitSet(new long[]{0x0081304485040000L});
    public static final BitSet FOLLOW_expr_list_in_assign633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt671 = new BitSet(new long[]{0x0081304485040000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt674 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt676 = new BitSet(new long[]{0x08180C0003000000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt679 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt682 = new BitSet(new long[]{0x08180C0003000000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt685 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt712 = new BitSet(new long[]{0x0081304485040000L});
    public static final BitSet FOLLOW_expr_in_while_stmt715 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_DO_in_while_stmt717 = new BitSet(new long[]{0x08180C0003000000L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt720 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt745 = new BitSet(new long[]{0x0081304485040002L});
    public static final BitSet FOLLOW_expr_in_return_stmt748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read767 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_var_in_read770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write790 = new BitSet(new long[]{0x0081304485040000L});
    public static final BitSet FOLLOW_expr_in_write793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orexpr_in_expr816 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_QUESTION_in_expr819 = new BitSet(new long[]{0x0081304485040000L});
    public static final BitSet FOLLOW_expr_in_expr822 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_expr824 = new BitSet(new long[]{0x0081304485040000L});
    public static final BitSet FOLLOW_expr_in_expr827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_orexpr840 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_OR_in_orexpr843 = new BitSet(new long[]{0x0081304485040000L});
    public static final BitSet FOLLOW_boolterm_in_orexpr846 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm866 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm869 = new BitSet(new long[]{0x0081304485040000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm872 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact892 = new BitSet(new long[]{0x0000000848C08002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact896 = new BitSet(new long[]{0x0081304485040000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact901 = new BitSet(new long[]{0x0081304485040000L});
    public static final BitSet FOLLOW_LT_in_boolfact906 = new BitSet(new long[]{0x0081304485040000L});
    public static final BitSet FOLLOW_LE_in_boolfact911 = new BitSet(new long[]{0x0081304485040000L});
    public static final BitSet FOLLOW_GT_in_boolfact916 = new BitSet(new long[]{0x0081304485040000L});
    public static final BitSet FOLLOW_GE_in_boolfact921 = new BitSet(new long[]{0x0081304485040000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr945 = new BitSet(new long[]{0x0000004080000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr950 = new BitSet(new long[]{0x0081304485040000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr955 = new BitSet(new long[]{0x0081304485040000L});
    public static final BitSet FOLLOW_term_in_num_expr959 = new BitSet(new long[]{0x0000004080000002L});
    public static final BitSet FOLLOW_factor_in_term983 = new BitSet(new long[]{0x0000000300000202L});
    public static final BitSet FOLLOW_MUL_in_term988 = new BitSet(new long[]{0x0081304485040000L});
    public static final BitSet FOLLOW_DIV_in_term993 = new BitSet(new long[]{0x0081304485040000L});
    public static final BitSet FOLLOW_MOD_in_term998 = new BitSet(new long[]{0x0081304485040000L});
    public static final BitSet FOLLOW_factor_in_term1002 = new BitSet(new long[]{0x0000000300000202L});
    public static final BitSet FOLLOW_NOT_in_factor1025 = new BitSet(new long[]{0x0081300005040000L});
    public static final BitSet FOLLOW_PLUS_in_factor1030 = new BitSet(new long[]{0x0081300005040000L});
    public static final BitSet FOLLOW_MINUS_in_factor1035 = new BitSet(new long[]{0x0081300005040000L});
    public static final BitSet FOLLOW_factorial_in_factor1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_factorial1056 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_FACTORIAL_in_factorial1058 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_var_in_atom1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUMFUNC_in_atom1163 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_atom1165 = new BitSet(new long[]{0x0181304485040000L});
    public static final BitSet FOLLOW_expr_list_in_atom1168 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_atom1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_atom1186 = new BitSet(new long[]{0x0081304485040000L});
    public static final BitSet FOLLOW_expr_in_atom1189 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_atom1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1212 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_funcall1214 = new BitSet(new long[]{0x0181304485040000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1216 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_funcall1219 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_funcall1221 = new BitSet(new long[]{0x0081304485040000L});
    public static final BitSet FOLLOW_expr_in_funcall1222 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_funcall1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1261 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_expr_list1264 = new BitSet(new long[]{0x0081304485040000L});
    public static final BitSet FOLLOW_expr_in_expr_list1267 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_ID_in_var1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_var1296 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_var1297 = new BitSet(new long[]{0x0081304485040000L});
    public static final BitSet FOLLOW_expr_in_var1298 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_var1299 = new BitSet(new long[]{0x0000000000000002L});

}