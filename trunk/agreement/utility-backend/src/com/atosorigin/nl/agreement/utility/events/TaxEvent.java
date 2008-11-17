package com.atosorigin.nl.agreement.utility.events;

import com.atosorigin.nl.agreement.dispatcher.AccountingEvent;

/**
 * @author Jeroen Benckhuijsen
 */
public class TaxEvent extends AccountingEvent {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7851332125471289327L;
	public static final String TYPE = "Tax";
	private Double fee;

	public TaxEvent() {
		setType(TYPE);
	}

	/**
	 * @return the fee
	 */
	public Double getFee() {
		return fee;
	}

	/**
	 * @param fee the fee to set
	 */
	public void setFee(Double fee) {
		this.fee = fee;
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.agreement.dispatcher.AccountingEvent#toString()
	 */
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("Tax " )
			.append(super.toString())
			.append(" with fee ").append(this.fee);
		return buf.toString();
	}

}

