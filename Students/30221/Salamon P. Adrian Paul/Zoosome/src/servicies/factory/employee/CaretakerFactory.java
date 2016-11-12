package servicies.factory.employee;

import models.employees.Caretakers;
import models.employees.Employee;
import servicies.factory.animal.Constants;

public class CaretakerFactory extends AbstractEmployeeFactory {
	public Employee getEmployee(String type) {
		if (Constants.Employee.Caretakers.equals(type)) {
			return new Caretakers();
		} else {
			return null;
		}

	}
}
