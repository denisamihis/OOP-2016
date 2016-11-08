package models.employees;


import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import static repositories.AnimalRepository.createNode;







import models.animals.Animal;
import services.factories.Constants;

public class Caretaker extends Employee  {
private double workingsHours;

public double getWorkingsHours() {
	return workingsHours;
}

public void setWorkingsHours(double workingsHours) {
	this.workingsHours = workingsHours;
}
public Caretaker()
{
	setWorkingsHours(4.0);
	
}
@Override
public String takeCareOf(Animal a) {
	// TODO Auto-generated method stub
	if (a.kill()) {
		return Constants.Employee.Caretaker.TCO_KILLED;
		}
		if (this.getWorkingsHours() < a.getMaintenanceCost()){
		return Constants.Employee.Caretaker.TCO_NO_TIME;
		}
		a.setTakenCareOf(true);
		//Set the animal takenCareOf flag to true
		workingsHours-=a.getMaintenanceCost();
		//Subtract the maintenance cost from the caretakers working hours
		return Constants.Employee.Caretaker.TCO_SUCCESS;
}

public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
super.encodeToXml(eventWriter);
createNode(eventWriter, "workingsHours", String.valueOf(getWorkingsHours()));

}


@Override
public void decodeFromXml(org.w3c.dom.Element element) {
	// TODO Auto-generated method stub
	setDead(Boolean.valueOf(  element.getElementsByTagName("workingsHours").item(0).getTextContent()));
	
}





}
