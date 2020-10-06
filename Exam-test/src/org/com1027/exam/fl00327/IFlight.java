package org.com1027.exam.fl00327;

public interface IFlight {
public void allocateSeat(Passenger passenger,SeatType type);
public double calculatePercentageCapacity();
public String findFreeSeat(SeatType type);
public String getFlightPassengers();
public String printFreeSeats();
public String toString();
}
