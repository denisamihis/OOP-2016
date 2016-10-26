package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animal{
	private int avgSwimDepth;
	private enum waterType
	{
		Saltwater,Freshwater
	}   
	public Aquatic(String name, int numberOfLegs,int avgSwimDepth,enum waterType) {
		super(name, numberOfLegs);
		setSwimDepth(avgSwimDepth);
	
	}
	public void setSwimDepth(int avgSwimDepth)
	{
		 this.avgSwimDepth=avgSwimDepth;
	}
	public int getSwimDepth(int avgSwimDepth)
	{
		 return avgSwimDepth;
	}
	
		
}


