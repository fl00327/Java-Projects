/**
 * SalaryTest.java
 */

package org.com1027.formative.fl00327;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests the <code>Salary</code>
 * 
 * @author Stella Kazamia
 * @author Matthew Casey
 */
public class SalaryTest {

	/**
	 * Test accessors and mutators for a salary.
	 */
	@Test
	public void testAccessorsMutators() {
		// Create a salary object.
		Salary salary = new Salary();

		// Test setting and getting the salary.
		assertEquals(0, salary.getSalary(), 0);
		salary.setSalary(10000);
		assertEquals(10000, salary.getSalary(), 0);
		System.out.println("Your salary is" + salary.getSalary());
	}

	/**
	 * Test that the basic rate of tax is applied when calculating tax.
	 */
	@Test
	public void testCalculateTaxBasic() {
		// Create a salary object which should be above the personal allowance, but
		// below the higher threshold.
		Salary salary = new Salary();

		// Tax should be paid at 20% on �7035.
		salary.setSalary(16475);
		assertEquals(1407.0, salary.calculateTax(), 0);

	}

	/**
	 * Test that the higher rate of tax is applied when calculating tax.
	 */
	@Test
	public void testCalculateTaxHigher() {
		// Create a salary object which should be above the higher threshold.
		Salary salary = new Salary();

		// Tax should be paid at 20% on �32010, plus 40% on �12425.
		salary.setSalary(53875);
		assertEquals(6402 + 4970, salary.calculateTax(), 0);
	}

	/**
	 * Test that the basic allowance is taken into account when calculating tax.
	 */
	@Test
	public void testCalculateTaxNone() {
		// Create a salary object which should be below the personal allowance.
		Salary salary = new Salary();

		// No tax should be paid.
		salary.setSalary(1000);
		assertEquals(0, salary.calculateTax(), 0);
	}
}