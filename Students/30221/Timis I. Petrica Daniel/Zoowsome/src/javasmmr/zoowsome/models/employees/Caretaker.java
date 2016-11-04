package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.constants.Constants;

public class Caretaker extends Employee implements Caretaker_I {

	private Double workingHours;

	public Caretaker(String name, Long id, BigDecimal salary, Double workingHours) {
		super(name, id, salary);
		this.workingHours = workingHours;
	}

	public Caretaker() {
		super();
		workingHours = 0.0;
	}

	public Double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(Double workingHours) {
		this.workingHours = workingHours;
	}

	// Caretaker_I Interface Method
	
	public String takeCareOf(Animal a) {
		if(a.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}

		if(this.workingHours < a.getMaintenanceCost()) {
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}

		a.setTakenCareOf(true);
		workingHours -= a.getMaintenanceCost();

		return Constants.Employees.Caretakers.TCO_SUCCES;
	}

}
