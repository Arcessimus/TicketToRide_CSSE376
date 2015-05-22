package TicketToRideMain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class PathGraph {
	
	ArrayList<Route> routes;
	ArrayList<City> cities;
	HashMap<Integer, Route> visitedEdges;
	HashMap<Integer, City> visitedCities;
	Stack<City> stack;
	ArrayList<Player> players;
	
	public PathGraph(ArrayList<Player> players)
	{
		this.routes = new ArrayList<Route>();
		this.cities = new ArrayList<City>();
		this.visitedEdges = new HashMap<Integer, Route>();
		this.visitedCities = new HashMap<Integer, City>();
		this.stack = new Stack<City>();
		
		this.players = players;
		
		this.init();
	}
	
	private void init() {
		// TODO initialize all cities and put them into list
		City Boston = new City("Boston");
		this.cities.add(Boston);
		City Miami = new City("Miami");
		this.cities.add(Miami);
		City Calgary = new City("Calgary");
		this.cities.add(Calgary);
		City Phoenix = new City("Phoenix");
		this.cities.add(Phoenix);
		City SaltLakeCity = new City("Salt Lake City");
		this.cities.add(SaltLakeCity);
		City Chicago = new City("Chicago");
		this.cities.add(Chicago);
		City NewOrleans = new City("New Orleans");
		this.cities.add(NewOrleans);
		City SantaFe = new City("Santa Fe");
		this.cities.add(SantaFe);
		City Dallas = new City("Dallas");
		this.cities.add(Dallas);
		City NewYork = new City("New York City");
		this.cities.add(NewYork);
		City Denver = new City("Denver");
		this.cities.add(Denver);
		City ElPaso = new City("El Paso");
		this.cities.add(ElPaso);
		City Pittsburgh = new City("Pittsburgh");
		this.cities.add(Pittsburgh);
		City Duluth = new City("Duluth");
		this.cities.add(Duluth);
		City Houston = new City("Houston");
		this.cities.add(Houston);
		City Helena = new City("Helena");
		this.cities.add(Helena);
		City LosAngeles = new City("Los Angeles");
		this.cities.add(LosAngeles);
		City KansasCity = new City("Kansas City");
		this.cities.add(KansasCity);
		City Montreal = new City("Montreal");
		this.cities.add(Montreal);
		City Atlanta = new City("Atlanta");
		this.cities.add(Atlanta);
		City Portland = new City("Portland");
		this.cities.add(Portland);
		City Nashville = new City("Nashville");
		this.cities.add(Nashville);
		City SanFrancisco = new City("San Fransisco");
		this.cities.add(SanFrancisco);
		City SaultStMarie = new City("Sault St. Marie");
		this.cities.add(SaultStMarie);
		City OklahomaCity = new City("Oklahoma City");
		this.cities.add(OklahomaCity);
		City Seattle = new City("Seattle");
		this.cities.add(Seattle);
		City Toronto = new City("Toronto");
		this.cities.add(Toronto);
		City Vancouver = new City("Vancouver");
		this.cities.add(Vancouver);
		City Winnipeg = new City("Winnipeg");
		this.cities.add(Winnipeg);
		City LittleRock = new City("Little Rock");
		this.cities.add(LittleRock);
		City LasVegas = new City("Las Vegas");
		this.cities.add(LasVegas);
		City StLouis = new City("St. Louis");
		this.cities.add(StLouis);
		City Charleston = new City("Charleston");
		this.cities.add(Charleston);
		City Raleigh = new City("Raleigh");
		this.cities.add(Raleigh);
		City Washington = new City("Washington");
		this.cities.add(Washington);
		
		// TODO initialize all routes and put them into list
		
		// TODO adjust for number of players
		
	}

	public boolean connected(Player p, City a, City b)
	{
		return false;
	}
	
	public Player longestPathOwner()
	{
		return null;
	}

}
