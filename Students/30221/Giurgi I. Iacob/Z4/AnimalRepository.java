package javasmmr.zoowsome.repositories;

import org.w3c.dom.Element;


import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.services.factories.Constants;



// import javasmmr.zoowsome.services.*;
import javasmmr.zoowsome.models.animals.*;
public class AnimalRepository extends EntityRepository<Animal>{
	
	private static final String XML_FILENAME = "Animals.xml";
	
	public AnimalRepository() {
	          super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}
	
	
	
	@Override
	  protected Animal getEntityFromXmlElement(Element element) {
	    String discriminant =element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
	switch (discriminant) {
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
		case Constants.Animals.Reptiles.Lizard:{
			Animal lizard = new Lizard();
			lizard.decodeFromXml(element);
			return lizard;
			
		}
		case Constants.Animals.Aquatics.FishFresh:{
			Animal fishfresh = new FishFresh();
			fishfresh.decodeFromXml(element);
			return fishfresh;
		}
		case Constants.Animals.Birds.Ostrich:{
			Animal Ostrich = new Ostrich();
			Ostrich.decodeFromXml(element);
			return Ostrich;
		}
		case Constants.Animals.Birds.Vulture:{
			Animal Vulture = new Vulture();
			Vulture.decodeFromXml(element);
			return Vulture;
		}
		case Constants.Animals.Mammals.Cow:{
			Animal Cow = new Cow();
			Cow.decodeFromXml(element);
			return Cow;
		}
		case Constants.Animals.Mammals.Monkey:{
			Animal Monkey = new Monkey();
			Monkey.decodeFromXml(element);
			return Monkey;
		}
		case Constants.Animals.Birds.Woodpecker:{
			Animal Woodpecker = new Woodpecker();
			Woodpecker.decodeFromXml(element);
			return Woodpecker;
		}
		case Constants.Animals.Aquatics.Shark:{
			Animal shark = new Shark();
			shark.decodeFromXml(element);
			return shark;
		}
		case Constants.Animals.Aquatics.Whale:{
			Animal whale = new Whale();
			whale.decodeFromXml(element);
			return whale;
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
		case Constants.Animals.Reptiles.Seaturtle:{
			Animal Seaturtle = new Seaturtle();
			Seaturtle.decodeFromXml(element);
			return Seaturtle;
		}
		default:break;
		}
	    return null;
	}
	}

	
	
	
