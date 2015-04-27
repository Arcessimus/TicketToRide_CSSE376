package TicketToRideTest;
import static org.junit.Assert.*;
import Deck;
import TrainCard;

import org.junit.Test;

import TrainCard.CARD_TYPE;

public class DeckTest {	
	
	@Test
	public void testInit() {
		Deck main = new Deck();
		assertNotNull(main);
		
		assertEquals(main.getSize(), 5);
	}

	@Test
	public void testShuffle() {
		Deck test = new Deck();
		test.shuffle();
		
		boolean inOrder = true;
		
		for(int i = 0; i < test.getSize(); i++) {
			if(test.getCard(i).getID() > test.getCard(i+1).getID()) {
				inOrder = false;
				break;
			}
		}
		
		assertFalse(inOrder);
	}
	
	@Test
	public void testShuffleReverse() {
		Deck test = new Deck();
		test.shuffle();
		
		boolean inOrder = true;
		
		for(int i = 0; i < test.getSize(); i++) {
			if(test.getCard(i).getID() < test.getCard(i+1).getID()) {
				inOrder = false;
				break;
			}
		}
		
		assertFalse(inOrder);
	}
	
	@Test
	public void testThatDrawRemovesOneCard() {
		Deck test = new Deck();
		int cursize = test.getSize();
		int expsize = cursize - 1;
		
		test.draw();
		
		cursize = test.getSize();
		assertEquals(expsize, cursize);

	}
	@Test
	public void testMakeTrainDeck(){
		final int CARD_COUNT=12;
		final int WILD_CARD_COUNT=14;
		
		Deck deck = new Deck();
		assertEquals(110,deck.getSize());
		int i=0;
		for (TrainCard.CARD_TYPE type : TrainCard.CARD_TYPE.values()){
			int cards;
			if(type==TrainCard.CARD_TYPE.WILD){
				cards=WILD_CARD_COUNT;
			}else{
				cards=CARD_COUNT;
			}
			for(;i<cards;i++){
				assertEquals(type,((TrainCard)deck.getCard(i)).cardType);
			}
		}
	}
}
