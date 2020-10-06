package org.com1027.mock.fl00327;

import static org.junit.Assert.*;

import org.junit.Test;

public class HotelTest {
	
	public class DummyHotel implements IGuest{

	@Override
	public void addCharge(Service service, double charge) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double calculateTotalChargeWithoutVAT() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double calculateVATChargeAtRate(VATRate rate) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "";
	}
	}
	@Test
	public void testName() {
		Rating rating = new Rating("Killins",5);
		Hotel h1 = new Hotel("Faseeh",rating);
		assertEquals("Faseeh",h1.getName());
	}
	@Test
	public void testReating() {
		Rating rating = new Rating("Killins",5);
		Hotel h1 = new Hotel("Faseeh",rating);
		assertEquals(rating,h1.getRating());
		IGuest guest = new Guest("Faseeh","Ahmed","21 Jump Street","07383 033853");
		IGuest guest1 = new Guest("Kangroo","Ahmed","22 Jump Street","07393 033853");
		IGuest guest2 = new Guest("Khalil","Ahmed","23 Jump Street","07389 033853");
		h1.addGuest(guest);
		h1.addGuest(guest2);
		h1.addGuest(guest1);
		assertEquals(3,h1.getGuests().size());
	}
	
	
}
