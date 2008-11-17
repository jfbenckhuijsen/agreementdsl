/**
 * 
 */
package com.atosorigin.nl.agreement.utility;

import static com.atosorigin.nl.agreement.impl.Formula.*;
import static com.atosorigin.nl.agreement.impl.Comparison.*;
import java.math.BigDecimal;
import java.util.GregorianCalendar;

import com.atosorigin.nl.agreement.dispatcher.Agreement;
import com.atosorigin.nl.agreement.impl.CalculationPostingRule;
import com.atosorigin.nl.agreement.impl.IfPostingRule;
import com.atosorigin.nl.agreement.impl.StaticAgreement;
import com.atosorigin.nl.agreement.impl.StaticValuePostingRule;

/**
 * @author a108600
 * 
 */
public class AgreementRegistryBuilder {

	/**
	 * 
	 */
	public AgreementRegistryBuilder() {
		super();
	}

	public Agreement setupLowpay() {
		StaticAgreement agreement = new StaticAgreement();
		agreement.registerValue("BASE_RATE");
		agreement.setValue("BASE_RATE", 
				new GregorianCalendar(1999, 10, 1, 0, 0, 0).getTime(), 10.0);
		agreement.setValue("BASE_RATE", 
				new GregorianCalendar(2008, 04, 16, 0, 0, 0).getTime(), 10.0);
		agreement.registerValue("REDUCED_RATE");
		agreement.setValue("REDUCED_RATE", 
				new GregorianCalendar(1999, 10, 01,	0, 0, 0).getTime(), 5.0);
		agreement.registerValue("CAP");
		agreement.setValue("CAP", 
				new GregorianCalendar(1999, 10, 01, 0, 0, 0).getTime(), 50.0);

		agreement.registerPostingRule("USAGE");
		agreement.addPostingRule("USAGE", 
				new GregorianCalendar(1999, 10, 01, 0, 0, 0).getTime(), 
				new IfPostingRule("base-usage",
						evaluateIf().eventValue("usage").largerThan().value("CAP"), 
						new CalculationPostingRule("base-usage", 
								compute().variable("BASE_RATE").multipliedBy().eventValue("usage")), 
						new CalculationPostingRule("base-usage", 
								compute().variable("REDUCED_RATE").multipliedBy().eventValue("usage"))));
		agreement.registerPostingRule("SERVICE_CALL");
		agreement.addPostingRule("SERVICE_CALL", 
				new GregorianCalendar(1999, 10, 01, 0, 0, 0).getTime(), 
				new StaticValuePostingRule("service", new BigDecimal(10.0)));
		agreement.addPostingRule("SERVICE_CALL", 
				new GregorianCalendar(1999,12, 02, 0, 0, 0).getTime(), 
				new CalculationPostingRule("base-usage", 
						compute().eventValue("fee").multipliedBy(new BigDecimal(0.5)).add(new BigDecimal(15.0))));
		agreement.registerPostingRule("TAX");
		agreement.addPostingRule("TAX", 
				new GregorianCalendar(2000, 02, 29, 0, 0, 0).getTime(), 
				new CalculationPostingRule("tax", 
						compute().eventValue("fee").multipliedBy(new BigDecimal(0.055))));

		return agreement;
	}
}
