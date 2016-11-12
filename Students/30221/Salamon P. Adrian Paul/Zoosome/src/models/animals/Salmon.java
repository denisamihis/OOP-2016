package models.animals;

import javax.xml.stream.XMLEventWriter;
import static repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLStreamException;

import models.animals.WaterType;
import servicies.factory.animal.Constants;

public class Salmon extends Aquatic {
	private static final WaterType FRESHWATER = null;

	public Salmon() {
		super(5.7, 0.2);
		setName("Meal");
		setNrOfLegs(0);
		setAvgSwimDepth(200);
		setWaterType(FRESHWATER);
	}

	public Salmon(String name, Integer avgSwimDepth, WaterType waterType, Double maintenanceCost, double percKill) {
		super(maintenanceCost, percKill);
		setName(name);
		setNrOfLegs(0);
		setWaterType(waterType);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);

	}

	public void encodedToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodedToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Salmon);
	}

}
