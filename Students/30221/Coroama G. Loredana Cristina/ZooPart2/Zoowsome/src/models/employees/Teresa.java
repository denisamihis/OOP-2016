package models.employees;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import services.factories.Constants;

public class Teresa extends Caretaker {
	public 	Teresa() {
		
		setWorkingsHours(5.0);
		setName("teresa");
		setId(18996);
		setDead(false);
		//setSalary();
	}
	
	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Employee.Caretaker.TERESA);
	}
	

	@Override
	public void decodeFromXml(org.w3c.dom.Element element) {
		// TODO Auto-generated method stub
		
	}
}
