package animals;

import javax.xml.stream.*;
import static repositories.AnimalRepository.createNode;
import factories.Constants;

public class Seahorse extends Aquatic {
	public Seahorse() {
		super(3.0, 0.0001);
		setNrOfLegs(0);
		setName("Seahorse");
		setAvgSwimDepth(200);
		setWaterType(wType.Saltwater);
	}

	public Seahorse(Integer nrOfLegs, String name, Double maintenanceCost, Double dangerPerc, Integer avgSwimDepth,
			wType waterType) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Seahorse);
	}

}
