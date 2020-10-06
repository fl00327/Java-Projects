package org.com1027.question2;


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
     housebuffer.append("Room: "+ i.getPrice()+"\n");
     total += i.getPrice();
	 }
	 housebuffer.append("Total: £");
	 housebuffer.append(total*12);
     return  housebuffer.toString();
	}

	@Override
	public boolean isAvailable() {
		boolean value = false;
		if(super.getAvailableRooms() > 0) {
			value = true;
		}
	 return value;
	}
	@Override
	public void occupyRoom(Room room, ITenant tenant) {
		super.rooms.put(room, tenant);
	}
@Override
public String toString(){
return super.toString()+" house :"+super.getAvailableRooms()+" available)";
	}

}