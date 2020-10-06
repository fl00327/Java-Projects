package lab1_test;

import static org.junit.Assert.*;

import org.junit.Test;

import lab10_test_question1.Programme;

public class ProgrammeTest {

	@Test
	public void testgetCode() {
		Programme p1 = new Programme("COM1026","Programming");
		assertEquals("COM1026", p1.getCode());
		assertEquals("Programming",p1.getName());
	}
	@Test(expected = IllegalArgumentException.class)
	public void testIvalidCode() {
		Programme p1 = new Programme("COMM10288","Programme");
	}
	@Test(expected = IllegalArgumentException.class)
	public void testIvalidName() {
		Programme p1 = new Programme("COM1026","Programme%");
	}
}
