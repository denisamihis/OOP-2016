package controllers;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import views.ZooFrame;

public class AddAnimalFrame extends ZooFrame{
	private JButton mammal;
	private JButton aquatic;
	private JButton bird;
	private JButton insect;
	private JButton reptile;
	public AddAnimalFrame( String title) {
		super(title);
		contentPanel.setLayout( new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout( slPanel );
		mammal = new JButton( "Add Mammal" );
		slPanel.putConstraint(SpringLayout.NORTH, mammal, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, mammal, 93, SpringLayout.WEST, pan);
		pan.add( mammal );
		aquatic = new JButton( "Add Aquatic" );
		slPanel.putConstraint(SpringLayout.NORTH, aquatic, 130, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, aquatic, 93, SpringLayout.WEST, pan);
		pan.add( aquatic );
		reptile = new JButton( "Add Reptile" );
		slPanel.putConstraint(SpringLayout.NORTH, reptile, 195, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, reptile, 93, SpringLayout.WEST, pan);
		pan.add( reptile );
		bird = new JButton( "Add Bird" );
		slPanel.putConstraint(SpringLayout.NORTH, bird, 260, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, bird, 93, SpringLayout.WEST, pan);
		pan.add( bird );
		insect = new JButton( "Add Insect" );
		slPanel.putConstraint(SpringLayout.NORTH, insect, 335, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, insect, 93, SpringLayout.WEST, pan);
		pan.add( insect );
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
	}
	
	public void setAddMammalButtonActionListener ( ActionListener a) {
		mammal.addActionListener(a);
	}
	
	public void setAddInsectButtonActionListener ( ActionListener a) {
		insect.addActionListener(a);
	}
	
	public void setAddBirdButtonActionListener ( ActionListener a) {
		bird.addActionListener(a);
	}
	
	public void setAddReptileButtonActionListener ( ActionListener a) {
		reptile.addActionListener(a);
	}
	
	public void setAddAquaticButtonActionListener ( ActionListener a) {
		aquatic.addActionListener(a);
	}

}
