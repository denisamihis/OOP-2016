package javasmmr.zoowsome.services.factories.employees;

import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.services.factories.animals.Constants;

public class CaretakerFactory extends EmployeeFactory {
	
	private EmployeeGenerator eg = new EmployeeGenerator();
	
	@Override
	public Employee getEmployee(String type) throws Exception {
		if (Constants.Employees.CARETAKER.equals(type)) {
			return new Caretaker(eg.getRandomName(), eg.getRandomId(), eg.getRandomSalary(), eg.getRandomWorkingHours());
		} else 
			throw new Exception("Invalid employee exception!");
	}

}
