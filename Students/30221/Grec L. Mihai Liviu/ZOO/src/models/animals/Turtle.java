package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import services.factories.Constants;

public class Turtle extends Reptile{
	public Turtle(){
		super(1.8 , 0.0);
		setNrOfLegs(4);
		setName("Turtle");
		setLaysEggs(true);
	}
	public Turtle(Integer  nrOfLegs , String name , boolean laysEggs){
		super(1.8 , 0.0);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	} 
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Animals.Reptiles.Turtle);	
	}
}
