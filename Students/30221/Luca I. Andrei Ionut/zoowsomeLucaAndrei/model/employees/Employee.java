package employees;

import java.math.BigDecimal;

public abstract class Employee {
	String name;
	Long id;
	BigDecimal salary;
	Boolean isDead=false;
	public Employee() {
		Long newId=(long)0;
		while (String.valueOf(newId).length() != 13) {
			newId = (long)(Math.random() * 100000000 * 1000000); 
		}
        id=newId;
	}
	
	public Employee(String name, BigDecimal salary, Boolean isDead) {
		this.name=name;
		Long newId=(long)0;
		while (String.valueOf(newId).length() != 13) {
			newId = (long)(Math.random() * 100000000 * 1000000); 
		}
        id=newId;
		this.salary=salary;
		this.isDead=isDead;
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


