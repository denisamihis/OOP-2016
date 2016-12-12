package repositories;

import animals.*;
import factories.Constants;
import org.w3c.dom.Element;


public class AnimalRepository extends EntityRepository<Animal> {

	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}

	@Override
	protected Animal getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
	
			switch (discriminant) {

			// aquatics
			case Constants.Animals.Aquatics.Seahorse:
				Animal seahorse = new Seahorse();
				seahorse.decodeFromXml(element);
				return seahorse;
			
			case Constants.Animals.Aquatics.Shark:
				Animal shark = new Shark();
				shark.decodeFromXml(element);
				return shark;
			
			case Constants.Animals.Aquatics.Whale:
				Animal whale = new Whale();
				whale.decodeFromXml(element);
				return whale;
				
			// birds
			case Constants.Animals.Birds.Mockingjay:
				Animal mockingjay = new Mockingjay();
				mockingjay.decodeFromXml(element);
				return mockingjay;
			
			case Constants.Animals.Birds.Stork:
				Animal stork = new Stork();
				stork.decodeFromXml(element);
				return stork;
			
			case Constants.Animals.Birds.Woodpecker:
				Animal woodpecker = new Woodpecker();
				woodpecker.decodeFromXml(element);
				return woodpecker;
				

			// insects
			case Constants.Animals.Insects.Ant:
				Animal ant = new Ant();
				ant.decodeFromXml(element);
				return ant;
			
			case Constants.Animals.Insects.Butterfly:
				Animal butterfly = new Butterfly();
				butterfly.decodeFromXml(element);
				return butterfly;
			
			case Constants.Animals.Insects.Mosquito:
				Animal mosquito = new Mosquito();
				mosquito.decodeFromXml(element);
				return mosquito;
			

			// Mammals
			case Constants.Animals.Mammals.Deer:
				Animal deer = new Deer();
				deer.decodeFromXml(element);
				return deer;
	
			case Constants.Animals.Mammals.Hyena:
				Animal hyena = new Hyena();
				hyena.decodeFromXml(element);
				return hyena;
			
			case Constants.Animals.Mammals.Kangaroo:
				Animal kangaroo = new Kangaroo();
				kangaroo.decodeFromXml(element);
				return kangaroo;
		

			// reptiles
			case Constants.Animals.Reptiles.Gekko:
				Animal gekko = new Gekko();
				gekko.decodeFromXml(element);
				return gekko;
			
			case Constants.Animals.Reptiles.Seaturtle:
				Animal seaturtle = new Seaturtle();
				seaturtle.decodeFromXml(element);
				return seaturtle;
			
			case Constants.Animals.Reptiles.Snake:
				Animal snake = new Snake();
				snake.decodeFromXml(element);
				return snake;
		

			default:
				break;
			}
		return null;
	}

}