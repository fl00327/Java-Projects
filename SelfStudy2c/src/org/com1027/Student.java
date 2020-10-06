package org.com1027;

public class Student {
private static final int NUMBER_OF_STUDENTS = 8;
private String forename = null;
private String surname = null;
private double[] marks = null;

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
	if((module >= 0) && (module< NUMBER_OF_STUDENTS) ) {
		if((mark >= 0) && (mark <= 100)) {
			this.marks[module] = mark;		
		}
	}
}
public double calculateAverageMark() {
	double Average = 0;
	double Sum = 0;
	for(int i = 0; i< NUMBER_OF_STUDENTS; i++) {
		Sum += this.marks[i];
	}
	Average = Sum/NUMBER_OF_STUDENTS;
	return Average;
}
public double calculateMinMark() {
double Min = 80.0;
for(int k = 0; k<NUMBER_OF_STUDENTS; k++) {
	if(this.marks[k]< Min) {
		Min = this.marks[k];
	}
}
return Min;
}
public double calculateMaxMark() {
	double Max = 0.0;
	for(int i = 0; i<NUMBER_OF_STUDENTS; i++) {
		if(this.marks[i] > Max) {
			Max = this.marks[i];
		}
	}
	return Max;
}
public static void main(String[] args) {
	Student s1 = new Student("Joe", "Bloggs");
	s1.setModuleMark(0,10);
	s1.setModuleMark(1,20);
	s1.setModuleMark(2,30);
	s1.setModuleMark(3,40);
	s1.setModuleMark(4,50);
	s1.setModuleMark(5,60);
	s1.setModuleMark(6,70);
	s1.setModuleMark(7,80);

	System.out.println(s1.getForename() + " "+ s1.getSurname() +": "+s1.calculateAverageMark()+", "+
			s1.calculateMinMark()+", " + s1.calculateMaxMark() );
	
	
	
}



}
	
	
	
	
	
	
	
	
	
	
	
	

