lexer grammar Agreement;
@members {
	 private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
	public List<ErrorMsg> getErrors() {
		return errors;
	}

	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
		String msg = super.getErrorMessage(e,tokenNames);
		errors.add(AntlrUtil.create(msg,e,tokenNames));
		return msg;
	}
}
@header {
package com.atosorigin.nl.dsl.agreement.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;

}

T10 : 'plan' ;
T11 : 'rate' ;
T12 : ':' ;
T13 : 'event' ;
T14 : 'amount' ;
T15 : 'account' ;
T16 : '[' ;
T17 : ']' ;
T18 : '.' ;
T19 : '/' ;
T20 : 'USAGE' ;
T21 : 'SERVICE_CALL' ;
T22 : 'TAX' ;
T23 : '-' ;
T24 : 'base-usage' ;
T25 : 'service' ;
T26 : 'tax' ;
T27 : '(' ;
T28 : ')' ;
T29 : '+' ;
T30 : '*' ;
T31 : 'IF' ;
T32 : 'THEN' ;
T33 : 'ELSE' ;
T34 : '&' ;
T35 : '|' ;
T36 : '<' ;
T37 : '>' ;
T38 : '<=' ;
T39 : '>=' ;
T40 : '=' ;

// $ANTLR src "..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g" 507
RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

// $ANTLR src "..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g" 513
RULE_STRING :

	 '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

// $ANTLR src "..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g" 520
RULE_INT :

	 ('-')?('0'..'9')+
	 
;

// $ANTLR src "..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g" 526
RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g" 532
RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g" 538
RULE_SL_COMMENT :

	 '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	 
;

