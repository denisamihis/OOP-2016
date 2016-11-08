package models.animals;

import javax.xml.stream.XMLEventWriter;
import static repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLStreamException;

import servicies.factory.animal.Constants;

public class Fly extends Insect {
	public Fly() {
		super(8.0, 1.0);
		setName("DarkBzzz");
		setNrOfLegs(6);
		setCanFly(true);
		setIsDangerous(true);
	}

	public Fly(String name, Boolean canFly, Boolean isDangerous, Double maintenanceCost, double percKill) {
		super(maintenanceCost, percKill);
		setName(name);
		setNrOfLegs(6);
		setCanFly(canFly);
		setIsDangerous(isDangerous);

	}

	public void encodedToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodedToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Fly);
	}
}
