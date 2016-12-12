package controllers;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import views.ZooFrame;

public class AddFrame extends ZooFrame {
	private JButton btnAddAnimal;
	private JButton btnAddEmployee;
	public AddFrame(String title) {
		super(title);
		contentPanel.setLayout( new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout( slPanel );
		btnAddAnimal = new JButton( "Add Animal" );
		slPanel.putConstraint(SpringLayout.NORTH, btnAddAnimal, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnAddAnimal, 93, SpringLayout.WEST, pan);
		pan.add( btnAddAnimal );
		btnAddEmployee = new JButton( "Add Employee" );
		slPanel.putConstraint(SpringLayout.NORTH, btnAddEmployee, 150, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnAddEmployee, 94, SpringLayout.WEST, pan);
		pan.add( btnAddEmployee );
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
	}
	public void setAddAnimalButtonActionListener ( ActionListener a) {
		btnAddAnimal.addActionListener(a);
	}
	public void setAddEmployeeButtonActionListener ( ActionListener a) {
		btnAddEmployee.addActionListener(a);
	}
}
