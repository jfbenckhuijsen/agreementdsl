/**
 * 
 */
package com.atosorigin.nl.agreement.impl;

import java.math.BigDecimal;

import com.atosorigin.nl.agreement.dispatcher.AbstractAccountingPostingRule;
import com.atosorigin.nl.agreement.dispatcher.AccountingEvent;

/**
 * @author a108600
 *
 */
public class CalculationPostingRule extends AbstractAccountingPostingRule {
	private Formula formula;
	
	/**
	 * @param account
	 */
	public CalculationPostingRule(String account, Formula formula) {
		super(account);
		this.formula = formula;
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.agreement.dispatcher.AbstractAccountingPostingRule#calculateAmount(com.atosorigin.nl.agreement.dispatcher.AccountingEvent)
	 */
	@Override
	protected BigDecimal calculateAmount(AccountingEvent event) {
		// TODO Variable resolving
		return this.formula.calculate();
	}

}
