package TicketToRideMain;
import java.util.ArrayList;


public class TrainDeck extends Deck {

	ArrayList<TrainCard> deck;
	
	public TrainDeck() {
		this.deck = new ArrayList<TrainCard>();
		this.init();
		//this.shuffle();
	}
	
	private void init() {
		//initialize all of the train cards and put them in the deck
		final int CARD_COUNT=12;
		final int WILD_CARD_COUNT=14;
		
		for (TrainCard.CARD_TYPE type : TrainCard.CARD_TYPE.values()){
			int cards;
			if(type==TrainCard.CARD_TYPE.WILD){
				cards=WILD_CARD_COUNT;
			}else{
				cards=CARD_COUNT;
			}
			for(int i=0;i<cards;i++){
				deck.add(new TrainCard(type));
			}
		}
	}
	
}
