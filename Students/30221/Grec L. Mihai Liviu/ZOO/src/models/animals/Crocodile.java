package models.animals;

import static repositories.AnimalRepository.createNode;

import java.util.Calendar;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import services.factories.Constants;

public class Crocodile  extends Reptile{
	public Crocodile(){
		super(5.2 , 0.55);
		setNrOfLegs(4);
		setName("Crocodile");
		setLaysEggs(true);
	}
	public Crocodile(Integer nrOfLegs , String name , boolean laysEggs){
		super(6.1 , 0.42);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	public double getPredisposition(){
		Calendar date = Calendar.getInstance();
		if (date.get(Calendar.MONTH)>=Calendar.JUNE && date.get(Calendar.MONTH)<=Calendar.AUGUST)
			return 0.2;
		return 0;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Animals.Reptiles.Crocodile);	
	}
}
