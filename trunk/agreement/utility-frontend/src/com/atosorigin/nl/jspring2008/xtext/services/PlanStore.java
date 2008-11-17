/**
 * 
 */
package com.atosorigin.nl.jspring2008.xtext.services;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.atosorigin.nl.dsl.agreement.Plan;
import com.atosorigin.nl.dsl.agreement.handler.PlanReader;

/**
 * @author a108600
 *
 */
public class PlanStore {

	private static PlanStore instance;
	private Map<String, Plan> plans = new HashMap<String, Plan>();
	/**
	 * 
	 */
	protected PlanStore() {
		super();
	}
	
	/**
	 * @return
	 */
	public synchronized static PlanStore getInstance() {
		if (instance == null) {
			instance = new PlanStore();
		}
		return instance;
	}
	
	/**
	 * @param reader
	 * @throws IOException 
	 */
	public void storePlan (InputStream in) throws IOException {
		PlanReader planReader = new PlanReader(in);
		Plan plan = planReader.getPlan();
		if (plan.getName() != null) {
			plans.put(plan.getName(), plan);
		}
	}

	/**
	 * @return
	 */
	public Collection<String> listPlans () {
		return plans.keySet();
	}
	
	/**
	 * @param name
	 * @return
	 */
	public Plan getPlan (String name) {
		return plans.get(name);
	}
	
}
