package org.com1027.lab2;

public class ClockDisplayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClockDisplay clock = new ClockDisplay();
		for (int i = 0; i < 100; i++) {
			// The next two lines of code will be executed 100 times. 
			clock.timeTock();
			System.out.println(clock.toString());
		}
      
	}

}
