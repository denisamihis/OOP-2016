package javasmmr.zoowsome.repositories;

import javasmmr.zoowsome.models.Caretaker;
import javasmmr.zoowsome.models.Employee;
import javasmmr.zoowsome.services.Constants;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.Element;


public class EmployeeRepository extends EntityRepository<Employee> {
	
	private static final String XML_FILENAME = "Employees.xml";
	
	public EmployeeRepository()
	{
		super(XML_FILENAME,Constants.XML_TAGS.EMPLOYEE);
	}
		
	
	@Override
	protected Employee getEntityFromXmlElement(Element element)
	{
		Caretaker caretaker = new Caretaker();
		caretaker.decodeFromXml(element);
		return caretaker;
	}
	
	public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException
	{
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		XMLEvent tab = eventFactory.createDTD("\t");
		
		//Create start node
		StartElement sElement = eventFactory.createStartElement("", "", name);
		eventWriter.add(tab);
		eventWriter.add(sElement);
		
		//Create content
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);
		
		//Create end node
		EndElement eElement = eventFactory.createEndElement("","",name);
		eventWriter.add(eElement);
		eventWriter.add(end);
	}
}
