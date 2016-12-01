
package models.employees;
import java.math.BigDecimal;
import services.factories.*;
import models.animals.*;
public class CareTaker extends Employee implements CareTaker_I{
		private Double workingHours;
		public CareTaker(String name , BigDecimal salary , boolean isDead , Double hours){
			super(name , salary , isDead);
			setWorkingHours(hours);
		}
		public Double getWorkingHours(){
			return workingHours;
		}
		public void setWorkingHours(Double workingHours){
			this.workingHours = workingHours;
		}
		public String takeCareOf(animals a){
			if (a.kill()){
				return Constants.Employees.CareTakers.TCO_KILLED;
			}
			if (this.workingHours < a.getMaintenanceCost()){
				return Constants.Employees.CareTakers.TCO_NO_TIME;
			}
			a.setTakenCareOf(true);
			this.setWorkingHours(this.getWorkingHours() - a.getMaintenanceCost());
			return Constants.Employees.CareTakers.TCO_SUCCESS;
		}
}
