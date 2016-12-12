package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

public abstract class Employee {
	private String name;
	private Long id;
	private BigDecimal salary;
	private boolean isDead = false;
	
	public Employee() {
	}
	public Employee(String name, Long id, BigDecimal salary) {
		setName(name);
		setId(id);
		setSalary(salary);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
