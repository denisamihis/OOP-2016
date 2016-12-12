package models.animlas;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import repositories.AnimalRepository;
import services.factories.employeeFactory.Constants;

public class Eagle extends Bird {
	public Eagle( String name){
		super(false,(float)1800, name, 2,5.6,0.4);
	}
	public Eagle ( ){
		super(false,(float)1800 , "Unknown", 2,5.6,0.4);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,services.factories.animalFactory.Constants.Animals.Birds.Eagle);
	}
}
