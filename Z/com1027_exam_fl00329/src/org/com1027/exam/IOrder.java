package org.com1027.exam;

public interface IOrder {
public void addPizza(Pizza pizza);
public double calculateTotalCostOfOrder();
public double getMoneySaved();
public int getOrderNumber();
public int howManyPizzasInOrder();
public boolean orderMeetsOffer();
public void printOrder();
}
