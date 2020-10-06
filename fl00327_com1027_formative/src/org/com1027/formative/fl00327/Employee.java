/**
 * 
 */
package org.com1027.formative.fl00327;

/**
 * @author faseehlodhi
 *
 */
public class Employee {
	// Creating my fields for Employee Class
     private int id = 0;
     private String forename = null;
     private String surname = null;
     // Calling Salary class fields in my Employee Class
     private Salary salary = null;
     // Calling CompanyPosition Class fields in my Employee Class
     private CompanyPosition companyPosition = null;
   //My Default Constructor 
   public Employee(int id, String forename, String surname, Salary salary, CompanyPosition companyPosition){
	   super();
	   this.id = id;
	   this.forename = forename;
	   this.surname = surname;
	   this.salary = salary;
	   this.companyPosition = companyPosition;
   }
 // Generating my getter and setters 
public int getId() {
	return id;
}

public String getForename() {
	return forename;
}

public String getSurname() {
	return surname;
}

public double getSalary() {
	return salary.getSalary();
}
/*Calling my getPositionName() from my CompanyPosition class and in my return statement
 *  I'm calling my object so thats why i use companyPosition.getPositionName() 
 */
public String getPositionName() {
	return companyPosition.getPositionName();
}
/* In this method I have to check that is a person eligible for bonus as I use if statements to return
 * true if salary is greater than or equal to 40,000 then return true else it has to return false that
 * a person is not eligible for bonus
 */
public boolean eligibleForBonus() {
	boolean  value = false;
	if(salary.getSalary() >= 40000) {
		value= true;
	}
return value;
}
//Creating my toString method 
@Override
public String toString() {
	if (getSalary() <= 0) {
		return "NOTHING";
	}
	return "$" + this.salary;
	String output = null;
	if (this.eligibleForBonus()) {
		output = "is eleigible for bonus.";
	}
	else {
		output = "is not eligible for bonus";
	}
	return output;
	// or you can either write it this way with string buffer 
	StringBuffer buffer = new StringBuffer();
	buffer.append(this.getForename());
	buffer.append(",");
	buffer.append(this.getForename());
	//now add if statement 
	if(this.eligibleForBonus()) {
		buffer.append("is");
	}else {
		buffer.append("is not");
	}
	buffer.append("eligible for bonus");
}
return buffer.toString();
}

	
}



   

