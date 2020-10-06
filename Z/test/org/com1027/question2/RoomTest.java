package org.com1027.question2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoomTest {

	@Test
	public void testExpensivePrice() {
		Room room = new Room(1200);
		assertEquals(1200, room.getPrice(), 0);
	}

	@Test
	public void testExpensiveRoom() {
		Room room = new Room(1200);
	}

	@Test
	public void testGetPrice() {
		Room room = new Room(900);
		assertEquals(900, room.getPrice(), 0);
	}

	@Test
	public void testRoom() {
		Room room = new Room(900);
	}
}
