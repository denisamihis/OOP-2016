package javasmmr.zoowsome.services.factories.employees;

import java.math.BigDecimal;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;

public class EmployeeFactory extends EmployeeAbstractFactory {

	 String name;
	 Long id;
	 BigDecimal salary;
	 Random random = new Random();
	 double workingHours;
	@Override
	public Employee getEmployee(String type) throws Exception {
		if(Constants.Employees.CARETAKER.equals(type)) {
			id = ThreadLocalRandom.current().nextLong(Long.MAX_VALUE);
			salary = new BigDecimal(random.nextInt(100000));
			workingHours = random.nextDouble()*10;
			return new Caretaker("Ion",id,salary,workingHours);
			
		}
		throw new Exception ("Invalid input");
	 	
	}
	
	
}
