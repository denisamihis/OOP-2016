package repositories;


import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.Element;




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
import services.factories.Constants;

public class AnimalRepository extends EntityRepository<Animal> {
	private static final String XML_FILENAME = "Animals.xml";
	
	public AnimalRepository(){
		super(XML_FILENAME , Constants.XML_TAGS.ANIMAL);
	}
	
	protected Animal getEntityFromXmlElement(Element element){
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant){
		case Constants.Animals.Insects.Butterfly:{
			Animal butterfly = new Butterfly();
			butterfly.decodeFromXml(element);
			return butterfly;
		}
		case Constants.Animals.Insects.Cockroach:{
			Animal cockroach = new Cockroach();
			cockroach.decodeFromXml(element);
			return cockroach;
		}
		case Constants.Animals.Reptiles.Crocodile:{
			Animal crocodile = new Crocodile();
			crocodile.decodeFromXml(element);
			return crocodile;
		}
		case Constants.Animals.Aquatics.Dolphin:{
			Animal dolphin = new Dolphin();
			dolphin.decodeFromXml(element);
			return dolphin;
		}
		case Constants.Animals.Birds.Eagle:{
			Animal eagle = new Eagle();
			eagle.decodeFromXml(element);
			return eagle;
		}
		case Constants.Animals.Birds.Emu:{
			Animal emu = new Emu();
			emu.decodeFromXml(element);
			return emu;
		}
		case Constants.Animals.Mammals.Kangaroo:{
			Animal kangaroo = new Kangaroo();
			kangaroo.decodeFromXml(element);
			return kangaroo;
		}
		case Constants.Animals.Mammals.Lion:{
			Animal lion = new Lion();
			lion.decodeFromXml(element);
			return lion;
		}
		case Constants.Animals.Birds.Peacock:{
			Animal peacock = new Peacock();
			peacock.decodeFromXml(element);
			return peacock;
		}
		case Constants.Animals.Aquatics.Penguin:{
			Animal penguin = new Penguin();
			penguin.decodeFromXml(element);
			return penguin;
		}
		case Constants.Animals.Aquatics.Seal:{
			Animal seal = new Seal();
			seal.decodeFromXml(element);
			return seal;
		}
		case Constants.Animals.Reptiles.Snake:{
			Animal snake = new Snake();
			snake.decodeFromXml(element);
			return snake;
		}
		case Constants.Animals.Insects.Spider:{
			Animal spider = new Spider();
			spider.decodeFromXml(element);
			return spider;
		}
		case Constants.Animals.Mammals.Tiger:{
			Animal tiger = new Tiger();
			tiger.decodeFromXml(element);
			return tiger;
		}
		case Constants.Animals.Reptiles.Turtle:{
			Animal turtle = new Turtle();
			turtle.decodeFromXml(element);
			return turtle;
		}
		default: {
			Animal animal = new Turtle();
			return animal;
		}
		}
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
