package javasmmr.zoowsome.models.employees;

import java.math.*;
import java.util.concurrent.*;

public abstract class Employee {
	
	private String name;
	private Long id;
	private BigDecimal salary;
	private Boolean isDead;
	
	public Employee(String name, Long id, BigDecimal salary) {
		this.name = name;
		this.salary = salary;
		this.id = id;
		isDead = false;
	}
	
	public Employee() {
		name = "Unknown";
		salary = BigDecimal.ZERO;
		id = ThreadLocalRandom.current().nextLong(Long.MAX_VALUE);
		isDead = false;
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
	
	public Boolean getIsDead() {
		return isDead;
	}
	
	public void setIsDead(Boolean isDead) {
		this.isDead = isDead;
	}
	
}
