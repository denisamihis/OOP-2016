package javasmmr.zoowsome.models;


public abstract class Animal {
	
	private int numberOfLegs;
	private String theName;
	
	public int getNumberOfLegs()
	{
		return numberOfLegs;
	}
	
	public void setNumberOfLegs(int nrOfLegs)
	{
		numberOfLegs = nrOfLegs;
	}
	
	public String getName()
	{
		return theName;
	}
	
	public void setName(String newName)
	{
		theName = newName;
	}

}

