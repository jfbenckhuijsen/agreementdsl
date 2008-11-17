package com.atosorigin.nl.agreement.dispatcher;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * @author Jeroen Benckhuijsen
 */
public class Customer {

	private Map<String, Account> accounts = new HashMap<String, Account>();
	private Agreement agreement;

	/**
	 * @param account
	 * @return
	 */
	public Account createAccount (String name) {
		Account account = new Account();
		account.setName( name );
		accounts.put(name, account);
		return account;
	}

	/**
	 * @param account
	 */
	public Account getAccount (String account) {
		return accounts.get(account);
	}

	/**
	 * @return
	 */
	public Collection<Account> listAccounts () {
		return accounts.values();
	}

	/**
	 * @param entry
	 * @param account
	 */
	public void addEntry (AccountEntry entry, String account) {
		Account acc = getAccount(account);
		entry.setAccount(acc);
		acc.addEntry(entry);
	}

	/**
	 * @return the agreement
	 */
	public Agreement getAgreement() {
		return agreement;
	}

	/**
	 * @param agreement the agreement to set
	 */
	public void setAgreement(Agreement agreement) {
		this.agreement = agreement;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sBuild = new StringBuilder();
		sBuild.append( "List of accounts:\n" );
		for (Account account : listAccounts()) {
			sBuild
				.append( account.toString() )
				.append( "\n" );
		}
		return sBuild.toString();
	}

}

