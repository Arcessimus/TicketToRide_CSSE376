package TicketToRideMain;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainGame extends JPanel {
	private JLabel label;
	private static final int HEIGHT = 1040;	//720;
	private static final int WIDTH = 1040;	//1040;
	private Graphics2D g2;
	private Image background = null;
	//private JButton trainDeck;
	Game game;
	
	private final int INITIAL_TICKETS=2;
	
	Image blackCar = null;
	Image redCar=null;
	Image blueCar=null;
	Image orangeCar=null;
	Image greenCar=null;
	Image yellowCar=null;
	Image purpleCar=null;
	Image wildCar=null;
	Image whiteCar=null;
	
	Image redTrain=null;
	Image blueTrain=null;
	Image greenTrain=null;
	Image yellowTrain=null;
	Image whiteTrain=null;
	
	
	
	public MainGame(StartMenu frame){
		frame.setSize(WIDTH, HEIGHT);
		//frame.setResizable(false);
		try {
			this.background = ImageIO.read(new File("src/Ticket To Ride Board.jpg"));
		} catch (IOException e) {
			System.out.println("Missing Background image");
			e.printStackTrace();
		}
		
		try {
			blackCar = ImageIO.read(new File("src/Black Car.jpg"));
			blueCar = ImageIO.read(new File("src/Blue Car.jpg"));
			redCar = ImageIO.read(new File("src/Red Car.jpg"));
			purpleCar = ImageIO.read(new File("src/Purple Car.jpg"));
			greenCar = ImageIO.read(new File("src/Green Car.jpg"));
			orangeCar = ImageIO.read(new File("src/Orange Car.jpg"));
			yellowCar = ImageIO.read(new File("src/Yellow Car.jpg"));
			whiteCar = ImageIO.read(new File("src/White Car.jpg"));
			wildCar = ImageIO.read(new File("src/Wild Car.jpg"));
			
			redTrain = ImageIO.read(new File("src/Red Train.png"));
			blueTrain = ImageIO.read(new File("src/Blue Train.png"));
			greenTrain = ImageIO.read(new File("src/Green Train.png"));
			yellowTrain = ImageIO.read(new File("src/Yellow Train.png"));
			whiteTrain = ImageIO.read(new File("src/White Train.png"));
		} catch (IOException e) {
			System.out.println("Missing a train car image");
			e.printStackTrace();
		}
		
		
		
		label = new JLabel(frame.players + " Players ");
		label.setOpaque(true);
		add(label);
		
		game = new Game(frame.players);
		for (int i=0;i<frame.players;i++){
			ticketDraw(INITIAL_TICKETS);
		}
		playerTurn(); 
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g2 = (Graphics2D) g;
		g2.drawImage(background, 0, 0, null);
		g2.drawImage(blackCar, 0,685,null);
		g2.drawImage(blueCar, 0,780,null);
		g2.drawImage(greenCar, 200,685,null);
		g2.drawImage(orangeCar, 200,780,null);
		g2.drawImage(purpleCar, 400,685,null);
		g2.drawImage(redCar, 400,780,null);
		g2.drawImage(whiteCar, 0,875,null);
		g2.drawImage(wildCar, 200,875,null);
		g2.drawImage(yellowCar, 400,875,null);
	}
	
	//
	public void playerTurn(){
		//Display Player Panel
		int playerNumber=game.playerTurn % game.playerNumber;
		Image playerCar=null;
		Player player=game.players.get(playerNumber);
		
		if(playerNumber==0){
			playerCar=redTrain;
		}else if(playerNumber==1){
			playerCar=blueTrain;
		}else if(playerNumber==2){
			playerCar=yellowTrain;
		}else if(playerNumber==3){
			playerCar=greenTrain;
		}else if(playerNumber==4){
			playerCar=whiteTrain;
		}
		JButton button = new JButton(new ImageIcon(playerCar));
		button.setBorder(BorderFactory.createEmptyBorder());
		button.setContentAreaFilled(false);
		
		add(button);
		//g2.drawImage(redTrain, 600,780,null);

	}
	public void ticketDraw(int minimumTicketsKept){
		TicketCard ticket1 = (TicketCard) game.ticketDeck.draw();
		ticketButton button1 =new ticketButton(ticket1);
		add(button1);
		
		//turn on actionListener
		//Game.tickets.draw x3
		//Player.chooseTicket x minTickets
		game.ticketDrawTurn--;
	}
}

class ticketButton extends JButton {
	public ticketButton(TicketCard ticket){
		deckListener listener = new deckListener();
		this.addActionListener(listener);
	}
}

class deckListener implements ActionListener {

	public void actionPerformed(ActionEvent arg0) {
		//something something draw card
		JLabel drawLabel = new JLabel("Card drawn!");
		drawLabel.setOpaque(true);
	}
	
}
