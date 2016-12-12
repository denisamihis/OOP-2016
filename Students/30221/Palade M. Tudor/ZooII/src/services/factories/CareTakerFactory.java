package services.factories;

import java.util.concurrent.ThreadLocalRandom;

import models.employees.*;

public class CareTakerFactory extends EmployeeFactory{
	public Employee getEmployee()  {
		String name = "";
		Double workingHours = ThreadLocalRandom.current().nextDouble(38.0, 48.0);
		int salary = (int) (Math.round(workingHours*10*4));
			return new Caretaker(name , salary , workingHours);
	}
}