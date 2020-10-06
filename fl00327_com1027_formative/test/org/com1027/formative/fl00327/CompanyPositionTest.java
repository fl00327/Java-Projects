/**
 * JobRoleTest.java
 */

package org.com1027.formative.fl00327;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * The test class CompanyPositionTest.
 * 
 * @author Stella Kazamia
 * @author Matthew Casey
 */
public class CompanyPositionTest {

	/**
	 * Test accessors and mutators for a job role.
	 */
	@Test
	public void testAccessorsMutators() {
		// Create a job companyPosition object.
		CompanyPosition companyPosition = new CompanyPosition();

		// Test setting and getting the company position.
		companyPosition.setPositionName("Senior Lecturer");
		assertEquals("Senior Lecturer", companyPosition.getPositionName());
	}
}
