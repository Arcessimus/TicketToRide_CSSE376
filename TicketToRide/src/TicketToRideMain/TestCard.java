package TicketToRideMain;


public class TestCard implements ICard {

	int cardID;
	
	public TestCard(int id) {
		this.cardID = id;
	}
	
	public int getID() {
		return this.cardID;
	}

}
