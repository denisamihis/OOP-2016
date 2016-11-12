package repositories;

import java.io.File;
import animals.*;
import java.io.*;
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

import factories.Constants;
import interfaces.XML_Parsable;

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
		XMLEvent end = eventFactory.createDTD("\n ");
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
		eventWriter.add(eventFactory.createEndElement("", "", " content"));
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
	}

	public ArrayList<Animal> load() throws ParserConfigurationException, SAXException, IOException {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = (Node) nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String discriminant = (element).getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
						.getTextContent();
				switch (discriminant) {
				case Constants.Animals.Insects.Beetle:
					Animal beetle = new Beetle();
					beetle.decodeFromXml(element);
					animals.add(beetle);
					break;
				case Constants.Animals.Insects.RedAnt:
					Animal redAnt = new RedAnt();
					redAnt.decodeFromXml(element);
					animals.add(redAnt);
					break;
				case Constants.Animals.Insects.StingBee:
					Animal stingBee = new StingBee();
					stingBee.decodeFromXml(element);
					animals.add(stingBee);
					break;

				case Constants.Animals.Aquatics.JellyFish:
					Animal jellyFish = new JellyFish();
					jellyFish.decodeFromXml(element);
					animals.add(jellyFish);
					break;
				case Constants.Animals.Aquatics.KoiFish:
					Animal koiFish = new KoiFish();
					koiFish.decodeFromXml(element);
					animals.add(koiFish);
					break;
				case Constants.Animals.Aquatics.SeaTurtle:
					Animal seaturtle = new SeaTurtle();
					seaturtle.decodeFromXml(element);
					animals.add(seaturtle);
					break;

				case Constants.Animals.Birds.BlackSparrow:
					Animal blackSparrow = new BlackSparrow();
					blackSparrow.decodeFromXml(element);
					animals.add(blackSparrow);
					break;
				case Constants.Animals.Birds.Falcon:
					Animal falcon = new Falcon();
					falcon.decodeFromXml(element);
					animals.add(falcon);
					break;
				case Constants.Animals.Birds.Pelican:
					Animal pelican = new Pelican();
					pelican.decodeFromXml(element);
					animals.add(pelican);
					break;

				case Constants.Animals.Mammals.Lion:
					Animal lion = new Lion();
					lion.decodeFromXml(element);
					animals.add(lion);
					break;
				case Constants.Animals.Mammals.PolarBear:
					Animal polarBear = new PolarBear();
					polarBear.decodeFromXml(element);
					animals.add(polarBear);
					break;
				case Constants.Animals.Mammals.Racoon:
					Animal racoon = new Racoon();
					racoon.decodeFromXml(element);
					animals.add(racoon);
					break;
					
				case Constants.Animals.Reptiles.BlackMamba:
					Animal blackMamba = new BlackMamba();
					blackMamba.decodeFromXml(element);
					animals.add(blackMamba);
					break;
				case Constants.Animals.Reptiles.Cameleon:
					Animal cameleon=new Cameleon();
					cameleon.decodeFromXml(element);
					animals.add(cameleon);
					break;
				case Constants.Animals.Reptiles.Lizzard:
					Animal lizzard=new Lizzard();
					lizzard.decodeFromXml(element);
					animals.add(lizzard);
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