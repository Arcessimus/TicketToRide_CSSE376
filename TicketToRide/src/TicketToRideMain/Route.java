package TicketToRideMain;

import java.util.ArrayList;


//the purpose of this class is to calculate individual, singular routes between two adjacent cities
public class Route {
	
	Player owner;
	String color;
	int pointValue; 
	ArrayList<City> cities;
	int length;
	
	boolean hasTwin;
	boolean smallGame;
	int owned;
	Route twin;
	
	public Route() {
		this.cities = new ArrayList<City>();
		
		this.pointValue = 0;
		this.color = "none";
		this.length = 1;
	}
	
	public Route(City a, City b, int ptVal, String color, int length, boolean smallGame)
	{
		this.cities = new ArrayList<City>();
		this.cities.add(a);
		this.cities.add(b);
		
		this.pointValue = ptVal;
		this.color = color;
		this.length = length;
		
		this.hasTwin = false;
		this.owned = 0;
		
		this.smallGame = smallGame;
	}
	
	public void setOwner(Player p) {
		this.owner = p;
		this.setOwned(1);
		
		if(this.smallGame && this.hasTwin) {
			this.twin.setOwned(-1);
		}
	}

	private void setOwned(int i) {
		this.owned = i;
	}
	
	public void setTwin(Route twin)
	{
		this.hasTwin = true;
		this.twin = twin;
		twin.hasTwin = true;
		twin.twin = this;
	}

	public ArrayList<City> getCities() {
		return this.cities;
	}

	public int getPoints() {
		return this.pointValue;
	}

	public String getColor() {
		return this.color;
	}

	public int getLength() {
		return this.length;
	}
	
	public Player getOwner()
	{
		return this.owner;
	}


	public int owned() {
		return this.owned;
	}

	public boolean hasTwin() {
		return this.hasTwin;
	}
	

	public Route getTwin() {
		return this.twin;
	}

	
	public boolean isSmallGame() {
		return this.smallGame;
	}
	

	public City getOtherCity(City a) {
		if(a.equals(this.cities.get(0)))
			return this.cities.get(1);
		
		return this.cities.get(0);
	}
	
}
