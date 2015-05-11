package TicketToRideTest;
import static org.junit.Assert.*;

import org.junit.Test;

import TicketToRideMain.Deck;
import TicketToRideMain.Player;


public class PlayerTest {

	@Test
	public void testConstructor() {
		Player player = new Player();
		assertNotNull(player);
		assertEquals(45, player.trainCars);
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
		player.drawTicket(deck);
		
		assertEquals(3,player.tickets.size());
	}
}
