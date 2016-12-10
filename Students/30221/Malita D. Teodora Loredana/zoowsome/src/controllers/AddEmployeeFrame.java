package controllers;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import views.ZooFrame;

public class AddEmployeeFrame extends ZooFrame {
	private JButton btnCaretaker;
	public AddEmployeeFrame( String title ) {
		super(title);
		contentPanel.setLayout( new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout( slPanel );
		btnCaretaker = new JButton( "Add Caretaker" );
		slPanel.putConstraint(SpringLayout.NORTH, btnCaretaker, 150, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnCaretaker, 94, SpringLayout.WEST, pan);
		pan.add( btnCaretaker );
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
	}
	public void setAddCaretakerButtonActionListener ( ActionListener a) {
		btnCaretaker.addActionListener(a);
	}

}
