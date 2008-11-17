/**
 * 
 */
package com.atosorigin.nl.agreement.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.atosorigin.nl.agreement.dispatcher.Agreement;
import com.atosorigin.nl.agreement.dispatcher.PostingRule;
import com.atosorigin.nl.agreement.temporal.TemporalObject;
import com.atosorigin.nl.dsl.agreement.EventRulesDecl;
import com.atosorigin.nl.dsl.agreement.TemporalPostingRule;

/**
 * @author a108600
 *
 */
public class StaticAgreement implements Agreement {
	private Map<String,TemporalObject<PostingRule>> postingRules = new HashMap<String,TemporalObject<PostingRule>>();
	private Map<String,TemporalObject<Double>> baseValues = new HashMap<String,TemporalObject<Double>>();
	
	/**
	 * 
	 */
	public StaticAgreement() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.agreement.dispatcher.Agreement#getPostingRules(java.lang.String)
	 */
	@Override
	public TemporalObject<PostingRule> getPostingRules(String eventType) {
		if (!this.postingRules.containsKey(eventType)) {
			throw new IllegalArgumentException("The posting rule does not exist");
		}
		return this.postingRules.get(eventType);
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.agreement.dispatcher.Agreement#listAccounts()
	 */
	@Override
	public Set<String> listAccounts() {
		Set<String> accounts = new HashSet<String>();
		for ( TemporalObject<PostingRule> rules : postingRules.values() ) {
			for( PostingRule rule : rules.getAll() ) {
				accounts.add( rule.getAccount() );
			}
		}
		return accounts;
	}
	
	/**
	 * @param name
	 */
	public void registerValue (String name) {
		if (baseValues.containsKey(name)) {
			throw new IllegalArgumentException("The value already exists");
		}
		baseValues.put(name, new TemporalObject<Double>());
	}
	
	/**
	 * @param name
	 * @param when
	 * @param value
	 */
	public void setValue (String name, Date when, Double value) {
		if (!baseValues.containsKey(name)) {
			throw new IllegalArgumentException("The value does not exist");
		}
		baseValues.get(name).put(when, value);
	}
	
	/**
	 * @param name
	 * @param value
	 */
	public void setValue (String name, Double value) {
		if (!baseValues.containsKey(name)) {
			throw new IllegalArgumentException("The value does not exist");
		}
		baseValues.get(name).put(value);
	}
	
	/**
	 * @param name
	 */
	public void registerPostingRule (String name) {
		if (postingRules.containsKey(name)) {
			throw new IllegalArgumentException("The posting rule already exists");
		}
		postingRules.put(name, new TemporalObject<PostingRule>());
	}
	
	/**
	 * @param name
	 * @param when
	 * @param rule
	 */
	public void addPostingRule (String name, Date when, PostingRule rule) {
		if (!postingRules.containsKey(name)) {
			throw new IllegalArgumentException("The posting rule doesn't exists");
		}
		postingRules.get(name).put(when, rule);
	}
	
	/**
	 * @param name
	 * @param rule
	 */
	public void addPostingRule (String name, PostingRule rule) {
		if (!postingRules.containsKey(name)) {
			throw new IllegalArgumentException("The posting rule doesn't exists");
		}
		postingRules.get(name).put(rule);
	}

}
