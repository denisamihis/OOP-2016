package models.animlas;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import repositories.AnimalRepository;
import services.factories.employeeFactory.Constants;

public class Flamingo extends Bird {
	public Flamingo( String name){
		super(true,(float)1800 , name, 2,4.9,0.25);
	}
	public Flamingo ( ){
		super(false,(float)1800 ,"Unknown", 2,4.9,0.25);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,services.factories.animalFactory.Constants.Animals.Birds.Flamingo);
	}

}
