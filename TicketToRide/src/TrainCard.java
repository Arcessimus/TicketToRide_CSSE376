
public class TrainCard implements ICard {
	public static enum CARD_TYPE {RED, BLACK,GREEN,YELLOW,BLUE,PURPLE,ORANGE,WHITE,WILD
	}
	public CARD_TYPE cardType;
	public int getID() {
		return 0;
	}
	
	public TrainCard(CARD_TYPE type) {
		cardType=type;
	}
}
