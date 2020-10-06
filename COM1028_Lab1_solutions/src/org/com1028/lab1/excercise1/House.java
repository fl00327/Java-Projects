package org.com1028.lab1.excercise1;

import java.util.ArrayList;
import java.util.List;

public class House {
	
	private List<Room> rooms = null;
	private boolean hasLounge = false;

	public House() {
		super();
		this.rooms = new ArrayList<Room>();
	}

	/**
	 * Simple method to add a room to a house
	 * @param room
	 */
	public void addRoom(Room room) {
		if (room.isLounge()){
			if (this.hasLounge){
				throw new IllegalArgumentException("Error: We already have a lounge!");
			}else{
				this.hasLounge=true;
			}
		}
		this.rooms.add(room);
	}
	
	public int howManyRooms(){
		return this.rooms.size();
	}
	
    /**
     * Method that calculates the total area of all the rooms in the house
     * @return the total area of the house
     */
	public double getTotalArea(){
		double total = 0.0; 
		
		for (Room room: this.rooms){
			total += room.getArea();
		}
		
		return total;
	}
}
