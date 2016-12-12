package models.animals;

import static repositories.AnimalRepository.createNode;

import java.util.Calendar;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import services.factories.Constants;

public class Lion extends Mammal{
	public Lion(){
		super(5.3 , 0.54);
		setNrOfLegs(4);
		setName("Lion");
		setNormalBodyTemp(38.5);
		setPercBodyHair(0.4);
	}
	public Lion(Integer nrOfLegs , String name , double normalBodyTemp , double percBodyHair){
			super(6.8 , 0.46);
			setNrOfLegs(nrOfLegs);
			setName(name);
			setNormalBodyTemp(normalBodyTemp);
			setPercBodyHair(percBodyHair);
	}
	public double getPredisposition(){
			Calendar date = Calendar.getInstance();
			if (date.get(Calendar.HOUR_OF_DAY)>=9 && date.get(Calendar.HOUR_OF_DAY)<=12)
				return 0.3;
			return 0;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Animals.Mammals.Lion);	
	}
	
}

