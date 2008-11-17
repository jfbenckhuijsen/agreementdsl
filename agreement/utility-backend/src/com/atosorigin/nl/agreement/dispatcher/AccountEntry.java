package com.atosorigin.nl.agreement.dispatcher;

import java.math.BigDecimal;
import java.util.Date;


/**
 * Representation of a single transaction (booking) to/from an account.
 * 
 * @author Jeroen Benckhuijsen
 */
public class AccountEntry {

	private Date bookingDate;
	private BigDecimal amount;
	private Account account;

	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}

	/**
	 * @return the bookingDate
	 */
	public Date getBookingDate() {
		return bookingDate;
	}

	/**
	 * @param bookingDate the bookingDate to set
	 */
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		buf
			.append( amount.toPlainString() )
			.append( " booked on " )
			.append( bookingDate );
		return buf.toString();
	}

}

