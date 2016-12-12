package models.animlas;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import repositories.AnimalRepository;
import services.factories.employeeFactory.Constants;

public class Dog extends Mammal {
	private String race;
	public Dog(String name,String race){
		super( (float)39.2 ,false,  name,  4,6.0,0.3);
		this.race=race;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter,"race",String.valueOf(getRace()));
		AnimalRepository.createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,services.factories.animalFactory.Constants.Animals.Mammals.Dog);
	}
	public Dog()
	{
		super((float)39.2,false,"Unknown",4,6.0,0.3);
		this.race="Unknown";
	}
	public String getRace()
	{
		return race;
	}
	public void setRace(String race)
	{
		this.race=race;
	}
	public void decodeFromXml(Element element){
		setRace(String.valueOf(element.getElementsByTagName("race").item(0).getTextContent()));
	}

}
