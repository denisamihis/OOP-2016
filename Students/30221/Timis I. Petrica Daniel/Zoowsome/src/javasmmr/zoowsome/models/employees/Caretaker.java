package javasmmr.zoowsome.models.employees;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.constants.Constants;

public class Caretaker extends Employee implements Caretaker_I {

	private Double workingHours;

	public Caretaker(String name, Long id, BigDecimal salary, Double workingHours) {
		super(name, id, salary);
		this.workingHours = workingHours;
	}

	public Caretaker() {
		super();
		workingHours = 0.0;
	}

	public Double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(Double workingHours) {
		this.workingHours = workingHours;
	}
	
	public String takeCareOf(Animal a) {
		if(a.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}

		if(this.workingHours < a.getMaintenanceCost()) {
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}

		a.setTakenCareOf(true);
		workingHours -= a.getMaintenanceCost();

		return Constants.Employees.Caretakers.TCO_SUCCES;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "workingHours", String.valueOf(getWorkingHours()));
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Employees.CARETAKER);
	}

	public void decodeFromXml(Element element) {
		setWorkingHours(Double.valueOf(element.getElementsByTagName("workingHours").item(0).getTextContent()));
	}
	
}
