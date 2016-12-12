package controllers;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import views.ZooFrame;

public class AddMammalFrame extends ZooFrame {
	private JButton cat;
	private JButton dog;
	private JButton tiger;
	public AddMammalFrame( String title) {
		super(title);
		contentPanel.setLayout( new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout( slPanel );
		cat = new JButton( "Add Cat" );
		slPanel.putConstraint(SpringLayout.NORTH,cat, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,cat, 93, SpringLayout.WEST, pan);
		pan.add(cat );
		dog = new JButton( "Add dog" );
		slPanel.putConstraint(SpringLayout.NORTH, dog, 130, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, dog, 93, SpringLayout.WEST, pan);
		pan.add( dog );
		tiger = new JButton( "Add tiger" );
		slPanel.putConstraint(SpringLayout.NORTH, tiger, 195, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, tiger, 93, SpringLayout.WEST, pan);
		pan.add( tiger );
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
	}
	public void setAddCatButtonActionListener ( ActionListener a) {
		cat.addActionListener(a);
	}
	
	public void setAddDogButtonActionListener ( ActionListener a) {
		dog.addActionListener(a);
	}
	
	public void setAddTigerButtonActionListener ( ActionListener a) {
		tiger.addActionListener(a);
	}
}
