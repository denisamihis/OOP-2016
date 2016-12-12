package javasmmr.zoowsome.services.factories;


public class EmployeeAbstractFactory {
     
	public EmployeeFactory getEmployeeFactory(String type) throws Exception{
    	 if(Constants.Employees.Caretaker.equals(type))
    		 return new CareTakerFactory();
    	 else throw new Exception("Invalid employee");
     }
}
