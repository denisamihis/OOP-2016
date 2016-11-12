package models.animlas;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import repositories.AnimalRepository;
import services.factories.employeeFactory.Constants;

public class Chamameleon extends Reptile{
	public Chamameleon (String name){
		super(true,name,4,true,4.0,0.4);
	}
	public Chamameleon (){
		super(true,"Unknown",4,true,4.0,0.4);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,services.factories.animalFactory.Constants.Animals.Reptiles.Chamameleon);
	}


}
