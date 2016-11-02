package repositories;
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

import java.io.File;



import jdk.internal.org.xml.sax.SAXException;
import models.animals.Animal;
import models.animals.Butterfly;
import models.animals.Cockroach;
import models.animals.Crocodile;
import models.animals.Dolphin;
import models.animals.Eagle;
import models.animals.Emu;
import models.animals.Kangaroo;
import models.animals.Lion;
import models.animals.Peacock;
import models.animals.Penguin;
import models.animals.Seal;
import models.animals.Snake;
import models.animals.Spider;
import models.animals.Tiger;
import models.animals.Turtle;
import models.interfaces.XML_Parsable;
import services.factories.Constants;

public class AnimalRepository {
	private static final String XML_FILENAME = "Animals.xml";
	
	public AnimalRepository(){}
	
	public void save(ArrayList<Animal> animals) throws FileNotFoundException , XMLStreamException{
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		StartDocument startDocument = eventFactory.createStartDocument();
		eventWriter.add(startDocument);
		StartElement configStartElement = eventFactory.createStartElement("", "", "content");
		eventWriter.add(configStartElement);
		eventWriter.add(end);
		
		for (XML_Parsable animal : animals){
			StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.ANIMAL);
			eventWriter.add(sElement);
			eventWriter.add(end);
			
			animal.encodeToXml(eventWriter);
			
			EndElement eElement = eventFactory.createEndElement("", "" , Constants.XML_TAGS.ANIMAL);
			eventWriter.add(eElement);
			eventWriter.add(end);
		}
		eventWriter.add(eventFactory.createEndElement("", "", "content"));
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
	}
	public ArrayList<Animal> load() throws ParserConfigurationException , SAXException , IOException, org.xml.sax.SAXException{
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
				case Constants.Animals.Reptiles.Crocodile:{
					Animal crocodile = new Crocodile();
					crocodile.decodeFromXml(element);
					animals.add(crocodile);
					break;
				}
				case Constants.Animals.Aquatics.Dolphin:{
					Animal dolphin = new Dolphin();
					dolphin.decodeFromXml(element);
					animals.add(dolphin);
					break;
				}
				case Constants.Animals.Birds.Eagle:{
					Animal eagle = new Eagle();
					eagle.decodeFromXml(element);
					animals.add(eagle);
					break;
				}
				case Constants.Animals.Birds.Emu:{
					Animal emu = new Emu();
					emu.decodeFromXml(element);
					animals.add(emu);
					break;
				}
				case Constants.Animals.Mammals.Kangaroo:{
					Animal kangaroo = new Kangaroo();
					kangaroo.decodeFromXml(element);
					animals.add(kangaroo);
					break;
				}
				case Constants.Animals.Mammals.Lion:{
					Animal lion = new Lion();
					lion.decodeFromXml(element);
					animals.add(lion);
					break;
				}
				case Constants.Animals.Birds.Peacock:{
					Animal peacock = new Peacock();
					peacock.decodeFromXml(element);
					animals.add(peacock);
					break;
				}
				case Constants.Animals.Aquatics.Penguin:{
					Animal penguin = new Penguin();
					penguin.decodeFromXml(element);
					animals.add(penguin);
					break;
				}
				case Constants.Animals.Aquatics.Seal:{
					Animal seal = new Seal();
					seal.decodeFromXml(element);
					animals.add(seal);
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
				case Constants.Animals.Reptiles.Turtle:{
					Animal turtle = new Turtle();
					turtle.decodeFromXml(element);
					animals.add(turtle);
					break;
				}
				default:break;
				}
			}
		}
		return animals;
	}
	
	public static void createNode(XMLEventWriter eventWriter , String name , String value) throws XMLStreamException{
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
