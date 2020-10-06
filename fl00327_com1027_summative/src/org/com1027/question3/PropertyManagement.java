/**
 * 
 */
package org.com1027.question3;

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
if(this.properties.size() > 0) {
	for(Property p: this.properties) {
		if(p.isAvailable()) 
		display += (p.toString()+ "\n");
	else if(!p.isAvailable()) {	
		display += (p.displayOccupiedProperty());
	}
	}
 }
	return display;
}

public void removeProperty(Property property) throws IllegalArgumentException{
	if(properties.contains(property)) {
	properties.remove(property);
} else {
	throw new IllegalArgumentException("This Property doesn't exist in the list");
}
}
public String getEstateAgency() {
	return this.estateAgency.toString();
}
public double percentageCouncilTaxExemption() {
int exempt = 0;
double percentageofexempt = 0;
	for(Property c : this.properties) {
		if(c.councilTax == 0 && !c.isAvailable()) {
			exempt++;
		}
	}
	percentageofexempt = ((exempt*100)/this.properties.size());
	return percentageofexempt;
}
public String displayAllCouncilTaxExemptProperties() {	
	String display = null;
	for(Property i: this.properties) {
		if(i.councilTax == 0 && !i.isAvailable()) {
			display = i.displayOccupiedProperty();
		}
	}	
	return display;
}
}

