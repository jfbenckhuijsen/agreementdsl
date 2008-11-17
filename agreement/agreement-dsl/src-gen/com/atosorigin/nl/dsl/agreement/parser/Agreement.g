grammar Agreement;
 options{backtrack=true; memoize=true;} 

@lexer::header {
package com.atosorigin.nl.dsl.agreement.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;

}

@parser::header {
package com.atosorigin.nl.dsl.agreement.parser;

import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.xtext.parser.impl.AntlrUtil;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.impl.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.model.ParseTreeManager;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import com.atosorigin.nl.dsl.agreement.MetaModelRegistration;

}
@lexer::members {
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

@parser::members {

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

}


parse returns [Node r]:
	 result=rulePlan EOF
{ptm.ruleFinished(result,end());$r = ptm.getCurrent();};

rulePlan returns [EObject result] :
			{
				$result = factory.create("", "Plan");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());}'plan'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(1)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(2)),line(),start());}temp_rates=ruleRateDecl {factory.add($result,"rates",convert(temp_rates),false); ptm.ruleFinished(temp_rates,end()); }
)*

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(3)),line(),start());}temp_eventRules=ruleEventRulesDecl {factory.add($result,"eventRules",convert(temp_eventRules),false); ptm.ruleFinished(temp_eventRules,end()); }
)*
)
;

ruleRateDecl returns [EObject result] :
			{
				$result = factory.create("", "RateDecl");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());}'rate'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());}temp_name=RULE_ID {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());}temp_values=ruleValueDecl {factory.add($result,"values",convert(temp_values),false); ptm.ruleFinished(temp_values,end()); }
)*
)
;

ruleValueDecl returns [EObject result] :
			{
				$result = factory.create("", "ValueDecl");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(0)),line(),start());}temp_date=ruleDate {factory.set($result,"date",convert(temp_date),false); ptm.ruleFinished(temp_date,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)),line(),start());}':'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(2)),line(),start());}temp_amount=ruleAmount {factory.set($result,"amount",convert(temp_amount),false); ptm.ruleFinished(temp_amount,end()); }
)
)
;

ruleEventRulesDecl returns [EObject result] :
			{
				$result = factory.create("", "EventRulesDecl");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());}'event'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());}temp_type=ruleEventType {factory.set($result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(2)),line(),start());}temp_postingRules=ruleTemporalPostingRule {factory.add($result,"postingRules",convert(temp_postingRules),false); ptm.ruleFinished(temp_postingRules,end()); }
)*
)
;

ruleTemporalPostingRule returns [EObject result] :
			{
				$result = factory.create("", "TemporalPostingRule");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(0)),line(),start());}temp_date=ruleDate {factory.set($result,"date",convert(temp_date),false); ptm.ruleFinished(temp_date,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(1)),line(),start());}':'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(2)),line(),start());}'amount'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(3)),line(),start());}':'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(4)),line(),start());}temp_amountRule=ruleAmountRule {factory.set($result,"amountRule",convert(temp_amountRule),false); ptm.ruleFinished(temp_amountRule,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(5)),line(),start());}'account'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(6)),line(),start());}':'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(7)),line(),start());}temp_account=ruleAccountName {factory.set($result,"account",convert(temp_account),false); ptm.ruleFinished(temp_account,end()); }
)
)
;

ruleAmount returns [EObject result] :
			{
				$result = factory.create("", "Amount");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(0)),line(),start());}temp_value=ruleDouble {factory.set($result,"value",convert(temp_value),false); ptm.ruleFinished(temp_value,end()); }
)

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());}'['{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());}temp_unit=ruleUnit {factory.set($result,"unit",convert(temp_unit),false); ptm.ruleFinished(temp_unit,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());}']'{ptm.ruleFinished(getLastToken(),end());})
)?
)
;

ruleDouble returns [String s] @init {StringBuffer buff = new StringBuffer();} :
	 

((({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(0)).eContents().get(0)),line(),start());} temp_INT=RULE_INT
{ptm.ruleFinished(getLastToken(),end());

	if (temp_INT instanceof Token) {
		if (temp_INT.getType() == AgreementLexer.RULE_ID)
			temp_INT.setText((String) convert(temp_INT));

		buff.append(((Token)temp_INT).getText());
	}

	})
(((	{ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());}	'.' {ptm.ruleFinished(getLastToken(),end()); buff.append(getLastToken().getText());}
)
({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(0)).eContents().get(1)).eContents().get(1)),line(),start());} temp_INT=RULE_INT
{ptm.ruleFinished(getLastToken(),end());

	if (temp_INT instanceof Token) {
		if (temp_INT.getType() == AgreementLexer.RULE_ID)
			temp_INT.setText((String) convert(temp_INT));

		buff.append(((Token)temp_INT).getText());
	}

	}))
)?)
)

	 { $s =buff.toString();}
;

ruleUnit returns [String s] @init {StringBuffer buff = new StringBuffer();} :
	 

