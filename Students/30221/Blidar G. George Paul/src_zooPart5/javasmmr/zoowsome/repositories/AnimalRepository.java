package javasmmr.zoowsome.repositories;
import javasmmr.zoowsome.models.Aligator;
import javasmmr.zoowsome.models.Animal;
import javasmmr.zoowsome.models.Butterfly;
import javasmmr.zoowsome.models.Cow;
import javasmmr.zoowsome.models.Dinosaur;
import javasmmr.zoowsome.models.Dolphin;
import javasmmr.zoowsome.models.Eagle;
import javasmmr.zoowsome.models.Flamingo;
import javasmmr.zoowsome.models.Jellyfish;
import javasmmr.zoowsome.models.Monkey;
import javasmmr.zoowsome.models.Pelican;
import javasmmr.zoowsome.models.Shark;
import javasmmr.zoowsome.models.Snake;
import javasmmr.zoowsome.models.Spider;
import javasmmr.zoowsome.models.Tiger;
import javasmmr.zoowsome.models.Wasp;
import javasmmr.zoowsome.services.Constants;

import org.w3c.dom.Element;


public class AnimalRepository extends EntityRepository<Animal> {
	
	private static final String XML_FILENAME = "Animals.xml";
	
	public AnimalRepository()
	{
		super(XML_FILENAME,Constants.XML_TAGS.ANIMAL);
	}
	
	
	@Override
	protected Animal getEntityFromXmlElement(Element element)
	{
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch(discriminant)
		{
		case Constants.Animals.Reptiles.Aligator:
			Animal aligator = new Aligator();
			aligator.decodeFromXml(element);
			return aligator;
		case Constants.Animals.Reptiles.Dinosaur:
			Animal dinosaur = new Dinosaur();
			dinosaur.decodeFromXml(element);
			return dinosaur;
		case Constants.Animals.Reptiles.Snake:
			Animal snake = new Snake();
			snake.decodeFromXml(element);
			return snake;
		case Constants.Animals.Insects.Butterfly:
			Animal butterfly = new Butterfly();
			butterfly.decodeFromXml(element);
			return butterfly;
		case Constants.Animals.Insects.Spider:
			Animal spider = new Spider();
			spider.decodeFromXml(element);
			return spider;
		case Constants.Animals.Insects.Wasp:
			Animal wasp = new Wasp();
			wasp.decodeFromXml(element);
			return wasp;
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
		case Constants.Animals.Aquatics.Jellyfish:
			Animal jellyfish = new Jellyfish();
			jellyfish.decodeFromXml(element);
			return jellyfish;
		case Constants.Animals.Aquatics.Shark:
			Animal shark = new Shark();
			shark.decodeFromXml(element);
			return shark;
		case Constants.Animals.Birds.Eagle:
			Animal eagle = new Eagle();
			eagle.decodeFromXml(element);
			return eagle;
		case Constants.Animals.Birds.Flamingo:
			Animal flamingo = new Flamingo();
			flamingo.decodeFromXml(element);
			return flamingo;
		case Constants.Animals.Birds.Pelican:
			Animal pelican = new Pelican();
			pelican.decodeFromXml(element);
			return pelican;
		default:
			break;
		}
		return null;
	}
	
	
}
