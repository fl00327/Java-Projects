package org.com1027.exam;

public class Pepperoni extends Pizza{
 private final String TOPPING = "Toppings(3): Pepperoni,Mozzarella,Tomato sauce";
	public Pepperoni(String name, PizzaType type,double price){
		super(name, type,price);
	}
	@Override
	public String getToppings() {
		return this.TOPPING;
	}

}
