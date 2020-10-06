package org.com1027.question3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;



public class PropertyTest {

	@Test
	public void testFlat() {
		Property flat = new Flat(1, "Percy Road", "Guildford", "GU2 7XH", 2, 1);
		assertEquals("1 Percy Road, Guildford GU2 7XH (2 bedroom flat on 1 floor :2 available)", flat.toString());

	}

	@Test
	public void testFlatCouncilTax() {
		Room room1 = new Room(950);

		Tenant tenant = new Tenant("Bob", "Ross", 53, TenantType.PROFESSIONAL);

		Property flat = new Flat(10, "Percy Road", "Guildford", "GU2 7XH", 1, 2);

		flat.occupyRoom(room1, tenant);

		flat.setCouncilTax(1000);
		assertEquals("10 Percy Road, Guildford GU2 7XH (1 bedroom flat on 2 floor :0 available)", flat.toString());

	}

	@Test
	public void testFlatGetAvailableRooms() {
		Property flat = new Flat(1, "Percy Road", "Guildford", "GU2 7XH", 2, 1);
		assertEquals(2, flat.getAvailableRooms());
	}

	@Test
	public void testFlatGetPrice() {
		Property flat = new Flat(1, "Percy Road", "Guildford", "GU2 7XH", 2, 1);
		assertEquals(0, flat.getPrice(), 0);
	}

	@Test
	public void testFlatIsAvailable() {
		Property flat = new Flat(1, "Percy Road", "Guildford", "GU2 7XH", 2, 1);
		assertTrue(flat.isAvailable());
	}

	@Test
	public void testFlatOccupyRoom() {
		Room room1 = new Room(900);

		Tenant tenant1 = new Tenant("Alice", "Wonderland", 18, TenantType.STUDENT);

		Property flat = new Flat(1, "Percy Road", "Guildford", "GU2 7XH", 2, 1);

		flat.occupyRoom(room1, tenant1);
		assertEquals(1, flat.getAvailableRooms());

	}

	@Test
	public void testFlatToString() {
		Room room1 = new Room(900);

		Tenant tenant1 = new Tenant("Alice", "Wonderland", 18, TenantType.STUDENT);

		Property flat = new Flat(1, "Percy Road", "Guildford", "GU2 7XH", 2, 1);

		flat.occupyRoom(room1, tenant1);
		assertEquals("1 Percy Road, Guildford GU2 7XH (2 bedroom flat on 1 floor :1 available)", flat.toString());
	}

