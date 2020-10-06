package org.com1028.lab1.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.lang.Class;


public class House {
	
	private List<Room> rooms = null;
	private int hasLounge = 0;

	public House() {
		super();
		this.rooms = new ArrayList<Room>();
	}

	/**
	 * simple method to add a room to a house
	 * @param room
	 */
	public void addRoom(Room room) throws IllegalArgumentException{
	/*if(room instanceof Lounge) {
	    if(hasLounge == true) {
	    throw new IllegalArgumentException("Lounge already exists");
	    }else {
	    	this.rooms.add(room);
	    	hasLounge = true;
	    }
		}
		*/
		if(!room.getClass().equals(Lounge.class)) {
		this.rooms.add(room);
		}else if(hasLounge == 0) {
			hasLounge += 1;
			this.rooms.add(room);
			}else {
				System.out.println("You cannot add more lounges");
			}
	
	}
	
	public int howManyRooms(){
		return this.rooms.size();
	}
	
    /**
     * Complete a foreach loop to work out the total area of the rooms in the house
     * 
     * @return
     */
	
	public double getTotalArea(){
		double total = 0.0;
		for(Room i : this.rooms) {
			total += i.getArea();
		}
		
		return total;
	}
}
