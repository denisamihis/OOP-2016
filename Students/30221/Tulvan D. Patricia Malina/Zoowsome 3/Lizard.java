package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.animals.Constants;

public class Lizard extends Reptile{

	public Lizard(){
		super(3.3,0.01);
		setNrOfLegs(4);
		setName("Lizard");
		setLayEggs(Boolean.TRUE);
	}
	
	public Lizard(Integer nrOfLegs,String name,Boolean layEggs,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLayEggs(layEggs);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Reptiles.Lizard);
	}
}
