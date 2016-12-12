package javasmmr.zoowsome.services.factories.employees;
 
import java.math.*;
import java.util.*;
import java.util.concurrent.*;
 
public class EmployeeGenerator {
 
 	private static final String[] names = { "Sandy", "Mary", "John", "Andy", "Alex", "Sam","Mike", "George", "Dean", "Stefan",
 			"Jeremy", "Caroline", "Max", "Jim", "Katty", "Andrew", "Bob", "Harry", "Zack", "Marc", "Ian", "Ted", "Barney", "Oliver",
 			"Berry","Lila", "Felicia", "Roger", "Anthony", "Joey", "Rachel", "Michael", "Jony", "Aria","Tyler", "Monica", "Ross","Charlie"}; 
 	private static final Double MIN_WORKING_HOURS = 8.0;
 	private static final BigDecimal MIN_SALARY = new BigDecimal(7500);
 	
 	Random random = new Random();
 	
 	public String getRandomName() {
 		return names[random.nextInt(names.length)];
 	}
 	
 	public Long getRandomId() {
 		return ThreadLocalRandom.current().nextLong(Long.MAX_VALUE);
 	}
 	
 	public Double getRandomWorkingHours() {
 		double workingHours = random.nextDouble();
 		workingHours *= 10;
 		if(workingHours < MIN_WORKING_HOURS) {
 			workingHours = MIN_WORKING_HOURS;
 		}
 		return workingHours;
 	}
 	
 	public BigDecimal getRandomSalary() {
 		BigDecimal salary = new BigDecimal(random.nextInt(15000));
 		if (salary.compareTo(MIN_SALARY) == -1) {
 			salary = MIN_SALARY;
 		}
 		return salary;
 	}
 	
}