/**
 * 
 */
package com.atosorigin.nl.agreement.temporal;

import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;

/**
 * @author a108600
 *
 */
public class TemporalObjectTest extends TestCase {

	/**
	 * @param name
	 */
	public TemporalObjectTest(String name) {
		super(name);
	}

	public void testTemporalObject () {
		TemporalObject<Integer> subject = new TemporalObject<Integer>();
		
		subject.put(new GregorianCalendar(1900,1,1).getTime(), 1);
		assertSame(subject.get(), 1);
		assertSame(subject.getAll().size(), 1);
		assertTrue(subject.getAll().contains(1));
		assertSame(subject.get(new GregorianCalendar(1900,1,1).getTime()), 1);
		
		subject.put(2);
		assertSame(subject.get(), 2);
		assertSame(subject.getAll().size(), 2);
		assertTrue(subject.getAll().contains(1));
		assertTrue(subject.getAll().contains(2));
		assertSame(subject.get(new GregorianCalendar(1900,1,1).getTime()), 1);
		assertSame(subject.get(new GregorianCalendar(1980,1,1).getTime()), 1);
		assertSame(subject.get(new Date()), 2);
		
		subject.put(new GregorianCalendar(1900,1,1).getTime(), 3);
		assertSame(subject.get(), 2);
		assertSame(subject.getAll().size(), 2);
		assertTrue(subject.getAll().contains(2));
		assertTrue(subject.getAll().contains(3));
		assertSame(subject.get(new GregorianCalendar(1900,1,1).getTime()), 3);
		
		try {
			subject.get(new GregorianCalendar(1800,1,1).getTime());
			fail();
		} catch (IllegalArgumentException e) {
			// good!
		}
		
		assertSame(subject.get(new GregorianCalendar(1980,1,1).getTime()), 3);
		assertSame(subject.get(new Date()), 2);
	}

}
