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
		City Vancouver = new City("Vancouver");
		City Calgary = new City("Calgary");
		int index1 = cities.indexOf(Vancouver);
		int index2 = cities.indexOf(Calgary);
		assertTrue(graph.connected(player1, cities.get(index1), cities.get(index2)));
		
		//two route connection
		routes.get(1).setOwner(player1);
		City Seattle = new City("Seattle");
		index2 = cities.indexOf(Seattle);
		assertTrue(graph.connected(player1, cities.get(index1), cities.get(index2)));
		
		//many route connection
		routes.get(4).setOwner(player1);
		City Helena = new City("Helena");
		index2 = cities.indexOf(Helena);
		assertTrue(graph.connected(player1, cities.get(index1), cities.get(index2)));
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