	@Test
	public void testGetAvailableRooms() {
		Property house = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);
		assertEquals(2, house.getAvailableRooms());
	}

	@Test
	public void testGetPrice() {
		Property house = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);
		assertEquals(0, house.getPrice(), 0);
	}

	@Test
	public void testHouse() {
		Property house = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);
		assertEquals("1 Percy Road, Guildford GU2 7XH (2 bedroom house :2 available)", house.toString());

	}

	@Test
	public void testHouseCouncilTax() {
		Room room1 = new Room(800);
		Room room2 = new Room(900);

		Tenant tenant1 = new Tenant("Alice", "Wonderland", 18, TenantType.STUDENT);
		Tenant tenant2 = new Tenant("Bob", "Ross", 53, TenantType.PROFESSIONAL);

		Property house = new House(10, "The Chase", "Guildford", "GU2 7UB", 2);

		house.occupyRoom(room1, tenant1);
		house.occupyRoom(room2, tenant2);

		house.setCouncilTax(1500);

		assertEquals("10 The Chase, Guildford GU2 7UB (2 bedroom house :0 available)", house.toString());
	}

	@Test
	public void testIsAvailable() {
		Property house = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);
		assertTrue(house.isAvailable());
	}

	@Test
	public void testOccupyRoom() {
		Room room1 = new Room(900);

		Tenant tenant1 = new Tenant("Alice", "Wonderland", 18, TenantType.STUDENT);

		Property house = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);

		house.occupyRoom(room1, tenant1);
		assertEquals(1, house.getAvailableRooms());

	}

	@Test
	public void testSecondFlat() {
		Property flat = new Flat(1, "The Chase", "Guildford", "GU2 7UB", 3, 2);
		assertEquals("1 The Chase, Guildford GU2 7UB (3 bedroom flat on 2 floor :3 available)", flat.toString());

	}

	@Test
	public void testSecondFlatGetAvailableRooms() {
		Property flat = new Flat(1, "The Chase", "Guildford", "GU2 7UB", 3, 2);
		assertEquals(3, flat.getAvailableRooms());
	}

	@Test
	public void testSecondFlatGetPrice() {
		Property flat = new Flat(1, "The Chase", "Guildford", "GU2 7UB", 3, 2);
		assertEquals(0, flat.getPrice(), 0);
	}

	@Test
	public void testSecondFlatIsAvailable() {
		Property flat = new Flat(1, "The Chase", "Guildford", "GU2 7UB", 3, 2);
		assertTrue(flat.isAvailable());
	}

	@Test
	public void testSecondFlatOccupyRoom() {
		Room room1 = new Room(900);
		Room room2 = new Room(1000);

		Tenant tenant1 = new Tenant("Alice", "Wonderland", 18, TenantType.STUDENT);
		Tenant tenant2 = new Tenant("Stella", "Kazamia", 50, TenantType.PROFESSIONAL);

		Property flat = new Flat(1, "The Chase", "Guildford", "GU2 7UB", 3, 2);

		flat.occupyRoom(room1, tenant1);
		flat.occupyRoom(room2, tenant2);

		assertEquals(1, flat.getAvailableRooms());

	}

	@Test
	public void testSecondFlatToString() {
		Room room1 = new Room(900);
		Room room2 = new Room(1000);

		Tenant tenant1 = new Tenant("Alice", "Wonderland", 18, TenantType.STUDENT);
		Tenant tenant2 = new Tenant("Stella", "Kazamia", 50, TenantType.PROFESSIONAL);

		Property flat = new Flat(1, "The Chase", "Guildford", "GU2 7UB", 3, 2);

		flat.occupyRoom(room1, tenant1);
		flat.occupyRoom(room2, tenant2);

		assertEquals("1 The Chase, Guildford GU2 7UB (3 bedroom flat on 2 floor :1 available)", flat.toString());
	}

	@Test
	public void testSecondGetAvailableRooms() {
		Property house = new House(1, "The Chase", "Guildford", "GU2 7UB", 5);
		assertEquals(5, house.getAvailableRooms());
	}

	@Test
	public void testSecondGetPrice() {
		Property house = new House(1, "The Chase", "Guildford", "GU2 7UB", 5);
		assertEquals(0, house.getPrice(), 0);
	}

	@Test
	public void testSecondHouse() {
		Property house = new House(1, "The Chase", "Guildford", "GU2 7UB", 5);
		assertEquals("1 The Chase, Guildford GU2 7UB (5 bedroom house :5 available)", house.toString());

	}

	@Test
	public void testSecondIsAvailable() {
		Property house = new House(1, "The Chase", "Guildford", "GU2 7UB", 5);
		assertTrue(house.isAvailable());
	}

	@Test
	public void testSecondOccupyRoom() {
		Room room1 = new Room(900);
		Room room2 = new Room(1000);

		Tenant tenant1 = new Tenant("Alice", "Wonderland", 18, TenantType.STUDENT);
		Tenant tenant2 = new Tenant("Stella", "Kazamia", 50, TenantType.PROFESSIONAL);

		Property house = new House(1, "The Chase", "Guildford", "GU2 7UB", 5);

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

		Property house = new House(1, "The Chase", "Guildford", "GU2 7UB", 5);

		house.occupyRoom(room1, tenant1);
		house.occupyRoom(room2, tenant2);

		assertEquals("1 The Chase, Guildford GU2 7UB (5 bedroom house :3 available)", house.toString());
	}

	@Test
	public void testToString() {
		Room room1 = new Room(900);

		Tenant tenant1 = new Tenant("Alice", "Wonderland", 18, TenantType.STUDENT);

		Property house = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);

		house.occupyRoom(room1, tenant1);
		assertEquals("1 Percy Road, Guildford GU2 7XH (2 bedroom house :1 available)", house.toString());
	}

}
