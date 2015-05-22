package TicketToRideTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import TicketToRideMain.Deck;
import TicketToRideMain.FaceUpTrainDeck;

public class FaceUpTrainDeckTest {

	@Test
	public void testConstructor() {
		Deck deck = new Deck();
		FaceUpTrainDeck faceUpDeck = new FaceUpTrainDeck(deck);
		
		assertNotNull(faceUpDeck);
		assertEquals(5,faceUpDeck.faceDeck.size());
		
		assertNotNull(faceUpDeck.draw());
		assertEquals(5,faceUpDeck.faceDeck.size());
	}
}
