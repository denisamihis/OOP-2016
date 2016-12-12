package javasmmr.zoowsome.repositories;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import javasmmr.zoowsome.controllers.Constants;
import javasmmr.zoowsome.interfaces.XML_Parsable;
import javasmmr.zoowsome.models.animals.Animal;

public class AnimalRepository {
	private static final String XML_FILENAME = "Animals.xml";
	public AnimalRepository() {
	}
	public void save(ArrayList <Animal> animals) throws FileNotFoundException, XMLStreamException {
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance() ;
		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter (new FileOutputStream(XML_FILENAME));
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n ");
		StartDocument startDocument = eventFactory.createStartDocument( );
		eventWriter.add(startDocument);
		StartElement configStartElement = eventFactory.createStartElement("", "", "con tent");
		eventWriter.add(configStartElement);
		eventWriter.add(end);
		for (XML_Parsable animal : animals) {
		Object StartElementsElement = eventFactory.createStartElement ("", "", Constants.XML_TAGS.ANIMAL);
		eventWriter.add(sElement);
		eventWriter.add(end);
		animal.encodeToXml (eventWriter);
		EndElement eElement = eventFactory.createEndElement("", "", Constants.XML_TAGS.ANIMAL);
		eventWriter.add(eElement);
		eventWriter.add(end);
		}
		eventWriter.add(eventFactory.createEndElement("", "", " content"));
		eventWriter.add(eventFactory.createEndDocument() );
		eventWriter.close( );
		}

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
