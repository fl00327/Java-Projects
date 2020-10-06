package org.com1027.question3;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;



public class PropertyManagementTest {

	@Test
	public void testAddProperty() {
		Agency estate = new Agency("Simple Lettings", "01234 567890");
		PropertyManagement pm = new PropertyManagement(estate);
		Property house = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);

		pm.addProperty(house);

		assertEquals("1 Percy Road, Guildford GU2 7XH (2 bedroom house :2 available)\n", pm.displayProperties());

	}

	@Test
	public void testAddTenant() {
		Agency estate = new Agency("Simple Lettings", "01234 567890");
		PropertyManagement pm = new PropertyManagement(estate);

		Property house1 = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);
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

		Property house1 = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);
		Property house2 = new House(1, "The Chase", "Guildford", "GU2 7UB", 5);

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
	public void testMixCouncilTax() {
		Agency estate = new Agency("Simple Lettings", "01234 567890");
		PropertyManagement pm = new PropertyManagement(estate);

		Room room1 = new Room(800);
		Room room2 = new Room(900);

		Tenant tenant1 = new Tenant("Alice", "Wonderland", 18, TenantType.STUDENT);
		Tenant tenant2 = new Tenant("Bob", "Ross", 53, TenantType.PROFESSIONAL);

		Property house = new House(10, "The Chase", "Guildford", "GU2 7UB", 2);

		pm.addProperty(house);

		pm.addTenant(house, room1, tenant1);
		pm.addTenant(house, room2, tenant2);

		house.setCouncilTax(1500);

		String output1 = "10 The Chase, Guildford GU2 7UB (2 bedroom house :0 available)\n" + "	Room: 800.0\n"
				+ "	Room: 900.0\n" + "	Total: £20400.00 (Council Tax: £1125.0)\n";

		String output2 = "10 The Chase, Guildford GU2 7UB (2 bedroom house :0 available)\n" + "	Room: 900.0\n"
				+ "	Room: 800.0\n" + "	Total: £20400.00 (Council Tax: £1125.0)\n";

		assertThat(pm.displayProperties(), anyOf(is(output1), is(output2)));
	}

	@Test
	public void testPercentageExempt() {
		Agency estate = new Agency("Simple Lettings", "01234 567890");
		PropertyManagement pm = new PropertyManagement(estate);

		Room room1 = new Room(800);
		Room room2 = new Room(900);
		Room room3 = new Room(950);
		Room room4 = new Room(850);

		Tenant tenant1 = new Tenant("Alice", "Wonderland", 18, TenantType.STUDENT);
		Tenant tenant2 = new Tenant("Bob", "Ross", 53, TenantType.STUDENT);
		Tenant tenant3 = new Tenant("Mickey", "Mouse", 18, TenantType.STUDENT);
		Tenant tenant4 = new Tenant("Billy", "Jean", 53, TenantType.STUDENT);
		Tenant tenant5 = new Tenant("Joe", "Bloggs", 18, TenantType.STUDENT);

		Property house1 = new House(2, "The Chase", "Guildford", "GU2 7UB", 2);
		Property house2 = new House(12, "Benbrick Road", "Guildford", "GU2 7UB", 3);
		Property house3 = new House(20, "The Oval", "Guildford", "GU2 7UB", 5);

		Property flat1 = new Flat(1, "Occam Road", "Guildford", "GU2 7AB", 1, 2);
		Property flat2 = new Flat(5, "Percy Road", "Guildford", "GU2 7XH", 3, 1);

		pm.addProperty(house1);
		pm.addProperty(house2);
		pm.addProperty(house3);

		pm.addProperty(flat1);
		pm.addProperty(flat2);

		pm.addTenant(house1, room1, tenant1);
		pm.addTenant(house1, room2, tenant5);

		pm.addTenant(house2, room1, tenant1);
		pm.addTenant(house2, room2, tenant2);

		pm.addTenant(flat1, room3, tenant3);
		pm.addTenant(flat2, room4, tenant4);

		house1.setCouncilTax(1500);
		house2.setCouncilTax(2000);
		house3.setCouncilTax(1000);

		flat1.setCouncilTax(1300);
		flat2.setCouncilTax(1000);

		assertEquals(40, pm.percentageCouncilTaxExemption(), 0);
	}

	@Test
	public void testProfessionalCouncilTax() {
		Agency estate = new Agency("Simple Lettings", "01234 567890");
		PropertyManagement pm = new PropertyManagement(estate);

		Room room1 = new Room(950);

		Tenant tenant = new Tenant("Bob", "Ross", 53, TenantType.PROFESSIONAL);

		Property flat = new Flat(10, "Percy Road", "Guildford", "GU2 7XH", 1, 2);

		pm.addProperty(flat);

		pm.addTenant(flat, room1, tenant);

		flat.setCouncilTax(1000);
		assertEquals("10 Percy Road, Guildford GU2 7XH (1 bedroom flat on 2 floor :0 available)\n" + "	Room: 950.0\n"
				+ "	Total: £11900.00 (Council Tax: £750.0)\n" + "", pm.displayProperties());

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

		Property house1 = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);

		pm.removeProperty(house1);
	}

	@Test
	public void testRemoveProperty() {
		Agency estate = new Agency("Simple Lettings", "01234 567890");
		PropertyManagement pm = new PropertyManagement(estate);

		Property house1 = new House(1, "Percy Road", "Guildford", "GU2 7XH", 2);
		Property house2 = new House(1, "The Chase", "Guildford", "GU2 7UB", 5);

		Room room1 = new Room(900);

		Tenant tenant1 = new Tenant("Alice", "Wonderland", 18, TenantType.STUDENT);

		pm.addProperty(house1);
		pm.addProperty(house2);

		pm.addTenant(house1, room1, tenant1);

		pm.removeProperty(house2);

		assertEquals("1 Percy Road, Guildford GU2 7XH (2 bedroom house :1 available)\n", pm.displayProperties());
	}

	@Test
	public void testStudentCouncilTax() {
		Agency estate = new Agency("Simple Lettings", "01234 567890");
		PropertyManagement pm = new PropertyManagement(estate);

		Room room1 = new Room(800);
		Room room2 = new Room(900);

		Tenant tenant1 = new Tenant("Alice", "Wonderland", 18, TenantType.STUDENT);
		Tenant tenant2 = new Tenant("Bob", "Ross", 53, TenantType.STUDENT);

		Property house = new House(20, "The Madrid Road", "Guildford", "GU2 7UB", 2);

		pm.addProperty(house);

		pm.addTenant(house, room1, tenant1);
		pm.addTenant(house, room2, tenant2);

		house.setCouncilTax(1500);

		assertThat(pm.displayProperties(),
				anyOf(is("20 The Madrid Road, Guildford GU2 7UB (2 bedroom house :0 available)\n" + "	Room: 800.0\n"
						+ "	Room: 900.0\n" + "	Total: £20400.00 (Council Tax: £0.0)\n" + ""),
						is("20 The Madrid Road, Guildford GU2 7UB (2 bedroom house :0 available)\n" + "	Room: 900.0\n"
								+ "	Room: 800.0\n" + "	Total: £20400.00 (Council Tax: £0.0)\n" + "")));
	}
	@Test
	public void displayAllCouncilTaxExemptProperties() {
		Agency a1 = new Agency("Lodhi Estate","07383 033853");
		PropertyManagement p1 = new PropertyManagement(a1);
		
		Room room1 = new Room(800);
		Room room2 = new Room(900);
		Room room3 = new Room(1000);
		Room room4 = new Room(1100);
		
		Tenant t1 = new Tenant("Peter","Parker",19,TenantType.STUDENT);
		Tenant t2 = new Tenant("Faseeh","Lodhi",19,TenantType.STUDENT);
		Tenant t3 = new Tenant("Tony","Stark",55,TenantType.PROFESSIONAL);
		Tenant t4 = new Tenant("Steve","Rogers",80,TenantType.PROFESSIONAL);
		
		Property house1 = new House(45,"University Court","Guildford","GU2 7JN",2);
		Property house2 = new House(35, "CatesWell Road","Birmingham","BN8 8NB",2);
		
		p1.addProperty(house1);
		p1.addProperty(house2);
		
		p1.addTenant(house1, room1, t1);
		p1.addTenant(house1, room2, t2);
		
		p1.addTenant(house2, room3, t3);
		p1.addTenant(house2, room4, t4);
		
		house1.setCouncilTax(300);
		house2.setCouncilTax(700);
	
		assertThat(p1.displayAllCouncilTaxExemptProperties(),
				anyOf(is("45 University Court, Guildford GU2 7JN (2 bedroom house :0 available)\n" + "	Room: 800.0\n"
						+ "	Room: 900.0\n" + "	Total: £20400.00 (Council Tax: £0.0)\n" + ""),
						is("45 University Court, Guildford GU2 7JN (2 bedroom house :0 available)\n" + "	Room: 900.0\n"
								+ "	Room: 800.0\n" + "	Total: £20400.00 (Council Tax: £0.0)\n" + "")));
	}
	

}


