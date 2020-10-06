package org.com1027.formative2.fl00327;

public class RainfallYear {
private int year = 0;
private double[] rainfallMonths = null;
private static final int NUMBER_OF_MONTHS = 12;

public RainfallYear(int year) {
	super();
	this.year = year;
	this.rainfallMonths = new double[NUMBER_OF_MONTHS];
}
public int getYear() {
	return this.year;
}
public double getRainfallMonth(Month month) {
	return this.rainfallMonths[month.ordinal()];
}
public double calculateMeanRainfall() {
	double sum = 0;
	//for(int month =0 ;month<= 11;month++) {
		//sum += this.rainfallMonths[month];
		//}
	for (double rainfallMonth : this.rainfallMonths) {
		sum += rainfallMonth;
	}
	return sum / NUMBER_OF_MONTHS;
	}
}
