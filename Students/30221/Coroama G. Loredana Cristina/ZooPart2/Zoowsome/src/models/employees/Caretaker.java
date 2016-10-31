package models.employees;

import models.animals.Animal;
import services.factories.Constants;

public class Caretaker extends Employee  {
private double workingsHours;

public double getWorkingsHours() {
	return workingsHours;
}

public void setWorkingsHours(double workingsHours) {
	this.workingsHours = workingsHours;
}
public Caretaker()
{
	setWorkingsHours(4.0);
	
}
@Override
public String takeCareOf(Animal a) {
	// TODO Auto-generated method stub
	if (a.kill()) {
		return Constants.Employee.Caretaker.TCO_KILLED;
		}
		if (this.getWorkingsHours() < a.getMaintenanceCost()){
		return Constants.Employee.Caretaker.TCO_NO_TIME;
		}
		a.setTakenCareOf(true);
		//Set the animal takenCareOf flag to true
		workingsHours-=a.getMaintenanceCost();
		//Subtract the maintenance cost from the caretakers working hours
		return Constants.Employee.Caretaker.TCO_SUCCESS;
}



}
