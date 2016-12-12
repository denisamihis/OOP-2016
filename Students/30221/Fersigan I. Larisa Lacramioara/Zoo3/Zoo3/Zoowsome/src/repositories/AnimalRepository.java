package repositories;




import javax.swing.text.Element;



import models.animals.Animal;
import models.animals.Butterfly;
import models.animals.Chameleon;
import models.animals.Cockroach;
import models.animals.Cow;
import models.animals.Dolphin;
import models.animals.Octopuses;
import models.animals.Frog;
import models.animals.Monkey;
import models.animals.Parrots;
import models.animals.Squid;
import models.animals.Pinguin;
import models.animals.Stork;
import models.animals.Spider;
import models.animals.Tiger;
import models.animals.Viper;
import models.animals.WaterType;

import services.factories.Constants;

public class AnimalRepository extends EntityRepository<Animal> {
	private static final String XML_FILENAME = "Animals.xml";
	public AnimalRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}
	
		


	public WaterType type;
		@Override
		protected Animal getEntityFromXmlElement(Element element) {
		String discriminant =((org.w3c.dom.Element) element).getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {
		case Constants.Animal.Insect.Butterfly:
		Animal butterfly = new Butterfly();
		butterfly.decodeFromXml((org.w3c.dom.Element) element);
		return butterfly;
		case Constants.Animal.Insect.Spider:
			Animal Spider = new Spider();
			Spider.decodeFromXml((org.w3c.dom.Element) element);
			return Spider; 
		case Constants.Animal.Insect.Cockroach:
			Animal Cockroach = new Cockroach();
			Cockroach.decodeFromXml((org.w3c.dom.Element) element);
			return Cockroach;
		case Constants.Animal.Mammal.Tiger:
			Animal Tiger = new Tiger();
			Tiger.decodeFromXml((org.w3c.dom.Element) element);
			return Tiger;
		case Constants.Animal.Mammal.Cow:
			Animal cow = new Cow();
			cow.decodeFromXml((org.w3c.dom.Element) element);
			return cow;
		case Constants.Animal.Mammal.Monkey:
			Animal monkey = new Monkey();
			monkey.decodeFromXml((org.w3c.dom.Element) element);
			return monkey;
		case Constants.Animal.Bird.Parrots:
			Animal parrots = new Parrots();
			parrots.decodeFromXml((org.w3c.dom.Element) element);
			return parrots;
		case Constants.Animal.Bird.Pinguin:
			Animal pinguin = new Pinguin();
			pinguin.decodeFromXml((org.w3c.dom.Element) element);
			return pinguin;
		case Constants.Animal.Bird.Stork:
			Animal stork = new Stork();
			stork.decodeFromXml((org.w3c.dom.Element) element);
			return stork;
		case Constants.Animal.Aquatic.Dolphin:
			Animal dolphin = new Dolphin(type);
			dolphin.decodeFromXml((org.w3c.dom.Element) element);
			return dolphin;
		case Constants.Animal.Aquatic.Squid:
			Animal squid = new Squid(type);
			squid.decodeFromXml((org.w3c.dom.Element) element);
			return squid;
		case Constants.Animal.Aquatic.Octopuses:
			Animal octopuses = new Octopuses(type);
			octopuses.decodeFromXml((org.w3c.dom.Element) element);
			return octopuses;
		case Constants.Animal.Reptile.Frog:
			Animal frog = new Frog();
			frog.decodeFromXml((org.w3c.dom.Element) element);
			return frog;
		case Constants.Animal.Reptile.Viper:
			Animal viper = new Viper();
			viper.decodeFromXml((org.w3c.dom.Element) element);
			return viper;
		case Constants.Animal.Reptile.Chameleon:
			Animal chameleon = new Chameleon();
			chameleon.decodeFromXml((org.w3c.dom.Element) element);
			return chameleon;
		default:
		break;
		}
		return null;
		
	}}