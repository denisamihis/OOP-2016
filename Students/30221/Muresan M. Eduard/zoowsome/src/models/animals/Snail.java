package models.animals;

import java.util.Calendar;

public class Snail extends Insect{
	private int shellLength;
	public Snail()
	{
		super(false, false, "Unknown", 1, 0.1, 0.05);
		shellLength = 0;
	}
	public Snail(String name, int shellLength)
	{
		super(false, false, name, 1, 0.1, 0.05);
		this.shellLength = shellLength;
	}
	//Snails get an interesting predisposition to kill every Thursday
	@Override
	public double getPredisposition()
	{
		Calendar c = Calendar.getInstance();
		c.setTime(c.getTime());
		if (c.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY)
			return 0.3;
		return 0;
	}
	public int getShellLength()
	{
		return shellLength;
	}
	public void setShellLength(int shellLength)
	{
		this.shellLength = shellLength;
	}
}
