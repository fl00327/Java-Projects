package org.com1028.lab1.excercise2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HouseTest {
	
	private House h1, h2;

	@Before
	public void setUp() throws Exception {
		/**
		 * set up a house with 2 floors
		 */
		h1 = new House(2);
		Lounge l1 = new Lounge(10.0);
		DiningRoom d1 = new DiningRoom(16.0);
		Bedroom b1 = new Bedroom(10.0);
		Bedroom b2 = new Bedroom(15.0);
		h1.addFloor(l1, d1);		
		h1.addFloor(b1, b2);

	}

	@Test
	public void testRequirement1() {
		// a room in a house can be a lounge, a dining room or a bedroom
		// if the setUp passes this requirement is fulfilled.
		// so an empty test will do here!
	}

	@Test(expected = IllegalArgumentException.class)
	public void testRequirement2() {
		// A house may be associated with many rooms but there can only be one
		// lounge
		Lounge l2 = new Lounge(12.0);
		h1.addRoom(l2, 1);
	}

	@Test
	public void testRequirement3() {
		assertEquals("wrong number of rooms", h1.howManyRooms(), 4);
	}

	@Test
	public void testRequirement4() {
		System.out.println("area: " + h1.getTotalArea());
		assertEquals("wrong area", h1.getTotalArea(), 51.0, 0);
	}
	
	@Test
	public void testRequirement8() {
		assertEquals("wrong number of smoke alarms", h1.getNumberOfSmokeAlarms(), 2, 0);
	}

	@After
	public void tearDown() throws Exception {
		h1 = null;
		h2 = null;
	}

}
