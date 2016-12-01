package factories;

import java.math.BigDecimal;

import employees.Caretaker;
import employees.Employee;

public class CaretakerFactory extends EmployeeFactory {

	@Override
	public Employee getEmployee(String type) throws Exception {
		if (Constants.EmployeeTypes.Caretakers.equals(type)) {
			return new Caretaker();
		} else
			throw new Exception("Invalid employee exception!");
	}

}
