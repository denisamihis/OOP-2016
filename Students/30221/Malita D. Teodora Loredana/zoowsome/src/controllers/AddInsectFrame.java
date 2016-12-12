package controllers;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import views.ZooFrame;

public class AddInsectFrame extends  ZooFrame {
	private JButton moschito;
	private JButton spider;
	private JButton butterfly;
	public AddInsectFrame( String title) {
		super(title);
		contentPanel.setLayout( new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout( slPanel );
		moschito = new JButton( "Add Moschito" );
		slPanel.putConstraint(SpringLayout.NORTH, moschito, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, moschito, 93, SpringLayout.WEST, pan);
		pan.add( moschito );
		spider = new JButton( "Add Spider" );
		slPanel.putConstraint(SpringLayout.NORTH, spider, 130, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, spider, 93, SpringLayout.WEST, pan);
		pan.add( spider );
		butterfly = new JButton( "Add Butterfly" );
		slPanel.putConstraint(SpringLayout.NORTH, butterfly, 195, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, butterfly, 93, SpringLayout.WEST, pan);
		pan.add( butterfly );
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
	}
	public void setAddMoschitoButtonActionListener ( ActionListener a) {
		moschito.addActionListener(a);
	}
	
	public void setAddSpiderButtonActionListener ( ActionListener a) {
		spider.addActionListener(a);
	}
	
	public void setAddButterflyButtonActionListener ( ActionListener a) {
		butterfly.addActionListener(a);
	}
}

