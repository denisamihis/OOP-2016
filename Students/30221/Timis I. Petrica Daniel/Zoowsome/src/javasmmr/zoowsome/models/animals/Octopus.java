package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.constants.Constants;

public class Octopus extends Aquatic {

	public Octopus(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType, Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	
	public Octopus() {
		super(3.9, 0.12);
		setNrOfLegs(6);
		setName("Octopus");
		setAvgSwimDepth(2100);
		setWaterType(WaterType.SALTWATER);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.OCTOPUS);
	}
	
}
