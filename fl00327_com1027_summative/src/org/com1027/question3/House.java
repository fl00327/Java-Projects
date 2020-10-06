package org.com1027.question3;

import org.com1027.question3.Room;

public class House extends Property{
	
	public House(int houseNumber,String street,String city, String postCode, int numberOfRooms) {
		super(houseNumber,street,city,postCode,numberOfRooms);
	}
	
@Override
public String displayOccupiedProperty() {
	StringBuffer housebuffer = new StringBuffer();
	housebuffer.append(this.toString()+"\n");
	double total = 0;
	for(Room i: this.rooms.keySet()) {
	housebuffer.append("\tRoom: "+ i.getPrice()+"\n");
	total += i.getPrice();
	}
	housebuffer.append("\tTotal: £");
	housebuffer.append(String.format("%.2f", (total*12)));
	housebuffer.append(" (Council Tax: £");
	housebuffer.append(super.councilTax+")"+"\n");
	    return  housebuffer.toString();
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
public void occupyRoom(Room room, ITenant tenant) {
		this.rooms.put(room, tenant);
	}
@Override
public String toString(){

return super.toString()+" house :"+super.getAvailableRooms()+" available)";
	}

}