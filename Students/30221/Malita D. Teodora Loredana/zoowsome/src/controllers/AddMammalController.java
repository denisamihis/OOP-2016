package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.animlas.*;
import models.animlas.Dove;



public class AddMammalController  extends AbstractController {
	public AddMammalController( AddMammalFrame addMammalFrame, boolean hasBackButton){
		super(addMammalFrame, hasBackButton);
		addMammalFrame.setAddCatButtonActionListener(new AddCatButtonActionListener());
		addMammalFrame.setAddDogButtonActionListener(new AddDogButtonActionListener());
		addMammalFrame.setAddTigerButtonActionListener(new AddTigerButtonActionListener());
	}
	
	private class AddCatButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed( ActionEvent e) {
			zoo.add(new Cat());
		System.out.println("Am pus o pisicuta:)");
		}
	}
	
	private class AddDogButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed( ActionEvent e) {
			zoo.add(new Dog());
			System.out.println("Am pus un catel(pe Snow de preferat!):)");
		}
	}
	
	private class AddTigerButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed( ActionEvent e) {
			zoo.add(new Tiger());
			System.out.println("Am pus un tigruletisorut:)");
		}
	}
}
