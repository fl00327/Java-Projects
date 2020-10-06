package org.com1027.exam;

import java.util.ArrayList;
import java.util.List;

public class OrderHistory {
private Student student = null;
private List<IOrder> orders = null;

public OrderHistory(Student student)throws IllegalArgumentException {
	super();
	if(student == null) {
		throw new IllegalArgumentException("Enter Something");
	}else {
	this.student = student;
	}
	this.orders = new ArrayList<IOrder>();
}
public void addOrder(IOrder order) {
this.orders.add(order);
}
public double calculateTotalCostOfOrders() {
double total = 0;
for(IOrder i : this.orders) {
	total += i.calculateTotalCostOfOrder();
}
return total;
}
public int getNumberOfOrders() {
int calc = this.orders.size();
return calc;
}
public Student getStudentCustomer() {
	return this.student;
}
public int howManyOrdersGotDiscount() {
	int a = 0;
	for(IOrder i: this.orders) {
		if(i.howManyPizzasInOrder() >= 5) {
			a++;
		}
	}
	return a;
}
public double howMuchMoneySaved() {
	double saving = 0;
	for(IOrder i : this.orders) {
		saving += i.getMoneySaved();
	}
	return saving;
}
public String printOrderHistory() {
StringBuffer buffer = new StringBuffer("History: \n");
for(IOrder i : this.orders) {
	buffer.append("Number of orders: "+i.getOrderNumber()+"\n");
	buffer.append("Total money spent: $"+i.calculateTotalCostOfOrder()+"\n");
	buffer.append("Money Saved: $"+i.getMoneySaved()+"\n");
}
return buffer.toString();
}

}
