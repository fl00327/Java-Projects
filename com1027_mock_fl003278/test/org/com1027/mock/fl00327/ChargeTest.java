package org.com1027.mock.fl00327;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChargeTest {

   @Test(expected = IllegalArgumentException.class)
	public void test() {
	   Charge charge = new Charge(null,-9.0);
	}
   public void testCharge() {
	  Service service = new Service("ROOM1024","Faseeh",VATRate.LOW,10.92);
	  Charge charge = new Charge(service,45.0);
	  assertEquals(service,charge.getService());
	  assertEquals(45,charge.getCharge(),0);
	  assertEquals(7.875,charge.calculateVAT(),0);
   }

}
