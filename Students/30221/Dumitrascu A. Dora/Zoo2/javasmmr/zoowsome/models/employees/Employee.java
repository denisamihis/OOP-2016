package javasmmr.zoowsome.models.employees;
import java.math.BigDecimal;
import java.util.Random;

public abstract class Employee {
	protected String name;
	Random randno=new Random();
	protected long id=randno.nextLong();
	protected BigDecimal salary;
	protected boolean isDead=false;
	
	
	public String getName(){
		return name;
	}
	
	public long getId(){
		return id;
	}
	
	public BigDecimal getSalary(){
		return salary;
	}
	
	public boolean getIsDead(){
		return isDead;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setId(long id){
		this.id=id;
	}
	
	public void setSalary(BigDecimal salary){
		this.salary=salary;
	}
	
	public void setIsDead(boolean isDead){
		this.isDead=isDead;
	}
	

}
