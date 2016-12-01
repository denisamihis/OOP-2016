package services.factories;


import models.employees.Employee;
import models.employees.TCO_KILLED;
import models.employees.TCO_NO_TIME;
import models.employees.TCO_SUCCESS;

public  class CaretakerFactory extends EmployeeAbstractFactory {
	public Employee getEmployeeFactory(String type) throws Exception { 
		if (Constants.Employee.Caretaker.TCO_SUCCESS.equals(type))
		{ return new TCO_SUCCESS(); // leave empty constructor, for now! 
		} 
		else 
			if (Constants.Employee.Caretaker.TCO_KILLED.equals(type))
			{ return new TCO_KILLED(); // leave empty constructor, for now! 
			} 
			else
				if (Constants.Employee.Caretaker.TCO_NO_TIME.equals(type))
				{ return new TCO_NO_TIME(); // leave empty constructor, for now! 
				} 
		else {
			throw new Exception("Invalid animal exception!");
			} 
	}
}

