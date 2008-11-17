package com.atosorigin.nl.agreement.runtime;

import java.util.Date;
import java.util.List;

import com.atosorigin.nl.agreement.events.Event;


/**
 * @author Jeroen Benckhuijsen
 */
public interface EventGenerator {

	/**
	 * @return a list of the next Event-s process.
	 */
	List<Event> nextTime ();

	/**
	 * @return the current date
	 */
	Date getCurrentDate ();

}

