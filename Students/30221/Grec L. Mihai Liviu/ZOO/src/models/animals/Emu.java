package models.animals;

import static repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import services.factories.Constants;

public class Emu extends Bird{
	public Emu(){
		super(3.2 , 0.18);
		setNrOfLegs(2);
		setName("Emu");
		setMigrates(true);
		setAvgFlightAltitude(0);
	}
	public Emu(Integer nrOfLegs , String name , boolean migrates , Integer avgFlightAltitude){
		super(3.2 , 0.18);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Animals.Birds.Emu);	
	}
}
