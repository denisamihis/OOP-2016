package repositories;

import org.w3c.dom.Element;
import models.animlas.*;
import services.factories.employeeFactory.Constants;

public class AnimalRepository extends EntityRepository<Animal> {
	private static final String XML_FILENAME = "Animals.xml";
	public AnimalRepository(){
		super(XML_FILENAME,Constants.XML_TAGS.ANIMAL);
	}
	@Override
	protected Animal getEntityFromXmlElement(Element element){
		String discriminant=element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch(discriminant){
		case services.factories.animalFactory.Constants.Animals.Mammals.Cat:
			Animal cat = new Cat();
			cat.decodeFromXml(element);
			return cat;
		case services.factories.animalFactory.Constants.Animals.Mammals.Dog:
			Animal dog = new Dog();
			dog.decodeFromXml(element);
			return dog;
		case services.factories.animalFactory.Constants.Animals.Mammals.Tiger:
			Animal tiger = new Tiger();
			tiger.decodeFromXml(element);
			return tiger;
		case services.factories.animalFactory.Constants.Animals.Insects.Butterfly:
			Animal butterfly = new Butterfly();
			butterfly.decodeFromXml(element);
			return butterfly;
		case services.factories.animalFactory.Constants.Animals.Insects.Moschito:
			Animal moschito = new Moschito();
			moschito.decodeFromXml(element);
			return moschito;
		case services.factories.animalFactory.Constants.Animals.Insects.Spider:
			Animal spider = new Spider();
			spider.decodeFromXml(element);
			return spider;
		case services.factories.animalFactory.Constants.Animals.Aquatics.Crab:
			Animal crab = new Crab();
			crab.decodeFromXml(element);
			return crab;
		case services.factories.animalFactory.Constants.Animals.Aquatics.Seal:
			Animal seal = new Seal();
			seal.decodeFromXml(element);
			return seal;
		case services.factories.animalFactory.Constants.Animals.Aquatics.Solmon:
			Animal solmon = new Crab();
			solmon.decodeFromXml(element);
			return solmon;
		case services.factories.animalFactory.Constants.Animals.Birds.Dove:
			Animal dove = new Dove();
			dove.decodeFromXml(element);
			return dove;
		case services.factories.animalFactory.Constants.Animals.Birds.Eagle:
			Animal eagle = new Eagle();
			eagle.decodeFromXml(element);
			return eagle;
		case services.factories.animalFactory.Constants.Animals.Birds.Flamingo:
			Animal flamingo = new Flamingo();
			flamingo.decodeFromXml(element);
			return flamingo;
		case services.factories.animalFactory.Constants.Animals.Reptiles.Chamameleon:
			Animal chamameleon = new Chamameleon();
			chamameleon.decodeFromXml(element);
			return chamameleon;
		case services.factories.animalFactory.Constants.Animals.Reptiles.Crocodile:
			Animal crocodile = new Crocodile();
			crocodile.decodeFromXml(element);
			return crocodile;
		case services.factories.animalFactory.Constants.Animals.Reptiles.Snake:
			Animal snake = new Snake();
			snake.decodeFromXml(element);
			return snake;
		
		}
		return null;
	}
	
}
