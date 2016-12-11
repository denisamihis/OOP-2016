package javasmmr.zoowsome.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.views.utilities.AddFrame;
import javasmmr.zoowsome.views.utilities.ListFrame;

public class MainMenuController extends AbstractController {
	
	public MainMenuController(MainMenuFrame frame, boolean hasBackButton)
	{
		super(frame,hasBackButton);
		frame.setAddButtonActionListener(new AddButtonActionListener());
		frame.setListButtonActionListener(new AddListButtonActionListener());
	}
	
	private class AddButtonActionListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			new AddController(new AddFrame("Add"),true);
		}
		
	}
	
	private class AddListButtonActionListener implements ActionListener 
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			new ListController(new ListFrame("List"),true);
		}
	}

}
