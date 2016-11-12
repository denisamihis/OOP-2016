package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal{
	private boolean laysEggs;
	public Reptile(String name, int numberOfLegs,boolean laysEggs) {
		super(name, numberOfLegs);
		setLaysEggs(laysEggs);
	}
	public void setLaysEggs(boolean laysEggs)
	{
		 this.laysEggs=laysEggs;
	}
	public Boolean geLaysEggs(boolean laysEggs)
	{
		 return laysEggs;
	}

}