((({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(0)).eContents().get(0)),line(),start());} temp_ID=RULE_ID
{ptm.ruleFinished(getLastToken(),end());

	if (temp_ID instanceof Token) {
		if (temp_ID.getType() == AgreementLexer.RULE_ID)
			temp_ID.setText((String) convert(temp_ID));

		buff.append(((Token)temp_ID).getText());
	}

	})
(((	{ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());}	'/' {ptm.ruleFinished(getLastToken(),end()); buff.append(getLastToken().getText());}
)
({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(0)).eContents().get(1)).eContents().get(1)),line(),start());} temp_ID=RULE_ID
{ptm.ruleFinished(getLastToken(),end());

	if (temp_ID instanceof Token) {
		if (temp_ID.getType() == AgreementLexer.RULE_ID)
			temp_ID.setText((String) convert(temp_ID));

		buff.append(((Token)temp_ID).getText());
	}

	}))
)*)
)

	 { $s =buff.toString();}
;

ruleEventType returns [Object r] :
			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)),line(),start());}
		 'USAGE'
		 {$r=ptm.ruleFinished(factory.enumLit("", "EventType","Usage"),end());}
	 |			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(2)),line(),start());}
		 'SERVICE_CALL'
		 {$r=ptm.ruleFinished(factory.enumLit("", "EventType","ServiceCall"),end());}
	 |			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(3)),line(),start());}
		 'TAX'
		 {$r=ptm.ruleFinished(factory.enumLit("", "EventType","Tax"),end());}
;

ruleDate returns [EObject result] :
			{
				$result = factory.create("", "Date");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(0)),line(),start());}temp_year=RULE_INT {factory.set($result,"year",convert(temp_year),false); ptm.ruleFinished(temp_year,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)),line(),start());}'-'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(2)),line(),start());}temp_month=RULE_INT {factory.set($result,"month",convert(temp_month),false); ptm.ruleFinished(temp_month,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(3)),line(),start());}'-'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(4)),line(),start());}temp_day=RULE_INT {factory.set($result,"day",convert(temp_day),false); ptm.ruleFinished(temp_day,end()); }
)
)
;

ruleAccountName returns [Object r] :
			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)),line(),start());}
		 'base-usage'
		 {$r=ptm.ruleFinished(factory.enumLit("", "AccountName","BaseUsage"),end());}
	 |			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(2)),line(),start());}
		 'service'
		 {$r=ptm.ruleFinished(factory.enumLit("", "AccountName","Service"),end());}
	 |			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(3)),line(),start());}
		 'tax'
		 {$r=ptm.ruleFinished(factory.enumLit("", "AccountName","Tax"),end());}
;

ruleAmountRule returns [EObject result] :
        temp_ifrule=ruleIfRule {$result=temp_ifrule;}	|        temp_expressionrule=ruleExpressionRule {$result=temp_expressionrule;}	;

ruleSingleTermRule returns [EObject result] :
        temp_literalrule=ruleLiteralRule {$result=temp_literalrule;}	|        temp_variablerule=ruleVariableRule {$result=temp_variablerule;}	;

ruleLiteralRule returns [EObject result] :
			{
				$result = factory.create("", "LiteralRule");
				ptm.setModelElement($result);
			 }
({ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)),line(),start());}temp_value=ruleAmount {factory.set($result,"value",convert(temp_value),false); ptm.ruleFinished(temp_value,end()); }
)
;

ruleVariableRule returns [EObject result] :
			{
				$result = factory.create("", "VariableRule");
				ptm.setModelElement($result);
			 }
({ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)),line(),start());}temp_variable=RULE_ID {factory.set($result,"variable",convert(temp_variable),false); ptm.ruleFinished(temp_variable,end()); }
)
;

ruleExpressionRule returns [EObject result] :
			{
				$result = factory.create("", "ExpressionRule");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(0)),line(),start());}temp_head=ruleExpressionRuleHead {factory.set($result,"head",convert(temp_head),false); ptm.ruleFinished(temp_head,end()); }
)

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());}temp_operator=ruleOperator {factory.set($result,"operator",convert(temp_operator),false); ptm.ruleFinished(temp_operator,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());}temp_right=ruleExpressionRule {factory.set($result,"right",convert(temp_right),false); ptm.ruleFinished(temp_right,end()); }
)
)?
)
;

ruleExpressionRuleHead returns [EObject result] :
        temp_singletermrule=ruleSingleTermRule {$result=temp_singletermrule;}	|        temp_expressionruleparenthesised=ruleExpressionRuleParenthesised {$result=temp_expressionruleparenthesised;}	;

