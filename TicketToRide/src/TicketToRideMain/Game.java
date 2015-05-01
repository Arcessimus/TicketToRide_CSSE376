package TicketToRideMain;

public class Game {
	
	public int players;
	
	//Default Game is two players
	public Game(){
		players=2;
	}
	
	//Sets players 1-6, else default
	public Game(int playerNumber) {
		if(playerNumber>1 && playerNumber<6){
			players=playerNumber;
		}else{
			players=2;
		}
	}
}
