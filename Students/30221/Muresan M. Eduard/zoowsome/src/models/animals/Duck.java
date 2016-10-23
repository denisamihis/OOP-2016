package models.animals;

import java.awt.Color;

public class Duck extends Bird{
	private Color color;
	public Duck()
	{
		super(true, 300, "Unknown");
		color = null;
	}
	public Duck(String name, Color color)
	{
		super(true, 300, name);
		this.color = color;
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
