package org.com1027.question2;


public class House extends Property{
	
	public House(int houseNumber,String street,String city, String postCode, int numberOfRooms) {
		super(houseNumber,street,city,postCode,numberOfRooms);
	}
	
	@Override
public String displayOccupiedProperty() {
	double Total = 0;
	double price = 0;
	double Summ = 0;
	if(this.getAvailableRooms() == 0) {
	 for(Room i: this.rooms.keySet()) {
     price = i.getPrice();
     Total += i.getPrice();
     }
		}
	 Summ = Total*12;
     return  super.toString()+" house:0 available)"+"\n" + "Room:"+ "\t" + price + "\n" + "Total:" + "\t" +"£" + Summ;
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
super.toString();
return "house:"+super.getAvailableRooms()+" available)";
	}

}