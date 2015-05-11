package TicketToRideMain;

import java.util.ArrayList;

public class TicketDeck extends Deck{

	public TicketDeck() {
		this.deck = new ArrayList<ICard>();
		this.init();
		//this.shuffle();
	}
	
	protected void init() {
		
	}
}
