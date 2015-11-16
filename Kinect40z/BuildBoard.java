import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Kin'ect 40z game, two player. 
 * Plays Like connect four, but suitable for lushes, alcoholics, winos, and junkies
 * @author C-DUB
 * 
 */

public class BuildBoard extends JFrame implements ActionListener {

	private final int BARHEIGHT = 40;
	private final int MAINWIDTH = 620;
	private final int MAINHEIGHT = 584; 
	private final int SIDEWIDTH = 10; 
	private JFrame frame; 
	private JButton button;
	private JButton theReset;
	private JLabel theLabel;
	private JLabel thePlayer;  
	private boolean[] mickeyList = new boolean[42];
	private boolean[] oldeList = new boolean[42];
	private JButton[] buttonList = new JButton[42];    
	private KinectDriver theDriver;
	private int counter = 1;
	private int[] checker1 = new int[4];
	private int[] checker2 = new int[4];
	private int worldCount = 1;
	ImageIcon player1Image;
	ImageIcon player2Image;  

	/**
	 * Constructor - instantiates image icons, instantiates KinectDriver class to validate winning combos,
	 * creates the frame, and calls the go() method.
	 */
	public BuildBoard() {
		player1Image = new ImageIcon("green-turn.png");
		player2Image = new ImageIcon("red-turn.png");
		theDriver = new KinectDriver();
		//create the frame, set default close, make it non-resizable, pack it
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.pack();
		this.go();
	}

	/**
	 * Meat and potatos method. 
	 */
	public void go() {
		//nullifies both of these arrays so they dont pass the KinectDriver validation	  
		checker1 = null;
		checker2 = null;  

		//creates label and adds it to the frame
		theLabel = new JLabel();  
		ImageIcon labelImage = new ImageIcon("kinect.png");
		theLabel.setLocation(154, 1);
		theLabel.setSize(300, 38);
		theLabel.setOpaque(true);
		theLabel.setIcon(labelImage);   
		frame.getContentPane().add(theLabel);

		//creates label and adds it to the frame   
		thePlayer = new JLabel();   
		thePlayer.setIcon(player1Image);
		thePlayer.setLocation(10, 520);
		thePlayer.setSize(200, 38);
		thePlayer.setOpaque(true);
		frame.getContentPane().add(thePlayer);

		//creates reset button and adds it to the frame
		theReset = new JButton("reset");
		ImageIcon resetImage = new ImageIcon("reset.png");
		theReset.setIcon(resetImage);
		theReset.setOpaque(true);
		theReset.setActionCommand("reset");
		theReset.addActionListener(this);
		theReset.setLayout(null);
		theReset.setBounds(490, 520, 135, 36);
		frame.getContentPane().add(theReset);

		//instantiates the myPanel subclass to color the jframe background blue
		MyIcon myPanel = new MyIcon();

		//builds the board
		getButtons();

		//adds the blue background, sets frame size and visibility
		frame.getContentPane().add(myPanel);  
		frame.setTitle("Kin'ect 40z");
		frame.setSize(MAINWIDTH, MAINHEIGHT);
		frame.setVisible(true);    

		//fills the arrays with false for keeping track of buttons used
		java.util.Arrays.fill(mickeyList, false);
		java.util.Arrays.fill(oldeList, false);
	}

	/**
	 * getButtons method to build the board. Creates the buttons, adds the button to the button Array for easy access,
	 * sets action command to a user-friendly naming scheme, adds action listener, adds to frame.
	 */
	public void getButtons() {
		int count = 0;    
		int x = 10;
		int y = 40;
		for(int rows = 0; rows < 6; rows++) {
			for(int cols = 0; cols < 7; cols++) {
				button = new JButton(new ImageIcon("blank-square.png"));
				buttonList[count] = button;      
				button.setActionCommand("button" + count);
				button.addActionListener(this);    
				button.setLayout(null);
				button.setBounds(x, y, 80, 80);
				frame.getContentPane().add(button);    
				x += 85;
				count++;      
			}
			y += 80;
			x = 10;
		}  
	} 

