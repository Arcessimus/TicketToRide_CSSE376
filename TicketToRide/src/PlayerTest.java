import static org.junit.Assert.*;

import org.junit.Test;


public class PlayerTest {

	@Test
	public void testConstructor() {
		Player player = new Player();
		assertNotNull(player);
		assertEquals(player.trainCars,45);
	}
	
	@Test
	public void testDrawCardHand() {
		Player player = new Player();
		Deck deck =new Deck();
		player.drawCardHand(deck);
		
		assertEquals(4,player.cards.size());
	}
	
	@Test
	public void testDrawTicketHand() {
		Player player = new Player();
		Deck deck =new Deck();
		player.drawTicketHand(deck);
		
		assertEquals(3,player.tickets.size());
	}
}
