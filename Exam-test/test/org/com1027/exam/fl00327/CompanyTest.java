/**
 * CompanyTest.java
 */

package org.com1027.exam.fl00327;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests for the <code>Company</code> class.
 * 
 * @author Stella Kazamia
 */
public class CompanyTest {

	@Test
	public void testConstruction() {
		Company company = new Company("BA", "British Airways");

		assertEquals("BA", company.getCode());
		assertEquals("British Airways", company.getName());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidCode() {
		Company company = new Company("ba", "British Airways");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidCompanyName() {
		Company company = new Company("BA", "BriTish Airways");
	}

}
