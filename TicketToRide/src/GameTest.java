import static org.junit.Assert.*;
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
		for(int i=1;i<7;i++){
			Game game = new Game(i);
			assertEquals(game.players,i);
		}
		Game game =new Game(0);
		assertEquals(game.players,2);
		
		Game game1 =new Game(7);
		assertEquals(game1.players,2);
	}
	
}
