package models.employees;



import models.animals.Animal;
import models.employees.Caretaker;
import services.factories.Constants;

public class TCO_NO_TIME extends Caretaker {
public 	TCO_NO_TIME() {
		
		setWorkingsHours(0.0);
		
		
		setDead(true);
	
	}
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
