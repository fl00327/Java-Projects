package org.com1027.exam;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrder {
	private int orderNumber = 0;
	private List<Pizza> pizzas = null;
	
	public Order(int orderNumber) {
		this.orderNumber = orderNumber;
		this.pizzas = new ArrayList<Pizza>();
	}

	@Override
	public void addPizza(Pizza pizza) throws NullPointerException{
		if(pizza == null) {
			throw new NullPointerException("Enter Something");
		}else {
		this.pizzas.add(pizza);
		}
	}

	@Override
	public double calculateTotalCostOfOrder() {
		double total = 0;
		for(Pizza p : this.pizzas) {
			total += p.getPrice();
		}
		if(this.pizzas.size() >= 5) {
			total = (total* 0.75);
		}
		return total;
	}

	@Override
	public double getMoneySaved() {
		double price = 0;
		if(this.pizzas.size() >= 5) {
		for(Pizza p : this.pizzas) {
			price += p.getPrice();
		}
		price = price*0.25;
	}
		return price;
	}

	@Override
	public int getOrderNumber() {
		return this.orderNumber;

	}

	@Override
	public int howManyPizzasInOrder() {
	return this.pizzas.size();
	}

	@Override
	public boolean orderMeetsOffer() {
	 boolean value = false;
	 if(this.pizzas.size() >= 5) {
		 value = true;
	 }
	 return value;
	}

	@Override
	public void printOrder() {
	StringBuffer buffer = new StringBuffer("Order Number: "+this.orderNumber+" \n");
	for(Pizza i : this.pizzas) {
		buffer.append(i.getName()+","+i.getType()+"($"+i.getPrice()+") \n");
		if(i instanceof FarmHouse) {
			buffer.append(i.getToppings()+'\n');
		}else if(i instanceof Pepperoni) {
			buffer.append(i.getToppings()+"\n");
		}else {
			buffer.append(i.getToppings()+"\n");
		}
		
	}
		buffer.toString();
	}

}
