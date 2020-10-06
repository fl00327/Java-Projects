package org.com1027.exam;

public class Veggie extends Pizza{
 private final String TOPPING = "Toppings(4): Spinach,Feta,Onions,Mushrooms";
	public Veggie(String name, PizzaType type,double price) {
		super(name, type,price);
	}
	@Override
	public String getToppings() {
		return this.TOPPING;
	}

}
