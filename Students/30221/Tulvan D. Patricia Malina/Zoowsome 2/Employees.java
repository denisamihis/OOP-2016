package javasmmr.zoowsome.models.employees;
import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Employees {
	private String name;
	protected Long id;
	private BigDecimal salary;
	private Boolean isDead;
	
	public Employees(String name, BigDecimal salary,Long id){
		this.name=name;
		this.salary=salary;
		this.id=id;
		this.isDead=false;
	}
	
	public Employees(){
		this.name="Unknown";
		this.id=ThreadLocalRandom.current().nextLong(1000000000000L , 9999999999999L);
		this.salary=BigDecimal.ZERO;
		this.isDead=false;
	}
	
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setSalary(BigDecimal salary){
		this.salary=salary;
	}
	
	public BigDecimal getSalary(){
		return salary;
	}
	
	public void setId(Long id){
		this.id=id;
	}
	
	public Long getId(){
		return id;
	}
	
	public void setIsDead(Boolean isDead){
		this.isDead=isDead;
	}
	
	public Boolean getIsDead(){
		return isDead;
	}
	
}
