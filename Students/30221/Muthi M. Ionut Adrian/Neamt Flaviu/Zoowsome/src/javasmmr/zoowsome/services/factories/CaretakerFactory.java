package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.employees.*;

public class CaretakerFactory extends EmployeeFactory {
	public Employee getEmployee()
	{
		return new Caretaker();
	}
}
