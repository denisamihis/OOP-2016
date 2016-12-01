package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.util.Date;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.animals.Constants;

public class Tiger extends Mammal{
	public Tiger(){
		super(6.3,0.65);
		setNrOfLegs(4);
		setName("Tiger");
		setNormalBodyTemp(37.0f);
		setPercBodyHair(95.3f);
	}
	
	public Tiger(Integer nrOfLegs, String name, Float normalBodyTemp, Float percBodyHair,Double maintenanceCost, Double dangerPerc ){
		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setNormalBodyTemp(normalBodyTemp);
		setPercBodyHair(percBodyHair);
	}
	
	@SuppressWarnings("deprecation")
	public double getPredisposition(){
		Date date= new Date();
		if(date.getDay()>=1 && date.getDay()<=4)
			return 0.20;
		return 0.0;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Mammals.Tiger);
	}
}
