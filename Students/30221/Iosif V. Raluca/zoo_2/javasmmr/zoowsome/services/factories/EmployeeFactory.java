package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.employees.*;

public class EmployeeFactory extends EmployeeAbstractFactory{

	@Override
	public Employee getEmployee(String type) throws Exception  {
	if (Constants.Employee.Caretaker.equals(type)){
		return new Caretaker();
	}else 
		throw new Exception("Invalid employee type");
	}
}
