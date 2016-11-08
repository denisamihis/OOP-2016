package models.animals;

import javax.xml.stream.XMLEventWriter;
import static repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLStreamException;

import models.animals.WaterType;
import servicies.factory.animal.Constants;

public class Shark extends Aquatic {
	private static final WaterType SALTWATER = null;

	public Shark() {
		super(0.2, 0.0);
		setName("Vegan Sharky");
		setNrOfLegs(0);
		setWaterType(SALTWATER);
		setAvgSwimDepth(1);

	}

	public Shark(String name, Integer avgSwimDepth, WaterType waterType, Double maintenanceCost, double percKill) {
		super(maintenanceCost, percKill);
		setName(name);
		setNrOfLegs(0);
		setWaterType(waterType);
		setAvgSwimDepth(avgSwimDepth);

	}

	public void encodedToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodedToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Shark);
	}

}