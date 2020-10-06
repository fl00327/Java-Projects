package org.com1028.lab1.excercise2;

import java.util.ArrayList;
import java.util.List;

public class Floor {
	
	private List<Room> rooms;
	/** one smoke alarm per floor by default */
	private int numOfSmokeAlarms = 1;

	/** a floor needs to have at least 2 rooms */
	public Floor(Room r1, Room r2) {
		this.rooms = new ArrayList<Room>();
		rooms.add(r1);
		rooms.add(r2);
	}

	/**
	 * getter method for smoke alarms
	 * 
	 * @return number of smoke alarms
	 */
	public int getNumOfSmokeAlarms() {
		return this.numOfSmokeAlarms;
	}

	/**
	 * setter for smoke alarms - Note we need at least 1 on each floor
	 * 
	 * @param numOfSmokeAlarms
	 */
	public void setNumOfSmokeAlarms(int numOfSmokeAlarms) {
		if (numOfSmokeAlarms < 1) {
			throw new IllegalArgumentException(
					"Error: Must have at least 1 smoke alarm");
		}
		this.numOfSmokeAlarms = numOfSmokeAlarms;
	}

	/**
	 * simple method to add a room to a house
	 * 
	 * @param room
	 */
	public void addRoom(Room room) {
		this.rooms.add(room);
	}

	/**
	 * returns the number of rooms on the floor
	 * 
	 * @return
	 */
	public int howManyRooms() {
		return this.rooms.size();
	}

	/**
	 * Complete a foreach loop to work out the total area of the rooms on the
	 * floor
	 * 
	 * @return
	 */
	public double getTotalArea() {
		double total = 0.0;
		for (Room r : this.rooms) {
			total += r.getArea();
		}
		return total;
	}
}
