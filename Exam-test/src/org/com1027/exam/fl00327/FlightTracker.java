package org.com1027.exam.fl00327;

import java.util.ArrayList;
import java.util.List;

public class FlightTracker {
private Company company = null;
private List<IFlight> flights = null;

public FlightTracker(Company company)throws IllegalArgumentException {
	if(company == null) {
	 throw new IllegalArgumentException("Your Company Object doesnot match");
	}else {
		this.company = company;
	}
	this.flights = new ArrayList<IFlight>();	
}
public void addFlight(IFlight flight) {
flights.add(flight);
}
public double calculateAveragePercentageCapacity() {
	double sum = 0;
	for(IFlight i : this.flights) {
		sum += i.calculatePercentageCapacity();
			}
	return sum / this.flights.size();
	}

public boolean findPassenger(Passenger passenger) {
	boolean value = false;
	for(IFlight i : this.flights) {
		if(i.getFlightPassengers().contains(passenger.toString())) {
			value = true;
		}
	}
	return value;
}
public Company getCompany() {
	return this.company;
}
public String getMostPopularFlights() {
	StringBuffer buffer = new StringBuffer();
	for(IFlight i : this.flights) {
		if(i.calculatePercentageCapacity() == 100) {
			buffer.append(i);
		}
	}
	return buffer.toString();
}
public int getNumberOfFullyBookedFlights() {
	int i = 0;
	for(IFlight c : this.flights) {
		if(c.calculatePercentageCapacity() == 100) {
	     i++;
		}
}
	return i;
}
}
