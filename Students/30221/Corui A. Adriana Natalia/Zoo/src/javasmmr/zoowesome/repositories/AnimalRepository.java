package javasmmr.zoowesome.repositories;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.text.Document;
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

import javasmmr.zoowesome.models.interfaces.XML_Parsable;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;
public class AnimalRepository {

	private static final String XML_FILENAME = "Animals.xml";
	public  AnimalRepository()
	{

	}
	public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException
	{
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end=eventFactory.createDTD("\n");
		StartDocument startDocument=eventFactory.createStartDocument();
		eventWriter.add(startDocument);
		StartElement configStartElement = eventFactory.createStartElement("","","content");
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
	public  ArrayList<Animal>  load() throws ParserConfigurationException, SAXException, IOException
	{
		ArrayList <Animal> animals = new ArrayList<Animal>();
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc =  (Document) dBuilder.parse(fXmlFile);
		((org.w3c.dom.Document) doc).getDocumentElement().normalize();
		
		NodeList nodeList = ((Element) doc).getElementsByTagName(Constants.XML_TAGS.ANIMAL);
		
		for(int i=0;i< nodeList.getLength();i++)
		{
			Node node = nodeList.item(i);
			if(node.getNodeType()==Node.ELEMENT_NODE)
			{
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
				switch(discriminant)
				{
				case Constants.Animals.Insects.Butterfly:
					Animal butterfly = new Butterfly(1.2,0.1);
					butterfly.decodeFromXml(element);
					animals.add(butterfly);
					break;
				case Constants.Animals.Insects.Cockroach:
					Animal cockroach = new Cockroach(1.3,0.9);
					cockroach.decodeFromXml(element);
					animals.add(cockroach);
					break;
				case Constants.Animals.Insects.Spider:
					Animal spider = new Spider(2.3,0.9);
					spider.decodeFromXml(element);
					animals.add(spider);
					break;
				case Constants.Animals.Aquatics.Dolphin:
					Animal dolphin = new Dolphin(1.6,0.2);
					dolphin.decodeFromXml(element);
					animals.add(dolphin);
					break;
				case Constants.Animals.Aquatics.Jellyfish:
					Animal jellyfish = new Jellyfish(1.3,0.6);
					jellyfish.decodeFromXml(element);
					animals.add(jellyfish);
					break;
				case Constants.Animals.Aquatics.Shark:
					Animal shark = new Shark(1.9,0.7);
					shark.decodeFromXml(element);
					animals.add(shark);
					break;
				case Constants.Animals.Mammals.Cow:
					Animal cow = new Cow(4.6,0.5);
					cow.decodeFromXml(element);
					animals.add(cow);
					break;
				case Constants.Animals.Mammals.Tiger:
					Animal tiger = new Tiger(4.6,0.9);
					tiger.decodeFromXml(element);
					animals.add(tiger);
					break;
				case Constants.Animals.Mammals.Monkey:
					Animal monkey = new Monkey(3.1,0.3);
					monkey.decodeFromXml(element);
					animals.add(monkey);
					break;
				case Constants.Animals.Birds.Duck:
					Animal duck = new Duck(1.2,0.4);
					duck.decodeFromXml(element);
					animals.add(duck);
					break;
				case Constants.Animals.Birds.Owl:
					Animal owl = new Owl(3.8,0.6);
					owl.decodeFromXml(element);
					animals.add(owl);
					break;
				case Constants.Animals.Birds.Pigeon:
					Animal pigeon = new Pigeon(1.5,0.22);
					pigeon.decodeFromXml(element);
					animals.add(pigeon);
					break;
				case Constants.Animals.Reptiles.Crocodile:
					Animal crocodile = new Crocodile(1.2,0.7);
					crocodile.decodeFromXml(element);
					animals.add(crocodile);
					break;
				case Constants.Animals.Reptiles.Snake:
					Animal snake = new Snake(1.2,0.7);
					snake.decodeFromXml(element);
					animals.add(snake);
					break;
				case Constants.Animals.Reptiles.Turtle:
					Animal turtle = new Turtle(7.2,0.1);
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
}