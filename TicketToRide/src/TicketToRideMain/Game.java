package TicketToRideMain;

import java.util.ArrayList;

public class Game {
	
	public int playerNumber;
	public ArrayList<Player> players = new ArrayList<Player>();
	
	//Default Game is two players
	public Game(){
		playerNumber=2;
	}
	
	//Sets players 1-6, else default
	public Game(int newPlayerNumber) {
		if(newPlayerNumber>1 && newPlayerNumber<6){
			playerNumber=newPlayerNumber;
		}else{
			playerNumber=2;
		}
	}
	public void StartGame(){

	}
}
