import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class StartMenu extends JFrame{
	private JLabel Title;
	private JButton StartButton;
	private static final HEIGHT=500;
	private static final WIDTH=500;
	
	private StartButtonHandler startButtonHandler;
	
	public StartMenu(){
		Title=new JLabel("Ticket to Ride");
		startButton=new JButton("Start Game");
		startButtonHandler = new StartButtonHandler();
		
		startButton.addActionListener(startButtonHandler);
		
		setTitle("CSSE376");
		setSize(HEIGHT,WIDTH);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}

private class StartButtonHandler implements ActionListener{
	public void actionPerformed(ActionEvent e){
		//will start game
	}
}