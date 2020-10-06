/**
 * 
 */
package org.com1027.question2;

/**
 * @author faseehlodhi
 *
 */
//Creating my fields and initializing them 
public class Agency {
private String name = null;
private String phoneNumber = null;
private final String PHONE_FORMAT = "[0-9]{5}[//s][0-9]{6}";
private final String NAME = "[A-Z][a-z]+[//s][A-Z]*[a-z]*";
//Creating my Parameterized Constructor 
 public Agency(String name,String phoneNumber) throws IllegalArgumentException{
	 super();
	  if(name.matches(NAME)) {
	    	this.name = name;
	    }else {
	    	throw new IllegalArgumentException("Enter your name");
	    }
		 if(phoneNumber.matches(PHONE_FORMAT)) {
			 this.phoneNumber = phoneNumber;
		 }else {
		 throw new IllegalArgumentException("Enter a United Kingdom phone No");
		 }
	 }
 //Calling my get Methods
public String getName() {
	return name;
}
public String getPhoneNumber() {
	return phoneNumber;
}
//Creating my toString method
@Override
public String toString() {
	return name="Agency: "+name+", "+"Phone Number: "+phoneNumber;
}

}
