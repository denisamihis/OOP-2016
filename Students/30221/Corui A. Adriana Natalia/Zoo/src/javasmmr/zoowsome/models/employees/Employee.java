package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

public abstract class Employee {

	private String name;
	private long id ;
	private BigDecimal salary;
	private boolean isDead;
	
	public Employee(String name,BigDecimal salary)
	{
		this.name=name;
		this.id = (long)(Math.random() * 10000000 * 1000000);
		this.salary=salary;
		this.isDead=false;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public long getID()
	{
		return id;
	}
	public void setID(long id)
	{
		this.id=id;
	}
	public BigDecimal getSalary()
	{
		return salary;
	}
	public void setSalary(BigDecimal salary)
	{
		this.salary=salary;
	}
	public boolean getIsDead()
	{
		return isDead;
	}
	public void setIsDead(boolean isDead)
	{
		this.isDead=isDead;
	}
	
}
