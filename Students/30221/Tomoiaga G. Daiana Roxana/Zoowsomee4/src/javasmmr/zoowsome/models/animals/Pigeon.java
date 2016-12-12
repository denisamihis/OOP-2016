package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Pigeon extends Bird {
	
	public Pigeon (int nrOfLegs, String name, boolean migrates, int avgFlightAltitude, double maintenanceCost, double dangerPerc){
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	
	public Pigeon (){
		super(1.8, 0.0);
		setNrOfLegs(2);
		setName("Pigeon");
		setMigrates(false);
		setAvgFlightAltitude(30);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Birds.Pigeon);
		}
	

}
