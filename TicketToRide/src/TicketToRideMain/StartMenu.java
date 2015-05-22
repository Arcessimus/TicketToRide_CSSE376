package TicketToRideMain;
import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class StartMenu extends JFrame {
	private JLabel title;
	private static final int HEIGHT = 638;
	private static final int WIDTH = 610;
	private JPanel startPanel;
	
	public int players;

	public StartMenu() {

		setTitle("Ticket to Ride");
		setSize(WIDTH, HEIGHT);
		
		startPanel = new StartPanel(this);
		add(startPanel);
		
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	public void startGame(){
		remove(startPanel);
		MainGame game = new MainGame(this);
		add(game);
	}

	class StartPanel extends JPanel {
		private Graphics2D g2;
		private Image background = null;

		public StartPanel(JFrame frame) {
			try {
				this.background = ImageIO.read(new File(
						"src/Ticket To Ride Box.jpg"));
			} catch (IOException ex) {
				System.out.println("Where's the background?");
			}
			
			
			setLayout(null);
			for(int i=2;i<6;i++){
				JButton startButton = new JButton(i + " Players");
				StartButtonHandler startButtonHandler = new StartButtonHandler(i);
				startButton.addActionListener(startButtonHandler);
				add(startButton);
				Insets insets = getInsets();
				Dimension size = startButton.getPreferredSize();
				startButton.setBounds(500+insets.left, 160+50*i + insets.top,
			             size.width, size.height);
			}
		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g2 = (Graphics2D) g;
			g2.drawImage(background, 0, 0, null);
		}
	}

	class StartButtonHandler implements ActionListener {
		int playerNumber;
		public StartButtonHandler(int playerNumber){
			this.playerNumber=playerNumber;
		}
		public void actionPerformed(ActionEvent e) {
			players=playerNumber;
			startGame();
		}
	}
}
