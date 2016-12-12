package services.factories;

public class EmployeeFactory {

	public EmployeeAbstractFactory getEmployeeAbstractFactory(String type) throws Exception{
		if(Constants.EmployeeAbstract.Caretaker.equals(type)){
			return new CaretakerFactory();}
		else
			throw new Exception("Invalid exception");
		}
	}
