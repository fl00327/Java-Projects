/**
 * 
 */
package org.com1027.question2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author faseehlodhi
 *
 */
public class PropertyManagement {
private Agency estateAgency = null;
private List<Property> properties = new ArrayList<Property>();
public PropertyManagement(Agency estateAgency) {
	super();
	this.estateAgency = estateAgency;
}
public void addProperty(Property property) {
	properties.add(property);
}
public void addTenant(Property property, Room room,Tenant tenant) {
for(Property i: properties) {
	i.occupyRoom(room, tenant);
}
}
public String displayProperties() {
	int Room = 0;
	String item = null;
	double Pric = 0;
	double Tot = 0;
	for(Property c: this.properties) {
	 for(Room k: c.rooms.keySet()) {
	 Pric = k.getPrice(); 
	 }
	 Tot = c.getPrice()*12; 
	 item = c.toString();
	 Room = c.getAvailableRooms();
	}
	return item+" house:0 available)"+ "\n" + "Room:" + "\t" + Pric 
			+ "\n" + "Total:" + "\t" + "£" +Tot + "\n"  + item +" flat on 1 floor :"+Room + " available)";
}

public void removeProperty(Property property) {
	properties.remove(property);
}
public Agency getEstateAgency() {
	return estateAgency;
}
}
