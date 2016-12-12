package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import services.factories.Constants;

public class Cockroach extends Insect{
	public Cockroach(){
		super(1.2 , 0.1);
		setNrOfLegs(6);
		setName("Cockroach");
		setCanFly(false);
		setIsDangerous(false);
	}
	public Cockroach(Integer nrOfLegs , String name , boolean canFly , boolean isDangerous){
		super(0.7 , 0.1);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Animals.Insects.Cockroach);	
	}
}
