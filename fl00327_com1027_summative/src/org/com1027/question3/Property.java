/**
 * 
 */
package org.com1027.question3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

/**
 * @author faseehlodhi
 *
 */

public abstract class Property {
private int houseNumber = 0;
private String street = null;
private String city = null;
private String postCode = null;
private int numberOfRooms = 0; 
protected Map<Room,ITenant> rooms = null;
protected double councilTax = 0;


public Property(int houseNumber,String street,String city, String postCode, int numberOfRooms)throws IllegalArgumentException{
	super();
	this.houseNumber = houseNumber;
	this.street = street;
	if(!this.validateCity(city)) {
		throw new IllegalArgumentException("Invalid City Format");
	}else {
	this.city = city;
	}
	if(!this.validatePostCode(postCode)) {
		throw new IllegalArgumentException("Invalid PostCode");
	}else {
	this.postCode = postCode;
	}
	this.numberOfRooms = numberOfRooms;
	this.rooms = new HashMap<Room,ITenant>();
}
public abstract String displayOccupiedProperty();
public abstract boolean isAvailable();
public abstract void occupyRoom(Room room,ITenant tenant);

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
	return this.houseNumber+" "+ this.street+", "+this.city+" "+this.postCode+" ("+this.numberOfRooms+" bedroom";
}
public void setCouncilTax(double councilTax) {
	int sizeofproffesionals = 0;
	for(ITenant c: rooms.values()) {
		if(c.getType() == TenantType.PROFESSIONAL) {
			sizeofproffesionals++;
		}
	}
	if(sizeofproffesionals == 0) {
		this.councilTax = 0;
	}
	else if(sizeofproffesionals == 1 && this.rooms.size() == 1) {
		this.councilTax = (councilTax-(councilTax*0.25));
	}
	else if(sizeofproffesionals == 1 && this.rooms.size() > 1) {
		this.councilTax = (councilTax-(councilTax*0.25));
	}
	else if(sizeofproffesionals == this.rooms.size()) {
		this.councilTax = councilTax;
	}else {
		this.councilTax =councilTax;
	}
}
}





