/**
 * 
 */
package com.atosorigin.nl.jspring2008.xtext.services;

import java.util.Date;
import java.util.List;

import com.atosorigin.nl.agreement.dispatcher.Customer;
import com.atosorigin.nl.agreement.events.Event;
import com.atosorigin.nl.agreement.runtime.SimulatorCallback;

/**
 * @author a108600
 *
 */
public class FlexCallback implements SimulatorCallback {

	/**
	 * 
	 */
	public FlexCallback() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.agreement.runtime.SimulatorCallback#showCurrentDate(java.util.Date)
	 */
	@Override
	public void showCurrentDate(Date date) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.agreement.runtime.SimulatorCallback#showEventsToProcess(java.util.List)
	 */
	@Override
	public void showEventsToProcess(List<Event> events) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.agreement.runtime.SimulatorCallback#showUpdatedCustomer(com.atosorigin.nl.agreement.dispatcher.Customer)
	 */
	@Override
	public void showUpdatedCustomer(Customer customer) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.agreement.runtime.SimulatorCallback#waitForNextStep()
	 */
	@Override
	public void waitForNextStep() throws InterruptedException {
		// TODO Auto-generated method stub

	}

}
