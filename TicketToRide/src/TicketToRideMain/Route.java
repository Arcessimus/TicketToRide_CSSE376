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
	
	public Route(City a, City b, int ptVal, String color, int length)
	{
		this.cities = new ArrayList<City>();
		this.cities.add(a);
		this.cities.add(b);
		
		this.pointValue = ptVal;
		this.color = color;
		this.length = length;
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
	
	
}
