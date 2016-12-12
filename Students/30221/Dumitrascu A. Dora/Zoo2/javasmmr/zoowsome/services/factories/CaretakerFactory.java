package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.employees.*;

public class CaretakerFactory extends EmployeeAbstractFactory{
	public Employee getEmployeeFactory(String type)throws Exception{ //I get an error here ? Not sure about the architecture of the whole employee factory
		if(Constants.Employee.Caretaker.equals(type)){
			return new Caretaker();
		}
		else
			throw new Exception("Invalid employee exception");
	}
}
