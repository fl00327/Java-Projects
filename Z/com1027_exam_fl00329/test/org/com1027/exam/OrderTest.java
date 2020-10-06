package org.com1027.exam;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTest {

	/**
	 * Creating an Order object with valid order number. Testing that the order
	 * number can be retrieved correctly.
	 */
	@Test
	public void testOrder() {
		Order order = new Order(789);
		assertEquals(789, order.getOrderNumber());
	}

	/**
	 * Creating a Order object with a valid order number. Test that when an invalid
	 * pizza object is added an exception is expected.
	 */

	@Test(expected = NullPointerException.class)
	public void testAddInvalidPizza() {
		Order order = new Order(789);
		order.addPizza(null);
	}

	/**
	 * Creating a Order object with a valid order number. Add three pizzas of
	 * different type to the same order. Test that the total cost is �32.44. No
	 * discount is applied to the overall cost.
	 * 
	 */
	@Test
	public void testCalculateTotalCostOfOrder() {
		Order order = new Order(789);
		Pizza pizza1 = new FarmHouse("Farm House", PizzaType.STUFFED_CRUST,12.95);
		Pizza pizza2 = new Pepperoni("Pepperoni", PizzaType.THIN_CRUST,10.99);
		Pizza pizza3 = new Veggie("Veggie",PizzaType.STUFFED_CRUST, 8.50);

		order.addPizza(pizza1);
		order.addPizza(pizza2);
		order.addPizza(pizza3);

		assertEquals(32.44, order.calculateTotalCostOfOrder(), 0);
	}

	/**
	 * Creating a Order object with a valid order number. Add five pizzas of
	 * different type to the same order. Test that the total cost is �37.08 after
	 * the discount of 25% is applied to the overall order.
	 * 
	 */
	@Test
	public void testCalculateTotalCostOfOrderWithDiscount() {
		Order order = new Order(789);
		Pizza pizza1 = new FarmHouse("Farm House", PizzaType.STUFFED_CRUST, 12.95);
		Pizza pizza2 = new Pepperoni("Pepperoni", PizzaType.THIN_CRUST, 10.99);
		Pizza pizza3 = new Veggie("Veggie", PizzaType.STUFFED_CRUST, 8.50);
		Pizza pizza4 = new Veggie("Veggie", PizzaType.FLATBREAD, 8.50);
		Pizza pizza5 = new Veggie("Veggie", PizzaType.STUFFED_CRUST, 8.50);

		order.addPizza(pizza1);
		order.addPizza(pizza2);
		order.addPizza(pizza3);
		order.addPizza(pizza4);
		order.addPizza(pizza5);

		assertEquals(37.08, order.calculateTotalCostOfOrder(), 0);
	}

	/**
	 * Creating a Order object with a valid order number. Add five pizzas of
	 * different type to the same order. Test that the getMoneySaved() method
	 * returns �12.36 as the discount of 25% is applied to the overall order.
	 * 
	 */

	@Test
	public void testGetMoneySaved() {
		Order order = new Order(789);
		Pizza pizza1 = new FarmHouse("Farm House", PizzaType.STUFFED_CRUST, 12.95);
		Pizza pizza2 = new Pepperoni("Pepperoni", PizzaType.THIN_CRUST, 10.99);
		Pizza pizza3 = new Veggie("Veggie", PizzaType.STUFFED_CRUST, 8.50);
		Pizza pizza4 = new Veggie("Veggie", PizzaType.FLATBREAD, 8.50);
		Pizza pizza5 = new Veggie("Veggie", PizzaType.STUFFED_CRUST, 8.50);

		order.addPizza(pizza1);
		order.addPizza(pizza2);
		order.addPizza(pizza3);
		order.addPizza(pizza4);
		order.addPizza(pizza5);

		assertEquals(12.36, order.getMoneySaved(), 0);
	}

	/**
	 * Creating a Order object with a valid order number. Add three pizzas of
	 * different type to the same order. Test that the getMoneySaved() method
	 * returns 0. No discount is applied to the overall cost and no money was saved.
	 * 
	 */
	@Test
	public void testGetMoneySavedWithoutDiscount() {
		Order order = new Order(789);
		Pizza pizza1 = new FarmHouse("Farm House", PizzaType.STUFFED_CRUST, 12.95);
		Pizza pizza2 = new Pepperoni("Pepperoni", PizzaType.THIN_CRUST, 10.99);
		Pizza pizza3 = new Veggie("Veggie", PizzaType.STUFFED_CRUST, 8.50);

		order.addPizza(pizza1);
		order.addPizza(pizza2);
		order.addPizza(pizza3);

		assertEquals(0, order.getMoneySaved(), 0);
	}

	/**
	 * Creating a Order object with a valid order number. Add five pizzas of
	 * different type to the same order. Discount of 25% is applied to the overall
	 * order. Test that the orderMeetsOffer() method returns true.
	 * 
	 */
	@Test
	public void testOrderMeetsOffer() {
		Order order = new Order(789);
		Pizza pizza1 = new FarmHouse("Farm House", PizzaType.STUFFED_CRUST, 12.95);
		Pizza pizza2 = new Pepperoni("Pepperoni", PizzaType.THIN_CRUST, 10.99);
		Pizza pizza3 = new Veggie("Veggie", PizzaType.STUFFED_CRUST, 8.50);
		Pizza pizza4 = new Veggie("Veggie", PizzaType.FLATBREAD, 8.50);
		Pizza pizza5 = new Veggie("Veggie", PizzaType.STUFFED_CRUST, 8.50);

		order.addPizza(pizza1);
		order.addPizza(pizza2);
		order.addPizza(pizza3);
		order.addPizza(pizza4);
		order.addPizza(pizza5);

		assertEquals(true, order.orderMeetsOffer());
	}

	/**
	 * Creating a Order object with a valid order number. Add three pizzas of
	 * different type to the same order. No discount is applied to the overall cost.
	 * Test that the orderMeetsOffer() method returns false.
	 * 
	 */
	@Test
	public void testOrderDoesNotMeetOffer() {
		Order order = new Order(789);
		Pizza pizza1 = new FarmHouse("Farm House", PizzaType.STUFFED_CRUST, 12.95);
		Pizza pizza2 = new Pepperoni("Pepperoni", PizzaType.THIN_CRUST, 10.99);
		Pizza pizza3 = new Veggie("Veggie", PizzaType.STUFFED_CRUST, 8.50);

		order.addPizza(pizza1);
		order.addPizza(pizza2);
		order.addPizza(pizza3);

		assertEquals(false, order.orderMeetsOffer());
	}

}
