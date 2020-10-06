package org.com1027.tutorial3;

import java.text.DecimalFormat;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] circleArray = new Circle[5];
 Circle c1 = new Circle(7);
 DecimalFormat format = new DecimalFormat("0.0");
 System.out.println(c1.subtractFromSquareArea(5));
 System.out.println(format.format(c1.subtractFromSquareArea(5)));
 System.out.println(c1.calculateCircumference());
 for (int i = 0; i <=4; i++) {
	 circleArray[i] = new Circle((i)*10);
	 System.out.println("Radius" + circleArray[i].getRadius());
 }
 
	}

}