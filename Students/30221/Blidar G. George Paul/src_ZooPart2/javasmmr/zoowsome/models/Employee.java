package javasmmr.zoowsome.models;
import java.math.BigDecimal;
/*
 * The employee class with everything it's needed
 */
public abstract class Employee {
	
	private String name;
	private Long id;
	private BigDecimal salary;
	private Boolean isDead = false;
	
	public Employee(String aName, BigDecimal aSalary, Boolean anAnswer)
	{
		this.name = aName;
		this.salary = aSalary;
		this.isDead = anAnswer;
		this.id = this.numbGen();
	}
	
	public Long numbGen() // randomize the creation of id's
		{
		    while (true) {
		        Long numb = (long)(Math.random() * 100000000 * 1000000); 
		        if (String.valueOf(numb).length() == 13)
		            return numb;
	    }
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String theName)
	{
		name = theName;
	}
	
	public BigDecimal getSalary()
	{
		return salary;
	}
	
	public void setSalary(BigDecimal value)
	{
		salary = value;
	}
	
	public Boolean getIfDead()
	{
		return isDead;
	}
	
	public void setIfDead(Boolean answer)
	{
		isDead = answer;
	}
	
	public Long getId()
	{
		return id;
	}

}
