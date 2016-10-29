package models.animals;

import java.util.Calendar;

public class Tiger extends Mammal{
	private String specie;
	public Tiger()
	{
		super(37.5, 0.98, "Unknown", 4, 4.0, 0.9);
		specie = "Unknown";
	}
	public Tiger(String name,String specie)
	{
		super(37.5, 0.98, name, 4, 4.0, 0.9);
		this.specie = specie;
	}
	//Tigers are kind of lazy in the mornings, evenings and at night :)
	@Override
	public double getPredisposition()
	{
		Calendar c = Calendar.getInstance();
		c.setTime(c.getTime());
		if (c.get(Calendar.HOUR_OF_DAY) > 20 && c.get(Calendar.HOUR_OF_DAY) < 10)
			return -0.9;
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
