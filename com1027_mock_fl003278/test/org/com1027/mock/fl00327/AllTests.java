/**
 * AllTests.java
 */

package org.com1027.mock.fl00327;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This class defines the JUnit4 test suite for the hotel charge system.
 * 
 * @author Matthew Casey/Helen Treharne
 */
@RunWith(Suite.class)
@Suite.SuiteClasses( { ChargeTest.class, GuestTest.class, HotelTest.class, RatingTest.class, ServiceTest.class })
public class AllTests {
}
