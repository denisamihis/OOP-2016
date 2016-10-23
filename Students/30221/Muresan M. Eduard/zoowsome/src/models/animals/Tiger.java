package models.animals;

public class Tiger extends Mammal{
	private String specie;
	public Tiger()
	{
		super(37.5, 0.98, "Unknown");
		specie = "Unknown";
	}
	public Tiger(String name,String specie)
	{
		super(37.5, 0.98, name);
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
