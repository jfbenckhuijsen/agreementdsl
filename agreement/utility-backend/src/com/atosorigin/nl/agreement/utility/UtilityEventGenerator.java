package com.atosorigin.nl.agreement.utility;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import com.atosorigin.nl.agreement.dispatcher.AccountingEvent;
import com.atosorigin.nl.agreement.dispatcher.Customer;
import com.atosorigin.nl.agreement.events.Event;
import com.atosorigin.nl.agreement.runtime.EventGenerator;
import com.atosorigin.nl.agreement.utility.events.ServiceCallEvent;
import com.atosorigin.nl.agreement.utility.events.TaxEvent;
import com.atosorigin.nl.agreement.utility.events.UsageEvent;


/**
 * Implementation of EventGenerator which generates
 * Event-s randomly.
 * 
 * @author Jeroen Benckhuijsen
 */
public class UtilityEventGenerator implements EventGenerator {
	
	private static final double SERVICE_CALL_CHANCE = 0.20;
	private Calendar currentDate = new GregorianCalendar();
	private Customer customer;
	
	public UtilityEventGenerator(Customer customer, Date startDate) {
		this.customer = customer;
		currentDate.setTime(startDate);
	}

	public List<Event> nextTime () {
		List<Event> result = new LinkedList<Event>();

		if (Math.random() <= SERVICE_CALL_CHANCE) {
			ServiceCallEvent serviceCall = new ServiceCallEvent();
			serviceCall.setDuration(getServiceCallDuration());
			addEvent(result, serviceCall);
		}

		if (currentDate.get(Calendar.DAY_OF_MONTH) == 1) {
			TaxEvent tax = new TaxEvent();
			tax.setFee(getTaxFee());
			addEvent(result, tax);
		}

		UsageEvent usage = new UsageEvent();
		usage.setBaseUsage(getUsage());
		addEvent(result, usage);

		currentDate.add(Calendar.DAY_OF_MONTH, 1);
		
		return result;
	}
	
	public Date getCurrentDate () {
		return this.currentDate.getTime();
	}
	
	private void addEvent (List<Event> events, AccountingEvent event) {
		event.setCustomer(this.customer);
		event.setOccured(this.currentDate.getTime());
		events.add(event);
	}

	private double getServiceCallDuration () {
		return 100.0 * Math.random();
	}

	private double getTaxFee () {
		return 100.0 * Math.random();
	}

	private double getUsage () {
		return 100.0 * Math.random();
	}

}

