package services.factories;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import models.employees.*;

public class CareTakerFactory extends EmployeeFactory{
	public Employee getEmployee()  {
		Scanner citire = new Scanner(System.in);
		System.out.println("Numele angajatului:");
		String nume = citire.nextLine();
		Double ore = ThreadLocalRandom.current().nextDouble(38.0, 48.0);
		BigDecimal salar = new BigDecimal(Math.round(ore*10*4));
			return new CareTaker(nume , salar , false , ore);
	}
}