package org.com1027.exam.fl00327;

import java.util.ArrayList;
import java.util.List;

public class Flight implements IFlight {

private String flightID = null;
private String origin = null;
private String destination = null;
private int numberOfBusiness = 0;
private int numberOfEconomy = 0;
private List<Seat> business = null;
private List<Seat> economy = null;

public Flight(String flightID, String origin, String destination, int numberOfBusiness, int numberOfEconomy)throws NullPointerException,IllegalArgumentException{
	super();
	if(flightID == null) {
		throw new NullPointerException("Write Something Please");
	}else {
	this.flightID = flightID;
	}
	this.origin = origin;
	this.destination = destination;
	if(numberOfBusiness < 0) {
		throw new IllegalArgumentException("Yo Boy Seats cant be in Negative");
	}else {
	this.numberOfBusiness = numberOfBusiness;
	}
	this.numberOfEconomy = numberOfEconomy;
	this.business = new ArrayList<Seat>();
	this.economy = new ArrayList<Seat>();
}

@Override
public void allocateSeat(Passenger passenger, SeatType type) throws IllegalArgumentException{
	if (passenger == null || type == null) {
		throw new IllegalArgumentException("Passenger and Seat type must be defined or No available seats");

	}
if(type == SeatType.BUSINESS && this.business.size() < this.numberOfBusiness) {
	this.business.add(new Seat(passenger,this.business.size()+1,SeatType.BUSINESS));
	}else if(type == SeatType.ECONOMY && this.economy.size() < this.numberOfEconomy) {
		this.economy.add(new Seat(passenger,this.economy.size()+1,SeatType.ECONOMY));
	}
}

@Override
public double calculatePercentageCapacity() {
	return (((this.business.size()+this.economy.size())*100)/(this.numberOfBusiness+this.numberOfEconomy));
}

@Override
public String findFreeSeat(SeatType type) {
	StringBuffer buffer = new StringBuffer();
	if(type != null) {
		if(type == SeatType.BUSINESS && this.business.size() < this.numberOfBusiness) {
			buffer.append("B"+(this.business.size()+1)+"- Available \n");
		}else if(type == SeatType.ECONOMY && this.economy.size() < this.numberOfEconomy) {
			buffer.append("E"+(this.economy.size()+1)+"- Available \n");
		}else {
			buffer.append("No seats of that type are free");
		}
	}
	return buffer.toString();
}

@Override
public String getFlightPassengers(){
	StringBuffer buffer = new StringBuffer("Business class Passengers:"+"\n");
	for(Seat b : this.business) {
		buffer.append("- "+b.getPassenger().toString()+"\n");
	}
	buffer.append("Economy class Passenegers:"+"\n");
	for(Seat e : this.economy) {
		buffer.append("- "+e.getPassenger().toString()+"\n");
	}
	return buffer.toString();
}

@Override
public String printFreeSeats() {
	StringBuffer buffer = new StringBuffer(this.toString()+"\n"+"Seats: \n");
	for(int i = this.business.size(); i<this.numberOfBusiness;i++) {
		buffer.append("B"+(i+1)+"- Available \n");
	}
	for(int c = this.economy.size();c<this.numberOfEconomy;c++) {
		buffer.append("E"+(c+1)+"- Available \n");
	}
	return buffer.toString();
}
@Override
public String toString() {
	StringBuffer a = new StringBuffer();
	a.append("Flight:"+this.flightID+"\n"+"From: "+this.origin+"\n"+"To: "+this.destination+"\n");
	return a.toString();
}


}
