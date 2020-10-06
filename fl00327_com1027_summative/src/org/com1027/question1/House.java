/**
 * 
 */
package org.com1027.question1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;
import java.io.*;

/**
 * @author faseehlodhi
 *
 */

public class House {
private int houseNumber = 0;
private String street = null;
private String city = null;
private String postCode = null;
private int numberOfRooms = 0; 
private Map<Room,ITenant> rooms = null;


public House(int houseNumber,String street,String city, String postCode, int numberOfRooms)throws IllegalArgumentException {
	super();
	if(!this.validateCity(city)) {
		throw new IllegalArgumentException("Invalid City Format");
	}
	if(!this.validatePostCode(postCode)) {
		throw new IllegalArgumentException("Invalid PostCode");
	}
	this.houseNumber = houseNumber;
	this.street = street;
	this.city = city;
	this.postCode = postCode;
	this.numberOfRooms = numberOfRooms;
	
	this.rooms = new HashMap<Room,ITenant>();
}
public int getAvailableRooms() {
int availablerooms = 0;
if(rooms.isEmpty()) {
	availablerooms = this.numberOfRooms;
}else {
	availablerooms = this.numberOfRooms-this.rooms.size();
}
return availablerooms;
}

public double getPrice() {
  double monthlysum = 0;
for(Room i : rooms.keySet()) {
	monthlysum += i.getPrice();
}
return monthlysum;
}

public boolean isAvailable() {
	boolean available= false;
	if(this.getAvailableRooms() > 0) {
		available = true;
	}
	return available;
}
public void occupyRoom(Room room,ITenant tenant) {
	if(this.getAvailableRooms()> 0) {
		this.rooms.put(room, tenant);
	}
}
private boolean validateCity(String city) {
boolean value = false;
if(city.matches("[A-Z][a-z]+")) {
	value = true;
}
return value;
}
private boolean validatePostCode(String postCode) {
	boolean value = false;
	if(postCode.matches("[A-Z]{2}[0-9]+[\\s][0-9][A-Z]{2}")) {
		value = true;
	}
	return value;
}
@Override
public String toString() {
	return this.houseNumber+" "+ this.street+", "+this.city+" "+this.postCode+" ("+this.numberOfRooms+" bedroom house :"+this.getAvailableRooms()+" available)";
}
}





