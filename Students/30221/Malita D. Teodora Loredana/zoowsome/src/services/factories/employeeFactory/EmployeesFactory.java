package services.factories.employeeFactory;

import models.employees.Employee;

public abstract class EmployeesFactory {
	public abstract Employee getEmployee (String type) throws InvalidEmployeeException;

}
