package TicketToRideTest;
import static org.junit.Assert.*;
import Game;

import org.junit.Test;

public class GameTest {

	@Test
	public void testConstructor() {
		Game game = new Game();
		assertNotNull(game);
		assertEquals(game.players,2);
	}
	
	@Test
	public void testConstructorOfInt(){
		for(int i=2;i<6;i++){
			Game game = new Game(i);
			assertEquals(game.players,i);
		}
		Game game =new Game(1);
		assertEquals(2,game.players);
		
		Game game1 =new Game(6);
		assertEquals(2,game1.players);
	}
}
