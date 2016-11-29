package javasmmr.zoowsome.models.employees;
import static javasmmr.zoowsome.repositories.EmployeeRepository.createNode;
import javasmmr.zoowsome.models.animals.Animal;
import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I{
	double workingHours;
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "workingHours", String.valueOf(getWorkingHours()));
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Employee.Caretaker);
	}
	
	public void decodeFromXml(Element element) {
		setWorkingHours(Double.valueOf(element.getElementsByTagName("workingHours").item(0).getTextContent()));
		}
	
	public double getWorkingHours(){
		return workingHours;
	}
	
	public void setWorkingHours(double workingHours){
		this.workingHours=workingHours;
	}
	
	/*CONSTRUCTOR FOR CARETAKERS -- ID and isDead are default from Employee class (id->random, isDead->false)*/
	
	public Caretaker(String name, BigDecimal salary, double workingHours){
		this.name=name;
		this.salary=salary;
		this.workingHours=workingHours;
	}
	
	public Caretaker(){
		
	}
	
	public String takeCareOf(Animal a) {
		if (a.kill()) {
		return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if (this.workingHours < a.getMaintenanceCost()){
		return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		
		a.setCare(true);
		this.workingHours=this.workingHours-a.getMaintenanceCost();
		
		return Constants.Employees.Caretakers.TCO_SUCCESS;
		}
}
