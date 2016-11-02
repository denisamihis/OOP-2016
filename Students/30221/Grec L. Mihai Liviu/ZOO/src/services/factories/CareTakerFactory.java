package services.factories;
import java.math.BigDecimal;


import java.util.concurrent.ThreadLocalRandom;

import models.employees.*;

public class CareTakerFactory extends EmployeeFactory{
	public Employee getEmployee()  {
		String nume = "";
		Double ore = ThreadLocalRandom.current().nextDouble(38.0, 48.0);
		BigDecimal salar = new BigDecimal(Math.round(ore*10*4));
			return new CareTaker(nume , salar , false , ore);
	}
}
