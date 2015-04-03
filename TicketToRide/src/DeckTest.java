import static org.junit.Assert.*;

import org.junit.Test;


public class DeckTest {	
	
	@Test
	public void testInit() {
		Deck main = new Deck();
		assertNotNull(main);
	}

	@Test
	public void testShuffle() {
		Deck test = new Deck();
		test.shuffle();
		
		boolean inOrder = true;
		
		for(int i = 0; i < test.getSize(); i++) {
			if(test.getCard(i).getID() > test.getCard(i+1).getID()) {
				inOrder = false;
				break;
			}
		}
		
		assertFalse(inOrder);
	}
	
	@Test
	public void testShuffleReverse() {
		Deck test = new Deck();
		test.shuffle();
		
		boolean inOrder = true;
		
		for(int i = 0; i < test.getSize(); i++) {
			if(test.getCard(i).getID() < test.getCard(i+1).getID()) {
				inOrder = false;
				break;
			}
		}
		
		assertFalse(inOrder);
	}
	
	@Test
	public void testThatDrawRemovesOneCard() {
		Deck test = new Deck();
		int cursize = test.getSize();
		int expsize = cursize - 1;
		
		test.draw();
		
		cursize = test.getSize();
		assertEquals(expsize, cursize);
	}

}
