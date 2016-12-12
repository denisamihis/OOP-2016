package javasmmr.zoowsome.services.factories.employees;
import javasmmr.zoowsome.models.employees.Employees;

public abstract class EmployeeFactory {
	public abstract Employees getEmployees(String type) throws Throwable;
}
