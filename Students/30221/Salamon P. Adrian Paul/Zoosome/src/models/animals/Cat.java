package models.animals;

import javax.xml.stream.XMLEventWriter;
import static repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLStreamException;

import servicies.factory.animal.Constants;

public class Cat extends Mammal {
	public Cat() {
		super(0.5, 0.5);
		setName("Sir Meaw");
		setNrOfLegs(4);
		setNormalBodyTemp(30);
		setPercBodyHair(100);
	}

	public void encodedToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodedToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Cat);
	}

	public Cat(String name, float normalBodyTemp, float percBodyHair, Double maintenanceCost, double percKill) {
		super(maintenanceCost, percKill);
		setName(name);
		setNrOfLegs(4);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
}
