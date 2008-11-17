package com.atosorigin.nl.agreement.events;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


/**
 * @author Jeroen Benckhuijsen
 */
public class EventList {

	private List<Event> eventList = new LinkedList<Event>();

	/**
	 * @param event
	 */
	public void addEvent (Event event) {
		eventList.add(event);
	}

	/**
	 * @param events
	 */
	public void addEvents (Collection<Event> events) {
		this.eventList.addAll(events);
	}

	/**
	 * 
	 */
	public void process () {
		for (Event event : eventList) {
			event.process();
		}
		eventList.clear();
	}

}

