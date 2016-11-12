package models.animals;

import javax.xml.stream.XMLEventWriter;
import static repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLStreamException;

import servicies.factory.animal.Constants;

public class Turtle extends Reptile {
	public Turtle() {
		super(3.5, 0.4);
		setName("Golden Home");
		setNrOfLegs(4);
		setLaysEggs(true);

	}

	public Turtle(String name, Double maintenanceCost, double percKill) {
		super(maintenanceCost, percKill);
		setName(name);
		setNrOfLegs(4);
		setLaysEggs(true);

	}
	public void encodedToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{super.encodedToXml(eventWriter);
	createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,
			Constants.Animals.Reptiles.Turtle);}

}
