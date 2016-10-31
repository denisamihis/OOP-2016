package models.animals;

public class Ostrich extends Bird{
	private boolean headInSand;
	public Ostrich()
	{
		super(true, 0, "Unknown", 2, 2.0, 0.3);
		headInSand = false;
	}
	public Ostrich(String name, boolean headInSand)
	{
		super(true, 0, name, 2, 2.0, 0.3);
		this.headInSand = headInSand;
	}
	//if their head is buried in sand, they can't kill, can they?
	@Override
	public double getPredisposition()
	{
		if (headInSand == true)
			return -0.3;
		return 0;
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
