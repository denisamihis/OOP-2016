package models.employees;

import java.math.BigDecimal;

abstract public class Employee implements Caretaker_I {

	private String name;
	private static long id=(long)(Math.random()* 1000000000000L);
	private BigDecimal salary;
	private boolean isDead=false;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static long getId() {
		return id;
	}
	public static void setId(long id) {
		Employee.id = id;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public boolean isDead() {
		return isDead;
	}
	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}
}
