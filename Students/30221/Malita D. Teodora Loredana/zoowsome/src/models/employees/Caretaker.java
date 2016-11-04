package models.employees;

import java.math.BigDecimal;

import models.animlas.Animal;
import services.factories.employeeFactory.Constants;

public class Caretaker extends Employee implements Caretaker_I {
	protected double workingHours;
	public Caretaker(String name, BigDecimal salary, long id,double workingHours){
		super(name,salary,id);
		this.workingHours=workingHours;
	}
	public Caretaker()
	{
		super("Unknown",null,0);
		workingHours=10;
	}
	public double getWorkingHours(){
		return workingHours;
	}
	public void setWorkingHours(double workingHours){
		this.workingHours=workingHours;
	}
	public String takeCareOf(Animal a){
		if(this.workingHours<a.getMaintenanceCost())
			return Constants.Cartakers.TCO_NO_TIME;
		if(a.kill())
			return Constants.Cartakers.TCO_KILLED;
		a.setTakenCareOf(true);
		this.workingHours=this.workingHours - a.getMaintenanceCost();
		return Constants.Cartakers.TCO_SUCCESS;	
	}

}
