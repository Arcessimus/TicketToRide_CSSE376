package TicketToRideMain;


public class TicketCard implements ICard {

	int cardID;
	String label; //a.k.a. the route of this card
	int pointValue;
	
	public TicketCard(int ID, String label, int points){
		this.cardID = ID;
		this.label = label;
		this.pointValue = points;
	}
	
	public int getID() {
		return this.cardID;
	}

}
