package models.animlas;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import repositories.AnimalRepository;
import services.factories.employeeFactory.Constants;

public class Snake extends Reptile{
	public Snake (String name){
		super(true,name,0,true,2.1,0.85);
	}
	public Snake (){
		super(true,"Unknown",0,true,2.1,0.85);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,services.factories.animalFactory.Constants.Animals.Reptiles.Snake);
	}

}
