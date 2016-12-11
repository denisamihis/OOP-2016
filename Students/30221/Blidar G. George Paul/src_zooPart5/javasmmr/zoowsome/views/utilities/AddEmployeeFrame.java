package javasmmr.zoowsome.views.utilities;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.models.Caretaker;
import javasmmr.zoowsome.views.EmployeeList;
import javasmmr.zoowsome.views.ZooFrame;

import javax.swing.JButton;

public class AddEmployeeFrame extends ZooFrame implements ActionListener {
	
	JButton caretakerButton = new JButton("Add Caretaker");
	EmployeeList employeeList = new EmployeeList();
	
	public AddEmployeeFrame(String title)
	{
		super(title);
		this.setLayout(new BorderLayout());
		this.add(caretakerButton,BorderLayout.SOUTH);
		caretakerButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent evt)
	{
		String string = evt.getActionCommand();
		if(string.equals("Add Caretaker"))
		{
			Caretaker caretaker = new Caretaker();
			employeeList.employeesFromButton.add(caretaker);
		}
	}

}
