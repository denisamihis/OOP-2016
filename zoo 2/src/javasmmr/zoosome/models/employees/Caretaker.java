package javasmmr.zoosome.models.employees;

import javasmmr.zoowsome.models.animals.Animal;

public class Caretaker extends Employee implements Caretaker_I   {
	
	private double workingHours;
	
	public double getWorkingHours(){
		return workingHours;
	}
	
	public void setWorkingHouers(double hours){
		workingHours=hours;
	}

	@Override
	public String takeCareOf(Animal animal) {
		
		
		System.out.print(animal.getName());
		return " Is taken care of";
		
		
	}

}
