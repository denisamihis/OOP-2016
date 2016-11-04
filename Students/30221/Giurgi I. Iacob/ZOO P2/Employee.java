package javasmmr.zoowsome.models.employees;
import java.math.*;

public abstract class Employee {
          protected String name;
          protected Long id;
          protected BigDecimal Salary;
          protected boolean isDead;
          
          public Employee(String name,Long id,BigDecimal Salary){
        	  this.name=name;
        	  this.id=id;
        	  this.Salary=Salary;
        	  isDead=false;
          }
          
          public void setIsDead(boolean dead){
        	  this.isDead=dead;
          }
          
          public String getName(){
        	  return name;
          }
          
          public Long getId(){
        	  return id;
          }
          
          public BigDecimal getSalary(){
        	  return Salary;
          }
          
          public boolean getIsDead(){
        	  return isDead;
          }
}
