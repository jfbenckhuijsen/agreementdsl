package com.atosorigin.nl.agreement.dsl;

import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

import com.atosorigin.nl.agreement.dispatcher.Agreement;
import com.atosorigin.nl.agreement.dispatcher.PostingRule;
import com.atosorigin.nl.agreement.temporal.TemporalObject;
import com.atosorigin.nl.dsl.agreement.Date;
import com.atosorigin.nl.dsl.agreement.EventRulesDecl;
import com.atosorigin.nl.dsl.agreement.Plan;
import com.atosorigin.nl.dsl.agreement.RateDecl;
import com.atosorigin.nl.dsl.agreement.TemporalPostingRule;
import com.atosorigin.nl.dsl.agreement.ValueDecl;


/**
 * Implementation of Agreement, driven by a DSL instance.
 * 
 * @author Meinte Boersma
 */
public class AgreementImpl implements Agreement {

	private Plan plan;

	public AgreementImpl (Plan plan) {
		this.plan = plan;
	}

	protected Plan getPlan () {
		return plan;
	}

	@Override
	public TemporalObject<PostingRule> getPostingRules (String eventName) {
		TemporalObject<PostingRule> to = new TemporalObject<PostingRule> ();

		for( EventRulesDecl eventRulesDecl : plan.getEventRules() ) {
			if( eventRulesDecl.getType().getName().equals(eventName) ) {
				for( TemporalPostingRule rule : eventRulesDecl.getPostingRules() ) {
					to.put( toJavaDate(rule.getDate()), new PostingRuleImpl (rule, this) );
				}
			}
		}
		return to;
	}

	@Override
	public Set<String> listAccounts () {
		Set<String> accounts = new HashSet<String>();
		for ( EventRulesDecl event : plan.getEventRules() ) {
			for( TemporalPostingRule rule : event.getPostingRules() ) {
				accounts.add( rule.getAccount().getLiteral() );
			}
		}
		return accounts;
	}

	public TemporalObject<Rate> getRates (String rateName) {
		TemporalObject<Rate> to = new TemporalObject<Rate> ();

		for( RateDecl rateDecl : plan.getRates() ) {
			if( rateDecl.getName().equals(rateName) ) {
				for( ValueDecl valueDecl : rateDecl.getValues() ) {
					to.put( toJavaDate(valueDecl.getDate()), new Rate(valueDecl) );
				}
			}
		}

		return to;
	}

	private static java.util.Date toJavaDate (Date dslDate) {
		return new GregorianCalendar( dslDate.getYear(), dslDate.getMonth() -1, dslDate.getDay() ).getTime();
	}

}

