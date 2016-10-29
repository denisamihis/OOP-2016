package models.animals;

public abstract class Reptile extends Animal{
	protected boolean laysEggs;
	public Reptile(boolean laysEggs, String name, int nrOfLegs, double maintenanceCost, double dangerPerc)
	{
		super(name, nrOfLegs, maintenanceCost, dangerPerc);
		this.laysEggs = laysEggs;
	}
	public boolean getLaysEggs()
	{
		return laysEggs;
	}
	public void setLaysEggs(boolean laysEggs)
	{
		this.laysEggs = laysEggs;
	}

}
