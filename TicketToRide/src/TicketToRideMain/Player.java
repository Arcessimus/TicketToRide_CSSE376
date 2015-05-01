package TicketToRideMain;
import java.util.Stack;

public class Player {
	
	final int STARTING_TRAINCARS=45;
	final int STARTING_CARD_HAND_SIZE=4;
	final int STARTING_TICKET_HAND_SIZE=3;
	
	public int trainCars;
	public Stack<ICard> cards=new Stack<ICard>();
	public Stack<ICard> tickets=new Stack<ICard>();
	
	//Sets trainCars
	public Player(){
		trainCars=STARTING_TRAINCARS;
	}

	//Draws the initial hand of 4 cards
	public void drawCardHand(Deck cardDeck) {
		for(int i=0;i<STARTING_CARD_HAND_SIZE;i++){
			cards.add(cardDeck.draw());
		}
	}
	
	public void drawTicketHand(Deck ticketDeck){
		for(int i=0;i<STARTING_TICKET_HAND_SIZE;i++){
			cards.add(ticketDeck.draw());
		}
	}
	
	//drawing individual cards
	public void drawCard(Deck deck) {
		ICard newCard = deck.draw();
		
		//add card to correct hand depending on card type
	}
	
	//playing a card
	public void playCard(Stack<ICard> hand, int cardIndex) {
		//based on hand and card type, put train cars down, etc.
	}
}
