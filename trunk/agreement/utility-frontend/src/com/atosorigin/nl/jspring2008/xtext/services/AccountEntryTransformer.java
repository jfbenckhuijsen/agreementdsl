/**
 * 
 */
package com.atosorigin.nl.jspring2008.xtext.services;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.atosorigin.nl.agreement.dispatcher.Account;
import com.atosorigin.nl.agreement.dispatcher.AccountEntry;
import com.atosorigin.nl.agreement.dispatcher.Customer;
import com.atosorigin.nl.jspring2008.xtext.transfer.AccountEntryTO;

/**
 * @author a108600
 *
 */
public class AccountEntryTransformer {

	/**
	 * 
	 */
	public AccountEntryTransformer() {
		// TODO Auto-generated constructor stub
	}
	
	public AccountEntryTO[] transformAccounts (Customer customer) {
		AccountEntryTO[] result;
		Collection<Account> accounts = customer.listAccounts();
		List<AccountEntry> entries = new LinkedList<AccountEntry>();
		for (Account account : accounts) {
			entries.addAll(account.getEntries());
		}
		Collections.sort(entries, new Comparator<AccountEntry>(){

			@Override
			public int compare(AccountEntry left, AccountEntry right) {
				if (left.getBookingDate().equals(right.getBookingDate())) {
					return 0;
				} else if (left.getBookingDate().before(right.getBookingDate())) {
					return -1;
				} else {
					return 1;
				}
			}

		});
		
		int i = 0;
		result = new AccountEntryTO[entries.size()]; 
		for (AccountEntry entry : entries) {
			AccountEntryTO to = new AccountEntryTO();
			to.setAccount(entry.getAccount().getName());
			to.setAmount(entry.getAmount().doubleValue());
			to.setOccured(entry.getBookingDate());
			result[i] = to;
			i++;
		}
		return result;
	}

}
