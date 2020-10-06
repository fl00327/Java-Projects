package org.com1028.lab1.excercise1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HouseTest {
	
	private House house;
	
	@Before
	public void setUp() throws Exception {
		house = new House();
		
		//Set up a particular kind of house		 
		Lounge l1 = new Lounge(10.0);
		DiningRoom d1 = new DiningRoom(16.0);
		Bedroom b1 = new Bedroom(10.0);
		house.addRoom(l1);
		house.addRoom(d1);
		house.addRoom(b1);
	}

	@Test
	public void testRequirement1() {
		// a room in a house can be a lounge, a dining room or a bedroom
		// if the setUp passes this requirement is fulfilled.
		// so an empty test will do here!
	}

	@Test(expected = IllegalArgumentException.class)
	public void testRequirement2() {
		//A house may be associated with many rooms but there can only be one lounge
		Lounge l2 = new Lounge(12.0);
		house.addRoom(l2);
	}

	@Test
	public void testRequirement3() {
		assertEquals("wrong number of rooms", house.howManyRooms(), 3);
	}

	@Test
	public void testRequirement4() {
		System.out.println("area: " + house.getTotalArea());
		assertEquals("wrong area", house.getTotalArea(), 36.0, 0);
	}

	@After
	public void tearDown() throws Exception {
	}
}
