package TicketToRideMain;

import java.util.ArrayList;
import java.util.HashMap;

public class PathGraph {
	
	ArrayList<Route> routes;
	ArrayList<City> cities;
	HashMap<Integer, Route> visitedEdges;
	HashMap<Integer, City> visitedCities;
	ArrayList<Player> players;
	
	public PathGraph(ArrayList<Player> players)
	{
		this.routes = new ArrayList<Route>();
		this.cities = new ArrayList<City>();
		this.visitedEdges = new HashMap<Integer, Route>();
		this.visitedCities = new HashMap<Integer, City>();
		
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
		Route one = new Route(Vancouver, Calgary, 4, "Grey", 3, smallGame);
		Vancouver.addEdge(one);
		Calgary.addEdge(one);
		Route two = new Route(Calgary, Seattle, 7, "Grey", 4, smallGame);
		Calgary.addEdge(two);
		Seattle.addEdge(two);
		Route three = new Route(Calgary, Helena, 7, "Grey", 4, smallGame);
		Calgary.addEdge(three);
		Helena.addEdge(three);
		Route four = new Route(Calgary, Winnipeg, 15, "White", 6, smallGame);
		Calgary.addEdge(four);
		Winnipeg.addEdge(four);
		Route five = new Route(Seattle, Helena, 15, "Yellow", 6, smallGame);
		Seattle.addEdge(five);
		Helena.addEdge(five);
		Route six = new Route(Portland, SaltLakeCity, 15, "Blue", 6, smallGame);
		Portland.addEdge(six);
		SaltLakeCity.addEdge(six);
		Route seven = new Route(SaltLakeCity, LasVegas, 4, "Orange", 3, smallGame);
		SaltLakeCity.addEdge(seven);
		LasVegas.addEdge(seven);
		Route eight = new Route(SaltLakeCity, Helena, 4, "Pink", 3, smallGame);
		SaltLakeCity.addEdge(eight);
		Helena.addEdge(eight);
		Route nine = new Route(LosAngeles, LasVegas, 2, "Grey", 2, smallGame);
		LosAngeles.addEdge(nine);
		LasVegas.addEdge(nine);
		Route ten = new Route(LosAngeles, Phoenix, 4, "Grey", 3, smallGame);
		LosAngeles.addEdge(ten);
		Phoenix.addEdge(ten);
		Route eleven = new Route(LosAngeles, ElPaso, 15, "Black", 6, smallGame);
		LosAngeles.addEdge(eleven);
		ElPaso.addEdge(eleven);
		Route twelve = new Route(Phoenix, ElPaso, 4, "Grey", 3, smallGame);
		Phoenix.addEdge(twelve);
		ElPaso.addEdge(twelve);
		Route thirteen = new Route(Phoenix, Denver, 10, "White", 5, smallGame);
		Phoenix.addEdge(thirteen);
		Denver.addEdge(thirteen);
		Route fourteen = new Route(Phoenix, SantaFe, 4, "Grey", 3, smallGame);
		Phoenix.addEdge(fourteen);
		SantaFe.addEdge(fourteen);
		Route fifteen = new Route(ElPaso, Houston, 15, "Green", 6, smallGame);
		ElPaso.addEdge(fifteen);
		Houston.addEdge(fifteen);
		Route sixteen = new Route(ElPaso, Dallas, 7, "Red", 4, smallGame);
		ElPaso.addEdge(sixteen);
		Dallas.addEdge(sixteen);
		Route seventeen = new Route(ElPaso, OklahomaCity, 10, "Yellow", 5, smallGame);
		ElPaso.addEdge(seventeen);
		OklahomaCity.addEdge(seventeen);
		Route eighteen = new Route(ElPaso, SantaFe, 2, "Grey", 2, smallGame);
		ElPaso.addEdge(eighteen);
		SantaFe.addEdge(eighteen);
		Route nineteen = new Route(Houston, NewOrleans, 2, "Grey", 2, smallGame);
		Houston.addEdge(nineteen);
		NewOrleans.addEdge(nineteen);
		Route twenty = new Route(Dallas, LittleRock, 2, "Grey", 2, smallGame);
		Dallas.addEdge(twenty);
		LittleRock.addEdge(twenty);
		Route twentyone = new Route(NewOrleans, LittleRock, 4, "Green", 3, smallGame);
		NewOrleans.addEdge(twentyone);
		LittleRock.addEdge(twentyone);
		Route twentytwo = new Route(NewOrleans, Miami, 15, "Red", 6, smallGame);
		NewOrleans.addEdge(twentytwo);
		Miami.addEdge(twentytwo);
		Route twentythree = new Route(Denver, OklahomaCity, 7, "Red", 4, smallGame);
		NewOrleans.addEdge(twentythree);
		OklahomaCity.addEdge(twentythree);
		Route twentyfour = new Route(Denver, Omaha, 7, "Pink", 4, smallGame);
		Denver.addEdge(twentyfour);
		Omaha.addEdge(twentyfour);
		Route twentyfive = new Route(Denver, Helena, 7, "Green", 4, smallGame);
		Denver.addEdge(twentyfive);
		Helena.addEdge(twentyfive);
		Route twentysix = new Route(Denver, SantaFe, 2, "Grey", 2, smallGame);
		Denver.addEdge(twentysix);
		SantaFe.addEdge(twentysix);
		Route twentyseven = new Route(OklahomaCity, LittleRock, 2, "Grey", 2, smallGame);
		OklahomaCity.addEdge(twentyseven);
		LittleRock.addEdge(twentyseven);
		Route twentyeight = new Route(OklahomaCity, SantaFe, 4, "Blue", 3, smallGame);
		OklahomaCity.addEdge(twentyeight);
		SantaFe.addEdge(twentyeight);
		Route twentynine = new Route(LittleRock, StLouis, 2, "Grey", 2, smallGame);
		LittleRock.addEdge(twentynine);
		StLouis.addEdge(twentynine);
		Route thirty = new Route(LittleRock, Nashville, 4, "White", 3, smallGame);
		LittleRock.addEdge(thirty);
		Nashville.addEdge(thirty);
		Route thirtyone = new Route(StLouis, Nashville, 2, "Grey", 2, smallGame);
		StLouis.addEdge(thirtyone);
		Nashville.addEdge(thirtyone);
		Route thirtytwo = new Route(StLouis, Pittsburgh, 10, "Green", 5, smallGame);
		StLouis.addEdge(thirtytwo);
		Pittsburgh.addEdge(thirtytwo);
		Route thirtythree = new Route(Omaha, Chicago, 7, "Blue", 4, smallGame);
		Omaha.addEdge(thirtythree);
		Chicago.addEdge(thirtythree);
		Route thirtyfour = new Route(Omaha, Helena, 10, "Red", 5, smallGame);
		Omaha.addEdge(thirtyfour);
		Helena.addEdge(thirtyfour);
		Route thirtyfive = new Route(Atlanta, Charleston, 2, "Grey", 2, smallGame);
		Atlanta.addEdge(thirtyfive);
		Charleston.addEdge(thirtyfive);
		Route thirtysix = new Route(Atlanta, Miami, 10, "Blue", 5, smallGame);
		Atlanta.addEdge(thirtysix);
		Miami.addEdge(thirtysix);
		Route thirtyseven = new Route(Atlanta, Nashville, 1, "Grey", 1, smallGame);
		Atlanta.addEdge(thirtyseven);
		Nashville.addEdge(thirtyseven);
		Route thirtyeight = new Route(Charleston, Raleigh, 2, "Grey", 2, smallGame);
		Charleston.addEdge(thirtyeight);
		Raleigh.addEdge(thirtyeight);
		Route thirtynine = new Route(Charleston, Miami, 7, "Pink", 4, smallGame);
		Charleston.addEdge(thirtynine);
		Miami.addEdge(thirtynine);
		Route fourty = new Route(Raleigh, Nashville, 4, "Black", 3, smallGame);
		Raleigh.addEdge(fourty);
		Nashville.addEdge(fourty);
		Route fourtyone = new Route(Raleigh, Pittsburgh, 2, "Grey", 2, smallGame);
		Raleigh.addEdge(fourtyone);
		Pittsburgh.addEdge(fourtyone);
		Route fourtytwo = new Route(Nashville, Pittsburgh, 7, "Yellow", 4, smallGame);
		Nashville.addEdge(fourtytwo);
		Pittsburgh.addEdge(fourtytwo);
		Route fourtythree = new Route(Washington, Pittsburgh, 2, "Grey", 2, smallGame);
		Washington.addEdge(fourtythree);
		Pittsburgh.addEdge(fourtythree);
		Route fourtyfive = new Route(Pittsburgh, Toronto, 2, "Grey", 2, smallGame);
		Pittsburgh.addEdge(fourtyfive);
		Toronto.addEdge(fourtyfive);
		Route fourtysix = new Route(NewYork, Montreal, 4, "Blue", 3, smallGame);
		NewYork.addEdge(fourtysix);
		Montreal.addEdge(fourtysix);
		Route fourtyseven = new Route(Montreal, SaultStMarie, 10, "Black", 5, smallGame);
		Montreal.addEdge(fourtyseven);
		SaultStMarie.addEdge(fourtyseven);
		Route fourtyeight = new Route(Montreal, Toronto, 4, "Grey", 3, smallGame);
		Montreal.addEdge(fourtyeight);
		Toronto.addEdge(fourtyeight);
		Route fourtynine = new Route(SaultStMarie, Toronto, 2, "Grey", 2, smallGame);
		SaultStMarie.addEdge(fourtynine);
		Toronto.addEdge(fourtynine);
		Route fifty = new Route(SaultStMarie, Winnipeg, 15, "Grey", 6, smallGame);
		SaultStMarie.addEdge(fifty);
		Winnipeg.addEdge(fifty);
		Route fiftyone = new Route(SaultStMarie, Duluth, 4, "Grey", 3, smallGame);
		SaultStMarie.addEdge(fiftyone);
		Duluth.addEdge(fiftyone);
		Route fiftytwo = new Route(Toronto, Chicago, 7, "White", 4, smallGame);
		Toronto.addEdge(fiftytwo);
		Chicago.addEdge(fiftytwo);
		Route fiftythree = new Route(Toronto, Duluth, 15, "Pink", 6, smallGame);
		Toronto.addEdge(fiftythree);
		Duluth.addEdge(fiftythree);
		Route fiftyfour = new Route(Chicago, Duluth, 4, "Red", 3, smallGame);
		Chicago.addEdge(fiftyfour);
		Duluth.addEdge(fiftyfour);
		Route fiftyfive = new Route(Helena, Winnipeg, 7, "Blue", 4, smallGame);
		Helena.addEdge(fiftyfive);
		Winnipeg.addEdge(fiftyfive);
		Route fiftysix = new Route(Helena, Duluth, 15, "Orange", 6, smallGame);
		Helena.addEdge(fiftysix);
		Duluth.addEdge(fiftysix);
		Route fiftyseven = new Route(Winnipeg, Duluth, 7, "Black", 4, smallGame);
		Winnipeg.addEdge(fiftyseven);
		Duluth.addEdge(fiftyseven);
		
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

		Route fourtyfour = new Route(Pittsburgh, NewYork, 2, "White", 2, smallGame);
		Pittsburgh.addEdge(fourtyfour);
		NewYork.addEdge(fourtyfour);
		Route ninetyfive = new Route(Pittsburgh, NewYork, 2, "Green", 2, smallGame);
		Pittsburgh.addEdge(ninetyfive);
		NewYork.addEdge(ninetyfive);
		fourtyfour.setTwin(ninetyfive);
		this.routes.add(fourtyfour);
		this.routes.add(ninetyfive);
		
		Route fiftynine = new Route(Vancouver, Seattle, 1, "Grey", 1, smallGame);
		Vancouver.addEdge(fiftynine);
		Seattle.addEdge(fiftynine);
		Route sixty = new Route(Vancouver, Seattle, 1, "Grey", 1, smallGame);
		Vancouver.addEdge(sixty);
		Seattle.addEdge(sixty);
		fiftynine.setTwin(sixty);
		this.routes.add(fiftynine);
		this.routes.add(sixty);
		
		Route sixtyone = new Route(Seattle, Portland, 1, "Grey", 1, smallGame);
		Seattle.addEdge(sixtyone);
		Portland.addEdge(sixtyone);
		Route sixtytwo = new Route(Seattle, Portland, 1, "Grey", 1, smallGame);
		Seattle.addEdge(sixtytwo);
		Portland.addEdge(sixtytwo);
		sixtyone.setTwin(sixtytwo);
		this.routes.add(sixtyone);
		this.routes.add(sixtytwo);
		
		Route sixtythree = new Route(Portland, SanFrancisco, 10, "Green", 5, smallGame);
		Portland.addEdge(sixtythree);
		SanFrancisco.addEdge(sixtythree);
		Route sixtyfour = new Route(Portland, SanFrancisco, 10, "Pink", 5, smallGame);
		Portland.addEdge(sixtyfour);
		SanFrancisco.addEdge(sixtyfour);
		sixtythree.setTwin(sixtyfour);
		this.routes.add(sixtythree);
		this.routes.add(sixtyfour);
		
		Route sixtyfive = new Route(SaltLakeCity, SanFrancisco, 10, "Orange", 5, smallGame);
		SaltLakeCity.addEdge(sixtyfive);
		SanFrancisco.addEdge(sixtyfive);
		Route sixtysix = new Route(SaltLakeCity, SanFrancisco, 10, "White", 5, smallGame);
		SaltLakeCity.addEdge(sixtysix);
		SanFrancisco.addEdge(sixtysix);
		sixtyfive.setTwin(sixtysix);
		this.routes.add(sixtyfive);
		this.routes.add(sixtysix);
		
		Route sixtyseven = new Route(SaltLakeCity, Denver, 4, "Red", 3, smallGame);
		SaltLakeCity.addEdge(sixtyseven);
		Denver.addEdge(sixtyseven);
		Route sixtyeight = new Route(SaltLakeCity, Denver, 4, "Yellow", 3, smallGame);
		SaltLakeCity.addEdge(sixtyeight);
		Denver.addEdge(sixtyeight);
		sixtyseven.setTwin(sixtyeight);
		this.routes.add(sixtyseven);
		this.routes.add(sixtyeight);
		
		Route sixtynine = new Route(SanFrancisco, LosAngeles, 4, "Yellow", 3, smallGame);
		SanFrancisco.addEdge(sixtynine);
		LosAngeles.addEdge(sixtynine);
		Route seventy = new Route(SanFrancisco, LosAngeles, 4, "Pink", 3, smallGame);
		SanFrancisco.addEdge(seventy);
		LosAngeles.addEdge(seventy);
		sixtynine.setTwin(seventy);
		this.routes.add(sixtynine);
		this.routes.add(seventy);
		
		Route seventyone = new Route(Houston, Dallas, 1, "Grey", 1, smallGame);
		Houston.addEdge(seventyone);
		Dallas.addEdge(seventyone);
		Route seventytwo = new Route(Houston, Dallas, 1, "Grey", 1, smallGame);
		Houston.addEdge(seventytwo);
		Dallas.addEdge(seventytwo);
		seventyone.setTwin(seventytwo);
		this.routes.add(seventyone);
		this.routes.add(seventytwo);
		
		Route seventythree = new Route(Dallas, OklahomaCity, 2, "Grey", 2, smallGame);
		Dallas.addEdge(seventythree);
		OklahomaCity.addEdge(seventythree);
		Route seventyfour = new Route(Dallas, OklahomaCity, 2, "Grey", 2, smallGame);
		Dallas.addEdge(seventyfour);
		OklahomaCity.addEdge(seventyfour);
		seventythree.setTwin(seventyfour);
		this.routes.add(seventythree);
		this.routes.add(seventyfour);
		
		Route seventyfive = new Route(NewOrleans, Atlanta, 7, "Yellow", 4, smallGame);
		NewOrleans.addEdge(seventyfive);
		Atlanta.addEdge(seventyfive);
		Route seventysix = new Route(NewOrleans, Atlanta, 7, "Orange", 4, smallGame);
		NewOrleans.addEdge(seventysix);
		Atlanta.addEdge(seventysix);
		seventyfive.setTwin(seventysix);
		this.routes.add(seventyfive);
		this.routes.add(seventysix);
		
		Route seventyseven = new Route(Denver, KansasCity, 7, "Black", 4, smallGame);
		Denver.addEdge(seventyseven);
		KansasCity.addEdge(seventyseven);
		Route seventyeight = new Route(Denver, KansasCity, 7, "Orange", 4, smallGame);
		Denver.addEdge(seventyeight);
		KansasCity.addEdge(seventyeight);
		seventyseven.setTwin(seventyeight);
		this.routes.add(seventyseven);
		this.routes.add(seventyeight);
		
		Route seventynine = new Route(OklahomaCity, KansasCity, 2, "Grey", 2, smallGame);
		OklahomaCity.addEdge(seventynine);
		KansasCity.addEdge(seventynine);
		Route eighty = new Route(OklahomaCity, KansasCity, 2, "Grey", 2, smallGame);
		OklahomaCity.addEdge(eighty);
		KansasCity.addEdge(eighty);
		seventynine.setTwin(eighty);
		this.routes.add(seventynine);
		this.routes.add(eighty);
		
		Route eightyone = new Route(StLouis, KansasCity, 2, "Blue", 2, smallGame);
		StLouis.addEdge(eightyone);
		KansasCity.addEdge(eightyone);
		Route eightytwo = new Route(StLouis, KansasCity, 2, "Pink", 2, smallGame);
		StLouis.addEdge(eightytwo);
		KansasCity.addEdge(eightytwo);
		eightyone.setTwin(eightytwo);
		this.routes.add(eightyone);
		this.routes.add(eightytwo);
		
		Route eightythree = new Route(StLouis, Chicago, 2, "Green", 2, smallGame);
		StLouis.addEdge(eightythree);
		Chicago.addEdge(eightythree);
		Route eightyfour = new Route(StLouis, Chicago, 2, "White", 2, smallGame);
		StLouis.addEdge(eightyfour);
		Chicago.addEdge(eightyfour);
		eightythree.setTwin(eightyfour);
		this.routes.add(eightythree);
		this.routes.add(eightyfour);
		
		Route eightyfive = new Route(KansasCity, Omaha, 1, "Grey", 1, smallGame);
		KansasCity.addEdge(eightyfive);
		Omaha.addEdge(eightyfive);
		Route eightysix = new Route(KansasCity, Omaha, 1, "Grey", 1, smallGame);
		KansasCity.addEdge(eightysix);
		Omaha.addEdge(eightysix);
		eightyfive.setTwin(eightysix);
		this.routes.add(eightyfive);
		this.routes.add(eightysix);
		
		Route eightyseven = new Route(Omaha, Duluth, 2, "Grey", 2, smallGame);
		Omaha.addEdge(eightyseven);
		Duluth.addEdge(eightyseven);
		Route eightyeight = new Route(Omaha, Duluth, 2, "Grey", 2, smallGame);
		Omaha.addEdge(eightyeight);
		Duluth.addEdge(eightyeight);
		eightyseven.setTwin(eightyeight);
		this.routes.add(eightyseven);
		this.routes.add(eightyeight);
		
		Route eightynine = new Route(Atlanta, Raleigh, 2, "Grey", 2, smallGame);
		Atlanta.addEdge(eightynine);
		Raleigh.addEdge(eightynine);
		Route ninety = new Route(Atlanta, Raleigh, 2, "Grey", 2, smallGame);
		Atlanta.addEdge(ninety);
		Raleigh.addEdge(ninety);
		eightynine.setTwin(ninety);
		this.routes.add(eightynine);
		this.routes.add(ninety);
		
		Route ninetyone = new Route(Raleigh, Washington, 2, "Grey", 2, smallGame);
		Raleigh.addEdge(ninetyone);
		Washington.addEdge(ninetyone);
		Route ninetytwo = new Route(Raleigh, Washington, 2, "Grey", 2, smallGame);
		Raleigh.addEdge(ninetytwo);
		Washington.addEdge(ninetytwo);
		ninetyone.setTwin(ninetytwo);
		this.routes.add(ninetyone);
		this.routes.add(ninetytwo);
		
		Route ninetythree = new Route(Washington, NewYork, 2, "Orange", 2, smallGame);
		Washington.addEdge(ninetythree);
		NewYork.addEdge(ninetythree);
		Route ninetyfour = new Route(Washington, NewYork, 2, "Black", 2, smallGame);
		Washington.addEdge(ninetyfour);
		NewYork.addEdge(ninetyfour);
		ninetythree.setTwin(ninetyfour);
		this.routes.add(ninetythree);
		this.routes.add(ninetyfour);
		
		Route ninetysix = new Route(Pittsburgh, Chicago, 4, "Orange", 3, smallGame);
		Pittsburgh.addEdge(ninetysix);
		Chicago.addEdge(ninetysix);
		Route ninetyseven = new Route(Pittsburgh, Chicago, 4, "Black", 3, smallGame);
		Pittsburgh.addEdge(ninetyseven);
		Chicago.addEdge(ninetyseven);
		ninetysix.setTwin(ninetyseven);
		this.routes.add(ninetysix);
		this.routes.add(ninetyseven);
		
		Route ninetyeight = new Route(NewYork, Boston, 2, "Yellow", 2, smallGame);
		NewYork.addEdge(ninetyeight);
		Boston.addEdge(ninetyeight);
		Route ninetynine = new Route(NewYork, Boston, 2, "Red", 2, smallGame);
		NewYork.addEdge(ninetynine);
		Boston.addEdge(ninetynine);
		ninetyeight.setTwin(ninetynine);
		this.routes.add(ninetyeight);
		this.routes.add(ninetynine);
		
		Route onehundred = new Route(Boston, Montreal, 2, "Grey", 2, smallGame);
		Boston.addEdge(onehundred);
		Montreal.addEdge(onehundred);
		Route onehundredone = new Route(Boston, Montreal, 2, "Grey", 2, smallGame);
		Boston.addEdge(onehundredone);
		Montreal.addEdge(onehundredone);
		onehundred.setTwin(onehundredone);
		this.routes.add(onehundred);
		this.routes.add(onehundredone);
		
		
		
	}

