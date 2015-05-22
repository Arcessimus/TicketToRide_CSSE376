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
		//adjust for number of players
		boolean smallGame = this.players.size() < 4;
		
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
		
		//initialize all routes and put them into list
		
		//single routes
		Route one = new Route(Vancouver, Calgary, 0, "", 0, smallGame);
		Route two = new Route(Calgary, Seattle, 0, "", 0, smallGame);
		Route three = new Route(Calgary, Helena, 0, "", 0, smallGame);
		Route four = new Route(Calgary, Winnipeg, 0, "", 0, smallGame);
		Route five = new Route(Seattle, Helena, 0, "", 0, smallGame);
		Route six = new Route(Portland, SaltLakeCity, 0, "", 0, smallGame);
		Route seven = new Route(SaltLakeCity, LasVegas, 0, "", 0, smallGame);
		Route eight = new Route(SaltLakeCity, Helena, 0, "", 0, smallGame);
		Route nine = new Route(LosAngeles, LasVegas, 0, "", 0, smallGame);
		Route ten = new Route(LosAngeles, Phoenix, 0, "", 0, smallGame);
		Route eleven = new Route(LosAngeles, ElPaso, 0, "", 0, smallGame);
		Route twelve = new Route(Phoenix, ElPaso, 0, "", 0, smallGame);
		Route thirteen = new Route(Phoenix, Denver, 0, "", 0, smallGame);
		Route fourteen = new Route(Phoenix, SantaFe, 0, "", 0, smallGame);
		Route fifteen = new Route(ElPaso, Houston, 0, "", 0, smallGame);
		Route sixteen = new Route(ElPaso, Dallas, 0, "", 0, smallGame);
		Route seventeen = new Route(ElPaso, OklahomaCity, 0, "", 0, smallGame);
		Route eighteen = new Route(ElPaso, SantaFe, 0, "", 0, smallGame);
		Route nineteen = new Route(Houston, NewOrleans, 0, "", 0, smallGame);
		Route twenty = new Route(Dallas, LittleRock, 0, "", 0, smallGame);
		Route twentyone = new Route(NewOrleans, LittleRock, 0, "", 0, smallGame);
		Route twentytwo = new Route(NewOrleans, Miami, 0, "", 0, smallGame);
		Route twentythree = new Route(Denver, OklahomaCity, 0, "", 0, smallGame);
		Route twentyfour = new Route(Denver, Omaha, 0, "", 0, smallGame);
		Route twentyfive = new Route(Denver, Helena, 0, "", 0, smallGame);
		Route twentysix = new Route(Denver, SantaFe, 0, "", 0, smallGame);
		Route twentyseven = new Route(OklahomaCity, LittleRock, 0, "", 0, smallGame);
		Route twentyeight = new Route(OklahomaCity, SantaFe, 0, "", 0, smallGame);
		Route twentynine = new Route(LittleRock, StLouis, 0, "", 0, smallGame);
		Route thirty = new Route(LittleRock, Nashville, 0, "", 0, smallGame);
		Route thirtyone = new Route(StLouis, Nashville, 0, "", 0, smallGame);
		Route thirtytwo = new Route(StLouis, Pittsburgh, 0, "", 0, smallGame);
		Route thirtythree = new Route(Omaha, Chicago, 0, "", 0, smallGame);
		Route thirtyfour = new Route(Omaha, Helena, 0, "", 0, smallGame);
		Route thirtyfive = new Route(Atlanta, Charleston, 0, "", 0, smallGame);
		Route thirtysix = new Route(Atlanta, Miami, 0, "", 0, smallGame);
		Route thirtyseven = new Route(Atlanta, Nashville, 0, "", 0, smallGame);
		Route thirtyeight = new Route(Charleston, Raleigh, 0, "", 0, smallGame);
		Route thirtynine = new Route(Charleston, Miami, 0, "", 0, smallGame);
		Route fourty = new Route(Raleigh, Nashville, 0, "", 0, smallGame);
		Route fourtyone = new Route(Raleigh, Pittsburgh, 0, "", 0, smallGame);
		Route fourtytwo = new Route(Nashville, Pittsburgh, 0, "", 0, smallGame);
		Route fourtythree = new Route(Washington, Pittsburgh, 0, "", 0, smallGame);
		Route fourtyfive = new Route(Pittsburgh, Toronto, 0, "", 0, smallGame);
		Route fourtysix = new Route(NewYork, Montreal, 0, "", 0, smallGame);
		Route fourtyseven = new Route(Montreal, SaultStMarie, 0, "", 0, smallGame);
		Route fourtyeight = new Route(Montreal, Toronto, 0, "", 0, smallGame);
		Route fourtynine = new Route(SaultStMarie, Toronto, 0, "", 0, smallGame);
		Route fifty = new Route(SaultStMarie, Winnipeg, 0, "", 0, smallGame);
		Route fiftyone = new Route(SaultStMarie, Duluth, 0, "", 0, smallGame);
		Route fiftytwo = new Route(Toronto, Chicago, 0, "", 0, smallGame);
		Route fiftythree = new Route(Toronto, Duluth, 0, "", 0, smallGame);
		Route fiftyfour = new Route(Chicago, Duluth, 0, "", 0, smallGame);
		Route fiftyfive = new Route(Helena, Winnipeg, 0, "", 0, smallGame);
		Route fiftysix = new Route(Helena, Duluth, 0, "", 0, smallGame);
		Route fiftyseven = new Route(Winnipeg, Duluth, 0, "", 0, smallGame);
		
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

		Route fourtyfour = new Route(Pittsburgh, NewYork, 0, "", 0, smallGame);
		Route ninetyfive = new Route(Pittsburgh, NewYork, 0, "", 0, smallGame);
		fourtyfour.setTwin(ninetyfive);
		this.routes.add(fourtyfour);
		this.routes.add(ninetyfive);
		
		Route fiftynine = new Route(Vancouver, Seattle, 0, "", 0, smallGame);
		Route sixty = new Route(Vancouver, Seattle, 0, "", 0, smallGame);
		fiftynine.setTwin(sixty);
		this.routes.add(fiftynine);
		this.routes.add(sixty);
		
		Route sixtyone = new Route(Seattle, Portland, 0, "", 0, smallGame);
		Route sixtytwo = new Route(Seattle, Portland, 0, "", 0, smallGame);
		sixtyone.setTwin(sixtytwo);
		this.routes.add(sixtyone);
		this.routes.add(sixtytwo);
		
		Route sixtythree = new Route(Portland, SanFrancisco, 0, "", 0, smallGame);
		Route sixtyfour = new Route(Portland, SanFrancisco, 0, "", 0, smallGame);
		sixtythree.setTwin(sixtyfour);
		this.routes.add(sixtythree);
		this.routes.add(sixtyfour);
		
		Route sixtyfive = new Route(SaltLakeCity, SanFrancisco, 0, "", 0, smallGame);
		Route sixtysix = new Route(SaltLakeCity, SanFrancisco, 0, "", 0, smallGame);
		sixtyfive.setTwin(sixtysix);
		this.routes.add(sixtyfive);
		this.routes.add(sixtysix);
		
		Route sixtyseven = new Route(SaltLakeCity, Denver, 0, "", 0, smallGame);
		Route sixtyeight = new Route(SaltLakeCity, Denver, 0, "", 0, smallGame);
		sixtyseven.setTwin(sixtyeight);
		this.routes.add(sixtyseven);
		this.routes.add(sixtyeight);
		
		Route sixtynine = new Route(SanFrancisco, LosAngeles, 0, "", 0, smallGame);
		Route seventy = new Route(SanFrancisco, LosAngeles, 0, "", 0, smallGame);
		sixtynine.setTwin(seventy);
		this.routes.add(sixtynine);
		this.routes.add(seventy);
		
		Route seventyone = new Route(Houston, Dallas, 0, "", 0, smallGame);
		Route seventytwo = new Route(Houston, Dallas, 0, "", 0, smallGame);
		seventyone.setTwin(seventytwo);
		this.routes.add(seventyone);
		this.routes.add(seventytwo);
		
		Route seventythree = new Route(Dallas, OklahomaCity, 0, "", 0, smallGame);
		Route seventyfour = new Route(Dallas, OklahomaCity, 0, "", 0, smallGame);
		seventythree.setTwin(seventyfour);
		this.routes.add(seventythree);
		this.routes.add(seventyfour);
		
		Route seventyfive = new Route(NewOrleans, Atlanta, 0, "", 0, smallGame);
		Route seventysix = new Route(NewOrleans, Atlanta, 0, "", 0, smallGame);
		seventyfive.setTwin(seventysix);
		this.routes.add(seventyfive);
		this.routes.add(seventysix);
		
		Route seventyseven = new Route(Denver, KansasCity, 0, "", 0, smallGame);
		Route seventyeight = new Route(Denver, KansasCity, 0, "", 0, smallGame);
		seventyseven.setTwin(seventyeight);
		this.routes.add(seventyseven);
		this.routes.add(seventyeight);
		
		Route seventynine = new Route(OklahomaCity, KansasCity, 0, "", 0, smallGame);
		Route eighty = new Route(OklahomaCity, KansasCity, 0, "", 0, smallGame);
		seventynine.setTwin(eighty);
		this.routes.add(seventynine);
		this.routes.add(eighty);
		
		Route eightyone = new Route(StLouis, KansasCity, 0, "", 0, smallGame);
		Route eightytwo = new Route(StLouis, KansasCity, 0, "", 0, smallGame);
		eightyone.setTwin(eightytwo);
		this.routes.add(eightyone);
		this.routes.add(eightytwo);
		
		Route eightythree = new Route(StLouis, Chicago, 0, "", 0, smallGame);
		Route eightyfour = new Route(StLouis, Chicago, 0, "", 0, smallGame);
		eightythree.setTwin(eightyfour);
		this.routes.add(eightythree);
		this.routes.add(eightyfour);
		
		Route eightyfive = new Route(KansasCity, Omaha, 0, "", 0, smallGame);
		Route eightysix = new Route(KansasCity, Omaha, 0, "", 0, smallGame);
		eightyfive.setTwin(eightysix);
		this.routes.add(eightyfive);
		this.routes.add(eightysix);
		
		Route eightyseven = new Route(Omaha, Duluth, 0, "", 0, smallGame);
		Route eightyeight = new Route(Omaha, Duluth, 0, "", 0, smallGame);
		eightyseven.setTwin(eightyeight);
		this.routes.add(eightyseven);
		this.routes.add(eightyeight);
		
		Route eightynine = new Route(Atlanta, Raleigh, 0, "", 0, smallGame);
		Route ninety = new Route(Atlanta, Raleigh, 0, "", 0, smallGame);
		eightynine.setTwin(ninety);
		this.routes.add(eightynine);
		this.routes.add(ninety);
		
		Route ninetyone = new Route(Raleigh, Washington, 0, "", 0, smallGame);
		Route ninetytwo = new Route(Raleigh, Washington, 0, "", 0, smallGame);
		ninetyone.setTwin(ninetytwo);
		this.routes.add(ninetyone);
		this.routes.add(ninetytwo);
		
		Route ninetythree = new Route(Washington, NewYork, 0, "", 0, smallGame);
		Route ninetyfour = new Route(Washington, NewYork, 0, "", 0, smallGame);
		ninetythree.setTwin(ninetyfour);
		this.routes.add(ninetythree);
		this.routes.add(ninetyfour);
		
		Route ninetysix = new Route(Pittsburgh, Chicago, 0, "", 0, smallGame);
		Route ninetyseven = new Route(Pittsburgh, Chicago, 0, "", 0, smallGame);
		ninetysix.setTwin(ninetyseven);
		this.routes.add(ninetysix);
		this.routes.add(ninetyseven);
		
		Route ninetyeight = new Route(NewYork, Boston, 0, "", 0, smallGame);
		Route ninetynine = new Route(NewYork, Boston, 0, "", 0, smallGame);
		ninetyeight.setTwin(ninetynine);
		this.routes.add(ninetyeight);
		this.routes.add(ninetynine);
		
		Route onehundred = new Route(Boston, Montreal, 0, "", 0, smallGame);
		Route onehundredone = new Route(Boston, Montreal, 0, "", 0, smallGame);
		onehundred.setTwin(onehundredone);
		this.routes.add(onehundred);
		this.routes.add(onehundredone);
		
		
		
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
