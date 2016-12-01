package javasmmr.zoowsome.services.factories;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;

public class CaretakerFactory extends EmployeeFactory  {

	@Override
	public Employee getEmployeeFactory(String type) throws Exception {
		if(Constants.Employees.CareTaker.equals(type))
			return new Caretaker("nume",BigDecimal.valueOf(11.2));

		throw new Exception("Invalid animal provided.");
	}

}
