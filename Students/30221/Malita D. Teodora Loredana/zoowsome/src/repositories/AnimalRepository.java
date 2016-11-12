package repositories;

import java.io.*;
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
import models.interfaces.XML_Parsable;
import services.factories.animalFactory.Constants.Animals;
import services.factories.employeeFactory.Constants;

public class AnimalRepository {
	private static final String XML_FILENAME = "Animals.xml";
	public AnimalRepository(){}
	public ArrayList<Animal> load () throws ParserConfigurationException, SAXException, IOException {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = (Document) dBuilder.parse(fXmlFile);
		((org.w3c.dom.Document) doc).getDocumentElement().normalize();
		NodeList nodeList = ((org.w3c.dom.Document) doc).getElementsByTagName(Constants.XML_TAGS.ANIMAL);
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
		return animals;
		
	}
	
	public void save(ArrayList<Animal> animals) throws FileNotFoundException,XMLStreamException{
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		StartDocument startDocument = eventFactory.createStartDocument();
		eventWriter.add(startDocument);
		StartElement configStartElement = eventFactory.createStartElement(" ", "", "content");
		eventWriter.add(configStartElement);
		eventWriter.add(end);
		for(Animal Animal : animals){
			StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.ANIMAL);
			eventWriter.add(sElement);
			eventWriter.add(end);
			try {
				Animal.encodeToXml(eventWriter);
			} catch (XMLStreamExceptionMLStreamException e) {
				e.printStackTrace();
			}
			EndElement eElement = eventFactory.createEndElement("", "",Constants.XML_TAGS.ANIMAL);
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
