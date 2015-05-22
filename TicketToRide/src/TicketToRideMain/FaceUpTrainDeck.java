package TicketToRideMain;
import java.util.ArrayList;


public class FaceUpTrainDeck extends Deck {
	
	Deck referenceDeck;
	public ArrayList<ICard> faceDeck=new ArrayList<ICard>();
	
	public FaceUpTrainDeck(Deck mainDeck) {
		init(mainDeck);
	}
	
	protected void init(Deck mainDeck) {
		this.referenceDeck = mainDeck;
		for(int i = 0; i < 5; i++) {
			this.faceDeck.add(referenceDeck.draw());
		}
	}
	
	public ICard draw(int index) {
		ICard drawn = this.faceDeck.remove(index);
		this.faceDeck.add(this.referenceDeck.draw());
		return drawn;
	}
	

}
