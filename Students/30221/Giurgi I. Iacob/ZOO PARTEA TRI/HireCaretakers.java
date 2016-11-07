package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.EmployeeAbstractFactory;
import javasmmr.zoowsome.services.factories.EmployeeFactory;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import java.util.*;



public class HireCaretakers {
       

		public HireCaretakers(){
        }
          
          public Caretaker [] Hire(int number) throws Exception{
           ArrayList<Employee> array = new ArrayList<Employee>();
      	   EmployeeRepository database_angajati = new EmployeeRepository();
           Caretaker[] staff = new Caretaker[number];
           EmployeeAbstractFactory emp = new EmployeeAbstractFactory ();
           EmployeeFactory caretakerFactory = emp.getEmployeeFactory(Constants.Employees.Caretaker);
           for(int i=0;i<number;i++){
        		staff[i] = (Caretaker) caretakerFactory.getEmployee();
        		array.add(staff[i]);
        	}
           database_angajati.save(array);
        	return staff;
          }
}
