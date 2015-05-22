package TicketToRideTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import TicketToRideMain.City;
import TicketToRideMain.PathGraph;
import TicketToRideMain.Player;

public class PathGraphTests {

	@Test
	public void testConnected() {
		Player player1 = new Player();
		Player player2 = new Player();
		
		ArrayList<Player> players = new ArrayList<Player>();
		
		players.add(player1);
		players.add(player2);
		
		PathGraph graph = new PathGraph(players);
		
	}
	
	@Test
	public void testLongestPath() {
		Player player1 = new Player();
		Player player2 = new Player();
		
		ArrayList<Player> players = new ArrayList<Player>();
		
		players.add(player1);
		players.add(player2);
		
		PathGraph graph = new PathGraph(players);
		
		
	}

}
