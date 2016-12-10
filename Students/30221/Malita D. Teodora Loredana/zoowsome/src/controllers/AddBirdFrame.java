package controllers;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import views.ZooFrame;

public class AddBirdFrame extends ZooFrame {
	private JButton dove;
	private JButton eagle;
	private JButton flamingo;
	public AddBirdFrame( String title ) {
		super( title);
		contentPanel.setLayout( new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout( slPanel );
		dove = new JButton( "Add Dove" );
		slPanel.putConstraint(SpringLayout.NORTH, dove, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, dove, 93, SpringLayout.WEST, pan);
		pan.add(dove );
		eagle = new JButton( "Add eagle" );
		slPanel.putConstraint(SpringLayout.NORTH, eagle, 130, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, eagle, 93, SpringLayout.WEST, pan);
		pan.add( eagle );
		flamingo = new JButton( "Add flamingo" );
		slPanel.putConstraint(SpringLayout.NORTH, flamingo, 195, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, flamingo, 93, SpringLayout.WEST, pan);
		pan.add( flamingo );
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
	}
	public void setAddFlamingoButtonActionListener ( ActionListener a) {
		flamingo.addActionListener(a);
	}
	
	public void setAddDoveButtonActionListener ( ActionListener a) {
		dove.addActionListener(a);
	}
	
	public void setAddEagleButtonActionListener ( ActionListener a) {
		eagle.addActionListener(a);
	}
}
	
