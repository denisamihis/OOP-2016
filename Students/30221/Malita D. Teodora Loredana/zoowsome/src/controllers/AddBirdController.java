package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.animlas.*;

public class AddBirdController extends AbstractController {
	public AddBirdController( AddBirdFrame addBirdFrame, boolean hasBackButton){
		super(addBirdFrame, hasBackButton);
		addBirdFrame.setAddFlamingoButtonActionListener(new AddFlamingoButtonActionListener());
		addBirdFrame.setAddEagleButtonActionListener(new AddEagleButtonActionListener());
		addBirdFrame.setAddDoveButtonActionListener(new AddDoveButtonActionListener());
	}
	
	private class AddFlamingoButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed( ActionEvent e) {
			zoo.add(new Flamingo());
			System.out.println("Am pus un flamingo:)");
		}
	}
	
	private class AddEagleButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed( ActionEvent e) {
			zoo.add(new Eagle());
			System.out.println("Am pus un vultur:)");
		}
	}
	
	private class AddDoveButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed( ActionEvent e) {
			zoo.add(new Dove());
			System.out.println("Am pus un porumbel:)");
		}
	}
}

