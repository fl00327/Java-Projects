package org.com1028.lab1.excercise2;


/**
 * This is the Room interface
 * 
 * @author css2ht
 *
 */

public abstract class Room {
	private double area = 0.0;
	
	public Room(double area){
		this.area = area;
	}
	

	public double getArea() {
		return this.area;
	}
	
	public boolean isLounge(){
		return false;
	}
}
