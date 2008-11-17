package com.atosorigin.nl.agreement.dsl;

import java.math.BigDecimal;
import java.util.Date;

import com.atosorigin.nl.agreement.dispatcher.AbstractAccountingPostingRule;
import com.atosorigin.nl.agreement.dispatcher.AccountingEvent;
import com.atosorigin.nl.agreement.temporal.TemporalObject;
import com.atosorigin.nl.agreement.utility.events.ServiceCallEvent;
import com.atosorigin.nl.agreement.utility.events.TaxEvent;
import com.atosorigin.nl.agreement.utility.events.UsageEvent;
import com.atosorigin.nl.dsl.agreement.AmountRule;
import com.atosorigin.nl.dsl.agreement.AndComparison;
import com.atosorigin.nl.dsl.agreement.Comparison;
import com.atosorigin.nl.dsl.agreement.CompoundComparison;
import com.atosorigin.nl.dsl.agreement.ExpressionRule;
import com.atosorigin.nl.dsl.agreement.ExpressionRuleHead;
import com.atosorigin.nl.dsl.agreement.ExpressionRuleParenthesised;
import com.atosorigin.nl.dsl.agreement.IfRule;
import com.atosorigin.nl.dsl.agreement.LiteralRule;
import com.atosorigin.nl.dsl.agreement.Operator;
import com.atosorigin.nl.dsl.agreement.OrComparison;
import com.atosorigin.nl.dsl.agreement.SimpleComparison;
import com.atosorigin.nl.dsl.agreement.SingleTermRule;
import com.atosorigin.nl.dsl.agreement.TemporalPostingRule;
import com.atosorigin.nl.dsl.agreement.VariableRule;


/**
 * Implementation of PostingRule, driven by an instance
 * of the corresponding concept from the AgreementDSL.
 * 
 * @author Meinte Boersma
 */
public class PostingRuleImpl extends AbstractAccountingPostingRule {

	private TemporalPostingRule postingRule;
	private AgreementImpl agreement;

	public PostingRuleImpl (TemporalPostingRule postingRule, AgreementImpl agreement) {
		super(postingRule.getAccount().getLiteral());
		this.postingRule = postingRule;
		this.agreement = agreement;
	}

	@Override
	public String getAccount () {
		return postingRule.getAccount().getLiteral();
	}


	private Date date;
	private Double duration;
	private Double baseUsage;
	private Double fee;


	@Override
	protected BigDecimal calculateAmount (AccountingEvent event) {
		// initialize variables from event:
		date = event.getOccured();

		if( event instanceof ServiceCallEvent ) {
			duration = ((ServiceCallEvent) event).getDuration();
		} else {
			duration = 0.0d;
		}
		
		if( event instanceof UsageEvent ) {
			baseUsage = ((UsageEvent) event).getBaseUsage();
		} else {
			baseUsage = 0.0d;
		}
		
		if( event instanceof TaxEvent ) {
			fee = ((TaxEvent) event).getFee();
		} else {
			fee = 0.0d;
		}

		return evaluate(postingRule.getAmountRule());
	}


	private BigDecimal evaluate (AmountRule amountRule) {
		// recurse to evaluate expression:
		if( amountRule instanceof IfRule ) {
			return evalIf( (IfRule) amountRule );
		} else {
			return evalExpr( (ExpressionRule) amountRule );
		}
	}

	private BigDecimal evalIf (IfRule ifRule) {
		if( evalComparison(ifRule.getComparison()) ) {
			return evalExpr(ifRule.getThen());
		} else {
			return evalExpr(ifRule.getElse());
		}
	}

	private boolean evalComparison (Comparison comparison) {
		if( comparison instanceof SimpleComparison ) {
			return evalSimpleComparison( (SimpleComparison) comparison );
		} else {
			return evalCompoundComparison( (CompoundComparison) comparison );
		}
	}

	private boolean evalSimpleComparison (SimpleComparison comparison) {
		BigDecimal left = evalSingleTerm(comparison.getLeft());
		BigDecimal right = evalSingleTerm(comparison.getRight());
		int compResult = left.compareTo(right);

		switch( comparison.getOperator() ) {
			case EQUAL : return compResult == 0;
			case LESS : return compResult < 0;
			case MORE : return compResult > 0;
			default : return true;
		}
	}

	private boolean evalCompoundComparison (CompoundComparison comparison) {
		if( comparison instanceof AndComparison ) {
			return evalAndComparison( (AndComparison) comparison );
		} else {
			return evalOrComparison( (OrComparison) comparison );
		}
	}

	private boolean evalAndComparison (AndComparison comparison) {
		return evalSimpleComparison(comparison.getLeft()) && evalSimpleComparison(comparison.getRight());
	}

	private boolean evalOrComparison (OrComparison comparison) {
		return evalSimpleComparison(comparison.getLeft()) || evalSimpleComparison(comparison.getRight());
	}

	private BigDecimal evalExpr (ExpressionRule expr) {
		BigDecimal headValue = evalExprHead(expr.getHead());

		Operator operator = expr.getOperator();
		if( ! operator.equals(Operator.NULL) ) {
			BigDecimal rightValue = evalExpr( expr.getRight() );
			switch( operator ) {
				case ADD : return headValue.add(rightValue);
				case DIVIDE : return headValue.divide(rightValue);
				case MULTIPLY : return headValue.multiply(rightValue);
				case SUBSTRACT : return headValue.multiply(rightValue);
			}
		}

		return headValue;
	}

	private BigDecimal evalExprHead (ExpressionRuleHead ruleHead) {
		if( ruleHead instanceof SingleTermRule ) {
			return evalSingleTerm( (SingleTermRule) ruleHead );
		} else {
			return evalExpr( ((ExpressionRuleParenthesised) ruleHead).getExpression() );
		}
	}

	private BigDecimal evalSingleTerm (SingleTermRule singleTerm) {
		if( singleTerm instanceof LiteralRule ) {
			return evalLiteral( (LiteralRule) singleTerm );
		} else {
			return evalVariable( (VariableRule) singleTerm );
		}
	}

	private BigDecimal evalLiteral (LiteralRule literal) {
		return new BigDecimal( literal.getValue().getValue() );
	}

	private BigDecimal evalVariable (VariableRule varRule) {
		String varName = varRule.getVariable();

		if( "duration".equals(varName) ) {
			return new BigDecimal( duration );
		}
		if( "usage".equals(varName) ) {
			return new BigDecimal( baseUsage );
		}
		if( "fee".equals(varName) ) {
			return new BigDecimal( fee );
		}

		// look it up in the rates:
		TemporalObject<Rate> temporalRate = agreement.getRates(varName);
		if( temporalRate != null ) {
			return new BigDecimal( temporalRate.get(date).getAmount().getValue() );
		}

		throw new RuntimeException( "variable " + varName + " is unvalued!" );
	}

}

