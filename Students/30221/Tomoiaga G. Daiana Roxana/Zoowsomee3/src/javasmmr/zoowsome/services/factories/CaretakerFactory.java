package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;

public class CaretakerFactory extends EmployeeFactory {
	
	private EmployeeGenerator eg = new EmployeeGenerator();
	
	@Override
	public Employee getEmployee (String type) throws Exception {
		if (Constants.Employees.Caretaker.equals(type)){
			return new Caretaker(eg.getRandomName(), eg.getRandomId(), eg.getRandomSalary(),eg.getRandomWorkingHours()); 
		} else
			throw new Exception ("Invalid employee exception!");
	}

}
