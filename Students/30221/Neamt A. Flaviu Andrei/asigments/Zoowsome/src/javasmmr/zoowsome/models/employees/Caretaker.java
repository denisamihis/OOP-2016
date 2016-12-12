package javasmmr.zoowsome.models.employees;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I{
	double workingHours=8;
	public double getWorkingHours(){
		return workingHours;
	}
	public void setWorkingHours(double hour){
		workingHours=hour;
	}
	public String takeCareOf(Animal animal) {
		if(workingHours<animal.maitenanceCost)
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		if(animal.kill())
			return Constants.Employees.Caretakers.TCO_KILLED;
		animal.takenCareOf=true;
		workingHours-=animal.maitenanceCost;
		return Constants.Employees.Caretakers.TCO_SUCCES;
	}
}
	