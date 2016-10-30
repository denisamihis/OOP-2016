package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.employees.*;

public class CaretakerFactory extends EmployeeAbstractFactory{
	public Employee getEmployeeFactory(String type)throws Exception{ //?
		if(Constants.Employee.Caretaker.equals(type)){
			return new Caretaker();
		}
		else
			throw new Exception("Invalid employee exception");
	}
}
