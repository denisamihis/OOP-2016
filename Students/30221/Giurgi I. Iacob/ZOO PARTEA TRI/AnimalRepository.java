package javasmmr.zoowsome.repositories;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

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

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.factories.Constants;

import java.io.File;
// import javasmmr.zoowsome.services.*;
import javasmmr.zoowsome.models.animals.*;
public class AnimalRepository {
	private static final String XML_FILENAME = "Animals.xml";
	
	public AnimalRepository() {}
	
	public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException {
			XMLOutputFactory outputFactory = XMLOutputFactory. newInstance();
			// Create XMLEventWriter
			XMLEventWriter eventWriter = outputFactory.createXMLEventWriter( new FileOutputStream( XML_FILENAME));
			// Create a EventFactory
			XMLEventFactory eventFactory = XMLEventFactory. newInstance();
			XMLEvent end = eventFactory.createDTD( "\n");
			// Create and write Start Tag
			StartDocument startDocument = eventFactory.createStartDocument();
			eventWriter .add(startDocument);
			// Create content open tag
			StartElement configStartElement = eventFactory.createStartElement( "", "", "content" );
			eventWriter .add(configStartElement);
			eventWriter .add(end);
			for (XML_Parsable animal : animals) {
			StartElement sElement = eventFactory.createStartElement( "", "", Constants.XML_TAGS. ANIMAL);
			eventWriter .add(sElement);
			eventWriter .add(end);
			animal.encodeToXml( eventWriter);
			EndElement eElement = eventFactory.createEndElement( "", "", Constants.XML_TAGS. ANIMAL );
			eventWriter .add(eElement);
			eventWriter .add(end);
			}
			eventWriter .add(eventFactory.createEndElement( "" , "", "content" ));
			eventWriter .add(eventFactory.createEndDocument());
			eventWriter .close();
			}
		
	public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {
     	XMLEventFactory eventFactory = XMLEventFactory. newInstance();
	    XMLEvent end = eventFactory.createDTD("\n");
	    XMLEvent tab = eventFactory.createDTD("\t");
	// Create Start node
	   StartElement sElement = eventFactory.createStartElement("", "", name);
	   eventWriter.add(tab);
	   eventWriter.add(sElement);
	// Create Content
	   Characters characters = eventFactory.createCharacters( value);
	   eventWriter.add(characters);
	 // Create End node
	   EndElement eElement = eventFactory.createEndElement( "", "", name);
	   eventWriter.add(eElement);
	   eventWriter.add(end);
	}
	public ArrayList<Animal> load()  throws ParserConfigurationException , SAXException , IOException, org.xml.sax.SAXException{
		 		ArrayList<Animal> animals = new ArrayList<Animal>();
		 		
		 		File fXmlFile = new File(XML_FILENAME);
		 		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		 		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		 		org.w3c.dom.Document doc = dBuilder.parse(fXmlFile);
		 		doc.getDocumentElement().normalize();
		 		
		 		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);
		 		
		 		for (int i=0; i< nodeList.getLength(); i++){
		 			Node node = nodeList.item(i);
		 		if (node.getNodeType() == Node.ELEMENT_NODE){
		 				Element element = (Element) node;
		 				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		 				switch (discriminant){
		 				case Constants.Animals.Insects.Butterfly:{
		 					Animal butterfly = new Butterfly();
		 					butterfly.decodeFromXml(element);
		 					animals.add(butterfly);
		 					break;
		 				}
		 				case Constants.Animals.Insects.Cockroach:{
		 					Animal cockroach = new Cockroach();
		 				cockroach.decodeFromXml(element);
		 					animals.add(cockroach);
		 					break;
		 				}
		 				case Constants.Animals.Reptiles.Lizard:{
		 					Animal lizard = new Lizard();
		 					lizard.decodeFromXml(element);
		 					animals.add(lizard);
		 					break;
		 				}
		 				case Constants.Animals.Aquatics.FishFresh:{
		 					Animal fishfresh = new FishFresh();
		 					fishfresh.decodeFromXml(element);
		 					animals.add(fishfresh);
		 					break;
		 				}
		 				case Constants.Animals.Birds.Ostrich:{
		 					Animal Ostrich = new Ostrich();
		 					Ostrich.decodeFromXml(element);
		 					animals.add(Ostrich);
		 					break;
		 				}
		 				case Constants.Animals.Birds.Vulture:{
		 					Animal Vulture = new Vulture();
		 					Vulture.decodeFromXml(element);
		 					animals.add(Vulture);
		 					break;
		 				}
		 				case Constants.Animals.Mammals.Cow:{
		 					Animal Cow = new Cow();
		 					Cow.decodeFromXml(element);
		 					animals.add(Cow);
		 					break;
		 				}
		 				case Constants.Animals.Mammals.Monkey:{
		 					Animal Monkey = new Monkey();
		 					Monkey.decodeFromXml(element);
		 					animals.add(Monkey);
		 					break;
		 				}
		 				case Constants.Animals.Birds.Woodpecker:{
		 					Animal Woodpecker = new Woodpecker();
		 					Woodpecker.decodeFromXml(element);
		 					animals.add(Woodpecker);
		 					break;
		 				}
		 				case Constants.Animals.Aquatics.Shark:{
		 					Animal shark = new Shark();
		 					shark.decodeFromXml(element);
		 					animals.add(shark);
		 					break;
		 				}
		 				case Constants.Animals.Aquatics.Whale:{
		 					Animal whale = new Whale();
		 					whale.decodeFromXml(element);
		 					animals.add(whale);
		 					break;
		 				}
		 				case Constants.Animals.Reptiles.Snake:{
		 					Animal snake = new Snake();
		 					snake.decodeFromXml(element);
		 					animals.add(snake);
		 					break;
		 				}
		 				case Constants.Animals.Insects.Spider:{
		 					Animal spider = new Spider();
		 					spider.decodeFromXml(element);
		 					animals.add(spider);
		 					break;
		 				}
		 				case Constants.Animals.Mammals.Tiger:{
		 					Animal tiger = new Tiger();
		 					tiger.decodeFromXml(element);
		 					animals.add(tiger);
		 					break;
		 				}
		 				case Constants.Animals.Reptiles.Seaturtle:{
		 					Animal Seaturtle = new Seaturtle();
		 					Seaturtle.decodeFromXml(element);
		 					animals.add(Seaturtle);
		 					break;
		 				}
		 				default:break;
		 				}
		 			}
		 	}
		 		return animals;
}
}
