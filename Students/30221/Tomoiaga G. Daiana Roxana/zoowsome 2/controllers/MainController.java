package javasmmr.zoowsome.controllers;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.services.factories.*;

public class MainController {
	public static void main(String[] args) throws Exception {
		
		Caretaker [] caretaker = new Caretaker[50];
		Animal[] animal = new Animal[50];
		

		
		for(int i=0; i < animal.length; i++){
			animal[i] = AnimalGenerator.getAnimal();
		}
		
		for(int i=0; i < caretaker.length; i++){
			for(int j=0; j <animal.length; j++){
				if(!caretaker[i].getIsDead() && !animal[j].getTakenCareOf()){
					String result = caretaker[i].takeCareOf(animal[j]);
					if(result.equals(Constants.Employees.Caretakers.TCO_KILLED)){
						System.out.println(caretaker[i].getName() +  "[ID: " + caretaker[i].getId() + "]" + " has been killed by the " + animal[j].getName() + ".");
						caretaker[i].setIsDead(true);
					} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)){
						System.out.println(caretaker[i].getName() + "[ID: " + caretaker[i].getId() + "]" + " hasn't got enough time to take care of the " + animal[j].getName() + ".");
						continue;
					} else {
						animal[j].setTakenCareOf(true);
						System.out.println(animal[j].getName() + " has been taken care of by " + caretaker[i].getName() + "[ID: " + caretaker[i].getId() + "]" + ".");
						
					}
				}
			}
		}
		
	}

}
