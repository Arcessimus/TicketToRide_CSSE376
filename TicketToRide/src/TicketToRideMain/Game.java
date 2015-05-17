package TicketToRideMain;

import java.util.ArrayList;

public class Game {
	
	public int playerNumber;
	public ArrayList<Player> players = new ArrayList<Player>();
	public TrainDeck trainDeck;
	public TicketDeck ticketDeck;
	
	//Default Game is two players
	public Game(){
		playerNumber=2;
		startGame();
	}
	
	//Sets players 1-6, else default
	public Game(int newPlayerNumber) {
		if(newPlayerNumber>1 && newPlayerNumber<6){
			playerNumber=newPlayerNumber;
		}else{
			playerNumber=2;
		}
		startGame();
	}
	public void startGame(){
		for(int i=0;i<playerNumber;i++){
			players.add(new Player());
		}
	}
}
