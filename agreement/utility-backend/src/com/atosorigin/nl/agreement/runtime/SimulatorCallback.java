package com.atosorigin.nl.agreement.runtime;

import java.util.Date;
import java.util.List;

import com.atosorigin.nl.agreement.dispatcher.Customer;
import com.atosorigin.nl.agreement.events.Event;


/**
 * @author Jeroen Benckhuijsen
 */
public interface SimulatorCallback {

	/**
	 * @param date
	 */
	void showCurrentDate (Date date);

	/**
	 * @param events
	 */
	void showEventsToProcess(List<Event> events);

	/**
	 * @param customer
	 */
	void showUpdatedCustomer(Customer customer);

	/**
	 * 
	 */
	void waitForNextStep () throws InterruptedException;

}

