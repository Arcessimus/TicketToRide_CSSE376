package TicketToRideTest;

import static org.junit.Assert.*;

import org.junit.Test;

import TicketToRideMain.City;
import TicketToRideMain.Deck;
import TicketToRideMain.Player;
import TicketToRideMain.Route;

public class RouteTests {

	@Test
	public void testInit() {
		Route NewYorktoBoston = new Route();
		assertNotNull(NewYorktoBoston);
	}
	
	@Test
	public void testFullInit() {
		City a = new City("City A");
		City b = new City("City B");
		
		int points = 10;
		String color = "Grey";
		int length = 3;
		
		Route AtoB = new Route(a, b, points, color, length, false);
		
		assertNotNull(AtoB);
		assertEquals(2, AtoB.getCities().size());
		assertEquals(10, AtoB.getPoints());
		assertEquals("Grey", AtoB.getColor());
		assertEquals(3, AtoB.getLength());
		assertEquals(false, AtoB.isSmallGame());
	}
	
	@Test
	public void setOwnerNoTwin()
	{
		City a = new City("City A");
		City b = new City("City B");
		
		int points = 10;
		String color = "Grey";
		int length = 3;
		
		Route AtoB = new Route(a, b, points, color, length, false);
		
		Player player1 = new Player();
		
		AtoB.setOwner(player1);
		
		assertEquals(player1, AtoB.getOwner());
		assertEquals(1, AtoB.owned());
	}
	
	@Test
	public void testTwinsSetProperly()
	{
		City a = new City("City A");
		City b = new City("City B");
		
		int points = 10;
		String color1 = "Blue";
		String color2 = "Red";
		int length = 3;
		
		Route AtoB = new Route(a, b, points, color1, length, false);
		Route BtoA = new Route(a, b, points, color2, length, false);
		
		AtoB.setTwin(BtoA);
		
		assertEquals(true, AtoB.hasTwin());
		assertEquals(true, BtoA.hasTwin());
		assertEquals(BtoA, AtoB.getTwin());
		assertEquals(AtoB, BtoA.getTwin());
	}
	
	@Test
	public void setOwnerWithTwinSmallGame()
	{
		City a = new City("City A");
		City b = new City("City B");
		
		int points = 10;
		String color1 = "Blue";
		String color2 = "Red";
		int length = 3;
		
		Route AtoB = new Route(a, b, points, color1, length, true);
		Route BtoA = new Route(a, b, points, color2, length, true);
		
		AtoB.setTwin(BtoA);
		
		Player player1 = new Player();
		
		AtoB.setOwner(player1);
		
		assertEquals(player1, AtoB.getOwner());
		assertEquals(1, AtoB.owned());
		assertEquals(-1, BtoA.owned());
	}
	
	@Test
	public void setOwnerWithTwinLargeGame()
	{
		City a = new City("City A");
		City b = new City("City B");
		
		int points = 10;
		String color1 = "Blue";
		String color2 = "Red";
		int length = 3;
		
		Route AtoB = new Route(a, b, points, color1, length, false);
		Route BtoA = new Route(a, b, points, color2, length, false);
		
		AtoB.setTwin(BtoA);
		
		Player player1 = new Player();
		
		AtoB.setOwner(player1);
		
		assertEquals(player1, AtoB.getOwner());
		assertEquals(1, AtoB.owned());
		assertEquals(0, BtoA.owned());
	}

}
