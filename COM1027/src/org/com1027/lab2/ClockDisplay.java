package org.com1027.lab2;

import java.text.DecimalFormat;

public class ClockDisplay {
    private NumberInfo hours;
    private NumberInfo minutes;
    public ClockDisplay() {
    	super();
    this.hours = new NumberInfo(24);
    this.minutes = new NumberInfo(60);
    }
    public void timeTock() {
    	minutes.increment();
    	if (minutes.getValue() == 0) {
    		hours.increment();
    	}
    }
	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("00");
		return (format.format(hours.getValue()) + ":" + format.format(minutes.getValue()));
		
	}
	
}
