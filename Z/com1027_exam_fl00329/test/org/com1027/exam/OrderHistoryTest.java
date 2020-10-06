/**
 * orderHistorySolutionTest.java
 */

package org.com1027.exam;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.com1027.exam.Student;
import org.com1027.exam.IOrder;
import org.com1027.exam.OrderHistory;
import org.com1027.exam.Pizza;
import org.junit.Test;

/**
 * Tests the orderHistory class.
 * 
 * @author Stella Kazamia
 */
public class OrderHistoryTest {

	private class DummyOrder implements IOrder {

		@Override
		public void addPizza(Pizza pizza) {
			// do nothing

		}

		@Override
		public double calculateTotalCostOfOrder() {
			return 51.00;
		}

		@Override
		public int getOrderNumber() {
			return 567;
		}

		@Override
		public int howManyPizzasInOrder() {
			return 8;
		}

		@Override
		public boolean orderMeetsOffer() {
			return true;
		}

		@Override
		public void printOrder() {
			// do nothing

		}

		@Override
		public double getMoneySaved() {
			return 17;
		}

	}

	/**
	 * Creating an Order Tracker object with a student. Testing that the object has
	 * been created. Test that the student information has been stored correctly -
	 * this is only safe to do because student is an immutable object.
	 * 
	 * {@link org.com1027.exam.OrderHistory#orderHistory(Student student)}
	 * 
	 */
	@Test
	public void testConstruction() {
		Student student = new Student("Helen", "Treharne");
		OrderHistory orderHistory = new OrderHistory(student);
		assertNotNull(orderHistory);

		assertEquals("Helen", orderHistory.getStudentCustomer().getForename());
		assertEquals("Treharne", orderHistory.getStudentCustomer().getSurname());

	}

	/**
	 * Creating an orderHistory object with an invalid student.
	 * 
	 * {@link org.com1027.exam.OrderHistory#orderHistory(Student student)}
	 * 
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidConstruction() {
		OrderHistory orderHistory = new OrderHistory(null);
	}
	@Test
	public void testCalculateTotalCostOfOrders() {
		Student student = new Student("Faseeh", "Lodhi");
		OrderHistory orderHistory = new OrderHistory(student);
		DummyOrder o = new DummyOrder();
		assertEquals(567,o.getOrderNumber());
		assertEquals(51.00,o.calculateTotalCostOfOrder(),0.0);
	}

}
