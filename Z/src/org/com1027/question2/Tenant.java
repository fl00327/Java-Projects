/**
 * 
 */
package org.com1027.question2;

/**
 * @author faseehlodhi
 *
 */
// Creating my fields and Initializing them 
public class Tenant implements ITenant {
private String name = null;
private String surname = null;
private int age = 0;
private TenantType type = null;

//Creating my parameterized constructor and calling exception if somebody enters wrong value so the program does
//not crashes\
public Tenant(String name, String surname, int age,TenantType type)throws NullPointerException,IllegalArgumentException{
	super();
	if(name == null) {
	 throw new NullPointerException("Enter Your Name");
	}
	this.name = name;
	if(surname == null) {
		throw new NullPointerException("Enter Your Surname");
	}
	this.surname = surname;
	if(age <= 0) {
		throw new IllegalArgumentException("Age Must Be Greater than Zero");
	}
	this.age = age;
	this.type = type;
}
public int getAge() {
	return this.age;
}
@Override
public TenantType getType() {
	switch(type){
	case PROFESSIONAL:
		type = TenantType.PROFESSIONAL;
		break;
	case STUDENT:
		type = TenantType.STUDENT;
		break;
	}
	return type;	
}
@Override
public String toString() {
	return name +" "+surname;
}
 
}
