package org.com1027.exam;

public class Student {
private String forename = null;
private String surname = null;
	
public Student(String forename, String surname)throws IllegalArgumentException {
		super();
		if(forename.matches("[A-Z][a-z]+")) {
		this.forename = forename;
		}else {
			throw new IllegalArgumentException("Name Should Start with capital Letter");
		}
		if(surname.matches("[A-Z][a-z]+")) {
			this.surname = surname;
		}else {
		throw new IllegalArgumentException("Surname should start with capital letter");
	}
}

public String getForename() {
	return this.forename;
}

public String getSurname() {
	return this.surname;
}
}
