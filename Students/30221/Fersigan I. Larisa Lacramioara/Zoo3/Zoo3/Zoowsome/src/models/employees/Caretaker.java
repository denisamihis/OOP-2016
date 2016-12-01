package models.employees;

import javax.lang.model.element.Element;

import static  repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import models.interfaces.XML_Parsable;
import services.factories.Constants;
import models.animals.Animal;

public class Caretaker extends Employee{

	private double workingHours;

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}


		@Override
		public String takeCareOf(Animal a) {
			if (a.kill()) {
				return Constants.Employee.Caretaker.TCO_KILLED;
				}
				if (this.getWorkingHours() < a.getMaintenanceCost()){
				return Constants.Employee.Caretaker.TCO_NO_TIME;
				}
				a.setTakeCareOf(true);
				//Set the animal takenCareOf flag to true
				setWorkingHours(getWorkingHours() - a.getMaintenanceCost());
				//Subtract the maintenance cost from the caretakers working hours
				return Constants.Employee.Caretaker.TCO_SUCCESS;
		
	}

		@Override
		public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
			super.encodeToXml(eventWriter);
			createNode(eventWriter, "workinghours", String.valueOf(getWorkingHours()));
			
			}
		@Override
		public void decodeFromXml(org.w3c.dom.Element element) {
			// TODO Auto-generated method stub
			setDead(Boolean.valueOf(  element.getElementsByTagName("workingsHours").item(0).getTextContent()));
			
		}

		
		
		}
	
