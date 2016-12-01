package models.employees;

public class Caretaker extends Employee{
	Double workingHours;
	
	public void setWorkingHours(Double workingHours){
		this.workingHours=workingHours;
	}
	public Double getWorkingHours(){
		return workingHours;
	}
	
	public Caretaker(String name){
		setName(name);
		setId();
		setSalary(5672);
		setIsDead(false);
		setWorkingHours(40.3);
	}
	public Caretaker(String name,int salary, Double workingHours){
		setName(name);
		setId();
		setSalary(salary);
		setIsDead(false);
		setWorkingHours(workingHours);
	}
	
}