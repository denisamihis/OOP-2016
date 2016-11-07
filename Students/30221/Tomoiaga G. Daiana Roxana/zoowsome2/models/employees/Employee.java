package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

public abstract class Employee {
	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead;
	
	public Employee(){
		long newId = (long)0;
		while(String.valueOf(newId).length()!=13){
			newId = (long)(Math.random()*100000000*1000000);
		}
		id = newId;
	}
	
	public Employee (String name, long id, BigDecimal salary){
		this.name=name;
		this.salary=salary;
		long newId = (long)0;
		while (String.valueOf(newId).length() != 13){			
			newId=(long)(Math.random()*100000000*1000000);
		}
		id = newId;
		isDead=false;
	}
	
	
	
	public String getName () {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public long getId () {
		return id;
	}
	
	public void setId (long id) {
		this.id = id;
	}
	
	public BigDecimal getSalary () {
		return salary;
	}
	
	public void setSalary (BigDecimal salary) {
		this.salary = salary;
	}
	
	public boolean getIsDead () {
		return isDead;
	}
	
	public void setIsDead (boolean isDead) {
		this.isDead = isDead;
	}
}