	/**
	 * @params ActionEvent e
	 * This is the firing method. Checks to see if the source is the reset button, or any of the 42 buttons on the game
	 * board. 
	 */
	public void actionPerformed(ActionEvent e) {	

		//if the reset button fired, reset the board
		if(e.getActionCommand().equals("reset")) {
			resetBoard();
		}	

		//run through all the buttons to see which one fired by checking it against the getActionCommand value
		for(int i = 0; i < 42; i++) {
			if(e.getActionCommand().equals("button" + i) && counter % 2 != 0) {

				//as long as both of the truthLists associated with player1 and player2 are false, change the image,
				//update total count, set the positions in both truthLists to true, then check for winning combos
				if(mickeyList[i] == false && oldeList[i] == false) {
					worldCount++;     
					buttonList[i].setIcon(new ImageIcon("mickey.png"));   
					mickeyList[i] = true;
					thePlayer.setIcon(player2Image);

					//check for horizontal, vertical, or diagonal winning combos by cross referencing the  
					//boolean lists. If there's a winning combo, then theDriver object will return
					//a list of button positions for the win
					checker1 = theDriver.horizontal(mickeyList);     
					if(checker1 != null) {
						winDisable(checker1, 0);
						break;
					}
					checker1 = theDriver.vertical(mickeyList);     
					if(checker1 != null) {
						winDisable(checker1, 0);
						break;
					}
					checker1 = theDriver.diagonalLeft(mickeyList);     
					if(checker1 != null) {
						winDisable(checker1, 0);
						break;
					}
					checker1 = theDriver.diagonalRight(mickeyList);     
					if(checker1 != null) {
						winDisable(checker1, 0);
						break;
					}
					counter++;     
				} else {
					getToolkit().beep();
				}     
			} else if(e.getActionCommand().equals("button" + i) && counter % 2 == 0) {
				if(oldeList[i] == false && mickeyList[i] == false) {
					worldCount++;
					buttonList[i].setIcon(new ImageIcon("olde.png"));
					oldeList[i] = true;
					thePlayer.setIcon(player1Image);

					checker2 = theDriver.horizontal(oldeList);     
					if(checker2 != null) {
						winDisable(checker2, 1);
						break;
					}
					checker2 = theDriver.vertical(oldeList);     
					if(checker2 != null) {
						winDisable(checker2, 1);
						break;
					}
					checker2 = theDriver.diagonalLeft(oldeList);     
					if(checker2 != null) {
						winDisable(checker2, 1);
						break;
					}
					checker2 = theDriver.diagonalRight(oldeList);     
					if(checker2 != null) {
						winDisable(checker2, 1);
						break;
					}
					counter++;     
				} else {
					getToolkit().beep();     
				}
			}    
		}
		
		//if all buttons have been pressed, change label image
		if(worldCount == 43) {
			ImageIcon catsGame = new ImageIcon("cats-game.png");
			thePlayer.setIcon(catsGame);
		}
	}  

	/**
	 * 
	 * @param list
	 * @param player
	 * 
	 * disable method. this method references the winning combination that was passed as a 4-index array,
	 * then it sets all boolean list values to true, changes all button images, and then changes the winning button
	 * images to the winner based on the "player" argument passed
	 */
	public void winDisable(int[] list, int player) {
		if(player == 1) {
			ImageIcon redWins = new ImageIcon("red-wins.png");
			thePlayer.setIcon(redWins);
		} else {
			ImageIcon greenWins = new ImageIcon("green-wins.png");
			thePlayer.setIcon(greenWins);
		}
		for(int i = 0; i < 42; i++) {
			mickeyList[i] = true;
			oldeList[i] = true;
			buttonList[i].setIcon(new ImageIcon("bubble-square.png"));		  
		}
		for(int i = 0; i < 4; i++) {
			if(player == 1) {			  
				buttonList[list[i]].setIcon(new ImageIcon("olde.png"));
			} else {			  
				buttonList[list[i]].setIcon(new ImageIcon("mickey.png"));
			}
		}
	}

	/**
	 * Method to reset the checker Lists, falsifies both boolean lists, resets worldCount, and resets all button images
	 * and the label image.
	 */
	public void resetBoard() {
		checker1 = null;
		checker2 = null;
		java.util.Arrays.fill(mickeyList, false);
		java.util.Arrays.fill(oldeList, false);
		worldCount = 1;
		for(int i = 0; i < 42; i++) {
			buttonList[i].setIcon(new ImageIcon("blank-square.png"));
		}
		thePlayer.setIcon(player1Image);
	}


	/**
	 * MyIcon class for creating the blue rectangle using Graphics g object
	 * @author C-DUB
	 *
	 */
	@SuppressWarnings("serial")
	class MyIcon extends JPanel { 

		public void paintComponent(Graphics g) {
			g.setColor(Color.blue);
			g.fillRect(0, 0, MAINWIDTH, MAINHEIGHT);   
		}  
	}

}





