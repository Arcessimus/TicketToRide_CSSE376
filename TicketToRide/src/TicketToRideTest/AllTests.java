package TicketToRideTest;

import org.junit.runners.Suite;
import org.junit.runner.RunWith;

@RunWith(Suite.class)
@Suite.SuiteClasses({DeckTest.class, 
					GameTest.class, 
					PlayerTest.class, 
					TicketCardTest.class, 
					TicketDeckTest.class, 
					TrainCardTest.class, 
					TrainDeckTest.class, 
					RouteTests.class, 
					CityTests.class})
public class AllTests {
	public static void main (String args[]) {
        org.junit.runner.JUnitCore.main("TicketToRideTest.AllTests");
    }
}
