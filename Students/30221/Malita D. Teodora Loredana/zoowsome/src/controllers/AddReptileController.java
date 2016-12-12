package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.animlas.*;
import models.animlas.Dove;


public class AddReptileController extends AbstractController {
	public AddReptileController( AddReptileFrame addReptileFrame, boolean hasBackButton){
		super(addReptileFrame, hasBackButton);
		addReptileFrame.setAddCrocodileButtonActionListener(new AddCrocodileButtonActionListener());
		addReptileFrame.setAddChamameleonButtonActionListener(new AddChamameleonButtonActionListener());
		addReptileFrame.setAddSnakeButtonActionListener(new AddSnakeButtonActionListener());
	}
	
	private class AddCrocodileButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed( ActionEvent e) {
			zoo.add(new Crocodile());
			System.out.println("Am pus un crocodil:)");
		}
	}
	
	private class AddChamameleonButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed( ActionEvent e) {
			zoo.add(new Chamameleon());
			System.out.println("Am pus un cameleon:)");
		}
	}
	
	private class AddSnakeButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed( ActionEvent e) {
			zoo.add(new Snake());
			System.out.println("Am pus un sarpe:)");
		}
	}

}
