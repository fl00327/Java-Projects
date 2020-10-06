package org.com1028.lab1.exercise1;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * This is a simple test class which provides until tests for the House class
 * from exercise 1
 * 
 * @author css2ht
 * 
 */

public class HouseTest {

	private House house;

	@Before
	public void setUp() throws Exception {
		house = new House();
		
		/** Set up a particular kind of house */		 
		Lounge lounge1 = new Lounge(10.0);
		DiningRoom dining1 = new DiningRoom(16.0);
		Bedroom bedroom1 = new Bedroom(20.0);

		house.addRoom(lounge1);
		house.addRoom(dining1);
		house.addRoom(bedroom1);
	}
	@Test
	public void testRequirement2() {
		assertEquals("wrong number of rooms", house.howManyRooms(), 3);
		
		Lounge lounge2 = new Lounge(20);
		house.addRoom(lounge2);
		
		assertEquals("wrong number of rooms", house.howManyRooms(), 3);
	}
	

	@Test
	public void testRequirement3() {
		assertEquals("wrong number of rooms", house.howManyRooms(), 3);
	}
	
	@Test
	public void testRequirement4() {
		assertEquals("wrong area", house.getTotalArea(),46.0 , 0.0);
	}

	@After
	public void tearDown() throws Exception {
		house = null;
	}

}
