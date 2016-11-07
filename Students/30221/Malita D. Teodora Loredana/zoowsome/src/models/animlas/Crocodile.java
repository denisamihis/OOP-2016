package models.animlas;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import repositories.AnimalRepository;
import services.factories.employeeFactory.Constants;

public class Crocodile extends Reptile{
	public Crocodile (String name){
		super(true,name,4,true,6.9,0.9);
	}
	public Crocodile (){
		super(true,"Unknown",4,true,6.9,0.9);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,services.factories.animalFactory.Constants.Animals.Reptiles.Crocodile);
	}

}
