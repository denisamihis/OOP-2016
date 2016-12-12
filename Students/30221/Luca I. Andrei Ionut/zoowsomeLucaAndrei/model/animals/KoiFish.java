package animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import factories.Constants;

public class KoiFish extends Aquatic {
	public KoiFish() {
		super(2.0, 0.00);
		setNrOfLegs(0);
		setName("KoiFish");
		setAvgSwimDepth(100);
		setWaterType(watType.Saltwater);
	}

	public KoiFish(Integer nrOfLegs, String name, Integer avgSwimDepth, watType waterType, Double maintenaceCost,
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
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.KoiFish);
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
}
