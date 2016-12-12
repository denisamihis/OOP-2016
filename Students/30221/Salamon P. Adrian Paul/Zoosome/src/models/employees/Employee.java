package models.employees;

import java.util.Random;
import java.math.BigDecimal;

public abstract class Employee {
	private String name;
	private Long id;
	BigDecimal salary;
	boolean isAlive = true;

	public Employee(String name, BigDecimal salary, boolean isAlive) {
		setName(name);
		setSalary(salary);
		setIsAlive(isAlive);
		setId();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long idGenerator() {
		long id = 0;
		Random rand = new Random();
		for (int counter = 0; counter < 13; counter++) {
			int digit = rand.nextInt(10);
			id = id * 10 + digit;
		}
		return id;
	}

	public void setId() {
		this.id = idGenerator();
	}

	public long getId() {
		return id;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public boolean getIsAlive() {
		return isAlive;
	}
	public void setIsAlive(boolean isAlive){
		this.isAlive=isAlive;
	}

}
