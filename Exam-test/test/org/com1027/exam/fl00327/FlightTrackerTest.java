/**
 * FlightTrackerTest.java
 */
package org.com1027.exam.fl00327;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Tests for the FlightTracker class.
 * 
 * @author Stella Kazamia
 */
public class FlightTrackerTest {

	private class DummyFlight implements IFlight {

		@Override
		public void allocateSeat(Passenger passenger, SeatType type) {
			// Do nothing
		}

		@Override
		public double calculatePercentageCapacity() {
			return 100;
		}

		@Override
		public String findFreeSeat(SeatType type) {
			return null;
		}

		@Override
		public String getFlightPassengers() {
			return "Stella Kazamia";
		}

		@Override
		public String printFreeSeats() {
			return null;
		}

		@Override
		public String toString() {
			return "Flight:BA12345\n" + "From: London Gatwick\n" + "To: Barcelona\n";
		}

	}

	@Test
	public void testConstruction() {
		Company company = new Company("BA", "British Airways");
		FlightTracker flightTracker = new FlightTracker(company);
		assertNotNull(flightTracker);

		assertEquals("BA", flightTracker.getCompany().getCode());
		assertEquals("British Airways", flightTracker.getCompany().getName());

	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidConstruction() {
		FlightTracker flightTracker = new FlightTracker(null);
	}


	@Test
	public void testFindPassenger() {
		Company company = new Company("BA", "British Airways");
		Passenger passenger = new Passenger("Stella", "Kazamia");
		Passenger passenger2 = new Passenger("Helen", "Treharne");
		FlightTracker flightTracker = new FlightTracker(company);

		DummyFlight flight = new DummyFlight();

		flightTracker.addFlight(flight);

		assertEquals(true, flightTracker.findPassenger(passenger));
		assertEquals(false, flightTracker.findPassenger(passenger2));

	}

	@Test
	public void testMostPopularFlights() {
		Company company = new Company("BA", "British Airways");
		FlightTracker flightTracker = new FlightTracker(company);

		DummyFlight flight = new DummyFlight();

		flightTracker.addFlight(flight);

		assertEquals("Flight:BA12345\n" + "From: London Gatwick\n" + "To: Barcelona\n",
				flightTracker.getMostPopularFlights());
	}

}
