package models.animals;

public class Seahorse extends Aquatic{
	public String specie;
	public Seahorse()
	{
		super(20, water.saltWater, "Unknown", 1, 1.0, 0.1);
		specie = "Unknown";
	}
	public Seahorse(String name, String specie)
	{
		super(20, water.saltWater, name, 1, 1.0, 0.1);
		this.specie = specie;
	}
	//these are a bit lethal at all times :)
	public String getSpecie()
	{
		return specie;
	}
	public void setSpecie(String specie)
	{
		this.specie = specie;
	}
}
