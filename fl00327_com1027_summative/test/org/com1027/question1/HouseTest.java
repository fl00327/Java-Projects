package org.com1027.question1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HouseTest {

	@Test
	public void testGetAvailableRooms() {
		House house = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);
		assertEquals(2, house.getAvailableRooms());
	}

	@Test
	public void testGetPrice() {
		House house = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);
		assertEquals(0, house.getPrice(), 0);
	}

	@Test
	public void testHouse() {
		House house = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);
		assertEquals("1 Percy Road, Guildford GU2 7XH (2 bedroom house :2 available)", house.toString());

	}

	@Test
	public void testIsAvailable() {
		House house = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);
		assertTrue(house.isAvailable());
	}

	@Test
	public void testOccupyRoom() {
		Room room1 = new Room(900);

		Tenant tenant1 = new Tenant("Alice", "Wonderland", 18, TenantType.STUDENT);

		House house = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);

		house.occupyRoom(room1, tenant1);
		assertEquals(1, house.getAvailableRooms());

	}

	@Test
	public void testSecondGetAvailableRooms() {
		House house = new House(1, "The Chase", "Guildford", "GU2 7UB", 5);
		assertEquals(5, house.getAvailableRooms());
	}

	@Test
	public void testSecondGetPrice() {
		House house = new House(1, "The Chase", "Guildford", "GU2 7UB", 5);
		assertEquals(0, house.getPrice(), 0);
	}

	@Test
	public void testSecondHouse() {
		House house = new House(1, "The Chase", "Guildford", "GU2 7UB", 5);
		assertEquals("1 The Chase, Guildford GU2 7UB (5 bedroom house :5 available)", house.toString());

	}

	@Test
	public void testSecondIsAvailable() {
		House house = new House(1, "The Chase", "Guildford", "GU2 7UB", 5);
		assertTrue(house.isAvailable());
	}

	@Test
	public void testSecondOccupyRoom() {
		Room room1 = new Room(900);
		Room room2 = new Room(1000);

		Tenant tenant1 = new Tenant("Alice", "Wonderland", 18, TenantType.STUDENT);
		Tenant tenant2 = new Tenant("Stella", "Kazamia", 50, TenantType.PROFESSIONAL);

		House house = new House(1, "The Chase", "Guildford", "GU2 7UB", 5);

		house.occupyRoom(room1, tenant1);
		house.occupyRoom(room2, tenant2);

		assertEquals(3, house.getAvailableRooms());

	}

	@Test
	public void testSecondToString() {
		Room room1 = new Room(900);
		Room room2 = new Room(1000);

		Tenant tenant1 = new Tenant("Alice", "Wonderland", 18, TenantType.STUDENT);
		Tenant tenant2 = new Tenant("Stella", "Kazamia", 50, TenantType.PROFESSIONAL);

		House house = new House(1, "The Chase", "Guildford", "GU2 7UB", 5);

		house.occupyRoom(room1, tenant1);
		house.occupyRoom(room2, tenant2);

		assertEquals("1 The Chase, Guildford GU2 7UB (5 bedroom house :3 available)", house.toString());
	}

	@Test
	public void testToString() {
		Room room1 = new Room(900);

		Tenant tenant1 = new Tenant("Alice", "Wonderland", 18, TenantType.STUDENT);

		House house = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);

		house.occupyRoom(room1, tenant1);
		assertEquals("1 Percy Road, Guildford GU2 7XH (2 bedroom house :1 available)", house.toString());
	}

}
