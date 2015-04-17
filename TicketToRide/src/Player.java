import java.util.Stack;

public class Player {
	
	final int STARTING_TRAINCARS=45;
	final int STARTING_CARD_HAND_SIZE=4;
	final int STARTING_TICKET_HAND_SIZE=3;
	
	public int trainCars;
	public Stack<ICard> cards;
	public Stack<ICard> tickets;
	
	//Sets trainCars
	public Player(){
		
	}

	//Draws the initial hand of 4 cards
	public void drawCardHand(Deck cardDeck) {
			
	}
	
	public void drawTicketHand(Deck TicketDeck){
		
	}
}
