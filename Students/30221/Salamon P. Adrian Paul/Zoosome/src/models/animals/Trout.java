package models.animals;

import javax.xml.stream.XMLEventWriter;
import static repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLStreamException;

import models.animals.WaterType;
import servicies.factory.animal.Constants;

public class Trout extends Aquatic {
	private static final WaterType FRESHWATER = null;

	public Trout() {
		super(6.0, 1.0);
		setName("Deadly Tail");
		setNrOfLegs(0);
		setWaterType(FRESHWATER);
		setAvgSwimDepth(20);
	}

	public Trout(String name, Integer avgSwimDepth, WaterType waterType, Double maintenanceCost, double percKill) {
		super(maintenanceCost, percKill);
		setName(name);
		setNrOfLegs(0);
		setWaterType(waterType);
		setAvgSwimDepth(avgSwimDepth);

	}

	public void encodedToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodedToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Trout);
	}

}