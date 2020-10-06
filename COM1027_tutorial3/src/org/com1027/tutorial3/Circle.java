package org.com1027.tutorial3;

public class Circle {
private double radius = 0;

public double getRadius() {
	return radius;
}

public Circle(double radius) {
	super();
	this.radius = radius;
}
public double calculateCircumference() {
	return 2*Math.PI*this.radius;
	
}
public double calculateArea() {
	return Math.PI*this.radius*this.radius;
}
public double subtractFromSquareArea(double legnth) {
	double squareArea = legnth*legnth;
	return squareArea - this.calculateArea();
	
	
	
}
}
