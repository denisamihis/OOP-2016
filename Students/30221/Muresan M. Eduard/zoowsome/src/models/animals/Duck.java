package models.animals;

import java.awt.Color;
import java.util.*;

public class Duck extends Bird{
	private Color color;
	public Duck()
	{
		super(true, 300, "Unknown", 2, 2.0, 0.1);
		color = null;
	}
	public Duck(String name, Color color)
	{
		super(true, 300, name, 2, 2.0, 0.1);
		this.color = color;
	}
	//Ducks apparently get a thirst for blood on Tuesdays
	@Override
	public double getPredisposition()
	{
		Calendar c = Calendar.getInstance();
		c.setTime(c.getTime());
		if (c.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY)
			return 0.5;
		return 0;
		
	}
	public Color getColor()
	{
		return color;
	}
	public void setColor(Color color)
	{
		this.color = color;
	}
}
