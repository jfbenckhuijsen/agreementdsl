package com.atosorigin.nl.agreement.utility.mock;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.atosorigin.nl.agreement.dispatcher.Agreement;
import com.atosorigin.nl.agreement.dispatcher.PostingRule;
import com.atosorigin.nl.agreement.temporal.TemporalObject;


/**
 * Basic implementation of Agreement;
 * may be used if DSL backend not in use.
 * 
 * @author Meinte Boersma
 */
public class BasicAgreement implements Agreement {

	private Map<String,TemporalObject<PostingRule>> postingRules = new HashMap<String, TemporalObject<PostingRule>>();

	/**
	 * @param type
	 * @param rule
	 * @param when
	 */
	public void addPostingRules (String event, PostingRule rule, Date when) {
		getPostingRules(event).put(when, rule);
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.agreement.utility.mock.Agreement#getPostingRules(java.lang.String)
	 */
	public TemporalObject<PostingRule> getPostingRules (String event) {
		TemporalObject<PostingRule> ruleSet = postingRules.get(event);
		if (ruleSet == null) {
			ruleSet = new TemporalObject<PostingRule>();
			this.postingRules.put(event, ruleSet);
		}
		return ruleSet;
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.agreement.utility.mock.Agreement#listAccounts()
	 */
	public Set<String> listAccounts () {
		Set<String> accounts = new HashSet<String>();
		for (TemporalObject<PostingRule> temporal : this.postingRules.values()) {
			for (PostingRule rule : temporal.getAll()) {
				accounts.add(rule.getAccount());
			}
		}
		return accounts;
	}

}

