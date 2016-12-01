package models.animlas;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import repositories.AnimalRepository;
import services.factories.employeeFactory.Constants;

public class Cat extends Mammal {
	private String race;
	public Cat(String name, String race){
		super((float)39.7 ,false,  name,  4,8.0,0.15);
		this.race=race;
	}
	public Cat()
	{
		super((float)39.7,false,"Unknown",4,8.0,0.15);
		this.race="Unknown";
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter,"race",String.valueOf(getRace()));
		AnimalRepository.createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,services.factories.animalFactory.Constants.Animals.Mammals.Cat);
	}
	public void decodeFromXml(Element element){
		setRace(element.getElementsByTagName("race").item(0).getTextContent());
	}
	public String getRace()
	{
		return race;
	}
	public void setRace(String race)
	{
		this.race=race;
	}

}
