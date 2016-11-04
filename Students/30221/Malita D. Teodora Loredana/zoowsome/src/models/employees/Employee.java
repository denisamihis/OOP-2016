package models.employees;

import java.math.BigDecimal;

public abstract class Employee {
	protected String name;
	protected BigDecimal salary;
	protected boolean isDead;
	protected long id;
	public Employee(String name, BigDecimal salary, long id){
		this.name=name;
		this.salary=salary;
		this.id=id;
		isDead= false;
	}
	public String getName(){
		return name;
	}
	public BigDecimal getSalary(){
		return salary;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setSalary(BigDecimal salary){
		this.salary=salary;
	}
	public long getID(){
		return id;
	}
	public void setId(long id)
	{
		this.id=id;
	}
	public boolean getIsDead()
	{
		return isDead;
	}
	public void setIsDead(boolean isDead){
		this.isDead=isDead;
		
	}
}

