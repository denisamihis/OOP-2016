package repositories;

import java.io.*;
import java.util.ArrayList;

import javax.xml.parsers.*;
import javax.xml.stream.*;
import javax.xml.stream.events.*;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import models.animals.*;
import models.interfaces.XML_Parsable;
import services.factories.Constants;

public class AnimalRepository {
	private static final String XML_FILENAME = "Animals.xml";
	public AnimalRepository()
	{
		
	}
	public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException
	{
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		StartDocument startDocument = eventFactory.createStartDocument();
		eventWriter.add(startDocument);
		StartElement configStartElement = eventFactory.createStartElement("", "", "content");
		eventWriter.add(configStartElement);
		eventWriter.add(end);
		for (XML_Parsable animal : animals)
		{
			StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.ANIMAL);
			eventWriter.add(sElement);
			eventWriter.add(end);
			animal.encodeToXML(eventWriter);
			EndElement eElement = eventFactory.createEndElement("", "", Constants.XML_TAGS.ANIMAL);
			eventWriter.add(eElement);
			eventWriter.add(end);
		}
		eventWriter.add(eventFactory.createEndElement("", "", "content"));
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
	}
	public ArrayList<Animal> load() throws ParserConfigurationException, SAXException, IOException
	{
		ArrayList<Animal> animals = new ArrayList<Animal>();
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		
		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);
		
		for (int i = 0; i < nodeList.getLength(); i++)
		{
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE)
			{
				Element element = (Element)node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
				switch (discriminant)
				{
				case Constants.Animals.Aquatics.Seahorse :
					Animal seahorse = new Seahorse();
					seahorse.decodeFromXML(element);
					animals.add(seahorse);
					break;
				case Constants.Animals.Aquatics.Shark :
					Animal shark = new Shark();
					shark.decodeFromXML(element);
					animals.add(shark);
					break;
				case Constants.Animals.Aquatics.Stingray :
					Animal stingray = new Stingray();
					stingray.decodeFromXML(element);
					animals.add(stingray);
					break;
				case Constants.Animals.Mammals.Gopher :
					Animal gopher = new Gopher();
					gopher.decodeFromXML(element);
					animals.add(gopher);
					break;
				case Constants.Animals.Mammals.Kangaroo :
					Animal kangaroo = new Kangaroo();
					kangaroo.decodeFromXML(element);
					animals.add(kangaroo);
					break;
				case Constants.Animals.Mammals.Tiger :
					Animal tiger = new Tiger();
					tiger.decodeFromXML(element);
					animals.add(tiger);
					break;
				case Constants.Animals.Reptiles.Aligator :
					Animal aligator = new Aligator();
					aligator.decodeFromXML(element);
					animals.add(aligator);
					break;
				case Constants.Animals.Reptiles.Iguana :
					Animal iguana = new Iguana();
					iguana.decodeFromXML(element);
					animals.add(iguana);
					break;
				case Constants.Animals.Reptiles.KomodoDragon :
					Animal komodoDragon = new KomodoDragon();
					komodoDragon.decodeFromXML(element);
					animals.add(komodoDragon);
					break;
				case Constants.Animals.Birds.Duck :
					Animal duck = new Duck();
					duck.decodeFromXML(element);
					animals.add(duck);
					break;
				case Constants.Animals.Birds.Flamingo :
					Animal flamingo = new Flamingo();
					flamingo.decodeFromXML(element);
					animals.add(flamingo);
					break;
				case Constants.Animals.Birds.Ostrich :
					Animal ostrich = new Ostrich();
					ostrich.decodeFromXML(element);
					animals.add(ostrich);
					break;
				case Constants.Animals.Insects.FireAnt :
					Animal fireAnt = new FireAnt();
					fireAnt.decodeFromXML(element);
					animals.add(fireAnt);
					break;
				case Constants.Animals.Insects.Snail :
					Animal snail = new Snail();
					snail.decodeFromXML(element);
					animals.add(snail);
					break;
				case Constants.Animals.Insects.StagBeetle :
					Animal stagBeetle = new StagBeetle();
					stagBeetle.decodeFromXML(element);
					animals.add(stagBeetle);
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
		StartElement sElement = eventFactory.createStartElement("", "", name);
		eventWriter.add(tab);
		eventWriter.add(sElement);
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);
		EndElement eElement = eventFactory.createEndElement("", "", name);
		eventWriter.add(eElement);
		eventWriter.add(end);
	}
}
