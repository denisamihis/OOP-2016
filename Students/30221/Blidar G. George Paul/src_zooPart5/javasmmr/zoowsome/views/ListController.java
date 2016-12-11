package javasmmr.zoowsome.views;

import java.util.ArrayList;

import javasmmr.zoowsome.models.Animal;
import javasmmr.zoowsome.views.utilities.ListFrame;

public class ListController extends AbstractController {
	public ArrayList<Animal> animalsFromButton = new ArrayList<Animal>();

	
	public ListController(ListFrame listFrame,boolean hasBackButton)
	{
		super(listFrame,hasBackButton);
	}

}
