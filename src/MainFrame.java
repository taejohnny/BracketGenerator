/*This program is essentially a random bracket generator, which accounts for either 8 players/teams or 16 players/teams.
 * I wanted to create this program because of personal use in my daily life. Being a fan of sports and video games, there
 * are more than several occasions where my friends and I would want to compete in a soccer tournament (be it in real life 
 * or in a video game) where it would be difficult to find a way to face off against each other. Thus, I had this idea of
 * creating a bracket generator where, in the event of entering names in a bracket, those players/teams would be completely
 * randomized, making for a fun and exciting match up every time. Now, I am aware that there are many programs out there 
 * that due very similar functions when you simply type in "bracket generator" into google, but I wanted to go through 
 * the experience and attempt to figure out the algorithm and corresponding visual output of program such as this. I am 
 * happy that I was able to not only complete a program that I set a goal for, but that I can also use this in my upcoming \
 * late night college days.*/
   
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MainFrame extends JFrame{

		//Menu screen components
		private JLabel title, or, eightTeam, sixteenTeam, lineSep;
		private JButton eightButton, sixteenButton;
		private JPanel mainPanel = new JPanel(new BorderLayout());
		private static MainFrame mFrame;
	
		public static void main(String[] args){
			SwingUtilities.invokeLater(new Runnable(){
				@Override
				public void run() {
					mFrame = new MainFrame();
				}
			});
		}
		
		public static MainFrame getTheFrame(){
			return mFrame;
		}
		
		//This method will be called when the user presses back in one of the 8 or 16 player panels, which will essentially
		//recreate the menu screen again.
		public void remakeView(){
			mFrame.getContentPane().removeAll();
			mFrame.getContentPane().add(mainPanel);
			mFrame.repaint();
			mFrame.validate();
		}
		
		public void createView(){
			
			//JPanel mainPanel = new JPanel(new BorderLayout());
			mainPanel.setBackground(Color.GRAY);
			getContentPane().add(mainPanel);
			
			Font basicFont = (new Font("Arial", Font.BOLD, 20));
			
			//North panel that is in charge of the title 
			JPanel centerPanel = new JPanel(new GridBagLayout());
			GridBagConstraints c = new GridBagConstraints();
			
			JPanel northPanel = new JPanel(new GridBagLayout());
			c.gridx = 0;
			c.gridy = 0;
			title = new JLabel("8 and 16 player bracket generator");
			title.setFont(new Font("Arial", Font.BOLD, 30));
			northPanel.add(title, c);
			
			c.gridx = 0;
			c.gridy = 1;
			JLabel lineSep = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			northPanel.add(lineSep, c);
			
			mainPanel.add(northPanel, BorderLayout.NORTH);
			
			//Center Panel that is in charge of the components of this program, as well as the buttons
			c.gridx = 0;
			c.gridy = 0;
			eightTeam = new JLabel("Select 8 player generator if you want a randomly generated, 8 team/player bracket");
			eightTeam.setFont(basicFont);
			centerPanel.add(eightTeam, c);
			
			c.gridx = 0;
			c.gridy = 2;
			or = new JLabel("OR");
			or.setFont(new Font("Arial", Font.BOLD, 30));
			centerPanel.add(or, c);
			
			c.gridx = 0;
			c.gridy = 3;
			sixteenTeam = new JLabel("Select 16 player generator if you want a randomly generated, 16 team/player bracket");
			sixteenTeam.setFont(basicFont);
			centerPanel.add(sixteenTeam, c);
			
			c.gridx = 0;
			c.gridy = 1;
			eightButton = new JButton("8 player generator");
			eightButton.setFont(basicFont);
			//When the button is pressed, the 8 player panel will display on screen
			eightButton.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					MyPanel eightPanel = new MyPanel();
					getContentPane().remove(mainPanel);
					getContentPane().add(eightPanel);
					validate();
				}
			});
			centerPanel.add(eightButton, c);
			
			c.gridx = 0;
			c.gridy = 4;
			sixteenButton = new JButton("16 player generator");
			sixteenButton.setFont(basicFont);
			//When the button is pressed, the 16 player panel will display on screen
			sixteenButton.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					MyPanelSec sixteenPanel = new MyPanelSec();
					getContentPane().remove(mainPanel);
					getContentPane().add(sixteenPanel);
					validate();
				}
			});
			centerPanel.add(sixteenButton, c);
			
			mainPanel.add(centerPanel);
		}
		
		//The size and options of the main frame
		public MainFrame() {
			createView();
			
			setTitle("8 and 16 player bracket generator");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setResizable(false);
			setSize(1000, 600);
			//pack();
			setLocationRelativeTo(null);
			setVisible(true);
		}

	
}
