package models.animals;

import javax.xml.stream.XMLEventWriter;
import static repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLStreamException;

import servicies.factory.animal.Constants;

public class Rat extends Mammal {
	public Rat() {
		super(0.0, 9.9);
		setName("Sir Ratonten");
		setNrOfLegs(4);
		setNormalBodyTemp(10);
		setPercBodyHair(20);
	}

	public Rat(String name, float normalBodyTemp, float percBodyHair, Double maintenanceCost, double percKill) {
		super(maintenanceCost, percKill);
		setName(name);
		setNrOfLegs(4);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}

	public void encodedToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodedToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Rat);
	}
}
