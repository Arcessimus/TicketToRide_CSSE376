package TicketToRideTest;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

import TicketToRideMain.TicketCard;
import TicketToRideMain.TicketDeck;

public class TicketDeckTest {
	
	@Test
	public void testMakeTicketDeck(){
		final int NUMBER_OF_CARDS = 30;
		
		//Text file is of format:
		//Destinations1
		//Points1
		//Destinations2
		//Points2
		//etc...
		
		File inputFile = new File("src/TicketToRideMain/Test_Destination_List");
		Scanner scanner=null;
		try {
			scanner = new Scanner(inputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("No Destination File");
		}
		
		TicketDeck deck = new TicketDeck();
		assertNotNull(deck);
		for (int i=0;i<NUMBER_OF_CARDS;i++){
			TicketCard card =  (TicketCard) deck.getCard(i);
			assertEquals(scanner.nextLine(),card.label);
			assertEquals((int) scanner.nextLong(),card.pointValue);
		}
		
	}
}
