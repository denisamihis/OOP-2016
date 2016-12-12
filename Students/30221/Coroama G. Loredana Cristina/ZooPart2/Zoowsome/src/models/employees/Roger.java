package models.employees;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import services.factories.Constants;

public class Roger extends Caretaker {
	public 	Roger() {
		
		setWorkingsHours(2.0);
		setName("Roger");
		setId(18996);
		setDead(false);
		//setSalary();
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Employee.Caretaker.ROGER);
	}
	

	public void decodeFromXml(org.w3c.dom.Element element) {
		// TODO Auto-generated method stub
		
	}
	
}
