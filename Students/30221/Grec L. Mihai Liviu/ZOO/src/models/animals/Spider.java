package models.animals;

import static repositories.AnimalRepository.createNode;

import java.util.Calendar;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import services.factories.Constants;

public class Spider extends Insect{
	public Spider(){
		super(2.1 , 0.68);
		setNrOfLegs(8);
		setName("Spider");
		setCanFly(false);
		setIsDangerous(true);
	}
	public Spider(Integer  nrOfLegs , String name , boolean canFly , boolean isDangerous){
		super(2.1 , 0.41);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
	public double getPredisposition(){
		Calendar date = Calendar.getInstance();
		if (date.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || date.get(Calendar.MONTH) == Calendar.MARCH)
			return 0.34;
		return 0;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Animals.Insects.Spider);	
	}
}
