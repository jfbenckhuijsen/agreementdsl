package com.atosorigin.nl.agreement.dispatcher;

import java.math.BigDecimal;

import com.atosorigin.nl.agreement.events.Event;


/**
 * @author Jeroen Benckhuijsen
 */
public abstract class AbstractAccountingPostingRule implements PostingRule {

	private String account;
	
	public AbstractAccountingPostingRule(String account) {
		super();
		this.account = account;
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.agreement.dispatcher.PostingRule#getAccount()
	 */
	@Override
	public String getAccount() {
		return this.account;
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.agreement.dispatcher.PostingRule#process(com.atosorigin.nl.agreement.events.Event)
	 */
	@Override
	public void process(Event event) {
		if (!(event instanceof AccountingEvent)) {
			throw new IllegalArgumentException("Invalid event type received: " + event.getClass().getCanonicalName());
		}

		AccountingEvent accEvent = (AccountingEvent) event;
		Customer customer = accEvent.getCustomer();
		AccountEntry entry = new AccountEntry();
		entry.setAmount(calculateAmount(accEvent));
		entry.setBookingDate(accEvent.getOccured());
		customer.addEntry(entry, this.account);
	}
	
	/**
	 * @param event
	 * @return
	 */
	protected abstract BigDecimal calculateAmount (AccountingEvent event);

}
