/**
 * 
 */
package com.atosorigin.nl.jspring2008.xtext.services;

import java.io.IOException;
import java.io.StringReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.atosorigin.nl.dsl.agreement.Plan;
import com.atosorigin.nl.jspring2008.xtext.transfer.AccountEntryTO;
import com.atosorigin.nl.jspring2008.xtext.transfer.CustomerTO;

/**
 * @author a108600
 *
 */
public class UtilityService {
	
	private static String[][] customerInits = {
		{"James Gosling", "gosling.jpg"},
		{"Martin Fowler", "fowler.jpg"},
		{"Duke", "duke.jpg"}
	};
	
	private String customer = null;
	private Map<String, CustomerSimInfo> customers = new HashMap<String, CustomerSimInfo>();

	/**
	 * 
	 */
	public UtilityService() {
		super();
		for (String[] custData : customerInits) {
			customers.put(custData[0], new CustomerSimInfo(custData[0], custData[1]));
		}
		selectCustomer("James Gosling");
	}
	
	public CustomerTO[] listCustomers () {
		CustomerTO[] result = new CustomerTO[customers.size()];
		int i = 0;
		for (CustomerSimInfo customer : customers.values()) {
			CustomerTO to = new CustomerTO();
			to.setName(customer.getName());
			to.setPhoto(customer.getPhoto());
			result[i] = to;
			i++;
		}
		return result;
	}
	
	/**
	 * @return
	 */
	public AccountEntryTO[] getJournal () {
		if (customer != null) {
			return customers.get(this.customer).getAccountEntries();
		} else {
			return new AccountEntryTO[0];
		}
	}
	
	/**
	 * @param customer
	 * @return
	 */
	public AccountEntryTO[] selectCustomer (String customer) {
		if (this.customer != null && !this.customer.equals(customer)) {
			try {
				this.customers.get(this.customer).stopSimulator();
			} catch (InterruptedException e) {
				/// ignored
			}
		}
		this.customer = customer;
		return getJournal();
	}
	
	/**
	 * @return
	 */
	public String[] listPlans () {
		return PlanStore.getInstance().listPlans().toArray(new String[0]);
	}
	
	/**
	 * @param planText
	 * @return
	 */
	public String[] addPlan (String planText) {
		StringReader reader = new StringReader(planText);
		try {
			PlanStore.getInstance().storePlan(reader);
			return listPlans();
		} catch (IOException e) {
			return new String[0];
		}
	}
	
	
	/**
	 * @param plan
	 */
	public void setPlanForCustomer (String name) {
		if (customer != null) {
			Plan plan = PlanStore.getInstance().getPlan(name);
			try {
				customers.get(this.customer).setPlan(plan);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 
	 */
	public String startSimulator () {
		if (customer != null) {
			try {
				return customers.get(this.customer).toggleSimulator(new Date());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "Error";
			}
		}
		return "No customer";
	}
	
}