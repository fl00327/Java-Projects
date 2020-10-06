package org.com1027.tutorial4;
public class House {
private int[] houses = null;
private final static int NUMBER_OF_HOUSES = 4;
public House() {
	super();
	this.houses = new int[NUMBER_OF_HOUSES];
}
public int getHouse(int house) {
	if(house > NUMBER_OF_HOUSES) {
		return 0;
	}else {
		return houses[house];
	}
	}
	public void setHouse(int house, int numberInHouse) {
		if (house < NUMBER_OF_HOUSES) {
			this.houses[house] = numberInHouse;
		}
	}

}
