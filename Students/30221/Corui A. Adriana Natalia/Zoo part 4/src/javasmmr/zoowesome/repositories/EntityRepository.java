package javasmmr.zoowesome.repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javasmmr.zoowesome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Duck;
import javasmmr.zoowsome.models.animals.Jellyfish;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Owl;
import javasmmr.zoowsome.models.animals.Pigeon;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Spider;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.animals.Turtle;
import javasmmr.zoowsome.services.factories.Constants;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
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
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public abstract class EntityRepository<T extends XML_Parsable> {

	private final String xmlFilename;
	private final String entityTag;
	public EntityRepository(String xmlFilename,String entityTag)
	{
		this.xmlFilename=xmlFilename;
		this.entityTag=entityTag;
	}
	public void save(ArrayList<T> entities) throws FileNotFoundException, XMLStreamException
	{
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(this.xmlFilename));
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end=eventFactory.createDTD("\n");
		StartDocument startDocument=eventFactory.createStartDocument();
		eventWriter.add(startDocument);
		StartElement configStartElement = eventFactory.createStartElement("","","content");
		eventWriter.add(configStartElement);
		eventWriter.add(end);
		
		for(XML_Parsable entity : entities)
		{
			StartElement sElement = eventFactory.createStartElement("","",this.entityTag);
			eventWriter.add(sElement);
			eventWriter.add(end);
			
			entity.encodeToXml(eventWriter);
			
			EndElement eElement = eventFactory.createEndElement("","",this.entityTag);
			eventWriter.add(eElement);
			eventWriter.add(end);
			
		}
		eventWriter.add(eventFactory.createEndElement("","","content"));
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
		
	}
	protected abstract T getEntityFromXmlElement(Element element);
	public  ArrayList<T>  load() throws ParserConfigurationException, SAXException, IOException
	{
		ArrayList <T> entities = new ArrayList<>();
		File fXmlFile = new File(this.xmlFilename);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		org.w3c.dom.Document doc =  dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		
		NodeList nodeList = doc.getElementsByTagName(this.entityTag);
		
		for(int i=0;i< nodeList.getLength();i++)
		{
			Node node = nodeList.item(i);
			if(node.getNodeType()==Node.ELEMENT_NODE)
			{
				Element element = (Element) node;
				entities.add(getEntityFromXmlElement(element));
			}
		}
		return entities;
	}
	public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException
	{
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		XMLEvent tab = eventFactory.createDTD("\t");
		StartElement sElement = eventFactory.createStartElement("","",name);
		eventWriter.add(tab);
		eventWriter.add(sElement);
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);
		EndElement eElement = eventFactory.createEndElement("","",name);
		eventWriter.add(eElement);
		eventWriter.add(end);
	}
}
