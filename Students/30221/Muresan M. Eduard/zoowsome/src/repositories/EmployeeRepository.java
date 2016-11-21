package repositories;

import java.io.*;
import java.util.ArrayList;

import javax.xml.parsers.*;
import javax.xml.stream.*;
import javax.xml.stream.events.*;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import models.employees.*;
import models.interfaces.XML_Parsable;
import services.factories.Constants;

public class EmployeeRepository {
	private static final String XML_FILENAME = "Employees.xml";
	public EmployeeRepository()
	{
		
	}
	public void save(ArrayList<Employees> employees) throws FileNotFoundException, XMLStreamException
	{
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		StartDocument startDocument = eventFactory.createStartDocument();
		eventWriter.add(startDocument);
		StartElement configStartElement = eventFactory.createStartElement("", "", "content");
		eventWriter.add(configStartElement);
		eventWriter.add(end);
		for (XML_Parsable employee : employees)
		{
			StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.EMPLOYEE);
			eventWriter.add(sElement);
			eventWriter.add(end);
			employee.encodeToXML(eventWriter);
			EndElement eElement = eventFactory.createEndElement("", "", Constants.XML_TAGS.EMPLOYEE);
			eventWriter.add(eElement);
			eventWriter.add(end);
		}
		eventWriter.add(eventFactory.createEndElement("", "", "content"));
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
	}
	public ArrayList<Employees> load() throws ParserConfigurationException, SAXException, IOException
	{
		ArrayList<Employees> employees = new ArrayList<Employees>();
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		
		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.EMPLOYEE);
		
		for (int i = 0; i < nodeList.getLength(); i++)
		{
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE)
			{
				Element element = (Element)node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
				switch (discriminant)
				{
				case Constants.Employees.Caretaker :
					Employees caretaker = new Caretaker();
					caretaker.decodeFromXML(element);
					employees.add(caretaker);
					break;
				default:
						break;
				}
				
			}
		}
		return employees;
	}
	public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException
	{
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		XMLEvent tab = eventFactory.createDTD("\t");
		StartElement sElement = eventFactory.createStartElement("", "", name);
		eventWriter.add(tab);
		eventWriter.add(sElement);
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);
		EndElement eElement = eventFactory.createEndElement("", "", name);
		eventWriter.add(eElement);
		eventWriter.add(end);
	}
}

