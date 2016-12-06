package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.animals.Animal;

public class Caretaker extends Employee implements Caretaker_I {
	private double workingHours;
	
	public Caretaker() {
	}
	public Caretaker(String name, Long id, BigDecimal salary, double workingHours) {
		super(name,id,salary);
		this.setWorkingHours(workingHours);
	}
	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}
	@Override
	public String takeCareOfAnimal(Animal animal) {
		if(animal.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		} 
		if(this.workingHours < animal.getMAINTENANCE_COST()) {
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		animal.setTakenCareOf(true);
		this.workingHours = this.workingHours - animal.getMAINTENANCE_COST();
		return Constants.Employees.Caretakers.TCO_SUCCES;
	}

}
