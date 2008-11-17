package com.atosorigin.nl.agreement.dsl;

import com.atosorigin.nl.agreement.dispatcher.Agreement;
import com.atosorigin.nl.agreement.runtime.AgreementBuilder;
import com.atosorigin.nl.dsl.agreement.Plan;
import com.atosorigin.nl.dsl.agreement.handler.PlanReader;


/**
 * AgreementBuilder implementation which parses a .plan
 * file (AgreementDSL format) and builds an Agreement
 * from it.
 * 
 * @author Meinte Boersma
 */
public class AgreementDSLBuilder implements AgreementBuilder {

	private Plan plan;

	/**
	 * @param planPath
	 */
	public AgreementDSLBuilder(String planPath) {
		this.plan = new PlanReader ( planPath ).getPlan();
	}
	
	/**
	 * @param plan
	 */
	public AgreementDSLBuilder (Plan plan) {
		this.plan = plan;
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.agreement.runtime.AgreementBuilder#createAgreement()
	 */
	@Override
	public Agreement createAgreement() {
		return new AgreementImpl (plan);
	}

}

