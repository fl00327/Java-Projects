package org.com1027.question4optional;

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
		Property house2 = new House(1, "The Chase", "Guildford", "GU2 7UB", 5);

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
   public void testInfographic() {
	   Agency a1 = new Agency("Lodhi Estate","07383 033853");
		PropertyManagement p1 = new PropertyManagement(a1);
		
		Room room1 = new Room(800);
		Room room2 = new Room(900);
		Room room3 = new Room(1000);
		Room room4 = new Room(1100);
		Room room5 = new Room(1200);
		
		Tenant t1 = new Tenant("Peter","Parker",18,TenantType.STUDENT);
		Tenant t2 = new Tenant("Faseeh","Lodhi",26,TenantType.STUDENT);
		Tenant t3 = new Tenant("Tony","Stark",27,TenantType.PROFESSIONAL);
		Tenant t4 = new Tenant("Steve","Rogers",35,TenantType.PROFESSIONAL);
		Tenant t5 = new Tenant("Miachel","Jordan",50,TenantType.PROFESSIONAL);
		
		
		Property house1 = new House(45,"University Court","Guildford","GU2 7JN",1);
		Property house2 = new House(3,"Hamilton Place","Guildford","GU2 9GX",1);
		Property flat1 = new Flat(10, "Percy Road", "Guildford", "GU2 7XH", 1, 2);
		Property flat2 = new Flat(20,"Manor Place","Guildford","GU2 9PL",1,3);
		Property flat3 = new Flat(35,"Cateswell Road","Guildford","GU7 8PL",1,4);
		
		p1.addProperty(house1);
		p1.addProperty(house2);
		p1.addProperty(flat1);
		p1.addProperty(flat2);
		p1.addProperty(flat3);
		
		p1.addTenant(house1, room1, t1);
		p1.addTenant(house2, room2, t2);
		p1.addTenant(flat1, room3, t3);
		p1.addTenant(flat2, room4, t4);
		p1.addTenant(flat3, room5, t5);
		
		assertEquals("[0-16] = 0\n"+"[17-25] = 1\n"+"[26-35] = 3\n"+"[36-49] = 0\n"+"[50-60] = 1\n"+"[60+] = 0",p1.displayAgeInfoGraphics());
		
   }

	/**
	 * testInfographic
	 * 
	 * 1. Create a new estate agency 
	 * 2. Create a property management object 
	 * 3. Create new different properties (2 houses, 3 flats) that: 
	 * a. All of them are of single occupancy 
	 * 4. Assign only students in the two houses (of ages 18 and 26 respectively) 
	 * 5. Assign only professionals in the three flats (of ages 27, 35 and 50
	 * respectively) 
	 * 6. Check that all properties are occupied 
	 * 7. Test whether the infographics returned match the expected output
	 * 
	 * Note: Infographics can be in the form of a histogram, summary of percentages
	 * for each age group, etc. You can also store the information to a file and 
	 * retrieve them. The purpose for this question is to give you some freedom in
	 * experimenting with advanced OOP concepts.
	 */

}
