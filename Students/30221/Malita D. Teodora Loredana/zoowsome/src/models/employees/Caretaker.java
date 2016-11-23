package models.employees;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import models.animlas.Animal;
import repositories.EmployeeRepository;
import services.factories.employeeFactory.Constants;

public class Caretaker extends Employee implements Caretaker_I {
	protected double workingHours;
	public Caretaker(String name, BigDecimal salary, long id,double workingHours){
		super(name,salary,id);
		this.workingHours=workingHours;
	}
	public Caretaker()
	{
		super("Unknown",null,0);
		workingHours=10;
	}
	public double getWorkingHours(){
		return workingHours;
	}
	public void setWorkingHours(double workingHours){
		this.workingHours=workingHours;
	}
	public String takeCareOf(Animal a){
		if(this.workingHours<a.getMaintenanceCost())
			return Constants.Cartakers.TCO_NO_TIME;
		if(a.kill())
			return Constants.Cartakers.TCO_KILLED;
		a.setTakenCareOf(true);
		this.workingHours=this.workingHours - a.getMaintenanceCost();
		return Constants.Cartakers.TCO_SUCCESS;	
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		EmployeeRepository.createNode(eventWriter,"workingHours",String.valueOf(getWorkingHours()));
	}
	public void decodeFromXml(Element element){
		setWorkingHours(Double.valueOf(element.getElementsByTagName("workingHours").item(0).getTextContent()));
	}

}
