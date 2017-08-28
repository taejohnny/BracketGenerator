//This panel displays when the user selects the eight player bracket
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MyPanel extends JPanel{
	
	private JPanel overallPanel;
	private JLabel intro, followUp;
	private JTextField p1, p2, p3, p4, p5, p6, p7, p8;
	private JButton enter, back;
	
	@Override
	//Creates the bracket lines
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.RED);
		//Left side horizontal lines
		g.drawLine(170, 165, 350, 165);
		g.drawLine(170,	235, 350, 235);
		g.drawLine(170, 305, 350, 305);
		g.drawLine(170, 375, 350, 375);
		
		//Left side vertical lines
		g.drawLine(350, 165, 350, 235);
		g.drawLine(350, 305, 350, 375);
		
		//Left side horizontal lines (second round)
		g.drawLine(350, 200, 430, 200);
		g.drawLine(350, 340, 430, 340);
		
		//Left side vertical line (second round)
		g.drawLine(430, 200, 430, 340);
		
		//Right side horizontal lines
		g.drawLine(640, 165, 715, 165);
		g.drawLine(640, 235, 715, 235);
		g.drawLine(640, 305, 715, 305);
		g.drawLine(640, 375, 715, 375);
		
		//Right side vertical lines
		g.drawLine(640, 165, 640, 235);
		g.drawLine(640, 305, 640, 375);
		
		//Right side horizontal lines (second round)
		g.drawLine(560, 200, 640, 200);
		g.drawLine(560, 340, 640, 340);
		
		//Right side vertical line (second round)
		g.drawLine(560, 200, 560, 340);
		
		//Final horizontal line
		g.drawLine(430, 270, 560, 270);
	}
	
	public MyPanel(){
		createNewView();
	}

	private void createNewView() {
		overallPanel = new JPanel(new BorderLayout());
		overallPanel.setPreferredSize(new Dimension(850, 450));
		overallPanel.setBackground(Color.LIGHT_GRAY);
		
		//West Panel in charge of the the four fields on the left of the panel
		JPanel westPanel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		Font biggerFont = new Font("Arial", Font.BOLD, 18);
		
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(20, 0, 0, 0);
		p1 = new JTextField(12); 
		p1.setPreferredSize(new Dimension(100, 50));
		p1.setFont(biggerFont);
		westPanel.add(p1, c);
		
		c.gridx = 0;
		c.gridy = 1;
		p2 = new JTextField(12);
		p2.setPreferredSize(new Dimension(100, 50));
		p2.setFont(biggerFont);
		westPanel.add(p2, c);
		
		c.gridx = 0;
		c.gridy = 2;
		p3 = new JTextField(12);
		p3.setPreferredSize(new Dimension(100, 50));
		p3.setFont(biggerFont);
		westPanel.add(p3, c);
		
		c.gridx = 0;
		c.gridy = 3;
		p4 = new JTextField(12);
		p4.setPreferredSize(new Dimension(100, 50));
		p4.setFont(biggerFont);
		westPanel.add(p4, c);
		
		overallPanel.add(westPanel, BorderLayout.WEST);
		
		//East Panel in charge of the four fields on the right of the panel
		JPanel eastPanel = new JPanel(new GridBagLayout());
		
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(20, 0, 0, 0);
		p5 = new JTextField(12);
		p5.setPreferredSize(new Dimension(100, 50));
		p5.setFont(biggerFont);
		eastPanel.add(p5, c);
		
		c.gridx = 0;
		c.gridy = 1;
		p6 = new JTextField(12);
		p6.setPreferredSize(new Dimension(100, 50));
		p6.setFont(biggerFont);
		eastPanel.add(p6, c);
		
		c.gridx = 0;
		c.gridy = 2;
		p7 = new JTextField(12);
		p7.setPreferredSize(new Dimension(100, 50));
		p7.setFont(biggerFont);
		eastPanel.add(p7, c);
		
		c.gridx = 0;
		c.gridy = 3;
		p8 = new JTextField(12);
		p8.setPreferredSize(new Dimension(100, 50));
		p8.setFont(biggerFont);
		eastPanel.add(p8, c);
		
		overallPanel.add(eastPanel, BorderLayout.EAST);
		
		//North panel in charge of the title and directions of the panel
		JPanel northPanel = new JPanel(new GridBagLayout());
		
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(15, 0, 0, 0);
		intro = new JLabel("Enter the names of each player/team and press confirm");
		intro.setFont(new Font("Arial", Font.BOLD, 25));
		northPanel.add(intro, c);
		
		c.gridx = 0;
		c.gridy = 1;
		c.insets = new Insets(0, 0, 0, 0);
		followUp = new JLabel("Please be sure to fill all spaces, or else the program will not work correctly");
		followUp.setFont(new Font("Arial", Font.ITALIC, 15));
		northPanel.add(followUp, c);
		
		c.gridx = 0;
		c.gridy = 2;
		enter = new JButton("CONFIRM");
		enter.setFont(new Font("Arial", Font.BOLD, 20));
		enter.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
					applyRandomization();
			}
		});
		northPanel.add(enter, c);
		
		overallPanel.add(northPanel, BorderLayout.NORTH);
		
		//South panel in charge of the back button which brings the user back to the main menu
		JPanel southPanel = new JPanel(new GridBagLayout());
		
		c.gridx = 0;
		c.gridy = 0;
		back = new JButton("BACK");
		back.setFont(new Font("Arial", Font.BOLD, 20));
		back.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MainFrame.getTheFrame().remakeView();
			}
		});
		southPanel.add(back, c);
		
		overallPanel.add(southPanel, BorderLayout.SOUTH);
		
		overallPanel.setOpaque(false);
		this.add(overallPanel);
		
	}
	
	//Algorithm for randomizing the players
	private void applyRandomization(){
		String i1 = p1.getText();
		String i2 = p2.getText();
		String i3 = p3.getText();
		String i4 = p4.getText();
		String i5 = p5.getText();
		String i6 = p6.getText();
		String i7 = p7.getText();
		String i8 = p8.getText();
		
		String[] contestants = {i1, i2, i3, i4, i5, i6, i7, i8};
		int size = 0;
		ArrayList<Integer> methodList = new ArrayList<Integer>(0);
		while(size != 8)
		{
			int randomValue = (int)(Math.random() * 8);
			Integer intValue = new Integer(randomValue);
			for(int i = 0; i < methodList.size(); i++)
			{
				if(methodList.get(i).compareTo(intValue) == 0)
				{
					randomValue = (int)(Math.random() * 8);
					intValue = new Integer(randomValue);
					i = -1;
				}
			}
			methodList.add(intValue);
			size++;
		}
		p1.setText(contestants[methodList.get(0)]);
		p2.setText(contestants[methodList.get(1)]);
		p3.setText(contestants[methodList.get(2)]);
		p4.setText(contestants[methodList.get(3)]);
		p5.setText(contestants[methodList.get(4)]);
		p6.setText(contestants[methodList.get(5)]);
		p7.setText(contestants[methodList.get(6)]);
		p8.setText(contestants[methodList.get(7)]);
	}
	
	
}
