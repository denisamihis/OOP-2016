package javasmmr.zoowsome.repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.lang.model.element.Element;
import javax.swing.text.Document;
import javax.xml.soap.Node;
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

import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;

public class AnimalRepository {
	private static final String XML_FILENAME="Animals.xml";
	public AnimalRepository(){
	}
	public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException {
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
		for (Animal animal : animals) {
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
	
	
	public ArrayList<Animal> load() throws ParserConfigurationException, SAXException,IOException {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = (Document) dBuilder.parse(fXmlFile);
		((Node) doc.getDefaultRootElement()).normalize();
		NodeList nodeList = ((org.w3c.dom.Document) doc).getElementsByTagName(Constants.XML_TAGS.ANIMAL);
		for (int i = 0; i < nodeList.getLength(); i++) {
		Node node = (Node) nodeList.item(i);
		if (node.getNodeType() == Node.ELEMENT_NODE) {
		Element element = (Element) node;
		String discriminant =((org.w3c.dom.Document) element).getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {
		case Constants.Animals.Insects.Butterfly:
			Animal butterfly = new Butterfly();
			butterfly.decodeFromXml(element);
			animals.add(butterfly);
			break;
		case Constants.Animals.Insects.Ant:
			Animal ant = 	new Ant();
			ant.decodeFromXml(element);
			animals.add(ant);
			break;
		case Constants.Animals.Insects.Caterpillar:
			Animal caterpillar = new Caterpillar();
			caterpillar.decodeFromXml(element);
			animals.add(caterpillar);
			break;
		case Constants.Animals.Aquaties.Salmon:
			Animal salmon = new Salmon();
			salmon.decodeFromXml(element);
			animals.add(salmon);
			break;
		case Constants.Animals.Aquaties.Shark:
			Animal shark = new Shark();
			shark.decodeFromXml(element);
			animals.add(shark);
			break;
		case Constants.Animals.Aquaties.Shrimp:
			Animal shrimp = new Shrimp();
			shrimp.decodeFromXml(element);
			animals.add(shrimp);
			break;
		case Constants.Animals.Mammals.Bear:
			Animal bear = new Bear();
			bear.decodeFromXml(element);
			animals.add(bear);
			break;
		case Constants.Animals.Mammals.Cow:
			Animal cow = new Cow();
			cow.decodeFromXml(element);
			animals.add(cow);
			break;
		case Constants.Animals.Mammals.Platypus:
			Animal platypus = new Platypus();
			platypus.decodeFromXml(element);
			animals.add(platypus);
			break;
		case Constants.Animals.Birds.Dodo:
			Animal dodo = new Dodo();
			dodo.decodeFromXml(element);
			animals.add(dodo);
			break;
		case Constants.Animals.Birds.Flamingo:
			Animal flamingo = new Flamingo();
			flamingo.decodeFromXml(element);
			animals.add(flamingo);
			break;
		case Constants.Animals.Birds.Penguin:
			Animal penguin = new Penguin();
			penguin.decodeFromXml(element);
			animals.add(penguin);
			break;
		case Constants.Animals.Reptiles.Lizard:
			Animal lizard = new Lizard();
			lizard.decodeFromXml(element);
			animals.add(lizard);
			break;
		case Constants.Animals.Reptiles.Salamander:
			Animal salamander = new Salamander();
			salamander.decodeFromXml(element);
			animals.add(salamander);
			break;
		case Constants.Animals.Reptiles.Turtle:
			Animal turtle = new Turtle();
			turtle.decodeFromXml(element);
			animals.add(turtle);
			break;
		default:
		break;
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
	}
}
