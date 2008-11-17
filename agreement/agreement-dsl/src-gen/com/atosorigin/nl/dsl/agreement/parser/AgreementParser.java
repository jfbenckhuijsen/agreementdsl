// $ANTLR 3.0 ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g 2008-11-17 11:07:47

package com.atosorigin.nl.dsl.agreement.parser;

import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.xtext.parser.impl.AntlrUtil;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.impl.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.model.ParseTreeManager;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import com.atosorigin.nl.dsl.agreement.MetaModelRegistration;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class AgreementParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'plan'", "'rate'", "':'", "'event'", "'amount'", "'account'", "'['", "']'", "'.'", "'/'", "'USAGE'", "'SERVICE_CALL'", "'TAX'", "'-'", "'base-usage'", "'service'", "'tax'", "'('", "')'", "'+'", "'*'", "'IF'", "'THEN'", "'ELSE'", "'&'", "'|'", "'<'", "'>'", "'<='", "'>='", "'='"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_INT=5;
    public static final int RULE_WS=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public AgreementParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[51+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g"; }



    	private Token getLastToken() {
    		return input.LT(-1);
    	}
    	private Token getNextToken() {
    		return input.LT(1);
    	}

    	private int line() {
    		Token t = getNextToken();
    		if (t==null)
    			return 1;
    		return t.getLine();
    	}

    	private int start() {
    		Token t = getNextToken();
    		if (t==null)
    			return 0;
    		if (t instanceof CommonToken) {
    			return ((CommonToken)t).getStartIndex();
    		}
    		return t.getTokenIndex();
    	}

    	private int end() {
    		Token t = getLastToken();
    		if (t==null)
    			return 1;
    		if (t instanceof CommonToken) {
    			return ((CommonToken)t).getStopIndex()+1;
    		}
    		return t.getTokenIndex();
    	}

    	protected Object convert(Object arg) {
    		if (arg instanceof org.antlr.runtime.Token) {
    			Token t = (Token) arg;
    			String s = t.getText();
    			if (t.getType() == AgreementLexer.RULE_ID && s.startsWith("^")) {
    				return s.substring(1);
    			} else if (t.getType()==AgreementLexer.RULE_STRING) {
    				return s.substring(1,s.length()-1);
    			} else if (t.getType()==AgreementLexer.RULE_INT) {
    				return Integer.valueOf(s);
    			}
    			return s;
    		}
    		return arg;
    	}


    	private EcoreModelFactory factory = new EcoreModelFactory(MetaModelRegistration.getEPackage());
        private ParseTreeManager ptm = new ParseTreeManager();
    	private XtextFile xtextfile = MetaModelRegistration.getXtextFile();
    	
    	{
    		
    	}

    	public ParseTreeManager getResult() {
    		return ptm;
    	}

    	private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
    	public List<ErrorMsg> getErrors() {
    		return errors;
    	}

    	@Override
    		public void reportError(RecognitionException e) {
    		String msg = super.getErrorMessage(e,tokenNames);
    		errors.add(AntlrUtil.create(msg,e,tokenNames));
    			ptm.addError(msg, e);
    			ptm.ruleFinished(null, end());
    		}




    // $ANTLR start parse
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:121:1: parse returns [Node r] : result= rulePlan EOF ;
    public Node parse() throws RecognitionException {
        Node r = null;
        int parse_StartIndex = input.index();
        EObject result = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return r; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:122:3: (result= rulePlan EOF )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:122:3: result= rulePlan EOF
            {
            pushFollow(FOLLOW_rulePlan_in_parse67);
            result=rulePlan();
            _fsp--;
            if (failed) return r;
            match(input,EOF,FOLLOW_EOF_in_parse69); if (failed) return r;
            if ( backtracking==0 ) {
              ptm.ruleFinished(result,end());r = ptm.getCurrent();
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 1, parse_StartIndex); }
        }
        return r;
    }
    // $ANTLR end parse


    // $ANTLR start rulePlan
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:125:1: rulePlan returns [EObject result] : ( ( 'plan' ) (temp_name= RULE_ID ) (temp_rates= ruleRateDecl )* (temp_eventRules= ruleEventRulesDecl )* ) ;
    public EObject rulePlan() throws RecognitionException {
        EObject result = null;
        int rulePlan_StartIndex = input.index();
        Token temp_name=null;
        EObject temp_rates = null;

        EObject temp_eventRules = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return result; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:126:4: ( ( ( 'plan' ) (temp_name= RULE_ID ) (temp_rates= ruleRateDecl )* (temp_eventRules= ruleEventRulesDecl )* ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:126:4: ( ( 'plan' ) (temp_name= RULE_ID ) (temp_rates= ruleRateDecl )* (temp_eventRules= ruleEventRulesDecl )* )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Plan");
              				ptm.setModelElement(result);
              			 
            }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:130:1: ( ( 'plan' ) (temp_name= RULE_ID ) (temp_rates= ruleRateDecl )* (temp_eventRules= ruleEventRulesDecl )* )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:130:2: ( 'plan' ) (temp_name= RULE_ID ) (temp_rates= ruleRateDecl )* (temp_eventRules= ruleEventRulesDecl )*
            {
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:130:2: ( 'plan' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:130:3: 'plan'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,10,FOLLOW_10_in_rulePlan91); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:132:1: (temp_name= RULE_ID )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:132:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlan100); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:135:1: (temp_rates= ruleRateDecl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:135:2: temp_rates= ruleRateDecl
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(2)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleRateDecl_in_rulePlan111);
            	    temp_rates=ruleRateDecl();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"rates",convert(temp_rates),false); ptm.ruleFinished(temp_rates,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:138:1: (temp_eventRules= ruleEventRulesDecl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:138:2: temp_eventRules= ruleEventRulesDecl
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(3)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleEventRulesDecl_in_rulePlan123);
            	    temp_eventRules=ruleEventRulesDecl();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"eventRules",convert(temp_eventRules),false); ptm.ruleFinished(temp_eventRules,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 2, rulePlan_StartIndex); }
        }
        return result;
    }
    // $ANTLR end rulePlan


    // $ANTLR start ruleRateDecl
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:143:1: ruleRateDecl returns [EObject result] : ( ( 'rate' ) (temp_name= RULE_ID ) (temp_values= ruleValueDecl )* ) ;
    public EObject ruleRateDecl() throws RecognitionException {
        EObject result = null;
        int ruleRateDecl_StartIndex = input.index();
        Token temp_name=null;
        EObject temp_values = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return result; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:144:4: ( ( ( 'rate' ) (temp_name= RULE_ID ) (temp_values= ruleValueDecl )* ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:144:4: ( ( 'rate' ) (temp_name= RULE_ID ) (temp_values= ruleValueDecl )* )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "RateDecl");
              				ptm.setModelElement(result);
              			 
            }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:148:1: ( ( 'rate' ) (temp_name= RULE_ID ) (temp_values= ruleValueDecl )* )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:148:2: ( 'rate' ) (temp_name= RULE_ID ) (temp_values= ruleValueDecl )*
            {
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:148:2: ( 'rate' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:148:3: 'rate'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,11,FOLLOW_11_in_ruleRateDecl151); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:150:1: (temp_name= RULE_ID )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:150:2: temp_name= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRateDecl160); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:153:1: (temp_values= ruleValueDecl )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_INT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:153:2: temp_values= ruleValueDecl
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleValueDecl_in_ruleRateDecl171);
            	    temp_values=ruleValueDecl();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"values",convert(temp_values),false); ptm.ruleFinished(temp_values,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 3, ruleRateDecl_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleRateDecl


    // $ANTLR start ruleValueDecl
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:158:1: ruleValueDecl returns [EObject result] : ( (temp_date= ruleDate ) ( ':' ) (temp_amount= ruleAmount ) ) ;
    public EObject ruleValueDecl() throws RecognitionException {
        EObject result = null;
        int ruleValueDecl_StartIndex = input.index();
        EObject temp_date = null;

        EObject temp_amount = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:159:4: ( ( (temp_date= ruleDate ) ( ':' ) (temp_amount= ruleAmount ) ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:159:4: ( (temp_date= ruleDate ) ( ':' ) (temp_amount= ruleAmount ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ValueDecl");
              				ptm.setModelElement(result);
              			 
            }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:163:1: ( (temp_date= ruleDate ) ( ':' ) (temp_amount= ruleAmount ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:163:2: (temp_date= ruleDate ) ( ':' ) (temp_amount= ruleAmount )
            {
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:163:2: (temp_date= ruleDate )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:163:3: temp_date= ruleDate
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            pushFollow(FOLLOW_ruleDate_in_ruleValueDecl201);
            temp_date=ruleDate();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"date",convert(temp_date),false); ptm.ruleFinished(temp_date,end()); 
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:166:1: ( ':' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:166:2: ':'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,12,FOLLOW_12_in_ruleValueDecl210); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:168:1: (temp_amount= ruleAmount )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:168:2: temp_amount= ruleAmount
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            pushFollow(FOLLOW_ruleAmount_in_ruleValueDecl219);
            temp_amount=ruleAmount();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"amount",convert(temp_amount),false); ptm.ruleFinished(temp_amount,end()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 4, ruleValueDecl_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleValueDecl


    // $ANTLR start ruleEventRulesDecl
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:173:1: ruleEventRulesDecl returns [EObject result] : ( ( 'event' ) (temp_type= ruleEventType ) (temp_postingRules= ruleTemporalPostingRule )* ) ;
    public EObject ruleEventRulesDecl() throws RecognitionException {
        EObject result = null;
        int ruleEventRulesDecl_StartIndex = input.index();
        Object temp_type = null;

        EObject temp_postingRules = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return result; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:174:4: ( ( ( 'event' ) (temp_type= ruleEventType ) (temp_postingRules= ruleTemporalPostingRule )* ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:174:4: ( ( 'event' ) (temp_type= ruleEventType ) (temp_postingRules= ruleTemporalPostingRule )* )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "EventRulesDecl");
              				ptm.setModelElement(result);
              			 
            }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:178:1: ( ( 'event' ) (temp_type= ruleEventType ) (temp_postingRules= ruleTemporalPostingRule )* )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:178:2: ( 'event' ) (temp_type= ruleEventType ) (temp_postingRules= ruleTemporalPostingRule )*
            {
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:178:2: ( 'event' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:178:3: 'event'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,13,FOLLOW_13_in_ruleEventRulesDecl246); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:180:1: (temp_type= ruleEventType )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:180:2: temp_type= ruleEventType
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            pushFollow(FOLLOW_ruleEventType_in_ruleEventRulesDecl255);
            temp_type=ruleEventType();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); 
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:183:1: (temp_postingRules= ruleTemporalPostingRule )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_INT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:183:2: temp_postingRules= ruleTemporalPostingRule
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(2)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleTemporalPostingRule_in_ruleEventRulesDecl266);
            	    temp_postingRules=ruleTemporalPostingRule();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"postingRules",convert(temp_postingRules),false); ptm.ruleFinished(temp_postingRules,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 5, ruleEventRulesDecl_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleEventRulesDecl


    // $ANTLR start ruleTemporalPostingRule
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:188:1: ruleTemporalPostingRule returns [EObject result] : ( (temp_date= ruleDate ) ( ':' ) ( 'amount' ) ( ':' ) (temp_amountRule= ruleAmountRule ) ( 'account' ) ( ':' ) (temp_account= ruleAccountName ) ) ;
    public EObject ruleTemporalPostingRule() throws RecognitionException {
        EObject result = null;
        int ruleTemporalPostingRule_StartIndex = input.index();
        EObject temp_date = null;

        EObject temp_amountRule = null;

        Object temp_account = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return result; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:189:4: ( ( (temp_date= ruleDate ) ( ':' ) ( 'amount' ) ( ':' ) (temp_amountRule= ruleAmountRule ) ( 'account' ) ( ':' ) (temp_account= ruleAccountName ) ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:189:4: ( (temp_date= ruleDate ) ( ':' ) ( 'amount' ) ( ':' ) (temp_amountRule= ruleAmountRule ) ( 'account' ) ( ':' ) (temp_account= ruleAccountName ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "TemporalPostingRule");
              				ptm.setModelElement(result);
              			 
            }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:193:1: ( (temp_date= ruleDate ) ( ':' ) ( 'amount' ) ( ':' ) (temp_amountRule= ruleAmountRule ) ( 'account' ) ( ':' ) (temp_account= ruleAccountName ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:193:2: (temp_date= ruleDate ) ( ':' ) ( 'amount' ) ( ':' ) (temp_amountRule= ruleAmountRule ) ( 'account' ) ( ':' ) (temp_account= ruleAccountName )
            {
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:193:2: (temp_date= ruleDate )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:193:3: temp_date= ruleDate
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            pushFollow(FOLLOW_ruleDate_in_ruleTemporalPostingRule296);
            temp_date=ruleDate();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"date",convert(temp_date),false); ptm.ruleFinished(temp_date,end()); 
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:196:1: ( ':' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:196:2: ':'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,12,FOLLOW_12_in_ruleTemporalPostingRule305); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:198:1: ( 'amount' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:198:2: 'amount'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleTemporalPostingRule312); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:200:1: ( ':' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:200:2: ':'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,12,FOLLOW_12_in_ruleTemporalPostingRule319); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:202:1: (temp_amountRule= ruleAmountRule )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:202:2: temp_amountRule= ruleAmountRule
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            pushFollow(FOLLOW_ruleAmountRule_in_ruleTemporalPostingRule328);
            temp_amountRule=ruleAmountRule();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"amountRule",convert(temp_amountRule),false); ptm.ruleFinished(temp_amountRule,end()); 
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:205:1: ( 'account' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:205:2: 'account'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(5)),line(),start());
            }
            match(input,15,FOLLOW_15_in_ruleTemporalPostingRule337); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:207:1: ( ':' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:207:2: ':'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(6)),line(),start());
            }
            match(input,12,FOLLOW_12_in_ruleTemporalPostingRule344); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:209:1: (temp_account= ruleAccountName )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:209:2: temp_account= ruleAccountName
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(7)),line(),start());
            }
            pushFollow(FOLLOW_ruleAccountName_in_ruleTemporalPostingRule353);
            temp_account=ruleAccountName();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"account",convert(temp_account),false); ptm.ruleFinished(temp_account,end()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 6, ruleTemporalPostingRule_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleTemporalPostingRule


    // $ANTLR start ruleAmount
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:214:1: ruleAmount returns [EObject result] : ( (temp_value= ruleDouble ) ( ( '[' ) (temp_unit= ruleUnit ) ( ']' ) )? ) ;
    public EObject ruleAmount() throws RecognitionException {
        EObject result = null;
        int ruleAmount_StartIndex = input.index();
        String temp_value = null;

        String temp_unit = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:215:4: ( ( (temp_value= ruleDouble ) ( ( '[' ) (temp_unit= ruleUnit ) ( ']' ) )? ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:215:4: ( (temp_value= ruleDouble ) ( ( '[' ) (temp_unit= ruleUnit ) ( ']' ) )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Amount");
              				ptm.setModelElement(result);
              			 
            }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:219:1: ( (temp_value= ruleDouble ) ( ( '[' ) (temp_unit= ruleUnit ) ( ']' ) )? )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:219:2: (temp_value= ruleDouble ) ( ( '[' ) (temp_unit= ruleUnit ) ( ']' ) )?
            {
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:219:2: (temp_value= ruleDouble )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:219:3: temp_value= ruleDouble
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            pushFollow(FOLLOW_ruleDouble_in_ruleAmount382);
            temp_value=ruleDouble();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"value",convert(temp_value),false); ptm.ruleFinished(temp_value,end()); 
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:222:1: ( ( '[' ) (temp_unit= ruleUnit ) ( ']' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:222:2: ( '[' ) (temp_unit= ruleUnit ) ( ']' )
                    {
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:222:2: ( '[' )
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:222:3: '['
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    match(input,16,FOLLOW_16_in_ruleAmount392); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:224:1: (temp_unit= ruleUnit )
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:224:2: temp_unit= ruleUnit
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleUnit_in_ruleAmount401);
                    temp_unit=ruleUnit();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"unit",convert(temp_unit),false); ptm.ruleFinished(temp_unit,end()); 
                    }

                    }

                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:227:1: ( ']' )
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:227:2: ']'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());
                    }
                    match(input,17,FOLLOW_17_in_ruleAmount410); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 7, ruleAmount_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleAmount


    // $ANTLR start ruleDouble
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:232:1: ruleDouble returns [String s] : ( ( (temp_INT= RULE_INT ) ( ( ( '.' ) (temp_INT= RULE_INT ) ) )? ) ) ;
    public String ruleDouble() throws RecognitionException {
        String s = null;
        int ruleDouble_StartIndex = input.index();
        Token temp_INT=null;

        StringBuffer buff = new StringBuffer();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return s; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:235:1: ( ( ( (temp_INT= RULE_INT ) ( ( ( '.' ) (temp_INT= RULE_INT ) ) )? ) ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:235:1: ( ( (temp_INT= RULE_INT ) ( ( ( '.' ) (temp_INT= RULE_INT ) ) )? ) )
            {
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:235:1: ( ( (temp_INT= RULE_INT ) ( ( ( '.' ) (temp_INT= RULE_INT ) ) )? ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:235:2: ( (temp_INT= RULE_INT ) ( ( ( '.' ) (temp_INT= RULE_INT ) ) )? )
            {
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:235:2: ( (temp_INT= RULE_INT ) ( ( ( '.' ) (temp_INT= RULE_INT ) ) )? )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:235:3: (temp_INT= RULE_INT ) ( ( ( '.' ) (temp_INT= RULE_INT ) ) )?
            {
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:235:3: (temp_INT= RULE_INT )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:235:4: temp_INT= RULE_INT
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(0)).eContents().get(0)),line(),start());
            }
            temp_INT=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble446); if (failed) return s;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());

              	if (temp_INT instanceof Token) {
              		if (temp_INT.getType() == AgreementLexer.RULE_ID)
              			temp_INT.setText((String) convert(temp_INT));

              		buff.append(((Token)temp_INT).getText());
              	}

              	
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:246:1: ( ( ( '.' ) (temp_INT= RULE_INT ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:246:2: ( ( '.' ) (temp_INT= RULE_INT ) )
                    {
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:246:2: ( ( '.' ) (temp_INT= RULE_INT ) )
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:246:3: ( '.' ) (temp_INT= RULE_INT )
                    {
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:246:3: ( '.' )
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:246:5: '.'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    match(input,18,FOLLOW_18_in_ruleDouble457); if (failed) return s;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end()); buff.append(getLastToken().getText());
                    }

                    }

                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:248:1: (temp_INT= RULE_INT )
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:248:2: temp_INT= RULE_INT
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(0)).eContents().get(1)).eContents().get(1)),line(),start());
                    }
                    temp_INT=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDouble468); if (failed) return s;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());

                      	if (temp_INT instanceof Token) {
                      		if (temp_INT.getType() == AgreementLexer.RULE_ID)
                      			temp_INT.setText((String) convert(temp_INT));

                      		buff.append(((Token)temp_INT).getText());
                      	}

                      	
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               s =buff.toString();
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 8, ruleDouble_StartIndex); }
        }
        return s;
    }
    // $ANTLR end ruleDouble


    // $ANTLR start ruleUnit
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:265:1: ruleUnit returns [String s] : ( ( (temp_ID= RULE_ID ) ( ( ( '/' ) (temp_ID= RULE_ID ) ) )* ) ) ;
    public String ruleUnit() throws RecognitionException {
        String s = null;
        int ruleUnit_StartIndex = input.index();
        Token temp_ID=null;

        StringBuffer buff = new StringBuffer();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return s; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:268:1: ( ( ( (temp_ID= RULE_ID ) ( ( ( '/' ) (temp_ID= RULE_ID ) ) )* ) ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:268:1: ( ( (temp_ID= RULE_ID ) ( ( ( '/' ) (temp_ID= RULE_ID ) ) )* ) )
            {
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:268:1: ( ( (temp_ID= RULE_ID ) ( ( ( '/' ) (temp_ID= RULE_ID ) ) )* ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:268:2: ( (temp_ID= RULE_ID ) ( ( ( '/' ) (temp_ID= RULE_ID ) ) )* )
            {
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:268:2: ( (temp_ID= RULE_ID ) ( ( ( '/' ) (temp_ID= RULE_ID ) ) )* )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:268:3: (temp_ID= RULE_ID ) ( ( ( '/' ) (temp_ID= RULE_ID ) ) )*
            {
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:268:3: (temp_ID= RULE_ID )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:268:4: temp_ID= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(0)).eContents().get(0)),line(),start());
            }
            temp_ID=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnit512); if (failed) return s;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());

              	if (temp_ID instanceof Token) {
              		if (temp_ID.getType() == AgreementLexer.RULE_ID)
              			temp_ID.setText((String) convert(temp_ID));

              		buff.append(((Token)temp_ID).getText());
              	}

              	
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:279:1: ( ( ( '/' ) (temp_ID= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:279:2: ( ( '/' ) (temp_ID= RULE_ID ) )
            	    {
            	    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:279:2: ( ( '/' ) (temp_ID= RULE_ID ) )
            	    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:279:3: ( '/' ) (temp_ID= RULE_ID )
            	    {
            	    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:279:3: ( '/' )
            	    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:279:5: '/'
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());
            	    }
            	    match(input,19,FOLLOW_19_in_ruleUnit523); if (failed) return s;
            	    if ( backtracking==0 ) {
            	      ptm.ruleFinished(getLastToken(),end()); buff.append(getLastToken().getText());
            	    }

            	    }

            	    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:281:1: (temp_ID= RULE_ID )
            	    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:281:2: temp_ID= RULE_ID
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(0)).eContents().get(1)).eContents().get(1)),line(),start());
            	    }
            	    temp_ID=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnit534); if (failed) return s;
            	    if ( backtracking==0 ) {
            	      ptm.ruleFinished(getLastToken(),end());

            	      	if (temp_ID instanceof Token) {
            	      		if (temp_ID.getType() == AgreementLexer.RULE_ID)
            	      			temp_ID.setText((String) convert(temp_ID));

            	      		buff.append(((Token)temp_ID).getText());
            	      	}

            	      	
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               s =buff.toString();
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 9, ruleUnit_StartIndex); }
        }
        return s;
    }
    // $ANTLR end ruleUnit


    // $ANTLR start ruleEventType
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:298:1: ruleEventType returns [Object r] : ( 'USAGE' | 'SERVICE_CALL' | 'TAX' );
    public Object ruleEventType() throws RecognitionException {
        Object r = null;
        int ruleEventType_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return r; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:299:4: ( 'USAGE' | 'SERVICE_CALL' | 'TAX' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("298:1: ruleEventType returns [Object r] : ( 'USAGE' | 'SERVICE_CALL' | 'TAX' );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:299:4: 'USAGE'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)),line(),start());
                    }
                    match(input,20,FOLLOW_20_in_ruleEventType570); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "EventType","Usage"),end());
                    }

                    }
                    break;
                case 2 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:302:7: 'SERVICE_CALL'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(2)),line(),start());
                    }
                    match(input,21,FOLLOW_21_in_ruleEventType588); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "EventType","ServiceCall"),end());
                    }

                    }
                    break;
                case 3 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:305:7: 'TAX'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(3)),line(),start());
                    }
                    match(input,22,FOLLOW_22_in_ruleEventType606); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "EventType","Tax"),end());
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 10, ruleEventType_StartIndex); }
        }
        return r;
    }
    // $ANTLR end ruleEventType


    // $ANTLR start ruleDate
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:310:1: ruleDate returns [EObject result] : ( (temp_year= RULE_INT ) ( '-' ) (temp_month= RULE_INT ) ( '-' ) (temp_day= RULE_INT ) ) ;
    public EObject ruleDate() throws RecognitionException {
        EObject result = null;
        int ruleDate_StartIndex = input.index();
        Token temp_year=null;
        Token temp_month=null;
        Token temp_day=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return result; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:311:4: ( ( (temp_year= RULE_INT ) ( '-' ) (temp_month= RULE_INT ) ( '-' ) (temp_day= RULE_INT ) ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:311:4: ( (temp_year= RULE_INT ) ( '-' ) (temp_month= RULE_INT ) ( '-' ) (temp_day= RULE_INT ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Date");
              				ptm.setModelElement(result);
              			 
            }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:315:1: ( (temp_year= RULE_INT ) ( '-' ) (temp_month= RULE_INT ) ( '-' ) (temp_day= RULE_INT ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:315:2: (temp_year= RULE_INT ) ( '-' ) (temp_month= RULE_INT ) ( '-' ) (temp_day= RULE_INT )
            {
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:315:2: (temp_year= RULE_INT )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:315:3: temp_year= RULE_INT
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            temp_year=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate634); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"year",convert(temp_year),false); ptm.ruleFinished(temp_year,end()); 
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:318:1: ( '-' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:318:2: '-'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,23,FOLLOW_23_in_ruleDate643); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:320:1: (temp_month= RULE_INT )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:320:2: temp_month= RULE_INT
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_month=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate652); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"month",convert(temp_month),false); ptm.ruleFinished(temp_month,end()); 
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:323:1: ( '-' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:323:2: '-'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,23,FOLLOW_23_in_ruleDate661); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:325:1: (temp_day= RULE_INT )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:325:2: temp_day= RULE_INT
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            temp_day=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDate670); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"day",convert(temp_day),false); ptm.ruleFinished(temp_day,end()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 11, ruleDate_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleDate


    // $ANTLR start ruleAccountName
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:330:1: ruleAccountName returns [Object r] : ( 'base-usage' | 'service' | 'tax' );
    public Object ruleAccountName() throws RecognitionException {
        Object r = null;
        int ruleAccountName_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return r; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:331:4: ( 'base-usage' | 'service' | 'tax' )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt9=1;
                }
                break;
            case 25:
                {
                alt9=2;
                }
                break;
            case 26:
                {
                alt9=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("330:1: ruleAccountName returns [Object r] : ( 'base-usage' | 'service' | 'tax' );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:331:4: 'base-usage'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)),line(),start());
                    }
                    match(input,24,FOLLOW_24_in_ruleAccountName697); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "AccountName","BaseUsage"),end());
                    }

                    }
                    break;
                case 2 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:334:7: 'service'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(2)),line(),start());
                    }
                    match(input,25,FOLLOW_25_in_ruleAccountName715); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "AccountName","Service"),end());
                    }

                    }
                    break;
                case 3 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:337:7: 'tax'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(3)),line(),start());
                    }
                    match(input,26,FOLLOW_26_in_ruleAccountName733); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "AccountName","Tax"),end());
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 12, ruleAccountName_StartIndex); }
        }
        return r;
    }
    // $ANTLR end ruleAccountName


    // $ANTLR start ruleAmountRule
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:342:1: ruleAmountRule returns [EObject result] : (temp_ifrule= ruleIfRule | temp_expressionrule= ruleExpressionRule );
    public EObject ruleAmountRule() throws RecognitionException {
        EObject result = null;
        int ruleAmountRule_StartIndex = input.index();
        EObject temp_ifrule = null;

        EObject temp_expressionrule = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return result; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:343:9: (temp_ifrule= ruleIfRule | temp_expressionrule= ruleExpressionRule )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||LA10_0==27) ) {
                alt10=2;
            }
            else {
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("342:1: ruleAmountRule returns [EObject result] : (temp_ifrule= ruleIfRule | temp_expressionrule= ruleExpressionRule );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:343:9: temp_ifrule= ruleIfRule
                    {
                    pushFollow(FOLLOW_ruleIfRule_in_ruleAmountRule761);
                    temp_ifrule=ruleIfRule();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_ifrule;
                    }

                    }
                    break;
                case 2 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:343:64: temp_expressionrule= ruleExpressionRule
                    {
                    pushFollow(FOLLOW_ruleExpressionRule_in_ruleAmountRule776);
                    temp_expressionrule=ruleExpressionRule();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_expressionrule;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 13, ruleAmountRule_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleAmountRule


    // $ANTLR start ruleSingleTermRule
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:345:1: ruleSingleTermRule returns [EObject result] : (temp_literalrule= ruleLiteralRule | temp_variablerule= ruleVariableRule );
    public EObject ruleSingleTermRule() throws RecognitionException {
        EObject result = null;
        int ruleSingleTermRule_StartIndex = input.index();
        EObject temp_literalrule = null;

        EObject temp_variablerule = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return result; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:346:9: (temp_literalrule= ruleLiteralRule | temp_variablerule= ruleVariableRule )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("345:1: ruleSingleTermRule returns [EObject result] : (temp_literalrule= ruleLiteralRule | temp_variablerule= ruleVariableRule );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:346:9: temp_literalrule= ruleLiteralRule
                    {
                    pushFollow(FOLLOW_ruleLiteralRule_in_ruleSingleTermRule801);
                    temp_literalrule=ruleLiteralRule();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_literalrule;
                    }

                    }
                    break;
                case 2 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:346:79: temp_variablerule= ruleVariableRule
                    {
                    pushFollow(FOLLOW_ruleVariableRule_in_ruleSingleTermRule816);
                    temp_variablerule=ruleVariableRule();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_variablerule;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 14, ruleSingleTermRule_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleSingleTermRule


    // $ANTLR start ruleLiteralRule
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:348:1: ruleLiteralRule returns [EObject result] : (temp_value= ruleAmount ) ;
    public EObject ruleLiteralRule() throws RecognitionException {
        EObject result = null;
        int ruleLiteralRule_StartIndex = input.index();
        EObject temp_value = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return result; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:349:4: ( (temp_value= ruleAmount ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:349:4: (temp_value= ruleAmount )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "LiteralRule");
              				ptm.setModelElement(result);
              			 
            }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:353:1: (temp_value= ruleAmount )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:353:2: temp_value= ruleAmount
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)),line(),start());
            }
            pushFollow(FOLLOW_ruleAmount_in_ruleLiteralRule840);
            temp_value=ruleAmount();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"value",convert(temp_value),false); ptm.ruleFinished(temp_value,end()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 15, ruleLiteralRule_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleLiteralRule


    // $ANTLR start ruleVariableRule
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:357:1: ruleVariableRule returns [EObject result] : (temp_variable= RULE_ID ) ;
    public EObject ruleVariableRule() throws RecognitionException {
        EObject result = null;
        int ruleVariableRule_StartIndex = input.index();
        Token temp_variable=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return result; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:358:4: ( (temp_variable= RULE_ID ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:358:4: (temp_variable= RULE_ID )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "VariableRule");
              				ptm.setModelElement(result);
              			 
            }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:362:1: (temp_variable= RULE_ID )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:362:2: temp_variable= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)),line(),start());
            }
            temp_variable=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableRule866); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"variable",convert(temp_variable),false); ptm.ruleFinished(temp_variable,end()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 16, ruleVariableRule_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleVariableRule


    // $ANTLR start ruleExpressionRule
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:366:1: ruleExpressionRule returns [EObject result] : ( (temp_head= ruleExpressionRuleHead ) ( (temp_operator= ruleOperator ) (temp_right= ruleExpressionRule ) )? ) ;
    public EObject ruleExpressionRule() throws RecognitionException {
        EObject result = null;
        int ruleExpressionRule_StartIndex = input.index();
        EObject temp_head = null;

        Object temp_operator = null;

        EObject temp_right = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 17) ) { return result; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:367:4: ( ( (temp_head= ruleExpressionRuleHead ) ( (temp_operator= ruleOperator ) (temp_right= ruleExpressionRule ) )? ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:367:4: ( (temp_head= ruleExpressionRuleHead ) ( (temp_operator= ruleOperator ) (temp_right= ruleExpressionRule ) )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ExpressionRule");
              				ptm.setModelElement(result);
              			 
            }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:371:1: ( (temp_head= ruleExpressionRuleHead ) ( (temp_operator= ruleOperator ) (temp_right= ruleExpressionRule ) )? )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:371:2: (temp_head= ruleExpressionRuleHead ) ( (temp_operator= ruleOperator ) (temp_right= ruleExpressionRule ) )?
            {
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:371:2: (temp_head= ruleExpressionRuleHead )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:371:3: temp_head= ruleExpressionRuleHead
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            pushFollow(FOLLOW_ruleExpressionRuleHead_in_ruleExpressionRule893);
            temp_head=ruleExpressionRuleHead();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"head",convert(temp_head),false); ptm.ruleFinished(temp_head,end()); 
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:374:1: ( (temp_operator= ruleOperator ) (temp_right= ruleExpressionRule ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19||LA12_0==23||(LA12_0>=29 && LA12_0<=30)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:374:2: (temp_operator= ruleOperator ) (temp_right= ruleExpressionRule )
                    {
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:374:2: (temp_operator= ruleOperator )
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:374:3: temp_operator= ruleOperator
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleOperator_in_ruleExpressionRule905);
                    temp_operator=ruleOperator();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"operator",convert(temp_operator),false); ptm.ruleFinished(temp_operator,end()); 
                    }

                    }

                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:377:1: (temp_right= ruleExpressionRule )
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:377:2: temp_right= ruleExpressionRule
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());
                    }
                    pushFollow(FOLLOW_ruleExpressionRule_in_ruleExpressionRule916);
                    temp_right=ruleExpressionRule();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"right",convert(temp_right),false); ptm.ruleFinished(temp_right,end()); 
                    }

                    }


                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 17, ruleExpressionRule_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleExpressionRule


    // $ANTLR start ruleExpressionRuleHead
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:383:1: ruleExpressionRuleHead returns [EObject result] : (temp_singletermrule= ruleSingleTermRule | temp_expressionruleparenthesised= ruleExpressionRuleParenthesised );
    public EObject ruleExpressionRuleHead() throws RecognitionException {
        EObject result = null;
        int ruleExpressionRuleHead_StartIndex = input.index();
        EObject temp_singletermrule = null;

        EObject temp_expressionruleparenthesised = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 18) ) { return result; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:384:9: (temp_singletermrule= ruleSingleTermRule | temp_expressionruleparenthesised= ruleExpressionRuleParenthesised )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)) ) {
                alt13=1;
            }
            else if ( (LA13_0==27) ) {
                alt13=2;
            }
            else {
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("383:1: ruleExpressionRuleHead returns [EObject result] : (temp_singletermrule= ruleSingleTermRule | temp_expressionruleparenthesised= ruleExpressionRuleParenthesised );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:384:9: temp_singletermrule= ruleSingleTermRule
                    {
                    pushFollow(FOLLOW_ruleSingleTermRule_in_ruleExpressionRuleHead948);
                    temp_singletermrule=ruleSingleTermRule();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_singletermrule;
                    }

                    }
                    break;
                case 2 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:384:88: temp_expressionruleparenthesised= ruleExpressionRuleParenthesised
                    {
                    pushFollow(FOLLOW_ruleExpressionRuleParenthesised_in_ruleExpressionRuleHead963);
                    temp_expressionruleparenthesised=ruleExpressionRuleParenthesised();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_expressionruleparenthesised;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 18, ruleExpressionRuleHead_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleExpressionRuleHead


    // $ANTLR start ruleExpressionRuleParenthesised
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:386:1: ruleExpressionRuleParenthesised returns [EObject result] : ( ( '(' ) (temp_expression= ruleExpressionRule ) ( ')' ) ) ;
    public EObject ruleExpressionRuleParenthesised() throws RecognitionException {
        EObject result = null;
        int ruleExpressionRuleParenthesised_StartIndex = input.index();
        EObject temp_expression = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 19) ) { return result; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:387:4: ( ( ( '(' ) (temp_expression= ruleExpressionRule ) ( ')' ) ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:387:4: ( ( '(' ) (temp_expression= ruleExpressionRule ) ( ')' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ExpressionRuleParenthesised");
              				ptm.setModelElement(result);
              			 
            }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:391:1: ( ( '(' ) (temp_expression= ruleExpressionRule ) ( ')' ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:391:2: ( '(' ) (temp_expression= ruleExpressionRule ) ( ')' )
            {
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:391:2: ( '(' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:391:3: '('
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,27,FOLLOW_27_in_ruleExpressionRuleParenthesised986); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:393:1: (temp_expression= ruleExpressionRule )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:393:2: temp_expression= ruleExpressionRule
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            pushFollow(FOLLOW_ruleExpressionRule_in_ruleExpressionRuleParenthesised995);
            temp_expression=ruleExpressionRule();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"expression",convert(temp_expression),false); ptm.ruleFinished(temp_expression,end()); 
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:396:1: ( ')' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:396:2: ')'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,28,FOLLOW_28_in_ruleExpressionRuleParenthesised1004); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 19, ruleExpressionRuleParenthesised_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleExpressionRuleParenthesised


    // $ANTLR start ruleOperator
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:400:1: ruleOperator returns [Object r] : ( '+' | '-' | '*' | '/' );
    public Object ruleOperator() throws RecognitionException {
        Object r = null;
        int ruleOperator_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 20) ) { return r; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:401:4: ( '+' | '-' | '*' | '/' )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt14=1;
                }
                break;
            case 23:
                {
                alt14=2;
                }
                break;
            case 30:
                {
                alt14=3;
                }
                break;
            case 19:
                {
                alt14=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("400:1: ruleOperator returns [Object r] : ( '+' | '-' | '*' | '/' );", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:401:4: '+'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)),line(),start());
                    }
                    match(input,29,FOLLOW_29_in_ruleOperator1029); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "Operator","Add"),end());
                    }

                    }
                    break;
                case 2 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:404:7: '-'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(2)),line(),start());
                    }
                    match(input,23,FOLLOW_23_in_ruleOperator1047); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "Operator","Substract"),end());
                    }

                    }
                    break;
                case 3 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:407:7: '*'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(3)),line(),start());
                    }
                    match(input,30,FOLLOW_30_in_ruleOperator1065); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "Operator","Multiply"),end());
                    }

                    }
                    break;
                case 4 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:410:7: '/'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(4)),line(),start());
                    }
                    match(input,19,FOLLOW_19_in_ruleOperator1083); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "Operator","Divide"),end());
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 20, ruleOperator_StartIndex); }
        }
        return r;
    }
    // $ANTLR end ruleOperator


    // $ANTLR start ruleIfRule
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:415:1: ruleIfRule returns [EObject result] : ( ( 'IF' ) (temp_comparison= ruleComparison ) ( 'THEN' ) (temp_then= ruleExpressionRule ) ( 'ELSE' ) (temp_else= ruleExpressionRule ) ) ;
    public EObject ruleIfRule() throws RecognitionException {
        EObject result = null;
        int ruleIfRule_StartIndex = input.index();
        EObject temp_comparison = null;

        EObject temp_then = null;

        EObject temp_else = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 21) ) { return result; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:416:4: ( ( ( 'IF' ) (temp_comparison= ruleComparison ) ( 'THEN' ) (temp_then= ruleExpressionRule ) ( 'ELSE' ) (temp_else= ruleExpressionRule ) ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:416:4: ( ( 'IF' ) (temp_comparison= ruleComparison ) ( 'THEN' ) (temp_then= ruleExpressionRule ) ( 'ELSE' ) (temp_else= ruleExpressionRule ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "IfRule");
              				ptm.setModelElement(result);
              			 
            }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:420:1: ( ( 'IF' ) (temp_comparison= ruleComparison ) ( 'THEN' ) (temp_then= ruleExpressionRule ) ( 'ELSE' ) (temp_else= ruleExpressionRule ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:420:2: ( 'IF' ) (temp_comparison= ruleComparison ) ( 'THEN' ) (temp_then= ruleExpressionRule ) ( 'ELSE' ) (temp_else= ruleExpressionRule )
            {
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:420:2: ( 'IF' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:420:3: 'IF'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,31,FOLLOW_31_in_ruleIfRule1109); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:422:1: (temp_comparison= ruleComparison )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:422:2: temp_comparison= ruleComparison
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleIfRule1118);
            temp_comparison=ruleComparison();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"comparison",convert(temp_comparison),false); ptm.ruleFinished(temp_comparison,end()); 
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:425:1: ( 'THEN' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:425:2: 'THEN'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,32,FOLLOW_32_in_ruleIfRule1127); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:427:1: (temp_then= ruleExpressionRule )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:427:2: temp_then= ruleExpressionRule
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            pushFollow(FOLLOW_ruleExpressionRule_in_ruleIfRule1136);
            temp_then=ruleExpressionRule();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"then",convert(temp_then),false); ptm.ruleFinished(temp_then,end()); 
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:430:1: ( 'ELSE' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:430:2: 'ELSE'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            match(input,33,FOLLOW_33_in_ruleIfRule1145); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:432:1: (temp_else= ruleExpressionRule )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:432:2: temp_else= ruleExpressionRule
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(5)),line(),start());
            }
            pushFollow(FOLLOW_ruleExpressionRule_in_ruleIfRule1154);
            temp_else=ruleExpressionRule();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"else",convert(temp_else),false); ptm.ruleFinished(temp_else,end()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 21, ruleIfRule_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleIfRule


    // $ANTLR start ruleComparison
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:437:1: ruleComparison returns [EObject result] : (temp_compoundcomparison= ruleCompoundComparison | temp_simplecomparison= ruleSimpleComparison );
    public EObject ruleComparison() throws RecognitionException {
        EObject result = null;
        int ruleComparison_StartIndex = input.index();
        EObject temp_compoundcomparison = null;

        EObject temp_simplecomparison = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 22) ) { return result; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:438:9: (temp_compoundcomparison= ruleCompoundComparison | temp_simplecomparison= ruleSimpleComparison )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:438:9: temp_compoundcomparison= ruleCompoundComparison
                    {
                    pushFollow(FOLLOW_ruleCompoundComparison_in_ruleComparison1183);
                    temp_compoundcomparison=ruleCompoundComparison();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_compoundcomparison;
                    }

                    }
                    break;
                case 2 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:438:100: temp_simplecomparison= ruleSimpleComparison
                    {
                    pushFollow(FOLLOW_ruleSimpleComparison_in_ruleComparison1198);
                    temp_simplecomparison=ruleSimpleComparison();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_simplecomparison;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 22, ruleComparison_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleComparison


    // $ANTLR start ruleCompoundComparison
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:440:1: ruleCompoundComparison returns [EObject result] : (temp_andcomparison= ruleAndComparison | temp_orcomparison= ruleOrComparison );
    public EObject ruleCompoundComparison() throws RecognitionException {
        EObject result = null;
        int ruleCompoundComparison_StartIndex = input.index();
        EObject temp_andcomparison = null;

        EObject temp_orcomparison = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 23) ) { return result; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:441:9: (temp_andcomparison= ruleAndComparison | temp_orcomparison= ruleOrComparison )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:441:9: temp_andcomparison= ruleAndComparison
                    {
                    pushFollow(FOLLOW_ruleAndComparison_in_ruleCompoundComparison1223);
                    temp_andcomparison=ruleAndComparison();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_andcomparison;
                    }

                    }
                    break;
                case 2 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:441:85: temp_orcomparison= ruleOrComparison
                    {
                    pushFollow(FOLLOW_ruleOrComparison_in_ruleCompoundComparison1238);
                    temp_orcomparison=ruleOrComparison();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_orcomparison;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 23, ruleCompoundComparison_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleCompoundComparison


    // $ANTLR start ruleAndComparison
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:443:1: ruleAndComparison returns [EObject result] : ( (temp_left= ruleSimpleComparison ) ( '&' ) (temp_right= ruleSimpleComparison ) ) ;
    public EObject ruleAndComparison() throws RecognitionException {
        EObject result = null;
        int ruleAndComparison_StartIndex = input.index();
        EObject temp_left = null;

        EObject temp_right = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 24) ) { return result; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:444:4: ( ( (temp_left= ruleSimpleComparison ) ( '&' ) (temp_right= ruleSimpleComparison ) ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:444:4: ( (temp_left= ruleSimpleComparison ) ( '&' ) (temp_right= ruleSimpleComparison ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "AndComparison");
              				ptm.setModelElement(result);
              			 
            }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:448:1: ( (temp_left= ruleSimpleComparison ) ( '&' ) (temp_right= ruleSimpleComparison ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:448:2: (temp_left= ruleSimpleComparison ) ( '&' ) (temp_right= ruleSimpleComparison )
            {
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:448:2: (temp_left= ruleSimpleComparison )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:448:3: temp_left= ruleSimpleComparison
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            pushFollow(FOLLOW_ruleSimpleComparison_in_ruleAndComparison1263);
            temp_left=ruleSimpleComparison();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"left",convert(temp_left),false); ptm.ruleFinished(temp_left,end()); 
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:451:1: ( '&' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:451:2: '&'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,34,FOLLOW_34_in_ruleAndComparison1272); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:453:1: (temp_right= ruleSimpleComparison )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:453:2: temp_right= ruleSimpleComparison
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            pushFollow(FOLLOW_ruleSimpleComparison_in_ruleAndComparison1281);
            temp_right=ruleSimpleComparison();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"right",convert(temp_right),false); ptm.ruleFinished(temp_right,end()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 24, ruleAndComparison_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleAndComparison


    // $ANTLR start ruleOrComparison
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:458:1: ruleOrComparison returns [EObject result] : ( (temp_left= ruleSimpleComparison ) ( '|' ) (temp_right= ruleSimpleComparison ) ) ;
    public EObject ruleOrComparison() throws RecognitionException {
        EObject result = null;
        int ruleOrComparison_StartIndex = input.index();
        EObject temp_left = null;

        EObject temp_right = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 25) ) { return result; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:459:4: ( ( (temp_left= ruleSimpleComparison ) ( '|' ) (temp_right= ruleSimpleComparison ) ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:459:4: ( (temp_left= ruleSimpleComparison ) ( '|' ) (temp_right= ruleSimpleComparison ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "OrComparison");
              				ptm.setModelElement(result);
              			 
            }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:463:1: ( (temp_left= ruleSimpleComparison ) ( '|' ) (temp_right= ruleSimpleComparison ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:463:2: (temp_left= ruleSimpleComparison ) ( '|' ) (temp_right= ruleSimpleComparison )
            {
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:463:2: (temp_left= ruleSimpleComparison )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:463:3: temp_left= ruleSimpleComparison
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            pushFollow(FOLLOW_ruleSimpleComparison_in_ruleOrComparison1310);
            temp_left=ruleSimpleComparison();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"left",convert(temp_left),false); ptm.ruleFinished(temp_left,end()); 
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:466:1: ( '|' )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:466:2: '|'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,35,FOLLOW_35_in_ruleOrComparison1319); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:468:1: (temp_right= ruleSimpleComparison )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:468:2: temp_right= ruleSimpleComparison
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            pushFollow(FOLLOW_ruleSimpleComparison_in_ruleOrComparison1328);
            temp_right=ruleSimpleComparison();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"right",convert(temp_right),false); ptm.ruleFinished(temp_right,end()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 25, ruleOrComparison_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleOrComparison


    // $ANTLR start ruleSimpleComparison
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:473:1: ruleSimpleComparison returns [EObject result] : ( (temp_left= ruleSingleTermRule ) (temp_operator= ruleComparator ) (temp_right= ruleSingleTermRule ) ) ;
    public EObject ruleSimpleComparison() throws RecognitionException {
        EObject result = null;
        int ruleSimpleComparison_StartIndex = input.index();
        EObject temp_left = null;

        Object temp_operator = null;

        EObject temp_right = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 26) ) { return result; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:474:4: ( ( (temp_left= ruleSingleTermRule ) (temp_operator= ruleComparator ) (temp_right= ruleSingleTermRule ) ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:474:4: ( (temp_left= ruleSingleTermRule ) (temp_operator= ruleComparator ) (temp_right= ruleSingleTermRule ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "SimpleComparison");
              				ptm.setModelElement(result);
              			 
            }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:478:1: ( (temp_left= ruleSingleTermRule ) (temp_operator= ruleComparator ) (temp_right= ruleSingleTermRule ) )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:478:2: (temp_left= ruleSingleTermRule ) (temp_operator= ruleComparator ) (temp_right= ruleSingleTermRule )
            {
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:478:2: (temp_left= ruleSingleTermRule )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:478:3: temp_left= ruleSingleTermRule
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(24)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            pushFollow(FOLLOW_ruleSingleTermRule_in_ruleSimpleComparison1357);
            temp_left=ruleSingleTermRule();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"left",convert(temp_left),false); ptm.ruleFinished(temp_left,end()); 
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:481:1: (temp_operator= ruleComparator )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:481:2: temp_operator= ruleComparator
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(24)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            pushFollow(FOLLOW_ruleComparator_in_ruleSimpleComparison1368);
            temp_operator=ruleComparator();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"operator",convert(temp_operator),false); ptm.ruleFinished(temp_operator,end()); 
            }

            }

            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:484:1: (temp_right= ruleSingleTermRule )
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:484:2: temp_right= ruleSingleTermRule
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(24)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            pushFollow(FOLLOW_ruleSingleTermRule_in_ruleSimpleComparison1379);
            temp_right=ruleSingleTermRule();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"right",convert(temp_right),false); ptm.ruleFinished(temp_right,end()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 26, ruleSimpleComparison_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleSimpleComparison


    // $ANTLR start ruleComparator
    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:489:1: ruleComparator returns [Object r] : ( '<' | '>' | '<=' | '>=' | '=' );
    public Object ruleComparator() throws RecognitionException {
        Object r = null;
        int ruleComparator_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 27) ) { return r; }
            // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:490:4: ( '<' | '>' | '<=' | '>=' | '=' )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt17=1;
                }
                break;
            case 37:
                {
                alt17=2;
                }
                break;
            case 38:
                {
                alt17=3;
                }
                break;
            case 39:
                {
                alt17=4;
                }
                break;
            case 40:
                {
                alt17=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return r;}
                NoViableAltException nvae =
                    new NoViableAltException("489:1: ruleComparator returns [Object r] : ( '<' | '>' | '<=' | '>=' | '=' );", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:490:4: '<'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(25)).eContents().get(1)),line(),start());
                    }
                    match(input,36,FOLLOW_36_in_ruleComparator1406); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "Comparator","Less"),end());
                    }

                    }
                    break;
                case 2 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:493:7: '>'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(25)).eContents().get(2)),line(),start());
                    }
                    match(input,37,FOLLOW_37_in_ruleComparator1424); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "Comparator","More"),end());
                    }

                    }
                    break;
                case 3 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:496:7: '<='
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(25)).eContents().get(3)),line(),start());
                    }
                    match(input,38,FOLLOW_38_in_ruleComparator1442); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "Comparator","LessEqual"),end());
                    }

                    }
                    break;
                case 4 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:499:7: '>='
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(25)).eContents().get(4)),line(),start());
                    }
                    match(input,39,FOLLOW_39_in_ruleComparator1460); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "Comparator","MoreEqual"),end());
                    }

                    }
                    break;
                case 5 :
                    // ..//agreement-dsl/src-gen//com/atosorigin/nl/dsl/agreement/parser/Agreement.g:502:7: '='
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(25)).eContents().get(5)),line(),start());
                    }
                    match(input,40,FOLLOW_40_in_ruleComparator1478); if (failed) return r;
                    if ( backtracking==0 ) {
                      r =ptm.ruleFinished(factory.enumLit("", "Comparator","Equal"),end());
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 27, ruleComparator_StartIndex); }
        }
        return r;
    }
    // $ANTLR end ruleComparator


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA15_eotS =
        "\32\uffff";
    static final String DFA15_eofS =
        "\32\uffff";
    static final String DFA15_minS =
        "\1\4\1\20\1\44\1\5\6\4\1\20\1\21\1\20\1\40\1\4\1\44\1\5\1\4\2\uffff"+
        "\1\21\1\20\1\21\1\4\1\40\1\21";
    static final String DFA15_maxS =
        "\1\5\2\50\1\5\1\4\5\5\1\50\1\23\2\43\1\4\1\50\1\5\1\4\2\uffff\1"+
        "\23\1\43\1\23\1\4\1\43\1\23";
    static final String DFA15_acceptS =
        "\22\uffff\1\1\1\2\6\uffff";
    static final String DFA15_specialS =
        "\32\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\1\1",
            "\1\4\1\uffff\1\3\21\uffff\1\5\1\6\1\7\1\10\1\11",
            "\1\5\1\6\1\7\1\10\1\11",
            "\1\12",
            "\1\13",
            "\1\15\1\14",
            "\1\15\1\14",
            "\1\15\1\14",
            "\1\15\1\14",
            "\1\15\1\14",
            "\1\4\23\uffff\1\5\1\6\1\7\1\10\1\11",
            "\1\17\1\uffff\1\16",
            "\1\21\1\uffff\1\20\15\uffff\1\23\1\uffff\2\22",
            "\1\23\1\uffff\2\22",
            "\1\24",
            "\1\5\1\6\1\7\1\10\1\11",
            "\1\25",
            "\1\26",
            "",
            "",
            "\1\17\1\uffff\1\16",
            "\1\21\17\uffff\1\23\1\uffff\2\22",
            "\1\30\1\uffff\1\27",
            "\1\31",
            "\1\23\1\uffff\2\22",
            "\1\30\1\uffff\1\27"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "437:1: ruleComparison returns [EObject result] : (temp_compoundcomparison= ruleCompoundComparison | temp_simplecomparison= ruleSimpleComparison );";
        }
    }
    static final String DFA16_eotS =
        "\32\uffff";
    static final String DFA16_eofS =
        "\32\uffff";
    static final String DFA16_minS =
        "\1\4\1\20\1\44\1\5\6\4\1\20\1\21\1\20\1\42\1\4\1\44\1\5\1\4\2\uffff"+
        "\1\21\1\20\1\21\1\4\1\42\1\21";
    static final String DFA16_maxS =
        "\1\5\2\50\1\5\1\4\5\5\1\50\1\23\2\43\1\4\1\50\1\5\1\4\2\uffff\1"+
        "\23\1\43\1\23\1\4\1\43\1\23";
    static final String DFA16_acceptS =
        "\22\uffff\1\2\1\1\6\uffff";
    static final String DFA16_specialS =
        "\32\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\2\1\1",
            "\1\4\1\uffff\1\3\21\uffff\1\5\1\6\1\7\1\10\1\11",
            "\1\5\1\6\1\7\1\10\1\11",
            "\1\12",
            "\1\13",
            "\1\15\1\14",
            "\1\15\1\14",
            "\1\15\1\14",
            "\1\15\1\14",
            "\1\15\1\14",
            "\1\4\23\uffff\1\5\1\6\1\7\1\10\1\11",
            "\1\17\1\uffff\1\16",
            "\1\21\1\uffff\1\20\17\uffff\1\23\1\22",
            "\1\23\1\22",
            "\1\24",
            "\1\5\1\6\1\7\1\10\1\11",
            "\1\25",
            "\1\26",
            "",
            "",
            "\1\17\1\uffff\1\16",
            "\1\21\21\uffff\1\23\1\22",
            "\1\30\1\uffff\1\27",
            "\1\31",
            "\1\23\1\22",
            "\1\30\1\uffff\1\27"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "440:1: ruleCompoundComparison returns [EObject result] : (temp_andcomparison= ruleAndComparison | temp_orcomparison= ruleOrComparison );";
        }
    }
 

    public static final BitSet FOLLOW_rulePlan_in_parse67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rulePlan91 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlan100 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_ruleRateDecl_in_rulePlan111 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_ruleEventRulesDecl_in_rulePlan123 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_11_in_ruleRateDecl151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRateDecl160 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleValueDecl_in_ruleRateDecl171 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleDate_in_ruleValueDecl201 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleValueDecl210 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAmount_in_ruleValueDecl219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleEventRulesDecl246 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_ruleEventType_in_ruleEventRulesDecl255 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleTemporalPostingRule_in_ruleEventRulesDecl266 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleDate_in_ruleTemporalPostingRule296 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTemporalPostingRule305 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTemporalPostingRule312 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTemporalPostingRule319 = new BitSet(new long[]{0x0000000088000030L});
    public static final BitSet FOLLOW_ruleAmountRule_in_ruleTemporalPostingRule328 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTemporalPostingRule337 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTemporalPostingRule344 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_ruleAccountName_in_ruleTemporalPostingRule353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDouble_in_ruleAmount382 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleAmount392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUnit_in_ruleAmount401 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAmount410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble446 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleDouble457 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDouble468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnit512 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleUnit523 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnit534 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_20_in_ruleEventType570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleEventType588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleEventType606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate634 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDate643 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate652 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDate661 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDate670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAccountName697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleAccountName715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleAccountName733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfRule_in_ruleAmountRule761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionRule_in_ruleAmountRule776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralRule_in_ruleSingleTermRule801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableRule_in_ruleSingleTermRule816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAmount_in_ruleLiteralRule840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableRule866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionRuleHead_in_ruleExpressionRule893 = new BitSet(new long[]{0x0000000060880002L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleExpressionRule905 = new BitSet(new long[]{0x0000000008000030L});
    public static final BitSet FOLLOW_ruleExpressionRule_in_ruleExpressionRule916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleTermRule_in_ruleExpressionRuleHead948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionRuleParenthesised_in_ruleExpressionRuleHead963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleExpressionRuleParenthesised986 = new BitSet(new long[]{0x0000000008000030L});
    public static final BitSet FOLLOW_ruleExpressionRule_in_ruleExpressionRuleParenthesised995 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleExpressionRuleParenthesised1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOperator1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOperator1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOperator1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOperator1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleIfRule1109 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleIfRule1118 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleIfRule1127 = new BitSet(new long[]{0x0000000008000030L});
    public static final BitSet FOLLOW_ruleExpressionRule_in_ruleIfRule1136 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleIfRule1145 = new BitSet(new long[]{0x0000000008000030L});
    public static final BitSet FOLLOW_ruleExpressionRule_in_ruleIfRule1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundComparison_in_ruleComparison1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleComparison_in_ruleComparison1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndComparison_in_ruleCompoundComparison1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrComparison_in_ruleCompoundComparison1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleComparison_in_ruleAndComparison1263 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleAndComparison1272 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSimpleComparison_in_ruleAndComparison1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleComparison_in_ruleOrComparison1310 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleOrComparison1319 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSimpleComparison_in_ruleOrComparison1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleTermRule_in_ruleSimpleComparison1357 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_ruleComparator_in_ruleSimpleComparison1368 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSingleTermRule_in_ruleSimpleComparison1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleComparator1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleComparator1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleComparator1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleComparator1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleComparator1478 = new BitSet(new long[]{0x0000000000000002L});

}