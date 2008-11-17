package com.atosorigin.nl.agreement.utility.mock;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.atosorigin.nl.agreement.dispatcher.Agreement;
import com.atosorigin.nl.agreement.runtime.AgreementBuilder;
import com.atosorigin.nl.agreement.utility.events.ServiceCallEvent;
import com.atosorigin.nl.agreement.utility.events.TaxEvent;
import com.atosorigin.nl.agreement.utility.events.UsageEvent;
import com.atosorigin.nl.agreement.utility.rules.StaticValuePostingRule;


/**
 * Mock implementation of AgreementBuilder.
 * 
 * @author Jeroen Benckhuijsen
 */
public class TestAgreementBuilder implements AgreementBuilder {

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.agreement.runtime.AgreementBuilder#createAgreement()
	 */
	@Override
	public Agreement createAgreement() {
		BasicAgreement agreement = new BasicAgreement();
		agreement.addPostingRules(ServiceCallEvent.TYPE, 
				new StaticValuePostingRule("base-usage", new BigDecimal(20)),  
				new GregorianCalendar(1900, Calendar.JANUARY, 1).getTime());
		
		agreement.addPostingRules(ServiceCallEvent.TYPE, 
				new StaticValuePostingRule("base-usage", new BigDecimal(200)),  
				new GregorianCalendar(2010, Calendar.JANUARY, 1).getTime());
		
		agreement.addPostingRules(TaxEvent.TYPE,
				new StaticValuePostingRule("tax", new BigDecimal(100)),
				new GregorianCalendar(1900, Calendar.JANUARY, 1).getTime());

		agreement.addPostingRules(UsageEvent.TYPE,
				new StaticValuePostingRule("usage", new BigDecimal(100)),
				new GregorianCalendar(1900, Calendar.JANUARY, 1).getTime());

		return agreement;
	}

}

