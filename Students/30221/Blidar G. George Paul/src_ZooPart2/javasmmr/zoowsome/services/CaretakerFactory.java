package javasmmr.zoowsome.services;
import java.math.BigDecimal;

import javasmmr.zoowsome.models.*;

public class CaretakerFactory extends EmployeesFactory {
	
	@Override
	public Employee getEmployee(String type)
	{
		if(Constants.Employees.Caretaker.equals(type))
		{
			return new Caretaker(Constants.Employees.Caretaker, new BigDecimal(1000), false, new Double(11*Math.random()+1));
		}
		else
		{
			return null;
		}
	}

}
