package org.com1027.exam;

public class FarmHouse extends Pizza{
private final String TOPPING = "Toppings(4): Bell Peppers,Cheese,Ham,Tomatoes";
	public FarmHouse(String name,PizzaType type, double price) {
		super(name, type,price);
		
	}
	@Override
	public String getToppings() {
	return this.TOPPING;
	}
	

}
