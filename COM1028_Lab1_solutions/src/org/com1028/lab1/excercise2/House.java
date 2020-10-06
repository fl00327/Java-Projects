package org.com1028.lab1.excercise2;

import java.util.ArrayList;
import java.util.List;


public class House {
	
	private List<Floor> floors;
	private boolean hasLounge = false;
	private int numOfFloors;
	private final int maxNumOfFloors = 2; //limit the number of floors in a house

	public House(int numOfFloors) {
		if (numOfFloors < 1 || numOfFloors > this.maxNumOfFloors) {
			throw new IllegalArgumentException(
					"Error: Invalid number of floors!");
		}
		this.floors = new ArrayList<Floor>();
		this.numOfFloors = numOfFloors;
	}

	/**
	 * simple method to floor to a house
	 * 
	 * @param room
	 */
	public void addFloor(Room r1, Room r2) {
		if (r1 instanceof Lounge && r2 instanceof Lounge) {
			throw new IllegalArgumentException(
					"Error: We can only have 1 Lounge");
		}
		if (this.floors.size() == this.numOfFloors) {
			throw new IllegalArgumentException(
					"Error: A house can have at most " + this.numOfFloors
							+ " floor(s)");
		}
		if (r1 instanceof Lounge || r2 instanceof Lounge) {
			if (this.hasLounge){
			throw new IllegalArgumentException(
					"Error: We can only have 1 Lounge");
			}else{
				this.hasLounge=true;
			}
		}
		this.floors.add(new Floor(r1, r2));
	}

	public int howManyRooms() {
		int total = 0;
		for (Floor f : this.floors) {
			total += f.howManyRooms();
		}
		return total;
	}

	/**
	 * adds a room to the appropriate floor Note 0 is ground level and 1 is
	 * upstairs
	 * 
	 * @param r is the room to be added
	 * @param level
	 */
	public void addRoom(Room r, int level) {
		/* Check that the level is correct */
		if (level >= this.floors.size()) {
			throw new ArrayIndexOutOfBoundsException("Error: No such floor");
		}
		if (this.hasLounge && (r instanceof Lounge)) {
			throw new IllegalArgumentException(
					"Error: We can only have 1 Lounge");
		}
		if (r instanceof Lounge) {
			this.hasLounge = true;
		}
		this.floors.get(level).addRoom(r);
	}

	/**
	 * work out the total area of the rooms in the house
	 * 
	 * @return
	 */
	public double getTotalArea() {
		double total = 0.0;
		for (Floor f : this.floors) {
			total += f.getTotalArea();
		}
		return total;
	}

	/**
	 * work out the number of smoke alarms in the house
	 * 
	 * @return number of smoke alarms
	 */
	public int getNumberOfSmokeAlarms() {
		int total = 0;
		for (Floor f : this.floors) {
			total += f.getNumOfSmokeAlarms();
		}
		return total;
	}
}
