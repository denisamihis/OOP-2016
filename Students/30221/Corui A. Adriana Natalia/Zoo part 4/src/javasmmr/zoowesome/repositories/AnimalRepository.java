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
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;
public class AnimalRepository extends EntityRepository<Animal>{
	
	private static final String XML_FILENAME = "Animals.xml";
	
	public AnimalRepository(String xmlFilename, String entityTag) 
	{
		super(XML_FILENAME,Constants.XML_TAGS.ANIMAL);
	}
	@Override
	protected Animal getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch(discriminant)
		{
		case Constants.Animals.Insects.Butterfly:
			Animal butterfly = new Butterfly(1.2,0.1);
			butterfly.decodeFromXml(element);
			return butterfly;
		case Constants.Animals.Insects.Cockroach:
			Animal cockroach = new Cockroach(1.3,0.9);
			cockroach.decodeFromXml(element);
			return cockroach;
		case Constants.Animals.Insects.Spider:
			Animal spider = new Spider(2.3,0.9);
			spider.decodeFromXml(element);
			return spider;
		case Constants.Animals.Aquatics.Dolphin:
			Animal dolphin = new Dolphin(1.6,0.2);
			dolphin.decodeFromXml(element);
			return dolphin;
		case Constants.Animals.Aquatics.Jellyfish:
			Animal jellyfish = new Jellyfish(1.3,0.6);
			jellyfish.decodeFromXml(element);
			return jellyfish;
		case Constants.Animals.Aquatics.Shark:
			Animal shark = new Shark(1.9,0.7);
			shark.decodeFromXml(element);
			return shark;
		case Constants.Animals.Mammals.Cow:
			Animal cow = new Cow(4.6,0.5);
			cow.decodeFromXml(element);
			return cow;
		case Constants.Animals.Mammals.Tiger:
			Animal tiger = new Tiger(4.6,0.9);
			tiger.decodeFromXml(element);
			return tiger;
		case Constants.Animals.Mammals.Monkey:
			Animal monkey = new Monkey(3.1,0.3);
			monkey.decodeFromXml(element);
			return monkey;
		case Constants.Animals.Birds.Duck:
			Animal duck = new Duck(1.2,0.4);
			duck.decodeFromXml(element);
			return duck;
		case Constants.Animals.Birds.Owl:
			Animal owl = new Owl(3.8,0.6);
			owl.decodeFromXml(element);
			return owl;
		case Constants.Animals.Birds.Pigeon:
			Animal pigeon = new Pigeon(1.5,0.22);
			pigeon.decodeFromXml(element);
			return pigeon;
		case Constants.Animals.Reptiles.Crocodile:
			Animal crocodile = new Crocodile(1.2,0.7);
			crocodile.decodeFromXml(element);
			return crocodile;
		case Constants.Animals.Reptiles.Snake:
			Animal snake = new Snake(1.2,0.7);
			snake.decodeFromXml(element);
			return snake;

		case Constants.Animals.Reptiles.Turtle:
			Animal turtle = new Turtle(7.2,0.1);
			turtle.decodeFromXml(element);
			return turtle;
		default:
			break;
		}
		return null;
	}
}