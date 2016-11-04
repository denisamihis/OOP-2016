package models.employees;
import static repositories.EmployeeRepository.createNode;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import services.factories.*;
import models.animals.*;
public class CareTaker extends Employee implements CareTaker_I{
		private Double workingHours;
		public CareTaker(){
			super("" , BigDecimal.ZERO , false);
		}
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
		public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
			super.encodeToXml(eventWriter);
			createNode(eventWriter, "workingHours" , String.valueOf(getWorkingHours()));
			createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Employee.CareTakers);
		}
		public void decodeFromXml(Element element){
			setWorkingHours(Double.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
			
		}
}
