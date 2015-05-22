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
		//initialize all cities and put them into list
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
		City Omaha = new City("Omaha");
		this.cities.add(Omaha);
		
		// TODO initialize all routes and put them into list
		
		//single routes
		Route one = new Route(Vancouver, Calgary, 0, "", 0, true);
		Route two = new Route(Calgary, Seattle, 0, "", 0, true);
		Route three = new Route(Calgary, Helena, 0, "", 0, true);
		Route four = new Route(Calgary, Winnipeg, 0, "", 0, true);
		Route five = new Route(Seattle, Helena, 0, "", 0, true);
		Route six = new Route(Portland, SaltLakeCity, 0, "", 0, true);
		Route seven = new Route(SaltLakeCity, LasVegas, 0, "", 0, true);
		Route eight = new Route(SaltLakeCity, Helena, 0, "", 0, true);
		Route nine = new Route(LosAngeles, LasVegas, 0, "", 0, true);
		Route ten = new Route(LosAngeles, Phoenix, 0, "", 0, true);
		Route eleven = new Route(LosAngeles, ElPaso, 0, "", 0, true);
		Route twelve = new Route(Phoenix, ElPaso, 0, "", 0, true);
		Route thirteen = new Route(Phoenix, Denver, 0, "", 0, true);
		Route fourteen = new Route(Phoenix, SantaFe, 0, "", 0, true);
		Route fifteen = new Route(ElPaso, Houston, 0, "", 0, true);
		Route sixteen = new Route(ElPaso, Dallas, 0, "", 0, true);
		Route seventeen = new Route(ElPaso, OklahomaCity, 0, "", 0, true);
		Route eighteen = new Route(ElPaso, SantaFe, 0, "", 0, true);
		Route nineteen = new Route(Houston, NewOrleans, 0, "", 0, true);
		Route twenty = new Route(Dallas, LittleRock, 0, "", 0, true);
		Route twentyone = new Route(NewOrleans, LittleRock, 0, "", 0, true);
		Route twentytwo = new Route(NewOrleans, Miami, 0, "", 0, true);
		Route twentythree = new Route(Denver, OklahomaCity, 0, "", 0, true);
		Route twentyfour = new Route(Denver, Omaha, 0, "", 0, true);
		Route twentyfive = new Route(Denver, Helena, 0, "", 0, true);
		Route twentysix = new Route(Denver, SantaFe, 0, "", 0, true);
		Route twentyseven = new Route(OklahomaCity, LittleRock, 0, "", 0, true);
		Route twentyeight = new Route(OklahomaCity, SantaFe, 0, "", 0, true);
		Route twentynine = new Route(LittleRock, StLouis, 0, "", 0, true);
		Route thirty = new Route(LittleRock, Nashville, 0, "", 0, true);
		Route thirtyone = new Route(StLouis, Nashville, 0, "", 0, true);
		Route thirtytwo = new Route(StLouis, Pittsburgh, 0, "", 0, true);
		Route thirtythree = new Route(Omaha, Chicago, 0, "", 0, true);
		Route thirtyfour = new Route(Omaha, Helena, 0, "", 0, true);
		Route thirtyfive = new Route(Atlanta, Charleston, 0, "", 0, true);
		Route thirtysix = new Route(Atlanta, Miami, 0, "", 0, true);
		Route thirtyseven = new Route(Atlanta, Nashville, 0, "", 0, true);
		Route thirtyeight = new Route(Charleston, Raleigh, 0, "", 0, true);
		Route thirtynine = new Route(Charleston, Miami, 0, "", 0, true);
		Route fourty = new Route(Raleigh, Nashville, 0, "", 0, true);
		Route fourtyone = new Route(Raleigh, Pittsburgh, 0, "", 0, true);
		Route fourtytwo = new Route(Nashville, Pittsburgh, 0, "", 0, true);
		Route fourtythree = new Route(Washington, Pittsburgh, 0, "", 0, true);
		Route fourtyfour = new Route(Pittsburgh, NewYork, 0, "", 0, true);
		Route fourtyfive = new Route(Pittsburgh, Toronto, 0, "", 0, true);
		Route fourtysix = new Route(NewYork, Montreal, 0, "", 0, true);
		Route fourtyseven = new Route(Montreal, SaultStMarie, 0, "", 0, true);
		Route fourtyeight = new Route(Montreal, Toronto, 0, "", 0, true);
		Route fourtynine = new Route(SaultStMarie, Toronto, 0, "", 0, true);
		Route fifty = new Route(SaultStMarie, Winnipeg, 0, "", 0, true);
		Route fiftyone = new Route(SaultStMarie, Duluth, 0, "", 0, true);
		Route fiftytwo = new Route(Toronto, Chicago, 0, "", 0, true);
		Route fiftythree = new Route(Toronto, Duluth, 0, "", 0, true);
		Route fiftyfour = new Route(Chicago, Duluth, 0, "", 0, true);
		Route fiftyfive = new Route(Helena, Winnipeg, 0, "", 0, true);
		Route fiftysix = new Route(Helena, Duluth, 0, "", 0, true);
		Route fiftyseven = new Route(Winnipeg, Duluth, 0, "", 0, true);
		
		this.routes.add(one);
		this.routes.add(two);
		this.routes.add(three);
		this.routes.add(four);
		this.routes.add(five);
		this.routes.add(six);
		this.routes.add(seven);
		this.routes.add(eight);
		this.routes.add(nine);
		this.routes.add(ten);
		this.routes.add(eleven);
		this.routes.add(twelve);
		this.routes.add(thirteen);
		this.routes.add(fourteen);
		this.routes.add(fifteen);
		this.routes.add(sixteen);
		this.routes.add(seventeen);
		this.routes.add(eighteen);
		this.routes.add(nineteen);
		this.routes.add(twenty);
		this.routes.add(twentyone);
		this.routes.add(twentytwo);
		this.routes.add(twentythree);
		this.routes.add(twentyfour);
		this.routes.add(twentyfive);
		this.routes.add(twentysix);
		this.routes.add(twentyseven);
		this.routes.add(twentyeight);
		this.routes.add(twentynine);
		this.routes.add(thirty);
		this.routes.add(thirtyone);
		this.routes.add(thirtytwo);
		this.routes.add(thirtythree);
		this.routes.add(thirtyfour);
		this.routes.add(thirtyfive);
		this.routes.add(thirtysix);
		this.routes.add(thirtyseven);
		this.routes.add(thirtyeight);
		this.routes.add(thirtynine);
		this.routes.add(fourty);
		this.routes.add(fourtyone);
		this.routes.add(fourtytwo);
		this.routes.add(fourtythree);
		this.routes.add(fourtyfour);
		this.routes.add(fourtyfive);
		this.routes.add(fourtysix);
		this.routes.add(fourtyseven);
		this.routes.add(fourtyeight);
		this.routes.add(fourtynine);
		this.routes.add(fifty);
		this.routes.add(fiftyone);
		this.routes.add(fiftytwo);
		this.routes.add(fiftythree);
		this.routes.add(fiftyfour);
		this.routes.add(fiftyfive);
		this.routes.add(fiftysix);
		this.routes.add(fiftyseven);
		
		//double routes
		Route fiftynine = new Route(LosAngeles, LasVegas, 0, "", 0, true);
		
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
