package models.animlas;

import java.util.Random;

public abstract class Animal implements Killer {
	protected String name;
	protected int nrOfLegs;
	protected final double maintenanceCost;
	protected final double dangPerc;
	protected boolean takenCareOf;
	public Animal(String name, int nrOfLegs,double maintenanceCost,double dangPerc) {
		this.maintenanceCost=maintenanceCost;
		this.name = name;
		this.nrOfLegs=nrOfLegs;
		this.dangPerc = dangPerc;
		takenCareOf = false;
	}
	public boolean getTakenCareOf()
	{
		return takenCareOf;
	}
	public void setTakenCareOf(boolean takenCareOf)
	{
		this.takenCareOf=takenCareOf;
	}
	public boolean kill()
	{
		Random kills = new Random();
		double v;
		v=kills.nextDouble();
		return v<dangPerc;
	}
	public double getDangPerc()
	{
		return dangPerc;
	}
	public double getMaintenanceCost()
	{
		return maintenanceCost;
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
