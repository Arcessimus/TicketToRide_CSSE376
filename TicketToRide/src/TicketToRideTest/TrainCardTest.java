package TicketToRideTest;
import static org.junit.Assert.*;
import TrainCard;

import org.junit.Test;

import TrainCard.CARD_TYPE;

public class TrainCardTest {

	@Test
	public void testConstructor() {
		for (TrainCard.CARD_TYPE type : TrainCard.CARD_TYPE.values()){
		TrainCard card = new TrainCard(type);
		assertNotNull(card);
		assertEquals(type,card.cardType);
		}
	}
	
	
}
