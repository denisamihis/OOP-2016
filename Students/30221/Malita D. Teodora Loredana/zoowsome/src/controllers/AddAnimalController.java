package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import models.animlas.Animal;
import repositories.AnimalRepository;

public class AddAnimalController extends AbstractController {
	public AddAnimalController ( AddAnimalFrame addAnimalFrame, boolean hasBackButton){
		super(addAnimalFrame, hasBackButton);
		addAnimalFrame.setAddAquaticButtonActionListener(new AddAquaticButtonActionListener());
		addAnimalFrame.setAddBirdButtonActionListener(new AddBirdButtonActionListener());
		addAnimalFrame.setAddMammalButtonActionListener(new AddMammalButtonActionListener());
		addAnimalFrame.setAddReptileButtonActionListener(new AddReptileButtonActionListener());
		addAnimalFrame.setAddInsectButtonActionListener(new AddInsectButtonActionListener());
	}
	
	private class AddAquaticButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed( ActionEvent e) {
			new AddAquaticController( new AddAquaticFrame( "Aquatic" ), true);
		}
	}
	
	private class AddBirdButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed( ActionEvent e) {
			new AddBirdController( new AddBirdFrame( "Bird" ), true);
		}
	}
	
	private class AddMammalButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed( ActionEvent e) {
			new AddMammalController( new AddMammalFrame( "Mammal" ), true);
		}
	}
	
	private class AddReptileButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed( ActionEvent e) {
			new AddReptileController( new AddReptileFrame( "Reptile" ), true);
		}
	}
	
	private class AddInsectButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed( ActionEvent e) {
			new AddInsectController( new AddInsectFrame( "Aquatic" ), true);
		}
	}
}
