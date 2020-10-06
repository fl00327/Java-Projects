package org.com1027.exam;

import static org.junit.Assert.*;

import org.junit.Test;

public class PizzaTest {

	@Test
	public void test() {
	Pizza pizza = new FarmHouse("Farm House",PizzaType.FLATBREAD,12.9);
	assertEquals("Farm House",pizza.getName());
	assertEquals(PizzaType.FLATBREAD,pizza.getType());
	assertEquals(12.90,pizza.getPrice(),0);
	assertEquals("Farm House,FLATBREAD ($12.9) \nToppings(4): Bell Peppers,Cheese,Ham,Tomatoes",pizza.toString());
	}

}
