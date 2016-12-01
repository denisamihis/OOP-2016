package javasmmr.zoowsome.repositories;


import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;

public class AnimalRepository extends EntityRepository<Animal> {

	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() {
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
		case Constants.Animals.Aquatics.Salmon:
			Animal salmon = new Salmon();
			salmon.decodeFromXml(element);
			return salmon;
		case Constants.Animals.Aquatics.Whale:
			Animal whale = new Whale();
			whale.decodeFromXml(element);
			return whale;
		case Constants.Animals.Reptiles.Chameleon:
			Animal chameleon = new Chameleon();
			chameleon.decodeFromXml(element);
			return chameleon;
		case Constants.Animals.Reptiles.Snake:
			Animal snake = new Snake();
			snake.decodeFromXml(element);
			return snake;
		case Constants.Animals.Reptiles.Turtle:
			Animal turtle = new Turtle();
			turtle.decodeFromXml(element);
			return turtle;
		case Constants.Animals.Birds.Colibri:
			Animal colibri = new Colibri();
			colibri.decodeFromXml(element);
			return colibri;
		case Constants.Animals.Birds.Pigeon:
			Animal pigeon = new Pigeon();
			pigeon.decodeFromXml(element);
			return pigeon;
		case Constants.Animals.Birds.Vulture:
			Animal vulture = new Vulture();
			vulture.decodeFromXml(element);
			return vulture;
		default:
			break;
		}
		return null;
	}

}
