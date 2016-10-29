package models.animals;

import java.util.Random;

public abstract class Animal implements Killer{
	protected String name;
	protected int nrOfLegs;
	protected final double maintenanceCost;
	protected final double dangerPerc;
	protected boolean takenCareOf;
	public Animal(String name, int nrOfLegs, double maintenanceCost, double dangerPerc)
	{
		this.name = name;
		this.nrOfLegs = nrOfLegs;
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
		takenCareOf = false;
	}
	public double getPredisposition()
	{
		return 0;
	}
	public boolean kill()
	{
		Random kill = new Random();
		return kill.nextDouble() + getPredisposition() < dangerPerc;
	}
	public boolean getTakenCareOf()
	{
		return takenCareOf;
	}
	public void setTakenCareOf(boolean takenCareOf)
	{
		this.takenCareOf = takenCareOf;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public double getDangerPerc()
	{
		return dangerPerc;
	}
	public double getMaintenanceCost()
	{
		return maintenanceCost;
	}
}
