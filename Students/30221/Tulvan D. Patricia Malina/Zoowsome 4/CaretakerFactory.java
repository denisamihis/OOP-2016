package javasmmr.zoowsome.services.factories.employees;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employees;
import javasmmr.zoowsome.services.factories.animals.Constants;

public class CaretakerFactory extends EmployeeFactory {

	private EmployeeGenerator employee = new EmployeeGenerator();
	 	
	public Employees getEmployees(String type) throws Throwable {
	 		if (Constants.Employees.Caretaker.equals(type)) {
	 			return new Caretaker(employee.getRandomName(), employee.getRandomSalary(),employee.getRandomId(), employee.getRandomWorkingHours());
	 		} else 
	 			throw new Exception("Invalid employee exception!");
	 	}
	
}
