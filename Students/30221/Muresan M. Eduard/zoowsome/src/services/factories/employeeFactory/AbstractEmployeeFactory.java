package services.factories.employeeFactory;

import services.factories.Constants;

public class AbstractEmployeeFactory {
	public EmployeeFactory getEmployee(String type) throws InvalidEmployeeException
	{
		if (type.equals(Constants.Employees.Caretaker))
			return new CaretakerFactory();
		else 
			throw new InvalidEmployeeException(type);
	}
}
