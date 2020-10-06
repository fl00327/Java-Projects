package org.com1028.lab1.exercise2;

public class Lounge extends Room {
private double area = 0;

public Lounge(double area) {
	super();
	this.area = area;
}

@Override
public double getArea() {
return this.area;
}

@Override
public boolean isLounge() {
return true;
}
}
