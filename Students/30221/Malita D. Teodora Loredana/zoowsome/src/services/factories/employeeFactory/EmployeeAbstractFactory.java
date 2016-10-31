package services.factories.employeeFactory;

public class EmployeeAbstractFactory {
	public EmployeesFactory getEmployeesFactory(String type) throws InvalidEmployeeException{
		if(type.equals(Constants.Employees.Caretaker))
			return new CaretakersFactory();
		else throw new InvalidEmployeeException(type);
	}
}
