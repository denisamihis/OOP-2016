package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.EmployeeAbstractFactory;
import javasmmr.zoowsome.services.factories.EmployeeFactory;

public class HireCaretakers {
       

		public HireCaretakers(){
        }
          
          public Caretaker [] Hire(int number) throws Exception{
        	Caretaker[] staff = new Caretaker[number];
           EmployeeAbstractFactory emp = new EmployeeAbstractFactory ();
           EmployeeFactory caretakerFactory = emp.getEmployeeFactory(Constants.Employees.Caretaker);
           for(int i=0;i<number;i++){
        		staff[i] = (Caretaker) caretakerFactory.getEmployee();
        	}
        	return staff;
          }
}
