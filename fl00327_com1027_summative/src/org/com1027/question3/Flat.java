package org.com1027.question3;

import org.com1027.question3.Room;

public class Flat extends Property {
private int floor = 0;
 public Flat(int houseNumber,String street,String city,String postCode,int numberOfRooms,int floor) {
	 super(houseNumber,street,city,postCode,numberOfRooms);
	 this.floor = floor;
 }
@Override
public String displayOccupiedProperty() {	
	StringBuffer flatbuffer = new StringBuffer();
	flatbuffer.append(this.toString()+"\n");
	double sum = 0;
	for(Room i: this.rooms.keySet()) {
	flatbuffer.append("\tRoom: " + i.getPrice()+"\n");
	sum += i.getPrice();
	}
	flatbuffer.append("\tTotal: £");
	flatbuffer.append(String.format("%.2f", ((sum*12)+500)));
	flatbuffer.append(" (Council Tax: £");
	flatbuffer.append(this.councilTax+")"+"\n");
	return flatbuffer.toString();
	}
@Override
public boolean isAvailable() { 
	boolean value = false;
	if(this.getAvailableRooms() > 0) {
		value = true;
	}
 return value;
}
@Override
public void occupyRoom(Room room, ITenant tenant){
	this.rooms.put(room,tenant);
}
@Override
public String toString() {
	return super.toString()+ " flat on "+floor+" floor :"+super.getAvailableRooms()+" available)";
}
}
