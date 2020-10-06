package org.com1027.mock.fl00327;

import static org.junit.Assert.*;

import org.junit.Test;

public class GuestTest {

	@Test
	public void test() {
		Service service = new Service("ROOM1024","Faseeh",VATRate.LOW,10.92);
		Guest guest = new Guest("Faseeh","Lodhi","45, University Court, Guildford,GU2 7JN","07383-033853");
		guest.addCharge(service, 19);
		guest.calculateVATChargeAtRate(VATRate.LOW);
	}

}
