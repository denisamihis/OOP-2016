package javasmmr.zoowsome.repositories;

import java.io.*;
import java.util.ArrayList;

import javax.xml.parsers.*;
import javax.xml.stream.*;
import javax.xml.stream.events.*;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.services.factories.animals.Constants;


public class AnimalRepository {
	
	private static final String XML_FILENAME="Animals.xml";
	
	public AnimalRepository(){
		
	}
	
	public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException{
		
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
 		// Create XMLEventWrite
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
		for (XML_Parsable animal : animals) {
			StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.ANIMAL);
		 	eventWriter.add(sElement);
		 	eventWriter.add(end);
		 	animal.encodeToXml(eventWriter);
		 	EndElement eElement = eventFactory.createEndElement("", "", Constants.XML_TAGS.ANIMAL);
		 	eventWriter.add(eElement);
		 	eventWriter.add(end);
		}
		eventWriter.add(eventFactory.createEndElement("", "", "content"));
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
	}
	
	public ArrayList<Animal> load() throws SAXException, IOException, ParserConfigurationException{
		ArrayList<Animal> animals = new ArrayList<Animal>();
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);
 		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
		 		Element element = (Element) node;
		 		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		 		switch (discriminant) {
		 			case Constants.Animals.Insects.Butterfly:
		 				Animal butterfly = new Butterfly();
		 				butterfly.decodeFromXml(element);
		 				animals.add(butterfly);
		 				break;
		 			case Constants.Animals.Insects.Cockroach:
		 				Animal cockroach = new Cockroach();
		 				cockroach.decodeFromXml(element);
		 				animals.add(cockroach);
		 				break;
					case Constants.Animals.Insects.Spider:
	 					Animal spider = new Spider();
		 				spider.decodeFromXml(element);
		 				animals.add(spider);
		 				break;
		 			case Constants.Animals.Mammals.Cow:
		 				Animal cow = new Cow();
						cow.decodeFromXml(element);
	 					animals.add(cow);
	 					break;
		 			case Constants.Animals.Mammals.Monkey:
		 				Animal monkey = new Monkey();
		 				monkey.decodeFromXml(element);
		 				animals.add(monkey);
						break;
	 				case Constants.Animals.Mammals.Tiger:
	 					Animal tiger = new Tiger();
		 				tiger.decodeFromXml(element);
		 				animals.add(tiger);
		 				break;
		 			case Constants.Animals.Aquatics.Dolphin:
						Animal dolphin = new Dolphin();
	 					dolphin.decodeFromXml(element);
	 					animals.add(dolphin);
	 					break;
		 			case Constants.Animals.Aquatics.Whale:
		 				Animal whale = new Whale();
						whale.decodeFromXml(element);
	 					animals.add(whale);
	 					break;
	 				case Constants.Animals.Aquatics.Shark:
	 					Animal shark = new Shark();
	 					shark.decodeFromXml(element);
	 					animals.add(shark);
	 					break;
	 				case Constants.Animals.Reptiles.Lizard:
	 					Animal lizard = new Lizard();
	 					lizard.decodeFromXml(element);
	 					animals.add(lizard);
	 					break;
	 				case Constants.Animals.Reptiles.Snake:
	 					Animal snake = new Snake();
	 					snake.decodeFromXml(element);
	 					animals.add(snake);
	 					break;
	 				case Constants.Animals.Reptiles.Turtle:
	 					Animal turtle = new Turtle();
	 					turtle.decodeFromXml(element);
	 					animals.add(turtle);
	 					break;
	 				case Constants.Animals.Birds.Chicken:
	 					Animal chicken = new Chicken();
	 					chicken.decodeFromXml(element);
	 					animals.add(chicken);
	 					break;
	 				case Constants.Animals.Birds.Owl:
	 					Animal owl = new Owl();
	 					owl.decodeFromXml(element);
	 					animals.add(owl);
	 					break;
	 				case Constants.Animals.Birds.Eagle:
	 					Animal eagle = new Eagle();
	 					eagle.decodeFromXml(element);
	 					animals.add(eagle);
	 					break;
	 				default:
	 					break;
		 		}
		 	}
		 }
		 		return animals;
	}
	
	public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {
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
