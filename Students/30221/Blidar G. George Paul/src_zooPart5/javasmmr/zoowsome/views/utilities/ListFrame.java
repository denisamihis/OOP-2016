package javasmmr.zoowsome.views.utilities;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javasmmr.zoowsome.views.AnimalList;
import javasmmr.zoowsome.views.EmployeeList;
import javasmmr.zoowsome.views.ZooFrame;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class ListFrame extends ZooFrame {
	
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	
	public ListFrame(String title)
	{
		super(title);
		int noOfAnimals = AnimalList.animalsFromButton.size();
		int noOfEmployees = EmployeeList.employeesFromButton.size();
		for(int i=0;i<noOfAnimals;i++)
		{
			String string = AnimalList.animalsFromButton.get(i).getName();
			System.out.printf("On position %d in AnimalList we have: %s\n",i,string);
		}
		
		System.out.println();
		
		for(int i=0;i<noOfEmployees;i++)
		{
			String string = EmployeeList.employeesFromButton.get(i).getName();
			System.out.printf("On position %d in EmployeeList we have: %s\n",i,string);
		}
		
	}
	
	
}
