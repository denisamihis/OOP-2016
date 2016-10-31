package models.employees;

import java.math.BigDecimal;
import models.animals.*;
import services.factories.Constants;

public class Caretaker extends Employees implements Caretaker_I{
	private double workingHours;
	public Caretaker(String name, BigDecimal salary, double workingHours)
	{
		super(name, Id.getId(), salary);
		this.workingHours = workingHours;
	}
	public Caretaker()
	{
		super("Unknown", Id.getId(), null);
		workingHours = 0;
	}
	public String takeCareOf(Animal animal)
	{
		if (animal.kill())
			return Constants.Employees.Caretakers.TCO_KILLED;
		if (this.workingHours < animal.getMaintenanceCost())
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		animal.setTakenCareOf(true);
		workingHours -= animal.getMaintenanceCost();
		return Constants.Employees.Caretakers.TCO_SUCCES;
			
	}
	public double getWorkingHours()
	{
		return workingHours;
	}
	public void setWorkingHourse(double workingHours)
	{
		this.workingHours = workingHours;
	}
}
