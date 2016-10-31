package models.animals;

public class Flamingo extends Bird{
	private String specie;
	public Flamingo()
	{
		super(true, 300, "Unknown", 2, 2.0, 0.1);
		specie = "Unknown";
	}
	public Flamingo(String name, String specie)
	{
		super(true, 300, name, 2, 2.0, 0.1);
		this.specie = specie;
	}
	//Flamingos kill when they feel like it
	public String getSpecie()
	{
		return specie;
	}
	public void setSpecie(String specie)
	{
		this.specie = specie;
	}
}
