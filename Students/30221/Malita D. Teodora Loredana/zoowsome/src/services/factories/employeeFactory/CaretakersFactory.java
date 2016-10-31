package services.factories.employeeFactory;

import models.employees.Caretaker;
import models.employees.Employee;

public class CaretakersFactory extends EmployeesFactory {
	public Employee getEmployee (String type) throws InvalidEmployeeException{
		return new Caretaker();
	}

}
