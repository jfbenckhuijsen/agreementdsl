package com.atosorigin.nl.agreement.dispatcher;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.LinkedList;


/**
 * Representation of a Customer's account.
 * 
 * @author Jeroen Benckhuijsen
 */
public class Account {

	private String name;

	private Collection<AccountEntry> entries = new LinkedList<AccountEntry>();

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName (String name) {
		this.name = name;
	}

	/**
	 * @param entry
	 */
	public void addEntry (AccountEntry entry) {
		entries.add(entry);
	}

	/**
	 * @return
	 */
	public BigDecimal getBalance () {
		BigDecimal total = new BigDecimal(0.0);
		for (AccountEntry entry : entries) {
			total = total.add(entry.getAmount());
		}
		return total;
	}

	/**
	 * @return the entries
	 */
	public Collection<AccountEntry> getEntries() {
		return entries;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sBuild = new StringBuilder();
		sBuild
			.append( "Account " )
			.append( this.name )
			.append( " has a balance of " )
			.append( getBalance().toPlainString() )
			.append( ". List of entries:\n" );
		
		for (AccountEntry entry : entries) {
			sBuild
				.append( "\t" )
				.append( entry.toString() )
				.append( "\n" );
		}
		
		return sBuild.toString();
	}

}

