package repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.lang.model.element.Element;
import javax.swing.text.Document;
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

import models.animlas.Animal;
import models.animlas.XMLStreamExceptionMLStreamException;
import models.employees.Employee;
import services.factories.employeeFactory.Constants;

public class EmployeeRepository {
	private static final String XML_FILENAME = "Employees.xml";
	public EmployeeRepository(){}
	public ArrayList<Employee> load () throws ParserConfigurationException, SAXException, IOException {
		ArrayList<Employee> e = new ArrayList<Employee>();
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = (Document) dBuilder.parse(fXmlFile);
		((org.w3c.dom.Document) doc).getDocumentElement().normalize();
		NodeList nodeList = ((org.w3c.dom.Document) doc).getElementsByTagName(Constants.XML_TAGS.EMPLOYEE);
		int i;
		for(i=0;i<nodeList.getLength();i++){
			Node node = (Node) nodeList.item(i);
			if(node.getNodeType()==Node.ELEMENT_NODE){
				Element element = (Element) node;
				String discriminant = ((org.w3c.dom.Document) element).getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
				switch(discriminant){
				
				}
				
			}
			
		}
		return e;
	}
	public void save(ArrayList<Employee> em) throws FileNotFoundException,XMLStreamException{
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		StartDocument startDocument = eventFactory.createStartDocument();
		eventWriter.add(startDocument);
		StartElement configStartElement = eventFactory.createStartElement(" ", "", "content");
		eventWriter.add(configStartElement);
		eventWriter.add(end);
		for(Employee Emp : em){
			StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.EMPLOYEE);
			eventWriter.add(sElement);
			eventWriter.add(end);
			try {
				Emp.encodeToXml(eventWriter);
			} catch (XMLStreamExceptionMLStreamException e) {
				e.printStackTrace();
			}
			EndElement eElement = eventFactory.createEndElement("", "",Constants.XML_TAGS.EMPLOYEE);
			eventWriter.add(eElement);
			eventWriter.add(end);
		}
		eventWriter.add(eventFactory.createEndElement("", "", "content"));
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
		
	}
	public static void createNode(XMLEventWriter eventWriter,String name,String value) throws XMLStreamException{
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		XMLEvent tab = eventFactory.createDTD("\t");
		StartElement sElement = eventFactory.createStartElement("", "", name);
		eventWriter.add(tab);
		eventWriter.add(sElement);
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);
		EndElement eElement = eventFactory.createEndElement("", "",name);
		eventWriter.add(eElement);
		eventWriter.add(end);
	}
}
