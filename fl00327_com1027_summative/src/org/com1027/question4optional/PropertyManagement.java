/**
 * 
 */
package org.com1027.question4optional;

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
/* I am creating six variable to calculate each age category, I created getAge in ITenant interface and
 as we already have the implementation in Tenant and then we can create a for each loop of Property class
 and then we can call from the property object we created the getAge of Tenant class by making for-each loop of the
 type of ITenant as it is the value in the HashMap so then I validate each set of age groups and then append it in theStringBuufer
 and the return age.toString which will return all of the Info Graphics*/
public String displayAgeInfoGraphics() {
StringBuffer age = new StringBuffer();
int age1 = 0;
int age2 = 0;
int age3 = 0;
int age4 = 0;
int age5 = 0;
int age6 = 0;
for(Property i: this.properties) {
	for(ITenant k : i.rooms.values()) {
	   if(k.getAge() >= 0 && k.getAge() <= 16) {
		   age1++;
	   }
	   else if(k.getAge() > 16 && k.getAge() < 26) {
		   age2++;
	   }
	   else if(k.getAge() > 25 && k.getAge() < 36) {
		   age3++;
	   }
	   else if(k.getAge() > 35 && k.getAge() < 50) {
		   age4++;
	   }
	   else if(k.getAge() > 49 && k.getAge() <= 60) {
		   age5++;
	   }
	   else if(k.getAge() > 60) {
		   age6++;
	   }
	}
}
age.append("[0-16] = "+age1+"\n");
age.append("[17-25] = "+age2+"\n");
age.append("[26-35] = "+age3+"\n");
age.append("[36-49] = "+age4+"\n");
age.append("[50-60] = "+age5+"\n");
age.append("[60+] = "+age6);
return age.toString();
}
}
