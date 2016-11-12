package models.animlas;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import repositories.AnimalRepository;
import services.factories.employeeFactory.Constants;

public class Seal extends Aquatic  {
	public Seal (String name){
		super(-20,wT.saltWater, name, 2,7.5,0.17);
	}
	public Seal (){
		super(-20,wT.saltWater, "Unknown", 2,7.5,0.17);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,services.factories.animalFactory.Constants.Animals.Aquatics.Seal);
	}
}
