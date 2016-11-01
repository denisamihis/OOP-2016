package employees;

import java.math.BigDecimal;

import animals.Animal;
import factories.Constants;

public class Caretaker extends Employee implements Caretaker_I {
	Double workingHours;

	@Override
	public String takeCareOf(Animal a) {
		if (a.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if (this.workingHours < a.getMaintenanceCost()) {
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}

		a.setTakenCareOf(true);
		workingHours = workingHours - a.getMaintenanceCost();
		return Constants.Employees.Caretakers.TCO_SUCCESS;
	}

	public Caretaker(String name, BigDecimal salary, Boolean isDead, Double workingHours) {
		super(name, salary, isDead);
		this.workingHours = workingHours;
	}

	public Caretaker() {

	}

	public Double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(Double workingHours) {
		this.workingHours = workingHours;
	}
}
