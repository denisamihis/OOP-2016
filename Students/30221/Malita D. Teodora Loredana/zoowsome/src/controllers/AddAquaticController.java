package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.animlas.*;



public class AddAquaticController extends AbstractController {
	public AddAquaticController( AddAquaticFrame addAquaticFrame, boolean hasBackButton){
		super(addAquaticFrame, hasBackButton);
		addAquaticFrame.setAddCrabButtonActionListener(new AddCrabButtonActionListener());
		addAquaticFrame.setAddSealButtonActionListener(new AddSealButtonActionListener());
		addAquaticFrame.setAddSolmonButtonActionListener(new AddSolmonButtonActionListener());
	}
	
	private class AddCrabButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed( ActionEvent e) {
			zoo.add(new Crab());
			System.out.println("Am pus un crab:)");
		}
	}
	
	private class AddSealButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed( ActionEvent e) {
			zoo.add(new Seal());
			System.out.println("Am pus o foca:)");
		}
	}
	
	private class AddSolmonButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed( ActionEvent e) {
			zoo.add(new Solmon());
			System.out.println("Am pus un somon:)");
		}
	}
}
