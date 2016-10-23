package models.animals;

public class Kangaroo extends Mammal{
	public String specie;
	public Kangaroo()
	{
		super(36.8, 0.98, "Unknown");
		specie = "Unknown";
	}
	public Kangaroo(String name, String specie)
	{
		super(36.8, 0.98, name);
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
