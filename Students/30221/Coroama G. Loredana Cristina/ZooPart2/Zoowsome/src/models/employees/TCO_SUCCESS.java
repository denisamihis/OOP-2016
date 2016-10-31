package models.employees;
import models.animals.Animal;

import services.factories.Constants;

public class TCO_SUCCESS extends Caretaker{

	@Override
	public String takeCareOf(Animal a) {
		if (a.kill()) {
			return Constants.Employee.Caretaker.TCO_KILLED;
			}
			if (this.getWorkingsHours() < a.getMaintenanceCost()){
			return Constants.Employee.Caretaker.TCO_NO_TIME;
			}
			a.setTakenCareOf(true);
			//Set the animal takenCareOf flag to true
			setWorkingsHours(getWorkingsHours() - a.getMaintenanceCost());
			//Subtract the maintenance cost from the caretakers working hours
			return Constants.Employee.Caretaker.TCO_SUCCESS;
	}

}
