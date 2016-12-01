package models.employees;

import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Employee {
	private String name;
	protected Long id = ThreadLocalRandom.current().nextLong(1000000000000L , 9999999999999L);
	private BigDecimal salary;
	private boolean isDead = false;
	
	public Employee(String name , BigDecimal salary , boolean isDead){
		this.name = name;
		this.salary = salary;
		this.isDead = isDead;
	}
	public String getName(){
		return name;
	}
	public BigDecimal getSalary(){
		return salary;
	}
	public boolean getIsDead(){
		return isDead;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setSalary(BigDecimal salary){
		this.salary = salary;
	}
	public void setIsDead(boolean isDead){
		this.isDead = isDead;
	}
}