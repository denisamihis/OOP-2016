package javasmmr.zoowsome.models.employees;
import java.math.*;
import javasmmr.zoowsome.services.factories.*;
import javasmmr.zoowsome.models.animals.*;

public class Caretaker extends Employee implements Caretaker_I {
   protected double workingHours;
   public Caretaker(String name,BigDecimal Salary,double workingHours){
	   super(name,Id.getId(),Salary);
	   this.workingHours=workingHours;
   }
   public Caretaker(){
	   super("necunoscut",Id.getId(),null);
   }
    public void setWorkingHours(double hours){
    	this.workingHours=hours;
    }
    
    public double getWorkingHours(){
    	return workingHours;
    }
    
    
    public String takeCareOf(Animal a){
    	 			if (a.kill()){
    	 				return Constants.Employees.Caretakers.TCO_KILLED;
    	 			}
    	 			if (this.workingHours < a.getMaintenanceCost()){
    	 				return Constants.Employees.Caretakers.TCO_NO_TIME;
    	 			}
    	 			a.setTakenCareOf(true);
    	 			this.setWorkingHours(this.getWorkingHours() - a.getMaintenanceCost());
    	 			return Constants.Employees.Caretakers.TCO_SUCCESS;
    	 		}
}
