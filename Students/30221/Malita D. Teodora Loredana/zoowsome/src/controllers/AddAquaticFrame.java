package controllers;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import views.ZooFrame;

public class AddAquaticFrame extends ZooFrame {
	private JButton crab;
	private JButton solmon;
	private JButton seal;
	public AddAquaticFrame( String title ) {
		super( title);
		contentPanel.setLayout( new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout( slPanel );
		seal = new JButton( "Add seal" );
		slPanel.putConstraint(SpringLayout.NORTH, seal, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, seal, 93, SpringLayout.WEST, pan);
		pan.add(seal );
		solmon = new JButton( "Add solmon" );
		slPanel.putConstraint(SpringLayout.NORTH, solmon, 130, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, solmon, 93, SpringLayout.WEST, pan);
		pan.add( solmon );
		crab = new JButton( "Add crad" );
		slPanel.putConstraint(SpringLayout.NORTH, crab, 195, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, crab, 93, SpringLayout.WEST, pan);
		pan.add( crab );
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
	}
	public void setAddSealButtonActionListener ( ActionListener a) {
		seal.addActionListener(a);
	}
	
	public void setAddCrabButtonActionListener ( ActionListener a) {
		crab.addActionListener(a);
	}
	
	public void setAddSolmonButtonActionListener ( ActionListener a) {
		solmon.addActionListener(a);
	}

}
