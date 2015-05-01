package TicketToRideMain;
import java.util.ArrayList;


public class FaceUpTrainDeck extends Deck {
	
	Deck referenceDeck;
	ArrayList<ICard> faceDeck;
	
	public FaceUpTrainDeck(Deck mainDeck) {
		this.referenceDeck = mainDeck;
		this.faceDeck = new ArrayList<ICard>();
	}
	
	private void init() {
		for(int i = 0; i < 5; i++) {
			this.faceDeck.add(this.referenceDeck.draw());
		}
	}
	
	public ICard draw(int index) {
		ICard drawn = this.faceDeck.remove(index);
		this.faceDeck.add(this.referenceDeck.draw());
		return drawn;
	}
	

}
