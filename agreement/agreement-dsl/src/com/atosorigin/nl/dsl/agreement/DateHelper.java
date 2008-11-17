package com.atosorigin.nl.dsl.agreement;


/**
 * Util class for helping with handling Date-s in the Agreement DSL.
 * 
 * @author Meinte Boersma
 */
public class DateHelper {

	private static final int[] monthDays = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static int monthNr2nDays (Integer monthNr, Integer year) {
		if( ( monthNr < 0 ) || ( monthNr > 12 ) ) {
			throw new IllegalArgumentException( "invalid month number" );
		}

		if( monthNr == 2 ) {
			if(    ( ( year % 4 == 0 ) && ( year % 100 != 0 ) )
				|| ( year % 400 == 0 ) )
			{
				return 29;
			} else {
				return 28;
			}
		} else {
			return monthDays[monthNr-1];
		}
	}

}

