package javasmmr.zoowsome.repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

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

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Bee;
import javasmmr.zoowsome.models.animals.Bug;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Chameleon;
import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Eagle;
import javasmmr.zoowsome.models.animals.Lion;
import javasmmr.zoowsome.models.animals.Lizard;
import javasmmr.zoowsome.models.animals.Octopus;
import javasmmr.zoowsome.models.animals.Panther;
import javasmmr.zoowsome.models.animals.Parrot;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.animals.Tucan;
import javasmmr.zoowsome.models.interfaces.XML_Parable;
import javasmmr.zoowsome.services.factories.Constants;

public abstract class EntityRepository<T extends XML_Parable> {

	private final String xmlFilename;
	private final String entityTag;
	
	public EntityRepository( String entityTag, String xmlFilename){
		this.xmlFilename=xmlFilename;
		this.entityTag=entityTag;
	}
	
	public static void createNode(XMLEventWriter eventWriter, String name, String value) throws
	XMLStreamException {
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
	
	
	
	public void save(ArrayList<T> entities) throws FileNotFoundException, XMLStreamException { 
		XMLOutputFactory outputFactory=XMLOutputFactory.newInstance();
		XMLEventWriter eventWriter=outputFactory.createXMLEventWriter(new FileOutputStream(this.xmlFilename));
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		StartDocument startDocument = eventFactory.createStartDocument();
		eventWriter.add(startDocument);
		StartElement configStartElement = eventFactory.createStartElement("", "", "content");
		eventWriter.add(configStartElement);
		eventWriter.add(end);
		
		for(T entitity : entities){
			StartElement eElement=eventFactory.createStartElement("","",this.entityTag);
		    eventWriter.add(eElement);
		    eventWriter.add(end);
		}
		
		eventWriter.add(eventFactory.createEndElement("", "", "content"));
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
		
	}
	
	protected abstract T getEntityFromXmlElement(Element element);
	
	
	public ArrayList<T> load() throws ParserConfigurationException, SAXException, IOException { 
		ArrayList<T> entities = new ArrayList<T>();
		File fXmlFile = new File(xmlFilename);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = (Document) dBuilder.parse(fXmlFile);
		((org.w3c.dom.Document) doc).getDocumentElement().normalize();
		
		NodeList nodeList = ((Element) doc).getElementsByTagName(Constants.XML_TAGS.ANIMAL);
		
		for(int j=0;j<nodeList.getLength();j++){
			Node node=(Node) nodeList.item(j);
			if(node.getNodeType()==Node.ELEMENT_NODE){
				Element element=(Element) node;
				String discriminant=element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
				
				
				for (int i = 0; i < nodeList.getLength(); i++) {
					Node node1 = (Node) nodeList.item(i);
					if (node1.getNodeType() == Node.ELEMENT_NODE) {
					Element element1 = (Element) node1;
					entities.add(getEntityFromXmlElement(element1));
					}
					}
		
		}
	}
		return entities;
		
}
}
