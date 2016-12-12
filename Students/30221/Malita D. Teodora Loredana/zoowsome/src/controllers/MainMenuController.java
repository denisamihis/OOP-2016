package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.xml.stream.XMLStreamException;

import models.animlas.Animal;
import models.employees.Caretaker;
import models.employees.Employee;

public class MainMenuController extends AbstractController {
	public MainMenuController ( MainMenuFrame frame , boolean hasBackButton ) {
		super( frame, hasBackButton ) ;
		frame.setAddButtonActionListener ( new AddButtonActionListener() );
		frame.setListButtonActionListener( new ListButtonActionListener());
		frame.setSaveAndExitButtonActionListener( new SaveAndExitButtonActionListener());
	}
	
	private class AddButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed( ActionEvent e) {
			new AddController( new AddFrame( "Add" ), true);
		}
	}
	
	private class ListButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed( ActionEvent e) {
			new ListController( new ListFrame("List", zoo), true);
			
		}
	}
	private class SaveAndExitButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed( ActionEvent e) {
			try {
				aR.save(zoo);
				eR.save(emp);
			} catch (FileNotFoundException | XMLStreamException e1) {
				e1.printStackTrace();
			}
			System.exit(1);
		}
	}
}
