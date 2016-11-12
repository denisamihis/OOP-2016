package animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import factories.Constants;

public class BlackSparrow extends Bird {
	public BlackSparrow() {
		super(1.0, 0.00);
		setNrOfLegs(2);
		setName("BlackSparrow");
		setAvgFlightAltitude(150);
		setMigrates(false);
	}

	public BlackSparrow(Integer nrOfLegs, String name, Integer avgFlightAltitude, Boolean migrates,
			Double maintenaceCost, Double dangerPerc) {
		super(maintenaceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgFlightAltitude(avgFlightAltitude);
		setMigrates(migrates);
	}

	@Override
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.BlackSparrow);
	}


	@Override
	public void decodeFromXml(Element element) {
		// TODO Auto-generated method stub
		
	}
}