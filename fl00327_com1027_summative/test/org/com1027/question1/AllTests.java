package org.com1027.question1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AgencyTest.class, HouseTest.class, PropertyManagementTest.class, RoomTest.class,TenantTest.class })
public class AllTests {

}
