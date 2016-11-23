package javasmmr.zoowsome.services.factories;
import javasmmr.zoosome.models.employees.*;



public class EmployeeFactory {
	
	
	
	public Employee getEmployee(String type) throws Exception {
		
		if(Constants.Employee.Caretaker.equals(type) ){
			return new Caretaker();
		}
		else 
			throw new Exception("Invalid Employee type"); 
	}

	
}
