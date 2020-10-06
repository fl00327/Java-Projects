package org.com1027.exam.fl00327;

public class Seat {

private Passenger passenger = null;
private SeatType type = null;
private int number = 0;

public Seat(Passenger passenger,int number,SeatType type) {
	super();
	this.passenger = passenger;
	this.type = type;
	this.number = number;
}

public Passenger getPassenger() {
	return this.passenger;
}

public SeatType getSeatType() {
	return this.type;
}

public int getSeatNumber() {
	return this.number;
}
@Override
public String toString() {
	StringBuffer buffer = new StringBuffer();
if(this.type == SeatType.ECONOMY) {
	buffer.append("E"+this.number+" - "+this.getPassenger().toString());
	}else {
		buffer.append("B"+this.number+" - "+this.getPassenger().toString());
	}
return buffer.toString();
}
}
