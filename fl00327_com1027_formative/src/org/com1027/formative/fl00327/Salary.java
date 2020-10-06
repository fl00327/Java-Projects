/**
 * 
 */
package org.com1027.formative.fl00327;

/**
 * @author faseehlodhi
 *
 */

public class Salary {
	//Creating my field for Salary class and initializing 
	private double salary = 0;
	// My default Constructor
	public Salary() {
		super();
		this.salary = salary;
	}
// My Get method that is basically getting the salary by using this.getSalary() as it is in the same class 
	public double getSalary() {
		return salary;
	}
// My Method using set method and setting or changing my original Salary
	public void setSalary(double salary){
     this.salary = salary;
	}
	public double calculateTax() {
		//declaring personalAllowance variable 
		int personalAllowance = 9440;
  
		//Defining taxableSalary and the type has to be double as this.getSalary() is a double method
		double taxableSalary = this.getSalary()-personalAllowance;
		/*Using If statements to calculateTax for people that only have to give 20 percent tax and the people 
		*that have to give both 20 percent tax on a salary of 32010 and 40 percent tax on the rest of salary 
		*excluding 32010
		*/
		if(taxableSalary <= 32010) {
			return(taxableSalary*0.20);
		}else {
			return ((taxableSalary-32010)*0.40)+(32010*0.20);
		}
		
	}
	
		
}

	
 
	  
 
  

