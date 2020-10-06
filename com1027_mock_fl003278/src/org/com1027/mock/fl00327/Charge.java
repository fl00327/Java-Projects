package org.com1027.mock.fl00327;

public class Charge {
private Service service = null;
private double charge = 0;

public Charge(Service service, double charge) throws IllegalArgumentException{
	super();
	if(service == null) {
		throw new IllegalArgumentException("Write Something Sir");
	}else {
	this.service = service;
	}
	this.charge = charge;
	
}
public Service getService() {
	return this.service;
}
public double getCharge() {
	return this.charge;
}
public double calculateVAT() {
double total = 0;
total = ((this.charge*17.5)/100);
return total;
	}
}
