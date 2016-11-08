package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.animals.Constants;

public class Owl extends Bird{
	public Owl(){
		super(3.6,0.0);
		setNrOfLegs(2);
		setName("Owl");
		setMigrates(Boolean.FALSE);
		setAvgFlightAltitude(2000);
	}
	
	public Owl (Integer nrOfLegs, String name,Boolean migrates,Integer avgFlightAltitude,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Birds.Owl);
	}
}
