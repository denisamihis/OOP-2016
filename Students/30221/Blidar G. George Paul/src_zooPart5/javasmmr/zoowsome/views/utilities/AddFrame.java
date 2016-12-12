package javasmmr.zoowsome.views.utilities;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.views.ZooFrame;

import javax.swing.JButton;

public class AddFrame extends ZooFrame {
	
	JButton addAnimal = new JButton ("Add Animal");
	JButton addEmployee = new JButton ("Add Employee");
	
	public AddFrame(String title)
	{
		super(title);
		this.setLayout(new BorderLayout());
		this.add(addAnimal,BorderLayout.WEST);
		this.add(addEmployee,BorderLayout.EAST);
	}
	
	public void setAddAnimalButtonActionListener(ActionListener a)
	{
		addAnimal.addActionListener(a);
	}
	
	public void setAddEmployeeButtonActionListener(ActionListener a)
	{
		addEmployee.addActionListener(a);
	}
}
