/**
 * 
 */
package org.com1027.question2;

/**
 * @author faseehlodhi
 *
 */

public class Agency {
private String name = null;
private String phoneNumber = null;

 public Agency(String name,String phoneNumber) throws IllegalArgumentException{
	 super();
	  if(!name.matches("[A-Z][a-z]+[\\s][A-Z][a-z]+")) {
		  throw new IllegalArgumentException("Your Agency Name is Not A Valid Name");
	    }else {
	  this.name = name;
	    }
	 if(!phoneNumber.matches("[0-9]{5}[\\s][0-9]{6}")) {
			 throw new IllegalArgumentException("Enter a United Kingdom phone No");
		 }else {
		 this.phoneNumber = phoneNumber;
	 }
}

public String getName() {
	return this.name;
}
public String getPhoneNumber() {
	return this.phoneNumber;
}
@Override
public String toString() {
	return "Agency: "+this.name+", "+"Phone Number: "+this.phoneNumber;
}

}
