package TicketToRideTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import TicketToRideMain.City;
import TicketToRideMain.Deck;
import TicketToRideMain.Player;
import TicketToRideMain.Route;

public class CityTests {

	@Test
	public void testInit() {
		City NewYork = new City("New York City");
		assertNotNull(NewYork);
	}
	
	@Test
	public void testGetOwnedEdges() {
		City NewYork = new City("New York City");
		
		Route route1 = new Route();
		Route route2 = new Route();
		Route route3 = new Route();
		Route route4 = new Route();
		Route route5 = new Route();
		
		NewYork.addEdge(route1);
		NewYork.addEdge(route2);
		NewYork.addEdge(route3);
		NewYork.addEdge(route4);
		NewYork.addEdge(route5);
		
		Player player1 = new Player();
		
		route1.setOwner(player1);
		route2.setOwner(player1);
		
		ArrayList<Route> ownedRoutes = NewYork.getOwnedEdges();
		assertEquals(2, ownedRoutes.size());
	}

}
