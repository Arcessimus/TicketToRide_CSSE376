package TicketToRideMain;

import java.awt.Color;
import java.util.ArrayList;

public class Game {
	
	public int playerNumber;
	public ArrayList<Player> players = new ArrayList<Player>();
	public TrainDeck trainDeck;
	public TicketDeck ticketDeck;
	
	public int playerTurn;
	public int ticketDrawTurn;
	public int finalTurn;
	
	
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
	private void startGame(){
		trainDeck =new TrainDeck();
		trainDeck.shuffle();
		ticketDeck = new TicketDeck();
		ticketDeck.shuffle();
		
		for(int i=0;i<playerNumber;i++){
			players.add(new Player());
			players.get(i).drawCardHand(trainDeck);
		}
		ticketDrawTurn=playerNumber;
	}
}
