package models.animlas;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import repositories.AnimalRepository;
import services.factories.employeeFactory.Constants;

public class Tiger extends Mammal{
	private String race;
	public Tiger(String name, String race){
		super((float)37.5, true,name,4,4.7,0.95);
		this.race=race;
	}
	public Tiger()
	{
		super((float)37.5,false,"Unknown",4,4.7,0.95);
		this.race="Unknown";
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException{
		super.encodeToXml(eventWriter);
		AnimalRepository.createNode(eventWriter,Constants.XML_TAGS.DISCRIMINANT,services.factories.animalFactory.Constants.Animals.Mammals.Tiger);
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
