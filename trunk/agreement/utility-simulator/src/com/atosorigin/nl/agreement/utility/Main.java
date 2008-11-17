package com.atosorigin.nl.agreement.utility;

import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.atosorigin.nl.agreement.dsl.AgreementDSLBuilder;
import com.atosorigin.nl.agreement.runtime.AgreementBuilder;
import com.atosorigin.nl.agreement.runtime.CustomerSimulator;
import com.atosorigin.nl.agreement.runtime.SimulatorCallback;


/**
 * Main class to simulate running an AgreementBuilder
 * implementation against a randomly generated data set.
 * The AgreementBuilder should parse .plan files.
 * 
 * @author Jeroen Benckhuijsen
 */
public class Main {

	private static final String REGULAR_PLAN_FILENAME = "../agreement-plans/plans/lowPay.plan";

	public static void main (String...args) throws InterruptedException, FileNotFoundException {
		Main main = new Main();
		main.execute();
	}

	public void execute () throws InterruptedException, FileNotFoundException {
		// configure concrete subclasses:
//		AgreementBuilder builder = new TestAgreementBuilder();
		AgreementBuilder builder = new AgreementDSLBuilder(REGULAR_PLAN_FILENAME);
		SimulatorCallback callback = new ConsoleCallback();

		// run simulator with configured AgreementBuilder and SimulatorCallBack and randomly generated data:
		CustomerSimulator simulator = new CustomerSimulator(builder, callback);
		Date startDate = new GregorianCalendar(2009, Calendar.JANUARY, 20).getTime();
		UtilityEventGenerator generator = new UtilityEventGenerator(simulator.getCustomer(), startDate);
		simulator.startSimulator(generator);
		Thread.sleep(10000);
		simulator.stopSimulator();
	}

}

