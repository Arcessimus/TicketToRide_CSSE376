import java.util.ArrayList;


public class TrainDeck extends Deck {
	
	ArrayList<ICard> deck;
	
	public TrainDeck() {
		this.deck = new ArrayList<ICard>();
		this.init();
		this.shuffle();
	}
	
	private void init() {
		
	}

}
