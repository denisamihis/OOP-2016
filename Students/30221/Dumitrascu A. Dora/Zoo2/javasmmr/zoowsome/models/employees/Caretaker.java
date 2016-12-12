package javasmmr.zoowsome.models.employees;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I{
	double workingHours;
	
	public double getWorkingHours(){
		return workingHours;
	}
	
	public void setWorkingHours(double workingHours){
		this.workingHours=workingHours;
	}
	
	public String takeCareOf(Animal a) {
		if (a.kill()) {
		return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if (this.workingHours < a.getMaintenanceCost()){
		return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		
		a.setCare(true);
		this.workingHours=this.workingHours-a.getMaintenanceCost();
		
		return Constants.Employees.Caretakers.TCO_SUCCESS;
		}
}
