package org.com1028.lab1.exercise2;

import java.util.List;

public class House {
private List<Floor> floors = null;
private boolean hasLounge = false;
private int numOfFloors = 0;
private int maxNumOfFloors = 0;

public House(int numOfFloors,int maxNumOfFloors) {
	super();
	this.numOfFloors = numOfFloors;
	this.maxNumOfFloors = maxNumOfFloors;
	this.floors = new ArrayList<Floor>();
}
}
