package org.com1027.question2;


public class Flat extends Property {
private int floor = 0;
 public Flat(int houseNumber,String street,String city,String postCode,int numberOfRooms,int floor) {
	 super(houseNumber,street,city,postCode,numberOfRooms);
	 this.floor = floor;
 }
@Override
public String displayOccupiedProperty() {	
double sum = 0;
double pricee = 0;
double sumall = 0;
if(this.getAvailableRooms() == 0) {
for(Room i: this.rooms.keySet()) {
pricee = i.getPrice();
sum += i.getPrice();
}
}
sumall = ((sum*12) + 500);
return super.toString()+" flat on "+floor+" floor:0 available)"+"\\n" + "Room:"+ "\t" + pricee + "\n" + "Total:" + "\t" +"£"+ sumall;
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
public void occupyRoom(Room room, ITenant tenant)throws IllegalArgumentException {
	if(!this.rooms.containsKey(room)) {
		throw new IllegalArgumentException("Enter A Key of the room");
	}
	if(!this.rooms.containsValue(tenant)) {
		throw new IllegalArgumentException("Enter a value of the room");
	}
this.rooms.put(room, tenant);
}
@Override
public String toString() {
	super.toString();
	return "flat on "+floor+" floor:"+super.getAvailableRooms()+" available)";
}
}
