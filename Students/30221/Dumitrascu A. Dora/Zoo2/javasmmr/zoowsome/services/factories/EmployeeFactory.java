package javasmmr.zoowsome.services.factories;

public class EmployeeFactory {
	public EmployeeFactory getEmployeeFactory(String type) throws Exception{
		if (Constants.Employee.Caretaker.equals(type)) {
			return new EmployeeFactory();
		}
		else
			throw new Exception("Invalid employee exception");
	}
}
