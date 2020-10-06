/**
 * EmployeeTest.java
 */

package org.com1027.formative.fl00327;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests the <code>Employee</code>
 * 
 * @author Stella Kazamia
 * @author Matthew Casey
 */
public class EmployeeTest {

	/**
	 * Test accessors and mutators for an employee.
	 */
	@Test
	public void testAccessorsMutators() {
		// Create an employee.
		Salary salary = new Salary();
		salary.setSalary(100000);

		CompanyPosition companyPosition = new CompanyPosition();
		companyPosition.setPositionName("Director");

		Employee employee = new Employee(1234, "Sid", "James", salary, companyPosition);

		// Test the fields.
		assertEquals(1234, employee.getId());
		assertEquals("Sid", employee.getForename());
		assertEquals("James", employee.getSurname());
		assertEquals(100000, employee.getSalary(),0);
		assertEquals("Director", employee.getPositionName());
	}

	/**
	 * Test getting the string for an employee's record.
	 */
	@Test
	public void testDisplayRecord() {
		// Create an employee.
		Salary salary = new Salary();
		salary.setSalary(100000);

		CompanyPosition companyPosition = new CompanyPosition();
		companyPosition.setPositionName("Director");

		Employee employee = new Employee(1234, "Sid", "James", salary, companyPosition);

		// Test the string of of the correct format - this is precise.
		assertEquals("James, Sid (1234): Director at �100000.0 (�29822.0 tax) and is eligible for bonus.",
				employee.toString());
	}

	/**
	 * Test getting the string for an employee's record.
	 */
	@Test
	public void testDisplayRecordNoBonus() {
		// Create an employee.
		Salary salary = new Salary();
		salary.setSalary(30000.0);

		CompanyPosition companyPosition = new CompanyPosition();
		companyPosition.setPositionName("Sales Person");

		Employee employee = new Employee(5678, "Joe", "Bloggs", salary, companyPosition);

		// Test the string of of the correct format - this is precise.
		assertEquals("Bloggs, Joe (5678): Sales Person at �30000.0 (�4112.0 tax) and is not eligible for bonus.",
				employee.toString());
	}
}
