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
public class StaticValuePostingRule extends AbstractAccountingPostingRule {
	private BigDecimal value;
	
	/**
	 * @param account
	 */
	public StaticValuePostingRule(String account, BigDecimal value) {
		super(account);
		this.value = value;
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.agreement.dispatcher.AbstractAccountingPostingRule#calculateAmount(com.atosorigin.nl.agreement.dispatcher.AccountingEvent)
	 */
	@Override
	protected BigDecimal calculateAmount(AccountingEvent event) {
		return value;
	}

}
