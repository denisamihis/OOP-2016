package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import models.employees.Caretaker;




public class AddEmployeeController extends AbstractController {
	public AddEmployeeController ( AddEmployeeFrame addEmployeeFrame, boolean hasBackButton){
		super(addEmployeeFrame, hasBackButton);
		addEmployeeFrame.setAddCaretakerButtonActionListener ( new AddCaretakerButtonActionListener() );
		}
		
		private class AddCaretakerButtonActionListener implements ActionListener {
			@Override
			public void actionPerformed( ActionEvent e) {
				emp.add(new Caretaker());
				System.out.println("Ingrijitor");
			}
		}
}
