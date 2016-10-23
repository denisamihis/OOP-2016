package models.animals;

public class Flamingo extends Bird{
	private String specie;
	public Flamingo()
	{
		super(true, 300, "Unknown");
		specie = "Unknown";
	}
	public Flamingo(String name, String specie)
	{
		super(true, 300, name);
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
