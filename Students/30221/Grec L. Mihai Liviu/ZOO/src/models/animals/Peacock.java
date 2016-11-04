package models.animals;

import static repositories.AnimalRepository.createNode;

import java.util.Calendar;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import services.factories.Constants;

public class Peacock extends Bird{
	public Peacock(){
		super(1.9 , 0.05);
		setNrOfLegs(2);
		setName("Peacock");
		setMigrates(false);
		setAvgFlightAltitude(0);
	}
	public Peacock(Integer nrOfLegs , String name , boolean migrates , Integer avgFlightAltitude){
		super(1.9 , 0.05);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	public double getPredisposition(){
		Calendar date = Calendar.getInstance();
		if (date.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY)
			return 0.06;
		return 0;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Animals.Birds.Peacock);	
	}
}
