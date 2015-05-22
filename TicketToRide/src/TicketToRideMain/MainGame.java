package TicketToRideMain;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
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
	private static final int HEIGHT = 1040; // 720;
	private static final int WIDTH = 1350; // 1040;
	private Graphics2D g2;
	private Image background = null;
	private TicketPanel ticketPanel = null;
	private PlayerPanel playerPanel = null;
	private PlayerTrainCards playerTrainCards;
	//private PlayerTicketCards playerTicketCards;
	
	Game game;

	private final int INITIAL_TICKETS = 2;

	Image blackCar = null;
	Image redCar = null;
	Image blueCar = null;
	Image orangeCar = null;
	Image greenCar = null;
	Image yellowCar = null;
	Image purpleCar = null;
	Image wildCar = null;
	Image whiteCar = null;

	Image redTrain = null;
	Image blueTrain = null;
	Image greenTrain = null;
	Image yellowTrain = null;
	Image whiteTrain = null;
	

	public MainGame(StartMenu frame) {
		frame.setSize(WIDTH, HEIGHT);
		// frame.setResizable(false);
		try {
			this.background = ImageIO.read(new File(
					"src/Ticket To Ride Board.jpg"));
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
		ticketDraw(INITIAL_TICKETS);
		setLayout(null);
	}

	public void nextTurn() {
		if(ticketPanel!=null){
			remove(ticketPanel);
		}
		ticketPanel = null;
		if(playerPanel!=null){
			remove(playerPanel);
		}
		playerPanel=null;
		repaint();
		if (game.ticketDrawTurn > 0) {
			ticketDraw(INITIAL_TICKETS);
		} else {
			playerTurn();
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g2 = (Graphics2D) g;
		g2.drawImage(background, 0, 0, null);
		g2.drawImage(blackCar, 0, 685, null);
		g2.drawImage(blueCar, 0, 780, null);
		g2.drawImage(greenCar, 200, 685, null);
		g2.drawImage(orangeCar, 200, 780, null);
		g2.drawImage(purpleCar, 400, 685, null);
		g2.drawImage(redCar, 400, 780, null);
		g2.drawImage(whiteCar, 0, 875, null);
		g2.drawImage(wildCar, 200, 875, null);
		g2.drawImage(yellowCar, 400, 875, null);
	}

	public void playerTurn() {
		// Display Player Panel
		int playerNumber = game.playerTurn % game.playerNumber;
		Image playerCar = null;
		Player player = game.players.get(playerNumber);

		if (playerNumber == 0) {
			playerCar = redTrain;
		} else if (playerNumber == 1) {
			playerCar = blueTrain;
		} else if (playerNumber == 2) {
			playerCar = yellowTrain;
		} else if (playerNumber == 3) {
			playerCar = greenTrain;
		} else if (playerNumber == 4) {
			playerCar = whiteTrain;
		}
		playerPanel = new PlayerPanel(game.players.get(playerNumber), playerNumber);
		add(playerPanel);
		playerPanel.setPosition();
		playerTrainCards = new PlayerTrainCards(game.players.get(playerNumber));
		add(playerTrainCards);
		//playerTrainCards.setPosition();
		//JButton button = new JButton(new ImageIcon(playerCar));
		//button.setBorder(BorderFactory.createEmptyBorder());
		//button.setContentAreaFilled(false);
		// add actionListener
		//add(button);
		
		// decrement game.turn in a later method
	}
	class PlayerPanel extends JPanel{
		Player player;
		public PlayerPanel(Player currentPlayer, int playerNumber){
			player = currentPlayer;
			this.setLayout(new GridLayout(0, 1));
			JLabel playerIndex = new JLabel("Player " + (playerNumber+1));
			add(playerIndex);
			JLabel turnInstruction = new JLabel("Choose Action");
			add(turnInstruction);
			JButton drawTrainCards = new JButton("Draw Train Car Cards");
			add(drawTrainCards);
			JButton claimRoute = new JButton("Claim a Route");
			add(claimRoute);
			JButton drawTicketCards = new JButton("Draw Destination Tickets");
			drawTicketCards.addActionListener(new drawTicketCardsHandler());
			add(drawTicketCards);
			JLabel currentTickets = new JLabel("Current Destinations");
			add(currentTickets);
			for (ICard ticket : player.tickets){
				String label=((TicketCard)ticket).label+ ":  " +((TicketCard)ticket).pointValue +" Points";
				JButton destination=new JButton(label);
				add (destination);
			}
		}
		public void setPosition() {
			Dimension size = getPreferredSize();
			setBounds(650, 685, size.width, size.height);
			repaint();
			this.getParent().repaint();
			updateUI();
		}
		public void disableAllComponents(){
			for(Component comp : this.getComponents()){
				comp.setEnabled(false);
			}
		}
		class drawTicketCardsHandler implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				disableAllComponents();
				ticketDraw(1);
			}
		}
		class drawTrainCardsHandler implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				//disableAllComponents();
				//TrainDrawMethod;
			}
		}
		class claimRouteHandler implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				//disableAllComponents();
				//claimRouteMethod;
			}
		}
	}
	class PlayerTrainCards extends JPanel{
		Player player;
		public PlayerTrainCards(Player currentPlayer){
			player=currentPlayer;
			this.setLayout(null);
			
		}
	}

	public void ticketDraw(int minimumTicketsKept) {
		int playerNumber = game.playerTurn % game.playerNumber;
		ticketPanel = new TicketPanel(game.players.get(playerNumber),
				minimumTicketsKept);
		add(ticketPanel);
		ticketPanel.setPosition();
		game.ticketDrawTurn--;
		game.playerTurn++;
	}

	class TicketPanel extends JPanel {
		public JButton[] buttons = new JButton[3];
		int minTickets;
		int chosenTickets = 0;

		public TicketPanel(Player player, int minimumTicketsKept) {
			minTickets = minimumTicketsKept;
			this.setLayout(new GridLayout(0, 1));
			JLabel instructionLabel = new JLabel("Choose " + minTickets
					+ " to 3 Tickets");
			add(instructionLabel);
			for (int i = 0; i < 3; i++) {
				TicketCard ticket = (TicketCard) game.ticketDeck.draw();
				JButton button = new JButton(ticket.label+":  "+ticket.pointValue +" Points");
				button.addActionListener(new TicketButtonHandler(player,
						ticket, this, i));
				buttons[i] = button;
				add(button);
			}
		}

		public void choseTicket(int index) {
			chosenTickets++;
			buttons[index].setEnabled(false);
			if (chosenTickets == 3) {
				nextTurn();
			} else if (chosenTickets == minTickets) {
				JButton doneButton = new JButton("Done");
				doneButton.addActionListener(new DoneButtonHandler());
				add(doneButton);
				setPosition();
			}
		}

		public void setPosition() {
			Dimension size = getPreferredSize();
			setBounds(1040, 500, size.width, size.height);
			repaint();
			this.getParent().repaint();
			updateUI();
		}

		class TicketButtonHandler implements ActionListener {
			Player player;
			TicketCard ticket;
			TicketPanel panel;
			int index;

			public TicketButtonHandler(Player currentPlayer,
					TicketCard thisTicket, TicketPanel parent, int cardIndex) {
				player = currentPlayer;
				ticket = thisTicket;
				panel = parent;
				index = cardIndex;
			}

			public void actionPerformed(ActionEvent arg0) {
				player.chooseTicket(ticket);
				panel.choseTicket(index);
			}
		}
		class DoneButtonHandler implements ActionListener{
			public void actionPerformed(ActionEvent arg0) {
				nextTurn();
			}
			
		}
	}
}

class deckListener implements ActionListener {
	public void actionPerformed(ActionEvent arg0) {
		// something something draw card
		JLabel drawLabel = new JLabel("Card drawn!");
		drawLabel.setOpaque(true);
	}
}
