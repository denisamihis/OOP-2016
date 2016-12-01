package javasmmr.zoowsome.services.factories.employees;

import java.util.*;
import java.util.concurrent.*;
import java.math.*;

public class EmployeeGenerator {

	private static final String[] names = { "Oliver", "Jack", "Harry", "Jacob", "Charlie", "Thomas", "James", "William",
			"Henry", "Joseph", "Alexander", "Logan", "Edward", "Lucas", "Lewis", "Michael", "Frankie", 
			"Ryan", "Dexter", "Liam", "Connor", "Albert", "Seth" }; 
	private static final Double MIN_WORKING_HOURS = 8.0;
	private static final BigDecimal MIN_SALARY = new BigDecimal(5000);
	
	Random random = new Random();
	
	public String getRandomName() {
		return names[random.nextInt(names.length)];
	}
	
	public Long getRandomId() {
		return ThreadLocalRandom.current().nextLong(Long.MAX_VALUE);
	}
	
	public Double getRandomWorkingHours() {
		double wHours = random.nextDouble();
		wHours *= 10;
		if(wHours < MIN_WORKING_HOURS) {
			wHours = MIN_WORKING_HOURS;
		}
		return wHours;
	}
	
	public BigDecimal getRandomSalary() {
		BigDecimal salary = new BigDecimal(random.nextInt(10000));
		if (salary.compareTo(MIN_SALARY) == -1) {
			salary = MIN_SALARY;
		}
		return salary;
	}
	
}
