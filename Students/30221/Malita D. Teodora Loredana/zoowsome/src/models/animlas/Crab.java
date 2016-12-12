package models.animlas;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import repositories.AnimalRepository;
import services.factories.employeeFactory.Constants;

public class Crab extends Aquatic {
	public Crab (String name){
		super(-7,wT.freshWater, name, 8,5.6,0.3);
	}
	public Crab (){
		super(-7,wT.freshWater,"Unknown", 8,5.6,0.3);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,services.factories.animalFactory.Constants.Animals.Aquatics.Crab);
	}


}
