import javax.swing.*;
import java.awt.event.*;

public class StartMenu extends JFrame{
	private JLabel title;
	private JButton startButton;
	private static final int HEIGHT=500;
	private static final int WIDTH=500;
	
	private StartButtonHandler startButtonHandler;
	
	public StartMenu(){
		title=new JLabel("Welcome to Ticket to Ride!");
		startButton=new JButton("Start Game");
		startButtonHandler = new StartButtonHandler();
		
		startButton.addActionListener(startButtonHandler);
		
		add(title);
		add(startButton);
		
		setTitle("Ticket to Ride");
		setSize(HEIGHT,WIDTH);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}

class StartButtonHandler implements ActionListener{
	public void actionPerformed(ActionEvent e){
		MainGame game = new MainGame();
	}
}