	public ArrayList<City> getCities()
	{
		return this.cities;
	}
	
	public ArrayList<Route> getRoutes()
	{
		return this.routes;
	}
	
	public boolean connected(Player p, City a, City b)
	{
		if(a.equals(b))
		{
			this.visitedCities.clear();
			this.visitedEdges.clear();
			return true;
		}

		this.visitedCities.put(a.hashCode(), a);
		
		ArrayList<Route> ownedRoutesA = a.getOwnedEdges();
		if(ownedRoutesA.size() == 0)
			return false;
		
		ArrayList<Route> ownedRoutesB = b.getOwnedEdges();
		if(ownedRoutesB.size() == 0)
			return false;
		
		
		for(int i = 0; i < ownedRoutesA.size(); i++)
		{
			if(ownedRoutesA.get(i).getOwner().equals(p))
			{
				if(!this.visitedEdges.containsValue(ownedRoutesA.get(i)))
				{
					this.visitedEdges.put(ownedRoutesA.get(i).hashCode(), ownedRoutesA.get(i));
					City newA = ownedRoutesA.get(i).getOtherCity(a);
					if(!this.visitedCities.containsValue(newA))
					{
						return connected(p, newA, b);
					}
				}
			}
		}
		
		return false;
	}
	
	public Player longestPathOwner()
	{
		int longestPathLength = 0;
		Player pathOwner = null;
		int currentLongLength;
		for(Player p : this.players)
		{
			currentLongLength = getLongestPathLength(p);
			if(currentLongLength > longestPathLength)
			{
				longestPathLength = currentLongLength;
				pathOwner = p;
			}
		}
		
		return pathOwner;
	}

	private int getLongestPathLength(Player p) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
