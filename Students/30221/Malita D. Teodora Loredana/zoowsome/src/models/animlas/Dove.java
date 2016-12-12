package models.animlas;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import repositories.AnimalRepository;
import services.factories.employeeFactory.Constants;

public class Dove extends Bird{
	
	public Dove( String name){
		super(false,(float)1800 , name, 2,2.4,0.1);
	}
	public Dove ( ){
		super(false,(float)1800 , "Unknown", 2,2.4,0.1);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,services.factories.animalFactory.Constants.Animals.Birds.Dove);
	}
}
