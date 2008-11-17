package com.atosorigin.nl.agreement.utility.events;

import com.atosorigin.nl.agreement.dispatcher.AccountingEvent;


/**
 * @author Jeroen Benckhuijsen
 */
public class UsageEvent extends AccountingEvent {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7601043012997064492L;
	public static final String TYPE = "Usage";
	private Double baseUsage;

	public UsageEvent() {
		setType(TYPE);
	}

	/**
	 * @return the baseUsage
	 */
	public Double getBaseUsage() {
		return baseUsage;
	}

	/**
	 * @param baseUsage the baseUsage to set
	 */
	public void setBaseUsage(Double baseUsage) {
		this.baseUsage = baseUsage;
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.agreement.dispatcher.AccountingEvent#toString()
	 */
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("Usage" )
			.append(super.toString())
			.append(" with base usage ").append(this.baseUsage);
		return buf.toString();
	}

}
