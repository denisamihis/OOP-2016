package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.util.Date;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.constants.Constants;

public class Shark extends Aquatic {
	
	public Shark(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType, Double maintenanceCost, Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	
	public Shark() {
		super(5.5, 0.6);
		setNrOfLegs(0);
		setName("Shark");
		setAvgSwimDepth(2500);
		setWaterType(WaterType.SALTWATER);
	}

	@SuppressWarnings("deprecation")
	@Override
	public double getPredisposition() {
		Date currentDate = new Date();
		if (currentDate.getHours() >= 9 && currentDate.getHours() < 15) {
			return 0.1;
		}
		return 0.0;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.SHARK);
	}
	
}
