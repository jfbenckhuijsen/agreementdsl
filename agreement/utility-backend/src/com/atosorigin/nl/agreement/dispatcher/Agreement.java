package com.atosorigin.nl.agreement.dispatcher;

import java.util.Set;

import com.atosorigin.nl.agreement.temporal.TemporalObject;


/**
 * @author Meinte Boersma
 */
public interface Agreement {

	/**
	 * Returns the posting rule associated with the given event type.
	 * 
	 * @param type
	 * @return
	 */
	TemporalObject<PostingRule> getPostingRules (String eventType);

	/**
	 * Returns the list of accounts.
	 * 
	 * @return
	 */
	Set<String> listAccounts();

}

