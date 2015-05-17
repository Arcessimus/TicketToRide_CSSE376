package TicketToRideTest;
import static org.junit.Assert.*;

import org.junit.Test;

import TicketToRideMain.Game;

public class GameTest {

	@Test
	public void testConstructor() {
		Game game = new Game();
		assertNotNull(game);
		assertEquals(2,game.playerNumber);
		assertEquals(2,game.players.size());
	}
	
	@Test
	public void testConstructorOfInt(){
		for(int i=2;i<6;i++){
			Game game = new Game(i);
			assertEquals(i,game.playerNumber);
			assertEquals(i,game.players.size());
		}
		Game game =new Game(1);
		assertEquals(2,game.playerNumber);
		assertEquals(2,game.players.size());
		
		Game game1 =new Game(6);
		assertEquals(2,game1.playerNumber);
		assertEquals(2,game.players.size());
		
		assertNotNull(game.ticketDeck);
		assertNotNull(game.trainDeck);
	}
}
