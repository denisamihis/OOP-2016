package models.animals;

public class Seahorse extends Aquatic{
	public String specie;
	public Seahorse()
	{
		super(20, water.saltWater, "Unknown");
		specie = "Unknown";
	}
	public Seahorse(String name, String specie)
	{
		super(20, water.saltWater, name);
		this.specie = specie;
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
