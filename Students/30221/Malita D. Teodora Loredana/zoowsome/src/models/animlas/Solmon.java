package models.animlas;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import repositories.AnimalRepository;
import services.factories.employeeFactory.Constants;

public class Solmon extends Aquatic {
	public Solmon (String name){
		super(-13,wT.saltWater,name,0,3.4,0.31);
	}
	public Solmon (){
		super(-13,wT.saltWater, "Unknown", 0,3.4,0.31);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,services.factories.animalFactory.Constants.Animals.Aquatics.Solmon);
	}

}
