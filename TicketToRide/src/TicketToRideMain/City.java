package TicketToRideMain;

import java.util.ArrayList;

public class City {

	String name;
	ArrayList<Route> edges;
	//ArrayList<City> adjacentCities;
	
	public City(String name)
	{
		this.name = name;
		this.edges = new ArrayList<Route>();
		//this.adjacentCities = new ArrayList<City>();
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public ArrayList<Route> getEdges()
	{
		return this.edges;
	}
	
//	public ArrayList<City> getAdjacentCities()
//	{
//		return this.adjacentCities;
//	}
	
	public void addEdge(Route e)
	{
		this.edges.add(e);
	}
	
	public ArrayList<Route> getOwnedEdges()
	{
		ArrayList<Route> ownedEdges = new ArrayList<Route>();
		for(int i = 0; i < this.edges.size(); i++)
		{
			if(this.edges.get(i).owned == 1)
			{
				ownedEdges.add(this.edges.get(i));
			}
		}
		
		return ownedEdges;
	}
}
