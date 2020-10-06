package org.com1027.exam.fl00327;

public class Company {
	
private String code = null;
private String name = null;

public Company(String code, String name)throws IllegalArgumentException {
	super();
	if(code.matches("[A-Z]{2}")) {
	this.code = code;
	}else {
		throw new IllegalArgumentException("Your Code does not match");
	}
	if(name.matches("[A-Z][a-z]+\\s*[A-Z]*[a-z]*")) {
	this.name = name;
	}else {
		throw new IllegalArgumentException("Your Airline name is not correct");
	}
}

public String getCode() {
	return this.code;
}

public String getName() {
	return this.name;
}


}
