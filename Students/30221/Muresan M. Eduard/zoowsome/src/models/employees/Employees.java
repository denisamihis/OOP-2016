package models.employees;

import java.math.*;

public abstract class Employees {
	protected String name;
	protected Long id;
	protected BigDecimal salary;
	protected boolean isDead;
	protected Employees(String name, Long id, BigDecimal salary)
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
		isDead = false;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public BigDecimal getSalary()
	{
		return salary;
	}
	public void setSalary(BigDecimal salary)
	{
		this.salary = salary;
	}
	public boolean getIsDead()
	{
		return isDead;
	}
	public void setIsDead(boolean isDead)
	{
		this.isDead = isDead;
	}
}
