package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.animals.Constants;

public class Monkey extends Mammal {
	public Monkey(){
		super(6.3,0.21);
		setNrOfLegs(2);
		setName("Monkey");
		setNormalBodyTemp(37.2f);
		setPercBodyHair(88.1f);
	}
	
	public Monkey(Integer nrOfLegs, String name,Float normalBodyTemp, Float percBodyHair,Double maintenanceCost, Double dangerPerc){
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Mammals.Monkey);
	}
}
