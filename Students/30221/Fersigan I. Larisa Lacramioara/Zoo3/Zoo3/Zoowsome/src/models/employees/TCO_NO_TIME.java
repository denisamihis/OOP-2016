package models.employees;

import services.factories.Constants;
import models.animals.Animal;

public class TCO_NO_TIME extends Caretaker{

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
