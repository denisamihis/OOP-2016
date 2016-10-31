package models.animals;

import java.util.*;

public class Kangaroo extends Mammal{
	public String specie;
	public Kangaroo()
	{
		super(36.8, 0.98, "Unknown", 2, 3.0, 0.1);
		specie = "Unknown";
	}
	public Kangaroo(String name, String specie)
	{
		super(36.8, 0.98, name, 2, 3.0, 0.1);
		this.specie = specie;
	}
	//Kangaroos hate waking up in the morning
	public double getPredisposition()
	{
		Calendar c = Calendar.getInstance();
		c.setTime(c.getTime());
		if (c.get(Calendar.HOUR_OF_DAY) > 5 && c.get(Calendar.HOUR_OF_DAY) < 9)
			return 0.5;
		return 0;
	}
	public String getSpecie()
	{
		return specie;
	}
	public void setSpecie(String specie)
	{
		this.specie = specie;
	}
}
