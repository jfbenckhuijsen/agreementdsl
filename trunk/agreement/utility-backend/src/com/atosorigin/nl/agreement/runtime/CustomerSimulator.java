package com.atosorigin.nl.agreement.runtime;

import java.util.List;

import com.atosorigin.nl.agreement.dispatcher.Agreement;
import com.atosorigin.nl.agreement.dispatcher.Customer;
import com.atosorigin.nl.agreement.events.Event;
import com.atosorigin.nl.agreement.events.EventList;


/**
 * @author Jeroen Benckhuijsen
 */
public class CustomerSimulator {
	
	private final Customer customer;
	private final EventList eventList = new EventList();
	private final SimulatorCallback callback;

	private EventGenerator eventGenerator;
	private boolean running = false;
	private Thread currentThread;

	/**
	 * @param callback
	 */
	public CustomerSimulator(SimulatorCallback callback) {
		this.callback = callback;
		this.customer = new Customer();
	}
	
	/**
	 * @param builder
	 * @param callback
	 */
	public CustomerSimulator(AgreementBuilder builder, SimulatorCallback callback) {
		this.callback = callback;
		this.customer = new Customer();

		createAgreement(builder);
	}
	
	/**
	 * @param builder
	 * @throws InterruptedException
	 */
	public void setNewAgreement (AgreementBuilder builder) throws InterruptedException {
		boolean wasRunning = this.running;
		stopSimulator();
		createAgreement(builder);
		if (wasRunning) {
			startSimulator(eventGenerator);
		}
	}
	
	/**
	 * @param builder
	 */
	private void createAgreement (AgreementBuilder builder) {
		Agreement agreement = builder.createAgreement();
		this.customer.setAgreement(agreement);
		for (String accountName : agreement.listAccounts()) {
			customer.createAccount(accountName);
		}
	}

	/**
	 * @param startDate
	 */
	public void startSimulator (EventGenerator generator) {
		if (currentThread != null) {
			throw new IllegalStateException("Already running");
		}
		
		if (customer.getAgreement() == null) {
			throw new IllegalStateException("No agreement for this customer");
		}
		this.eventGenerator = generator;
		this.running = true;
		this.currentThread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					executeSimulator();
				} catch (InterruptedException e) {
					e.printStackTrace();
					running = false;
					currentThread = null;
				}
			}
		});
		this.currentThread.start();
	}

	/**
	 * @throws InterruptedException 
	 */
	public void stopSimulator () throws InterruptedException {
		this.running = false;
		if (this.currentThread != null) {
			this.currentThread.join();
			this.currentThread = null;
		}
	}

	/**
	 * @throws InterruptedException 
	 */
	private void executeSimulator () throws InterruptedException {
		while (running) {
			callback.showCurrentDate(eventGenerator.getCurrentDate());
			List<Event> events = this.eventGenerator.nextTime();
			callback.showEventsToProcess(events);
			eventList.addEvents(events);
			eventList.process();
			callback.showUpdatedCustomer(customer);
			callback.waitForNextStep();
		}
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @return the running
	 */
	public boolean isRunning() {
		return running;
	}

}

