package javasmmr.zoowsome.repositories;

import org.w3c.dom.*;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.animals.Constants;

public class AnimalRepository extends EntityRepository<Animal> {
	
	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}

	@Override
	protected Animal getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();

		switch (discriminant) {
		case Constants.Animals.Insects.BUTTERFLY:
			Animal butterfly = new Butterfly();
			butterfly.decodeFromXml(element);
			return butterfly;
		case Constants.Animals.Insects.COCKROACH:
			Animal cockroach = new Cockroach();
			cockroach.decodeFromXml(element);
			return cockroach;
		case Constants.Animals.Insects.SPIDER:
			Animal spider = new Spider();
			spider.decodeFromXml(element);
			return spider;
		case Constants.Animals.Mammals.COW:
			Animal cow = new Cow();
			cow.decodeFromXml(element);
			return cow;
		case Constants.Animals.Mammals.MONKEY:
			Animal monkey = new Monkey();
			monkey.decodeFromXml(element);
			return monkey;
		case Constants.Animals.Mammals.TIGER:
			Animal tiger = new Tiger();
			tiger.decodeFromXml(element);
			return tiger;
		case Constants.Animals.Aquatics.OCTOPUS:
			Animal octopus = new Octopus();
			octopus.decodeFromXml(element);
			return octopus;
		case Constants.Animals.Aquatics.SEAHORSE:
			Animal seahorse = new Seahorse();
			seahorse.decodeFromXml(element);
			return seahorse;
		case Constants.Animals.Aquatics.SHARK:
			Animal shark = new Shark();
			shark.decodeFromXml(element);
			return shark;
		case Constants.Animals.Reptiles.LIZARD:
			Animal lizard = new Lizard();
			lizard.decodeFromXml(element);
			return lizard;
		case Constants.Animals.Reptiles.SNAKE:
			Animal snake = new Snake();
			snake.decodeFromXml(element);
			return snake;
		case Constants.Animals.Reptiles.TURTLE:
			Animal turtle = new Turtle();
			turtle.decodeFromXml(element);
			return turtle;
		case Constants.Animals.Birds.OSTRICH:
			Animal ostrich = new Ostrich();
			ostrich.decodeFromXml(element);
			return ostrich;
		case Constants.Animals.Birds.PENGUIN:
			Animal penguin = new Penguin();
			penguin.decodeFromXml(element);
			return penguin;
		case Constants.Animals.Birds.VULTURE:
			Animal vulture = new Vulture();
			vulture.decodeFromXml(element);
			return vulture;
		default:
			break;
		}
		
		return null;
	}

}
