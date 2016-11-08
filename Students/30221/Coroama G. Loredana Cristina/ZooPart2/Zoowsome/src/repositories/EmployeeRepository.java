package repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import models.employees.Employee;
import models.employees.Lisbon;
import models.employees.Roger;
import models.employees.Teresa;
import models.interfaces.XML_Parsable;
import services.factories.Constants;

public class EmployeeRepository {
	private static final String XML_FILENAME = "Employee.xml";
	public EmployeeRepository() {
	}
	public void save(Employee[]  employees) throws FileNotFoundException, XMLStreamException {
			XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
			// Create XMLEventWriter
			XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
			// Create a EventFactory
			XMLEventFactory eventFactory = XMLEventFactory.newInstance();
			XMLEvent end = eventFactory.createDTD("\n");
			// Create and write Start Tag
			StartDocument startDocument = eventFactory.createStartDocument();
			eventWriter.add(startDocument);
			// Create content open tag
			StartElement configStartElement = eventFactory.createStartElement("", "", "content");
			eventWriter.add(configStartElement);
			eventWriter.add(end);
			for (XML_Parsable employee : employees) {
			StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.EMPLOYEE);
			eventWriter.add(sElement);
			eventWriter.add(end);
			employee.encodeToXml(eventWriter);
			EndElement eElement = eventFactory.createEndElement("", "", Constants.XML_TAGS.EMPLOYEE);
			eventWriter.add(eElement);
			eventWriter.add(end);
			}
			eventWriter.add(eventFactory.createEndElement("", "", "content"));
			eventWriter.add(eventFactory.createEndDocument());
			eventWriter.close();
			}
		
		
	
	public  ArrayList<Employee> load() throws ParserConfigurationException, SAXException, IOException {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = (Document) dBuilder.parse(fXmlFile);
		((org.w3c.dom.Node) doc.getDefaultRootElement()).normalize();
		NodeList nodeList = ((org.w3c.dom.Document) doc).getElementsByTagName(Constants.XML_TAGS.EMPLOYEE);
		for (int i = 0; i < nodeList.getLength(); i++) {
		Node node = (Node) nodeList.item(i);
		if (node.getNodeType() == Node.ELEMENT_NODE) {
		Element element = (Element) node;
		String discriminant =((org.w3c.dom.Document) element).getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {
		case Constants.Employee.Caretaker.LISBON:
		Employee ob1 = new Lisbon();
		ob1.decodeFromXml((org.w3c.dom.Element) element);
		employees.add(ob1); break;
		case Constants.Employee.Caretaker.TERESA:
			Employee ob2 = new Teresa();
			ob2.decodeFromXml((org.w3c.dom.Element) element);
			employees.add(ob2); break;
		case Constants.Employee.Caretaker.ROGER:
			Employee ob3 = new Roger();
			ob3.decodeFromXml((org.w3c.dom.Element) element);
			employees.add(ob3); break;
		default:
		break;
		}
		}
		}

		

		return employees; }
	
	public static void createNode(XMLEventWriter eventWriter, String name, String value) throws
	XMLStreamException {
	XMLEventFactory eventFactory = XMLEventFactory.newInstance();
	XMLEvent end = eventFactory.createDTD("\n");
	XMLEvent tab = eventFactory.createDTD("\t");
	// Create Start node
	StartElement sElement = eventFactory.createStartElement("", "", name);
	eventWriter.add(tab);
	eventWriter.add(sElement);
	// Create Content
	Characters characters = eventFactory.createCharacters(value);
	eventWriter.add(characters);
	// Create End node
	EndElement eElement = eventFactory.createEndElement("", "", name);
	eventWriter.add(eElement);
	eventWriter.add(end);
	}

}
