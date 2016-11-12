package javasmmr.zoowsome.repositories;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

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

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;;

public class AnimalRepository {
	
	private static final String XML_FILENAME = "Animals.xml";
	public AnimalRepository() {
	}
	public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException { 
		XMLOutputFactory outputFactory=XMLOutputFactory.newInstance();
		XMLEventWriter eventWriter=outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		StartDocument startDocument = eventFactory.createStartDocument();
		eventWriter.add(startDocument);
		StartElement configStartElement = eventFactory.createStartElement("", "", "content");
		eventWriter.add(configStartElement);
		eventWriter.add(end);
		
		for(XML_Parsable animal:animals){
			StartElement eElement=eventFactory.createStartElement("","",Constants.XML_TAGS.ANIMAL);
		    eventWriter.add(eElement);
		    eventWriter.add(end);
		}
		
		eventWriter.add(eventFactory.createEndElement("", "", "content"));
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
		
	}
	
	public static void createNode(XMLEventWriter eventWriter, String name, String value) throws
	XMLStreamException {
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
	
	
	public ArrayList<Animal> load() throws ParserConfigurationException, SAXException, IOException { 
		ArrayList<Animal> animals = new ArrayList<Animal>();
		File fXmlFile = new File(XML_FILENAME);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = (Document) dBuilder.parse(fXmlFile);
		((org.w3c.dom.Document) doc).getDocumentElement().normalize();
		
		NodeList nodeList = ((Element) doc).getElementsByTagName(Constants.XML_TAGS.ANIMAL);
		
		for(int i=0;i<nodeList.getLength();i++){
			Node node=(Node) nodeList.item(i);
			if(node.getNodeType()==Node.ELEMENT_NODE){
				Element element=(Element) node;
				String discriminant=element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
				
				switch(discriminant){
				
				
				case Constants.Animals.Insects.Butterfly:
					Animal butterfly=new Butterfly();
					butterfly.decodeFromXml(element);
					animals.add(butterfly);
					break;
				
				
			   case Constants.Animals.Insects.Bee:
				   Animal bee=new Bee();
				   bee.decodeFromXml(element);
				   animals.add(bee);
				   break;
				   
			   case Constants.Animals.Insects.Bug:
				   Animal bug=new Bug();
				   bug.decodeFromXml(element);
				   animals.add(bug);
				   break;
				   
			   case  Constants.Animals.Aquatics.Dolphin:
				   Animal dolphin=new Dolphin();
				   dolphin.decodeFromXml(element);
				   animals.add(dolphin);
				   break;
				   
			   case Constants.Animals.Aquatics.Octopus:
				   Animal octopus=new Octopus();
				   octopus.decodeFromXml(element);
				   animals.add(octopus);
				   break;
				   
			   case Constants.Animals.Aquatics.Shark:
				   Animal shark=new Shark();
				   shark.decodeFromXml(element);
				   animals.add(shark);
				   break;
				   
			   case Constants.Animals.Birds.Eagle:
				   Animal eagle=new Eagle();
				   eagle.decodeFromXml(element);
				   animals.add(eagle);
				   break;
				 
			   case Constants.Animals.Birds.Parrot:
				   Animal parrot=new Parrot();
				   parrot.decodeFromXml(element);
				   animals.add(parrot);
				   break;
				   
			   case Constants.Animals.Birds.Tucan:
				   Animal tucan=new Tucan();
				   tucan.decodeFromXml(element);
				   animals.add(tucan);
				   break;
				   
			   case Constants.Animals.Mammals.Lion :
				   Animal lion=new Lion();
				   lion.decodeFromXml(element);
				   animals.add(lion);
				   break;
				   
			   case Constants.Animals.Mammals.Panther:
				   Animal panther=new Panther();
				   panther.decodeFromXml(element);
				   animals.add(panther);
				   break;
				   
			   case Constants.Animals.Mammals.Tiger:
				   Animal tiger=new Tiger();
				   tiger.decodeFromXml(element);
				   animals.add(tiger);
				   break;
				   
			   case Constants.Animals.Reptiles.Chameleon:
				   Animal chameleon=new Chameleon();
				   chameleon.decodeFromXml(element);
				   animals.add(chameleon);
				   break;
				   
			   case Constants.Animals.Reptiles.Lizard:
				   Animal lizard=new Lizard();
				   lizard.decodeFromXml(element);
				   animals.add(lizard);
				   break;
				   
			   case Constants.Animals.Reptiles.Snake:
				   Animal snake=new Snake();
				   snake.decodeFromXml(element);
				   animals.add(snake);
				   break;
				
				default: break;   
			}
		
		
		}
	}
		return animals;
}
	
	
}


