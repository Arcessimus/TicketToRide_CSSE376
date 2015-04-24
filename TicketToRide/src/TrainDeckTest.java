import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TrainDeckTest {

	@Test
	public void testMakeTrainDeck(){
		final int CARD_COUNT=12;
		final int WILD_CARD_COUNT=14;
		
		TrainDeck deck = new TrainDeck();
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
