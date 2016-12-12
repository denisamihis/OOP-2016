package models.animals;

import javax.xml.stream.XMLEventWriter;
import static repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLStreamException;

import servicies.factory.animal.Constants;

public class Moth extends Insect {
	public Moth() {
		super(8.0, 0.9);
		setName("Clothlover");
		setNrOfLegs(6);
		setCanFly(true);
		setIsDangerous(true);

	}

	public Moth(String name, Boolean canFly, Boolean isDangerous, Double maintenaceCost, double percKill) {
		super(maintenaceCost, percKill);
		setName(name);
		setNrOfLegs(6);
		setCanFly(canFly);
		setIsDangerous(isDangerous);

	}
	public void encodedToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{super.encodedToXml(eventWriter);
	createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,
			Constants.Animals.Insects.Moth);}

}