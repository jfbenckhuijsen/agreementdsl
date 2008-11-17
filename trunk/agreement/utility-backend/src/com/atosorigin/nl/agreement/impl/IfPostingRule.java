/**
 * 
 */
package com.atosorigin.nl.agreement.impl;

import com.atosorigin.nl.agreement.dispatcher.PostingRule;
import com.atosorigin.nl.agreement.events.Event;

/**
 * @author a108600
 *
 */
public class IfPostingRule implements PostingRule {
	private String account;
	private Comparison comparison;
	private PostingRule ifTrue;
	private PostingRule ifFalse;
	
	/**
	 * @param account
	 */
	public IfPostingRule(String account, Comparison comparision, PostingRule ifTrue, PostingRule ifFalse) {
		this.account = account;
		this.comparison = comparision;
		this.ifTrue = ifTrue;
		this.ifFalse = ifFalse;
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.agreement.dispatcher.AbstractAccountingPostingRule#getAccount()
	 */
	@Override
	public String getAccount() {
		return account;
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.agreement.dispatcher.AbstractAccountingPostingRule#process(com.atosorigin.nl.agreement.events.Event)
	 */
	@Override
	public void process(Event event) {
		if (comparison.evaluate()) {
			ifTrue.process(event);
		} else {
			ifFalse.process(event);
		}
	}

}
