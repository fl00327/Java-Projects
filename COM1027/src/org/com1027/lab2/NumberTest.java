/**
 * 
 */
package org.com1027.lab2;


public class NumberTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       NumberInfo number = new NumberInfo(3);
       System.out.println(number.getValue());
       
      
       number.increment();
       System.out.println(number.getValue());
       
       number.increment();
       System.out.println(number.getValue());
       
       number.increment();
       System.out.println(number.getValue());
	}
}


