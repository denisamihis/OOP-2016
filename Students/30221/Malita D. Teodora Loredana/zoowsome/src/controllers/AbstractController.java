package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import models.animlas.Animal;
import models.employees.Employee;
import repositories.AnimalRepository;
import repositories.EmployeeRepository;
import services.factories.employeeFactory.Constants.Employees;
import views.FrameStack;
import views.ZooFrame;

public class AbstractController {
	protected ZooFrame frame;
	protected static ArrayList<Animal> zoo = null;
	protected static AnimalRepository aR = new AnimalRepository();
	protected static ArrayList<Employee> emp = null;
	protected static EmployeeRepository eR = new EmployeeRepository();
	public AbstractController( ZooFrame frame , boolean hasBackButton) {
		this.frame = frame;
		if ( hasBackButton )
			frame.setBackButtonActionListener( new BackButtonListener() );
		if( zoo == null && emp == null ) {
			try {
				zoo = aR.load();
				emp = eR.load();
				System.out.println("Aici incepe:");
			} catch (ParserConfigurationException | SAXException | IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private class BackButtonListener implements ActionListener {
		@Override
		public void actionPerformed( ActionEvent e ) {
			FrameStack.getInstance().pop();
		}
	}

}
