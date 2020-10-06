/**
 * 
 */
package org.com1027.question1;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
/**
 * @author faseehlodhi
 *
 */
//Creating my field of type Agency and this will call all of the fields in the Agency Class and initializing it
//Creating a List of House and naming it properties
public class PropertyManagement {
private Agency estateAgency = null;
private List<House> properties = null;
//Creating a parameterized constructor 
public PropertyManagement(Agency estateAgency) {
	super();
	this.estateAgency = estateAgency;
	this.properties = new ArrayList<House>();
}

//Adding my property and in the  List
public void addProperty(House property) {
	this.properties.add(property);
}
/*Assigning my Property a Room and a tenant which will live in the Room*/
public void addTenant(House property, Room room,Tenant tenant) {
property.occupyRoom(room, tenant);
}
/*Displaying all of my properties and by making a loop and appending all of the properties toSrtring, by using the StringBuffer Class*/
public String displayProperties() {
	StringBuffer buffer = new StringBuffer();
	String item = "";
	for(House i: this.properties) {
	 buffer.append(i.toString()+"\n");
	}
  return item + buffer.toString();

}
/*Calling Agency Class toString*/
public String getEstateAgency() {
	return this.estateAgency.toString();
}
/* Removing my property from my List and throwing Illegal Argument Exception if the property does not exist in the 
List then then throw exception*/
public void removeProperty(House property) throws IllegalArgumentException{
	if(properties.contains(property)) {
	properties.remove(property);
}else {
	throw new IllegalArgumentException("This property doesn't exist in the list");
}
}
}
