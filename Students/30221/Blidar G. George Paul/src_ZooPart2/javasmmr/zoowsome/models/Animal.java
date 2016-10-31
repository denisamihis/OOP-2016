package javasmmr.zoowsome.models;


public abstract class Animal implements Killer {
	
	private int numberOfLegs;
	private String theName;
	protected final Double maintenanceCost; // second part
	protected final double dangerPercentage; // second part
	private boolean takenCareOf = false; // second part
	
	public Animal(Double theValue, double percValue) // added this constructor
	{
		maintenanceCost = theValue;
		dangerPercentage = percValue;
	}
	
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
	
	public Double getMaintenanceCost()
	{
		return this.maintenanceCost;
	}
	
	public double getDangerPercent()
	{
		return dangerPercentage;
	}
	
	public void setTakenCareOf(boolean value)
	{
		takenCareOf = value;
	}
	
	public boolean getTakenCareOf()
	{
		return takenCareOf;
	}
}

