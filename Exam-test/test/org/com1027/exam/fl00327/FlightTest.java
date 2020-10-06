/**
 * FlightTest.java
 */

package org.com1027.exam.fl00327;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests for the Flight class.
 * 
 * @author Stella Kazamia
 */
public class FlightTest {

	@Test(expected = NullPointerException.class)
	public void testInvalidFlightArgument() {
		Flight flight = new Flight(null, "London Gatwick", "Barcelona", 1, 5);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidSeatArgument() {
		Flight flight = new Flight("BA12345", "London Gatwick", "Barcelona", -1, 5);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidAddArgument() {
		Flight flight = new Flight("BA12345", "London Gatwick", "Barcelona", 1, 5);
		flight.allocateSeat(null, SeatType.BUSINESS);

	}

	@Test
	public void testAllocateBusiness() {
		Flight flight = new Flight("BA12345", "London Gatwick", "Barcelona", 2, 0);
		Passenger p1 = new Passenger("Stella", "Kazamia");
		Passenger p2 = new Passenger("Helen", "Treharne");

		flight.allocateSeat(p1, SeatType.BUSINESS);
		flight.allocateSeat(p2, SeatType.BUSINESS);

		assertEquals(100, flight.calculatePercentageCapacity(), 0);
	}

	@Test
	public void testAllocateEconomy() {
		Flight flight = new Flight("BA12345", "London Gatwick", "Barcelona", 1, 3);
		Passenger p1 = new Passenger("Stella", "Kazamia");
		Passenger p2 = new Passenger("Helen", "Treharne");
		Passenger p3 = new Passenger("Andrew", "Crossan");

		flight.allocateSeat(p1, SeatType.ECONOMY);
		flight.allocateSeat(p2, SeatType.ECONOMY);
		flight.allocateSeat(p3, SeatType.ECONOMY);

		assertEquals(75, flight.calculatePercentageCapacity(), 0);
		assertEquals("Flight:BA12345\n" + "From: London Gatwick\n" + "To: Barcelona\n" + "\n" + "Seats: \n"
				+ "B1- Available \n", flight.printFreeSeats());
	}

	@Test
	public void testAllocateMixed() {
		Flight flight = new Flight("BA12345", "London Gatwick", "Barcelona", 1, 3);
		Passenger p1 = new Passenger("Stella", "Kazamia");
		Passenger p2 = new Passenger("Helen", "Treharne");

		flight.allocateSeat(p1, SeatType.ECONOMY);
		flight.allocateSeat(p2, SeatType.BUSINESS);

		assertEquals(50, flight.calculatePercentageCapacity(), 0);
	}

	@Test
	public void testFindFreeSeat() {
		Flight flight = new Flight("BA12345", "London Gatwick", "Barcelona", 1, 2);
		Passenger p1 = new Passenger("Stella", "Kazamia");
		Passenger p2 = new Passenger("Helen", "Treharne");

		flight.allocateSeat(p1, SeatType.ECONOMY);
		flight.allocateSeat(p2, SeatType.BUSINESS);

		assertEquals("No seats of that type are free", flight.findFreeSeat(SeatType.BUSINESS));
		assertEquals("E2- Available \n", flight.findFreeSeat(SeatType.ECONOMY));

	}

}