package org.com1027.exam;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ StudentTest.class, OrderHistoryTest.class, OrderTest.class,PizzaTest.class })
public class AllTests {

}
