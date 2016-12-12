package javasmmr.zoowsome.models.employees;
import javasmmr.zoowsome.services.factories.*;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.animals.Animal;

public  class Caretaker extends Employee implements Caretaker_I{

	public Caretaker(String name, long id, BigDecimal salary, boolean isDead) {
		super(name, id, salary, isDead);
		// TODO Auto-generated constructor stub
	}
	// I did't really get why I had to do this constructor...

	public String TakeCareOf(Animal animal){
		
		if (animal.kill()){
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if (this.workingHours< animal.getMaintenanceCost()){
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		animal.setTakenCareOf(true);
		this.setWorkingHours(workingHours-animal.getMaintenanceCost());
		
		return Constants.Employees.Caretakers.TCO_SUCCES;
	}
	
	public Caretaker(){
		super("John Doe",1,BigDecimal.ZERO,false);
		
	}
	private double workingHours;

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Employees.Caretaker);
		createNode(eventWriter, "workingHours", String.valueOf(this.getWorkingHours()));
		
	}
	
	
	
}
