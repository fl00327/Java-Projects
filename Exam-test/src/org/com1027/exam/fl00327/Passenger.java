package org.com1027.exam.fl00327;

public class Passenger {
private String name = null;
private String surname = null;
public Passenger(String name, String surname)throws NullPointerException {
	super();
	if(name == null) {
		throw new NullPointerException("Write your name");
	}else {
	this.name = name;
	}
	this.surname = surname;
}
public String getName() {
	return this.name;
}
public String getSurname() {
	return this.surname;
}
@Override
public String toString() {
	return this.name+" "+this.surname;
}
}
