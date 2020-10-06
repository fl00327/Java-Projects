package org.com1027.mock.fl00327;

import java.util.ArrayList;
import java.util.List;



public class Hotel {
private String name = null;
private Rating rating = null;
private List<IGuest> guests = null;

public Hotel(String name, Rating rating) {
	super();
	this.name = name;
	this.rating = rating;
	this.guests = new ArrayList<IGuest>();
}

public String getName() {
	return this.name;
}

public Rating getRating() {
	return this.rating;
}
public List<IGuest> getGuests() {
    return this.guests;
  }
public void addGuest(IGuest guest) throws NullPointerException{
	if(guest == null) {
		throw new NullPointerException("Bro Add a valid thing");
	}else {
	this.guests.add(guest);
	}
}
public void printGuestList() {
	for(IGuest a : this.guests) {
		System.out.println(a.toString());
	}
}

}
