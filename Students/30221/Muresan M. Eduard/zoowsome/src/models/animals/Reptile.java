package models.animals;

public abstract class Reptile extends Animal{
	protected boolean laysEggs;
	public Reptile(boolean laysEggs, String name)
	{
		super(name);
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
