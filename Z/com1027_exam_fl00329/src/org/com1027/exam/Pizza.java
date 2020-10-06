package org.com1027.exam;

public abstract class Pizza {
private String name = null;
private double price = 0;
private PizzaType type = null;

public Pizza(String name, PizzaType type,double price)throws IllegalArgumentException {
	super();
	if(name != null && type != null) {
	this.name = name;
	this.type = type;
}else {
	throw new IllegalArgumentException("Enter Something");
}
	if(price < 0) {
		throw new IllegalArgumentException("Price should be greater than zero");
	}else {
	this.price = price;
	}
}

public String getName() {
	return this.name;
}

public double getPrice() {
	return this.price;
}
public abstract String getToppings();
public PizzaType getType() {
	return this.type;
}
@Override
public String toString() {
StringBuffer buffer = new StringBuffer();
buffer.append(this.getName()+","+this.getType()+" ($"+this.getPrice()+") \n");
buffer.append(this.getToppings());
return buffer.toString();
}

}
