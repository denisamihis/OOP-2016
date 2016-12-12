package models.employees;

import services.factories.Constants;
import models.animals.Animal;

public class Caretaker extends Employee{

	private double workingHours;

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}


		@Override
		public String takeCareOf(Animal a) {
			if (a.kill()) {
				return Constants.Employee.Caretaker.TCO_KILLED;
				}
				if (this.getWorkingHours() < a.getMaintenanceCost()){
				return Constants.Employee.Caretaker.TCO_NO_TIME;
				}
				a.setTakeCareOf(true);
				//Set the animal takenCareOf flag to true
				setWorkingHours(getWorkingHours() - a.getMaintenanceCost());
				//Subtract the maintenance cost from the caretakers working hours
				return Constants.Employee.Caretaker.TCO_SUCCESS;
		
	}
	
}
