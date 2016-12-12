package models.animals;

import javax.xml.stream.XMLEventWriter;
import static repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLStreamException;

import servicies.factory.animal.Constants;

public class Horse extends Mammal {
	public Horse() {
		super(8.0, 1.0);
		setName("Deadly Hoof");
		setNrOfLegs(4);
		setNormalBodyTemp(100);
		setPercBodyHair(20);

	}

	public Horse(String name, float normalBodyTemp, float percBodyHair, Double maintenanceCost, double percKill) {
		super(maintenanceCost, percKill);
		setName(name);
		setNrOfLegs(4);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}

	public void encodedToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodedToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Horse);
	}

}
