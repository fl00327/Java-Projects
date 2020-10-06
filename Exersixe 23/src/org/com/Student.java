package org.com;

public class Student {
	//creatig my fields
private static final int NUMBER_OF_STUDENTS = 8;
private String forename = null;
private String surname = null;
private double[] marks = null;
//creating my parameterized constructor
public Student(String forename, String surname) {
	this.forename = forename;
	this.surname = surname;
	this.marks = new double[NUMBER_OF_STUDENTS];
}
public String getForename() {
	return forename;
}
public String getSurname() {
	return surname;
}
public double getModuleMark(int module) {
	double mark = 0;
	if((module > 0) && (module< NUMBER_OF_STUDENTS) ) {
		mark = this.marks[module];
	}
		return mark;	
	
}
public void setModuleMark(int module, double mark) {
	if((module > 0) && (module< NUMBER_OF_STUDENTS) ) {
		if((mark >= 0) && (mark <= 100)) {
			this.marks[module] = mark;
			
		}
	}
}
public static void main(String[] args) {
	Student student = new Student("Joe", "Bloggs");

	// Add some marks to the student.
	student.setModuleMark(0, 10);
	student.setModuleMark(1, 80);

	// Display the marks.
	System.out.println(student.getForename() + " " + student.getSurname());
	System.out.println("Module 0: " + student.getModuleMark(0));
	System.out.println("Module 1: " + student.getModuleMark(1));
	System.out.println("Module 7: " + student.getModuleMark(7));
}
	
}
