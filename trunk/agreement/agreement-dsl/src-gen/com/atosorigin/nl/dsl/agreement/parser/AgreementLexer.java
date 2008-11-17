// $ANTLR 3.0 ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g 2008-11-17 11:07:48

package com.atosorigin.nl.dsl.agreement.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class AgreementLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=41;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int T23=23;
    public static final int T40=40;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_STRING=6;
    public static final int RULE_INT=5;
    public static final int T10=10;
    public static final int T38=38;
    public static final int T11=11;
    public static final int T37=37;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T39=39;
    public static final int T14=14;
    public static final int T34=34;
    public static final int RULE_WS=7;
    public static final int T15=15;
    public static final int T33=33;
    public static final int T16=16;
    public static final int T36=36;
    public static final int T17=17;
    public static final int T35=35;
    public static final int T18=18;
    public static final int T30=30;
    public static final int T19=19;
    public static final int T32=32;
    public static final int T31=31;

    	 private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
    	public List<ErrorMsg> getErrors() {
    		return errors;
    	}

    	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
    		String msg = super.getErrorMessage(e,tokenNames);
    		errors.add(AntlrUtil.create(msg,e,tokenNames));
    		return msg;
    	}

    public AgreementLexer() {;} 
    public AgreementLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g"; }

    // $ANTLR start T10
    public void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:22:7: ( 'plan' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:22:7: 'plan'
            {
            match("plan"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T10

    // $ANTLR start T11
    public void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:23:7: ( 'rate' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:23:7: 'rate'
            {
            match("rate"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:24:7: ( ':' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:24:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:25:7: ( 'event' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:25:7: 'event'
            {
            match("event"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:26:7: ( 'amount' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:26:7: 'amount'
            {
            match("amount"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:27:7: ( 'account' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:27:7: 'account'
            {
            match("account"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:28:7: ( '[' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:28:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:29:7: ( ']' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:29:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:30:7: ( '.' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:30:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:31:7: ( '/' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:31:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:32:7: ( 'USAGE' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:32:7: 'USAGE'
            {
            match("USAGE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:33:7: ( 'SERVICE_CALL' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:33:7: 'SERVICE_CALL'
            {
            match("SERVICE_CALL"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:34:7: ( 'TAX' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:34:7: 'TAX'
            {
            match("TAX"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:35:7: ( '-' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:35:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:36:7: ( 'base-usage' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:36:7: 'base-usage'
            {
            match("base-usage"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:37:7: ( 'service' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:37:7: 'service'
            {
            match("service"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:38:7: ( 'tax' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:38:7: 'tax'
            {
            match("tax"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:39:7: ( '(' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:39:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:40:7: ( ')' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:40:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:41:7: ( '+' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:41:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:42:7: ( '*' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:42:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:43:7: ( 'IF' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:43:7: 'IF'
            {
            match("IF"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:44:7: ( 'THEN' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:44:7: 'THEN'
            {
            match("THEN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:45:7: ( 'ELSE' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:45:7: 'ELSE'
            {
            match("ELSE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:46:7: ( '&' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:46:7: '&'
            {
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:47:7: ( '|' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:47:7: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:48:7: ( '<' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:48:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:49:7: ( '>' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:49:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:50:7: ( '<=' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:50:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:51:7: ( '>=' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:51:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:52:7: ( '=' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:52:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start RULE_ID
    public void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:509:3: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:509:3: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:509:3: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:509:4: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:509:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_STRING
    public void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:515:3: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("513:1: RULE_STRING : ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:515:3: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:515:7: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\"' ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFE')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:515:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:515:53: ~ ( '\\\\' | '\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:516:3: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:516:8: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:516:10: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:516:54: ~ ( '\\\\' | '\\'' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_INT
    public void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:522:3: ( ( '-' )? ( '0' .. '9' )+ )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:522:3: ( '-' )? ( '0' .. '9' )+
            {
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:522:3: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:522:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:522:9: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:522:10: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_WS
    public void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:528:3: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:528:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:528:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ML_COMMENT
    public void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:534:3: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:534:3: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:534:8: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFE')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:534:36: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:540:3: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:540:3: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:540:8: (~ ( '\\n' | '\\r' ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:540:8: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:540:22: ( '\\r' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:540:22: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    public void mTokens() throws RecognitionException {
        // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:10: ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT )
        int alt12=37;
        switch ( input.LA(1) ) {
        case 'p':
            {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='l') ) {
                int LA12_32 = input.LA(3);

                if ( (LA12_32=='a') ) {
                    int LA12_54 = input.LA(4);

                    if ( (LA12_54=='n') ) {
                        int LA12_68 = input.LA(5);

                        if ( ((LA12_68>='0' && LA12_68<='9')||(LA12_68>='A' && LA12_68<='Z')||LA12_68=='_'||(LA12_68>='a' && LA12_68<='z')) ) {
                            alt12=32;
                        }
                        else {
                            alt12=1;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
            }
            break;
        case 'r':
            {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='a') ) {
                int LA12_33 = input.LA(3);

                if ( (LA12_33=='t') ) {
                    int LA12_55 = input.LA(4);

                    if ( (LA12_55=='e') ) {
                        int LA12_69 = input.LA(5);

                        if ( ((LA12_69>='0' && LA12_69<='9')||(LA12_69>='A' && LA12_69<='Z')||LA12_69=='_'||(LA12_69>='a' && LA12_69<='z')) ) {
                            alt12=32;
                        }
                        else {
                            alt12=2;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
            }
            break;
        case ':':
            {
            alt12=3;
            }
            break;
        case 'e':
            {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='v') ) {
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='e') ) {
                    int LA12_56 = input.LA(4);

                    if ( (LA12_56=='n') ) {
                        int LA12_70 = input.LA(5);

                        if ( (LA12_70=='t') ) {
                            int LA12_83 = input.LA(6);

                            if ( ((LA12_83>='0' && LA12_83<='9')||(LA12_83>='A' && LA12_83<='Z')||LA12_83=='_'||(LA12_83>='a' && LA12_83<='z')) ) {
                                alt12=32;
                            }
                            else {
                                alt12=4;}
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
            }
            break;
        case 'a':
            {
            switch ( input.LA(2) ) {
            case 'm':
                {
                int LA12_35 = input.LA(3);

                if ( (LA12_35=='o') ) {
                    int LA12_57 = input.LA(4);

                    if ( (LA12_57=='u') ) {
                        int LA12_71 = input.LA(5);

                        if ( (LA12_71=='n') ) {
                            int LA12_84 = input.LA(6);

                            if ( (LA12_84=='t') ) {
                                int LA12_93 = input.LA(7);

                                if ( ((LA12_93>='0' && LA12_93<='9')||(LA12_93>='A' && LA12_93<='Z')||LA12_93=='_'||(LA12_93>='a' && LA12_93<='z')) ) {
                                    alt12=32;
                                }
                                else {
                                    alt12=5;}
                            }
                            else {
                                alt12=32;}
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
                }
                break;
            case 'c':
                {
                int LA12_36 = input.LA(3);

                if ( (LA12_36=='c') ) {
                    int LA12_58 = input.LA(4);

                    if ( (LA12_58=='o') ) {
                        int LA12_72 = input.LA(5);

                        if ( (LA12_72=='u') ) {
                            int LA12_85 = input.LA(6);

                            if ( (LA12_85=='n') ) {
                                int LA12_94 = input.LA(7);

                                if ( (LA12_94=='t') ) {
                                    int LA12_99 = input.LA(8);

                                    if ( ((LA12_99>='0' && LA12_99<='9')||(LA12_99>='A' && LA12_99<='Z')||LA12_99=='_'||(LA12_99>='a' && LA12_99<='z')) ) {
                                        alt12=32;
                                    }
                                    else {
                                        alt12=6;}
                                }
                                else {
                                    alt12=32;}
                            }
                            else {
                                alt12=32;}
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
                }
                break;
            default:
                alt12=32;}

            }
            break;
        case '[':
            {
            alt12=7;
            }
            break;
        case ']':
            {
            alt12=8;
            }
            break;
        case '.':
            {
            alt12=9;
            }
            break;
        case '/':
            {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt12=36;
                }
                break;
            case '/':
                {
                alt12=37;
                }
                break;
            default:
                alt12=10;}

            }
            break;
        case 'U':
            {
            int LA12_10 = input.LA(2);

            if ( (LA12_10=='S') ) {
                int LA12_40 = input.LA(3);

                if ( (LA12_40=='A') ) {
                    int LA12_59 = input.LA(4);

                    if ( (LA12_59=='G') ) {
                        int LA12_73 = input.LA(5);

                        if ( (LA12_73=='E') ) {
                            int LA12_86 = input.LA(6);

                            if ( ((LA12_86>='0' && LA12_86<='9')||(LA12_86>='A' && LA12_86<='Z')||LA12_86=='_'||(LA12_86>='a' && LA12_86<='z')) ) {
                                alt12=32;
                            }
                            else {
                                alt12=11;}
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
            }
            break;
        case 'S':
            {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='E') ) {
                int LA12_41 = input.LA(3);

                if ( (LA12_41=='R') ) {
                    int LA12_60 = input.LA(4);

                    if ( (LA12_60=='V') ) {
                        int LA12_74 = input.LA(5);

                        if ( (LA12_74=='I') ) {
                            int LA12_87 = input.LA(6);

                            if ( (LA12_87=='C') ) {
                                int LA12_96 = input.LA(7);

                                if ( (LA12_96=='E') ) {
                                    int LA12_100 = input.LA(8);

                                    if ( (LA12_100=='_') ) {
                                        int LA12_103 = input.LA(9);

                                        if ( (LA12_103=='C') ) {
                                            int LA12_105 = input.LA(10);

                                            if ( (LA12_105=='A') ) {
                                                int LA12_106 = input.LA(11);

                                                if ( (LA12_106=='L') ) {
                                                    int LA12_107 = input.LA(12);

                                                    if ( (LA12_107=='L') ) {
                                                        int LA12_108 = input.LA(13);

                                                        if ( ((LA12_108>='0' && LA12_108<='9')||(LA12_108>='A' && LA12_108<='Z')||LA12_108=='_'||(LA12_108>='a' && LA12_108<='z')) ) {
                                                            alt12=32;
                                                        }
                                                        else {
                                                            alt12=12;}
                                                    }
                                                    else {
                                                        alt12=32;}
                                                }
                                                else {
                                                    alt12=32;}
                                            }
                                            else {
                                                alt12=32;}
                                        }
                                        else {
                                            alt12=32;}
                                    }
                                    else {
                                        alt12=32;}
                                }
                                else {
                                    alt12=32;}
                            }
                            else {
                                alt12=32;}
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
            }
            break;
        case 'T':
            {
            switch ( input.LA(2) ) {
            case 'A':
                {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='X') ) {
                    int LA12_61 = input.LA(4);

                    if ( ((LA12_61>='0' && LA12_61<='9')||(LA12_61>='A' && LA12_61<='Z')||LA12_61=='_'||(LA12_61>='a' && LA12_61<='z')) ) {
                        alt12=32;
                    }
                    else {
                        alt12=13;}
                }
                else {
                    alt12=32;}
                }
                break;
            case 'H':
                {
                int LA12_43 = input.LA(3);

                if ( (LA12_43=='E') ) {
                    int LA12_62 = input.LA(4);

                    if ( (LA12_62=='N') ) {
                        int LA12_76 = input.LA(5);

                        if ( ((LA12_76>='0' && LA12_76<='9')||(LA12_76>='A' && LA12_76<='Z')||LA12_76=='_'||(LA12_76>='a' && LA12_76<='z')) ) {
                            alt12=32;
                        }
                        else {
                            alt12=23;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
                }
                break;
            default:
                alt12=32;}

            }
            break;
        case '-':
            {
            int LA12_13 = input.LA(2);

            if ( ((LA12_13>='0' && LA12_13<='9')) ) {
                alt12=34;
            }
            else {
                alt12=14;}
            }
            break;
        case 'b':
            {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='a') ) {
                int LA12_45 = input.LA(3);

                if ( (LA12_45=='s') ) {
                    int LA12_63 = input.LA(4);

                    if ( (LA12_63=='e') ) {
                        int LA12_77 = input.LA(5);

                        if ( (LA12_77=='-') ) {
                            alt12=15;
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
            }
            break;
        case 's':
            {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='e') ) {
                int LA12_46 = input.LA(3);

                if ( (LA12_46=='r') ) {
                    int LA12_64 = input.LA(4);

                    if ( (LA12_64=='v') ) {
                        int LA12_78 = input.LA(5);

                        if ( (LA12_78=='i') ) {
                            int LA12_90 = input.LA(6);

                            if ( (LA12_90=='c') ) {
                                int LA12_97 = input.LA(7);

                                if ( (LA12_97=='e') ) {
                                    int LA12_101 = input.LA(8);

                                    if ( ((LA12_101>='0' && LA12_101<='9')||(LA12_101>='A' && LA12_101<='Z')||LA12_101=='_'||(LA12_101>='a' && LA12_101<='z')) ) {
                                        alt12=32;
                                    }
                                    else {
                                        alt12=16;}
                                }
                                else {
                                    alt12=32;}
                            }
                            else {
                                alt12=32;}
                        }
                        else {
                            alt12=32;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
            }
            break;
        case 't':
            {
            int LA12_16 = input.LA(2);

            if ( (LA12_16=='a') ) {
                int LA12_47 = input.LA(3);

                if ( (LA12_47=='x') ) {
                    int LA12_65 = input.LA(4);

                    if ( ((LA12_65>='0' && LA12_65<='9')||(LA12_65>='A' && LA12_65<='Z')||LA12_65=='_'||(LA12_65>='a' && LA12_65<='z')) ) {
                        alt12=32;
                    }
                    else {
                        alt12=17;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
            }
            break;
        case '(':
            {
            alt12=18;
            }
            break;
        case ')':
            {
            alt12=19;
            }
            break;
        case '+':
            {
            alt12=20;
            }
            break;
        case '*':
            {
            alt12=21;
            }
            break;
        case 'I':
            {
            int LA12_21 = input.LA(2);

            if ( (LA12_21=='F') ) {
                int LA12_48 = input.LA(3);

                if ( ((LA12_48>='0' && LA12_48<='9')||(LA12_48>='A' && LA12_48<='Z')||LA12_48=='_'||(LA12_48>='a' && LA12_48<='z')) ) {
                    alt12=32;
                }
                else {
                    alt12=22;}
            }
            else {
                alt12=32;}
            }
            break;
        case 'E':
            {
            int LA12_22 = input.LA(2);

            if ( (LA12_22=='L') ) {
                int LA12_49 = input.LA(3);

                if ( (LA12_49=='S') ) {
                    int LA12_67 = input.LA(4);

                    if ( (LA12_67=='E') ) {
                        int LA12_80 = input.LA(5);

                        if ( ((LA12_80>='0' && LA12_80<='9')||(LA12_80>='A' && LA12_80<='Z')||LA12_80=='_'||(LA12_80>='a' && LA12_80<='z')) ) {
                            alt12=32;
                        }
                        else {
                            alt12=24;}
                    }
                    else {
                        alt12=32;}
                }
                else {
                    alt12=32;}
            }
            else {
                alt12=32;}
            }
            break;
        case '&':
            {
            alt12=25;
            }
            break;
        case '|':
            {
            alt12=26;
            }
            break;
        case '<':
            {
            int LA12_25 = input.LA(2);

            if ( (LA12_25=='=') ) {
                alt12=29;
            }
            else {
                alt12=27;}
            }
            break;
        case '>':
            {
            int LA12_26 = input.LA(2);

            if ( (LA12_26=='=') ) {
                alt12=30;
            }
            else {
                alt12=28;}
            }
            break;
        case '=':
            {
            alt12=31;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'F':
        case 'G':
        case 'H':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '^':
        case '_':
        case 'c':
        case 'd':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'q':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt12=32;
            }
            break;
        case '\"':
        case '\'':
            {
            alt12=33;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt12=34;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt12=35;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 0, input);

            throw nvae;
        }

        switch (alt12) {
            case 1 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:10: T10
                {
                mT10(); 

                }
                break;
            case 2 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:14: T11
                {
                mT11(); 

                }
                break;
            case 3 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:18: T12
                {
                mT12(); 

                }
                break;
            case 4 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:22: T13
                {
                mT13(); 

                }
                break;
            case 5 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:26: T14
                {
                mT14(); 

                }
                break;
            case 6 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:30: T15
                {
                mT15(); 

                }
                break;
            case 7 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:34: T16
                {
                mT16(); 

                }
                break;
            case 8 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:38: T17
                {
                mT17(); 

                }
                break;
            case 9 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:42: T18
                {
                mT18(); 

                }
                break;
            case 10 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:46: T19
                {
                mT19(); 

                }
                break;
            case 11 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:50: T20
                {
                mT20(); 

                }
                break;
            case 12 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:54: T21
                {
                mT21(); 

                }
                break;
            case 13 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:58: T22
                {
                mT22(); 

                }
                break;
            case 14 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:62: T23
                {
                mT23(); 

                }
                break;
            case 15 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:66: T24
                {
                mT24(); 

                }
                break;
            case 16 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:70: T25
                {
                mT25(); 

                }
                break;
            case 17 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:74: T26
                {
                mT26(); 

                }
                break;
            case 18 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:78: T27
                {
                mT27(); 

                }
                break;
            case 19 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:82: T28
                {
                mT28(); 

                }
                break;
            case 20 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:86: T29
                {
                mT29(); 

                }
                break;
            case 21 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:90: T30
                {
                mT30(); 

                }
                break;
            case 22 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:94: T31
                {
                mT31(); 

                }
                break;
            case 23 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:98: T32
                {
                mT32(); 

                }
                break;
            case 24 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:102: T33
                {
                mT33(); 

                }
                break;
            case 25 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:106: T34
                {
                mT34(); 

                }
                break;
            case 26 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:110: T35
                {
                mT35(); 

                }
                break;
            case 27 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:114: T36
                {
                mT36(); 

                }
                break;
            case 28 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:118: T37
                {
                mT37(); 

                }
                break;
            case 29 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:122: T38
                {
                mT38(); 

                }
                break;
            case 30 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:126: T39
                {
                mT39(); 

                }
                break;
            case 31 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:130: T40
                {
                mT40(); 

                }
                break;
            case 32 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:134: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:142: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 34 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:154: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 35 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:163: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 36 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:171: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:1:187: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;

        }

    }


 

}