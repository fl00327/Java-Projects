package org.com1027.question3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TenantTest {

	@Test
	public void testGetAge() {
		Tenant tenant = new Tenant("Kanye","West",38,TenantType.PROFESSIONAL);
		assertEquals(38,tenant.getAge());
	}
	@Test
	public void testGetType() {
		Tenant tenant = new Tenant("Peter","Parker",19,TenantType.STUDENT);
		assertEquals(TenantType.STUDENT,tenant.getType());
	}
	@Test
	public void testToString() {
		Tenant tenant = new Tenant("Keanu","Reeves",50,TenantType.PROFESSIONAL);
		assertEquals("Keanu Reeves",tenant.toString());
	}
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidAge() {
		Tenant tenant = new Tenant("Chandler","Bing",-2,TenantType.PROFESSIONAL);
	}
	@Test(expected = NullPointerException.class)
	public void testInvalidSurname() {
	Tenant tenant = new Tenant("Lebron",null,29,TenantType.PROFESSIONAL);
	}
	@Test(expected = NullPointerException.class)
	public void testInvalidName() {
		Tenant tenant = new Tenant(null,"Gates",67,TenantType.PROFESSIONAL);
	}

}
