package models.animals;

import static repositories.AnimalRepository.createNode;

import java.util.Calendar;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import services.factories.Constants;

public class Tiger extends Mammal{
	public Tiger(){
		super(5.2 , 0.53);
		setNrOfLegs(4);
		setName("Tiger");
		setNormalBodyTemp(37.5);
		setPercBodyHair(0.2);
	}
	public Tiger(Integer  nrOfLegs , String name , double normalBodyTemp , double percBodyHair){
		super(6.6 , 0.47);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	public double getPredisposition(){
		Calendar date = Calendar.getInstance();
		if (date.get(Calendar.DAY_OF_MONTH)>=20 && date.get(Calendar.DAY_OF_MONTH)<=28)
			return 0.18;
		return 0;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT , Constants.Animals.Mammals.Tiger);	
	}
}
