import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * MainDriver object. Based on one or two player selection, builds correct board and corresponding driver object
 * @author C-DUB
 * @version 1.0
 */
public class MainDriver extends JFrame implements ActionListener {
	private final JFrame mainFrame;	
	private JButton onePlayer;
	private JButton twoPlayer;	
	private ImageIcon background;
	private JLabel theLabel;
	
	/**
	 * Constructor. Builds JFrame, then JLabel. Adds JLabel. Then build 2 buttons, and add them to JLabel
	 */
	public MainDriver() {
		//build the frame	
		mainFrame = new JFrame();
		mainFrame.setLocationRelativeTo(null);		
		mainFrame.setTitle("Choose Players");
		mainFrame.setSize(200, 75);
		mainFrame.setLocation(600, 300);
		mainFrame.setVisible(true);
		mainFrame.setResizable(false);
		mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//change layout to border so the overlying panel will fill the frame completely
		mainFrame.setLayout(new BorderLayout());
		theLabel = new JLabel(new ImageIcon("blueBack.png"));
		mainFrame.add(theLabel);		
		
		// set JLabel layout to flow(rows/columns)
		theLabel.setLayout(new FlowLayout());
		
		onePlayer = new JButton("One Player");		
		onePlayer.setActionCommand("onePlayer");
		onePlayer.addActionListener(this);		
		theLabel.add(onePlayer);
		
		
		twoPlayer = new JButton("Two Players");		
		twoPlayer.setActionCommand("twoPlayer");
		twoPlayer.addActionListener(this);		
		theLabel.add(twoPlayer);
		
		mainFrame.pack();
	}
	
	/**
	 * ActionEvent method to listen for fires
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("onePlayer")) {
			new BuildBoardComputer();
			mainFrame.setVisible(false);
		} else {
			new BuildBoard();
			mainFrame.setVisible(false);
		}
	}	
	
	/**
	 * Main method to build MainDriver object
	 * @param args, the command line arguments
	 */
	public static void main(String[] args)  {
		new MainDriver();
	}

}
