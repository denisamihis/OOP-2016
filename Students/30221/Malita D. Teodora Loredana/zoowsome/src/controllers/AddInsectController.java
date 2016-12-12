package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.animlas.*;


public class AddInsectController extends AbstractController {
	public AddInsectController( AddInsectFrame addInsectFrame, boolean hasBackButton){
		super(addInsectFrame, hasBackButton);
		addInsectFrame.setAddMoschitoButtonActionListener(new AddMoschitoButtonActionListener());
		addInsectFrame.setAddSpiderButtonActionListener(new AddSpiderButtonActionListener());
		addInsectFrame.setAddButterflyButtonActionListener(new AddButterflyButtonActionListener());
	}
	
	private class AddMoschitoButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed( ActionEvent e) {
			zoo.add(new Moschito());
			System.out.println("Am pus un tantar:)");
		}
	}
	
	private class AddSpiderButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed( ActionEvent e) {
			zoo.add(new Spider());
			System.out.println("Am pus un paianjen:)");
		}
	}
	
	private class AddButterflyButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed( ActionEvent e) {
			zoo.add(new Butterfly());
			System.out.println("Am pus un fluture:)");
		}
	}

}