import java.util.ArrayList;


public class Deck {
	
	ArrayList<ICard> deck;
	
	public Deck() {
		this.deck = new ArrayList<ICard>();
		this.init();
	}

	private void init() {
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
		ArrayList<ICard> tempDeck;
		
		for(int i = 0; i < 3; i++) {
			tempDeck = new ArrayList<ICard>();
			
			for(int j = 0; j < this.deck.size(); j++) {
				int random = (int)(Math.random()*this.deck.size());
				tempDeck.add(this.deck.get(random));
			}
			
			this.deck = tempDeck;
		}
		
		if(this.inOrder()) {
			this.shuffle();
		}
		
		if(this.inReverseOrder()) {
			this.shuffle();
		}
	}

	private boolean inReverseOrder() {
		boolean inOrder = true;
		
		for(int i = 0; i < this.getSize() - 1; i++) {
			if(this.getCard(i).getID() < this.getCard(i+1).getID()) {
				inOrder = false;
				break;
			}
		}
		
		return inOrder;
	}

	private boolean inOrder() {
		boolean inOrder = true;
		
		for(int i = 0; i < this.getSize() - 1; i++) {
			if(this.getCard(i).getID() > this.getCard(i+1).getID()) {
				inOrder = false;
				break;
			}
		}
		return inOrder;
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
