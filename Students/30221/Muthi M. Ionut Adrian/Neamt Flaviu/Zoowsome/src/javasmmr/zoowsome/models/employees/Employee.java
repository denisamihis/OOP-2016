package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;
import java.util.Random;

public abstract class Employee {
public String name;
public long id;
public boolean isDead=false;
public BigDecimal salary;
public String getName(){
	return name;
}
public void setName(String name){
	name=this.name;
}
public long getId(){
	return id;
}
public void setId(){
	Random aiurea=new Random();
	id=aiurea.nextLong();
}
public boolean getIsDead(){
	return isDead;
}
public void setIsDead(boolean dead){
	isDead=dead;
}
public BigDecimal getSalary(){
	return salary;
}
public void setSalary(BigDecimal salary){
	salary=this.salary;
}
}
