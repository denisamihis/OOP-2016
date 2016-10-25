package models.animlas;

public abstract class Animal {
	protected String name;
	protected int nrOfLegs;
	public Animal(String name, int nrOfLegs) {

		this.name = name;
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
	public int getNrOfLegs()
	{
		return nrOfLegs;
	}
	public void setNrOfLegs(int nrOfLegs)
	{
		this.nrOfLegs=nrOfLegs;
	}
}
