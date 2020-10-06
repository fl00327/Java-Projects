package org.com1027.question3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AgencyTest {

	@Test
	public void testGetName() {
		Agency estate = new Agency("Simple Lettings", "01234 567890");
		assertEquals("Simple Lettings", estate.getName());
	}

	@Test
	public void testGetPhoneNumber() {
		Agency estate = new Agency("Simple Lettings", "01234 567890");
		assertEquals("01234 567890", estate.getPhoneNumber());
	}

	@Test
	public void testGetSecondName() {
		Agency estate = new Agency("Agency Name", "09876 543210");
		assertEquals("Agency Name", estate.getName());
	}

	@Test
	public void testGetSecondPhoneNumber() {
		Agency estate = new Agency("Agency Name", "09876 543210");
		assertEquals("09876 543210", estate.getPhoneNumber());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidAgency() {
		Agency estate = new Agency("Agency$Name", "01234 567890");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidAgencyName() {
		Agency estate = new Agency("simple Lettings", "01234 567890");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidAgencyPhone() {
		Agency estate = new Agency("Simple Lettings", "01234567890");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidAgencyPhoneNumber() {
		Agency estate = new Agency("Agency Name", "0044 1234567890");
	}

	@Test
	public void testSecondToString() {
		Agency estate = new Agency("Agency Name", "09876 543210");
		assertEquals("Agency: Agency Name, Phone Number: 09876 543210", estate.toString());
	}

	@Test
	public void testToString() {
		Agency estate = new Agency("Simple Lettings", "01234 567890");
		assertEquals("Agency: Simple Lettings, Phone Number: 01234 567890", estate.toString());
	}
}
