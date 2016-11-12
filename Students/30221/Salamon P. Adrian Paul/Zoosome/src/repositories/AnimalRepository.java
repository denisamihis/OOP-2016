package repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.*;
import javax.xml.stream.events.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import models.animals.*;
import models.interfaces.XML_Parsable;
import servicies.factory.animal.Constants;

public class AnimalRepository {
	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() {
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
		for (XML_Parsable animal : animals) {
			StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.ANIMAL);
			eventWriter.add(sElement);
			eventWriter.add(end);
			animal.encodedToXml(eventWriter);
			EndElement eElement = eventFactory.createEndElement("", "", Constants.XML_TAGS.ANIMAL);
			eventWriter.add(eElement);
			eventWriter.add(end);
		}
		eventWriter.add(eventFactory.createEndElement("", "", "content"));
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
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

	public ArrayList<Animal> load() throws ParserConfigurationException, SAXException,IOException {
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder=dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		
		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);
		
		for(int i=0;i<nodeList.getLength();i++){
			Node node=nodeList.item(i);
			if(node.getNodeType()==Node.ELEMENT_NODE){
			Element element =(Element) node;
			String discriminant= element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
			switch(discriminant){
			case Constants.Animals.Insects.Ant:
				Animal ant=new Ant();
				ant.decodeFromXml(element);
				animals.add(ant);
				break;
			case Constants.Animals.Insects.Fly:
				Animal fly=new Fly();
				fly.decodeFromXml(element);
				animals.add(fly);
				break;
			case Constants.Animals.Insects.Moth:
				Animal moth=new Moth();
				moth.decodeFromXml(element);
				animals.add(moth);
				break;
			case Constants.Animals.Mammals.Horse:
				Animal horse=new Horse();
				horse.decodeFromXml(element);
				animals.add(horse);
				break;
			case Constants.Animals.Mammals.Cat:
				Animal cat=new Cat();
				cat.decodeFromXml(element);
				animals.add(cat);
				break;
			case Constants.Animals.Mammals.Rat:
				Animal rat=new Rat();
				rat.decodeFromXml(element);
				animals.add(rat);
				break;
			case Constants.Animals.Reptiles.Turtle:
				Animal turtle=new Turtle();
				turtle.decodeFromXml(element);
				animals.add(turtle);
				break;
			case Constants.Animals.Reptiles.Lizard:
				Animal lizard=new Lizard();
				lizard.decodeFromXml(element);
				animals.add(lizard);
				break;
			case Constants.Animals.Reptiles.Chameleon:
				Animal chameleon=new Chameleon();
				chameleon.decodeFromXml(element);
				animals.add(chameleon);
				break;
			case Constants.Animals.Birds.Pigeon:
				Animal pigeon=new Pigeon();
				pigeon.decodeFromXml(element);
				animals.add(pigeon);
				break;
			case Constants.Animals.Birds.Hen:
				Animal hen=new Hen();
				hen.decodeFromXml(element);
				animals.add(hen);
				break;
			case Constants.Animals.Birds.Turkey:
				Animal turkey=new Turkey();
				turkey.decodeFromXml(element);
				animals.add(turkey);
				break;
			case Constants.Animals.Aquatics.Salmon:
				Animal salmon=new Salmon();
				salmon.decodeFromXml(element);
				animals.add(salmon);
				break;
			case Constants.Animals.Aquatics.Trout:
				Animal trout=new Trout();
				trout.decodeFromXml(element);
				animals.add(trout);
				break;
			case Constants.Animals.Aquatics.Shark:
				Animal shark=new Shark();
				shark.decodeFromXml(element);
				animals.add(shark);
				break;
				default: break;
				
				
			}
			}
			
			
		}
		return animals;
		
	}

}
