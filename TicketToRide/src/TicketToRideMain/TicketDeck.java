package TicketToRideMain;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketDeck extends Deck {

	public TicketDeck() {
		deck = new ArrayList<ICard>();
		init();
		// this.shuffle();
	}

	protected void init() {
		final int NUMBER_OF_CARDS = 30;

		// Text file is of format:
		// Destinations1
		// Points1
		// Destinations2
		// Points2
		// etc...

		File inputFile = new File("src/TicketToRideMain/Test_Destination_List.txt");
		Scanner scanner = null;
		try {
			scanner = new Scanner(inputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("No Destination File");
		}
		
		for (int i = 0; i < NUMBER_OF_CARDS; i++) {
			String label = scanner.nextLine();
			String stringPoints =  scanner.nextLine();
			int points =Integer.parseInt(stringPoints);
			TicketCard card =new TicketCard(label,points);
			deck.add(card);
		}
		scanner.close();
	}
}
