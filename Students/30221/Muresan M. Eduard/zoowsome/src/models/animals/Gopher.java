package models.animals;

import java.util.Calendar;

public class Gopher extends Mammal{
	private String shape;
	public Gopher()
	{
		super(37, 0.99, "Unknown", 4, 1.15, 0.1);
		shape = "Gopher shape";
	}
	public Gopher(String name)
	{
		super(37, 0.99, name, 4, 1.15, 0.1);
		shape = "Gopher shape";
	}
	//Gophers get drunk Friday nights so they get aggressive
	@Override
	public double getPredisposition()
	{
		Calendar c = Calendar.getInstance();
		c.setTime(c.getTime());
		if (c.get(Calendar.HOUR_OF_DAY) > 18 && c.get(Calendar.HOUR_OF_DAY) < 23 && c.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY)
			return 0.3;
		return 0;
	}
	public String getShape()
	{
		return shape;
	}
	public void setShape(String shape)
	{
		this.shape = shape;
	}
}
