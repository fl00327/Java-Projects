/**
 * 
 */
package org.com1027.question2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

/**
 * @author faseehlodhi
 *
 */
// Creating my fields and initializing them
public abstract class Property {
private int houseNumber = 0;
private String street = null;
private String city = null;
private String postCode = null;
private int numberOfRooms = 0; 
protected Map<Room,ITenant> rooms = new HashMap<Room,ITenant>();
private static final String REGEX = "[A-Z]{2}[0-9]+[//s]][0-9][A-Z]{2}";
private static final String CITY_FORMAT = "[A-Z][a-z]+[//s][A-Z]*[a-z]*";



public Property(int houseNumber,String street,String city, String postCode, int numberOfRooms)throws IllegalArgumentException,NullPointerException {
	super();
	this.houseNumber = houseNumber;
	this.street = street;
	this.city = city;
	this.postCode = postCode;
	this.numberOfRooms = numberOfRooms;
}
public abstract String displayOccupiedProperty();
public abstract boolean isAvailable();
public abstract void occupyRoom(Room room,ITenant tenant);

public int getAvailableRooms() {
return this.numberOfRooms-this.rooms.size();
}
public double getPrice() {
  double MonthlySum = 0;
for(Room i : rooms.keySet()) {
	MonthlySum += i.getPrice();
}
return MonthlySum;
}
private boolean validateCity(String city) {
	boolean value = false;
if(city.matches(CITY_FORMAT)) {
	value = true;
}
return value;
}
private boolean validatePostCode(String postCode) {
	boolean value = false;
	if(postCode.matches(REGEX)) {
		value = true;
	}
	return value;
}
@Override
public String toString() {
	return houseNumber+" "+ street+", "+city+" "+postCode+" ("+numberOfRooms+" bedroom";
}
}





