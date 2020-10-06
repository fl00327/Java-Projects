/**
 * PassengerTest.java
 */
package org.com1027.exam.fl00327;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests for the Passenger class.
 * 
 * @author Stella Kazamia
 */
public class PassengerTest {

	@Test
	public void testConstruction() {
		Passenger p1 = new Passenger("Stella", "Kazamia");

		assertEquals("Stella", p1.getName());
		assertEquals("Kazamia", p1.getSurname());

	}

	@Test(expected = NullPointerException.class)
	public void testInvalidConstruction() {
		Passenger p1 = new Passenger(null, "Kazamia");

	}

	@Test
	public void testToString() {
		Passenger p2 = new Passenger("Helen", "Treharne");

		assertEquals("Helen Treharne", p2.toString());
	}

}
