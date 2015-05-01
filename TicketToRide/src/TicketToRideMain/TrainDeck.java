package TicketToRideMain;
import java.util.ArrayList;


public class TrainDeck extends Deck {
	
	ArrayList<ICard> deck;
	
	public TrainDeck() {
		this.deck = new ArrayList<ICard>();
		this.init();
		this.shuffle();
	}
	
	private void init() {
		//initialize all of the train cards and put them in the deck
	}

}
