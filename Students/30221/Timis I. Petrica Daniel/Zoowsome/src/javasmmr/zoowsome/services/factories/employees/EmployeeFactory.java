package javasmmr.zoowsome.services.factories.employees;

import javasmmr.zoowsome.models.employees.*;

public abstract class EmployeeFactory {
	public abstract Employee getEmployee(String type) throws Exception;
}
