package TicketToRideMain;


public class TrainCard implements ICard {
	public static enum CARD_TYPE {BLACK,BLUE,GREEN,ORANGE,PURPLE,RED,WHITE,WILD,YELLOW
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
