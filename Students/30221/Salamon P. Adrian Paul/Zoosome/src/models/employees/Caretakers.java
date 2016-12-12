package models.employees;

import java.math.BigDecimal;

import models.animals.Animal;
import servicies.factory.animal.Constants;

public class Caretakers extends Employee {
	private Double workingHours;
	final static BigDecimal value = new BigDecimal(10000);

	public Caretakers(String name, BigDecimal salary, boolean isAlive, Double workingHours) {
		super(name, salary, isAlive);
		setWorkingHours(workingHours);
	}

	public Caretakers() {
		super("Iohn", value, true);
		setWorkingHours(40.5);
	}

	public void setWorkingHours(Double workingHours) {
		this.workingHours = workingHours;
	}

	public Double getWorkingHours() {
		return workingHours;
	}

	public String takeCareOf(Animal a) {
		if (a.kill()) {
			return Constants.Employee.Caretakerss.TCO_KILLED;
		}
		if (this.workingHours < a.getMaintaneanceCost()) {
			return Constants.Employee.Caretakerss.TCO_NO_TIME;
		} else {
			a.setTakenCareOf(true);
			this.workingHours=this.workingHours-a.getMaintaneanceCost();
			return Constants.Employee.Caretakerss.TCO_SUCCESS;
		}
	}
}
