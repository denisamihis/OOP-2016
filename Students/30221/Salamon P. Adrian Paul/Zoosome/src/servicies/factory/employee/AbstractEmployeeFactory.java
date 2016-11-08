package servicies.factory.employee;

import models.employees.Employee;

public abstract class AbstractEmployeeFactory {
	public abstract Employee getEmployee(String type);

}
