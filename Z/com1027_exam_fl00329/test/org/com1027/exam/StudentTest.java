/**
 * CustomerSolutionTest.java
 */

package org.com1027.exam;

import static org.junit.Assert.assertEquals;

import org.com1027.exam.Student;
import org.junit.Test;

/**
 * Tests for the <code>Customer</code> class.
 * 
 * @author Stella Kazamia
 */
public class StudentTest {

	/**
	 * Creating an Customer object with a valid forename and surname. Testing that
	 * the forename and surname can be retrieved correctly.
	 */
	@Test
	public void testConstruction() {
		Student customer = new Student("Stella", "Kazamia");

		assertEquals("Stella", customer.getForename());
		assertEquals("Kazamia", customer.getSurname());
	}

	/**
	 * Creating a Customer object with an invalid forename, and an invalid surname.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidConstruction() {
		new Student("helen", "treharne");
	}
}
