package org.com1027.question1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PropertyManagementTest {

	@Test
	public void testAddProperty() {
		Agency estate = new Agency("Simple Lettings", "01234 567890");
		PropertyManagement pm = new PropertyManagement(estate);
		House house = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);

		pm.addProperty(house);

		assertEquals("1 Percy Road, Guildford GU2 7XH (2 bedroom house :2 available)\n", pm.displayProperties());

	}

	@Test
	public void testAddTenant() {
		Agency estate = new Agency("Simple Lettings", "01234 567890");
		PropertyManagement pm = new PropertyManagement(estate);

		House house1 = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);
		House house2 = new House(1, "The Chase", "Guildford", "GU2 7UB", 5);

		Room room1 = new Room(900);
		Room room2 = new Room(1000);

		Tenant tenant1 = new Tenant("Alice", "Wonderland", 18, TenantType.STUDENT);
		Tenant tenant2 = new Tenant("Stella", "Kazamia", 50, TenantType.PROFESSIONAL);

		pm.addProperty(house1);
		pm.addProperty(house2);

		pm.addTenant(house1, room1, tenant1);

		assertEquals(
				"1 Percy Road, Guildford GU2 7XH (2 bedroom house :1 available)\n"
						+ "1 The Chase, Guildford GU2 7UB (5 bedroom house :5 available)\n" + "",
				pm.displayProperties());
	}

	@Test
	public void testDisplayHouses() {
		Agency estate = new Agency("Simple Lettings", "01234 567890");
		PropertyManagement pm = new PropertyManagement(estate);

		House house1 = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);
		House house2 = new House(1, "The Chase", "Guildford", "GU2 7UB", 5);

		Room room1 = new Room(900);
		Room room2 = new Room(1000);

		Tenant tenant1 = new Tenant("Alice", "Wonderland", 18, TenantType.STUDENT);
		Tenant tenant2 = new Tenant("Stella", "Kazamia", 50, TenantType.PROFESSIONAL);

		pm.addProperty(house1);
		pm.addProperty(house2);

		pm.addTenant(house1, room1, tenant1);
		pm.addTenant(house2, room2, tenant2);

		assertEquals("1 Percy Road, Guildford GU2 7XH (2 bedroom house :1 available)\n"
				+ "1 The Chase, Guildford GU2 7UB (5 bedroom house :4 available)\n", pm.displayProperties());
	}

	@Test
	public void testGetEstateAgency() {
		Agency estate = new Agency("Simple Lettings", "01234 567890");
		PropertyManagement pm = new PropertyManagement(estate);

		assertEquals("Agency: Simple Lettings, Phone Number: 01234 567890", pm.getEstateAgency());
	}

	@Test
	public void testPropertyManagement() {
		Agency estate = new Agency("Simple Lettings", "01234 567890");
		PropertyManagement pm = new PropertyManagement(estate);

		assertEquals("", pm.displayProperties());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testRemoveInvalidProperty() {
		Agency estate = new Agency("Simple Lettings", "01234 567890");
		PropertyManagement pm = new PropertyManagement(estate);

		House house1 = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);

		pm.removeProperty(house1);
	}

	@Test
	public void testRemoveProperty() {
		Agency estate = new Agency("Simple Lettings", "01234 567890");
		PropertyManagement pm = new PropertyManagement(estate);

		House house1 = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);
		House house2 = new House(1, "The Chase", "Guildford", "GU2 7UB", 5);

		Room room1 = new Room(900);

		Tenant tenant1 = new Tenant("Alice", "Wonderland", 18, TenantType.STUDENT);

		pm.addProperty(house1);
		pm.addProperty(house2);

		pm.addTenant(house1, room1, tenant1);

		pm.removeProperty(house2);

		assertEquals("1 Percy Road, Guildford GU2 7XH (2 bedroom house :1 available)\n", pm.displayProperties());
	}
}
