package javasmmr.zoosome.models.employees;

import java.math.BigDecimal;
import java.util.Random;


public abstract class Employee  {
	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead=false;

	
	

	public Employee(String name, long id, BigDecimal salary, boolean isDead) {
		// TODO Auto-generated constructor stub
	}

	public String getName(){
		return name;
	}
	
	public void setName(String name){
		name=this.name;
	}
	
	public BigDecimal getSalary(){
		return salary;
	}
	public void setSalary(BigDecimal salary){
		salary=this.salary;
	}
   
	public long getId(){
		return id;
	}
	
	public void setId(){
		Random rand=new Random();
		id=rand.nextLong();
		
	}
	
	public boolean getIsDead(){
		return isDead;
	}
	
	public void setIsDead(boolean isDead){
		
		isDead=this.isDead;
		
	}


}
