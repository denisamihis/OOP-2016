package models.animals;

import static repositories.AnimalRepository.createNode;

import java.util.Calendar;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import services.factories.Constants;

public class Eagle extends Bird{
	public Eagle(){
		super(3.9 , 0.24);
		setNrOfLegs(2);
		setName("Eagle");
		setMigrates(true);
		setAvgFlightAltitude(3000);
	}
	public Eagle(Integer nrOfLegs , String name , boolean migrates , Integer avgFlightAltitude){
		super(3.9 , 0.24);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}
	public double getPredisposition(){
		Calendar date = Calendar.getInstance();
		if (date.get(Calendar.HOUR_OF_DAY)>=22 && date.get(Calendar.HOUR_OF_DAY) <=6)
			return 0.26;
		return 0;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Animals.Birds.Eagle);	
	}
}
