package TicketToRideMain;


public class TrainCard implements ICard {
	public static enum CARD_TYPE {RED, BLACK,GREEN,YELLOW,BLUE,PURPLE,ORANGE,WHITE,WILD
	}
	
	public CARD_TYPE cardType;
	int cardID;
	
	public int getID() {
		return this.cardID;
	}
	
	public TrainCard(CARD_TYPE type) {
		cardType=type;
		
		//set ID based on color(type)
	}
}
