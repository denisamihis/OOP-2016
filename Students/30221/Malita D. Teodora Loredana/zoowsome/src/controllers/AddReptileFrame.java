package controllers;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import views.ZooFrame;

public class AddReptileFrame extends ZooFrame {
	private JButton snake;
	private JButton crocodile;
	private JButton chamameleon;
	public AddReptileFrame( String title ) {
		super( title);
		contentPanel.setLayout( new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout( slPanel );
		snake = new JButton( "Add snake" );
		slPanel.putConstraint(SpringLayout.NORTH, snake, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, snake, 93, SpringLayout.WEST, pan);
		pan.add( snake );
		chamameleon = new JButton( "Add chamemelon" );
		slPanel.putConstraint(SpringLayout.NORTH, chamameleon, 130, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, chamameleon, 93, SpringLayout.WEST, pan);
		pan.add( chamameleon );
		crocodile = new JButton( "Add crocodile" );
		slPanel.putConstraint(SpringLayout.NORTH, crocodile, 195, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, crocodile, 93, SpringLayout.WEST, pan);
		pan.add( crocodile );
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
	}
	public void setAddChamameleonButtonActionListener ( ActionListener a) {
		chamameleon.addActionListener(a);
	}
	
	public void setAddSnakeButtonActionListener ( ActionListener a) {
		snake.addActionListener(a);
	}
	
	public void setAddCrocodileButtonActionListener ( ActionListener a) {
		crocodile.addActionListener(a);
	}
}
	



