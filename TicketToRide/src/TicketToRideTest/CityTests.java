package TicketToRideTest;

import static org.junit.Assert.*;

import org.junit.Test;

import TicketToRideMain.City;
import TicketToRideMain.Deck;

public class CityTests {

	@Test
	public void testInit() {
		City NewYork = new City("New York City");
		assertNotNull(NewYork);
	}

}
