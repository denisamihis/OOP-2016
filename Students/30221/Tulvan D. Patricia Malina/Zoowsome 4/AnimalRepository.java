package javasmmr.zoowsome.repositories;

import org.w3c.dom.*;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.animals.Constants;


public class AnimalRepository extends EntityRepository<Animal> {
	
	private static final String XML_FILENAME="Animals.xml";
	
	public AnimalRepository(){
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}

	@Override
	protected Animal getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
	 
		switch (discriminant) {
	 		case Constants.Animals.Insects.Butterfly:
	 			Animal butterfly = new Butterfly();
	 			butterfly.decodeFromXml(element);
	 			return butterfly;
	 		case Constants.Animals.Insects.Cockroach:
	 			Animal cockroach = new Cockroach();
	 			cockroach.decodeFromXml(element);
	 			return cockroach;
	 		case Constants.Animals.Insects.Spider:
	 			Animal spider = new Spider();
	 			spider.decodeFromXml(element);
	 			return spider;
	 		case Constants.Animals.Mammals.Cow:
	 			Animal cow = new Cow();
	 			cow.decodeFromXml(element);
	 			return cow;
	 		case Constants.Animals.Mammals.Monkey:
	 			Animal monkey = new Monkey();
	 			monkey.decodeFromXml(element);
	 			return monkey;
	 		case Constants.Animals.Mammals.Tiger:
	 			Animal tiger = new Tiger();
	 			tiger.decodeFromXml(element);
	 			return tiger;
	 		case Constants.Animals.Aquatics.Dolphin:
	 			Animal dolphin = new Dolphin();
	 			dolphin.decodeFromXml(element);
	 			return dolphin;
	 		case Constants.Animals.Aquatics.Shark:
	 			Animal shark = new Shark();
	 			shark.decodeFromXml(element);
	 			return shark;
	 		case Constants.Animals.Aquatics.Whale:
	 			Animal whale = new Whale();
	 			whale.decodeFromXml(element);
	 			return whale;
	 		case Constants.Animals.Reptiles.Lizard:
	 			Animal lizard = new Lizard();
	 			lizard.decodeFromXml(element);
	 			return lizard;
	 		case Constants.Animals.Reptiles.Snake:
	 			Animal snake = new Snake();
	 			snake.decodeFromXml(element);
	 			return snake;
	 		case Constants.Animals.Reptiles.Turtle:
	 			Animal turtle = new Turtle();
	 			turtle.decodeFromXml(element);
	 			return turtle;
	 		case Constants.Animals.Birds.Chicken:
	 			Animal chicken = new Chicken();
	 			chicken.decodeFromXml(element);
	 			return chicken;
	 		case Constants.Animals.Birds.Eagle:
	 			Animal eagle = new Eagle();
	 			eagle.decodeFromXml(element);
	 			return eagle;
	 		case Constants.Animals.Birds.Owl:
	 			Animal owl = new Owl();
	 			owl.decodeFromXml(element);
	 			return owl;
	 		default:
	 			break;
	 		}
	 		
	 	return null;
	}

	
}
