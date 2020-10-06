package org.com1027.mock.fl00327;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServiceTest {

  @Test(expected = IllegalArgumentException.class)
	public void testInvalidCode() {
	  Service service = new Service("ROOMS10245","Faseeh",VATRate.STANDARD,12.90);
	}
  @Test(expected = IllegalArgumentException.class)
  public void NullObjectCreation() {
	  Service service = new Service("ROOM1024",null,null,12.90);
  }
  @Test(expected = IllegalArgumentException.class)
  public void InvalidStandardCharge() {
	  Service service = new Service("ROOM1024","Faseeh",VATRate.LOW,-3.46);
  }
  public void testService() {
	  Service service = new Service("ROOM1024","Faseeh",VATRate.LOW,10.92); 
	  assertEquals("Faseeh",service.getName());
	  assertEquals("ROOM1024",service.getCode());
	  assertEquals(10.92,service.getStandardCharge(),0);
	  assertEquals(VATRate.LOW,service.getRate());
  }

}
