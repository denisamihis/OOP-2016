package javasmmr.zoowsome.models.animals;

abstract public class Animal {
	
	private String name;
	private int nrOfLegs;
	public int getNrOfLegs()
	{
		return nrOfLegs;
	}
	public void setNrOfLegs(int nrOfLegs)
	{
		this.nrOfLegs=nrOfLegs;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}
