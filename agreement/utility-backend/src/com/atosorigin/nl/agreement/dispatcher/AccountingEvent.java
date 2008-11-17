package com.atosorigin.nl.agreement.dispatcher;

import java.io.Serializable;
import java.util.Date;

import com.atosorigin.nl.agreement.events.Event;
import com.atosorigin.nl.agreement.temporal.TemporalObject;

/**
 * @author Jeroen Benckhuijsen
 */
public abstract class AccountingEvent implements Serializable, Event {

	private String type;
	private Customer customer;
	private Date occured;

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the date the event occurred on
	 */
	public Date getOccured() {
		return occured;
	}

	/**
	 * @param occured the occured to set
	 */
	public void setOccured(Date occured) {
		this.occured = occured;
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.agreement.dispatcher.Event#process()
	 */
	public void process () {
		Agreement agreement = customer.getAgreement();
		TemporalObject<PostingRule> ruleSet = agreement.getPostingRules(getType());
		PostingRule rule = ruleSet.get(getOccured());
		rule.process(this);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sBuild = new StringBuilder();
		sBuild
			.append( "accounting event of type " )
			.append( type )
			.append( ", occured on " )
			.append( occured );
		return sBuild.toString();
	}

}

