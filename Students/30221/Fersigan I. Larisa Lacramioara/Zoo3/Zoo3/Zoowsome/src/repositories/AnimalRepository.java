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

import services.factories.Constants;
import models.animals.Animal;
import models.animals.Butterfly;
import models.animals.Chameleon;
import models.animals.Cockroach;
import models.animals.Cow;
import models.animals.Dolphin;
import models.animals.Frog;
import models.animals.Monkey;
import models.animals.Octopuses;
import models.animals.Parrots;
import models.animals.Pinguin;
import models.animals.Spider;
import models.animals.Squid;
import models.animals.Stork;
import models.animals.Tiger;
import models.animals.Viper;
import models.animals.WaterType;
import models.interfaces.XML_Parsable;


public class AnimalRepository {
	public WaterType type;
	private static final String XML_FILENAME = "Animals.xml";
	
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
	
	public void save(Animal [] animals)throws FileNotFoundException, XMLStreamException {
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
		

		public ArrayList<Animal> load() throws ParserConfigurationException, SAXException, IOException {  
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
		((org.w3c.dom.Document) element).getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
		.getTextContent();
		switch (discriminant) {
		case Constants.Animal.Insect.Butterfly:
		Animal butterfly = new Butterfly();
		butterfly.decodeFromXml((org.w3c.dom.Element) element);
		animals.add(butterfly); break;
		case  Constants.Animal.Insect.Cockroach:
			Animal cockroach = new Cockroach();
			cockroach.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(cockroach);break;
		case  Constants.Animal.Insect.Spider:
			Animal spider = new Spider();
			spider.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(spider);break;
		case Constants.Animal.Mammal.Tiger:
			Animal tiger = new Tiger();
			tiger.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(tiger);break;
		case Constants.Animal.Mammal.Monkey:
			Animal monkey = new Monkey();
			monkey.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(monkey);break;
		case Constants.Animal.Mammal.Cow:
			Animal cow = new Cow();
			cow.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(cow);break;
		case Constants.Animal.Bird.Stork:
			Animal stork = new Stork();
			stork.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(stork);break;
		case Constants.Animal.Bird.Parrots:
			Animal parrots = new Parrots();
			parrots.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(parrots);break;
		case Constants.Animal.Aquatic.Dolphin:
			Animal dolphin = new Dolphin(type);
			dolphin.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(dolphin);break;
		case Constants.Animal.Aquatic.Squid:
			Animal squid = new Squid(type);
			squid.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(squid);break;
		case Constants.Animal.Aquatic.Octopuses:
			Animal octopuses = new Octopuses(type);
			octopuses.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(octopuses);break;
		case Constants.Animal.Reptile.Frog:
			Animal frog = new Frog();
			frog.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(frog);break;
		case Constants.Animal.Reptile.Viper:
			Animal viper = new Viper();
			viper.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(viper);break;
		case Constants.Animal.Reptile.Chameleon:
			Animal chameleon = new Chameleon();
			chameleon.decodeFromXml((org.w3c.dom.Element) element);
			animals.add(chameleon);break;
		default:
		break;
		}
		}
		}
		return animals;
		}
	}

