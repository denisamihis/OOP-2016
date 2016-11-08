package repositories;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.Node;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import javax.xml.stream.XMLStreamException;
import models.animals.Animal;
import models.animals.Butterfly;
import models.animals.Chicken;
import models.animals.Cockroach;
import models.animals.Cow;
import models.animals.Dolphin;
import models.animals.Eagle;
import models.animals.Lizard;
import models.animals.Monkey;
import models.animals.Owl;
import models.animals.ReggaeShark;
import models.animals.SeaHorse;
import models.animals.Snake;
import models.animals.Spider;
import models.animals.Tiger;
import models.animals.Turtle;
import models.animals.WaterType;
import models.interfaces.XML_Parsable;
import services.factories.Constants;

public class AnimalRepository {
	private static final String XML_FILENAME = "Animals.xml";
	public AnimalRepository() {
	}
	public void save(Animal[]  animals) throws FileNotFoundException, XMLStreamException {
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
		
		
	public WaterType type;
	public  ArrayList<Animal> load() throws ParserConfigurationException, SAXException, IOException {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = (Document) dBuilder.parse(fXmlFile);
		((org.w3c.dom.Node) doc.getDefaultRootElement()).normalize();
		NodeList nodeList = ((org.w3c.dom.Document) doc).getElementsByTagName(Constants.XML_TAGS.ANIMAL);
		for (int i = 0; i < nodeList.getLength(); i++) {
		Node node = (Node) nodeList.item(i);
		if (node.getNodeType() == Node.ELEMENT_NODE) {
		Element element = (Element) node;
		String discriminant =
		((org.w3c.dom.Document) element).getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {
		case Constants.Animal.Insect.Butterfly:
		Animal butterfly = new Butterfly();
		butterfly.decodeFromXml((org.w3c.dom.Element) element);
		animals.add(butterfly);break;
		case Constants.Animal.Insect.Spider:
			Animal Spider = new Spider();
			Spider.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(Spider); break;
		case Constants.Animal.Insect.Cockroach:
			Animal Cockroach = new Cockroach();
			Cockroach.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(Cockroach);break;
		case Constants.Animal.Mammal.Tiger:
			Animal Tiger = new Tiger();
			Tiger.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(Tiger);break;
		case Constants.Animal.Mammal.Cow:
			Animal cow = new Cow();
			cow.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(cow);break;
		case Constants.Animal.Mammal.Monkey:
			Animal monkey = new Monkey();
			monkey.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(monkey);break;
		case Constants.Animal.Bird.Owl:
			Animal owl = new Owl();
			owl.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(owl);break;
		case Constants.Animal.Bird.Chicken:
			Animal chicken = new Chicken();
			chicken.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(chicken);break;
		case Constants.Animal.Bird.Eagle:
			Animal eagle = new Eagle();
			eagle.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(eagle);break;
		case Constants.Animal.Aquatic.Dolphin:
			Animal dolphin = new Dolphin(type);
			dolphin.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(dolphin);break;
		case Constants.Animal.Aquatic.ReggaeShark:
			Animal shark = new ReggaeShark(type);
			shark.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(shark);break;
		case Constants.Animal.Aquatic.SeaHorse:
			Animal seahorse = new SeaHorse(type);
			seahorse.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(seahorse);break;
		case Constants.Animal.Reptile.Turtle:
			Animal turtle = new Turtle();
			turtle.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(turtle);break;
		case Constants.Animal.Reptile.Snake:
			Animal snake = new Snake();
			snake.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(snake);break;
		case Constants.Animal.Reptile.Lizard:
			Animal lizard = new Lizard();
			lizard.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(lizard);break;
		default: System.out.println("eroare, nu exista animalul respectiv"); break;
	
		}
		}
		}
		return animals;
		
		
		
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
	}}
	
	
	
	
	
	
	





