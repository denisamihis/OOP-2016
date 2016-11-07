package animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import animals.Aquatic.wType;
import factories.Constants;

public class Shark extends Aquatic {
	public Shark() {
		super(4.0,0.0009);
		setNrOfLegs(0);
		setName("Shark");
		setAvgSwimDepth(2000);
		setWaterType(wType.Saltwater);
	}
	
	public Shark(Integer nrOfLegs, String name, Double maintenanceCost, Double dangerPerc, Integer avgSwimDepth, wType waterType) {
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Shark);
	}

}
