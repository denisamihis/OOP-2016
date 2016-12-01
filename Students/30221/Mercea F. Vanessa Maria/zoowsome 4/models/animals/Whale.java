package animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import animals.Aquatic.wType;
import factories.Constants;

public class Whale extends Aquatic {
	public Whale() {
		super(4.0,0.0001);
		setNrOfLegs(0);
		setName("Whale");
		setAvgSwimDepth(1000);
		setWaterType(wType.Saltwater);
	}
	
	public Whale(Integer nrOfLegs, String name, Double maintenanceCost, Double dangerPerc, Integer avgSwimDepth, wType waterType) {
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Whale);
	}

}
