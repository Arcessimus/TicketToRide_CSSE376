package TicketToRideTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import TicketToRideMain.TicketCard;

public class TicketCardTest {

	@Test
	public void testConstructor() {
		
		String testDestination="Illinois To Georgia";
		int testPoints=700;
		
		TicketCard card = new TicketCard(testDestination, testPoints);
		assertNotNull(card);
		assertEquals(testDestination,card.label);
		assertEquals(testPoints,card.pointValue);
	}
}
