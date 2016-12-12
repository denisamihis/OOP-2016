package services.factories.employeeFactory;

import java.math.BigDecimal;
import java.util.Random;
import models.employees.*;
import services.NameGenerator;

public class CaretakerFactory extends EmployeeFactory{
	public Employees getEmployee()
	{
		Random rand = new Random();
		return new Caretaker(NameGenerator.GetRandomName(), BigDecimal.valueOf(1250 + rand.nextInt(5000)), rand.nextInt(20) + rand.nextDouble());
	}
}
