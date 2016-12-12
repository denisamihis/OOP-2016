package animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import factories.Constants;

public class SeaTurtle extends Aquatic {
	public SeaTurtle() {
		super(2.0, 0.00);
		setNrOfLegs(2);
		setName("SeaTurtle");
		setAvgSwimDepth(80);
		setWaterType(watType.Saltwater);
	}

	public SeaTurtle(Integer nrOfLegs, String name, Integer avgSwimDepth, watType waterType, Double maintenaceCost,
			Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.SeaTurtle);
	}
	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
}
