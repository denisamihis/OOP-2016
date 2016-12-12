package models.animals;

import static repositories.AnimalRepository.createNode;

import java.util.Calendar;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import services.factories.Constants;

public class Snake extends Reptile{
	public Snake(){
		super(2.4 , 0.47);
		setNrOfLegs(0);
		setName("Snake");
		setLaysEggs(true);
	}
	public Snake(Integer nrOfLegs , String name , boolean laysEggs){
		super(2.4 , 0.39);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	public double getPredisposition(){
		Calendar date = Calendar.getInstance();
		if (date.get(Calendar.HOUR_OF_DAY)>=18 && date.get(Calendar.HOUR_OF_DAY)<=6)
			return 0.35;
		return 0;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Animals.Reptiles.Snake);	
	}
}
