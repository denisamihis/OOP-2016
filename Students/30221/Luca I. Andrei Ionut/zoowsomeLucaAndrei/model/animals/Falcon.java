package animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import factories.Constants;

public class Falcon extends Bird {
	public Falcon() {
		super(3.0, 0.01);
		setNrOfLegs(2);
		setName("Falcon");
		setAvgFlightAltitude(500);
		setMigrates(false);
	}

	public Falcon(Integer nrOfLegs, String name, Integer avgFlightAltitude, Boolean migrates, Double maintenaceCost,
			Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgFlightAltitude(avgFlightAltitude);
		setMigrates(migrates);
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Falcon);
	}

	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
}
