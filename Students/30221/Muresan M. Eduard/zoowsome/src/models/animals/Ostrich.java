package models.animals;

public class Ostrich extends Bird{
	private boolean headInSand;
	public Ostrich()
	{
		super(true, 0, "Unknown");
		headInSand = false;
	}
	public Ostrich(String name, boolean headInSand)
	{
		super(true, 0, name);
		this.headInSand = headInSand;
	}
	public boolean getHeadInSand()
	{
		return headInSand;
	}
	public void setHeadInSand(boolean headInSand)
	{
		this.headInSand = headInSand;
	}
}
