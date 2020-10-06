/**
 * SeatTest.java
 */
package org.com1027.exam.fl00327;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Tests for the Seat class.
 * 
 * @author Stella Kazamia
 */
public class SeatTest {

	@Test
	public void testConstruction() {
		Passenger p1 = new Passenger("Stella", "Kazamia");
		Passenger p2 = new Passenger("Helen", "Treharne");

		Seat seat = new Seat(p1, 1, SeatType.ECONOMY);
		Seat seat2 = new Seat(p2, 2, SeatType.BUSINESS);

		assertEquals("Stella Kazamia", seat.getPassenger().toString());
		assertEquals(1, seat.getSeatNumber());
		assertEquals(SeatType.ECONOMY, seat.getSeatType());

		assertEquals("Helen Treharne", seat2.getPassenger().toString());
		assertEquals(2, seat2.getSeatNumber());
		assertEquals(SeatType.BUSINESS, seat2.getSeatType());

		assertEquals("E1 - Stella Kazamia", seat.toString());
		assertEquals("B2 - Helen Treharne", seat2.toString());

	}

}
