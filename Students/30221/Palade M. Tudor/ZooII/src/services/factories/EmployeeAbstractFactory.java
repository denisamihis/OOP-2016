package services.factories;
public class EmployeeAbstractFactory {
	public EmployeeFactory getEmployeeFactory(String type) throws Exception{
		if (Constants.Employee.CareTakers.equals(type)){
			return new CareTakerFactory();
		}
		else throw new Exception("Invalid employee exception!");
	}
}