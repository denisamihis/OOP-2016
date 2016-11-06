package javasmmr.zoowsome.repositories;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javasmmr.zoowsome.models.Aligator;
import javasmmr.zoowsome.models.Animal;
import javasmmr.zoowsome.models.Butterfly;
import javasmmr.zoowsome.models.Cow;
import javasmmr.zoowsome.models.Dinosaur;
import javasmmr.zoowsome.models.Dolphin;
import javasmmr.zoowsome.models.Eagle;
import javasmmr.zoowsome.models.Flamingo;
import javasmmr.zoowsome.models.Jellyfish;
import javasmmr.zoowsome.models.Monkey;
import javasmmr.zoowsome.models.Pelican;
import javasmmr.zoowsome.models.Shark;
import javasmmr.zoowsome.models.Snake;
import javasmmr.zoowsome.models.Spider;
import javasmmr.zoowsome.models.Tiger;
import javasmmr.zoowsome.models.Wasp;
import javasmmr.zoowsome.models.XML_Parsable;
import javasmmr.zoowsome.services.Constants;

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

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class AnimalRepository {
	
	private static final String XML_FILENAME = "Animals.xml";
	
	public AnimalRepository()
	{
		
	}
	
	public void save (ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException
	{
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		
		//Create an eventWriter
		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
		
		//Create an EventFactory
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		
		//Create and write start tag
		StartDocument startDocument = eventFactory.createStartDocument();
		eventWriter.add(startDocument);
		
		//Create content open tag
		StartElement configStartElement = eventFactory.createStartElement("", "", "content");
		eventWriter.add(configStartElement);
		eventWriter.add(end);
		
		for(XML_Parsable animal : animals)
		{
			StartElement sElement = eventFactory.createStartElement("","",Constants.XML_TAGS.ANIMAL);
			eventWriter.add(sElement);
			eventWriter.add(end);
			
			animal.encodeToXml(eventWriter);
			
			EndElement eElement = eventFactory.createEndElement("","",Constants.XML_TAGS.ANIMAL);
			eventWriter.add(eElement);
			eventWriter.add(end);
		}
		
		eventWriter.add(eventFactory.createEndElement("","","content"));
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
		
	}
	
	public ArrayList<Animal> load() throws ParserConfigurationException, SAXException, IOException
	{
		ArrayList<Animal> animals = new ArrayList<Animal>();
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
		Document doc = dbBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		
		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);
		
		for(int i=0;i<nodeList.getLength();i++)
		{
			Node node = nodeList.item(i);
			if(node.getNodeType() == Node.ELEMENT_NODE)
			{
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
				switch(discriminant)
				{
				case Constants.Animals.Reptiles.Aligator:
					Animal aligator = new Aligator();
					aligator.decodeFromXml(element);
					animals.add(aligator);
					break;
				case Constants.Animals.Reptiles.Dinosaur:
					Animal dinosaur = new Dinosaur();
					dinosaur.decodeFromXml(element);
					animals.add(dinosaur);
					break;
				case Constants.Animals.Reptiles.Snake:
					Animal snake = new Snake();
					snake.decodeFromXml(element);
					animals.add(snake);
					break;
				case Constants.Animals.Insects.Butterfly:
					Animal butterfly = new Butterfly();
					butterfly.decodeFromXml(element);
					animals.add(butterfly);
					break;
				case Constants.Animals.Insects.Spider:
					Animal spider = new Spider();
					spider.decodeFromXml(element);
					animals.add(spider);
					break;
				case Constants.Animals.Insects.Wasp:
					Animal wasp = new Wasp();
					wasp.decodeFromXml(element);
					animals.add(wasp);
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
				case Constants.Animals.Aquatics.Jellyfish:
					Animal jellyfish = new Jellyfish();
					jellyfish.decodeFromXml(element);
					animals.add(jellyfish);
					break;
				case Constants.Animals.Aquatics.Shark:
					Animal shark = new Shark();
					shark.decodeFromXml(element);
					animals.add(shark);
					break;
				case Constants.Animals.Birds.Eagle:
					Animal eagle = new Eagle();
					eagle.decodeFromXml(element);
					animals.add(eagle);
					break;
				case Constants.Animals.Birds.Flamingo:
					Animal flamingo = new Flamingo();
					flamingo.decodeFromXml(element);
					animals.add(flamingo);
					break;
				case Constants.Animals.Birds.Pelican:
					Animal pelican = new Pelican();
					pelican.decodeFromXml(element);
					animals.add(pelican);
					break;
				default:
					break;
				
				
				}
			}
		}
		return animals;
	}
	
	public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException
	{
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		XMLEvent tab = eventFactory.createDTD("\t");
		
		//Create start node
		StartElement sElement = eventFactory.createStartElement("", "", name);
		eventWriter.add(tab);
		eventWriter.add(sElement);
		
		//Create content
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);
		
		//Create end node
		EndElement eElement = eventFactory.createEndElement("","",name);
		eventWriter.add(eElement);
		eventWriter.add(end);
	}
}
