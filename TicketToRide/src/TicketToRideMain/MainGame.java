package TicketToRideMain;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainGame extends JPanel {
	private JLabel label;
	private static final int HEIGHT = 720;
	private static final int WIDTH = 1040;
	private Graphics2D g2;
	private Image background = null;
	private JButton trainDeck;

	public MainGame(StartMenu frame) {
		frame.setSize(WIDTH, HEIGHT);

		try {
			this.background = ImageIO.read(new File(
					"src/Ticket To Ride Board.jpg"));
		} catch (IOException ex) {
			System.out.println("Where's the background?");
		}

		label = new JLabel(frame.players + " Players ");
		label.setOpaque(true);
		add(label);

		Game game = new Game(frame.players);
		playerTurn(1); //Starts with player 1
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g2 = (Graphics2D) g;
		g2.drawImage(background, 0, 0, null);
	}
	
	//
	public void playerTurn(int playerNumber){
		//Display Player Panel
	}
}

class deckListener implements ActionListener {

	public void actionPerformed(ActionEvent arg0) {
		//something something draw card
		JLabel drawLabel = new JLabel("Card drawn!");
		drawLabel.setOpaque(true);
	}
	
}
