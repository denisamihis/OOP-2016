package javasmmr.zoowsome.services.factories;

import java.math.BigDecimal;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class EmployeeGenerator {
	
	private static final String[] names = {"Nick", "John", "Albert", "Edward", "Michael", "Lucas", "George", "Jack", "Henry", "Harry"};
	private static final Double MIN_WORKING_HOURS=8.0;
	private static final  BigDecimal MIN_SALARY = new BigDecimal (5000);
	
	Random random = new Random();
	
	public String getRandomName() {
		return names[random.nextInt(names.length)];
	}
	
	public Long getRandomId () {
		return ThreadLocalRandom.current().nextLong(Long.MAX_VALUE);
	}
	
	public Double getRandomWorkingHours(){
		double wHours = random.nextDouble();
		wHours *= 10;
		if(wHours< MIN_WORKING_HOURS) {
			wHours = MIN_WORKING_HOURS;
		}
		return wHours;
	}
	
	public BigDecimal getRandomSalary(){
		BigDecimal salary = new BigDecimal (random.nextInt(10000));
		if (salary.compareTo(MIN_SALARY) == -1){
			salary = MIN_SALARY;
	}
		return salary;
	}
}
