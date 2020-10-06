package org.com1028.lab1.exercise1;

/**
 * This is a skeleton class which provides an implementation of a room
 * 
 * Notice that this class is just repeating the same code as the other classes which
 * implement Room, so consider changing Room to an abstract class. How would you reflect 
 * this on the class diagram?
 * 
 * @author css2ht
 *
 */

public class Bedroom extends Room {
	
	private double area = 0.0;
	
	public Bedroom(double area){
		this.area = area;
	}
	
	@Override
	public double getArea() {
		return this.area;
	}

}
