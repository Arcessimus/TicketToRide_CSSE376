package TicketToRideTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import TicketToRideMain.City;
import TicketToRideMain.PathGraph;
import TicketToRideMain.Player;
import TicketToRideMain.Route;

public class PathGraphTests {

	@Test
	public void testConnected() {
		Player player1 = new Player();
		Player player2 = new Player();
		
		ArrayList<Player> players = new ArrayList<Player>();
		
		players.add(player1);
		players.add(player2);
		
		PathGraph graph = new PathGraph(players);
		ArrayList<City> cities = graph.getCities();
		ArrayList<Route> routes = graph.getRoutes();
		
		//single route connection
		routes.get(0).setOwner(player1);
		assertTrue(graph.connected(player1, cities.get(27), cities.get(2)));
		
		//two route connection
		routes.get(1).setOwner(player1);
		assertTrue(graph.connected(player1, cities.get(27), cities.get(25)));
		
		//many route connection
		routes.get(4).setOwner(player1);
		assertTrue(graph.connected(player1, cities.get(27), cities.get(15)));
	}
	
	@Test
	public void testLongestPath() {
		Player player1 = new Player();
		Player player2 = new Player();
		
		ArrayList<Player> players = new ArrayList<Player>();
		
		players.add(player1);
		players.add(player2);
		
		PathGraph graph = new PathGraph(players);
		
		// TODO long path
	}

}
