/**
 * 
 */
package org.com1027.question2;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
/**
 * @author faseehlodhi
 *
 */
public class PropertyManagement {
private Agency estateAgency = null;
private List<Property> properties = null;
public PropertyManagement(Agency estateAgency) {
	super();
	this.estateAgency = estateAgency;
	this.properties = new ArrayList<Property>();
}
public void addProperty(Property property) {
	properties.add(property);
}
public void addTenant(Property property, Room room,Tenant tenant) {
property.occupyRoom(room, tenant);
}

public String displayProperties() {
String display = "";
for(Property p : this.properties) {
	if(p instanceof Flat) {
		if(p.getAvailableRooms() == 0) {
			display += (p.displayOccupiedProperty() + "\n");
		} else if(p.getAvailableRooms() > 0) {
			display += (p.toString() + "\n");
		}
	}else {
		if(p.getAvailableRooms() == 0) {
			display += (p.displayOccupiedProperty() +"\n");
		}else if(p.getAvailableRooms() > 0) {
			display += (p.toString() +"\n");
		}
	}
}
return display;
}
public void removeProperty(Property property) throws IllegalArgumentException{
	if(properties.contains(property)) {
	properties.remove(property);
	}else {
		throw new IllegalArgumentException("This property doesn't exist in the list");
	}
}
public String getEstateAgency() {
	return this.estateAgency.toString();
}
}
