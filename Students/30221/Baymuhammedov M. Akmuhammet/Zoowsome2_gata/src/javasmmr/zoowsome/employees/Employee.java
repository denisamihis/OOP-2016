package javasmmr.zoowsome.employees;

public abstract class Employee {
	private String name;
	private Long id;
	private Integer Salary;
	private Boolean isDead;
	
	public Employee(String name, Long id, Integer Salary, Boolean isDead){
		this.name=name;
		this.id=id;
		this.Salary=Salary;
		this.isDead=isDead;
	}
	
	public Employee(){
		
		
	}
	
	public String getname(){
		return name;
	}
	
	public void setname(String name){
		this.name=name;
		
	}
	
	public Long getid(){
		return id;
	}
	
	public void setid(Long id){
		this.id=id;
	}
	
	public Integer getSalary(){
		return Salary;
	}
	
	public void setSalary(Integer salary){
		this.Salary=salary;
	}
	
	public Boolean getisDead(){
		return isDead;
	}
	
	public void setisDead(boolean isdead){
		this.isDead=isdead;
	}

}
