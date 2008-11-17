/**
 * 
 */
package com.atosorigin.nl.jspring2008.xtext.services;

import java.util.Date;
import java.util.List;
import java.util.Observable;
import java.util.UUID;

import com.atosorigin.nl.agreement.dispatcher.Customer;
import com.atosorigin.nl.agreement.dsl.AgreementDSLBuilder;
import com.atosorigin.nl.agreement.events.Event;
import com.atosorigin.nl.agreement.runtime.CustomerSimulator;
import com.atosorigin.nl.agreement.runtime.SimulatorCallback;
import com.atosorigin.nl.agreement.utility.UtilityEventGenerator;
import com.atosorigin.nl.dsl.agreement.Plan;
import com.atosorigin.nl.jspring2008.xtext.transfer.AccountEntryTO;

import flex.messaging.MessageBroker;
import flex.messaging.MessageException;
import flex.messaging.messages.AsyncMessage;
import flex.messaging.messages.Message;

/**
 * @author a108600
 *
 */
public class CustomerSimInfo extends Observable implements SimulatorCallback {

	private static MessageBroker messageBroker = MessageBroker.getMessageBroker(null);

	private String name;
	private String photo;
	private CustomerSimulator simulator;
	
	/**
	 * 
	 */
	public CustomerSimInfo(String name, String photo) {
		super();
		this.name = name;
		this.photo = photo;
		this.simulator = new CustomerSimulator(this);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}
	
	/**
	 * @return
	 * @see com.atosorigin.nl.agreement.runtime.CustomerSimulator#getCustomer()
	 */
	public Customer getCustomer() {
		return simulator.getCustomer();
	}
	
	/**
	 * @return
	 */
	public AccountEntryTO[] getAccountEntries () {
		AccountEntryTransformer transformer = new AccountEntryTransformer();
		AccountEntryTO[] accounts = transformer.transformAccounts(this.getCustomer());
		return accounts;
	}
	
	/**
	 * @param plan
	 * @throws InterruptedException 
	 */
	public void setPlan (Plan plan) throws InterruptedException {
		AgreementDSLBuilder builder = new AgreementDSLBuilder(plan);
		this.simulator.setNewAgreement(builder);
	}

	/**
	 * 
	 */
	public void startSimulator (Date startDate) {
		this.simulator.startSimulator(new UtilityEventGenerator(getCustomer(), startDate));
	}
	
	/**
	 * @throws InterruptedException 
	 * 
	 */
	public void stopSimulator () throws InterruptedException {
		this.simulator.stopSimulator();
	}

	/**
	 * @param startDate
	 * @throws InterruptedException
	 */
	public String toggleSimulator (Date startDate) throws InterruptedException {
		if (this.simulator.isRunning()) {
			stopSimulator();
			return "Stopped";
		} else {
			startSimulator(startDate);
			return "Started";
		}
	}
	
	/* (non-Javadoc)
	 * @see com.atosorigin.nl.agreement.runtime.SimulatorCallback#showCurrentDate(java.util.Date)
	 */
	@Override
	public void showCurrentDate(Date date) {
		AsyncMessage message = new AsyncMessage();
		message.setDestination("dateUpdate");
		message.setBody(date);
		message.setMessageId(UUID.randomUUID().toString());
		sendMessage(message);
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
		AsyncMessage message = new AsyncMessage();
		message.setDestination("customerUpdate");
		message.setBody(getAccountEntries());
		message.setMessageId(UUID.randomUUID().toString());
		sendMessage(message);
	}
	
	private void sendMessage (Message message) {
		try {
			messageBroker.routeMessageToService(message, null);
		} catch (MessageException e) {
			// ignored
		}
	}

	/* (non-Javadoc)
	 * @see com.atosorigin.nl.agreement.runtime.SimulatorCallback#waitForNextStep()
	 */
	@Override
	public void waitForNextStep() throws InterruptedException {
		Thread.sleep(2000);
	}

}
