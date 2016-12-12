package javasmmr.zoowsome.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.views.utilities.AddAnimalFrame;
import javasmmr.zoowsome.views.utilities.AddEmployeeFrame;
import javasmmr.zoowsome.views.utilities.AddFrame;

public class AddController extends AbstractController {
	
	public AddController(AddFrame addFrame, boolean hasBackButton)
	{
		super(addFrame, hasBackButton);
		addFrame.setAddAnimalButtonActionListener(new AddAnimalButtonActionListener());
		addFrame.setAddEmployeeButtonActionListener(new AddEmployeeButtonActionListener());
	}
	
	private class AddAnimalButtonActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent evt)
		{
			new AddAnimalController(new AddAnimalFrame("Add Animal"),true);
		}
	}
	
	private class AddEmployeeButtonActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent evt)
		{
			new AddEmployeeController(new AddEmployeeFrame("Add Employee"),true);
		}
	}
}


