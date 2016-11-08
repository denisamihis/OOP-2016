package servicies.factory.employee;

import servicies.factory.animal.Constants;

public class EmployeeFactory {
	public AbstractEmployeeFactory getEmployeeFactory(String type) throws Exception  {
		if (Constants.Employee.Caretakers.equals(type))
				return new CaretakerFactory();
		 else{
			throw new Exception("Invalid species exception!");
	}
	}}

