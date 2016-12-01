package models.employees;

import java.util.concurrent.ThreadLocalRandom;


public abstract class Employee{
	
	String name;
	Long id;
	int salary;
	boolean isDead;
	
	public void setId(){
		id = ThreadLocalRandom.current().nextLong(1000000000000L , 9999999999999L);
	}
	
	
	public void setName(String name){
		this.name=name;
	}
	public void setSalary(int salary){
		this.salary=salary;
	}
	public void setIsDead(boolean isDead){
		this.isDead=isDead;
	}
	public String getName(){
		return name;
	}
	public int getSalary(){
		return salary;
	}
	public boolean getIsDead(){
		return isDead;
	} 
	public long getId(){
		return id;
	} 
}