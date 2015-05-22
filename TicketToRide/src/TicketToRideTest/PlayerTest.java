package TicketToRideTest;
import static org.junit.Assert.*;

import org.junit.Test;

import TicketToRideMain.Deck;
import TicketToRideMain.Player;
import TicketToRideMain.TicketCard;
import TicketToRideMain.TrainCard;
import TicketToRideMain.TrainDeck;


public class PlayerTest {

	@Test
	public void testConstructor() {
		Player player = new Player();
		assertNotNull(player);
		assertEquals(45, player.trainCars);
	}
	
	@Test
	public void testDrawCardHand() {
		Player player = new Player();
		Deck deck =new Deck();
		player.drawCardHand(deck);
		
		assertEquals(4,player.cards.size());
	}
	
	@Test
	public void testChooseTicket() {
		Player player = new Player();
		TicketCard card =new TicketCard("Place",15);
		player.chooseTicket(card);
		assertNotNull(player.tickets);
		assertEquals(1,player.tickets.size());
	}
	@Test
	public void testDrawTrainCard(){
		Player player = new Player();
		TrainDeck deck = new TrainDeck();
		player.drawTrainCard(deck);
		assertEquals(1, player.cards.size());
	}
	@Test
	public void testChooseTrainCard() {
		Player player = new Player();
		TrainCard card =new TrainCard(TrainCard.CARD_TYPE.BLUE);
		player.chooseTrainCard(card);
		assertEquals(1,player.cards.size());
	}
	@Test
	public void testCountCardTypes(){
		Player player = new Player();
		TrainCard card1=new TrainCard(TrainCard.CARD_TYPE.BLACK);
		player.cards.add(card1);

		assertEquals(1,player.countCardTypes()[0]);
	}
}
