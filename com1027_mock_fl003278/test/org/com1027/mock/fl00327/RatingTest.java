/**
 * RatingTest.java
 */

package org.com1027.mock.fl00327;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * JUnit 4 test case for the <code>Rating</code> class.
 * 
 * @author Matthew Casey/Helen Treharne
 */
public class RatingTest {

 
  /**
   * Creating a Rating object with an invalid number of stars, and a valid organisation.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidStars0() {
    Rating rating = new Rating("Presenting", 0);
  }

  /**
   * Creating a Rating object with an invalid number of stars, and a valid organisation.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidStars6() {
    Rating rating = new Rating("Prezzelling", -2);
  }
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidName() {
	  Rating rating = new Rating("Prezzelling A", 7);
  }
  /**
   * Creating a Rating object with a valid organisation and number of stars. Testing that the organisation and number of stars can
   * be retrieved correctly.
   */
  @Test
  public void testValid() {
    Rating rating = new Rating("Kilins", 5);

    assertEquals("Kilins", rating.getOrganisation());
    assertEquals(5, rating.getNumberOfStars());
  }
  
  /**
   * Your tests for Question 1(c) can go here 
   */
}
