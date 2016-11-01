package factories;

import employees.Employee;

public abstract class EmployeeFactory {
	public abstract Employee getEmployee(String type) throws Exception;
}
