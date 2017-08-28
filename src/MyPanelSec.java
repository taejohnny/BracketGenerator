//This panel is what displays when the user selects the 16 bracket generator
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
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

public class MyPanelSec extends JPanel{
	
	private JPanel overallPanel;
	private JLabel intro, followUp;
	private JTextField p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16;
	private JButton enter, back;
	
	//Creates the bracket lines
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.RED);
		
		//Left side horizontal lines
		g.drawLine(205, 105, 265, 105);
		g.drawLine(205, 145, 265, 145);
		g.drawLine(205, 185, 265, 185);
		g.drawLine(205, 225, 265, 225);
		g.drawLine(205, 265, 265, 265);
		g.drawLine(205, 305, 265, 305);
		g.drawLine(205, 345, 265, 345);
		g.drawLine(205, 385, 265, 385);
		
		//Left side vertical lines
		g.drawLine(265, 105, 265, 145);
		g.drawLine(265, 185, 265, 225);
		g.drawLine(265, 265, 265, 305);
		g.drawLine(265, 345, 265, 385);
		
		//Left side horizontal lines (second round)
		g.drawLine(265, 125, 325, 125);
		g.drawLine(265, 205, 325, 205);
		g.drawLine(265, 285, 325, 285);
		g.drawLine(265, 365, 325, 365);
		
		//Left side vertical lines (second round)
		g.drawLine(325, 125, 325, 205);
		g.drawLine(325, 285, 325, 365);
		
		//Left side horizontal lines (third round)
		g.drawLine(325, 165, 405, 165);
		g.drawLine(325, 325, 405, 325);
		
		//Left side vertical line (third round)
		g.drawLine(405, 165, 405, 325);
		
		//Right side horizontal lines 
		g.drawLine(725, 105, 785, 105);
		g.drawLine(725, 145, 785, 145);
		g.drawLine(725, 185, 785, 185);
		g.drawLine(725, 225, 785, 225);
		g.drawLine(725, 265, 785, 265);
		g.drawLine(725, 305, 785, 305);
		g.drawLine(725, 345, 785, 345);
		g.drawLine(725, 385, 785, 385);
		
		//Right side vertical lines
		g.drawLine(725, 105, 725, 145);
		g.drawLine(725, 185, 725, 225);
		g.drawLine(725, 265, 725, 305);
		g.drawLine(725, 345, 725, 385);
		
		//Right side horizontal lines (second round)
		g.drawLine(665, 125, 725, 125);
		g.drawLine(665, 205, 725, 205);
		g.drawLine(665, 285, 725, 285);
		g.drawLine(665, 365, 725, 365);
		
		//Right side vertical lines (second round)
		g.drawLine(665, 125, 665, 205);
		g.drawLine(665, 285, 665, 365);
		
		//Right side horizontal lines (third round)
		g.drawLine(585, 165, 665, 165);
		g.drawLine(585, 325, 665, 325);
		
		//Right side vertical lines (third round)
		g.drawLine(585, 165, 585, 325);
		
		//Final round line
		g.drawLine(405, 245, 585, 245);
	}
	
	public MyPanelSec(){
		createNewView();
	}

	private void createNewView() {
		overallPanel = new JPanel(new BorderLayout());
		overallPanel.setPreferredSize(new Dimension(850, 450));
		overallPanel.setBackground(Color.LIGHT_GRAY);
		
	//West Panel in charge of eight fields on the left of the panel
		JPanel westPanel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
				
		Font biggerFont = new Font("Arial", Font.BOLD, 12);
				
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(0, 0, 15, 0);
		p1 = new JTextField(12); 
		p1.setPreferredSize(new Dimension(100, 25));
		p1.setFont(biggerFont);
		westPanel.add(p1, c);
				
		c.gridx = 0;
		c.gridy = 1;
		p2 = new JTextField(12);
		p2.setPreferredSize(new Dimension(100, 25));
		p2.setFont(biggerFont);
		westPanel.add(p2, c);
				
		c.gridx = 0;
		c.gridy = 2;
		p3 = new JTextField(12);
		p3.setPreferredSize(new Dimension(100, 25));
		p3.setFont(biggerFont);
		westPanel.add(p3, c);
				
		c.gridx = 0;
		c.gridy = 3;
		p4 = new JTextField(12);
		p4.setPreferredSize(new Dimension(100, 25));
		p4.setFont(biggerFont);
		westPanel.add(p4, c);
		
		c.gridx = 0;
		c.gridy = 4;
		p5 = new JTextField(12);
		p5.setPreferredSize(new Dimension(100, 25));
		p5.setFont(biggerFont);
		westPanel.add(p5, c);
		
		c.gridx = 0;
		c.gridy = 5;
		p6 = new JTextField(12);
		p6.setPreferredSize(new Dimension(100, 25));
		p6.setFont(biggerFont);
		westPanel.add(p6, c);
		
		c.gridx = 0;
		c.gridy = 6;
		p7 = new JTextField(12);
		p7.setPreferredSize(new Dimension(100, 25));
		p7.setFont(biggerFont);
		westPanel.add(p7, c);
		
		c.gridx = 0;
		c.gridy = 7;
		p8 = new JTextField(12);
		p8.setPreferredSize(new Dimension(100, 25));
		p8.setFont(biggerFont);
		westPanel.add(p8, c);
		
		overallPanel.add(westPanel, BorderLayout.WEST);
		
	//East Panel in charge of the eight fields on the right of the panel
		JPanel eastPanel = new JPanel(new GridBagLayout());
		
		c.gridx = 0;
		c.gridy = 0;
		p9 = new JTextField(12);
		p9.setPreferredSize(new Dimension(100, 25));
		p9.setFont(biggerFont);
		eastPanel.add(p9, c);
		
		c.gridx = 0;
		c.gridy = 1;
		p10 = new JTextField(12);
		p10.setPreferredSize(new Dimension(100, 25));
		p10.setFont(biggerFont);
		eastPanel.add(p10, c);
		
		c.gridx = 0;
		c.gridy = 2;
		p11 = new JTextField(12);
		p11.setPreferredSize(new Dimension(100, 25));
		p11.setFont(biggerFont);
		eastPanel.add(p11, c);
		
		c.gridx = 0;
		c.gridy = 3;
		p12 = new JTextField(12);
		p12.setPreferredSize(new Dimension(100, 25));
		p12.setFont(biggerFont);
		eastPanel.add(p12, c);
		
		c.gridx = 0;
		c.gridy = 4;
		p13 = new JTextField(12);
		p13.setPreferredSize(new Dimension(100, 25));
		p13.setFont(biggerFont);
		eastPanel.add(p13, c);
		
		c.gridx = 0;
		c.gridy = 5;
		p14 = new JTextField(12);
		p14.setPreferredSize(new Dimension(100, 25));
		p14.setFont(biggerFont);
		eastPanel.add(p14, c);
		
		c.gridx = 0;
		c.gridy = 6;
		p15 = new JTextField(12);
		p15.setPreferredSize(new Dimension(100, 25));
		p15.setFont(biggerFont);
		eastPanel.add(p15, c);
		
		c.gridx = 0;
		c.gridy = 7;
		p16 = new JTextField(12);
		p16.setPreferredSize(new Dimension(100, 25));
		p16.setFont(biggerFont);
		eastPanel.add(p16, c);
		
		overallPanel.add(eastPanel, BorderLayout.EAST);
		
	//North Panel in charge of the title and instructions of the panel
		JPanel northPanel = new JPanel(new GridBagLayout());
		
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(0, 0, 0, 0);
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
		
	//South panel in charge of the back function, which brings the user back to the main menu
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
			String i9 = p9.getText();
			String i10 = p10.getText();
			String i11 = p11.getText();
			String i12 = p12.getText();
			String i13 = p13.getText();
			String i14 = p14.getText();
			String i15 = p15.getText();
			String i16 = p16.getText();
			
			String[] contestants = {i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16};
			int size = 0;
			ArrayList<Integer> methodList = new ArrayList<Integer>(0);
			while(size != 16)
			{
				int randomValue = (int)(Math.random() * 16);
				Integer intValue = new Integer(randomValue);
				for(int i = 0; i < methodList.size(); i++)
				{
					if(methodList.get(i).compareTo(intValue) == 0)
					{
						randomValue = (int)(Math.random() * 16);
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
			p9.setText(contestants[methodList.get(8)]);
			p10.setText(contestants[methodList.get(9)]);
			p11.setText(contestants[methodList.get(10)]);
			p12.setText(contestants[methodList.get(11)]);
			p13.setText(contestants[methodList.get(12)]);
			p14.setText(contestants[methodList.get(13)]);
			p15.setText(contestants[methodList.get(14)]);
			p16.setText(contestants[methodList.get(15)]);
		}
}
