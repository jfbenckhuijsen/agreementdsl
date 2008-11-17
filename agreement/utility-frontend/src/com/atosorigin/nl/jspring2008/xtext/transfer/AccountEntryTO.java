/**
 * 
 */
package com.atosorigin.nl.jspring2008.xtext.transfer;

import java.io.Serializable;
import java.util.Date;

/**
 * @author a108600
 *
 */
public class AccountEntryTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5613067770626175798L;
	private String account;
	private Date occured;
	private double amount;

	/**
	 * 
	 */
	public AccountEntryTO() {
		super();
	}

	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * @return the occured
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

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

}
