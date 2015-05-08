package TicketToRideMain;
import java.util.ArrayList;
import java.util.Collections;


public class Deck {
	
	protected ArrayList<ICard> deck;
	
	public Deck() {
		this.deck = new ArrayList<ICard>();
		this.init();
	}

	protected void init() {
		ICard testcard1 = new TestCard(1);
		ICard testcard2 = new TestCard(2);
		ICard testcard3 = new TestCard(3);
		ICard testcard4 = new TestCard(4);
		ICard testcard5 = new TestCard(5);
		
		this.deck.add(testcard1);
		this.deck.add(testcard2);
		this.deck.add(testcard3);
		this.deck.add(testcard4);
		this.deck.add(testcard5);
	}

	public void shuffle() {
		Collections.shuffle(this.deck);
	}

	public int getSize() {
		return this.deck.size();
	}

	public ICard getCard(int i) {
		return this.deck.get(i);
	}

	public ICard draw() {
		return this.deck.remove(0);
	}
}
