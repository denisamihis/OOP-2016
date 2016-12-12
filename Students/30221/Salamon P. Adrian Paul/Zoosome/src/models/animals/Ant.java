package models.animals;

import javax.xml.stream.XMLEventWriter;

import static repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLStreamException;

import servicies.factory.animal.Constants;

public class Ant extends Insect {
	public Ant() {
		super(0.5, 0.5);
		setName("Bob");
		setNrOfLegs(6);
		setCanFly(false);
		setIsDangerous(false);

	}

	public Ant(String name, Boolean canFly, Boolean isDangerous, Double maintaneanceCost, double percKill) {
		super(maintaneanceCost, percKill);
		setName(name);
		setNrOfLegs(6);
		setCanFly(canFly);
		setIsDangerous(isDangerous);

	}

	public void encodedToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodedToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Ant);
	}

}
