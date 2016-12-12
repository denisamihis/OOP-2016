package repositories;




import javax.swing.text.Element;



import models.animals.Animal;
import models.animals.Butterfly;
import models.animals.Chicken;
import models.animals.Cockroach;
import models.animals.Cow;
import models.animals.Dolphin;
import models.animals.Eagle;
import models.animals.Lizard;
import models.animals.Monkey;
import models.animals.Owl;
import models.animals.ReggaeShark;
import models.animals.SeaHorse;
import models.animals.Snake;
import models.animals.Spider;
import models.animals.Tiger;
import models.animals.Turtle;
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
		case Constants.Animal.Bird.Owl:
			Animal owl = new Owl();
			owl.decodeFromXml((org.w3c.dom.Element) element);
			return owl;
		case Constants.Animal.Bird.Chicken:
			Animal chicken = new Chicken();
			chicken.decodeFromXml((org.w3c.dom.Element) element);
			return chicken;
		case Constants.Animal.Bird.Eagle:
			Animal eagle = new Eagle();
			eagle.decodeFromXml((org.w3c.dom.Element) element);
			return eagle;
		case Constants.Animal.Aquatic.Dolphin:
			Animal dolphin = new Dolphin(type);
			dolphin.decodeFromXml((org.w3c.dom.Element) element);
			return dolphin;
		case Constants.Animal.Aquatic.ReggaeShark:
			Animal shark = new ReggaeShark(type);
			shark.decodeFromXml((org.w3c.dom.Element) element);
			return shark;
		case Constants.Animal.Aquatic.SeaHorse:
			Animal seahorse = new SeaHorse(type);
			seahorse.decodeFromXml((org.w3c.dom.Element) element);
			return seahorse;
		case Constants.Animal.Reptile.Turtle:
			Animal turtle = new Turtle();
			turtle.decodeFromXml((org.w3c.dom.Element) element);
			return turtle;
		case Constants.Animal.Reptile.Snake:
			Animal snake = new Snake();
			snake.decodeFromXml((org.w3c.dom.Element) element);
			return snake;
		case Constants.Animal.Reptile.Lizard:
			Animal lizard = new Lizard();
			lizard.decodeFromXml((org.w3c.dom.Element) element);
			return lizard;
		default:
		break;
		}
		return null;
		
	}}
	
	
	
	
	
	





