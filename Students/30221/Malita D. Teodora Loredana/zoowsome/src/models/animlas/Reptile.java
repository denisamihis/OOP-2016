package models.animlas;

public abstract class Reptile extends Animal {
	protected boolean isUgly;
	protected boolean laysEggs;
	public Reptile(boolean isUgly, String name, int nrOfLegs,boolean laysEggs)
	{
		super(name,nrOfLegs);
		this.isUgly = isUgly;
	}
	public boolean getisUgly()
	{
		return isUgly;
	}
	public void setisUgly( boolean isUgly)
	{
		this.isUgly=isUgly;
	}
	public boolean getLaysEggs()
	{
		return laysEggs;
	}
	public void setLaysEggs( boolean laysEggs)
	{
		this.laysEggs=laysEggs;
	}
	

}
