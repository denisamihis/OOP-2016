package javasmmr.zoowsome.services.factories;

public class AbstractEmployeeFactory {
	public EmployeeFactory getEmployee(String type) throws Exception
	{
		if(type.equals(Constants.Employees.Caretaker))
			return new CaretakerFactory();
		else
			throw new Exception("Invalid Employee");
	}
}