ruleExpressionRuleParenthesised returns [EObject result] :
			{
				$result = factory.create("", "ExpressionRuleParenthesised");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(0)),line(),start());}'('{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(1)),line(),start());}temp_expression=ruleExpressionRule {factory.set($result,"expression",convert(temp_expression),false); ptm.ruleFinished(temp_expression,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)).eContents().get(2)),line(),start());}')'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleOperator returns [Object r] :
			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)),line(),start());}
		 '+'
		 {$r=ptm.ruleFinished(factory.enumLit("", "Operator","Add"),end());}
	 |			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(2)),line(),start());}
		 '-'
		 {$r=ptm.ruleFinished(factory.enumLit("", "Operator","Substract"),end());}
	 |			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(3)),line(),start());}
		 '*'
		 {$r=ptm.ruleFinished(factory.enumLit("", "Operator","Multiply"),end());}
	 |			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(4)),line(),start());}
		 '/'
		 {$r=ptm.ruleFinished(factory.enumLit("", "Operator","Divide"),end());}
;

ruleIfRule returns [EObject result] :
			{
				$result = factory.create("", "IfRule");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(0)),line(),start());}'IF'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(1)),line(),start());}temp_comparison=ruleComparison {factory.set($result,"comparison",convert(temp_comparison),false); ptm.ruleFinished(temp_comparison,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(2)),line(),start());}'THEN'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(3)),line(),start());}temp_then=ruleExpressionRule {factory.set($result,"then",convert(temp_then),false); ptm.ruleFinished(temp_then,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(4)),line(),start());}'ELSE'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(5)),line(),start());}temp_else=ruleExpressionRule {factory.set($result,"else",convert(temp_else),false); ptm.ruleFinished(temp_else,end()); }
)
)
;

ruleComparison returns [EObject result] :
        temp_compoundcomparison=ruleCompoundComparison {$result=temp_compoundcomparison;}	|        temp_simplecomparison=ruleSimpleComparison {$result=temp_simplecomparison;}	;

ruleCompoundComparison returns [EObject result] :
        temp_andcomparison=ruleAndComparison {$result=temp_andcomparison;}	|        temp_orcomparison=ruleOrComparison {$result=temp_orcomparison;}	;

ruleAndComparison returns [EObject result] :
			{
				$result = factory.create("", "AndComparison");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(0)),line(),start());}temp_left=ruleSimpleComparison {factory.set($result,"left",convert(temp_left),false); ptm.ruleFinished(temp_left,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(1)),line(),start());}'&'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(2)),line(),start());}temp_right=ruleSimpleComparison {factory.set($result,"right",convert(temp_right),false); ptm.ruleFinished(temp_right,end()); }
)
)
;

ruleOrComparison returns [EObject result] :
			{
				$result = factory.create("", "OrComparison");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)).eContents().get(0)),line(),start());}temp_left=ruleSimpleComparison {factory.set($result,"left",convert(temp_left),false); ptm.ruleFinished(temp_left,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)).eContents().get(1)),line(),start());}'|'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)).eContents().get(2)),line(),start());}temp_right=ruleSimpleComparison {factory.set($result,"right",convert(temp_right),false); ptm.ruleFinished(temp_right,end()); }
)
)
;

ruleSimpleComparison returns [EObject result] :
			{
				$result = factory.create("", "SimpleComparison");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(24)).eContents().get(1)).eContents().get(0)),line(),start());}temp_left=ruleSingleTermRule {factory.set($result,"left",convert(temp_left),false); ptm.ruleFinished(temp_left,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(24)).eContents().get(1)).eContents().get(1)),line(),start());}temp_operator=ruleComparator {factory.set($result,"operator",convert(temp_operator),false); ptm.ruleFinished(temp_operator,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(24)).eContents().get(1)).eContents().get(2)),line(),start());}temp_right=ruleSingleTermRule {factory.set($result,"right",convert(temp_right),false); ptm.ruleFinished(temp_right,end()); }
)
)
;

ruleComparator returns [Object r] :
			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(25)).eContents().get(1)),line(),start());}
		 '<'
		 {$r=ptm.ruleFinished(factory.enumLit("", "Comparator","Less"),end());}
	 |			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(25)).eContents().get(2)),line(),start());}
		 '>'
		 {$r=ptm.ruleFinished(factory.enumLit("", "Comparator","More"),end());}
	 |			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(25)).eContents().get(3)),line(),start());}
		 '<='
		 {$r=ptm.ruleFinished(factory.enumLit("", "Comparator","LessEqual"),end());}
	 |			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(25)).eContents().get(4)),line(),start());}
		 '>='
		 {$r=ptm.ruleFinished(factory.enumLit("", "Comparator","MoreEqual"),end());}
	 |			{ptm.invokeRule(((EObject)((EObject)xtextfile.eContents().get(25)).eContents().get(5)),line(),start());}
		 '='
		 {$r=ptm.ruleFinished(factory.enumLit("", "Comparator","Equal"),end());}
;

RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

RULE_STRING :

	 '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

RULE_INT :

	 ('-')?('0'..'9')+
	 
;

RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

RULE_SL_COMMENT :

	 '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	 
;

