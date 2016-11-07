package repositories;

import java.io.*;
import java.util.ArrayList;

import javax.xml.parsers.*;
import javax.xml.stream.*;
import javax.xml.stream.events.*;

import animals.*;
import factories.Constants;
import interfaces.XML_Parsable;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class AnimalRepository {
	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() {
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

	public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException {
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		// Create XMLEvent Writer
		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
		// Create a EventFactory
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n ");
		// Create and writ e Start Tag
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
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
						.getTextContent();
				switch (discriminant) {
				
				//aquatics
				case Constants.Animals.Aquatics.Seahorse:
					Animal seahorse = new Seahorse();
					seahorse.decodeFromXml(element);
					animals.add(seahorse);
					break;
				case Constants.Animals.Aquatics.Shark:
					Animal shark = new Shark();
					shark.decodeFromXml(element);
					animals.add(shark);
					break;
				case Constants.Animals.Aquatics.Whale:
					Animal whale = new Whale();
					whale.decodeFromXml(element);
					animals.add(whale);
					break;
					
				//birds
				case Constants.Animals.Birds.Mockingjay:
					Animal mockingjay = new Mockingjay();
					mockingjay.decodeFromXml(element);
					animals.add(mockingjay);
					break;
				case Constants.Animals.Birds.Stork:
					Animal stork = new Stork();
					stork.decodeFromXml(element);
					animals.add(stork);
					break;
				case Constants.Animals.Birds.Woodpecker:
					Animal woodpecker = new Woodpecker();
					woodpecker.decodeFromXml(element);
					animals.add(woodpecker);
					break;
					
				//insects
				case Constants.Animals.Insects.Ant:
					Animal ant = new Ant();
					ant.decodeFromXml(element);
					animals.add(ant);
					break;
				case Constants.Animals.Insects.Butterfly:
					Animal butterfly = new Butterfly();
					butterfly.decodeFromXml(element);
					animals.add(butterfly);
					break;
				case Constants.Animals.Insects.Mosquito:
					Animal mosquito = new Mosquito();
					mosquito.decodeFromXml(element);
					animals.add(mosquito);
					break;
				
				//Mammals
				case Constants.Animals.Mammals.Deer:
					Animal deer = new Deer();
					deer.decodeFromXml(element);
					animals.add(deer);
					break;
				case Constants.Animals.Mammals.Hyena:
					Animal hyena = new Hyena();
					hyena.decodeFromXml(element);
					animals.add(hyena);
					break;
				case Constants.Animals.Mammals.Kangaroo:
					Animal kangaroo = new Kangaroo();
					kangaroo.decodeFromXml(element);
					animals.add(kangaroo);
					break;
					
				//reptiles
				case Constants.Animals.Reptiles.Gekko:
					Animal gekko = new Gekko();
					gekko.decodeFromXml(element);
					animals.add(gekko);
					break;
				case Constants.Animals.Reptiles.Seaturtle:
					Animal seaturtle = new Seaturtle();
					seaturtle.decodeFromXml(element);
					animals.add(seaturtle);
					break;
				case Constants.Animals.Reptiles.Snake:
					Animal snake = new Snake();
					snake.decodeFromXml(element);
					animals.add(snake);
					break;
					
				default:
					break;
				}
			}
		}
		return animals;
	}
}