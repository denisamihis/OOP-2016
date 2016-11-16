package javasmmr.zoowsome.services.factories.employees;

import javasmmr.zoowsome.services.factories.animals.Constants;

public class EmployeeAbstractFactory {

	public EmployeeFactory getEmployeeFactory(String type) throws Exception {
		if(Constants.Employees.CARETAKER.equals(type)) {
			return new CaretakerFactory();
		} else
			throw new Exception ("Invalid employee exception!");
	}
	
}
