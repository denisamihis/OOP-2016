package javasmmr.zoosome.models.employees;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;


public class Caretaker extends Employee implements Caretaker_I   {
	
	private double workingHours;
	
	public Caretaker(String name,long id,BigDecimal salary,boolean isDead ){
		super(name,id,salary,isDead);
	}
	
	public Caretaker(){
		super("Ion",1,BigDecimal.ZERO,false);
	}
	
	public double getWorkingHours(){
		return workingHours;
	}
	
	public void setWorkingHouers(double hours){
		workingHours=hours;
	}

	@Override
	public String takeCareOf(Animal animal) {
		
		    
		 if(animal.kill()){
    		return Constants.Employees.Caretakers.TCO_KILLED;
    	 }
    	 else
    		 if (this.workingHours<animal.getMaintenanceCost()){
    		    
    			return Constants.Employees.Caretakers.TCO_NO_TIME;
    	 }
    	 animal.setTakenCareOf(true);
    	 this.setWorkingHouers(workingHours-animal.getMaintenanceCost());
    	 return Constants.Employees.Caretakers.TCO_SUCCES;
		    	
			
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Employees.Caretaker);
		}


}
